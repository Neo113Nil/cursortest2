package defpackage;

import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;

/* loaded from: classes14.dex */
public final /* synthetic */ class ajx0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffPageCloseReason b;

    public /* synthetic */ ajx0(TariffPageCloseReason tariffPageCloseReason, int i) {
        this.a = i;
        this.b = tariffPageCloseReason;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        TariffPageCloseReason tariffPageCloseReason = this.b;
        ih31 ih31Var = (ih31) obj;
        switch (i) {
            case 0:
                ih31Var.a.invoke(tariffPageCloseReason);
                break;
            default:
                ih31Var.a.invoke(tariffPageCloseReason);
                break;
        }
        return zy11Var;
    }
}
