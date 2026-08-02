package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.ya10;
import java.util.ArrayList;

/* loaded from: classes10.dex */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    private final ya10 mCallback;
    private final Bundle mExtras;
    private final String mQuery;

    public MediaBrowserCompat$SearchResultReceiver(String str, Bundle bundle, ya10 ya10Var, Handler handler) {
        super(handler);
        this.mQuery = str;
        this.mExtras = bundle;
        this.mCallback = ya10Var;
    }

    @Override // android.support.v4.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.c.c(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
            this.mCallback.getClass();
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
        if (parcelableArray == null) {
            this.mCallback.getClass();
            return;
        }
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        this.mCallback.getClass();
    }
}
