package com.yandex.plus.home.graphql.experiments;

import defpackage.e3n;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ome0;
import defpackage.tls;
import defpackage.x3n;
import defpackage.zhf;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b extends com.yandex.plus.experiments.api.cooldown.a {
    public final tls c;
    public final com.yandex.plus.home.datasource.local.preferences.a d;

    public b(zhf zhfVar, ome0 ome0Var, tls tlsVar) {
        super(zhfVar);
        this.c = tlsVar;
        o430 o430Var = e3n.b;
        this.d = ome0Var.a("RECHARGE_END", x3n.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.experiments.api.cooldown.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCooldownManager$getCooldownEndTime$1 plusHomeExperimentsCooldownManager$getCooldownEndTime$1;
        int i;
        Object b;
        if (continuationImpl instanceof PlusHomeExperimentsCooldownManager$getCooldownEndTime$1) {
            plusHomeExperimentsCooldownManager$getCooldownEndTime$1 = (PlusHomeExperimentsCooldownManager$getCooldownEndTime$1) continuationImpl;
            int i2 = plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCooldownManager$getCooldownEndTime$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label = 1;
                    obj = e(plusHomeExperimentsCooldownManager$getCooldownEndTime$1);
                } else {
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
                    kotlin.b.b(obj);
                }
                plusHomeExperimentsCooldownManager$getCooldownEndTime$1.L$0 = null;
                plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label = 2;
                b = this.d.b((String) obj, plusHomeExperimentsCooldownManager$getCooldownEndTime$1);
            }
        }
        plusHomeExperimentsCooldownManager$getCooldownEndTime$1 = new PlusHomeExperimentsCooldownManager$getCooldownEndTime$1(this, continuationImpl);
        Object obj3 = plusHomeExperimentsCooldownManager$getCooldownEndTime$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label;
        if (i != 0) {
        }
        plusHomeExperimentsCooldownManager$getCooldownEndTime$1.L$0 = null;
        plusHomeExperimentsCooldownManager$getCooldownEndTime$1.label = 2;
        b = this.d.b((String) obj3, plusHomeExperimentsCooldownManager$getCooldownEndTime$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.experiments.api.cooldown.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1 plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1;
        int i;
        Object b;
        if (continuationImpl instanceof PlusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1) {
            plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1 = (PlusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1) continuationImpl;
            int i2 = plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label = 1;
                    obj = e(plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        b = ((Result) obj).getValue();
                        Object e3nVar = new e3n(0L);
                        if (b instanceof Result.Failure) {
                            b = e3nVar;
                        }
                        long j = ((e3n) b).a;
                        long a = this.a.a();
                        return Boolean.valueOf(e3n.c(j, a) > 0 && e3n.c(j, e3n.k(a, this.b)) < 0);
                    }
                    kotlin.b.b(obj);
                }
                plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.L$0 = null;
                plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label = 2;
                b = this.d.b((String) obj, plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1);
            }
        }
        plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1 = new PlusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1(this, continuationImpl);
        Object obj3 = plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label;
        if (i != 0) {
        }
        plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.L$0 = null;
        plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1.label = 2;
        b = this.d.b((String) obj3, plusHomeExperimentsCooldownManager$isExperimentsOnCooldown$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r6.d.d((java.lang.String) r9, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.experiments.api.cooldown.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j, ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCooldownManager$setCooldownEndTime$1 plusHomeExperimentsCooldownManager$setCooldownEndTime$1;
        int i;
        if (continuationImpl instanceof PlusHomeExperimentsCooldownManager$setCooldownEndTime$1) {
            plusHomeExperimentsCooldownManager$setCooldownEndTime$1 = (PlusHomeExperimentsCooldownManager$setCooldownEndTime$1) continuationImpl;
            int i2 = plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCooldownManager$setCooldownEndTime$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCooldownManager$setCooldownEndTime$1.J$0 = j;
                    plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label = 1;
                    obj = e(plusHomeExperimentsCooldownManager$setCooldownEndTime$1);
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
                    j = plusHomeExperimentsCooldownManager$setCooldownEndTime$1.J$0;
                    kotlin.b.b(obj);
                }
                e3n e3nVar = new e3n(j);
                plusHomeExperimentsCooldownManager$setCooldownEndTime$1.L$0 = null;
                plusHomeExperimentsCooldownManager$setCooldownEndTime$1.J$0 = j;
                plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label = 2;
            }
        }
        plusHomeExperimentsCooldownManager$setCooldownEndTime$1 = new PlusHomeExperimentsCooldownManager$setCooldownEndTime$1(this, continuationImpl);
        Object obj3 = plusHomeExperimentsCooldownManager$setCooldownEndTime$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label;
        if (i != 0) {
        }
        e3n e3nVar2 = new e3n(j);
        plusHomeExperimentsCooldownManager$setCooldownEndTime$1.L$0 = null;
        plusHomeExperimentsCooldownManager$setCooldownEndTime$1.J$0 = j;
        plusHomeExperimentsCooldownManager$setCooldownEndTime$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PlusHomeExperimentsCooldownManager$getDynamicKey$1 plusHomeExperimentsCooldownManager$getDynamicKey$1;
        int i;
        if (continuationImpl instanceof PlusHomeExperimentsCooldownManager$getDynamicKey$1) {
            plusHomeExperimentsCooldownManager$getDynamicKey$1 = (PlusHomeExperimentsCooldownManager$getDynamicKey$1) continuationImpl;
            int i2 = plusHomeExperimentsCooldownManager$getDynamicKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeExperimentsCooldownManager$getDynamicKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusHomeExperimentsCooldownManager$getDynamicKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeExperimentsCooldownManager$getDynamicKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    plusHomeExperimentsCooldownManager$getDynamicKey$1.label = 1;
                    obj = this.c.invoke(plusHomeExperimentsCooldownManager$getDynamicKey$1);
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
        plusHomeExperimentsCooldownManager$getDynamicKey$1 = new PlusHomeExperimentsCooldownManager$getDynamicKey$1(this, continuationImpl);
        Object obj2 = plusHomeExperimentsCooldownManager$getDynamicKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeExperimentsCooldownManager$getDynamicKey$1.label;
        if (i != 0) {
        }
        return String.valueOf(obj2);
    }
}
