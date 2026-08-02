package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import xsna.om10;

/* compiled from: MaterialProgressDrawable.java */
/* loaded from: classes17.dex */
public final class mm10 extends Animation {
    public final /* synthetic */ om10.b b;
    public final /* synthetic */ om10 c;

    public mm10(om10 om10Var, om10.b bVar) {
        this.c = om10Var;
        this.b = bVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        om10 om10Var = this.c;
        boolean z = om10Var.k;
        om10.b bVar = this.b;
        if (z) {
            om10.b(f, bVar);
            float floor = (float) (Math.floor(bVar.n / 0.8f) + 1.0d);
            float radians = (float) Math.toRadians(bVar.h / (bVar.r * 6.283185307179586d));
            float f2 = bVar.l;
            bVar.e = (((bVar.m - radians) - f2) * f) + f2;
            bVar.a();
            bVar.f = bVar.m;
            bVar.a();
            float f3 = bVar.n;
            bVar.g = u11.b(floor, f3, f, f3);
            bVar.a();
            return;
        }
        float radians2 = (float) Math.toRadians(bVar.h / (bVar.r * 6.283185307179586d));
        float f4 = bVar.m;
        float f5 = bVar.l;
        float f6 = bVar.n;
        om10.b(f, bVar);
        if (f <= 0.5f) {
            bVar.e = (om10.m.getInterpolation(f / 0.5f) * (0.8f - radians2)) + f5;
            bVar.a();
        }
        if (f > 0.5f) {
            bVar.f = (om10.m.getInterpolation((f - 0.5f) / 0.5f) * (0.8f - radians2)) + f4;
            bVar.a();
        }
        bVar.g = (0.25f * f) + f6;
        bVar.a();
        om10Var.d = io.reactivex.rxjava3.internal.operators.observable.n0.b(om10Var.h, 5.0f, 1080.0f, f * 216.0f);
        om10Var.invalidateSelf();
    }
}
