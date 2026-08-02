package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.DiagonalUserStackSize;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import xsna.cri;
import xsna.dt1;
import xsna.pzq0;
import xsna.q630;
import xsna.xcc;

/* compiled from: VkUserStack.kt */
/* loaded from: classes17.dex */
public final class hyv0 {
    public static final void a(final szq0 szq0Var, final frv0 frv0Var, final xcc.a aVar, final float f, final float f2, final float f3, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        float f4;
        androidx.compose.runtime.a M = aVar2.M(2116371477);
        if ((i & 6) == 0) {
            i2 = (M.J(szq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final frv0 frv0Var2 = frv0Var;
        if ((i & 48) == 0) {
            i2 |= M.J(frv0Var2) ? 32 : 16;
        }
        xcc.a aVar3 = aVar;
        if ((i & 384) == 0) {
            i2 |= M.J(aVar3) ? 256 : 128;
        }
        final float f5 = f;
        if ((i & 3072) == 0) {
            i2 |= M.n(f5) ? 2048 : 1024;
        }
        float f6 = f2;
        if ((i & 24576) == 0) {
            i2 |= M.n(f6) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            f4 = f3;
            i2 |= M.n(f4) ? 131072 : 65536;
        } else {
            f4 = f3;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2116371477, i2, -1, "com.vk.core.compose.component.InternalContent (VkUserStack.kt:220)");
            }
            ListIterator<pzq0> listIterator = szq0Var.b.listIterator();
            while (true) {
                duk0 duk0Var = (duk0) listIterator;
                if (duk0Var.hasNext()) {
                    Object next = duk0Var.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    pzq0 pzq0Var = (pzq0) next;
                    if (pzq0Var instanceof pzq0.a) {
                        M.K(1188988152);
                        final int i5 = i3;
                        final float f7 = f6;
                        final xcc.a aVar4 = aVar3;
                        final float f8 = f4;
                        ((pzq0.a) pzq0Var).a.invoke(kai.c(250417164, new yzs() { // from class: xsna.eyv0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                lg90 lg90Var = (lg90) obj;
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= (intValue & 8) == 0 ? aVar5.J(lg90Var) : aVar5.y(lg90Var) ? 4 : 2;
                                }
                                if (aVar5.t(intValue & 1, (intValue & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(250417164, intValue, -1, "com.vk.core.compose.component.InternalContent.<anonymous>.<anonymous> (VkUserStack.kt:225)");
                                    }
                                    float f9 = byv0.a;
                                    int h = e43.h(szq0.this.b);
                                    int i6 = i5;
                                    float f10 = f5;
                                    float f11 = f7;
                                    float f12 = f8;
                                    xcc.a aVar6 = aVar4;
                                    q630 d = rte0.d(txj0.q(hyv0.g(aVar6, f12, f11, i6), f12), byv0.e(i6, h, f10, f11, f12, aVar6, aVar5, 1572864));
                                    float f13 = byv0.d;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    y18 a = aqw.a(f13, ylu0Var.getImage().a);
                                    vjw.a(lg90Var, null, r18.b(a.a, a.b, d, f870.A().e(0, aVar5)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar5, 56 | (intValue & 14), 120);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar5.h();
                                }
                                return s3q0.a;
                            }
                        }, M), M, 6);
                        M.j();
                    } else {
                        final int i6 = i3;
                        if (!(pzq0Var instanceof pzq0.b)) {
                            throw alb0.c(1700923006, M);
                        }
                        M.K(1190412106);
                        ((pzq0.b) pzq0Var).a.invoke(kai.c(-1103368431, new yzs() { // from class: xsna.fyv0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int intValue = ((Integer) obj).intValue();
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar5.o(intValue) ? 4 : 2;
                                }
                                if (aVar5.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1103368431, intValue2, -1, "com.vk.core.compose.component.InternalContent.<anonymous>.<anonymous> (VkUserStack.kt:257)");
                                    }
                                    float f9 = byv0.a;
                                    int h = e43.h(szq0Var.b);
                                    int i7 = i6;
                                    float f10 = f;
                                    float f11 = f2;
                                    float f12 = f3;
                                    xcc.a aVar6 = aVar;
                                    r5j0 e = byv0.e(i7, h, f10, f11, f12, aVar6, aVar5, 1572864);
                                    aVar5.K(519888723);
                                    q630 d = rte0.d(txj0.x(f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(hyv0.g(aVar6, f12, f11, i7), f12)), e);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(2111872032, 6, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.counterBackgroundColor (VkUserStackDefaults.kt:102)");
                                    }
                                    aVar5.K(2098911017);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    iyk0 iyk0Var = rrv0.a;
                                    ylu0 ylu0Var = (ylu0) aVar5.r(iyk0Var);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j = ylu0Var.getIcon().l;
                                    aVar5.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    q630 m = hr80.m(d, j, androidx.compose.ui.graphics.e.a);
                                    aVar5.j();
                                    dt1.a.getClass();
                                    cp10 d2 = ja8.d(dt1.a.f, false);
                                    int hashCode = Long.hashCode(n34.n(aVar5));
                                    sy90 D = aVar5.D();
                                    q630 c = qri.c(aVar5, m);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar7 = cri.a.b;
                                    if (aVar5.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar5.H();
                                    if (aVar5.L()) {
                                        aVar5.I(aVar7);
                                    } else {
                                        aVar5.f();
                                    }
                                    k9q0.w(aVar5, d2, cri.a.f);
                                    k9q0.w(aVar5, D, cri.a.e);
                                    k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(aVar5, cri.a.h);
                                    k9q0.w(aVar5, c, cri.a.d);
                                    q630 F = s200.F(kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
                                    String a = lhg.a(intValue, "+");
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1021727745, 6, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.counterTextColor (VkUserStackDefaults.kt:110)");
                                    }
                                    aVar5.K(-141837815);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var2 = (ylu0) aVar5.r(iyk0Var);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j2 = ylu0Var2.getText().d;
                                    aVar5.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    yqv0.c(a, F, j2, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var2, aVar5, 0, 0, 8120);
                                    aVar5.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar5.h();
                                }
                                return s3q0.a;
                            }
                        }, M), M, 6);
                        M.j();
                    }
                    frv0Var2 = frv0Var;
                    aVar3 = aVar;
                    f5 = f;
                    f6 = f2;
                    f4 = f3;
                    i3 = i4;
                } else if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gyv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hyv0.a(szq0Var, frv0Var, aVar, f, f2, f3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(q630 q630Var, final DiagonalUserStackSize diagonalUserStackSize, final xcc.a.d dVar, final izs<? super rzq0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        xcc.a.d dVar2;
        final q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-1841909131);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(diagonalUserStackSize == null ? -1 : diagonalUserStackSize.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            dVar2 = dVar;
            i3 |= M.J(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1841909131, i3, -1, "com.vk.core.compose.component.VkDiagonalUserStack (VkUserStack.kt:91)");
            }
            float f = byv0.a;
            frv0 b = byv0.b(UserStackSize.Medium, M, 54);
            float f2 = aqu0.a;
            int i5 = i3 >> 3;
            int i6 = (i5 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(835143051, i6, -1, "com.vk.core.compose.component.defaults.VkDiagonalUserStackDefaults.border (VkDiagonalUserStackDefaults.kt:44)");
            }
            float f3 = (float) 1.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-748113614, i6, -1, "com.vk.core.compose.component.defaults.VkDiagonalUserStackDefaults.offset (VkDiagonalUserStackDefaults.kt:32)");
            }
            M.K(-467030295);
            float a = aqu0.a(diagonalUserStackSize, i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) / 2;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i7 = (i3 & 14) | (i5 & 112) | ((i3 << 9) & 3670016);
            q630 q630Var5 = q630Var4;
            f(q630Var5, dVar2, b, f3, a, aqu0.a(diagonalUserStackSize, i6), izsVar, M, i7, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var5;
        } else {
            M.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cyv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hyv0.b(q630.this, diagonalUserStackSize, dVar, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(q630 q630Var, UserStackSize userStackSize, xcc.a.AbstractC3993a abstractC3993a, izs<? super rzq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        xcc.a.AbstractC3993a abstractC3993a2;
        int i4;
        int i5;
        UserStackSize userStackSize2;
        q630 q630Var3;
        xcc.a.AbstractC3993a abstractC3993a3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        xcc.a.AbstractC3993a c;
        androidx.compose.runtime.a M = aVar.M(2025790841);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = i | (M.J(q630Var2) ? 4 : 2);
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.o(userStackSize == null ? -1 : userStackSize.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            abstractC3993a2 = abstractC3993a;
            if (M.J(abstractC3993a2)) {
                i4 = 256;
                i5 = i3 | i4 | (!M.y(izsVar) ? 2048 : 1024);
                if (M.t(i5 & 1, (i5 & 1171) == 1170)) {
                    M.h();
                    userStackSize2 = userStackSize;
                    q630Var3 = q630Var2;
                    abstractC3993a3 = abstractC3993a2;
                } else {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                        UserStackSize userStackSize3 = i7 != 0 ? UserStackSize.Medium : userStackSize;
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                            userStackSize2 = userStackSize3;
                            c = byv0.c();
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2025790841, i5, -1, "com.vk.core.compose.component.VkMiniUserStack (VkUserStack.kt:67)");
                            }
                            int i8 = i5 >> 3;
                            int i9 = (i8 & 14) | 48;
                            int i10 = i5;
                            f(q630Var4, c, byv0.b(userStackSize2, M, i9), byv0.a(userStackSize2, i9), byv0.d(userStackSize2, i9), byv0.f(userStackSize2, i9), izsVar, M, (i8 & 112) | (i10 & 14) | ((i10 << 9) & 3670016), 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            abstractC3993a3 = c;
                        } else {
                            userStackSize2 = userStackSize3;
                        }
                    } else {
                        M.h();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                        userStackSize2 = userStackSize;
                        q630Var4 = q630Var2;
                    }
                    c = abstractC3993a2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    int i82 = i5 >> 3;
                    int i92 = (i82 & 14) | 48;
                    int i102 = i5;
                    f(q630Var4, c, byv0.b(userStackSize2, M, i92), byv0.a(userStackSize2, i92), byv0.d(userStackSize2, i92), byv0.f(userStackSize2, i92), izsVar, M, (i82 & 112) | (i102 & 14) | ((i102 << 9) & 3670016), 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var3 = q630Var4;
                    abstractC3993a3 = c;
                }
                s = M.s();
                if (s == null) {
                    s.d = new asa0(q630Var3, userStackSize2, abstractC3993a3, izsVar, i, i2);
                    return;
                }
                return;
            }
        } else {
            abstractC3993a2 = abstractC3993a;
        }
        i4 = 128;
        i5 = i3 | i4 | (!M.y(izsVar) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(q630 q630Var, UserStackSize userStackSize, xcc.a.AbstractC3993a abstractC3993a, us2 us2Var, izs<? super rzq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        xcc.a.AbstractC3993a abstractC3993a2;
        us2 us2Var2;
        q630 q630Var3;
        xcc.a.AbstractC3993a abstractC3993a3;
        us2 us2Var3;
        androidx.compose.runtime.f s;
        xcc.a.AbstractC3993a abstractC3993a4;
        xcc.a.AbstractC3993a abstractC3993a5;
        us2 us2Var4;
        us2 us2Var5;
        int i4;
        androidx.compose.runtime.a M = aVar.M(916938291);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(userStackSize == null ? -1 : userStackSize.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                abstractC3993a2 = abstractC3993a;
                if (M.J(abstractC3993a2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                abstractC3993a2 = abstractC3993a;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            abstractC3993a2 = abstractC3993a;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            us2Var2 = us2Var;
            i3 |= M.J(us2Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.y(izsVar) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
                abstractC3993a3 = abstractC3993a2;
                us2Var3 = us2Var2;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    q630Var3 = i5 != 0 ? q630.a.a : q630Var2;
                    if ((i2 & 4) != 0) {
                        abstractC3993a4 = byv0.c();
                        i3 &= -897;
                    } else {
                        abstractC3993a4 = abstractC3993a2;
                    }
                    if (i6 != 0) {
                        abstractC3993a5 = abstractC3993a4;
                        us2Var4 = null;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(916938291, i3, -1, "com.vk.core.compose.component.VkUserStack (VkUserStack.kt:147)");
                        }
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        float f = byv0.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1772044043, 6, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.descriptionPadding (VkUserStackDefaults.kt:126)");
                        }
                        float f2 = kqu0.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a.j g = androidx.compose.foundation.layout.a.g(kqu0.u);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 48);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c = qri.c(M, q630Var3);
                        cri.h7.getClass();
                        LayoutNode.a aVar2 = cri.a.b;
                        if (M.N() != null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar2);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a, cri.a.f);
                        k9q0.w(M, D, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c, cri.a.d);
                        int i7 = i3 >> 3;
                        int i8 = (i7 & 14) | 48;
                        f(null, abstractC3993a5, byv0.b(userStackSize, M, i8), byv0.a(userStackSize, i8), byv0.d(userStackSize, i8), byv0.f(userStackSize, i8), izsVar, M, (i7 & 112) | ((i3 << 6) & 3670016), 1);
                        xcc.a.AbstractC3993a abstractC3993a6 = abstractC3993a5;
                        if (us2Var4 == null) {
                            M.K(-120130699);
                            M.j();
                            us2Var5 = us2Var4;
                        } else {
                            M.K(-120130698);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1611079075, 6, -1, "com.vk.core.compose.component.defaults.VkUserStackDefaults.descriptionTextStyle (VkUserStackDefaults.kt:118)");
                            }
                            M.K(-602665044);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            frv0 frv0Var = wuv0Var.i0;
                            M.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            us2Var5 = us2Var4;
                            yqv0.d(us2Var5, null, ylu0Var.getText().p, 0, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8186);
                            M = M;
                            M.j();
                        }
                        M.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        us2Var3 = us2Var5;
                        abstractC3993a3 = abstractC3993a6;
                    } else {
                        abstractC3993a5 = abstractC3993a4;
                    }
                } else {
                    M.h();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    q630Var3 = q630Var2;
                    abstractC3993a5 = abstractC3993a2;
                }
                us2Var4 = us2Var2;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                }
                a.l lVar2 = androidx.compose.foundation.layout.a.a;
                float f3 = byv0.a;
                if (androidx.compose.runtime.b.d()) {
                }
                float f22 = kqu0.a;
                if (androidx.compose.runtime.b.d()) {
                }
                a.j g2 = androidx.compose.foundation.layout.a.g(kqu0.u);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g2, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, q630Var3);
                cri.h7.getClass();
                LayoutNode.a aVar22 = cri.a.b;
                if (M.N() != null) {
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new hvp0(q630Var3, userStackSize, abstractC3993a3, us2Var3, izsVar, i, i2);
                return;
            }
            return;
        }
        us2Var2 = us2Var;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void e(q630 q630Var, UserStackSize userStackSize, xcc.a.AbstractC3993a abstractC3993a, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1657566863);
        int i2 = i | 48 | (M.o(userStackSize == null ? -1 : userStackSize.ordinal()) ? 256 : 128) | (M.J(abstractC3993a) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var = q630.a.a;
            } else {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1657566863, i2, -1, "com.vk.core.compose.component.VkUserStack (VkUserStack.kt:120)");
            }
            us2 e = ws2.e("Description");
            int i3 = ((i2 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | (i2 & 57344);
            q630 q630Var3 = q630Var;
            d(q630Var3, userStackSize, abstractC3993a, e, izsVar, M, i3, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lxs(q630Var2, userStackSize, abstractC3993a, izsVar, i);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void f(q630 q630Var, xcc.a aVar, frv0 frv0Var, float f, float f2, final float f3, final izs<? super rzq0, s3q0> izsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        xcc.a aVar3;
        frv0 frv0Var2;
        float f4;
        float f5;
        final q630 q630Var3;
        final xcc.a aVar4;
        final frv0 frv0Var3;
        final float f6;
        final float f7;
        xcc.a aVar5;
        frv0 frv0Var4;
        xcc.a aVar6;
        frv0 frv0Var5;
        uh50 C;
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar2.M(-1896221094);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                aVar3 = aVar;
                if (M.J(aVar3)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                aVar3 = aVar;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            aVar3 = aVar;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                frv0Var2 = frv0Var;
                if (M.J(frv0Var2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                frv0Var2 = frv0Var;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            frv0Var2 = frv0Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f4 = f;
                if (M.n(f4)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                f4 = f;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            f4 = f;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f5 = f2;
                if (M.n(f5)) {
                    i4 = 16384;
                    i3 |= i4;
                }
            } else {
                f5 = f2;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            f5 = f2;
        }
        if ((196608 & i) == 0) {
            i3 |= M.n(f3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var3 = i8 != 0 ? q630.a.a : q630Var2;
                if ((i2 & 2) != 0) {
                    aVar5 = byv0.c();
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                } else {
                    aVar5 = aVar3;
                }
                if ((i2 & 4) != 0) {
                    float f8 = byv0.a;
                    frv0Var4 = byv0.b(UserStackSize.Medium, M, 54);
                    i3 &= -897;
                } else {
                    frv0Var4 = frv0Var2;
                }
                if ((i2 & 8) != 0) {
                    float f9 = byv0.a;
                    i3 &= -7169;
                    f4 = byv0.a(UserStackSize.Medium, 54);
                }
                if ((i2 & 16) != 0) {
                    float f10 = byv0.a;
                    i3 &= -57345;
                    f5 = byv0.d(UserStackSize.Medium, 54);
                }
                aVar6 = aVar5;
                frv0Var5 = frv0Var4;
            } else {
                M.h();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                q630Var3 = q630Var2;
                aVar6 = aVar3;
                frv0Var5 = frv0Var2;
            }
            float f11 = f5;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1896221094, i3, -1, "com.vk.core.compose.component.VkUserStack (VkUserStack.kt:191)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new szq0();
                M.R(x);
            }
            szq0 szq0Var = (szq0) x;
            szq0Var.a.clear();
            izsVar.invoke(szq0Var);
            ArrayList arrayList = szq0Var.a;
            SnapshotStateList<pzq0> snapshotStateList = szq0Var.b;
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                try {
                    snapshotStateList.clear();
                    snapshotStateList.addAll(arrayList);
                    arrayList.clear();
                    s3q0 s3q0Var = s3q0.a;
                    C.w().a();
                    C.c();
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.h, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, q630Var3);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar7);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    float f12 = f4;
                    a(szq0Var, frv0Var5, aVar6, f12, f11, f3, M, ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3));
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0Var3 = frv0Var5;
                    aVar4 = aVar6;
                    f6 = f12;
                    f7 = f11;
                } finally {
                    dak0.q(j2);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C.c();
                    throw th2;
                }
            }
        } else {
            M.h();
            q630Var3 = q630Var2;
            aVar4 = aVar3;
            frv0Var3 = frv0Var2;
            f6 = f4;
            f7 = f5;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dyv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hyv0.f(q630.this, aVar4, frv0Var3, f6, f7, f3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 g(xcc.a aVar, float f, float f2, int i) {
        boolean z = aVar instanceof xcc.a.d;
        q630.a aVar2 = q630.a.a;
        if (z) {
            float f3 = (f - f2) * i;
            return s200.H(aVar2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 6);
        }
        if (aVar instanceof xcc.a.f) {
            return s200.H(aVar2, (f - f2) * i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
        }
        if (aVar instanceof xcc.a.j) {
            return s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f - f2) * i, 7);
        }
        throw new NoWhenBranchMatchedException();
    }
}
