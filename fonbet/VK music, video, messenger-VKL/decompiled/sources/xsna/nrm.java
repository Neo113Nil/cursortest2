package xsna;

/* compiled from: DialogsHistoryMetaStorageModel.kt */
/* loaded from: classes2.dex */
public final class nrm {
    public final pum a;
    public final vjm b;
    public final boolean c;
    public final int d;

    public nrm(pum pumVar, vjm vjmVar, boolean z, int i) {
        this.a = pumVar;
        this.b = vjmVar;
        this.c = z;
        this.d = i;
    }

    public static nrm a(nrm nrmVar, pum pumVar, vjm vjmVar, int i) {
        if ((i & 1) != 0) {
            pumVar = nrmVar.a;
        }
        if ((i & 2) != 0) {
            vjmVar = nrmVar.b;
        }
        boolean z = (i & 4) != 0 ? nrmVar.c : false;
        int i2 = nrmVar.d;
        nrmVar.getClass();
        return new nrm(pumVar, vjmVar, z, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrm)) {
            return false;
        }
        nrm nrmVar = (nrm) obj;
        return epx.f(this.a, nrmVar.a) && epx.f(this.b, nrmVar.b) && this.c == nrmVar.c && this.d == nrmVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsHistoryMetaStorageModel(mode=");
        sb.append(this.a);
        sb.append(", oldestSortId=");
        sb.append(this.b);
        sb.append(", fullyFetched=");
        sb.append(this.c);
        sb.append(", phaseId=");
        return vu5.b(sb, this.d, ')');
    }
}
