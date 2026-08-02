package defpackage;

import java.util.HashMap;

/* loaded from: classes10.dex */
public final class bow0 {
    public final HashMap a;
    public final HashMap b;
    public final int c;

    public bow0(HashMap hashMap, HashMap hashMap2, int i) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bow0)) {
            return false;
        }
        bow0 bow0Var = (bow0) obj;
        return this.a.equals(bow0Var.a) && this.b.equals(bow0Var.b) && this.c == bow0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return oyr.s(sb, this.c, ')');
    }
}
