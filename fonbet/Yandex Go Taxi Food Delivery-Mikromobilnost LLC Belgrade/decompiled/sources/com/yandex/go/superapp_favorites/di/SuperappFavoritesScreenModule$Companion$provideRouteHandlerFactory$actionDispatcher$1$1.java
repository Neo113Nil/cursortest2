package com.yandex.go.superapp_favorites.di;

import defpackage.kr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wgr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp_favorites.di.SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$actionDispatcher$1$1", f = "SuperappFavoritesScreenModule.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$actionDispatcher$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ kr $action;
    final /* synthetic */ wgr $flexActionsRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$actionDispatcher$1$1(wgr wgrVar, kr krVar, Continuation continuation) {
        super(2, continuation);
        this.$flexActionsRepository = wgrVar;
        this.$action = krVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$actionDispatcher$1$1(this.$flexActionsRepository, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappFavoritesScreenModule$Companion$provideRouteHandlerFactory$actionDispatcher$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            wgr wgrVar = this.$flexActionsRepository;
            kr krVar = this.$action;
            this.label = 1;
            if (wgrVar.a(krVar, this) == coroutineSingletons) {
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
