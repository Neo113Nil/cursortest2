package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;
import xsna.ty6;

/* compiled from: ActionSheetScreenContent.kt */
/* loaded from: classes18.dex */
public final class z40 implements yah0 {
    public final LinkedHashMap b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;

    public z40() {
        zrp<ModalActionSheetListItem.IconSize> h = ModalActionSheetListItem.IconSize.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(((ModalActionSheetListItem.IconSize) obj).name(), obj);
        }
        this.b = linkedHashMap;
        this.c = androidx.compose.runtime.k.b(new tho0("Title Text", 0L, 6));
        this.d = androidx.compose.runtime.k.b(new tho0((String) null, 0L, 7));
        Boolean bool = Boolean.FALSE;
        this.e = androidx.compose.runtime.k.b(bool);
        this.f = androidx.compose.runtime.k.b(bool);
        this.g = androidx.compose.runtime.k.b(bool);
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = androidx.compose.runtime.k.b(ModalActionSheetListItem.IconSize.Large);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(983935369);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(983935369, i2, -1, "com.vk.design.demo.presentation.screens.ActionSheetScreenContent.Content (ActionSheetScreenContent.kt:57)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Action Sheet", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            djn0.a(false, true, M, 438, 0);
            q630 D2 = p490.D(aVar2, p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(8), aVar3, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            hly a4 = h8s.a.a("Title", false, null, null, null, M, 196614, 30);
            tho0 tho0Var = (tho0) ((zak0) this.c).getValue();
            int i5 = i4 & 458752;
            boolean z = i5 == 131072;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new t9(this, 1);
                M.R(x);
            }
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var, (izs) x, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14), null, a4, null, null, M, 0, 26);
            hly a5 = h8s.a.a("Description", false, null, null, null, M, 196614, 30);
            tho0 tho0Var2 = (tho0) ((zak0) this.d).getValue();
            boolean z2 = i5 == 131072;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new t40(this, 0);
                M.R(x2);
            }
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(tho0Var2, (izs) x2, null, 0L, 0L, null, null, null, null, null, false, null, M, 0, 196608, 32764), null, false, null, M, 24576, 14), null, a5, null, null, M, 0, 26);
            boolean c3 = c();
            boolean z3 = i5 == 131072;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new s1(this, 1);
                M.R(x3);
            }
            eku0.d("Multiline items title", (gzs) x3, null, c3, null, false, false, M, 6, 116);
            boolean d = d();
            boolean z4 = i5 == 131072;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new u40(this, 0);
                M.R(x4);
            }
            eku0.d("Items with description", (gzs) x4, null, d, null, false, false, M, 6, 116);
            boolean b2 = b();
            boolean z5 = i5 == 131072;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new v40(this, 0);
                M.R(x5);
            }
            eku0.d("Checked items", (gzs) x5, null, b2, null, false, false, M, 6, 116);
            boolean e = e();
            boolean z6 = i5 == 131072;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new w40(this, 0);
                M.R(x6);
            }
            eku0.d("With icon", (gzs) x6, null, e, null, false, false, M, 6, 116);
            String name = ((ModalActionSheetListItem.IconSize) ((zak0) this.i).getValue()).name();
            boolean z7 = i5 == 131072;
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new com.vk.movika.sdk.base.hooks.p(this, 2);
                M.R(x7);
            }
            y9i0.a("Icon Size", this.b, name, (izs) x7, null, M, 6, 16);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 c4 = lr.c(dt1.a.o, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)));
            boolean y = M.y(context) | (i5 == 131072);
            Object x8 = M.x();
            if (y || x8 == c0012a) {
                x8 = new com.vk.movika.sdk.base.ui.s(1, this, context);
                M.R(x8);
            }
            mpj0.a(6, 0, M, "Show Action Sheet", (gzs) x8, c4);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x40(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final boolean b() {
        return ((Boolean) ((zak0) this.g).getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) ((zak0) this.e).getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) ((zak0) this.f).getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) ((zak0) this.h).getValue()).booleanValue();
    }
}
