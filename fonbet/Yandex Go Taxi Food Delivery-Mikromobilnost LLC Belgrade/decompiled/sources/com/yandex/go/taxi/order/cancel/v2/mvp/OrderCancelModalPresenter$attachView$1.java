package com.yandex.go.taxi.order.cancel.v2.mvp;

import com.yandex.go.taxi.order.cancel.v2.data.d;
import com.yandex.go.taxi.order.cancel.v2.domain.interactor.OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.cancel.v2.domain.interactor.OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2;
import com.yandex.go.taxi.order.models.api.cancel.Action$Type;
import com.yandex.go.taxi.order.models.api.cancel.n;
import defpackage.hl70;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o61;
import defpackage.ol70;
import defpackage.pl70;
import defpackage.qj70;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tk70;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uvb1;
import defpackage.uyj;
import defpackage.v41;
import defpackage.vj70;
import defpackage.vk70;
import defpackage.vl70;
import defpackage.wk70;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.i0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalPresenter$attachView$1", f = "OrderCancelModalPresenter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelModalPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ vk70 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ wk70 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvl70;", "it", "Lzy11;", "<anonymous>", "(Lvl70;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalPresenter$attachView$1$1", f = "OrderCancelModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$BooleanRef $wasShown;
        int label;
        final /* synthetic */ wk70 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, wk70 wk70Var, Continuation continuation) {
            super(2, continuation);
            this.$wasShown = ref$BooleanRef;
            this.this$0 = wk70Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$wasShown, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((vl70) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n k;
            Action$Type a;
            String name;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            if (!this.$wasShown.element) {
                vj70 vj70Var = this.this$0.A;
                tk70 tk70Var = (tk70) ((d) vj70Var.a).g.a.getValue();
                if (tk70Var != null) {
                    ArrayList arrayList = tk70Var.f.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(uvb1.k(((pl70) it.next()).f).a().name().toLowerCase(Locale.ROOT));
                    }
                    List list = tk70Var.e.a;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        qj70 qj70Var = ((ol70) it2.next()).c;
                        String lowerCase = (qj70Var == null || (k = uvb1.k(qj70Var)) == null || (a = k.a()) == null || (name = a.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
                        if (lowerCase != null) {
                            arrayList3.add(lowerCase);
                        }
                    }
                    ArrayList m0 = a.m0(arrayList2, arrayList3);
                    o61 o61Var = vj70Var.b;
                    String str = tk70Var.b;
                    o61Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", str);
                    hashMap.put("button_list", m0);
                    o61Var.a.a("CancelModalCard.Shown", hashMap, 1, new HashMap());
                }
                this.$wasShown.element = true;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelModalPresenter$attachView$1(wk70 wk70Var, vk70 vk70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wk70Var;
        this.$mvpView = vk70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderCancelModalPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderCancelModalPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        hl70 hl70Var = this.this$0.z;
        com.yandex.go.taxi.order.cancel.v2.domain.interactor.b bVar = new com.yandex.go.taxi.order.cancel.v2.domain.interactor.b(e.X(e.t(new com.yandex.go.taxi.order.cancel.v2.domain.interactor.d(e.X(hl70Var.b.a(), new OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, hl70Var)))), new OrderCancelModalViewUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$2(null, hl70Var)), hl70Var.d);
        hl70Var.e.getClass();
        sjh sjhVar = uyj.a;
        tpr t = e.t(e.F(bVar, mdh.b));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, this.this$0, null);
        v41 v41Var = new v41(11, this.$mvpView);
        this.L$0 = null;
        this.label = 1;
        Object collect = t.collect(new i0(v41Var, anonymousClass1), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
