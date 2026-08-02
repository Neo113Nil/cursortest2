package xsna;

import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.q8z;
import xsna.us2;

/* compiled from: VideoDescriptionDelegate.kt */
/* loaded from: classes2.dex */
public final class ves0 {
    public static final void a(String str, String str2, Long l, c4 c4Var, boolean z, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        frv0 frv0Var;
        frv0 frv0Var2;
        androidx.compose.runtime.a M = aVar.M(-1607930246);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(l) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(c4Var) : M.y(c4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1607930246, i2, -1, "com.vk.libvideo.bottomsheet.about.delegate.ArchivalContentRow (VideoDescriptionDelegate.kt:464)");
            }
            if (z) {
                M.K(-79446051);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.s0;
                M.j();
            } else {
                M.K(-79397443);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.i0;
                M.j();
            }
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                us2.b bVar = new us2.b();
                s0x.a(bVar, "archive_icon", "�");
                bVar.g("  ");
                bVar.g(str);
                if (str2 != null) {
                    bVar.g("  ·  ");
                    bVar.g(str2);
                }
                x = bVar.n();
                M.R(x);
            }
            us2 us2Var = (us2) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = on00.f(new Pair("archive_icon", new r0x(new esa0(l2l0.l(16), l2l0.l(16), 7), nmi.a)));
                M.R(x2);
            }
            Map map = (Map) x2;
            if (androidx.compose.runtime.b.d()) {
                frv0Var2 = frv0Var;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                frv0Var2 = frv0Var;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x3;
            boolean z3 = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && M.y(c4Var))) | ((i2 & 896) == 256);
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new ni0(26, c4Var, l);
                M.R(x4);
            }
            aVar2 = M;
            yqv0.d(us2Var, ojc.b(q630Var, sg50Var, null, false, null, (gzs) x4, 28), j, 0, null, 2, false, 1, null, map, frv0Var2, aVar2, 100663296, 6, 2808);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new kv90(str, str2, l, c4Var, z, q630Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02f4, code lost:
    
        if (r4 == r3) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final n2m n2mVar, final c4 c4Var, final yzs yzsVar, final wzs wzsVar, final izs izsVar, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        frv0 frv0Var;
        int i2;
        float f;
        q630.a aVar2;
        int i3;
        a.C0011a.C0012a c0012a;
        int i4;
        q630.a aVar3;
        a.C0011a.C0012a c0012a2;
        ArrayList arrayList = n2mVar.l;
        boolean z = n2mVar.n;
        androidx.compose.runtime.a M = aVar.M(1667494016);
        int i5 = i | (M.J(n2mVar) ? 4 : 2) | (M.J(c4Var) ? 32 : 16) | (M.y(yzsVar) ? 256 : 128) | (M.y(wzsVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | (M.y(izsVar2) ? 131072 : 65536) | 1572864;
        if (M.t(i5 & 1, (599187 & i5) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1667494016, i5, -1, "com.vk.libvideo.bottomsheet.about.delegate.DescriptionContent (VideoDescriptionDelegate.kt:298)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f2 = txj0.f(aVar4, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x == c0012a3) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            boolean z2 = (i5 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a3) {
                x2 = new kcj0(c4Var, 16);
                M.R(x2);
            }
            q630 b = ojc.b(f2, sg50Var, null, false, null, (gzs) x2, 28);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.h(aVar4, 5), M, 6);
            if (z) {
                M.K(-460824293);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.E;
                M.j();
            } else {
                M.K(-460769516);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.p;
                M.j();
            }
            frv0 frv0Var2 = frv0Var;
            String str = n2mVar.a;
            float f3 = kqu0.b;
            yqv0.c(str, s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, M, 0, 0, 8184);
            if (n2mVar.c) {
                M.K(-460420890);
                f9t.e(txj0.h(aVar4, z ? 8 : 2), M, 0);
                if (n2mVar.d) {
                    M.K(-460274446);
                    c(n2mVar.e, izsVar2, s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), M, (i5 >> 12) & 112);
                    M.j();
                    aVar2 = aVar4;
                    i2 = -473963860;
                    f = f3;
                } else {
                    if (n2mVar.b.length() > 0) {
                        M.K(-459952232);
                        f = f3;
                        aVar2 = aVar4;
                        i2 = -473963860;
                        yqv0.c(n2mVar.b, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663296, 48, 5880);
                    } else {
                        aVar2 = aVar4;
                        i2 = -473963860;
                        f = f3;
                        M.K(-473963860);
                    }
                    M.j();
                }
            } else {
                i2 = -473963860;
                f = f3;
                aVar2 = aVar4;
                M.K(-473963860);
            }
            M.j();
            d(n2mVar, izsVar, null, M, (i5 & 14) | ((i5 >> 9) & 112));
            if (!n2mVar.h || n2mVar.i.length() <= 0) {
                i3 = i2;
                c0012a = c0012a3;
                i4 = i5;
                aVar3 = aVar2;
                M.K(i3);
            } else {
                M.K(-459365154);
                q630.a aVar6 = aVar2;
                f9t.e(txj0.h(aVar6, kqu0.r), M, 0);
                aVar3 = aVar6;
                c0012a = c0012a3;
                i3 = i2;
                i4 = i5;
                a(n2mVar.i, n2mVar.j, n2mVar.k, c4Var, n2mVar.n, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar6), M, (i5 << 6) & 7168);
            }
            M.j();
            if (arrayList.isEmpty()) {
                M.K(i3);
            } else {
                M.K(-458830156);
                LinkedHashMap linkedHashMap = n2mVar.m;
                boolean J = M.J(arrayList) | M.y(linkedHashMap) | ((i4 & 896) == 256);
                Object x3 = M.x();
                if (J) {
                    c0012a2 = c0012a;
                } else {
                    c0012a2 = c0012a;
                }
                x3 = new lq5(arrayList, linkedHashMap, yzsVar, 5);
                M.R(x3);
                izs izsVar3 = (izs) x3;
                boolean y = M.y(linkedHashMap) | ((i4 & 7168) == 2048);
                Object x4 = M.x();
                if (y || x4 == c0012a2) {
                    x4 = new btl0(2, linkedHashMap, wzsVar);
                    M.R(x4);
                }
                n2s0.b(arrayList, izsVar3, (izs) x4, null, M, 0);
            }
            M.j();
            q630.a aVar7 = aVar3;
            boolean c2 = xga0.c(aVar7, kqu0.u, M, 0);
            q630Var2 = aVar7;
            if (c2) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar7;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(c4Var, yzsVar, wzsVar, izsVar, izsVar2, q630Var2, i) { // from class: xsna.tes0
                public final /* synthetic */ c4 c;
                public final /* synthetic */ yzs d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ izs g;
                public final /* synthetic */ q630 h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ves0.b(n2m.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(90248988);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(90248988, i3, -1, "com.vk.libvideo.bottomsheet.about.delegate.LiveTimer (VideoDescriptionDelegate.kt:435)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Integer valueOf = Integer.valueOf(i);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new ues0(i, rg50Var, null);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, i4);
            String O = d370.O(R.string.vk_live_on_broadcast, new Object[]{(String) izsVar.invoke(Integer.valueOf(rg50Var.getIntValue()))}, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(O, q630Var, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar2, (i3 >> 3) & 112, 48, 6136);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ses0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    ves0.c(i, izsVar, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(n2m n2mVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1269462529);
        int i2 = (i & 6) == 0 ? i | (M.J(n2mVar) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1269462529, i3, -1, "com.vk.libvideo.bottomsheet.about.delegate.TrendingContent (VideoDescriptionDelegate.kt:390)");
            }
            Spanned spanned = n2mVar.f;
            q630.a aVar3 = q630.a.a;
            if (spanned == null) {
                M.K(1371371952);
                M.j();
                aVar2 = M;
            } else {
                M.K(1371371953);
                boolean J = M.J(spanned) | M.p(n2mVar.g);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb.append(spanned.toString());
                    URLSpan[] uRLSpanArr = (URLSpan[]) spanned.getSpans(0, spanned.length(), URLSpan.class);
                    int length = uRLSpanArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        URLSpan uRLSpan = uRLSpanArr[i4];
                        arrayList.add(new us2.b.a(spanned.getSpanStart(uRLSpan), spanned.getSpanEnd(uRLSpan), 8, new q8z.b(uRLSpan.getURL(), null, new ypm0(1, uRLSpan, izsVar), 2)));
                        i4++;
                        sb = sb;
                    }
                    StringBuilder sb2 = sb;
                    for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spanned.getSpans(0, spanned.length(), ForegroundColorSpan.class)) {
                        arrayList.add(new us2.b.a(spanned.getSpanStart(foregroundColorSpan), spanned.getSpanEnd(foregroundColorSpan), 8, new hik0(n2mVar.g, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534)));
                    }
                    String sb3 = sb2.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList2.add(((us2.b.a) arrayList.get(i5)).a(sb2.length()));
                    }
                    x = new us2(sb3, arrayList2);
                    M.R(x);
                }
                us2 us2Var = (us2) x;
                if (a690.d(aVar3, kqu0.p, M, 0)) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.i0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.d(us2Var, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), ylu0Var.getText().p, 0, null, 2, false, 2, null, null, frv0Var, aVar2, 100663296, 6, 6904);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ijl(i, 6, n2mVar, izsVar, q630Var2);
        }
    }
}
