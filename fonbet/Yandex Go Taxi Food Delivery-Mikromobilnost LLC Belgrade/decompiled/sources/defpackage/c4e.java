package defpackage;

import ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class c4e implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4e b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ int w;

    public /* synthetic */ c4e(e4e e4eVar, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = e4eVar;
        this.c = slsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        sls slsVar = this.c;
        e4e e4eVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b.b(e4eVar, slsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                b.a(e4eVar, slsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
