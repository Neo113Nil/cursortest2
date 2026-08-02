package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.t7z;

/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public final class gtg {
    /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final frv0 frv0Var, final long j, q630 q630Var, frv0 frv0Var2, long j2, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        frv0 frv0Var3;
        long j3;
        int i4;
        Throwable th;
        boolean z2;
        int i5;
        final boolean z3;
        final long j4;
        androidx.compose.runtime.a aVar2;
        final frv0 frv0Var4;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        int i6;
        int i7;
        boolean z4;
        q630 q630Var4;
        int i8;
        int i9;
        androidx.compose.runtime.a M = aVar.M(-2008674934);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(frv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.p(j) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= M.J(null) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    frv0Var3 = frv0Var2;
                    if (M.J(frv0Var3)) {
                        i9 = 131072;
                        i3 |= i9;
                    }
                } else {
                    frv0Var3 = frv0Var2;
                }
                i9 = 65536;
                i3 |= i9;
            } else {
                frv0Var3 = frv0Var2;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    j3 = j2;
                    if (M.p(j3)) {
                        i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i3 |= i8;
                    }
                } else {
                    j3 = j2;
                }
                i8 = 524288;
                i3 |= i8;
            } else {
                j3 = j2;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                th = null;
                z2 = z;
            } else {
                th = null;
                z2 = z;
                if ((i & 12582912) == 0) {
                    i3 |= M.l(z2) ? 8388608 : 4194304;
                }
            }
            i5 = i3;
            if (M.t(i5 & 1, (i3 & 4793491) == 4793490)) {
                M.h();
                z3 = z2;
                j4 = j3;
                aVar2 = M;
                frv0Var4 = frv0Var3;
                q630Var3 = q630Var2;
            } else {
                M.V();
                int i11 = i & 1;
                q630.a aVar3 = q630.a.a;
                if (i11 == 0 || M.i()) {
                    if (i10 != 0) {
                        q630Var2 = aVar3;
                    }
                    if ((i2 & 32) != 0) {
                        i6 = i5 & (-458753);
                        frv0Var3 = frv0Var;
                    } else {
                        i6 = i5;
                    }
                    if ((i2 & 64) != 0) {
                        i6 &= -3670017;
                        j3 = j;
                    }
                    if (i4 != 0) {
                        i7 = i6;
                        z4 = false;
                        q630Var4 = q630Var2;
                        long j5 = j3;
                        frv0 frv0Var5 = frv0Var3;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2008674934, i7, -1, "com.vk.community.design.view.components.compose.CommunityCardTextLine (CommunityCard.kt:335)");
                        }
                        t7z t7zVar = new t7z(t7z.a.b, 0, 0);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c = qri.c(M, q630Var4);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (M.N() != null) {
                            n34.r();
                            throw th;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar4);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a, cri.a.f);
                        k9q0.w(M, D, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c, cri.a.d);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        yqv0.c(str, new xpy(1.0f, false), j, null, null, 0, 0, t7zVar, 2, false, 0, 1, null, frv0Var, M, (i7 & 14) | 100663296 | (i7 & 896), ((i7 << 6) & 7168) | 48, 5752);
                        if (z4) {
                            M.K(-635474490);
                            qzu0.a.getClass();
                            lg90 C1 = qzu0.C1(M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            pzu0.b(C1, null, s200.H(aVar3, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), ylu0Var.getIcon().a, M, 56, 0);
                        } else {
                            M.K(-646039724);
                        }
                        M.j();
                        M.K(-635187524);
                        M.j();
                        M.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        aVar2 = M;
                        frv0Var4 = frv0Var5;
                        j4 = j5;
                        z3 = z4;
                    }
                } else {
                    M.h();
                    i6 = (i2 & 32) != 0 ? i5 & (-458753) : i5;
                    if ((i2 & 64) != 0) {
                        i6 &= -3670017;
                    }
                }
                i7 = i6;
                q630Var4 = q630Var2;
                z4 = z2;
                long j52 = j3;
                frv0 frv0Var52 = frv0Var3;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                }
                t7z t7zVar2 = new t7z(t7z.a.b, 0, 0);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, q630Var4);
                cri.h7.getClass();
                LayoutNode.a aVar42 = cri.a.b;
                if (M.N() != null) {
                }
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ftg
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gtg.a(str, frv0Var, j, q630Var3, frv0Var4, j4, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i2 & 16) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i5 = i3;
        if (M.t(i5 & 1, (i3 & 4793491) == 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
