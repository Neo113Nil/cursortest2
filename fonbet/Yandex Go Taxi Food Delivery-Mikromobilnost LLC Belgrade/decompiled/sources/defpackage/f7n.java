package defpackage;

import android.R;

/* loaded from: classes9.dex */
public final class f7n implements h1p {
    public final String a;

    public f7n(String str) {
        this.a = str;
    }

    @Override // defpackage.h1p
    public final int a() {
        return R.color.transparent;
    }

    @Override // defpackage.h1p
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7n) && jl40.l(this.a, ((f7n) obj).a);
    }

    @Override // defpackage.h1p
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
