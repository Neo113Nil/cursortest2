package xsna;

import java.util.List;

/* compiled from: SessionsChangeData.kt */
/* loaded from: classes6.dex */
public final class uxi0 {
    public final List<usi0> a;
    public final List<usi0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public uxi0(List<? extends usi0> list, List<? extends usi0> list2) {
        this.a = list;
        this.b = list2;
    }

    public final List<usi0> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxi0)) {
            return false;
        }
        uxi0 uxi0Var = (uxi0) obj;
        return epx.f(this.a, uxi0Var.a) && epx.f(this.b, uxi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionsChangeData(oldSessions=");
        sb.append(this.a);
        sb.append(", newSessions=");
        return ms9.a(')', sb, this.b);
    }
}
