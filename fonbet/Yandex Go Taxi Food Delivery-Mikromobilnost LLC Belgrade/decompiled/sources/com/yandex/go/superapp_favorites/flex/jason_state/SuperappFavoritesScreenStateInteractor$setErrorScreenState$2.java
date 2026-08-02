package com.yandex.go.superapp_favorites.flex.jason_state;

import defpackage.d6x;
import defpackage.eja1;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.j5x;
import defpackage.jx81;
import defpackage.k6x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r5x;
import defpackage.s6x;
import defpackage.sb2;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld6x;", "<anonymous>", "(Ltse;)Ld6x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp_favorites.flex.jason_state.SuperappFavoritesScreenStateInteractor$setErrorScreenState$2", f = "SuperappFavoritesScreenStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SuperappFavoritesScreenStateInteractor$setErrorScreenState$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappFavoritesScreenStateInteractor$setErrorScreenState$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappFavoritesScreenStateInteractor$setErrorScreenState$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappFavoritesScreenStateInteractor$setErrorScreenState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        r5x q = eja1.q(scc.g("SuperappFavoritesState", "screenState"));
        j5x M = jx81.M("error");
        Map z = g8e.z("sync-with-divkit", "*");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(z.size()));
        for (Map.Entry entry : z.entrySet()) {
            linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
        }
        s6x s6xVar = new s6x(linkedHashMap);
        k6x k6xVar = this.this$0.b;
        if (!k6xVar.a()) {
            return k6xVar.b();
        }
        d6x d = jason.statham.tools.a.d(k6xVar.b(), q, M, s6xVar);
        return d.equals(k6xVar.b()) ? k6xVar.b() : k6xVar.e(d);
    }
}
