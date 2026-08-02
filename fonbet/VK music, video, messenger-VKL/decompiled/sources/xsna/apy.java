package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.dak0;
import xsna.woy;
import xsna.ytm0;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class apy implements ytm0.a {
    public final /* synthetic */ woy a;
    public final /* synthetic */ Object b;

    public apy(woy woyVar, Object obj) {
        this.a = woyVar;
        this.b = obj;
    }

    @Override // xsna.ytm0.a
    public final boolean a() {
        jr90 jr90Var;
        woy.b c = c();
        if (c == null || (jr90Var = c.f) == null) {
            return true;
        }
        return jr90Var.a();
    }

    @Override // xsna.ytm0.a
    public final ytm0.b apply() {
        woy.b c = c();
        woy woyVar = this.a;
        if (c != null) {
            woyVar.c(c, false);
        }
        return woyVar.e(this.b);
    }

    @Override // xsna.ytm0.a
    public final boolean b(eal ealVar) {
        woy.b c = c();
        jr90 jr90Var = c != null ? c.f : null;
        if (jr90Var == null || jr90Var.a()) {
            return true;
        }
        dak0 a = dak0.a.a();
        izs<Object, s3q0> e = a != null ? a.e() : null;
        dak0 b = dak0.a.b(a);
        try {
            return jr90Var.b(ealVar);
        } catch (Throwable th) {
            try {
                c.getClass();
                throw th;
            } finally {
                dak0.a.d(a, b, e);
            }
        }
    }

    public final woy.b c() {
        woy woyVar = this.a;
        LayoutNode d = woyVar.k.d(this.b);
        if (d != null) {
            return woyVar.g.d(d);
        }
        return null;
    }

    @Override // xsna.ytm0.a
    public final void cancel() {
        woy.b c = c();
        if ((c != null ? c.f : null) != null) {
            woy.b(this.a, this.b);
        }
    }
}
