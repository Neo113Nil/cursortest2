package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class h6n implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ i6n b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ sls w;

    public /* synthetic */ h6n(i6n i6nVar, tls tlsVar, sls slsVar) {
        this.b = i6nVar;
        this.c = tlsVar;
        this.w = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.w;
        tls tlsVar = this.c;
        i6n i6nVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    if ((i6nVar != null ? i6nVar.a : null) == null) {
                        if ((i6nVar != null ? i6nVar.b : null) == null) {
                            btsVar.e0(-328057749);
                            btsVar.t(false);
                            break;
                        }
                    }
                    btsVar.e0(-328250910);
                    b.c(i6nVar, tlsVar, slsVar, btsVar, 0);
                    btsVar.t(false);
                    break;
                }
            default:
                num.getClass();
                b.c(i6nVar, tlsVar, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ h6n(i6n i6nVar, tls tlsVar, sls slsVar, int i) {
        this.b = i6nVar;
        this.c = tlsVar;
        this.w = slsVar;
    }
}
