package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.radio.VkRadioItem;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: RadioScreenContent.kt */
/* loaded from: classes18.dex */
public final class uue0 implements yah0 {
    public final LinkedHashMap b;
    public final wh50 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadioScreenContent.kt */
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

    /* compiled from: RadioScreenContent.kt */
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

    public uue0() {
        zrp<a> h = a.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((a) obj).name());
        }
        this.b = linkedHashMap;
        this.c = androidx.compose.runtime.k.b(a.Compose);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        gzs gzsVar4;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(-2131455040);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 32 : 16;
        } else {
            gzsVar4 = gzsVar2;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2131455040, i2, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.Content (RadioScreenContent.kt:51)");
            }
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("RadioButton", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a4 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(1644169506);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(1644170339);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a5 = d.c.C0760d.a.a(c, null, gzsVar4, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            M.K(-570050056);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a3, null, null, null, null, a4, d.a.a(a5, d.b.a.C0757a.a(q, null, x5Var, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, true, M, 438, 0);
            float f2 = 4;
            float f3 = 8;
            rzo0.a(54, 0, M, "States", s200.H(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar3), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            e((i2 >> 15) & 14, M);
            rzo0.a(6, 0, M, "Items", s200.H(aVar3, f3, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 4));
            g(((i2 >> 12) & 112) | 6, M);
            a aVar5 = (a) ((zak0) this.c).getValue();
            boolean z = (i2 & 458752) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new fda0(this, 5);
                M.R(x);
            }
            y9i0.a("Implementation", this.b, aVar5, (izs) x, txj0.f(aVar3, 1.0f), M, 24582, 0);
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
            s.d = new azq(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final int i, final rg50 rg50Var, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-713491672);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(rg50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-713491672, i3, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.ComposeRadioButton (RadioScreenContent.kt:175)");
            }
            boolean z2 = rg50Var.getIntValue() == i;
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new sue0(rg50Var, i, 0);
                M.R(x);
            }
            afv0.a(z2, (gzs) x, q630Var, z, null, null, M, ((i3 >> 3) & 896) | ((i3 << 3) & 7168), 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tue0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uue0.this.b(i, rg50Var, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final String str, final String str2, final int i, final rg50 rg50Var, final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-106549958);
        if ((i2 & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(rg50Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.l(z) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-106549958, i3, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.ComposeRadioItem (RadioScreenContent.kt:237)");
            }
            boolean z2 = rg50Var.getIntValue() == i;
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new mv2(rg50Var, i, 1);
                M.R(x);
            }
            int i4 = i3 << 3;
            afv0.b(z2, str, (gzs) x, null, str2, z, M, ((i3 << 9) & 57344) | (i4 & 112) | (i4 & 458752), 72);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.que0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uue0.this.c(str, str2, i, rg50Var, z, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(final int i, final rg50 rg50Var, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        boolean z2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-257904258);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(rg50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-257904258, i3, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.RadioButton (RadioScreenContent.kt:142)");
            }
            int i4 = b.$EnumSwitchMapping$0[((a) ((zak0) this.c).getValue()).ordinal()];
            if (i4 == 1) {
                M.K(1262118937);
                b(i, rg50Var, z, q630Var, M, i3 & 65534);
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(1262116989, M);
                }
                M.K(1262121974);
                h(i, rg50Var, z2, q630Var2, M, i3 & 65534);
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
            s.d = new wzs() { // from class: xsna.pue0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uue0.this.d(i, rg50Var, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        uue0 uue0Var = this;
        androidx.compose.runtime.a M = aVar.M(-973932191);
        int i2 = (i & 6) == 0 ? (M.J(uue0Var) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-973932191, i2, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.RadioButtonsRow (RadioScreenContent.kt:109)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var2 = (rg50) x2;
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(aVar2, 4);
            q630 H = s200.H(aVar2, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-1570964425);
            int i3 = 0;
            while (i3 < 2) {
                uue0Var.d(i3, rg50Var, true, D, M, ((i2 << 12) & 57344) | X2.b.f);
                i3++;
                uue0Var = this;
            }
            M.j();
            M.K(-1570956263);
            for (int i4 = 0; i4 < 2; i4++) {
                d(i4, rg50Var2, false, D, M, ((i2 << 12) & 57344) | X2.b.f);
            }
            uue0Var = this;
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oaz(uue0Var, i, 2);
        }
    }

    public final void f(final int i, final rg50 rg50Var, final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        String str;
        androidx.compose.runtime.a M = aVar.M(-124542588);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(rg50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-124542588, i3, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.RadioItem (RadioScreenContent.kt:214)");
            }
            String str2 = null;
            if (z) {
                str = "Enabled " + (i + 1);
            } else {
                str = i == 0 ? "Disabled" : null;
            }
            if (z && i == 0) {
                str2 = "Click to select";
            }
            int i4 = b.$EnumSwitchMapping$0[((a) ((zak0) this.c).getValue()).ordinal()];
            if (i4 == 1) {
                M.K(573672847);
                c(str, str2, i, rg50Var, z, M, (i3 << 6) & 524160);
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(573670799, M);
                }
                M.K(573676524);
                i(str, str2, i, rg50Var, z, M, (i3 << 6) & 524160);
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
            s.d = new wzs() { // from class: xsna.kue0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uue0.this.f(i, rg50Var, z, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1826107980);
        int i2 = (i & 6) == 0 ? (M.J(r9g.a) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1826107980, i2, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.RadioItemsColumn (RadioScreenContent.kt:148)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var2 = (rg50) x2;
            q630 a2 = q9g.a(q630.a.a, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-619862139);
            for (int i3 = 0; i3 < 2; i3++) {
                f(i3, rg50Var, true, M, ((i2 << 6) & 7168) | Tensorflow.FRAME_WIDTH);
            }
            M.j();
            M.K(-619855353);
            for (int i4 = 0; i4 < 2; i4++) {
                f(i4, rg50Var2, false, M, ((i2 << 6) & 7168) | Tensorflow.FRAME_WIDTH);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new joa(this, i, 3);
        }
    }

    public final void h(final int i, final rg50 rg50Var, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1719375513);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(rg50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1719375513, i3, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.ViewRadioButton (RadioScreenContent.kt:190)");
            }
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z2 = (i4 == 32) | (i5 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new uf4(rg50Var, i, 2);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z3 = (i4 == 32) | (i5 == 4) | ((i3 & 896) == 256);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new vf4(rg50Var, i, z);
                M.R(x2);
            }
            ae2.a((i3 >> 6) & 112, 0, M, izsVar, (izs) x2, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rue0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uue0.this.h(i, rg50Var, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void i(final String str, final String str2, final int i, final rg50 rg50Var, final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        final String str3;
        int i3;
        String str4;
        boolean z2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-133361623);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (M.J(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str4 = str2;
            i3 |= M.J(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(rg50Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-133361623, i3, -1, "com.vk.design.demo.presentation.screens.radio.RadioScreenContent.ViewRadioItem (RadioScreenContent.kt:254)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            int i4 = i3 & 7168;
            int i5 = i3 & 896;
            boolean z3 = (i4 == 2048) | (i5 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new hu1(rg50Var, i, 3);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z4 = (i4 == 2048) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | (i5 == 256) | ((57344 & i3) == 16384);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                final String str5 = str4;
                final boolean z5 = z2;
                izs izsVar2 = new izs() { // from class: xsna.lue0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        VkRadioItem vkRadioItem = (VkRadioItem) obj;
                        String str6 = str3;
                        vkRadioItem.setTitle(str6 != null ? oq.d(tlo0.Companion, str6) : null);
                        String str7 = str5;
                        vkRadioItem.setSubtitle(str7 != null ? oq.d(tlo0.Companion, str7) : null);
                        vkRadioItem.setChecked(rg50Var.getIntValue() == i);
                        vkRadioItem.setEnabled(z5);
                        return s3q0.a;
                    }
                };
                M.R(izsVar2);
                x2 = izsVar2;
            }
            aVar2 = M;
            ae2.a(48, 0, aVar2, izsVar, (izs) x2, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mue0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uue0.this.i(str, str2, i, rg50Var, z, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
