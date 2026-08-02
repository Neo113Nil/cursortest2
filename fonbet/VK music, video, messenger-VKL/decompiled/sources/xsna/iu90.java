package xsna;

import java.util.Set;

/* compiled from: PeersSelectData.kt */
/* loaded from: classes18.dex */
public final class iu90 {
    public final Integer a;
    public final Set<Long> b;
    public final Set<Long> c;

    public iu90(Integer num, Set<Long> set, Set<Long> set2) {
        this.a = num;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu90)) {
            return false;
        }
        iu90 iu90Var = (iu90) obj;
        return epx.f(this.a, iu90Var.a) && epx.f(this.b, iu90Var.b) && epx.f(this.c, iu90Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.c.hashCode() + fw3.b((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeersSelectData(targetFolderId=");
        sb.append(this.a);
        sb.append(", alreadySelected=");
        sb.append(this.b);
        sb.append(", alreadyUnselected=");
        return ur.c(sb, this.c, ')');
    }
}
