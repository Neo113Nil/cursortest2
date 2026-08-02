package xsna;

import android.graphics.Bitmap;

/* compiled from: VkToFrescoPostprocessor.kt */
/* loaded from: classes2.dex */
public final class lsv0 extends mk6 {
    public final jtc0 c;

    public lsv0(jtc0 jtc0Var) {
        this.c = jtc0Var;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        String a = this.c.a();
        if (a != null) {
            return new ppj0(a);
        }
        return null;
    }

    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        this.c.b(bitmap);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return this.c.getName();
    }
}
