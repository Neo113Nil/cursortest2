package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import defpackage.jd10;
import defpackage.kd10;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes10.dex */
class MediaControllerCompat$MediaControllerImplBase implements jd10 {
    private IMediaSession mBinder;
    private Bundle mSessionInfo;
    private a mTransportControls;

    public MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.mBinder = IMediaSession.Stub.asInterface((IBinder) mediaSessionCompat$Token.getToken());
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        try {
            if ((this.mBinder.getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            this.mBinder.addQueueItem(mediaDescriptionCompat);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in addQueueItem.", e);
        }
    }

    public void adjustVolume(int i, int i2) {
        try {
            this.mBinder.adjustVolume(i, i2, null);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in adjustVolume.", e);
        }
    }

    @Override // defpackage.jd10
    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            ny61.g("event may not be null.");
            return false;
        }
        try {
            this.mBinder.sendMediaButton(keyEvent);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
        }
        return false;
    }

    public Bundle getExtras() {
        try {
            return this.mBinder.getExtras();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getExtras.", e);
            return null;
        }
    }

    public long getFlags() {
        try {
            return this.mBinder.getFlags();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getFlags.", e);
            return 0L;
        }
    }

    public Object getMediaController() {
        return null;
    }

    public MediaMetadataCompat getMetadata() {
        try {
            return this.mBinder.getMetadata();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
            return null;
        }
    }

    public String getPackageName() {
        try {
            return this.mBinder.getPackageName();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getPackageName.", e);
            return null;
        }
    }

    public kd10 getPlaybackInfo() {
        try {
            ParcelableVolumeInfo volumeAttributes = this.mBinder.getVolumeAttributes();
            int i = volumeAttributes.volumeType;
            return new kd10(volumeAttributes.audioStream);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getPlaybackInfo.", e);
            return null;
        }
    }

    public PlaybackStateCompat getPlaybackState() {
        try {
            return this.mBinder.getPlaybackState();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            return null;
        }
    }

    public List<MediaSessionCompat$QueueItem> getQueue() {
        try {
            return this.mBinder.getQueue();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getQueue.", e);
            return null;
        }
    }

    public CharSequence getQueueTitle() {
        try {
            return this.mBinder.getQueueTitle();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getQueueTitle.", e);
            return null;
        }
    }

    public int getRatingType() {
        try {
            return this.mBinder.getRatingType();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getRatingType.", e);
            return 0;
        }
    }

    public int getRepeatMode() {
        try {
            return this.mBinder.getRepeatMode();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            return -1;
        }
    }

    public PendingIntent getSessionActivity() {
        try {
            return this.mBinder.getLaunchPendingIntent();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
            return null;
        }
    }

    public Bundle getSessionInfo() {
        try {
            this.mSessionInfo = this.mBinder.getSessionInfo();
        } catch (RemoteException unused) {
        }
        Bundle c = c.c(this.mSessionInfo);
        this.mSessionInfo = c;
        return c == null ? Bundle.EMPTY : new Bundle(this.mSessionInfo);
    }

    public int getShuffleMode() {
        try {
            return this.mBinder.getShuffleMode();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e);
            return -1;
        }
    }

    public a getTransportControls() {
        if (this.mTransportControls == null) {
            final IMediaSession iMediaSession = this.mBinder;
            this.mTransportControls = new a(iMediaSession) { // from class: android.support.v4.media.session.MediaControllerCompat$TransportControlsBase
                private IMediaSession mBinder;

                {
                    this.mBinder = iMediaSession;
                }

                public void fastForward() {
                    try {
                        this.mBinder.fastForward();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in fastForward.", e);
                    }
                }

                public void pause() {
                    try {
                        this.mBinder.pause();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in pause.", e);
                    }
                }

                public void play() {
                    try {
                        this.mBinder.play();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in play.", e);
                    }
                }

                public void playFromMediaId(String str, Bundle bundle) {
                    try {
                        this.mBinder.playFromMediaId(str, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in playFromMediaId.", e);
                    }
                }

                public void playFromSearch(String str, Bundle bundle) {
                    try {
                        this.mBinder.playFromSearch(str, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in playFromSearch.", e);
                    }
                }

                public void playFromUri(Uri uri, Bundle bundle) {
                    try {
                        this.mBinder.playFromUri(uri, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in playFromUri.", e);
                    }
                }

                public void prepare() {
                    try {
                        this.mBinder.prepare();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in prepare.", e);
                    }
                }

                public void prepareFromMediaId(String str, Bundle bundle) {
                    try {
                        this.mBinder.prepareFromMediaId(str, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in prepareFromMediaId.", e);
                    }
                }

                public void prepareFromSearch(String str, Bundle bundle) {
                    try {
                        this.mBinder.prepareFromSearch(str, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in prepareFromSearch.", e);
                    }
                }

                public void prepareFromUri(Uri uri, Bundle bundle) {
                    try {
                        this.mBinder.prepareFromUri(uri, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in prepareFromUri.", e);
                    }
                }

                public void rewind() {
                    try {
                        this.mBinder.rewind();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in rewind.", e);
                    }
                }

                public void seekTo(long j) {
                    try {
                        this.mBinder.seekTo(j);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in seekTo.", e);
                    }
                }

                public void sendCustomAction(String str, Bundle bundle) {
                    b.a(bundle, str);
                    try {
                        this.mBinder.sendCustomAction(str, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in sendCustomAction.", e);
                    }
                }

                public void setCaptioningEnabled(boolean z) {
                    try {
                        this.mBinder.setCaptioningEnabled(z);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in setCaptioningEnabled.", e);
                    }
                }

                public void setPlaybackSpeed(float f) {
                    if (f == 0.0f) {
                        ny61.g("speed must not be zero");
                        return;
                    }
                    try {
                        this.mBinder.setPlaybackSpeed(f);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in setPlaybackSpeed.", e);
                    }
                }

                public void setRating(RatingCompat ratingCompat) {
                    try {
                        this.mBinder.rate(ratingCompat);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in setRating.", e);
                    }
                }

                public void setRepeatMode(int i) {
                    try {
                        this.mBinder.setRepeatMode(i);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in setRepeatMode.", e);
                    }
                }

                public void setShuffleMode(int i) {
                    try {
                        this.mBinder.setShuffleMode(i);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in setShuffleMode.", e);
                    }
                }

                public void skipToNext() {
                    try {
                        this.mBinder.next();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in skipToNext.", e);
                    }
                }

                public void skipToPrevious() {
                    try {
                        this.mBinder.previous();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in skipToPrevious.", e);
                    }
                }

                public void skipToQueueItem(long j) {
                    try {
                        this.mBinder.skipToQueueItem(j);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in skipToQueueItem.", e);
                    }
                }

                public void stop() {
                    try {
                        this.mBinder.stop();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in stop.", e);
                    }
                }

                public void setRating(RatingCompat ratingCompat, Bundle bundle) {
                    try {
                        this.mBinder.rateWithExtras(ratingCompat, bundle);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in setRating.", e);
                    }
                }

                public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
                    sendCustomAction(customAction.getAction(), bundle);
                }
            };
        }
        return this.mTransportControls;
    }

    public boolean isCaptioningEnabled() {
        try {
            return this.mBinder.isCaptioningEnabled();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e);
            return false;
        }
    }

    public boolean isSessionReady() {
        return true;
    }

    public void registerCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback, Handler handler) {
        if (mediaControllerCompat$Callback == null) {
            ny61.g("callback may not be null.");
            return;
        }
        try {
            this.mBinder.asBinder().linkToDeath(mediaControllerCompat$Callback, 0);
            this.mBinder.registerCallbackListener(mediaControllerCompat$Callback.mIControllerCallback);
            mediaControllerCompat$Callback.postToHandler(13, null, null);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            mediaControllerCompat$Callback.postToHandler(8, null, null);
        }
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        try {
            if ((this.mBinder.getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            this.mBinder.removeQueueItem(mediaDescriptionCompat);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", e);
        }
    }

    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        try {
            this.mBinder.sendCommand(str, bundle, resultReceiver == null ? null : new MediaSessionCompat$ResultReceiverWrapper(resultReceiver));
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in sendCommand.", e);
        }
    }

    public void setVolumeTo(int i, int i2) {
        try {
            this.mBinder.setVolumeTo(i, i2, null);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", e);
        }
    }

    public void unregisterCallback(MediaControllerCompat$Callback mediaControllerCompat$Callback) {
        if (mediaControllerCompat$Callback == null) {
            ny61.g("callback may not be null.");
            return;
        }
        try {
            this.mBinder.unregisterCallbackListener(mediaControllerCompat$Callback.mIControllerCallback);
            this.mBinder.asBinder().unlinkToDeath(mediaControllerCompat$Callback, 0);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
        }
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        try {
            if ((this.mBinder.getFlags() & 4) != 0) {
                this.mBinder.addQueueItemAt(mediaDescriptionCompat, i);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in addQueueItemAt.", e);
        }
    }
}
