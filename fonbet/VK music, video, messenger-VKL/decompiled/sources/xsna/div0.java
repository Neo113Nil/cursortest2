package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: VkSearchButton.kt */
/* loaded from: classes17.dex */
public final class div0 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if ((r31 & 8) != 0) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final lg90 lg90Var, final gzs<s3q0> gzsVar, final q630 q630Var, long j, final String str, final SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final long j2;
        androidx.compose.runtime.a aVar2;
        final long j3;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-103838395);
        int i4 = (M.y(lg90Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (M.p(j2)) {
                    i3 = 2048;
                    i4 |= i3;
                }
            } else {
                j2 = j;
            }
            i3 = 1024;
            i4 |= i3;
        } else {
            j2 = j;
        }
        int i5 = i4 | (M.J(str) ? 16384 : 8192) | (M.J(semanticsConfiguration) ? 131072 : 65536);
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if ((i2 & 8) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var.getIcon().l;
                    i5 &= -7169;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-103838395, i5, -1, "com.vk.core.compose.component.search.VkSearchButton (VkSearchButton.kt:23)");
                }
                int i6 = ((i5 >> 3) & 14) | 100688256;
                j3 = j2;
                aVar2 = M;
                nzu0.e(gzsVar, s200.F(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, com.vk.core.compose.component.semantics.b.b(q630Var, semanticsConfiguration)), 36, IconButtonRippleType.Bounded, false, null, null, kai.c(1316968560, new wzs() { // from class: xsna.biv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1316968560, intValue, -1, "com.vk.core.compose.component.search.VkSearchButton.<anonymous> (VkSearchButton.kt:32)");
                            }
                            vqv.a(lg90Var, str, null, j2, aVar3, 8, 4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M), aVar2, i6, 232);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            j3 = j2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.civ0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    div0.a(lg90.this, gzsVar, q630Var, j3, str, semanticsConfiguration, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
