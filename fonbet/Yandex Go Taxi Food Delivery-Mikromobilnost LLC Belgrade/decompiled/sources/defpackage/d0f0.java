package defpackage;

import com.yandex.go.taxi.order.recalculation.ui.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class d0f0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ String c;

    public /* synthetic */ d0f0(b bVar, String str, int i) {
        this.a = i;
        this.b = bVar;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.G.m(str);
                ((c0f0) bVar.Dg()).dismissView();
                break;
            case 1:
                bVar.G.n(str);
                ((f0f0) bVar.z.b).d.run();
                ((c0f0) bVar.Dg()).dismissView();
                break;
            default:
                bVar.G.m(str);
                ((c0f0) bVar.Dg()).dismissView();
                break;
        }
        return zy11Var;
    }
}
