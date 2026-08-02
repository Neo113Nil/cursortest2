package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.api.entities.PhoneTransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010'HÆ\u0003Jí\u0001\u0010c\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010'HÆ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020hHÖ\u0001J\t\u0010i\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bN\u0010O¨\u0006j"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferRequest;", "", "scenario", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "direction", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "type", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GeneralTransferType;", "selfTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferRequest;", "selfTopupRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupRequest;", "phoneTransferRequest", "Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest;", "requisitesPersonTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;", "requisitesLegalTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequest;", "requisitesHcsPayloadTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequest;", "me2meTopupRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/Me2MeTopupRequest;", "aftTopupRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequest;", "mobilePaymentRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentRequest;", "internetPaymentRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentRequest;", "sbpC2gTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequest;", "invoiceHcsTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsTransferRequest;", "crossBorderByPhoneRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequest;", "mkkCashoutRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MkkCashoutTransferRequest;", "b2cTransferRequest", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequest;", "transferId", "", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GeneralTransferType;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupRequest;Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/Me2MeTopupRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MkkCashoutTransferRequest;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequest;Ljava/lang/String;)V", "getScenario", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageRequest$TransfersPageScenario;", "getDirection", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "getType", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GeneralTransferType;", "getSelfTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTransferRequest;", "getSelfTopupRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SelfTopupRequest;", "getPhoneTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest;", "getRequisitesPersonTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesPersonTransferRequest;", "getRequisitesLegalTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequest;", "getRequisitesHcsPayloadTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequest;", "getMe2meTopupRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/Me2MeTopupRequest;", "getAftTopupRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequest;", "getMobilePaymentRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentRequest;", "getInternetPaymentRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentRequest;", "getSbpC2gTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SbpC2gTransferRequest;", "getInvoiceHcsTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InvoiceHcsTransferRequest;", "getCrossBorderByPhoneRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderByPhoneRequest;", "getMkkCashoutRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MkkCashoutTransferRequest;", "getB2cTransferRequest", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferRequest;", "getTransferId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferRequest {
    private final AftTopupRequest aftTopupRequest;
    private final B2cTransferRequest b2cTransferRequest;
    private final CrossBorderByPhoneRequest crossBorderByPhoneRequest;
    private final TransferDirectionType direction;
    private final InternetPaymentRequest internetPaymentRequest;
    private final InvoiceHcsTransferRequest invoiceHcsTransferRequest;
    private final Me2MeTopupRequest me2meTopupRequest;
    private final MkkCashoutTransferRequest mkkCashoutRequest;
    private final MobilePaymentRequest mobilePaymentRequest;
    private final PhoneTransferRequest phoneTransferRequest;
    private final RequisitesHcsTransferRequest requisitesHcsPayloadTransferRequest;
    private final RequisitesLegalTransferRequest requisitesLegalTransferRequest;
    private final RequisitesPersonTransferRequest requisitesPersonTransferRequest;
    private final SbpC2gTransferRequest sbpC2gTransferRequest;
    private final TransfersPageRequest.TransfersPageScenario scenario;
    private final SelfTopupRequest selfTopupRequest;
    private final SelfTransferRequest selfTransferRequest;
    private final String transferId;
    private final GeneralTransferType type;

    public /* synthetic */ TransferRequest(TransfersPageRequest.TransfersPageScenario transfersPageScenario, TransferDirectionType transferDirectionType, GeneralTransferType generalTransferType, SelfTransferRequest selfTransferRequest, SelfTopupRequest selfTopupRequest, PhoneTransferRequest phoneTransferRequest, RequisitesPersonTransferRequest requisitesPersonTransferRequest, RequisitesLegalTransferRequest requisitesLegalTransferRequest, RequisitesHcsTransferRequest requisitesHcsTransferRequest, Me2MeTopupRequest me2MeTopupRequest, AftTopupRequest aftTopupRequest, MobilePaymentRequest mobilePaymentRequest, InternetPaymentRequest internetPaymentRequest, SbpC2gTransferRequest sbpC2gTransferRequest, InvoiceHcsTransferRequest invoiceHcsTransferRequest, CrossBorderByPhoneRequest crossBorderByPhoneRequest, MkkCashoutTransferRequest mkkCashoutTransferRequest, B2cTransferRequest b2cTransferRequest, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transfersPageScenario, transferDirectionType, generalTransferType, (i & 8) != 0 ? null : selfTransferRequest, (i & 16) != 0 ? null : selfTopupRequest, (i & 32) != 0 ? null : phoneTransferRequest, (i & 64) != 0 ? null : requisitesPersonTransferRequest, (i & 128) != 0 ? null : requisitesLegalTransferRequest, (i & 256) != 0 ? null : requisitesHcsTransferRequest, (i & 512) != 0 ? null : me2MeTopupRequest, (i & 1024) != 0 ? null : aftTopupRequest, (i & 2048) != 0 ? null : mobilePaymentRequest, (i & 4096) != 0 ? null : internetPaymentRequest, (i & 8192) != 0 ? null : sbpC2gTransferRequest, (i & 16384) != 0 ? null : invoiceHcsTransferRequest, (32768 & i) != 0 ? null : crossBorderByPhoneRequest, (65536 & i) != 0 ? null : mkkCashoutTransferRequest, (i & 131072) != 0 ? null : b2cTransferRequest, str);
    }

    public static /* synthetic */ TransferRequest copy$default(TransferRequest transferRequest, TransfersPageRequest.TransfersPageScenario transfersPageScenario, TransferDirectionType transferDirectionType, GeneralTransferType generalTransferType, SelfTransferRequest selfTransferRequest, SelfTopupRequest selfTopupRequest, PhoneTransferRequest phoneTransferRequest, RequisitesPersonTransferRequest requisitesPersonTransferRequest, RequisitesLegalTransferRequest requisitesLegalTransferRequest, RequisitesHcsTransferRequest requisitesHcsTransferRequest, Me2MeTopupRequest me2MeTopupRequest, AftTopupRequest aftTopupRequest, MobilePaymentRequest mobilePaymentRequest, InternetPaymentRequest internetPaymentRequest, SbpC2gTransferRequest sbpC2gTransferRequest, InvoiceHcsTransferRequest invoiceHcsTransferRequest, CrossBorderByPhoneRequest crossBorderByPhoneRequest, MkkCashoutTransferRequest mkkCashoutTransferRequest, B2cTransferRequest b2cTransferRequest, String str, int i, Object obj) {
        String str2;
        B2cTransferRequest b2cTransferRequest2;
        TransfersPageRequest.TransfersPageScenario transfersPageScenario2 = (i & 1) != 0 ? transferRequest.scenario : transfersPageScenario;
        TransferDirectionType transferDirectionType2 = (i & 2) != 0 ? transferRequest.direction : transferDirectionType;
        GeneralTransferType generalTransferType2 = (i & 4) != 0 ? transferRequest.type : generalTransferType;
        SelfTransferRequest selfTransferRequest2 = (i & 8) != 0 ? transferRequest.selfTransferRequest : selfTransferRequest;
        SelfTopupRequest selfTopupRequest2 = (i & 16) != 0 ? transferRequest.selfTopupRequest : selfTopupRequest;
        PhoneTransferRequest phoneTransferRequest2 = (i & 32) != 0 ? transferRequest.phoneTransferRequest : phoneTransferRequest;
        RequisitesPersonTransferRequest requisitesPersonTransferRequest2 = (i & 64) != 0 ? transferRequest.requisitesPersonTransferRequest : requisitesPersonTransferRequest;
        RequisitesLegalTransferRequest requisitesLegalTransferRequest2 = (i & 128) != 0 ? transferRequest.requisitesLegalTransferRequest : requisitesLegalTransferRequest;
        RequisitesHcsTransferRequest requisitesHcsTransferRequest2 = (i & 256) != 0 ? transferRequest.requisitesHcsPayloadTransferRequest : requisitesHcsTransferRequest;
        Me2MeTopupRequest me2MeTopupRequest2 = (i & 512) != 0 ? transferRequest.me2meTopupRequest : me2MeTopupRequest;
        AftTopupRequest aftTopupRequest2 = (i & 1024) != 0 ? transferRequest.aftTopupRequest : aftTopupRequest;
        MobilePaymentRequest mobilePaymentRequest2 = (i & 2048) != 0 ? transferRequest.mobilePaymentRequest : mobilePaymentRequest;
        InternetPaymentRequest internetPaymentRequest2 = (i & 4096) != 0 ? transferRequest.internetPaymentRequest : internetPaymentRequest;
        SbpC2gTransferRequest sbpC2gTransferRequest2 = (i & 8192) != 0 ? transferRequest.sbpC2gTransferRequest : sbpC2gTransferRequest;
        TransfersPageRequest.TransfersPageScenario transfersPageScenario3 = transfersPageScenario2;
        InvoiceHcsTransferRequest invoiceHcsTransferRequest2 = (i & 16384) != 0 ? transferRequest.invoiceHcsTransferRequest : invoiceHcsTransferRequest;
        CrossBorderByPhoneRequest crossBorderByPhoneRequest2 = (i & 32768) != 0 ? transferRequest.crossBorderByPhoneRequest : crossBorderByPhoneRequest;
        MkkCashoutTransferRequest mkkCashoutTransferRequest2 = (i & 65536) != 0 ? transferRequest.mkkCashoutRequest : mkkCashoutTransferRequest;
        B2cTransferRequest b2cTransferRequest3 = (i & 131072) != 0 ? transferRequest.b2cTransferRequest : b2cTransferRequest;
        if ((i & 262144) != 0) {
            b2cTransferRequest2 = b2cTransferRequest3;
            str2 = transferRequest.transferId;
        } else {
            str2 = str;
            b2cTransferRequest2 = b2cTransferRequest3;
        }
        return transferRequest.copy(transfersPageScenario3, transferDirectionType2, generalTransferType2, selfTransferRequest2, selfTopupRequest2, phoneTransferRequest2, requisitesPersonTransferRequest2, requisitesLegalTransferRequest2, requisitesHcsTransferRequest2, me2MeTopupRequest2, aftTopupRequest2, mobilePaymentRequest2, internetPaymentRequest2, sbpC2gTransferRequest2, invoiceHcsTransferRequest2, crossBorderByPhoneRequest2, mkkCashoutTransferRequest2, b2cTransferRequest2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransfersPageRequest.TransfersPageScenario getScenario() {
        return this.scenario;
    }

    /* renamed from: component10, reason: from getter */
    public final Me2MeTopupRequest getMe2meTopupRequest() {
        return this.me2meTopupRequest;
    }

    /* renamed from: component11, reason: from getter */
    public final AftTopupRequest getAftTopupRequest() {
        return this.aftTopupRequest;
    }

    /* renamed from: component12, reason: from getter */
    public final MobilePaymentRequest getMobilePaymentRequest() {
        return this.mobilePaymentRequest;
    }

    /* renamed from: component13, reason: from getter */
    public final InternetPaymentRequest getInternetPaymentRequest() {
        return this.internetPaymentRequest;
    }

    /* renamed from: component14, reason: from getter */
    public final SbpC2gTransferRequest getSbpC2gTransferRequest() {
        return this.sbpC2gTransferRequest;
    }

    /* renamed from: component15, reason: from getter */
    public final InvoiceHcsTransferRequest getInvoiceHcsTransferRequest() {
        return this.invoiceHcsTransferRequest;
    }

    /* renamed from: component16, reason: from getter */
    public final CrossBorderByPhoneRequest getCrossBorderByPhoneRequest() {
        return this.crossBorderByPhoneRequest;
    }

    /* renamed from: component17, reason: from getter */
    public final MkkCashoutTransferRequest getMkkCashoutRequest() {
        return this.mkkCashoutRequest;
    }

    /* renamed from: component18, reason: from getter */
    public final B2cTransferRequest getB2cTransferRequest() {
        return this.b2cTransferRequest;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferDirectionType getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final GeneralTransferType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final SelfTransferRequest getSelfTransferRequest() {
        return this.selfTransferRequest;
    }

    /* renamed from: component5, reason: from getter */
    public final SelfTopupRequest getSelfTopupRequest() {
        return this.selfTopupRequest;
    }

    /* renamed from: component6, reason: from getter */
    public final PhoneTransferRequest getPhoneTransferRequest() {
        return this.phoneTransferRequest;
    }

    /* renamed from: component7, reason: from getter */
    public final RequisitesPersonTransferRequest getRequisitesPersonTransferRequest() {
        return this.requisitesPersonTransferRequest;
    }

    /* renamed from: component8, reason: from getter */
    public final RequisitesLegalTransferRequest getRequisitesLegalTransferRequest() {
        return this.requisitesLegalTransferRequest;
    }

    /* renamed from: component9, reason: from getter */
    public final RequisitesHcsTransferRequest getRequisitesHcsPayloadTransferRequest() {
        return this.requisitesHcsPayloadTransferRequest;
    }

    public final TransferRequest copy(@Json(name = "scenario") TransfersPageRequest.TransfersPageScenario scenario, @Json(name = "direction") TransferDirectionType direction, @Json(name = "type") GeneralTransferType type, @Json(name = "self_transfer_payload") SelfTransferRequest selfTransferRequest, @Json(name = "self_topup_payload") SelfTopupRequest selfTopupRequest, @Json(name = "phone_transfer_payload") PhoneTransferRequest phoneTransferRequest, @Json(name = "requisites_person_payload") RequisitesPersonTransferRequest requisitesPersonTransferRequest, @Json(name = "requisites_legal_payload") RequisitesLegalTransferRequest requisitesLegalTransferRequest, @Json(name = "requisites_hcs_payload") RequisitesHcsTransferRequest requisitesHcsPayloadTransferRequest, @Json(name = "me2me_topup_payload") Me2MeTopupRequest me2meTopupRequest, @Json(name = "aft_topup_payload") AftTopupRequest aftTopupRequest, @Json(name = "mobile_payment_payload") MobilePaymentRequest mobilePaymentRequest, @Json(name = "internet_payment_payload") InternetPaymentRequest internetPaymentRequest, @Json(name = "sbp_c2g_transfer_payload") SbpC2gTransferRequest sbpC2gTransferRequest, @Json(name = "invoice_hcs_transfer_payload") InvoiceHcsTransferRequest invoiceHcsTransferRequest, @Json(name = "cross_border_by_phone_payload") CrossBorderByPhoneRequest crossBorderByPhoneRequest, @Json(name = "mkk_cashout_payload") MkkCashoutTransferRequest mkkCashoutRequest, @Json(name = "b2c_transfer_payload") B2cTransferRequest b2cTransferRequest, @Json(name = "transfer_id") String transferId) {
        return new TransferRequest(scenario, direction, type, selfTransferRequest, selfTopupRequest, phoneTransferRequest, requisitesPersonTransferRequest, requisitesLegalTransferRequest, requisitesHcsPayloadTransferRequest, me2meTopupRequest, aftTopupRequest, mobilePaymentRequest, internetPaymentRequest, sbpC2gTransferRequest, invoiceHcsTransferRequest, crossBorderByPhoneRequest, mkkCashoutRequest, b2cTransferRequest, transferId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferRequest)) {
            return false;
        }
        TransferRequest transferRequest = (TransferRequest) other;
        return this.scenario == transferRequest.scenario && this.direction == transferRequest.direction && this.type == transferRequest.type && jl40.l(this.selfTransferRequest, transferRequest.selfTransferRequest) && jl40.l(this.selfTopupRequest, transferRequest.selfTopupRequest) && jl40.l(this.phoneTransferRequest, transferRequest.phoneTransferRequest) && jl40.l(this.requisitesPersonTransferRequest, transferRequest.requisitesPersonTransferRequest) && jl40.l(this.requisitesLegalTransferRequest, transferRequest.requisitesLegalTransferRequest) && jl40.l(this.requisitesHcsPayloadTransferRequest, transferRequest.requisitesHcsPayloadTransferRequest) && jl40.l(this.me2meTopupRequest, transferRequest.me2meTopupRequest) && jl40.l(this.aftTopupRequest, transferRequest.aftTopupRequest) && jl40.l(this.mobilePaymentRequest, transferRequest.mobilePaymentRequest) && jl40.l(this.internetPaymentRequest, transferRequest.internetPaymentRequest) && jl40.l(this.sbpC2gTransferRequest, transferRequest.sbpC2gTransferRequest) && jl40.l(this.invoiceHcsTransferRequest, transferRequest.invoiceHcsTransferRequest) && jl40.l(this.crossBorderByPhoneRequest, transferRequest.crossBorderByPhoneRequest) && jl40.l(this.mkkCashoutRequest, transferRequest.mkkCashoutRequest) && jl40.l(this.b2cTransferRequest, transferRequest.b2cTransferRequest) && jl40.l(this.transferId, transferRequest.transferId);
    }

    public final AftTopupRequest getAftTopupRequest() {
        return this.aftTopupRequest;
    }

    public final B2cTransferRequest getB2cTransferRequest() {
        return this.b2cTransferRequest;
    }

    public final CrossBorderByPhoneRequest getCrossBorderByPhoneRequest() {
        return this.crossBorderByPhoneRequest;
    }

    public final TransferDirectionType getDirection() {
        return this.direction;
    }

    public final InternetPaymentRequest getInternetPaymentRequest() {
        return this.internetPaymentRequest;
    }

    public final InvoiceHcsTransferRequest getInvoiceHcsTransferRequest() {
        return this.invoiceHcsTransferRequest;
    }

    public final Me2MeTopupRequest getMe2meTopupRequest() {
        return this.me2meTopupRequest;
    }

    public final MkkCashoutTransferRequest getMkkCashoutRequest() {
        return this.mkkCashoutRequest;
    }

    public final MobilePaymentRequest getMobilePaymentRequest() {
        return this.mobilePaymentRequest;
    }

    public final PhoneTransferRequest getPhoneTransferRequest() {
        return this.phoneTransferRequest;
    }

    public final RequisitesHcsTransferRequest getRequisitesHcsPayloadTransferRequest() {
        return this.requisitesHcsPayloadTransferRequest;
    }

    public final RequisitesLegalTransferRequest getRequisitesLegalTransferRequest() {
        return this.requisitesLegalTransferRequest;
    }

    public final RequisitesPersonTransferRequest getRequisitesPersonTransferRequest() {
        return this.requisitesPersonTransferRequest;
    }

    public final SbpC2gTransferRequest getSbpC2gTransferRequest() {
        return this.sbpC2gTransferRequest;
    }

    public final TransfersPageRequest.TransfersPageScenario getScenario() {
        return this.scenario;
    }

    public final SelfTopupRequest getSelfTopupRequest() {
        return this.selfTopupRequest;
    }

    public final SelfTransferRequest getSelfTransferRequest() {
        return this.selfTransferRequest;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final GeneralTransferType getType() {
        return this.type;
    }

    public int hashCode() {
        TransfersPageRequest.TransfersPageScenario transfersPageScenario = this.scenario;
        int hashCode = (transfersPageScenario == null ? 0 : transfersPageScenario.hashCode()) * 31;
        TransferDirectionType transferDirectionType = this.direction;
        int hashCode2 = (hashCode + (transferDirectionType == null ? 0 : transferDirectionType.hashCode())) * 31;
        GeneralTransferType generalTransferType = this.type;
        int hashCode3 = (hashCode2 + (generalTransferType == null ? 0 : generalTransferType.hashCode())) * 31;
        SelfTransferRequest selfTransferRequest = this.selfTransferRequest;
        int hashCode4 = (hashCode3 + (selfTransferRequest == null ? 0 : selfTransferRequest.hashCode())) * 31;
        SelfTopupRequest selfTopupRequest = this.selfTopupRequest;
        int hashCode5 = (hashCode4 + (selfTopupRequest == null ? 0 : selfTopupRequest.hashCode())) * 31;
        PhoneTransferRequest phoneTransferRequest = this.phoneTransferRequest;
        int hashCode6 = (hashCode5 + (phoneTransferRequest == null ? 0 : phoneTransferRequest.hashCode())) * 31;
        RequisitesPersonTransferRequest requisitesPersonTransferRequest = this.requisitesPersonTransferRequest;
        int hashCode7 = (hashCode6 + (requisitesPersonTransferRequest == null ? 0 : requisitesPersonTransferRequest.hashCode())) * 31;
        RequisitesLegalTransferRequest requisitesLegalTransferRequest = this.requisitesLegalTransferRequest;
        int hashCode8 = (hashCode7 + (requisitesLegalTransferRequest == null ? 0 : requisitesLegalTransferRequest.hashCode())) * 31;
        RequisitesHcsTransferRequest requisitesHcsTransferRequest = this.requisitesHcsPayloadTransferRequest;
        int hashCode9 = (hashCode8 + (requisitesHcsTransferRequest == null ? 0 : requisitesHcsTransferRequest.hashCode())) * 31;
        Me2MeTopupRequest me2MeTopupRequest = this.me2meTopupRequest;
        int hashCode10 = (hashCode9 + (me2MeTopupRequest == null ? 0 : me2MeTopupRequest.hashCode())) * 31;
        AftTopupRequest aftTopupRequest = this.aftTopupRequest;
        int hashCode11 = (hashCode10 + (aftTopupRequest == null ? 0 : aftTopupRequest.hashCode())) * 31;
        MobilePaymentRequest mobilePaymentRequest = this.mobilePaymentRequest;
        int hashCode12 = (hashCode11 + (mobilePaymentRequest == null ? 0 : mobilePaymentRequest.hashCode())) * 31;
        InternetPaymentRequest internetPaymentRequest = this.internetPaymentRequest;
        int hashCode13 = (hashCode12 + (internetPaymentRequest == null ? 0 : internetPaymentRequest.hashCode())) * 31;
        SbpC2gTransferRequest sbpC2gTransferRequest = this.sbpC2gTransferRequest;
        int hashCode14 = (hashCode13 + (sbpC2gTransferRequest == null ? 0 : sbpC2gTransferRequest.hashCode())) * 31;
        InvoiceHcsTransferRequest invoiceHcsTransferRequest = this.invoiceHcsTransferRequest;
        int hashCode15 = (hashCode14 + (invoiceHcsTransferRequest == null ? 0 : invoiceHcsTransferRequest.hashCode())) * 31;
        CrossBorderByPhoneRequest crossBorderByPhoneRequest = this.crossBorderByPhoneRequest;
        int hashCode16 = (hashCode15 + (crossBorderByPhoneRequest == null ? 0 : crossBorderByPhoneRequest.hashCode())) * 31;
        MkkCashoutTransferRequest mkkCashoutTransferRequest = this.mkkCashoutRequest;
        int hashCode17 = (hashCode16 + (mkkCashoutTransferRequest == null ? 0 : mkkCashoutTransferRequest.hashCode())) * 31;
        B2cTransferRequest b2cTransferRequest = this.b2cTransferRequest;
        int hashCode18 = (hashCode17 + (b2cTransferRequest == null ? 0 : b2cTransferRequest.hashCode())) * 31;
        String str = this.transferId;
        return hashCode18 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        TransfersPageRequest.TransfersPageScenario transfersPageScenario = this.scenario;
        TransferDirectionType transferDirectionType = this.direction;
        GeneralTransferType generalTransferType = this.type;
        SelfTransferRequest selfTransferRequest = this.selfTransferRequest;
        SelfTopupRequest selfTopupRequest = this.selfTopupRequest;
        PhoneTransferRequest phoneTransferRequest = this.phoneTransferRequest;
        RequisitesPersonTransferRequest requisitesPersonTransferRequest = this.requisitesPersonTransferRequest;
        RequisitesLegalTransferRequest requisitesLegalTransferRequest = this.requisitesLegalTransferRequest;
        RequisitesHcsTransferRequest requisitesHcsTransferRequest = this.requisitesHcsPayloadTransferRequest;
        Me2MeTopupRequest me2MeTopupRequest = this.me2meTopupRequest;
        AftTopupRequest aftTopupRequest = this.aftTopupRequest;
        MobilePaymentRequest mobilePaymentRequest = this.mobilePaymentRequest;
        InternetPaymentRequest internetPaymentRequest = this.internetPaymentRequest;
        SbpC2gTransferRequest sbpC2gTransferRequest = this.sbpC2gTransferRequest;
        InvoiceHcsTransferRequest invoiceHcsTransferRequest = this.invoiceHcsTransferRequest;
        CrossBorderByPhoneRequest crossBorderByPhoneRequest = this.crossBorderByPhoneRequest;
        MkkCashoutTransferRequest mkkCashoutTransferRequest = this.mkkCashoutRequest;
        B2cTransferRequest b2cTransferRequest = this.b2cTransferRequest;
        String str = this.transferId;
        StringBuilder sb = new StringBuilder("TransferRequest(scenario=");
        sb.append(transfersPageScenario);
        sb.append(", direction=");
        sb.append(transferDirectionType);
        sb.append(", type=");
        sb.append(generalTransferType);
        sb.append(", selfTransferRequest=");
        sb.append(selfTransferRequest);
        sb.append(", selfTopupRequest=");
        sb.append(selfTopupRequest);
        sb.append(", phoneTransferRequest=");
        sb.append(phoneTransferRequest);
        sb.append(", requisitesPersonTransferRequest=");
        sb.append(requisitesPersonTransferRequest);
        sb.append(", requisitesLegalTransferRequest=");
        sb.append(requisitesLegalTransferRequest);
        sb.append(", requisitesHcsPayloadTransferRequest=");
        sb.append(requisitesHcsTransferRequest);
        sb.append(", me2meTopupRequest=");
        sb.append(me2MeTopupRequest);
        sb.append(", aftTopupRequest=");
        sb.append(aftTopupRequest);
        sb.append(", mobilePaymentRequest=");
        sb.append(mobilePaymentRequest);
        sb.append(", internetPaymentRequest=");
        sb.append(internetPaymentRequest);
        sb.append(", sbpC2gTransferRequest=");
        sb.append(sbpC2gTransferRequest);
        sb.append(", invoiceHcsTransferRequest=");
        sb.append(invoiceHcsTransferRequest);
        sb.append(", crossBorderByPhoneRequest=");
        sb.append(crossBorderByPhoneRequest);
        sb.append(", mkkCashoutRequest=");
        sb.append(mkkCashoutTransferRequest);
        sb.append(", b2cTransferRequest=");
        sb.append(b2cTransferRequest);
        sb.append(", transferId=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    public TransferRequest(@Json(name = "scenario") TransfersPageRequest.TransfersPageScenario transfersPageScenario, @Json(name = "direction") TransferDirectionType transferDirectionType, @Json(name = "type") GeneralTransferType generalTransferType, @Json(name = "self_transfer_payload") SelfTransferRequest selfTransferRequest, @Json(name = "self_topup_payload") SelfTopupRequest selfTopupRequest, @Json(name = "phone_transfer_payload") PhoneTransferRequest phoneTransferRequest, @Json(name = "requisites_person_payload") RequisitesPersonTransferRequest requisitesPersonTransferRequest, @Json(name = "requisites_legal_payload") RequisitesLegalTransferRequest requisitesLegalTransferRequest, @Json(name = "requisites_hcs_payload") RequisitesHcsTransferRequest requisitesHcsTransferRequest, @Json(name = "me2me_topup_payload") Me2MeTopupRequest me2MeTopupRequest, @Json(name = "aft_topup_payload") AftTopupRequest aftTopupRequest, @Json(name = "mobile_payment_payload") MobilePaymentRequest mobilePaymentRequest, @Json(name = "internet_payment_payload") InternetPaymentRequest internetPaymentRequest, @Json(name = "sbp_c2g_transfer_payload") SbpC2gTransferRequest sbpC2gTransferRequest, @Json(name = "invoice_hcs_transfer_payload") InvoiceHcsTransferRequest invoiceHcsTransferRequest, @Json(name = "cross_border_by_phone_payload") CrossBorderByPhoneRequest crossBorderByPhoneRequest, @Json(name = "mkk_cashout_payload") MkkCashoutTransferRequest mkkCashoutTransferRequest, @Json(name = "b2c_transfer_payload") B2cTransferRequest b2cTransferRequest, @Json(name = "transfer_id") String str) {
        this.scenario = transfersPageScenario;
        this.direction = transferDirectionType;
        this.type = generalTransferType;
        this.selfTransferRequest = selfTransferRequest;
        this.selfTopupRequest = selfTopupRequest;
        this.phoneTransferRequest = phoneTransferRequest;
        this.requisitesPersonTransferRequest = requisitesPersonTransferRequest;
        this.requisitesLegalTransferRequest = requisitesLegalTransferRequest;
        this.requisitesHcsPayloadTransferRequest = requisitesHcsTransferRequest;
        this.me2meTopupRequest = me2MeTopupRequest;
        this.aftTopupRequest = aftTopupRequest;
        this.mobilePaymentRequest = mobilePaymentRequest;
        this.internetPaymentRequest = internetPaymentRequest;
        this.sbpC2gTransferRequest = sbpC2gTransferRequest;
        this.invoiceHcsTransferRequest = invoiceHcsTransferRequest;
        this.crossBorderByPhoneRequest = crossBorderByPhoneRequest;
        this.mkkCashoutRequest = mkkCashoutTransferRequest;
        this.b2cTransferRequest = b2cTransferRequest;
        this.transferId = str;
    }
}
