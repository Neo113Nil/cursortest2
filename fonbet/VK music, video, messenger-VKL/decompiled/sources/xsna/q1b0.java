package xsna;

import android.view.View;
import one.video.controls20.SimpleControlsView;

/* compiled from: PlayerGesturesDelegateFactory.kt */
/* loaded from: classes3.dex */
public abstract class q1b0 {
    public final gzs<s3q0> a;
    public final gzs<s3q0> b;

    /* compiled from: PlayerGesturesDelegateFactory.kt */
    public static final class a extends q1b0 {
        public final View c;
        public final h6m0 d;
        public final qqt0 e;

        public a(SimpleControlsView simpleControlsView, h6m0 h6m0Var, qqt0 qqt0Var) {
            super(h6m0Var, qqt0Var);
            this.c = simpleControlsView;
            this.d = h6m0Var;
            this.e = qqt0Var;
        }

        @Override // xsna.q1b0
        public final gzs<s3q0> a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Video2Params(controlsView=" + this.c + ", toggleFullscreen=" + this.d + ", onPlayerClicked=" + this.e + ')';
        }
    }

    /* compiled from: PlayerGesturesDelegateFactory.kt */
    public static final class b extends q1b0 {
        public final hgs0 c;
        public final rrn0 d;
        public final f7m e;
        public final kcj0 f;
        public final l6n0 g;

        public b(hgs0 hgs0Var, rrn0 rrn0Var, f7m f7mVar, kcj0 kcj0Var, l6n0 l6n0Var) {
            super(kcj0Var, l6n0Var);
            this.c = hgs0Var;
            this.d = rrn0Var;
            this.e = f7mVar;
            this.f = kcj0Var;
            this.g = l6n0Var;
        }

        @Override // xsna.q1b0
        public final gzs<s3q0> a() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.c.equals(bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.g.equals(bVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "VideoParams(videoView=" + this.c + ", isControlsVisible=" + this.d + ", setControlsVisibility=" + this.e + ", toggleFullscreen=" + this.f + ", onPlayerClicked=" + this.g + ')';
        }
    }

    public q1b0(gzs gzsVar, gzs gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public abstract gzs<s3q0> a();
}
