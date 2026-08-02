package xsna;

import java.util.ArrayList;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class l5w {
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    public l5w(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5w)) {
            return false;
        }
        l5w l5wVar = (l5w) obj;
        return this.a.equals(l5wVar.a) && this.b == l5wVar.b && this.c == l5wVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImItemHistoryStorageModel(items=");
        sb.append(this.a);
        sb.append(", hasAfterCached=");
        sb.append(this.b);
        sb.append(", hasBeforeCached=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
