package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class grn implements vq90, e35, uix {
    public final String b;
    public final LottieDrawable c;
    public final qud0 d;
    public final i35 e;
    public final xub f;
    public boolean h;
    public final Path a = new Path();
    public final dwd g = new dwd();

    public grn(LottieDrawable lottieDrawable, l35 l35Var, xub xubVar) {
        this.b = xubVar.a;
        this.c = lottieDrawable;
        i35 I = xubVar.c.I();
        this.d = (qud0) I;
        i35 I2 = xubVar.b.I();
        this.e = I2;
        this.f = xubVar;
        l35Var.c(I);
        l35Var.c(I2);
        I.a(this);
        I2.a(this);
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.e35
    public final void d() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a.add(ff11Var);
                    ff11Var.a(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        if (obj == cuz.f) {
            this.d.k(puzVar);
        } else if (obj == cuz.i) {
            this.e.k(puzVar);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.vq90
    public final Path getPath() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        xub xubVar = this.f;
        if (xubVar.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (xubVar.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.a(path);
        this.h = true;
        return path;
    }
}
