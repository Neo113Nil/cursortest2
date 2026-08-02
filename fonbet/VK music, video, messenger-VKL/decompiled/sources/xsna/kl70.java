package xsna;

import java.util.ArrayList;

/* compiled from: NowPresenter.kt */
/* loaded from: classes3.dex */
public final class kl70 implements hl70 {
    public final qh8 b;
    public final il70 c;
    public final gl70 d;
    public final ArrayList e;

    public kl70(qh8 qh8Var, il70 il70Var) {
        this.b = qh8Var;
        this.c = il70Var;
        gl70 gl70Var = new gl70(this);
        this.d = gl70Var;
        new ArrayList();
        this.e = new ArrayList();
        il70Var.setPresenter(this);
        il70Var.setupAdapter(gl70Var);
    }
}
