package com.ybsdk.core.utils.network.retryPolicy;

import defpackage.bgc;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final sls a;
    public final kotlinx.coroutines.sync.a b;
    public final LinkedHashMap c;

    public a(int i) {
        this.a = new bgc(22);
        this.b = gtq0.a();
        this.c = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:11:0x004c, B:13:0x0056, B:15:0x006b, B:17:0x0072), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r11v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CooldownManager$getRemainingCooldownMs$1 cooldownManager$getRemainingCooldownMs$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Long l;
        LinkedHashMap linkedHashMap = this.c;
        try {
            if (continuationImpl instanceof CooldownManager$getRemainingCooldownMs$1) {
                cooldownManager$getRemainingCooldownMs$1 = (CooldownManager$getRemainingCooldownMs$1) continuationImpl;
                int i2 = cooldownManager$getRemainingCooldownMs$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cooldownManager$getRemainingCooldownMs$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = cooldownManager$getRemainingCooldownMs$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cooldownManager$getRemainingCooldownMs$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cooldownManager$getRemainingCooldownMs$1.L$0 = str;
                        aVar = this.b;
                        cooldownManager$getRemainingCooldownMs$1.L$1 = aVar;
                        cooldownManager$getRemainingCooldownMs$1.label = 1;
                        if (aVar.a(cooldownManager$getRemainingCooldownMs$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r11 = (g050) cooldownManager$getRemainingCooldownMs$1.L$1;
                        String str2 = (String) cooldownManager$getRemainingCooldownMs$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r11;
                        str = str2;
                    }
                    l = (Long) linkedHashMap.get(str);
                    long j = 0;
                    if (l != null) {
                        long longValue = l.longValue() - ((Number) this.a.invoke()).longValue();
                        if (longValue <= 0) {
                            linkedHashMap.remove(str);
                        } else {
                            j = longValue;
                        }
                    }
                    Long l2 = new Long(j);
                    aVar.d(null);
                    return l2;
                }
            }
            l = (Long) linkedHashMap.get(str);
            long j2 = 0;
            if (l != null) {
            }
            Long l22 = new Long(j2);
            aVar.d(null);
            return l22;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        cooldownManager$getRemainingCooldownMs$1 = new CooldownManager$getRemainingCooldownMs$1(this, continuationImpl);
        Object obj2 = cooldownManager$getRemainingCooldownMs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cooldownManager$getRemainingCooldownMs$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, String str, ContinuationImpl continuationImpl) {
        CooldownManager$startCooldown$1 cooldownManager$startCooldown$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof CooldownManager$startCooldown$1) {
                cooldownManager$startCooldown$1 = (CooldownManager$startCooldown$1) continuationImpl;
                int i2 = cooldownManager$startCooldown$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cooldownManager$startCooldown$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = cooldownManager$startCooldown$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cooldownManager$startCooldown$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cooldownManager$startCooldown$1.L$0 = str;
                        aVar = this.b;
                        cooldownManager$startCooldown$1.L$1 = aVar;
                        cooldownManager$startCooldown$1.J$0 = j;
                        cooldownManager$startCooldown$1.label = 1;
                        if (aVar.a(cooldownManager$startCooldown$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = cooldownManager$startCooldown$1.J$0;
                        ?? r8 = (g050) cooldownManager$startCooldown$1.L$1;
                        String str2 = (String) cooldownManager$startCooldown$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r8;
                        str = str2;
                    }
                    this.c.put(str, new Long(((Number) this.a.invoke()).longValue() + j));
                    return zy11.a;
                }
            }
            this.c.put(str, new Long(((Number) this.a.invoke()).longValue() + j));
            return zy11.a;
        } finally {
            aVar.d(null);
        }
        cooldownManager$startCooldown$1 = new CooldownManager$startCooldown$1(this, continuationImpl);
        Object obj2 = cooldownManager$startCooldown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cooldownManager$startCooldown$1.label;
        if (i != 0) {
        }
    }

    public a() {
        this(0);
    }
}
