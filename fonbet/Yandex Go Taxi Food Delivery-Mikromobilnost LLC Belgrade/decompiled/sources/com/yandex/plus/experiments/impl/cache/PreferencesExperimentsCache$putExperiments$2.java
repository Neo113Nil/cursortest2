package com.yandex.plus.experiments.impl.cache;

import android.content.SharedPreferences;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q1d0;
import defpackage.qke;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.experiments.impl.cache.PreferencesExperimentsCache$putExperiments$2", f = "PreferencesExperimentsCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PreferencesExperimentsCache$putExperiments$2 extends SuspendLambda implements wls {
    final /* synthetic */ q1d0 $experiments;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesExperimentsCache$putExperiments$2(a aVar, q1d0 q1d0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$experiments = q1d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferencesExperimentsCache$putExperiments$2 preferencesExperimentsCache$putExperiments$2 = new PreferencesExperimentsCache$putExperiments$2(this.this$0, this.$experiments, continuation);
        preferencesExperimentsCache$putExperiments$2.L$0 = obj;
        return preferencesExperimentsCache$putExperiments$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesExperimentsCache$putExperiments$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            failure = this.this$0.e.c(this.$experiments, qke.n(q1d0.Companion.serializer()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        if (str == null) {
            return null;
        }
        a aVar = this.this$0;
        SharedPreferences.Editor edit = aVar.f.edit();
        edit.putString(a.f(aVar), str);
        edit.commit();
        return zy11.a;
    }
}
