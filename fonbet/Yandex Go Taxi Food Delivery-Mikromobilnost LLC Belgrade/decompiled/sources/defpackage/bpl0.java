package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class bpl0 {
    public final List a;
    public final wls b;

    public bpl0(List list, wls wlsVar) {
        this.a = list;
        this.b = wlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (bpl0.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((bpl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
