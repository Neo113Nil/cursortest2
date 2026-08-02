package defpackage;

import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class cpo implements wls {
    public final /* synthetic */ m3u0 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int a;
    public final /* synthetic */ cex0 b;
    public final /* synthetic */ f530 c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ tpr x;
    public final /* synthetic */ yur y;
    public final /* synthetic */ yur z;

    public /* synthetic */ cpo(cex0 cex0Var, f530 f530Var, tls tlsVar, tpr tprVar, yur yurVar, yur yurVar2, m3u0 m3u0Var, int i, int i2) {
        this.a = i2;
        this.b = cex0Var;
        this.c = f530Var;
        this.w = tlsVar;
        this.x = tprVar;
        this.y = yurVar;
        this.z = yurVar2;
        this.A = m3u0Var;
        this.B = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                nga1.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                c.g(this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
