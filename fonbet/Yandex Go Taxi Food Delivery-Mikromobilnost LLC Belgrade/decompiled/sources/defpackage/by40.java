package defpackage;

/* loaded from: classes10.dex */
public final class by40 {
    public final wz40 a = new wz40(new suw[16]);
    public int b;
    public suw c;

    public final void a(int i, h5y h5yVar) {
        if (i < 0) {
            lxv.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        suw suwVar = new suw(this.b, i, h5yVar);
        this.b += i;
        this.a.b(suwVar);
    }

    public final suw b(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder t = b64.t(i, "Index ", ", size ");
            t.append(this.b);
            lxv.e(t.toString());
        }
        suw suwVar = this.c;
        if (suwVar != null) {
            int i2 = suwVar.a;
            if (i < suwVar.b + i2 && i2 <= i) {
                return suwVar;
            }
        }
        wz40 wz40Var = this.a;
        suw suwVar2 = (suw) wz40Var.a[p9b1.e(i, wz40Var)];
        this.c = suwVar2;
        return suwVar2;
    }
}
