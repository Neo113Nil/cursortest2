package yads;

import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class fi3 implements fv {
    public final g82 a;
    public final b20 b;

    public fi3(g82 g82Var, b20 b20Var) {
        this.a = g82Var;
        this.b = b20Var;
    }

    @Override // yads.fv
    public final void a(jg1 jg1Var, hv hvVar) {
        ou ouVar = new ou(this.a.getContext(), new ei3(jg1Var, hvVar, this.b));
        g82 g82Var = this.a;
        g82Var.setOnTouchListener(ouVar);
        g82Var.setOnClickListener(ouVar);
        ImageView imageView = this.a.a.b;
        if (imageView != null) {
            imageView.setOnTouchListener(ouVar);
            imageView.setOnClickListener(ouVar);
        }
    }
}
