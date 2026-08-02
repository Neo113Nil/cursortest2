package xsna;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: ImageLoaderImpl.kt */
/* loaded from: classes17.dex */
public final class bkw implements ojh0 {
    @Override // xsna.ojh0
    public final boolean a(String str) {
        return mcr0.p(str);
    }

    @Override // xsna.ojh0
    public final Bitmap b(String str) {
        return mcr0.k(str);
    }

    @Override // xsna.ojh0
    public final io.reactivex.rxjava3.core.q<Bitmap> c(Uri uri) {
        return mcr0.h(uri);
    }

    @Override // xsna.ojh0
    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        fkw.a(bitmap, bitmap2);
    }
}
