package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.group.footer.GroupFooter;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.group.footer.VkGroupFooter$Content$Loader$Size;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GroupFooterScreenContent.kt */
/* loaded from: classes18.dex */
public final class yju implements yah0 {
    public final Object b = pn00.k(new Pair("group description", a.C4107a.a), new Pair("list footer", a.b.a), new Pair("loader icon", a.c.a), new Pair("loader spinner", a.d.a));
    public final LinkedHashMap c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    /* compiled from: GroupFooterScreenContent.kt */
    public interface a {

        /* compiled from: GroupFooterScreenContent.kt */
        /* renamed from: xsna.yju$a$a, reason: collision with other inner class name */
        public static final class C4107a implements a {
            public static final C4107a a = new C4107a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4107a);
            }

            public final int hashCode() {
                return 1612595585;
            }

            public final String toString() {
                return "GroupDescription";
            }
        }

        /* compiled from: GroupFooterScreenContent.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1751115683;
            }

            public final String toString() {
                return "ListFooter";
            }
        }

        /* compiled from: GroupFooterScreenContent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1442786384;
            }

            public final String toString() {
                return "LoaderIcon";
            }
        }

        /* compiled from: GroupFooterScreenContent.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1659585662;
            }

            public final String toString() {
                return "LoaderSpinner";
            }
        }
    }

    /* compiled from: GroupFooterScreenContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupFooter.Loader.Size.values().length];
            try {
                iArr[GroupFooter.Loader.Size.S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupFooter.Loader.Size.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupFooter.Loader.Size.L.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupFooter.Loader.Size.XL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yju() {
        zrp<GroupFooter.Loader.Size> i = GroupFooter.Loader.Size.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.size());
        for (Object obj : i) {
            linkedHashMap.put(((GroupFooter.Loader.Size) obj).name(), obj);
        }
        this.c = linkedHashMap;
        this.d = androidx.compose.runtime.k.b("group description");
        this.e = androidx.compose.runtime.k.b("M");
        this.f = androidx.compose.runtime.k.b(Boolean.TRUE);
    }

    public static VkGroupFooter$Content$Loader$Size c(GroupFooter.Loader.Size size) {
        int i = b.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1) {
            return VkGroupFooter$Content$Loader$Size.S;
        }
        if (i == 2) {
            return VkGroupFooter$Content$Loader$Size.M;
        }
        if (i == 3) {
            return VkGroupFooter$Content$Loader$Size.L;
        }
        if (i == 4) {
            return VkGroupFooter$Content$Loader$Size.XL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030f  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.yah0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        GroupFooter.Loader.a aVar2;
        LayoutNode.a aVar3;
        wh50 wh50Var;
        cri.a.b bVar;
        yju yjuVar;
        GroupFooter.Loader.b bVar2;
        boolean z;
        yju yjuVar2 = this;
        androidx.compose.runtime.a M = aVar.M(229805227);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 196608) == 0) {
            i2 |= M.J(yjuVar2) ? 131072 : 65536;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (65539 & i4) != 65538)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(229805227, i4, -1, "com.vk.design.demo.presentation.screens.GroupFooterScreenContent.Content (GroupFooterScreenContent.kt:57)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c = qri.c(M, aVar4);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Group Footer", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i4 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            djn0.a(true, true, M, 438, 0);
            wh50 wh50Var2 = this.d;
            String str = (String) ((zak0) wh50Var2).getValue();
            ?? r14 = this.b;
            a aVar6 = (a) r14.get(str);
            int i5 = (i4 >> 12) & 112;
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(227526304, i5, -1, "com.vk.design.demo.presentation.screens.GroupFooterScreenContent.toCompose (GroupFooterScreenContent.kt:145)");
            } else {
                i3 = -1;
            }
            boolean f = epx.f(aVar6, a.C4107a.a);
            wh50 wh50Var3 = this.e;
            LinkedHashMap linkedHashMap = this.c;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (f) {
                M.K(-390550079);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2013551198, 390, i3, "com.vk.core.compose.component.group.footer.GroupFooter.GroupDescription.Companion.invoke (GroupFooter.kt:70)");
                }
                us2 b3 = ws2.b("Вы будете получать только важные уведомления.", M, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(228915026, 384, i3, "com.vk.core.compose.component.group.footer.GroupFooter.GroupDescription.Companion.invoke (GroupFooter.kt:79)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    z = false;
                    x = new GroupFooter.a(b3, null);
                    M.R(x);
                } else {
                    z = false;
                }
                GroupFooter.a aVar7 = (GroupFooter.a) x;
                ((zak0) aVar7.a).setValue(b3);
                ((zak0) aVar7.b).setValue(z);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                bVar2 = aVar7;
            } else if (epx.f(aVar6, a.b.a)) {
                M.K(-390546763);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1424864798, 390, i3, "com.vk.core.compose.component.group.footer.GroupFooter.ListFooter.Companion.invoke (GroupFooter.kt:119)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new GroupFooter.b();
                    M.R(x2);
                }
                GroupFooter.b bVar4 = (GroupFooter.b) x2;
                ((zak0) bVar4.a).setValue("4 видео");
                ((zak0) bVar4.b).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                bVar2 = bVar4;
            } else if (epx.f(aVar6, a.c.a)) {
                M.K(-390544511);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-491867876, 0, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LogoVkid20> (VkSdkIcons.kt:2422)");
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_logo_vkid_20, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                GroupFooter.Loader.Size size = (GroupFooter.Loader.Size) linkedHashMap.get((String) ((zak0) wh50Var3).getValue());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-409936565, 24584, i3, "com.vk.core.compose.component.group.footer.GroupFooter.Loader.Icon.Companion.invoke (GroupFooter.kt:167)");
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new GroupFooter.Loader.a(a4, size);
                    M.R(x3);
                }
                aVar2 = (GroupFooter.Loader.a) x3;
                ((zak0) aVar2.a).setValue(a4);
                ((zak0) aVar2.b).setValue(size);
                ((zak0) aVar2.c).setValue(null);
                ((zak0) aVar2.d).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 a5 = q9g.a(txj0.f(aVar4, 1.0f), 1.0f);
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, a5);
                if (M.N() != null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    aVar3 = aVar5;
                    M.I(aVar3);
                } else {
                    aVar3 = aVar5;
                    M.f();
                }
                k9q0.w(M, d, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar3, M, c2678a);
                k9q0.w(M, c2, dVar);
                wh50 wh50Var4 = this.f;
                boolean booleanValue = ((Boolean) ((zak0) wh50Var4).getValue()).booleanValue();
                e.a aVar8 = androidx.compose.ui.graphics.e.a;
                if (booleanValue) {
                    M.K(-1383409055);
                    wh50Var = wh50Var4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    fxu0.a(aVar2, hr80.m(aVar4, ylu0Var.getBackground().x, aVar8), M, 0, 0);
                    M.j();
                    bVar = bVar3;
                } else {
                    wh50Var = wh50Var4;
                    M.K(-1383189792);
                    bVar = bVar3;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    b(hr80.m(aVar4, ylu0Var2.getBackground().x, aVar8), M, i5);
                    M.j();
                }
                M.G();
                boolean booleanValue2 = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
                int i6 = i4 & 458752;
                boolean z2 = i6 == 131072;
                Object x4 = M.x();
                if (z2 || x4 == c0012a) {
                    x4 = new p5h(this, 21);
                    M.R(x4);
                }
                cri.a.b bVar5 = bVar;
                Object obj = aVar2;
                eku0.d("isCompose", (gzs) x4, null, booleanValue2, null, false, false, M, 6, 116);
                M = M;
                androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c3 = qri.c(M, aVar4);
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
                k9q0.w(M, a6, cVar);
                k9q0.w(M, D3, eVar);
                ur.d(hashCode3, M, bVar5, M, c2678a);
                k9q0.w(M, c3, dVar);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                String str2 = (String) ((zak0) wh50Var2).getValue();
                boolean z3 = i6 == 131072;
                Object x5 = M.x();
                if (z3 || x5 == c0012a) {
                    yjuVar = this;
                    x5 = new dhh(yjuVar, 21);
                    M.R(x5);
                } else {
                    yjuVar = this;
                }
                yjuVar2 = yjuVar;
                y9i0.a("Mode", r14, str2, (izs) x5, xpyVar, M, 6, 0);
                if (obj instanceof GroupFooter.Loader) {
                    M.K(-898026324);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String str3 = (String) ((zak0) wh50Var3).getValue();
                    boolean z4 = i6 == 131072;
                    Object x6 = M.x();
                    if (z4 || x6 == c0012a) {
                        x6 = new z8f(yjuVar2, 19);
                        M.R(x6);
                    }
                    y9i0.a("Size", linkedHashMap, str3, (izs) x6, xpyVar2, M, 6, 0);
                } else {
                    M.K(-902038499);
                }
                M.j();
                if (kr.f(M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                if (!epx.f(aVar6, a.d.a)) {
                    throw alb0.c(-390551550, M);
                }
                M.K(-390539807);
                GroupFooter.Loader.b a7 = GroupFooter.Loader.b.a.a(SpinnerState.Loading, (GroupFooter.Loader.Size) linkedHashMap.get((String) ((zak0) wh50Var3).getValue()), M, 1572870);
                M.j();
                bVar2 = a7;
            }
            aVar2 = bVar2;
            if (androidx.compose.runtime.b.d()) {
            }
            q630 a52 = q9g.a(txj0.f(aVar4, 1.0f), 1.0f);
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode22 = Long.hashCode(n34.n(M));
            sy90 D22 = M.D();
            q630 c22 = qri.c(M, a52);
            if (M.N() != null) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xju(yjuVar2, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1264552362);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1264552362, i2, -1, "com.vk.design.demo.presentation.screens.GroupFooterScreenContent.ViewGroupFooter (GroupFooterScreenContent.kt:117)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new tcu(2);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new arf(this, 17);
                M.R(x2);
            }
            ae2.a(6, 0, M, izsVar, (izs) x2, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nv1(this, q630Var, i, 4);
        }
    }
}
