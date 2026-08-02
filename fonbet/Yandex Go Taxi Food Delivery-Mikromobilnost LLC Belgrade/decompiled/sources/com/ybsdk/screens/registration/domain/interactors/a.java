package com.ybsdk.screens.registration.domain.interactors;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.screens.registration.data.b;
import com.ybsdk.screens.registration.data.c;
import defpackage.jqr;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.q1e0;
import defpackage.r6a0;
import defpackage.tpr;
import defpackage.wls;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final nbp0 a;
    public final b b;
    public final com.ybsdk.common.repositiories.agreements.a c;
    public final c d;
    public final com.ybsdk.screens.registration.data.a e;
    public final com.ybsdk.common.repositiories.onboarding.a f;
    public final r6a0 g;

    public a(nbp0 nbp0Var, b bVar, com.ybsdk.common.repositiories.agreements.a aVar, c cVar, com.ybsdk.screens.registration.data.a aVar2, com.ybsdk.common.repositiories.onboarding.a aVar3, r6a0 r6a0Var) {
        this.a = nbp0Var;
        this.b = bVar;
        this.c = aVar;
        this.d = cVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = r6a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ApplicationsInteractor$getRegistrationNext$1 applicationsInteractor$getRegistrationNext$1;
        int i;
        if (continuationImpl instanceof ApplicationsInteractor$getRegistrationNext$1) {
            applicationsInteractor$getRegistrationNext$1 = (ApplicationsInteractor$getRegistrationNext$1) continuationImpl;
            int i2 = applicationsInteractor$getRegistrationNext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationsInteractor$getRegistrationNext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationsInteractor$getRegistrationNext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationsInteractor$getRegistrationNext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    applicationsInteractor$getRegistrationNext$1.label = 1;
                    Object a = this.f.a(str, str2, str3, applicationsInteractor$getRegistrationNext$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        applicationsInteractor$getRegistrationNext$1 = new ApplicationsInteractor$getRegistrationNext$1(this, continuationImpl);
        Object obj2 = applicationsInteractor$getRegistrationNext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationsInteractor$getRegistrationNext$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(YBProduct yBProduct, com.ybsdk.screens.registration.applicationstatus.presentation.c cVar, Map map, ContinuationImpl continuationImpl) {
        ApplicationsInteractor$openProduct$1 applicationsInteractor$openProduct$1;
        int i;
        if (continuationImpl instanceof ApplicationsInteractor$openProduct$1) {
            applicationsInteractor$openProduct$1 = (ApplicationsInteractor$openProduct$1) continuationImpl;
            int i2 = applicationsInteractor$openProduct$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationsInteractor$openProduct$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationsInteractor$openProduct$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationsInteractor$openProduct$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object name = yBProduct.name();
                wls applicationsInteractor$openProduct$2 = new ApplicationsInteractor$openProduct$2(this, yBProduct, map, null);
                applicationsInteractor$openProduct$1.label = 1;
                Object O = cVar.O(applicationsInteractor$openProduct$2, name, applicationsInteractor$openProduct$1);
                return O == obj2 ? obj2 : O;
            }
        }
        applicationsInteractor$openProduct$1 = new ApplicationsInteractor$openProduct$1(this, continuationImpl);
        Object obj3 = applicationsInteractor$openProduct$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationsInteractor$openProduct$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ApplicationsInteractor$startChangePhonePolling$1 applicationsInteractor$startChangePhonePolling$1;
        int i;
        if (continuationImpl instanceof ApplicationsInteractor$startChangePhonePolling$1) {
            applicationsInteractor$startChangePhonePolling$1 = (ApplicationsInteractor$startChangePhonePolling$1) continuationImpl;
            int i2 = applicationsInteractor$startChangePhonePolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationsInteractor$startChangePhonePolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationsInteractor$startChangePhonePolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationsInteractor$startChangePhonePolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    applicationsInteractor$startChangePhonePolling$1.label = 1;
                    obj = this.e.b(str, z, z2, applicationsInteractor$startChangePhonePolling$1);
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
                return new jqr((tpr) obj, new ApplicationsInteractor$startChangePhonePolling$2(this, null), 3);
            }
        }
        applicationsInteractor$startChangePhonePolling$1 = new ApplicationsInteractor$startChangePhonePolling$1(this, continuationImpl);
        Object obj2 = applicationsInteractor$startChangePhonePolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationsInteractor$startChangePhonePolling$1.label;
        if (i != 0) {
        }
        return new jqr((tpr) obj2, new ApplicationsInteractor$startChangePhonePolling$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, q1e0 q1e0Var, ContinuationImpl continuationImpl) {
        ApplicationsInteractor$startProductOpeningPolling$1 applicationsInteractor$startProductOpeningPolling$1;
        int i;
        if (continuationImpl instanceof ApplicationsInteractor$startProductOpeningPolling$1) {
            applicationsInteractor$startProductOpeningPolling$1 = (ApplicationsInteractor$startProductOpeningPolling$1) continuationImpl;
            int i2 = applicationsInteractor$startProductOpeningPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationsInteractor$startProductOpeningPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationsInteractor$startProductOpeningPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationsInteractor$startProductOpeningPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    applicationsInteractor$startProductOpeningPolling$1.label = 1;
                    obj = this.b.b(str, q1e0Var, applicationsInteractor$startProductOpeningPolling$1);
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
                return new jqr((tpr) obj, new ApplicationsInteractor$startProductOpeningPolling$2(this, null), 3);
            }
        }
        applicationsInteractor$startProductOpeningPolling$1 = new ApplicationsInteractor$startProductOpeningPolling$1(this, continuationImpl);
        Object obj2 = applicationsInteractor$startProductOpeningPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationsInteractor$startProductOpeningPolling$1.label;
        if (i != 0) {
        }
        return new jqr((tpr) obj2, new ApplicationsInteractor$startProductOpeningPolling$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(YBProduct yBProduct, Map map, ContinuationImpl continuationImpl) {
        ApplicationsInteractor$startRegistration$1 applicationsInteractor$startRegistration$1;
        int i;
        if (continuationImpl instanceof ApplicationsInteractor$startRegistration$1) {
            applicationsInteractor$startRegistration$1 = (ApplicationsInteractor$startRegistration$1) continuationImpl;
            int i2 = applicationsInteractor$startRegistration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationsInteractor$startRegistration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationsInteractor$startRegistration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationsInteractor$startRegistration$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    applicationsInteractor$startRegistration$1.label = 1;
                    Object c = this.d.c(yBProduct, map, applicationsInteractor$startRegistration$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        applicationsInteractor$startRegistration$1 = new ApplicationsInteractor$startRegistration$1(this, continuationImpl);
        Object obj2 = applicationsInteractor$startRegistration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationsInteractor$startRegistration$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, q1e0 q1e0Var, ContinuationImpl continuationImpl) {
        ApplicationsInteractor$startRegistrationStatusPolling$1 applicationsInteractor$startRegistrationStatusPolling$1;
        int i;
        if (continuationImpl instanceof ApplicationsInteractor$startRegistrationStatusPolling$1) {
            applicationsInteractor$startRegistrationStatusPolling$1 = (ApplicationsInteractor$startRegistrationStatusPolling$1) continuationImpl;
            int i2 = applicationsInteractor$startRegistrationStatusPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationsInteractor$startRegistrationStatusPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationsInteractor$startRegistrationStatusPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationsInteractor$startRegistrationStatusPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    applicationsInteractor$startRegistrationStatusPolling$1.label = 1;
                    obj = this.d.b(str, q1e0Var, applicationsInteractor$startRegistrationStatusPolling$1);
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
                return new jqr((tpr) obj, new ApplicationsInteractor$startRegistrationStatusPolling$2(this, null), 3);
            }
        }
        applicationsInteractor$startRegistrationStatusPolling$1 = new ApplicationsInteractor$startRegistrationStatusPolling$1(this, continuationImpl);
        Object obj2 = applicationsInteractor$startRegistrationStatusPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationsInteractor$startRegistrationStatusPolling$1.label;
        if (i != 0) {
        }
        return new jqr((tpr) obj2, new ApplicationsInteractor$startRegistrationStatusPolling$2(this, null), 3);
    }
}
