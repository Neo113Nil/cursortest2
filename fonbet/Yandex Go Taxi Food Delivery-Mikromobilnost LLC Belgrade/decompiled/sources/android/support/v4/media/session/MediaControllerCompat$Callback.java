package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import androidx.media.AudioAttributesCompat;
import defpackage.kd10;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class MediaControllerCompat$Callback implements IBinder.DeathRecipient {
    final MediaController.Callback mCallbackFwk = new MediaControllerCallbackApi21(this);
    MessageHandler mHandler;
    IMediaControllerCallback mIControllerCallback;

    public static class MediaControllerCallbackApi21 extends MediaController.Callback {
        private final WeakReference<MediaControllerCompat$Callback> mCallback;

        public MediaControllerCallbackApi21(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
            this.mCallback = new WeakReference<>(mediaControllerCompat$Callback);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                int i = AudioAttributesCompat.b;
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
                mediaControllerCompat$Callback.onAudioInfoChanged(new kd10());
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            c.a(bundle);
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.onExtrasChanged(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback == null || mediaControllerCompat$Callback.mIControllerCallback != null) {
                return;
            }
            mediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.onQueueChanged(MediaSessionCompat$QueueItem.fromQueueItemList(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.onQueueTitleChanged(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.onSessionDestroyed();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            c.a(bundle);
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.onSessionEvent(str, bundle);
            }
        }
    }

    public class MessageHandler extends Handler {
        private static final int MSG_DESTROYED = 8;
        private static final int MSG_EVENT = 1;
        private static final int MSG_SESSION_READY = 13;
        private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
        private static final int MSG_UPDATE_EXTRAS = 7;
        private static final int MSG_UPDATE_METADATA = 3;
        private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
        private static final int MSG_UPDATE_QUEUE = 5;
        private static final int MSG_UPDATE_QUEUE_TITLE = 6;
        private static final int MSG_UPDATE_REPEAT_MODE = 9;
        private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
        private static final int MSG_UPDATE_VOLUME = 4;
        boolean mRegistered;

        public MessageHandler(Looper looper) {
            super(looper);
            this.mRegistered = false;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mRegistered) {
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        c.a(data);
                        MediaControllerCompat$Callback.this.onSessionEvent((String) message.obj, data);
                        break;
                    case 2:
                        MediaControllerCompat$Callback.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                        break;
                    case 3:
                        MediaControllerCompat$Callback.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                        break;
                    case 4:
                        MediaControllerCompat$Callback.this.onAudioInfoChanged((kd10) message.obj);
                        break;
                    case 5:
                        MediaControllerCompat$Callback.this.onQueueChanged((List) message.obj);
                        break;
                    case 6:
                        MediaControllerCompat$Callback.this.onQueueTitleChanged((CharSequence) message.obj);
                        break;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        c.a(bundle);
                        MediaControllerCompat$Callback.this.onExtrasChanged(bundle);
                        break;
                    case 8:
                        MediaControllerCompat$Callback.this.onSessionDestroyed();
                        break;
                    case 9:
                        MediaControllerCompat$Callback.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                        break;
                    case 11:
                        MediaControllerCompat$Callback.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                        break;
                    case 12:
                        MediaControllerCompat$Callback.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                        break;
                    case 13:
                        MediaControllerCompat$Callback.this.onSessionReady();
                        break;
                }
            }
        }
    }

    public static class StubCompat extends IMediaControllerCallback.Stub {
        private final WeakReference<MediaControllerCompat$Callback> mCallback;

        public StubCompat(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
            this.mCallback = new WeakReference<>(mediaControllerCompat$Callback);
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onEvent(String str, Bundle bundle) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onExtrasChanged(Bundle bundle) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onQueueChanged(List<MediaSessionCompat$QueueItem> list) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onRepeatModeChanged(int i) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onSessionDestroyed() throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onSessionReady() throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChanged(int i) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback.Stub, android.support.v4.media.session.IMediaControllerCallback
        public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            MediaControllerCompat$Callback mediaControllerCompat$Callback = this.mCallback.get();
            if (mediaControllerCompat$Callback != null) {
                mediaControllerCompat$Callback.postToHandler(4, parcelableVolumeInfo != null ? new kd10(parcelableVolumeInfo.audioStream) : null, null);
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        postToHandler(8, null, null);
    }

    public IMediaControllerCallback getIControllerCallback() {
        return this.mIControllerCallback;
    }

    public void onAudioInfoChanged(kd10 kd10Var) {
    }

    public void onCaptioningEnabledChanged(boolean z) {
    }

    public void onExtrasChanged(Bundle bundle) {
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
    }

    public void onQueueChanged(List<MediaSessionCompat$QueueItem> list) {
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onSessionDestroyed() {
    }

    public void onSessionEvent(String str, Bundle bundle) {
    }

    public void onSessionReady() {
    }

    public void onShuffleModeChanged(int i) {
    }

    public void postToHandler(int i, Object obj, Bundle bundle) {
        MessageHandler messageHandler = this.mHandler;
        if (messageHandler != null) {
            Message obtainMessage = messageHandler.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public void setHandler(Handler handler) {
        if (handler != null) {
            MessageHandler messageHandler = new MessageHandler(handler.getLooper());
            this.mHandler = messageHandler;
            messageHandler.mRegistered = true;
        } else {
            MessageHandler messageHandler2 = this.mHandler;
            if (messageHandler2 != null) {
                messageHandler2.mRegistered = false;
                messageHandler2.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
        }
    }
}
