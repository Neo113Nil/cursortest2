package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.pagination.VkPaginationDots;
import com.vk.core.view.components.pagination.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.se90;
import xsna.ty6;
import xsna.wd90;

/* compiled from: PaginationScreenContent.kt */
/* loaded from: classes18.dex */
public final class se90 implements yah0 {
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaginationScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Circle;
        public static final a Progress;

        static {
            a aVar = new a("Circle", 0);
            Circle = aVar;
            a aVar2 = new a("Progress", 1);
            Progress = aVar2;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaginationScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Compose;
        public static final b View;

        static {
            b bVar = new b("View", 0);
            View = bVar;
            b bVar2 = new b("Compose", 1);
            Compose = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static zrp<b> h() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaginationScreenContent.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Fit;
        public static final c Overflow;

        static {
            c cVar = new c("Fit", 0);
            Fit = cVar;
            c cVar2 = new c("Overflow", 1);
            Overflow = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c() {
            throw null;
        }

        public static zrp<c> h() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* compiled from: PaginationScreenContent.kt */
    public static final class d extends RecyclerView.Adapter<a> {
        public int c;
        public int[] d = new int[this.c];

        /* compiled from: PaginationScreenContent.kt */
        public static final class a extends RecyclerView.e0 {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            aVar.itemView.setBackgroundColor(this.d[i]);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new a(view);
        }

        public final void x0(int i) {
            if (this.c == i) {
                return;
            }
            this.c = i;
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    iArr[i2] = (int) qz9.e(Random.b, new q500(4279308561L, 4293848814L));
                } catch (IllegalArgumentException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            this.d = iArr;
        }
    }

    /* compiled from: PaginationScreenContent.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Compose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.View.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.Fit.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c.Overflow.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[a.values().length];
            try {
                iArr3[a.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[a.Progress.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public se90() {
        zrp<a> h = a.h();
        int e2 = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((a) obj).name());
        }
        this.b = linkedHashMap;
        zrp<c> h2 = c.h();
        int e3 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3 < 16 ? 16 : e3);
        for (Object obj2 : h2) {
            linkedHashMap2.put(obj2, ((c) obj2).name());
        }
        this.c = linkedHashMap2;
        zrp<b> h3 = b.h();
        int e4 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e4 >= 16 ? e4 : 16);
        for (Object obj3 : h3) {
            linkedHashMap3.put(obj3, ((b) obj3).name());
        }
        this.d = linkedHashMap3;
        this.e = androidx.compose.runtime.k.b(a.Progress);
        this.f = androidx.compose.runtime.k.b(c.Overflow);
        this.g = androidx.compose.runtime.k.b(b.Compose);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 c2;
        androidx.compose.runtime.a M = aVar.M(-1383472887);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73747 & i2) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1383472887, i2, -1, "com.vk.design.demo.presentation.screens.PaginationScreenContent.Content (PaginationScreenContent.kt:74)");
            }
            q630 d2 = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, d2);
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
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Card", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(1721203787);
                c2 = jh.c(qzu0.a, M);
            } else {
                M.K(1721204620);
                c2 = j8.c(qzu0.a, M);
            }
            boolean z = (i4 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new s1x(gzsVar2, 20);
                M.R(x);
            }
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(c2, null, (gzs) x, null, null, null, M, 1572872, 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M = M;
            djn0.a(true, true, M, 438, 0);
            q630 a5 = q9g.a(txj0.f(aVar2, 1.0f), 1.0f);
            androidx.compose.foundation.layout.c a6 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, a5);
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
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            int i5 = e.$EnumSwitchMapping$0[((b) ((zak0) this.g).getValue()).ordinal()];
            if (i5 == 1) {
                M.K(-213277499);
                b(((i4 >> 12) & 112) | 6, M);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            } else {
                if (i5 != 2) {
                    throw alb0.c(-213279838, M);
                }
                M.K(-213275454);
                d((i4 >> 15) & 14, M);
                M.j();
                s3q0 s3q0Var2 = s3q0.a;
            }
            c((i4 >> 15) & 14, M);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bdh(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        int i2;
        wd90 wd90Var;
        androidx.compose.runtime.a M = aVar.M(346368713);
        int i3 = (i & 48) == 0 ? (M.J(this) ? 32 : 16) | i : i;
        if (M.t(i3 & 1, (i3 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(346368713, i3, -1, "com.vk.design.demo.presentation.screens.PaginationScreenContent.ComposeContent (PaginationScreenContent.kt:107)");
            }
            int i4 = e.$EnumSwitchMapping$1[((c) ((zak0) this.f).getValue()).ordinal()];
            if (i4 == 1) {
                i2 = 5;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 14;
            }
            boolean o = M.o(i2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = new xev(i2);
                M.R(x);
            }
            yjl b2 = rc90.b(0, (gzs) x, M, 0, 3);
            Object x2 = M.x();
            Object obj = x2;
            if (x2 == c0012a) {
                ArrayList arrayList = new ArrayList(14);
                int i5 = 0;
                for (int i6 = 14; i5 < i6; i6 = 14) {
                    try {
                        arrayList.add(new l5g(f870.d(qz9.e(Random.b, new q500(4279308561L, 4293848814L)))));
                        i5++;
                    } catch (IllegalArgumentException e2) {
                        throw new NoSuchElementException(e2.getMessage());
                    }
                }
                M.R(arrayList);
                obj = arrayList;
            }
            final List list = (List) obj;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x3);
            }
            if2 if2Var = (if2) x3;
            if (e() == a.Progress) {
                M.K(-2135538757);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x4);
                }
                wh50 wh50Var = (wh50) x4;
                Integer valueOf = Integer.valueOf(b2.r());
                boolean y = M.y(if2Var);
                Object x5 = M.x();
                if (y || x5 == c0012a) {
                    x5 = new oe90(5000, if2Var, null);
                    M.R(x5);
                }
                bap.g(valueOf, (wzs) x5, M, 0);
                Boolean valueOf2 = Boolean.valueOf(((Number) if2Var.d()).floatValue() == 1.0f);
                boolean y2 = M.y(if2Var);
                Object x6 = M.x();
                if (y2 || x6 == c0012a) {
                    x6 = new pe90(if2Var, wh50Var, null);
                    M.R(x6);
                }
                bap.g(valueOf2, (wzs) x6, M, 0);
                Boolean bool = (Boolean) wh50Var.getValue();
                bool.getClass();
                boolean J = M.J(b2);
                Object x7 = M.x();
                if (J || x7 == c0012a) {
                    x7 = new qe90(b2, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, wh50Var, null);
                    M.R(x7);
                }
                bap.g(bool, (wzs) x7, M, 0);
                Boolean valueOf3 = Boolean.valueOf(((Boolean) wh50Var.getValue()).booleanValue() && !b2.k.a());
                boolean y3 = M.y(if2Var);
                Object x8 = M.x();
                if (y3 || x8 == c0012a) {
                    x8 = new re90(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, if2Var, wh50Var, null);
                    M.R(x8);
                }
                bap.g(valueOf3, (wzs) x8, M, 0);
            } else {
                M.K(-2140676263);
            }
            M.j();
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
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
            aVar2 = M;
            int i7 = i2;
            nb90.a(b2, txj0.f(txj0.h(aVar3, 96), 1.0f), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(1566691762, new zzs() { // from class: xsna.ne90
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int intValue = ((Integer) obj3).intValue();
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj4;
                    int intValue2 = ((Integer) obj5).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1566691762, intValue2, -1, "com.vk.design.demo.presentation.screens.PaginationScreenContent.ComposeContent.<anonymous>.<anonymous> (PaginationScreenContent.kt:181)");
                    }
                    ja8.a(txj0.f(txj0.h(hr80.m(q630.a.a, ((l5g) list.get(intValue)).a, androidx.compose.ui.graphics.e.a), 96), 1.0f), aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 48, 24576, 16380);
            int i8 = e.$EnumSwitchMapping$2[e().ordinal()];
            if (i8 == 1) {
                wd90Var = wd90.a.a;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                wd90Var = new wd90.b(((Number) if2Var.d()).floatValue());
            }
            oav0.b(wd90Var, i7, b2.k(), txj0.f(aVar3, 1.0f), 0L, null, null, 0, aVar2, 3072, PsExtractor.VIDEO_STREAM_MASK);
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
            s.d = new b0l(this, i, 2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1191307528);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1191307528, i2, -1, "com.vk.design.demo.presentation.screens.PaginationScreenContent.Controls (PaginationScreenContent.kt:396)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.d, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            q630 f2 = txj0.f(aVar2, 1.0f);
            a e2 = e();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new o440(this, 9);
                M.R(x);
            }
            y9i0.a("Mode", this.b, e2, (izs) x, f2, M, 24582, 0);
            q630 f3 = txj0.f(aVar2, 1.0f);
            c cVar = (c) ((zak0) this.f).getValue();
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new rj60(this, 5);
                M.R(x2);
            }
            y9i0.a("Pages count", this.c, cVar, (izs) x2, f3, M, 24582, 0);
            q630 f4 = txj0.f(aVar2, 1.0f);
            b bVar = (b) ((zak0) this.g).getValue();
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new gj80(this, 1);
                M.R(x3);
            }
            y9i0.a("Implementation", this.d, bVar, (izs) x3, f4, M, 24582, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jma(this, i, 1);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        se90 se90Var;
        androidx.compose.runtime.a aVar2;
        final int i3;
        int i4;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-70095798);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-70095798, i2, -1, "com.vk.design.demo.presentation.screens.PaginationScreenContent.ViewContent (PaginationScreenContent.kt:201)");
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            int i5 = e.$EnumSwitchMapping$1[((c) ((zak0) this.f).getValue()).ordinal()];
            if (i5 == 1) {
                i3 = 5;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 14;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                i4 = i2;
                ofFloat.setDuration(5000L);
                M.R(ofFloat);
                obj = ofFloat;
            } else {
                i4 = i2;
                obj = x;
            }
            final ValueAnimator valueAnimator = (ValueAnimator) obj;
            ke90 ke90Var = new ke90(ref$ObjectRef, 0);
            int i6 = (i4 << 3) & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1840626899, i6, -1, "com.vk.design.demo.presentation.screens.PaginationScreenContent.rememberPagerProgressRestartListener (PaginationScreenContent.kt:363)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ve90(this, ke90Var);
                M.R(x2);
            }
            final ve90 ve90Var = (ve90) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new z880(1, this, ref$ObjectRef2);
                M.R(x3);
            }
            final ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) x3;
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
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
            q630 f2 = txj0.f(aVar3, 1.0f);
            izs izsVar = new izs() { // from class: xsna.le90
                /* JADX WARN: Type inference failed for: r11v7, types: [T, androidx.viewpager2.widget.ViewPager2] */
                /* JADX WARN: Type inference failed for: r11v9, types: [T, com.vk.core.view.components.pagination.VkPaginationDots] */
                @Override // xsna.izs
                public final Object invoke(Object obj2) {
                    com.vk.core.view.components.pagination.a aVar5;
                    Context context = (Context) obj2;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(1);
                    ViewPager2 viewPager2 = new ViewPager2(context);
                    se90.d dVar = new se90.d();
                    int i7 = i3;
                    dVar.x0(i7);
                    dVar.notifyDataSetChanged();
                    viewPager2.setAdapter(dVar);
                    se90 se90Var2 = se90.this;
                    ValueAnimator valueAnimator2 = valueAnimator;
                    viewPager2.b(new te90(se90Var2, valueAnimator2));
                    VkPaginationDots vkPaginationDots = new VkPaginationDots(context, null, 6);
                    int i8 = se90.e.$EnumSwitchMapping$2[se90Var2.e().ordinal()];
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = animatorUpdateListener;
                    ve90 ve90Var2 = ve90Var;
                    if (i8 == 1) {
                        valueAnimator2.removeUpdateListener(animatorUpdateListener2);
                        valueAnimator2.removeListener(ve90Var2);
                        valueAnimator2.cancel();
                        aVar5 = a.C0850a.a;
                    } else {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        valueAnimator2.addUpdateListener(animatorUpdateListener2);
                        valueAnimator2.addListener(ve90Var2);
                        valueAnimator2.start();
                        aVar5 = new a.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                    vkPaginationDots.setMode(aVar5);
                    vkPaginationDots.setDotsCount(i7);
                    linearLayout.addView(viewPager2, new LinearLayout.LayoutParams(-1, hbh0.b(96, context)));
                    linearLayout.addView(vkPaginationDots, new LinearLayout.LayoutParams(-2, -2));
                    sav0 sav0Var = new sav0(vkPaginationDots, viewPager2);
                    bwt0.g(linearLayout, new sy50(sav0Var, 6));
                    linearLayout.addOnAttachStateChangeListener(new ue90(linearLayout, sav0Var));
                    ref$ObjectRef.element = (ViewPager2) linearLayout.getChildAt(0);
                    ref$ObjectRef2.element = (VkPaginationDots) linearLayout.getChildAt(1);
                    return linearLayout;
                }
            };
            final int i7 = i3;
            boolean o = M.o(i7) | ((i4 & 14) == 4) | M.y(valueAnimator) | M.y(animatorUpdateListener) | M.J(ve90Var);
            Object x4 = M.x();
            if (o || x4 == c0012a) {
                izs izsVar2 = new izs() { // from class: xsna.me90
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        com.vk.core.view.components.pagination.a aVar5;
                        LinearLayout linearLayout = (LinearLayout) obj2;
                        se90.d dVar = (se90.d) ((ViewPager2) linearLayout.getChildAt(0)).getAdapter();
                        dVar.x0(i7);
                        dVar.notifyDataSetChanged();
                        VkPaginationDots vkPaginationDots = (VkPaginationDots) linearLayout.getChildAt(1);
                        int i8 = se90.e.$EnumSwitchMapping$2[this.e().ordinal()];
                        ValueAnimator valueAnimator2 = valueAnimator;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = animatorUpdateListener;
                        ve90 ve90Var2 = ve90Var;
                        if (i8 == 1) {
                            valueAnimator2.removeUpdateListener(animatorUpdateListener2);
                            valueAnimator2.removeListener(ve90Var2);
                            valueAnimator2.cancel();
                            aVar5 = a.C0850a.a;
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            valueAnimator2.addUpdateListener(animatorUpdateListener2);
                            valueAnimator2.addListener(ve90Var2);
                            valueAnimator2.start();
                            aVar5 = new a.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                        }
                        vkPaginationDots.setMode(aVar5);
                        return s3q0.a;
                    }
                };
                se90Var = this;
                M.R(izsVar2);
                x4 = izsVar2;
            } else {
                se90Var = this;
            }
            aVar2 = M;
            ae2.a(48, 0, aVar2, izsVar, (izs) x4, f2);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            se90Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bmp(se90Var, i, 1);
        }
    }

    public final a e() {
        return (a) ((zak0) this.e).getValue();
    }
}
