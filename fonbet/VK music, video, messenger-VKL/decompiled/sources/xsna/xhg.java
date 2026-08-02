package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a59;
import xsna.vhg;
import xsna.whg;

/* compiled from: CommonCallListNavigator.kt */
/* loaded from: classes7.dex */
public final class xhg {
    public final f4z a;

    public xhg(f4z f4zVar, f4z f4zVar2, rte0 rte0Var, b7f0 b7f0Var) {
        this.a = f4zVar;
    }

    public final void a(vhg.c cVar) {
        boolean z = cVar instanceof vhg.c.h;
        f4z f4zVar = this.a;
        if (z) {
            f4zVar.b(new whg.s(0));
        } else if (cVar instanceof vhg.c.g) {
            vhg.c.g gVar = (vhg.c.g) cVar;
            a59 a59Var = gVar.b;
            boolean z2 = gVar.d;
            a59.d a = a59Var.a();
            if (!(a instanceof a59.d.b)) {
                if (!(a instanceof a59.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Making a call to a group is not supported");
            }
            UserId b = com.vk.voip.userid.a.b(((a59.d.b) a).a);
            if (b != null) {
                f4zVar.b(new whg.p(null, b, z2));
            } else {
                t49 t49Var = gVar.c;
                if (t49Var != null) {
                    f4zVar.b(new whg.q(t49Var, z2, null));
                }
            }
        } else if (cVar instanceof vhg.c.e) {
            a59.d a2 = ((vhg.c.e) cVar).b.a();
            if (a2 instanceof a59.d.b) {
                UserId b2 = com.vk.voip.userid.a.b(((a59.d.b) a2).a);
                if (b2 != null) {
                    f4zVar.b(new whg.v(b2));
                }
            } else {
                if (!(a2 instanceof a59.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new whg.n(((a59.d.a) a2).a.a));
            }
        } else if (cVar instanceof vhg.c.i) {
            UserId b3 = com.vk.voip.userid.a.b(((vhg.c.i) cVar).b);
            if (b3 != null) {
                f4zVar.b(new whg.b0(b3));
            }
        } else {
            if (cVar instanceof vhg.c.j) {
                ((vhg.c.j) cVar).getClass();
                throw null;
            }
            if (cVar instanceof vhg.c.f) {
                f4zVar.b(new whg.o(((vhg.c.f) cVar).b));
            } else if (cVar instanceof vhg.c.C3892c) {
                vhg.c.C3892c c3892c = (vhg.c.C3892c) cVar;
                if (BuildInfo.s() || BuildInfo.t()) {
                    f4zVar.b(new whg.z(c3892c.c));
                } else {
                    f4zVar.b(new whg.y(c3892c.b));
                }
            } else if (cVar instanceof vhg.c.d) {
                f4zVar.b(new whg.a0(((vhg.c.d) cVar).b));
            } else if (cVar instanceof vhg.c.a) {
                f4zVar.b(new whg.t(((vhg.c.a) cVar).b));
            } else {
                if (!(cVar instanceof vhg.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(whg.r.a);
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
