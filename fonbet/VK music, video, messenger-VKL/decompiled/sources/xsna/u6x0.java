package xsna;

import java.util.ArrayList;

/* compiled from: VoipWatchVideoPage.kt */
/* loaded from: classes7.dex */
public final class u6x0<T> {
    public final T a;
    public final ArrayList b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public u6x0(Object obj, ArrayList arrayList, int i) {
        this.a = obj;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6x0)) {
            return false;
        }
        u6x0 u6x0Var = (u6x0) obj;
        return epx.f(this.a, u6x0Var.a) && this.b.equals(u6x0Var.b) && this.c == u6x0Var.c;
    }

    public final int hashCode() {
        T t = this.a;
        return Integer.hashCode(this.c) + qr.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipWatchVideoPage(nextFrom=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", count=");
        return vu5.b(sb, this.c, ')');
    }
}
