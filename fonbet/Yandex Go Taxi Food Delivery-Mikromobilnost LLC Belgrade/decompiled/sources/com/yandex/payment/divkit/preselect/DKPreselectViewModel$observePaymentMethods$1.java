package com.yandex.payment.divkit.preselect;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.a5f;
import defpackage.a8a0;
import defpackage.ds31;
import defpackage.g92;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nq4;
import defpackage.ny61;
import defpackage.oq4;
import defpackage.otf;
import defpackage.pq4;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.scc;
import defpackage.sv90;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.y22;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.preselect.DKPreselectViewModel$observePaymentMethods$1", f = "DKPreselectViewModel.kt", l = {279, 410}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKPreselectViewModel$observePaymentMethods$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0005\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "payment", "Lpq4;", "plusCardState", "otf", "<anonymous>", "(Ljava/util/List;Lpq4;)Lotf;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.divkit.preselect.DKPreselectViewModel$observePaymentMethods$1$1", f = "DKPreselectViewModel.kt", l = {312}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.divkit.preselect.DKPreselectViewModel$observePaymentMethods$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ tse $$this$launch;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, tse tseVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = fVar;
            this.$$this$launch = tseVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, (Continuation) obj3);
            anonymousClass1.L$0 = (List) obj;
            anonymousClass1.L$1 = (pq4) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v6, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v1, types: [T, java.lang.Iterable, java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref$BooleanRef ref$BooleanRef;
            Ref$BooleanRef ref$BooleanRef2;
            Ref$ObjectRef ref$ObjectRef;
            T t;
            Ref$ObjectRef ref$ObjectRef2;
            T t2;
            Ref$BooleanRef ref$BooleanRef3;
            Ref$BooleanRef ref$BooleanRef4;
            Ref$ObjectRef ref$ObjectRef3;
            Ref$ObjectRef ref$ObjectRef4;
            List list = (List) this.L$0;
            pq4 pq4Var = (pq4) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                kotlin.b.b(obj);
                ?? arrayList = new ArrayList(list);
                ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef2 = new Ref$BooleanRef();
                ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = 0;
                        break;
                    }
                    t = it.next();
                    if (a8a0.f((PaymentMethod) t)) {
                        break;
                    }
                }
                ref$ObjectRef5.element = t;
                ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = EmptyList.a;
                T t3 = ref$ObjectRef5.element;
                nq4 nq4Var = nq4.a;
                if (t3 != 0) {
                    if (jl40.l(pq4Var, nq4Var)) {
                        ycc.w(arrayList, new a5f(29), true);
                        rwo rwoVar = this.this$0.c;
                        qv90.a.getClass();
                        ((y22) rwoVar).a(sv90.N());
                        ref$ObjectRef5.element = null;
                        ref$BooleanRef.element = true;
                    } else {
                        if (!(pq4Var instanceof oq4)) {
                            w511.b();
                            return null;
                        }
                        rwo rwoVar2 = this.this$0.c;
                        qv90.a.getClass();
                        ((y22) rwoVar2).a(sv90.W());
                        ref$ObjectRef5.element = null;
                        ref$BooleanRef.element = false;
                    }
                    T t4 = ref$ObjectRef5.element;
                    if (((PaymentMethod) t4) != null) {
                        ref$ObjectRef2.element = kotlin.collections.a.m0(arrayList, scc.i(t4));
                    } else {
                        ref$ObjectRef2.element = arrayList;
                    }
                    return new otf(ref$ObjectRef2, ref$BooleanRef, ref$ObjectRef, ref$BooleanRef2);
                }
                if (jl40.l(pq4Var, nq4Var)) {
                    rwo rwoVar3 = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar3).a(sv90.N());
                    t2 = arrayList;
                    ref$BooleanRef4 = ref$BooleanRef2;
                    z = true;
                    ref$ObjectRef3 = ref$ObjectRef;
                    ref$ObjectRef4 = ref$ObjectRef2;
                    ref$BooleanRef3 = ref$BooleanRef;
                } else {
                    if (!(pq4Var instanceof oq4)) {
                        w511.b();
                        return null;
                    }
                    rwo rwoVar4 = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar4).a(sv90.V());
                    t2 = arrayList;
                    ref$BooleanRef3 = ref$BooleanRef;
                    ref$BooleanRef4 = ref$BooleanRef2;
                    ref$ObjectRef3 = ref$ObjectRef;
                    ref$ObjectRef4 = ref$ObjectRef2;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$8;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$7;
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$5;
                ref$BooleanRef4 = (Ref$BooleanRef) this.L$4;
                ref$BooleanRef3 = (Ref$BooleanRef) this.L$3;
                List list2 = (List) this.L$2;
                kotlin.b.b(obj);
                t2 = list2;
            }
            ref$BooleanRef.element = z;
            ref$ObjectRef4.element = t2;
            ref$ObjectRef2 = ref$ObjectRef4;
            ref$ObjectRef = ref$ObjectRef3;
            ref$BooleanRef2 = ref$BooleanRef4;
            ref$BooleanRef = ref$BooleanRef3;
            return new otf(ref$ObjectRef2, ref$BooleanRef, ref$ObjectRef, ref$BooleanRef2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKPreselectViewModel$observePaymentMethods$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DKPreselectViewModel$observePaymentMethods$1 dKPreselectViewModel$observePaymentMethods$1 = new DKPreselectViewModel$observePaymentMethods$1(this.this$0, continuation);
        dKPreselectViewModel$observePaymentMethods$1.L$0 = obj;
        return dKPreselectViewModel$observePaymentMethods$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKPreselectViewModel$observePaymentMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            tprVar = fVar.L;
            com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
            ds31.a(fVar);
            this.L$0 = tseVar;
            this.L$1 = tprVar;
            this.label = 1;
            com.yandex.payment.sdk.core.utils.a.c();
            g92 g92Var = new g92(2, new oq4());
            if (g92Var != coroutineSingletons) {
                obj = g92Var;
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tprVar = (tpr) this.L$1;
        kotlin.b.b(obj);
        m0 m0Var = new m0(tprVar, (tpr) obj, new AnonymousClass1(this.this$0, tseVar, null));
        f fVar2 = this.this$0;
        d dVar = new d(fVar2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object collect = m0Var.collect(new e(dVar, fVar2), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
