package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.ProfileResponse;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.data.model.VerificationsResponse;
import com.yandex.go.payments.cards.data.model.VerificationsStatusResponse;
import defpackage.dw5;
import defpackage.evu0;
import defpackage.h831;
import defpackage.j831;
import defpackage.jst;
import defpackage.jv5;
import defpackage.l931;
import defpackage.m831;
import defpackage.mr21;
import defpackage.ny61;
import defpackage.p731;
import defpackage.snf;
import defpackage.tx90;
import defpackage.vg10;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes13.dex */
public final class m implements h831 {
    public final o a;

    public m(o oVar) {
        this.a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.h831
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j831 j831Var, boolean z, ContinuationImpl continuationImpl) {
        VerificationTaxiInteractor$pollCardStatus$1 verificationTaxiInteractor$pollCardStatus$1;
        int i;
        j831 j831Var2;
        String str;
        String str2;
        VerificationsStatusResponse verificationsStatusResponse;
        if (continuationImpl instanceof VerificationTaxiInteractor$pollCardStatus$1) {
            verificationTaxiInteractor$pollCardStatus$1 = (VerificationTaxiInteractor$pollCardStatus$1) continuationImpl;
            int i2 = verificationTaxiInteractor$pollCardStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationTaxiInteractor$pollCardStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verificationTaxiInteractor$pollCardStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationTaxiInteractor$pollCardStatus$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = j831Var.b;
                    String str4 = j831Var.d;
                    if (str3 == null || evu0.J(str3)) {
                        m831 m831Var = j831Var.a;
                        String str5 = j831Var.l;
                        verificationTaxiInteractor$pollCardStatus$1.L$0 = null;
                        verificationTaxiInteractor$pollCardStatus$1.L$1 = null;
                        verificationTaxiInteractor$pollCardStatus$1.L$2 = null;
                        verificationTaxiInteractor$pollCardStatus$1.Z$0 = z;
                        verificationTaxiInteractor$pollCardStatus$1.label = 1;
                        Object c = c(m831Var, str5, z, verificationTaxiInteractor$pollCardStatus$1);
                        if (c != obj2) {
                            return c;
                        }
                    } else {
                        o oVar = this.a;
                        verificationTaxiInteractor$pollCardStatus$1.L$0 = j831Var;
                        verificationTaxiInteractor$pollCardStatus$1.L$1 = str3;
                        verificationTaxiInteractor$pollCardStatus$1.L$2 = str4;
                        verificationTaxiInteractor$pollCardStatus$1.Z$0 = z;
                        verificationTaxiInteractor$pollCardStatus$1.label = 2;
                        oVar.getClass();
                        Integer num = j831Var.g;
                        VerificationStatus verificationStatus = j831Var.f;
                        obj = oVar.g.a(new VerificationV4Repository$verificationStatus$2(oVar, z, verificationStatus, num, null), new k(i3, oVar), j831Var, new mr21(23), new mr21(24), verificationTaxiInteractor$pollCardStatus$1);
                        if (obj != obj2) {
                            j831Var2 = j831Var;
                            str = str4;
                            str2 = str3;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str6 = (String) verificationTaxiInteractor$pollCardStatus$1.L$2;
                String str7 = (String) verificationTaxiInteractor$pollCardStatus$1.L$1;
                j831Var2 = (j831) verificationTaxiInteractor$pollCardStatus$1.L$0;
                kotlin.b.b(obj);
                str = str6;
                str2 = str7;
                verificationsStatusResponse = (VerificationsStatusResponse) obj;
                if (verificationsStatusResponse == null) {
                    return new p731(j831Var2.a, new Verification(str2, (String) null, verificationsStatusResponse.a, verificationsStatusResponse.b, verificationsStatusResponse.c, verificationsStatusResponse.d, verificationsStatusResponse.e, verificationsStatusResponse.f, verificationsStatusResponse.g, (String) null, 512), str, j831Var2.m, this.a.h);
                }
                ny61.r("VerificationsStatus response should not be null");
                return null;
            }
        }
        verificationTaxiInteractor$pollCardStatus$1 = new VerificationTaxiInteractor$pollCardStatus$1(this, continuationImpl);
        Object obj3 = verificationTaxiInteractor$pollCardStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationTaxiInteractor$pollCardStatus$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        verificationsStatusResponse = (VerificationsStatusResponse) obj3;
        if (verificationsStatusResponse == null) {
        }
    }

    @Override // defpackage.h831
    public final Object b(jv5 jv5Var, dw5 dw5Var, Continuation continuation) {
        throw new UnsupportedOperationException("Initial card binding is not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(m831 m831Var, String str, boolean z, ContinuationImpl continuationImpl) {
        VerificationTaxiInteractor$initVerification$1 verificationTaxiInteractor$initVerification$1;
        int i;
        String uuid;
        m831 m831Var2;
        boolean z2;
        VerificationsResponse verificationsResponse;
        if (continuationImpl instanceof VerificationTaxiInteractor$initVerification$1) {
            verificationTaxiInteractor$initVerification$1 = (VerificationTaxiInteractor$initVerification$1) continuationImpl;
            int i2 = verificationTaxiInteractor$initVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verificationTaxiInteractor$initVerification$1.label = i2 - Integer.MIN_VALUE;
                VerificationTaxiInteractor$initVerification$1 verificationTaxiInteractor$initVerification$12 = verificationTaxiInteractor$initVerification$1;
                Object obj = verificationTaxiInteractor$initVerification$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verificationTaxiInteractor$initVerification$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null || evu0.J(str)) {
                        jst.e.x(new IllegalStateException(), "idempotencyToken is required for verification init");
                        uuid = UUID.randomUUID().toString();
                    } else {
                        uuid = str;
                    }
                    verificationTaxiInteractor$initVerification$12.L$0 = m831Var;
                    verificationTaxiInteractor$initVerification$12.L$1 = null;
                    verificationTaxiInteractor$initVerification$12.L$2 = null;
                    verificationTaxiInteractor$initVerification$12.Z$0 = z;
                    verificationTaxiInteractor$initVerification$12.label = 1;
                    o oVar = this.a;
                    obj = oVar.g.a(new VerificationV4Repository$initVerification$2(oVar, null), new snf(oVar), new l931(m831Var, uuid), new mr21(21), new mr21(22), verificationTaxiInteractor$initVerification$12);
                    if (obj != obj2) {
                        m831Var2 = m831Var;
                        z2 = z;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                z2 = verificationTaxiInteractor$initVerification$12.Z$0;
                m831 m831Var3 = (m831) verificationTaxiInteractor$initVerification$12.L$0;
                kotlin.b.b(obj);
                m831Var2 = m831Var3;
                verificationsResponse = (VerificationsResponse) obj;
                if (verificationsResponse != null) {
                    ny61.r("Verifications response should not be null");
                    return null;
                }
                String str2 = verificationsResponse.a;
                String str3 = verificationsResponse.b;
                if (str2 == null || evu0.J(str2)) {
                    ny61.r("VerificationId should not be empty");
                    return null;
                }
                if (str3 == null || evu0.J(str3)) {
                    ny61.r("PurchaseToken should not be empty");
                    return null;
                }
                ProfileResponse profileResponse = verificationsResponse.c;
                UserCardProfileName userCardProfileName = profileResponse != null ? profileResponse.a : null;
                if (userCardProfileName == null) {
                    vg10.o(userCardProfileName, "Unknown or absent profile: ");
                    return null;
                }
                j831 j831Var = new j831(m831Var2, str2, null, str3, true, null, null, null, null, null, new tx90(userCardProfileName), null, 12160);
                verificationTaxiInteractor$initVerification$12.L$0 = null;
                verificationTaxiInteractor$initVerification$12.L$1 = null;
                verificationTaxiInteractor$initVerification$12.L$2 = null;
                verificationTaxiInteractor$initVerification$12.L$3 = null;
                verificationTaxiInteractor$initVerification$12.L$4 = null;
                verificationTaxiInteractor$initVerification$12.L$5 = null;
                verificationTaxiInteractor$initVerification$12.Z$0 = z2;
                verificationTaxiInteractor$initVerification$12.label = 2;
                Object a = a(j831Var, z2, verificationTaxiInteractor$initVerification$12);
                return a == obj2 ? obj2 : a;
            }
        }
        verificationTaxiInteractor$initVerification$1 = new VerificationTaxiInteractor$initVerification$1(this, continuationImpl);
        VerificationTaxiInteractor$initVerification$1 verificationTaxiInteractor$initVerification$122 = verificationTaxiInteractor$initVerification$1;
        Object obj3 = verificationTaxiInteractor$initVerification$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verificationTaxiInteractor$initVerification$122.label;
        if (i != 0) {
        }
        verificationsResponse = (VerificationsResponse) obj3;
        if (verificationsResponse != null) {
        }
    }
}
