package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.PaymentVerificationsResponse;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.data.model.VerificationRequest;
import com.yandex.go.payments.cards.data.model.VerificationsStatusResponse;
import com.yandex.go.payments.cards.data.model.r;
import com.yandex.go.payments.cards.domain.exception.InvalidResponseException;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.bvu0;
import defpackage.cmt;
import defpackage.el11;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.h2t;
import defpackage.h731;
import defpackage.j831;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.l9z;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.p731;
import defpackage.u32;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class l {
    public final h731 a;
    public final com.yandex.go.payments.di.a b;
    public final l9z c;
    public final u32 d;
    public final com.yandex.go.payments.cards.experiments.a e;
    public volatile j831 g;
    public final h2t f = new h2t(new el11(9, this));
    public final e h = new e((Object) null);

    public l(h731 h731Var, com.yandex.go.payments.di.a aVar, l9z l9zVar, u32 u32Var, com.yandex.go.payments.cards.experiments.a aVar2) {
        this.a = h731Var;
        this.b = aVar;
        this.c = l9zVar;
        this.d = u32Var;
        this.e = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ba, code lost:
    
        if (r1 == r3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, j831 j831Var, int i, boolean z, ContinuationImpl continuationImpl) {
        VerificationRepository$requestVerificationStatus$1 verificationRepository$requestVerificationStatus$1;
        int i2;
        j831 j831Var2;
        int i3;
        boolean z2;
        String str;
        String Hg;
        String str2;
        j831 j831Var3;
        int i4;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        j831 j831Var4;
        boolean z3;
        String str8;
        lVar.getClass();
        if (continuationImpl instanceof VerificationRepository$requestVerificationStatus$1) {
            verificationRepository$requestVerificationStatus$1 = (VerificationRepository$requestVerificationStatus$1) continuationImpl;
            int i5 = verificationRepository$requestVerificationStatus$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                verificationRepository$requestVerificationStatus$1.label = i5 - Integer.MIN_VALUE;
                Object obj = verificationRepository$requestVerificationStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = verificationRepository$requestVerificationStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.payments.di.a aVar = lVar.b;
                    j831Var2 = j831Var;
                    verificationRepository$requestVerificationStatus$1.L$0 = j831Var2;
                    i3 = i;
                    verificationRepository$requestVerificationStatus$1.I$0 = i3;
                    z2 = z;
                    verificationRepository$requestVerificationStatus$1.Z$0 = z2;
                    verificationRepository$requestVerificationStatus$1.label = 1;
                    obj = aVar.a(verificationRepository$requestVerificationStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z3 = verificationRepository$requestVerificationStatus$1.Z$0;
                            j831 j831Var5 = (j831) verificationRepository$requestVerificationStatus$1.L$0;
                            kotlin.b.b(obj);
                            j831Var4 = j831Var5;
                            fmt fmtVar = (fmt) obj;
                            PaymentVerificationsResponse paymentVerificationsResponse = (PaymentVerificationsResponse) fmtVar.a;
                            oeu oeuVar = fmtVar.e;
                            com.yandex.go.payments.cards.data.model.m mVar = Verification.Companion;
                            Verification verification = paymentVerificationsResponse.b;
                            mVar.getClass();
                            VerificationsStatusResponse.Companion.getClass();
                            r.a(verification);
                            str8 = verification.a;
                            if (str8 != null || evu0.J(str8)) {
                                throw new InvalidResponseException("Verification does not have an id");
                            }
                            VerificationStatus verificationStatus = verification.c;
                            String a = oeuVar.a("X-Yataxi-Polling-Interval-Ms");
                            Long m = a != null ? bvu0.m(10, a) : null;
                            String a2 = oeuVar.a("X-Yataxi-Polling-Deadline-Ms");
                            Long m2 = a2 != null ? bvu0.m(10, a2) : null;
                            if (verificationStatus == VerificationStatus.IN_PROGRESS || verificationStatus == VerificationStatus.RECEIVED_3DS_STATUS) {
                                throw new VerificationRepository$ResponseInProgressException(verification, m, m2);
                            }
                            if (z3 && verificationStatus == VerificationStatus.REQUIRED_3DS && jl40.l(verification.e, j831Var4.n)) {
                                throw new VerificationRepository$ResponseInProgressException(verification, m, m2);
                            }
                            if (verificationStatus == VerificationStatus.REQUIRED_3DS) {
                                lVar.g = j831Var4;
                            }
                            if (verificationStatus == VerificationStatus.SUCCESS) {
                                lVar.d.i(verification.b(), j831Var4);
                            }
                            return new p731(j831Var4.a, verification, (String) null, j831Var4.m, j831Var4);
                        }
                        boolean z4 = verificationRepository$requestVerificationStatus$1.Z$0;
                        i4 = verificationRepository$requestVerificationStatus$1.I$0;
                        j831 j831Var6 = (j831) verificationRepository$requestVerificationStatus$1.L$8;
                        String str9 = (String) verificationRepository$requestVerificationStatus$1.L$7;
                        String str10 = (String) verificationRepository$requestVerificationStatus$1.L$6;
                        String str11 = (String) verificationRepository$requestVerificationStatus$1.L$5;
                        String str12 = (String) verificationRepository$requestVerificationStatus$1.L$4;
                        String str13 = (String) verificationRepository$requestVerificationStatus$1.L$3;
                        str = (String) verificationRepository$requestVerificationStatus$1.L$1;
                        j831 j831Var7 = (j831) verificationRepository$requestVerificationStatus$1.L$0;
                        kotlin.b.b(obj);
                        str7 = str10;
                        str6 = str11;
                        str5 = str13;
                        j831Var3 = j831Var6;
                        z2 = z4;
                        j831Var2 = j831Var7;
                        str3 = str12;
                        str4 = str9;
                        String str14 = str;
                        VerificationRequest verificationRequest = new VerificationRequest(str6, str7, str4, j831Var3, (Set) obj);
                        if (i4 == 0) {
                            lVar.d.c(!(str5 == null || evu0.J(str5)), !(str3 == null || evu0.J(str3)));
                        }
                        h731 h731Var = lVar.a;
                        cmt<PaymentVerificationsResponse> a3 = ((VerificationApi) h731Var.f.m(h731Var.a, h731Var.b, h731Var.e.a(), VerificationApi.class, new VerificationApiFactory$api$1(1, h731Var, h731.class, "configureRetrofit", "configureRetrofit(Lretrofit2/Retrofit$Builder;)Lretrofit2/Retrofit$Builder;", 0))).a(kp50.h(str14), j831Var2.l, verificationRequest);
                        verificationRepository$requestVerificationStatus$1.L$0 = j831Var2;
                        verificationRepository$requestVerificationStatus$1.L$1 = null;
                        verificationRepository$requestVerificationStatus$1.L$2 = null;
                        verificationRepository$requestVerificationStatus$1.L$3 = null;
                        verificationRepository$requestVerificationStatus$1.L$4 = null;
                        verificationRepository$requestVerificationStatus$1.L$5 = null;
                        verificationRepository$requestVerificationStatus$1.L$6 = null;
                        verificationRepository$requestVerificationStatus$1.L$7 = null;
                        verificationRepository$requestVerificationStatus$1.L$8 = null;
                        verificationRepository$requestVerificationStatus$1.I$0 = i4;
                        verificationRepository$requestVerificationStatus$1.Z$0 = z2;
                        verificationRepository$requestVerificationStatus$1.label = 3;
                        obj = a3.a(verificationRepository$requestVerificationStatus$1);
                        if (obj != obj2) {
                            j831Var4 = j831Var2;
                            z3 = z2;
                            fmt fmtVar2 = (fmt) obj;
                            PaymentVerificationsResponse paymentVerificationsResponse2 = (PaymentVerificationsResponse) fmtVar2.a;
                            oeu oeuVar2 = fmtVar2.e;
                            com.yandex.go.payments.cards.data.model.m mVar2 = Verification.Companion;
                            Verification verification2 = paymentVerificationsResponse2.b;
                            mVar2.getClass();
                            VerificationsStatusResponse.Companion.getClass();
                            r.a(verification2);
                            str8 = verification2.a;
                            if (str8 != null) {
                            }
                            throw new InvalidResponseException("Verification does not have an id");
                        }
                        return obj2;
                    }
                    boolean z5 = verificationRepository$requestVerificationStatus$1.Z$0;
                    i3 = verificationRepository$requestVerificationStatus$1.I$0;
                    j831 j831Var8 = (j831) verificationRepository$requestVerificationStatus$1.L$0;
                    kotlin.b.b(obj);
                    z2 = z5;
                    j831Var2 = j831Var8;
                }
                str = (String) obj;
                Hg = lVar.b.b.Hg();
                if (Hg != null) {
                    ny61.r("Missing user id");
                    return null;
                }
                String str15 = j831Var2.j;
                String a4 = (str15 == null || evu0.J(str15)) ? lVar.c.a() : j831Var2.j;
                String str16 = j831Var2.k;
                if (str16 == null || evu0.J(str16)) {
                    PaymentMethods.LocationInfo locationInfo = lVar.c.a.b.g().o;
                    str2 = locationInfo != null ? locationInfo.b : null;
                } else {
                    str2 = j831Var2.k;
                }
                String str17 = str2;
                verificationRepository$requestVerificationStatus$1.L$0 = j831Var2;
                verificationRepository$requestVerificationStatus$1.L$1 = str;
                verificationRepository$requestVerificationStatus$1.L$2 = null;
                verificationRepository$requestVerificationStatus$1.L$3 = a4;
                verificationRepository$requestVerificationStatus$1.L$4 = str17;
                verificationRepository$requestVerificationStatus$1.L$5 = Hg;
                verificationRepository$requestVerificationStatus$1.L$6 = a4;
                verificationRepository$requestVerificationStatus$1.L$7 = str17;
                verificationRepository$requestVerificationStatus$1.L$8 = j831Var2;
                verificationRepository$requestVerificationStatus$1.I$0 = i3;
                verificationRepository$requestVerificationStatus$1.Z$0 = z2;
                verificationRepository$requestVerificationStatus$1.label = 2;
                obj = lVar.b(verificationRepository$requestVerificationStatus$1);
                if (obj != obj2) {
                    j831Var3 = j831Var2;
                    i4 = i3;
                    str3 = str17;
                    str4 = str3;
                    str5 = a4;
                    str6 = Hg;
                    str7 = str5;
                    String str142 = str;
                    VerificationRequest verificationRequest2 = new VerificationRequest(str6, str7, str4, j831Var3, (Set) obj);
                    if (i4 == 0) {
                    }
                    h731 h731Var2 = lVar.a;
                    cmt<PaymentVerificationsResponse> a32 = ((VerificationApi) h731Var2.f.m(h731Var2.a, h731Var2.b, h731Var2.e.a(), VerificationApi.class, new VerificationApiFactory$api$1(1, h731Var2, h731.class, "configureRetrofit", "configureRetrofit(Lretrofit2/Retrofit$Builder;)Lretrofit2/Retrofit$Builder;", 0))).a(kp50.h(str142), j831Var2.l, verificationRequest2);
                    verificationRepository$requestVerificationStatus$1.L$0 = j831Var2;
                    verificationRepository$requestVerificationStatus$1.L$1 = null;
                    verificationRepository$requestVerificationStatus$1.L$2 = null;
                    verificationRepository$requestVerificationStatus$1.L$3 = null;
                    verificationRepository$requestVerificationStatus$1.L$4 = null;
                    verificationRepository$requestVerificationStatus$1.L$5 = null;
                    verificationRepository$requestVerificationStatus$1.L$6 = null;
                    verificationRepository$requestVerificationStatus$1.L$7 = null;
                    verificationRepository$requestVerificationStatus$1.L$8 = null;
                    verificationRepository$requestVerificationStatus$1.I$0 = i4;
                    verificationRepository$requestVerificationStatus$1.Z$0 = z2;
                    verificationRepository$requestVerificationStatus$1.label = 3;
                    obj = a32.a(verificationRepository$requestVerificationStatus$1);
                    if (obj != obj2) {
                    }
                }
                return obj2;
            }
        }
        verificationRepository$requestVerificationStatus$1 = new VerificationRepository$requestVerificationStatus$1(lVar, continuationImpl);
        Object obj3 = verificationRepository$requestVerificationStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = verificationRepository$requestVerificationStatus$1.label;
        if (i2 != 0) {
        }
        str = (String) obj3;
        Hg = lVar.b.b.Hg();
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
    public final Object b(ContinuationImpl continuationImpl) {
        VerificationRepository$buildSupportedFeatures$1 verificationRepository$buildSupportedFeatures$1;
        int i;
        Set set;
        if (continuationImpl instanceof VerificationRepository$buildSupportedFeatures$1) {
            verificationRepository$buildSupportedFeatures$1 = (VerificationRepository$buildSupportedFeatures$1) continuationImpl;
            int i2 = verificationRepository$buildSupportedFeatures$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationRepository$buildSupportedFeatures$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationRepository$buildSupportedFeatures$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationRepository$buildSupportedFeatures$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set singleton = Collections.singleton("3ds_polling");
                    verificationRepository$buildSupportedFeatures$1.L$0 = singleton;
                    verificationRepository$buildSupportedFeatures$1.L$1 = null;
                    verificationRepository$buildSupportedFeatures$1.label = 1;
                    Object a = this.e.a(verificationRepository$buildSupportedFeatures$1);
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
                    set = (Set) verificationRepository$buildSupportedFeatures$1.L$0;
                    kotlin.b.b(obj);
                }
                Set set2 = ((Boolean) obj).booleanValue() ? set : null;
                return set2 != null ? EmptySet.a : set2;
            }
        }
        verificationRepository$buildSupportedFeatures$1 = new VerificationRepository$buildSupportedFeatures$1(this, continuationImpl);
        Object obj2 = verificationRepository$buildSupportedFeatures$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationRepository$buildSupportedFeatures$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        if (set2 != null) {
        }
    }
}
