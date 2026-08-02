package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.fpv0;
import xsna.q630;
import xsna.ty6;

/* compiled from: TabBarScreenContent.kt */
/* loaded from: classes18.dex */
public final class dsn0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        rg50 rg50Var;
        wh50 wh50Var;
        rg50 rg50Var2;
        androidx.compose.runtime.a M = aVar.M(1993499913);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1993499913, i2, -1, "com.vk.design.demo.presentation.screens.TabBarScreenContent.Content (TabBarScreenContent.kt:41)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var3 = (rg50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.i.a(4);
                M.R(x2);
            }
            rg50 rg50Var4 = (rg50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new wow(e43.l(Integer.valueOf(R.drawable.vk_icon_lego_home_28), Integer.valueOf(R.drawable.vk_icon_lego_search_filled_28), Integer.valueOf(R.drawable.vk_icon_lego_bubble_text_28), Integer.valueOf(R.drawable.vk_icon_lego_menu_28)));
                M.R(x4);
            }
            List list = ((wow) x4).b;
            Object x5 = M.x();
            if (x5 == obj) {
                Object wowVar = new wow(e43.l(Integer.valueOf(R.drawable.vk_icon_lego_music_28), Integer.valueOf(R.drawable.vk_icon_lego_logo_clips_28)));
                M.R(wowVar);
                x5 = wowVar;
            }
            List list2 = ((wow) x5).b;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Tab Bar", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            djn0.a(false, true, M, 438, 0);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, txj0.z(txj0.f(aVar3, 1.0f), null, 3));
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f2 = 16;
            yqv0.c("Selected tab: " + rg50Var3.getIntValue(), s200.E(aVar3, f2, 12), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 48, 0, 16380);
            yqv0.c("Tab count: " + rg50Var4.getIntValue(), s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 48, 0, 16380);
            float intValue = (float) rg50Var4.getIntValue();
            awf awfVar = new awf(4.0f, 6.0f);
            q630 F2 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            Object x6 = M.x();
            if (x6 == obj) {
                rg50Var = rg50Var4;
                x6 = new n3b0(rg50Var, 17);
                M.R(x6);
            } else {
                rg50Var = rg50Var4;
            }
            rg50 rg50Var5 = rg50Var;
            hkv0.c(intValue, (izs) x6, F2, false, null, awfVar, 2, null, M, 1573296, InterfaceC4413l1.a.b.h);
            boolean booleanValue = ((Boolean) wh50Var2.getValue()).booleanValue();
            q630 F3 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
            Object x7 = M.x();
            if (x7 == obj) {
                wh50Var = wh50Var2;
                x7 = new uc8(5, wh50Var);
                M.R(x7);
            } else {
                wh50Var = wh50Var2;
            }
            zov0.b(booleanValue, "Avatar border", (izs) x7, F3, null, false, false, M, X2.b.f, 112);
            Object x8 = M.x();
            if (x8 == obj) {
                rg50Var2 = rg50Var3;
                x8 = new hb40(rg50Var2, 24);
                M.R(x8);
            } else {
                rg50Var2 = rg50Var3;
            }
            b((izs) x8, rg50Var2.getIntValue(), rg50Var5.getIntValue(), list, list2, ((Boolean) wh50Var.getValue()).booleanValue(), M, (3670016 & (i4 << 3)) | 27654);
            aVar2 = M;
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rft(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final izs izsVar, final int i, final int i2, final List list, final List list2, final boolean z, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        List list3;
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(240460952);
        if ((i3 & 6) == 0) {
            i4 = (M.y(izsVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.J(list) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            list3 = list2;
            i4 |= M.J(list3) ? 16384 : 8192;
        } else {
            list3 = list2;
        }
        if ((196608 & i3) == 0) {
            z2 = z;
            i4 |= M.l(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if (M.t(i4 & 1, (i4 & 74899) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(240460952, i4, -1, "com.vk.design.demo.presentation.screens.TabBarScreenContent.TabBarSection (TabBarScreenContent.kt:127)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, txj0.f(q630.a.a, 1.0f));
            boolean z3 = (i4 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new ie90(izsVar, 22);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z4 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((i4 & 112) == 32);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                final List list4 = list3;
                final boolean z5 = z2;
                izs izsVar3 = new izs() { // from class: xsna.csn0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        fpv0.a.InterfaceC2887a bVar;
                        fpv0 fpv0Var = (fpv0) obj;
                        List list5 = list;
                        int size = i2 - list5.size();
                        if (size < 0) {
                            size = 0;
                        }
                        ArrayList u0 = j5g.u0(j5g.I0(1, new wow(list5)), j5g.u0(j5g.H0(new wow(list4), size), j5g.T(1, new wow(list5))));
                        ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
                        Iterator it = u0.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i6 = i5 + 1;
                            fpv0.d dVar = null;
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            int intValue = ((Number) next).intValue();
                            boolean z6 = intValue == R.drawable.vk_icon_lego_bubble_text_28;
                            boolean z7 = i5 == e43.h(u0);
                            if (!(i5 == 4) || z7) {
                                bVar = new fpv0.a.InterfaceC2887a.b(fpv0Var.getContext().getDrawable(intValue));
                            } else {
                                bVar = new fpv0.a.InterfaceC2887a.C2888a(z5 ? new odu0() : null);
                            }
                            if (z6) {
                                dVar = new fpv0.d.a();
                            } else if (z7) {
                                dVar = fpv0.d.b.a;
                            }
                            arrayList.add(new fpv0.a(bVar, dVar));
                            i5 = i6;
                        }
                        fpv0Var.setItems(arrayList);
                        fpv0Var.a(i);
                        return s3q0.a;
                    }
                };
                M.R(izsVar3);
                x2 = izsVar3;
            }
            ae2.a(48, 0, M, izsVar2, (izs) x2, F);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.asn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dsn0.this.b(izsVar, i, i2, list, list2, z, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
