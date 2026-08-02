package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BoundTimeline.kt */
/* loaded from: classes3.dex */
public final class s98 {
    public final List<c7s0> a;
    public final el4 b;
    public final boolean c;
    public final ArrayList d;

    /* JADX WARN: Multi-variable type inference failed */
    public s98(List<? extends c7s0> list, el4 el4Var, boolean z) {
        this.a = list;
        this.b = el4Var;
        this.c = z;
        this.d = j5g.v0(el4Var, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s98 a(s98 s98Var, ArrayList arrayList, el4 el4Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = s98Var.a;
        }
        if ((i & 2) != 0) {
            el4Var = s98Var.b;
        }
        boolean z = s98Var.c;
        s98Var.getClass();
        return new s98(list, el4Var, z);
    }

    public final void b() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((c7s0) it.next()).release();
        }
        this.b.release();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s98)) {
            return false;
        }
        s98 s98Var = (s98) obj;
        return epx.f(this.a, s98Var.a) && epx.f(this.b, s98Var.b) && this.c == s98Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (Object obj : this.a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            StringBuilder b = ji.b(i2, "video track ", ": ");
            b.append(((c7s0) obj).a());
            b.append('\n');
            sb.append(b.toString());
            i2 = i3;
        }
        for (Object obj2 : this.b.a) {
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            sb.append("audio track " + i + ": " + ((xx4) obj2) + '\n');
            i = i4;
        }
        return sb.toString();
    }
}
