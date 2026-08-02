package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import defpackage.ma31;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplApi18 extends MediaSessionCompat$MediaSessionImplBase {
    private static boolean sIsMbrPendingIntentSupported = true;

    public MediaSessionCompat$MediaSessionImplApi18(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, ma31 ma31Var, Bundle bundle) {
        super(context, str, componentName, pendingIntent, ma31Var, bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public int getRccTransportControlFlagsFromActions(long j) {
        int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
        return (j & 256) != 0 ? rccTransportControlFlagsFromActions | 256 : rccTransportControlFlagsFromActions;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public void registerMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        if (sIsMbrPendingIntentSupported) {
            try {
                this.mAudioManager.registerMediaButtonEventReceiver(pendingIntent);
            } catch (NullPointerException unused) {
                sIsMbrPendingIntentSupported = false;
            }
        }
        if (sIsMbrPendingIntentSupported) {
            return;
        }
        super.registerMediaButtonEventReceiver(pendingIntent, componentName);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback, Handler handler) {
        super.setCallback(mediaSessionCompat$Callback, handler);
        if (mediaSessionCompat$Callback == null) {
            this.mRcc.setPlaybackPositionUpdateListener(null);
        } else {
            this.mRcc.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18.1
                @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                public void onPlaybackPositionUpdate(long j) {
                    MediaSessionCompat$MediaSessionImplApi18.this.postToHandler(18, -1, -1, Long.valueOf(j), null);
                }
            });
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public void setRccState(PlaybackStateCompat playbackStateCompat) {
        long position = playbackStateCompat.getPosition();
        float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
        long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (playbackStateCompat.getState() == 3) {
            long j = 0;
            if (position > 0) {
                if (lastPositionUpdateTime > 0) {
                    j = elapsedRealtime - lastPositionUpdateTime;
                    if (playbackSpeed > 0.0f && playbackSpeed != 1.0f) {
                        j = (long) (j * playbackSpeed);
                    }
                }
                position += j;
            }
        }
        this.mRcc.setPlaybackState(getRccStateFromState(playbackStateCompat.getState()), position, playbackSpeed);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public void unregisterMediaButtonEventReceiver(PendingIntent pendingIntent, ComponentName componentName) {
        if (sIsMbrPendingIntentSupported) {
            this.mAudioManager.unregisterMediaButtonEventReceiver(pendingIntent);
        } else {
            super.unregisterMediaButtonEventReceiver(pendingIntent, componentName);
        }
    }
}
