package defpackage;

import com.yandex.go.payments.acceptance.domain.c;
import kotlin.collections.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class ce implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ de b;

    public /* synthetic */ ce(de deVar, int i) {
        this.a = i;
        this.b = deVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String l;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        de deVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new ce(deVar, 1);
                fpb1.e(yfdVar, null);
                y1d.a.getClass();
                ((agd) yfdVar).g = y1d.b;
                return zy11Var;
            default:
                je jeVar = deVar.F;
                jf jfVar = (jf) obj;
                if (jl40.l(jfVar, hf.a)) {
                    c cVar = (c) jeVar;
                    ff ffVar = cVar.e;
                    String l2 = ffVar.d().l("active_order_id", null);
                    if ((l2 == null && (l2 = (String) a.Q(cVar.i.keySet())) == null) || (l = ffVar.d().l(ff.h(l2), null)) == null) {
                        return zy11Var;
                    }
                    cVar.g(l);
                    return zy11Var;
                }
                if (!jl40.l(jfVar, gf.a)) {
                    w511.b();
                    return null;
                }
                c cVar2 = (c) jeVar;
                String l3 = cVar2.e.d().l("active_order_id", null);
                if (l3 == null && (l3 = (String) a.Q(cVar2.i.keySet())) == null) {
                    return zy11Var;
                }
                cVar2.b(l3);
                return zy11Var;
        }
    }
}
