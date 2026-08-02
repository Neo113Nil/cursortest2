package xsna;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: RectangleContent.java */
/* loaded from: classes12.dex */
public final class mif0 implements tf6.a, wdy, gq90 {
    public final String c;
    public final boolean d;
    public final k800 e;
    public final tf6<?, PointF> f;
    public final tf6<?, PointF> g;
    public final hqr h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final op5 i = new op5(1, false);

    @Nullable
    public tf6<Float, Float> j = null;

    public mif0(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, nif0 nif0Var) {
        this.c = nif0Var.a;
        this.d = nif0Var.e;
        this.e = k800Var;
        tf6<PointF, PointF> j = nif0Var.b.j();
        this.f = j;
        tf6<PointF, PointF> j2 = nif0Var.c.j();
        this.g = j2;
        hqr j3 = nif0Var.d.j();
        this.h = j3;
        aVar.h(j);
        aVar.h(j2);
        aVar.h(j3);
        j.a(this);
        j2.a(this);
        j3.a(this);
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
                    ((ArrayList) this.i.b).add(arp0Var);
                    arp0Var.d(this);
                    i++;
                }
            }
            if (gfjVar instanceof zog0) {
                this.j = ((zog0) gfjVar).b;
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
        if (t == t800.g) {
            this.g.k(a900Var);
        } else if (t == t800.i) {
            this.f.k(a900Var);
        } else if (t == t800.h) {
            this.h.k(a900Var);
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.c;
    }

    @Override // xsna.gq90
    public final Path getPath() {
        float f;
        tf6<Float, Float> tf6Var;
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
        PointF f2 = this.g.f();
        float f3 = f2.x / 2.0f;
        float f4 = f2.y / 2.0f;
        hqr hqrVar = this.h;
        float m = hqrVar == null ? 0.0f : hqrVar.m();
        if (m == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (tf6Var = this.j) != null) {
            m = Math.min(tf6Var.f().floatValue(), Math.min(f3, f4));
        }
        float min = Math.min(f3, f4);
        if (m > min) {
            m = min;
        }
        PointF f5 = this.f.f();
        path.moveTo(f5.x + f3, (f5.y - f4) + m);
        path.lineTo(f5.x + f3, (f5.y + f4) - m);
        RectF rectF = this.b;
        if (m > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f6 = f5.x + f3;
            float f7 = m * 2.0f;
            f = 2.0f;
            float f8 = f5.y + f4;
            rectF.set(f6 - f7, f8 - f7, f6, f8);
            path.arcTo(rectF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((f5.x - f3) + m, f5.y + f4);
        if (m > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f9 = f5.x - f3;
            float f10 = f5.y + f4;
            float f11 = m * f;
            rectF.set(f9, f10 - f11, f11 + f9, f10);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f5.x - f3, (f5.y - f4) + m);
        if (m > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f12 = f5.x - f3;
            float f13 = f5.y - f4;
            float f14 = m * f;
            rectF.set(f12, f13, f12 + f14, f14 + f13);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f5.x + f3) - m, f5.y - f4);
        if (m > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f15 = f5.x + f3;
            float f16 = m * f;
            float f17 = f5.y - f4;
            rectF.set(f15 - f16, f17, f15, f16 + f17);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.c(path);
        this.k = true;
        return path;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.k = false;
        this.e.invalidateSelf();
    }
}
