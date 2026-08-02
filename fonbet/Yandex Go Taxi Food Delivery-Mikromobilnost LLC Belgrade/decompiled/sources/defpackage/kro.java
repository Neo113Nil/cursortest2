package defpackage;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class kro {
    public final ArrayList a;
    public final long b;

    public kro(long j, ArrayList arrayList) {
        this.a = arrayList;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kro)) {
            return false;
        }
        kro kroVar = (kro) obj;
        return this.a.equals(kroVar.a) && this.b == kroVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggeredExperimentSet(flags=");
        sb.append(this.a);
        sb.append(", testId=");
        return b64.o(sb, this.b, ')');
    }
}
