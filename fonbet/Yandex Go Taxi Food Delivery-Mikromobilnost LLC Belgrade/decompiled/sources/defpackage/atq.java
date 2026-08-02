package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class atq implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ cuq b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ atq(cuq cuqVar, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = cuqVar;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        cuq cuqVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.c(cuqVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                a.b(cuqVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
