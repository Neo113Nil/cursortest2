package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ReviewTextInputField.kt */
/* loaded from: classes18.dex */
public final class h2e0 implements f8s {
    public final wh50 a;

    public h2e0(y9k y9kVar) {
        this.a = androidx.compose.runtime.k.b(y9kVar);
    }

    public static void c(oio oioVar, float f, float f2, long j, frm0 frm0Var) {
        float f3 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - (f3 * (frm0Var.a / f3));
        oio.X0(oioVar, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, 832);
    }

    @Override // xsna.f8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1154914287);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1154914287, i2, -1, "com.vk.ecomm.design.compose.inputfield.ProgressHintsCaptionImpl.Content (ReviewTextInputField.kt:129)");
            }
            mm2.f(((y9k) ((zak0) this.a).getValue()).c, null, anp.e(null, 3).b(anp.m(null, null, 3)), anp.f(null, 3).b(anp.p(3, null)), null, kai.c(1681225751, new xoj(1, this, q630Var), M), M, 200064, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uq8(this, q630Var, i, 2);
        }
    }

    public final void b(final int i, final long j, androidx.compose.runtime.a aVar, final gzs gzsVar, final q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1128691042);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1128691042, i2, -1, "com.vk.ecomm.design.compose.inputfield.ProgressHintsCaptionImpl.CircularProgressIndicator (ReviewTextInputField.kt:180)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new sw7(2, gzsVar);
                M.R(x);
            }
            final gzs gzsVar2 = (gzs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j2 = ylu0Var.getIcon().n;
            final frm0 frm0Var = new frm0(((azl) M.r(uvi.h)).I0(2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, null, 26);
            q630 q = txj0.q(q630Var, 16);
            boolean J = ((i2 & 112) == 32) | M.J(gzsVar2) | ((i2 & 7168) == 2048) | M.p(j2) | M.y(frm0Var);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                izs izsVar = new izs(this, j2, frm0Var, j) { // from class: xsna.f2e0
                    public final /* synthetic */ long c;
                    public final /* synthetic */ frm0 d;
                    public final /* synthetic */ long e;

                    {
                        this.c = j2;
                        this.d = frm0Var;
                        this.e = j;
                    }

                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float floatValue = ((Number) gzs.this.invoke()).floatValue() * 360.0f;
                        long j3 = this.c;
                        frm0 frm0Var2 = this.d;
                        h2e0.c(oioVar, floatValue + 270.0f, 360.0f - floatValue, j3, frm0Var2);
                        h2e0.c(oioVar, 270.0f, floatValue, this.e, frm0Var2);
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x2 = izsVar;
            }
            xa4.i(0, M, (izs) x2, q);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, j, q630Var, i) { // from class: xsna.g2e0
                public final /* synthetic */ gzs c;
                public final /* synthetic */ long d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    h2e0.this.b(I, this.d, (androidx.compose.runtime.a) obj, this.c, this.e);
                    return s3q0.a;
                }
            };
        }
    }
}
