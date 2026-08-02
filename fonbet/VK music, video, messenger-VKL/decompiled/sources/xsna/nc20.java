package xsna;

import java.util.List;

/* compiled from: MessageViewsModel.kt */
/* loaded from: classes2.dex */
public final class nc20 {
    public final int a;
    public final List<qtd0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public nc20(int i, List<? extends qtd0> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc20)) {
            return false;
        }
        nc20 nc20Var = (nc20) obj;
        return this.a == nc20Var.a && epx.f(this.b, nc20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageViewsModel(totalCount=");
        sb.append(this.a);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.b);
    }
}
