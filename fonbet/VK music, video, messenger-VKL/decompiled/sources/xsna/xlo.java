package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: DrawingStateExt.kt */
/* loaded from: classes4.dex */
public final class xlo {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final xqo0 b;
    public static final xqo0 c;
    public static final xqo0 d;
    public static final xqo0 e;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(xlo.class, "reusablePoints", "getReusablePoints()Lcom/vk/photo/editor/domain/media/RectPoints;");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl, new PropertyReference0Impl(xlo.class, "reusableSrcRect", "getReusableSrcRect()Landroid/graphics/RectF;"), new PropertyReference0Impl(xlo.class, "reusableDstRect", "getReusableDstRect()Landroid/graphics/RectF;"), new PropertyReference0Impl(xlo.class, "reusableMatrix", "getReusableMatrix()Landroid/graphics/Matrix;")};
        b = new xqo0(new com.vk.movika.sdk.base.logic.interactor.m(12));
        int i = 11;
        c = new xqo0(new la0(i));
        d = new xqo0(new zq3(14));
        e = new xqo0(new f84(i));
    }

    public static final void a(vlo vloVar, mlo mloVar) {
        for (uap uapVar : vloVar.a) {
            jio jioVar = uapVar instanceof jio ? (jio) uapVar : null;
            if (jioVar != null) {
                jioVar.a(mloVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RectF b() {
        qcy<Object> qcyVar = a[2];
        return (RectF) d.b.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Matrix c() {
        qcy<Object> qcyVar = a[3];
        return (Matrix) e.b.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final hif0 d() {
        qcy<Object> qcyVar = a[0];
        return (hif0) b.b.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RectF e() {
        qcy<Object> qcyVar = a[1];
        return (RectF) c.b.get();
    }

    public static final vlo f(vlo vloVar, float f, float f2) {
        kif0 kif0Var = vloVar.b;
        if (epx.f(kif0Var, kif0.c)) {
            return new vlo(new kif0(f, f2), 1);
        }
        float f3 = kif0Var.a;
        float f4 = kif0Var.a;
        float f5 = kif0Var.b;
        if (f == f3 && f2 == f5) {
            return vlo.b(vloVar, null, 3);
        }
        float f6 = f / f2;
        if (l370.F(f6) == l370.F(f4 / f5)) {
            e().set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5);
            b().set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
            c().setRectToRect(e(), b(), Matrix.ScaleToFit.FILL);
            vlo b2 = vlo.b(vloVar, new kif0(f, f2), 2);
            for (uap uapVar : b2.a) {
                x980 x980Var = uapVar instanceof x980 ? (x980) uapVar : null;
                if (x980Var != null) {
                    x980Var.d(c());
                }
            }
            return b2;
        }
        e().set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f5);
        b().set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        c().setRectToRect(e(), b(), Matrix.ScaleToFit.FILL);
        vlo b3 = vlo.b(vloVar, new kif0(f, f2), 2);
        float max = f6 < f4 / f5 ? Math.max(nn10.e(c()), nn10.d(c())) : Math.min(nn10.e(c()), nn10.d(c()));
        c().postScale(max / nn10.d(c()), max / nn10.e(c()), f, f2);
        for (uap uapVar2 : b3.a) {
            x980 x980Var2 = uapVar2 instanceof x980 ? (x980) uapVar2 : null;
            if (x980Var2 != null) {
                x980Var2.d(c());
            }
        }
        return b3;
    }
}
