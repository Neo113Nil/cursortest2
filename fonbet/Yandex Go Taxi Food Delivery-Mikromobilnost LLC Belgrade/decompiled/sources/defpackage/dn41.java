package defpackage;

import ru.yandex.taxi.logistics.sdk.webview.impl.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class dn41 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ int c;

    public /* synthetic */ dn41(a aVar, int i, int i2) {
        this.a = i2;
        this.b = aVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        a aVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                aVar.b(fidVar, vng.O(i2 | 1));
                break;
            default:
                aVar.a(fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
