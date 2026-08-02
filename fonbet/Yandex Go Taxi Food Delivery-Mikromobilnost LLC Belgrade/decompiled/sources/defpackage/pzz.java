package defpackage;

import com.bumptech.glide.load.engine.c;

/* loaded from: classes10.dex */
public final class pzz extends v9u implements li10 {
    public c f;

    @Override // defpackage.v9u
    public final int d(Object obj) {
        otj0 otj0Var = (otj0) obj;
        if (otj0Var == null) {
            return 1;
        }
        return otj0Var.getSize();
    }

    @Override // defpackage.v9u
    public final void e(Object obj, Object obj2) {
        otj0 otj0Var = (otj0) obj2;
        c cVar = this.f;
        if (cVar == null || otj0Var == null) {
            return;
        }
        cVar.e.a(otj0Var, true);
    }
}
