package com.yandex.go.inapp_calls.ui.loader;

import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State;", "<anonymous>", "(Ltse;)Lcom/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2", f = "InAppCallsLoadingPresenter.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ClidProvider.STATE, "Lcom/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2$1", f = "InAppCallsLoadingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((InAppCallsFeatureWrapper$State) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                b.b(obj);
                return Boolean.valueOf(inAppCallsFeatureWrapper$State == InAppCallsFeatureWrapper$State.LOADING);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsLoadingPresenter$awaitLoadingStateWithTimeout$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        g c = this.this$0.B.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
        this.label = 1;
        Object x = e.x(c, anonymousClass1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
