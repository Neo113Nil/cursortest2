package xsna;

import java.util.ArrayList;

/* compiled from: MsgSearchTokenizer.kt */
/* loaded from: classes2.dex */
public final class e2p0 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public e2p0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2p0)) {
            return false;
        }
        e2p0 e2p0Var = (e2p0) obj;
        return this.a.equals(e2p0Var.a) && this.b.equals(e2p0Var.b) && this.c.equals(e2p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tokens(rus=");
        sb.append(this.a);
        sb.append(", eng=");
        sb.append(this.b);
        sb.append(", all=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
