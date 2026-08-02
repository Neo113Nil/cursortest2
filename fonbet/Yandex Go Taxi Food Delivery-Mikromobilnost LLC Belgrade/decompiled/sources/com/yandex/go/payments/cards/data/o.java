package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.VerificationsParam;
import com.yandex.go.payments.cards.data.model.VerificationsResponse;
import com.yandex.go.payments.cards.data.model.VerificationsStatusResponse;
import com.yandex.go.payments.cards.data.model.r;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.bvu0;
import defpackage.cmt;
import defpackage.el11;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.h2t;
import defpackage.j831;
import defpackage.jl40;
import defpackage.k931;
import defpackage.kp50;
import defpackage.l931;
import defpackage.l9z;
import defpackage.m831;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.u32;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class o {
    public final l9z a;
    public final k931 b;
    public final com.yandex.go.payments.di.a c;
    public final u32 d;
    public final com.yandex.go.payments.cards.experiments.a e;
    public final h2t f = new h2t(new el11(10, this));
    public final e g = new e((Object) null);
    public volatile j831 h;

    public o(l9z l9zVar, k931 k931Var, com.yandex.go.payments.di.a aVar, u32 u32Var, com.yandex.go.payments.cards.experiments.a aVar2) {
        this.a = l9zVar;
        this.b = k931Var;
        this.c = aVar;
        this.d = u32Var;
        this.e = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b5, code lost:
    
        if (r15 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, int i, j831 j831Var, boolean z, VerificationStatus verificationStatus, Integer num, ContinuationImpl continuationImpl) {
        VerificationV4Repository$checkVerificationStatus$1 verificationV4Repository$checkVerificationStatus$1;
        int i2;
        String Hg;
        String str;
        int i3;
        boolean z2;
        j831 j831Var2;
        Integer num2;
        String str2;
        VerificationApiV4 verificationApiV4;
        VerificationStatus verificationStatus2;
        j831 j831Var3;
        VerificationsStatusResponse verificationsStatusResponse;
        Long m;
        Long m2;
        VerificationStatus verificationStatus3;
        oVar.getClass();
        if (continuationImpl instanceof VerificationV4Repository$checkVerificationStatus$1) {
            verificationV4Repository$checkVerificationStatus$1 = (VerificationV4Repository$checkVerificationStatus$1) continuationImpl;
            int i4 = verificationV4Repository$checkVerificationStatus$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                verificationV4Repository$checkVerificationStatus$1.label = i4 - Integer.MIN_VALUE;
                Object obj = verificationV4Repository$checkVerificationStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = verificationV4Repository$checkVerificationStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.di.a aVar = oVar.c;
                    verificationV4Repository$checkVerificationStatus$1.L$0 = j831Var;
                    verificationV4Repository$checkVerificationStatus$1.L$1 = verificationStatus;
                    verificationV4Repository$checkVerificationStatus$1.L$2 = num;
                    verificationV4Repository$checkVerificationStatus$1.I$0 = i;
                    verificationV4Repository$checkVerificationStatus$1.Z$0 = z;
                    verificationV4Repository$checkVerificationStatus$1.label = 1;
                    obj = aVar.a(verificationV4Repository$checkVerificationStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z2 = verificationV4Repository$checkVerificationStatus$1.Z$0;
                            num2 = (Integer) verificationV4Repository$checkVerificationStatus$1.L$2;
                            verificationStatus2 = (VerificationStatus) verificationV4Repository$checkVerificationStatus$1.L$1;
                            j831Var3 = (j831) verificationV4Repository$checkVerificationStatus$1.L$0;
                            kotlin.b.b(obj);
                            fmt fmtVar = (fmt) obj;
                            verificationsStatusResponse = (VerificationsStatusResponse) fmtVar.a;
                            oeu oeuVar = fmtVar.e;
                            VerificationsStatusResponse.Companion.getClass();
                            r.a(verificationsStatusResponse);
                            String a = oeuVar.a("X-Yataxi-Polling-Interval-Ms");
                            m = a == null ? bvu0.m(10, a) : null;
                            String a2 = oeuVar.a("X-Yataxi-Polling-Deadline-Ms");
                            m2 = a2 == null ? bvu0.m(10, a2) : null;
                            verificationStatus3 = verificationsStatusResponse.a;
                            if (verificationStatus3 != VerificationStatus.IN_PROGRESS || verificationStatus3 == VerificationStatus.RECEIVED_3DS_STATUS) {
                                throw new VerificationV4Repository$ResponseInProgressException(verificationsStatusResponse, m, m2);
                            }
                            if (z2 && verificationStatus3 == VerificationStatus.REQUIRED_3DS) {
                                if (jl40.l(verificationsStatusResponse.c, j831Var3 != null ? j831Var3.n : null)) {
                                    throw new VerificationV4Repository$ResponseInProgressException(verificationsStatusResponse, m, m2);
                                }
                            }
                            if (verificationStatus3 == VerificationStatus.REQUIRED_3DS) {
                                oVar.h = j831Var3;
                            }
                            if (verificationStatus3 == VerificationStatus.SUCCESS) {
                                oVar.d.i(verificationsStatusResponse.b(), j831Var3);
                                return verificationsStatusResponse;
                            }
                            if (verificationStatus3 != VerificationStatus.FAILURE && verificationStatus2 == verificationStatus3 && num2 != null) {
                                int intValue = num2.intValue();
                                Integer num3 = verificationsStatusResponse.g;
                                if (num3 != null && intValue == num3.intValue()) {
                                    throw new VerificationV4Repository$ResponseInProgressException(verificationsStatusResponse, m, m2);
                                }
                            }
                            return verificationsStatusResponse;
                        }
                        z2 = verificationV4Repository$checkVerificationStatus$1.Z$0;
                        int i5 = verificationV4Repository$checkVerificationStatus$1.I$0;
                        String str3 = (String) verificationV4Repository$checkVerificationStatus$1.L$9;
                        String str4 = (String) verificationV4Repository$checkVerificationStatus$1.L$8;
                        str2 = (String) verificationV4Repository$checkVerificationStatus$1.L$7;
                        VerificationApiV4 verificationApiV42 = (VerificationApiV4) verificationV4Repository$checkVerificationStatus$1.L$6;
                        Integer num4 = (Integer) verificationV4Repository$checkVerificationStatus$1.L$2;
                        VerificationStatus verificationStatus4 = (VerificationStatus) verificationV4Repository$checkVerificationStatus$1.L$1;
                        j831Var2 = (j831) verificationV4Repository$checkVerificationStatus$1.L$0;
                        kotlin.b.b(obj);
                        i3 = i5;
                        num2 = num4;
                        verificationApiV4 = verificationApiV42;
                        Hg = str4;
                        verificationStatus = verificationStatus4;
                        str = str3;
                        cmt<VerificationsStatusResponse> b = verificationApiV4.b(str2, Hg, str, (Set) obj);
                        verificationV4Repository$checkVerificationStatus$1.L$0 = j831Var2;
                        verificationV4Repository$checkVerificationStatus$1.L$1 = verificationStatus;
                        verificationV4Repository$checkVerificationStatus$1.L$2 = num2;
                        verificationV4Repository$checkVerificationStatus$1.L$3 = null;
                        verificationV4Repository$checkVerificationStatus$1.L$4 = null;
                        verificationV4Repository$checkVerificationStatus$1.L$5 = null;
                        verificationV4Repository$checkVerificationStatus$1.L$6 = null;
                        verificationV4Repository$checkVerificationStatus$1.L$7 = null;
                        verificationV4Repository$checkVerificationStatus$1.L$8 = null;
                        verificationV4Repository$checkVerificationStatus$1.L$9 = null;
                        verificationV4Repository$checkVerificationStatus$1.I$0 = i3;
                        verificationV4Repository$checkVerificationStatus$1.Z$0 = z2;
                        verificationV4Repository$checkVerificationStatus$1.label = 3;
                        obj = b.a(verificationV4Repository$checkVerificationStatus$1);
                        if (obj != obj2) {
                            verificationStatus2 = verificationStatus;
                            j831Var3 = j831Var2;
                            fmt fmtVar2 = (fmt) obj;
                            verificationsStatusResponse = (VerificationsStatusResponse) fmtVar2.a;
                            oeu oeuVar2 = fmtVar2.e;
                            VerificationsStatusResponse.Companion.getClass();
                            r.a(verificationsStatusResponse);
                            String a3 = oeuVar2.a("X-Yataxi-Polling-Interval-Ms");
                            if (a3 == null) {
                            }
                            String a22 = oeuVar2.a("X-Yataxi-Polling-Deadline-Ms");
                            if (a22 == null) {
                            }
                            verificationStatus3 = verificationsStatusResponse.a;
                            if (verificationStatus3 != VerificationStatus.IN_PROGRESS) {
                            }
                            throw new VerificationV4Repository$ResponseInProgressException(verificationsStatusResponse, m, m2);
                        }
                        return obj2;
                    }
                    z = verificationV4Repository$checkVerificationStatus$1.Z$0;
                    i = verificationV4Repository$checkVerificationStatus$1.I$0;
                    num = (Integer) verificationV4Repository$checkVerificationStatus$1.L$2;
                    verificationStatus = (VerificationStatus) verificationV4Repository$checkVerificationStatus$1.L$1;
                    j831Var = (j831) verificationV4Repository$checkVerificationStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                String str5 = (String) obj;
                Hg = oVar.c.b.Hg();
                if (Hg != null) {
                    ny61.r("Missing user id");
                    return null;
                }
                str = j831Var != null ? j831Var.b : null;
                if (str == null) {
                    str = "";
                }
                VerificationApiV4 d = oVar.d();
                String h = kp50.h(str5);
                verificationV4Repository$checkVerificationStatus$1.L$0 = j831Var;
                verificationV4Repository$checkVerificationStatus$1.L$1 = verificationStatus;
                verificationV4Repository$checkVerificationStatus$1.L$2 = num;
                verificationV4Repository$checkVerificationStatus$1.L$3 = null;
                verificationV4Repository$checkVerificationStatus$1.L$4 = null;
                verificationV4Repository$checkVerificationStatus$1.L$5 = null;
                verificationV4Repository$checkVerificationStatus$1.L$6 = d;
                verificationV4Repository$checkVerificationStatus$1.L$7 = h;
                verificationV4Repository$checkVerificationStatus$1.L$8 = Hg;
                verificationV4Repository$checkVerificationStatus$1.L$9 = str;
                verificationV4Repository$checkVerificationStatus$1.I$0 = i;
                verificationV4Repository$checkVerificationStatus$1.Z$0 = z;
                verificationV4Repository$checkVerificationStatus$1.label = 2;
                Object c = oVar.c(verificationV4Repository$checkVerificationStatus$1);
                if (c != obj2) {
                    boolean z3 = z;
                    i3 = i;
                    z2 = z3;
                    j831Var2 = j831Var;
                    num2 = num;
                    str2 = h;
                    obj = c;
                    verificationApiV4 = d;
                    cmt<VerificationsStatusResponse> b2 = verificationApiV4.b(str2, Hg, str, (Set) obj);
                    verificationV4Repository$checkVerificationStatus$1.L$0 = j831Var2;
                    verificationV4Repository$checkVerificationStatus$1.L$1 = verificationStatus;
                    verificationV4Repository$checkVerificationStatus$1.L$2 = num2;
                    verificationV4Repository$checkVerificationStatus$1.L$3 = null;
                    verificationV4Repository$checkVerificationStatus$1.L$4 = null;
                    verificationV4Repository$checkVerificationStatus$1.L$5 = null;
                    verificationV4Repository$checkVerificationStatus$1.L$6 = null;
                    verificationV4Repository$checkVerificationStatus$1.L$7 = null;
                    verificationV4Repository$checkVerificationStatus$1.L$8 = null;
                    verificationV4Repository$checkVerificationStatus$1.L$9 = null;
                    verificationV4Repository$checkVerificationStatus$1.I$0 = i3;
                    verificationV4Repository$checkVerificationStatus$1.Z$0 = z2;
                    verificationV4Repository$checkVerificationStatus$1.label = 3;
                    obj = b2.a(verificationV4Repository$checkVerificationStatus$1);
                    if (obj != obj2) {
                    }
                }
                return obj2;
            }
        }
        verificationV4Repository$checkVerificationStatus$1 = new VerificationV4Repository$checkVerificationStatus$1(oVar, continuationImpl);
        Object obj3 = verificationV4Repository$checkVerificationStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = verificationV4Repository$checkVerificationStatus$1.label;
        if (i2 != 0) {
        }
        String str52 = (String) obj3;
        Hg = oVar.c.b.Hg();
        if (Hg != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r15 == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, l931 l931Var, ContinuationImpl continuationImpl) {
        VerificationV4Repository$checkVerificationStatus$2 verificationV4Repository$checkVerificationStatus$2;
        int i;
        String Hg;
        VerificationApiV4 d;
        String str;
        String str2;
        m831 m831Var;
        String str3;
        String str4;
        l9z l9zVar = oVar.a;
        com.yandex.go.payments.di.a aVar = oVar.c;
        if (continuationImpl instanceof VerificationV4Repository$checkVerificationStatus$2) {
            verificationV4Repository$checkVerificationStatus$2 = (VerificationV4Repository$checkVerificationStatus$2) continuationImpl;
            int i2 = verificationV4Repository$checkVerificationStatus$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationV4Repository$checkVerificationStatus$2.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationV4Repository$checkVerificationStatus$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationV4Repository$checkVerificationStatus$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    verificationV4Repository$checkVerificationStatus$2.L$0 = l931Var;
                    verificationV4Repository$checkVerificationStatus$2.label = 1;
                    obj = aVar.a(verificationV4Repository$checkVerificationStatus$2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        str2 = (String) verificationV4Repository$checkVerificationStatus$2.L$11;
                        str3 = (String) verificationV4Repository$checkVerificationStatus$2.L$10;
                        m831Var = (m831) verificationV4Repository$checkVerificationStatus$2.L$9;
                        str4 = (String) verificationV4Repository$checkVerificationStatus$2.L$8;
                        Hg = (String) verificationV4Repository$checkVerificationStatus$2.L$7;
                        str = (String) verificationV4Repository$checkVerificationStatus$2.L$6;
                        d = (VerificationApiV4) verificationV4Repository$checkVerificationStatus$2.L$5;
                        kotlin.b.b(obj);
                        cmt<VerificationsResponse> a = d.a(str, Hg, str4, new VerificationsParam(m831Var, str3, str2, (Set) obj));
                        verificationV4Repository$checkVerificationStatus$2.L$0 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$1 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$2 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$3 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$4 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$5 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$6 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$7 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$8 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$9 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$10 = null;
                        verificationV4Repository$checkVerificationStatus$2.L$11 = null;
                        verificationV4Repository$checkVerificationStatus$2.label = 3;
                        Object d2 = ru.yandex.taxi.network.api.a.d(a, verificationV4Repository$checkVerificationStatus$2);
                        return d2 != obj2 ? obj2 : d2;
                    }
                    l931Var = (l931) verificationV4Repository$checkVerificationStatus$2.L$0;
                    kotlin.b.b(obj);
                }
                String str5 = (String) obj;
                Hg = aVar.b.Hg();
                if (Hg != null) {
                    ny61.r("Missing user id");
                    return null;
                }
                String a2 = l9zVar.a();
                PaymentMethods.LocationInfo locationInfo = l9zVar.a.b.g().o;
                String str6 = locationInfo != null ? locationInfo.b : null;
                oVar.d.a(!(a2 == null || evu0.J(a2)), true ^ (str6 == null || evu0.J(str6)));
                d = oVar.d();
                String h = kp50.h(str5);
                String str7 = l931Var.b;
                m831 m831Var2 = l931Var.a;
                verificationV4Repository$checkVerificationStatus$2.L$0 = null;
                verificationV4Repository$checkVerificationStatus$2.L$1 = null;
                verificationV4Repository$checkVerificationStatus$2.L$2 = null;
                verificationV4Repository$checkVerificationStatus$2.L$3 = null;
                verificationV4Repository$checkVerificationStatus$2.L$4 = null;
                verificationV4Repository$checkVerificationStatus$2.L$5 = d;
                verificationV4Repository$checkVerificationStatus$2.L$6 = h;
                verificationV4Repository$checkVerificationStatus$2.L$7 = Hg;
                verificationV4Repository$checkVerificationStatus$2.L$8 = str7;
                verificationV4Repository$checkVerificationStatus$2.L$9 = m831Var2;
                verificationV4Repository$checkVerificationStatus$2.L$10 = a2;
                verificationV4Repository$checkVerificationStatus$2.L$11 = str6;
                verificationV4Repository$checkVerificationStatus$2.label = 2;
                Object c = oVar.c(verificationV4Repository$checkVerificationStatus$2);
                if (c != obj2) {
                    str = h;
                    obj = c;
                    str2 = str6;
                    m831Var = m831Var2;
                    str3 = a2;
                    str4 = str7;
                    cmt<VerificationsResponse> a3 = d.a(str, Hg, str4, new VerificationsParam(m831Var, str3, str2, (Set) obj));
                    verificationV4Repository$checkVerificationStatus$2.L$0 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$1 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$2 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$3 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$4 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$5 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$6 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$7 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$8 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$9 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$10 = null;
                    verificationV4Repository$checkVerificationStatus$2.L$11 = null;
                    verificationV4Repository$checkVerificationStatus$2.label = 3;
                    Object d22 = ru.yandex.taxi.network.api.a.d(a3, verificationV4Repository$checkVerificationStatus$2);
                    if (d22 != obj2) {
                    }
                }
            }
        }
        verificationV4Repository$checkVerificationStatus$2 = new VerificationV4Repository$checkVerificationStatus$2(oVar, continuationImpl);
        Object obj3 = verificationV4Repository$checkVerificationStatus$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationV4Repository$checkVerificationStatus$2.label;
        if (i != 0) {
        }
        String str52 = (String) obj3;
        Hg = aVar.b.Hg();
        if (Hg != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        VerificationV4Repository$buildSupportedFeatures$1 verificationV4Repository$buildSupportedFeatures$1;
        int i;
        Set set;
        if (continuationImpl instanceof VerificationV4Repository$buildSupportedFeatures$1) {
            verificationV4Repository$buildSupportedFeatures$1 = (VerificationV4Repository$buildSupportedFeatures$1) continuationImpl;
            int i2 = verificationV4Repository$buildSupportedFeatures$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationV4Repository$buildSupportedFeatures$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationV4Repository$buildSupportedFeatures$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationV4Repository$buildSupportedFeatures$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set singleton = Collections.singleton("3ds_polling");
                    verificationV4Repository$buildSupportedFeatures$1.L$0 = singleton;
                    verificationV4Repository$buildSupportedFeatures$1.L$1 = null;
                    verificationV4Repository$buildSupportedFeatures$1.label = 1;
                    Object a = this.e.a(verificationV4Repository$buildSupportedFeatures$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    set = singleton;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) verificationV4Repository$buildSupportedFeatures$1.L$0;
                    kotlin.b.b(obj);
                }
                Set set2 = ((Boolean) obj).booleanValue() ? set : null;
                return set2 != null ? EmptySet.a : set2;
            }
        }
        verificationV4Repository$buildSupportedFeatures$1 = new VerificationV4Repository$buildSupportedFeatures$1(this, continuationImpl);
        Object obj2 = verificationV4Repository$buildSupportedFeatures$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationV4Repository$buildSupportedFeatures$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (set2 != null) {
        }
    }

    public final VerificationApiV4 d() {
        k931 k931Var = this.b;
        return (VerificationApiV4) k931Var.f.m(k931Var.a, k931Var.b, k931Var.e.a(), VerificationApiV4.class, new VerificationV4ApiFactory$api$1(1, k931Var, k931.class, "configureRetrofit", "configureRetrofit(Lretrofit2/Retrofit$Builder;)Lretrofit2/Retrofit$Builder;", 0));
    }
}
