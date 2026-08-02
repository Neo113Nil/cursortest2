package xsna;

import java.util.List;

/* compiled from: RelatedAudiosResult.kt */
/* loaded from: classes6.dex */
public final class isf0 {
    public final List<vrf0> a;

    public isf0(List<vrf0> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isf0) && epx.f(this.a, ((isf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("RelatedAudiosResult(items="), this.a);
    }
}
