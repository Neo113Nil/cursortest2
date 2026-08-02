package com.yandex.mob;

import defpackage.jl40;
import defpackage.lq20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.MobProxyIpToHostProvider$getHostsByIp$1", f = "MobProxyIpToHostProvider.kt", l = {12}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MobProxyIpToHostProvider$getHostsByIp$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $ip;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobProxyIpToHostProvider$getHostsByIp$1(n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$ip = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobProxyIpToHostProvider$getHostsByIp$1(this.this$0, this.$ip, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobProxyIpToHostProvider$getHostsByIp$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.mob.domain.l lVar = this.this$0.a;
            this.label = 1;
            obj = lVar.m(this);
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
        String str = this.$ip;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (jl40.l(((lq20) obj2).g, str)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lq20 lq20Var = (lq20) it.next();
            arrayList2.add(lq20Var.d);
            String str2 = lq20Var.h;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        return arrayList2;
    }
}
