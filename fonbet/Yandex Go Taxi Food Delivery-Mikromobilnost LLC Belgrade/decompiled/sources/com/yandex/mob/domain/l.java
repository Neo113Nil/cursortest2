package com.yandex.mob.domain;

import com.yandex.mob.api.model.MobEnvironment;
import defpackage.ny61;
import defpackage.tm20;
import defpackage.yn20;
import defpackage.zk20;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class l {
    public final com.yandex.mob.datastore.c a;
    public final yn20 b;

    public l(MobEnvironment mobEnvironment, com.yandex.mob.datastore.c cVar, yn20 yn20Var) {
        this.a = cVar;
        this.b = yn20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$additionalHostsForDetailedReport$1 mobCacheConfigurationProvider$additionalHostsForDetailedReport$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$additionalHostsForDetailedReport$1) {
            mobCacheConfigurationProvider$additionalHostsForDetailedReport$1 = (MobCacheConfigurationProvider$additionalHostsForDetailedReport$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$additionalHostsForDetailedReport$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                List list = ((tm20) obj).b.l;
                return list != null ? EmptyList.a : list;
            }
        }
        mobCacheConfigurationProvider$additionalHostsForDetailedReport$1 = new MobCacheConfigurationProvider$additionalHostsForDetailedReport$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$additionalHostsForDetailedReport$1.label;
        if (i != 0) {
        }
        List list2 = ((tm20) obj3).b.l;
        if (list2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1 mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1) {
            mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1 = (MobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.f;
                return new Integer(num == null ? num.intValue() : 300);
            }
        }
        mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1 = new MobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$availabilityCheckPeriodSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.f;
        return new Integer(num2 == null ? num2.intValue() : 300);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1 mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1) {
            mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1 = (MobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.g;
                return new Integer(num == null ? num.intValue() : 864000);
            }
        }
        mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1 = new MobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$availabilityFullCheckPeriodSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.g;
        return new Integer(num2 == null ? num2.intValue() : 864000);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$config$1 mobCacheConfigurationProvider$config$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$config$1) {
            mobCacheConfigurationProvider$config$1 = (MobCacheConfigurationProvider$config$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$config$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$config$1.label = 1;
                    obj = this.a.a(mobCacheConfigurationProvider$config$1);
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
                tm20 tm20Var = (tm20) obj;
                return tm20Var != null ? this.b.a() : tm20Var;
            }
        }
        mobCacheConfigurationProvider$config$1 = new MobCacheConfigurationProvider$config$1(this, continuationImpl);
        Object obj2 = mobCacheConfigurationProvider$config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$config$1.label;
        if (i != 0) {
        }
        tm20 tm20Var2 = (tm20) obj2;
        if (tm20Var2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$configId$1 mobCacheConfigurationProvider$configId$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$configId$1) {
            mobCacheConfigurationProvider$configId$1 = (MobCacheConfigurationProvider$configId$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$configId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$configId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$configId$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$configId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$configId$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$configId$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((tm20) obj).a;
            }
        }
        mobCacheConfigurationProvider$configId$1 = new MobCacheConfigurationProvider$configId$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$configId$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$configId$1.label;
        if (i != 0) {
        }
        return ((tm20) obj3).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$currentContourTtlSeconds$1 mobCacheConfigurationProvider$currentContourTtlSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$currentContourTtlSeconds$1) {
            mobCacheConfigurationProvider$currentContourTtlSeconds$1 = (MobCacheConfigurationProvider$currentContourTtlSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$currentContourTtlSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$currentContourTtlSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$currentContourTtlSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$currentContourTtlSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$currentContourTtlSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$currentContourTtlSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.j;
                return new Integer(num == null ? num.intValue() : 86400);
            }
        }
        mobCacheConfigurationProvider$currentContourTtlSeconds$1 = new MobCacheConfigurationProvider$currentContourTtlSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$currentContourTtlSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$currentContourTtlSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.j;
        return new Integer(num2 == null ? num2.intValue() : 86400);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$detailedReportIntervalSeconds$1 mobCacheConfigurationProvider$detailedReportIntervalSeconds$1;
        int i;
        tm20 tm20Var;
        zk20 zk20Var;
        if (continuationImpl instanceof MobCacheConfigurationProvider$detailedReportIntervalSeconds$1) {
            mobCacheConfigurationProvider$detailedReportIntervalSeconds$1 = (MobCacheConfigurationProvider$detailedReportIntervalSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.label = 1;
                    obj = this.a.a(mobCacheConfigurationProvider$detailedReportIntervalSeconds$1);
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
                tm20Var = (tm20) obj;
                if (tm20Var != null || (zk20Var = tm20Var.b) == null) {
                    return null;
                }
                return zk20Var.n;
            }
        }
        mobCacheConfigurationProvider$detailedReportIntervalSeconds$1 = new MobCacheConfigurationProvider$detailedReportIntervalSeconds$1(this, continuationImpl);
        Object obj2 = mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$detailedReportIntervalSeconds$1.label;
        if (i != 0) {
        }
        tm20Var = (tm20) obj2;
        if (tm20Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1 mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1) {
            mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1 = (MobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Boolean bool = ((tm20) obj).b.q;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1 = new MobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$networkTypeNotificationsReloadEnabled$1.label;
        if (i != 0) {
        }
        Boolean bool2 = ((tm20) obj3).b.q;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$notificationsCacheLimit$1 mobCacheConfigurationProvider$notificationsCacheLimit$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$notificationsCacheLimit$1) {
            mobCacheConfigurationProvider$notificationsCacheLimit$1 = (MobCacheConfigurationProvider$notificationsCacheLimit$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$notificationsCacheLimit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$notificationsCacheLimit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$notificationsCacheLimit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$notificationsCacheLimit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$notificationsCacheLimit$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$notificationsCacheLimit$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.b;
                return new Integer(num == null ? num.intValue() : 20);
            }
        }
        mobCacheConfigurationProvider$notificationsCacheLimit$1 = new MobCacheConfigurationProvider$notificationsCacheLimit$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$notificationsCacheLimit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$notificationsCacheLimit$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.b;
        return new Integer(num2 == null ? num2.intValue() : 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$notificationsTtlSeconds$1 mobCacheConfigurationProvider$notificationsTtlSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$notificationsTtlSeconds$1) {
            mobCacheConfigurationProvider$notificationsTtlSeconds$1 = (MobCacheConfigurationProvider$notificationsTtlSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$notificationsTtlSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$notificationsTtlSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$notificationsTtlSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$notificationsTtlSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$notificationsTtlSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$notificationsTtlSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.c;
                return new Integer(num == null ? num.intValue() : 600);
            }
        }
        mobCacheConfigurationProvider$notificationsTtlSeconds$1 = new MobCacheConfigurationProvider$notificationsTtlSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$notificationsTtlSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$notificationsTtlSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.c;
        return new Integer(num2 == null ? num2.intValue() : 600);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1 mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1) {
            mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1 = (MobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.e;
                return new Integer(num == null ? num.intValue() : 600);
            }
        }
        mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1 = new MobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$pauseBeforeNextConfigUpdateAttemptSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.e;
        return new Integer(num2 == null ? num2.intValue() : 600);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$pingTimeoutSeconds$1 mobCacheConfigurationProvider$pingTimeoutSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$pingTimeoutSeconds$1) {
            mobCacheConfigurationProvider$pingTimeoutSeconds$1 = (MobCacheConfigurationProvider$pingTimeoutSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$pingTimeoutSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$pingTimeoutSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$pingTimeoutSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$pingTimeoutSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$pingTimeoutSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$pingTimeoutSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.o;
                return new Integer(num == null ? num.intValue() : 10);
            }
        }
        mobCacheConfigurationProvider$pingTimeoutSeconds$1 = new MobCacheConfigurationProvider$pingTimeoutSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$pingTimeoutSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$pingTimeoutSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.o;
        return new Integer(num2 == null ? num2.intValue() : 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$proxyList$1 mobCacheConfigurationProvider$proxyList$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$proxyList$1) {
            mobCacheConfigurationProvider$proxyList$1 = (MobCacheConfigurationProvider$proxyList$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$proxyList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$proxyList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$proxyList$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$proxyList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$proxyList$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$proxyList$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((tm20) obj).c;
            }
        }
        mobCacheConfigurationProvider$proxyList$1 = new MobCacheConfigurationProvider$proxyList$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$proxyList$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$proxyList$1.label;
        if (i != 0) {
        }
        return ((tm20) obj3).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$updateConfigPeriodSeconds$1 mobCacheConfigurationProvider$updateConfigPeriodSeconds$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$updateConfigPeriodSeconds$1) {
            mobCacheConfigurationProvider$updateConfigPeriodSeconds$1 = (MobCacheConfigurationProvider$updateConfigPeriodSeconds$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$updateConfigPeriodSeconds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = ((tm20) obj).b.d;
                return new Integer(num == null ? num.intValue() : 864000);
            }
        }
        mobCacheConfigurationProvider$updateConfigPeriodSeconds$1 = new MobCacheConfigurationProvider$updateConfigPeriodSeconds$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$updateConfigPeriodSeconds$1.label;
        if (i != 0) {
        }
        Integer num2 = ((tm20) obj3).b.d;
        return new Integer(num2 == null ? num2.intValue() : 864000);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(ContinuationImpl continuationImpl) {
        MobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1 mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1;
        int i;
        if (continuationImpl instanceof MobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1) {
            mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1 = (MobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1) continuationImpl;
            int i2 = mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.label = 1;
                    obj = d(mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Boolean bool = ((tm20) obj).b.p;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1 = new MobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1(this, continuationImpl);
        Object obj3 = mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobCacheConfigurationProvider$vpnNotificationsReloadEnabled$1.label;
        if (i != 0) {
        }
        Boolean bool2 = ((tm20) obj3).b.p;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }
}
