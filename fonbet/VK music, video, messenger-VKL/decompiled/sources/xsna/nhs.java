package xsna;

import android.graphics.Bitmap;

/* compiled from: FrescoToVkPostprocessor.kt */
/* loaded from: classes2.dex */
public final class nhs implements jtc0 {
    public final mk6 a;

    public nhs(mk6 mk6Var) {
        this.a = mk6Var;
    }

    @Override // xsna.jtc0
    public final String a() {
        ww8 a = this.a.a();
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    @Override // xsna.jtc0
    public final void b(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    @Override // xsna.jtc0
    public final String getName() {
        return this.a.getName();
    }
}
