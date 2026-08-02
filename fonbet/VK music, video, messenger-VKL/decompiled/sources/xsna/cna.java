package xsna;

import xsna.tlo0;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public final class cna {
    public final tlo0.f a;
    public final String b;

    public cna(String str, tlo0.f fVar) {
        this.a = fVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cna)) {
            return false;
        }
        cna cnaVar = (cna) obj;
        return this.a.equals(cnaVar.a) && epx.f(this.b, cnaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CellDetailsItem(text=");
        sb.append(this.a);
        sb.append(", url=");
        return ho8.a(sb, this.b, ')');
    }
}
