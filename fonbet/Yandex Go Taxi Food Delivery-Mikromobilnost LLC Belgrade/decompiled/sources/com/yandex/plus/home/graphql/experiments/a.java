package com.yandex.plus.home.graphql.experiments;

import com.yandex.plus.core.config.Environment;
import defpackage.ny61;
import defpackage.ome0;
import defpackage.q1d0;
import defpackage.tls;
import defpackage.zhf;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a extends com.yandex.plus.experiments.api.cache.a {
    public final tls c;
    public final com.yandex.plus.home.datasource.local.preferences.a d;

    public a(zhf zhfVar, long j, Environment environment, ome0 ome0Var, tls tlsVar) {
        super(zhfVar, j);
        this.c = tlsVar;
        this.d = ome0Var.a(environment.name(), q1d0.Companion.serializer());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r6.d.d((java.lang.String) r9, null, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.plus.experiments.api.cache.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, Continuation continuation) {
        PlusHomeExperimentsCache$clearExperiments$1 plusHomeExperimentsCache$clearExperiments$1;
        int i;
        if (continuation instanceof PlusHomeExperimentsCache$clearExperiments$1) {
            plusHomeExperimentsCache$clearExperiments$1 = (PlusHomeExperimentsCache$clearExperiments$1) continuation;
            int i2 = plusHomeExperimentsCache$clearExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCache$clearExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCache$clearExperiments$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCache$clearExperiments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCache$clearExperiments$1.J$0 = j;
                    plusHomeExperimentsCache$clearExperiments$1.label = 1;
                    obj = f(plusHomeExperimentsCache$clearExperiments$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    j = plusHomeExperimentsCache$clearExperiments$1.J$0;
                    kotlin.b.b(obj);
                }
                plusHomeExperimentsCache$clearExperiments$1.L$0 = null;
                plusHomeExperimentsCache$clearExperiments$1.J$0 = j;
                plusHomeExperimentsCache$clearExperiments$1.label = 2;
            }
        }
        plusHomeExperimentsCache$clearExperiments$1 = new PlusHomeExperimentsCache$clearExperiments$1(this, (ContinuationImpl) continuation);
        Object obj3 = plusHomeExperimentsCache$clearExperiments$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCache$clearExperiments$1.label;
        if (i != 0) {
        }
        plusHomeExperimentsCache$clearExperiments$1.L$0 = null;
        plusHomeExperimentsCache$clearExperiments$1.J$0 = j;
        plusHomeExperimentsCache$clearExperiments$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.experiments.api.cache.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCache$getMaybeExpiredExperiments$1 plusHomeExperimentsCache$getMaybeExpiredExperiments$1;
        int i;
        com.yandex.plus.home.datasource.local.preferences.a aVar;
        Object b;
        if (continuationImpl instanceof PlusHomeExperimentsCache$getMaybeExpiredExperiments$1) {
            plusHomeExperimentsCache$getMaybeExpiredExperiments$1 = (PlusHomeExperimentsCache$getMaybeExpiredExperiments$1) continuationImpl;
            int i2 = plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCache$getMaybeExpiredExperiments$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.home.datasource.local.preferences.a aVar2 = this.d;
                    plusHomeExperimentsCache$getMaybeExpiredExperiments$1.L$0 = aVar2;
                    plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label = 1;
                    Object f = f(plusHomeExperimentsCache$getMaybeExpiredExperiments$1);
                    if (f != obj2) {
                        obj = f;
                        aVar = aVar2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                    if (b instanceof Result.Failure) {
                        return null;
                    }
                    return b;
                }
                aVar = (com.yandex.plus.home.datasource.local.preferences.a) plusHomeExperimentsCache$getMaybeExpiredExperiments$1.L$0;
                kotlin.b.b(obj);
                plusHomeExperimentsCache$getMaybeExpiredExperiments$1.L$0 = null;
                plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label = 2;
                b = aVar.b((String) obj, plusHomeExperimentsCache$getMaybeExpiredExperiments$1);
            }
        }
        plusHomeExperimentsCache$getMaybeExpiredExperiments$1 = new PlusHomeExperimentsCache$getMaybeExpiredExperiments$1(this, continuationImpl);
        Object obj3 = plusHomeExperimentsCache$getMaybeExpiredExperiments$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label;
        if (i != 0) {
        }
        plusHomeExperimentsCache$getMaybeExpiredExperiments$1.L$0 = null;
        plusHomeExperimentsCache$getMaybeExpiredExperiments$1.label = 2;
        b = aVar.b((String) obj3, plusHomeExperimentsCache$getMaybeExpiredExperiments$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r7.d((java.lang.String) r9, r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.experiments.api.cache.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q1d0 q1d0Var, ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCache$putExperiments$1 plusHomeExperimentsCache$putExperiments$1;
        int i;
        com.yandex.plus.home.datasource.local.preferences.a aVar;
        if (continuationImpl instanceof PlusHomeExperimentsCache$putExperiments$1) {
            plusHomeExperimentsCache$putExperiments$1 = (PlusHomeExperimentsCache$putExperiments$1) continuationImpl;
            int i2 = plusHomeExperimentsCache$putExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCache$putExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCache$putExperiments$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCache$putExperiments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCache$putExperiments$1.L$0 = q1d0Var;
                    com.yandex.plus.home.datasource.local.preferences.a aVar2 = this.d;
                    plusHomeExperimentsCache$putExperiments$1.L$1 = aVar2;
                    plusHomeExperimentsCache$putExperiments$1.label = 1;
                    Object f = f(plusHomeExperimentsCache$putExperiments$1);
                    if (f != obj2) {
                        obj = f;
                        aVar = aVar2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    return zy11.a;
                }
                aVar = (com.yandex.plus.home.datasource.local.preferences.a) plusHomeExperimentsCache$putExperiments$1.L$1;
                q1d0Var = (q1d0) plusHomeExperimentsCache$putExperiments$1.L$0;
                kotlin.b.b(obj);
                plusHomeExperimentsCache$putExperiments$1.L$0 = null;
                plusHomeExperimentsCache$putExperiments$1.L$1 = null;
                plusHomeExperimentsCache$putExperiments$1.label = 2;
            }
        }
        plusHomeExperimentsCache$putExperiments$1 = new PlusHomeExperimentsCache$putExperiments$1(this, continuationImpl);
        Object obj3 = plusHomeExperimentsCache$putExperiments$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCache$putExperiments$1.label;
        if (i != 0) {
        }
        plusHomeExperimentsCache$putExperiments$1.L$0 = null;
        plusHomeExperimentsCache$putExperiments$1.L$1 = null;
        plusHomeExperimentsCache$putExperiments$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCache$getDynamicKey$1 plusHomeExperimentsCache$getDynamicKey$1;
        int i;
        if (continuationImpl instanceof PlusHomeExperimentsCache$getDynamicKey$1) {
            plusHomeExperimentsCache$getDynamicKey$1 = (PlusHomeExperimentsCache$getDynamicKey$1) continuationImpl;
            int i2 = plusHomeExperimentsCache$getDynamicKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCache$getDynamicKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCache$getDynamicKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCache$getDynamicKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCache$getDynamicKey$1.label = 1;
                    obj = this.c.invoke(plusHomeExperimentsCache$getDynamicKey$1);
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
                return String.valueOf(obj);
            }
        }
        plusHomeExperimentsCache$getDynamicKey$1 = new PlusHomeExperimentsCache$getDynamicKey$1(this, continuationImpl);
        Object obj2 = plusHomeExperimentsCache$getDynamicKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCache$getDynamicKey$1.label;
        if (i != 0) {
        }
        return String.valueOf(obj2);
    }
}
