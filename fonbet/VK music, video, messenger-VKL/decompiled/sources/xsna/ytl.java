package xsna;

import xsna.q630;

/* compiled from: DelegatingNode.kt */
/* loaded from: classes11.dex */
public abstract class ytl extends q630.c {
    public final int p = a570.e(this);
    public q630.c q;

    @Override // xsna.q630.c
    public final void Y1() {
        super.Y1();
        for (q630.c cVar = this.q; cVar != null; cVar = cVar.g) {
            cVar.h2(this.i);
            if (!cVar.o) {
                cVar.Y1();
            }
        }
    }

    @Override // xsna.q630.c
    public final void Z1() {
        for (q630.c cVar = this.q; cVar != null; cVar = cVar.g) {
            cVar.Z1();
        }
        super.Z1();
    }

    @Override // xsna.q630.c
    public final void d2() {
        super.d2();
        for (q630.c cVar = this.q; cVar != null; cVar = cVar.g) {
            cVar.d2();
        }
    }

    @Override // xsna.q630.c
    public final void e2() {
        for (q630.c cVar = this.q; cVar != null; cVar = cVar.g) {
            cVar.e2();
        }
        super.e2();
    }

    @Override // xsna.q630.c
    public final void f2() {
        super.f2();
        for (q630.c cVar = this.q; cVar != null; cVar = cVar.g) {
            cVar.f2();
        }
    }

    @Override // xsna.q630.c
    public final void g2(q630.c cVar) {
        this.b = cVar;
        for (q630.c cVar2 = this.q; cVar2 != null; cVar2 = cVar2.g) {
            cVar2.g2(cVar);
        }
    }

    @Override // xsna.q630.c
    public final void h2(androidx.compose.ui.node.o oVar) {
        this.i = oVar;
        for (q630.c cVar = this.q; cVar != null; cVar = cVar.g) {
            cVar.h2(oVar);
        }
    }

    public final <T extends htl> T i2(T t) {
        q630.c z = t.z();
        if (z != t) {
            q630.c cVar = t instanceof q630.c ? (q630.c) t : null;
            q630.c cVar2 = cVar != null ? cVar.f : null;
            if (z != this.b || !epx.f(cVar2, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (z.o) {
                uzw.b("Cannot delegate to an already attached node");
            }
            z.g2(this.b);
            int i = this.d;
            int f = a570.f(z);
            z.d = f;
            int i2 = this.d;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof noy)) {
                uzw.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + z);
            }
            z.g = this.q;
            this.q = z;
            z.f = this;
            k2(f | this.d, false);
            if (this.o) {
                if (i3 == 0 || (i & 2) != 0) {
                    h2(this.i);
                } else {
                    u470 u470Var = itl.f(this).G;
                    this.b.h2(null);
                    u470Var.g();
                }
                z.Y1();
                z.e2();
                if (!z.o) {
                    uzw.b("autoInvalidateInsertedNode called on unattached node");
                }
                a570.a(z, -1, 1);
            }
        }
        return t;
    }

    public final void j2(htl htlVar) {
        q630.c cVar = null;
        for (q630.c cVar2 = this.q; cVar2 != null; cVar2 = cVar2.g) {
            if (cVar2 == htlVar) {
                boolean z = cVar2.o;
                if (z) {
                    eh50<Object> eh50Var = a570.a;
                    if (!z) {
                        uzw.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    a570.a(cVar2, -1, 2);
                    cVar2.f2();
                    cVar2.Z1();
                }
                cVar2.g2(cVar2);
                cVar2.e = 0;
                if (cVar == null) {
                    this.q = cVar2.g;
                } else {
                    cVar.g = cVar2.g;
                }
                cVar2.g = null;
                cVar2.f = null;
                int i = this.d;
                int f = a570.f(this);
                k2(f, true);
                if (this.o && (i & 2) != 0 && (f & 2) == 0) {
                    u470 u470Var = itl.f(this).G;
                    this.b.h2(null);
                    u470Var.g();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + htlVar).toString());
    }

    public final void k2(int i, boolean z) {
        q630.c cVar;
        int i2 = this.d;
        this.d = i;
        if (i2 != i) {
            q630.c cVar2 = this.b;
            if (cVar2 == this) {
                this.e = i;
            }
            if (this.o) {
                q630.c cVar3 = this;
                while (cVar3 != null) {
                    i |= cVar3.d;
                    cVar3.d = i;
                    if (cVar3 == cVar2) {
                        break;
                    } else {
                        cVar3 = cVar3.f;
                    }
                }
                if (z && cVar3 == cVar2) {
                    i = a570.f(cVar2);
                    cVar2.d = i;
                }
                int i3 = i | ((cVar3 == null || (cVar = cVar3.g) == null) ? 0 : cVar.e);
                while (cVar3 != null) {
                    i3 |= cVar3.d;
                    cVar3.e = i3;
                    cVar3 = cVar3.f;
                }
            }
        }
    }
}
