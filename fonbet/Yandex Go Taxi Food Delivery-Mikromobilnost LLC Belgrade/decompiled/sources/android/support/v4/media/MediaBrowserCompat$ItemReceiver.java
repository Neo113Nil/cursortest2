package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* loaded from: classes10.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    private final MediaBrowserCompat$ItemCallback mCallback;
    private final String mMediaId;

    public MediaBrowserCompat$ItemReceiver(String str, MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback, Handler handler) {
        super(handler);
        this.mMediaId = str;
        this.mCallback = mediaBrowserCompat$ItemCallback;
    }

    @Override // android.support.v4.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.c.c(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
            this.mCallback.getClass();
            return;
        }
        Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.mCallback.getClass();
        } else {
            this.mCallback.getClass();
        }
    }
}
