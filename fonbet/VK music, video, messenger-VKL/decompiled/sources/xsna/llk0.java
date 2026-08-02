package xsna;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import xsna.tf6;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class llk0 extends tf6<PointF, PointF> {
    public final PointF i;
    public final PointF j;
    public final hqr k;
    public final hqr l;

    @Nullable
    public a900<Float> m;

    @Nullable
    public a900<Float> n;

    public llk0(hqr hqrVar, hqr hqrVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = hqrVar;
        this.l = hqrVar2;
        j(this.d);
    }

    @Override // xsna.tf6
    public final PointF f() {
        return m();
    }

    @Override // xsna.tf6
    public final /* bridge */ /* synthetic */ PointF g(nhy<PointF> nhyVar, float f) {
        return m();
    }

    @Override // xsna.tf6
    public final void j(float f) {
        hqr hqrVar = this.k;
        hqrVar.j(f);
        hqr hqrVar2 = this.l;
        hqrVar2.j(f);
        this.i.set(hqrVar.f().floatValue(), hqrVar2.f().floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((tf6.a) arrayList.get(i)).i();
            i++;
        }
    }

    public final PointF m() {
        Float f;
        hqr hqrVar;
        nhy<Float> b;
        hqr hqrVar2;
        nhy<Float> b2;
        Float f2 = null;
        if (this.m == null || (b2 = (hqrVar2 = this.k).b()) == null) {
            f = null;
        } else {
            Float f3 = b2.h;
            a900<Float> a900Var = this.m;
            float f4 = b2.g;
            f = a900Var.b(f4, f3 == null ? f4 : f3.floatValue(), b2.b, b2.c, hqrVar2.d(), hqrVar2.e(), hqrVar2.d);
        }
        if (this.n != null && (b = (hqrVar = this.l).b()) != null) {
            Float f5 = b.h;
            a900<Float> a900Var2 = this.n;
            float f6 = b.g;
            f2 = a900Var2.b(f6, f5 == null ? f6 : f5.floatValue(), b.b, b.c, hqrVar.d(), hqrVar.e(), hqrVar.d);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f == null) {
            pointF2.set(pointF.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            pointF2.set(f.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (f2 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f2.floatValue());
        return pointF2;
    }
}
