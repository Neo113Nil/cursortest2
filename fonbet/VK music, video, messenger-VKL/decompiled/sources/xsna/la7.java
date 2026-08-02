package xsna;

import java.util.List;

/* compiled from: BirthdaysListState.kt */
/* loaded from: classes15.dex */
public final class la7 {
    public final List<ab7> a;
    public final boolean b;

    public la7(List<ab7> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la7)) {
            return false;
        }
        la7 la7Var = (la7) obj;
        return epx.f(this.a, la7Var.a) && this.b == la7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdaysListContent(sections=");
        sb.append(this.a);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
