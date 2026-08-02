package com.yandex.go.image.domain.requests;

import defpackage.bax0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owy0;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.domain.requests.ThemeSwitcherListener$onAttachStateChangeListener$1$onViewAttachedToWindow$1", f = "CoilDrawableRequest.kt", l = {208}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ThemeSwitcherListener$onAttachStateChangeListener$1$onViewAttachedToWindow$1 extends SuspendLambda implements wls {
    final /* synthetic */ pwy0 $themeProvider;
    int label;
    final /* synthetic */ owy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSwitcherListener$onAttachStateChangeListener$1$onViewAttachedToWindow$1(pwy0 pwy0Var, owy0 owy0Var, Continuation continuation) {
        super(2, continuation);
        this.$themeProvider = pwy0Var;
        this.this$0 = owy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThemeSwitcherListener$onAttachStateChangeListener$1$onViewAttachedToWindow$1(this.$themeProvider, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ThemeSwitcherListener$onAttachStateChangeListener$1$onViewAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.$themeProvider.a();
            bax0 bax0Var = new bax0(19, this.this$0);
            this.label = 1;
            Object collect = a.collect(new r(bax0Var, new Ref$IntRef()), this);
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
