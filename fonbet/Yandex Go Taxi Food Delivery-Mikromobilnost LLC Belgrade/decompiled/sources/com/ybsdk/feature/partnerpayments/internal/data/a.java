package com.ybsdk.feature.partnerpayments.internal.data;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import com.ybsdk.feature.partnerpayments.internal.network.PartnerPaymentsApi;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AgreementPartyDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentInfoDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentInputDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentSettingsDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.AutoPaymentsSaveRequest;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.PaymentPartyDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.SbpPartyDto;
import com.ybsdk.feature.partnerpayments.internal.network.dto.status.PartnerPaymentsStatusRequest;
import defpackage.a5f;
import defpackage.iyd0;
import defpackage.j73;
import defpackage.lh90;
import defpackage.mh90;
import defpackage.ny61;
import defpackage.scc;
import defpackage.uza;
import defpackage.w511;
import defpackage.zr3;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final PartnerPaymentsApi a;
    public final lh90 b;

    public a(PartnerPaymentsApi partnerPaymentsApi, lh90 lh90Var) {
        this.a = partnerPaymentsApi;
        this.b = lh90Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) {
        PartnerPaymentsRepository$getPartnerPaymentSaveStatus$1 partnerPaymentsRepository$getPartnerPaymentSaveStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object d;
        if (continuationImpl instanceof PartnerPaymentsRepository$getPartnerPaymentSaveStatus$1) {
            partnerPaymentsRepository$getPartnerPaymentSaveStatus$1 = (PartnerPaymentsRepository$getPartnerPaymentSaveStatus$1) continuationImpl;
            int i3 = partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2 partnerPaymentsRepository$getPartnerPaymentSaveStatus$2 = new PartnerPaymentsRepository$getPartnerPaymentSaveStatus$2(this, new PartnerPaymentsStatusRequest(str), i, null);
                    partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.label = 1;
                    c = c.c(partnerPaymentsRepository$getPartnerPaymentSaveStatus$2, partnerPaymentsRepository$getPartnerPaymentSaveStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.L$0;
                        b.b(obj);
                        d = ((Result) obj).getValue();
                        return !(d instanceof Result.Failure) ? new iyd0(iyd0Var.b, d) : d;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                PartnerPaymentsRepository$getPartnerPaymentSaveStatus$3$1$1 partnerPaymentsRepository$getPartnerPaymentSaveStatus$3$1$1 = new PartnerPaymentsRepository$getPartnerPaymentSaveStatus$3$1$1(2, null);
                partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.L$0 = iyd0Var;
                partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.label = 2;
                d = com.ybsdk.core.utils.dto.b.d(dataWithStatusResponse, partnerPaymentsRepository$getPartnerPaymentSaveStatus$3$1$1, partnerPaymentsRepository$getPartnerPaymentSaveStatus$1);
            }
        }
        partnerPaymentsRepository$getPartnerPaymentSaveStatus$1 = new PartnerPaymentsRepository$getPartnerPaymentSaveStatus$1(this, continuationImpl);
        Object obj2 = partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = partnerPaymentsRepository$getPartnerPaymentSaveStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        if (r0 == r6) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus, ContinuationImpl continuationImpl) {
        PartnerPaymentsRepository$savePartnerId$1 partnerPaymentsRepository$savePartnerId$1;
        int i;
        AutoPaymentInfoDto.AutoPaymentStatus autoPaymentStatus;
        Continuation continuation;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PartnerPaymentsRepository$savePartnerId$1) {
            partnerPaymentsRepository$savePartnerId$1 = (PartnerPaymentsRepository$savePartnerId$1) continuationImpl;
            int i2 = partnerPaymentsRepository$savePartnerId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnerPaymentsRepository$savePartnerId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnerPaymentsRepository$savePartnerId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerPaymentsRepository$savePartnerId$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = mh90.a[partnerPaymentsFeature$BindingStatus.ordinal()];
                    if (i3 == 1) {
                        autoPaymentStatus = AutoPaymentInfoDto.AutoPaymentStatus.ENABLED;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        autoPaymentStatus = AutoPaymentInfoDto.AutoPaymentStatus.DISABLED;
                    }
                    zr3 zr3Var = new zr3();
                    AutoPaymentSettingsDto.AutoPaymentSettingsType autoPaymentSettingsType = AutoPaymentSettingsDto.AutoPaymentSettingsType.EXTERNAL_SOURCE_PAYMENT;
                    String str4 = this.b.a.b;
                    if (str4 == null) {
                        ny61.g("Failed requirement.");
                        return null;
                    }
                    String obj2 = autoPaymentStatus.toString();
                    String obj3 = autoPaymentSettingsType.toString();
                    HmacDto.Version version = HmacDto.Version.ONE;
                    String lowerCase = kotlin.collections.a.X(scc.g(str3, str, str2, obj2, obj3), "", null, null, null, 62).toLowerCase(Locale.ROOT);
                    Mac mac = Mac.getInstance("HmacSHA256");
                    Charset charset = uza.a;
                    mac.init(new SecretKeySpec(str4.getBytes(charset), "HmacSHA256"));
                    AutoPaymentInputDto autoPaymentInputDto = new AutoPaymentInputDto(new AutoPaymentInfoDto(autoPaymentStatus, new AutoPaymentSettingsDto(autoPaymentSettingsType, null, null, null, null, 30, null)), new HmacDto(j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30), version));
                    ArrayList arrayList = zr3Var.a;
                    arrayList.add(autoPaymentInputDto);
                    continuation = null;
                    PartnerPaymentsRepository$savePartnerId$2 partnerPaymentsRepository$savePartnerId$2 = new PartnerPaymentsRepository$savePartnerId$2(this, str3, new AutoPaymentsSaveRequest(new PaymentPartyDto(PaymentPartyDto.PaymentPartyType.SBP_PARTY, new SbpPartyDto(str), null, 4, 0 == true ? 1 : 0), new PaymentPartyDto(PaymentPartyDto.PaymentPartyType.AGREEMENT, 0 == true ? 1 : 0, new AgreementPartyDto(str2), 2, 0 == true ? 1 : 0), kotlin.collections.a.J0(arrayList)), null);
                    partnerPaymentsRepository$savePartnerId$1.label = 1;
                    c = c.c(partnerPaymentsRepository$savePartnerId$2, partnerPaymentsRepository$savePartnerId$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                    continuation = null;
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PartnerPaymentsRepository$savePartnerId$3$1 partnerPaymentsRepository$savePartnerId$3$1 = new PartnerPaymentsRepository$savePartnerId$3$1(2, continuation);
                partnerPaymentsRepository$savePartnerId$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, partnerPaymentsRepository$savePartnerId$3$1, partnerPaymentsRepository$savePartnerId$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        partnerPaymentsRepository$savePartnerId$1 = new PartnerPaymentsRepository$savePartnerId$1(this, continuationImpl);
        Object obj4 = partnerPaymentsRepository$savePartnerId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerPaymentsRepository$savePartnerId$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
