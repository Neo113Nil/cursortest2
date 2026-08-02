package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import defpackage.udq0;

/* loaded from: classes.dex */
public final class j {
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public l q;
    public LayoutNode.LayoutState d = LayoutNode.LayoutState.Idle;
    public final p p = new p(this);

    public j(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public final s a() {
        return (s) this.a.a0.e;
    }

    public final void b() {
        LayoutNode.LayoutState layoutState = this.a.b0.d;
        if (layoutState == LayoutNode.LayoutState.LayingOut || layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.p.U) {
                f(true);
            } else {
                e(true);
            }
        }
        if (layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
            l lVar = this.q;
            if (lVar == null || !lVar.E0()) {
                g(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode s = this.a.s();
            j jVar = s != null ? s.b0 : null;
            if (jVar != null) {
                int i3 = jVar.l;
                if (i == 0) {
                    jVar.c(i3 - 1);
                } else {
                    jVar.c(i3 + 1);
                }
            }
        }
    }

    public final void d(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode s = this.a.s();
            j jVar = s != null ? s.b0 : null;
            if (jVar != null) {
                int i3 = jVar.o;
                if (i == 0) {
                    jVar.d(i3 - 1);
                } else {
                    jVar.d(i3 + 1);
                }
            }
        }
    }

    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                c(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                c(this.l - 1);
            }
        }
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                c(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                c(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                d(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                d(this.o - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                d(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                d(this.o - 1);
            }
        }
    }

    public final void i() {
        p pVar = this.p;
        j jVar = pVar.y;
        Object obj = pVar.L;
        LayoutNode layoutNode = this.a;
        if ((obj != null || jVar.a().a() != null) && pVar.K) {
            pVar.K = false;
            pVar.L = jVar.a().a();
            LayoutNode s = layoutNode.s();
            if (s != null) {
                LayoutNode.T(s, false, 7);
            }
        }
        l lVar = this.q;
        if (lVar == null || !lVar.Z0()) {
            return;
        }
        if (udq0.D(layoutNode)) {
            LayoutNode s2 = layoutNode.s();
            if (s2 != null) {
                LayoutNode.T(s2, false, 7);
                return;
            }
            return;
        }
        LayoutNode s3 = layoutNode.s();
        if (s3 != null) {
            LayoutNode.R(s3, false, 7);
        }
    }
}
