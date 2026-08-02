package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class n72 implements cg3 {
    public final q62 a;
    public final zi3 b;
    public final fg3 c;
    public final ed3 d;
    public ig3 e;

    public /* synthetic */ n72(Context context, v9 v9Var, ov2 ov2Var, q62 q62Var, nf3 nf3Var, k82 k82Var, jg3 jg3Var, dl3 dl3Var, vg3 vg3Var, zi3 zi3Var) {
        this(context, v9Var, ov2Var, q62Var, nf3Var, k82Var, jg3Var, dl3Var, vg3Var, zi3Var, new fg3(context, ov2Var, jg3Var));
    }

    @Override // yads.cg3
    public final void a(af2 af2Var) {
        this.e = af2Var;
    }

    @Override // yads.cg3
    public final void play() {
        this.d.a();
    }

    @Override // yads.cg3
    public final void stop() {
        ed3 ed3Var = this.d;
        ed3Var.h.a();
        ed3Var.a.pauseAd();
        this.a.a();
    }

    public n72(Context context, v9 v9Var, ov2 ov2Var, q62 q62Var, nf3 nf3Var, k82 k82Var, jg3 jg3Var, dl3 dl3Var, vg3 vg3Var, zi3 zi3Var, fg3 fg3Var) {
        this.a = q62Var;
        this.b = zi3Var;
        this.c = fg3Var;
        ed3 ed3Var = new ed3(context, ov2Var, new s62(q62Var), k82Var, nf3Var, new w72(k82Var), new nh3(), dl3Var, vg3Var, new m72(this), v9Var, true);
        this.d = ed3Var;
        ed3Var.a(jg3Var);
    }
}
