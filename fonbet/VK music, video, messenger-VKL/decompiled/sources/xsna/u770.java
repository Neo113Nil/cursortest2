package xsna;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: NotificationAnalyticsTrackerEffect.kt */
/* loaded from: classes4.dex */
public final class u770 {

    /* compiled from: NotificationAnalyticsTrackerEffect.kt */
    @b6l(c = "com.vk.notifications.list.impl.presentation.base.view.common.NotificationAnalyticsTrackerEffectKt$NotificationAnalyticsTrackerEffect$1$1", f = "NotificationAnalyticsTrackerEffect.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ List $items;
        final /* synthetic */ izs<List<? extends kb70>, s3q0> $onTrackedItemsChanged;
        final /* synthetic */ mtk0<List<xuy>> $visibleTrackableItems$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: NotificationAnalyticsTrackerEffect.kt */
        @b6l(c = "com.vk.notifications.list.impl.presentation.base.view.common.NotificationAnalyticsTrackerEffectKt$NotificationAnalyticsTrackerEffect$1$1$2", f = "NotificationAnalyticsTrackerEffect.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.u770$a$a, reason: collision with other inner class name */
        public static final class C3788a extends SuspendLambda implements wzs<List<? extends kb70>, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<List<? extends kb70>, s3q0> $onTrackedItemsChanged;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3788a(izs<? super List<? extends kb70>, s3q0> izsVar, spj<? super C3788a> spjVar) {
                super(2, spjVar);
                this.$onTrackedItemsChanged = izsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3788a c3788a = new C3788a(this.$onTrackedItemsChanged, spjVar);
                c3788a.L$0 = obj;
                return c3788a;
            }

            @Override // xsna.wzs
            public final Object invoke(List<? extends kb70> list, spj<? super s3q0> spjVar) {
                return ((C3788a) create(list, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List<? extends kb70> list = (List) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$onTrackedItemsChanged.invoke(list);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, mtk0 mtk0Var, izs izsVar, spj spjVar) {
            super(2, spjVar);
            this.$items = list;
            this.$visibleTrackableItems$delegate = mtk0Var;
            this.$onTrackedItemsChanged = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$items, this.$visibleTrackableItems$delegate, this.$onTrackedItemsChanged, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.l(nr2.M(new fqd(8, this.$items, this.$visibleTrackableItems$delegate))), new C3788a(this.$onTrackedItemsChanged, null)), yvjVar);
            return s3q0.a;
        }
    }

    public static final void a(xvy xvyVar, List list, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-375563115);
        if ((i & 6) == 0) {
            i2 = (M.J(xvyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-375563115, i2, -1, "com.vk.notifications.list.impl.presentation.base.view.common.NotificationAnalyticsTrackerEffect (NotificationAnalyticsTrackerEffect.kt:23)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new gd40(xvyVar, 5));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            wow wowVar = new wow(list);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new a(list, mtk0Var, izsVar, null);
                M.R(x2);
            }
            bap.g(wowVar, (wzs) x2, M, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new or3(i, 2, xvyVar, list, izsVar);
        }
    }
}
