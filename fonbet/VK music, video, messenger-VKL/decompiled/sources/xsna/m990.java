package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import xsna.drz;
import xsna.frz;

/* compiled from: PageLoader.kt */
/* loaded from: classes3.dex */
public final class m990<Data extends frz, Offset> implements drz<Data> {
    public final g4u0 a;
    public final l370 b;
    public final Integer c;
    public final io.reactivex.rxjava3.core.w d;
    public final pa2 e;
    public final io.reactivex.rxjava3.subjects.h f;
    public Offset g;
    public final AtomicBoolean h;
    public io.reactivex.rxjava3.disposables.c i;

    /* JADX WARN: Type inference failed for: r1v0, types: [Offset, java.lang.Integer] */
    public m990(g4u0 g4u0Var, l370 l370Var) {
        ?? r1 = (Offset) 0;
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        pa2 pa2Var = new pa2("SimplePageLoader");
        this.a = g4u0Var;
        this.b = l370Var;
        this.c = r1;
        this.d = c;
        this.e = pa2Var;
        this.f = io.reactivex.rxjava3.subjects.d.N0().M0();
        this.g = r1;
        this.h = new AtomicBoolean(false);
    }

    @Override // xsna.drz
    public final void a(int i) {
        Offset offset = this.g;
        if (this.h.compareAndSet(false, true)) {
            io.reactivex.rxjava3.core.x b = this.a.b(0, "unknown", offset);
            io.reactivex.rxjava3.core.w wVar = this.d;
            this.i = new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.o(b.q(wVar).m(wVar), new b8v(new kn20(this, 15), 12)), new a2b(this, 3)).subscribe(new j990(new hs00(this, 15), 0), new cc20(new mz80(1, this, offset), 12));
        }
    }

    @Override // xsna.drz
    public final void b(String str) {
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
        this.g = (Offset) this.c;
        this.h.set(false);
        a(0);
    }

    @Override // xsna.drz
    public final io.reactivex.rxjava3.core.q<drz.a<Data>> getState() {
        return this.f.U(new z250(new k990(0), 2));
    }

    @Override // xsna.drz
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
    }
}
