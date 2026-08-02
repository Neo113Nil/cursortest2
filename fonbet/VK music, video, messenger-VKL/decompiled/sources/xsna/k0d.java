package xsna;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;
import xsna.mih0;

/* compiled from: ClipItemBadgeEventHandler.kt */
/* loaded from: classes17.dex */
public final class k0d implements yy5 {
    public final j1d b;
    public final anc c;
    public final boolean d;
    public final eb e;

    public k0d(j1d j1dVar, anc ancVar, boolean z, eb ebVar) {
        this.b = j1dVar;
        this.c = ancVar;
        this.d = z;
        this.e = ebVar;
    }

    @Override // xsna.yy5
    public final void a(mih0 mih0Var) {
        boolean z = mih0Var instanceof mih0.m;
        j1d j1dVar = this.b;
        if (z) {
            j1dVar.a(j4d.b);
            return;
        }
        if (mih0Var instanceof mih0.c) {
            j1dVar.a(u3d.b);
            return;
        }
        if (mih0Var instanceof mih0.a) {
            j1dVar.a(new s3d(((mih0.a) mih0Var).i));
            return;
        }
        if (mih0Var instanceof mih0.j) {
            j1dVar.a(b4d.b);
            return;
        }
        if (mih0Var instanceof mih0.f) {
            j1dVar.a(new x3d(((mih0.f) mih0Var).i));
            return;
        }
        if (mih0Var instanceof mih0.g) {
            mih0.g gVar = (mih0.g) mih0Var;
            if (!this.d) {
                j1dVar.a(new r3d(gVar.i));
                return;
            }
            com.vk.movika.sdk.base.flow.binding.l lVar = new com.vk.movika.sdk.base.flow.binding.l(4, this, gVar);
            Activity c = g2u0.c((o1d) this.e.c);
            if (c == null) {
                return;
            }
            this.c.c(c, lVar);
            return;
        }
        if (mih0Var instanceof mih0.b) {
            j1dVar.a(t3d.b);
            return;
        }
        if (mih0Var instanceof mih0.h) {
            j1dVar.a(new z3d(((mih0.h) mih0Var).i));
            return;
        }
        if (mih0Var instanceof mih0.l.b) {
            j1dVar.a(new i4d(((mih0.l.b) mih0Var).i));
            return;
        }
        if (mih0Var instanceof mih0.l.a) {
            j1dVar.a(new h4d(((mih0.l.a) mih0Var).i));
            return;
        }
        if (mih0Var instanceof mih0.d) {
            mih0.d dVar = (mih0.d) mih0Var;
            j1dVar.a(new v3d(dVar.i, dVar.k));
            return;
        }
        if (mih0Var instanceof mih0.i) {
            j1dVar.a(a4d.b);
            return;
        }
        if (mih0Var instanceof mih0.e) {
            return;
        }
        if (mih0Var instanceof mih0.n) {
            j1dVar.a(k4d.b);
            return;
        }
        if (mih0Var instanceof mih0.p) {
            j1dVar.a(m4d.b);
            return;
        }
        if (mih0Var instanceof mih0.q) {
            j1dVar.a(new w3d(mih0Var));
        } else {
            if (!(mih0Var instanceof mih0.k)) {
                throw new NoWhenBranchMatchedException();
            }
            mih0.k kVar = (mih0.k) mih0Var;
            j1dVar.a(new d4d(kVar.l, kVar.m));
        }
    }

    @Override // xsna.yy5
    public final void b(mih0 mih0Var) {
        if ((mih0Var instanceof mih0.m) || (mih0Var instanceof mih0.c) || (mih0Var instanceof mih0.a) || (mih0Var instanceof mih0.j) || (mih0Var instanceof mih0.f) || (mih0Var instanceof mih0.g) || (mih0Var instanceof mih0.b) || (mih0Var instanceof mih0.h) || (mih0Var instanceof mih0.l.b) || (mih0Var instanceof mih0.l.a) || (mih0Var instanceof mih0.d) || (mih0Var instanceof mih0.i) || (mih0Var instanceof mih0.e) || (mih0Var instanceof mih0.n) || (mih0Var instanceof mih0.q)) {
            return;
        }
        boolean z = mih0Var instanceof mih0.k;
        j1d j1dVar = this.b;
        if (z) {
            j1dVar.a(e4d.b);
        } else {
            if (!(mih0Var instanceof mih0.p)) {
                throw new NoWhenBranchMatchedException();
            }
            j1dVar.a(n4d.b);
        }
    }
}
