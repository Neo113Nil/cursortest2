package defpackage;

import com.yandex.go.summary.ui.compose.mapcontent.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class ng00 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6w b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ int w;

    public /* synthetic */ ng00(n6w n6wVar, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = n6wVar;
        this.c = tlsVar;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        tls tlsVar = this.c;
        n6w n6wVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.c(n6wVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
            default:
                a.b(n6wVar, tlsVar, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
