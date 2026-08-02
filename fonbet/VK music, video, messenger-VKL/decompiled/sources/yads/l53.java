package yads;

import java.io.UnsupportedEncodingException;

/* loaded from: classes10.dex */
public final class l53 extends qp2 {
    public final Object s;
    public vq2 t;

    public l53(String str, vq2 vq2Var, uq2 uq2Var) {
        super(0, str, uq2Var);
        this.s = new Object();
        this.t = vq2Var;
    }

    @Override // yads.qp2
    public final void a() {
        super.a();
        synchronized (this.s) {
            this.t = null;
        }
    }

    @Override // yads.qp2
    public final void a(Object obj) {
        vq2 vq2Var;
        String str = (String) obj;
        synchronized (this.s) {
            vq2Var = this.t;
        }
        if (vq2Var != null) {
            vq2Var.a(str);
        }
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        String str;
        try {
            str = new String(g92Var.b, x11.a(g92Var.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(g92Var.b);
        }
        return new wq2(str, x11.a(g92Var));
    }
}
