package com.yandex.go.external_service.delegates;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.dvx;
import defpackage.i0z;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.delegates.MainDelegate$requestAuthData$1", f = "MainDelegate.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainDelegate$requestAuthData$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $callback;
    final /* synthetic */ boolean $forceUpdateCookie;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.external_service.delegates.MainDelegate$requestAuthData$1$1", f = "MainDelegate.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.external_service.delegates.MainDelegate$requestAuthData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $callback;
        final /* synthetic */ boolean $forceUpdateCookie;
        final /* synthetic */ Ref$ObjectRef<dvx> $previousInfo;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, c cVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef, boolean z) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$previousInfo = ref$ObjectRef;
            this.$forceUpdateCookie = z;
            this.$callback = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$callback, this.this$0, continuation, this.$previousInfo, this.$forceUpdateCookie);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                jqr jqrVar = new jqr(e.s(this.this$0.c.b(), new i0z(2)), new MainDelegate$launchInfoFlow$2(2, null), 3);
                Ref$ObjectRef<dvx> ref$ObjectRef = this.$previousInfo;
                g X = e.X(new b(jqrVar, ref$ObjectRef), new MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1(this.$callback, this.this$0, null, ref$ObjectRef, this.$forceUpdateCookie));
                this.label = 1;
                if (e.j(X, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDelegate$requestAuthData$1(c cVar, boolean z, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$forceUpdateCookie = z;
        this.$callback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainDelegate$requestAuthData$1(this.this$0, this.$forceUpdateCookie, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainDelegate$requestAuthData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            c cVar = this.this$0;
            Lifecycle lifecycle = cVar.i;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, cVar, null, z, this.$forceUpdateCookie);
            this.L$0 = null;
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
