package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.checkout.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class jmb implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ jmb(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                blb blbVar = (blb) obj;
                if (blbVar instanceof ykb) {
                    aVar.j(dpb.a);
                    com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a aVar2 = aVar.O;
                    wib wibVar = ((ykb) blbVar).b;
                    aVar2.getClass();
                    nnb analytics = wibVar.getAnalytics();
                    if (analytics != null) {
                        aVar2.a.a(analytics.a, analytics.c, analytics.b, analytics.d);
                    }
                    aVar.J.b(wibVar, aVar.P);
                    return zy11Var;
                }
                if (blbVar instanceof zkb) {
                    aVar.j(dpb.a);
                    aVar.O.c();
                    return zy11Var;
                }
                if (blbVar instanceof alb) {
                    aVar.r(new od9(26, blbVar));
                    return zy11Var;
                }
                w511.b();
                return null;
            default:
                tnb tnbVar = (tnb) obj;
                String str = tnbVar.b;
                if (str != null) {
                    aVar.N.a(str, tnbVar.c, tnbVar.d);
                }
                return zy11Var;
        }
    }
}
