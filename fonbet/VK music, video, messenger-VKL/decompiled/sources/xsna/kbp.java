package xsna;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: EllipseContent.java */
/* loaded from: classes12.dex */
public final class kbp implements gq90, tf6.a, wdy {
    public final String b;
    public final k800 c;
    public final llb0 d;
    public final tf6<?, PointF> e;
    public final adc f;
    public boolean h;
    public final Path a = new Path();
    public final op5 g = new op5(1, false);

    public kbp(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, adc adcVar) {
        this.b = adcVar.a;
        this.c = k800Var;
        tf6<?, ?> j = adcVar.c.j();
        this.d = (llb0) j;
        tf6<PointF, PointF> j2 = adcVar.b.j();
        this.e = j2;
        this.f = adcVar;
        aVar.h(j);
        aVar.h(j2);
        j.a(this);
        j2.a(this);
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            gfj gfjVar = (gfj) arrayList.get(i);
            if (gfjVar instanceof arp0) {
                arp0 arp0Var = (arp0) gfjVar;
                if (arp0Var.c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    ((ArrayList) this.g.b).add(arp0Var);
                    arp0Var.d(this);
                }
            }
            i++;
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
    }

    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        if (t == t800.f) {
            this.d.k(a900Var);
        } else if (t == t800.i) {
            this.e.k(a900Var);
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.b;
    }

    @Override // xsna.gq90
    public final Path getPath() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        adc adcVar = this.f;
        if (adcVar.e) {
            this.h = true;
            return path;
        }
        PointF f = this.d.f();
        float f2 = f.x / 2.0f;
        float f3 = f.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = f3 * 0.55228f;
        path.reset();
        if (adcVar.d) {
            float f6 = -f3;
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6);
            float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            float f8 = -f2;
            float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f5;
            path.cubicTo(f7, f6, f8, f9, f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f10 = f5 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f8, f10, f7, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
            float f11 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f11, f3, f2, f10, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(f2, f9, f11, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6);
        } else {
            float f12 = -f3;
            path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12);
            float f13 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f5;
            path.cubicTo(f13, f12, f2, f14, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f15 = f5 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path.cubicTo(f2, f15, f13, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
            float f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            float f17 = -f2;
            path.cubicTo(f16, f3, f17, f15, f17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo(f17, f14, f16, f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12);
        }
        PointF f18 = this.e.f();
        path.offset(f18.x, f18.y);
        path.close();
        this.g.c(path);
        this.h = true;
        return path;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.h = false;
        this.c.invalidateSelf();
    }
}
