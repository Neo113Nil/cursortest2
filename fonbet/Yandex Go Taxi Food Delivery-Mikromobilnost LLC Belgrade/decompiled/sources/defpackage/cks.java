package defpackage;

import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class cks implements dx4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eks b;

    public /* synthetic */ cks(eks eksVar, int i) {
        this.a = i;
        this.b = eksVar;
    }

    @Override // defpackage.dx4
    public final void o(a aVar, pv0 pv0Var) {
        int i = this.a;
        eks eksVar = this.b;
        switch (i) {
            case 0:
                eksVar.r(new yid(PointType.DESTINATION, pv0Var, 1));
                break;
            default:
                eksVar.r(new yid(PointType.SOURCE, pv0Var, 1));
                break;
        }
    }
}
