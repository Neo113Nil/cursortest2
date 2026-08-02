package com.yandex.mob;

import defpackage.ny61;
import defpackage.vbf;
import defpackage.yo20;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f implements vbf {
    public final /* synthetic */ yo20 a;

    public f(yo20 yo20Var) {
        this.a = yo20Var;
    }

    @Override // defpackage.vbf
    public final Object b(Continuation continuation) {
        return new Integer(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vbf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, ContinuationImpl continuationImpl) {
        MobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1 mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1;
        int i;
        int intValue;
        if (continuationImpl instanceof MobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1) {
            mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1 = (MobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1) continuationImpl;
            int i2 = mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (num != null) {
                        intValue = num.intValue();
                        return new Integer(intValue);
                    }
                    com.yandex.mob.datastore.d g = d.g(this.a.x.b);
                    mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.L$0 = null;
                    mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.label = 1;
                    obj = g.n(mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1);
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
                Integer num2 = (Integer) obj;
                intValue = num2 == null ? num2.intValue() : 10;
                return new Integer(intValue);
            }
        }
        mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1 = new MobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1(this, continuationImpl);
        Object obj2 = mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobMainDependenciesConstructor$notificationJobScheduler$2$1$interval$1.label;
        if (i != 0) {
        }
        Integer num22 = (Integer) obj2;
        if (num22 == null) {
        }
        return new Integer(intValue);
    }
}
