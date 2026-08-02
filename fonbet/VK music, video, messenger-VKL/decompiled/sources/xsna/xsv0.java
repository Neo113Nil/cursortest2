package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.tool.ToolButton$Appearance;
import com.vk.core.compose.component.button.tool.ToolButton$Mode;
import com.vk.core.compose.component.button.tool.ToolButton$TextPosition;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.do20;
import xsna.dt1;
import xsna.p2p0;
import xsna.q630;

/* compiled from: VkToolButton.kt */
/* loaded from: classes17.dex */
public final class xsv0 {
    public static final void a(final ToolButton$Mode toolButton$Mode, final ToolButton$Appearance toolButton$Appearance, final psv0 psv0Var, final boolean z, final lg90 lg90Var, final pco pcoVar, final String str, final ToolButton$TextPosition toolButton$TextPosition, androidx.compose.runtime.a aVar, final int i) {
        ToolButton$Mode toolButton$Mode2;
        final ToolButton$Appearance toolButton$Appearance2;
        androidx.compose.runtime.a M = aVar.M(-2072664087);
        uco ucoVar = null;
        int i2 = (M.o(toolButton$TextPosition == null ? -1 : toolButton$TextPosition.ordinal()) ? 67108864 : 33554432) | i | (M.o(toolButton$Mode.ordinal()) ? 4 : 2) | (M.o(toolButton$Appearance.ordinal()) ? 32 : 16) | (M.J(psv0Var) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(lg90Var) ? 16384 : 8192) | (M.J(null) ? 131072 : 65536) | (M.J(pcoVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(str) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2072664087, i2, -1, "com.vk.core.compose.component.ButtonContent (VkToolButton.kt:339)");
            }
            jai c = kai.c(-399264022, new wzs() { // from class: xsna.rsv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    uco ucoVar2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-399264022, intValue, -1, "com.vk.core.compose.component.ButtonContent.<anonymous> (VkToolButton.kt:342)");
                        }
                        lg90 lg90Var2 = lg90.this;
                        ToolButton$Mode toolButton$Mode3 = toolButton$Mode;
                        ToolButton$Appearance toolButton$Appearance3 = toolButton$Appearance;
                        boolean z2 = z;
                        psv0 psv0Var2 = psv0Var;
                        if (lg90Var2 != null) {
                            aVar2.K(-1710002800);
                            pco pcoVar2 = pcoVar;
                            if (pcoVar2 != null) {
                                float f = pcoVar2.b;
                                ucoVar2 = new uco(byc0.b(f, f));
                            } else {
                                ucoVar2 = null;
                            }
                            kqv a = p2p0.a.C3488a.a(lg90Var2, ucoVar2, aVar2, 196616);
                            a.a(toolButton$Mode3, toolButton$Appearance3, z2);
                            a.b(psv0Var2, aVar2, 48);
                        } else {
                            aVar2.K(-1721218600);
                        }
                        aVar2.j();
                        String str2 = str;
                        if (str2 == null || str2.length() == 0) {
                            aVar2.K(-1721218600);
                        } else {
                            aVar2.K(-1709767820);
                            f9t.e(txj0.q(q630.a.a, kqu0.r), aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1339728842, 384, -1, "com.vk.core.compose.component.button.tool.ToolButton.Slot.Text.Companion.invoke (ToolButton.kt:70)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-15938057, 6, -1, "com.vk.core.compose.component.button.tool.remember (TextImpl.kt:37)");
                            }
                            Object x = aVar2.x();
                            if (x == a.C0011a.a) {
                                x = new eio0(str2);
                                aVar2.R(x);
                            }
                            eio0 eio0Var = (eio0) x;
                            ((zak0) eio0Var.d).setValue(str2);
                            ((zak0) eio0Var.e).setValue(null);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            eio0Var.a(toolButton$Mode3, toolButton$Appearance3, z2);
                            eio0Var.b(psv0Var2, aVar2, 48);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M);
            ToolButton$TextPosition toolButton$TextPosition2 = ToolButton$TextPosition.Right;
            q630.a aVar2 = q630.a.a;
            if (toolButton$TextPosition == toolButton$TextPosition2) {
                M.K(1034668557);
                a.c cVar = androidx.compose.foundation.layout.a.e;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, aVar2);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c2, cri.a.d);
                c.invoke(M, 6);
                M.G();
                M.j();
                toolButton$Mode2 = toolButton$Mode;
                toolButton$Appearance2 = toolButton$Appearance;
            } else if (toolButton$TextPosition == ToolButton$TextPosition.Bottom || toolButton$TextPosition == toolButton$TextPosition2) {
                toolButton$Mode2 = toolButton$Mode;
                toolButton$Appearance2 = toolButton$Appearance;
                M.K(1034675761);
                a.c cVar2 = androidx.compose.foundation.layout.a.e;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar2, dt1.a.o, M, 54);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, aVar2);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                c.invoke(M, 6);
                M.G();
                M.j();
            } else {
                if (toolButton$TextPosition == ToolButton$TextPosition.None) {
                    M.K(1034682350);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c4 = qri.c(M, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D3, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c4, cri.a.d);
                    if (lg90Var != null) {
                        M.K(552161047);
                        if (pcoVar != null) {
                            float f = pcoVar.b;
                            ucoVar = new uco(byc0.b(f, f));
                        }
                        int i3 = i2 >> 12;
                        kqv a3 = p2p0.a.C3488a.a(lg90Var, ucoVar, M, (i3 & 112) | (i3 & 14) | 196616);
                        toolButton$Mode2 = toolButton$Mode;
                        toolButton$Appearance2 = toolButton$Appearance;
                        a3.a(toolButton$Mode2, toolButton$Appearance2, z);
                        a3.b(psv0Var, M, ((i2 >> 6) & 14) | 48);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        toolButton$Mode2 = toolButton$Mode;
                        toolButton$Appearance2 = toolButton$Appearance;
                        M.K(539873267);
                    }
                    M.j();
                    M.G();
                } else {
                    toolButton$Mode2 = toolButton$Mode;
                    toolButton$Appearance2 = toolButton$Appearance;
                    M.K(1998184985);
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            toolButton$Mode2 = toolButton$Mode;
            toolButton$Appearance2 = toolButton$Appearance;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final ToolButton$Mode toolButton$Mode3 = toolButton$Mode2;
            s.d = new wzs(toolButton$Appearance2, psv0Var, z, lg90Var, pcoVar, str, toolButton$TextPosition, i) { // from class: xsna.ssv0
                public final /* synthetic */ ToolButton$Appearance c;
                public final /* synthetic */ psv0 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ lg90 f;
                public final /* synthetic */ pco g;
                public final /* synthetic */ String h;
                public final /* synthetic */ ToolButton$TextPosition i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(32769);
                    xsv0.a(ToolButton$Mode.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final gzs gzsVar, final ToolButton$Mode toolButton$Mode, final ToolButton$Appearance toolButton$Appearance, final q630 q630Var, final r5j0 r5j0Var, final boolean z, final sg50 sg50Var, final s890 s890Var, final boolean z2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        mlg0 a;
        mlg0 mlg0Var;
        int[] iArr;
        int i4;
        y18 y18Var;
        bcl bclVar;
        long j;
        androidx.compose.runtime.a M = aVar.M(-448294135);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(toolButton$Mode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(toolButton$Appearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(r5j0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(sg50Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(s890Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= M.l(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i2 & 1, (i2 & 306783379) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-448294135, i2, 6, "com.vk.core.compose.component.VkToolButton (VkToolButton.kt:144)");
            }
            do20 q = n34.q();
            int i5 = i2 >> 3;
            int i6 = i5 & 14;
            int i7 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            q.getClass();
            M.K(-927149156);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-927149156, i7, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.ripple (MilkshakeToolButtonDefaults.kt:140)");
            }
            if (toolButton$Mode == ToolButton$Mode.Primary && e43.l(ToolButton$Appearance.Neutral, ToolButton$Appearance.Overlay).contains(toolButton$Appearance)) {
                M.K(234476246);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = i2;
                a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, ylu0Var.s() ? l5g.d : l5g.b, false);
                M.j();
            } else {
                i3 = i2;
                M.K(234652140);
                M.j();
                a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            int i8 = (i3 >> 9) & 896;
            int i9 = i7 | i8;
            n34.q().getClass();
            M.K(205043020);
            if (androidx.compose.runtime.b.d()) {
                mlg0Var = a;
                androidx.compose.runtime.b.f(205043020, i9, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.border (MilkshakeToolButtonDefaults.kt:68)");
            } else {
                mlg0Var = a;
            }
            int[] iArr2 = do20.a.$EnumSwitchMapping$1;
            if (iArr2[toolButton$Mode.ordinal()] == 2) {
                M.K(993426266);
                int[] iArr3 = do20.a.$EnumSwitchMapping$2;
                iArr = iArr2;
                int i10 = iArr3[toolButton$Appearance.ordinal()];
                if (i10 == 1) {
                    M.K(-522140610);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.m().b;
                    M.j();
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw alb0.c(-522142924, M);
                    }
                    M.K(-522136831);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.p().d;
                    M.j();
                }
                long c = iArr3[toolButton$Appearance.ordinal()] == 2 ? l5g.c(14, j, l5g.e(j) * 0.64f) : l5g.c(14, j, 0.64f);
                i4 = i7;
                long j2 = c;
                long j3 = j;
                boolean p = M.p(j) | M.p(j2) | ((((i9 & 896) ^ 384) > 256 && M.l(z)) || (i9 & 384) == 256);
                Object x = M.x();
                if (p || x == a.C0011a.a) {
                    float f = 1;
                    if (z) {
                        j2 = j3;
                    }
                    x = aqw.a(f, j2);
                    M.R(x);
                }
                y18Var = (y18) x;
                M.j();
            } else {
                iArr = iArr2;
                i4 = i7;
                M.K(994270705);
                M.j();
                y18Var = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            psv0 h = n34.q().h(toolButton$Mode, toolButton$Appearance, M, i4);
            float f2 = 0;
            int i11 = 224688 | i6;
            n34.q().getClass();
            M.K(1698054912);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1698054912, i11, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.elevation (MilkshakeToolButtonDefaults.kt:49)");
            }
            if (iArr[toolButton$Mode.ordinal()] == 1) {
                M.K(-256792118);
                bclVar = pp8.a(f2, f2, f2, f2, f2, M, 28086, 0);
                M.j();
            } else {
                M.K(629652541);
                M.j();
                bclVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            int i12 = (i3 & 14) | ((i3 >> 6) & 112) | i8 | ((i3 >> 12) & 7168) | (234881024 & (i3 << 12));
            int i13 = i3 >> 21;
            c(gzsVar, q630Var, z, sg50Var, mlg0Var, y18Var, null, bclVar, r5j0Var, h, s890Var, z2, jaiVar, M, i12, ((i3 >> 18) & 14) | (i13 & 112) | (i13 & 896) | 3072);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qsv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xsv0.b(gzs.this, toolButton$Mode, toolButton$Appearance, q630Var, r5j0Var, z, sg50Var, s890Var, z2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final gzs gzsVar, final q630 q630Var, final boolean z, final sg50 sg50Var, final buw buwVar, final y18 y18Var, frv0 frv0Var, final bcl bclVar, final r5j0 r5j0Var, final psv0 psv0Var, final s890 s890Var, final boolean z2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        buw buwVar2;
        int i4;
        boolean z3;
        androidx.compose.runtime.a aVar2;
        final frv0 frv0Var2;
        final frv0 frv0Var3;
        int i5;
        int i6;
        kq2 a;
        androidx.compose.runtime.a M = aVar.M(705853071);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(sg50Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            buwVar2 = buwVar;
            i3 |= M.J(buwVar2) ? 16384 : 8192;
        } else {
            buwVar2 = buwVar;
        }
        if ((i & 196608) == 0) {
            i3 |= M.J(y18Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.J(bclVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.J(r5j0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(psv0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.J(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(s890Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z3 = z2;
            i4 |= M.l(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.y(jaiVar) ? 2048 : 1024;
        }
        int i7 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                n34.q().getClass();
                M.K(-1935253594);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1935253594, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeToolButtonDefaults.textStyle (MilkshakeToolButtonDefaults.kt:31)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var4 = wuv0Var.d0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                frv0Var3 = frv0Var4;
                i5 = i3 & (-3670017);
            } else {
                M.h();
                i5 = i3 & (-3670017);
                frv0Var3 = frv0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(705853071, i5, i7, "com.vk.core.compose.component.VkToolButton (VkToolButton.kt:81)");
            }
            int i8 = i5 >> 6;
            int i9 = (i8 & 14) | ((i5 >> 24) & 112);
            final wh50 a2 = psv0Var.a(z, M, i9);
            psv0Var.getClass();
            M.K(-607428415);
            if (androidx.compose.runtime.b.d()) {
                i6 = i7;
                androidx.compose.runtime.b.f(-607428415, i9, -1, "com.vk.core.compose.component.button.tool.VkToolButtonColorsImpl.backgroundColor (ToolButtonDefaults.kt:142)");
            } else {
                i6 = i7;
            }
            wh50 f = bo.f(0, z ? psv0Var.a : psv0Var.c, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new y160(22);
                M.R(x);
            }
            q630 b = egi0.b(q630Var, false, (izs) x);
            long j = ((l5g) f.getValue()).a;
            long j2 = ((l5g) f.getValue()).a;
            if (bclVar == null) {
                M.K(-89689811);
                M.j();
                a = null;
            } else {
                M.K(-279987884);
                a = bclVar.a(z, sg50Var, M, (i8 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i5 >> 15) & 896));
                M.j();
            }
            final boolean z4 = z3;
            int i10 = i5 << 12;
            int i11 = (i6 & 14) | 48;
            aVar2 = M;
            uov0.b(gzsVar, b, r5j0Var, j, j2, y18Var, a != null ? ((pco) a.getValue()).b : 0, sg50Var, buwVar2, z, null, kai.c(-828325062, new wzs() { // from class: xsna.tsv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-828325062, intValue, -1, "com.vk.core.compose.component.VkToolButton.<anonymous> (VkToolButton.kt:98)");
                        }
                        pqo pqoVar = hfj.a;
                        mtk0 mtk0Var = mtk0.this;
                        rvi.b(new c9e0[]{pqoVar.b(Float.valueOf(l5g.e(((l5g) mtk0Var.getValue()).a))), vcl0.b(l5g.c(14, ((l5g) mtk0Var.getValue()).a, 1.0f), yfj.a)}, kai.c(1401874042, new io0(z4, frv0Var3, s890Var, jaiVar), aVar3), aVar3, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i5 << 21) & 1879048192) | (i5 & 14) | ((i5 >> 18) & 896) | (458752 & i5) | (29360128 & i10) | (i10 & 234881024), i11, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var2 = frv0Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            frv0Var2 = frv0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.usv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    xsv0.c(gzs.this, q630Var, z, sg50Var, buwVar, y18Var, frv0Var2, bclVar, r5j0Var, psv0Var, s890Var, z2, jaiVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final gzs gzsVar, final ToolButton$Mode toolButton$Mode, final ToolButton$Appearance toolButton$Appearance, final q630 q630Var, final ToolButton$TextPosition toolButton$TextPosition, r5j0 r5j0Var, final lg90 lg90Var, pco pcoVar, final String str, boolean z, s890 s890Var, boolean z2, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar2;
        final pco pcoVar2;
        final s890 s890Var2;
        final boolean z4;
        final sg50 sg50Var2;
        final boolean z5;
        final r5j0 r5j0Var2;
        androidx.compose.runtime.f s;
        final pco pcoVar3;
        u890 u890Var;
        int i9;
        s890 s890Var3;
        sg50 sg50Var3;
        boolean z6;
        int i10;
        androidx.compose.runtime.a M = aVar.M(501849495);
        if ((i & 6) == 0) {
            i4 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.o(toolButton$Mode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.o(toolButton$Appearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.o(toolButton$TextPosition == null ? -1 : toolButton$TextPosition.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= (2097152 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i11 = 12582912 | i4;
        int i12 = i3 & 256;
        if (i12 != 0) {
            i11 = 113246208 | i4;
        } else if ((100663296 & i) == 0) {
            i11 |= M.J(pcoVar) ? 67108864 : 33554432;
            if ((805306368 & i) != 0) {
                str2 = str;
                i11 |= M.J(str2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            } else {
                str2 = str;
            }
            i5 = i3 & 1024;
            if (i5 == 0) {
                z3 = z;
                i6 = i2 | 6;
            } else {
                z3 = z;
                if ((i2 & 6) == 0) {
                    i6 = i2 | (M.l(z3) ? 4 : 2);
                } else {
                    i6 = i2;
                }
            }
            int i13 = (i2 & 384) != 0 ? i6 | 176 : i6 | 48;
            i7 = i3 & 8192;
            if (i7 == 0) {
                i13 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i13 |= M.l(z2) ? 2048 : 1024;
                i8 = i13 | 24576;
                if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i8 & 9363) != 9362)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        uog0 uog0Var = (uog0) n34.q().a;
                        int i14 = (-458753) & i11;
                        pcoVar3 = i12 != 0 ? null : pcoVar;
                        if (i5 != 0) {
                            z3 = true;
                        }
                        do20 q = n34.q();
                        u890 u890Var2 = (u890) q.b;
                        r5j0Var = uog0Var;
                        int i15 = do20.a.$EnumSwitchMapping$0[toolButton$TextPosition.ordinal()];
                        if (i15 == 1) {
                            u890Var = (u890) q.c;
                        } else {
                            if (i15 != 2 && i15 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            u890Var = u890Var2;
                        }
                        int i16 = i8 & (-897);
                        boolean z7 = i7 == 0 ? z2 : false;
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(M);
                        }
                        i9 = i16;
                        s890Var3 = u890Var;
                        sg50Var3 = (sg50) x;
                        z6 = z7;
                        i10 = i14;
                    } else {
                        M.h();
                        int i17 = i11 & (-458753);
                        pcoVar3 = pcoVar;
                        s890Var3 = s890Var;
                        z6 = z2;
                        sg50Var3 = sg50Var;
                        i9 = i8 & (-897);
                        i10 = i17;
                    }
                    r5j0 r5j0Var3 = r5j0Var;
                    final boolean z8 = z3;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(501849495, i10, i9, "com.vk.core.compose.component.VkToolButton (VkToolButton.kt:252)");
                    }
                    final String str3 = str2;
                    int i18 = i9 << 15;
                    aVar2 = M;
                    b(gzsVar, toolButton$Mode, toolButton$Appearance, q630Var, r5j0Var3, z8, sg50Var3, s890Var3, z6, kai.c(323499348, new wzs() { // from class: xsna.vsv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(323499348, intValue, -1, "com.vk.core.compose.component.VkToolButton.<anonymous> (VkToolButton.kt:265)");
                                }
                                do20 q2 = n34.q();
                                ToolButton$Mode toolButton$Mode2 = ToolButton$Mode.this;
                                ToolButton$Appearance toolButton$Appearance2 = toolButton$Appearance;
                                xsv0.a(toolButton$Mode2, toolButton$Appearance2, q2.h(toolButton$Mode2, toolButton$Appearance2, aVar3, 0), z8, lg90Var, pcoVar3, str3, toolButton$TextPosition, aVar3, 32768);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, M), aVar2, (i10 & 8190) | (458752 & i18) | (i18 & 3670016) | ((i9 << 9) & 29360128) | ((i9 << 18) & 1879048192));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z5 = z8;
                    pcoVar2 = pcoVar3;
                    r5j0Var2 = r5j0Var3;
                    sg50Var2 = sg50Var3;
                    s890Var2 = s890Var3;
                    z4 = z6;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    pcoVar2 = pcoVar;
                    s890Var2 = s890Var;
                    z4 = z2;
                    sg50Var2 = sg50Var;
                    z5 = z3;
                    r5j0Var2 = r5j0Var;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.wsv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            int I2 = ne7.I(i2);
                            xsv0.d(gzs.this, toolButton$Mode, toolButton$Appearance, q630Var, toolButton$TextPosition, r5j0Var2, lg90Var, pcoVar2, str, z5, s890Var2, z4, sg50Var2, (androidx.compose.runtime.a) obj, I, I2, i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i13 | 24576;
            if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i8 & 9363) != 9362)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        if ((805306368 & i) != 0) {
        }
        i5 = i3 & 1024;
        if (i5 == 0) {
        }
        if ((i2 & 384) != 0) {
        }
        i7 = i3 & 8192;
        if (i7 == 0) {
        }
        i8 = i13 | 24576;
        if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i8 & 9363) != 9362)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
