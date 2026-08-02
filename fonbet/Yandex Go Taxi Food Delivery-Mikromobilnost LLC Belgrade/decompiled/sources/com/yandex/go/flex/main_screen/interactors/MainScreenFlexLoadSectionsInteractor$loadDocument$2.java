package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s900;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.MainScreenFlexLoadSectionsInteractor$loadDocument$2", f = "MainScreenFlexLoadSectionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexLoadSectionsInteractor$loadDocument$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ u1m $query;
    int label;
    final /* synthetic */ s900 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexLoadSectionsInteractor$loadDocument$2(s900 s900Var, u1m u1mVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s900Var;
        this.$query = u1mVar;
        this.$isForce = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenFlexLoadSectionsInteractor$loadDocument$2(this.this$0, this.$query, this.$isForce, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MainScreenFlexLoadSectionsInteractor$loadDocument$2 mainScreenFlexLoadSectionsInteractor$loadDocument$2 = (MainScreenFlexLoadSectionsInteractor$loadDocument$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mainScreenFlexLoadSectionsInteractor$loadDocument$2.invokeSuspend(zy11Var);
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
        flex.engine.a.q(this.this$0.a, this.$query, null, this.$isForce, 2);
        return zy11.a;
    }
}
