package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: Divider.kt */
/* loaded from: classes11.dex */
public final class csn {
    public static final void a(q630 q630Var, final float f, final long j, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(75144485);
        int i2 = i | 54 | (M.p(j) ? 256 : 128);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                f = srn.a;
                q630Var = q630.a.a;
            } else {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(75144485, i2, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:53)");
            }
            q630 h = txj0.h(txj0.f(q630Var, 1.0f), f);
            if ((((i2 & 896) ^ 384) <= 256 || !M.p(j)) && (i2 & 384) != 256) {
                z = false;
            }
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.zrn
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float f2 = f;
                        float I0 = oioVar.I0(f2);
                        float f3 = 2;
                        float I02 = oioVar.I0(f2) / f3;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32));
                        float I03 = oioVar.I0(f2) / f3;
                        oioVar.b1(I0, (r20 & 16) != 0 ? 0 : 0, 3, j, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), (Float.floatToRawIntBits(I03) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            xa4.i(0, M, (izs) x, h);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        final float f2 = f;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f2, j, i) { // from class: xsna.bsn
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    csn.a(q630.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
