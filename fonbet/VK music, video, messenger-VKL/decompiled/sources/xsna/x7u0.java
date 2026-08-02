package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: VkAlertOld.kt */
/* loaded from: classes17.dex */
public final class x7u0 {

    /* compiled from: VkAlertOld.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alert$Button.Style.values().length];
            try {
                iArr[Alert$Button.Style.Neutral.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alert$Button.Style.Negative.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(Alert$Button alert$Button, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> hueVar;
        ButtonAppearance buttonAppearance;
        androidx.compose.runtime.a M = aVar.M(-240878444);
        int i2 = (M.J(alert$Button) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-240878444, i2, -1, "com.vk.core.compose.component.ButtonImpl (VkAlertOld.kt:113)");
            }
            if (alert$Button == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    hueVar = new ncb(alert$Button, i, 18);
                    s.d = hueVar;
                }
                return;
            }
            int i3 = a.$EnumSwitchMapping$0[alert$Button.c.ordinal()];
            if (i3 == 1) {
                buttonAppearance = ButtonAppearance.Accent;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonAppearance = ButtonAppearance.Negative;
            }
            aVar2 = M;
            bhu0.e(alert$Button.b, ButtonSize.Medium, ButtonStyle.Tertiary, buttonAppearance, com.vk.core.compose.component.semantics.b.b(q630.a.a, alert$Button.d), null, false, false, null, null, null, alert$Button.a, null, null, null, null, false, null, null, null, aVar2, Tensorflow.FRAME_WIDTH, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            hueVar = new hue(alert$Button, i, 14);
            s.d = hueVar;
        }
    }

    public static final void b(String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1111190564);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(semanticsConfiguration) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1111190564, i2, -1, "com.vk.core.compose.component.Description (VkAlertOld.kt:99)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, com.vk.core.compose.component.semantics.b.b(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), semanticsConfiguration), ylu0Var.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i2 & 14, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h08(str, semanticsConfiguration, i, 14);
        }
    }

    public static final void c(String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(28224512);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(semanticsConfiguration) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(28224512, i2, -1, "com.vk.core.compose.component.Title (VkAlertOld.kt:88)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.D;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.a(str, com.vk.core.compose.component.semantics.b.b(q630.a.a, semanticsConfiguration), ylu0Var.getText().m, 0L, b6s.d, null, 0L, 0, 0L, null, 0, false, 0, 0, null, frv0Var, aVar2, (i2 & 14) | 196608, 0, 524248);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yb1(str, semanticsConfiguration, i, 13);
        }
    }

    public static final void d(final int i, androidx.compose.runtime.a aVar, final Alert$Button alert$Button, final Alert$Button alert$Button2, final jai jaiVar, final xim ximVar, final izs izsVar, final q630 q630Var) {
        jai jaiVar2;
        int i2;
        izs izsVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-98502714);
        if ((i & 6) == 0) {
            jaiVar2 = jaiVar;
            i2 = (M.y(jaiVar2) ? 4 : 2) | i;
        } else {
            jaiVar2 = jaiVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 32 : 16;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(alert$Button) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(alert$Button2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(ximVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-98502714, i2, -1, "com.vk.core.compose.component.VkAlertOld (VkAlertOld.kt:76)");
            }
            int i3 = i2 << 6;
            p7u0.f(kai.c(1854693322, new u05(alert$Button, 14), M), izsVar2, jaiVar2, q630Var2, null, null, ximVar, kai.c(-1060961326, new p0h(alert$Button2, 5), M), null, null, M, (i2 & 7168) | (i2 & 112) | 100663302 | (i3 & 896) | (29360128 & i3), 0, 1648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.w7u0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x7u0.d(ne7.I(i | 1), (androidx.compose.runtime.a) obj, alert$Button, alert$Button2, jaiVar, ximVar, izsVar, q630Var);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final String str, final String str2, final izs izsVar, final Alert$Button alert$Button, final q630 q630Var, final SemanticsConfiguration semanticsConfiguration, final SemanticsConfiguration semanticsConfiguration2, final Alert$Button alert$Button2, final xim ximVar, androidx.compose.runtime.a aVar, final int i) {
        Object obj;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1399968135);
        if ((i & 6) == 0) {
            obj = str;
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            obj = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(alert$Button) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(semanticsConfiguration) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(semanticsConfiguration2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(alert$Button2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(ximVar) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (38347923 & i3) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1399968135, i3, -1, "com.vk.core.compose.component.VkAlertOld (VkAlertOld.kt:44)");
            }
            int i4 = i3 >> 3;
            int i5 = i3 >> 9;
            d((i5 & 458752) | (i4 & 7168) | (i4 & 112) | 6 | (i4 & 896) | (57344 & i5), M, alert$Button, alert$Button2, kai.c(-1930078886, new lgx(obj, semanticsConfiguration, str2, semanticsConfiguration2, 2), M), ximVar, izsVar, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.v7u0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    x7u0.e(str, str2, izsVar, alert$Button, q630Var, semanticsConfiguration, semanticsConfiguration2, alert$Button2, ximVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
