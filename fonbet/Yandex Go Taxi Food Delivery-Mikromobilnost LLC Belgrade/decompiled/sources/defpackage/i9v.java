package defpackage;

import android.os.Build;
import coil.graphics.b;

/* loaded from: classes.dex */
public final class i9v implements gyg {
    public final boolean a;

    public i9v(int i) {
        this.a = true;
    }

    @Override // defpackage.gyg
    public final hyg a(pjt0 pjt0Var, qg70 qg70Var) {
        qq6 source = pjt0Var.c().source();
        if (kgt.c(source) || kgt.b(source) || (Build.VERSION.SDK_INT >= 30 && kgt.a(source))) {
            return new b(pjt0Var.c(), qg70Var, this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return obj instanceof i9v;
    }

    public final int hashCode() {
        return i9v.class.hashCode();
    }

    public i9v() {
        this(0);
    }
}
