package com.yandex.mob.cron;

import com.yandex.mob.datastore.d;
import com.yandex.mob.model.MobCronJobType;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jb7;
import defpackage.jr20;
import defpackage.no20;
import defpackage.npt;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qn20;
import defpackage.tls;
import defpackage.vbf;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes8.dex */
public final class a {
    public final MobCronJobType a;
    public final npt b;
    public final jb7 c;
    public final vbf d;
    public final jr20 e;
    public final no20 f;
    public volatile pzt0 g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public a(MobCronJobType mobCronJobType, npt nptVar, jb7 jb7Var, vbf vbfVar, jr20 jr20Var, no20 no20Var) {
        this.a = mobCronJobType;
        this.b = nptVar;
        this.c = jb7Var;
        this.d = vbfVar;
        this.e = jr20Var;
        this.f = no20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r2 == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, int i, tls tlsVar, ContinuationImpl continuationImpl) {
        CronJobScheduler$checkTrigger$1 cronJobScheduler$checkTrigger$1;
        int i2;
        tls tlsVar2;
        qn20 qn20Var;
        Long l;
        long longValue;
        long b;
        tls tlsVar3;
        long j;
        long j2;
        int i3 = i;
        MobCronJobType mobCronJobType = aVar.a;
        if (continuationImpl instanceof CronJobScheduler$checkTrigger$1) {
            cronJobScheduler$checkTrigger$1 = (CronJobScheduler$checkTrigger$1) continuationImpl;
            int i4 = cronJobScheduler$checkTrigger$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cronJobScheduler$checkTrigger$1.label = i4 - Integer.MIN_VALUE;
                Object obj = cronJobScheduler$checkTrigger$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cronJobScheduler$checkTrigger$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 != 0) {
                    b.b(obj);
                    if (i3 != 0) {
                        jb7 jb7Var = aVar.c;
                        tlsVar2 = tlsVar;
                        cronJobScheduler$checkTrigger$1.L$0 = tlsVar2;
                        cronJobScheduler$checkTrigger$1.I$0 = i3;
                        cronJobScheduler$checkTrigger$1.label = 1;
                        obj = ((d) jb7Var.w).C((MobCronJobType) jb7Var.b, cronJobScheduler$checkTrigger$1);
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3 && i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    }
                    j2 = cronJobScheduler$checkTrigger$1.J$2;
                    j = cronJobScheduler$checkTrigger$1.J$1;
                    longValue = cronJobScheduler$checkTrigger$1.J$0;
                    i3 = cronJobScheduler$checkTrigger$1.I$0;
                    tlsVar3 = (tls) cronJobScheduler$checkTrigger$1.L$0;
                    b.b(obj);
                    MobTrigger mobTrigger = MobTrigger.PendingTrigger;
                    cronJobScheduler$checkTrigger$1.L$0 = null;
                    cronJobScheduler$checkTrigger$1.L$1 = null;
                    cronJobScheduler$checkTrigger$1.I$0 = i3;
                    cronJobScheduler$checkTrigger$1.J$0 = longValue;
                    cronJobScheduler$checkTrigger$1.J$1 = j;
                    cronJobScheduler$checkTrigger$1.J$2 = j2;
                    cronJobScheduler$checkTrigger$1.label = 3;
                    return aVar.f(mobTrigger, tlsVar3, cronJobScheduler$checkTrigger$1) != obj2 ? obj2 : zy11Var;
                }
                i3 = cronJobScheduler$checkTrigger$1.I$0;
                tlsVar2 = (tls) cronJobScheduler$checkTrigger$1.L$0;
                b.b(obj);
                qn20Var = (qn20) obj;
                if (qn20Var != null && (l = qn20Var.b) != null) {
                    longValue = l.longValue();
                    b = aVar.b.b();
                    if (longValue <= b) {
                        long j3 = longValue - b;
                        mobCronJobType.toString();
                        cronJobScheduler$checkTrigger$1.L$0 = tlsVar2;
                        cronJobScheduler$checkTrigger$1.L$1 = null;
                        cronJobScheduler$checkTrigger$1.I$0 = i3;
                        cronJobScheduler$checkTrigger$1.J$0 = longValue;
                        cronJobScheduler$checkTrigger$1.J$1 = b;
                        cronJobScheduler$checkTrigger$1.J$2 = j3;
                        cronJobScheduler$checkTrigger$1.label = 2;
                        if (kotlinx.coroutines.a.i(j3 * 1000, cronJobScheduler$checkTrigger$1) != obj2) {
                            tlsVar3 = tlsVar2;
                            j = b;
                            j2 = j3;
                            MobTrigger mobTrigger2 = MobTrigger.PendingTrigger;
                            cronJobScheduler$checkTrigger$1.L$0 = null;
                            cronJobScheduler$checkTrigger$1.L$1 = null;
                            cronJobScheduler$checkTrigger$1.I$0 = i3;
                            cronJobScheduler$checkTrigger$1.J$0 = longValue;
                            cronJobScheduler$checkTrigger$1.J$1 = j;
                            cronJobScheduler$checkTrigger$1.J$2 = j2;
                            cronJobScheduler$checkTrigger$1.label = 3;
                            if (aVar.f(mobTrigger2, tlsVar3, cronJobScheduler$checkTrigger$1) != obj2) {
                            }
                        }
                    } else {
                        mobCronJobType.toString();
                        MobTrigger mobTrigger3 = MobTrigger.PendingTrigger;
                        cronJobScheduler$checkTrigger$1.L$0 = null;
                        cronJobScheduler$checkTrigger$1.L$1 = null;
                        cronJobScheduler$checkTrigger$1.I$0 = i3;
                        cronJobScheduler$checkTrigger$1.J$0 = longValue;
                        cronJobScheduler$checkTrigger$1.J$1 = b;
                        cronJobScheduler$checkTrigger$1.label = 4;
                        if (aVar.f(mobTrigger3, tlsVar2, cronJobScheduler$checkTrigger$1) == obj2) {
                        }
                    }
                }
            }
        }
        cronJobScheduler$checkTrigger$1 = new CronJobScheduler$checkTrigger$1(aVar, continuationImpl);
        Object obj3 = cronJobScheduler$checkTrigger$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cronJobScheduler$checkTrigger$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 != 0) {
        }
        qn20Var = (qn20) obj3;
        if (qn20Var != null) {
            longValue = l.longValue();
            b = aVar.b.b();
            if (longValue <= b) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0053, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        CronJobScheduler$restoreCronIntervalSeconds$1 cronJobScheduler$restoreCronIntervalSeconds$1;
        int i;
        long b;
        Integer num;
        Integer num2;
        long j;
        Long l;
        Long l2;
        aVar.getClass();
        if (continuationImpl instanceof CronJobScheduler$restoreCronIntervalSeconds$1) {
            cronJobScheduler$restoreCronIntervalSeconds$1 = (CronJobScheduler$restoreCronIntervalSeconds$1) continuationImpl;
            int i2 = cronJobScheduler$restoreCronIntervalSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cronJobScheduler$restoreCronIntervalSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cronJobScheduler$restoreCronIntervalSeconds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cronJobScheduler$restoreCronIntervalSeconds$1.label;
                if (i != 0) {
                    b.b(obj);
                    b = aVar.b.b();
                    vbf vbfVar = aVar.d;
                    cronJobScheduler$restoreCronIntervalSeconds$1.J$0 = b;
                    cronJobScheduler$restoreCronIntervalSeconds$1.label = 1;
                    obj = vbfVar.a(null, cronJobScheduler$restoreCronIntervalSeconds$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = cronJobScheduler$restoreCronIntervalSeconds$1.J$0;
                        num2 = (Integer) cronJobScheduler$restoreCronIntervalSeconds$1.L$0;
                        b.b(obj);
                        qn20 qn20Var = (qn20) obj;
                        l = qn20Var == null ? qn20Var.a : null;
                        l2 = qn20Var != null ? qn20Var.b : null;
                        if (l2 == null && l2.longValue() > j) {
                            return new Integer((int) (l2.longValue() - j));
                        }
                        if (l != null || j - l.longValue() >= num2.intValue()) {
                            return new Integer(0);
                        }
                        return new Integer(num2.intValue() - ((int) (j - l.longValue())));
                    }
                    b = cronJobScheduler$restoreCronIntervalSeconds$1.J$0;
                    b.b(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                    aVar.a.toString();
                    return null;
                }
                jb7 jb7Var = aVar.c;
                cronJobScheduler$restoreCronIntervalSeconds$1.L$0 = num;
                cronJobScheduler$restoreCronIntervalSeconds$1.J$0 = b;
                cronJobScheduler$restoreCronIntervalSeconds$1.label = 2;
                Object e = ((d) jb7Var.w).e((MobCronJobType) jb7Var.b, cronJobScheduler$restoreCronIntervalSeconds$1);
                if (e != coroutineSingletons) {
                    obj = e;
                    num2 = num;
                    j = b;
                    qn20 qn20Var2 = (qn20) obj;
                    if (qn20Var2 == null) {
                    }
                    if (qn20Var2 != null) {
                    }
                    if (l2 == null) {
                    }
                    if (l != null) {
                    }
                    return new Integer(0);
                }
                return coroutineSingletons;
            }
        }
        cronJobScheduler$restoreCronIntervalSeconds$1 = new CronJobScheduler$restoreCronIntervalSeconds$1(aVar, continuationImpl);
        Object obj2 = cronJobScheduler$restoreCronIntervalSeconds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cronJobScheduler$restoreCronIntervalSeconds$1.label;
        if (i != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        if (kotlinx.coroutines.a.i(r1 * 1000, r4) == r5) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x010a -> B:15:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, int i, tls tlsVar, ContinuationImpl continuationImpl) {
        CronJobScheduler$startCron$1 cronJobScheduler$startCron$1;
        int i2;
        long j;
        tls tlsVar2;
        tls tlsVar3;
        Integer num;
        long intValue;
        tls tlsVar4;
        Integer num2;
        tls tlsVar5;
        vbf vbfVar;
        Object obj;
        int i3 = i;
        MobCronJobType mobCronJobType = aVar.a;
        if (continuationImpl instanceof CronJobScheduler$startCron$1) {
            cronJobScheduler$startCron$1 = (CronJobScheduler$startCron$1) continuationImpl;
            int i4 = cronJobScheduler$startCron$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cronJobScheduler$startCron$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = cronJobScheduler$startCron$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cronJobScheduler$startCron$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        i3 = cronJobScheduler$startCron$1.I$0;
                    } else {
                        if (i2 == 2) {
                            i3 = cronJobScheduler$startCron$1.I$0;
                            vbfVar = (vbf) cronJobScheduler$startCron$1.L$1;
                            tlsVar5 = (tls) cronJobScheduler$startCron$1.L$0;
                            b.b(obj2);
                            obj = ((Result) obj2).getValue();
                            j = 1000;
                            if (obj instanceof Result.Failure) {
                                obj = null;
                            }
                            cronJobScheduler$startCron$1.L$0 = tlsVar5;
                            cronJobScheduler$startCron$1.L$1 = null;
                            cronJobScheduler$startCron$1.I$0 = i3;
                            cronJobScheduler$startCron$1.label = 3;
                            obj2 = vbfVar.a(obj, cronJobScheduler$startCron$1);
                            if (obj2 != obj3) {
                                tlsVar4 = tlsVar5;
                                num2 = (Integer) obj2;
                                if (num2 != null) {
                                }
                            }
                            return obj3;
                        }
                        if (i2 == 3) {
                            i3 = cronJobScheduler$startCron$1.I$0;
                            tlsVar4 = (tls) cronJobScheduler$startCron$1.L$0;
                            b.b(obj2);
                            j = 1000;
                            num2 = (Integer) obj2;
                            if (num2 != null) {
                                mobCronJobType.toString();
                                return zy11Var;
                            }
                            mobCronJobType.toString();
                            jb7 jb7Var = aVar.c;
                            int intValue2 = num2.intValue();
                            cronJobScheduler$startCron$1.L$0 = tlsVar4;
                            cronJobScheduler$startCron$1.L$1 = num2;
                            cronJobScheduler$startCron$1.I$0 = i3;
                            cronJobScheduler$startCron$1.label = 4;
                            if (jb7Var.a(intValue2, cronJobScheduler$startCron$1) != obj3) {
                                tlsVar3 = tlsVar4;
                                num = num2;
                                intValue = num.intValue() * j;
                                cronJobScheduler$startCron$1.L$0 = tlsVar3;
                                cronJobScheduler$startCron$1.L$1 = null;
                                cronJobScheduler$startCron$1.I$0 = i3;
                                cronJobScheduler$startCron$1.label = 5;
                                if (kotlinx.coroutines.a.i(intValue, cronJobScheduler$startCron$1) != obj3) {
                                }
                            }
                            return obj3;
                        }
                        if (i2 == 4) {
                            i3 = cronJobScheduler$startCron$1.I$0;
                            num = (Integer) cronJobScheduler$startCron$1.L$1;
                            tlsVar3 = (tls) cronJobScheduler$startCron$1.L$0;
                            b.b(obj2);
                            j = 1000;
                            intValue = num.intValue() * j;
                            cronJobScheduler$startCron$1.L$0 = tlsVar3;
                            cronJobScheduler$startCron$1.L$1 = null;
                            cronJobScheduler$startCron$1.I$0 = i3;
                            cronJobScheduler$startCron$1.label = 5;
                            if (kotlinx.coroutines.a.i(intValue, cronJobScheduler$startCron$1) != obj3) {
                                tlsVar2 = tlsVar3;
                            }
                            return obj3;
                        }
                        if (i2 != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = cronJobScheduler$startCron$1.I$0;
                    }
                    tls tlsVar6 = (tls) cronJobScheduler$startCron$1.L$0;
                    b.b(obj2);
                    tlsVar2 = tlsVar6;
                    j = 1000;
                } else {
                    b.b(obj2);
                    j = 1000;
                    tlsVar2 = tlsVar;
                    cronJobScheduler$startCron$1.L$0 = tlsVar2;
                    cronJobScheduler$startCron$1.I$0 = i3;
                    cronJobScheduler$startCron$1.label = 1;
                }
                if (kotlinx.coroutines.a.p(cronJobScheduler$startCron$1.get_context())) {
                    return zy11Var;
                }
                vbfVar = aVar.d;
                cronJobScheduler$startCron$1.L$0 = tlsVar2;
                cronJobScheduler$startCron$1.L$1 = vbfVar;
                cronJobScheduler$startCron$1.I$0 = i3;
                cronJobScheduler$startCron$1.label = 2;
                Object d = aVar.d(tlsVar2, cronJobScheduler$startCron$1);
                if (d != obj3) {
                    tlsVar5 = tlsVar2;
                    obj = d;
                    if (obj instanceof Result.Failure) {
                    }
                    cronJobScheduler$startCron$1.L$0 = tlsVar5;
                    cronJobScheduler$startCron$1.L$1 = null;
                    cronJobScheduler$startCron$1.I$0 = i3;
                    cronJobScheduler$startCron$1.label = 3;
                    obj2 = vbfVar.a(obj, cronJobScheduler$startCron$1);
                    if (obj2 != obj3) {
                    }
                }
                return obj3;
            }
        }
        cronJobScheduler$startCron$1 = new CronJobScheduler$startCron$1(aVar, continuationImpl);
        Object obj22 = cronJobScheduler$startCron$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cronJobScheduler$startCron$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 == 0) {
        }
        if (kotlinx.coroutines.a.p(cronJobScheduler$startCron$1.get_context())) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:3|(5:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(3:24|(1:26)|23)|21))|7|(0)(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r11 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        android.util.Log.e("MobCron", r3 + " job evaluating failed: " + r10.getMessage(), r10);
        r11 = new kotlin.Result.Failure(r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yandex.mob.cron.a] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tls tlsVar, ContinuationImpl continuationImpl) {
        CronJobScheduler$evaluateJob$1 cronJobScheduler$evaluateJob$1;
        int i;
        tls tlsVar2;
        int i2;
        Object obj;
        try {
            try {
                if (continuationImpl instanceof CronJobScheduler$evaluateJob$1) {
                    cronJobScheduler$evaluateJob$1 = (CronJobScheduler$evaluateJob$1) continuationImpl;
                    int i3 = cronJobScheduler$evaluateJob$1.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cronJobScheduler$evaluateJob$1.label = i3 - Integer.MIN_VALUE;
                        Object obj2 = cronJobScheduler$evaluateJob$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = cronJobScheduler$evaluateJob$1.label;
                        MobCronJobType mobCronJobType = this.a;
                        if (i != 0) {
                            b.b(obj2);
                            cronJobScheduler$evaluateJob$1.L$0 = tlsVar;
                            kotlinx.coroutines.sync.a aVar = this.h;
                            cronJobScheduler$evaluateJob$1.L$1 = aVar;
                            cronJobScheduler$evaluateJob$1.I$0 = 0;
                            cronJobScheduler$evaluateJob$1.label = 1;
                            if (aVar.a(cronJobScheduler$evaluateJob$1) != coroutineSingletons) {
                                tlsVar2 = tlsVar;
                                i2 = 0;
                                obj = aVar;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050 g050Var = (g050) cronJobScheduler$evaluateJob$1.L$1;
                            b.b(obj2);
                            this = g050Var;
                            mobCronJobType.toString();
                            g050 g050Var2 = this;
                            g050Var2.d(null);
                            return obj2;
                        }
                        int i4 = cronJobScheduler$evaluateJob$1.I$0;
                        Object obj3 = (g050) cronJobScheduler$evaluateJob$1.L$1;
                        tlsVar2 = (tls) cronJobScheduler$evaluateJob$1.L$0;
                        b.b(obj2);
                        i2 = i4;
                        obj = obj3;
                        cronJobScheduler$evaluateJob$1.L$0 = null;
                        cronJobScheduler$evaluateJob$1.L$1 = obj;
                        cronJobScheduler$evaluateJob$1.I$0 = i2;
                        cronJobScheduler$evaluateJob$1.I$1 = 0;
                        cronJobScheduler$evaluateJob$1.label = 2;
                        obj2 = tlsVar2.invoke(cronJobScheduler$evaluateJob$1);
                        this = obj;
                    }
                }
                if (i != 0) {
                }
                cronJobScheduler$evaluateJob$1.L$0 = null;
                cronJobScheduler$evaluateJob$1.L$1 = obj;
                cronJobScheduler$evaluateJob$1.I$0 = i2;
                cronJobScheduler$evaluateJob$1.I$1 = 0;
                cronJobScheduler$evaluateJob$1.label = 2;
                obj2 = tlsVar2.invoke(cronJobScheduler$evaluateJob$1);
                this = obj;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            this.d(null);
            throw th;
        }
        cronJobScheduler$evaluateJob$1 = new CronJobScheduler$evaluateJob$1(this, continuationImpl);
        Object obj22 = cronJobScheduler$evaluateJob$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cronJobScheduler$evaluateJob$1.label;
        MobCronJobType mobCronJobType2 = this.a;
    }

    public final void e(tls tlsVar) {
        pzt0 b = jr20.b(this.e, null, new CronJobScheduler$scheduleJob$1(this, tlsVar, null), 3);
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(MobTrigger mobTrigger, tls tlsVar, ContinuationImpl continuationImpl) {
        CronJobScheduler$triggerJob$1 cronJobScheduler$triggerJob$1;
        Object obj;
        tls tlsVar2;
        Object obj2;
        Object b;
        tls tlsVar3;
        Object obj3;
        long j;
        long j2;
        long j3;
        long j4;
        Long l;
        Long l2;
        vbf vbfVar;
        long j5;
        MobCronJobType mobCronJobType;
        Object obj4;
        jb7 jb7Var;
        long j6;
        long j7;
        long j8;
        tls tlsVar4;
        long j9;
        int i;
        long j10;
        long j11;
        long j12;
        tls tlsVar5;
        long j13;
        tls tlsVar6;
        long j14;
        jb7 jb7Var2;
        Object b2;
        tls tlsVar7;
        Object d;
        Object obj5;
        long j15;
        long j16;
        long j17;
        jb7 jb7Var3;
        Object a;
        Object obj6;
        Object obj7;
        int i2;
        long j18;
        long j19;
        long j20;
        Integer num;
        Object obj8;
        Integer num2;
        tls tlsVar8;
        pzt0 pzt0Var;
        a aVar = this;
        Object obj9 = zy11.a;
        vbf vbfVar2 = aVar.d;
        jb7 jb7Var4 = aVar.c;
        MobCronJobType mobCronJobType2 = aVar.a;
        if (continuationImpl instanceof CronJobScheduler$triggerJob$1) {
            cronJobScheduler$triggerJob$1 = (CronJobScheduler$triggerJob$1) continuationImpl;
            int i3 = cronJobScheduler$triggerJob$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cronJobScheduler$triggerJob$1.label = i3 - Integer.MIN_VALUE;
                Object obj10 = cronJobScheduler$triggerJob$1.result;
                Object obj11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (cronJobScheduler$triggerJob$1.label) {
                    case 0:
                        obj = obj9;
                        b.b(obj10);
                        mobCronJobType2.toString();
                        mobTrigger.toString();
                        cronJobScheduler$triggerJob$1.L$0 = null;
                        tlsVar2 = tlsVar;
                        cronJobScheduler$triggerJob$1.L$1 = tlsVar2;
                        cronJobScheduler$triggerJob$1.label = 1;
                        Object e = ((d) jb7Var4.w).e((MobCronJobType) jb7Var4.b, cronJobScheduler$triggerJob$1);
                        if (e != obj11) {
                            obj2 = e;
                            qn20 qn20Var = (qn20) obj2;
                            long b3 = aVar.b.b();
                            long longValue = (qn20Var != null || (l2 = qn20Var.a) == null) ? 0L : l2.longValue();
                            long longValue2 = (qn20Var != null || (l = qn20Var.b) == null) ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : l.longValue();
                            long j21 = b3 - longValue;
                            cronJobScheduler$triggerJob$1.L$0 = null;
                            cronJobScheduler$triggerJob$1.L$1 = tlsVar2;
                            cronJobScheduler$triggerJob$1.L$2 = null;
                            cronJobScheduler$triggerJob$1.J$0 = b3;
                            cronJobScheduler$triggerJob$1.J$1 = longValue;
                            cronJobScheduler$triggerJob$1.J$2 = longValue2;
                            cronJobScheduler$triggerJob$1.J$3 = j21;
                            cronJobScheduler$triggerJob$1.label = 2;
                            b = vbfVar2.b(cronJobScheduler$triggerJob$1);
                            if (b != obj11) {
                                tlsVar3 = tlsVar2;
                                obj3 = b;
                                j = longValue2;
                                j2 = j21;
                                j3 = b3;
                                j4 = longValue;
                                int intValue = ((Number) obj3).intValue();
                                vbfVar = vbfVar2;
                                long j22 = j - j3;
                                j5 = intValue;
                                if (j2 >= j5) {
                                    long j23 = (j5 - j2) * 1000;
                                    mobCronJobType = mobCronJobType2;
                                    cronJobScheduler$triggerJob$1.L$0 = null;
                                    cronJobScheduler$triggerJob$1.L$1 = tlsVar3;
                                    cronJobScheduler$triggerJob$1.L$2 = null;
                                    cronJobScheduler$triggerJob$1.J$0 = j3;
                                    cronJobScheduler$triggerJob$1.J$1 = j4;
                                    cronJobScheduler$triggerJob$1.J$2 = j;
                                    cronJobScheduler$triggerJob$1.J$3 = j2;
                                    cronJobScheduler$triggerJob$1.I$0 = intValue;
                                    tls tlsVar9 = tlsVar3;
                                    cronJobScheduler$triggerJob$1.J$4 = j22;
                                    cronJobScheduler$triggerJob$1.J$5 = j23;
                                    cronJobScheduler$triggerJob$1.label = 3;
                                    long j24 = j3;
                                    long b4 = ((npt) jb7Var4.c).b();
                                    long j25 = j2;
                                    Object A = ((d) jb7Var4.w).A((MobCronJobType) jb7Var4.b, new qn20(new Long(b4), new Long(b4 + j23)), cronJobScheduler$triggerJob$1);
                                    if (A != obj11) {
                                        A = obj;
                                    }
                                    if (A != obj11) {
                                        j6 = j22;
                                        j11 = j24;
                                        j12 = j23;
                                        tlsVar5 = tlsVar9;
                                        jb7Var = jb7Var4;
                                        j13 = j4;
                                        j9 = j;
                                        i = intValue;
                                        j10 = j25;
                                        mobCronJobType.toString();
                                        cronJobScheduler$triggerJob$1.L$0 = null;
                                        cronJobScheduler$triggerJob$1.L$1 = tlsVar5;
                                        cronJobScheduler$triggerJob$1.L$2 = null;
                                        cronJobScheduler$triggerJob$1.J$0 = j11;
                                        cronJobScheduler$triggerJob$1.J$1 = j13;
                                        cronJobScheduler$triggerJob$1.J$2 = j9;
                                        cronJobScheduler$triggerJob$1.J$3 = j10;
                                        cronJobScheduler$triggerJob$1.I$0 = i;
                                        cronJobScheduler$triggerJob$1.J$4 = j6;
                                        cronJobScheduler$triggerJob$1.J$5 = j12;
                                        cronJobScheduler$triggerJob$1.label = 4;
                                        obj4 = obj11;
                                        if (kotlinx.coroutines.a.i(j12, cronJobScheduler$triggerJob$1) != obj4) {
                                            return obj4;
                                        }
                                        tlsVar6 = tlsVar5;
                                        j14 = j13;
                                        tlsVar4 = tlsVar6;
                                        j8 = j11;
                                        j7 = j14;
                                        cronJobScheduler$triggerJob$1.L$0 = null;
                                        cronJobScheduler$triggerJob$1.L$1 = tlsVar4;
                                        cronJobScheduler$triggerJob$1.L$2 = null;
                                        cronJobScheduler$triggerJob$1.J$0 = j8;
                                        cronJobScheduler$triggerJob$1.J$1 = j7;
                                        cronJobScheduler$triggerJob$1.J$2 = j9;
                                        cronJobScheduler$triggerJob$1.J$3 = j10;
                                        cronJobScheduler$triggerJob$1.I$0 = i;
                                        cronJobScheduler$triggerJob$1.J$4 = j6;
                                        cronJobScheduler$triggerJob$1.label = 5;
                                        jb7Var2 = jb7Var;
                                        tls tlsVar10 = tlsVar4;
                                        b2 = ((d) jb7Var2.w).b((MobCronJobType) jb7Var2.b, cronJobScheduler$triggerJob$1);
                                        if (b2 != obj4) {
                                            b2 = obj;
                                        }
                                        if (b2 == obj4) {
                                            return obj4;
                                        }
                                        tlsVar7 = tlsVar10;
                                        cronJobScheduler$triggerJob$1.L$0 = null;
                                        cronJobScheduler$triggerJob$1.L$1 = tlsVar7;
                                        cronJobScheduler$triggerJob$1.L$2 = null;
                                        cronJobScheduler$triggerJob$1.J$0 = j8;
                                        cronJobScheduler$triggerJob$1.J$1 = j7;
                                        cronJobScheduler$triggerJob$1.J$2 = j9;
                                        cronJobScheduler$triggerJob$1.J$3 = j10;
                                        cronJobScheduler$triggerJob$1.I$0 = i;
                                        cronJobScheduler$triggerJob$1.J$4 = j6;
                                        cronJobScheduler$triggerJob$1.label = 6;
                                        long j26 = j8;
                                        d = d(tlsVar7, cronJobScheduler$triggerJob$1);
                                        if (d != obj4) {
                                            return obj4;
                                        }
                                        obj5 = obj4;
                                        j15 = j9;
                                        j16 = j7;
                                        j17 = j26;
                                        Object obj12 = !(d instanceof Result.Failure) ? null : d;
                                        jb7Var3 = jb7Var2;
                                        cronJobScheduler$triggerJob$1.L$0 = null;
                                        cronJobScheduler$triggerJob$1.L$1 = tlsVar7;
                                        cronJobScheduler$triggerJob$1.L$2 = null;
                                        cronJobScheduler$triggerJob$1.L$3 = d;
                                        cronJobScheduler$triggerJob$1.J$0 = j17;
                                        cronJobScheduler$triggerJob$1.J$1 = j16;
                                        cronJobScheduler$triggerJob$1.J$2 = j15;
                                        cronJobScheduler$triggerJob$1.J$3 = j10;
                                        cronJobScheduler$triggerJob$1.I$0 = i;
                                        cronJobScheduler$triggerJob$1.J$4 = j6;
                                        cronJobScheduler$triggerJob$1.label = 7;
                                        a = vbfVar.a(obj12, cronJobScheduler$triggerJob$1);
                                        obj11 = obj5;
                                        if (a != obj11) {
                                            Object obj13 = d;
                                            obj6 = a;
                                            obj7 = obj13;
                                            long j27 = j6;
                                            i2 = i;
                                            j18 = j16;
                                            j19 = j15;
                                            j20 = j27;
                                            num = (Integer) obj6;
                                            if (num != null) {
                                                mobCronJobType.toString();
                                                return obj7;
                                            }
                                            Object obj14 = obj11;
                                            long j28 = j20;
                                            if (num.intValue() >= j28) {
                                                mobCronJobType.toString();
                                                return obj7;
                                            }
                                            mobCronJobType.toString();
                                            int intValue2 = num.intValue();
                                            cronJobScheduler$triggerJob$1.L$0 = null;
                                            cronJobScheduler$triggerJob$1.L$1 = tlsVar7;
                                            cronJobScheduler$triggerJob$1.L$2 = null;
                                            cronJobScheduler$triggerJob$1.L$3 = obj7;
                                            cronJobScheduler$triggerJob$1.L$4 = num;
                                            cronJobScheduler$triggerJob$1.J$0 = j17;
                                            cronJobScheduler$triggerJob$1.J$1 = j18;
                                            cronJobScheduler$triggerJob$1.J$2 = j19;
                                            cronJobScheduler$triggerJob$1.J$3 = j10;
                                            cronJobScheduler$triggerJob$1.I$0 = i2;
                                            cronJobScheduler$triggerJob$1.J$4 = j28;
                                            cronJobScheduler$triggerJob$1.label = 8;
                                            if (jb7Var3.a(intValue2, cronJobScheduler$triggerJob$1) == obj14) {
                                                return obj14;
                                            }
                                            obj8 = obj7;
                                            num2 = num;
                                            tlsVar8 = tlsVar7;
                                            aVar = this;
                                            pzt0 b5 = jr20.b(aVar.e, null, new CronJobScheduler$triggerJob$2(aVar, num2, tlsVar8, null), 3);
                                            pzt0Var = aVar.g;
                                            if (pzt0Var != null) {
                                                pzt0Var.a(null);
                                            }
                                            aVar.g = b5;
                                            return obj8;
                                        }
                                    }
                                } else {
                                    mobCronJobType = mobCronJobType2;
                                    obj4 = obj11;
                                    long j29 = j2;
                                    jb7Var = jb7Var4;
                                    j6 = j22;
                                    j7 = j4;
                                    j8 = j3;
                                    tlsVar4 = tlsVar3;
                                    j9 = j;
                                    i = intValue;
                                    j10 = j29;
                                    cronJobScheduler$triggerJob$1.L$0 = null;
                                    cronJobScheduler$triggerJob$1.L$1 = tlsVar4;
                                    cronJobScheduler$triggerJob$1.L$2 = null;
                                    cronJobScheduler$triggerJob$1.J$0 = j8;
                                    cronJobScheduler$triggerJob$1.J$1 = j7;
                                    cronJobScheduler$triggerJob$1.J$2 = j9;
                                    cronJobScheduler$triggerJob$1.J$3 = j10;
                                    cronJobScheduler$triggerJob$1.I$0 = i;
                                    cronJobScheduler$triggerJob$1.J$4 = j6;
                                    cronJobScheduler$triggerJob$1.label = 5;
                                    jb7Var2 = jb7Var;
                                    tls tlsVar102 = tlsVar4;
                                    b2 = ((d) jb7Var2.w).b((MobCronJobType) jb7Var2.b, cronJobScheduler$triggerJob$1);
                                    if (b2 != obj4) {
                                    }
                                    if (b2 == obj4) {
                                    }
                                }
                            }
                        }
                        return obj11;
                    case 1:
                        obj2 = obj10;
                        obj = obj9;
                        tlsVar2 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj2);
                        qn20 qn20Var2 = (qn20) obj2;
                        long b32 = aVar.b.b();
                        if (qn20Var2 != null) {
                            break;
                        }
                        long longValue3 = (qn20Var2 != null || (l2 = qn20Var2.a) == null) ? 0L : l2.longValue();
                        if (qn20Var2 != null) {
                            break;
                        }
                        long j212 = b32 - longValue3;
                        cronJobScheduler$triggerJob$1.L$0 = null;
                        cronJobScheduler$triggerJob$1.L$1 = tlsVar2;
                        cronJobScheduler$triggerJob$1.L$2 = null;
                        cronJobScheduler$triggerJob$1.J$0 = b32;
                        cronJobScheduler$triggerJob$1.J$1 = longValue3;
                        cronJobScheduler$triggerJob$1.J$2 = longValue2;
                        cronJobScheduler$triggerJob$1.J$3 = j212;
                        cronJobScheduler$triggerJob$1.label = 2;
                        b = vbfVar2.b(cronJobScheduler$triggerJob$1);
                        if (b != obj11) {
                        }
                        return obj11;
                    case 2:
                        obj = obj9;
                        long j30 = cronJobScheduler$triggerJob$1.J$3;
                        long j31 = cronJobScheduler$triggerJob$1.J$2;
                        long j32 = cronJobScheduler$triggerJob$1.J$1;
                        long j33 = cronJobScheduler$triggerJob$1.J$0;
                        tls tlsVar11 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        tlsVar3 = tlsVar11;
                        j3 = j33;
                        j4 = j32;
                        j = j31;
                        j2 = j30;
                        obj3 = obj10;
                        int intValue3 = ((Number) obj3).intValue();
                        vbfVar = vbfVar2;
                        long j222 = j - j3;
                        j5 = intValue3;
                        if (j2 >= j5) {
                        }
                        break;
                    case 3:
                        obj = obj9;
                        long j34 = cronJobScheduler$triggerJob$1.J$5;
                        j6 = cronJobScheduler$triggerJob$1.J$4;
                        i = cronJobScheduler$triggerJob$1.I$0;
                        j10 = cronJobScheduler$triggerJob$1.J$3;
                        j9 = cronJobScheduler$triggerJob$1.J$2;
                        long j35 = cronJobScheduler$triggerJob$1.J$1;
                        long j36 = cronJobScheduler$triggerJob$1.J$0;
                        tlsVar5 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        j13 = j35;
                        vbfVar = vbfVar2;
                        mobCronJobType = mobCronJobType2;
                        j12 = j34;
                        jb7Var = jb7Var4;
                        j11 = j36;
                        mobCronJobType.toString();
                        cronJobScheduler$triggerJob$1.L$0 = null;
                        cronJobScheduler$triggerJob$1.L$1 = tlsVar5;
                        cronJobScheduler$triggerJob$1.L$2 = null;
                        cronJobScheduler$triggerJob$1.J$0 = j11;
                        cronJobScheduler$triggerJob$1.J$1 = j13;
                        cronJobScheduler$triggerJob$1.J$2 = j9;
                        cronJobScheduler$triggerJob$1.J$3 = j10;
                        cronJobScheduler$triggerJob$1.I$0 = i;
                        cronJobScheduler$triggerJob$1.J$4 = j6;
                        cronJobScheduler$triggerJob$1.J$5 = j12;
                        cronJobScheduler$triggerJob$1.label = 4;
                        obj4 = obj11;
                        if (kotlinx.coroutines.a.i(j12, cronJobScheduler$triggerJob$1) != obj4) {
                        }
                        break;
                    case 4:
                        j6 = cronJobScheduler$triggerJob$1.J$4;
                        int i4 = cronJobScheduler$triggerJob$1.I$0;
                        long j37 = cronJobScheduler$triggerJob$1.J$3;
                        long j38 = cronJobScheduler$triggerJob$1.J$2;
                        long j39 = cronJobScheduler$triggerJob$1.J$1;
                        obj = obj9;
                        long j40 = cronJobScheduler$triggerJob$1.J$0;
                        tlsVar6 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        jb7Var = jb7Var4;
                        mobCronJobType = mobCronJobType2;
                        j14 = j39;
                        j11 = j40;
                        j9 = j38;
                        j10 = j37;
                        i = i4;
                        vbfVar = vbfVar2;
                        obj4 = obj11;
                        tlsVar4 = tlsVar6;
                        j8 = j11;
                        j7 = j14;
                        cronJobScheduler$triggerJob$1.L$0 = null;
                        cronJobScheduler$triggerJob$1.L$1 = tlsVar4;
                        cronJobScheduler$triggerJob$1.L$2 = null;
                        cronJobScheduler$triggerJob$1.J$0 = j8;
                        cronJobScheduler$triggerJob$1.J$1 = j7;
                        cronJobScheduler$triggerJob$1.J$2 = j9;
                        cronJobScheduler$triggerJob$1.J$3 = j10;
                        cronJobScheduler$triggerJob$1.I$0 = i;
                        cronJobScheduler$triggerJob$1.J$4 = j6;
                        cronJobScheduler$triggerJob$1.label = 5;
                        jb7Var2 = jb7Var;
                        tls tlsVar1022 = tlsVar4;
                        b2 = ((d) jb7Var2.w).b((MobCronJobType) jb7Var2.b, cronJobScheduler$triggerJob$1);
                        if (b2 != obj4) {
                        }
                        if (b2 == obj4) {
                        }
                        break;
                    case 5:
                        long j41 = cronJobScheduler$triggerJob$1.J$4;
                        int i5 = cronJobScheduler$triggerJob$1.I$0;
                        long j42 = cronJobScheduler$triggerJob$1.J$3;
                        long j43 = cronJobScheduler$triggerJob$1.J$2;
                        long j44 = cronJobScheduler$triggerJob$1.J$1;
                        long j45 = cronJobScheduler$triggerJob$1.J$0;
                        tlsVar7 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        j8 = j45;
                        mobCronJobType = mobCronJobType2;
                        vbfVar = vbfVar2;
                        obj4 = obj11;
                        jb7Var2 = jb7Var4;
                        j7 = j44;
                        j9 = j43;
                        j10 = j42;
                        i = i5;
                        j6 = j41;
                        cronJobScheduler$triggerJob$1.L$0 = null;
                        cronJobScheduler$triggerJob$1.L$1 = tlsVar7;
                        cronJobScheduler$triggerJob$1.L$2 = null;
                        cronJobScheduler$triggerJob$1.J$0 = j8;
                        cronJobScheduler$triggerJob$1.J$1 = j7;
                        cronJobScheduler$triggerJob$1.J$2 = j9;
                        cronJobScheduler$triggerJob$1.J$3 = j10;
                        cronJobScheduler$triggerJob$1.I$0 = i;
                        cronJobScheduler$triggerJob$1.J$4 = j6;
                        cronJobScheduler$triggerJob$1.label = 6;
                        long j262 = j8;
                        d = d(tlsVar7, cronJobScheduler$triggerJob$1);
                        if (d != obj4) {
                        }
                        break;
                    case 6:
                        long j46 = cronJobScheduler$triggerJob$1.J$4;
                        int i6 = cronJobScheduler$triggerJob$1.I$0;
                        long j47 = cronJobScheduler$triggerJob$1.J$3;
                        long j48 = cronJobScheduler$triggerJob$1.J$2;
                        j16 = cronJobScheduler$triggerJob$1.J$1;
                        long j49 = cronJobScheduler$triggerJob$1.J$0;
                        tlsVar7 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        d = ((Result) obj10).getValue();
                        vbfVar = vbfVar2;
                        j15 = j48;
                        j10 = j47;
                        i = i6;
                        j6 = j46;
                        mobCronJobType = mobCronJobType2;
                        obj5 = obj11;
                        jb7Var2 = jb7Var4;
                        j17 = j49;
                        if (!(d instanceof Result.Failure)) {
                        }
                        jb7Var3 = jb7Var2;
                        cronJobScheduler$triggerJob$1.L$0 = null;
                        cronJobScheduler$triggerJob$1.L$1 = tlsVar7;
                        cronJobScheduler$triggerJob$1.L$2 = null;
                        cronJobScheduler$triggerJob$1.L$3 = d;
                        cronJobScheduler$triggerJob$1.J$0 = j17;
                        cronJobScheduler$triggerJob$1.J$1 = j16;
                        cronJobScheduler$triggerJob$1.J$2 = j15;
                        cronJobScheduler$triggerJob$1.J$3 = j10;
                        cronJobScheduler$triggerJob$1.I$0 = i;
                        cronJobScheduler$triggerJob$1.J$4 = j6;
                        cronJobScheduler$triggerJob$1.label = 7;
                        a = vbfVar.a(obj12, cronJobScheduler$triggerJob$1);
                        obj11 = obj5;
                        if (a != obj11) {
                        }
                        return obj11;
                    case 7:
                        long j50 = cronJobScheduler$triggerJob$1.J$4;
                        i2 = cronJobScheduler$triggerJob$1.I$0;
                        j10 = cronJobScheduler$triggerJob$1.J$3;
                        j19 = cronJobScheduler$triggerJob$1.J$2;
                        j18 = cronJobScheduler$triggerJob$1.J$1;
                        long j51 = cronJobScheduler$triggerJob$1.J$0;
                        Object obj15 = cronJobScheduler$triggerJob$1.L$3;
                        tlsVar7 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        obj7 = obj15;
                        mobCronJobType = mobCronJobType2;
                        obj6 = obj10;
                        j20 = j50;
                        jb7Var3 = jb7Var4;
                        j17 = j51;
                        num = (Integer) obj6;
                        if (num != null) {
                        }
                        break;
                    case 8:
                        num2 = (Integer) cronJobScheduler$triggerJob$1.L$4;
                        obj8 = cronJobScheduler$triggerJob$1.L$3;
                        tlsVar8 = (tls) cronJobScheduler$triggerJob$1.L$1;
                        b.b(obj10);
                        pzt0 b52 = jr20.b(aVar.e, null, new CronJobScheduler$triggerJob$2(aVar, num2, tlsVar8, null), 3);
                        pzt0Var = aVar.g;
                        if (pzt0Var != null) {
                        }
                        aVar.g = b52;
                        return obj8;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        cronJobScheduler$triggerJob$1 = new CronJobScheduler$triggerJob$1(aVar, continuationImpl);
        Object obj102 = cronJobScheduler$triggerJob$1.result;
        Object obj112 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (cronJobScheduler$triggerJob$1.label) {
        }
    }
}
