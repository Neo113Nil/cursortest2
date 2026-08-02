package com.yandex.plus.home.common.utils;

import defpackage.jhd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.common.utils.CoroutinesExtKt$await$2", f = "CoroutinesExt.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CoroutinesExtKt$await$2 extends SuspendLambda implements wls {
    final /* synthetic */ Future<Object> $this_await;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtKt$await$2(Future future, Continuation continuation) {
        super(2, continuation);
        this.$this_await = future;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutinesExtKt$await$2 coroutinesExtKt$await$2 = new CoroutinesExtKt$await$2(this.$this_await, continuation);
        coroutinesExtKt$await$2.L$0 = obj;
        return coroutinesExtKt$await$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesExtKt$await$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        jhd jhdVar = new jhd(15, this.$this_await, tje.N(tseVar, null, null, new CoroutinesExtKt$await$2$cancelJob$1(this.$this_await, null), 3));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object r = kotlinx.coroutines.a.r(jhdVar, this);
        return r == coroutineSingletons ? coroutineSingletons : r;
    }
}
