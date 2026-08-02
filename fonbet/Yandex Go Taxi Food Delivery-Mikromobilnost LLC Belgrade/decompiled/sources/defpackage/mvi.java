package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class mvi {
    public final kki a;
    public final ans0 b;

    public mvi(kki kkiVar, ans0 ans0Var) {
        this.a = kkiVar;
        this.b = ans0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
    
        if (r0.b.a() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fm2 a() {
        ans0 ans0Var = this.b;
        int i = zms0.a[ans0Var.a.e.e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return null;
                }
            }
            cni l = this.a.a.l();
            vuh vuhVar = l.a;
            List list = l.b;
            if (vuhVar.e.length() <= 0) {
                return new fm2(gki.a);
            }
            c6w it = scc.e(list).iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (((vuh) list.get(nextInt)).e.length() <= 0) {
                    return new fm2(new fki(nextInt));
                }
            }
        }
        return null;
    }
}
