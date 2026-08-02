package defpackage;

import ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class a4e implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4e b;
    public final /* synthetic */ f530 c;

    public /* synthetic */ a4e(e4e e4eVar, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = e4eVar;
        this.c = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f530 f530Var = this.c;
        e4e e4eVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b.e(e4eVar, f530Var, fidVar, vng.O(49));
                break;
            default:
                b.d(e4eVar, f530Var, fidVar, vng.O(49));
                break;
        }
        return zy11Var;
    }
}
