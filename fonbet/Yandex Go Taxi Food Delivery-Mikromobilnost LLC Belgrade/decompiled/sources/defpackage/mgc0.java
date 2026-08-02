package defpackage;

import android.content.Context;
import com.yandex.go.places.api.map.b;
import com.yandex.go.places.impl.ui.common.map.location.a;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes13.dex */
public final class mgc0 implements ugf {
    public final /* synthetic */ int a;
    public final Context b;
    public final xm00 c;
    public final tse d;
    public final a e;
    public final pwy0 f;
    public final i3y g;
    public final vub h;
    public b i;

    public mgc0(Context context, xm00 xm00Var, tse tseVar, a aVar, pwy0 pwy0Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context;
                this.c = xm00Var;
                this.d = tseVar;
                this.e = aVar;
                this.f = pwy0Var;
                this.g = kotlin.a.b(LazyThreadSafetyMode.NONE, new ec31(12, this));
                Circle circle = new Circle(new Point(0.0d, 0.0d), 0.0f);
                xm00Var.getClass();
                vub vubVar = new vub(circle);
                vubVar.b(xm00Var);
                vubVar.p(2.0f);
                vubVar.u(context.getColor(pqg0.current_location_stroke));
                vubVar.r(context.getColor(mqg0.transparent));
                vubVar.l = true;
                vubVar.t(vubVar.g, true);
                this.h = vubVar;
                break;
            default:
                this.b = context;
                this.c = xm00Var;
                this.d = tseVar;
                this.e = aVar;
                this.f = pwy0Var;
                Circle circle2 = new Circle(new Point(0.0d, 0.0d), 0.0f);
                xm00Var.getClass();
                vub vubVar2 = new vub(circle2);
                vubVar2.b(xm00Var);
                vubVar2.p(2.0f);
                vubVar2.u(context.getColor(xog0.current_location_stroke));
                vubVar2.r(context.getColor(mqg0.transparent));
                vubVar2.l = true;
                vubVar2.t(vubVar2.g, true);
                this.h = vubVar2;
                this.g = kotlin.a.b(LazyThreadSafetyMode.NONE, new t9b0(27, this));
                break;
        }
    }

    private final void d(boolean z) {
    }

    private final void e(boolean z) {
    }

    private final void f(boolean z) {
    }

    private final void g(boolean z) {
    }

    @Override // defpackage.ugf
    public final float a() {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                c();
                break;
        }
        return 0.0f;
    }

    public vr21 b() {
        b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this.b, this.c, this.e, this.d, this.f, (ImageProvider) this.g.getValue());
        this.i = bVar2;
        return bVar2;
    }

    public vr21 c() {
        b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this.b, this.c, this.e, this.d, this.f, (ImageProvider) this.g.getValue());
        this.i = bVar2;
        return bVar2;
    }

    @Override // defpackage.ugf
    public final Point getGeometry() {
        switch (this.a) {
            case 0:
                return (Point) ((b) b()).z.h;
            default:
                return (Point) ((b) c()).z.h;
        }
    }

    @Override // defpackage.ugf
    public final float getZIndex() {
        switch (this.a) {
            case 0:
                return ((b) b()).z.c;
            default:
                return ((b) c()).z.c;
        }
    }

    @Override // defpackage.ugf
    public final void s0() {
        int i = this.a;
        vub vubVar = this.h;
        switch (i) {
            case 0:
                vubVar.d();
                b bVar = this.i;
                if (bVar != null) {
                    bVar.s0();
                    break;
                }
                break;
            default:
                vubVar.d();
                b bVar2 = this.i;
                if (bVar2 != null) {
                    bVar2.s0();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ugf
    public final void setVisible(boolean z) {
        int i = this.a;
        vub vubVar = this.h;
        switch (i) {
            case 0:
                ((b) b()).f6(z);
                ((b) b()).w9(z);
                vubVar.i(z);
                break;
            default:
                ((b) c()).f6(z);
                ((b) c()).w9(z);
                vubVar.i(z);
                break;
        }
    }

    @Override // defpackage.ugf
    public final void t0(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.ugf
    public final g18 u0(oxf0 oxf0Var) {
        int i = this.a;
        return g18.u1;
    }

    @Override // defpackage.ugf
    public final void updateAzimuth(float f) {
        switch (this.a) {
            case 0:
                if (((b) b()).z.b) {
                    ((b) b()).ob(f);
                    ((b) b()).w9(true);
                    break;
                }
                break;
            default:
                if (((b) c()).z.b) {
                    ((b) c()).ob(f);
                    ((b) c()).w9(true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ugf
    public final boolean v0() {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.ugf
    public final void w0(Point point, float f) {
        int i = this.a;
        vub vubVar = this.h;
        switch (i) {
            case 0:
                ((b) b()).setGeometry(point);
                vubVar.o(new Circle(point, f));
                ((b) b()).kc(point);
                if (vubVar.b) {
                    ((b) b()).f6(true);
                    break;
                }
                break;
            default:
                ((b) c()).setGeometry(point);
                vubVar.o(new Circle(point, f));
                ((b) c()).kc(point);
                if (vubVar.b) {
                    ((b) c()).f6(true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ugf
    public final void x0(ro21 ro21Var) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                ((b) b()).gg(context, ro21Var);
                break;
            default:
                ((b) c()).gg(context, ro21Var);
                break;
        }
    }

    @Override // defpackage.ugf
    public final void y0(ro21 ro21Var, ro21 ro21Var2) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                ((b) b()).gg(context, ro21Var);
                break;
            default:
                ((b) c()).gg(context, ro21Var);
                break;
        }
    }

    @Override // defpackage.ugf
    public final void z0(boolean z) {
        int i = this.a;
    }
}
