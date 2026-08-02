package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class apv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpv0 b;

    public /* synthetic */ apv0(cpv0 cpv0Var, int i) {
        this.a = i;
        this.b = cpv0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cpv0 cpv0Var = this.b;
        switch (i) {
            case 0:
                cpv0Var.c();
                cpv0Var.d();
                break;
            case 1:
                r0 r0Var = cpv0Var.C;
                xov0 xov0Var = new xov0((qct0) obj);
                r0Var.getClass();
                r0Var.m(null, xov0Var);
                break;
            case 2:
                cpv0Var.b();
                break;
            case 3:
                cpv0Var.z.l((mct0) obj);
                break;
            case 4:
                lct0 lct0Var = cpv0Var.y;
                lct0Var.g = ((hv0) obj).b;
                r0 r0Var2 = cpv0Var.z;
                mct0 a = lct0Var.a();
                r0Var2.getClass();
                r0Var2.m(null, a);
                break;
            default:
                cpv0Var.a();
                break;
        }
        return zy11Var;
    }
}
