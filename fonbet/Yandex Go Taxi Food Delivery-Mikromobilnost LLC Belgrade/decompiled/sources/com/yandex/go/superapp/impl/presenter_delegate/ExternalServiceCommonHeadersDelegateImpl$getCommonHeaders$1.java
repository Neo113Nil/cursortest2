package com.yandex.go.superapp.impl.presenter_delegate;

import defpackage.g1p;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.rpc;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.impl.presenter_delegate.ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1", f = "ExternalServiceCommonHeadersDelegateImpl.kt", l = {29, 30}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1 extends SuspendLambda implements wls {
    final /* synthetic */ rpc $view;
    Object L$0;
    int label;
    final /* synthetic */ g1p this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.superapp.impl.presenter_delegate.ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1$1", f = "ExternalServiceCommonHeadersDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.superapp.impl.presenter_delegate.ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Map<String, String> $headers;
        final /* synthetic */ rpc $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(rpc rpcVar, Map map, Continuation continuation) {
            super(2, continuation);
            this.$view = rpcVar;
            this.$headers = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$view, this.$headers, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$view.r4(this.$headers);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1(g1p g1pVar, rpc rpcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = g1pVar;
        this.$view = rpcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1(this.this$0, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExternalServiceCommonHeadersDelegateImpl$getCommonHeaders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (defpackage.tje.k0(r1, r4, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.superapp.impl.interactor.d dVar = this.this$0.b;
            this.label = 1;
            obj = dVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        this.this$0.d.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$view, (Map) obj, null);
        this.L$0 = null;
        this.label = 2;
    }
}
