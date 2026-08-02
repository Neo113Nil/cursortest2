package com.yandex.go.places.base.ui.common.map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.q3v;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.base.ui.common.map.PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1", f = "PlacesMapAwarePresenter.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.places.base.ui.common.map.PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((c) this.receiver).pause();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.places.base.ui.common.map.PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((c) this.receiver).resume();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapAwarePresenter$onLocationFocusingButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q3v q3vVar = this.this$0.x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, this.this$0, c.class, "pause", "pause()V", 0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(0, this.this$0, c.class, "resume", "resume()V", 0);
            this.label = 1;
            if (((com.yandex.go.places.impl.domain.interactors.common.a) q3vVar).d(anonymousClass1, anonymousClass2, this) == coroutineSingletons) {
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
