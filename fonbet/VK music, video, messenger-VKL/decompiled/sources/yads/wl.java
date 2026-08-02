package yads;

/* loaded from: classes10.dex */
public final class wl implements zx2 {
    public final long a;
    public final /* synthetic */ yl b;

    public wl(yl ylVar, long j) {
        this.b = ylVar;
        this.a = j;
    }

    @Override // yads.zx2
    public final boolean b() {
        return true;
    }

    @Override // yads.zx2
    public final long c() {
        return this.a;
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        xx2 b = this.b.g[0].b(j);
        int i = 1;
        while (true) {
            iu[] iuVarArr = this.b.g;
            if (i >= iuVarArr.length) {
                return b;
            }
            xx2 b2 = iuVarArr[i].b(j);
            if (b2.a.b < b.a.b) {
                b = b2;
            }
            i++;
        }
    }
}
