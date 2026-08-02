package defpackage;

import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class ap70 implements bf4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bf4
    public final boolean onBackPress() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f fVar = (f) obj;
                OrderFragment orderFragment = fVar.p1;
                if (!(orderFragment != null ? orderFragment.onBackPressed() : false)) {
                    fVar.r(new qu(9));
                    break;
                }
                break;
            default:
                rsv0 rsv0Var = (rsv0) obj;
                rsv0Var.w.a.remove(rsv0Var.x);
                ((osv0) rsv0Var.Dg()).dismiss();
                break;
        }
        return true;
    }
}
