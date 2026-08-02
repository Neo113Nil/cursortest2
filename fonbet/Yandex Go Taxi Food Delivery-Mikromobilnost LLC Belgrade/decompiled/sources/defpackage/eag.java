package defpackage;

import com.yandex.go.taxi_order.ws.d;

/* loaded from: classes14.dex */
public final class eag implements xvf0 {
    public final /* synthetic */ int a;
    public final h6r b;

    public /* synthetic */ eag(h6r h6rVar, int i) {
        this.a = i;
        this.b = h6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h6r h6rVar = this.b;
        switch (i) {
            case 0:
                p2y0 p2y0Var = (p2y0) ((zzf) h6rVar).J2.get();
                q5z.h(p2y0Var);
                return p2y0Var;
            case 1:
                lgz0 lgz0Var = (lgz0) ((zzf) h6rVar).Yh.get();
                q5z.h(lgz0Var);
                return lgz0Var;
            default:
                d dVar = (d) ((zzf) h6rVar).n7.get();
                q5z.h(dVar);
                return dVar;
        }
    }
}
