package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.cf10;
import defpackage.hf10;
import defpackage.ma31;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public abstract class MediaSessionCompat$Callback {
    CallbackHandler mCallbackHandler;
    private boolean mMediaPlayPausePendingOnHandler;
    final Object mLock = new Object();
    final MediaSession.Callback mCallbackFwk = new MediaSessionCallbackApi21();
    WeakReference<cf10> mSessionImpl = new WeakReference<>(null);

    public class CallbackHandler extends Handler {
        private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            cf10 cf10Var;
            MediaSessionCompat$Callback mediaSessionCompat$Callback;
            CallbackHandler callbackHandler;
            if (message.what == 1) {
                synchronized (MediaSessionCompat$Callback.this.mLock) {
                    cf10Var = MediaSessionCompat$Callback.this.mSessionImpl.get();
                    mediaSessionCompat$Callback = MediaSessionCompat$Callback.this;
                    callbackHandler = mediaSessionCompat$Callback.mCallbackHandler;
                }
                if (cf10Var == null || mediaSessionCompat$Callback != cf10Var.getCallback() || callbackHandler == null) {
                    return;
                }
                cf10Var.setCurrentControllerInfo((hf10) message.obj);
                MediaSessionCompat$Callback.this.handleMediaPlayPauseIfPendingOnHandler(cf10Var, callbackHandler);
                cf10Var.setCurrentControllerInfo(null);
            }
        }
    }

    public class MediaSessionCallbackApi21 extends MediaSession.Callback {
        public MediaSessionCallbackApi21() {
        }

        private void clearCurrentControllerInfo(cf10 cf10Var) {
            cf10Var.setCurrentControllerInfo(null);
        }

        private MediaSessionCompat$MediaSessionImplApi21 getSessionImplIfCallbackIsSet() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21;
            synchronized (MediaSessionCompat$Callback.this.mLock) {
                mediaSessionCompat$MediaSessionImplApi21 = (MediaSessionCompat$MediaSessionImplApi21) MediaSessionCompat$Callback.this.mSessionImpl.get();
            }
            if (mediaSessionCompat$MediaSessionImplApi21 == null || MediaSessionCompat$Callback.this != mediaSessionCompat$MediaSessionImplApi21.getCallback()) {
                return null;
            }
            return mediaSessionCompat$MediaSessionImplApi21;
        }

        private void setCurrentControllerInfo(cf10 cf10Var) {
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            try {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = null;
                IBinder asBinder = null;
                mediaSessionCompat$QueueItem = null;
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat$Token sessionToken = sessionImplIfCallbackIsSet.getSessionToken();
                    IMediaSession extraBinder = sessionToken.getExtraBinder();
                    if (extraBinder != null) {
                        asBinder = extraBinder.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    ma31 session2Token = sessionToken.getSession2Token();
                    if (session2Token != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(session2Token));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    MediaSessionCompat$Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    MediaSessionCompat$Callback.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    MediaSessionCompat$Callback.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    MediaSessionCompat$Callback.this.onCommand(str, bundle, resultReceiver);
                } else if (sessionImplIfCallbackIsSet.mQueue != null) {
                    int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i >= 0 && i < sessionImplIfCallbackIsSet.mQueue.size()) {
                        mediaSessionCompat$QueueItem = sessionImplIfCallbackIsSet.mQueue.get(i);
                    }
                    if (mediaSessionCompat$QueueItem != null) {
                        MediaSessionCompat$Callback.this.onRemoveQueueItem(mediaSessionCompat$QueueItem.getDescription());
                    }
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
            }
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            try {
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    c.a(bundle2);
                    MediaSessionCompat$Callback.this.onPlayFromUri(uri, bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    MediaSessionCompat$Callback.this.onPrepare();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    c.a(bundle3);
                    MediaSessionCompat$Callback.this.onPrepareFromMediaId(string, bundle3);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    c.a(bundle4);
                    MediaSessionCompat$Callback.this.onPrepareFromSearch(string2, bundle4);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    c.a(bundle5);
                    MediaSessionCompat$Callback.this.onPrepareFromUri(uri2, bundle5);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    MediaSessionCompat$Callback.this.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    MediaSessionCompat$Callback.this.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    MediaSessionCompat$Callback.this.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    c.a(bundle6);
                    MediaSessionCompat$Callback.this.onSetRating(ratingCompat, bundle6);
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    MediaSessionCompat$Callback.this.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                } else {
                    MediaSessionCompat$Callback.this.onCustomAction(str, bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
            }
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onFastForward() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onFastForward();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return false;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            boolean onMediaButtonEvent = MediaSessionCompat$Callback.this.onMediaButtonEvent(intent);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
            return onMediaButtonEvent || super.onMediaButtonEvent(intent);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPause();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPlay();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPlayFromMediaId(str, bundle);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPlayFromSearch(str, bundle);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPlayFromUri(uri, bundle);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPrepare();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPrepareFromMediaId(str, bundle);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPrepareFromSearch(str, bundle);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            c.a(bundle);
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onPrepareFromUri(uri, bundle);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onRewind() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onRewind();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onSeekTo(j);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetPlaybackSpeed(float f) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onSetPlaybackSpeed(f);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetRating(Rating rating) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onSetRating(RatingCompat.fromRating(rating));
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onSkipToNext();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onSkipToPrevious();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j) {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onSkipToQueueItem(j);
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            MediaSessionCompat$MediaSessionImplApi21 sessionImplIfCallbackIsSet = getSessionImplIfCallbackIsSet();
            if (sessionImplIfCallbackIsSet == null) {
                return;
            }
            setCurrentControllerInfo(sessionImplIfCallbackIsSet);
            MediaSessionCompat$Callback.this.onStop();
            clearCurrentControllerInfo(sessionImplIfCallbackIsSet);
        }
    }

    public void handleMediaPlayPauseIfPendingOnHandler(cf10 cf10Var, Handler handler) {
        if (this.mMediaPlayPausePendingOnHandler) {
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackState = cf10Var.getPlaybackState();
            long actions = playbackState == null ? 0L : playbackState.getActions();
            boolean z = playbackState != null && playbackState.getState() == 3;
            boolean z2 = (516 & actions) != 0;
            boolean z3 = (actions & 514) != 0;
            if (z && z3) {
                onPause();
            } else {
                if (z || !z2) {
                    return;
                }
                onPlay();
            }
        }
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
    }

    public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void onCustomAction(String str, Bundle bundle) {
    }

    public void onFastForward() {
    }

    public boolean onMediaButtonEvent(Intent intent) {
        return false;
    }

    public void onPause() {
    }

    public void onPlay() {
    }

    public void onPlayFromMediaId(String str, Bundle bundle) {
    }

    public void onPlayFromSearch(String str, Bundle bundle) {
    }

    public void onPlayFromUri(Uri uri, Bundle bundle) {
    }

    public void onPrepare() {
    }

    public void onPrepareFromMediaId(String str, Bundle bundle) {
    }

    public void onPrepareFromSearch(String str, Bundle bundle) {
    }

    public void onPrepareFromUri(Uri uri, Bundle bundle) {
    }

    public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    @Deprecated
    public void onRemoveQueueItemAt(int i) {
    }

    public void onRewind() {
    }

    public void onSeekTo(long j) {
    }

    public void onSetCaptioningEnabled(boolean z) {
    }

    public void onSetPlaybackSpeed(float f) {
    }

    public void onSetRating(RatingCompat ratingCompat) {
    }

    public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
    }

    public void onSetRepeatMode(int i) {
    }

    public void onSetShuffleMode(int i) {
    }

    public void onSkipToNext() {
    }

    public void onSkipToPrevious() {
    }

    public void onSkipToQueueItem(long j) {
    }

    public void onStop() {
    }

    public void setSessionImpl(cf10 cf10Var, Handler handler) {
        synchronized (this.mLock) {
            try {
                this.mSessionImpl = new WeakReference<>(cf10Var);
                CallbackHandler callbackHandler = this.mCallbackHandler;
                CallbackHandler callbackHandler2 = null;
                if (callbackHandler != null) {
                    callbackHandler.removeCallbacksAndMessages(null);
                }
                if (cf10Var != null && handler != null) {
                    callbackHandler2 = new CallbackHandler(handler.getLooper());
                }
                this.mCallbackHandler = callbackHandler2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
