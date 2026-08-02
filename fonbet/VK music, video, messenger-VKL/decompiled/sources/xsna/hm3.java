package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.VkHorizontalArrowDirection;
import com.vk.core.compose.component.VkHorizontalArrowSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: ArrowScreenContent.kt */
/* loaded from: classes18.dex */
public final class hm3 implements yah0 {
    public final LinkedHashMap b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArrowScreenContent.kt */
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

    /* compiled from: ArrowScreenContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Compose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.View.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hm3() {
        zrp<a> h = a.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((a) obj).name());
        }
        this.b = linkedHashMap;
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1561742071);
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
                androidx.compose.runtime.b.f(-1561742071, i2, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.Content (ArrowScreenContent.kt:75)");
            }
            int i4 = (i2 >> 15) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1111920078, i4, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.rememberImplementationType (ArrowScreenContent.kt:66)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(a.Compose);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Horizontal Arrow", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
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
            rrv0.d(null, null, null, null, kai.c(-1947739612, new l6(2, this, wh50Var), M), M, 24576, 15);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cm3
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hm3.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(km3 km3Var, String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(635610269);
        int i2 = i | (M.J(km3Var) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(635610269, i2, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.ComposeImplementation (ArrowScreenContent.kt:146)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new l63(1);
                M.R(x);
            }
            ryu0.a((gzs) x, s200.D(q630.a.a, 4), km3Var.a, km3Var.b, false, null, null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bm3(i, 0, this, km3Var, str);
        }
    }

    public final void c(a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        a aVar3;
        androidx.compose.runtime.a M = aVar2.M(577492878);
        int i2 = i | (M.o(aVar.ordinal()) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(577492878, i2, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.HorizontalArrowsContent (ArrowScreenContent.kt:111)");
            }
            int i3 = (i2 >> 6) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(165968007, i3, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.rememberVariants (ArrowScreenContent.kt:51)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                ListBuilder e = e43.e();
                for (VkHorizontalArrowSize vkHorizontalArrowSize : VkHorizontalArrowSize.h()) {
                    Iterator<E> it = VkHorizontalArrowDirection.h().iterator();
                    while (it.hasNext()) {
                        e.add(new km3(vkHorizontalArrowSize, (VkHorizontalArrowDirection) it.next()));
                    }
                }
                x = e.g();
                M.R(x);
            }
            List list = (List) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D = s200.D(txj0.f(q630Var, 1.0f), 16);
            a.j g = androidx.compose.foundation.layout.a.g(24);
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.o;
            boolean y = ((i2 & 14) == 4) | M.y(list) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                aVar3 = aVar;
                x2 = new yl3(list, aVar3, this, 0);
                M.R(x2);
            } else {
                aVar3 = aVar;
            }
            lqy.a(D, null, null, g, aVar4, null, false, null, (izs) x2, M, 221184, 462);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = aVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zl3(i, 0, this, aVar3, q630Var);
        }
    }

    public final void d(km3 km3Var, String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2143724174);
        int i2 = (M.J(km3Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2143724174, i2, -1, "com.vk.design.demo.presentation.screens.ArrowScreenContent.ViewImplementation (ArrowScreenContent.kt:156)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new p1(km3Var, 5);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, s200.D(q630.a.a, 4));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new am3(i, 0, this, km3Var, str);
        }
    }
}
