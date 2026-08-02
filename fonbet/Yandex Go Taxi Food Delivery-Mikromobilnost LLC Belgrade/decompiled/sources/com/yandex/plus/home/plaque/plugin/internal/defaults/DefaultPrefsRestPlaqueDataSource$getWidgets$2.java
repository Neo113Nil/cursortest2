package com.yandex.plus.home.plaque.plugin.internal.defaults;

import com.yandex.plus.log.api.LogPriority;
import defpackage.h260;
import defpackage.i4z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p53;
import defpackage.pgz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zcx;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lh260;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.plugin.internal.defaults.DefaultPrefsRestPlaqueDataSource$getWidgets$2", f = "DefaultPrefsRestPlaqueDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultPrefsRestPlaqueDataSource$getWidgets$2 extends SuspendLambda implements wls {
    final /* synthetic */ i4z $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsRestPlaqueDataSource$getWidgets$2(c cVar, i4z i4zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$key = i4zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPrefsRestPlaqueDataSource$getWidgets$2 defaultPrefsRestPlaqueDataSource$getWidgets$2 = new DefaultPrefsRestPlaqueDataSource$getWidgets$2(this.this$0, this.$key, continuation);
        defaultPrefsRestPlaqueDataSource$getWidgets$2.L$0 = obj;
        return defaultPrefsRestPlaqueDataSource$getWidgets$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPrefsRestPlaqueDataSource$getWidgets$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        try {
            String string = cVar.c.getString(c.g(this.$key).concat("_widgets"), null);
            if (string != null) {
                zcx zcxVar = cVar.d;
                zcxVar.getClass();
                failure = (List) zcxVar.b(new p53(h260.Companion.serializer(), 0), string);
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        c cVar2 = this.this$0;
        i4z i4zVar = this.$key;
        Throwable a = Result.a(failure);
        if (a != null) {
            pgz pgzVar = cVar2.a;
            LogPriority logPriority = LogPriority.ERROR;
            if (pgzVar.e(logPriority)) {
                pgzVar.b(logPriority, "DefaultPrefsRestPlaqueDataSource", "getWidgets(key=" + c.g(i4zVar) + ") error", a);
            }
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
