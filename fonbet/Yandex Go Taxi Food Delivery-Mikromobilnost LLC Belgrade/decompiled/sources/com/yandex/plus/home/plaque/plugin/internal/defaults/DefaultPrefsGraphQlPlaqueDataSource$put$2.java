package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.SharedPreferences;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultPrefsGraphQlPlaqueDataSource$put$2", f = "DefaultPrefsGraphQlPlaqueDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DefaultPrefsGraphQlPlaqueDataSource$put$2 extends SuspendLambda implements wls {
    final /* synthetic */ plc0 $dto;
    final /* synthetic */ llc0 $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsGraphQlPlaqueDataSource$put$2(b bVar, llc0 llc0Var, plc0 plc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$key = llc0Var;
        this.$dto = plc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPrefsGraphQlPlaqueDataSource$put$2 defaultPrefsGraphQlPlaqueDataSource$put$2 = new DefaultPrefsGraphQlPlaqueDataSource$put$2(this.this$0, this.$key, this.$dto, continuation);
        defaultPrefsGraphQlPlaqueDataSource$put$2.L$0 = obj;
        return defaultPrefsGraphQlPlaqueDataSource$put$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPrefsGraphQlPlaqueDataSource$put$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        llc0 llc0Var = this.$key;
        plc0 plc0Var = this.$dto;
        try {
            SharedPreferences.Editor edit = bVar.c.edit();
            edit.putString(b.a(bVar, llc0Var), bVar.d.c(plc0Var, plc0.Companion.serializer()));
            edit.commit();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        b bVar2 = this.this$0;
        plc0 plc0Var2 = this.$dto;
        Throwable a = Result.a(failure);
        if (a != null) {
            pgz pgzVar = bVar2.a;
            LogPriority logPriority = LogPriority.ERROR;
            if (pgzVar.e(logPriority)) {
                pgzVar.b(logPriority, "DefaultPrefsGraphQlPlaqueDataSource", "saveFallbackModel(dao=" + plc0Var2 + ')', a);
            }
        }
        return new Result(failure);
    }
}
