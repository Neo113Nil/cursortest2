package com.yandex.go.navigator.main_screen;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainScreenRootRouter$initFromAddress$1", f = "MainScreenRootRouter.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainScreenRootRouter$initFromAddress$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenRootRouter$initFromAddress$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenRootRouter$initFromAddress$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenRootRouter$initFromAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.M.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            MainScreenRootRouter$initFromAddress$1$address$1 mainScreenRootRouter$initFromAddress$1$address$1 = new MainScreenRootRouter$initFromAddress$1$address$1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(mdhVar, mainScreenRootRouter$initFromAddress$1$address$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.E.b((oe50) obj);
        return zy11.a;
    }
}
