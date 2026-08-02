package xsna;

import java.util.ArrayList;
import xsna.c2r;

/* compiled from: FeedPatch.kt */
/* loaded from: classes17.dex */
public final class f2r implements c2r.e {
    public final ArrayList b;
    public final ea90 c;
    public final ea90 d;

    public f2r(ArrayList arrayList, ea90 ea90Var, ea90 ea90Var2) {
        this.b = arrayList;
        this.c = ea90Var;
        this.d = ea90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2r)) {
            return false;
        }
        f2r f2rVar = (f2r) obj;
        return this.b.equals(f2rVar.b) && this.c.equals(f2rVar.c) && this.d.equals(f2rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Full(items=" + this.b + ", pageBackwardState=" + this.c + ", pageForwardState=" + this.d + ')';
    }
}
