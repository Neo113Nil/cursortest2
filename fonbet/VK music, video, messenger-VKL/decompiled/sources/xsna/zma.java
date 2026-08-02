package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;
import xsna.zma;

/* compiled from: CellButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final class zma implements yah0 {
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CellButtonScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Compose;
        public static final a View;

        static {
            a aVar = new a("View", 0);
            View = aVar;
            a aVar2 = new a("Compose", 1);
            Compose = aVar2;
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

    /* compiled from: CellButtonScreenContent.kt */
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
            int[] iArr2 = new int[CellButton$Appearance.values().length];
            try {
                iArr2[CellButton$Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CellButton$Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CellButton$Appearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public zma() {
        zrp<CellButton$Appearance> h = CellButton$Appearance.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((CellButton$Appearance) obj).name());
        }
        this.b = linkedHashMap;
        zrp<CellButton$IconSize> h2 = CellButton$IconSize.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj2 : h2) {
            linkedHashMap2.put(obj2, ((CellButton$IconSize) obj2).name());
        }
        this.c = linkedHashMap2;
        zrp<CellButton$IconBackgroundStyle> h3 = CellButton$IconBackgroundStyle.h();
        int e3 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3 < 16 ? 16 : e3);
        for (Object obj3 : h3) {
            linkedHashMap3.put(obj3, ((CellButton$IconBackgroundStyle) obj3).name());
        }
        this.d = linkedHashMap3;
        zrp<a> h4 = a.h();
        int e4 = on00.e(c5g.u(h4, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e4 >= 16 ? e4 : 16);
        for (Object obj4 : h4) {
            linkedHashMap4.put(obj4, ((a) obj4).name());
        }
        this.e = linkedHashMap4;
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        tho0 tho0Var;
        boolean z;
        tho0 tho0Var2;
        boolean z2;
        CellButton$IconSize cellButton$IconSize;
        CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle;
        CellButton$Appearance cellButton$Appearance;
        androidx.compose.runtime.a M = aVar.M(-2027774391);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
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
        if (M.t(i2 & 1, (73859 & i2) != 73858)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2027774391, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonScreenContent.Content (CellButtonScreenContent.kt:60)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            boolean booleanValue = ((Boolean) wh50Var.R()).booleanValue();
            izs<? super Boolean, s3q0> K = wh50Var.K();
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = or.a("Title", 0L, 6, M);
            }
            wh50 wh50Var2 = (wh50) x2;
            tho0 tho0Var3 = (tho0) wh50Var2.R();
            izs<? super tho0, s3q0> K2 = wh50Var2.K();
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = or.a("Subtitle", 0L, 6, M);
            }
            wh50 wh50Var3 = (wh50) x3;
            tho0 tho0Var4 = (tho0) wh50Var3.R();
            izs<? super tho0, s3q0> K3 = wh50Var3.K();
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var4 = (wh50) x4;
            boolean booleanValue2 = ((Boolean) wh50Var4.R()).booleanValue();
            izs<? super Boolean, s3q0> K4 = wh50Var4.K();
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = androidx.compose.runtime.k.b(CellButton$Appearance.Neutral);
                M.R(x5);
            }
            wh50 wh50Var5 = (wh50) x5;
            CellButton$Appearance cellButton$Appearance2 = (CellButton$Appearance) wh50Var5.R();
            izs<? super CellButton$Appearance, s3q0> K5 = wh50Var5.K();
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = androidx.compose.runtime.k.b(CellButton$IconSize.Small);
                M.R(x6);
            }
            wh50 wh50Var6 = (wh50) x6;
            CellButton$IconSize cellButton$IconSize2 = (CellButton$IconSize) wh50Var6.R();
            izs<? super CellButton$IconSize, s3q0> K6 = wh50Var6.K();
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = androidx.compose.runtime.k.b(CellButton$IconBackgroundStyle.None);
                M.R(x7);
            }
            wh50 wh50Var7 = (wh50) x7;
            CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle2 = (CellButton$IconBackgroundStyle) wh50Var7.R();
            izs<? super CellButton$IconBackgroundStyle, s3q0> K7 = wh50Var7.K();
            Object x8 = M.x();
            if (x8 == obj) {
                x8 = androidx.compose.runtime.k.b(a.Compose);
                M.R(x8);
            }
            wh50 wh50Var8 = (wh50) x8;
            a aVar3 = (a) wh50Var8.R();
            izs<? super a, s3q0> K8 = wh50Var8.K();
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Cell Button", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            int i4 = i2 << 6;
            TopBar$Before.e a4 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | (i4 & 896), 58);
            M.K(1640523663);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(q, null, x5Var, null, null, null, M, 1572872 | (i2 & 896), 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M.K(1640891571);
            djn0.a(true, true, M, 438, 0);
            q630 a5 = q9g.a(txj0.f(aVar2, 1.0f), 1.0f);
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, a5);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            int i5 = b.$EnumSwitchMapping$0[aVar3.ordinal()];
            if (i5 == 1) {
                M.K(2073198615);
                int i6 = i4 & 29360128;
                tho0Var = tho0Var3;
                z = booleanValue;
                f(z, tho0Var, tho0Var4, booleanValue2, cellButton$Appearance2, cellButton$IconSize2, cellButton$IconBackgroundStyle2, M, i6);
                tho0Var2 = tho0Var4;
                z2 = booleanValue2;
                cellButton$IconSize = cellButton$IconSize2;
                cellButton$IconBackgroundStyle = cellButton$IconBackgroundStyle2;
                cellButton$Appearance = cellButton$Appearance2;
                M = M;
                M.j();
                s3q0 s3q0Var = s3q0.a;
            } else {
                if (i5 != 2) {
                    throw alb0.c(2073196646, M);
                }
                M.K(-154963385);
                String str = tho0Var3.a.c;
                String str2 = tho0Var4.a.c;
                if (!booleanValue2) {
                    str2 = null;
                }
                qzu0.a.getClass();
                lg90 d2 = booleanValue ? qzu0.d(M) : null;
                Object x9 = M.x();
                if (x9 == obj) {
                    x9 = new a44(4);
                    M.R(x9);
                }
                cellButton$Appearance = cellButton$Appearance2;
                cellButton$IconSize = cellButton$IconSize2;
                qiu0.a(str, (gzs) x9, null, d2, null, str2, 0, cellButton$Appearance, null, cellButton$IconSize, null, false, M, 4144, 7508);
                M = M;
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
                tho0Var2 = tho0Var4;
                tho0Var = tho0Var3;
                z = booleanValue;
                z2 = booleanValue2;
                cellButton$IconBackgroundStyle = cellButton$IconBackgroundStyle2;
            }
            M.G();
            int i7 = (i2 >> 3) & 57344;
            c(z, K, tho0Var, K2, M, i7);
            e(z2, K4, tho0Var2, K3, M, i7);
            b(cellButton$Appearance, K5, cellButton$IconSize, K6, M, i7);
            d(cellButton$IconBackgroundStyle, K7, aVar3, K8, M, i7);
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tma(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(CellButton$Appearance cellButton$Appearance, izs<? super CellButton$Appearance, s3q0> izsVar, CellButton$IconSize cellButton$IconSize, izs<? super CellButton$IconSize, s3q0> izsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1537841385);
        if ((i & 6) == 0) {
            i2 = (M.o(cellButton$Appearance.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(cellButton$IconSize.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1537841385, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonScreenContent.AppearanceAndBeforeSizeControls (CellButtonScreenContent.kt:255)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 << 6;
            y9i0.a("Appearance", this.b, cellButton$Appearance, izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, (i3 & 896) | 6 | (i3 & 7168), 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Before size", this.c, cellButton$IconSize, izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, (i2 & 896) | 6 | (i2 & 7168), 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uma(this, cellButton$Appearance, izsVar, cellButton$IconSize, izsVar2, i);
        }
    }

    public final void c(boolean z, izs<? super Boolean, s3q0> izsVar, tho0 tho0Var, izs<? super tho0, s3q0> izsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(58510528);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(tho0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(58510528, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonScreenContent.BeforeAndTitleControls (CellButtonScreenContent.kt:197)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            zov0.b(z, "Before", izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, M, (i2 & 14) | 48 | ((i2 << 3) & 896), 112);
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, izsVar2, null, 0L, 0L, null, null, null, null, null, false, null, M, (i2 >> 6) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196608, 32764), null, false, null, M, 24576, 14);
            M = M;
            hly a4 = h8s.a.a("Title", false, null, null, null, M, 196614, 30);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            nvu0.a(a3, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), a4, null, null, M, 0, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wma(this, z, izsVar, tho0Var, izsVar2, i);
        }
    }

    public final void d(CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, izs<? super CellButton$IconBackgroundStyle, s3q0> izsVar, a aVar, izs<? super a, s3q0> izsVar2, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-23943430);
        if ((i & 6) == 0) {
            i2 = (M.o(cellButton$IconBackgroundStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(aVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-23943430, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonScreenContent.BeforeBackgroundAndImplementationControls (CellButtonScreenContent.kt:282)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
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
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 << 6;
            y9i0.a("Before background", this.d, cellButton$IconBackgroundStyle, izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, (i3 & 896) | 6 | (i3 & 7168), 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            y9i0.a("Implementation", this.e, aVar, izsVar2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, (i2 & 896) | 6 | (i2 & 7168), 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vma(this, cellButton$IconBackgroundStyle, izsVar, aVar, izsVar2, i);
        }
    }

    public final void e(boolean z, izs<? super Boolean, s3q0> izsVar, tho0 tho0Var, izs<? super tho0, s3q0> izsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1926264328);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(tho0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1926264328, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonScreenContent.SubtitleControls (CellButtonScreenContent.kt:226)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            zov0.b(z, "Subtitle", izsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, M, (i2 & 14) | 48 | ((i2 << 3) & 896), 112);
            u2x a3 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, izsVar2, null, 0L, 0L, null, null, null, null, null, false, null, M, (i2 >> 6) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 196608, 32764), null, false, null, M, 24576, 14);
            M = M;
            hly a4 = h8s.a.a("Subtitle", false, null, null, null, M, 196614, 30);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            nvu0.a(a3, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), a4, null, null, M, 0, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mw6(this, z, izsVar, tho0Var, izsVar2, i);
        }
    }

    public final void f(final boolean z, final tho0 tho0Var, final tho0 tho0Var2, final boolean z2, final CellButton$Appearance cellButton$Appearance, final CellButton$IconSize cellButton$IconSize, final CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, androidx.compose.runtime.a aVar, final int i) {
        boolean z3;
        int i2;
        boolean z4;
        androidx.compose.runtime.a M = aVar.M(-1291261001);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (M.l(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(tho0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(tho0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= M.l(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.o(cellButton$Appearance == null ? -1 : cellButton$Appearance.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.o(cellButton$IconSize == null ? -1 : cellButton$IconSize.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.o(cellButton$IconBackgroundStyle == null ? -1 : cellButton$IconBackgroundStyle.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1291261001, i2, -1, "com.vk.design.demo.presentation.screens.CellButtonScreenContent.ViewImplementation (CellButtonScreenContent.kt:160)");
            }
            M.W(343744464, Boolean.FALSE);
            q630 f = txj0.f(q630.a.a, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pl2(6);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z5 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 3670016) == 1048576);
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                final boolean z6 = z3;
                final boolean z7 = z4;
                izs izsVar2 = new izs() { // from class: xsna.xma
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        Appearance appearance;
                        VkCellButton vkCellButton = (VkCellButton) obj;
                        vkCellButton.setTitle(tho0.this.a.c);
                        String str = tho0Var2.a.c;
                        if (!z7) {
                            str = null;
                        }
                        vkCellButton.setSubtitle(str);
                        vkCellButton.a(true, z6 ? Integer.valueOf(R.drawable.vk_icon_add_outline_24) : null);
                        int i3 = zma.b.$EnumSwitchMapping$1[cellButton$Appearance.ordinal()];
                        if (i3 == 1) {
                            appearance = Appearance.Accent;
                        } else if (i3 == 2) {
                            appearance = Appearance.Neutral;
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            appearance = Appearance.Negative;
                        }
                        vkCellButton.setAppearance(appearance);
                        vkCellButton.setIconSize((IconSize) IconSize.h().get(cellButton$IconSize.ordinal()));
                        vkCellButton.setIconBackgroundStyle((IconBackgroundStyle) IconBackgroundStyle.h().get(cellButton$IconBackgroundStyle.ordinal()));
                        vkCellButton.Ng();
                        return s3q0.a;
                    }
                };
                M.R(izsVar2);
                x2 = izsVar2;
            }
            ae2.a(54, 0, M, izsVar, (izs) x2, f);
            M.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yma
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zma.this.f(z, tho0Var, tho0Var2, z2, cellButton$Appearance, cellButton$IconSize, cellButton$IconBackgroundStyle, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
