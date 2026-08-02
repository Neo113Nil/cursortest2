package com.yandex.go.order.bundle.map.impl.ui;

import defpackage.d380;
import defpackage.gc80;
import defpackage.h151;
import defpackage.j551;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vez0;
import defpackage.w201;
import defpackage.wls;
import defpackage.xw4;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.bundle.map.impl.ui.BundledOrderListViewModel$listenOrders$1", f = "BundledOrderListViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BundledOrderListViewModel$listenOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ List<w201> $orders;
    final /* synthetic */ yaf0 $screen;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lw201;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.order.bundle.map.impl.ui.BundledOrderListViewModel$listenOrders$1$2", f = "BundledOrderListViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.order.bundle.map.impl.ui.BundledOrderListViewModel$listenOrders$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ yaf0 $screen;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, yaf0 yaf0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$screen = yaf0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$screen, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h151 h151Var = this.this$0.b;
            String e0 = vez0.e0(this.$screen);
            gc80 gc80Var = this.this$0.c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d380 a = gc80Var.a((w201) it.next());
                if (a != null) {
                    arrayList.add(a);
                }
            }
            this.L$0 = null;
            this.label = 1;
            h151Var.a(e0, arrayList);
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundledOrderListViewModel$listenOrders$1(e eVar, yaf0 yaf0Var, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$screen = yaf0Var;
        this.$id = str;
        this.$orders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BundledOrderListViewModel$listenOrders$1(this.this$0, this.$screen, this.$id, this.$orders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BundledOrderListViewModel$listenOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            j551 j551Var = eVar.a;
            yaf0 yaf0Var = this.$screen;
            g X = kotlinx.coroutines.flow.e.X(com.yandex.go.coroutines.b.d(new jqr(new b(new ru.yandex.taxi.widgets.data.repository.widget_models.b(j551Var.d.c, yaf0Var), this.$id), new AnonymousClass2(eVar, yaf0Var, null), 3), new BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$start$1(this.$orders, null)), new BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            e eVar2 = this.this$0;
            o oVar = new o(X, new BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            xw4 xw4Var = new xw4(13, eVar2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(xw4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
