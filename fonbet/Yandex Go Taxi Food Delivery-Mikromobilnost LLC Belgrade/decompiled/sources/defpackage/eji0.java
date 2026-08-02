package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class eji0 implements e35, uix, vq90 {
    public final String c;
    public final boolean d;
    public final LottieDrawable e;
    public final i35 f;
    public final i35 g;
    public final kor h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final dwd i = new dwd();
    public i35 j = null;

    public eji0(LottieDrawable lottieDrawable, l35 l35Var, fji0 fji0Var) {
        this.c = fji0Var.a;
        this.d = fji0Var.e;
        this.e = lottieDrawable;
        i35 I = fji0Var.b.I();
        this.f = I;
        i35 I2 = fji0Var.c.I();
        this.g = I2;
        kor I3 = fji0Var.d.I();
        this.h = I3;
        l35Var.c(I);
        l35Var.c(I2);
        l35Var.c(I3);
        I.a(this);
        I2.a(this);
        I3.a(this);
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.e35
    public final void d() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            uee ueeVar = (uee) arrayList.get(i);
            if (ueeVar instanceof ff11) {
                ff11 ff11Var = (ff11) ueeVar;
                if (ff11Var.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    this.i.a.add(ff11Var);
                    ff11Var.a(this);
                    i++;
                }
            }
            if (ueeVar instanceof fyk0) {
                this.j = ((fyk0) ueeVar).b;
            }
            i++;
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        if (obj == cuz.g) {
            this.g.k(puzVar);
        } else if (obj == cuz.i) {
            this.f.k(puzVar);
        } else if (obj == cuz.h) {
            this.h.k(puzVar);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.vq90
    public final Path getPath() {
        float f;
        i35 i35Var;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.f();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        kor korVar = this.h;
        float m = korVar == null ? 0.0f : korVar.m();
        if (m == 0.0f && (i35Var = this.j) != null) {
            m = Math.min(((Float) i35Var.f()).floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (m > min) {
            m = min;
        }
        PointF pointF2 = (PointF) this.f.f();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + m);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - m);
        RectF rectF = this.b;
        if (m > 0.0f) {
            float f4 = pointF2.x + f2;
            float f5 = m * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + m, pointF2.y + f3);
        if (m > 0.0f) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = m * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + m);
        if (m > 0.0f) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = m * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - m, pointF2.y - f3);
        if (m > 0.0f) {
            float f13 = pointF2.x + f2;
            float f14 = m * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.a(path);
        this.k = true;
        return path;
    }
}
