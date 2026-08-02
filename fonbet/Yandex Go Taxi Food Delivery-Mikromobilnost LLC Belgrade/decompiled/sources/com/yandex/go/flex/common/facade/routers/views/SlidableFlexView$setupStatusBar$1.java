package com.yandex.go.flex.common.facade.routers.views;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.facade.routers.views.SlidableFlexView$setupStatusBar$1", f = "SlidableFlexView.kt", l = {336}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class SlidableFlexView$setupStatusBar$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $isLightFlow;
    int label;
    final /* synthetic */ SlidableFlexView this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.flex.common.facade.routers.views.SlidableFlexView$setupStatusBar$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((SlidableFlexView) this.receiver).changeTheme(((Boolean) obj).booleanValue());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidableFlexView$setupStatusBar$1(tpr tprVar, SlidableFlexView slidableFlexView, Continuation continuation) {
        super(2, continuation);
        this.$isLightFlow = tprVar;
        this.this$0 = slidableFlexView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlidableFlexView$setupStatusBar$1(this.$isLightFlow, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlidableFlexView$setupStatusBar$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$isLightFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0, SlidableFlexView.class, "changeTheme", "changeTheme(Z)V", 4);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
