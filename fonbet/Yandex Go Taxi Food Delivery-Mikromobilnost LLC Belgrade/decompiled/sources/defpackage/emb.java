package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.checkout.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class emb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ emb(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new emb(aVar, 1);
                ((agd) yfdVar).g = new androidx.compose.runtime.internal.a(-1946223165, new alb0(6, aVar), true);
                break;
            default:
                wib wibVar = (wib) obj;
                com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a aVar2 = aVar.O;
                aVar2.getClass();
                nnb analytics = wibVar.getAnalytics();
                if (analytics != null) {
                    aVar2.a.a(analytics.a, analytics.c, analytics.b, analytics.d);
                }
                aVar.J.b(wibVar, aVar.P);
                break;
        }
        return zy11Var;
    }
}
