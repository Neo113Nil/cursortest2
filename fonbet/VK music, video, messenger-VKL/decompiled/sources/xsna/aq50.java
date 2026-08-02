package xsna;

import android.view.View;
import com.vk.clips.sdk.facade.api.MyTargetFacadeClickTarget;
import com.vk.mvi.MviLazyViewContainer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.xp50;
import xsna.yp50;

/* compiled from: MyTargetFacadeImpl.kt */
/* loaded from: classes17.dex */
public final class aq50 implements wp50 {
    public final gjx a;
    public final yix b;
    public final String c;
    public final long d;
    public final String e;
    public final bpn0 f;
    public vx4 g;
    public vd7 h;
    public final bpn0 i;

    public aq50(gjx gjxVar, yix yixVar) {
        lhz0 lhz0Var;
        this.a = gjxVar;
        this.b = yixVar;
        this.c = gjxVar.getId();
        this.d = gjxVar.a();
        wjz0 content = gjxVar.getContent();
        this.e = (content == null || (lhz0Var = content.g) == null) ? null : lhz0Var.a.U;
        this.f = new bpn0(new r010(this, 12));
        this.i = new bpn0(new flu(this, 23));
    }

    @Override // xsna.wp50
    public final long a() {
        return this.d;
    }

    @Override // xsna.wp50
    public final String b() {
        return this.e;
    }

    @Override // xsna.wp50
    public final void c(MviLazyViewContainer mviLazyViewContainer) {
        vd7 vd7Var = new vd7(mviLazyViewContainer);
        this.h = vd7Var;
        cjx cjxVar = (cjx) this.f.getValue();
        if (cjxVar != null) {
            cjxVar.q(vd7Var);
        }
    }

    @Override // xsna.wp50
    public final void d(View view, m960 m960Var, tbe0 tbe0Var) {
        this.g = new vx4(view, m960Var, tbe0Var);
    }

    @Override // xsna.wp50
    public final String e() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zp50
    public final void f(xp50 xp50Var) {
        wix a;
        ArrayList arrayList;
        yp50 yp50Var = (yp50) this.i.getValue();
        vx4 vx4Var = this.g;
        vd7 vd7Var = this.h;
        cjx cjxVar = yp50Var.b;
        bpn0 bpn0Var = yp50Var.d;
        if (cjxVar == null) {
            return;
        }
        boolean z = xp50Var instanceof xp50.l;
        if (z || (xp50Var instanceof xp50.n) || (xp50Var instanceof xp50.m) || (xp50Var instanceof xp50.o)) {
            if (z) {
                if (vd7Var != null) {
                    cjxVar.q(vd7Var);
                    return;
                }
                return;
            }
            if (xp50Var instanceof xp50.n) {
                if (vd7Var != null) {
                    cjxVar.f(vd7Var);
                    return;
                }
                return;
            } else {
                if (!(xp50Var instanceof xp50.m)) {
                    if (!(xp50Var instanceof xp50.o) || (a = yp50Var.a(((xp50.o) xp50Var).a)) == null) {
                        return;
                    }
                    cjxVar.c(a);
                    return;
                }
                d9 d9Var = new d9(xp50Var, 25);
                wix a2 = yp50Var.a(((xp50.m) xp50Var).a);
                if (a2 != null) {
                    cjxVar.h(d9Var, a2);
                    return;
                }
                return;
            }
        }
        boolean z2 = xp50Var instanceof xp50.j;
        if (z2 || (xp50Var instanceof xp50.i) || (xp50Var instanceof xp50.a)) {
            if (xp50Var instanceof xp50.a) {
                String str = ((xp50.a) xp50Var).a;
                egz0 c = yp50Var.a.c();
                ajx ajxVar = null;
                if (c != null && (arrayList = c.b) != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (epx.f(((ajx) next).b(), str)) {
                            ajxVar = next;
                            break;
                        }
                    }
                    ajxVar = ajxVar;
                }
                if (ajxVar != null) {
                    cjxVar.b(ajxVar);
                    return;
                }
                return;
            }
            if (z2) {
                xp50.j jVar = (xp50.j) xp50Var;
                View view = jVar.a;
                np50 np50Var = (np50) bpn0Var.getValue();
                MyTargetFacadeClickTarget myTargetFacadeClickTarget = jVar.b;
                np50Var.getClass();
                cjxVar.r(np50.a(myTargetFacadeClickTarget), view);
                return;
            }
            if (xp50Var instanceof xp50.i) {
                xp50.i iVar = (xp50.i) xp50Var;
                wix a3 = yp50Var.a(iVar.b);
                if (a3 != null) {
                    View view2 = iVar.a;
                    np50 np50Var2 = (np50) bpn0Var.getValue();
                    MyTargetFacadeClickTarget myTargetFacadeClickTarget2 = iVar.c;
                    np50Var2.getClass();
                    cjxVar.j(view2, a3, np50.a(myTargetFacadeClickTarget2));
                    return;
                }
                return;
            }
            return;
        }
        if (xp50Var instanceof xp50.k) {
            cjxVar.d(((xp50.k) xp50Var).a.h());
            return;
        }
        boolean z3 = xp50Var instanceof xp50.g;
        if (!z3 && !(xp50Var instanceof xp50.f) && !(xp50Var instanceof xp50.e) && !(xp50Var instanceof xp50.d) && !(xp50Var instanceof xp50.c) && !(xp50Var instanceof xp50.h) && !(xp50Var instanceof xp50.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = 1;
        if (xp50Var instanceof xp50.d) {
            int i2 = yp50.a.$EnumSwitchMapping$0[((xp50.d) xp50Var).a.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 0;
            }
            cjxVar.n(i);
            return;
        }
        if (xp50Var instanceof xp50.e) {
            cjxVar.l();
            cjxVar.a();
            return;
        }
        if (xp50Var instanceof xp50.f) {
            if (vx4Var != null) {
                cjxVar.s(vx4Var);
                cjxVar.k();
                return;
            }
            return;
        }
        if (z3) {
            if (vx4Var != null) {
                cjxVar.s(vx4Var);
            }
        } else if (xp50Var instanceof xp50.c) {
            if (yp50Var.c.compareAndSet(false, true)) {
                cjxVar.g();
            }
        } else if (xp50Var instanceof xp50.h) {
            cjxVar.o(((xp50.h) xp50Var).a);
        } else if (xp50Var instanceof xp50.b) {
            cjxVar.e(false);
        }
    }

    @Override // xsna.wp50
    public final void g() {
        this.h = null;
        this.g = null;
        cjx cjxVar = (cjx) this.f.getValue();
        if (cjxVar != null) {
            cjxVar.m(null);
        }
    }

    @Override // xsna.wp50
    public final void h(izs<? super String, s3q0> izsVar) {
        cjx cjxVar = (cjx) this.f.getValue();
        if (cjxVar != null) {
            cjxVar.m(new uj0(this, izsVar));
        }
    }
}
