package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AccountAnonymousToggles.kt */
/* loaded from: classes6.dex */
public final class gn {
    public final int a;
    public final ArrayList b;

    public gn(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final List<fn> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return this.a == gnVar.a && this.b.equals(gnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountAnonymousToggles(version=");
        sb.append(this.a);
        sb.append(", toggles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
