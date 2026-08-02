package xsna;

/* compiled from: CatalogToggleData.kt */
/* loaded from: classes17.dex */
public final class rha {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final boolean d;

    public rha(float f, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rha)) {
            return false;
        }
        rha rhaVar = (rha) obj;
        return this.a == rhaVar.a && this.b == rhaVar.b && Float.compare(this.c, rhaVar.c) == 0 && this.d == rhaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogToggleData(isPerformanceFeatureEnabled=");
        sb.append(this.a);
        sb.append(", isAppViewPartInRecsEnabled=");
        sb.append(this.b);
        sb.append(", appViewRecsPercentage=");
        sb.append(this.c);
        sb.append(", isLegoRedesigned=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
