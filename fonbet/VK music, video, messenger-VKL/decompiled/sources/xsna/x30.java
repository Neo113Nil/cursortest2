package xsna;

import java.util.ArrayList;

/* compiled from: ActionMenuApps.kt */
/* loaded from: classes6.dex */
public final class x30 {
    public final String a;
    public final ArrayList b;

    public x30(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x30)) {
            return false;
        }
        x30 x30Var = (x30) obj;
        return epx.f(this.a, x30Var.a) && this.b.equals(x30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionMenuApps(title=");
        sb.append(this.a);
        sb.append(", apps=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
