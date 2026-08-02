package com.yandex.plus.experiments.impl.cache;

import android.content.SharedPreferences;
import com.yandex.plus.core.config.Environment;
import defpackage.jse;
import defpackage.ny61;
import defpackage.q1d0;
import defpackage.sbx;
import defpackage.sls;
import defpackage.tje;
import defpackage.zhf;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a extends com.yandex.plus.experiments.api.cache.a {
    public final Environment c;
    public final jse d;
    public final sbx e;
    public final SharedPreferences f;
    public final sls g;

    public a(zhf zhfVar, long j, Environment environment, jse jseVar, sbx sbxVar, SharedPreferences sharedPreferences, sls slsVar) {
        super(zhfVar, j);
        this.c = environment;
        this.d = jseVar;
        this.e = sbxVar;
        this.f = sharedPreferences;
        this.g = slsVar;
    }

    public static final String f(a aVar) {
        return aVar.c.name() + '[' + aVar.g.invoke() + ']';
    }

    @Override // com.yandex.plus.experiments.api.cache.a
    public final Object a(long j, Continuation continuation) {
        Object e = e(null, (ContinuationImpl) continuation);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.experiments.api.cache.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PreferencesExperimentsCache$getMaybeExpiredExperiments$1 preferencesExperimentsCache$getMaybeExpiredExperiments$1;
        int i;
        if (continuationImpl instanceof PreferencesExperimentsCache$getMaybeExpiredExperiments$1) {
            preferencesExperimentsCache$getMaybeExpiredExperiments$1 = (PreferencesExperimentsCache$getMaybeExpiredExperiments$1) continuationImpl;
            int i2 = preferencesExperimentsCache$getMaybeExpiredExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesExperimentsCache$getMaybeExpiredExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preferencesExperimentsCache$getMaybeExpiredExperiments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesExperimentsCache$getMaybeExpiredExperiments$1.label;
                if (i != 0) {
                    b.b(obj);
                    PreferencesExperimentsCache$getMaybeExpiredExperiments$cachedExperiments$1 preferencesExperimentsCache$getMaybeExpiredExperiments$cachedExperiments$1 = new PreferencesExperimentsCache$getMaybeExpiredExperiments$cachedExperiments$1(this, null);
                    preferencesExperimentsCache$getMaybeExpiredExperiments$1.label = 1;
                    obj = tje.k0(this.d, preferencesExperimentsCache$getMaybeExpiredExperiments$cachedExperiments$1, preferencesExperimentsCache$getMaybeExpiredExperiments$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (q1d0) obj;
            }
        }
        preferencesExperimentsCache$getMaybeExpiredExperiments$1 = new PreferencesExperimentsCache$getMaybeExpiredExperiments$1(this, continuationImpl);
        Object obj2 = preferencesExperimentsCache$getMaybeExpiredExperiments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesExperimentsCache$getMaybeExpiredExperiments$1.label;
        if (i != 0) {
        }
        return (q1d0) obj2;
    }

    @Override // com.yandex.plus.experiments.api.cache.a
    public final Object e(q1d0 q1d0Var, ContinuationImpl continuationImpl) {
        return tje.k0(this.d, new PreferencesExperimentsCache$putExperiments$2(this, q1d0Var, null), continuationImpl);
    }
}
