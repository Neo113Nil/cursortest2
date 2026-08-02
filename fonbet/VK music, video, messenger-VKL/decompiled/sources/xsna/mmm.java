package xsna;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mmm(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xgl0 xgl0Var = (xgl0) this.d;
                xgl0 xgl0Var2 = (xgl0) obj;
                nmm nmmVar = (nmm) xgl0Var.c(new eph((Collection) this.e, 9));
                LinkedHashMap linkedHashMap = nmmVar.a;
                Map<Long, com.vk.im.engine.models.dialogs.b> map = nmmVar.b;
                Map<Long, lj30> map2 = nmmVar.c;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    xgl0Var2.b().e().D(((Number) entry.getKey()).longValue(), (gkx0) entry.getValue(), -1);
                }
                if (this.c) {
                    xgl0Var.u(new vh9(xgl0Var, map, map2, 10));
                }
                return linkedHashMap;
            default:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                oa90 oa90Var = (oa90) this.e;
                dts dtsVar = (dts) obj;
                if (dtsVar.c) {
                    cVar.l(dtsVar.b);
                    cVar.r(true);
                } else {
                    cVar.r(false);
                }
                oa90Var.d.n0(dtsVar.a);
                if (this.c) {
                    oa90Var.e.invoke();
                }
                return s3q0.a;
        }
    }
}
