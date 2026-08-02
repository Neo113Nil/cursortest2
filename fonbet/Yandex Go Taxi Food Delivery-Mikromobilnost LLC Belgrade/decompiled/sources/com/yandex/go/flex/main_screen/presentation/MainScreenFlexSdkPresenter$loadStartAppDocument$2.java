package com.yandex.go.flex.main_screen.presentation;

import com.yandex.go.flex.main_screen.interactors.o;
import defpackage.aa00;
import defpackage.b5q0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ute0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$loadStartAppDocument$2", f = "MainScreenFlexSdkPresenter.kt", l = {370}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexSdkPresenter$loadStartAppDocument$2 extends SuspendLambda implements wls {
    final /* synthetic */ ute0 $preparedQuery;
    final /* synthetic */ Set<b5q0> $triggers;
    int label;
    final /* synthetic */ aa00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexSdkPresenter$loadStartAppDocument$2(aa00 aa00Var, Set set, ute0 ute0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aa00Var;
        this.$triggers = set;
        this.$preparedQuery = ute0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenFlexSdkPresenter$loadStartAppDocument$2(this.this$0, this.$triggers, this.$preparedQuery, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenFlexSdkPresenter$loadStartAppDocument$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0.z;
            Set<b5q0> set = this.$triggers;
            ute0 ute0Var = this.$preparedQuery;
            this.label = 1;
            if (oVar.a(oVar.j.a(set), ute0Var, this) == coroutineSingletons) {
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
