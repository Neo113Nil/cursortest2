package xsna;

import java.util.List;

/* compiled from: PastAsrListContent.kt */
/* loaded from: classes7.dex */
public final class zm90 {
    public final List<ev3> a;

    public zm90(List<ev3> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm90) && epx.f(this.a, ((zm90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PastAsrListContent(asrItems="), this.a);
    }
}
