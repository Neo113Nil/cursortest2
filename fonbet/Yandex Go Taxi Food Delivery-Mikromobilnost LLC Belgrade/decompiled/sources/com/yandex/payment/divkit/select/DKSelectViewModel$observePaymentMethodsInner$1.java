package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.a8a0;
import defpackage.ds31;
import defpackage.g92;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.n1f;
import defpackage.nq4;
import defpackage.ny61;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.suf;
import defpackage.sv90;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tuf;
import defpackage.w511;
import defpackage.wls;
import defpackage.y22;
import defpackage.ycc;
import defpackage.yuf;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModel$observePaymentMethodsInner$1", f = "DKSelectViewModel.kt", l = {290, 423}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKSelectViewModel$observePaymentMethodsInner$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0004\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltuf;", "payment", "Lpq4;", "plusCardState", "yuf", "<anonymous>", "(Ltuf;Lpq4;)Lyuf;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.divkit.select.DKSelectViewModel$observePaymentMethodsInner$1$1", f = "DKSelectViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.divkit.select.DKSelectViewModel$observePaymentMethodsInner$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ tse $$this$launch;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, tse tseVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = hVar;
            this.$$this$launch = tseVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, (Continuation) obj3);
            anonymousClass1.L$0 = (tuf) obj;
            anonymousClass1.L$1 = (pq4) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, kotlin.collections.EmptyList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            tuf tufVar = (tuf) this.L$0;
            pq4 pq4Var = (pq4) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ?? arrayList = new ArrayList(tufVar.a);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (a8a0.f((PaymentMethod) obj3)) {
                    obj2 = null;
                    break;
                }
            }
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = EmptyList.a;
            boolean z = false;
            nq4 nq4Var = nq4.a;
            int i = 1;
            if (obj3 == null) {
                if (jl40.l(pq4Var, nq4Var)) {
                    rwo rwoVar = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar).a(sv90.N());
                    z = true;
                } else {
                    if (!(pq4Var instanceof oq4)) {
                        w511.b();
                        return obj2;
                    }
                    rwo rwoVar2 = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar2).a(sv90.V());
                }
                ref$BooleanRef.element = z;
                ref$ObjectRef2.element = arrayList;
            } else {
                if (jl40.l(pq4Var, nq4Var)) {
                    ycc.w(arrayList, new suf(i), true);
                    rwo rwoVar3 = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar3).a(sv90.N());
                    ref$BooleanRef.element = true;
                } else {
                    if (!(pq4Var instanceof oq4)) {
                        w511.b();
                        return obj2;
                    }
                    rwo rwoVar4 = this.this$0.c;
                    qv90.a.getClass();
                    ((y22) rwoVar4).a(sv90.W());
                    ref$BooleanRef.element = false;
                }
                ref$ObjectRef2.element = arrayList;
            }
            return new yuf(ref$ObjectRef2, ref$BooleanRef, ref$ObjectRef, tufVar, ref$BooleanRef2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectViewModel$observePaymentMethodsInner$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DKSelectViewModel$observePaymentMethodsInner$1 dKSelectViewModel$observePaymentMethodsInner$1 = new DKSelectViewModel$observePaymentMethodsInner$1(this.this$0, continuation);
        dKSelectViewModel$observePaymentMethodsInner$1.L$0 = obj;
        return dKSelectViewModel$observePaymentMethodsInner$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectViewModel$observePaymentMethodsInner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (r8.collect(r0, r7) == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            tprVar = hVar.c0;
            com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
            ds31.a(hVar);
            this.L$0 = tseVar;
            this.L$1 = tprVar;
            this.label = 1;
            com.yandex.payment.sdk.core.utils.a.c();
            g92 g92Var = new g92(2, new oq4());
            if (g92Var != coroutineSingletons) {
                obj = g92Var;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tprVar = (tpr) this.L$1;
        kotlin.b.b(obj);
        tpr t = kotlinx.coroutines.flow.e.t(new n1f(2, new m0(tprVar, (tpr) obj, new AnonymousClass1(this.this$0, tseVar, null)), this.this$0));
        f fVar = new f(this.this$0);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
