package xsna;

import android.opengl.GLSurfaceView;
import xsna.io40;

/* compiled from: BaseMusicMixAnimationGLView.kt */
/* loaded from: classes3.dex */
public abstract class lh6 extends l2t {
    public static final /* synthetic */ int m = 0;

    /* compiled from: BaseMusicMixAnimationGLView.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final ao40 d;
        public final zn40 e;
        public final eo40 f;
        public final eo40 g;
        public final do40 h;

        public a(float f, float f2, float f3, ao40 ao40Var, zn40 zn40Var, eo40 eo40Var, eo40 eo40Var2, do40 do40Var) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = ao40Var;
            this.e = zn40Var;
            this.f = eo40Var;
            this.g = eo40Var2;
            this.h = do40Var;
        }

        public static a a(a aVar, float f, float f2, float f3, ao40 ao40Var, zn40 zn40Var, eo40 eo40Var, eo40 eo40Var2, do40 do40Var, int i) {
            if ((i & 1) != 0) {
                f = aVar.a;
            }
            float f4 = f;
            if ((i & 2) != 0) {
                f2 = aVar.b;
            }
            float f5 = f2;
            if ((i & 4) != 0) {
                f3 = aVar.c;
            }
            float f6 = f3;
            if ((i & 8) != 0) {
                ao40Var = aVar.d;
            }
            ao40 ao40Var2 = ao40Var;
            if ((i & 16) != 0) {
                zn40Var = aVar.e;
            }
            zn40 zn40Var2 = zn40Var;
            if ((i & 32) != 0) {
                eo40Var = aVar.f;
            }
            eo40 eo40Var3 = eo40Var;
            eo40 eo40Var4 = (i & 64) != 0 ? aVar.g : eo40Var2;
            do40 do40Var2 = (i & 128) != 0 ? aVar.h : do40Var;
            aVar.getClass();
            return new a(f4, f5, f6, ao40Var2, zn40Var2, eo40Var3, eo40Var4, do40Var2);
        }

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
            return "Data(curTiltX=" + this.a + ", curTiltY=" + this.b + ", swipeTransition=" + this.c + ", circle=" + this.d + ", backgroundPalette=" + this.e + ", wavePalette=" + this.f + ", shapePalette=" + this.g + ", shape=" + this.h + ')';
        }
    }

    public static io40.a d(a aVar) {
        float f = aVar.c;
        float f2 = aVar.a;
        float f3 = aVar.b;
        ao40 ao40Var = aVar.d;
        zn40 zn40Var = aVar.e;
        eo40 eo40Var = aVar.f;
        eo40 eo40Var2 = aVar.g;
        do40 do40Var = aVar.h;
        io40.a aVar2 = new io40.a();
        aVar2.a = f;
        aVar2.b = f2;
        aVar2.c = f3;
        aVar2.d = ao40Var;
        aVar2.e = zn40Var;
        aVar2.f = eo40Var;
        aVar2.g = eo40Var2;
        aVar2.h = do40Var;
        return aVar2;
    }

    @Override // xsna.l2t, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    @Override // xsna.l2t
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        setRenderMode(0);
    }
}
