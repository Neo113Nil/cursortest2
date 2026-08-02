package com.yandex.go.benefits_center.claim.data;

import com.yandex.go.benefits_center.claim.data.model.BenefitsClaimRequest;
import com.yandex.go.benefits_center.claim.data.model.BenefitsClaimResponse;
import com.yandex.go.benefits_center.data.BenefitsCenterInternalApi;
import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import com.yandex.go.benefits_center.data.model.LocalizedErrorResponse;
import defpackage.cmt;
import defpackage.eo5;
import defpackage.fmt;
import defpackage.fn5;
import defpackage.fo5;
import defpackage.go5;
import defpackage.ho5;
import defpackage.io5;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.w511;
import defpackage.wnt;
import java.io.BufferedInputStream;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final wnt a;
    public final fn5 b;

    public a(wnt wntVar, fn5 fn5Var) {
        this.a = wntVar;
        this.b = fn5Var;
    }

    public static io5 b(fmt fmtVar) {
        return fmtVar.b == 200 ? new ho5(((BenefitsClaimResponse) fmtVar.a).a) : new go5(null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:31)|32|33|34|35|36|37|38|(1:40)(6:41|12|13|14|15|(1:17)(3:19|22|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        r8 = r10;
        r10 = r2;
        r2 = r8;
        r8 = r12;
        r12 = r7;
        r7 = r11;
        r11 = r4;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        r0 = (com.yandex.go.benefits_center.data.model.LocalizedErrorResponse) ((defpackage.xnt) r15).b(r0, com.yandex.go.benefits_center.data.model.LocalizedErrorResponse.Companion.serializer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0158, code lost:
    
        r0 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015b, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        if (r14.intValue() == 400) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        r0 = defpackage.s8o.N(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        r0 = (com.yandex.go.benefits_center.data.model.LocalizedErrorResponse) ((defpackage.xnt) r15).b(r0, com.yandex.go.benefits_center.data.model.LocalizedErrorResponse.Companion.serializer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        r5 = defpackage.jst.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0112, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0114, code lost:
    
        r14 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        r16 = r6;
        r15 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        r5.d("benefits_center", defpackage.b64.l("Failed to claim benefit: code=", r14, " message=", r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r0 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        r0 = new defpackage.fo5(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0136, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011f, code lost:
    
        r15 = r6;
        r16 = r15;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0117, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d1, code lost:
    
        r13 = r19;
        r7 = r20;
        r4 = r21;
        r2 = r22;
        r9 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0165 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ae -> B:12:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, BenefitGeoState benefitGeoState, BenefitPaymentInfo benefitPaymentInfo, ContinuationImpl continuationImpl) {
        BenefitsClaimApiService$claim$1 benefitsClaimApiService$claim$1;
        int i;
        String str4;
        BenefitGeoState benefitGeoState2;
        BenefitPaymentInfo benefitPaymentInfo2;
        int i2;
        BenefitsClaimApiService$claim$1 benefitsClaimApiService$claim$12;
        int i3;
        String str5;
        String str6;
        LocalizedErrorResponse localizedErrorResponse;
        io5 fo5Var;
        LocalizedErrorResponse localizedErrorResponse2;
        String str7;
        String str8;
        String str9;
        BenefitGeoState benefitGeoState3;
        a aVar = this;
        if (continuationImpl instanceof BenefitsClaimApiService$claim$1) {
            benefitsClaimApiService$claim$1 = (BenefitsClaimApiService$claim$1) continuationImpl;
            int i4 = benefitsClaimApiService$claim$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                benefitsClaimApiService$claim$1.label = i4 - Integer.MIN_VALUE;
                Object obj = benefitsClaimApiService$claim$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitsClaimApiService$claim$1.label;
                int i5 = 1;
                LocalizedErrorResponse localizedErrorResponse3 = null;
                if (i != 0) {
                    b.b(obj);
                    str4 = str3;
                    benefitGeoState2 = benefitGeoState;
                    benefitPaymentInfo2 = benefitPaymentInfo;
                    i2 = 5;
                    benefitsClaimApiService$claim$12 = benefitsClaimApiService$claim$1;
                    i3 = 0;
                    str5 = str;
                    str6 = str2;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = benefitsClaimApiService$claim$1.I$2;
                    int i7 = benefitsClaimApiService$claim$1.I$1;
                    int i8 = benefitsClaimApiService$claim$1.I$0;
                    benefitPaymentInfo2 = (BenefitPaymentInfo) benefitsClaimApiService$claim$1.L$4;
                    BenefitGeoState benefitGeoState4 = (BenefitGeoState) benefitsClaimApiService$claim$1.L$3;
                    String str10 = (String) benefitsClaimApiService$claim$1.L$2;
                    String str11 = (String) benefitsClaimApiService$claim$1.L$1;
                    String str12 = (String) benefitsClaimApiService$claim$1.L$0;
                    try {
                        try {
                            b.b(obj);
                        } catch (Throwable th) {
                            th = th;
                            Integer M = s8o.M(th);
                            wnt wntVar = aVar.a;
                            if (M != null) {
                            }
                            localizedErrorResponse = localizedErrorResponse3;
                            BufferedInputStream N = s8o.N(th);
                            if (N == null) {
                            }
                            if (localizedErrorResponse2 == null) {
                            }
                            fo5Var = new go5(str7);
                            int i9 = i8;
                            benefitGeoState2 = benefitGeoState4;
                            benefitsClaimApiService$claim$12 = benefitsClaimApiService$claim$1;
                            str5 = str12;
                            if (fo5Var instanceof ho5) {
                            }
                        }
                        fo5Var = b((fmt) obj);
                        int i10 = i5;
                        localizedErrorResponse = localizedErrorResponse3;
                        int i92 = i8;
                        benefitGeoState2 = benefitGeoState4;
                        benefitsClaimApiService$claim$12 = benefitsClaimApiService$claim$1;
                        str5 = str12;
                        if ((fo5Var instanceof ho5) || (fo5Var instanceof fo5)) {
                            return fo5Var;
                        }
                        if (!(fo5Var instanceof go5)) {
                            w511.b();
                            return localizedErrorResponse;
                        }
                        if (i6 == 4) {
                            return fo5Var;
                        }
                        int i11 = i7 + 1;
                        i5 = i10;
                        str4 = str10;
                        str6 = str11;
                        localizedErrorResponse3 = localizedErrorResponse;
                        i3 = i11;
                        i2 = i92;
                        aVar = this;
                        if (i3 < i2) {
                            return new go5(localizedErrorResponse3);
                        }
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            String str13 = str4;
                            str8 = str6;
                            str9 = str13;
                            str12 = str5;
                            benefitGeoState3 = benefitGeoState2;
                        }
                        String str14 = str5;
                        String str15 = str6;
                        String str16 = str4;
                        BenefitGeoState benefitGeoState5 = benefitGeoState2;
                        BenefitPaymentInfo benefitPaymentInfo3 = benefitPaymentInfo2;
                        str12 = str14;
                        str8 = str15;
                        str9 = str16;
                        benefitGeoState3 = benefitGeoState5;
                        benefitPaymentInfo2 = benefitPaymentInfo3;
                        cmt<BenefitsClaimResponse> a = ((BenefitsCenterInternalApi) ((eo5) aVar.b.get()).a.getValue()).a(new BenefitsClaimRequest(str14, str15, str16, benefitGeoState5, benefitPaymentInfo3));
                        benefitsClaimApiService$claim$12.L$0 = str12;
                        benefitsClaimApiService$claim$12.L$1 = str8;
                        benefitsClaimApiService$claim$12.L$2 = str9;
                        benefitsClaimApiService$claim$12.L$3 = benefitGeoState3;
                        benefitsClaimApiService$claim$12.L$4 = benefitPaymentInfo2;
                        benefitsClaimApiService$claim$12.I$0 = i2;
                        benefitsClaimApiService$claim$12.I$1 = i3;
                        benefitsClaimApiService$claim$12.I$2 = i3;
                        benefitsClaimApiService$claim$12.label = i5;
                        obj = a.a(benefitsClaimApiService$claim$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        BenefitsClaimApiService$claim$1 benefitsClaimApiService$claim$13 = benefitsClaimApiService$claim$12;
                        benefitGeoState4 = benefitGeoState3;
                        benefitsClaimApiService$claim$1 = benefitsClaimApiService$claim$13;
                        i8 = i2;
                        str11 = str8;
                        i7 = i3;
                        str10 = str9;
                        i6 = i7;
                        fo5Var = b((fmt) obj);
                        int i102 = i5;
                        localizedErrorResponse = localizedErrorResponse3;
                        int i922 = i8;
                        benefitGeoState2 = benefitGeoState4;
                        benefitsClaimApiService$claim$12 = benefitsClaimApiService$claim$1;
                        str5 = str12;
                        if (fo5Var instanceof ho5) {
                            return fo5Var;
                        }
                        if (!(fo5Var instanceof go5)) {
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                }
            }
        }
        benefitsClaimApiService$claim$1 = new BenefitsClaimApiService$claim$1(aVar, continuationImpl);
        Object obj2 = benefitsClaimApiService$claim$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsClaimApiService$claim$1.label;
        int i52 = 1;
        LocalizedErrorResponse localizedErrorResponse32 = null;
        if (i != 0) {
        }
    }
}
