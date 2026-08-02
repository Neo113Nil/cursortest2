package defpackage;

import com.yandex.mapkit.Animation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class oe61 {
    public final ah00 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public oe61(ah00 ah00Var) {
        this.a = ah00Var;
    }

    public final void a(ne61 ne61Var) {
        if (jl40.l(ne61Var, je61.a)) {
            b(1.0f, true);
            return;
        }
        if (jl40.l(ne61Var, le61.a)) {
            b(-1.0f, true);
            return;
        }
        if (jl40.l(ne61Var, ke61.a)) {
            b(0.8f, false);
        } else if (jl40.l(ne61Var, me61.a)) {
            b(-0.8f, false);
        } else {
            w511.b();
        }
    }

    public final void b(float f, boolean z) {
        gh00 gh00Var = (gh00) this.a;
        float j = gh00Var.j() + f;
        if (gh00Var.k().b(Float.valueOf(j))) {
            gh00Var.g.f(j, new Animation(z ? Animation.Type.SMOOTH : Animation.Type.LINEAR, 0.2f));
            this.b.g(zy11.a);
        }
    }
}
