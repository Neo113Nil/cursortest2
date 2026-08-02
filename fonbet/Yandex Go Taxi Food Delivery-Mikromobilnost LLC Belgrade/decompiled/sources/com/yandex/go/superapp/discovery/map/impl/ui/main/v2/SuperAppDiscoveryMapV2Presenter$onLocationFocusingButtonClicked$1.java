package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.wyv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1", f = "SuperAppDiscoveryMapV2Presenter.kt", l = {206}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ wyv0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((wyv0) this.receiver).pause();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((wyv0) this.receiver).resume();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1(wyv0 wyv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wyv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapV2Presenter$onLocationFocusingButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wyv0 wyv0Var = this.this$0;
            wyv0Var.n0 = true;
            com.yandex.go.superapp.discovery.map.impl.domain.interactors.c cVar = wyv0Var.J;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, this.this$0, wyv0.class, "pause", "pause()V", 0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(0, this.this$0, wyv0.class, "resume", "resume()V", 0);
            this.label = 1;
            if (cVar.e(anonymousClass1, anonymousClass2, this) == coroutineSingletons) {
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
