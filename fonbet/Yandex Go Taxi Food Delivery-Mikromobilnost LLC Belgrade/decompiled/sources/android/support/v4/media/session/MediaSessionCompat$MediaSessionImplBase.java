package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.text.TextUtils;
import android.view.KeyEvent;
import defpackage.cf10;
import defpackage.df10;
import defpackage.ef10;
import defpackage.gf10;
import defpackage.hf10;
import defpackage.ma31;
import defpackage.ny61;
import defpackage.qz31;
import defpackage.rz31;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplBase implements cf10 {
    static final int RCC_PLAYSTATE_NONE = 0;
    final AudioManager mAudioManager;
    volatile MediaSessionCompat$Callback mCallback;
    boolean mCaptioningEnabled;
    private final Context mContext;
    Bundle mExtras;
    private MessageHandler mHandler;
    int mLocalStream;
    private final ComponentName mMediaButtonReceiverComponentName;
    private final PendingIntent mMediaButtonReceiverIntent;
    MediaMetadataCompat mMetadata;
    List<MediaSessionCompat$QueueItem> mQueue;
    CharSequence mQueueTitle;
    int mRatingType;
    final RemoteControlClient mRcc;
    MediaSessionCompat$RegistrationCallbackHandler mRegistrationCallbackHandler;
    private hf10 mRemoteUserInfo;
    int mRepeatMode;
    PendingIntent mSessionActivity;
    final Bundle mSessionInfo;
    int mShuffleMode;
    PlaybackStateCompat mState;
    private final MediaSessionStub mStub;
    private final MediaSessionCompat$Token mToken;
    rz31 mVolumeProvider;
    int mVolumeType;
    final Object mLock = new Object();
    final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();
    boolean mDestroyed = false;
    boolean mIsActive = false;
    int mFlags = 3;
    private qz31 mVolumeCallback = new df10();

    public class MessageHandler extends Handler {
        private static final int KEYCODE_MEDIA_PAUSE = 127;
        private static final int KEYCODE_MEDIA_PLAY = 126;
        private static final int MSG_ADD_QUEUE_ITEM = 25;
        private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
        private static final int MSG_ADJUST_VOLUME = 2;
        private static final int MSG_COMMAND = 1;
        private static final int MSG_CUSTOM_ACTION = 20;
        private static final int MSG_FAST_FORWARD = 16;
        private static final int MSG_MEDIA_BUTTON = 21;
        private static final int MSG_NEXT = 14;
        private static final int MSG_PAUSE = 12;
        private static final int MSG_PLAY = 7;
        private static final int MSG_PLAY_MEDIA_ID = 8;
        private static final int MSG_PLAY_SEARCH = 9;
        private static final int MSG_PLAY_URI = 10;
        private static final int MSG_PREPARE = 3;
        private static final int MSG_PREPARE_MEDIA_ID = 4;
        private static final int MSG_PREPARE_SEARCH = 5;
        private static final int MSG_PREPARE_URI = 6;
        private static final int MSG_PREVIOUS = 15;
        private static final int MSG_RATE = 19;
        private static final int MSG_RATE_EXTRA = 31;
        private static final int MSG_REMOVE_QUEUE_ITEM = 27;
        private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
        private static final int MSG_REWIND = 17;
        private static final int MSG_SEEK_TO = 18;
        private static final int MSG_SET_CAPTIONING_ENABLED = 29;
        private static final int MSG_SET_PLAYBACK_SPEED = 32;
        private static final int MSG_SET_REPEAT_MODE = 23;
        private static final int MSG_SET_SHUFFLE_MODE = 30;
        private static final int MSG_SET_VOLUME = 22;
        private static final int MSG_SKIP_TO_ITEM = 11;
        private static final int MSG_STOP = 13;

        public MessageHandler(Looper looper) {
            super(looper);
        }

        private void onMediaButtonEvent(KeyEvent keyEvent, MediaSessionCompat$Callback mediaSessionCompat$Callback) {
            if (keyEvent == null || keyEvent.getAction() != 0) {
                return;
            }
            PlaybackStateCompat playbackStateCompat = MediaSessionCompat$MediaSessionImplBase.this.mState;
            long actions = playbackStateCompat == null ? 0L : playbackStateCompat.getActions();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 126) {
                if ((4 & actions) != 0) {
                    mediaSessionCompat$Callback.onPlay();
                    return;
                }
                return;
            }
            if (keyCode == 127) {
                if ((2 & actions) != 0) {
                    mediaSessionCompat$Callback.onPause();
                    return;
                }
                return;
            }
            switch (keyCode) {
                case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                    if ((1 & actions) != 0) {
                        mediaSessionCompat$Callback.onStop();
                        break;
                    }
                    break;
                case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                    if ((32 & actions) != 0) {
                        mediaSessionCompat$Callback.onSkipToNext();
                        break;
                    }
                    break;
                case HProv.ALG_SID_KECCAK_224 /* 88 */:
                    if ((16 & actions) != 0) {
                        mediaSessionCompat$Callback.onSkipToPrevious();
                        break;
                    }
                    break;
                case HProv.ALG_SID_KECCAK_256 /* 89 */:
                    if ((8 & actions) != 0) {
                        mediaSessionCompat$Callback.onRewind();
                        break;
                    }
                    break;
                case 90:
                    if ((64 & actions) != 0) {
                        mediaSessionCompat$Callback.onFastForward();
                        break;
                    }
                    break;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaSessionCompat$Callback mediaSessionCompat$Callback = MediaSessionCompat$MediaSessionImplBase.this.mCallback;
            if (mediaSessionCompat$Callback == null) {
                return;
            }
            Bundle data = message.getData();
            c.a(data);
            MediaSessionCompat$MediaSessionImplBase.this.setCurrentControllerInfo(new hf10(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
            Bundle bundle = data.getBundle("data_extras");
            c.a(bundle);
            try {
                switch (message.what) {
                    case 1:
                        ef10 ef10Var = (ef10) message.obj;
                        mediaSessionCompat$Callback.onCommand(ef10Var.a, ef10Var.b, ef10Var.c);
                        break;
                    case 2:
                        MediaSessionCompat$MediaSessionImplBase.this.adjustVolume(message.arg1, 0);
                        break;
                    case 3:
                        mediaSessionCompat$Callback.onPrepare();
                        break;
                    case 4:
                        mediaSessionCompat$Callback.onPrepareFromMediaId((String) message.obj, bundle);
                        break;
                    case 5:
                        mediaSessionCompat$Callback.onPrepareFromSearch((String) message.obj, bundle);
                        break;
                    case 6:
                        mediaSessionCompat$Callback.onPrepareFromUri((Uri) message.obj, bundle);
                        break;
                    case 7:
                        mediaSessionCompat$Callback.onPlay();
                        break;
                    case 8:
                        mediaSessionCompat$Callback.onPlayFromMediaId((String) message.obj, bundle);
                        break;
                    case 9:
                        mediaSessionCompat$Callback.onPlayFromSearch((String) message.obj, bundle);
                        break;
                    case 10:
                        mediaSessionCompat$Callback.onPlayFromUri((Uri) message.obj, bundle);
                        break;
                    case 11:
                        mediaSessionCompat$Callback.onSkipToQueueItem(((Long) message.obj).longValue());
                        break;
                    case 12:
                        mediaSessionCompat$Callback.onPause();
                        break;
                    case 13:
                        mediaSessionCompat$Callback.onStop();
                        break;
                    case 14:
                        mediaSessionCompat$Callback.onSkipToNext();
                        break;
                    case 15:
                        mediaSessionCompat$Callback.onSkipToPrevious();
                        break;
                    case 16:
                        mediaSessionCompat$Callback.onFastForward();
                        break;
                    case 17:
                        mediaSessionCompat$Callback.onRewind();
                        break;
                    case 18:
                        mediaSessionCompat$Callback.onSeekTo(((Long) message.obj).longValue());
                        break;
                    case 19:
                        mediaSessionCompat$Callback.onSetRating((RatingCompat) message.obj);
                        break;
                    case 20:
                        mediaSessionCompat$Callback.onCustomAction((String) message.obj, bundle);
                        break;
                    case 21:
                        KeyEvent keyEvent = (KeyEvent) message.obj;
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                        if (!mediaSessionCompat$Callback.onMediaButtonEvent(intent)) {
                            onMediaButtonEvent(keyEvent, mediaSessionCompat$Callback);
                            break;
                        }
                        break;
                    case 22:
                        MediaSessionCompat$MediaSessionImplBase.this.setVolumeTo(message.arg1, 0);
                        break;
                    case 23:
                        mediaSessionCompat$Callback.onSetRepeatMode(message.arg1);
                        break;
                    case 25:
                        mediaSessionCompat$Callback.onAddQueueItem((MediaDescriptionCompat) message.obj);
                        break;
                    case 26:
                        mediaSessionCompat$Callback.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                        break;
                    case 27:
                        mediaSessionCompat$Callback.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                        break;
                    case 28:
                        List<MediaSessionCompat$QueueItem> list = MediaSessionCompat$MediaSessionImplBase.this.mQueue;
                        if (list != null) {
                            int i = message.arg1;
                            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i < 0 || i >= list.size()) ? null : MediaSessionCompat$MediaSessionImplBase.this.mQueue.get(message.arg1);
                            if (mediaSessionCompat$QueueItem != null) {
                                mediaSessionCompat$Callback.onRemoveQueueItem(mediaSessionCompat$QueueItem.getDescription());
                                break;
                            }
                        }
                        break;
                    case 29:
                        mediaSessionCompat$Callback.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                        break;
                    case 30:
                        mediaSessionCompat$Callback.onSetShuffleMode(message.arg1);
                        break;
                    case 31:
                        mediaSessionCompat$Callback.onSetRating((RatingCompat) message.obj, bundle);
                        break;
                    case 32:
                        mediaSessionCompat$Callback.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                        break;
                }
            } finally {
                MediaSessionCompat$MediaSessionImplBase.this.setCurrentControllerInfo(null);
            }
        }
    }

    public MediaSessionCompat$MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, ma31 ma31Var, Bundle bundle) {
        if (componentName == null) {
            ny61.g("MediaButtonReceiver component may not be null");
            throw null;
        }
        this.mContext = context;
        this.mSessionInfo = bundle;
        this.mAudioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.mMediaButtonReceiverComponentName = componentName;
        this.mMediaButtonReceiverIntent = pendingIntent;
        MediaSessionStub mediaSessionStub = new MediaSessionStub(this, context.getPackageName(), str);
        this.mStub = mediaSessionStub;
        this.mToken = new MediaSessionCompat$Token(mediaSessionStub, null, ma31Var);
        this.mRatingType = 0;
        this.mVolumeType = 1;
        this.mLocalStream = 3;
        this.mRcc = new RemoteControlClient(pendingIntent);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendCaptioningEnabled(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onCaptioningEnabledChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendCaptioningEnabled(boolean):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendEvent(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onEvent(r4, r5)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendEvent(java.lang.String, android.os.Bundle):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendExtras(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onExtrasChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendExtras(android.os.Bundle):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendMetadata(android.support.v4.media.MediaMetadataCompat r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onMetadataChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendMetadata(android.support.v4.media.MediaMetadataCompat):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendQueue(java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onQueueChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendQueue(java.util.List):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendQueueTitle(java.lang.CharSequence r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onQueueTitleChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendQueueTitle(java.lang.CharSequence):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendRepeatMode(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onRepeatModeChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendRepeatMode(int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendSessionDestroyed() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onSessionDestroyed()     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L28
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r3 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            r3.kill()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendSessionDestroyed():void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendShuffleMode(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onShuffleModeChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendShuffleMode(int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    private void sendState(android.support.v4.media.session.PlaybackStateCompat r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onPlaybackStateChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendState(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    public void adjustVolume(int i, int i2) {
        if (this.mVolumeType == 2) {
            return;
        }
        this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);
    }

    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
        RemoteControlClient.MetadataEditor editMetadata = this.mRcc.editMetadata(true);
        if (bundle != null) {
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ART)) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ART);
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM)) {
                editMetadata.putString(1, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST)) {
                editMetadata.putString(13, bundle.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_ARTIST)) {
                editMetadata.putString(2, bundle.getString(MediaMetadataCompat.METADATA_KEY_ARTIST));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_AUTHOR)) {
                editMetadata.putString(3, bundle.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPILATION)) {
                editMetadata.putString(15, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_COMPOSER)) {
                editMetadata.putString(4, bundle.getString(MediaMetadataCompat.METADATA_KEY_COMPOSER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DATE)) {
                editMetadata.putString(5, bundle.getString(MediaMetadataCompat.METADATA_KEY_DATE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER)) {
                editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.METADATA_KEY_DURATION));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_GENRE)) {
                editMetadata.putString(6, bundle.getString(MediaMetadataCompat.METADATA_KEY_GENRE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TITLE)) {
                editMetadata.putString(7, bundle.getString(MediaMetadataCompat.METADATA_KEY_TITLE));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER)) {
                editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_WRITER)) {
                editMetadata.putString(11, bundle.getString(MediaMetadataCompat.METADATA_KEY_WRITER));
            }
        }
        return editMetadata;
    }

    @Override // defpackage.cf10
    public MediaSessionCompat$Callback getCallback() {
        MediaSessionCompat$Callback mediaSessionCompat$Callback;
        synchronized (this.mLock) {
            mediaSessionCompat$Callback = this.mCallback;
        }
        return mediaSessionCompat$Callback;
    }

    public String getCallingPackage() {
        return null;
    }

    public hf10 getCurrentControllerInfo() {
        hf10 hf10Var;
        synchronized (this.mLock) {
            hf10Var = this.mRemoteUserInfo;
        }
        return hf10Var;
    }

    public Object getMediaSession() {
        return null;
    }

    public String getPackageNameForUid(int i) {
        String nameForUid = this.mContext.getPackageManager().getNameForUid(i);
        return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
    }

    @Override // defpackage.cf10
    public PlaybackStateCompat getPlaybackState() {
        PlaybackStateCompat playbackStateCompat;
        synchronized (this.mLock) {
            playbackStateCompat = this.mState;
        }
        return playbackStateCompat;
    }

    public int getRccStateFromState(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
            case 8:
                return 8;
            case 7:
                return 9;
            case 9:
                return 7;
            case 10:
            case 11:
                return 6;
            default:
                return -1;
        }
    }

    public int getRccTransportControlFlagsFromActions(long j) {
        int i = (1 & j) != 0 ? 32 : 0;
        if ((2 & j) != 0) {
            i |= 16;
        }
        if ((4 & j) != 0) {
            i |= 4;
        }
        if ((8 & j) != 0) {
            i |= 2;
        }
        if ((16 & j) != 0) {
            i |= 1;
        }
        if ((32 & j) != 0) {
            i |= 128;
        }
        if ((64 & j) != 0) {
            i |= 64;
        }
        return (j & 512) != 0 ? i | 8 : i;
    }

    public Object getRemoteControlClient() {
        return null;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mToken;
    }

    public boolean isActive() {
        return this.mIsActive;
    }

    public void postToHandler(int i, int i2, int i3, Object obj, Bundle bundle) {
        synchronized (this.mLock) {
            try {
                MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    Message obtainMessage = messageHandler.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", getPackageNameForUid(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        this.mAudioManager.registerMediaButtonEventReceiver(componentName);
    }

    public void release() {
        this.mIsActive = false;
        this.mDestroyed = true;
        updateMbrAndRcc();
        sendSessionDestroyed();
        setCallback(null, null);
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        sendEvent(str, bundle);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException
        */
    public void sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mControllerCallbacks     // Catch: java.lang.Throwable -> L19
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
        Lb:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mControllerCallbacks
            if (r1 < 0) goto L1e
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L19
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L19
            r2.onVolumeInfoChanged(r4)     // Catch: java.lang.Throwable -> L19 android.os.RemoteException -> L1b
            goto L1b
        L19:
            r3 = move-exception
            goto L23
        L1b:
            int r1 = r1 + (-1)
            goto Lb
        L1e:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase.sendVolumeInfoChanged(android.support.v4.media.session.ParcelableVolumeInfo):void");
    }

    public void setActive(boolean z) {
        if (z == this.mIsActive) {
            return;
        }
        this.mIsActive = z;
        updateMbrAndRcc();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x0013, B:11:0x001e, B:13:0x0024, B:15:0x0028, B:16:0x002d, B:18:0x0033, B:19:0x0038), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback, Handler handler) {
        MessageHandler messageHandler;
        synchronized (this.mLock) {
            try {
                MessageHandler messageHandler2 = this.mHandler;
                if (messageHandler2 != null) {
                    messageHandler2.removeCallbacksAndMessages(null);
                }
                if (mediaSessionCompat$Callback != null && handler != null) {
                    messageHandler = new MessageHandler(handler.getLooper());
                    this.mHandler = messageHandler;
                    if (this.mCallback != mediaSessionCompat$Callback && this.mCallback != null) {
                        this.mCallback.setSessionImpl(null, null);
                    }
                    this.mCallback = mediaSessionCompat$Callback;
                    if (this.mCallback != null) {
                        this.mCallback.setSessionImpl(this, handler);
                    }
                }
                messageHandler = null;
                this.mHandler = messageHandler;
                if (this.mCallback != mediaSessionCompat$Callback) {
                    this.mCallback.setSessionImpl(null, null);
                }
                this.mCallback = mediaSessionCompat$Callback;
                if (this.mCallback != null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCaptioningEnabled(boolean z) {
        if (this.mCaptioningEnabled != z) {
            this.mCaptioningEnabled = z;
            sendCaptioningEnabled(z);
        }
    }

    @Override // defpackage.cf10
    public void setCurrentControllerInfo(hf10 hf10Var) {
        synchronized (this.mLock) {
            this.mRemoteUserInfo = hf10Var;
        }
    }

    public void setExtras(Bundle bundle) {
        this.mExtras = bundle;
        sendExtras(bundle);
    }

    public void setFlags(int i) {
        synchronized (this.mLock) {
            this.mFlags = i | 3;
        }
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat != null) {
            mediaMetadataCompat = new MediaMetadataCompat(new MediaMetadataCompat.a(mediaMetadataCompat).a);
        }
        synchronized (this.mLock) {
            this.mMetadata = mediaMetadataCompat;
        }
        sendMetadata(mediaMetadataCompat);
        if (this.mIsActive) {
            buildRccMetadata(mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle()).apply();
        }
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        synchronized (this.mLock) {
            this.mState = playbackStateCompat;
        }
        sendState(playbackStateCompat);
        if (this.mIsActive) {
            if (playbackStateCompat == null) {
                this.mRcc.setPlaybackState(0);
                this.mRcc.setTransportControlFlags(0);
            } else {
                setRccState(playbackStateCompat);
                this.mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackStateCompat.getActions()));
            }
        }
    }

    public void setPlaybackToLocal(int i) {
        this.mLocalStream = i;
        this.mVolumeType = 1;
        int i2 = this.mVolumeType;
        int i3 = this.mLocalStream;
        sendVolumeInfoChanged(new ParcelableVolumeInfo(i2, i3, 2, this.mAudioManager.getStreamMaxVolume(i3), this.mAudioManager.getStreamVolume(this.mLocalStream)));
    }

    public void setPlaybackToRemote(rz31 rz31Var) {
        throw new IllegalArgumentException("volumeProvider may not be null");
    }

    public void setQueue(List<MediaSessionCompat$QueueItem> list) {
        this.mQueue = list;
        sendQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mQueueTitle = charSequence;
        sendQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.mRatingType = i;
    }

    public void setRccState(PlaybackStateCompat playbackStateCompat) {
        this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()));
    }

    public void setRegistrationCallback(gf10 gf10Var, Handler handler) {
        synchronized (this.mLock) {
            try {
                MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler = this.mRegistrationCallbackHandler;
                if (mediaSessionCompat$RegistrationCallbackHandler != null) {
                    mediaSessionCompat$RegistrationCallbackHandler.removeCallbacksAndMessages(null);
                }
                if (gf10Var != null) {
                    this.mRegistrationCallbackHandler = new MediaSessionCompat$RegistrationCallbackHandler(handler.getLooper(), gf10Var);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRepeatMode(int i) {
        if (this.mRepeatMode != i) {
            this.mRepeatMode = i;
            sendRepeatMode(i);
        }
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        synchronized (this.mLock) {
            this.mSessionActivity = pendingIntent;
        }
    }

    public void setShuffleMode(int i) {
        if (this.mShuffleMode != i) {
            this.mShuffleMode = i;
            sendShuffleMode(i);
        }
    }

    public void setVolumeTo(int i, int i2) {
        if (this.mVolumeType == 2) {
            return;
        }
        this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);
    }

    public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        this.mAudioManager.unregisterMediaButtonEventReceiver(componentName);
    }

    public void updateMbrAndRcc() {
        boolean z = this.mIsActive;
        PendingIntent pendingIntent = this.mMediaButtonReceiverIntent;
        if (!z) {
            unregisterMediaButtonEventReceiver(pendingIntent, this.mMediaButtonReceiverComponentName);
            this.mRcc.setPlaybackState(0);
            this.mAudioManager.unregisterRemoteControlClient(this.mRcc);
        } else {
            registerMediaButtonEventReceiver(pendingIntent, this.mMediaButtonReceiverComponentName);
            this.mAudioManager.registerRemoteControlClient(this.mRcc);
            setMetadata(this.mMetadata);
            setPlaybackState(this.mState);
        }
    }

    public static class MediaSessionStub extends IMediaSession.Stub {
        private final AtomicReference<MediaSessionCompat$MediaSessionImplBase> mMediaSessionImplRef;
        private final String mPackageName;
        private final String mTag;

        public MediaSessionStub(MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase, String str, String str2) {
            this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionCompat$MediaSessionImplBase);
            this.mPackageName = str;
            this.mTag = str2;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            postToHandler(25, mediaDescriptionCompat);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            postToHandler(26, mediaDescriptionCompat, i, null);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void adjustVolume(int i, int i2, String str) {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                mediaSessionCompat$MediaSessionImplBase.adjustVolume(i, i2);
            }
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void fastForward() {
            postToHandler(16);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public Bundle getExtras() {
            Bundle bundle;
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return null;
            }
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                bundle = mediaSessionCompat$MediaSessionImplBase.mExtras;
            }
            return bundle;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public long getFlags() {
            long j;
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return 0L;
            }
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                j = mediaSessionCompat$MediaSessionImplBase.mFlags;
            }
            return j;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public PendingIntent getLaunchPendingIntent() {
            PendingIntent pendingIntent;
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return null;
            }
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                pendingIntent = mediaSessionCompat$MediaSessionImplBase.mSessionActivity;
            }
            return pendingIntent;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public MediaMetadataCompat getMetadata() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                return mediaSessionCompat$MediaSessionImplBase.mMetadata;
            }
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public String getPackageName() {
            return this.mPackageName;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            MediaMetadataCompat mediaMetadataCompat;
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return null;
            }
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                playbackStateCompat = mediaSessionCompat$MediaSessionImplBase.mState;
                mediaMetadataCompat = mediaSessionCompat$MediaSessionImplBase.mMetadata;
            }
            return c.b(playbackStateCompat, mediaMetadataCompat);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public List<MediaSessionCompat$QueueItem> getQueue() {
            List<MediaSessionCompat$QueueItem> list;
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return null;
            }
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                list = mediaSessionCompat$MediaSessionImplBase.mQueue;
            }
            return list;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public CharSequence getQueueTitle() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                return mediaSessionCompat$MediaSessionImplBase.mQueueTitle;
            }
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public int getRatingType() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                return mediaSessionCompat$MediaSessionImplBase.mRatingType;
            }
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public int getRepeatMode() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                return mediaSessionCompat$MediaSessionImplBase.mRepeatMode;
            }
            return -1;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public Bundle getSessionInfo() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null || mediaSessionCompat$MediaSessionImplBase.mSessionInfo == null) {
                return null;
            }
            return new Bundle(mediaSessionCompat$MediaSessionImplBase.mSessionInfo);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public int getShuffleMode() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                return mediaSessionCompat$MediaSessionImplBase.mShuffleMode;
            }
            return -1;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public String getTag() {
            return this.mTag;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public ParcelableVolumeInfo getVolumeAttributes() {
            ParcelableVolumeInfo parcelableVolumeInfo;
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return null;
            }
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                try {
                    int i = mediaSessionCompat$MediaSessionImplBase.mVolumeType;
                    int i2 = mediaSessionCompat$MediaSessionImplBase.mLocalStream;
                    if (i == 2) {
                        throw null;
                    }
                    parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, 2, mediaSessionCompat$MediaSessionImplBase.mAudioManager.getStreamMaxVolume(i2), mediaSessionCompat$MediaSessionImplBase.mAudioManager.getStreamVolume(i2));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return parcelableVolumeInfo;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean isCaptioningEnabled() {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            return mediaSessionCompat$MediaSessionImplBase != null && mediaSessionCompat$MediaSessionImplBase.mCaptioningEnabled;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean isShuffleModeEnabledRemoved() {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean isTransportControlEnabled() {
            return true;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void next() {
            postToHandler(14);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void pause() {
            postToHandler(12);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void play() throws RemoteException {
            postToHandler(7);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void playFromMediaId(String str, Bundle bundle) {
            postToHandler(8, str, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void playFromSearch(String str, Bundle bundle) {
            postToHandler(9, str, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void playFromUri(Uri uri, Bundle bundle) {
            postToHandler(10, uri, bundle);
        }

        public void postToHandler(int i, Object obj, int i2, Bundle bundle) {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                mediaSessionCompat$MediaSessionImplBase.postToHandler(i, i2, 0, obj, bundle);
            }
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepare() throws RemoteException {
            postToHandler(3);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepareFromMediaId(String str, Bundle bundle) {
            postToHandler(4, str, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepareFromSearch(String str, Bundle bundle) {
            postToHandler(5, str, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepareFromUri(Uri uri, Bundle bundle) {
            postToHandler(6, uri, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void previous() {
            postToHandler(15);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void rate(RatingCompat ratingCompat) {
            postToHandler(19, ratingCompat);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
            postToHandler(31, ratingCompat, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                try {
                    iMediaControllerCallback.onSessionDestroyed();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            mediaSessionCompat$MediaSessionImplBase.mControllerCallbacks.register(iMediaControllerCallback, new hf10(mediaSessionCompat$MediaSessionImplBase.getPackageNameForUid(callingUid), callingPid, callingUid));
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                try {
                    MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler = mediaSessionCompat$MediaSessionImplBase.mRegistrationCallbackHandler;
                    if (mediaSessionCompat$RegistrationCallbackHandler != null) {
                        mediaSessionCompat$RegistrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            postToHandler(27, mediaDescriptionCompat);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void removeQueueItemAt(int i) {
            postToHandler(28, i);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void rewind() {
            postToHandler(17);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void seekTo(long j) {
            postToHandler(18, Long.valueOf(j));
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void sendCommand(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
            postToHandler(1, new ef10(str, bundle, mediaSessionCompat$ResultReceiverWrapper == null ? null : mediaSessionCompat$ResultReceiverWrapper.mResultReceiver));
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
            postToHandler(20, str, bundle);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean sendMediaButton(KeyEvent keyEvent) {
            postToHandler(21, keyEvent);
            return true;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setCaptioningEnabled(boolean z) {
            postToHandler(29, Boolean.valueOf(z));
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setPlaybackSpeed(float f) {
            postToHandler(32, Float.valueOf(f));
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setRepeatMode(int i) {
            postToHandler(23, i);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setShuffleMode(int i) {
            postToHandler(30, i);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setShuffleModeEnabledRemoved(boolean z) {
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setVolumeTo(int i, int i2, String str) {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase != null) {
                mediaSessionCompat$MediaSessionImplBase.setVolumeTo(i, i2);
            }
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void skipToQueueItem(long j) {
            postToHandler(11, Long.valueOf(j));
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void stop() {
            postToHandler(13);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
            MediaSessionCompat$MediaSessionImplBase mediaSessionCompat$MediaSessionImplBase = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplBase == null) {
                return;
            }
            mediaSessionCompat$MediaSessionImplBase.mControllerCallbacks.unregister(iMediaControllerCallback);
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            synchronized (mediaSessionCompat$MediaSessionImplBase.mLock) {
                try {
                    MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler = mediaSessionCompat$MediaSessionImplBase.mRegistrationCallbackHandler;
                    if (mediaSessionCompat$RegistrationCallbackHandler != null) {
                        mediaSessionCompat$RegistrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void postToHandler(int i, int i2) {
            postToHandler(i, null, i2, null);
        }

        public void postToHandler(int i, Object obj) {
            postToHandler(i, obj, 0, null);
        }

        public void postToHandler(int i, Object obj, Bundle bundle) {
            postToHandler(i, obj, 0, bundle);
        }

        public void postToHandler(int i) {
            postToHandler(i, null, 0, null);
        }
    }
}
