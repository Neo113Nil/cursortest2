package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsScrollBehaviorAdapter.kt */
/* loaded from: classes17.dex */
public final class q2f {
    public final r2f a;
    public final f4o0 b;
    public final u5f0 c;
    public q8e d;
    public int e = -1;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new ic(this, 25));

    public q2f(r2f r2fVar, f4o0 f4o0Var, u5f0 u5f0Var) {
        this.a = r2fVar;
        this.b = f4o0Var;
        this.c = u5f0Var;
    }

    public final void a() {
        o0f attachedPlayer;
        r2f r2fVar = this.a;
        if (r2fVar.h) {
            return;
        }
        r2fVar.h = true;
        r2fVar.a().removeCallbacks(r2fVar.g);
        t1b0 t1b0Var = r2fVar.e;
        if (t1b0Var != null && (attachedPlayer = t1b0Var.getAttachedPlayer()) != null) {
            attachedPlayer.pause();
        }
        r2fVar.e = null;
        ef2 ef2Var = r2fVar.f;
        if (ef2Var != null) {
            r2fVar.a().removeCallbacks(ef2Var);
        }
        r2fVar.f = null;
    }
}
