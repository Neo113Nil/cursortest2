package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkCheckbox.kt */
/* loaded from: classes17.dex */
public final class eku0 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ToggleableState toggleableState, final gzs<s3q0> gzsVar, q630 q630Var, final boolean z, sg50 sg50Var, u1c u1cVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gzs<s3q0> gzsVar2;
        q630 q630Var2;
        boolean z2;
        int i4;
        sg50 sg50Var2;
        u1c u1cVar2;
        final q630 q630Var3;
        final sg50 sg50Var3;
        final u1c u1cVar3;
        androidx.compose.runtime.f s;
        sg50 sg50Var4;
        q630 q630Var4;
        sg50 sg50Var5;
        u1c a;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1963658144);
        if ((i & 6) == 0) {
            i3 = (M.o(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                z2 = z;
                i3 |= M.l(z2) ? 2048 : 1024;
            } else {
                z2 = z;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                sg50Var2 = sg50Var;
                i3 |= M.J(sg50Var2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        u1cVar2 = u1cVar;
                        if (M.J(u1cVar2)) {
                            i5 = 131072;
                            i3 |= i5;
                        }
                    } else {
                        u1cVar2 = u1cVar;
                    }
                    i5 = 65536;
                    i3 |= i5;
                } else {
                    u1cVar2 = u1cVar;
                }
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var5 = i6 != 0 ? q630.a.a : q630Var2;
                        if (i4 != 0) {
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = ir.h(M);
                            }
                            sg50Var4 = (sg50) x;
                        } else {
                            sg50Var4 = sg50Var2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            q630Var4 = q630Var5;
                            sg50Var5 = sg50Var4;
                            a = i35.g().a(0L, 0L, M, 31);
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1963658144, i3, -1, "com.vk.core.compose.component.VkCheckbox (VkCheckbox.kt:75)");
                            }
                            int i7 = i3 << 6;
                            kh2.a(toggleableState, gzsVar2, a, 24, q630Var4, z2, false, sg50Var5, M, (i3 & 14) | 3072 | (i3 & 112) | ((i3 >> 9) & 896) | (57344 & i7) | (i7 & 458752) | ((i3 << 9) & 29360128), 64);
                            M = M;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            u1cVar3 = a;
                            q630Var3 = q630Var4;
                            sg50Var3 = sg50Var5;
                        } else {
                            q630Var4 = q630Var5;
                            sg50Var5 = sg50Var4;
                        }
                    } else {
                        M.h();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        q630Var4 = q630Var2;
                        sg50Var5 = sg50Var2;
                    }
                    a = u1cVar2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    int i72 = i3 << 6;
                    kh2.a(toggleableState, gzsVar2, a, 24, q630Var4, z2, false, sg50Var5, M, (i3 & 14) | 3072 | (i3 & 112) | ((i3 >> 9) & 896) | (57344 & i72) | (i72 & 458752) | ((i3 << 9) & 29360128), 64);
                    M = M;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    u1cVar3 = a;
                    q630Var3 = q630Var4;
                    sg50Var3 = sg50Var5;
                } else {
                    M.h();
                    q630Var3 = q630Var2;
                    sg50Var3 = sg50Var2;
                    u1cVar3 = u1cVar2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.cku0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            eku0.a(ToggleableState.this, gzsVar, q630Var3, z, sg50Var3, u1cVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            sg50Var2 = sg50Var;
            if ((196608 & i) == 0) {
            }
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
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
        sg50Var2 = sg50Var;
        if ((196608 & i) == 0) {
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final gzs<s3q0> gzsVar, q630 q630Var, final boolean z, boolean z2, sg50 sg50Var, u1c u1cVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        final sg50 sg50Var2;
        final u1c u1cVar2;
        androidx.compose.runtime.f s;
        boolean z4;
        sg50 sg50Var3;
        u1c u1cVar3;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-834941933);
        if ((i & 6) == 0) {
            i3 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i3 | (!M.l(z) ? 256 : 128) | 93184;
            if (M.t(i4 & 1, (74899 & i4) == 74898)) {
                aVar2 = M;
                aVar2.h();
                z3 = z2;
                sg50Var2 = sg50Var;
                u1cVar2 = u1cVar;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    q630 q630Var3 = i6 != 0 ? q630.a.a : q630Var2;
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var4 = (sg50) x;
                    hcl a = i35.g().a(0L, 0L, M, 31);
                    M = M;
                    z4 = true;
                    q630Var2 = q630Var3;
                    sg50Var3 = sg50Var4;
                    u1cVar3 = a;
                    i5 = i4 & (-458753);
                } else {
                    M.h();
                    i5 = i4 & (-458753);
                    z4 = z2;
                    sg50Var3 = sg50Var;
                    u1cVar3 = u1cVar;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-834941933, i5, -1, "com.vk.core.compose.component.VkCheckbox (VkCheckbox.kt:50)");
                }
                a(jgz.d(z), gzsVar, q630Var2, z4, sg50Var3, u1cVar3, M, ((i5 << 3) & 1008) | 27648, 0);
                u1c u1cVar4 = u1cVar3;
                aVar2 = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                u1cVar2 = u1cVar4;
                z3 = z4;
                sg50Var2 = sg50Var3;
            }
            final q630 q630Var4 = q630Var2;
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.dku0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        eku0.b(gzs.this, q630Var4, z, z3, sg50Var2, u1cVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i3 | (!M.l(z) ? 256 : 128) | 93184;
        if (M.t(i4 & 1, (74899 & i4) == 74898)) {
        }
        final q630 q630Var42 = q630Var2;
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, final ToggleableState toggleableState, final gzs<s3q0> gzsVar, final q630 q630Var, final String str2, final boolean z, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gzs<s3q0> gzsVar2;
        boolean z3;
        androidx.compose.runtime.a aVar2;
        final boolean z4;
        androidx.compose.runtime.f s;
        int i4;
        String str3;
        ty6.b bVar;
        cri.a.b bVar2;
        androidx.compose.runtime.a aVar3;
        boolean z5;
        int i5;
        cri.a.e eVar;
        q630.a aVar4;
        int i6;
        cri.a.C2678a c2678a;
        String str4;
        androidx.compose.runtime.a M = aVar.M(1718381239);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.o(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.l(z) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z3 = z2;
            i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            if (M.t(i3 & 1, (599187 & i3) == 599186)) {
                aVar2 = M;
                aVar2.h();
                z4 = z3;
            } else {
                boolean z6 = i7 != 0 ? false : z3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1718381239, i3, -1, "com.vk.core.compose.component.VkCheckboxItem (VkCheckbox.kt:133)");
                }
                q630 C = s200.C(d1p0.b(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) i35.g().c(str2 != null, M).getValue()).b, 1, txj0.f(q630Var, 1.0f)), toggleableState, z, new plg0(1), gzsVar2, 8), i35.g().a);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new ev60(21);
                    M.R(x);
                }
                q630 b = egi0.b(C, true, (izs) x);
                dt1.a.getClass();
                ty6.b bVar3 = dt1.a.l;
                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar3, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, b);
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
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, a, cVar);
                cri.a.e eVar2 = cri.a.e;
                k9q0.w(M, D, eVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar4 = cri.a.g;
                k9q0.w(M, valueOf, bVar4);
                cri.a.C2678a c2678a2 = cri.a.h;
                k9q0.t(M, c2678a2);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                q630.a aVar6 = q630.a.a;
                if (z6) {
                    i4 = i3;
                    str3 = "com.vk.core.compose.component.defaults.CheckboxDefaults.itemCheckboxSpace (VkCheckboxDefaults.kt:47)";
                    bVar = bVar3;
                    bVar2 = bVar4;
                    aVar3 = M;
                    z5 = false;
                    i5 = -1;
                    eVar = eVar2;
                    aVar4 = aVar6;
                    i6 = 1576765759;
                    c2678a = c2678a2;
                    aVar3.K(293908679);
                    aVar3.j();
                } else {
                    M.K(298615657);
                    int i8 = ((i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i3 >> 6) & 7168);
                    bVar2 = bVar4;
                    str3 = "com.vk.core.compose.component.defaults.CheckboxDefaults.itemCheckboxSpace (VkCheckboxDefaults.kt:47)";
                    bVar = bVar3;
                    i5 = -1;
                    eVar = eVar2;
                    c2678a = c2678a2;
                    i4 = i3;
                    i6 = 1576765759;
                    a(toggleableState, gzsVar, null, z, null, null, M, i8, 52);
                    aVar3 = M;
                    i35.g().getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1576765759, 6, -1, str3);
                    }
                    float f = kqu0.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4 = aVar6;
                    z5 = false;
                    mq.d(aVar4, kqu0.v, aVar3, 0);
                }
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i35.g().c, 1, new xpy(1.0f, true));
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(i35.g().b, bVar), dt1.a.n, aVar3, 48);
                int hashCode2 = Long.hashCode(n34.n(aVar3));
                sy90 D2 = aVar3.D();
                q630 c2 = qri.c(aVar3, F);
                if (aVar3.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar3.H();
                if (aVar3.L()) {
                    aVar3.I(aVar5);
                } else {
                    aVar3.f();
                }
                k9q0.w(aVar3, a2, cVar);
                k9q0.w(aVar3, D2, eVar);
                ur.d(hashCode2, aVar3, bVar2, aVar3, c2678a);
                k9q0.w(aVar3, c2, dVar);
                i35.g().getClass();
                frv0 e = v1c.e(z5, aVar3);
                i35.g().getClass();
                boolean z7 = !z;
                q630.a aVar7 = aVar4;
                androidx.compose.runtime.a aVar8 = aVar3;
                yqv0.c(str, null, zjq.g(v1c.d(z5, aVar3), z7), null, null, 0, 0, null, 0, false, 0, 0, null, e, aVar8, i4 & 14, 0, 8186);
                aVar2 = aVar8;
                if (str2 != null) {
                    aVar2.K(805402478);
                    i35.g().getClass();
                    frv0 e2 = v1c.e(true, aVar2);
                    i35.g().getClass();
                    str4 = str3;
                    yqv0.c(str2, null, zjq.g(v1c.d(true, aVar2), z7), null, null, 0, 0, null, 0, false, 0, 0, null, e2, aVar2, (i4 >> 12) & 14, 0, 8186);
                    aVar2 = aVar2;
                } else {
                    str4 = str3;
                    aVar2.K(799814449);
                }
                aVar2.j();
                aVar2.G();
                if (z6) {
                    aVar2.K(299826858);
                    i35.g().getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(i6, 6, i5, str4);
                    }
                    float f2 = kqu0.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    f9t.e(txj0.v(aVar7, kqu0.v), aVar2, 0);
                    a(toggleableState, gzsVar, null, z, null, null, aVar2, ((i4 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 >> 6) & 7168), 52);
                } else {
                    aVar2.K(293908679);
                }
                aVar2.j();
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z4 = z6;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.bku0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        eku0.c(str, toggleableState, gzsVar, q630Var, str2, z, z4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if (M.t(i3 & 1, (599187 & i3) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, final gzs<s3q0> gzsVar, q630 q630Var, final boolean z, String str2, boolean z2, boolean z3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        boolean z4;
        int i4;
        String str3;
        int i5;
        int i6;
        androidx.compose.runtime.a aVar2;
        final boolean z5;
        final q630 q630Var3;
        final String str4;
        final boolean z6;
        androidx.compose.runtime.f s;
        int i7;
        String str5;
        androidx.compose.runtime.a M = aVar.M(-2103681628);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                z4 = z;
                i3 |= M.l(z4) ? 2048 : 1024;
            } else {
                z4 = z;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str2;
                i3 |= M.J(str3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    i3 |= M.l(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                            q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                            if (i4 != 0) {
                                str5 = null;
                                i7 = i6;
                            } else {
                                i7 = i6;
                                str5 = str3;
                            }
                            boolean z7 = i5 != 0 ? true : z2;
                            boolean z8 = i7 != 0 ? false : z3;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-2103681628, i3, -1, "com.vk.core.compose.component.VkCheckboxItem (VkCheckbox.kt:106)");
                            }
                            int i9 = i3 << 3;
                            aVar2 = M;
                            c(str, jgz.d(z4), gzsVar, q630Var4, str5, z7, z8, aVar2, (i3 & 14) | (i9 & 896) | (i9 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            str4 = str5;
                            z5 = z7;
                            z6 = z8;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            z5 = z2;
                            q630Var3 = q630Var2;
                            str4 = str3;
                            z6 = z3;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.aku0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    eku0.d(str, gzsVar, q630Var3, z, str4, z5, z6, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            str3 = str2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
