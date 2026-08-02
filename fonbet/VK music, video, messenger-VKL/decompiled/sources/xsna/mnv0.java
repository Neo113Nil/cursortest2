package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.knv0;
import xsna.q630;

/* compiled from: VkSubnavigationButton.kt */
/* loaded from: classes17.dex */
public final class mnv0 {
    /* JADX WARN: Removed duplicated region for block: B:138:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final SubnavigationButtonSize subnavigationButtonSize, final SubnavigationButtonMode subnavigationButtonMode, final SubnavigationBarAppearance subnavigationBarAppearance, final boolean z, final gzs gzsVar, final q630 q630Var, final String str, lg90 lg90Var, uum0 uum0Var, Integer num, boolean z2, boolean z3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var2;
        final uum0 uum0Var2;
        final Integer num2;
        final boolean z4;
        final boolean z5;
        androidx.compose.runtime.f s;
        float f;
        boolean z6;
        long j;
        lg90 lg90Var3;
        long j2;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        lg90 lg90Var4;
        int i14;
        int i15;
        String str3;
        float f2;
        uum0 uum0Var3;
        hxj hxjVar;
        int i16;
        ?? r11;
        long j3;
        boolean z7;
        boolean z8;
        char c;
        long j4;
        ColorFilter porterDuffColorFilter;
        long j5;
        androidx.compose.runtime.a M = aVar.M(230130957);
        if ((i & 6) == 0) {
            i3 = (M.o(subnavigationButtonSize.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(subnavigationButtonMode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.o(subnavigationBarAppearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i17 = i2 & 128;
        int i18 = 12582912;
        if (i17 == 0) {
            if ((i & 12582912) == 0) {
                i18 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= (i & 134217728) == 0 ? M.J(uum0Var) : M.y(uum0Var) ? 67108864 : 33554432;
            }
            i5 = i2 & 512;
            if (i5 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= M.J(num) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            int i19 = i2 & 1024;
            boolean z9 = z2;
            int i20 = i19 == 0 ? 6 : M.l(z9) ? 4 : 2;
            i6 = i2 & 2048;
            if (i6 == 0) {
                i8 = i20 | 48;
                i7 = i6;
            } else {
                i7 = i6;
                i8 = i20 | (M.l(z3) ? 32 : 16);
            }
            i9 = i8;
            if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i9 & 19) != 18)) {
                aVar2 = M;
                aVar2.h();
                lg90Var2 = lg90Var;
                uum0Var2 = uum0Var;
                num2 = num;
                z4 = z3;
                z5 = z9;
            } else {
                lg90 lg90Var5 = i17 != 0 ? null : lg90Var;
                uum0 uum0Var4 = i4 != 0 ? null : uum0Var;
                Integer num3 = i5 != 0 ? null : num;
                if (i19 != 0) {
                    z9 = false;
                }
                boolean z10 = i7 != 0 ? true : z3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(230130957, i3, i9, "com.vk.core.compose.component.subnavigation.VkSubnavigationButton (VkSubnavigationButton.kt:51)");
                }
                float f3 = knv0.a;
                int i21 = knv0.a.$EnumSwitchMapping$2[subnavigationButtonSize.ordinal()];
                if (i21 == 1) {
                    f = kqu0.k;
                } else if (i21 == 2) {
                    f = kqu0.j;
                } else {
                    if (i21 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = kqu0.i;
                }
                int i22 = i3 & 112;
                int i23 = i3 & 896;
                int i24 = ((i3 >> 9) & 14) | 3072 | i22 | i23;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1150544198, i24, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationButtonDefaults.getBorderColor (VkSubnavigationButtonDefaults.kt:31)");
                }
                if (z) {
                    M.K(2023387558);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z6 = z10;
                    j = ylu0Var.d().a;
                    M.j();
                } else {
                    z6 = z10;
                    M.K(2023454828);
                    int i25 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                    if (i25 == 1 || i25 == 2 || i25 == 3) {
                        M.K(1866393873);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.d().a;
                        M.j();
                    } else {
                        if (i25 != 4) {
                            throw alb0.c(1866388358, M);
                        }
                        M.K(1866396470);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.r().b;
                        M.j();
                    }
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    lg90Var3 = lg90Var5;
                    androidx.compose.runtime.b.f(538461768, i24, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationButtonDefaults.getBackgroundColor (VkSubnavigationButtonDefaults.kt:50)");
                } else {
                    lg90Var3 = lg90Var5;
                }
                if (z) {
                    M.K(-388079541);
                    int i26 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                    if (i26 == 1) {
                        M.K(-388032700);
                        int i27 = knv0.a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
                        if (i27 == 1) {
                            M.K(2065695782);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var4.getBackground().o;
                            M.j();
                        } else {
                            if (i27 != 2) {
                                throw alb0.c(2065692798, M);
                            }
                            M.K(2065699294);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var5.getBackground().d;
                            M.j();
                        }
                        M.j();
                    } else if (i26 == 2) {
                        M.K(-387738076);
                        int i28 = knv0.a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
                        if (i28 == 1) {
                            M.K(2065705286);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var6.getBackground().A;
                            M.j();
                        } else {
                            if (i28 != 2) {
                                throw alb0.c(2065702302, M);
                            }
                            M.K(2065708798);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var7.getBackground().d;
                            M.j();
                        }
                        M.j();
                    } else if (i26 == 3) {
                        M.K(2065721465);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var8 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var8.d().b;
                        M.j();
                    } else {
                        if (i26 != 4) {
                            throw alb0.c(2065691591, M);
                        }
                        M.K(-387445808);
                        int i29 = knv0.a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
                        if (i29 == 1) {
                            M.K(2065714745);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var9 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var9.d().b;
                            M.j();
                        } else {
                            if (i29 != 2) {
                                throw alb0.c(2065711730, M);
                            }
                            M.K(2065717854);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var10 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var10.getBackground().d;
                            M.j();
                        }
                        M.j();
                    }
                    M.j();
                } else {
                    M.K(-387094423);
                    int i30 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                    if (i30 == 1) {
                        M.K(2065725824);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var11 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var11.getBackground().n;
                        M.j();
                    } else if (i30 == 2) {
                        M.K(2065729024);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var12 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var12.getBackground().z;
                        M.j();
                    } else {
                        if (i30 != 3 && i30 != 4) {
                            throw alb0.c(2065723369, M);
                        }
                        M.K(2065733651);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var13 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var13.d().a;
                        M.j();
                    }
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (!z) {
                    int i31 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                    i10 = 1;
                    if (i31 != 1) {
                        if (i31 != 2 && i31 != 3 && i31 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    float f4 = i10;
                    q630 h = txj0.h(s200.F(knv0.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), f);
                    uog0 uog0Var = knv0.e;
                    q630 c2 = ojc.c(rte0.d(hr80.m(r18.a(knv0.d, j, a5j0.b(h, f4, uog0Var, false, 0L, 0L, 24), uog0Var), j2, uog0Var), uog0Var), z6, null, null, gzsVar, 14);
                    boolean z11 = z6;
                    q630 a = o19.a(c2, !z11 ? 1.0f : 0.64f);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c3 = qri.c(M, a);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() != null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c3, dVar);
                    float f5 = knv0.f;
                    q630.a aVar4 = q630.a.a;
                    boolean z12 = z9;
                    q630 F = s200.F(knv0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.d(txj0.x(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), 1.0f));
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.l, M, 54);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c4 = qri.c(M, F);
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
                    k9q0.w(M, a2, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c4, dVar);
                    if (lg90Var3 != null) {
                        M.K(1672921546);
                        q630 F2 = s200.F(knv0.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1208602158, i24, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationButtonDefaults.getLeftIconTint (VkSubnavigationButtonDefaults.kt:110)");
                        }
                        if (z) {
                            M.K(-755825733);
                            int i32 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                            if (i32 == 1 || i32 == 2) {
                                c = 3;
                            } else {
                                c = 3;
                                if (i32 == 3) {
                                    M.K(-1825483076);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var14 = (ylu0) M.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j6 = ylu0Var14.getIcon().a;
                                    M.j();
                                    j5 = j6;
                                    M.j();
                                    j4 = j5;
                                } else if (i32 != 4) {
                                    throw alb0.c(-1825496489, M);
                                }
                            }
                            M.K(-755672066);
                            int i33 = knv0.a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
                            if (i33 == 1) {
                                M.K(-1825486084);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var15 = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j5 = ylu0Var15.getIcon().a;
                                M.j();
                            } else {
                                if (i33 != 2) {
                                    throw alb0.c(-1825491836, M);
                                }
                                M.K(-1825489052);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var16 = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j5 = ylu0Var16.getIcon().e;
                                M.j();
                            }
                            M.j();
                            M.j();
                            j4 = j5;
                        } else {
                            c = 3;
                            M.K(-755367646);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var17 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j4 = ylu0Var17.getIcon().a;
                            M.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i12 = i24;
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j4), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j4), z42.b(5));
                        }
                        oe7 oe7Var = new oe7(j4, 5, porterDuffColorFilter);
                        int i34 = 440 | ((i3 >> 21) & 14);
                        i13 = i23;
                        aVar2 = M;
                        str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        i11 = i3;
                        lg90 lg90Var6 = lg90Var3;
                        i14 = 1;
                        i15 = 2;
                        vjw.a(lg90Var6, null, F2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, aVar2, i34, 56);
                        lg90Var4 = lg90Var6;
                    } else {
                        i11 = i3;
                        str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        i12 = i24;
                        i13 = i23;
                        lg90Var4 = lg90Var3;
                        i14 = 1;
                        i15 = 2;
                        aVar2 = M;
                        aVar2.K(1669621131);
                    }
                    aVar2.j();
                    if (str != null) {
                        aVar2.K(1673342557);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1303966018, i12, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationButtonDefaults.getLabelColor (VkSubnavigationButtonDefaults.kt:132)");
                        }
                        if (z) {
                            aVar2.K(1527769037);
                            int i35 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                            if (i35 != i14 && i35 != i15) {
                                if (i35 == 3) {
                                    aVar2.K(1019127945);
                                    if (androidx.compose.runtime.b.d()) {
                                        z8 = false;
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                                    } else {
                                        z8 = false;
                                    }
                                    ylu0 ylu0Var18 = (ylu0) aVar2.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    j3 = ylu0Var18.getText().m;
                                    aVar2.j();
                                    z7 = z8;
                                    aVar2.j();
                                    r11 = z7;
                                } else if (i35 != 4) {
                                    throw alb0.c(1019114501, aVar2);
                                }
                            }
                            z7 = false;
                            aVar2.K(1527922673);
                            int i36 = knv0.a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
                            if (i36 == i14) {
                                aVar2.K(1019124905);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                                }
                                ylu0 ylu0Var19 = (ylu0) aVar2.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j3 = ylu0Var19.getText().m;
                                aVar2.j();
                            } else {
                                if (i36 != i15) {
                                    throw alb0.c(1019119153, aVar2);
                                }
                                aVar2.K(1019121936);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                                }
                                ylu0 ylu0Var20 = (ylu0) aVar2.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j3 = ylu0Var20.getText().e;
                                aVar2.j();
                            }
                            aVar2.j();
                            aVar2.j();
                            r11 = z7;
                        } else {
                            r11 = 0;
                            aVar2.K(1528229077);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                            }
                            ylu0 ylu0Var21 = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j3 = ylu0Var21.getText().m;
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, r11, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.d0;
                        q630 F3 = s200.F(knv0.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i15, aVar4);
                        androidx.compose.runtime.a aVar5 = aVar2;
                        if (z12) {
                            if ((((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? i14 : r11) == 0) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            F3 = defpackage.j0.d(1.0f, F3, r11);
                        }
                        str3 = str2;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        yqv0.c(str, F3, j3, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar5, ((i11 >> 18) & 14) | 100663296, 48, 5880);
                        aVar2 = aVar5;
                    } else {
                        str3 = str2;
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        aVar2.K(1669621131);
                    }
                    aVar2.j();
                    if (num3 != null) {
                        aVar2.K(1673990395);
                        int intValue = num3.intValue();
                        CounterSize counterSize = CounterSize.Small;
                        q630 F4 = s200.F(knv0.c, f2, i15, aVar4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-660859110, i12, -1, "com.vk.core.compose.component.subnavigation.VkSubnavigationButtonDefaults.getCounterColors (VkSubnavigationButtonDefaults.kt:154)");
                        }
                        if (z) {
                            aVar2.K(476590142);
                            int i37 = knv0.a.$EnumSwitchMapping$0[subnavigationButtonMode.ordinal()];
                            if (i37 != 1 && i37 != i15) {
                                if (i37 == 3) {
                                    aVar2.K(569586097);
                                    String str4 = str3;
                                    if (androidx.compose.runtime.b.d()) {
                                        i16 = 0;
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, str4);
                                    } else {
                                        i16 = 0;
                                    }
                                    iyk0 iyk0Var = rrv0.a;
                                    ylu0 ylu0Var22 = (ylu0) aVar2.r(iyk0Var);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j7 = ylu0Var22.getBackground().d;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, i16, -1, str4);
                                    }
                                    ylu0 ylu0Var23 = (ylu0) aVar2.r(iyk0Var);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    hxjVar = new hxj(j7, ylu0Var23.getText().e);
                                    aVar2.j();
                                    aVar2.j();
                                } else if (i37 != 4) {
                                    throw alb0.c(569563508, aVar2);
                                }
                            }
                            String str5 = str3;
                            aVar2.K(476739066);
                            int i38 = knv0.a.$EnumSwitchMapping$1[subnavigationBarAppearance.ordinal()];
                            if (i38 == 1) {
                                aVar2.K(569577821);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str5);
                                }
                                iyk0 iyk0Var2 = rrv0.a;
                                ylu0 ylu0Var24 = (ylu0) aVar2.r(iyk0Var2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j8 = ylu0Var24.getBackground().d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str5);
                                }
                                ylu0 ylu0Var25 = (ylu0) aVar2.r(iyk0Var2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                hxjVar = new hxj(j8, ylu0Var25.getText().e);
                                aVar2.j();
                            } else {
                                if (i38 != i15) {
                                    throw alb0.c(569568008, aVar2);
                                }
                                aVar2.K(569570006);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str5);
                                }
                                iyk0 iyk0Var3 = rrv0.a;
                                ylu0 ylu0Var26 = (ylu0) aVar2.r(iyk0Var3);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j9 = ylu0Var26.getBackground().g;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, str5);
                                }
                                ylu0 ylu0Var27 = (ylu0) aVar2.r(iyk0Var3);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                hxjVar = new hxj(j9, ylu0Var27.getText().c);
                                aVar2.j();
                            }
                            aVar2.j();
                            aVar2.j();
                        } else {
                            String str6 = str3;
                            aVar2.K(477503309);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str6);
                            }
                            iyk0 iyk0Var4 = rrv0.a;
                            ylu0 ylu0Var28 = (ylu0) aVar2.r(iyk0Var4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j10 = ylu0Var28.getBackground().d;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str6);
                            }
                            ylu0 ylu0Var29 = (ylu0) aVar2.r(iyk0Var4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            hxjVar = new hxj(j10, ylu0Var29.getText().e);
                            aVar2.j();
                        }
                        hxj hxjVar2 = hxjVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar6 = aVar2;
                        nou0.b(intValue, counterSize, F4, null, hxjVar2, false, aVar6, ((i11 >> 27) & 14) | Tensorflow.FRAME_WIDTH, 40);
                        aVar2 = aVar6;
                    } else {
                        aVar2.K(1669621131);
                    }
                    aVar2.j();
                    if (uum0Var4 == null) {
                        aVar2.K(1674371570);
                        aVar2.j();
                        uum0Var3 = uum0Var4;
                    } else {
                        aVar2.K(1023843311);
                        uum0 uum0Var5 = uum0Var4;
                        uum0Var5.a(i22 | 6 | i13 | ((i11 >> 15) & 7168), aVar2, subnavigationBarAppearance, subnavigationButtonMode, s200.F(knv0.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i15, aVar4));
                        uum0Var3 = uum0Var5;
                        aVar2.j();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    if (kr.f(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                    uum0Var2 = uum0Var3;
                    num2 = num3;
                    z4 = z11;
                    z5 = z12;
                    lg90Var2 = lg90Var4;
                }
                i10 = 0;
                float f42 = i10;
                q630 h2 = txj0.h(s200.F(knv0.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), f);
                uog0 uog0Var2 = knv0.e;
                q630 c22 = ojc.c(rte0.d(hr80.m(r18.a(knv0.d, j, a5j0.b(h2, f42, uog0Var2, false, 0L, 0L, 24), uog0Var2), j2, uog0Var2), uog0Var2), z6, null, null, gzsVar, 14);
                boolean z112 = z6;
                q630 a3 = o19.a(c22, !z112 ? 1.0f : 0.64f);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c32 = qri.c(M, a3);
                cri.h7.getClass();
                LayoutNode.a aVar32 = cri.a.b;
                if (M.N() != null) {
                }
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.lnv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        mnv0.a(SubnavigationButtonSize.this, subnavigationButtonMode, subnavigationBarAppearance, z, gzsVar, q630Var, str, lg90Var2, uum0Var2, num2, z5, z4, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        i3 |= i18;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        i5 = i2 & 512;
        if (i5 == 0) {
        }
        int i192 = i2 & 1024;
        boolean z92 = z2;
        if (i192 == 0) {
        }
        i6 = i2 & 2048;
        if (i6 == 0) {
        }
        i9 = i8;
        if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i9 & 19) != 18)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
