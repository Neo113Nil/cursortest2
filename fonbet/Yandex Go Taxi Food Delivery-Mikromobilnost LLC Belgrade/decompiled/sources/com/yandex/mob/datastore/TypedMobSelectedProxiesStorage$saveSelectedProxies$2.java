package com.yandex.mob.datastore;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pr20;
import defpackage.wls;
import defpackage.xr20;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxr20;", "it", "<anonymous>", "(Lxr20;)Lxr20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.datastore.TypedMobSelectedProxiesStorage$saveSelectedProxies$2", f = "TypedMobSelectedProxiesStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class TypedMobSelectedProxiesStorage$saveSelectedProxies$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<pr20> $proxies;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedMobSelectedProxiesStorage$saveSelectedProxies$2(List list, Continuation continuation) {
        super(2, continuation);
        this.$proxies = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TypedMobSelectedProxiesStorage$saveSelectedProxies$2 typedMobSelectedProxiesStorage$saveSelectedProxies$2 = new TypedMobSelectedProxiesStorage$saveSelectedProxies$2(this.$proxies, continuation);
        typedMobSelectedProxiesStorage$saveSelectedProxies$2.L$0 = obj;
        return typedMobSelectedProxiesStorage$saveSelectedProxies$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TypedMobSelectedProxiesStorage$saveSelectedProxies$2) create((xr20) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xr20 xr20Var = (xr20) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return xr20.a(xr20Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$proxies, 32767);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
