package android.support.v4.media.session;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;

/* loaded from: classes10.dex */
public abstract class c {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(c.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat != null) {
            long j = -1;
            if (playbackStateCompat.getPosition() != -1 && (playbackStateCompat.getState() == 3 || playbackStateCompat.getState() == 4 || playbackStateCompat.getState() == 5)) {
                long j2 = 0;
                if (playbackStateCompat.getLastPositionUpdateTime() > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long position = playbackStateCompat.getPosition() + ((long) (playbackStateCompat.getPlaybackSpeed() * (elapsedRealtime - r2)));
                    if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                        j = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                    }
                    if (j >= 0 && position > j) {
                        j2 = j;
                    } else if (position >= 0) {
                        j2 = position;
                    }
                    PlaybackStateCompat.a aVar = new PlaybackStateCompat.a(playbackStateCompat);
                    int state = playbackStateCompat.getState();
                    float playbackSpeed = playbackStateCompat.getPlaybackSpeed();
                    aVar.b = state;
                    aVar.c = j2;
                    aVar.i = elapsedRealtime;
                    aVar.e = playbackSpeed;
                    return new PlaybackStateCompat(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.a, aVar.j, aVar.k);
                }
            }
        }
        return playbackStateCompat;
    }

    public static Bundle c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
