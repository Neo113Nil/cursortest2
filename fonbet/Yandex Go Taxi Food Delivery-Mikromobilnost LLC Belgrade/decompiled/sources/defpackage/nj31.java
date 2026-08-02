package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class nj31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj31 b;

    public /* synthetic */ nj31(hj31 hj31Var, int i, int i2) {
        this.a = i2;
        this.b = hj31Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hj31 hj31Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b.f(hj31Var, fidVar, vng.O(1));
                break;
            default:
                b.e(hj31Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
