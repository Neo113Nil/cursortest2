package xsna;

/* compiled from: AndroidWindowInfo.android.kt */
/* loaded from: classes11.dex */
public final class hyy implements spx0 {
    public gzs<d1m> a;
    public wh50<d1m> b;
    public final wh50 c = androidx.compose.runtime.k.b(Boolean.FALSE);

    @Override // xsna.spx0
    public final long a() {
        d1m d1mVar;
        if (this.b == null) {
            gzs<d1m> gzsVar = this.a;
            if (gzsVar == null || (d1mVar = gzsVar.invoke()) == null) {
                d1mVar = d1m.c;
            }
            this.b = androidx.compose.runtime.k.b(d1mVar);
            this.a = null;
        }
        return ((d1m) ((zak0) this.b).getValue()).b;
    }

    @Override // xsna.spx0
    public final boolean b() {
        return ((Boolean) ((zak0) this.c).getValue()).booleanValue();
    }

    @Override // xsna.spx0
    public final long c() {
        d1m d1mVar;
        if (this.b == null) {
            gzs<d1m> gzsVar = this.a;
            if (gzsVar == null || (d1mVar = gzsVar.invoke()) == null) {
                d1mVar = d1m.c;
            }
            this.b = androidx.compose.runtime.k.b(d1mVar);
            this.a = null;
        }
        return ((d1m) ((zak0) this.b).getValue()).a;
    }
}
