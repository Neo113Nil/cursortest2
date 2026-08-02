package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class kzr {
    public final List a;

    public kzr(jzr... jzrVarArr) {
        if (jzrVarArr.length <= 0) {
            this.a = j73.d0(jzrVarArr);
        } else {
            jzr jzrVar = jzrVarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kzr) {
            return jl40.l(this.a, ((kzr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
