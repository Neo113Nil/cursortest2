package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class kgc0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ lgc0 b;

    public /* synthetic */ kgc0(lgc0 lgc0Var, int i) {
        this.a = i;
        this.b = lgc0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        lgc0 lgc0Var = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                mo21 mo21Var = (mo21) pair.getFirst();
                lgc0Var.C = ((Boolean) pair.getSecond()).booleanValue();
                if (mo21Var != null) {
                    ((igc0) lgc0Var.Dg()).updateUserLocation(mo21Var);
                }
                if (!lgc0Var.C) {
                    ((igc0) lgc0Var.Dg()).n0();
                    break;
                } else {
                    ((igc0) lgc0Var.Dg()).t0();
                    break;
                }
            default:
                ((igc0) lgc0Var.Dg()).updateAzimuth(((Number) obj).floatValue());
                break;
        }
        return zy11Var;
    }
}
