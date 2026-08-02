package defpackage;

import coil.graphics.ExifOrientationPolicy;
import coil.graphics.a;

/* loaded from: classes.dex */
public final class k06 implements gyg {
    public final ExifOrientationPolicy a;
    public final pnq0 b;

    public k06(int i, ExifOrientationPolicy exifOrientationPolicy) {
        this.a = exifOrientationPolicy;
        this.b = qnq0.a(i);
    }

    @Override // defpackage.gyg
    public final hyg a(pjt0 pjt0Var, qg70 qg70Var) {
        return new a(pjt0Var.c(), qg70Var, this.b, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof k06;
    }

    public final int hashCode() {
        return k06.class.hashCode();
    }

    public k06() {
        this(4, ExifOrientationPolicy.RESPECT_PERFORMANCE);
    }
}
