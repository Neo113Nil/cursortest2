package xsna;

import android.opengl.GLES20;
import android.util.Size;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.k2t;

/* compiled from: MusicMixTextureSource.kt */
/* loaded from: classes3.dex */
public final class io40 extends k2t {
    public volatile a e;
    public volatile a f;
    public volatile Float g;
    public volatile Float h;
    public final bpn0 i;

    /* compiled from: MusicMixTextureSource.kt */
    public static final class a {
        public float a;
        public float b;
        public float c;
        public ao40 d;
        public zn40 e;
        public eo40 f;
        public eo40 g;
        public do40 h;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Data(swipeTransition=" + this.a + ", curTiltX=" + this.b + ", curTiltY=" + this.c + ", circle=" + this.d + ", backgroundPalette=" + this.e + ", wavePalette=" + this.f + ", shapePalette=" + this.g + ", shape=" + this.h + ')';
        }
    }

    /* compiled from: MusicMixTextureSource.kt */
    public static final class b implements k2t.a {
        public final utk0 a;
        public final ttk0<Float> b;
        public final h6 c;
        public final we0 d;

        public b(utk0 utk0Var, utk0 utk0Var2, h6 h6Var, we0 we0Var) {
            this.a = utk0Var;
            this.b = utk0Var2;
            this.c = h6Var;
            this.d = we0Var;
        }

        @Override // xsna.k2t.a
        public final k2t a(Size size) {
            return new io40(size, this.c, this.d, this.a, this.b);
        }
    }

    public io40(Size size, h6 h6Var, we0 we0Var, utk0 utk0Var, ttk0 ttk0Var) {
        super(size, we0Var);
        this.i = new bpn0(new ss3(16, we0Var, this));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(utk0Var, new go40(this, null)), (androidx.lifecycle.j) h6Var.c);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(ttk0Var, new ho40(this, null)), (androidx.lifecycle.j) h6Var.c);
        this.f = (a) utk0Var.getValue();
        this.h = (Float) ttk0Var.getValue();
    }

    @Override // xsna.k2t
    public final boolean b(int i, boolean z) {
        GLES20.glBindFramebuffer(36160, this.c.a);
        GLES20.glViewport(0, 0, this.a.getWidth(), this.a.getHeight());
        a aVar = this.f;
        boolean z2 = true;
        if (aVar != null) {
            this.e = aVar;
            this.f = null;
            z = true;
        }
        Float f = this.h;
        if (f != null) {
            this.g = Float.valueOf(f.floatValue());
            this.h = null;
        } else {
            z2 = z;
        }
        if (z2) {
            ((co40) this.i.getValue()).a = i;
            ((co40) this.i.getValue()).L = this.e;
            ((co40) this.i.getValue()).M = this.g;
            ((co40) this.i.getValue()).b(this.a);
        }
        return z2;
    }
}
