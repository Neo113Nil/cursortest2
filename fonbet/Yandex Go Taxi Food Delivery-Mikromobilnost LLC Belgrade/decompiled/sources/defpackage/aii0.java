package defpackage;

import androidx.compose.runtime.InvalidationResult;

/* loaded from: classes.dex */
public final class aii0 {
    public bii0 a;
    public int b;
    public yss c;
    public wls d;
    public int e;
    public qy40 f;
    public hz40 g;

    public aii0(bii0 bii0Var) {
        this.a = bii0Var;
    }

    public final boolean a() {
        if (this.a != null) {
            yss yssVar = this.c;
            if (yssVar != null ? yssVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final InvalidationResult b(Object obj) {
        InvalidationResult a;
        bii0 bii0Var = this.a;
        return (bii0Var == null || (a = bii0Var.a(this, obj)) == null) ? InvalidationResult.IGNORED : a;
    }

    public final void c() {
        bii0 bii0Var = this.a;
        if (bii0Var != null) {
            bii0Var.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
