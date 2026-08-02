package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaControllerCompat$Callback;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import defpackage.jd10;
import defpackage.kd10;
import defpackage.ny61;
import defpackage.sd90;
import defpackage.w511;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
class MediaControllerCompat$MediaControllerImplApi21 implements jd10 {
    protected final MediaController mControllerFwk;
    protected Bundle mSessionInfo;
    final MediaSessionCompat$Token mSessionToken;
    final Object mLock = new Object();
    private final List<MediaControllerCompat$Callback> mPendingCallbacks = new ArrayList();
    private HashMap<MediaControllerCompat$Callback, ExtraCallback> mCallbackMap = new HashMap<>();

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> mMediaControllerImpl;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.mMediaControllerImpl = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.mMediaControllerImpl.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.mLock) {
                mediaControllerCompat$MediaControllerImplApi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.mSessionToken.setSession2Token(sd90.e(bundle));
                mediaControllerCompat$MediaControllerImplApi21.processPendingCallbacksLocked();
            }
        }
    }

    public static class ExtraCallback extends MediaControllerCompat$Callback.StubCompat {
        public ExtraCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
            super(mediaControllerCompat$Callback);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat$Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onExtrasChanged(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat$Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat$Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onQueueChanged(List<MediaSessionCompat$QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat$Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat$Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onSessionDestroyed() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat$Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.mSessionToken = mediaSessionCompat$Token;
        this.mControllerFwk = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.getToken());
        if (mediaSessionCompat$Token.getExtraBinder() == null) {
            requestExtraBinder();
        }
    }

    public static b getMediaController(Activity activity) {
        MediaController mediaController = activity.getMediaController();
        if (mediaController == null) {
            return null;
        }
        return new b(activity, MediaSessionCompat$Token.fromToken(mediaController.getSessionToken()));
    }

    private void requestExtraBinder() {
        sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
    }

    public static void setMediaController(Activity activity, b bVar) {
        activity.setMediaController(bVar != null ? new MediaController(activity, (MediaSession.Token) bVar.b.getToken()) : null);
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if ((getFlags() & 4) == 0) {
            w511.x("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
        sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    public void adjustVolume(int i, int i2) {
        this.mControllerFwk.adjustVolume(i, i2);
    }

    @Override // defpackage.jd10
    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        return this.mControllerFwk.dispatchMediaButtonEvent(keyEvent);
    }

    public Bundle getExtras() {
        return this.mControllerFwk.getExtras();
    }

    public long getFlags() {
        return this.mControllerFwk.getFlags();
    }

    public MediaMetadataCompat getMetadata() {
        MediaMetadata metadata = this.mControllerFwk.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.fromMediaMetadata(metadata);
        }
        return null;
    }

    public String getPackageName() {
        return this.mControllerFwk.getPackageName();
    }

    public kd10 getPlaybackInfo() {
        MediaController.PlaybackInfo playbackInfo = this.mControllerFwk.getPlaybackInfo();
        if (playbackInfo == null) {
            return null;
        }
        playbackInfo.getPlaybackType();
        playbackInfo.getAudioAttributes();
        int i = AudioAttributesCompat.b;
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        return new kd10();
    }

    public PlaybackStateCompat getPlaybackState() {
        if (this.mSessionToken.getExtraBinder() != null) {
            try {
                return this.mSessionToken.getExtraBinder().getPlaybackState();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = this.mControllerFwk.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.fromPlaybackState(playbackState);
        }
        return null;
    }

    public List<MediaSessionCompat$QueueItem> getQueue() {
        List<MediaSession.QueueItem> queue = this.mControllerFwk.getQueue();
        if (queue != null) {
            return MediaSessionCompat$QueueItem.fromQueueItemList(queue);
        }
        return null;
    }

    public CharSequence getQueueTitle() {
        return this.mControllerFwk.getQueueTitle();
    }

    public int getRatingType() {
        return this.mControllerFwk.getRatingType();
    }

    public int getRepeatMode() {
        if (this.mSessionToken.getExtraBinder() == null) {
            return -1;
        }
        try {
            return this.mSessionToken.getExtraBinder().getRepeatMode();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            return -1;
        }
    }

    public PendingIntent getSessionActivity() {
        return this.mControllerFwk.getSessionActivity();
    }

    public Bundle getSessionInfo() {
        if (this.mSessionInfo != null) {
            return new Bundle(this.mSessionInfo);
        }
        if (this.mSessionToken.getExtraBinder() != null) {
            try {
                this.mSessionInfo = this.mSessionToken.getExtraBinder().getSessionInfo();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getSessionInfo.", e);
                this.mSessionInfo = Bundle.EMPTY;
            }
        }
        Bundle c = c.c(this.mSessionInfo);
        this.mSessionInfo = c;
        return c == null ? Bundle.EMPTY : new Bundle(this.mSessionInfo);
    }

    public int getShuffleMode() {
        if (this.mSessionToken.getExtraBinder() == null) {
            return -1;
        }
        try {
            return this.mSessionToken.getExtraBinder().getShuffleMode();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e);
            return -1;
        }
    }

    public a getTransportControls() {
        final MediaController.TransportControls transportControls = this.mControllerFwk.getTransportControls();
        return new MediaControllerCompat$TransportControlsApi24(transportControls) { // from class: android.support.v4.media.session.MediaControllerCompat$TransportControlsApi29
            @Override // android.support.v4.media.session.MediaControllerCompat$TransportControlsApi21
            public void setPlaybackSpeed(float f) {
                if (f != 0.0f) {
                    this.mControlsFwk.setPlaybackSpeed(f);
                } else {
                    ny61.g("speed must not be zero");
                }
            }
        };
    }

    public boolean isCaptioningEnabled() {
        if (this.mSessionToken.getExtraBinder() == null) {
            return false;
        }
        try {
            return this.mSessionToken.getExtraBinder().isCaptioningEnabled();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e);
            return false;
        }
    }

    public boolean isSessionReady() {
        return this.mSessionToken.getExtraBinder() != null;
    }

    public void processPendingCallbacksLocked() {
        if (this.mSessionToken.getExtraBinder() == null) {
            return;
        }
        for (MediaControllerCompat$Callback mediaControllerCompat$Callback : this.mPendingCallbacks) {
            ExtraCallback extraCallback = new ExtraCallback(mediaControllerCompat$Callback);
            this.mCallbackMap.put(mediaControllerCompat$Callback, extraCallback);
            mediaControllerCompat$Callback.mIControllerCallback = extraCallback;
            try {
                this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
                mediaControllerCompat$Callback.postToHandler(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        this.mPendingCallbacks.clear();
    }

    public final void registerCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback, Handler handler) {
        this.mControllerFwk.registerCallback(mediaControllerCompat$Callback.mCallbackFwk, handler);
        synchronized (this.mLock) {
            if (this.mSessionToken.getExtraBinder() != null) {
                ExtraCallback extraCallback = new ExtraCallback(mediaControllerCompat$Callback);
                this.mCallbackMap.put(mediaControllerCompat$Callback, extraCallback);
                mediaControllerCompat$Callback.mIControllerCallback = extraCallback;
                try {
                    this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
                    mediaControllerCompat$Callback.postToHandler(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                mediaControllerCompat$Callback.mIControllerCallback = null;
                this.mPendingCallbacks.add(mediaControllerCompat$Callback);
            }
        }
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if ((getFlags() & 4) == 0) {
            w511.x("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
        sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.mControllerFwk.sendCommand(str, bundle, resultReceiver);
    }

    public void setVolumeTo(int i, int i2) {
        this.mControllerFwk.setVolumeTo(i, i2);
    }

    public final void unregisterCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
        this.mControllerFwk.unregisterCallback(mediaControllerCompat$Callback.mCallbackFwk);
        synchronized (this.mLock) {
            if (this.mSessionToken.getExtraBinder() != null) {
                try {
                    ExtraCallback remove = this.mCallbackMap.remove(mediaControllerCompat$Callback);
                    if (remove != null) {
                        mediaControllerCompat$Callback.mIControllerCallback = null;
                        this.mSessionToken.getExtraBinder().unregisterCallbackListener(remove);
                    }
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.mPendingCallbacks.remove(mediaControllerCompat$Callback);
            }
        }
    }

    public Object getMediaController() {
        return this.mControllerFwk;
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if ((getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", mediaDescriptionCompat);
            sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, null);
            return;
        }
        w511.x("This session doesn't support queue management operations");
    }
}
