package defpackage;

import com.yandex.go.benefits_center.activation.ui.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class em5 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm5 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ em5(qm5 qm5Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = qm5Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        qm5 qm5Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.c(qm5Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                a.b(qm5Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
