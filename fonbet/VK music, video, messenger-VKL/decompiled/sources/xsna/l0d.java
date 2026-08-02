package xsna;

import android.app.Activity;

/* compiled from: ClipItemClickableStickersClickDelegate.kt */
/* loaded from: classes17.dex */
public final class l0d {
    public final o1d a;
    public final yjc b;
    public xjc c;
    public a d;

    /* compiled from: ClipItemClickableStickersClickDelegate.kt */
    public static final class a implements y5p0 {
        public final o1d b;
        public final yg5 c;
        public boolean d;

        public a(o1d o1dVar, yg5 yg5Var) {
            this.b = o1dVar;
            this.c = yg5Var;
        }

        @Override // xsna.y5p0
        public final Activity N0() {
            return g2u0.c(this.b);
        }

        @Override // xsna.y5p0
        public final void r() {
            if (this.d) {
                this.c.play();
            }
        }

        @Override // xsna.y5p0
        public final void s0() {
            yg5 yg5Var = this.c;
            this.d = (yg5Var.d() || yg5Var.isPlaying()) && !yg5Var.J();
            yg5Var.pause();
        }
    }

    public l0d(o1d o1dVar, yjc yjcVar) {
        this.a = o1dVar;
        this.b = yjcVar;
    }
}
