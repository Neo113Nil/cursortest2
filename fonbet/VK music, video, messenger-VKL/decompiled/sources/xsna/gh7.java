package xsna;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* compiled from: MediaView.kt */
/* loaded from: classes2.dex */
public final class gh7 extends mk6 {
    public final int c;

    public gh7(int i) {
        this.c = i;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("MediaViewBlurTransform");
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        uvf<Bitmap> a = hta0Var.a(bitmap);
        try {
            NativeBlurFilter.iterativeBoxBlur(a.r(), 3, this.c);
            return a.n();
        } catch (UnsatisfiedLinkError unused) {
            a.close();
            return hta0Var.a(bitmap).n();
        } finally {
            a.close();
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "MediaViewBlurTransform";
    }
}
