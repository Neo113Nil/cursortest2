package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import defpackage.ma31;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplApi19 extends MediaSessionCompat$MediaSessionImplApi18 {
    public MediaSessionCompat$MediaSessionImplApi19(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, ma31 ma31Var, Bundle bundle) {
        super(context, str, componentName, pendingIntent, ma31Var, bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle) {
        RemoteControlClient.MetadataEditor buildRccMetadata = super.buildRccMetadata(bundle);
        PlaybackStateCompat playbackStateCompat = this.mState;
        if (((playbackStateCompat == null ? 0L : playbackStateCompat.getActions()) & 128) != 0) {
            buildRccMetadata.addEditableKey(268435457);
        }
        if (bundle != null) {
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
                buildRccMetadata.putLong(8, bundle.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_RATING)) {
                buildRccMetadata.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
            }
            if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_USER_RATING)) {
                buildRccMetadata.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
            }
        }
        return buildRccMetadata;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public int getRccTransportControlFlagsFromActions(long j) {
        int rccTransportControlFlagsFromActions = super.getRccTransportControlFlagsFromActions(j);
        return (j & 128) != 0 ? rccTransportControlFlagsFromActions | 512 : rccTransportControlFlagsFromActions;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase
    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback, Handler handler) {
        super.setCallback(mediaSessionCompat$Callback, handler);
        if (mediaSessionCompat$Callback == null) {
            this.mRcc.setMetadataUpdateListener(null);
        } else {
            this.mRcc.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19.1
                @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                public void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        MediaSessionCompat$MediaSessionImplApi19.this.postToHandler(19, -1, -1, RatingCompat.fromRating(obj), null);
                    }
                }
            });
        }
    }
}
