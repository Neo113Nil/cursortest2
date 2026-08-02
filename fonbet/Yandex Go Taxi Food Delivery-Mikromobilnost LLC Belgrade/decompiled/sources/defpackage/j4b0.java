package defpackage;

import com.yandex.go.personal_goals_v2.ui.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class j4b0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4b0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ j4b0(v4b0 v4b0Var, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = v4b0Var;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        v4b0 v4b0Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.c(v4b0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                a.b(v4b0Var, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
