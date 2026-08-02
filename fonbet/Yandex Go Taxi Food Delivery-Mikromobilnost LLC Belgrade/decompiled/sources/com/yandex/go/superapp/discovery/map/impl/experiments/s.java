package com.yandex.go.superapp.discovery.map.impl.experiments;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.ImageDto;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.gtv0;
import defpackage.i3y;
import defpackage.itv0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.p4w0;
import defpackage.q4w0;
import defpackage.rqo;
import defpackage.scc;
import defpackage.t1b0;
import defpackage.vib1;
import defpackage.w511;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class s {
    public final rqo a;
    public final k7x0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new ogu0(18, this));

    public s(rqo rqoVar, k7x0 k7x0Var) {
        this.a = rqoVar;
        this.b = k7x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0032  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapExperimentRepository$getCategoryFilters$1 superAppDiscoveryMapExperimentRepository$getCategoryFilters$1;
        int i;
        SuperAppDiscoveryMapExperiment.ScreenOptions screenOptions;
        ArrayList arrayList;
        List list;
        boolean z;
        Object gtv0Var;
        Throwable th;
        SuperAppOpenServiceActionType superAppOpenServiceActionType;
        vib1 q4w0Var;
        s sVar = this;
        if (continuationImpl instanceof SuperAppDiscoveryMapExperimentRepository$getCategoryFilters$1) {
            superAppDiscoveryMapExperimentRepository$getCategoryFilters$1 = (SuperAppDiscoveryMapExperimentRepository$getCategoryFilters$1) continuationImpl;
            int i2 = superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.label;
                Throwable th2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 b = sVar.b();
                    superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.label = 1;
                    obj = b.b(superAppDiscoveryMapExperimentRepository$getCategoryFilters$1);
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
                SuperAppDiscoveryMapExperiment superAppDiscoveryMapExperiment = (SuperAppDiscoveryMapExperiment) obj;
                screenOptions = superAppDiscoveryMapExperiment.h;
                if (screenOptions != null || (list = screenOptions.d) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (Object obj2 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            Throwable th3 = th2;
                            scc.m();
                            throw th3;
                        }
                        SuperAppDiscoveryMapExperiment.CategoryFilter categoryFilter = (SuperAppDiscoveryMapExperiment.CategoryFilter) obj2;
                        Map map = superAppDiscoveryMapExperiment.b;
                        f fVar = categoryFilter.e;
                        SuperAppDiscoveryMapExperiment.CategoryFilterType categoryFilterType = categoryFilter.f;
                        String str = categoryFilter.c;
                        if ((fVar instanceof e) || (((z = fVar instanceof SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction)) && evu0.J(((SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction) fVar).c))) {
                            th = th2;
                        } else {
                            Object randomUUID = str == null ? UUID.randomUUID() : str;
                            th = th2;
                            String str2 = randomUUID + "_" + categoryFilterType.name() + "_" + i3;
                            ImageDto imageDto = categoryFilter.a;
                            ?? r5 = imageDto != null ? imageDto.b : th;
                            k7x0 k7x0Var = sVar.b;
                            String a = (r5 == 0 || evu0.J(r5)) ? "" : ((m7x0) k7x0Var).a(imageDto.b);
                            ImageDto imageDto2 = categoryFilter.b;
                            ?? r0 = imageDto2 != null ? imageDto2.b : th;
                            String a2 = (r0 == 0 || evu0.J(r0)) ? "" : ((m7x0) k7x0Var).a(imageDto2.b);
                            String str3 = (String) map.get(str);
                            String str4 = str3 == null ? "" : str3;
                            String str5 = categoryFilter.d;
                            String str6 = str5 == null ? "" : str5;
                            if (z) {
                                SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction = (SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction) fVar;
                                String str7 = (String) map.get(superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.a);
                                if (str7 == null) {
                                    str7 = "";
                                }
                                q4w0Var = new p4w0(str7, superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.b, superAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.c);
                            } else {
                                if (!(fVar instanceof d)) {
                                    w511.b();
                                    return th;
                                }
                                switch (r.a[categoryFilterType.ordinal()]) {
                                    case 1:
                                        superAppOpenServiceActionType = SuperAppOpenServiceActionType.SCOOTERS;
                                        q4w0Var = new q4w0(superAppOpenServiceActionType);
                                        break;
                                    case 2:
                                        superAppOpenServiceActionType = SuperAppOpenServiceActionType.TRANSPORT;
                                        q4w0Var = new q4w0(superAppOpenServiceActionType);
                                        break;
                                    case 3:
                                        superAppOpenServiceActionType = SuperAppOpenServiceActionType.FAVORITES;
                                        q4w0Var = new q4w0(superAppOpenServiceActionType);
                                        break;
                                    case 4:
                                        superAppOpenServiceActionType = SuperAppOpenServiceActionType.CHARGERS;
                                        q4w0Var = new q4w0(superAppOpenServiceActionType);
                                        break;
                                    case 5:
                                    case 6:
                                        break;
                                    default:
                                        w511.b();
                                        return th;
                                }
                            }
                            gtv0Var = new gtv0(str2, a, a2, str4, str6, q4w0Var, categoryFilter.f, categoryFilter.g, false);
                            if (gtv0Var == null) {
                                arrayList2.add(gtv0Var);
                            }
                            sVar = this;
                            th2 = th;
                            i3 = i4;
                        }
                        gtv0Var = th;
                        if (gtv0Var == null) {
                        }
                        sVar = this;
                        th2 = th;
                        i3 = i4;
                    }
                    arrayList = arrayList2;
                }
                return arrayList != null ? EmptyList.a : arrayList;
            }
        }
        superAppDiscoveryMapExperimentRepository$getCategoryFilters$1 = new SuperAppDiscoveryMapExperimentRepository$getCategoryFilters$1(sVar, continuationImpl);
        Object obj3 = superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapExperimentRepository$getCategoryFilters$1.label;
        Throwable th22 = null;
        if (i != 0) {
        }
        SuperAppDiscoveryMapExperiment superAppDiscoveryMapExperiment2 = (SuperAppDiscoveryMapExperiment) obj3;
        screenOptions = superAppDiscoveryMapExperiment2.h;
        if (screenOptions != null) {
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }

    public final t1b0 b() {
        return (t1b0) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapExperimentRepository$getMapV1Config$1 superAppDiscoveryMapExperimentRepository$getMapV1Config$1;
        int i;
        String str;
        SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig;
        if (continuationImpl instanceof SuperAppDiscoveryMapExperimentRepository$getMapV1Config$1) {
            superAppDiscoveryMapExperimentRepository$getMapV1Config$1 = (SuperAppDiscoveryMapExperimentRepository$getMapV1Config$1) continuationImpl;
            int i2 = superAppDiscoveryMapExperimentRepository$getMapV1Config$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapExperimentRepository$getMapV1Config$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapExperimentRepository$getMapV1Config$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapExperimentRepository$getMapV1Config$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 b = b();
                    superAppDiscoveryMapExperimentRepository$getMapV1Config$1.label = 1;
                    obj = b.b(superAppDiscoveryMapExperimentRepository$getMapV1Config$1);
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
                SuperAppDiscoveryMapExperiment superAppDiscoveryMapExperiment = (SuperAppDiscoveryMapExperiment) obj;
                String str2 = superAppDiscoveryMapExperiment.g;
                SuperAppDiscoveryMapExperiment.ScreenOptions screenOptions = superAppDiscoveryMapExperiment.h;
                str = screenOptions != null ? screenOptions.a : null;
                if (str == null) {
                    str = "";
                }
                return new itv0(str2, str, screenOptions == null ? screenOptions.b : 12.0f, d6z.Y(superAppDiscoveryMapExperiment, superAppDiscoveryMapExperiment.e), d6z.Y(superAppDiscoveryMapExperiment, superAppDiscoveryMapExperiment.f), superAppDiscoveryMapExperiment.d, (screenOptions != null || (settlementFocusingConfig = screenOptions.c) == null) ? 0L : settlementFocusingConfig.b);
            }
        }
        superAppDiscoveryMapExperimentRepository$getMapV1Config$1 = new SuperAppDiscoveryMapExperimentRepository$getMapV1Config$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapExperimentRepository$getMapV1Config$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapExperimentRepository$getMapV1Config$1.label;
        if (i != 0) {
        }
        SuperAppDiscoveryMapExperiment superAppDiscoveryMapExperiment2 = (SuperAppDiscoveryMapExperiment) obj2;
        String str22 = superAppDiscoveryMapExperiment2.g;
        SuperAppDiscoveryMapExperiment.ScreenOptions screenOptions2 = superAppDiscoveryMapExperiment2.h;
        if (screenOptions2 != null) {
        }
        if (str == null) {
        }
        return new itv0(str22, str, screenOptions2 == null ? screenOptions2.b : 12.0f, d6z.Y(superAppDiscoveryMapExperiment2, superAppDiscoveryMapExperiment2.e), d6z.Y(superAppDiscoveryMapExperiment2, superAppDiscoveryMapExperiment2.f), superAppDiscoveryMapExperiment2.d, (screenOptions2 != null || (settlementFocusingConfig = screenOptions2.c) == null) ? 0L : settlementFocusingConfig.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1 superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1;
        int i;
        SuperAppDiscoveryMapExperiment superAppDiscoveryMapExperiment;
        SuperAppDiscoveryMapExperiment.ScreenOptions screenOptions;
        SuperAppDiscoveryMapExperiment.SettlementFocusingConfig settlementFocusingConfig;
        if (continuationImpl instanceof SuperAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1) {
            superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1 = (SuperAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1) continuationImpl;
            int i2 = superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 b = b();
                    superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.label = 1;
                    obj = b.b(superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1);
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
                superAppDiscoveryMapExperiment = (SuperAppDiscoveryMapExperiment) obj;
                if (superAppDiscoveryMapExperiment.c || (screenOptions = superAppDiscoveryMapExperiment.h) == null || (settlementFocusingConfig = screenOptions.c) == null || !settlementFocusingConfig.a) {
                    return null;
                }
                return settlementFocusingConfig;
            }
        }
        superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1 = new SuperAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapExperimentRepository$getSettlementFocusingConfig$1.label;
        if (i != 0) {
        }
        superAppDiscoveryMapExperiment = (SuperAppDiscoveryMapExperiment) obj2;
        if (superAppDiscoveryMapExperiment.c) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapExperimentRepository$isEnabled$1 superAppDiscoveryMapExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof SuperAppDiscoveryMapExperimentRepository$isEnabled$1) {
            superAppDiscoveryMapExperimentRepository$isEnabled$1 = (SuperAppDiscoveryMapExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = superAppDiscoveryMapExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapExperimentRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 b = b();
                    superAppDiscoveryMapExperimentRepository$isEnabled$1.label = 1;
                    obj = b.b(superAppDiscoveryMapExperimentRepository$isEnabled$1);
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
                return Boolean.valueOf(((SuperAppDiscoveryMapExperiment) obj).c);
            }
        }
        superAppDiscoveryMapExperimentRepository$isEnabled$1 = new SuperAppDiscoveryMapExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapExperimentRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((SuperAppDiscoveryMapExperiment) obj2).c);
    }
}
