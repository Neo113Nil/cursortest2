package defpackage;

/* loaded from: classes13.dex */
public abstract class ia5 extends p95 {
    public final q3u0 x;
    public final hrl0 y;

    public ia5(Class cls, q3u0 q3u0Var, hrl0 hrl0Var) {
        super(cls);
        this.x = q3u0Var;
        this.y = hrl0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public void Bg(l050 l050Var) {
        super.Bg(l050Var);
        this.x.a.add(this);
        hrl0 hrl0Var = this.y;
        if (hrl0Var.d) {
            return;
        }
        hrl0Var.d = true;
        Runnable runnable = hrl0Var.a;
        if (runnable == null || hrl0Var.c) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public void Cg() {
        super.Cg();
        this.x.a.remove(this);
        hrl0 hrl0Var = this.y;
        if (hrl0Var.e) {
            return;
        }
        Runnable runnable = hrl0Var.a;
        if (hrl0Var.d && hrl0Var.c && runnable != null) {
            hrl0Var.c = false;
            runnable.run();
        }
        hrl0Var.e = true;
        Runnable runnable2 = hrl0Var.b;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
