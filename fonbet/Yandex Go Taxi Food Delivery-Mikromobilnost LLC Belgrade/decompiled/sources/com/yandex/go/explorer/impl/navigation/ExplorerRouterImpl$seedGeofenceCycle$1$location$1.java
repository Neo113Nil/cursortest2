package com.yandex.go.explorer.impl.navigation;

import defpackage.c0g;
import defpackage.gto;
import defpackage.i6r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzf;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/location/Location;", "<anonymous>", "(Ltse;)Landroid/location/Location;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$seedGeofenceCycle$1$location$1", f = "ExplorerRouterImpl.kt", l = {148}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$seedGeofenceCycle$1$location$1 extends SuspendLambda implements wls {
    final /* synthetic */ gto $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$seedGeofenceCycle$1$location$1(gto gtoVar, Continuation continuation) {
        super(2, continuation);
        this.$component = gtoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$seedGeofenceCycle$1$location$1(this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$seedGeofenceCycle$1$location$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.preorder.source.userposition.repository.b bVar = (ru.yandex.taxi.preorder.source.userposition.repository.b) ((c0g) ((i6r) ((pzf) this.$component).e)).z.Hc.get();
        q5z.h(bVar);
        com.yandex.go.explorer.impl.domain.interactors.b bVar2 = new com.yandex.go.explorer.impl.domain.interactors.b(bVar);
        this.label = 1;
        Object b = bVar2.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
