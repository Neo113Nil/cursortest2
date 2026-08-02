package com.yandex.go.user_profile.ui.am;

import com.yandex.passport.api.s2;
import defpackage.d12;
import defpackage.evu0;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.ui.am.AmProfileScreenHolder$KeyedScreen$1$1", f = "AmProfileScreenHolder.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AmProfileScreenHolder$KeyedScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lz40 $actions;
    final /* synthetic */ oz40 $componentState;
    final /* synthetic */ String $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmProfileScreenHolder$KeyedScreen$1$1(oz40 oz40Var, String str, lz40 lz40Var, Continuation continuation) {
        super(2, continuation);
        this.$componentState = oz40Var;
        this.$state = str;
        this.$actions = lz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AmProfileScreenHolder$KeyedScreen$1$1(this.$componentState, this.$state, this.$actions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AmProfileScreenHolder$KeyedScreen$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if ((this.$componentState.getValue() instanceof d12) && (str = this.$state) != null && !evu0.J(str)) {
                s2 s2Var = new s2(this.$state);
                lz40 lz40Var = this.$actions;
                this.L$0 = null;
                this.label = 1;
                if (lz40Var.emit(s2Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
