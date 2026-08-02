package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: Retained.kt */
/* loaded from: classes3.dex */
public final class peg0 implements huf0 {
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ seg0<Object> d;
    public final /* synthetic */ String e;
    public final /* synthetic */ f5z f;

    public peg0(Object obj, seg0<Object> seg0Var, String str, f5z f5zVar) {
        this.c = obj;
        this.d = seg0Var;
        this.e = str;
        this.f = f5zVar;
        this.b = obj;
    }

    @Override // xsna.huf0
    public final void d() {
        f();
    }

    @Override // xsna.huf0
    public final void e() {
        this.d.d.put(this.e, this.c);
    }

    @Override // xsna.huf0
    public final void f() {
        uic uicVar;
        if (this.f.getLifecycle().getCurrentState() != Lifecycle.State.RESUMED || (uicVar = (uic) this.d.c.remove(this.e)) == null) {
            return;
        }
        uicVar.clear();
    }
}
