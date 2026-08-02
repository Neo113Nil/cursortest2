package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.DialogButtonsOrientation;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.alert.Alert$DismissReason;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkAlert.kt */
/* loaded from: classes17.dex */
public final class p7u0 {

    /* compiled from: VkAlert.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogButtonsOrientation.values().length];
            try {
                iArr[DialogButtonsOrientation.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogButtonsOrientation.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(jai jaiVar, jai jaiVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1825460965);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1825460965, i2, -1, "com.vk.core.compose.component.HorizontalButtons (VkAlert.kt:267)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(M, Integer.valueOf(i2 & 14));
            if (er.f((i2 >> 3) & 14, M, jaiVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j8k(jaiVar, jaiVar2, q630Var, i, 4);
        }
    }

    public static final void b(jai jaiVar, jai jaiVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2122577929);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2122577929, i2, -1, "com.vk.core.compose.component.VerticalButtons (VkAlert.kt:283)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.p, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar2.invoke(M, Integer.valueOf((i2 >> 3) & 14));
            if (er.f(i2 & 14, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hg8(i, 4, jaiVar, jaiVar2, q630Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final int i, final int i2, androidx.compose.runtime.a aVar, final Alert$Button alert$Button, Alert$Button alert$Button2, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, final String str, final String str2, xim ximVar, final izs izsVar, q630 q630Var) {
        int i3;
        Alert$Button alert$Button3;
        q630 q630Var2;
        int i4;
        SemanticsConfiguration semanticsConfiguration3;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar2;
        final SemanticsConfiguration semanticsConfiguration4;
        final Alert$Button alert$Button4;
        final SemanticsConfiguration semanticsConfiguration5;
        final q630 q630Var3;
        final xim ximVar2;
        androidx.compose.runtime.f s;
        Alert$Button alert$Button5;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(787698293);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            alert$Button3 = alert$Button;
            i3 |= M.J(alert$Button3) ? 2048 : 1024;
        } else {
            alert$Button3 = alert$Button;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                semanticsConfiguration3 = semanticsConfiguration;
                i3 |= M.J(semanticsConfiguration3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    i3 |= M.J(semanticsConfiguration2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= M.J(alert$Button2) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= M.J(ximVar) ? 67108864 : 33554432;
                        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                            q630 q630Var5 = i9 != 0 ? q630.a.a : q630Var2;
                            SemanticsConfiguration semanticsConfiguration6 = i4 != 0 ? null : semanticsConfiguration3;
                            SemanticsConfiguration semanticsConfiguration7 = i5 != 0 ? null : semanticsConfiguration2;
                            Alert$Button alert$Button6 = i6 != 0 ? null : alert$Button2;
                            xim ximVar3 = i8 != 0 ? new xim(false, 7) : ximVar;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(787698293, i3, -1, "com.vk.core.compose.component.VkAlert (VkAlert.kt:127)");
                            }
                            if (((qsu0) M.r(rrv0.e)).a()) {
                                M.K(-1380866820);
                                xim ximVar4 = ximVar3;
                                t7u0.d(((i3 >> 6) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i3 << 9) & 7168) | ((i3 >> 3) & 57344) | ((i3 << 12) & 458752) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3), 0, M, alert$Button3, alert$Button6, semanticsConfiguration6, semanticsConfiguration7, str, str2, ximVar4, izsVar, q630Var5);
                                alert$Button5 = alert$Button6;
                                ximVar3 = ximVar4;
                                q630Var4 = q630Var5;
                                M.j();
                            } else {
                                alert$Button5 = alert$Button6;
                                q630Var4 = q630Var5;
                                M.K(-1380399588);
                                x7u0.e(str, str2, izsVar, alert$Button, q630Var4, semanticsConfiguration6, semanticsConfiguration7, alert$Button5, ximVar3, M, i3 & 268435454);
                                M = M;
                                M.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar2 = M;
                            semanticsConfiguration4 = semanticsConfiguration6;
                            semanticsConfiguration5 = semanticsConfiguration7;
                            alert$Button4 = alert$Button5;
                            ximVar2 = ximVar3;
                            q630Var3 = q630Var4;
                        } else {
                            M.h();
                            SemanticsConfiguration semanticsConfiguration8 = semanticsConfiguration3;
                            aVar2 = M;
                            semanticsConfiguration4 = semanticsConfiguration8;
                            alert$Button4 = alert$Button2;
                            semanticsConfiguration5 = semanticsConfiguration2;
                            q630Var3 = q630Var2;
                            ximVar2 = ximVar;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.l7u0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p7u0.c(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, alert$Button, alert$Button4, semanticsConfiguration4, semanticsConfiguration5, str, str2, ximVar2, izsVar, q630Var3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            semanticsConfiguration3 = semanticsConfiguration;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        semanticsConfiguration3 = semanticsConfiguration;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void d(final int i, androidx.compose.runtime.a aVar, final Alert$Button alert$Button, final Alert$Button alert$Button2, final jai jaiVar, xim ximVar, final izs izsVar, final q630 q630Var) {
        int i2;
        final xim ximVar2;
        androidx.compose.runtime.a M = aVar.M(469312918);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(alert$Button) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(alert$Button2) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            xim ximVar3 = new xim(false, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(469312918, i3, -1, "com.vk.core.compose.component.VkAlert (VkAlert.kt:170)");
            }
            if (((qsu0) M.r(rrv0.e)).a()) {
                M.K(1183062519);
                t7u0.e(((i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i3 << 6) & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), M, alert$Button, alert$Button2, jaiVar, ximVar3, izsVar, q630Var);
                M.j();
            } else {
                M.K(1183343255);
                x7u0.d(i3 & 524286, M, alert$Button, alert$Button2, jaiVar, ximVar3, izsVar, q630Var);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ximVar2 = ximVar3;
        } else {
            M.h();
            ximVar2 = ximVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n7u0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p7u0.d(ne7.I(i | 1), (androidx.compose.runtime.a) obj, alert$Button, alert$Button2, jaiVar, ximVar2, izsVar, q630Var);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final String str2, final String str3, final izs<? super Alert$DismissReason, s3q0> izsVar, final gzs<s3q0> gzsVar, q630 q630Var, String str4, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, SemanticsConfiguration semanticsConfiguration3, SemanticsConfiguration semanticsConfiguration4, xim ximVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        String str5;
        izs<? super Alert$DismissReason, s3q0> izsVar2;
        q630 q630Var2;
        String str6;
        SemanticsConfiguration semanticsConfiguration5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a aVar2;
        final SemanticsConfiguration semanticsConfiguration6;
        final SemanticsConfiguration semanticsConfiguration7;
        final xim ximVar2;
        final q630 q630Var3;
        final String str7;
        final SemanticsConfiguration semanticsConfiguration8;
        final SemanticsConfiguration semanticsConfiguration9;
        final gzs<s3q0> gzsVar3;
        androidx.compose.runtime.f s;
        gzs<s3q0> gzsVar4;
        androidx.compose.runtime.a M = aVar.M(645392205);
        if ((i & 6) == 0) {
            i4 = (M.J(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            str5 = str2;
            i4 |= M.J(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i & 384) == 0) {
            i4 |= M.J(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            izsVar2 = izsVar;
            i4 |= M.y(izsVar2) ? 2048 : 1024;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 24576) == 0) {
            i4 |= M.y(gzsVar) ? 16384 : 8192;
        }
        int i15 = i3 & 32;
        if (i15 != 0) {
            i4 |= 196608;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            if ((i & 196608) == 0) {
                i4 |= M.J(q630Var2) ? 131072 : 65536;
            }
        }
        int i16 = i3 & 64;
        if (i16 != 0) {
            i4 |= 1572864;
            str6 = str4;
        } else {
            str6 = str4;
            if ((i & 1572864) == 0) {
                i4 |= M.J(str6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        int i17 = i3 & 128;
        if (i17 != 0) {
            i4 |= 12582912;
            semanticsConfiguration5 = semanticsConfiguration;
        } else {
            semanticsConfiguration5 = semanticsConfiguration;
            if ((i & 12582912) == 0) {
                i4 |= M.J(semanticsConfiguration5) ? 8388608 : 4194304;
            }
        }
        int i18 = i3 & 256;
        if (i18 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 = i18;
            i4 |= M.J(semanticsConfiguration2) ? 67108864 : 33554432;
            i6 = i3 & 512;
            if (i6 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i7 = i6;
                i4 |= M.J(semanticsConfiguration3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (M.J(semanticsConfiguration4) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & 48) == 0) {
                    i12 = i11;
                    i10 |= M.J(ximVar) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                i13 = i10;
                i14 = i3 & 4096;
                if (i14 != 0) {
                    i13 |= 384;
                } else if ((i2 & 384) == 0) {
                    i13 |= M.y(gzsVar2) ? 256 : 128;
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 147) != 146)) {
                        aVar2 = M;
                        aVar2.h();
                        semanticsConfiguration6 = semanticsConfiguration2;
                        semanticsConfiguration7 = semanticsConfiguration4;
                        ximVar2 = ximVar;
                        q630Var3 = q630Var2;
                        str7 = str6;
                        semanticsConfiguration8 = semanticsConfiguration5;
                        semanticsConfiguration9 = semanticsConfiguration3;
                        gzsVar3 = gzsVar2;
                    } else {
                        q630 q630Var4 = i15 != 0 ? q630.a.a : q630Var2;
                        if (i16 != 0) {
                            str6 = null;
                        }
                        SemanticsConfiguration semanticsConfiguration10 = i17 != 0 ? null : semanticsConfiguration5;
                        SemanticsConfiguration semanticsConfiguration11 = i5 != 0 ? null : semanticsConfiguration2;
                        SemanticsConfiguration semanticsConfiguration12 = i7 != 0 ? null : semanticsConfiguration3;
                        semanticsConfiguration7 = i9 != 0 ? null : semanticsConfiguration4;
                        xim ximVar3 = i12 != 0 ? new xim(false, 7) : ximVar;
                        if (i14 != 0) {
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = new pm60(16);
                                M.R(x);
                            }
                            gzsVar4 = (gzs) x;
                        } else {
                            gzsVar4 = gzsVar2;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(645392205, i4, i13, "com.vk.core.compose.component.VkAlert (VkAlert.kt:84)");
                        }
                        Alert$Button.Style style = Alert$Button.Style.Neutral;
                        Alert$Button alert$Button = new Alert$Button(str3, gzsVar, style, semanticsConfiguration12);
                        Alert$Button alert$Button2 = str6 != null ? new Alert$Button(str6, gzsVar4, style, semanticsConfiguration7) : null;
                        int i19 = i4 >> 3;
                        gzs<s3q0> gzsVar5 = gzsVar4;
                        int i20 = i4 >> 6;
                        aVar2 = M;
                        c((i19 & 896) | (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (57344 & i19) | (458752 & i20) | (i20 & 3670016) | ((i13 << 21) & 234881024), 0, aVar2, alert$Button, alert$Button2, semanticsConfiguration10, semanticsConfiguration11, str, str5, ximVar3, izsVar2, q630Var4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String str8 = str6;
                        semanticsConfiguration9 = semanticsConfiguration12;
                        str7 = str8;
                        gzsVar3 = gzsVar5;
                        semanticsConfiguration8 = semanticsConfiguration10;
                        semanticsConfiguration6 = semanticsConfiguration11;
                        ximVar2 = ximVar3;
                        q630Var3 = q630Var4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.k7u0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int I = ne7.I(i | 1);
                                int I2 = ne7.I(i2);
                                p7u0.e(str, str2, str3, izsVar, gzsVar, q630Var3, str7, semanticsConfiguration8, semanticsConfiguration6, semanticsConfiguration9, semanticsConfiguration7, ximVar2, gzsVar3, (androidx.compose.runtime.a) obj, I, I2, i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 147) != 146)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            i7 = i6;
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            i13 = i10;
            i14 = i3 & 4096;
            if (i14 != 0) {
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 147) != 146)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        i5 = i18;
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        i13 = i10;
        i14 = i3 & 4096;
        if (i14 != 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i13 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:
    
        if (r6.J(r15) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final jai jaiVar, final izs izsVar, final jai jaiVar2, final q630 q630Var, r5j0 r5j0Var, s890 s890Var, final xim ximVar, final jai jaiVar3, DialogButtonsOrientation dialogButtonsOrientation, s890 s890Var2, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        jai jaiVar4;
        int i4;
        izs izsVar2;
        jai jaiVar5;
        r5j0 r5j0Var2;
        s890 s890Var3;
        xim ximVar2;
        s890 s890Var4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final r5j0 r5j0Var3;
        final s890 s890Var5;
        final s890 s890Var6;
        final DialogButtonsOrientation dialogButtonsOrientation2;
        DialogButtonsOrientation dialogButtonsOrientation3;
        s890 b;
        int i6;
        r5j0 r5j0Var4;
        s890 s890Var7;
        int i7;
        int i8;
        androidx.compose.runtime.a M = aVar.M(-1862675413);
        int i9 = 4;
        if ((i & 6) == 0) {
            jaiVar4 = jaiVar;
            i4 = (M.y(jaiVar4) ? 4 : 2) | i;
        } else {
            jaiVar4 = jaiVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            izsVar2 = izsVar;
            i4 |= M.y(izsVar2) ? 32 : 16;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 384) == 0) {
            jaiVar5 = jaiVar2;
            i4 |= M.y(jaiVar5) ? 256 : 128;
        } else {
            jaiVar5 = jaiVar2;
        }
        if ((i & 3072) == 0) {
            i4 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                r5j0Var2 = r5j0Var;
                if (M.J(r5j0Var2)) {
                    i8 = 16384;
                    i4 |= i8;
                }
            } else {
                r5j0Var2 = r5j0Var;
            }
            i8 = 8192;
            i4 |= i8;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((196608 & i) == 0) {
            if ((i3 & 32) == 0) {
                s890Var3 = s890Var;
                if (M.J(s890Var3)) {
                    i7 = 131072;
                    i4 |= i7;
                }
            } else {
                s890Var3 = s890Var;
            }
            i7 = 65536;
            i4 |= i7;
        } else {
            s890Var3 = s890Var;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            ximVar2 = ximVar;
            i4 |= M.J(ximVar2) ? 8388608 : 4194304;
        } else {
            ximVar2 = ximVar;
        }
        if ((100663296 & i) == 0) {
            i4 |= M.y(jaiVar3) ? 67108864 : 33554432;
        }
        int i10 = i4 | 805306368;
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0) {
                s890Var4 = s890Var2;
            } else {
                s890Var4 = s890Var2;
            }
            i9 = 2;
            i5 = i2 | i9;
        } else {
            s890Var4 = s890Var2;
            i5 = i2;
        }
        if (M.t(i10 & 1, ((i10 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if ((i3 & 16) != 0) {
                    i10 &= -57345;
                    r5j0Var2 = x19.E(M).c();
                }
                if ((i3 & 32) != 0) {
                    s890Var3 = x19.E(M).a();
                    i10 = (-458753) & i10;
                }
                DialogButtonsOrientation dialogButtonsOrientation4 = DialogButtonsOrientation.Horizontal;
                if ((i3 & 1024) != 0) {
                    dialogButtonsOrientation3 = dialogButtonsOrientation4;
                    b = x19.E(M).b();
                    i6 = i10;
                    r5j0Var4 = r5j0Var2;
                    s890Var7 = s890Var3;
                    i5 = 0;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1862675413, i6, i5, "com.vk.core.compose.component.VkAlert (VkAlert.kt:212)");
                    }
                    jai c = kai.c(-260645648, new vud0(s890Var7, jaiVar5, jaiVar3, jaiVar4, dialogButtonsOrientation3, b), M);
                    int i11 = i6 >> 3;
                    g(izsVar2, c, q630Var, r5j0Var4, ximVar2, M, (i11 & 7168) | (i11 & 14) | 48 | (i11 & 896) | ((i6 >> 9) & 57344), 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    r5j0Var3 = r5j0Var4;
                    aVar2 = M;
                    s890Var5 = s890Var7;
                    dialogButtonsOrientation2 = dialogButtonsOrientation3;
                    s890Var6 = b;
                } else {
                    dialogButtonsOrientation3 = dialogButtonsOrientation4;
                }
            } else {
                M.h();
                if ((i3 & 16) != 0) {
                    i10 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i10 &= -458753;
                }
                dialogButtonsOrientation3 = dialogButtonsOrientation;
                if ((i3 & 1024) != 0) {
                    i6 = i10;
                    r5j0Var4 = r5j0Var2;
                    b = s890Var4;
                    i5 = 0;
                    s890Var7 = s890Var3;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    jai c2 = kai.c(-260645648, new vud0(s890Var7, jaiVar5, jaiVar3, jaiVar4, dialogButtonsOrientation3, b), M);
                    int i112 = i6 >> 3;
                    g(izsVar2, c2, q630Var, r5j0Var4, ximVar2, M, (i112 & 7168) | (i112 & 14) | 48 | (i112 & 896) | ((i6 >> 9) & 57344), 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    r5j0Var3 = r5j0Var4;
                    aVar2 = M;
                    s890Var5 = s890Var7;
                    dialogButtonsOrientation2 = dialogButtonsOrientation3;
                    s890Var6 = b;
                }
            }
            i6 = i10;
            r5j0Var4 = r5j0Var2;
            b = s890Var4;
            s890Var7 = s890Var3;
            M.S();
            if (androidx.compose.runtime.b.d()) {
            }
            jai c22 = kai.c(-260645648, new vud0(s890Var7, jaiVar5, jaiVar3, jaiVar4, dialogButtonsOrientation3, b), M);
            int i1122 = i6 >> 3;
            g(izsVar2, c22, q630Var, r5j0Var4, ximVar2, M, (i1122 & 7168) | (i1122 & 14) | 48 | (i1122 & 896) | ((i6 >> 9) & 57344), 0);
            if (androidx.compose.runtime.b.d()) {
            }
            r5j0Var3 = r5j0Var4;
            aVar2 = M;
            s890Var5 = s890Var7;
            dialogButtonsOrientation2 = dialogButtonsOrientation3;
            s890Var6 = b;
        } else {
            M.h();
            aVar2 = M;
            r5j0Var3 = r5j0Var2;
            s890Var5 = s890Var3;
            s890Var6 = s890Var4;
            dialogButtonsOrientation2 = dialogButtonsOrientation;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m7u0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p7u0.f(jai.this, izsVar, jaiVar2, q630Var, r5j0Var3, s890Var5, ximVar, jaiVar3, dialogButtonsOrientation2, s890Var6, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2), i3);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final izs izsVar, final jai jaiVar, q630 q630Var, r5j0 r5j0Var, xim ximVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        r5j0 r5j0Var2;
        int i4;
        xim ximVar2;
        final q630 q630Var3;
        final r5j0 r5j0Var3;
        final xim ximVar3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1471427221);
        if ((i & 6) == 0) {
            i3 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(jaiVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    r5j0Var2 = r5j0Var;
                    if (M.J(r5j0Var2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    r5j0Var2 = r5j0Var;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                r5j0Var2 = r5j0Var;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                ximVar2 = ximVar;
                i3 |= M.J(ximVar2) ? 16384 : 8192;
                if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            r5j0Var2 = x19.E(M).c();
                        }
                        if (i4 != 0) {
                            ximVar2 = new xim(false, 7);
                        }
                    } else {
                        M.h();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        q630Var4 = q630Var2;
                    }
                    int i7 = i3;
                    r5j0 r5j0Var4 = r5j0Var2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1471427221, i7, -1, "com.vk.core.compose.component.VkAlert (VkAlert.kt:39)");
                    }
                    xim ximVar4 = new xim(false, ximVar2.b, ximVar2.c, ximVar2.d, ximVar2.e, 224);
                    boolean z = (i7 & 14) == 4;
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new w77(izsVar, 7);
                        M.R(x);
                    }
                    q630 q630Var5 = q630Var4;
                    xim ximVar5 = ximVar2;
                    v72.a((gzs) x, ximVar4, kai.c(836075678, new lz7(q630Var5, r5j0Var4, ximVar5, izsVar, jaiVar), M), M, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    r5j0Var3 = r5j0Var4;
                    ximVar3 = ximVar5;
                    q630Var3 = q630Var5;
                } else {
                    M.h();
                    q630Var3 = q630Var2;
                    r5j0Var3 = r5j0Var2;
                    ximVar3 = ximVar2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.o7u0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p7u0.g(izs.this, jaiVar, q630Var3, r5j0Var3, ximVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            ximVar2 = ximVar;
            if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        ximVar2 = ximVar;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void h(jai jaiVar, jai jaiVar2, DialogButtonsOrientation dialogButtonsOrientation, s890 s890Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-244395189);
        int i2 = (M.y(jaiVar) ? 32 : 16) | i | (M.y(jaiVar2) ? 256 : 128) | (M.o(dialogButtonsOrientation.ordinal()) ? 2048 : 1024) | (M.J(s890Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-244395189, i2, -1, "com.vk.core.compose.component.VkDialogButtons (VkAlert.kt:242)");
            }
            q630 C = s200.C(q630.a.a, s890Var);
            dt1.a.getClass();
            q630 c = lr.c(dt1.a.p, C);
            int i3 = a.$EnumSwitchMapping$0[dialogButtonsOrientation.ordinal()];
            if (i3 == 1) {
                M.K(1359438696);
                a(jaiVar, jaiVar2, c, M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(1359436579, M);
                }
                M.K(1359445222);
                b(jaiVar, jaiVar2, c, M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r1(jaiVar, jaiVar2, dialogButtonsOrientation, s890Var, i, 1);
        }
    }
}
