package com.yandex.plus.experiments.impl.cooldown;

import android.content.SharedPreferences;
import defpackage.e3n;
import defpackage.jse;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tje;
import defpackage.zhf;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a extends com.yandex.plus.experiments.api.cooldown.a {
    public final jse c;
    public final SharedPreferences d;

    public a(zhf zhfVar, jse jseVar, SharedPreferences sharedPreferences) {
        super(zhfVar);
        this.c = jseVar;
        this.d = sharedPreferences;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.experiments.api.cooldown.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PreferencesExperimentsCooldownManager$getCooldownEndTime$1 preferencesExperimentsCooldownManager$getCooldownEndTime$1;
        int i;
        if (continuationImpl instanceof PreferencesExperimentsCooldownManager$getCooldownEndTime$1) {
            preferencesExperimentsCooldownManager$getCooldownEndTime$1 = (PreferencesExperimentsCooldownManager$getCooldownEndTime$1) continuationImpl;
            int i2 = preferencesExperimentsCooldownManager$getCooldownEndTime$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesExperimentsCooldownManager$getCooldownEndTime$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preferencesExperimentsCooldownManager$getCooldownEndTime$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesExperimentsCooldownManager$getCooldownEndTime$1.label;
                if (i != 0) {
                    b.b(obj);
                    PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1 preferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1 = new PreferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1(this, null);
                    preferencesExperimentsCooldownManager$getCooldownEndTime$1.label = 1;
                    obj = tje.k0(this.c, preferencesExperimentsCooldownManager$getCooldownEndTime$cooldownEndTime$1, preferencesExperimentsCooldownManager$getCooldownEndTime$1);
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
                return (e3n) obj;
            }
        }
        preferencesExperimentsCooldownManager$getCooldownEndTime$1 = new PreferencesExperimentsCooldownManager$getCooldownEndTime$1(this, continuationImpl);
        Object obj2 = preferencesExperimentsCooldownManager$getCooldownEndTime$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesExperimentsCooldownManager$getCooldownEndTime$1.label;
        if (i != 0) {
        }
        return (e3n) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.experiments.api.cooldown.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PreferencesExperimentsCooldownManager$isExperimentsOnCooldown$1 preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1;
        Object obj;
        int i;
        e3n e3nVar;
        long j;
        long j2;
        if (continuationImpl instanceof PreferencesExperimentsCooldownManager$isExperimentsOnCooldown$1) {
            preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1 = (PreferencesExperimentsCooldownManager$isExperimentsOnCooldown$1) continuationImpl;
            int i2 = preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label;
                if (i != 0) {
                    b.b(obj2);
                    preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label = 1;
                    obj2 = a(preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.J$0;
                        b.b(obj2);
                        long a = this.a.a();
                        return Boolean.valueOf(e3n.c(j2, a) <= 0 && e3n.c(j2, e3n.k(a, this.b)) < 0);
                    }
                    b.b(obj2);
                }
                e3nVar = (e3n) obj2;
                if (e3nVar == null) {
                    j = e3nVar.a;
                } else {
                    o430 o430Var = e3n.b;
                    j = 0;
                }
                preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.J$0 = j;
                preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label = 2;
                if (c(j, preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1) != obj) {
                    j2 = j;
                    long a2 = this.a.a();
                    return Boolean.valueOf(e3n.c(j2, a2) <= 0 && e3n.c(j2, e3n.k(a2, this.b)) < 0);
                }
                return obj;
            }
        }
        preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1 = new PreferencesExperimentsCooldownManager$isExperimentsOnCooldown$1(this, continuationImpl);
        Object obj22 = preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label;
        if (i != 0) {
        }
        e3nVar = (e3n) obj22;
        if (e3nVar == null) {
        }
        preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.J$0 = j;
        preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1.label = 2;
        if (c(j, preferencesExperimentsCooldownManager$isExperimentsOnCooldown$1) != obj) {
        }
        return obj;
    }

    @Override // com.yandex.plus.experiments.api.cooldown.a
    public final Object c(long j, ContinuationImpl continuationImpl) {
        Object k0 = tje.k0(this.c, new PreferencesExperimentsCooldownManager$setCooldownEndTime$2(this, j, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
