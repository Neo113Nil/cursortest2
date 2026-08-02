package defpackage;

import androidx.compose.foundation.text.selection.i;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class onc implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ a c;

    public /* synthetic */ onc(a aVar, i iVar) {
        this.a = 2;
        this.c = aVar;
        this.b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        bkq0 bkq0Var;
        ho40 c;
        bkq0 bkq0Var2;
        ho40 c2;
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i iVar = this.b;
        a aVar = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pob1.a(iVar, aVar, (fid) obj, vng.O(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                frb1.b(iVar, aVar, (fid) obj, vng.O(49));
                break;
            default:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 1;
                int i3 = 0;
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    aVar.invoke(btsVar, 0);
                    if (iVar.h() && ((Boolean) iVar.i.getValue()).booleanValue()) {
                        ckq0 g = iVar.g();
                        if (!(g == null ? true : jl40.l(g.a, g.b))) {
                            btsVar.e0(-1736224054);
                            ckq0 g2 = iVar.g();
                            if (g2 == null) {
                                btsVar.e0(2011629175);
                                btsVar.t(false);
                                z = false;
                            } else {
                                btsVar.e0(2011629176);
                                btsVar.e0(-1736222526);
                                List g3 = scc.g(Boolean.TRUE, Boolean.FALSE);
                                int size = g3.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    boolean booleanValue = ((Boolean) g3.get(i4)).booleanValue();
                                    boolean a = btsVar.a(booleanValue);
                                    Object Q = btsVar.Q();
                                    Object obj3 = did.a;
                                    if (a || Q == obj3) {
                                        Q = new xkq0(booleanValue, iVar);
                                        btsVar.o0(Q);
                                    }
                                    yly0 yly0Var = (yly0) Q;
                                    boolean a2 = btsVar.a(booleanValue);
                                    Object Q2 = btsVar.Q();
                                    if (a2 || Q2 == obj3) {
                                        Q2 = booleanValue ? new fkq0(iVar, i3) : new fkq0(iVar, i2);
                                        btsVar.o0(Q2);
                                    }
                                    sls slsVar = (sls) Q2;
                                    ResolvedTextDirection resolvedTextDirection = booleanValue ? g2.a.a : g2.b.a;
                                    float f = 0.0f;
                                    if (booleanValue) {
                                        ckq0 g4 = iVar.g();
                                        if (g4 != null && (c2 = iVar.c((bkq0Var2 = g4.a))) != null) {
                                            int i5 = bkq0Var2.b;
                                            dry0 dry0Var = (dry0) c2.c.invoke();
                                            if (dry0Var != null) {
                                                f = lnb1.c(dry0Var, i5);
                                            }
                                        }
                                    } else {
                                        ckq0 g5 = iVar.g();
                                        if (g5 != null && (c = iVar.c((bkq0Var = g5.b))) != null) {
                                            int i6 = bkq0Var.b;
                                            dry0 dry0Var2 = (dry0) c.c.invoke();
                                            if (dry0Var2 != null) {
                                                f = lnb1.c(dry0Var2, i6);
                                            }
                                        }
                                    }
                                    ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
                                    float f2 = f;
                                    jkq0 jkq0Var = new jkq0(slsVar);
                                    boolean z2 = g2.c;
                                    boolean e = btsVar.e(yly0Var);
                                    Object Q3 = btsVar.Q();
                                    if (e || Q3 == obj3) {
                                        Q3 = new ikq0(yly0Var, 0);
                                        btsVar.o0(Q3);
                                    }
                                    pva1.b(jkq0Var, booleanValue, resolvedTextDirection2, z2, 0L, f2, exw0.a(c530.a, yly0Var, (PointerInputEventHandler) Q3), btsVar, 0);
                                    i4++;
                                    i2 = 1;
                                    i3 = 0;
                                }
                                boolean z3 = i3;
                                btsVar.t(z3);
                                btsVar.t(z3);
                                z = z3;
                            }
                            btsVar.t(z);
                            break;
                        }
                    }
                    btsVar.e0(2013602667);
                    btsVar.t(false);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ onc(i iVar, a aVar, int i, int i2) {
        this.a = i2;
        this.b = iVar;
        this.c = aVar;
    }
}
