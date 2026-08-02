package com.yandex.mob.datastore;

import com.yandex.mob.metrics.NetworkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1;
import com.yandex.mob.metrics.VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1;
import com.yandex.mob.model.MobCronJobType;
import defpackage.cs20;
import defpackage.dp20;
import defpackage.em20;
import defpackage.kp20;
import defpackage.ny61;
import defpackage.qn20;
import defpackage.tn20;
import defpackage.tpg;
import defpackage.xr20;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class d {
    public final tpg a;

    public d(tpg tpgVar) {
        this.a = tpgVar;
    }

    public final Object A(MobCronJobType mobCronJobType, qn20 qn20Var, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveTriggerJobState$2(mobCronJobType, qn20Var, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object B(cs20 cs20Var, VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1 vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveVpnState$2(cs20Var, null), vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(MobCronJobType mobCronJobType, ContinuationImpl continuationImpl) {
        TypedMobDataStorage$triggerJobState$1 typedMobDataStorage$triggerJobState$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$triggerJobState$1) {
            typedMobDataStorage$triggerJobState$1 = (TypedMobDataStorage$triggerJobState$1) continuationImpl;
            int i2 = typedMobDataStorage$triggerJobState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$triggerJobState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$triggerJobState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$triggerJobState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$triggerJobState$1.L$0 = mobCronJobType;
                    typedMobDataStorage$triggerJobState$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$triggerJobState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mobCronJobType = (MobCronJobType) typedMobDataStorage$triggerJobState$1.L$0;
                    kotlin.b.b(obj);
                }
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return (qn20) xr20Var.m.get(mobCronJobType);
                }
                return null;
            }
        }
        typedMobDataStorage$triggerJobState$1 = new TypedMobDataStorage$triggerJobState$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$triggerJobState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$triggerJobState$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$availabilityReportState$1 typedMobDataStorage$availabilityReportState$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$availabilityReportState$1) {
            typedMobDataStorage$availabilityReportState$1 = (TypedMobDataStorage$availabilityReportState$1) continuationImpl;
            int i2 = typedMobDataStorage$availabilityReportState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$availabilityReportState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$availabilityReportState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$availabilityReportState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$availabilityReportState$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$availabilityReportState$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.i;
                }
                return null;
            }
        }
        typedMobDataStorage$availabilityReportState$1 = new TypedMobDataStorage$availabilityReportState$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$availabilityReportState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$availabilityReportState$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    public final Object b(MobCronJobType mobCronJobType, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$clearTriggerJobState$2(mobCronJobType, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$completedConfigMigrationTags$1 typedMobDataStorage$completedConfigMigrationTags$1;
        int i;
        if (continuationImpl instanceof TypedMobDataStorage$completedConfigMigrationTags$1) {
            typedMobDataStorage$completedConfigMigrationTags$1 = (TypedMobDataStorage$completedConfigMigrationTags$1) continuationImpl;
            int i2 = typedMobDataStorage$completedConfigMigrationTags$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$completedConfigMigrationTags$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$completedConfigMigrationTags$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$completedConfigMigrationTags$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$completedConfigMigrationTags$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$completedConfigMigrationTags$1);
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
                xr20 xr20Var = (xr20) obj;
                Set set = xr20Var != null ? xr20Var.n : null;
                return set != null ? EmptySet.a : set;
            }
        }
        typedMobDataStorage$completedConfigMigrationTags$1 = new TypedMobDataStorage$completedConfigMigrationTags$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$completedConfigMigrationTags$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$completedConfigMigrationTags$1.label;
        if (i != 0) {
        }
        xr20 xr20Var2 = (xr20) obj2;
        if (xr20Var2 != null) {
        }
        if (set != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$countryIso$1 typedMobDataStorage$countryIso$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$countryIso$1) {
            typedMobDataStorage$countryIso$1 = (TypedMobDataStorage$countryIso$1) continuationImpl;
            int i2 = typedMobDataStorage$countryIso$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$countryIso$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$countryIso$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$countryIso$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$countryIso$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$countryIso$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.b;
                }
                return null;
            }
        }
        typedMobDataStorage$countryIso$1 = new TypedMobDataStorage$countryIso$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$countryIso$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$countryIso$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(MobCronJobType mobCronJobType, ContinuationImpl continuationImpl) {
        TypedMobDataStorage$cronJobState$1 typedMobDataStorage$cronJobState$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$cronJobState$1) {
            typedMobDataStorage$cronJobState$1 = (TypedMobDataStorage$cronJobState$1) continuationImpl;
            int i2 = typedMobDataStorage$cronJobState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$cronJobState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$cronJobState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$cronJobState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$cronJobState$1.L$0 = mobCronJobType;
                    typedMobDataStorage$cronJobState$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$cronJobState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mobCronJobType = (MobCronJobType) typedMobDataStorage$cronJobState$1.L$0;
                    kotlin.b.b(obj);
                }
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return (qn20) xr20Var.l.get(mobCronJobType);
                }
                return null;
            }
        }
        typedMobDataStorage$cronJobState$1 = new TypedMobDataStorage$cronJobState$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$cronJobState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$cronJobState$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$currentContourState$1 typedMobDataStorage$currentContourState$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$currentContourState$1) {
            typedMobDataStorage$currentContourState$1 = (TypedMobDataStorage$currentContourState$1) continuationImpl;
            int i2 = typedMobDataStorage$currentContourState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$currentContourState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$currentContourState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$currentContourState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$currentContourState$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$currentContourState$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.c;
                }
                return null;
            }
        }
        typedMobDataStorage$currentContourState$1 = new TypedMobDataStorage$currentContourState$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$currentContourState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$currentContourState$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$hostsForDetailReport$1 typedMobDataStorage$hostsForDetailReport$1;
        int i;
        xr20 xr20Var;
        List list;
        if (continuationImpl instanceof TypedMobDataStorage$hostsForDetailReport$1) {
            typedMobDataStorage$hostsForDetailReport$1 = (TypedMobDataStorage$hostsForDetailReport$1) continuationImpl;
            int i2 = typedMobDataStorage$hostsForDetailReport$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$hostsForDetailReport$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$hostsForDetailReport$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$hostsForDetailReport$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$hostsForDetailReport$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$hostsForDetailReport$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null && (list = xr20Var.h) != null) {
                    List list2 = list;
                    return list2.isEmpty() ? null : list2;
                }
            }
        }
        typedMobDataStorage$hostsForDetailReport$1 = new TypedMobDataStorage$hostsForDetailReport$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$hostsForDetailReport$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$hostsForDetailReport$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        return xr20Var == null ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$ipToGeoCountryIso$1 typedMobDataStorage$ipToGeoCountryIso$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$ipToGeoCountryIso$1) {
            typedMobDataStorage$ipToGeoCountryIso$1 = (TypedMobDataStorage$ipToGeoCountryIso$1) continuationImpl;
            int i2 = typedMobDataStorage$ipToGeoCountryIso$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$ipToGeoCountryIso$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$ipToGeoCountryIso$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$ipToGeoCountryIso$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$ipToGeoCountryIso$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$ipToGeoCountryIso$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.d;
                }
                return null;
            }
        }
        typedMobDataStorage$ipToGeoCountryIso$1 = new TypedMobDataStorage$ipToGeoCountryIso$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$ipToGeoCountryIso$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$ipToGeoCountryIso$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$lastNetworkTypeChanged$1 typedMobDataStorage$lastNetworkTypeChanged$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$lastNetworkTypeChanged$1) {
            typedMobDataStorage$lastNetworkTypeChanged$1 = (TypedMobDataStorage$lastNetworkTypeChanged$1) continuationImpl;
            int i2 = typedMobDataStorage$lastNetworkTypeChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$lastNetworkTypeChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$lastNetworkTypeChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$lastNetworkTypeChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$lastNetworkTypeChanged$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$lastNetworkTypeChanged$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.k;
                }
                return null;
            }
        }
        typedMobDataStorage$lastNetworkTypeChanged$1 = new TypedMobDataStorage$lastNetworkTypeChanged$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$lastNetworkTypeChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$lastNetworkTypeChanged$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$lastVpnStateChanged$1 typedMobDataStorage$lastVpnStateChanged$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$lastVpnStateChanged$1) {
            typedMobDataStorage$lastVpnStateChanged$1 = (TypedMobDataStorage$lastVpnStateChanged$1) continuationImpl;
            int i2 = typedMobDataStorage$lastVpnStateChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$lastVpnStateChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$lastVpnStateChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$lastVpnStateChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$lastVpnStateChanged$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$lastVpnStateChanged$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.j;
                }
                return null;
            }
        }
        typedMobDataStorage$lastVpnStateChanged$1 = new TypedMobDataStorage$lastVpnStateChanged$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$lastVpnStateChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$lastVpnStateChanged$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$metricaData$1 typedMobDataStorage$metricaData$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$metricaData$1) {
            typedMobDataStorage$metricaData$1 = (TypedMobDataStorage$metricaData$1) continuationImpl;
            int i2 = typedMobDataStorage$metricaData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$metricaData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$metricaData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$metricaData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$metricaData$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$metricaData$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.f;
                }
                return null;
            }
        }
        typedMobDataStorage$metricaData$1 = new TypedMobDataStorage$metricaData$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$metricaData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$metricaData$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$mobId$1 typedMobDataStorage$mobId$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$mobId$1) {
            typedMobDataStorage$mobId$1 = (TypedMobDataStorage$mobId$1) continuationImpl;
            int i2 = typedMobDataStorage$mobId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$mobId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$mobId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$mobId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$mobId$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$mobId$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.a;
                }
                return null;
            }
        }
        typedMobDataStorage$mobId$1 = new TypedMobDataStorage$mobId$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$mobId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$mobId$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$notifications$1 typedMobDataStorage$notifications$1;
        int i;
        xr20 xr20Var;
        List list;
        if (continuationImpl instanceof TypedMobDataStorage$notifications$1) {
            typedMobDataStorage$notifications$1 = (TypedMobDataStorage$notifications$1) continuationImpl;
            int i2 = typedMobDataStorage$notifications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$notifications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$notifications$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$notifications$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$notifications$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$notifications$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null && (list = xr20Var.g) != null) {
                    List list2 = list;
                    return list2.isEmpty() ? null : list2;
                }
            }
        }
        typedMobDataStorage$notifications$1 = new TypedMobDataStorage$notifications$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$notifications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$notifications$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        return xr20Var == null ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        TypedMobDataStorage$notificationsPollingInterval$1 typedMobDataStorage$notificationsPollingInterval$1;
        int i;
        xr20 xr20Var;
        if (continuationImpl instanceof TypedMobDataStorage$notificationsPollingInterval$1) {
            typedMobDataStorage$notificationsPollingInterval$1 = (TypedMobDataStorage$notificationsPollingInterval$1) continuationImpl;
            int i2 = typedMobDataStorage$notificationsPollingInterval$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedMobDataStorage$notificationsPollingInterval$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedMobDataStorage$notificationsPollingInterval$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedMobDataStorage$notificationsPollingInterval$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    typedMobDataStorage$notificationsPollingInterval$1.label = 1;
                    obj = a.a(this.a, typedMobDataStorage$notificationsPollingInterval$1);
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
                xr20Var = (xr20) obj;
                if (xr20Var == null) {
                    return xr20Var.e;
                }
                return null;
            }
        }
        typedMobDataStorage$notificationsPollingInterval$1 = new TypedMobDataStorage$notificationsPollingInterval$1(this, continuationImpl);
        Object obj2 = typedMobDataStorage$notificationsPollingInterval$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedMobDataStorage$notificationsPollingInterval$1.label;
        if (i != 0) {
        }
        xr20Var = (xr20) obj2;
        if (xr20Var == null) {
        }
    }

    public final Object o(em20 em20Var, ContinuationImpl continuationImpl) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveAvailabilityReportState$2(em20Var, null), continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object p(LinkedHashSet linkedHashSet, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveCompletedConfigMigrationTags$2(linkedHashSet, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object q(String str, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveCountryIso$2(str, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object r(MobCronJobType mobCronJobType, qn20 qn20Var, ContinuationImpl continuationImpl) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveCronJobState$2(mobCronJobType, qn20Var, null), continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object s(tn20 tn20Var, SuspendLambda suspendLambda) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveCurrentContourState$2(tn20Var, null), suspendLambda);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object t(List list, ContinuationImpl continuationImpl) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveHostsForDetailReport$2(list, null), continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object u(String str, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveIpToGeoCountryIso$2(str, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object v(dp20 dp20Var, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveMetricaData$2(dp20Var, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object w(String str, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveMobId$2(str, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object x(kp20 kp20Var, NetworkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1 networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveNetworkTypeState$2(kp20Var, null), networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object y(ArrayList arrayList, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveNotifications$2(arrayList, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    public final Object z(int i, Continuation continuation) {
        Object c = a.c(this.a, new TypedMobDataStorage$saveNotificationsPollingInterval$2(i, null), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }
}
