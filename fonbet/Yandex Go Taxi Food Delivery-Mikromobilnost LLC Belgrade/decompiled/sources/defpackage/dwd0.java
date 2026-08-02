package defpackage;

import androidx.compose.ui.input.pointer.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.f;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class dwd0 {
    public final LayoutNode a;
    public final a b;
    public final bwd0 c = new bwd0();
    public final cnu d = new cnu();
    public boolean e;

    public dwd0(LayoutNode layoutNode) {
        this.a = layoutNode;
        this.b = new a((f) layoutNode.a0.d);
    }

    public final int a(y4a0 y4a0Var, AndroidComposeView androidComposeView, boolean z) {
        boolean z2;
        a aVar;
        boolean z3;
        cnu cnuVar = this.d;
        if (this.e) {
            return oy91.g(false, false, false);
        }
        boolean z4 = true;
        try {
            this.e = true;
            tis0 a = this.c.a(y4a0Var, androidComposeView);
            int j = a.L().j();
            for (int i = 0; i < j; i++) {
                zvd0 zvd0Var = (zvd0) a.L().l(i);
                if (!zvd0Var.f() && !zvd0Var.h()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int j2 = a.L().j();
            int i2 = 0;
            while (true) {
                aVar = this.b;
                if (i2 >= j2) {
                    break;
                }
                zvd0 zvd0Var2 = (zvd0) a.L().l(i2);
                if (z2 || kx91.b(zvd0Var2)) {
                    LayoutNode layoutNode = this.a;
                    long e = zvd0Var2.e();
                    cnu cnuVar2 = this.d;
                    int i3 = zvd0Var2.i();
                    z0y z0yVar = LayoutNode.m0;
                    layoutNode.y(e, cnuVar2, i3, true);
                    if (!cnuVar.a.d()) {
                        aVar.a(kx91.b(zvd0Var2), zvd0Var2.d(), cnuVar);
                        cnuVar.clear();
                    }
                }
                i2++;
            }
            boolean b = aVar.b(a, z);
            if (!a.S()) {
                int j3 = a.L().j();
                for (int i4 = 0; i4 < j3; i4++) {
                    zvd0 zvd0Var3 = (zvd0) a.L().l(i4);
                    if (kx91.h(zvd0Var3) && zvd0Var3.j()) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            int j4 = a.L().j();
            int i5 = 0;
            while (true) {
                if (i5 >= j4) {
                    z4 = false;
                    break;
                }
                if (((zvd0) a.L().l(i5)).j()) {
                    break;
                }
                i5++;
            }
            int g = oy91.g(b, z3, z4);
            this.e = false;
            return g;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }
}
