package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FirebasePerformanceModule.java */
/* loaded from: classes13.dex */
public final class mjr implements gm6, znj {
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;

    public /* synthetic */ mjr(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // xsna.gm6
    public boolean a0() {
        return false;
    }

    public void b() {
        com.vk.profile.questions.impl.a aVar = (com.vk.profile.questions.impl.a) this.b;
        boolean z = ((String) this.c).length() >= 80;
        aVar.Zn(!drm0.N((String) this.c));
        View view = aVar.l1;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, z);
        if (z) {
            View view2 = aVar.l1;
            awt0.p(view2 != null ? view2 : null);
        }
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        lg90 o;
        Object obj = this.d;
        wh50 wh50Var = (wh50) this.c;
        androidx.compose.runtime.a M = aVar.M(-438872230);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-438872230, i2, -1, "com.vk.design.demo.presentation.screens.BuildButtonWithContextMenu.<anonymous>.<anonymous>.<no name provided>.Content (OnboardingTooltipScreenContent.kt:285)");
            }
            lzo0 d = nzo.d(3072, 6, M, (String) this.b, false);
            if (epx.f(wh50Var.getValue(), obj)) {
                M.K(-561769388);
                qzu0.a.getClass();
                o = qzu0.p(M);
                M.j();
            } else {
                M.K(-561680077);
                qzu0.a.getClass();
                o = qzu0.o(M);
                M.j();
            }
            lqv B = znk0.B(o, 0L, 0L, M, 196616, 30);
            boolean J = M.J(wh50Var) | M.y(obj);
            wh50 wh50Var2 = (wh50) this.e;
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new hj3(wh50Var, obj, wh50Var2, 3);
                M.R(x);
            }
            aou0.d(znjVar, (gzs) x, null, null, false, B, d, null, M, i2 & 14, 78);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fd1(this, znjVar, i, 9);
        }
    }

    @Override // xsna.gm6
    public void onStart() {
        b();
    }

    public mjr(com.vk.profile.questions.impl.a aVar) {
        this.b = aVar;
        this.c = "";
        this.e = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.c(4));
    }

    @Override // xsna.gm6
    public void d() {
    }

    @Override // xsna.cc6
    public void onDestroy() {
    }

    @Override // xsna.gm6
    public void onDestroyView() {
    }

    @Override // xsna.cc6
    public void onPause() {
    }

    @Override // xsna.cc6
    public void onResume() {
    }

    @Override // xsna.gm6
    public void onStop() {
    }
}
