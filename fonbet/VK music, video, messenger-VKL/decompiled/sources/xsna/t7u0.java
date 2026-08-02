package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;
import xsna.t7z;

/* compiled from: VkAlertNew.kt */
/* loaded from: classes17.dex */
public final class t7u0 {

    /* compiled from: VkAlertNew.kt */
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

    public static final void a(final Alert$Button alert$Button, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> nx7Var;
        final long j;
        androidx.compose.runtime.a M = aVar.M(-275406213);
        int i2 = (M.J(alert$Button) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-275406213, i2, -1, "com.vk.core.compose.component.ButtonImpl (VkAlertNew.kt:130)");
            }
            if (alert$Button == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    nx7Var = new l71(alert$Button, i, 9);
                    s.d = nx7Var;
                }
                return;
            }
            int i3 = a.$EnumSwitchMapping$0[alert$Button.c.ordinal()];
            if (i3 == 1) {
                M.K(1622608486);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getText().m;
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(1622606084, M);
                }
                M.K(1622610759);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getText().k;
                M.j();
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, alert$Button.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            uov0.b(alert$Button.b, b, vog0.b(100), ylu0Var3.d().a, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, kai.c(1183537456, new wzs() { // from class: xsna.s7u0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1183537456, intValue, -1, "com.vk.core.compose.component.ButtonImpl.<anonymous> (VkAlertNew.kt:144)");
                        }
                        float f = 12;
                        q630 G = s200.G(q630.a.a, f, 10, f, 11);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-942794935, 0, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
                        }
                        xup0 xup0Var = (xup0) aVar3.r(evp0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        cjo0.c(Alert$Button.this.a, G, j, 0L, 0L, null, 0L, 0, false, 0, 0, xup0Var.m, aVar3, 48, 0, 131064);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 0, 48, 2032);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            nx7Var = new nx7(alert$Button, i, 17);
            s.d = nx7Var;
        }
    }

    public static final void b(String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1076662795);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(semanticsConfiguration) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1076662795, i2, -1, "com.vk.core.compose.component.Description (VkAlertNew.kt:110)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), semanticsConfiguration);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().r;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-942794935, 0, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
            }
            xup0 xup0Var = (xup0) M.r(evp0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nmo0 nmo0Var = xup0Var.k;
            t7z.a.a(0.75f);
            aVar2 = M;
            cjo0.c(str, b, j, 0L, 0L, null, 0L, 0, false, 0, 0, nmo0.a(nmo0Var, 0L, 0L, null, null, 0L, 0L, null, new t7z(0.75f, 0, 0), 15728639), aVar2, i2 & 14, 0, 131064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ps7(str, semanticsConfiguration, i, 12);
        }
    }

    public static final void c(String str, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-6303257);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(semanticsConfiguration) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-6303257, i2, -1, "com.vk.core.compose.component.Title (VkAlertNew.kt:92)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), semanticsConfiguration);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-942794935, 0, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
            }
            xup0 xup0Var = (xup0) M.r(evp0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nmo0 nmo0Var = xup0Var.f;
            t7z.a.a(0.75f);
            aVar2 = M;
            cjo0.c(str, b, j, 0L, 0L, null, 0L, 0, false, 0, 0, nmo0.a(nmo0Var, 0L, 0L, null, null, 0L, 0L, null, new t7z(0.75f, 0, 0), 15728639), aVar2, i2 & 14, 0, 131064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new i8c(str, semanticsConfiguration, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final int i, final int i2, androidx.compose.runtime.a aVar, final Alert$Button alert$Button, final Alert$Button alert$Button2, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, final String str, final String str2, xim ximVar, final izs izsVar, q630 q630Var) {
        int i3;
        q630 q630Var2;
        int i4;
        SemanticsConfiguration semanticsConfiguration3;
        int i5;
        SemanticsConfiguration semanticsConfiguration4;
        int i6;
        int i7;
        final q630 q630Var3;
        final SemanticsConfiguration semanticsConfiguration5;
        final SemanticsConfiguration semanticsConfiguration6;
        final xim ximVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1577924183);
        if ((i & 6) == 0) {
            i3 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(alert$Button) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.J(str) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                semanticsConfiguration3 = semanticsConfiguration;
                i3 |= M.J(semanticsConfiguration3) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i3 |= M.J(str2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    semanticsConfiguration4 = semanticsConfiguration2;
                    i3 |= M.J(semanticsConfiguration4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if ((12582912 & i) == 0) {
                        i3 |= M.J(alert$Button2) ? 8388608 : 4194304;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i7 = i6;
                        i3 |= M.J(ximVar) ? 67108864 : 33554432;
                        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            SemanticsConfiguration semanticsConfiguration7 = i4 != 0 ? null : semanticsConfiguration3;
                            SemanticsConfiguration semanticsConfiguration8 = i5 == 0 ? semanticsConfiguration4 : null;
                            xim ximVar3 = i7 != 0 ? new xim(false, 7) : ximVar;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1577924183, i3, -1, "com.vk.core.compose.component.VkAlertNew (VkAlertNew.kt:37)");
                            }
                            int i9 = i3 >> 9;
                            e((i3 & 14) | 384 | (i3 & 112) | ((i3 << 3) & 7168) | (57344 & i9) | (i9 & 458752), M, alert$Button, alert$Button2, kai.c(204317775, new kja(str, semanticsConfiguration7, str2, semanticsConfiguration8), M), ximVar3, izsVar, q630Var4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            semanticsConfiguration6 = semanticsConfiguration8;
                            semanticsConfiguration5 = semanticsConfiguration7;
                            ximVar2 = ximVar3;
                            q630Var3 = q630Var4;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            semanticsConfiguration5 = semanticsConfiguration3;
                            semanticsConfiguration6 = semanticsConfiguration4;
                            ximVar2 = ximVar;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.r7u0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    t7u0.d(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, alert$Button, alert$Button2, semanticsConfiguration5, semanticsConfiguration6, str, str2, ximVar2, izsVar, q630Var3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i7 = i6;
                    if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                semanticsConfiguration4 = semanticsConfiguration2;
                if ((12582912 & i) == 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i7 = i6;
                if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            semanticsConfiguration3 = semanticsConfiguration;
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            semanticsConfiguration4 = semanticsConfiguration2;
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i7 = i6;
            if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        semanticsConfiguration3 = semanticsConfiguration;
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        semanticsConfiguration4 = semanticsConfiguration2;
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, Alert$Button alert$Button, Alert$Button alert$Button2, jai jaiVar, xim ximVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-986473272);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(alert$Button) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(alert$Button2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(ximVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-986473272, i2, -1, "com.vk.core.compose.component.VkAlertNew (VkAlertNew.kt:71)");
            }
            aVar2 = M;
            p7u0.f(kai.c(966722764, new com.vk.movika.sdk.base.ui.q0(alert$Button, 9), M), izsVar, jaiVar, s200.C(q630Var, q7u0.c), q7u0.b, q7u0.d, ximVar, kai.c(-1948931884, new y2(alert$Button2, 11), M), null, q7u0.e, aVar2, ((i2 << 3) & 112) | 102457350 | (i2 & 896) | ((i2 << 6) & 29360128), 6, 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nx(i, alert$Button, alert$Button2, jaiVar, ximVar, izsVar, q630Var);
        }
    }
}
