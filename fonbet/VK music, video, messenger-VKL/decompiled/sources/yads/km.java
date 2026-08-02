package yads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class km extends sn2 {
    public final wc1 C;
    public final jm D;
    public final pi3 E;
    public final mm F;
    public final lm G;
    public final j22 H;
    public final si0 I;
    public um J;
    public um K;

    public km(Context context, wc1 wc1Var, jm jmVar, w5 w5Var, pi3 pi3Var, mm mmVar, lm lmVar, j22 j22Var, si0 si0Var) {
        super(context, wc1Var, w5Var);
        this.C = wc1Var;
        this.D = jmVar;
        this.E = pi3Var;
        this.F = mmVar;
        this.G = lmVar;
        this.H = j22Var;
        this.I = si0Var;
        a(wc1Var);
        jmVar.a(j22Var);
    }

    public static void a(wc1 wc1Var) {
        wc1Var.setHorizontalScrollBarEnabled(false);
        wc1Var.setVerticalScrollBarEnabled(false);
        wc1Var.setVisibility(8);
        wc1Var.setBackgroundColor(0);
    }

    @Override // yads.sn2, yads.zn
    public final void c() {
        super.c();
        jm jmVar = this.D;
        jmVar.c = null;
        jmVar.b.a(null);
        ql3.a(this.C, true);
        this.C.setVisibility(8);
        om3.a((ViewGroup) this.C);
    }

    @Override // yads.zn
    public final void d() {
        um[] umVarArr = {this.J, this.K};
        for (int i = 0; i < 2; i++) {
            um umVar = umVarArr[i];
            if (umVar != null) {
                umVar.a(this.a);
            }
        }
        super.d();
    }

    @Override // yads.zn
    public final void l() {
        super.l();
        um umVar = this.J;
        if (umVar != this.K) {
            um umVar2 = new um[]{umVar}[0];
            if (umVar2 != null) {
                umVar2.a(this.a);
            }
            this.J = this.K;
        }
        e13 e13Var = this.c.d.a;
        if (d13.d != (e13Var != null ? e13Var.b() : null) || this.C.getLayoutParams() == null) {
            return;
        }
        this.C.getLayoutParams().height = -2;
    }

    public final wc1 r() {
        return this.C;
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        vm vw2Var;
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.b.a(v5.s);
            this.v = v9Var;
        }
        this.H.d = v9Var;
        lm lmVar = this.G;
        lmVar.getClass();
        ir1 ir1Var = v9Var.q;
        if (ir1Var != null) {
            vw2Var = new bq1(v9Var, ir1Var);
        } else {
            vw2Var = new vw2(lmVar.a);
        }
        um a = vw2Var.a(this);
        this.K = a;
        a.a(this.a, v9Var);
    }
}
