package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import defpackage.c5w;
import defpackage.etn0;
import defpackage.m7n0;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.y1b1;
import defpackage.ysn0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes13.dex */
public final class r {
    public final com.yandex.go.scooters.data.c a;
    public final ru.yandex.taxi.scooters.domain.r b;
    public final ru.yandex.taxi.scooters.data.h c;
    public final com.yandex.go.scooters.insurance.data.b d;
    public final com.yandex.go.scooters.insurance.data.a e;
    public final m7n0 f;

    public r(com.yandex.go.scooters.data.c cVar, ru.yandex.taxi.scooters.domain.r rVar, ru.yandex.taxi.scooters.data.h hVar, com.yandex.go.scooters.insurance.data.b bVar, com.yandex.go.scooters.insurance.data.a aVar, m7n0 m7n0Var) {
        this.a = cVar;
        this.b = rVar;
        this.c = hVar;
        this.d = bVar;
        this.e = aVar;
        this.f = m7n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r8.b.b(r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r8.e.a(r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (r8.a.a(r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersInsuranceType scootersInsuranceType, ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$changeInsuranceType$1 scootersInsuranceInteractor$changeInsuranceType$1;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$changeInsuranceType$1) {
            scootersInsuranceInteractor$changeInsuranceType$1 = (ScootersInsuranceInteractor$changeInsuranceType$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$changeInsuranceType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$changeInsuranceType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceInteractor$changeInsuranceType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$changeInsuranceType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$changeInsuranceType$1.L$0 = scootersInsuranceType;
                    scootersInsuranceInteractor$changeInsuranceType$1.label = 1;
                } else if (i == 1) {
                    scootersInsuranceType = (ScootersInsuranceType) scootersInsuranceInteractor$changeInsuranceType$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    etn0 etn0Var = (etn0) obj;
                    if (etn0Var != null && (r9 = etn0Var.a) != null) {
                        scootersInsuranceInteractor$changeInsuranceType$1.L$0 = null;
                        scootersInsuranceInteractor$changeInsuranceType$1.L$1 = null;
                        scootersInsuranceInteractor$changeInsuranceType$1.label = 3;
                    }
                    scootersInsuranceInteractor$changeInsuranceType$1.L$0 = null;
                    scootersInsuranceInteractor$changeInsuranceType$1.L$1 = null;
                    scootersInsuranceInteractor$changeInsuranceType$1.label = 4;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$changeInsuranceType$1.L$0 = null;
                    scootersInsuranceInteractor$changeInsuranceType$1.L$1 = null;
                    scootersInsuranceInteractor$changeInsuranceType$1.label = 4;
                }
                if (scootersInsuranceType == ScootersInsuranceType.FULL) {
                    scootersInsuranceInteractor$changeInsuranceType$1.L$0 = null;
                    scootersInsuranceInteractor$changeInsuranceType$1.label = 2;
                    obj = this.d.e(scootersInsuranceInteractor$changeInsuranceType$1);
                }
                scootersInsuranceInteractor$changeInsuranceType$1.L$0 = null;
                scootersInsuranceInteractor$changeInsuranceType$1.L$1 = null;
                scootersInsuranceInteractor$changeInsuranceType$1.label = 4;
            }
        }
        scootersInsuranceInteractor$changeInsuranceType$1 = new ScootersInsuranceInteractor$changeInsuranceType$1(this, continuationImpl);
        Object obj2 = scootersInsuranceInteractor$changeInsuranceType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$changeInsuranceType$1.label;
        if (i != 0) {
        }
        if (scootersInsuranceType == ScootersInsuranceType.FULL) {
        }
        scootersInsuranceInteractor$changeInsuranceType$1.L$0 = null;
        scootersInsuranceInteractor$changeInsuranceType$1.L$1 = null;
        scootersInsuranceInteractor$changeInsuranceType$1.label = 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(n3o0 n3o0Var, boolean z, ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$getDisableInsuranceSuggestionId$1 scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersInsuranceType scootersInsuranceType;
        etn0 etn0Var;
        String str;
        String str2;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersInsuranceInteractor$getDisableInsuranceSuggestionId$1) {
            scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1 = (ScootersInsuranceInteractor$getDisableInsuranceSuggestionId$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (n3o0Var != null ? !n3o0Var.d : true) {
                        if (n3o0Var == null || (scootersInsuranceType = n3o0Var.a) == null) {
                            scootersInsuranceType = d().a;
                        }
                        if (scootersInsuranceType == ScootersInsuranceType.FULL) {
                            scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$0 = null;
                            scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.Z$0 = z;
                            scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label = 1;
                            obj = this.d.e(scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1);
                        }
                    }
                    return null;
                }
                if (i == 1) {
                    z = scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.Z$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$1;
                        kotlin.b.b(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            return null;
                        }
                        return str2;
                    }
                    str2 = (String) scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$1;
                    kotlin.b.b(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                    }
                }
                etn0Var = (etn0) obj;
                if (etn0Var != null && (str = etn0Var.a) != null) {
                    com.yandex.go.scooters.insurance.data.a aVar = this.e;
                    if (z) {
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$0 = null;
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$1 = str;
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.Z$0 = z;
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label = 3;
                        obj = aVar.b(str, scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1);
                        if (obj != coroutineSingletons) {
                            str2 = str;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                            }
                        }
                    } else {
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$0 = null;
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.L$1 = str;
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.Z$0 = z;
                        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label = 2;
                        obj = aVar.c(str, scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1);
                        if (obj != coroutineSingletons) {
                            str2 = str;
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (booleanValue) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1 = new ScootersInsuranceInteractor$getDisableInsuranceSuggestionId$1(this, continuationImpl);
        Object obj2 = scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$getDisableInsuranceSuggestionId$1.label;
        if (i != 0) {
        }
        etn0Var = (etn0) obj2;
        if (etn0Var != null) {
            com.yandex.go.scooters.insurance.data.a aVar2 = this.e;
            if (z) {
            }
            return coroutineSingletons;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$getInsurancePromoId$1 scootersInsuranceInteractor$getInsurancePromoId$1;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$getInsurancePromoId$1) {
            scootersInsuranceInteractor$getInsurancePromoId$1 = (ScootersInsuranceInteractor$getInsurancePromoId$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$getInsurancePromoId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$getInsurancePromoId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceInteractor$getInsurancePromoId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$getInsurancePromoId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$getInsurancePromoId$1.label = 1;
                    obj = this.f.a.b(scootersInsuranceInteractor$getInsurancePromoId$1);
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
                return ((ScootersClientInsuranceNewExperiment) obj).d;
            }
        }
        scootersInsuranceInteractor$getInsurancePromoId$1 = new ScootersInsuranceInteractor$getInsurancePromoId$1(this, continuationImpl);
        Object obj2 = scootersInsuranceInteractor$getInsurancePromoId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$getInsurancePromoId$1.label;
        if (i != 0) {
        }
        return ((ScootersClientInsuranceNewExperiment) obj2).d;
    }

    public final ysn0 d() {
        return this.c.a().g;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$isInsuranceAvailable$1 scootersInsuranceInteractor$isInsuranceAvailable$1;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$isInsuranceAvailable$1) {
            scootersInsuranceInteractor$isInsuranceAvailable$1 = (ScootersInsuranceInteractor$isInsuranceAvailable$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$isInsuranceAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$isInsuranceAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceInteractor$isInsuranceAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$isInsuranceAvailable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$isInsuranceAvailable$1.label = 1;
                    obj = this.f.a.b(scootersInsuranceInteractor$isInsuranceAvailable$1);
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
                return Boolean.valueOf((((ScootersClientInsuranceNewExperiment) obj).b || this.c.a().g.a == ScootersInsuranceType.NO_INSURANCE) ? false : true);
            }
        }
        scootersInsuranceInteractor$isInsuranceAvailable$1 = new ScootersInsuranceInteractor$isInsuranceAvailable$1(this, continuationImpl);
        Object obj2 = scootersInsuranceInteractor$isInsuranceAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$isInsuranceAvailable$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf((((ScootersClientInsuranceNewExperiment) obj2).b || this.c.a().g.a == ScootersInsuranceType.NO_INSURANCE) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$isInsuranceAvailableSuspend$1 scootersInsuranceInteractor$isInsuranceAvailableSuspend$1;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$isInsuranceAvailableSuspend$1) {
            scootersInsuranceInteractor$isInsuranceAvailableSuspend$1 = (ScootersInsuranceInteractor$isInsuranceAvailableSuspend$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.label = 1;
                    obj = this.f.a.b(scootersInsuranceInteractor$isInsuranceAvailableSuspend$1);
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
                return Boolean.valueOf((((ScootersClientInsuranceNewExperiment) obj).b || this.c.a().g.a == ScootersInsuranceType.NO_INSURANCE) ? false : true);
            }
        }
        scootersInsuranceInteractor$isInsuranceAvailableSuspend$1 = new ScootersInsuranceInteractor$isInsuranceAvailableSuspend$1(this, continuationImpl);
        Object obj2 = scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$isInsuranceAvailableSuspend$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf((((ScootersClientInsuranceNewExperiment) obj2).b || this.c.a().g.a == ScootersInsuranceType.NO_INSURANCE) ? false : true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$isInsuranceV2Available$1 scootersInsuranceInteractor$isInsuranceV2Available$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$isInsuranceV2Available$1) {
            scootersInsuranceInteractor$isInsuranceV2Available$1 = (ScootersInsuranceInteractor$isInsuranceV2Available$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$isInsuranceV2Available$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$isInsuranceV2Available$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersInsuranceInteractor$isInsuranceV2Available$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$isInsuranceV2Available$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$isInsuranceV2Available$1.label = 1;
                    obj = f(scootersInsuranceInteractor$isInsuranceV2Available$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        if (y1b1.a(((ScootersClientInsuranceNewExperiment) obj).g)) {
                            scootersInsuranceInteractor$isInsuranceV2Available$1.label = 3;
                            obj = h(scootersInsuranceInteractor$isInsuranceV2Available$1);
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersInsuranceInteractor$isInsuranceV2Available$1.label = 2;
                    obj = this.f.a.b(scootersInsuranceInteractor$isInsuranceV2Available$1);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        scootersInsuranceInteractor$isInsuranceV2Available$1 = new ScootersInsuranceInteractor$isInsuranceV2Available$1(this, continuationImpl);
        obj = scootersInsuranceInteractor$isInsuranceV2Available$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$isInsuranceV2Available$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (defpackage.y1b1.a(((ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment) r6).h) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$isInsuranceV3Available$1 scootersInsuranceInteractor$isInsuranceV3Available$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$isInsuranceV3Available$1) {
            scootersInsuranceInteractor$isInsuranceV3Available$1 = (ScootersInsuranceInteractor$isInsuranceV3Available$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$isInsuranceV3Available$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$isInsuranceV3Available$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersInsuranceInteractor$isInsuranceV3Available$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$isInsuranceV3Available$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$isInsuranceV3Available$1.label = 1;
                    obj = f(scootersInsuranceInteractor$isInsuranceV3Available$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersInsuranceInteractor$isInsuranceV3Available$1.label = 2;
                    obj = this.f.a.b(scootersInsuranceInteractor$isInsuranceV3Available$1);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        scootersInsuranceInteractor$isInsuranceV3Available$1 = new ScootersInsuranceInteractor$isInsuranceV3Available$1(this, continuationImpl);
        obj = scootersInsuranceInteractor$isInsuranceV3Available$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$isInsuranceV3Available$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r5.d == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        ScootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1 scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1) {
            scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1 = (ScootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1) continuationImpl;
            int i2 = scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.label = 1;
                    obj = g(scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        c5w c5wVar = ((ScootersClientInsuranceNewExperiment) obj).g;
                        if (c5wVar != null) {
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.label = 2;
                    obj = this.f.a.b(scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1 = new ScootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1(this, continuationImpl);
        obj = scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceInteractor$showInsuranceScreenAfterOnboarding$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
