package yads;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ns2 implements zf0 {
    public final v9 a;
    public final b2 b;
    public final kz c;
    public final d02 d;
    public final e52 e;
    public final o73 f;
    public final hi0 g;
    public final jw h;
    public by0 i;
    public ls2 j;

    public ns2(v9 v9Var, b2 b2Var, kz kzVar, f02 f02Var, e52 e52Var, o73 o73Var, hi0 hi0Var, jw jwVar) {
        this.a = v9Var;
        this.b = b2Var;
        this.c = kzVar;
        this.d = f02Var;
        this.e = e52Var;
        this.f = o73Var;
        this.g = hi0Var;
        this.h = jwVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        View c = this.d.c(viewGroup);
        if (c != null) {
            ls2 ls2Var = new ls2(this);
            this.b.b.add(ls2Var);
            this.j = ls2Var;
            qu2 a = gx2.a().a(c.getContext());
            boolean z = false;
            boolean z2 = a != null && a.G;
            eg0[] eg0VarArr = eg0.b;
            if ("divkit".equals(this.a.k) && z2) {
                z = true;
            }
            if (!z) {
                c.setOnClickListener(new ks2(this.c));
            }
            c.setVisibility(8);
            ms2 ms2Var = new ms2(new WeakReference(c));
            jw jwVar = this.h;
            v9 v9Var = this.a;
            e52 e52Var = this.e;
            o73 o73Var = this.f;
            hi0 hi0Var = this.g;
            jwVar.getClass();
            f72 f72Var = e52Var.a;
            q82 q82Var = e52Var.b;
            by0 by0Var = null;
            String str = hi0Var != null ? hi0Var.a : null;
            fg0[] fg0VarArr = fg0.b;
            by0 b42Var = (epx.f(str, "pack_shot") && o73Var.d.a()) ? new b42(v9Var, ms2Var, o73Var) : f72Var != null ? new d72(f72Var, ms2Var, v9Var.j, o73Var.e, o73Var.d) : q82Var != null ? new o82(q82Var, ms2Var) : o73Var.d.a() ? new b42(v9Var, ms2Var, o73Var) : null;
            if (b42Var != null) {
                b42Var.start();
                by0Var = b42Var;
            }
            this.i = by0Var;
        }
    }

    @Override // yads.zf0
    public final void c() {
        ls2 ls2Var = this.j;
        if (ls2Var != null) {
            this.b.b.remove(ls2Var);
        }
        by0 by0Var = this.i;
        if (by0Var != null) {
            by0Var.invalidate();
        }
    }
}
