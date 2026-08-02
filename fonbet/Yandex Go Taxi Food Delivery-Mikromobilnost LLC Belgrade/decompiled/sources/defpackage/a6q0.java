package defpackage;

import flex.engine.section.c;
import kotlin.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class a6q0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a6q0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        cnr0 cnr0Var;
        u1m u1mVar;
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                nie nieVar = cVar.d0;
                if (nieVar == null || (cnr0Var = nieVar.d) == null) {
                    return null;
                }
                return new pxl(cnr0Var);
            case 1:
                nie nieVar2 = cVar.d0;
                if (nieVar2 != null) {
                    return c.m(nieVar2);
                }
                return null;
            case 2:
                return cVar.T;
            case 3:
                return cVar.h0;
            case 4:
                return Boolean.valueOf(cVar.e0 instanceof ske);
            case 5:
                nie nieVar3 = cVar.d0;
                if (nieVar3 == null || (u1mVar = nieVar3.b) == null) {
                    return null;
                }
                return u1mVar.a;
            case 6:
                cVar.c.a(new o5q0(null));
                return zy11.a;
            default:
                nie nieVar4 = cVar.d0;
                return a.a(new csf0(29, nieVar4 != null ? nieVar4.d : null));
        }
    }
}
