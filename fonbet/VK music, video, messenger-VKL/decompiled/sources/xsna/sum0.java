package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.subnavigation.SubnavigationBarAppearance;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.core.view.components.subnavigation.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.q630;
import xsna.s2x;
import xsna.ty6;

/* compiled from: SubnavigationBarScreenContent.kt */
/* loaded from: classes18.dex */
public final class sum0 implements yah0 {
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final long h;
    public final wh50<Boolean> i;
    public final wh50<Boolean> j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubnavigationBarScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BUG_24;
        public static final a COMMENT_16;
        public static final a LIKE_16;
        public static final a MUSIC_24;
        public static final a PLACE_16;
        public static final a SQUARE_24;
        private final int drawableResId;

        static {
            a aVar = new a("SQUARE_24", 0, R.drawable.vk_icon_square_outline_24);
            SQUARE_24 = aVar;
            a aVar2 = new a("BUG_24", 1, R.drawable.vk_icon_bug_24);
            BUG_24 = aVar2;
            a aVar3 = new a("MUSIC_24", 2, R.drawable.vk_icon_music_24);
            MUSIC_24 = aVar3;
            a aVar4 = new a("COMMENT_16", 3, R.drawable.vk_icon_comment_16);
            COMMENT_16 = aVar4;
            a aVar5 = new a("LIKE_16", 4, R.drawable.vk_icon_like_16);
            LIKE_16 = aVar5;
            a aVar6 = new a("PLACE_16", 5, R.drawable.vk_icon_place_16);
            PLACE_16 = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.drawableResId = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.drawableResId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubnavigationBarScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Custom;
        public static final b Icon;
        public static final b IconWIthContent;
        public static final b None;

        static {
            b bVar = new b("None", 0);
            None = bVar;
            b bVar2 = new b("Icon", 1);
            Icon = bVar2;
            b bVar3 = new b("IconWIthContent", 2);
            IconWIthContent = bVar3;
            b bVar4 = new b("Custom", 3);
            Custom = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: SubnavigationBarScreenContent.kt */
    public static final class c {
        public final boolean a;
        public final SubnavigationBarAppearance b;
        public final int c;
        public final boolean d;

        public c(boolean z, SubnavigationBarAppearance subnavigationBarAppearance, int i, boolean z2) {
            this.a = z;
            this.b = subnavigationBarAppearance;
            this.c = i;
            this.d = z2;
        }

        public static c a(c cVar, boolean z, SubnavigationBarAppearance subnavigationBarAppearance, int i, boolean z2, int i2) {
            if ((i2 & 1) != 0) {
                z = cVar.a;
            }
            if ((i2 & 2) != 0) {
                subnavigationBarAppearance = cVar.b;
            }
            if ((i2 & 4) != 0) {
                i = cVar.c;
            }
            if ((i2 & 8) != 0) {
                z2 = cVar.d;
            }
            cVar.getClass();
            return new c(z, subnavigationBarAppearance, i, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubnavigationBarState(isFixed=");
            sb.append(this.a);
            sb.append(", appearance=");
            sb.append(this.b);
            sb.append(", activeButtonIndex=");
            sb.append(this.c);
            sb.append(", isMultiselectEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: SubnavigationBarScreenContent.kt */
    public static final class d {
        public final SubnavigationButton.Size a;
        public final SubnavigationButton.Mode b;
        public final SubnavigationButton.Appearance c;
        public final boolean d;
        public final String e;
        public final boolean f;
        public final a g;
        public final boolean h;
        public final int i;
        public final b j;
        public final boolean k;
        public final boolean l;

        public d(SubnavigationButton.Size size, SubnavigationButton.Mode mode, SubnavigationButton.Appearance appearance, boolean z, String str, boolean z2, a aVar, boolean z3, int i, b bVar, boolean z4, boolean z5) {
            this.a = size;
            this.b = mode;
            this.c = appearance;
            this.d = z;
            this.e = str;
            this.f = z2;
            this.g = aVar;
            this.h = z3;
            this.i = i;
            this.j = bVar;
            this.k = z4;
            this.l = z5;
        }

        public static d a(d dVar, SubnavigationButton.Size size, SubnavigationButton.Mode mode, SubnavigationButton.Appearance appearance, boolean z, String str, boolean z2, a aVar, boolean z3, int i, b bVar, boolean z4, boolean z5, int i2) {
            if ((i2 & 1) != 0) {
                size = dVar.a;
            }
            SubnavigationButton.Size size2 = size;
            if ((i2 & 2) != 0) {
                mode = dVar.b;
            }
            SubnavigationButton.Mode mode2 = mode;
            SubnavigationButton.Appearance appearance2 = (i2 & 4) != 0 ? dVar.c : appearance;
            boolean z6 = (i2 & 8) != 0 ? dVar.d : z;
            String str2 = (i2 & 16) != 0 ? dVar.e : str;
            boolean z7 = (i2 & 32) != 0 ? dVar.f : z2;
            a aVar2 = (i2 & 64) != 0 ? dVar.g : aVar;
            boolean z8 = (i2 & 128) != 0 ? dVar.h : z3;
            int i3 = (i2 & 256) != 0 ? dVar.i : i;
            b bVar2 = (i2 & 512) != 0 ? dVar.j : bVar;
            boolean z9 = (i2 & 1024) != 0 ? dVar.k : z4;
            boolean z10 = (i2 & 2048) != 0 ? dVar.l : z5;
            dVar.getClass();
            return new d(size2, mode2, appearance2, z6, str2, z7, aVar2, z8, i3, bVar2, z9, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && epx.f(this.e, dVar.e) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.k == dVar.k && this.l == dVar.l;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.l) + qoy.b((this.j.hashCode() + shy.a(this.i, qoy.b((this.g.hashCode() + qoy.b(urd0.a(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31)) * 31, 31, this.k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubnavigationButtonState(size=");
            sb.append(this.a);
            sb.append(", mode=");
            sb.append(this.b);
            sb.append(", appearance=");
            sb.append(this.c);
            sb.append(", isLabelVisible=");
            sb.append(this.d);
            sb.append(", labelValue=");
            sb.append(this.e);
            sb.append(", isIconLeftVisible=");
            sb.append(this.f);
            sb.append(", iconLeft=");
            sb.append(this.g);
            sb.append(", isCounterVisible=");
            sb.append(this.h);
            sb.append(", counterValue=");
            sb.append(this.i);
            sb.append(", rightContentType=");
            sb.append(this.j);
            sb.append(", isActive=");
            sb.append(this.k);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.l, ')');
        }
    }

    /* compiled from: SubnavigationBarScreenContent.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Icon.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.IconWIthContent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.Custom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sum0() {
        SubnavigationBarAppearance[] values = SubnavigationBarAppearance.values();
        int e2 = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (SubnavigationBarAppearance subnavigationBarAppearance : values) {
            linkedHashMap.put(subnavigationBarAppearance, subnavigationBarAppearance.name());
        }
        this.b = linkedHashMap;
        SubnavigationButton.Size[] values2 = SubnavigationButton.Size.values();
        int e3 = on00.e(values2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 < 16 ? 16 : e3);
        for (SubnavigationButton.Size size : values2) {
            linkedHashMap2.put(size, size.name());
        }
        this.c = linkedHashMap2;
        SubnavigationButton.Mode[] values3 = SubnavigationButton.Mode.values();
        int e4 = on00.e(values3.length);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e4 < 16 ? 16 : e4);
        for (SubnavigationButton.Mode mode : values3) {
            linkedHashMap3.put(mode, mode.name());
        }
        this.d = linkedHashMap3;
        SubnavigationButton.Appearance[] values4 = SubnavigationButton.Appearance.values();
        int e5 = on00.e(values4.length);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e5 < 16 ? 16 : e5);
        for (SubnavigationButton.Appearance appearance : values4) {
            linkedHashMap4.put(appearance, appearance.name());
        }
        this.e = linkedHashMap4;
        a[] values5 = a.values();
        int e6 = on00.e(values5.length);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e6 < 16 ? 16 : e6);
        for (a aVar : values5) {
            linkedHashMap5.put(aVar, aVar.name());
        }
        this.f = linkedHashMap5;
        b[] values6 = b.values();
        int e7 = on00.e(values6.length);
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(e7 >= 16 ? e7 : 16);
        for (b bVar : values6) {
            linkedHashMap6.put(bVar, bVar.name());
        }
        this.g = linkedHashMap6;
        this.h = l5g.c(14, l5g.e, 0.1f);
        this.i = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.j = androidx.compose.runtime.k.b(Boolean.FALSE);
    }

    public static void k(VkSubnavigationBar vkSubnavigationBar, c cVar, wow wowVar, final izs izsVar) {
        List<T> list = wowVar.b;
        vkSubnavigationBar.setFixed(cVar.a);
        ArrayList arrayList = vkSubnavigationBar.h;
        ArrayList arrayList2 = vkSubnavigationBar.k;
        ArrayList arrayList3 = vkSubnavigationBar.j;
        vkSubnavigationBar.c = cVar.b;
        Iterator it = vkSubnavigationBar.i.iterator();
        while (it.hasNext()) {
            ((b.a) it.next()).c3();
        }
        arrayList3.clear();
        arrayList2.clear();
        vkSubnavigationBar.setMultiSelect(cVar.d);
        arrayList3.add(new VkSubnavigationBar.b() { // from class: xsna.rum0
            @Override // com.vk.core.view.components.subnavigation.VkSubnavigationBar.b
            public final void a(VkSubnavigationBar.a aVar) {
                izs.this.invoke(Integer.valueOf(aVar.b));
            }
        });
        arrayList2.add(new VkSubnavigationBar.b() { // from class: xsna.oum0
            @Override // com.vk.core.view.components.subnavigation.VkSubnavigationBar.b
            public final void a(VkSubnavigationBar.a aVar) {
                izs.this.invoke(Integer.valueOf(aVar.b));
            }
        });
        Iterator it2 = j5g.B0(vkSubnavigationBar.getButtons(), swe0.q(list.size(), vkSubnavigationBar.getButtonsCount())).iterator();
        while (it2.hasNext()) {
            vkSubnavigationBar.e(arrayList.indexOf((VkSubnavigationBar.a) it2.next()));
        }
        int size = list.size();
        for (int buttonsCount = vkSubnavigationBar.getButtonsCount(); buttonsCount < size; buttonsCount++) {
            vkSubnavigationBar.getContext();
            vkSubnavigationBar.c(new VkSubnavigationBar.a<>(new VkSubnavigationButton(vkSubnavigationBar.getContext(), null, 0, 14, 0)));
        }
        int i = 0;
        for (Object obj : wowVar) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            d dVar = (d) obj;
            VkSubnavigationBar.a aVar = (VkSubnavigationBar.a) arrayList.get(i);
            SubnavigationButton.Size size2 = dVar.a;
            SubnavigationButton subnavigationButton = aVar.a;
            T t = aVar.a;
            subnavigationButton.setSize(size2);
            t.setMode(dVar.b);
            t.setAppearance(dVar.c);
            String str = dVar.e;
            if (!dVar.d) {
                str = null;
            }
            aVar.b(str);
            Integer valueOf = Integer.valueOf(dVar.g.h());
            if (!dVar.f) {
                valueOf = null;
            }
            SubnavigationButton subnavigationButton2 = subnavigationButton;
            subnavigationButton2.K1(valueOf);
            boolean z = true;
            subnavigationButton2.l2(true, dVar.h ? Integer.valueOf(dVar.i) : null);
            if (dVar.j != b.Icon) {
                z = false;
            }
            t.setRightIconVisible(z);
            t.setActive(dVar.k);
            boolean z2 = dVar.l;
            aVar.d = z2;
            t.setEnabled(z2);
            i = i2;
        }
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        sum0 sum0Var;
        androidx.compose.runtime.a M = aVar.M(119441961);
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
            sum0Var = this;
            i2 |= M.J(sum0Var) ? 131072 : 65536;
        } else {
            sum0Var = this;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(119441961, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.Content (SubnavigationBarScreenContent.kt:81)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new c(true, SubnavigationBarAppearance.Neutral, -1, false));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            c cVar = (c) wh50Var.R();
            izs K = wh50Var.K();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Collections.singletonList(new d(SubnavigationButton.Size.Small, SubnavigationButton.Mode.Primary, SubnavigationButton.Appearance.Inherit, true, "Button", true, a.PLACE_16, true, 1, b.Icon, false, true)));
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            List list = (List) wh50Var2.R();
            izs K2 = wh50Var2.K();
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Subnavigation Bar", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(true, true, M, 438, 0);
            int i4 = (i2 >> 3) & 57344;
            sum0Var.j(i4, M, list, K, K2, cVar);
            q630 f2 = txj0.f(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D2 = p490.D(s200.H(hr80.m(f2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), p490.x(M), 14);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
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
            k9q0.w(M, a4, cVar2);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            c(i4, M, list, K, K2, cVar);
            int size = list.size();
            int i5 = cVar.c;
            if (i5 < 0 || i5 >= size) {
                M.K(-1235681937);
                w0n0.a(54, 0, M, "Добавьте кнопку", s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2));
                M.j();
            } else {
                M.K(-1235824413);
                b(i4, M, list, K2, K, cVar);
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kd00(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, izs izsVar2, c cVar) {
        int i2;
        List list2;
        izs izsVar3;
        tpg0 tpg0Var;
        izs izsVar4 = izsVar;
        c cVar2 = cVar;
        int i3 = cVar2.c;
        androidx.compose.runtime.a M = aVar.M(-1657475013);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1657475013, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.ActiveButtonProperties (SubnavigationBarScreenContent.kt:216)");
            }
            d dVar = (d) list.get(i3);
            int i4 = i2 & 14;
            boolean z = (i4 == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new zu1(izsVar4, list, cVar2, 3);
                M.R(x);
            }
            izs izsVar5 = (izs) x;
            q630.a aVar2 = q630.a.a;
            w0n0.a(48, 0, M, lhg.a(i3, "Выбрана кнопка "), s200.D(aVar2, 8));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            int i5 = i2;
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
            cri.a.c cVar3 = cri.a.f;
            k9q0.w(M, a2, cVar3);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c2, dVar2);
            tpg0 tpg0Var2 = tpg0.a;
            q630 b2 = tpg0Var2.b(1.0f, aVar2, true);
            SubnavigationButton.Size size = dVar.a;
            boolean J = M.J(izsVar5) | M.J(dVar);
            Object x2 = M.x();
            if (J || x2 == obj) {
                tpg0Var = tpg0Var2;
                x2 = new dnh0(7, izsVar5, dVar);
                M.R(x2);
            } else {
                tpg0Var = tpg0Var2;
            }
            tpg0 tpg0Var3 = tpg0Var;
            y9i0.a("Size", this.c, size, (izs) x2, b2, M, 6, 0);
            q630 b3 = tpg0Var3.b(1.0f, aVar2, true);
            SubnavigationButton.Mode mode = dVar.b;
            boolean J2 = M.J(izsVar5) | M.J(dVar);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new il7(17, izsVar5, dVar);
                M.R(x3);
            }
            y9i0.a("Mode", this.d, mode, (izs) x3, b3, M, 6, 0);
            M.G();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, a3, cVar3);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c3, dVar2);
            q630 b4 = tpg0Var3.b(1.0f, aVar2, true);
            SubnavigationButton.Appearance appearance = dVar.c;
            boolean J3 = M.J(izsVar5) | M.J(dVar);
            Object x4 = M.x();
            if (J3 || x4 == obj) {
                x4 = new defpackage.v(24, izsVar5, dVar);
                M.R(x4);
            }
            y9i0.a("Appearance", this.e, appearance, (izs) x4, b4, M, 6, 0);
            q630 b5 = tpg0Var3.b(1.0f, aVar2, true);
            boolean z2 = dVar.k;
            boolean J4 = M.J(izsVar5) | M.J(dVar);
            Object x5 = M.x();
            if (J4 || x5 == obj) {
                x5 = new nm1(27, izsVar5, dVar);
                M.R(x5);
            }
            zov0.b(z2, "Active", (izs) x5, b5, null, false, false, M, 48, 112);
            M = M;
            M.G();
            int i6 = i5 >> 6;
            int i7 = i6 & 896;
            g(dVar, izsVar5, M, i7);
            h(dVar, izsVar5, M, i7);
            f(dVar, izsVar5, M, i7);
            izsVar3 = izsVar2;
            cVar2 = cVar;
            i(cVar2, izsVar3, M, i4 | (i6 & 112) | i7);
            d(dVar, izsVar5, M, i7);
            int i8 = ((i5 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | i7;
            list2 = list;
            izsVar4 = izsVar;
            e(i8, M, list2, izsVar4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            list2 = list;
            izsVar3 = izsVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bxn(i, list2, izsVar4, izsVar3, cVar2, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
    
        if (r2 == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, izs izsVar2, c cVar) {
        int i2;
        izs izsVar3;
        tpg0 tpg0Var;
        a.C0011a.C0012a c0012a;
        LayoutNode.a aVar2;
        List list2 = list;
        androidx.compose.runtime.a M = aVar.M(1072938812);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(list2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1072938812, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.BarProperties (SubnavigationBarScreenContent.kt:141)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            tpg0 tpg0Var2 = tpg0.a;
            q630 b2 = tpg0Var2.b(1.0f, aVar3, true);
            boolean z = cVar.a;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z2 || x == c0012a2) {
                tpg0Var = tpg0Var2;
                x = new qum0(0, izsVar, cVar);
                M.R(x);
            } else {
                tpg0Var = tpg0Var2;
            }
            tpg0 tpg0Var3 = tpg0Var;
            int i5 = i2;
            zov0.b(z, "Fixed", (izs) x, b2, null, false, false, M, 48, 112);
            q630 b3 = tpg0Var3.b(1.0f, aVar3, true);
            SubnavigationBarAppearance subnavigationBarAppearance = cVar.b;
            boolean z3 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z3) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x2 = new ku1(29, izsVar, cVar);
            M.R(x2);
            y9i0.a("Appearance", this.b, subnavigationBarAppearance, (izs) x2, b3, M, 6, 0);
            M.G();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar2 = aVar4;
                M.I(aVar2);
            } else {
                aVar2 = aVar4;
                M.f();
            }
            k9q0.w(M, a3, cVar2);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 b4 = tpg0Var3.b(1.0f, aVar3, true);
            boolean booleanValue = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
            int i6 = i5 & 57344;
            boolean z4 = i6 == 16384;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new ggb0(this, 18);
                M.R(x3);
            }
            LayoutNode.a aVar5 = aVar2;
            zov0.b(booleanValue, "Padding", (izs) x3, b4, null, false, false, M, 48, 112);
            q630 b5 = tpg0Var3.b(1.0f, aVar3, true);
            boolean booleanValue2 = ((Boolean) ((zak0) this.j).getValue()).booleanValue();
            boolean z5 = i6 == 16384;
            Object x4 = M.x();
            if (z5 || x4 == c0012a) {
                x4 = new hfm0(this, 2);
                M.R(x4);
            }
            zov0.b(booleanValue2, "Show area", (izs) x4, b5, null, false, false, M, 48, 112);
            M.G();
            float f = 4;
            q630 D3 = s200.D(aVar3, f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, D3);
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
            k9q0.w(M, a4, cVar2);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, tpg0Var3.b(1.0f, aVar3, true));
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Positive;
            int i7 = i5 & 7168;
            int i8 = i5 & 896;
            boolean z6 = (i7 == 2048) | (i8 == 256) | (i6 == 16384);
            Object x5 = M.x();
            if (z6 || x5 == c0012a) {
                izsVar3 = izsVar2;
                x5 = new xm6(list, izsVar3, this);
                M.R(x5);
            } else {
                izsVar3 = izsVar2;
            }
            boolean z7 = false;
            bhu0.c((gzs) x5, buttonSize, buttonStyle, buttonAppearance, F, null, null, false, null, null, null, false, oli.a, M, X2.b.f, 384, 4064);
            q630 F2 = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, tpg0Var3.b(1.0f, aVar3, true));
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Negative;
            boolean z8 = i7 == 2048;
            if (i8 == 256) {
                z7 = true;
            }
            boolean z9 = z8 | z7;
            Object x6 = M.x();
            if (z9 || x6 == c0012a) {
                list2 = list;
                x6 = new xy0(22, izsVar3, list2);
                M.R(x6);
            } else {
                list2 = list;
            }
            bhu0.c((gzs) x6, buttonSize, buttonStyle, buttonAppearance2, F2, null, null, false, null, null, null, false, oli.b, M, X2.b.f, 384, 4064);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar3 = izsVar2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tfa(i, 1, this, cVar, list2, izsVar3, izsVar);
        }
    }

    public final void d(d dVar, izs<? super d, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1597378821);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1597378821, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.ButtonIcon (SubnavigationBarScreenContent.kt:511)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            b bVar = dVar.j;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new l1k0(1, izsVar, dVar);
                M.R(x);
            }
            y9i0.a("Right content", this.g, bVar, (izs) x, xpyVar, M, 6, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y85(i, 5, this, dVar, izsVar);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1004657241);
        if ((i & 6) == 0) {
            i2 = i | (M.J(list) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1004657241, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.ButtonsEnabled (SubnavigationBarScreenContent.kt:549)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            d dVar = (d) j5g.a0(new wow(list));
            boolean z = dVar != null ? dVar.l : false;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new defpackage.y(26, izsVar, list);
                M.R(x);
            }
            zov0.b(z, "isEnabled", (izs) x, xpyVar, null, false, false, M, 48, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ph00(i, 3, this, list, izsVar);
        }
    }

    public final void f(d dVar, izs<? super d, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1222514048);
        if ((i & 6) == 0) {
            i2 = i | (M.J(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1222514048, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.SelectedButtonCounterProperties (SubnavigationBarScreenContent.kt:356)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z = dVar.h;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ju(27, izsVar, dVar);
                M.R(x);
            }
            boolean z3 = true;
            zov0.b(z, "Counter", (izs) x, xpyVar, null, false, false, M, 48, 112);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String valueOf = String.valueOf(dVar.i);
            boolean z4 = i3 == 32;
            if (i4 != 4) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new lfa(21, izsVar, dVar);
                M.R(x2);
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.a(valueOf, (izs) x2, "Counter", null, null, M, 384, 32760), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a3, xpyVar2, null, null, null, M, 0, 28);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c6v(i, 4, this, dVar, izsVar);
        }
    }

    public final void g(d dVar, izs<? super d, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1352256440);
        if ((i & 6) == 0) {
            i2 = i | (M.J(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1352256440, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.SelectedButtonLabelProperties (SubnavigationBarScreenContent.kt:293)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z = dVar.d;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new whi0(4, izsVar, dVar);
                M.R(x);
            }
            boolean z3 = true;
            zov0.b(z, "Label", (izs) x, xpyVar, null, false, false, M, 48, 112);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str = dVar.e;
            boolean z4 = i3 == 32;
            if (i4 != 4) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new zsl0(3, izsVar, dVar);
                M.R(x2);
            }
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.a(str, (izs) x2, "Label", null, null, M, 384, 32760), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a3, xpyVar2, null, null, null, M, 0, 28);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sol(i, 3, this, dVar, izsVar);
        }
    }

    public final void h(d dVar, izs<? super d, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1538447354);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1538447354, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.SelectedButtonLeftIconProperties (SubnavigationBarScreenContent.kt:326)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z = dVar.f;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new hn0(29, izsVar, dVar);
                M.R(x);
            }
            boolean z3 = true;
            zov0.b(z, "Left icon", (izs) x, xpyVar, null, false, false, M, 48, 112);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            a aVar4 = dVar.g;
            boolean z4 = i3 == 32;
            if (i4 != 4) {
                z3 = false;
            }
            boolean z5 = z3 | z4;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new lh(28, izsVar, dVar);
                M.R(x2);
            }
            y9i0.a("Left icon", this.f, aVar4, (izs) x2, xpyVar2, M, 6, 0);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ijl(i, 5, this, dVar, izsVar);
        }
    }

    public final void i(c cVar, izs<? super c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1927962835);
        if ((i & 6) == 0) {
            i2 = i | (M.J(cVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1927962835, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.SubnavigationBarMultiselect (SubnavigationBarScreenContent.kt:531)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            boolean z = cVar.d;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new v53(23, izsVar, cVar);
                M.R(x);
            }
            zov0.b(z, "Multiselect", (izs) x, xpyVar, null, false, false, M, 48, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t050(i, 3, this, cVar, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, izs izsVar2, c cVar) {
        int i2;
        c cVar2;
        List list2;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        izs izsVar3;
        androidx.compose.runtime.a M = aVar.M(-605725163);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-605725163, i2, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.VkSubnavigationBarImplementations (SubnavigationBarScreenContent.kt:395)");
            }
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            boolean z = ((i2 & 112) == 32) | (i3 == 4) | ((i2 & 7168) == 2048) | (i4 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                c0012a = c0012a2;
                x = new w37(izsVar, cVar, izsVar2, list, 2);
                M.R(x);
            } else {
                c0012a = c0012a2;
            }
            izs izsVar4 = (izs) x;
            float f = kqu0.c;
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            float f2 = 8;
            rzo0.a(54, 0, M, "View", s200.D(aVar3, f2));
            q630 f3 = txj0.f(aVar3, 1.0f);
            int i5 = i2 & 57344;
            boolean J = (i5 == 16384) | (i3 == 4) | (i4 == 256) | M.J(izsVar4);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new q66(this, cVar, list, izsVar4);
                M.R(x2);
            }
            izs izsVar5 = (izs) x2;
            boolean J2 = (i5 == 16384) | (i3 == 4) | (i4 == 256) | M.J(izsVar4);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                izsVar3 = izsVar4;
                ag9 ag9Var = new ag9(this, cVar, list, izsVar3, 4);
                cVar2 = cVar;
                list2 = list;
                M.R(ag9Var);
                x3 = ag9Var;
            } else {
                izsVar3 = izsVar4;
                cVar2 = cVar;
                list2 = list;
            }
            ae2.a(48, 0, M, izsVar5, (izs) x3, f3);
            rzo0.a(54, 0, M, "Compose", s200.D(aVar3, f2));
            boolean z2 = cVar2.a;
            com.vk.core.compose.component.defaults.SubnavigationBarAppearance subnavigationBarAppearance = (com.vk.core.compose.component.defaults.SubnavigationBarAppearance) com.vk.core.compose.component.defaults.SubnavigationBarAppearance.h().get(cVar2.b.ordinal());
            boolean booleanValue = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
            q630 f4 = txj0.f(aVar3, 1.0f);
            if (((Boolean) ((zak0) this.j).getValue()).booleanValue()) {
                f4 = f4.g(hr80.m(aVar3, this.h, androidx.compose.ui.graphics.e.a));
            }
            jnv0.a(z2, subnavigationBarAppearance, f4, booleanValue, false, kai.c(-1095158638, new i3c(list2, izsVar3, this), M), M, 196608, 16);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            cVar2 = cVar;
            list2 = list;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new k2o(i, list2, izsVar, izsVar2, cVar2, this);
        }
    }
}
