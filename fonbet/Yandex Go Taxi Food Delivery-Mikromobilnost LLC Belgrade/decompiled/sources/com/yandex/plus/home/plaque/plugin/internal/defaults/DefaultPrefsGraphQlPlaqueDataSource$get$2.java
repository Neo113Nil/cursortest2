package com.yandex.plus.home.plaque.plugin.internal.defaults;

import com.yandex.plus.log.api.LogPriority;
import defpackage.llc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.plc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lplc0;", "<anonymous>", "(Ltse;)Lplc0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultPrefsGraphQlPlaqueDataSource$get$2", f = "DefaultPrefsGraphQlPlaqueDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DefaultPrefsGraphQlPlaqueDataSource$get$2 extends SuspendLambda implements wls {
    final /* synthetic */ llc0 $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsGraphQlPlaqueDataSource$get$2(b bVar, llc0 llc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$key = llc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPrefsGraphQlPlaqueDataSource$get$2 defaultPrefsGraphQlPlaqueDataSource$get$2 = new DefaultPrefsGraphQlPlaqueDataSource$get$2(this.this$0, this.$key, continuation);
        defaultPrefsGraphQlPlaqueDataSource$get$2.L$0 = obj;
        return defaultPrefsGraphQlPlaqueDataSource$get$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPrefsGraphQlPlaqueDataSource$get$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        try {
            String string = bVar.c.getString(b.a(bVar, this.$key), null);
            failure = string != null ? (plc0) bVar.d.b(plc0.Companion.serializer(), string) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        b bVar2 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            pgz pgzVar = bVar2.a;
            LogPriority logPriority = LogPriority.ERROR;
            if (pgzVar.e(logPriority)) {
                pgzVar.b(logPriority, "DefaultPrefsGraphQlPlaqueDataSource", "getFallbackModel error", a);
            }
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
