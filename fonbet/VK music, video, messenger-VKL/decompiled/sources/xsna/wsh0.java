package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: SearchFilterComposeViews.kt */
/* loaded from: classes5.dex */
public final class wsh0 {
    public static final void a(String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1039885494);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1039885494, i2, -1, "com.vk.search.params.impl.presentation.modal.ApplyButton (SearchFilterComposeViews.kt:81)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, ahn.E(s200.H(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "search_filters_apply_button"), null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | X2.b.f, (i2 << 6) & 896, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n85(str, gzsVar, i, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void b(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, final wzs wzsVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-633072245);
        int i2 = 256;
        int i3 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128);
        boolean z = 0;
        boolean z2 = true;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            int i4 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-633072245, i3, -1, "com.vk.search.params.impl.presentation.modal.DropDown (SearchFilterComposeViews.kt:151)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 1.0f;
            q630 E = ahn.E(txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.max(list.size() * 44, 300), 1, txj0.f(aVar3, 1.0f)), "search_filters_dropdown_content");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, 243814050, list);
            final int i5 = 0;
            while (a2.hasNext()) {
                final Object next = a2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                q630 f2 = txj0.f(aVar3, f);
                boolean o = ((i3 & 896) == i2 ? z2 : z) | M.o(i5) | M.y(next);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new gzs() { // from class: xsna.ssh0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            Object obj = next;
                            wzs.this.invoke(Integer.valueOf(i5), obj);
                            return s3q0.a;
                        }
                    };
                    M.R(x);
                }
                q630 E2 = s200.E(ojc.c(f2, false, null, null, (gzs) x, 15), kqu0.b, kqu0.v);
                String str = (String) izsVar.invoke(next);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, z, i4, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.c0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, z, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar5 = M;
                yqv0.c(str, E2, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar5, 0, 0, 8184);
                M = aVar5;
                i5 = i6;
                z2 = z2;
                i2 = i2;
                f = f;
                i4 = i4;
                z = z;
                i3 = i3;
            }
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new g6i(list, izsVar, wzsVar, i, 4);
        }
    }

    public static final void c(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, final gzs gzsVar2, q630 q630Var, final boolean z) {
        final q630 q630Var2;
        com.vk.core.compose.component.topbar.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1156452116);
        int i2 = i | (M.J(str) ? 4 : 2) | 48 | (M.l(z) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1156452116, i2, -1, "com.vk.search.params.impl.presentation.modal.FilterHeader (SearchFilterComposeViews.kt:41)");
            }
            q630.a aVar3 = q630.a.a;
            q630Var2 = aVar3;
            q630 E = ahn.E(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "search_filters_top_bar_container");
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new sux(27);
                M.R(x);
            }
            TopBar$Before.d a = TopBar$Before.d.a.a("", gzsVar, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, ((i2 >> 6) & 112) | 24582, 4);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new y510(21);
                M.R(x2);
            }
            TopBar$Middle.Text.Title a2 = TopBar$Middle.Text.Title.b.a(str, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, (i2 & 14) | 196608, 14);
            androidx.compose.runtime.a aVar4 = M;
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(a2, null, null, null, aVar4, 14);
            if (z) {
                aVar4.K(-1931348142);
                String N = d370.N(R.string.vk_discover_search_params_clear, 0, aVar4);
                Object x3 = aVar4.x();
                if (x3 == c0012a) {
                    x3 = new n9w(23);
                    aVar4.R(x3);
                }
                d.c.b a4 = d.c.b.a.a(N, gzsVar2, true, 1.0f, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar4, ((i2 >> 9) & 112) | 200064, 0);
                aVar4 = aVar4;
                com.vk.core.compose.component.topbar.a a5 = d.a.a(a4, null, null, null, aVar4, 24576, 14);
                aVar4.j();
                aVar2 = a5;
            } else {
                aVar4.K(-1930876943);
                aVar4.j();
                aVar2 = null;
            }
            androidx.compose.runtime.a aVar5 = aVar4;
            muv0.h(a3, E, null, null, null, a, aVar2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 0, 0, 8092);
            M = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, str, gzsVar, gzsVar2, q630Var2, z) { // from class: xsna.ush0
                public final /* synthetic */ String b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;

                {
                    this.b = str;
                    this.c = q630Var2;
                    this.d = z;
                    this.e = gzsVar;
                    this.f = gzsVar2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wsh0.c(ne7.I(1), (androidx.compose.runtime.a) obj, this.b, this.e, this.f, this.c, this.d);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void d(final String str, final List<? extends T> list, final izs<? super T, String> izsVar, final wzs<? super Integer, ? super T, s3q0> wzsVar, q630 q630Var, final String str2, final String str3, boolean z, String str4, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        String str5;
        int i4;
        boolean z2;
        int i5;
        androidx.compose.runtime.a aVar2;
        final String str6;
        final q630 q630Var3;
        final boolean z3;
        androidx.compose.runtime.f s;
        long j;
        long j2;
        androidx.compose.runtime.a M = aVar.M(612099753);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(wzsVar) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 16384 : 8192;
            if ((i & 196608) != 0) {
                str5 = str2;
                i3 |= M.J(str5) ? 131072 : 65536;
            } else {
                str5 = str2;
            }
            if ((1572864 & i) == 0) {
                i3 |= M.J(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                z2 = z;
                i3 |= M.l(z2) ? 8388608 : 4194304;
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= M.J(str4) ? 67108864 : 33554432;
                }
                if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                    if (i6 != 0) {
                        q630Var2 = q630.a.a;
                    }
                    boolean z4 = i4 != 0 ? true : z2;
                    String str7 = i5 != 0 ? "" : str4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(612099753, i3, -1, "com.vk.search.params.impl.presentation.modal.SearchSelect (SearchFilterComposeViews.kt:107)");
                    }
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.FALSE);
                        M.R(x);
                    }
                    final wh50 wh50Var = (wh50) x;
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    long j3 = wlb0.h(M).getText().m;
                    if (str5.length() == 0 || str2.equals(str3)) {
                        j = j3;
                        j2 = gub0.a(M, -1366565616, M).p;
                        M.j();
                    } else {
                        j = j3;
                        j2 = gub0.a(M, -1366487310, M).m;
                        M.j();
                    }
                    boolean z5 = z4;
                    boolean z6 = (234881024 & i3) == 67108864;
                    Object x2 = M.x();
                    if (z6 || x2 == c0012a) {
                        x2 = new ov80(str7, 1);
                        M.R(x2);
                    }
                    String str8 = str7;
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new riy(1, wh50Var);
                        M.R(x3);
                    }
                    int i7 = i3 >> 15;
                    int i8 = i3 >> 9;
                    u2x a2 = g8s.b.a.a(s2x.b.a.b(str5, booleanValue, (izs) x3, str3, null, j2, j, a, kai.c(-1124478146, new yzs() { // from class: xsna.vsh0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1124478146, intValue, -1, "com.vk.search.params.impl.presentation.modal.SearchSelect.<anonymous> (SearchFilterComposeViews.kt:127)");
                                }
                                wzs wzsVar2 = wzsVar;
                                boolean J = aVar3.J(wzsVar2);
                                Object x4 = aVar3.x();
                                if (J || x4 == a.C0011a.a) {
                                    x4 = new x78(5, wzsVar2, wh50Var);
                                    aVar3.R(x4);
                                }
                                wsh0.b(0, aVar3, list, izsVar, (wzs) x4);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, (i7 & 14) | 384 | (i8 & 7168), Sdk.SDKError.Reason.AD_EXPIRED_VALUE), InputSelect$State.Default, z5, null, M, (i7 & 896) | 24624, 8);
                    aVar2 = M;
                    q630 q630Var4 = q630Var2;
                    nvu0.a(a2, q630Var4, h8s.a.a(str, false, null, null, null, aVar2, (i3 & 14) | 196608, 30), null, null, aVar2, i8 & 112, 24);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str6 = str8;
                    z3 = z5;
                    q630Var3 = q630Var4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    str6 = str4;
                    q630Var3 = q630Var2;
                    z3 = z2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.tsh0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wsh0.d(str, list, izsVar, wzsVar, q630Var3, str2, str3, z3, str6, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 196608) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
