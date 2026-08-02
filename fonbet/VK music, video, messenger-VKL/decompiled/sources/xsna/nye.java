package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;
import com.vk.core.compose.theme.VkAppTheme;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.hud0;
import xsna.ixe;
import xsna.kyj;
import xsna.mvd0;
import xsna.oye;
import xsna.q630;
import xsna.tlo0;
import xsna.zwj;

/* compiled from: ClipsProfileToolbarView.kt */
/* loaded from: classes17.dex */
public final class nye extends ame<pye, ixe> {
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: ClipsProfileToolbarView.kt */
    @b6l(c = "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView$CurrentUserCard$1$2$1$2$1", f = "ClipsProfileToolbarView.kt", l = {347}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $it;
        final /* synthetic */ mc90 $pagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc90 mc90Var, int i, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$it = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$pagerState, this.$it, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$pagerState;
                int i2 = this.$it;
                this.label = 1;
                if (mc90.g(mc90Var, i2, null, this, 6) == coroutineSingletons) {
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

    /* compiled from: ClipsProfileToolbarView.kt */
    @b6l(c = "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView$ProfilesBlock$1$1$3$1", f = "ClipsProfileToolbarView.kt", l = {298}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rg50 $currentPageNum$delegate;
        final /* synthetic */ izs<ixe, s3q0> $onAction;
        final /* synthetic */ izs<Integer, s3q0> $onPageChanged;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ List $profiles;
        int label;

        /* compiled from: ClipsProfileToolbarView.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ List<T> b;
            public final /* synthetic */ izs<ixe, s3q0> c;
            public final /* synthetic */ izs<Integer, s3q0> d;
            public final /* synthetic */ rg50 e;

            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends T> list, izs<? super ixe, s3q0> izsVar, izs<? super Integer, s3q0> izsVar2, rg50 rg50Var) {
                this.b = list;
                this.c = izsVar;
                this.d = izsVar2;
                this.e = rg50Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                int intValue = ((Number) obj).intValue();
                this.e.C(intValue);
                List<T> list = this.b;
                hud0 hud0Var = (hud0) list.get(intValue);
                boolean z = hud0Var instanceof hud0.b.C3022b;
                izs<ixe, s3q0> izsVar = this.c;
                if (z) {
                    izsVar.invoke(new ixe.a(new ClipGridParams.Data.Profile((ClipsAuthor) ((hud0.b.C3022b) hud0Var).a.a)));
                } else if (list.get(intValue) instanceof hud0.b.a) {
                    izsVar.invoke(ixe.b.b);
                }
                this.d.invoke(new Integer(intValue));
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc90 mc90Var, List list, izs izsVar, izs izsVar2, rg50 rg50Var, spj spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$profiles = list;
            this.$onAction = izsVar;
            this.$onPageChanged = izsVar2;
            this.$currentPageNum$delegate = rg50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$pagerState, this.$profiles, this.$onAction, this.$onPageChanged, this.$currentPageNum$delegate, spjVar);
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
                izg0 M = nr2.M(new u40(this.$pagerState, 21));
                a aVar = new a(this.$profiles, this.$onAction, this.$onPageChanged, this.$currentPageNum$delegate);
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

    /* compiled from: ClipsProfileToolbarView.kt */
    @b6l(c = "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView$ProfilesBlock$1$1$4$1", f = "ClipsProfileToolbarView.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rg50 $currentPageNum$delegate;
        final /* synthetic */ izs<ixe, s3q0> $onAction;
        final /* synthetic */ List $profiles;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, izs izsVar, rg50 rg50Var, spj spjVar) {
            super(2, spjVar);
            this.$profiles = list;
            this.$onAction = izsVar;
            this.$currentPageNum$delegate = rg50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$profiles, this.$onAction, this.$currentPageNum$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.$profiles.get(this.$currentPageNum$delegate.getIntValue()) instanceof hud0.b.a) {
                this.$onAction.invoke(ixe.b.b);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsProfileToolbarView.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CounterType.values().length];
            try {
                iArr[CounterType.Reacts.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterType.Views.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterType.Following.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CounterType.Followers.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nye(f5z f5zVar, Context context, boolean z, boolean z2, boolean z3) {
        super(context, f5zVar, z2);
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static kyj k(rvd0 rvd0Var, izs izsVar, androidx.compose.runtime.a aVar) {
        kyj bVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2017459688, 512, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.mapState (ClipsProfileToolbarView.kt:199)");
        }
        mvd0 mvd0Var = rvd0Var.d;
        if (mvd0Var instanceof mvd0.a) {
            aVar.K(1748519490);
            xow<lvd0> H = ((mvd0.a) mvd0Var).H();
            ArrayList arrayList = new ArrayList(c5g.u(H, 10));
            for (lvd0 lvd0Var : H) {
                tlo0.h d2 = oq.d(tlo0.Companion, enj.g(((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).getResources(), lvd0Var.b.i(), lvd0Var.a, lvd0Var.b.h(), new Object[0]));
                boolean J = aVar.J(lvd0Var);
                Object x = aVar.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = new v9(lvd0Var, 26);
                    aVar.R(x);
                }
                zwj.b bVar2 = new zwj.b(d2, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3));
                tlo0.h hVar = new tlo0.h(uqm0.l(lvd0Var.a));
                boolean J2 = aVar.J(lvd0Var);
                Object x2 = aVar.x();
                if (J2 || x2 == obj) {
                    x2 = new e1(lvd0Var, 28);
                    aVar.R(x2);
                }
                zwj.a aVar2 = new zwj.a(hVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3));
                boolean J3 = aVar.J(izsVar) | aVar.J(rvd0Var) | aVar.J(lvd0Var);
                Object x3 = aVar.x();
                if (J3 || x3 == obj) {
                    x3 = new lza(izsVar, rvd0Var, lvd0Var, 1);
                    aVar.R(x3);
                }
                arrayList.add(new zwj(bVar2, aVar2, (gzs) x3));
            }
            bVar = new kyj.a(arrayList);
            aVar.j();
        } else {
            if (!(mvd0Var instanceof mvd0.b)) {
                throw alb0.c(1748516390, aVar);
            }
            aVar.K(1748590660);
            aVar.j();
            bVar = new kyj.b(((mvd0.b) mvd0Var).a);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar;
    }

    public static void l(sxe sxeVar, izs izsVar, hud0 hud0Var) {
        if (epx.f(sxeVar, kxe.a)) {
            izsVar.invoke(new ixe.e(n34.b));
            return;
        }
        if (epx.f(sxeVar, lxe.a)) {
            izsVar.invoke(new ixe.e(f9t.c));
            return;
        }
        if (epx.f(sxeVar, oxe.a)) {
            izsVar.invoke(new ixe.e(d370.g));
            return;
        }
        if (epx.f(sxeVar, mxe.a)) {
            izsVar.invoke(new ixe.e(txe.b));
            return;
        }
        if (epx.f(sxeVar, pxe.a)) {
            if (hud0Var instanceof hud0.b.C3022b) {
                izsVar.invoke(new ixe.e(new vxe(((hud0.b.C3022b) hud0Var).a.c.d)));
                return;
            }
            return;
        }
        if (epx.f(sxeVar, nxe.a)) {
            if (hud0Var instanceof hud0.b.C3022b) {
                izsVar.invoke(new ixe.e(new uxe(((hud0.b.C3022b) hud0Var).a.c.d)));
            }
        } else if (sxeVar instanceof qxe) {
            if (hud0Var instanceof hud0.d) {
                izsVar.invoke(new ixe.e(new wxe(((hud0.d) hud0Var).a.c.d)));
            }
        } else {
            if (!(sxeVar instanceof rxe)) {
                throw new NoWhenBranchMatchedException();
            }
            if (hud0Var instanceof hud0.d) {
                izsVar.invoke(new ixe.e(new xxe((ClipsAuthor) ((hud0.d) hud0Var).a.a)));
            }
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((pye) ao50Var, izsVar, aVar, 512);
    }

    public final void g(mc90 mc90Var, final List list, final int i, final izs izsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(259343829);
        int i4 = i2 | (M.J(mc90Var) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.y(this) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(259343829, i4, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.CurrentUserCard (ClipsProfileToolbarView.kt:325)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            q630.a aVar2 = q630.a.a;
            f9t.e(txj0.h(aVar2, 8), M, 6);
            q630 E = ahn.E(aVar2, "authorClipsSwitcher");
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int size = list.size();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((hud0) it.next()) instanceof hud0.b.a) {
                        i3 = i4;
                        z = true;
                        break;
                    }
                }
            }
            i3 = i4;
            z = false;
            ib90 ib90Var = new ib90(mc90Var, size, z, this.g);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-934828110, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AddCircle16> (VkIcons.kt:80)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_add_circle_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ol0 ol0Var = new ol0(a2, tq.h(tlo0.Companion, R.string.clips_profile_switch_add_vkclips_profile));
            int i5 = i3 & 112;
            boolean y = (i5 == 32) | M.y(yvjVar) | ((i3 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new grb(list, yvjVar, mc90Var, 3);
                M.R(x2);
            }
            hb90.a(ib90Var, ol0Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (gzs) x2, M, 0);
            M.G();
            f9t.e(txj0.h(aVar2, 14), M, 6);
            zxe a3 = ((hud0) list.get(i)).a();
            boolean z2 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384 || M.y(this)) | (i5 == 32) | ((i3 & 896) == 256);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new izs(this) { // from class: xsna.kye
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nye.l((sxe) obj, izsVar, (hud0) list.get(i));
                        return s3q0.a;
                    }
                };
                M.R(x3);
            }
            gud0.f(a3, (izs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s5c(this, mc90Var, list, i, izsVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(oye.a aVar, final izs<? super ixe, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(254738191);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(254738191, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ProfileToolbar (ClipsProfileToolbarView.kt:154)");
            }
            wh50 d2 = jk50.d(aVar.a, new wow(k3k0.c), M, 0);
            wh50 d3 = jk50.d(aVar.b, 0, M, 48);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            int size = ((Collection) d2.getValue()).size();
            int intValue = rg50Var.getIntValue();
            if (intValue < 0 || intValue >= size) {
                rg50Var.C(e43.g((Collection) d2.getValue()).c);
            }
            final hud0 hud0Var = (hud0) ((wow) d2.getValue()).b.get(rg50Var.getIntValue());
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            List list = ((wow) d2.getValue()).b;
            int intValue2 = ((Number) d3.getValue()).intValue();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new lbe(rg50Var, 3);
                M.R(x2);
            }
            int i3 = i2 << 6;
            i(list, intValue2, (izs) x2, izsVar, M, (i3 & 57344) | (i3 & 7168) | 33152);
            mm2.b(r9g.a, hud0Var.c(), s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, null, null, kai.c(416805761, new yzs() { // from class: xsna.mye
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                    int intValue3 = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(416805761, intValue3, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ProfileToolbar.<anonymous>.<anonymous> (ClipsProfileToolbarView.kt:176)");
                    }
                    hud0 hud0Var2 = hud0.this;
                    boolean z = hud0Var2 instanceof hud0.b.C3022b;
                    nye nyeVar = this;
                    izs izsVar2 = izsVar;
                    if (z) {
                        aVar5.K(310082988);
                        rvd0 rvd0Var = ((hud0.b.C3022b) hud0Var2).a;
                        nyeVar.getClass();
                        gyj.c(nye.k(rvd0Var, izsVar2, aVar5), null, aVar5, 0);
                        aVar5.j();
                    } else if (hud0Var2 instanceof hud0.d) {
                        aVar5.K(310259316);
                        hud0.d dVar = (hud0.d) hud0Var2;
                        if (dVar.b.a) {
                            aVar5.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            return s3q0.a;
                        }
                        rvd0 rvd0Var2 = dVar.a;
                        nyeVar.getClass();
                        gyj.c(nye.k(rvd0Var2, izsVar2, aVar5), null, aVar5, 0);
                        aVar5.j();
                    } else if (hud0Var2 instanceof hud0.c) {
                        aVar5.K(310577438);
                        aVar5.j();
                    } else {
                        aVar5.K(310670655);
                        aVar5.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1573254, 28);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v17(i, 2, this, aVar, izsVar);
        }
    }

    public final void i(final List list, final int i, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i2) {
        List list2;
        int i3;
        izs izsVar3;
        izs izsVar4;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2068588895);
        if ((i2 & 6) == 0) {
            list2 = list;
            i3 = (M.J(list2) ? 4 : 2) | i2;
        } else {
            list2 = list;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            izsVar3 = izsVar;
            i3 |= M.y(izsVar3) ? 256 : 128;
        } else {
            izsVar3 = izsVar;
        }
        if ((i2 & 3072) == 0) {
            izsVar4 = izsVar2;
            i3 |= M.y(izsVar4) ? 2048 : 1024;
        } else {
            izsVar4 = izsVar2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2068588895, i3, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ProfilesBlock (ClipsProfileToolbarView.kt:252)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            float f = 20;
            aVar2 = M;
            phu0.a(txj0.f(q630.a.a, 1.0f), vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3), j, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(725203303, new iye(list2, izsVar4, this, izsVar3, i), M), aVar2, 1572870, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jye
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    nye.this.i(list, i, izsVar, izsVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(pye pyeVar, izs<? super ixe, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        ylu0 n;
        ylu0 n2;
        androidx.compose.runtime.a M = aVar.M(500012557);
        int i2 = (M.J(pyeVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(500012557, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ThemedContent (ClipsProfileToolbarView.kt:90)");
            }
            wh50 d2 = d(oye.b.a, new n0u0[]{pyeVar.a, pyeVar.b}, M, (i2 & 896) | 518);
            ylu0 h = VkAppTheme.VkontakteAndroidDark.h();
            n = h.n(h.q(), h.h(), h.i(), cw5.a(h.getBackground(), h.getBackground().r), h.o(), h.r(), h.getHeader(), h.getIcon(), h.getImage(), h.e(), h.j(), h.f(), h.k(), h.a(), h.p(), h.c(), h.m(), h.g(), h.getText(), h.b(), h.d(), h.l(), h.getWrite(), h.s());
            ylu0 h2 = VkAppTheme.VkontakteAndroid.h();
            n2 = h2.n(h2.q(), h2.h(), h2.i(), cw5.a(h2.getBackground(), h2.getBackground().x), h2.o(), h2.r(), h2.getHeader(), h2.getIcon(), h2.getImage(), h2.e(), h2.j(), h2.f(), h2.k(), h2.a(), h2.p(), h2.c(), h2.m(), h2.g(), h2.getText(), h2.b(), h2.d(), h2.l(), h2.getWrite(), h2.s());
            jai c2 = kai.c(-1464606304, new lye(this, izsVar, d2), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1206322904, 6, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.mvi.view.ClipsProfileToolbarView.ThemedContent.ThemedContent (ClipsProfileToolbarView.kt:110)");
            }
            if (this.h) {
                M.K(1574378910);
                rrv0.e(true, n2, n, null, null, null, c2, M, 1572870, 56);
                M.j();
            } else {
                M.K(1574617517);
                rrv0.e(false, n2, n, null, null, null, c2, M, 1572864, 57);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zl3(i, 2, this, pyeVar, izsVar);
        }
    }
}
