package defpackage;

import com.yandex.go.summary.ui.compose.common.selector.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class glq0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nmq0 b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ tls x;
    public final /* synthetic */ int y;

    public /* synthetic */ glq0(nmq0 nmq0Var, f530 f530Var, tls tlsVar, tls tlsVar2, int i, int i2) {
        this.a = i2;
        this.b = nmq0Var;
        this.c = f530Var;
        this.w = tlsVar;
        this.x = tlsVar2;
        this.y = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                a.f(this.b, this.c, this.w, this.x, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                a.g(this.b, this.c, this.w, this.x, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
