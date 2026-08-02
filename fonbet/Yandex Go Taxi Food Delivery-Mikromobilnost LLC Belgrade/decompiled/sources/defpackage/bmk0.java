package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.t;

/* loaded from: classes14.dex */
public final /* synthetic */ class bmk0 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ wrs0 c;

    public /* synthetic */ bmk0(t tVar, wrs0 wrs0Var, int i) {
        this.a = i;
        this.b = tVar;
        this.c = wrs0Var;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        wrs0 wrs0Var = this.c;
        t tVar = this.b;
        switch (i) {
            case 0:
                ibk0 a = ijk0.a(nqs0Var);
                if (a != null) {
                    tVar.S.a(a, wrs0Var);
                    break;
                }
                break;
            default:
                ibk0 a2 = ijk0.a(nqs0Var);
                if (a2 != null) {
                    tVar.S.a(a2, wrs0Var);
                    break;
                }
                break;
        }
    }
}
