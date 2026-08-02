package xsna;

import java.util.List;

/* compiled from: BirthdaysListPage.kt */
/* loaded from: classes15.dex */
public final class qa7 {
    public final List<ab7> a;
    public final boolean b;

    public qa7(List<ab7> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa7)) {
            return false;
        }
        qa7 qa7Var = (qa7) obj;
        return epx.f(this.a, qa7Var.a) && this.b == qa7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdaysListPage(sections=");
        sb.append(this.a);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
