package xsna;

import java.util.List;

/* compiled from: ReviewBlockAttach.kt */
/* loaded from: classes18.dex */
public final class kgg0 {
    public final List a;

    public kgg0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgg0) && epx.f(this.a, ((kgg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return jr.a(')', new StringBuilder("ReviewBlockAttach(items="), this.a);
    }
}
