package defpackage;

import flex.engine.section.c;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class e6q0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ e6q0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                j89 j89Var = cVar.I;
                j89Var.p = num;
                j89Var.b();
                break;
            case 1:
                cVar.b0.g(new ox31(num.intValue()));
                break;
            case 2:
                cVar.b0.g(new px31(num.intValue()));
                break;
            default:
                Object obj2 = (u0x) a.S(num.intValue(), cVar.J.w);
                if (obj2 instanceof xdu0) {
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
