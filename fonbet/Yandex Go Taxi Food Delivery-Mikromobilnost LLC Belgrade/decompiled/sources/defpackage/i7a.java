package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class i7a implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ i7a(List list, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        List list = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                aib1.a(list, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            case 1:
                vib1.c(list, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                c991.g(list, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
