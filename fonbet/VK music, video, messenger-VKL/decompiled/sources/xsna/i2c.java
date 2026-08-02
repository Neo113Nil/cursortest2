package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import com.ironsource.C4217a2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;
import xsna.ty6;

/* compiled from: CheckboxScreenContent.kt */
/* loaded from: classes18.dex */
public final class i2c implements yah0 {
    public final List b;
    public final LinkedHashMap c;
    public final wh50 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckboxScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Compose;
        public static final a View;

        static {
            a aVar = new a("Compose", 0);
            Compose = aVar;
            a aVar2 = new a("View", 1);
            View = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckboxScreenContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.View.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Compose.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkCheckbox.State.values().length];
            try {
                iArr2[VkCheckbox.State.Unchecked.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VkCheckbox.State.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkCheckbox.State.Checked.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Pair pair = (Pair) t2;
            Boolean bool = (Boolean) pair.g();
            bool.booleanValue();
            Pair pair2 = (Pair) t;
            Boolean bool2 = (Boolean) pair2.g();
            bool2.booleanValue();
            return jw5.b(bool, bool2);
        }
    }

    public i2c() {
        zrp<VkCheckbox.State> h = VkCheckbox.State.h();
        ArrayList arrayList = new ArrayList();
        for (VkCheckbox.State state : h) {
            g5g.y(e43.l(new Pair(state, Boolean.FALSE), new Pair(state, Boolean.TRUE)), arrayList);
        }
        this.b = j5g.D0(new c(), arrayList);
        zrp<a> h2 = a.h();
        int e = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h2) {
            linkedHashMap.put(obj, ((a) obj).name());
        }
        this.c = linkedHashMap;
        this.d = androidx.compose.runtime.k.b(a.Compose);
    }

    public static final void d(wh50<VkCheckbox.State> wh50Var, wh50<VkCheckbox.State> wh50Var2, wh50<VkCheckbox.State> wh50Var3) {
        int i = 0;
        List l = e43.l(wh50Var, wh50Var2);
        List list = l;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((wh50) it.next()).getValue() == VkCheckbox.State.Checked && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        wh50Var3.setValue(i == 0 ? VkCheckbox.State.Unchecked : i == l.size() ? VkCheckbox.State.Checked : VkCheckbox.State.Indeterminate);
    }

    public static ToggleableState h(VkCheckbox.State state) {
        int i = b.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            return ToggleableState.Off;
        }
        if (i == 2) {
            return ToggleableState.Indeterminate;
        }
        if (i == 3) {
            return ToggleableState.On;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        int i2;
        lg90 c2;
        androidx.compose.runtime.a M = aVar.M(904671145);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(904671145, i2, -1, "com.vk.design.demo.presentation.screens.CheckboxScreenContent.Content (CheckboxScreenContent.kt:60)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, f);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c3, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Checkbox", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a4 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(-1216328085);
                c2 = jh.c(qzu0.a, M);
            } else {
                M.K(-1216327252);
                c2 = j8.c(qzu0.a, M);
            }
            d.c.C0760d a5 = d.c.C0760d.a.a(c2, null, gzsVar2, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            M.K(948837839);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a3, null, null, null, null, a4, d.a.a(a5, d.b.a.C0757a.a(q, null, x5Var, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, true, M, 438, 0);
            float f2 = 4;
            float f3 = 8;
            rzo0.a(54, 0, M, "States", s200.H(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            f((i2 >> 15) & 14, M);
            rzo0.a(6, 0, M, "Items", s200.H(aVar2, f3, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 4));
            q630 a6 = q9g.a(aVar2, 1.0f);
            androidx.compose.foundation.layout.c a7 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, a6);
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
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            int i4 = ((i2 >> 12) & 112) | 6;
            c(true, M, i4);
            c(false, M, i4);
            M.G();
            a aVar5 = (a) ((zak0) this.d).getValue();
            boolean z = (458752 & i2) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zx(this, 21);
                M.R(x);
            }
            y9i0.a("Implementation", this.c, aVar5, (izs) x, txj0.f(aVar2, 1.0f), M, 24582, 0);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.z1c
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i2c.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(final boolean z, final wh50<VkCheckbox.State> wh50Var, final String str, final String str2, final boolean z2, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str3;
        String str4;
        androidx.compose.runtime.a M = aVar.M(-154860815);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wh50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= M.J(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i2 |= M.J(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-154860815, i2, -1, "com.vk.design.demo.presentation.screens.CheckboxScreenContent.CheckboxItem (CheckboxScreenContent.kt:189)");
            }
            int i3 = b.$EnumSwitchMapping$0[((a) ((zak0) this.d).getValue()).ordinal()];
            q630 q630Var = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i3 == 1) {
                M.K(-662411452);
                q630 f = txj0.f(q630Var, 1.0f);
                Object x = M.x();
                if (x == c0012a) {
                    x = new db(17);
                    M.R(x);
                }
                izs izsVar = (izs) x;
                boolean z3 = ((i2 & 57344) == 16384) | ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 458752) == 131072) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    izs izsVar2 = new izs() { // from class: xsna.e2c
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            VkCheckboxItem vkCheckboxItem = (VkCheckboxItem) obj;
                            int a2 = z2 ? e3m.a(R.dimen.vk_ui_base_padding_horizontal, vkCheckboxItem.getContext()) : 0;
                            wh50 wh50Var2 = wh50Var;
                            vkCheckboxItem.setCheckedState((VkCheckbox.State) wh50Var2.getValue());
                            vkCheckboxItem.setEnabled(z);
                            vkCheckboxItem.setCheckedStateChangeListener(new nv2(7, wh50Var2, gzsVar));
                            tlo0.Companion.getClass();
                            vkCheckboxItem.setTitle(new tlo0.h(str));
                            String str5 = str2;
                            vkCheckboxItem.setSubtitle(str5 != null ? new tlo0.h(str5) : null);
                            bwt0.t0(vkCheckboxItem, a2, 0, 0, 0, 14);
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar2);
                    x2 = izsVar2;
                }
                ae2.a(54, 0, M, izsVar, (izs) x2, f);
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(1502622420, M);
                }
                M.K(-663314668);
                ToggleableState h = h(wh50Var.getValue());
                if (z2) {
                    q630Var = s200.H(q630Var, kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                }
                boolean z4 = ((i2 & 112) == 32) | ((i2 & 458752) == 131072);
                Object x3 = M.x();
                if (z4 || x3 == c0012a) {
                    x3 = new com.vk.movika.tools.controls.seekbar.g(1, wh50Var, gzsVar);
                    M.R(x3);
                }
                eku0.c(str3, h, (gzs) x3, q630Var, str4, z, false, M, ((i2 >> 6) & 14) | ((i2 << 3) & 57344) | ((i2 << 15) & 458752), 64);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.f2c
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i2c.this.b(z, wh50Var, str, str2, z2, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final i2c i2cVar;
        i2c i2cVar2 = this;
        final boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(898906140);
        if ((i & 6) == 0) {
            i2 = (M.l(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(i2cVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(898906140, i2, -1, "com.vk.design.demo.presentation.screens.CheckboxScreenContent.CheckboxItemsGroup (CheckboxScreenContent.kt:134)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(VkCheckbox.State.Indeterminate);
                M.R(x);
            }
            wh50<VkCheckbox.State> wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(VkCheckbox.State.Checked);
                M.R(x2);
            }
            wh50<VkCheckbox.State> wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(VkCheckbox.State.Unchecked);
                M.R(x3);
            }
            wh50<VkCheckbox.State> wh50Var3 = (wh50) x3;
            String str = z2 ? "enabled" : C4217a2.e;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            String concat = "Root, ".concat(str);
            String str2 = z2 ? "Click to check/uncheck group" : null;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new hib(wh50Var2, wh50Var, wh50Var3, 1);
                M.R(x4);
            }
            int i3 = i2 & 14;
            int i4 = 3670016 & (i2 << 15);
            int i5 = 221232 | i3 | i4;
            i2cVar2.b(z2, wh50Var, concat, str2, false, (gzs) x4, M, i5);
            String concat2 = "Child1, ".concat(str);
            String str3 = z ? "Click to check/uncheck child" : null;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new a2c(wh50Var2, wh50Var3, wh50Var, 0);
                M.R(x5);
            }
            b(z, wh50Var2, concat2, str3, true, (gzs) x5, M, i5);
            String str4 = z ? "Click to check/uncheck child" : null;
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = new d66(wh50Var2, wh50Var3, wh50Var, 1);
                M.R(x6);
            }
            i2c i2cVar3 = this;
            z2 = z;
            i2cVar3.b(z2, wh50Var3, "", str4, true, (gzs) x6, M, 221616 | i3 | i4);
            M.G();
            i2cVar = i2cVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                i2cVar = i2cVar3;
            }
        } else {
            M.h();
            i2cVar = i2cVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.b2c
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    i2c.this.c(z2, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final int i, androidx.compose.runtime.a aVar, final ToggleableState toggleableState, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1679220975);
        if ((i & 6) == 0) {
            i2 = (M.o(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1679220975, i2, -1, "com.vk.design.demo.presentation.screens.CheckboxScreenContent.ComposeSingleCheckbox (CheckboxScreenContent.kt:245)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(toggleableState);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            ToggleableState toggleableState2 = (ToggleableState) wh50Var.getValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new g2c(0, wh50Var);
                M.R(x2);
            }
            eku0.a(toggleableState2, (gzs) x2, q630Var, z, null, null, M, (i2 & 896) | 48 | ((i2 << 6) & 7168), 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.h2c
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    i2c.this.e(I, (androidx.compose.runtime.a) obj, toggleableState, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        i2c i2cVar = this;
        androidx.compose.runtime.a M = aVar.M(624308439);
        int i2 = (i & 6) == 0 ? (M.J(i2cVar) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(624308439, i2, -1, "com.vk.design.demo.presentation.screens.CheckboxScreenContent.SingleCheckboxesRow (CheckboxScreenContent.kt:118)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
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
            q630 D2 = s200.D(aVar2, 4);
            M.K(2108121789);
            for (Pair pair : i2cVar.b) {
                VkCheckbox.State state = (VkCheckbox.State) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                int i3 = b.$EnumSwitchMapping$0[((a) ((zak0) i2cVar.d).getValue()).ordinal()];
                if (i3 == 1) {
                    M.K(2108125607);
                    androidx.compose.runtime.a aVar4 = M;
                    i2cVar = this;
                    i2cVar.g(state, booleanValue, D2, aVar4, ((i2 << 9) & 7168) | 384);
                    M = aVar4;
                    M.j();
                } else {
                    if (i3 != 2) {
                        throw alb0.c(2108123418, M);
                    }
                    M.K(2108128670);
                    q630 q630Var = D2;
                    i2cVar.e(((i2 << 9) & 7168) | 384, M, h(state), q630Var, booleanValue);
                    M.j();
                    i2cVar = this;
                    D2 = q630Var;
                }
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t3(i2cVar, i, 1);
        }
    }

    public final void g(final VkCheckbox.State state, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1752619028);
        if ((i & 6) == 0) {
            i2 = (M.o(state.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1752619028, i2, -1, "com.vk.design.demo.presentation.screens.CheckboxScreenContent.ViewSingleCheckbox (CheckboxScreenContent.kt:262)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new vt1(7);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.c2c
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkCheckbox vkCheckbox = (VkCheckbox) obj;
                        vkCheckbox.setCheckedState(VkCheckbox.State.this);
                        vkCheckbox.setEnabled(z);
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            ae2.a(((i2 >> 3) & 112) | 6, 0, M, izsVar, (izs) x2, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.d2c
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i2c.this.g(state, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
