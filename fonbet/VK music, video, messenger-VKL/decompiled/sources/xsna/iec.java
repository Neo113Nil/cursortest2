package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: CircularStepProgress.kt */
/* loaded from: classes4.dex */
public final class iec {
    public static final void a(final int i, final int i2, final long j, final long j2, final q630 q630Var, float f, frm0 frm0Var, androidx.compose.runtime.a aVar, final int i3) {
        final float f2;
        final frm0 frm0Var2;
        float f3;
        int i4;
        frm0 frm0Var3;
        final frm0 frm0Var4;
        final float f4;
        androidx.compose.runtime.a M = aVar.M(-443754068);
        int i5 = i3 | (M.o(i) ? 4 : 2) | (M.o(i2) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.p(j2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | 720896;
        if (M.t(i5 & 1, (599187 & i5) != 599186)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1126643595, 0, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.defaultStrokeStyle (CircularStepProgress.kt:17)");
                }
                frm0 frm0Var5 = new frm0(((azl) M.r(uvi.h)).I0(2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 1, null, 18);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f3 = 10.0f;
                i4 = i5 & (-3670017);
                frm0Var3 = frm0Var5;
            } else {
                M.h();
                f3 = f;
                i4 = i5 & (-3670017);
                frm0Var3 = frm0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-443754068, i4, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.CircularStepProgress (CircularStepProgress.kt:32)");
            }
            boolean y = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | M.y(frm0Var3);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                frm0Var4 = frm0Var3;
                f4 = f3;
                izs izsVar = new izs() { // from class: xsna.gec
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        int i6 = i;
                        float f5 = i6;
                        float f6 = f4;
                        float a = yq.a(f5, f6, 360.0f, f5);
                        int i7 = 1;
                        if (1 <= i6) {
                            while (true) {
                                oio.X0(oioVar, i7 <= i2 ? j : j2, (f6 / 2) + 90.0f + ((a + f6) * i7), a, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var4, 880);
                                if (i7 == i6) {
                                    break;
                                }
                                i7++;
                            }
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x = izsVar;
            } else {
                frm0Var4 = frm0Var3;
                f4 = f3;
            }
            xa4.i((i4 >> 12) & 14, M, (izs) x, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = f4;
            frm0Var2 = frm0Var4;
        } else {
            M.h();
            f2 = f;
            frm0Var2 = frm0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, i2, j, j2, q630Var, f2, frm0Var2, i3) { // from class: xsna.hec
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ float g;
                public final /* synthetic */ frm0 h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    iec.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
