package xsna;

import java.util.ArrayList;

/* compiled from: DraftsResult.kt */
/* loaded from: classes18.dex */
public final class hfo {
    public final ArrayList a;
    public final int b;
    public final boolean c;

    public hfo(ArrayList arrayList, int i, boolean z) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfo)) {
            return false;
        }
        hfo hfoVar = (hfo) obj;
        return this.a.equals(hfoVar.a) && this.b == hfoVar.b && this.c == hfoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftsResult(drafts=");
        sb.append(this.a);
        sb.append(", nextPaginationOffset=");
        sb.append(this.b);
        sb.append(", isAllDraftsLoaded=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
