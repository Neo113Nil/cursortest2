package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.Pose;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.sls;
import defpackage.tls;

/* loaded from: classes11.dex */
public abstract class cn91 {
    public static final void a(Bitmap bitmap, String str, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1222360029);
        int i2 = 16;
        int i3 = i | (btsVar.e(bitmap) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            c530 c530Var = c530.a;
            f530 l = ymb1.l(ljs0.n(c530Var, 100.0f, 48.0f), cyk0.c(16.0f));
            boolean z = (i3 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new my30(str, i2);
                btsVar.o0(Q2);
            }
            f530 b = q791.b(fnq0.b(l, false, (tls) Q2), zx40Var, fsk0.a(7, false), false, null, null, slsVar, 28);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            o4b1.c(new u92(bitmap), null, ljs0.c, null, mhe.a, 0.0f, null, 0, btsVar, 25008, 232);
            o4b1.b(mt71.m(f1h0.panorama_icon, 0, btsVar), null, an91.o(cj6.a.a(c530Var, x4c.A), 12.0f, 0.0f, 0.0f, 8.0f, 6), null, null, 0.0f, new c36(ldc.f, 5), btsVar, 1572920, 56);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(bitmap, str, slsVar, i, 21);
        }
    }

    public static final void b(qb90 qb90Var, sls slsVar, String str, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1388744117);
        int i2 = i | (btsVar.e(qb90Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(str) ? 256 : 128);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = qb90Var != null;
            ck11 K = sb2.K(500, 0, null, 6);
            Object Q = btsVar.Q();
            int i4 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i4);
                btsVar.o0(Q);
            }
            w2o a = k.n(K, (tls) Q).a(k.e(sb2.K(500, 100, null, 4), 2));
            ck11 K2 = sb2.K(500, 0, null, 6);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i4);
                btsVar.o0(Q2);
            }
            g.e(z, f530Var, a, k.s(K2, (tls) Q2).a(k.f(sb2.K(500, 0, null, 6), 2)), null, wwg.S(-522101133, true, new ls40(i3, qb90Var, str, slsVar), btsVar), btsVar, 200112, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(qb90Var, slsVar, str, f530Var, i, 27);
        }
    }

    public static final void c(String str, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1494645829);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            uo5 uo5Var = x4c.y;
            f530 m = ljs0.m(c530.a, 48.0f);
            byk0 byk0Var = cyk0.a;
            f530 l = ymb1.l(bzk0.c(ibb1.c(m, 4.0f, byk0Var, 0L, 0L, 28), AppColor$Palette.BgFloating, byk0Var), byk0Var);
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Q2 = new my30(str, 15);
                btsVar2.o0(Q2);
            }
            f530 b = q791.b(fnq0.b(l, false, (tls) Q2), zx40Var, fsk0.a(7, false), false, null, null, slsVar, 28);
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            o4b1.b(mt71.m(f1h0.panorama_icon, 0, btsVar2), null, null, null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar2), 5), btsVar2, 56, 60);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 3, slsVar, str);
        }
    }

    public static float d(Pose pose, Pose pose2) {
        float[] fArr = new float[3];
        float tx = pose2.tx();
        float ty = pose2.ty();
        float tz = pose2.tz();
        pose.getTransformedAxis(1, 1.0f, fArr, 0);
        return ((tz - pose.tz()) * fArr[2]) + ((ty - pose.ty()) * fArr[1]) + ((tx - pose.tx()) * fArr[0]);
    }

    public static Rect e(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
        return rect;
    }

    public static final void f(Animator animator, final sls slsVar) {
        animator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.util.driver.DriverAnimationsUtilsKt$onEnd$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                sls.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        });
    }

    public static final void g(final tls tlsVar, final Animator animator) {
        animator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.util.driver.DriverAnimationsUtilsKt$onStart$lambda$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                tls.this.invoke(animator);
            }
        });
    }
}
