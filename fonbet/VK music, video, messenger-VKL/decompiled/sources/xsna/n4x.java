package xsna;

import android.os.Build;
import android.view.View;
import java.util.List;
import xsna.aqx0;
import xsna.bqx0;

/* compiled from: WindowInsets.android.kt */
/* loaded from: classes11.dex */
public final class n4x extends aqx0.b implements Runnable, u080, View.OnAttachStateChangeListener {
    public final yqx0 d;
    public boolean e;
    public boolean f;
    public bqx0 g;

    public n4x(yqx0 yqx0Var) {
        super(!yqx0Var.t ? 1 : 0);
        this.d = yqx0Var;
    }

    @Override // xsna.aqx0.b
    public final void a(aqx0 aqx0Var) {
        this.e = false;
        this.f = false;
        bqx0 bqx0Var = this.g;
        if (aqx0Var.a.b() > 0 && bqx0Var != null) {
            bqx0.q qVar = bqx0Var.a;
            yqx0 yqx0Var = this.d;
            yqx0Var.s.f(drx0.a(qVar.i(8)));
            yqx0Var.r.f(drx0.a(qVar.i(8)));
            yqx0.b(yqx0Var, bqx0Var);
        }
        this.g = null;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        this.g = bqx0Var;
        yqx0 yqx0Var = this.d;
        yjr0 yjr0Var = yqx0Var.r;
        bqx0.q qVar = bqx0Var.a;
        yjr0Var.f(drx0.a(qVar.i(8)));
        if (this.e) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f) {
            yqx0Var.s.f(drx0.a(qVar.i(8)));
            yqx0.b(yqx0Var, bqx0Var);
        }
        return yqx0Var.t ? bqx0.b : bqx0Var;
    }

    @Override // xsna.aqx0.b
    public final void c(aqx0 aqx0Var) {
        this.e = true;
        this.f = true;
    }

    @Override // xsna.aqx0.b
    public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
        yqx0 yqx0Var = this.d;
        yqx0.b(yqx0Var, bqx0Var);
        return yqx0Var.t ? bqx0.b : bqx0Var;
    }

    @Override // xsna.aqx0.b
    public final aqx0.a e(aqx0 aqx0Var, aqx0.a aVar) {
        this.e = false;
        return aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e) {
            this.e = false;
            this.f = false;
            bqx0 bqx0Var = this.g;
            if (bqx0Var != null) {
                yqx0 yqx0Var = this.d;
                yqx0Var.s.f(drx0.a(bqx0Var.a.i(8)));
                yqx0.b(yqx0Var, bqx0Var);
                this.g = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
