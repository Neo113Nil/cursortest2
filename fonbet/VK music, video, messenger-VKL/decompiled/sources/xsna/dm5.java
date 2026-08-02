package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes13.dex */
public final class dm5 extends j1v {
    public final String a;
    public final ArrayList b;

    public dm5(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // xsna.j1v
    public final List<String> b() {
        return this.b;
    }

    @Override // xsna.j1v
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1v)) {
            return false;
        }
        j1v j1vVar = (j1v) obj;
        return this.a.equals(j1vVar.c()) && this.b.equals(j1vVar.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
