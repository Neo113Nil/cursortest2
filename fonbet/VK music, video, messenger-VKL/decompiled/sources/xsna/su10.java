package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.view.components.paging.list.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vkontakte.android.R;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.random.Random;
import xsna.cri;
import xsna.dt1;
import xsna.ehw;
import xsna.q630;
import xsna.ty6;

/* compiled from: MediaPickerScreenContent.kt */
/* loaded from: classes18.dex */
public final class su10 implements yah0, w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new nwk(this, 18));
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final List f;
    public final List g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public dw20 q;
    public VkMediaPicker r;
    public int s;
    public final ArrayList t;
    public final ArrayList u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPickerScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Check;
        public static final a Counter;
        public static final a Disabled;

        static {
            a aVar = new a("Disabled", 0);
            Disabled = aVar;
            a aVar2 = new a("Check", 1);
            Check = aVar2;
            a aVar3 = new a("Counter", 2);
            Counter = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
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

    /* compiled from: MediaPickerScreenContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkMediaPicker.CellAspectRation.values().length];
            try {
                iArr[VkMediaPicker.CellAspectRation.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkMediaPicker.CellAspectRation.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.Check.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.Counter.ordinal()] = 3;
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
            return jw5.b(Long.valueOf(((ehw) t2).c), Long.valueOf(((ehw) t).c));
        }
    }

    public su10() {
        zrp<VkMediaPicker.CellAspectRation> h = VkMediaPicker.CellAspectRation.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(((VkMediaPicker.CellAspectRation) obj).name(), obj);
        }
        this.c = linkedHashMap;
        zrp<a> h2 = a.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj2 : h2) {
            linkedHashMap2.put(((a) obj2).name(), obj2);
        }
        this.d = linkedHashMap2;
        zrp<MediaPickerConfiguration.MediaType> h3 = MediaPickerConfiguration.MediaType.h();
        int e3 = on00.e(c5g.u(h3, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
        for (Object obj3 : h3) {
            linkedHashMap3.put(((MediaPickerConfiguration.MediaType) obj3).name(), obj3);
        }
        this.e = linkedHashMap3;
        this.f = e43.l("https://sun9-62.userapi.com/z4_z-ls5mVpMw1edyggl4gz6RoItDjH0pGxbyg/FII3YzuW73Y.jpg", "https://pp.userapi.com/c639222/v639222699/5e1d8/2wtUaVn4Pho.jpg");
        this.g = e43.l("Album", "Big album", "Empty Album", "Error");
        Boolean bool = Boolean.TRUE;
        this.h = androidx.compose.runtime.k.b(bool);
        this.i = androidx.compose.runtime.k.b(bool);
        this.j = androidx.compose.runtime.k.b(bool);
        this.k = androidx.compose.runtime.k.b(bool);
        this.l = androidx.compose.runtime.k.b(bool);
        this.m = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.n = androidx.compose.runtime.k.b(VkMediaPicker.CellAspectRation.Vertical);
        this.o = androidx.compose.runtime.k.b(a.Counter);
        this.p = androidx.compose.runtime.k.b(MediaPickerConfiguration.MediaType.All);
        this.t = new ArrayList();
        this.u = new ArrayList();
    }

    public static final void c(su10 su10Var, uai0 uai0Var) {
        ArrayList arrayList = su10Var.u;
        if (((a) ((zak0) su10Var.o).getValue()) == a.Disabled) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((uai0) it.next()).a == uai0Var.a) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
        } else {
            arrayList.add(uai0Var);
        }
        su10Var.h();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1675663397);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1675663397, i2, -1, "com.vk.design.demo.presentation.screens.MediaPickerScreenContent.Content (MediaPickerScreenContent.kt:100)");
            }
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
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Media Picker", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.h(a3, null, null, null, null, TopBar$Before.e.a.a(b2, null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(false, true, M, 438, 0);
            q630 D2 = p490.D(aVar2, p490.x(M), 14);
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 48);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            b((i4 >> 15) & 14, M);
            Object obj = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            float f2 = 16;
            q630 F = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            ty6.a aVar5 = dt1.a.o;
            q630 c4 = lr.c(aVar5, F);
            boolean y = M.y(this) | M.y(obj);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (y || x == obj2) {
                x = new cm(19, this, obj);
                M.R(x);
            }
            mpj0.a(6, 0, M, "Show Stub Media Picker", (gzs) x, c4);
            if (((ou10) this.b.getValue()) != null) {
                M.K(1785263008);
                q630 c5 = lr.c(aVar5, s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)));
                boolean y2 = M.y(this) | M.y(obj);
                Object x2 = M.x();
                if (y2 || x2 == obj2) {
                    x2 = new n0(19, this, obj);
                    M.R(x2);
                }
                mpj0.a(6, 0, M, "Show Gallery Media Picker", (gzs) x2, c5);
            } else {
                M.K(1779396475);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ru10(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1212847078);
        if ((i & 6) == 0) {
            i2 = (M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1212847078, i2, -1, "com.vk.design.demo.presentation.screens.MediaPickerScreenContent.Controls (MediaPickerScreenContent.kt:205)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.h).getValue()).booleanValue();
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new r010(this, 1);
                M.R(x);
            }
            eku0.d("Show camera item", (gzs) x, null, booleanValue, null, false, false, M, 6, 116);
            boolean booleanValue2 = ((Boolean) ((zak0) this.i).getValue()).booleanValue();
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new flu(this, 16);
                M.R(x2);
            }
            eku0.d("Show header", (gzs) x2, null, booleanValue2, null, false, false, M, 6, 116);
            boolean booleanValue3 = ((Boolean) ((zak0) this.j).getValue()).booleanValue();
            boolean y3 = M.y(this);
            Object x3 = M.x();
            if (y3 || x3 == c0012a) {
                x3 = new xis(this, 16);
                M.R(x3);
            }
            eku0.d("Show bottom preview", (gzs) x3, null, booleanValue3, null, false, false, M, 6, 116);
            boolean booleanValue4 = ((Boolean) ((zak0) this.k).getValue()).booleanValue();
            boolean y4 = M.y(this);
            Object x4 = M.x();
            if (y4 || x4 == c0012a) {
                x4 = new m1y(this, 4);
                M.R(x4);
            }
            eku0.d("Show scrollbar with dates", (gzs) x4, null, booleanValue4, null, false, false, M, 6, 116);
            boolean booleanValue5 = ((Boolean) ((zak0) this.l).getValue()).booleanValue();
            boolean y5 = M.y(this);
            Object x5 = M.x();
            if (y5 || x5 == c0012a) {
                x5 = new z3i(this, 26);
                M.R(x5);
            }
            eku0.d("Is pinch to zoom enabled", (gzs) x5, null, booleanValue5, null, false, false, M, 6, 116);
            boolean booleanValue6 = ((Boolean) ((zak0) this.m).getValue()).booleanValue();
            boolean y6 = M.y(this);
            Object x6 = M.x();
            if (y6 || x6 == c0012a) {
                x6 = new tju(this, 7);
                M.R(x6);
            }
            eku0.d("Show permission restricted warning", (gzs) x6, null, booleanValue6, null, false, false, M, 6, 116);
            String name = ((VkMediaPicker.CellAspectRation) ((zak0) this.n).getValue()).name();
            boolean y7 = M.y(this);
            Object x7 = M.x();
            if (y7 || x7 == c0012a) {
                x7 = new cww(this, 6);
                M.R(x7);
            }
            y9i0.a("Aspect Ratio", this.c, name, (izs) x7, null, M, 6, 16);
            String name2 = ((a) ((zak0) this.o).getValue()).name();
            boolean y8 = M.y(this);
            Object x8 = M.x();
            if (y8 || x8 == c0012a) {
                x8 = new p010(this, 4);
                M.R(x8);
            }
            y9i0.a("Multiselect mode", this.d, name2, (izs) x8, null, M, 6, 16);
            String name3 = ((MediaPickerConfiguration.MediaType) ((zak0) this.p).getValue()).name();
            boolean y9 = M.y(this);
            Object x9 = M.x();
            if (y9 || x9 == c0012a) {
                x9 = new d410(this, 3);
                M.R(x9);
            }
            y9i0.a("Media type", this.e, name3, (izs) x9, null, M, 6, 16);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v9q(this, i, 2);
        }
    }

    public final List<yp10> d(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int size = this.t.size();
            Instant now = Instant.now();
            Instant minus = now.minus(600L, (TemporalUnit) ChronoUnit.DAYS);
            Random.Default r8 = Random.b;
            long epochMilli = minus.toEpochMilli();
            long epochMilli2 = now.toEpochMilli();
            r8.getClass();
            gg ggVar = Random.c;
            long o = ggVar.o(epochMilli, epochMilli2);
            int i3 = size + i2;
            List list = this.f;
            Uri parse = Uri.parse((String) list.get(ggVar.l(0, list.size())));
            ehw.b e = e(i3);
            ehw.a.AbstractC2809a.b bVar = null;
            ehw.a.b.C2812b c2812b = ggVar.d() ? new ehw.a.b.C2812b(o) : null;
            wh50 wh50Var = this.p;
            if (((MediaPickerConfiguration.MediaType) ((zak0) wh50Var).getValue()) == MediaPickerConfiguration.MediaType.Video || (((MediaPickerConfiguration.MediaType) ((zak0) wh50Var).getValue()) == MediaPickerConfiguration.MediaType.All && ggVar.d())) {
                bVar = new ehw.a.AbstractC2809a.b("00:23");
            }
            arrayList.add(new ehw(i3, parse, o, "", null, e, new ehw.a(c2812b, bVar, 4)));
        }
        return j5g.D0(new c(), arrayList);
    }

    public final ehw.b e(int i) {
        Object obj;
        int i2 = b.$EnumSwitchMapping$1[((a) ((zak0) this.o).getValue()).ordinal()];
        if (i2 == 1) {
            return ehw.b.c.a;
        }
        ArrayList arrayList = this.u;
        if (i2 == 2) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((uai0) obj).a == i) {
                    break;
                }
            }
            return obj != null ? ehw.b.a.a : ehw.b.d.a;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            }
            if (((uai0) it2.next()).a == i) {
                break;
            }
            i3++;
        }
        return i3 >= 0 ? new ehw.b.C2813b(i3 + 1) : ehw.b.d.a;
    }

    public final void f(Context context) {
        int i;
        int i2 = this.s;
        if (i2 == 1) {
            i = 450;
        } else if (i2 == 2) {
            i = 0;
        } else if (i2 != 3) {
            Random.b.getClass();
            i = Random.c.l(10, 200);
        } else {
            i = -1;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        if (i < 0) {
            VkMediaPicker vkMediaPicker = this.r;
            if (vkMediaPicker != null) {
                VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6);
                com.vk.core.view.components.paging.list.a a2 = a.C0851a.a(context, new km1(13, this, context));
                vkPlaceholder.setTop(a2.a);
                vkPlaceholder.setMiddle(a2.b);
                vkPlaceholder.setBottom(a2.c);
                vkMediaPicker.setState(new VkMediaPicker.State.a(vkPlaceholder));
                return;
            }
            return;
        }
        if (size != 0) {
            if (size < i) {
                arrayList.addAll(d(100));
                h();
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList(d(Math.min(i, 100)));
        if (((Boolean) ((zak0) this.h).getValue()).booleanValue()) {
            arrayList2.add(0, new pg9(true, ((MediaPickerConfiguration.MediaType) ((zak0) this.p).getValue()) != MediaPickerConfiguration.MediaType.All));
        }
        if (((Boolean) ((zak0) this.m).getValue()).booleanValue()) {
            arrayList2.add(0, fk90.a);
        }
        arrayList.addAll(arrayList2);
        h();
    }

    public final void g(Context context) {
        this.t.clear();
        this.u.clear();
        f(context);
    }

    public final void h() {
        VkMediaPicker vkMediaPicker = this.r;
        if (vkMediaPicker != null) {
            ArrayList arrayList = this.t;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yp10 yp10Var = (yp10) it.next();
                if (yp10Var instanceof ehw) {
                    ehw ehwVar = (ehw) yp10Var;
                    yp10Var = new ehw(ehwVar.a, ehwVar.b, ehwVar.c, ehwVar.d, ehwVar.e, e(ehwVar.a), ehwVar.g);
                }
                arrayList2.add(yp10Var);
            }
            vkMediaPicker.setState(new VkMediaPicker.State.b(arrayList2, this.u, VkMediaPicker.State.Footer.Invisible));
        }
    }
}
