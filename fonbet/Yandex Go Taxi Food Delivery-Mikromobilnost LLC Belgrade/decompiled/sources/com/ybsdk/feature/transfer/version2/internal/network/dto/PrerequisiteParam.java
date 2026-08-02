package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001HB£\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003J¥\u0001\u0010A\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'¨\u0006I"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam;", "", "type", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam$TransfersPagePrerequisiteType;", "self", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferPrerequisiteParam;", "selfTopup", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupPrerequisiteParam;", "phone", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PhoneTransferPrerequisiteParam;", "mobilePayment", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentPrerequisiteParam;", "qrString", "", "commonTopup", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam;", "internetPayment", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentPrerequisiteParam;", "c2g", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/C2GPrerequisiteParam;", "invoiceHcs", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsPrerequisiteParam;", "crossBorderByPhone", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParam;", "templateId", "templateType", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam$TransfersPagePrerequisiteType;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PhoneTransferPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentPrerequisiteParam;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/C2GPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsPrerequisiteParam;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParam;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam$TransfersPagePrerequisiteType;", "getSelf", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferPrerequisiteParam;", "getSelfTopup", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupPrerequisiteParam;", "getPhone", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PhoneTransferPrerequisiteParam;", "getMobilePayment", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentPrerequisiteParam;", "getQrString", "()Ljava/lang/String;", "getCommonTopup", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam;", "getInternetPayment", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentPrerequisiteParam;", "getC2g", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/C2GPrerequisiteParam;", "getInvoiceHcs", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsPrerequisiteParam;", "getCrossBorderByPhone", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhonePrerequisiteParam;", "getTemplateId", "getTemplateType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "TransfersPagePrerequisiteType", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrerequisiteParam {
    private final C2GPrerequisiteParam c2g;
    private final CommonTopupPrerequisiteParam commonTopup;
    private final CrossBorderByPhonePrerequisiteParam crossBorderByPhone;
    private final InternetPaymentPrerequisiteParam internetPayment;
    private final InvoiceHcsPrerequisiteParam invoiceHcs;
    private final MobilePaymentPrerequisiteParam mobilePayment;
    private final PhoneTransferPrerequisiteParam phone;
    private final String qrString;
    private final SelfTransferPrerequisiteParam self;
    private final SelfTopupPrerequisiteParam selfTopup;
    private final String templateId;
    private final String templateType;
    private final TransfersPagePrerequisiteType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PrerequisiteParam$TransfersPagePrerequisiteType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/ybsdk/feature/transfer/version2/internal/network/dto/a", "C2G", "SELF", "SELF_TOPUP", "ME2ME_TOPUP", "AFT_TOPUP", "PHONE", "REQUISITES_PERSON", "REQUISITES_LEGAL", "REQUISITES_HCS", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "INVOICE_HCS", "CROSS_BORDER_BY_PHONE", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TransfersPagePrerequisiteType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransfersPagePrerequisiteType[] $VALUES;
        public static final a Companion;
        public static final TransfersPagePrerequisiteType C2G = new TransfersPagePrerequisiteType("C2G", 0);
        public static final TransfersPagePrerequisiteType SELF = new TransfersPagePrerequisiteType("SELF", 1);
        public static final TransfersPagePrerequisiteType SELF_TOPUP = new TransfersPagePrerequisiteType("SELF_TOPUP", 2);
        public static final TransfersPagePrerequisiteType ME2ME_TOPUP = new TransfersPagePrerequisiteType("ME2ME_TOPUP", 3);
        public static final TransfersPagePrerequisiteType AFT_TOPUP = new TransfersPagePrerequisiteType("AFT_TOPUP", 4);
        public static final TransfersPagePrerequisiteType PHONE = new TransfersPagePrerequisiteType("PHONE", 5);
        public static final TransfersPagePrerequisiteType REQUISITES_PERSON = new TransfersPagePrerequisiteType("REQUISITES_PERSON", 6);
        public static final TransfersPagePrerequisiteType REQUISITES_LEGAL = new TransfersPagePrerequisiteType("REQUISITES_LEGAL", 7);
        public static final TransfersPagePrerequisiteType REQUISITES_HCS = new TransfersPagePrerequisiteType("REQUISITES_HCS", 8);
        public static final TransfersPagePrerequisiteType MOBILE_PAYMENT = new TransfersPagePrerequisiteType("MOBILE_PAYMENT", 9);
        public static final TransfersPagePrerequisiteType INTERNET_PAYMENT = new TransfersPagePrerequisiteType("INTERNET_PAYMENT", 10);
        public static final TransfersPagePrerequisiteType INVOICE_HCS = new TransfersPagePrerequisiteType("INVOICE_HCS", 11);
        public static final TransfersPagePrerequisiteType CROSS_BORDER_BY_PHONE = new TransfersPagePrerequisiteType("CROSS_BORDER_BY_PHONE", 12);

        private static final /* synthetic */ TransfersPagePrerequisiteType[] $values() {
            return new TransfersPagePrerequisiteType[]{C2G, SELF, SELF_TOPUP, ME2ME_TOPUP, AFT_TOPUP, PHONE, REQUISITES_PERSON, REQUISITES_LEGAL, REQUISITES_HCS, MOBILE_PAYMENT, INTERNET_PAYMENT, INVOICE_HCS, CROSS_BORDER_BY_PHONE};
        }

        static {
            TransfersPagePrerequisiteType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a();
        }

        private TransfersPagePrerequisiteType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TransfersPagePrerequisiteType valueOf(String str) {
            return (TransfersPagePrerequisiteType) Enum.valueOf(TransfersPagePrerequisiteType.class, str);
        }

        public static TransfersPagePrerequisiteType[] values() {
            return (TransfersPagePrerequisiteType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PrerequisiteParam(TransfersPagePrerequisiteType transfersPagePrerequisiteType, SelfTransferPrerequisiteParam selfTransferPrerequisiteParam, SelfTopupPrerequisiteParam selfTopupPrerequisiteParam, PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam, MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam, String str, CommonTopupPrerequisiteParam commonTopupPrerequisiteParam, InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam, C2GPrerequisiteParam c2GPrerequisiteParam, InvoiceHcsPrerequisiteParam invoiceHcsPrerequisiteParam, CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transfersPagePrerequisiteType, (i & 2) != 0 ? null : selfTransferPrerequisiteParam, (i & 4) != 0 ? null : selfTopupPrerequisiteParam, (i & 8) != 0 ? null : phoneTransferPrerequisiteParam, (i & 16) != 0 ? null : mobilePaymentPrerequisiteParam, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : commonTopupPrerequisiteParam, (i & 128) != 0 ? null : internetPaymentPrerequisiteParam, (i & 256) != 0 ? null : c2GPrerequisiteParam, (i & 512) != 0 ? null : invoiceHcsPrerequisiteParam, (i & 1024) != 0 ? null : crossBorderByPhonePrerequisiteParam, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : str3);
    }

    public static /* synthetic */ PrerequisiteParam copy$default(PrerequisiteParam prerequisiteParam, TransfersPagePrerequisiteType transfersPagePrerequisiteType, SelfTransferPrerequisiteParam selfTransferPrerequisiteParam, SelfTopupPrerequisiteParam selfTopupPrerequisiteParam, PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam, MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam, String str, CommonTopupPrerequisiteParam commonTopupPrerequisiteParam, InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam, C2GPrerequisiteParam c2GPrerequisiteParam, InvoiceHcsPrerequisiteParam invoiceHcsPrerequisiteParam, CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            transfersPagePrerequisiteType = prerequisiteParam.type;
        }
        return prerequisiteParam.copy(transfersPagePrerequisiteType, (i & 2) != 0 ? prerequisiteParam.self : selfTransferPrerequisiteParam, (i & 4) != 0 ? prerequisiteParam.selfTopup : selfTopupPrerequisiteParam, (i & 8) != 0 ? prerequisiteParam.phone : phoneTransferPrerequisiteParam, (i & 16) != 0 ? prerequisiteParam.mobilePayment : mobilePaymentPrerequisiteParam, (i & 32) != 0 ? prerequisiteParam.qrString : str, (i & 64) != 0 ? prerequisiteParam.commonTopup : commonTopupPrerequisiteParam, (i & 128) != 0 ? prerequisiteParam.internetPayment : internetPaymentPrerequisiteParam, (i & 256) != 0 ? prerequisiteParam.c2g : c2GPrerequisiteParam, (i & 512) != 0 ? prerequisiteParam.invoiceHcs : invoiceHcsPrerequisiteParam, (i & 1024) != 0 ? prerequisiteParam.crossBorderByPhone : crossBorderByPhonePrerequisiteParam, (i & 2048) != 0 ? prerequisiteParam.templateId : str2, (i & 4096) != 0 ? prerequisiteParam.templateType : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final TransfersPagePrerequisiteType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final InvoiceHcsPrerequisiteParam getInvoiceHcs() {
        return this.invoiceHcs;
    }

    /* renamed from: component11, reason: from getter */
    public final CrossBorderByPhonePrerequisiteParam getCrossBorderByPhone() {
        return this.crossBorderByPhone;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTemplateType() {
        return this.templateType;
    }

    /* renamed from: component2, reason: from getter */
    public final SelfTransferPrerequisiteParam getSelf() {
        return this.self;
    }

    /* renamed from: component3, reason: from getter */
    public final SelfTopupPrerequisiteParam getSelfTopup() {
        return this.selfTopup;
    }

    /* renamed from: component4, reason: from getter */
    public final PhoneTransferPrerequisiteParam getPhone() {
        return this.phone;
    }

    /* renamed from: component5, reason: from getter */
    public final MobilePaymentPrerequisiteParam getMobilePayment() {
        return this.mobilePayment;
    }

    /* renamed from: component6, reason: from getter */
    public final String getQrString() {
        return this.qrString;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonTopupPrerequisiteParam getCommonTopup() {
        return this.commonTopup;
    }

    /* renamed from: component8, reason: from getter */
    public final InternetPaymentPrerequisiteParam getInternetPayment() {
        return this.internetPayment;
    }

    /* renamed from: component9, reason: from getter */
    public final C2GPrerequisiteParam getC2g() {
        return this.c2g;
    }

    public final PrerequisiteParam copy(@Json(name = "type") TransfersPagePrerequisiteType type, @Json(name = "self_transfer_prereq") SelfTransferPrerequisiteParam self, @Json(name = "self_topup_prereq") SelfTopupPrerequisiteParam selfTopup, @Json(name = "phone_transfer_prereq") PhoneTransferPrerequisiteParam phone, @Json(name = "mobile_payment_prereq") MobilePaymentPrerequisiteParam mobilePayment, @Json(name = "qr_string") String qrString, @Json(name = "common_topup_prereq") CommonTopupPrerequisiteParam commonTopup, @Json(name = "internet_payment_prereq") InternetPaymentPrerequisiteParam internetPayment, @Json(name = "c2g_prereq") C2GPrerequisiteParam c2g, @Json(name = "invoice_hcs_prereq") InvoiceHcsPrerequisiteParam invoiceHcs, @Json(name = "cross_border_by_phone_prereq") CrossBorderByPhonePrerequisiteParam crossBorderByPhone, @Json(name = "template_id") String templateId, @Json(name = "template_type") String templateType) {
        return new PrerequisiteParam(type, self, selfTopup, phone, mobilePayment, qrString, commonTopup, internetPayment, c2g, invoiceHcs, crossBorderByPhone, templateId, templateType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrerequisiteParam)) {
            return false;
        }
        PrerequisiteParam prerequisiteParam = (PrerequisiteParam) other;
        return this.type == prerequisiteParam.type && jl40.l(this.self, prerequisiteParam.self) && jl40.l(this.selfTopup, prerequisiteParam.selfTopup) && jl40.l(this.phone, prerequisiteParam.phone) && jl40.l(this.mobilePayment, prerequisiteParam.mobilePayment) && jl40.l(this.qrString, prerequisiteParam.qrString) && jl40.l(this.commonTopup, prerequisiteParam.commonTopup) && jl40.l(this.internetPayment, prerequisiteParam.internetPayment) && jl40.l(this.c2g, prerequisiteParam.c2g) && jl40.l(this.invoiceHcs, prerequisiteParam.invoiceHcs) && jl40.l(this.crossBorderByPhone, prerequisiteParam.crossBorderByPhone) && jl40.l(this.templateId, prerequisiteParam.templateId) && jl40.l(this.templateType, prerequisiteParam.templateType);
    }

    public final C2GPrerequisiteParam getC2g() {
        return this.c2g;
    }

    public final CommonTopupPrerequisiteParam getCommonTopup() {
        return this.commonTopup;
    }

    public final CrossBorderByPhonePrerequisiteParam getCrossBorderByPhone() {
        return this.crossBorderByPhone;
    }

    public final InternetPaymentPrerequisiteParam getInternetPayment() {
        return this.internetPayment;
    }

    public final InvoiceHcsPrerequisiteParam getInvoiceHcs() {
        return this.invoiceHcs;
    }

    public final MobilePaymentPrerequisiteParam getMobilePayment() {
        return this.mobilePayment;
    }

    public final PhoneTransferPrerequisiteParam getPhone() {
        return this.phone;
    }

    public final String getQrString() {
        return this.qrString;
    }

    public final SelfTransferPrerequisiteParam getSelf() {
        return this.self;
    }

    public final SelfTopupPrerequisiteParam getSelfTopup() {
        return this.selfTopup;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final TransfersPagePrerequisiteType getType() {
        return this.type;
    }

    public int hashCode() {
        TransfersPagePrerequisiteType transfersPagePrerequisiteType = this.type;
        int hashCode = (transfersPagePrerequisiteType == null ? 0 : transfersPagePrerequisiteType.hashCode()) * 31;
        SelfTransferPrerequisiteParam selfTransferPrerequisiteParam = this.self;
        int hashCode2 = (hashCode + (selfTransferPrerequisiteParam == null ? 0 : selfTransferPrerequisiteParam.hashCode())) * 31;
        SelfTopupPrerequisiteParam selfTopupPrerequisiteParam = this.selfTopup;
        int hashCode3 = (hashCode2 + (selfTopupPrerequisiteParam == null ? 0 : selfTopupPrerequisiteParam.hashCode())) * 31;
        PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam = this.phone;
        int hashCode4 = (hashCode3 + (phoneTransferPrerequisiteParam == null ? 0 : phoneTransferPrerequisiteParam.hashCode())) * 31;
        MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam = this.mobilePayment;
        int hashCode5 = (hashCode4 + (mobilePaymentPrerequisiteParam == null ? 0 : mobilePaymentPrerequisiteParam.hashCode())) * 31;
        String str = this.qrString;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CommonTopupPrerequisiteParam commonTopupPrerequisiteParam = this.commonTopup;
        int hashCode7 = (hashCode6 + (commonTopupPrerequisiteParam == null ? 0 : commonTopupPrerequisiteParam.hashCode())) * 31;
        InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam = this.internetPayment;
        int hashCode8 = (hashCode7 + (internetPaymentPrerequisiteParam == null ? 0 : internetPaymentPrerequisiteParam.hashCode())) * 31;
        C2GPrerequisiteParam c2GPrerequisiteParam = this.c2g;
        int hashCode9 = (hashCode8 + (c2GPrerequisiteParam == null ? 0 : c2GPrerequisiteParam.hashCode())) * 31;
        InvoiceHcsPrerequisiteParam invoiceHcsPrerequisiteParam = this.invoiceHcs;
        int hashCode10 = (hashCode9 + (invoiceHcsPrerequisiteParam == null ? 0 : invoiceHcsPrerequisiteParam.hashCode())) * 31;
        CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam = this.crossBorderByPhone;
        int hashCode11 = (hashCode10 + (crossBorderByPhonePrerequisiteParam == null ? 0 : crossBorderByPhonePrerequisiteParam.hashCode())) * 31;
        String str2 = this.templateId;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateType;
        return hashCode12 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        TransfersPagePrerequisiteType transfersPagePrerequisiteType = this.type;
        SelfTransferPrerequisiteParam selfTransferPrerequisiteParam = this.self;
        SelfTopupPrerequisiteParam selfTopupPrerequisiteParam = this.selfTopup;
        PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam = this.phone;
        MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam = this.mobilePayment;
        String str = this.qrString;
        CommonTopupPrerequisiteParam commonTopupPrerequisiteParam = this.commonTopup;
        InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam = this.internetPayment;
        C2GPrerequisiteParam c2GPrerequisiteParam = this.c2g;
        InvoiceHcsPrerequisiteParam invoiceHcsPrerequisiteParam = this.invoiceHcs;
        CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam = this.crossBorderByPhone;
        String str2 = this.templateId;
        String str3 = this.templateType;
        StringBuilder sb = new StringBuilder("PrerequisiteParam(type=");
        sb.append(transfersPagePrerequisiteType);
        sb.append(", self=");
        sb.append(selfTransferPrerequisiteParam);
        sb.append(", selfTopup=");
        sb.append(selfTopupPrerequisiteParam);
        sb.append(", phone=");
        sb.append(phoneTransferPrerequisiteParam);
        sb.append(", mobilePayment=");
        sb.append(mobilePaymentPrerequisiteParam);
        sb.append(", qrString=");
        sb.append(str);
        sb.append(", commonTopup=");
        sb.append(commonTopupPrerequisiteParam);
        sb.append(", internetPayment=");
        sb.append(internetPaymentPrerequisiteParam);
        sb.append(", c2g=");
        sb.append(c2GPrerequisiteParam);
        sb.append(", invoiceHcs=");
        sb.append(invoiceHcsPrerequisiteParam);
        sb.append(", crossBorderByPhone=");
        sb.append(crossBorderByPhonePrerequisiteParam);
        sb.append(", templateId=");
        sb.append(str2);
        sb.append(", templateType=");
        return oyr.t(sb, str3, Extension.C_BRAKE);
    }

    public PrerequisiteParam(@Json(name = "type") TransfersPagePrerequisiteType transfersPagePrerequisiteType, @Json(name = "self_transfer_prereq") SelfTransferPrerequisiteParam selfTransferPrerequisiteParam, @Json(name = "self_topup_prereq") SelfTopupPrerequisiteParam selfTopupPrerequisiteParam, @Json(name = "phone_transfer_prereq") PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam, @Json(name = "mobile_payment_prereq") MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam, @Json(name = "qr_string") String str, @Json(name = "common_topup_prereq") CommonTopupPrerequisiteParam commonTopupPrerequisiteParam, @Json(name = "internet_payment_prereq") InternetPaymentPrerequisiteParam internetPaymentPrerequisiteParam, @Json(name = "c2g_prereq") C2GPrerequisiteParam c2GPrerequisiteParam, @Json(name = "invoice_hcs_prereq") InvoiceHcsPrerequisiteParam invoiceHcsPrerequisiteParam, @Json(name = "cross_border_by_phone_prereq") CrossBorderByPhonePrerequisiteParam crossBorderByPhonePrerequisiteParam, @Json(name = "template_id") String str2, @Json(name = "template_type") String str3) {
        this.type = transfersPagePrerequisiteType;
        this.self = selfTransferPrerequisiteParam;
        this.selfTopup = selfTopupPrerequisiteParam;
        this.phone = phoneTransferPrerequisiteParam;
        this.mobilePayment = mobilePaymentPrerequisiteParam;
        this.qrString = str;
        this.commonTopup = commonTopupPrerequisiteParam;
        this.internetPayment = internetPaymentPrerequisiteParam;
        this.c2g = c2GPrerequisiteParam;
        this.invoiceHcs = invoiceHcsPrerequisiteParam;
        this.crossBorderByPhone = crossBorderByPhonePrerequisiteParam;
        this.templateId = str2;
        this.templateType = str3;
    }
}
