package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.SharedPreferences;
import com.yandex.plus.log.api.LogPriority;
import defpackage.i4z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o060;
import defpackage.pgz;
import defpackage.qke;
import defpackage.tse;
import defpackage.wls;
import defpackage.zcx;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2", f = "DefaultPrefsRestPlaqueDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2 extends SuspendLambda implements wls {
    final /* synthetic */ i4z $key;
    final /* synthetic */ o060 $model;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2(c cVar, i4z i4zVar, o060 o060Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$key = i4zVar;
        this.$model = o060Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2 defaultPrefsRestPlaqueDataSource$putFallbackPlaque$2 = new DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2(this.this$0, this.$key, this.$model, continuation);
        defaultPrefsRestPlaqueDataSource$putFallbackPlaque$2.L$0 = obj;
        return defaultPrefsRestPlaqueDataSource$putFallbackPlaque$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        c cVar = this.this$0;
        i4z i4zVar = this.$key;
        o060 o060Var = this.$model;
        try {
            SharedPreferences.Editor edit = cVar.c.edit();
            String concat = c.g(i4zVar).concat("_fallback");
            zcx zcxVar = cVar.d;
            zcxVar.getClass();
            edit.putString(concat, zcxVar.c(o060Var, qke.n(o060.Companion.serializer())));
            edit.commit();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        c cVar2 = this.this$0;
        i4z i4zVar2 = this.$key;
        o060 o060Var2 = this.$model;
        Throwable a = Result.a(failure);
        if (a != null) {
            pgz pgzVar = cVar2.a;
            LogPriority logPriority = LogPriority.ERROR;
            if (pgzVar.e(logPriority)) {
                pgzVar.b(logPriority, "DefaultPrefsRestPlaqueDataSource", "putFallbackPlaque(key=" + c.g(i4zVar2) + ", model=" + o060Var2 + ')', a);
            }
        }
        return new Result(failure);
    }
}
