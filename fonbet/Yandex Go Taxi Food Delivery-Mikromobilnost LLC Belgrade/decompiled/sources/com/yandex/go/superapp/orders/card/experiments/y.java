package com.yandex.go.superapp.orders.card.experiments;

import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment;
import com.yandex.go.superapp.orders.card.experiments.SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tje;
import defpackage.tpr;
import defpackage.w511;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class y implements ru.yandex.taxi.experiments.q {
    public final /* synthetic */ ru.yandex.taxi.experiments.q a;
    public final com.yandex.go.coroutines.h b = new com.yandex.go.coroutines.h(new SuperappTrackingCardRepository$cachedExperiment$1(this, null));

    public y(rqo rqoVar) {
        this.a = ((jbh) rqoVar).d(new SuperappTrackingCardExperiment(0));
    }

    public static TrackingCardElementHorizontalPlacement O(SuperappTrackingCardExperiment.HorizontalPlacement horizontalPlacement) {
        int i = x.a[horizontalPlacement.ordinal()];
        if (i == 1) {
            return TrackingCardElementHorizontalPlacement.Lead;
        }
        if (i == 2) {
            return TrackingCardElementHorizontalPlacement.Trail;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$navigatorServiceDefaultIconTag$1 superappTrackingCardRepository$navigatorServiceDefaultIconTag$1;
        int i;
        SuperappTrackingCardExperiment.NavigatorTracking navigatorTracking;
        String str;
        if (continuationImpl instanceof SuperappTrackingCardRepository$navigatorServiceDefaultIconTag$1) {
            superappTrackingCardRepository$navigatorServiceDefaultIconTag$1 = (SuperappTrackingCardRepository$navigatorServiceDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$navigatorServiceDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                navigatorTracking = ((SuperappTrackingCardExperiment) obj).h;
                if (navigatorTracking != null || (str = navigatorTracking.a) == null) {
                    return null;
                }
                superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.label = 2;
                Object K = K(str, superappTrackingCardRepository$navigatorServiceDefaultIconTag$1);
                return K == obj2 ? obj2 : K;
            }
        }
        superappTrackingCardRepository$navigatorServiceDefaultIconTag$1 = new SuperappTrackingCardRepository$navigatorServiceDefaultIconTag$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$navigatorServiceDefaultIconTag$1.label;
        if (i != 0) {
        }
        navigatorTracking = ((SuperappTrackingCardExperiment) obj3).h;
        if (navigatorTracking != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$navigatorServiceIconPlacement$1 superappTrackingCardRepository$navigatorServiceIconPlacement$1;
        int i;
        SuperappTrackingCardExperiment.HorizontalPlacement horizontalPlacement;
        if (continuationImpl instanceof SuperappTrackingCardRepository$navigatorServiceIconPlacement$1) {
            superappTrackingCardRepository$navigatorServiceIconPlacement$1 = (SuperappTrackingCardRepository$navigatorServiceIconPlacement$1) continuationImpl;
            int i2 = superappTrackingCardRepository$navigatorServiceIconPlacement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$navigatorServiceIconPlacement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$navigatorServiceIconPlacement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$navigatorServiceIconPlacement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$navigatorServiceIconPlacement$1.L$0 = this;
                    superappTrackingCardRepository$navigatorServiceIconPlacement$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$navigatorServiceIconPlacement$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$navigatorServiceIconPlacement$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.NavigatorTracking navigatorTracking = ((SuperappTrackingCardExperiment) obj).h;
                TrackingCardElementHorizontalPlacement O = (navigatorTracking != null || (horizontalPlacement = navigatorTracking.c) == null) ? null : O(horizontalPlacement);
                superappTrackingCardRepository$navigatorServiceIconPlacement$1.L$0 = null;
                superappTrackingCardRepository$navigatorServiceIconPlacement$1.label = 2;
                Enum I = this.I(O, superappTrackingCardRepository$navigatorServiceIconPlacement$1);
                return I != coroutineSingletons ? coroutineSingletons : I;
            }
        }
        superappTrackingCardRepository$navigatorServiceIconPlacement$1 = new SuperappTrackingCardRepository$navigatorServiceIconPlacement$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$navigatorServiceIconPlacement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$navigatorServiceIconPlacement$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.NavigatorTracking navigatorTracking2 = ((SuperappTrackingCardExperiment) obj2).h;
        if (navigatorTracking2 != null) {
        }
        superappTrackingCardRepository$navigatorServiceIconPlacement$1.L$0 = null;
        superappTrackingCardRepository$navigatorServiceIconPlacement$1.label = 2;
        Enum I2 = this.I(O, superappTrackingCardRepository$navigatorServiceIconPlacement$1);
        if (I2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$navigatorServicePedestrianIconTag$1 superappTrackingCardRepository$navigatorServicePedestrianIconTag$1;
        int i;
        SuperappTrackingCardExperiment.NavigatorTracking navigatorTracking;
        String str;
        if (continuationImpl instanceof SuperappTrackingCardRepository$navigatorServicePedestrianIconTag$1) {
            superappTrackingCardRepository$navigatorServicePedestrianIconTag$1 = (SuperappTrackingCardRepository$navigatorServicePedestrianIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$navigatorServicePedestrianIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                navigatorTracking = ((SuperappTrackingCardExperiment) obj).h;
                if (navigatorTracking != null || (str = navigatorTracking.b) == null) {
                    return null;
                }
                superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.label = 2;
                Object K = K(str, superappTrackingCardRepository$navigatorServicePedestrianIconTag$1);
                return K == obj2 ? obj2 : K;
            }
        }
        superappTrackingCardRepository$navigatorServicePedestrianIconTag$1 = new SuperappTrackingCardRepository$navigatorServicePedestrianIconTag$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$navigatorServicePedestrianIconTag$1.label;
        if (i != 0) {
        }
        navigatorTracking = ((SuperappTrackingCardExperiment) obj3).h;
        if (navigatorTracking != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$scootersServiceBikeIconTag$1 superappTrackingCardRepository$scootersServiceBikeIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$scootersServiceBikeIconTag$1) {
            superappTrackingCardRepository$scootersServiceBikeIconTag$1 = (SuperappTrackingCardRepository$scootersServiceBikeIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$scootersServiceBikeIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$scootersServiceBikeIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$scootersServiceBikeIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$scootersServiceBikeIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$scootersServiceBikeIconTag$1.L$0 = this;
                    superappTrackingCardRepository$scootersServiceBikeIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$scootersServiceBikeIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$scootersServiceBikeIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ScootersTracking scootersTracking = ((SuperappTrackingCardExperiment) obj).f;
                String str = scootersTracking == null ? scootersTracking.b : null;
                superappTrackingCardRepository$scootersServiceBikeIconTag$1.L$0 = null;
                superappTrackingCardRepository$scootersServiceBikeIconTag$1.label = 2;
                Object K = this.K(str, superappTrackingCardRepository$scootersServiceBikeIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$scootersServiceBikeIconTag$1 = new SuperappTrackingCardRepository$scootersServiceBikeIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$scootersServiceBikeIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$scootersServiceBikeIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ScootersTracking scootersTracking2 = ((SuperappTrackingCardExperiment) obj2).f;
        if (scootersTracking2 == null) {
        }
        superappTrackingCardRepository$scootersServiceBikeIconTag$1.L$0 = null;
        superappTrackingCardRepository$scootersServiceBikeIconTag$1.label = 2;
        Object K2 = this.K(str, superappTrackingCardRepository$scootersServiceBikeIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$scootersServiceDefaultIconTag$1 superappTrackingCardRepository$scootersServiceDefaultIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$scootersServiceDefaultIconTag$1) {
            superappTrackingCardRepository$scootersServiceDefaultIconTag$1 = (SuperappTrackingCardRepository$scootersServiceDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$scootersServiceDefaultIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$scootersServiceDefaultIconTag$1.L$0 = this;
                    superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$scootersServiceDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$scootersServiceDefaultIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ScootersTracking scootersTracking = ((SuperappTrackingCardExperiment) obj).f;
                String str = scootersTracking == null ? scootersTracking.a : null;
                superappTrackingCardRepository$scootersServiceDefaultIconTag$1.L$0 = null;
                superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label = 2;
                Object K = this.K(str, superappTrackingCardRepository$scootersServiceDefaultIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$scootersServiceDefaultIconTag$1 = new SuperappTrackingCardRepository$scootersServiceDefaultIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$scootersServiceDefaultIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ScootersTracking scootersTracking2 = ((SuperappTrackingCardExperiment) obj2).f;
        if (scootersTracking2 == null) {
        }
        superappTrackingCardRepository$scootersServiceDefaultIconTag$1.L$0 = null;
        superappTrackingCardRepository$scootersServiceDefaultIconTag$1.label = 2;
        Object K2 = this.K(str, superappTrackingCardRepository$scootersServiceDefaultIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1 superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1) {
            superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1 = (SuperappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1) continuationImpl;
            int i2 = superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.L$0 = this;
                    superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ChargersTracking chargersTracking = ((SuperappTrackingCardExperiment) obj).i;
                Boolean valueOf = chargersTracking == null ? Boolean.valueOf(chargersTracking.d) : null;
                superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.L$0 = null;
                superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label = 2;
                Object J = this.J(valueOf, superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1);
                return J != coroutineSingletons ? coroutineSingletons : J;
            }
        }
        superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1 = new SuperappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ChargersTracking chargersTracking2 = ((SuperappTrackingCardExperiment) obj2).i;
        if (chargersTracking2 == null) {
        }
        superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.L$0 = null;
        superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1.label = 2;
        Object J2 = this.J(valueOf, superappTrackingCardRepository$showChargersServiceIconWhenPowerbankVisible$1);
        if (J2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$showChevron$1 superappTrackingCardRepository$showChevron$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$showChevron$1) {
            superappTrackingCardRepository$showChevron$1 = (SuperappTrackingCardRepository$showChevron$1) continuationImpl;
            int i2 = superappTrackingCardRepository$showChevron$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$showChevron$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$showChevron$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$showChevron$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$showChevron$1.L$0 = this;
                    superappTrackingCardRepository$showChevron$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$showChevron$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$showChevron$1.L$0;
                    kotlin.b.b(obj);
                }
                Boolean valueOf = Boolean.valueOf(((SuperappTrackingCardExperiment) obj).o);
                superappTrackingCardRepository$showChevron$1.L$0 = null;
                superappTrackingCardRepository$showChevron$1.label = 2;
                Object J = this.J(valueOf, superappTrackingCardRepository$showChevron$1);
                return J != coroutineSingletons ? coroutineSingletons : J;
            }
        }
        superappTrackingCardRepository$showChevron$1 = new SuperappTrackingCardRepository$showChevron$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$showChevron$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$showChevron$1.label;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf(((SuperappTrackingCardExperiment) obj2).o);
        superappTrackingCardRepository$showChevron$1.L$0 = null;
        superappTrackingCardRepository$showChevron$1.label = 2;
        Object J2 = this.J(valueOf2, superappTrackingCardRepository$showChevron$1);
        if (J2 != coroutineSingletons2) {
        }
    }

    public final int H() {
        return ((Number) tje.Y(EmptyCoroutineContext.a, new SuperappTrackingCardRepository$subtitleMaxLines$1(this, null))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum I(TrackingCardElementHorizontalPlacement trackingCardElementHorizontalPlacement, ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$takeIfExperimentEnabled$3 superappTrackingCardRepository$takeIfExperimentEnabled$3;
        Object obj;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$takeIfExperimentEnabled$3) {
            superappTrackingCardRepository$takeIfExperimentEnabled$3 = (SuperappTrackingCardRepository$takeIfExperimentEnabled$3) continuationImpl;
            int i2 = superappTrackingCardRepository$takeIfExperimentEnabled$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$takeIfExperimentEnabled$3.label = i2 - Integer.MIN_VALUE;
                obj = superappTrackingCardRepository$takeIfExperimentEnabled$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$takeIfExperimentEnabled$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (trackingCardElementHorizontalPlacement != null) {
                        superappTrackingCardRepository$takeIfExperimentEnabled$3.L$0 = trackingCardElementHorizontalPlacement;
                        superappTrackingCardRepository$takeIfExperimentEnabled$3.label = 1;
                        obj = f(superappTrackingCardRepository$takeIfExperimentEnabled$3);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return TrackingCardElementHorizontalPlacement.Trail;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                trackingCardElementHorizontalPlacement = (TrackingCardElementHorizontalPlacement) superappTrackingCardRepository$takeIfExperimentEnabled$3.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return trackingCardElementHorizontalPlacement;
                }
                return TrackingCardElementHorizontalPlacement.Trail;
            }
        }
        superappTrackingCardRepository$takeIfExperimentEnabled$3 = new SuperappTrackingCardRepository$takeIfExperimentEnabled$3(this, continuationImpl);
        obj = superappTrackingCardRepository$takeIfExperimentEnabled$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$takeIfExperimentEnabled$3.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return TrackingCardElementHorizontalPlacement.Trail;
    }

    public final Object J(Boolean bool, ContinuationImpl continuationImpl) {
        return jl40.l(bool, Boolean.TRUE) ? f(continuationImpl) : Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(String str, ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$takeIfExperimentEnabled$1 superappTrackingCardRepository$takeIfExperimentEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$takeIfExperimentEnabled$1) {
            superappTrackingCardRepository$takeIfExperimentEnabled$1 = (SuperappTrackingCardRepository$takeIfExperimentEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$takeIfExperimentEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$takeIfExperimentEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = superappTrackingCardRepository$takeIfExperimentEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$takeIfExperimentEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        superappTrackingCardRepository$takeIfExperimentEnabled$1.L$0 = str;
                        superappTrackingCardRepository$takeIfExperimentEnabled$1.label = 1;
                        obj = f(superappTrackingCardRepository$takeIfExperimentEnabled$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) superappTrackingCardRepository$takeIfExperimentEnabled$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return str;
            }
        }
        superappTrackingCardRepository$takeIfExperimentEnabled$1 = new SuperappTrackingCardRepository$takeIfExperimentEnabled$1(this, continuationImpl);
        obj = superappTrackingCardRepository$takeIfExperimentEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$takeIfExperimentEnabled$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$taxiServiceDefaultIconTag$1 superappTrackingCardRepository$taxiServiceDefaultIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$taxiServiceDefaultIconTag$1) {
            superappTrackingCardRepository$taxiServiceDefaultIconTag$1 = (SuperappTrackingCardRepository$taxiServiceDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$taxiServiceDefaultIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$taxiServiceDefaultIconTag$1.L$0 = this;
                    superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$taxiServiceDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$taxiServiceDefaultIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.TaxiTracking taxiTracking = ((SuperappTrackingCardExperiment) obj).d;
                String str = taxiTracking == null ? taxiTracking.a : null;
                superappTrackingCardRepository$taxiServiceDefaultIconTag$1.L$0 = null;
                superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label = 2;
                Object K = this.K(str, superappTrackingCardRepository$taxiServiceDefaultIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$taxiServiceDefaultIconTag$1 = new SuperappTrackingCardRepository$taxiServiceDefaultIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$taxiServiceDefaultIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.TaxiTracking taxiTracking2 = ((SuperappTrackingCardExperiment) obj2).d;
        if (taxiTracking2 == null) {
        }
        superappTrackingCardRepository$taxiServiceDefaultIconTag$1.L$0 = null;
        superappTrackingCardRepository$taxiServiceDefaultIconTag$1.label = 2;
        Object K2 = this.K(str, superappTrackingCardRepository$taxiServiceDefaultIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(String str, ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$taxiServiceTariffIconTag$1 superappTrackingCardRepository$taxiServiceTariffIconTag$1;
        int i;
        SuperappTrackingCardExperiment.TaxiTracking taxiTracking;
        SuperappTrackingCardExperiment.TaxiTracking.Tariff tariff;
        String a;
        if (continuationImpl instanceof SuperappTrackingCardRepository$taxiServiceTariffIconTag$1) {
            superappTrackingCardRepository$taxiServiceTariffIconTag$1 = (SuperappTrackingCardRepository$taxiServiceTariffIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$taxiServiceTariffIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$taxiServiceTariffIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$taxiServiceTariffIconTag$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$taxiServiceTariffIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$taxiServiceTariffIconTag$1.L$0 = str;
                    superappTrackingCardRepository$taxiServiceTariffIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$taxiServiceTariffIconTag$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) superappTrackingCardRepository$taxiServiceTariffIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                taxiTracking = ((SuperappTrackingCardExperiment) obj).d;
                if (taxiTracking != null || (tariff = (SuperappTrackingCardExperiment.TaxiTracking.Tariff) taxiTracking.b.get(str)) == null || (a = tariff.getA()) == null) {
                    return null;
                }
                superappTrackingCardRepository$taxiServiceTariffIconTag$1.L$0 = null;
                superappTrackingCardRepository$taxiServiceTariffIconTag$1.label = 2;
                Object K = K(a, superappTrackingCardRepository$taxiServiceTariffIconTag$1);
                return K == obj2 ? obj2 : K;
            }
        }
        superappTrackingCardRepository$taxiServiceTariffIconTag$1 = new SuperappTrackingCardRepository$taxiServiceTariffIconTag$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$taxiServiceTariffIconTag$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$taxiServiceTariffIconTag$1.label;
        if (i != 0) {
        }
        taxiTracking = ((SuperappTrackingCardExperiment) obj3).d;
        if (taxiTracking != null) {
        }
        return null;
    }

    public final int N() {
        return ((Number) tje.Y(EmptyCoroutineContext.a, new SuperappTrackingCardRepository$titleMaxLines$1(this, null))).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(String str, ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$trackingCardColors$1 superappTrackingCardRepository$trackingCardColors$1;
        Object obj;
        int i;
        String str2;
        if (continuationImpl instanceof SuperappTrackingCardRepository$trackingCardColors$1) {
            superappTrackingCardRepository$trackingCardColors$1 = (SuperappTrackingCardRepository$trackingCardColors$1) continuationImpl;
            int i2 = superappTrackingCardRepository$trackingCardColors$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$trackingCardColors$1.label = i2 - Integer.MIN_VALUE;
                obj = superappTrackingCardRepository$trackingCardColors$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$trackingCardColors$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$trackingCardColors$1.L$0 = str;
                    superappTrackingCardRepository$trackingCardColors$1.label = 1;
                    obj = f(superappTrackingCardRepository$trackingCardColors$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) superappTrackingCardRepository$trackingCardColors$1.L$0;
                        kotlin.b.b(obj);
                        return (SuperappTrackingCardExperiment.TrackingCardColors) ((SuperappTrackingCardExperiment) obj).p.get(str2);
                    }
                    str = (String) superappTrackingCardRepository$trackingCardColors$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                superappTrackingCardRepository$trackingCardColors$1.L$0 = str;
                superappTrackingCardRepository$trackingCardColors$1.label = 2;
                obj = this.b.a(superappTrackingCardRepository$trackingCardColors$1);
                if (obj != obj2) {
                    str2 = str;
                    return (SuperappTrackingCardExperiment.TrackingCardColors) ((SuperappTrackingCardExperiment) obj).p.get(str2);
                }
                return obj2;
            }
        }
        superappTrackingCardRepository$trackingCardColors$1 = new SuperappTrackingCardRepository$trackingCardColors$1(this, continuationImpl);
        obj = superappTrackingCardRepository$trackingCardColors$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$trackingCardColors$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$useAggregateEndpoint$1 superappTrackingCardRepository$useAggregateEndpoint$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$useAggregateEndpoint$1) {
            superappTrackingCardRepository$useAggregateEndpoint$1 = (SuperappTrackingCardRepository$useAggregateEndpoint$1) continuationImpl;
            int i2 = superappTrackingCardRepository$useAggregateEndpoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$useAggregateEndpoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$useAggregateEndpoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$useAggregateEndpoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$useAggregateEndpoint$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$useAggregateEndpoint$1);
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
                return Boolean.valueOf(((SuperappTrackingCardExperiment) obj).r);
            }
        }
        superappTrackingCardRepository$useAggregateEndpoint$1 = new SuperappTrackingCardRepository$useAggregateEndpoint$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$useAggregateEndpoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$useAggregateEndpoint$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((SuperappTrackingCardExperiment) obj2).r);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (SuperappTrackingCardExperiment) this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$chargersServiceDefaultIconTag$1 superappTrackingCardRepository$chargersServiceDefaultIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$chargersServiceDefaultIconTag$1) {
            superappTrackingCardRepository$chargersServiceDefaultIconTag$1 = (SuperappTrackingCardRepository$chargersServiceDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$chargersServiceDefaultIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$chargersServiceDefaultIconTag$1.L$0 = this;
                    superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$chargersServiceDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$chargersServiceDefaultIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ChargersTracking chargersTracking = ((SuperappTrackingCardExperiment) obj).i;
                String str = chargersTracking == null ? chargersTracking.a : null;
                superappTrackingCardRepository$chargersServiceDefaultIconTag$1.L$0 = null;
                superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label = 2;
                Object K = this.K(str, superappTrackingCardRepository$chargersServiceDefaultIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$chargersServiceDefaultIconTag$1 = new SuperappTrackingCardRepository$chargersServiceDefaultIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$chargersServiceDefaultIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ChargersTracking chargersTracking2 = ((SuperappTrackingCardExperiment) obj2).i;
        if (chargersTracking2 == null) {
        }
        superappTrackingCardRepository$chargersServiceDefaultIconTag$1.L$0 = null;
        superappTrackingCardRepository$chargersServiceDefaultIconTag$1.label = 2;
        Object K2 = this.K(str, superappTrackingCardRepository$chargersServiceDefaultIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.yandex.taxi.experiments.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Continuation continuation) {
        SuperappTrackingCardRepository$isEnabled$1 superappTrackingCardRepository$isEnabled$1;
        int i;
        if (continuation instanceof SuperappTrackingCardRepository$isEnabled$1) {
            superappTrackingCardRepository$isEnabled$1 = (SuperappTrackingCardRepository$isEnabled$1) continuation;
            int i2 = superappTrackingCardRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isEnabled$1);
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
                return Boolean.valueOf(((SuperappTrackingCardExperiment) obj).b);
            }
        }
        superappTrackingCardRepository$isEnabled$1 = new SuperappTrackingCardRepository$isEnabled$1(this, continuation);
        Object obj2 = superappTrackingCardRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((SuperappTrackingCardExperiment) obj2).b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$chargersServiceIconPlacement$1 superappTrackingCardRepository$chargersServiceIconPlacement$1;
        int i;
        SuperappTrackingCardExperiment.HorizontalPlacement horizontalPlacement;
        if (continuationImpl instanceof SuperappTrackingCardRepository$chargersServiceIconPlacement$1) {
            superappTrackingCardRepository$chargersServiceIconPlacement$1 = (SuperappTrackingCardRepository$chargersServiceIconPlacement$1) continuationImpl;
            int i2 = superappTrackingCardRepository$chargersServiceIconPlacement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$chargersServiceIconPlacement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$chargersServiceIconPlacement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$chargersServiceIconPlacement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$chargersServiceIconPlacement$1.L$0 = this;
                    superappTrackingCardRepository$chargersServiceIconPlacement$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$chargersServiceIconPlacement$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$chargersServiceIconPlacement$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ChargersTracking chargersTracking = ((SuperappTrackingCardExperiment) obj).i;
                TrackingCardElementHorizontalPlacement O = (chargersTracking != null || (horizontalPlacement = chargersTracking.b) == null) ? null : O(horizontalPlacement);
                superappTrackingCardRepository$chargersServiceIconPlacement$1.L$0 = null;
                superappTrackingCardRepository$chargersServiceIconPlacement$1.label = 2;
                Enum I = this.I(O, superappTrackingCardRepository$chargersServiceIconPlacement$1);
                return I != coroutineSingletons ? coroutineSingletons : I;
            }
        }
        superappTrackingCardRepository$chargersServiceIconPlacement$1 = new SuperappTrackingCardRepository$chargersServiceIconPlacement$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$chargersServiceIconPlacement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$chargersServiceIconPlacement$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ChargersTracking chargersTracking2 = ((SuperappTrackingCardExperiment) obj2).i;
        if (chargersTracking2 != null) {
        }
        superappTrackingCardRepository$chargersServiceIconPlacement$1.L$0 = null;
        superappTrackingCardRepository$chargersServiceIconPlacement$1.label = 2;
        Enum I2 = this.I(O, superappTrackingCardRepository$chargersServiceIconPlacement$1);
        if (I2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$deferButtonText$1 superappTrackingCardRepository$deferButtonText$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$deferButtonText$1) {
            superappTrackingCardRepository$deferButtonText$1 = (SuperappTrackingCardRepository$deferButtonText$1) continuationImpl;
            int i2 = superappTrackingCardRepository$deferButtonText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$deferButtonText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$deferButtonText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$deferButtonText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$deferButtonText$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$deferButtonText$1);
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
                SuperappTrackingCardExperiment superappTrackingCardExperiment = (SuperappTrackingCardExperiment) obj;
                return d6z.Y(superappTrackingCardExperiment, superappTrackingCardExperiment.q);
            }
        }
        superappTrackingCardRepository$deferButtonText$1 = new SuperappTrackingCardRepository$deferButtonText$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$deferButtonText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$deferButtonText$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment superappTrackingCardExperiment2 = (SuperappTrackingCardExperiment) obj2;
        return d6z.Y(superappTrackingCardExperiment2, superappTrackingCardExperiment2.q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$deliveryServiceDefaultIconTag$1 superappTrackingCardRepository$deliveryServiceDefaultIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$deliveryServiceDefaultIconTag$1) {
            superappTrackingCardRepository$deliveryServiceDefaultIconTag$1 = (SuperappTrackingCardRepository$deliveryServiceDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.L$0 = this;
                    superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$deliveryServiceDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking = ((SuperappTrackingCardExperiment) obj).g;
                String str = deliveryTracking == null ? deliveryTracking.a : null;
                superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.L$0 = null;
                superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label = 2;
                Object K = this.K(str, superappTrackingCardRepository$deliveryServiceDefaultIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$deliveryServiceDefaultIconTag$1 = new SuperappTrackingCardRepository$deliveryServiceDefaultIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking2 = ((SuperappTrackingCardExperiment) obj2).g;
        if (deliveryTracking2 == null) {
        }
        superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.L$0 = null;
        superappTrackingCardRepository$deliveryServiceDefaultIconTag$1.label = 2;
        Object K2 = this.K(str, superappTrackingCardRepository$deliveryServiceDefaultIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$deliveryServiceIconPlacement$1 superappTrackingCardRepository$deliveryServiceIconPlacement$1;
        int i;
        SuperappTrackingCardExperiment.HorizontalPlacement horizontalPlacement;
        if (continuationImpl instanceof SuperappTrackingCardRepository$deliveryServiceIconPlacement$1) {
            superappTrackingCardRepository$deliveryServiceIconPlacement$1 = (SuperappTrackingCardRepository$deliveryServiceIconPlacement$1) continuationImpl;
            int i2 = superappTrackingCardRepository$deliveryServiceIconPlacement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$deliveryServiceIconPlacement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$deliveryServiceIconPlacement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$deliveryServiceIconPlacement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$deliveryServiceIconPlacement$1.L$0 = this;
                    superappTrackingCardRepository$deliveryServiceIconPlacement$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$deliveryServiceIconPlacement$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$deliveryServiceIconPlacement$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking = ((SuperappTrackingCardExperiment) obj).g;
                TrackingCardElementHorizontalPlacement O = (deliveryTracking != null || (horizontalPlacement = deliveryTracking.b) == null) ? null : O(horizontalPlacement);
                superappTrackingCardRepository$deliveryServiceIconPlacement$1.L$0 = null;
                superappTrackingCardRepository$deliveryServiceIconPlacement$1.label = 2;
                Enum I = this.I(O, superappTrackingCardRepository$deliveryServiceIconPlacement$1);
                return I != coroutineSingletons ? coroutineSingletons : I;
            }
        }
        superappTrackingCardRepository$deliveryServiceIconPlacement$1 = new SuperappTrackingCardRepository$deliveryServiceIconPlacement$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$deliveryServiceIconPlacement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$deliveryServiceIconPlacement$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking2 = ((SuperappTrackingCardExperiment) obj2).g;
        if (deliveryTracking2 != null) {
        }
        superappTrackingCardRepository$deliveryServiceIconPlacement$1.L$0 = null;
        superappTrackingCardRepository$deliveryServiceIconPlacement$1.label = 2;
        Enum I2 = this.I(O, superappTrackingCardRepository$deliveryServiceIconPlacement$1);
        if (I2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1 superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1) {
            superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1 = (SuperappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.L$0 = this;
                    superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking = ((SuperappTrackingCardExperiment) obj).g;
                g gVar = deliveryTracking == null ? deliveryTracking.d : null;
                SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber superappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber = !(gVar instanceof SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber) ? (SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber) gVar : null;
                String a = superappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber == null ? superappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber.getA() : null;
                superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.L$0 = null;
                superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label = 2;
                Object K = this.K(a, superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1 = new SuperappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking2 = ((SuperappTrackingCardExperiment) obj2).g;
        if (deliveryTracking2 == null) {
        }
        if (!(gVar instanceof SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber)) {
        }
        if (superappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber == null) {
        }
        superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.L$0 = null;
        superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1.label = 2;
        Object K2 = this.K(a, superappTrackingCardRepository$deliveryServiceObjectWithOutlinedPlateDefaultIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$deprioritizeChargersOrderIcon$1 superappTrackingCardRepository$deprioritizeChargersOrderIcon$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$deprioritizeChargersOrderIcon$1) {
            superappTrackingCardRepository$deprioritizeChargersOrderIcon$1 = (SuperappTrackingCardRepository$deprioritizeChargersOrderIcon$1) continuationImpl;
            int i2 = superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.L$0 = this;
                    superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$deprioritizeChargersOrderIcon$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ChargersTracking chargersTracking = ((SuperappTrackingCardExperiment) obj).i;
                Boolean valueOf = chargersTracking == null ? Boolean.valueOf(chargersTracking.c) : null;
                superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.L$0 = null;
                superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label = 2;
                Object J = this.J(valueOf, superappTrackingCardRepository$deprioritizeChargersOrderIcon$1);
                return J != coroutineSingletons ? coroutineSingletons : J;
            }
        }
        superappTrackingCardRepository$deprioritizeChargersOrderIcon$1 = new SuperappTrackingCardRepository$deprioritizeChargersOrderIcon$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ChargersTracking chargersTracking2 = ((SuperappTrackingCardExperiment) obj2).i;
        if (chargersTracking2 == null) {
        }
        superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.L$0 = null;
        superappTrackingCardRepository$deprioritizeChargersOrderIcon$1.label = 2;
        Object J2 = this.J(valueOf, superappTrackingCardRepository$deprioritizeChargersOrderIcon$1);
        if (J2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1 superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1) {
            superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1 = (SuperappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1) continuationImpl;
            int i2 = superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.L$0 = this;
                    superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking = ((SuperappTrackingCardExperiment) obj).g;
                Boolean valueOf = deliveryTracking == null ? Boolean.valueOf(deliveryTracking.c) : null;
                superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.L$0 = null;
                superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label = 2;
                Object J = this.J(valueOf, superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1);
                return J != coroutineSingletons ? coroutineSingletons : J;
            }
        }
        superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1 = new SuperappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking2 = ((SuperappTrackingCardExperiment) obj2).g;
        if (deliveryTracking2 == null) {
        }
        superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.L$0 = null;
        superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1.label = 2;
        Object J2 = this.J(valueOf, superappTrackingCardRepository$deprioritizeDeliveryOrderIcon$1);
        if (J2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$driveServiceDefaultIconTag$1 superappTrackingCardRepository$driveServiceDefaultIconTag$1;
        int i;
        if (continuationImpl instanceof SuperappTrackingCardRepository$driveServiceDefaultIconTag$1) {
            superappTrackingCardRepository$driveServiceDefaultIconTag$1 = (SuperappTrackingCardRepository$driveServiceDefaultIconTag$1) continuationImpl;
            int i2 = superappTrackingCardRepository$driveServiceDefaultIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$driveServiceDefaultIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$driveServiceDefaultIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$driveServiceDefaultIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$driveServiceDefaultIconTag$1.L$0 = this;
                    superappTrackingCardRepository$driveServiceDefaultIconTag$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$driveServiceDefaultIconTag$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$driveServiceDefaultIconTag$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.DriveTracking driveTracking = ((SuperappTrackingCardExperiment) obj).e;
                String str = driveTracking == null ? driveTracking.a : null;
                superappTrackingCardRepository$driveServiceDefaultIconTag$1.L$0 = null;
                superappTrackingCardRepository$driveServiceDefaultIconTag$1.label = 2;
                Object K = this.K(str, superappTrackingCardRepository$driveServiceDefaultIconTag$1);
                return K != coroutineSingletons ? coroutineSingletons : K;
            }
        }
        superappTrackingCardRepository$driveServiceDefaultIconTag$1 = new SuperappTrackingCardRepository$driveServiceDefaultIconTag$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$driveServiceDefaultIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$driveServiceDefaultIconTag$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.DriveTracking driveTracking2 = ((SuperappTrackingCardExperiment) obj2).e;
        if (driveTracking2 == null) {
        }
        superappTrackingCardRepository$driveServiceDefaultIconTag$1.L$0 = null;
        superappTrackingCardRepository$driveServiceDefaultIconTag$1.label = 2;
        Object K2 = this.K(str, superappTrackingCardRepository$driveServiceDefaultIconTag$1);
        if (K2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$externalServiceIconPlacement$1 superappTrackingCardRepository$externalServiceIconPlacement$1;
        int i;
        SuperappTrackingCardExperiment.HorizontalPlacement horizontalPlacement;
        if (continuationImpl instanceof SuperappTrackingCardRepository$externalServiceIconPlacement$1) {
            superappTrackingCardRepository$externalServiceIconPlacement$1 = (SuperappTrackingCardRepository$externalServiceIconPlacement$1) continuationImpl;
            int i2 = superappTrackingCardRepository$externalServiceIconPlacement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$externalServiceIconPlacement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$externalServiceIconPlacement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$externalServiceIconPlacement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$externalServiceIconPlacement$1.L$0 = this;
                    superappTrackingCardRepository$externalServiceIconPlacement$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$externalServiceIconPlacement$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (y) superappTrackingCardRepository$externalServiceIconPlacement$1.L$0;
                    kotlin.b.b(obj);
                }
                SuperappTrackingCardExperiment.ExternalServiceTracking externalServiceTracking = ((SuperappTrackingCardExperiment) obj).j;
                TrackingCardElementHorizontalPlacement O = (externalServiceTracking != null || (horizontalPlacement = externalServiceTracking.a) == null) ? null : O(horizontalPlacement);
                superappTrackingCardRepository$externalServiceIconPlacement$1.L$0 = null;
                superappTrackingCardRepository$externalServiceIconPlacement$1.label = 2;
                Enum I = this.I(O, superappTrackingCardRepository$externalServiceIconPlacement$1);
                return I != coroutineSingletons ? coroutineSingletons : I;
            }
        }
        superappTrackingCardRepository$externalServiceIconPlacement$1 = new SuperappTrackingCardRepository$externalServiceIconPlacement$1(this, continuationImpl);
        Object obj2 = superappTrackingCardRepository$externalServiceIconPlacement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$externalServiceIconPlacement$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.ExternalServiceTracking externalServiceTracking2 = ((SuperappTrackingCardExperiment) obj2).j;
        if (externalServiceTracking2 != null) {
        }
        superappTrackingCardRepository$externalServiceIconPlacement$1.L$0 = null;
        superappTrackingCardRepository$externalServiceIconPlacement$1.label = 2;
        Enum I2 = this.I(O, superappTrackingCardRepository$externalServiceIconPlacement$1);
        if (I2 != coroutineSingletons2) {
        }
    }

    public final int p() {
        return ((Number) tje.Y(EmptyCoroutineContext.a, new SuperappTrackingCardRepository$horizontalPadding$1(this, null))).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1 superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1;
        int i;
        SuperappTrackingCardExperiment.ChargersTracking chargersTracking;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1) {
            superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1 = (SuperappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                chargersTracking = ((SuperappTrackingCardExperiment) obj).i;
                if ((chargersTracking != null ? chargersTracking.e : null) instanceof s) {
                    return Boolean.FALSE;
                }
                superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.label = 2;
                Object f = f(superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1);
                return f == obj2 ? obj2 : f;
            }
        }
        superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1 = new SuperappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isChargersServiceOutlinedPlateNumberEnabled$1.label;
        if (i != 0) {
        }
        chargersTracking = ((SuperappTrackingCardExperiment) obj3).i;
        if ((chargersTracking != null ? chargersTracking.e : null) instanceof s) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1 superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1;
        int i;
        SuperappTrackingCardExperiment.DeliveryTracking deliveryTracking;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1) {
            superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1 = (SuperappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                deliveryTracking = ((SuperappTrackingCardExperiment) obj).g;
                if ((deliveryTracking != null ? deliveryTracking.d : null) instanceof SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber) {
                    return Boolean.FALSE;
                }
                superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.label = 2;
                Object f = f(superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1);
                return f == obj2 ? obj2 : f;
            }
        }
        superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1 = new SuperappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isDeliveryServiceOutlinedPlateNumberEnabled$1.label;
        if (i != 0) {
        }
        deliveryTracking = ((SuperappTrackingCardExperiment) obj3).g;
        if ((deliveryTracking != null ? deliveryTracking.d : null) instanceof SuperappTrackingCardExperiment$DeliveryTracking$ObjectWithPlateNumber$OutlinedPlateNumber) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1 superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1;
        int i;
        SuperappTrackingCardExperiment.DriveTracking driveTracking;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1) {
            superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1 = (SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                driveTracking = ((SuperappTrackingCardExperiment) obj).e;
                if ((driveTracking != null ? driveTracking.b : null) instanceof SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber) {
                    return Boolean.FALSE;
                }
                superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.label = 2;
                Object f = f(superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1);
                return f == obj2 ? obj2 : f;
            }
        }
        superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1 = new SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberEnabled$1.label;
        if (i != 0) {
        }
        driveTracking = ((SuperappTrackingCardExperiment) obj3).e;
        if ((driveTracking != null ? driveTracking.b : null) instanceof SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0044, code lost:
    
        if (r7 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1 superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1;
        Object obj;
        int i;
        SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber superappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1) {
            superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1 = (SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label = 1;
                    obj2 = this.b.a(superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    kotlin.b.b(obj2);
                }
                SuperappTrackingCardExperiment.DriveTracking driveTracking = ((SuperappTrackingCardExperiment) obj2).e;
                m mVar = driveTracking == null ? driveTracking.b : null;
                superappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber = !(mVar instanceof SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber) ? (SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber) mVar : null;
                if (superappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber == null && superappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber.getA() == SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber.Placement.Redesign2026) {
                    superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.L$0 = null;
                    superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label = 2;
                    Object f = f(superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1);
                    return f != obj ? obj : f;
                }
                return Boolean.FALSE;
            }
        }
        superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1 = new SuperappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1(this, continuationImpl);
        Object obj22 = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label;
        if (i != 0) {
        }
        SuperappTrackingCardExperiment.DriveTracking driveTracking2 = ((SuperappTrackingCardExperiment) obj22).e;
        if (driveTracking2 == null) {
        }
        if (!(mVar instanceof SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber)) {
        }
        if (superappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber == null) {
            return Boolean.FALSE;
        }
        superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.L$0 = null;
        superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1.label = 2;
        Object f2 = f(superappTrackingCardRepository$isDriveServiceOutlinedPlateNumberNewPlacementEnabled$1);
        if (f2 != obj) {
        }
    }

    public final boolean u() {
        return ((Boolean) tje.Y(EmptyCoroutineContext.a, new SuperappTrackingCardRepository$isEnabledBlocking$1(this, null))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isExternalServiceTimelineEnabled$1 superappTrackingCardRepository$isExternalServiceTimelineEnabled$1;
        int i;
        SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline.Type type;
        SuperappTrackingCardExperiment.ExternalServiceTracking externalServiceTracking;
        SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline timeline;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isExternalServiceTimelineEnabled$1) {
            superappTrackingCardRepository$isExternalServiceTimelineEnabled$1 = (SuperappTrackingCardRepository$isExternalServiceTimelineEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.label;
                type = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isExternalServiceTimelineEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                externalServiceTracking = ((SuperappTrackingCardExperiment) obj).j;
                if (externalServiceTracking != null && (timeline = externalServiceTracking.b) != null) {
                    type = timeline.getA();
                }
                if (type == SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline.Type.Circle) {
                    return Boolean.FALSE;
                }
                superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.label = 2;
                Object f = f(superappTrackingCardRepository$isExternalServiceTimelineEnabled$1);
                return f == obj2 ? obj2 : f;
            }
        }
        superappTrackingCardRepository$isExternalServiceTimelineEnabled$1 = new SuperappTrackingCardRepository$isExternalServiceTimelineEnabled$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isExternalServiceTimelineEnabled$1.label;
        type = null;
        if (i != 0) {
        }
        externalServiceTracking = ((SuperappTrackingCardExperiment) obj3).j;
        if (externalServiceTracking != null) {
            type = timeline.getA();
        }
        if (type == SuperappTrackingCardExperiment.ExternalServiceTracking.Timeline.Type.Circle) {
        }
    }

    public final boolean w() {
        return ((Boolean) tje.Y(EmptyCoroutineContext.a, new SuperappTrackingCardRepository$isExternalServiceTimelineEnabledBlocking$1(this, null))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1 superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1;
        int i;
        SuperappTrackingCardExperiment.ScootersTracking scootersTracking;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1) {
            superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1 = (SuperappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                scootersTracking = ((SuperappTrackingCardExperiment) obj).f;
                if ((scootersTracking != null ? scootersTracking.c : null) instanceof s) {
                    return Boolean.FALSE;
                }
                superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.label = 2;
                Object f = f(superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1);
                return f == obj2 ? obj2 : f;
            }
        }
        superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1 = new SuperappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isScootersServiceOutlinedPlateNumberEnabled$1.label;
        if (i != 0) {
        }
        scootersTracking = ((SuperappTrackingCardExperiment) obj3).f;
        if ((scootersTracking != null ? scootersTracking.c : null) instanceof s) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(ContinuationImpl continuationImpl) {
        SuperappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1 superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1;
        int i;
        SuperappTrackingCardExperiment.TaxiTracking taxiTracking;
        if (continuationImpl instanceof SuperappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1) {
            superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1 = (SuperappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1) continuationImpl;
            int i2 = superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.label = 1;
                    obj = this.b.a(superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                taxiTracking = ((SuperappTrackingCardExperiment) obj).d;
                if ((taxiTracking != null ? taxiTracking.c : null) instanceof s) {
                    return Boolean.FALSE;
                }
                superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.label = 2;
                Object f = f(superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1);
                return f == obj2 ? obj2 : f;
            }
        }
        superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1 = new SuperappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1(this, continuationImpl);
        Object obj3 = superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappTrackingCardRepository$isTaxiServiceOutlinedPlateNumberEnabled$1.label;
        if (i != 0) {
        }
        taxiTracking = ((SuperappTrackingCardExperiment) obj3).d;
        if ((taxiTracking != null ? taxiTracking.c : null) instanceof s) {
        }
    }

    public final int z() {
        return ((Number) tje.Y(EmptyCoroutineContext.a, new SuperappTrackingCardRepository$minHeight$1(this, null))).intValue();
    }
}
