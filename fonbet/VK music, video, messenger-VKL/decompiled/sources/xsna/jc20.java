package xsna;

import java.util.List;

/* compiled from: MessageViewsHistoryPageModel.kt */
/* loaded from: classes2.dex */
public final class jc20 {
    public final int a;
    public final List<Long> b;

    public jc20(int i, List<Long> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc20)) {
            return false;
        }
        jc20 jc20Var = (jc20) obj;
        return this.a == jc20Var.a && epx.f(this.b, jc20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageViewsHistoryPageModel(totalCount=");
        sb.append(this.a);
        sb.append(", userIds=");
        return ms9.a(')', sb, this.b);
    }
}
