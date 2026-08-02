package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: IconOnlyButton.kt */
/* loaded from: classes5.dex */
public final class arv {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ButtonStyle buttonStyle, final gzs gzsVar, q630 q630Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-421480920);
        if ((i & 6) == 0) {
            i3 = (M.o(buttonStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.y(jaiVar) ? 2048 : 1024;
            }
            i4 = i3;
            if (M.t(i4 & 1, (i4 & 1171) == 1170)) {
                M.h();
            } else {
                q630.a aVar2 = q630.a.a;
                q630 q630Var3 = i5 != 0 ? aVar2 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-421480920, i4, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.IconOnlyButton (IconOnlyButton.kt:22)");
                }
                bn20 z = hr80.z();
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                int i6 = i4 & 14;
                final lgu0 b = z.b(buttonStyle, buttonAppearance, M, i6 | 48);
                final ButtonSize buttonSize = ButtonSize.Medium;
                q630 g = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hr80.z().w(buttonSize, M, 6), 1, aVar2).g(q630Var3);
                y18 t = hr80.z().t(buttonStyle, buttonAppearance, true, M, i6 | Tensorflow.FRAME_WIDTH);
                u890 m = s200.m(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                hr80.z().getClass();
                q630Var2 = q630Var3;
                bhu0.f(gzsVar, g, false, null, null, t, hr80.z().y(buttonSize, M, 6), op8.f(buttonStyle, M, i6), null, b, m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1365172785, new yzs() { // from class: xsna.yqv
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        spg0 spg0Var = (spg0) obj;
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar3.J(spg0Var) ? 4 : 2;
                        }
                        if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1365172785, intValue, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.IconOnlyButton.<anonymous> (IconOnlyButton.kt:45)");
                            }
                            jai.this.invoke(spg0Var, buttonSize, b, aVar3, Integer.valueOf((intValue & 14) | 48));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, (i4 >> 3) & 14, 1572870, 63772);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            final q630 q630Var4 = q630Var2;
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.zqv
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        arv.a(ButtonStyle.this, gzsVar, q630Var4, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (M.t(i4 & 1, (i4 & 1171) == 1170)) {
        }
        final q630 q630Var42 = q630Var2;
        s = M.s();
        if (s == null) {
        }
    }
}
