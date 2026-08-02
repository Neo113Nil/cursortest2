package xsna;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: ImageLoader.kt */
/* loaded from: classes8.dex */
public interface zjw {

    /* compiled from: ImageLoader.kt */
    public interface a {
        void a(Bitmap bitmap);

        void onError();
    }

    il80 a(Uri uri, a aVar, ih7... ih7VarArr);
}
