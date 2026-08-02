package xsna;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.udt;
import xsna.vbh0;

/* compiled from: ScreenHelper.kt */
/* loaded from: classes17.dex */
public final class vbh0 {
    public static final float a = 450;

    /* compiled from: ScreenHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ScreenHelper.kt */
    @b6l(c = "com.vk.games.presentation.utils.ScreenHelperKt$addViewAnalytic$2$1", f = "ScreenHelper.kt", l = {167}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List<mhp0> $analyticList;
        final /* synthetic */ boolean $isActive;
        final /* synthetic */ wh50<Boolean> $isScreenVisible$delegate;
        final /* synthetic */ izs<mhp0, s3q0> $onView;
        final /* synthetic */ xvy $this_addViewAnalytic;
        int label;

        /* compiled from: ScreenHelper.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ boolean b;
            public final /* synthetic */ List<mhp0> c;
            public final /* synthetic */ wh50<Boolean> d;
            public final /* synthetic */ izs<mhp0, s3q0> e;

            public a(List list, izs izsVar, wh50 wh50Var, boolean z) {
                this.b = z;
                this.c = list;
                this.d = wh50Var;
                this.e = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                Iterable iterable;
                List list = (List) obj;
                float f = vbh0.a;
                if (!this.d.getValue().booleanValue() || !this.b) {
                    return s3q0.a;
                }
                if (list.isEmpty()) {
                    iterable = EmptyList.b;
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((xuy) it.next()).getIndex()));
                    }
                    Set S0 = j5g.S0(arrayList);
                    List<mhp0> list3 = this.c;
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    for (T t : list3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        mhp0 mhp0Var = S0.contains(Integer.valueOf(i)) ? (mhp0) t : null;
                        if (mhp0Var != null) {
                            arrayList2.add(mhp0Var);
                        }
                        i = i2;
                    }
                    iterable = arrayList2;
                }
                Iterator<T> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    this.e.invoke((mhp0) it2.next());
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, spj spjVar, izs izsVar, xvy xvyVar, wh50 wh50Var, boolean z) {
            super(2, spjVar);
            this.$this_addViewAnalytic = xvyVar;
            this.$isActive = z;
            this.$analyticList = list;
            this.$isScreenVisible$delegate = wh50Var;
            this.$onView = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            xvy xvyVar = this.$this_addViewAnalytic;
            boolean z = this.$isActive;
            return new b(this.$analyticList, spjVar, this.$onView, xvyVar, this.$isScreenVisible$delegate, z);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new dj60(this.$this_addViewAnalytic, 20));
                boolean z = this.$isActive;
                a aVar = new a(this.$analyticList, this.$onView, this.$isScreenVisible$delegate, z);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class c implements kgn {
        public final /* synthetic */ f5z a;
        public final /* synthetic */ kbh0 b;
        public final /* synthetic */ View c;
        public final /* synthetic */ jbh0 d;

        public c(f5z f5zVar, kbh0 kbh0Var, View view, jbh0 jbh0Var) {
            this.a = f5zVar;
            this.b = kbh0Var;
            this.c = view;
            this.d = jbh0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }
    }

    /* compiled from: ScreenHelper.kt */
    @b6l(c = "com.vk.games.presentation.utils.ScreenHelperKt$addViewAppAnalytics$2$1", f = "ScreenHelper.kt", l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List<uet> $analyticList;
        final /* synthetic */ boolean $isActive;
        final /* synthetic */ wh50<Boolean> $isScreenVisible$delegate;
        final /* synthetic */ izs<uet, s3q0> $onView;
        final /* synthetic */ xvy $this_addViewAppAnalytics;
        int label;

        /* compiled from: ScreenHelper.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ boolean b;
            public final /* synthetic */ List<T> c;
            public final /* synthetic */ izs<uet, s3q0> d;
            public final /* synthetic */ wh50<Boolean> e;

            public a(List list, izs izsVar, wh50 wh50Var, boolean z) {
                this.b = z;
                this.c = list;
                this.d = izsVar;
                this.e = wh50Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                Iterable iterable;
                List list = (List) obj;
                float f = vbh0.a;
                if (!this.e.getValue().booleanValue() || !this.b) {
                    return s3q0.a;
                }
                if (list.isEmpty()) {
                    iterable = EmptyList.b;
                } else {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((xuy) it.next()).getIndex()));
                    }
                    Set S0 = j5g.S0(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    for (T t : this.c) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        uet uetVar = S0.contains(Integer.valueOf(i)) ? (uet) t : null;
                        if (uetVar != null) {
                            arrayList2.add(uetVar);
                        }
                        i = i2;
                    }
                    iterable = arrayList2;
                }
                Iterator<T> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    this.d.invoke(it2.next());
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, spj spjVar, izs izsVar, xvy xvyVar, wh50 wh50Var, boolean z) {
            super(2, spjVar);
            this.$this_addViewAppAnalytics = xvyVar;
            this.$isActive = z;
            this.$analyticList = list;
            this.$onView = izsVar;
            this.$isScreenVisible$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$analyticList, spjVar, this.$onView, this.$this_addViewAppAnalytics, this.$isScreenVisible$delegate, this.$isActive);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new bi80(this.$this_addViewAppAnalytics, 13));
                a aVar = new a(this.$analyticList, this.$onView, this.$isScreenVisible$delegate, this.$isActive);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class e implements kgn {
        public final /* synthetic */ f5z a;
        public final /* synthetic */ nbh0 b;
        public final /* synthetic */ View c;
        public final /* synthetic */ mbh0 d;

        public e(f5z f5zVar, nbh0 nbh0Var, View view, mbh0 mbh0Var) {
            this.a = f5zVar;
            this.b = nbh0Var;
            this.c = view;
            this.d = mbh0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, androidx.compose.runtime.a aVar, final List list, final izs izsVar, final xvy xvyVar, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-837459969);
        int i2 = i | (M.J(xvyVar) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-837459969, i2, -1, "com.vk.games.presentation.utils.addViewAnalytic (ScreenHelper.kt:135)");
            }
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                ListBuilder e2 = e43.e();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dct dctVar = (dct) it.next();
                    if (dctVar instanceof xsx0) {
                        e2.add(dctVar);
                    }
                    if (dctVar instanceof udt.b) {
                        for (s90 s90Var : ((udt.b) dctVar).c) {
                            e2.add(dctVar);
                        }
                    } else if (dctVar instanceof udt.f) {
                        for (r7t r7tVar : ((udt.f) dctVar).c) {
                            e2.add(dctVar);
                        }
                    } else {
                        e2.add(dctVar);
                    }
                }
                x = e2.g();
                M.R(x);
            }
            List list2 = (List) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) x3;
            Object obj2 = (f5z) M.r(bvz.a);
            Object obj3 = (View) M.r(AndroidCompositionLocals_androidKt.f);
            boolean y = M.y(obj3) | M.y(obj2);
            Object x4 = M.x();
            if (y || x4 == obj) {
                Object qbh0Var = new qbh0(obj2, obj3, wh50Var2, wh50Var, 0);
                M.R(qbh0Var);
                x4 = qbh0Var;
            }
            bap.b(obj3, obj2, (izs) x4, M, 0);
            wow wowVar = new wow(list);
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) wh50Var2.getValue();
            bool2.getClass();
            Object[] objArr = {xvyVar, wowVar, bool, bool2, Boolean.valueOf(z)};
            boolean y2 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | M.y(list2) | ((i2 & 896) == 256);
            Object x5 = M.x();
            if (y2 || x5 == obj) {
                Object bVar = new b(list2, null, izsVar, xvyVar, wh50Var2, z);
                M.R(bVar);
                x5 = bVar;
            }
            bap.h(objArr, (wzs) x5, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, list, izsVar, xvyVar, z) { // from class: xsna.rbh0
                public final /* synthetic */ xvy b;
                public final /* synthetic */ List c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ boolean e;

                {
                    this.b = xvyVar;
                    this.c = list;
                    this.d = izsVar;
                    this.e = z;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    vbh0.a(ne7.I(1), (androidx.compose.runtime.a) obj4, this.c, this.d, this.b, this.e);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final int i, androidx.compose.runtime.a aVar, final List list, final izs izsVar, final xvy xvyVar, final boolean z) {
        int i2;
        boolean z2;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(1317385047);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        } else {
            izsVar2 = izsVar;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1317385047, i2, -1, "com.vk.games.presentation.utils.addViewAppAnalytics (ScreenHelper.kt:94)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            f5z f5zVar = (f5z) M.r(bvz.a);
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            boolean y = M.y(view) | M.y(f5zVar);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new txv(f5zVar, view, wh50Var2, wh50Var, 2);
                M.R(x3);
            }
            bap.b(view, f5zVar, (izs) x3, M, 0);
            wow wowVar = new wow(list);
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) wh50Var2.getValue();
            bool2.getClass();
            Object[] objArr = {xvyVar, wowVar, bool, bool2, Boolean.valueOf(z2)};
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                d dVar = new d(list, null, izsVar2, xvyVar, wh50Var2, z2);
                M.R(dVar);
                x4 = dVar;
            }
            bap.h(objArr, (wzs) x4, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lbh0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    vbh0.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, list, izsVar, xvyVar, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final float c(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1223516154, 0, -1, "com.vk.games.presentation.utils.calculateBannerWidth (ScreenHelper.kt:45)");
        }
        Configuration configuration = (Configuration) aVar.r(AndroidCompositionLocals_androidKt.a);
        boolean o = aVar.o(configuration.smallestScreenWidthDp);
        Object x = aVar.x();
        if (o || x == a.C0011a.a) {
            pco pcoVar = new pco(configuration.smallestScreenWidthDp * 0.7777778f);
            pco pcoVar2 = new pco(a);
            if (pcoVar.compareTo(pcoVar2) > 0) {
                pcoVar = pcoVar2;
            }
            x = new pco(pcoVar.b);
            aVar.R(x);
        }
        float f = ((pco) x).b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }

    public static final boolean d(androidx.compose.runtime.a aVar) {
        boolean z = false;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1808167342, 0, -1, "com.vk.games.presentation.utils.rememberIsPhonePortrait (ScreenHelper.kt:67)");
        }
        Configuration configuration = (Configuration) aVar.r(AndroidCompositionLocals_androidKt.a);
        boolean J = aVar.J(configuration);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            if (configuration.orientation == 1 && configuration.screenWidthDp < 600) {
                z = true;
            }
            x = Boolean.valueOf(z);
            aVar.R(x);
        }
        boolean booleanValue = ((Boolean) x).booleanValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return booleanValue;
    }

    public static final boolean e(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-993392393, 0, -1, "com.vk.games.presentation.utils.rememberIsTabletOrPortrait (ScreenHelper.kt:75)");
        }
        Configuration configuration = (Configuration) aVar.r(AndroidCompositionLocals_androidKt.a);
        boolean J = aVar.J(configuration);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            int i = configuration.smallestScreenWidthDp;
            int i2 = configuration.orientation;
            boolean z = i >= 600;
            x = Boolean.valueOf(z || (!z && i2 == 1));
            aVar.R(x);
        }
        boolean booleanValue = ((Boolean) x).booleanValue();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return booleanValue;
    }

    public static q630 f(q630 q630Var, boolean z, xvy xvyVar, final float f, float f2, Object obj, final gzs gzsVar, gzs gzsVar2, int i) {
        if ((i & 4) != 0) {
            f = 0.8f;
        }
        final Object obj2 = (i & 16) != 0 ? null : obj;
        if (z) {
            return g(q630Var, xvyVar, null, true, f2, obj2, gzsVar, gzsVar2, 10);
        }
        return qri.a(q630Var, a5x.a, new yzs() { // from class: xsna.obh0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.yzs
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                q630 q630Var2 = (q630) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                aVar.K(1649257823);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1649257823, intValue, -1, "com.vk.games.presentation.utils.onAppearInWindow.<anonymous> (ScreenHelper.kt:229)");
                }
                final View view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
                Object obj6 = obj2;
                boolean J = aVar.J(obj6);
                Object x = aVar.x();
                Object obj7 = a.C0011a.a;
                if (J || x == obj7) {
                    x = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar.R(x);
                }
                final wh50 wh50Var = (wh50) x;
                boolean J2 = aVar.J(obj6);
                Object x2 = aVar.x();
                if (J2 || x2 == obj7) {
                    x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar.R(x2);
                }
                wh50 wh50Var2 = (wh50) x2;
                wh50 a2 = s4z.a(((f5z) aVar.r(bvz.a)).getLifecycle(), aVar);
                Lifecycle.Event event = (Lifecycle.Event) a2.getValue();
                boolean J3 = aVar.J(a2) | aVar.J(wh50Var) | aVar.J(wh50Var2);
                final gzs gzsVar3 = gzsVar;
                boolean J4 = J3 | aVar.J(gzsVar3);
                Object x3 = aVar.x();
                if (J4 || x3 == obj7) {
                    Object wbh0Var = new wbh0(gzsVar3, a2, wh50Var, wh50Var2, null);
                    aVar.R(wbh0Var);
                    x3 = wbh0Var;
                }
                bap.g(event, (wzs) x3, aVar, 0);
                boolean J5 = aVar.J(wh50Var) | aVar.y(view);
                final float f3 = f;
                boolean n = J5 | aVar.n(f3) | aVar.J(gzsVar3);
                Object x4 = aVar.x();
                if (n || x4 == obj7) {
                    x4 = new izs() { // from class: xsna.pbh0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.izs
                        public final Object invoke(Object obj8) {
                            tny tnyVar = (tny) obj8;
                            wh50 wh50Var3 = wh50Var;
                            if (((Boolean) wh50Var3.getValue()).booleanValue()) {
                                return s3q0.a;
                            }
                            zhf0 j = jgz.j(tnyVar, true);
                            float height = view.getHeight();
                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f5 = j.d;
                                float f6 = j.b;
                                float f7 = f5 - f6;
                                if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f6 = 0.0f;
                                    }
                                    if (f5 <= height) {
                                        height = f5;
                                    }
                                    float f8 = height - f6;
                                    if (f8 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f4 = f8;
                                    }
                                    if (f4 / f7 >= f3) {
                                        wh50Var3.setValue(Boolean.TRUE);
                                        gzsVar3.invoke();
                                    }
                                    return s3q0.a;
                                }
                            }
                            return s3q0.a;
                        }
                    };
                    aVar.R(x4);
                }
                q630 o = egi.o(q630Var2, (izs) x4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return o;
            }
        });
    }

    public static q630 g(q630 q630Var, final khh0 khh0Var, khh0 khh0Var2, final boolean z, final float f, final Object obj, final gzs gzsVar, final gzs gzsVar2, int i) {
        if ((i & 2) != 0) {
            khh0Var2 = null;
        }
        final khh0 khh0Var3 = khh0Var2;
        return qri.a(q630Var, a5x.a, new yzs() { // from class: xsna.ibh0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.yzs
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Object obj5;
                q630 q630Var2 = (q630) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                aVar.K(-1261430026);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1261430026, intValue, -1, "com.vk.games.presentation.utils.trackVisibilityAfterScroll.<anonymous> (ScreenHelper.kt:342)");
                }
                final View view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
                Object obj6 = obj;
                boolean J = aVar.J(obj6);
                Object x = aVar.x();
                Object obj7 = a.C0011a.a;
                if (J || x == obj7) {
                    x = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar.R(x);
                }
                wh50 wh50Var = (wh50) x;
                boolean J2 = aVar.J(obj6);
                Object x2 = aVar.x();
                if (J2 || x2 == obj7) {
                    x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    aVar.R(x2);
                }
                wh50 wh50Var2 = (wh50) x2;
                boolean J3 = aVar.J(obj6);
                Object x3 = aVar.x();
                if (J3 || x3 == obj7) {
                    x3 = androidx.compose.runtime.k.b(null);
                    aVar.R(x3);
                }
                wh50 wh50Var3 = (wh50) x3;
                boolean J4 = aVar.J(wh50Var) | aVar.J(wh50Var2);
                Object x4 = aVar.x();
                if (J4 || x4 == obj7) {
                    x4 = new uk(19, wh50Var, wh50Var2);
                    aVar.R(x4);
                }
                final gzs gzsVar3 = (gzs) x4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2110127315, 0, -1, "com.vk.games.presentation.utils.rememberScreenVisibilityState (ScreenHelper.kt:387)");
                }
                Object x5 = aVar.x();
                if (x5 == obj7) {
                    x5 = androidx.compose.runtime.k.b(Boolean.TRUE);
                    aVar.R(x5);
                }
                final wh50 wh50Var4 = (wh50) x5;
                Object x6 = aVar.x();
                if (x6 == obj7) {
                    x6 = androidx.compose.runtime.k.b(Boolean.TRUE);
                    aVar.R(x6);
                }
                final wh50 wh50Var5 = (wh50) x6;
                final f5z f5zVar = (f5z) aVar.r(bvz.a);
                boolean J5 = aVar.J(gzsVar3) | aVar.y(view) | aVar.y(f5zVar);
                Object x7 = aVar.x();
                if (J5 || x7 == obj7) {
                    x7 = new izs() { // from class: xsna.sbh0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.ubh0] */
                        /* JADX WARN: Type inference failed for: r5v2, types: [xsna.e5z, xsna.tbh0] */
                        @Override // xsna.izs
                        public final Object invoke(Object obj8) {
                            final gzs gzsVar4 = gzsVar3;
                            final wh50 wh50Var6 = wh50Var4;
                            ?? r5 = new androidx.lifecycle.l() { // from class: xsna.tbh0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // androidx.lifecycle.l
                                public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                                    int i2 = vbh0.a.$EnumSwitchMapping$0[event.ordinal()];
                                    wh50 wh50Var7 = wh50Var6;
                                    boolean z2 = true;
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            z2 = ((Boolean) wh50Var7.getValue()).booleanValue();
                                        } else {
                                            gzs.this.invoke();
                                            z2 = false;
                                        }
                                    }
                                    wh50Var7.setValue(Boolean.valueOf(z2));
                                }
                            };
                            final View view2 = view;
                            final wh50 wh50Var7 = wh50Var5;
                            ?? r0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.ubh0
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    View view3 = view2;
                                    wh50Var7.setValue(Boolean.valueOf(view3.isShown() && view3.isAttachedToWindow()));
                                }
                            };
                            f5z f5zVar2 = f5z.this;
                            f5zVar2.getLifecycle().addObserver(r5);
                            view2.getViewTreeObserver().addOnGlobalLayoutListener(r0);
                            return new xbh0(f5zVar2, r5, view2, r0);
                        }
                    };
                    aVar.R(x7);
                }
                bap.b(f5zVar, view, (izs) x7, aVar, 0);
                Boolean bool = (Boolean) wh50Var4.getValue();
                bool.getClass();
                Boolean bool2 = (Boolean) wh50Var5.getValue();
                bool2.getClass();
                Pair pair = new Pair(bool, bool2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Boolean bool3 = (Boolean) pair.d();
                boolean booleanValue = bool3.booleanValue();
                Boolean bool4 = (Boolean) pair.g();
                boolean booleanValue2 = bool4.booleanValue();
                boolean z2 = z;
                Boolean valueOf = Boolean.valueOf(z2);
                khh0 khh0Var4 = khh0Var;
                khh0 khh0Var5 = khh0Var3;
                Object[] objArr = {khh0Var4, khh0Var5, obj6, valueOf, bool3, bool4};
                boolean y = aVar.y(khh0Var4) | aVar.y(khh0Var5) | aVar.l(booleanValue) | aVar.l(booleanValue2) | aVar.l(z2) | aVar.J(wh50Var3) | aVar.J(wh50Var) | aVar.n(0.01f);
                gzs gzsVar4 = gzsVar;
                boolean J6 = y | aVar.J(gzsVar4) | aVar.J(wh50Var2);
                float f2 = f;
                boolean n = J6 | aVar.n(f2);
                gzs gzsVar5 = gzsVar2;
                boolean J7 = n | aVar.J(gzsVar5);
                Object x8 = aVar.x();
                if (J7 || x8 == obj7) {
                    Object zbh0Var = new zbh0(khh0Var4, khh0Var5, booleanValue, booleanValue2, z2, 0.01f, gzsVar4, f2, gzsVar5, wh50Var3, wh50Var, wh50Var2, null);
                    obj5 = wh50Var3;
                    aVar.R(zbh0Var);
                    x8 = zbh0Var;
                } else {
                    obj5 = wh50Var3;
                }
                bap.h(objArr, (wzs) x8, aVar, 0);
                boolean J8 = aVar.J(obj5);
                Object x9 = aVar.x();
                if (J8 || x9 == obj7) {
                    x9 = new w110(obj5, 22);
                    aVar.R(x9);
                }
                q630 o = egi.o(q630Var2, (izs) x9);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return o;
            }
        });
    }
}
