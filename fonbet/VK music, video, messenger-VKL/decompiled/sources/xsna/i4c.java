package xsna;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.o9c;
import xsna.q630;

/* compiled from: CheckoutContentRedesigned.kt */
/* loaded from: classes18.dex */
public final class i4c {

    /* compiled from: LazyDsl.kt */
    public static final class a implements izs<Integer, Object> {
        public final /* synthetic */ z90 b;
        public final /* synthetic */ ArrayList c;

        public a(z90 z90Var, ArrayList arrayList) {
            this.b = z90Var;
            this.c = arrayList;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return this.b.invoke(this.c.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ lt0 b;
        public final /* synthetic */ ArrayList c;

        public b(lt0 lt0Var, ArrayList arrayList) {
            this.b = lt0Var;
            this.c = arrayList;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return this.b.invoke(this.c.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ l5c c;
        public final /* synthetic */ izs d;

        public c(ArrayList arrayList, l5c l5cVar, izs izsVar) {
            this.b = arrayList;
            this.c = l5cVar;
            this.d = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                k7r k7rVar = (k7r) this.b.get(intValue);
                aVar2.K(2135028184);
                q630 f = txj0.f(q630.a.a, 1.0f);
                IslandPart U0 = k7rVar.U0();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                w5c.a(this.c, k7rVar, this.d, ksy.c(ksyVar2, x3c.g(f, U0, ylu0Var.getBackground().g), 5), aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: CheckoutContentRedesigned.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentRedesignedKt$HandleLaunchedEffect$1$1", f = "CheckoutContentRedesigned.kt", l = {237}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ l5c $formScope;
        final /* synthetic */ gzs<s3q0> $onContent;
        final /* synthetic */ v8s $state;
        final /* synthetic */ View $view;
        int label;

        /* compiled from: CheckoutContentRedesigned.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ l5c b;
            public final /* synthetic */ v8s c;
            public final /* synthetic */ Context d;
            public final /* synthetic */ View e;

            public a(l5c l5cVar, v8s v8sVar, Context context, View view) {
                this.b = l5cVar;
                this.c = v8sVar;
                this.d = context;
                this.e = view;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                InputMethodManager inputMethodManager;
                this.b.a((v8s) obj);
                if (this.c.d && (inputMethodManager = (InputMethodManager) this.d.getSystemService("input_method")) != null) {
                    inputMethodManager.hideSoftInputFromWindow(this.e.getWindowToken(), 0);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(gzs<s3q0> gzsVar, v8s v8sVar, l5c l5cVar, Context context, View view, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$onContent = gzsVar;
            this.$state = v8sVar;
            this.$formScope = l5cVar;
            this.$context = context;
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$onContent, this.$state, this.$formScope, this.$context, this.$view, spjVar);
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
                this.$onContent.invoke();
                izg0 M = nr2.M(new xm1(this.$state, 16));
                a aVar = new a(this.$formScope, this.$state, this.$context, this.$view);
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

    /* compiled from: CheckoutContentRedesigned.kt */
    @b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentRedesignedKt$HandleScroll$1$1", f = "CheckoutContentRedesigned.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $coroutineScope;
        final /* synthetic */ f5z $lifecycleOwner;
        final /* synthetic */ xvy $listState;
        final /* synthetic */ Object $scrollChannel;
        final /* synthetic */ v8s $state;
        final /* synthetic */ l5c $this_HandleScroll;
        int label;

        /* compiled from: CheckoutContentRedesigned.kt */
        @b6l(c = "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentRedesignedKt$HandleScroll$1$1$1$1", f = "CheckoutContentRedesigned.kt", l = {200}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ int $index;
            final /* synthetic */ xvy $listState;
            final /* synthetic */ h8c $patch;
            final /* synthetic */ l5c $this_HandleScroll;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xvy xvyVar, int i, h8c h8cVar, l5c l5cVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$listState = xvyVar;
                this.$index = i;
                this.$patch = h8cVar;
                this.$this_HandleScroll = l5cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$listState, this.$index, this.$patch, this.$this_HandleScroll, spjVar);
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
                    if (!x3c.e(this.$listState, this.$index)) {
                        xvy xvyVar = this.$listState;
                        int i2 = this.$index;
                        this.label = 1;
                        if (xvyVar.f(i2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                h8c h8cVar = this.$patch;
                if (h8cVar.b) {
                    l5c l5cVar = this.$this_HandleScroll;
                    rwr rwrVar = (rwr) ((Map) ((zak0) l5cVar.a).getValue()).get(h8cVar.a);
                    if (rwrVar != null) {
                        rwr.b(rwrVar);
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, f5z f5zVar, v8s v8sVar, yvj yvjVar, xvy xvyVar, l5c l5cVar, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$scrollChannel = obj;
            this.$lifecycleOwner = f5zVar;
            this.$state = v8sVar;
            this.$coroutineScope = yvjVar;
            this.$listState = xvyVar;
            this.$this_HandleScroll = l5cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new e(this.$scrollChannel, this.$lifecycleOwner, this.$state, this.$coroutineScope, this.$listState, this.$this_HandleScroll, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            ((wj50) this.$scrollChannel).a(new j4c(this.$state, this.$coroutineScope, this.$listState, this.$this_HandleScroll, 0), this.$lifecycleOwner);
            return s3q0.a;
        }
    }

    public static final void a(boolean z, androidx.compose.runtime.a aVar, int i) {
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-142597661);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-142597661, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.AnimatedBlockingProgress (CheckoutContentRedesigned.kt:210)");
            }
            z2 = z;
            mm2.f(z2, txj0.d(q630.a.a, 1.0f), null, null, null, pci.b, M, (i2 & 14) | 196656, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d4c(z2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(o9c.a aVar, izs izsVar, gzs gzsVar, Object obj, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(2021757234);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(obj) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2021757234, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutContentRedesigned (CheckoutContentRedesigned.kt:53)");
            }
            wh50 c2 = jk50.c(aVar.a, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new l5c((v8s) c2.getValue());
                M.R(x);
            }
            l5c l5cVar = (l5c) x;
            q630Var2 = q630Var;
            q630 d2 = txj0.d(q630Var2, 1.0f);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, d2);
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
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            v8s v8sVar = (v8s) c2.getValue();
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            c(l5cVar, v8sVar, izsVar, obj, hr80.m(f, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a), M, ((i2 << 3) & 896) | 6 | (i2 & 7168));
            a(((v8s) c2.getValue()).d, M, 0);
            M.G();
            f((v8s) c2.getValue(), l5cVar, gzsVar, M, (i2 & 896) | 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h4c(aVar, izsVar, gzsVar, obj, q630Var2, i);
        }
    }

    public static final void c(l5c l5cVar, final v8s v8sVar, final izs izsVar, Object obj, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        final l5c l5cVar2;
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1528382754);
        if ((i & 6) == 0) {
            l5cVar2 = l5cVar;
            i2 = (M.J(l5cVar2) ? 4 : 2) | i;
        } else {
            l5cVar2 = l5cVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(v8sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1528382754, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutFormContent (CheckoutContentRedesigned.kt:79)");
            }
            final xvy a2 = zvy.a(0, 3, M);
            boolean z = v8sVar.c;
            boolean z2 = (i3 & 896) == 256;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new w2(izsVar, 1);
                M.R(x);
            }
            dge0.a(z, (gzs) x, null, null, null, kai.c(-1070004108, new yzs() { // from class: xsna.a4c
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1070004108, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutFormContent.<anonymous> (CheckoutContentRedesigned.kt:87)");
                        }
                        dt1.a.getClass();
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c2 = qri.c(aVar2, q630Var2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d2, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c2, cri.a.d);
                        aVar2.K(1194452262);
                        l5c l5cVar3 = l5cVar2;
                        v8s v8sVar2 = v8sVar;
                        xvy xvyVar = a2;
                        izs izsVar2 = izsVar;
                        i4c.d(l5cVar3, v8sVar2, xvyVar, izsVar2, aVar2, 0);
                        aVar2.j();
                        i4c.e(v8sVar2, izsVar2, xvyVar, ra8.a.b(q630.a.a, dt1.a.i), aVar2, 0);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 28);
            g(l5cVar, v8sVar, a2, obj, M, i3 & 7294);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b4c(l5cVar, v8sVar, izsVar, obj, q630Var, i, 0);
        }
    }

    public static final void d(l5c l5cVar, v8s v8sVar, xvy xvyVar, izs<? super r2c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(462246879);
        int i2 = i | (M.J(l5cVar) ? 4 : 2) | (M.J(v8sVar) ? 32 : 16) | (M.J(xvyVar) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(462246879, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutListItems (CheckoutContentRedesigned.kt:102)");
            }
            q630 E = ahn.E(q630.a.a, "checkout_content_list");
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new l14(v8sVar, l5cVar, izsVar, 3);
                M.R(x);
            }
            lqy.a(E, xvyVar, null, null, null, null, false, null, (izs) x, M, ((i2 >> 3) & 112) | 6, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g4c(l5cVar, v8sVar, xvyVar, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(v8s v8sVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        v8s v8sVar2;
        izs izsVar2;
        xvy xvyVar2;
        q630 q630Var2;
        int i2;
        int h;
        androidx.compose.runtime.a M = aVar.M(-1417325621);
        int i3 = (M.J(v8sVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(xvyVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1417325621, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutStickyItems (CheckoutContentRedesigned.kt:145)");
            }
            List<y8c> list = v8sVar.e;
            ArrayList arrayList = v8sVar.a;
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new z3c(v8sVar, izsVar, xvyVar, q630Var, i);
                    return;
                }
                return;
            }
            xvyVar2 = xvyVar;
            izsVar2 = izsVar;
            q630Var2 = q630Var;
            v8sVar2 = v8sVar;
            i2 = i;
            wh50 f = x3c.f(M);
            boolean J = M.J(arrayList);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (((k7r) it.next()) instanceof f3c) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 != -1) {
                    h = i4 - 1;
                    if (h < 0) {
                        h = 0;
                    }
                } else {
                    h = e43.h(arrayList);
                }
                x = Integer.valueOf(h);
                M.R(x);
            }
            int intValue = ((Number) x).intValue();
            boolean o = M.o(intValue);
            Object x2 = M.x();
            if (o || x2 == c0012a) {
                x2 = bbk0.b(new l2(xvyVar2, intValue, 1));
                M.R(x2);
            }
            if (((Boolean) ((mtk0) x2).getValue()).booleanValue() || ((Boolean) f.getValue()).booleanValue()) {
                M.K(270920023);
            } else {
                M.K(276780387);
                q630 f2 = txj0.f(q630Var2, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(f2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, m);
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
                f9t.e(txj0.h(q630.a.a, 12), M, 6);
                M.K(-273151400);
                Iterator<T> it2 = v8sVar2.e.iterator();
                while (it2.hasNext()) {
                    x5c.a((y8c) it2.next(), izsVar2, null, M, i3 & 112);
                }
                M.j();
                M.G();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            v8sVar2 = v8sVar;
            izsVar2 = izsVar;
            xvyVar2 = xvyVar;
            q630Var2 = q630Var;
            i2 = i;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new e4c(i2, 0, v8sVar2, xvyVar2, izsVar2, q630Var2);
        }
    }

    public static final void f(final v8s v8sVar, final l5c l5cVar, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1617076680);
        if ((i & 6) == 0) {
            i2 = (M.J(v8sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l5cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1617076680, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.HandleLaunchedEffect (CheckoutContentRedesigned.kt:229)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            s3q0 s3q0Var = s3q0.a;
            boolean y = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(context) | M.y(view);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                d dVar = new d(gzsVar, v8sVar, l5cVar, context, view, null);
                M.R(dVar);
                x = dVar;
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.c4c
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    i4c.f(v8s.this, l5cVar, gzsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(l5c l5cVar, v8s v8sVar, xvy xvyVar, Object obj, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1600439537);
        if ((i & 6) == 0) {
            i2 = (M.J(l5cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(v8sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(xvyVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(obj) ? 2048 : 1024;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1600439537, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.HandleScroll (CheckoutContentRedesigned.kt:182)");
            }
            f5z f5zVar = (f5z) M.r(bvz.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            qow qowVar = new qow(obj);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean y = (i4 == 32) | ((i3 & 7168) == 2048) | M.y(f5zVar) | M.y(yvjVar) | (i5 == 256) | ((i3 & 14) == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                e eVar = new e(obj, f5zVar, v8sVar, yvjVar, xvyVar, l5cVar, null);
                M.R(eVar);
                x2 = eVar;
            }
            aVar2 = M;
            bap.e(qowVar, v8sVar, xvyVar, (wzs) x2, aVar2, ((i3 >> 9) & 14) | i4 | i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new f4c(l5cVar, v8sVar, xvyVar, obj, i, 0);
        }
    }
}
