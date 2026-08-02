package xsna;

import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;

/* compiled from: GestureTransitionListener.kt */
/* loaded from: classes7.dex */
public final class tot implements bb30 {
    public final gzs<TouchActionInfo> b;
    public TouchActionInfo c;
    public nb30 d;

    public tot(gzs<TouchActionInfo> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.bb30
    public final void a(nb30 nb30Var) {
        TouchActionInfo touchActionInfo;
        izs<nb30, s3q0> izsVar;
        if (this.c != null && !epx.f(this.d, nb30Var) && (touchActionInfo = this.c) != null && (izsVar = touchActionInfo.i) != null) {
            izsVar.invoke(nb30Var);
        }
        this.d = null;
        this.c = null;
    }

    @Override // xsna.bb30
    public final void b(nb30 nb30Var, nb30 nb30Var2) {
        this.c = this.b.invoke();
    }

    @Override // xsna.bb30
    public final void c(nb30 nb30Var, nb30 nb30Var2, float f) {
        if (this.c != null && this.d == null) {
            if (f > 0.5f) {
                nb30Var = nb30Var2;
            }
            this.d = nb30Var;
        }
    }

    @Override // xsna.bb30
    public final void d(nb30 nb30Var, nb30 nb30Var2) {
    }
}
