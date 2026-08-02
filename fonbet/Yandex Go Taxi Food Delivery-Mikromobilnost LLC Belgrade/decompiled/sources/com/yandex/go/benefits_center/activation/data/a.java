package com.yandex.go.benefits_center.activation.data;

import com.yandex.go.benefits_center.activation.data.model.BenefitActivationResponse;
import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import com.yandex.go.benefits_center.data.model.LocalizedErrorResponse;
import defpackage.b64;
import defpackage.bi4;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.jst;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.ul5;
import defpackage.wnt;
import defpackage.xl5;
import defpackage.xnt;
import defpackage.yl5;
import defpackage.zl5;
import java.io.BufferedInputStream;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final wnt a;
    public final bi4 b;

    public a(wnt wntVar, bi4 bi4Var) {
        this.a = wntVar;
        this.b = bi4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[Catch: all -> 0x0044, CancellationException -> 0x011e, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:11:0x0040, B:12:0x0087, B:14:0x008f), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:12:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0107 -> B:16:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, BenefitGeoState benefitGeoState, BenefitPaymentInfo benefitPaymentInfo, ContinuationImpl continuationImpl) {
        BenefitActivationApiService$activate$1 benefitActivationApiService$activate$1;
        int i;
        int i2;
        BenefitPaymentInfo benefitPaymentInfo2;
        BenefitActivationApiService$activate$1 benefitActivationApiService$activate$12;
        int i3;
        String str2;
        BenefitGeoState benefitGeoState2;
        Integer M;
        LocalizedErrorResponse localizedErrorResponse;
        int i4;
        yl5 yl5Var;
        Object obj;
        int i5;
        if (continuationImpl instanceof BenefitActivationApiService$activate$1) {
            benefitActivationApiService$activate$1 = (BenefitActivationApiService$activate$1) continuationImpl;
            int i6 = benefitActivationApiService$activate$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                benefitActivationApiService$activate$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = benefitActivationApiService$activate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = benefitActivationApiService$activate$1.label;
                int i7 = 1;
                xl5 xl5Var = xl5.a;
                LocalizedErrorResponse localizedErrorResponse2 = null;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = benefitActivationApiService$activate$1.I$2;
                    int i9 = benefitActivationApiService$activate$1.I$1;
                    int i10 = benefitActivationApiService$activate$1.I$0;
                    BenefitPaymentInfo benefitPaymentInfo3 = (BenefitPaymentInfo) benefitActivationApiService$activate$1.L$2;
                    BenefitGeoState benefitGeoState3 = (BenefitGeoState) benefitActivationApiService$activate$1.L$1;
                    String str3 = (String) benefitActivationApiService$activate$1.L$0;
                    try {
                        try {
                            kotlin.b.b(obj2);
                        } catch (Throwable th) {
                            th = th;
                            M = s8o.M(th);
                            if (M != null && M.intValue() == 400) {
                                BufferedInputStream N = s8o.N(th);
                                localizedErrorResponse = N == null ? (LocalizedErrorResponse) ((xnt) this.a).b(N, LocalizedErrorResponse.Companion.serializer()) : localizedErrorResponse2;
                                i4 = i7;
                                jst.e.d("benefits_center", b64.l("Failed to activate benefit: code=", localizedErrorResponse == null ? localizedErrorResponse.getA() : localizedErrorResponse2, " message=", localizedErrorResponse == null ? localizedErrorResponse.getB() : localizedErrorResponse2));
                                if (localizedErrorResponse == null) {
                                    yl5Var = new yl5(localizedErrorResponse.getC());
                                    obj = yl5Var;
                                } else {
                                    yl5Var = new yl5(null);
                                    obj = yl5Var;
                                }
                            } else {
                                i4 = i7;
                                obj = xl5Var;
                            }
                            i2 = i10;
                            benefitActivationApiService$activate$12 = benefitActivationApiService$activate$1;
                            str2 = str3;
                            if (obj.equals(xl5Var)) {
                            }
                            return obj;
                        }
                        fmt fmtVar = (fmt) obj2;
                        obj = fmtVar.b != 200 ? new zl5(((BenefitActivationResponse) fmtVar.a).getA()) : xl5Var;
                        i4 = i7;
                        i2 = i10;
                        benefitActivationApiService$activate$12 = benefitActivationApiService$activate$1;
                        str2 = str3;
                        if (obj.equals(xl5Var) || i8 == 4) {
                            return obj;
                        }
                        int i11 = i9 + 1;
                        i7 = i4;
                        benefitPaymentInfo2 = benefitPaymentInfo3;
                        localizedErrorResponse2 = null;
                        i3 = i11;
                        benefitGeoState2 = benefitGeoState3;
                        i5 = i2;
                        if (i3 < i5) {
                            return xl5Var;
                        }
                        cmt a = ((ul5) this.b.get()).a(benefitGeoState2, benefitPaymentInfo2, str2);
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = str2;
                            benefitActivationApiService$activate$1 = benefitActivationApiService$activate$12;
                            i10 = i5;
                            benefitGeoState3 = benefitGeoState2;
                            i8 = i3;
                            benefitPaymentInfo3 = benefitPaymentInfo2;
                            i9 = i8;
                            M = s8o.M(th);
                            if (M != null) {
                                BufferedInputStream N2 = s8o.N(th);
                                if (N2 == null) {
                                }
                                i4 = i7;
                                jst.e.d("benefits_center", b64.l("Failed to activate benefit: code=", localizedErrorResponse == null ? localizedErrorResponse.getA() : localizedErrorResponse2, " message=", localizedErrorResponse == null ? localizedErrorResponse.getB() : localizedErrorResponse2));
                                if (localizedErrorResponse == null) {
                                }
                                i2 = i10;
                                benefitActivationApiService$activate$12 = benefitActivationApiService$activate$1;
                                str2 = str3;
                                if (obj.equals(xl5Var)) {
                                }
                                return obj;
                            }
                            i4 = i7;
                            obj = xl5Var;
                            i2 = i10;
                            benefitActivationApiService$activate$12 = benefitActivationApiService$activate$1;
                            str2 = str3;
                            if (obj.equals(xl5Var)) {
                            }
                            return obj;
                        }
                        benefitActivationApiService$activate$12.L$0 = str2;
                        benefitActivationApiService$activate$12.L$1 = benefitGeoState2;
                        benefitActivationApiService$activate$12.L$2 = benefitPaymentInfo2;
                        benefitActivationApiService$activate$12.L$3 = localizedErrorResponse2;
                        benefitActivationApiService$activate$12.I$0 = i5;
                        benefitActivationApiService$activate$12.I$1 = i3;
                        benefitActivationApiService$activate$12.I$2 = i3;
                        benefitActivationApiService$activate$12.label = i7;
                        obj2 = a.a(benefitActivationApiService$activate$12);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str2;
                        benefitActivationApiService$activate$1 = benefitActivationApiService$activate$12;
                        i10 = i5;
                        benefitGeoState3 = benefitGeoState2;
                        i8 = i3;
                        benefitPaymentInfo3 = benefitPaymentInfo2;
                        i9 = i8;
                        fmt fmtVar2 = (fmt) obj2;
                        if (fmtVar2.b != 200) {
                        }
                        i4 = i7;
                        i2 = i10;
                        benefitActivationApiService$activate$12 = benefitActivationApiService$activate$1;
                        str2 = str3;
                        if (obj.equals(xl5Var)) {
                        }
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    }
                }
                kotlin.b.b(obj2);
                i2 = 5;
                benefitPaymentInfo2 = benefitPaymentInfo;
                benefitActivationApiService$activate$12 = benefitActivationApiService$activate$1;
                i3 = 0;
                str2 = str;
                benefitGeoState2 = benefitGeoState;
                i5 = i2;
                if (i3 < i5) {
                }
            }
        }
        benefitActivationApiService$activate$1 = new BenefitActivationApiService$activate$1(this, continuationImpl);
        Object obj22 = benefitActivationApiService$activate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitActivationApiService$activate$1.label;
        int i72 = 1;
        xl5 xl5Var2 = xl5.a;
        LocalizedErrorResponse localizedErrorResponse22 = null;
        if (i == 0) {
        }
    }
}
