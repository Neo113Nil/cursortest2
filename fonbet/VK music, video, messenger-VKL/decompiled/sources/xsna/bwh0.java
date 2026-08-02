package xsna;

import java.util.List;

/* compiled from: SearchLocalityResponse.kt */
/* loaded from: classes6.dex */
public final class bwh0 {
    public final List<qwz> a;

    public bwh0(List<qwz> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwh0) && epx.f(this.a, ((bwh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SearchLocalityResponse(items="), this.a);
    }
}
