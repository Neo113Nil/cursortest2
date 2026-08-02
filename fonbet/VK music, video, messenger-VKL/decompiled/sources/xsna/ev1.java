package xsna;

import java.util.ArrayList;

/* compiled from: AllowMessagesFromGroupParams.kt */
/* loaded from: classes6.dex */
public final class ev1 {
    public final long a;
    public final ArrayList b;
    public final String c;

    public ev1(long j, String str, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev1)) {
            return false;
        }
        ev1 ev1Var = (ev1) obj;
        return this.a == ev1Var.a && this.b.equals(ev1Var.b) && epx.f(this.c, ev1Var.c);
    }

    public final int hashCode() {
        int a = qr.a(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllowMessagesFromGroupParams(groupId=");
        sb.append(this.a);
        sb.append(", intents=");
        sb.append(this.b);
        sb.append(", key=");
        return ho8.a(sb, this.c, ')');
    }
}
