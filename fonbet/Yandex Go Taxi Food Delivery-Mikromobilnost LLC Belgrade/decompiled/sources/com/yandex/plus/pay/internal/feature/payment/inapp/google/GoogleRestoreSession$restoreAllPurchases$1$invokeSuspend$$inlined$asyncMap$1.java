package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcd0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xca1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltse;", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1", f = "GoogleRestoreSession.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $$this$flow$inlined;
    final /* synthetic */ Ref$ObjectRef $lastThrowable$inlined;
    final /* synthetic */ Collection $this_asyncMap;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1$1", f = "GoogleRestoreSession.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.pay.internal.feature.payment.inapp.google.GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow$inlined;
        final /* synthetic */ Object $item;
        final /* synthetic */ Ref$ObjectRef $lastThrowable$inlined;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Continuation continuation, vpr vprVar, a aVar, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.$item = obj;
            this.$$this$flow$inlined = vprVar;
            this.this$0 = aVar;
            this.$lastThrowable$inlined = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$item, continuation, this.$$this$flow$inlined, this.this$0, this.$lastThrowable$inlined);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v7, types: [T, com.yandex.plus.pay.api.exception.PlusPayException] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            rcd0 rcd0Var;
            Throwable th;
            TimeoutCancellationException e;
            Result.Failure failure;
            Object obj2;
            Throwable a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    rcd0 rcd0Var2 = (rcd0) this.$item;
                    try {
                        a aVar = this.this$0;
                        this.L$0 = null;
                        this.L$1 = rcd0Var2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        if (a.a(aVar, rcd0Var2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        rcd0Var = rcd0Var2;
                    } catch (TimeoutCancellationException e2) {
                        rcd0Var = rcd0Var2;
                        e = e2;
                        failure = new Result.Failure(e);
                        obj2 = failure;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        if (obj2 instanceof Result.Failure) {
                        }
                    } catch (Throwable th2) {
                        rcd0Var = rcd0Var2;
                        th = th2;
                        failure = new Result.Failure(th);
                        obj2 = failure;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        if (obj2 instanceof Result.Failure) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rcd0Var = (rcd0) this.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        failure = new Result.Failure(e);
                        obj2 = failure;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        if (obj2 instanceof Result.Failure) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        failure = new Result.Failure(th);
                        obj2 = failure;
                        a = Result.a(obj2);
                        if (a != null) {
                        }
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        if (obj2 instanceof Result.Failure) {
                        }
                    }
                }
                obj2 = zy11.a;
                a = Result.a(obj2);
                if (a != null) {
                    this.$lastThrowable$inlined.element = xca1.e(a);
                }
                if (!(obj2 instanceof Result.Failure)) {
                    obj2 = rcd0Var.a;
                }
                if (obj2 instanceof Result.Failure) {
                    return null;
                }
                return obj2;
            } catch (CancellationException e4) {
                throw e4;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(Collection collection, Continuation continuation, vpr vprVar, a aVar, Ref$ObjectRef ref$ObjectRef) {
        super(2, continuation);
        this.$this_asyncMap = collection;
        this.$$this$flow$inlined = vprVar;
        this.this$0 = aVar;
        this.$lastThrowable$inlined = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 = new GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(this.$this_asyncMap, continuation, this.$$this$flow$inlined, this.this$0, this.$lastThrowable$inlined);
        googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1.L$0 = obj;
        return googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Collection collection = this.$this_asyncMap;
        ArrayList arrayList = new ArrayList(tcc.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new AnonymousClass1(it.next(), null, this.$$this$flow$inlined, this.this$0, this.$lastThrowable$inlined), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
