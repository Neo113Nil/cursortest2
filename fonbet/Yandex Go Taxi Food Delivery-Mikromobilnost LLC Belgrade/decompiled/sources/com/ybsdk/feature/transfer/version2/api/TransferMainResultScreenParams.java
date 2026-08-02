package com.ybsdk.feature.transfer.version2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.entities.AutoFundPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.C2gTransferRequisitesEntity;
import com.ybsdk.feature.transfer.version2.api.entities.HcsInvoiceRequisitesEntity;
import com.ybsdk.feature.transfer.version2.api.entities.MiddleNameEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\"#$%&'()*+,-./01R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005\u0082\u0001\r23456789:;<=>¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", CreateApplicationWithProductJsonAdapter.productKey, "", "getProduct", "()Ljava/lang/String;", "direction", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "scenario", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "resultPage", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "timeoutResultPage", "getTimeoutResultPage", "money", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "checkId", "getCheckId", "transferId", "getTransferId", "transferSessionId", "getTransferSessionId", "referrer", "getReferrer", "templatePaymentType", "getTemplatePaymentType", "SelfTransferParams", "SelfTopupParams", "PhoneTransferParams", "TransferRequisiteParams", "Me2MeTopupParams", "AftTopupParams", "MobilePaymentParams", "InternetPaymentParams", "C2gTransferParams", "HcsInvoiceTransferParams", "CrossBorderByPhoneParams", "CurrencyRateEntity", "CrossBorderPriorityMoneyType", "MkkCashoutParams", "B2cTransferParams", "Scenario", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$AftTopupParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$B2cTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$C2gTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderByPhoneParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$HcsInvoiceTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$InternetPaymentParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$Me2MeTopupParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$MkkCashoutParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$MobilePaymentParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$PhoneTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$SelfTopupParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$SelfTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransferMainResultScreenParams extends ScreenParams {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderPriorityMoneyType;", "", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_CREDIT, "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CrossBorderPriorityMoneyType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CrossBorderPriorityMoneyType[] $VALUES;
        public static final CrossBorderPriorityMoneyType DEBIT = new CrossBorderPriorityMoneyType(Card.CARD_TYPE_DEBIT, 0);
        public static final CrossBorderPriorityMoneyType CREDIT = new CrossBorderPriorityMoneyType(Card.CARD_TYPE_CREDIT, 1);

        private static final /* synthetic */ CrossBorderPriorityMoneyType[] $values() {
            return new CrossBorderPriorityMoneyType[]{DEBIT, CREDIT};
        }

        static {
            CrossBorderPriorityMoneyType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private CrossBorderPriorityMoneyType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CrossBorderPriorityMoneyType valueOf(String str) {
            return (CrossBorderPriorityMoneyType) Enum.valueOf(CrossBorderPriorityMoneyType.class, str);
        }

        public static CrossBorderPriorityMoneyType[] values() {
            return (CrossBorderPriorityMoneyType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$Scenario;", "", "<init>", "(Ljava/lang/String;I)V", "ME2ME", "SELF", "MKK_CASHOUT", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Scenario {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Scenario[] $VALUES;
        public static final Scenario ME2ME = new Scenario("ME2ME", 0);
        public static final Scenario SELF = new Scenario("SELF", 1);
        public static final Scenario MKK_CASHOUT = new Scenario("MKK_CASHOUT", 2);

        private static final /* synthetic */ Scenario[] $values() {
            return new Scenario[]{ME2ME, SELF, MKK_CASHOUT};
        }

        static {
            Scenario[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Scenario(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) $VALUES.clone();
        }
    }

    String getCheckId();

    TransferDirection getDirection();

    MoneyEntity getMoney();

    String getProduct();

    String getReferrer();

    TransferResultPageEntity getResultPage();

    TransferScenario getScenario();

    String getTemplatePaymentType();

    TransferResultPageEntity getTimeoutResultPage();

    String getTransferId();

    String getTransferSessionId();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "bic", "getBic", "paymentPurpose", "getPaymentPurpose", "ybLabel", "getYbLabel", "sourceAgreementId", "getSourceAgreementId", "RequisitesLegalTransferParams", "RequisitesPersonTransferParams", "RequisitesHcsTransferParams", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesHcsTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesLegalTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesPersonTransferParams;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TransferRequisiteParams extends TransferMainResultScreenParams {
        String getAccountNumber();

        String getBic();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ String getCheckId();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ TransferDirection getDirection();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ MoneyEntity getMoney();

        String getPaymentPurpose();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ String getProduct();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ String getReferrer();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ TransferResultPageEntity getResultPage();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ TransferScenario getScenario();

        String getSourceAgreementId();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ String getTemplatePaymentType();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ TransferResultPageEntity getTimeoutResultPage();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ String getTransferId();

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        /* synthetic */ String getTransferSessionId();

        String getYbLabel();

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010(J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010(J\u0010\u00107\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010(J\u0010\u0010;\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010(J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010(J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010(J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010(Jä\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010(J\u0010\u0010D\u001a\u00020 HÖ\u0001¢\u0006\u0004\bD\u0010&J\u001a\u0010G\u001a\u00020\u00122\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bK\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bM\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bO\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bQ\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bR\u0010/R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bS\u0010(R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bT\u0010(R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bU\u0010(R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bV\u0010(R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bW\u0010(R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bX\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u00108R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\b[\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\b\\\u0010(R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010]\u001a\u0004\b^\u0010<R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\b_\u0010(R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\b`\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\ba\u0010(R\u001a\u0010\u001b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bb\u0010(¨\u0006c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesHcsTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "accountNumber", "bic", "inn", "paymentPeriod", "beneficiaryName", "hcsPersonalAccount", "", "vatIncluded", "ybLabel", "paymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "sourceAgreementId", "checkId", "transferId", "transferSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Z", "component14", "component15", "component16", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesHcsTransferParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getAccountNumber", "getBic", "getInn", "getPaymentPeriod", "getBeneficiaryName", "getHcsPersonalAccount", "Z", "getVatIncluded", "getYbLabel", "getPaymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getSourceAgreementId", "getCheckId", "getTransferId", "getTransferSessionId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RequisitesHcsTransferParams implements TransferRequisiteParams {
            public static final Parcelable.Creator<RequisitesHcsTransferParams> CREATOR = new Creator();
            private final String accountNumber;
            private final String beneficiaryName;
            private final String bic;
            private final String checkId;
            private final TransferDirection direction;
            private final String hcsPersonalAccount;
            private final String inn;
            private final MoneyEntity money;
            private final String paymentPeriod;
            private final String paymentPurpose;
            private final String product;
            private final String referrer;
            private final TransferResultPageEntity resultPage;
            private final TransferScenario scenario;
            private final String sourceAgreementId;
            private final TransferResultPageEntity timeoutResultPage;
            private final String transferId;
            private final String transferSessionId;
            private final boolean vatIncluded;
            private final String ybLabel;

            public RequisitesHcsTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, MoneyEntity moneyEntity, String str11, String str12, String str13, String str14) {
                this.product = str;
                this.referrer = str2;
                this.direction = transferDirection;
                this.scenario = transferScenario;
                this.resultPage = transferResultPageEntity;
                this.timeoutResultPage = transferResultPageEntity2;
                this.accountNumber = str3;
                this.bic = str4;
                this.inn = str5;
                this.paymentPeriod = str6;
                this.beneficiaryName = str7;
                this.hcsPersonalAccount = str8;
                this.vatIncluded = z;
                this.ybLabel = str9;
                this.paymentPurpose = str10;
                this.money = moneyEntity;
                this.sourceAgreementId = str11;
                this.checkId = str12;
                this.transferId = str13;
                this.transferSessionId = str14;
            }

            public static /* synthetic */ RequisitesHcsTransferParams copy$default(RequisitesHcsTransferParams requisitesHcsTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, MoneyEntity moneyEntity, String str11, String str12, String str13, String str14, int i, Object obj) {
                String str15;
                String str16;
                String str17 = (i & 1) != 0 ? requisitesHcsTransferParams.product : str;
                String str18 = (i & 2) != 0 ? requisitesHcsTransferParams.referrer : str2;
                TransferDirection transferDirection2 = (i & 4) != 0 ? requisitesHcsTransferParams.direction : transferDirection;
                TransferScenario transferScenario2 = (i & 8) != 0 ? requisitesHcsTransferParams.scenario : transferScenario;
                TransferResultPageEntity transferResultPageEntity3 = (i & 16) != 0 ? requisitesHcsTransferParams.resultPage : transferResultPageEntity;
                TransferResultPageEntity transferResultPageEntity4 = (i & 32) != 0 ? requisitesHcsTransferParams.timeoutResultPage : transferResultPageEntity2;
                String str19 = (i & 64) != 0 ? requisitesHcsTransferParams.accountNumber : str3;
                String str20 = (i & 128) != 0 ? requisitesHcsTransferParams.bic : str4;
                String str21 = (i & 256) != 0 ? requisitesHcsTransferParams.inn : str5;
                String str22 = (i & 512) != 0 ? requisitesHcsTransferParams.paymentPeriod : str6;
                String str23 = (i & 1024) != 0 ? requisitesHcsTransferParams.beneficiaryName : str7;
                String str24 = (i & 2048) != 0 ? requisitesHcsTransferParams.hcsPersonalAccount : str8;
                boolean z2 = (i & 4096) != 0 ? requisitesHcsTransferParams.vatIncluded : z;
                String str25 = (i & 8192) != 0 ? requisitesHcsTransferParams.ybLabel : str9;
                String str26 = str17;
                String str27 = (i & 16384) != 0 ? requisitesHcsTransferParams.paymentPurpose : str10;
                MoneyEntity moneyEntity2 = (i & 32768) != 0 ? requisitesHcsTransferParams.money : moneyEntity;
                String str28 = (i & 65536) != 0 ? requisitesHcsTransferParams.sourceAgreementId : str11;
                String str29 = (i & 131072) != 0 ? requisitesHcsTransferParams.checkId : str12;
                String str30 = (i & 262144) != 0 ? requisitesHcsTransferParams.transferId : str13;
                if ((i & 524288) != 0) {
                    str16 = str30;
                    str15 = requisitesHcsTransferParams.transferSessionId;
                } else {
                    str15 = str14;
                    str16 = str30;
                }
                return requisitesHcsTransferParams.copy(str26, str18, transferDirection2, transferScenario2, transferResultPageEntity3, transferResultPageEntity4, str19, str20, str21, str22, str23, str24, z2, str25, str27, moneyEntity2, str28, str29, str16, str15);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProduct() {
                return this.product;
            }

            /* renamed from: component10, reason: from getter */
            public final String getPaymentPeriod() {
                return this.paymentPeriod;
            }

            /* renamed from: component11, reason: from getter */
            public final String getBeneficiaryName() {
                return this.beneficiaryName;
            }

            /* renamed from: component12, reason: from getter */
            public final String getHcsPersonalAccount() {
                return this.hcsPersonalAccount;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getVatIncluded() {
                return this.vatIncluded;
            }

            /* renamed from: component14, reason: from getter */
            public final String getYbLabel() {
                return this.ybLabel;
            }

            /* renamed from: component15, reason: from getter */
            public final String getPaymentPurpose() {
                return this.paymentPurpose;
            }

            /* renamed from: component16, reason: from getter */
            public final MoneyEntity getMoney() {
                return this.money;
            }

            /* renamed from: component17, reason: from getter */
            public final String getSourceAgreementId() {
                return this.sourceAgreementId;
            }

            /* renamed from: component18, reason: from getter */
            public final String getCheckId() {
                return this.checkId;
            }

            /* renamed from: component19, reason: from getter */
            public final String getTransferId() {
                return this.transferId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReferrer() {
                return this.referrer;
            }

            /* renamed from: component20, reason: from getter */
            public final String getTransferSessionId() {
                return this.transferSessionId;
            }

            /* renamed from: component3, reason: from getter */
            public final TransferDirection getDirection() {
                return this.direction;
            }

            /* renamed from: component4, reason: from getter */
            public final TransferScenario getScenario() {
                return this.scenario;
            }

            /* renamed from: component5, reason: from getter */
            public final TransferResultPageEntity getResultPage() {
                return this.resultPage;
            }

            /* renamed from: component6, reason: from getter */
            public final TransferResultPageEntity getTimeoutResultPage() {
                return this.timeoutResultPage;
            }

            /* renamed from: component7, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component8, reason: from getter */
            public final String getBic() {
                return this.bic;
            }

            /* renamed from: component9, reason: from getter */
            public final String getInn() {
                return this.inn;
            }

            public final RequisitesHcsTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String accountNumber, String bic, String inn, String paymentPeriod, String beneficiaryName, String hcsPersonalAccount, boolean vatIncluded, String ybLabel, String paymentPurpose, MoneyEntity money, String sourceAgreementId, String checkId, String transferId, String transferSessionId) {
                return new RequisitesHcsTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, accountNumber, bic, inn, paymentPeriod, beneficiaryName, hcsPersonalAccount, vatIncluded, ybLabel, paymentPurpose, money, sourceAgreementId, checkId, transferId, transferSessionId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequisitesHcsTransferParams)) {
                    return false;
                }
                RequisitesHcsTransferParams requisitesHcsTransferParams = (RequisitesHcsTransferParams) other;
                return jl40.l(this.product, requisitesHcsTransferParams.product) && jl40.l(this.referrer, requisitesHcsTransferParams.referrer) && this.direction == requisitesHcsTransferParams.direction && this.scenario == requisitesHcsTransferParams.scenario && jl40.l(this.resultPage, requisitesHcsTransferParams.resultPage) && jl40.l(this.timeoutResultPage, requisitesHcsTransferParams.timeoutResultPage) && jl40.l(this.accountNumber, requisitesHcsTransferParams.accountNumber) && jl40.l(this.bic, requisitesHcsTransferParams.bic) && jl40.l(this.inn, requisitesHcsTransferParams.inn) && jl40.l(this.paymentPeriod, requisitesHcsTransferParams.paymentPeriod) && jl40.l(this.beneficiaryName, requisitesHcsTransferParams.beneficiaryName) && jl40.l(this.hcsPersonalAccount, requisitesHcsTransferParams.hcsPersonalAccount) && this.vatIncluded == requisitesHcsTransferParams.vatIncluded && jl40.l(this.ybLabel, requisitesHcsTransferParams.ybLabel) && jl40.l(this.paymentPurpose, requisitesHcsTransferParams.paymentPurpose) && jl40.l(this.money, requisitesHcsTransferParams.money) && jl40.l(this.sourceAgreementId, requisitesHcsTransferParams.sourceAgreementId) && jl40.l(this.checkId, requisitesHcsTransferParams.checkId) && jl40.l(this.transferId, requisitesHcsTransferParams.transferId) && jl40.l(this.transferSessionId, requisitesHcsTransferParams.transferSessionId);
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getAccountNumber() {
                return this.accountNumber;
            }

            public final String getBeneficiaryName() {
                return this.beneficiaryName;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getBic() {
                return this.bic;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getCheckId() {
                return this.checkId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferDirection getDirection() {
                return this.direction;
            }

            public final String getHcsPersonalAccount() {
                return this.hcsPersonalAccount;
            }

            public final String getInn() {
                return this.inn;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public MoneyEntity getMoney() {
                return this.money;
            }

            public final String getPaymentPeriod() {
                return this.paymentPeriod;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getPaymentPurpose() {
                return this.paymentPurpose;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getProduct() {
                return this.product;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getReferrer() {
                return this.referrer;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferResultPageEntity getResultPage() {
                return this.resultPage;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferScenario getScenario() {
                return this.scenario;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getSourceAgreementId() {
                return this.sourceAgreementId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTemplatePaymentType() {
                return null;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferResultPageEntity getTimeoutResultPage() {
                return this.timeoutResultPage;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTransferId() {
                return this.transferId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTransferSessionId() {
                return this.transferSessionId;
            }

            public final boolean getVatIncluded() {
                return this.vatIncluded;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getYbLabel() {
                return this.ybLabel;
            }

            public int hashCode() {
                String str = this.product;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.referrer;
                int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                TransferScenario transferScenario = this.scenario;
                int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
                TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
                int b = unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.accountNumber), 31, this.bic), 31, this.inn), 31, this.paymentPeriod), 31, this.beneficiaryName), 31, this.hcsPersonalAccount), 31, this.vatIncluded), 31, this.ybLabel);
                String str3 = this.paymentPurpose;
                int b2 = unr0.b(unr0.b(ly3.d(this.money, (b + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.sourceAgreementId), 31, this.checkId);
                String str4 = this.transferId;
                return this.transferSessionId.hashCode() + ((b2 + (str4 != null ? str4.hashCode() : 0)) * 31);
            }

            public String toString() {
                String str = this.product;
                String str2 = this.referrer;
                TransferDirection transferDirection = this.direction;
                TransferScenario transferScenario = this.scenario;
                TransferResultPageEntity transferResultPageEntity = this.resultPage;
                TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
                String str3 = this.accountNumber;
                String str4 = this.bic;
                String str5 = this.inn;
                String str6 = this.paymentPeriod;
                String str7 = this.beneficiaryName;
                String str8 = this.hcsPersonalAccount;
                boolean z = this.vatIncluded;
                String str9 = this.ybLabel;
                String str10 = this.paymentPurpose;
                MoneyEntity moneyEntity = this.money;
                String str11 = this.sourceAgreementId;
                String str12 = this.checkId;
                String str13 = this.transferId;
                String str14 = this.transferSessionId;
                StringBuilder v = b64.v("RequisitesHcsTransferParams(product=", str, ", referrer=", str2, ", direction=");
                v.append(transferDirection);
                v.append(", scenario=");
                v.append(transferScenario);
                v.append(", resultPage=");
                v.append(transferResultPageEntity);
                v.append(", timeoutResultPage=");
                v.append(transferResultPageEntity2);
                v.append(", accountNumber=");
                g8e.D(v, str3, ", bic=", str4, ", inn=");
                g8e.D(v, str5, ", paymentPeriod=", str6, ", beneficiaryName=");
                g8e.D(v, str7, ", hcsPersonalAccount=", str8, ", vatIncluded=");
                unr0.A(", ybLabel=", str9, ", paymentPurpose=", v, z);
                v.append(str10);
                v.append(", money=");
                v.append(moneyEntity);
                v.append(", sourceAgreementId=");
                g8e.D(v, str11, ", checkId=", str12, ", transferId=");
                return g8e.r(v, str13, ", transferSessionId=", str14, Extension.C_BRAKE);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.product);
                dest.writeString(this.referrer);
                dest.writeString(this.direction.name());
                TransferScenario transferScenario = this.scenario;
                if (transferScenario == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(transferScenario.name());
                }
                this.resultPage.writeToParcel(dest, flags);
                TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
                if (transferResultPageEntity == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    transferResultPageEntity.writeToParcel(dest, flags);
                }
                dest.writeString(this.accountNumber);
                dest.writeString(this.bic);
                dest.writeString(this.inn);
                dest.writeString(this.paymentPeriod);
                dest.writeString(this.beneficiaryName);
                dest.writeString(this.hcsPersonalAccount);
                dest.writeInt(this.vatIncluded ? 1 : 0);
                dest.writeString(this.ybLabel);
                dest.writeString(this.paymentPurpose);
                dest.writeParcelable(this.money, flags);
                dest.writeString(this.sourceAgreementId);
                dest.writeString(this.checkId);
                dest.writeString(this.transferId);
                dest.writeString(this.transferSessionId);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RequisitesHcsTransferParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequisitesHcsTransferParams createFromParcel(Parcel parcel) {
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                    TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                    Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                    return new RequisitesHcsTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(RequisitesHcsTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequisitesHcsTransferParams[] newArray(int i) {
                    return new RequisitesHcsTransferParams[i];
                }
            }

            public /* synthetic */ RequisitesHcsTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, MoneyEntity moneyEntity, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, str5, str6, str7, str8, z, str9, str10, moneyEntity, str11, str12, str13, str14);
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010&J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010&J\u0010\u00107\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010&J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010&JÐ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010&J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010$J\u001a\u0010C\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bG\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bK\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bM\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bN\u0010-R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bO\u0010&R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bP\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bQ\u0010&R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bR\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u00104R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bU\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bV\u0010&R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00108R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010E\u001a\u0004\bY\u0010&R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bZ\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\b[\u0010&R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\b\\\u0010&¨\u0006]"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesLegalTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "accountNumber", "bic", "inn", "beneficiaryName", "", "vatIncluded", "ybLabel", "paymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "sourceAgreementId", "checkId", "transferId", "transferSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesLegalTransferParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getAccountNumber", "getBic", "getInn", "getBeneficiaryName", "Z", "getVatIncluded", "getYbLabel", "getPaymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getSourceAgreementId", "getCheckId", "getTransferId", "getTransferSessionId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RequisitesLegalTransferParams implements TransferRequisiteParams {
            public static final Parcelable.Creator<RequisitesLegalTransferParams> CREATOR = new Creator();
            private final String accountNumber;
            private final String beneficiaryName;
            private final String bic;
            private final String checkId;
            private final TransferDirection direction;
            private final String inn;
            private final MoneyEntity money;
            private final String paymentPurpose;
            private final String product;
            private final String referrer;
            private final TransferResultPageEntity resultPage;
            private final TransferScenario scenario;
            private final String sourceAgreementId;
            private final TransferResultPageEntity timeoutResultPage;
            private final String transferId;
            private final String transferSessionId;
            private final boolean vatIncluded;
            private final String ybLabel;

            public /* synthetic */ RequisitesLegalTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, MoneyEntity moneyEntity, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, str5, str6, z, str7, str8, moneyEntity, str9, str10, str11, str12);
            }

            public static /* synthetic */ RequisitesLegalTransferParams copy$default(RequisitesLegalTransferParams requisitesLegalTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, MoneyEntity moneyEntity, String str9, String str10, String str11, String str12, int i, Object obj) {
                String str13;
                String str14;
                String str15 = (i & 1) != 0 ? requisitesLegalTransferParams.product : str;
                String str16 = (i & 2) != 0 ? requisitesLegalTransferParams.referrer : str2;
                TransferDirection transferDirection2 = (i & 4) != 0 ? requisitesLegalTransferParams.direction : transferDirection;
                TransferScenario transferScenario2 = (i & 8) != 0 ? requisitesLegalTransferParams.scenario : transferScenario;
                TransferResultPageEntity transferResultPageEntity3 = (i & 16) != 0 ? requisitesLegalTransferParams.resultPage : transferResultPageEntity;
                TransferResultPageEntity transferResultPageEntity4 = (i & 32) != 0 ? requisitesLegalTransferParams.timeoutResultPage : transferResultPageEntity2;
                String str17 = (i & 64) != 0 ? requisitesLegalTransferParams.accountNumber : str3;
                String str18 = (i & 128) != 0 ? requisitesLegalTransferParams.bic : str4;
                String str19 = (i & 256) != 0 ? requisitesLegalTransferParams.inn : str5;
                String str20 = (i & 512) != 0 ? requisitesLegalTransferParams.beneficiaryName : str6;
                boolean z2 = (i & 1024) != 0 ? requisitesLegalTransferParams.vatIncluded : z;
                String str21 = (i & 2048) != 0 ? requisitesLegalTransferParams.ybLabel : str7;
                String str22 = (i & 4096) != 0 ? requisitesLegalTransferParams.paymentPurpose : str8;
                MoneyEntity moneyEntity2 = (i & 8192) != 0 ? requisitesLegalTransferParams.money : moneyEntity;
                String str23 = str15;
                String str24 = (i & 16384) != 0 ? requisitesLegalTransferParams.sourceAgreementId : str9;
                String str25 = (i & 32768) != 0 ? requisitesLegalTransferParams.checkId : str10;
                String str26 = (i & 65536) != 0 ? requisitesLegalTransferParams.transferId : str11;
                if ((i & 131072) != 0) {
                    str14 = str26;
                    str13 = requisitesLegalTransferParams.transferSessionId;
                } else {
                    str13 = str12;
                    str14 = str26;
                }
                return requisitesLegalTransferParams.copy(str23, str16, transferDirection2, transferScenario2, transferResultPageEntity3, transferResultPageEntity4, str17, str18, str19, str20, z2, str21, str22, moneyEntity2, str24, str25, str14, str13);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProduct() {
                return this.product;
            }

            /* renamed from: component10, reason: from getter */
            public final String getBeneficiaryName() {
                return this.beneficiaryName;
            }

            /* renamed from: component11, reason: from getter */
            public final boolean getVatIncluded() {
                return this.vatIncluded;
            }

            /* renamed from: component12, reason: from getter */
            public final String getYbLabel() {
                return this.ybLabel;
            }

            /* renamed from: component13, reason: from getter */
            public final String getPaymentPurpose() {
                return this.paymentPurpose;
            }

            /* renamed from: component14, reason: from getter */
            public final MoneyEntity getMoney() {
                return this.money;
            }

            /* renamed from: component15, reason: from getter */
            public final String getSourceAgreementId() {
                return this.sourceAgreementId;
            }

            /* renamed from: component16, reason: from getter */
            public final String getCheckId() {
                return this.checkId;
            }

            /* renamed from: component17, reason: from getter */
            public final String getTransferId() {
                return this.transferId;
            }

            /* renamed from: component18, reason: from getter */
            public final String getTransferSessionId() {
                return this.transferSessionId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReferrer() {
                return this.referrer;
            }

            /* renamed from: component3, reason: from getter */
            public final TransferDirection getDirection() {
                return this.direction;
            }

            /* renamed from: component4, reason: from getter */
            public final TransferScenario getScenario() {
                return this.scenario;
            }

            /* renamed from: component5, reason: from getter */
            public final TransferResultPageEntity getResultPage() {
                return this.resultPage;
            }

            /* renamed from: component6, reason: from getter */
            public final TransferResultPageEntity getTimeoutResultPage() {
                return this.timeoutResultPage;
            }

            /* renamed from: component7, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component8, reason: from getter */
            public final String getBic() {
                return this.bic;
            }

            /* renamed from: component9, reason: from getter */
            public final String getInn() {
                return this.inn;
            }

            public final RequisitesLegalTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String accountNumber, String bic, String inn, String beneficiaryName, boolean vatIncluded, String ybLabel, String paymentPurpose, MoneyEntity money, String sourceAgreementId, String checkId, String transferId, String transferSessionId) {
                return new RequisitesLegalTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, accountNumber, bic, inn, beneficiaryName, vatIncluded, ybLabel, paymentPurpose, money, sourceAgreementId, checkId, transferId, transferSessionId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequisitesLegalTransferParams)) {
                    return false;
                }
                RequisitesLegalTransferParams requisitesLegalTransferParams = (RequisitesLegalTransferParams) other;
                return jl40.l(this.product, requisitesLegalTransferParams.product) && jl40.l(this.referrer, requisitesLegalTransferParams.referrer) && this.direction == requisitesLegalTransferParams.direction && this.scenario == requisitesLegalTransferParams.scenario && jl40.l(this.resultPage, requisitesLegalTransferParams.resultPage) && jl40.l(this.timeoutResultPage, requisitesLegalTransferParams.timeoutResultPage) && jl40.l(this.accountNumber, requisitesLegalTransferParams.accountNumber) && jl40.l(this.bic, requisitesLegalTransferParams.bic) && jl40.l(this.inn, requisitesLegalTransferParams.inn) && jl40.l(this.beneficiaryName, requisitesLegalTransferParams.beneficiaryName) && this.vatIncluded == requisitesLegalTransferParams.vatIncluded && jl40.l(this.ybLabel, requisitesLegalTransferParams.ybLabel) && jl40.l(this.paymentPurpose, requisitesLegalTransferParams.paymentPurpose) && jl40.l(this.money, requisitesLegalTransferParams.money) && jl40.l(this.sourceAgreementId, requisitesLegalTransferParams.sourceAgreementId) && jl40.l(this.checkId, requisitesLegalTransferParams.checkId) && jl40.l(this.transferId, requisitesLegalTransferParams.transferId) && jl40.l(this.transferSessionId, requisitesLegalTransferParams.transferSessionId);
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getAccountNumber() {
                return this.accountNumber;
            }

            public final String getBeneficiaryName() {
                return this.beneficiaryName;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getBic() {
                return this.bic;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getCheckId() {
                return this.checkId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferDirection getDirection() {
                return this.direction;
            }

            public final String getInn() {
                return this.inn;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public MoneyEntity getMoney() {
                return this.money;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getPaymentPurpose() {
                return this.paymentPurpose;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getProduct() {
                return this.product;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getReferrer() {
                return this.referrer;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferResultPageEntity getResultPage() {
                return this.resultPage;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferScenario getScenario() {
                return this.scenario;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getSourceAgreementId() {
                return this.sourceAgreementId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTemplatePaymentType() {
                return null;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferResultPageEntity getTimeoutResultPage() {
                return this.timeoutResultPage;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTransferId() {
                return this.transferId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTransferSessionId() {
                return this.transferSessionId;
            }

            public final boolean getVatIncluded() {
                return this.vatIncluded;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getYbLabel() {
                return this.ybLabel;
            }

            public int hashCode() {
                String str = this.product;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.referrer;
                int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                TransferScenario transferScenario = this.scenario;
                int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
                TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
                int b = unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.accountNumber), 31, this.bic), 31, this.inn), 31, this.beneficiaryName), 31, this.vatIncluded), 31, this.ybLabel);
                String str3 = this.paymentPurpose;
                int b2 = unr0.b(unr0.b(ly3.d(this.money, (b + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.sourceAgreementId), 31, this.checkId);
                String str4 = this.transferId;
                return this.transferSessionId.hashCode() + ((b2 + (str4 != null ? str4.hashCode() : 0)) * 31);
            }

            public String toString() {
                String str = this.product;
                String str2 = this.referrer;
                TransferDirection transferDirection = this.direction;
                TransferScenario transferScenario = this.scenario;
                TransferResultPageEntity transferResultPageEntity = this.resultPage;
                TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
                String str3 = this.accountNumber;
                String str4 = this.bic;
                String str5 = this.inn;
                String str6 = this.beneficiaryName;
                boolean z = this.vatIncluded;
                String str7 = this.ybLabel;
                String str8 = this.paymentPurpose;
                MoneyEntity moneyEntity = this.money;
                String str9 = this.sourceAgreementId;
                String str10 = this.checkId;
                String str11 = this.transferId;
                String str12 = this.transferSessionId;
                StringBuilder v = b64.v("RequisitesLegalTransferParams(product=", str, ", referrer=", str2, ", direction=");
                v.append(transferDirection);
                v.append(", scenario=");
                v.append(transferScenario);
                v.append(", resultPage=");
                v.append(transferResultPageEntity);
                v.append(", timeoutResultPage=");
                v.append(transferResultPageEntity2);
                v.append(", accountNumber=");
                g8e.D(v, str3, ", bic=", str4, ", inn=");
                g8e.D(v, str5, ", beneficiaryName=", str6, ", vatIncluded=");
                unr0.A(", ybLabel=", str7, ", paymentPurpose=", v, z);
                v.append(str8);
                v.append(", money=");
                v.append(moneyEntity);
                v.append(", sourceAgreementId=");
                g8e.D(v, str9, ", checkId=", str10, ", transferId=");
                return g8e.r(v, str11, ", transferSessionId=", str12, Extension.C_BRAKE);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.product);
                dest.writeString(this.referrer);
                dest.writeString(this.direction.name());
                TransferScenario transferScenario = this.scenario;
                if (transferScenario == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(transferScenario.name());
                }
                this.resultPage.writeToParcel(dest, flags);
                TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
                if (transferResultPageEntity == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    transferResultPageEntity.writeToParcel(dest, flags);
                }
                dest.writeString(this.accountNumber);
                dest.writeString(this.bic);
                dest.writeString(this.inn);
                dest.writeString(this.beneficiaryName);
                dest.writeInt(this.vatIncluded ? 1 : 0);
                dest.writeString(this.ybLabel);
                dest.writeString(this.paymentPurpose);
                dest.writeParcelable(this.money, flags);
                dest.writeString(this.sourceAgreementId);
                dest.writeString(this.checkId);
                dest.writeString(this.transferId);
                dest.writeString(this.transferSessionId);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RequisitesLegalTransferParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequisitesLegalTransferParams createFromParcel(Parcel parcel) {
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                    TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                    Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                    return new RequisitesLegalTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(RequisitesLegalTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequisitesLegalTransferParams[] newArray(int i) {
                    return new RequisitesLegalTransferParams[i];
                }
            }

            public RequisitesLegalTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, MoneyEntity moneyEntity, String str9, String str10, String str11, String str12) {
                this.product = str;
                this.referrer = str2;
                this.direction = transferDirection;
                this.scenario = transferScenario;
                this.resultPage = transferResultPageEntity;
                this.timeoutResultPage = transferResultPageEntity2;
                this.accountNumber = str3;
                this.bic = str4;
                this.inn = str5;
                this.beneficiaryName = str6;
                this.vatIncluded = z;
                this.ybLabel = str7;
                this.paymentPurpose = str8;
                this.money = moneyEntity;
                this.sourceAgreementId = str9;
                this.checkId = str10;
                this.transferId = str11;
                this.transferSessionId = str12;
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010&J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010&J\u0010\u00107\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010&J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010&JÐ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010&J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010$J\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bH\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bO\u0010-R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bP\u0010&R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bQ\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bR\u0010&R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bS\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u00104R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bV\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bW\u0010&R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u00108R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bZ\u0010&R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\b[\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\b\\\u0010&R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\b]\u0010&¨\u0006^"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesPersonTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "accountNumber", "bic", "firstName", "lastName", "Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;", "middleName", "ybLabel", "paymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "sourceAgreementId", "checkId", "transferId", "transferSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;", "component12", "component13", "component14", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$TransferRequisiteParams$RequisitesPersonTransferParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getAccountNumber", "getBic", "getFirstName", "getLastName", "Lcom/ybsdk/feature/transfer/version2/api/entities/MiddleNameEntity;", "getMiddleName", "getYbLabel", "getPaymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getSourceAgreementId", "getCheckId", "getTransferId", "getTransferSessionId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RequisitesPersonTransferParams implements TransferRequisiteParams {
            public static final Parcelable.Creator<RequisitesPersonTransferParams> CREATOR = new Creator();
            private final String accountNumber;
            private final String bic;
            private final String checkId;
            private final TransferDirection direction;
            private final String firstName;
            private final String lastName;
            private final MiddleNameEntity middleName;
            private final MoneyEntity money;
            private final String paymentPurpose;
            private final String product;
            private final String referrer;
            private final TransferResultPageEntity resultPage;
            private final TransferScenario scenario;
            private final String sourceAgreementId;
            private final TransferResultPageEntity timeoutResultPage;
            private final String transferId;
            private final String transferSessionId;
            private final String ybLabel;

            public /* synthetic */ RequisitesPersonTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, MiddleNameEntity middleNameEntity, String str7, String str8, MoneyEntity moneyEntity, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, str5, str6, middleNameEntity, str7, str8, moneyEntity, str9, str10, str11, str12);
            }

            public static /* synthetic */ RequisitesPersonTransferParams copy$default(RequisitesPersonTransferParams requisitesPersonTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, MiddleNameEntity middleNameEntity, String str7, String str8, MoneyEntity moneyEntity, String str9, String str10, String str11, String str12, int i, Object obj) {
                String str13;
                String str14;
                String str15 = (i & 1) != 0 ? requisitesPersonTransferParams.product : str;
                String str16 = (i & 2) != 0 ? requisitesPersonTransferParams.referrer : str2;
                TransferDirection transferDirection2 = (i & 4) != 0 ? requisitesPersonTransferParams.direction : transferDirection;
                TransferScenario transferScenario2 = (i & 8) != 0 ? requisitesPersonTransferParams.scenario : transferScenario;
                TransferResultPageEntity transferResultPageEntity3 = (i & 16) != 0 ? requisitesPersonTransferParams.resultPage : transferResultPageEntity;
                TransferResultPageEntity transferResultPageEntity4 = (i & 32) != 0 ? requisitesPersonTransferParams.timeoutResultPage : transferResultPageEntity2;
                String str17 = (i & 64) != 0 ? requisitesPersonTransferParams.accountNumber : str3;
                String str18 = (i & 128) != 0 ? requisitesPersonTransferParams.bic : str4;
                String str19 = (i & 256) != 0 ? requisitesPersonTransferParams.firstName : str5;
                String str20 = (i & 512) != 0 ? requisitesPersonTransferParams.lastName : str6;
                MiddleNameEntity middleNameEntity2 = (i & 1024) != 0 ? requisitesPersonTransferParams.middleName : middleNameEntity;
                String str21 = (i & 2048) != 0 ? requisitesPersonTransferParams.ybLabel : str7;
                String str22 = (i & 4096) != 0 ? requisitesPersonTransferParams.paymentPurpose : str8;
                MoneyEntity moneyEntity2 = (i & 8192) != 0 ? requisitesPersonTransferParams.money : moneyEntity;
                String str23 = str15;
                String str24 = (i & 16384) != 0 ? requisitesPersonTransferParams.sourceAgreementId : str9;
                String str25 = (i & 32768) != 0 ? requisitesPersonTransferParams.checkId : str10;
                String str26 = (i & 65536) != 0 ? requisitesPersonTransferParams.transferId : str11;
                if ((i & 131072) != 0) {
                    str14 = str26;
                    str13 = requisitesPersonTransferParams.transferSessionId;
                } else {
                    str13 = str12;
                    str14 = str26;
                }
                return requisitesPersonTransferParams.copy(str23, str16, transferDirection2, transferScenario2, transferResultPageEntity3, transferResultPageEntity4, str17, str18, str19, str20, middleNameEntity2, str21, str22, moneyEntity2, str24, str25, str14, str13);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProduct() {
                return this.product;
            }

            /* renamed from: component10, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            /* renamed from: component11, reason: from getter */
            public final MiddleNameEntity getMiddleName() {
                return this.middleName;
            }

            /* renamed from: component12, reason: from getter */
            public final String getYbLabel() {
                return this.ybLabel;
            }

            /* renamed from: component13, reason: from getter */
            public final String getPaymentPurpose() {
                return this.paymentPurpose;
            }

            /* renamed from: component14, reason: from getter */
            public final MoneyEntity getMoney() {
                return this.money;
            }

            /* renamed from: component15, reason: from getter */
            public final String getSourceAgreementId() {
                return this.sourceAgreementId;
            }

            /* renamed from: component16, reason: from getter */
            public final String getCheckId() {
                return this.checkId;
            }

            /* renamed from: component17, reason: from getter */
            public final String getTransferId() {
                return this.transferId;
            }

            /* renamed from: component18, reason: from getter */
            public final String getTransferSessionId() {
                return this.transferSessionId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReferrer() {
                return this.referrer;
            }

            /* renamed from: component3, reason: from getter */
            public final TransferDirection getDirection() {
                return this.direction;
            }

            /* renamed from: component4, reason: from getter */
            public final TransferScenario getScenario() {
                return this.scenario;
            }

            /* renamed from: component5, reason: from getter */
            public final TransferResultPageEntity getResultPage() {
                return this.resultPage;
            }

            /* renamed from: component6, reason: from getter */
            public final TransferResultPageEntity getTimeoutResultPage() {
                return this.timeoutResultPage;
            }

            /* renamed from: component7, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component8, reason: from getter */
            public final String getBic() {
                return this.bic;
            }

            /* renamed from: component9, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            public final RequisitesPersonTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String accountNumber, String bic, String firstName, String lastName, MiddleNameEntity middleName, String ybLabel, String paymentPurpose, MoneyEntity money, String sourceAgreementId, String checkId, String transferId, String transferSessionId) {
                return new RequisitesPersonTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, accountNumber, bic, firstName, lastName, middleName, ybLabel, paymentPurpose, money, sourceAgreementId, checkId, transferId, transferSessionId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequisitesPersonTransferParams)) {
                    return false;
                }
                RequisitesPersonTransferParams requisitesPersonTransferParams = (RequisitesPersonTransferParams) other;
                return jl40.l(this.product, requisitesPersonTransferParams.product) && jl40.l(this.referrer, requisitesPersonTransferParams.referrer) && this.direction == requisitesPersonTransferParams.direction && this.scenario == requisitesPersonTransferParams.scenario && jl40.l(this.resultPage, requisitesPersonTransferParams.resultPage) && jl40.l(this.timeoutResultPage, requisitesPersonTransferParams.timeoutResultPage) && jl40.l(this.accountNumber, requisitesPersonTransferParams.accountNumber) && jl40.l(this.bic, requisitesPersonTransferParams.bic) && jl40.l(this.firstName, requisitesPersonTransferParams.firstName) && jl40.l(this.lastName, requisitesPersonTransferParams.lastName) && jl40.l(this.middleName, requisitesPersonTransferParams.middleName) && jl40.l(this.ybLabel, requisitesPersonTransferParams.ybLabel) && jl40.l(this.paymentPurpose, requisitesPersonTransferParams.paymentPurpose) && jl40.l(this.money, requisitesPersonTransferParams.money) && jl40.l(this.sourceAgreementId, requisitesPersonTransferParams.sourceAgreementId) && jl40.l(this.checkId, requisitesPersonTransferParams.checkId) && jl40.l(this.transferId, requisitesPersonTransferParams.transferId) && jl40.l(this.transferSessionId, requisitesPersonTransferParams.transferSessionId);
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getAccountNumber() {
                return this.accountNumber;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getBic() {
                return this.bic;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getCheckId() {
                return this.checkId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferDirection getDirection() {
                return this.direction;
            }

            public final String getFirstName() {
                return this.firstName;
            }

            public final String getLastName() {
                return this.lastName;
            }

            public final MiddleNameEntity getMiddleName() {
                return this.middleName;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public MoneyEntity getMoney() {
                return this.money;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getPaymentPurpose() {
                return this.paymentPurpose;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getProduct() {
                return this.product;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getReferrer() {
                return this.referrer;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferResultPageEntity getResultPage() {
                return this.resultPage;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferScenario getScenario() {
                return this.scenario;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getSourceAgreementId() {
                return this.sourceAgreementId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTemplatePaymentType() {
                return null;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public TransferResultPageEntity getTimeoutResultPage() {
                return this.timeoutResultPage;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTransferId() {
                return this.transferId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams, com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
            public String getTransferSessionId() {
                return this.transferSessionId;
            }

            @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams.TransferRequisiteParams
            public String getYbLabel() {
                return this.ybLabel;
            }

            public int hashCode() {
                String str = this.product;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.referrer;
                int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                TransferScenario transferScenario = this.scenario;
                int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
                TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
                int b = unr0.b((this.middleName.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.accountNumber), 31, this.bic), 31, this.firstName), 31, this.lastName)) * 31, 31, this.ybLabel);
                String str3 = this.paymentPurpose;
                int b2 = unr0.b(unr0.b(ly3.d(this.money, (b + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.sourceAgreementId), 31, this.checkId);
                String str4 = this.transferId;
                return this.transferSessionId.hashCode() + ((b2 + (str4 != null ? str4.hashCode() : 0)) * 31);
            }

            public String toString() {
                String str = this.product;
                String str2 = this.referrer;
                TransferDirection transferDirection = this.direction;
                TransferScenario transferScenario = this.scenario;
                TransferResultPageEntity transferResultPageEntity = this.resultPage;
                TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
                String str3 = this.accountNumber;
                String str4 = this.bic;
                String str5 = this.firstName;
                String str6 = this.lastName;
                MiddleNameEntity middleNameEntity = this.middleName;
                String str7 = this.ybLabel;
                String str8 = this.paymentPurpose;
                MoneyEntity moneyEntity = this.money;
                String str9 = this.sourceAgreementId;
                String str10 = this.checkId;
                String str11 = this.transferId;
                String str12 = this.transferSessionId;
                StringBuilder v = b64.v("RequisitesPersonTransferParams(product=", str, ", referrer=", str2, ", direction=");
                v.append(transferDirection);
                v.append(", scenario=");
                v.append(transferScenario);
                v.append(", resultPage=");
                v.append(transferResultPageEntity);
                v.append(", timeoutResultPage=");
                v.append(transferResultPageEntity2);
                v.append(", accountNumber=");
                g8e.D(v, str3, ", bic=", str4, ", firstName=");
                g8e.D(v, str5, ", lastName=", str6, ", middleName=");
                v.append(middleNameEntity);
                v.append(", ybLabel=");
                v.append(str7);
                v.append(", paymentPurpose=");
                v.append(str8);
                v.append(", money=");
                v.append(moneyEntity);
                v.append(", sourceAgreementId=");
                g8e.D(v, str9, ", checkId=", str10, ", transferId=");
                return g8e.r(v, str11, ", transferSessionId=", str12, Extension.C_BRAKE);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.product);
                dest.writeString(this.referrer);
                dest.writeString(this.direction.name());
                TransferScenario transferScenario = this.scenario;
                if (transferScenario == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(transferScenario.name());
                }
                this.resultPage.writeToParcel(dest, flags);
                TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
                if (transferResultPageEntity == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    transferResultPageEntity.writeToParcel(dest, flags);
                }
                dest.writeString(this.accountNumber);
                dest.writeString(this.bic);
                dest.writeString(this.firstName);
                dest.writeString(this.lastName);
                this.middleName.writeToParcel(dest, flags);
                dest.writeString(this.ybLabel);
                dest.writeString(this.paymentPurpose);
                dest.writeParcelable(this.money, flags);
                dest.writeString(this.sourceAgreementId);
                dest.writeString(this.checkId);
                dest.writeString(this.transferId);
                dest.writeString(this.transferSessionId);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RequisitesPersonTransferParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequisitesPersonTransferParams createFromParcel(Parcel parcel) {
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                    TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                    Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                    return new RequisitesPersonTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), MiddleNameEntity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(RequisitesPersonTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequisitesPersonTransferParams[] newArray(int i) {
                    return new RequisitesPersonTransferParams[i];
                }
            }

            public RequisitesPersonTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, MiddleNameEntity middleNameEntity, String str7, String str8, MoneyEntity moneyEntity, String str9, String str10, String str11, String str12) {
                this.product = str;
                this.referrer = str2;
                this.direction = transferDirection;
                this.scenario = transferScenario;
                this.resultPage = transferResultPageEntity;
                this.timeoutResultPage = transferResultPageEntity2;
                this.accountNumber = str3;
                this.bic = str4;
                this.firstName = str5;
                this.lastName = str6;
                this.middleName = middleNameEntity;
                this.ybLabel = str7;
                this.paymentPurpose = str8;
                this.money = moneyEntity;
                this.sourceAgreementId = str9;
                this.checkId = str10;
                this.transferId = str11;
                this.transferSessionId = str12;
            }
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 J\u009e\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010 J\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bC\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010*R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bF\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bG\u0010 R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bH\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bI\u0010 R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bJ\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\bK\u0010 ¨\u0006L"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$AftTopupParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "targetAgreementId", "cardId", "partnerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$AftTopupParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "getTargetAgreementId", "getCardId", "getPartnerId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AftTopupParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<AftTopupParams> CREATOR = new Creator();
        private final String cardId;
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String partnerId;
        private final String product;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String targetAgreementId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ AftTopupParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str3, str4, str5, str6, str7, str8);
        }

        public static /* synthetic */ AftTopupParams copy$default(AftTopupParams aftTopupParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aftTopupParams.product;
            }
            return aftTopupParams.copy(str, (i & 2) != 0 ? aftTopupParams.referrer : str2, (i & 4) != 0 ? aftTopupParams.direction : transferDirection, (i & 8) != 0 ? aftTopupParams.scenario : transferScenario, (i & 16) != 0 ? aftTopupParams.resultPage : transferResultPageEntity, (i & 32) != 0 ? aftTopupParams.timeoutResultPage : transferResultPageEntity2, (i & 64) != 0 ? aftTopupParams.money : moneyEntity, (i & 128) != 0 ? aftTopupParams.checkId : str3, (i & 256) != 0 ? aftTopupParams.transferId : str4, (i & 512) != 0 ? aftTopupParams.transferSessionId : str5, (i & 1024) != 0 ? aftTopupParams.targetAgreementId : str6, (i & 2048) != 0 ? aftTopupParams.cardId : str7, (i & 4096) != 0 ? aftTopupParams.partnerId : str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        /* renamed from: component13, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final AftTopupParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String transferSessionId, String targetAgreementId, String cardId, String partnerId) {
            return new AftTopupParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, transferSessionId, targetAgreementId, cardId, partnerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AftTopupParams)) {
                return false;
            }
            AftTopupParams aftTopupParams = (AftTopupParams) other;
            return jl40.l(this.product, aftTopupParams.product) && jl40.l(this.referrer, aftTopupParams.referrer) && this.direction == aftTopupParams.direction && this.scenario == aftTopupParams.scenario && jl40.l(this.resultPage, aftTopupParams.resultPage) && jl40.l(this.timeoutResultPage, aftTopupParams.timeoutResultPage) && jl40.l(this.money, aftTopupParams.money) && jl40.l(this.checkId, aftTopupParams.checkId) && jl40.l(this.transferId, aftTopupParams.transferId) && jl40.l(this.transferSessionId, aftTopupParams.transferSessionId) && jl40.l(this.targetAgreementId, aftTopupParams.targetAgreementId) && jl40.l(this.cardId, aftTopupParams.cardId) && jl40.l(this.partnerId, aftTopupParams.partnerId);
        }

        public final String getCardId() {
            return this.cardId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b(unr0.b(unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId), 31, this.targetAgreementId), 31, this.cardId);
            String str4 = this.partnerId;
            return b2 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.transferSessionId;
            String str6 = this.targetAgreementId;
            String str7 = this.cardId;
            String str8 = this.partnerId;
            StringBuilder v = b64.v("AftTopupParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", transferSessionId=", str5, ", targetAgreementId=");
            g8e.D(v, str6, ", cardId=", str7, ", partnerId=");
            return oyr.t(v, str8, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.targetAgreementId);
            dest.writeString(this.cardId);
            dest.writeString(this.partnerId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AftTopupParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AftTopupParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new AftTopupParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (MoneyEntity) parcel.readParcelable(AftTopupParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AftTopupParams[] newArray(int i) {
                return new AftTopupParams[i];
            }
        }

        public AftTopupParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.transferSessionId = str5;
            this.targetAgreementId = str6;
            this.cardId = str7;
            this.partnerId = str8;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010%J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010%J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010%J\u0010\u00109\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:JÆ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010%J\u0010\u0010>\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b>\u0010#J\u001a\u0010B\u001a\u00020A2\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bB\u0010CR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bF\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bM\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010/R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bP\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bQ\u0010%R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bR\u0010%R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bS\u0010%R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bT\u0010%R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bU\u0010%R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bV\u0010%R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bW\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bX\u0010%R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u0010:¨\u0006["}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$B2cTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "sourceAgreementId", "planToken", "targetPhone", "targetPartnerId", "targetName", Constants.KEY_MESSAGE, "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "inputSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$B2cTransferParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "getSourceAgreementId", "getPlanToken", "getTargetPhone", "getTargetPartnerId", "getTargetName", "getMessage", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "getInputSource", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class B2cTransferParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<B2cTransferParams> CREATOR = new Creator();
        private final String checkId;
        private final TransferDirection direction;
        private final PhoneInputSource inputSource;
        private final String message;
        private final MoneyEntity money;
        private final String planToken;
        private final String product;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final String targetName;
        private final String targetPartnerId;
        private final String targetPhone;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ B2cTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PhoneInputSource phoneInputSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str3, str4, str5, str6, str7, str8, str9, str10, str11, phoneInputSource);
        }

        public static /* synthetic */ B2cTransferParams copy$default(B2cTransferParams b2cTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PhoneInputSource phoneInputSource, int i, Object obj) {
            PhoneInputSource phoneInputSource2;
            String str12;
            String str13;
            B2cTransferParams b2cTransferParams2;
            String str14;
            String str15;
            TransferDirection transferDirection2;
            TransferScenario transferScenario2;
            TransferResultPageEntity transferResultPageEntity3;
            TransferResultPageEntity transferResultPageEntity4;
            MoneyEntity moneyEntity2;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23 = (i & 1) != 0 ? b2cTransferParams.product : str;
            String str24 = (i & 2) != 0 ? b2cTransferParams.referrer : str2;
            TransferDirection transferDirection3 = (i & 4) != 0 ? b2cTransferParams.direction : transferDirection;
            TransferScenario transferScenario3 = (i & 8) != 0 ? b2cTransferParams.scenario : transferScenario;
            TransferResultPageEntity transferResultPageEntity5 = (i & 16) != 0 ? b2cTransferParams.resultPage : transferResultPageEntity;
            TransferResultPageEntity transferResultPageEntity6 = (i & 32) != 0 ? b2cTransferParams.timeoutResultPage : transferResultPageEntity2;
            MoneyEntity moneyEntity3 = (i & 64) != 0 ? b2cTransferParams.money : moneyEntity;
            String str25 = (i & 128) != 0 ? b2cTransferParams.checkId : str3;
            String str26 = (i & 256) != 0 ? b2cTransferParams.transferId : str4;
            String str27 = (i & 512) != 0 ? b2cTransferParams.transferSessionId : str5;
            String str28 = (i & 1024) != 0 ? b2cTransferParams.sourceAgreementId : str6;
            String str29 = (i & 2048) != 0 ? b2cTransferParams.planToken : str7;
            String str30 = (i & 4096) != 0 ? b2cTransferParams.targetPhone : str8;
            String str31 = (i & 8192) != 0 ? b2cTransferParams.targetPartnerId : str9;
            String str32 = str23;
            String str33 = (i & 16384) != 0 ? b2cTransferParams.targetName : str10;
            String str34 = (i & 32768) != 0 ? b2cTransferParams.message : str11;
            if ((i & 65536) != 0) {
                str12 = str34;
                phoneInputSource2 = b2cTransferParams.inputSource;
                str14 = str33;
                str15 = str24;
                transferDirection2 = transferDirection3;
                transferScenario2 = transferScenario3;
                transferResultPageEntity3 = transferResultPageEntity5;
                transferResultPageEntity4 = transferResultPageEntity6;
                moneyEntity2 = moneyEntity3;
                str16 = str25;
                str17 = str26;
                str18 = str27;
                str19 = str28;
                str20 = str29;
                str21 = str30;
                str22 = str31;
                str13 = str32;
                b2cTransferParams2 = b2cTransferParams;
            } else {
                phoneInputSource2 = phoneInputSource;
                str12 = str34;
                str13 = str32;
                b2cTransferParams2 = b2cTransferParams;
                str14 = str33;
                str15 = str24;
                transferDirection2 = transferDirection3;
                transferScenario2 = transferScenario3;
                transferResultPageEntity3 = transferResultPageEntity5;
                transferResultPageEntity4 = transferResultPageEntity6;
                moneyEntity2 = moneyEntity3;
                str16 = str25;
                str17 = str26;
                str18 = str27;
                str19 = str28;
                str20 = str29;
                str21 = str30;
                str22 = str31;
            }
            return b2cTransferParams2.copy(str13, str15, transferDirection2, transferScenario2, transferResultPageEntity3, transferResultPageEntity4, moneyEntity2, str16, str17, str18, str19, str20, str21, str22, str14, str12, phoneInputSource2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPlanToken() {
            return this.planToken;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTargetPhone() {
            return this.targetPhone;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTargetPartnerId() {
            return this.targetPartnerId;
        }

        /* renamed from: component15, reason: from getter */
        public final String getTargetName() {
            return this.targetName;
        }

        /* renamed from: component16, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component17, reason: from getter */
        public final PhoneInputSource getInputSource() {
            return this.inputSource;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final B2cTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String transferSessionId, String sourceAgreementId, String planToken, String targetPhone, String targetPartnerId, String targetName, String message, PhoneInputSource inputSource) {
            return new B2cTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, transferSessionId, sourceAgreementId, planToken, targetPhone, targetPartnerId, targetName, message, inputSource);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof B2cTransferParams)) {
                return false;
            }
            B2cTransferParams b2cTransferParams = (B2cTransferParams) other;
            return jl40.l(this.product, b2cTransferParams.product) && jl40.l(this.referrer, b2cTransferParams.referrer) && this.direction == b2cTransferParams.direction && this.scenario == b2cTransferParams.scenario && jl40.l(this.resultPage, b2cTransferParams.resultPage) && jl40.l(this.timeoutResultPage, b2cTransferParams.timeoutResultPage) && jl40.l(this.money, b2cTransferParams.money) && jl40.l(this.checkId, b2cTransferParams.checkId) && jl40.l(this.transferId, b2cTransferParams.transferId) && jl40.l(this.transferSessionId, b2cTransferParams.transferSessionId) && jl40.l(this.sourceAgreementId, b2cTransferParams.sourceAgreementId) && jl40.l(this.planToken, b2cTransferParams.planToken) && jl40.l(this.targetPhone, b2cTransferParams.targetPhone) && jl40.l(this.targetPartnerId, b2cTransferParams.targetPartnerId) && jl40.l(this.targetName, b2cTransferParams.targetName) && jl40.l(this.message, b2cTransferParams.message) && this.inputSource == b2cTransferParams.inputSource;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        public final PhoneInputSource getInputSource() {
            return this.inputSource;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPlanToken() {
            return this.planToken;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        public final String getTargetName() {
            return this.targetName;
        }

        public final String getTargetPartnerId() {
            return this.targetPartnerId;
        }

        public final String getTargetPhone() {
            return this.targetPhone;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId), 31, this.sourceAgreementId), 31, this.planToken), 31, this.targetPhone), 31, this.targetPartnerId), 31, this.targetName);
            String str4 = this.message;
            return this.inputSource.hashCode() + ((b2 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.transferSessionId;
            String str6 = this.sourceAgreementId;
            String str7 = this.planToken;
            String str8 = this.targetPhone;
            String str9 = this.targetPartnerId;
            String str10 = this.targetName;
            String str11 = this.message;
            PhoneInputSource phoneInputSource = this.inputSource;
            StringBuilder v = b64.v("B2cTransferParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", transferSessionId=", str5, ", sourceAgreementId=");
            g8e.D(v, str6, ", planToken=", str7, ", targetPhone=");
            g8e.D(v, str8, ", targetPartnerId=", str9, ", targetName=");
            g8e.D(v, str10, ", message=", str11, ", inputSource=");
            v.append(phoneInputSource);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.planToken);
            dest.writeString(this.targetPhone);
            dest.writeString(this.targetPartnerId);
            dest.writeString(this.targetName);
            dest.writeString(this.message);
            dest.writeString(this.inputSource.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<B2cTransferParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final B2cTransferParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new B2cTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (MoneyEntity) parcel.readParcelable(B2cTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PhoneInputSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final B2cTransferParams[] newArray(int i) {
                return new B2cTransferParams[i];
            }
        }

        public B2cTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PhoneInputSource phoneInputSource) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.transferSessionId = str5;
            this.sourceAgreementId = str6;
            this.planToken = str7;
            this.targetPhone = str8;
            this.targetPartnerId = str9;
            this.targetName = str10;
            this.message = str11;
            this.inputSource = phoneInputSource;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u009c\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010+R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bH\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bI\u0010!R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010!R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010!R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010!R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u00102¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$C2gTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "sourceAgreementId", "invoiceId", "Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;", "requisites", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$C2gTransferParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "getSourceAgreementId", "getInvoiceId", "Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;", "getRequisites", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C2gTransferParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<C2gTransferParams> CREATOR = new Creator();
        private final String checkId;
        private final TransferDirection direction;
        private final String invoiceId;
        private final MoneyEntity money;
        private final String product;
        private final String referrer;
        private final C2gTransferRequisitesEntity requisites;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ C2gTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, C2gTransferRequisitesEntity c2gTransferRequisitesEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str3, str4, str5, str6, str7, c2gTransferRequisitesEntity);
        }

        public static /* synthetic */ C2gTransferParams copy$default(C2gTransferParams c2gTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, C2gTransferRequisitesEntity c2gTransferRequisitesEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c2gTransferParams.product;
            }
            return c2gTransferParams.copy(str, (i & 2) != 0 ? c2gTransferParams.referrer : str2, (i & 4) != 0 ? c2gTransferParams.direction : transferDirection, (i & 8) != 0 ? c2gTransferParams.scenario : transferScenario, (i & 16) != 0 ? c2gTransferParams.resultPage : transferResultPageEntity, (i & 32) != 0 ? c2gTransferParams.timeoutResultPage : transferResultPageEntity2, (i & 64) != 0 ? c2gTransferParams.money : moneyEntity, (i & 128) != 0 ? c2gTransferParams.checkId : str3, (i & 256) != 0 ? c2gTransferParams.transferId : str4, (i & 512) != 0 ? c2gTransferParams.transferSessionId : str5, (i & 1024) != 0 ? c2gTransferParams.sourceAgreementId : str6, (i & 2048) != 0 ? c2gTransferParams.invoiceId : str7, (i & 4096) != 0 ? c2gTransferParams.requisites : c2gTransferRequisitesEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        /* renamed from: component13, reason: from getter */
        public final C2gTransferRequisitesEntity getRequisites() {
            return this.requisites;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final C2gTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String transferSessionId, String sourceAgreementId, String invoiceId, C2gTransferRequisitesEntity requisites) {
            return new C2gTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, transferSessionId, sourceAgreementId, invoiceId, requisites);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C2gTransferParams)) {
                return false;
            }
            C2gTransferParams c2gTransferParams = (C2gTransferParams) other;
            return jl40.l(this.product, c2gTransferParams.product) && jl40.l(this.referrer, c2gTransferParams.referrer) && this.direction == c2gTransferParams.direction && this.scenario == c2gTransferParams.scenario && jl40.l(this.resultPage, c2gTransferParams.resultPage) && jl40.l(this.timeoutResultPage, c2gTransferParams.timeoutResultPage) && jl40.l(this.money, c2gTransferParams.money) && jl40.l(this.checkId, c2gTransferParams.checkId) && jl40.l(this.transferId, c2gTransferParams.transferId) && jl40.l(this.transferSessionId, c2gTransferParams.transferSessionId) && jl40.l(this.sourceAgreementId, c2gTransferParams.sourceAgreementId) && jl40.l(this.invoiceId, c2gTransferParams.invoiceId) && jl40.l(this.requisites, c2gTransferParams.requisites);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        public final C2gTransferRequisitesEntity getRequisites() {
            return this.requisites;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            return this.requisites.hashCode() + unr0.b(unr0.b(unr0.b((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.transferSessionId), 31, this.sourceAgreementId), 31, this.invoiceId);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.transferSessionId;
            String str6 = this.sourceAgreementId;
            String str7 = this.invoiceId;
            C2gTransferRequisitesEntity c2gTransferRequisitesEntity = this.requisites;
            StringBuilder v = b64.v("C2gTransferParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", transferSessionId=", str5, ", sourceAgreementId=");
            g8e.D(v, str6, ", invoiceId=", str7, ", requisites=");
            v.append(c2gTransferRequisitesEntity);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.invoiceId);
            this.requisites.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<C2gTransferParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C2gTransferParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new C2gTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (MoneyEntity) parcel.readParcelable(C2gTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), C2gTransferRequisitesEntity.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C2gTransferParams[] newArray(int i) {
                return new C2gTransferParams[i];
            }
        }

        public C2gTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, C2gTransferRequisitesEntity c2gTransferRequisitesEntity) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.transferSessionId = str5;
            this.sourceAgreementId = str6;
            this.invoiceId = str7;
            this.requisites = c2gTransferRequisitesEntity;
        }
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010*J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010*J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010*J\u0010\u0010<\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b<\u00104J\u0012\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010*J\u0012\u0010B\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010*Jê\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bG\u0010*J\u0010\u0010H\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bH\u0010(J\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IHÖ\u0003¢\u0006\u0004\bL\u0010MR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010N\u001a\u0004\bP\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bT\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\bV\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\bW\u00101R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\bY\u00104R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bZ\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\b[\u0010*R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\b\\\u0010*R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\b]\u0010*R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\b^\u0010*R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\b_\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\b`\u0010*R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\ba\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bc\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\be\u0010@R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010N\u001a\u0004\bf\u0010*R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010g\u001a\u0004\bh\u0010CR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010N\u001a\u0004\bi\u0010*¨\u0006j"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderByPhoneParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "sourceAgreementId", "phone", "partnerId", "receiverFullName", "creditMoney", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;", "currencyRate", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderPriorityMoneyType;", "priorityMoneyType", "checkUserBankId", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "phoneInputSource", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderPriorityMoneyType;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;", "component17", "()Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderPriorityMoneyType;", "component18", "component19", "()Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderPriorityMoneyType;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderByPhoneParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "getSourceAgreementId", "getPhone", "getPartnerId", "getReceiverFullName", "getCreditMoney", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;", "getCurrencyRate", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CrossBorderPriorityMoneyType;", "getPriorityMoneyType", "getCheckUserBankId", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "getPhoneInputSource", "getCountry", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CrossBorderByPhoneParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<CrossBorderByPhoneParams> CREATOR = new Creator();
        private final String checkId;
        private final String checkUserBankId;
        private final String country;
        private final MoneyEntity creditMoney;
        private final CurrencyRateEntity currencyRate;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String partnerId;
        private final String phone;
        private final PhoneInputSource phoneInputSource;
        private final CrossBorderPriorityMoneyType priorityMoneyType;
        private final String product;
        private final String receiverFullName;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ CrossBorderByPhoneParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MoneyEntity moneyEntity2, CurrencyRateEntity currencyRateEntity, CrossBorderPriorityMoneyType crossBorderPriorityMoneyType, String str10, PhoneInputSource phoneInputSource, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str3, str4, str5, str6, str7, str8, str9, moneyEntity2, currencyRateEntity, crossBorderPriorityMoneyType, str10, phoneInputSource, (i & 524288) != 0 ? null : str11);
        }

        public static /* synthetic */ CrossBorderByPhoneParams copy$default(CrossBorderByPhoneParams crossBorderByPhoneParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MoneyEntity moneyEntity2, CurrencyRateEntity currencyRateEntity, CrossBorderPriorityMoneyType crossBorderPriorityMoneyType, String str10, PhoneInputSource phoneInputSource, String str11, int i, Object obj) {
            String str12;
            PhoneInputSource phoneInputSource2;
            String str13 = (i & 1) != 0 ? crossBorderByPhoneParams.product : str;
            String str14 = (i & 2) != 0 ? crossBorderByPhoneParams.referrer : str2;
            TransferDirection transferDirection2 = (i & 4) != 0 ? crossBorderByPhoneParams.direction : transferDirection;
            TransferScenario transferScenario2 = (i & 8) != 0 ? crossBorderByPhoneParams.scenario : transferScenario;
            TransferResultPageEntity transferResultPageEntity3 = (i & 16) != 0 ? crossBorderByPhoneParams.resultPage : transferResultPageEntity;
            TransferResultPageEntity transferResultPageEntity4 = (i & 32) != 0 ? crossBorderByPhoneParams.timeoutResultPage : transferResultPageEntity2;
            MoneyEntity moneyEntity3 = (i & 64) != 0 ? crossBorderByPhoneParams.money : moneyEntity;
            String str15 = (i & 128) != 0 ? crossBorderByPhoneParams.checkId : str3;
            String str16 = (i & 256) != 0 ? crossBorderByPhoneParams.transferId : str4;
            String str17 = (i & 512) != 0 ? crossBorderByPhoneParams.transferSessionId : str5;
            String str18 = (i & 1024) != 0 ? crossBorderByPhoneParams.sourceAgreementId : str6;
            String str19 = (i & 2048) != 0 ? crossBorderByPhoneParams.phone : str7;
            String str20 = (i & 4096) != 0 ? crossBorderByPhoneParams.partnerId : str8;
            String str21 = (i & 8192) != 0 ? crossBorderByPhoneParams.receiverFullName : str9;
            String str22 = str13;
            MoneyEntity moneyEntity4 = (i & 16384) != 0 ? crossBorderByPhoneParams.creditMoney : moneyEntity2;
            CurrencyRateEntity currencyRateEntity2 = (i & 32768) != 0 ? crossBorderByPhoneParams.currencyRate : currencyRateEntity;
            CrossBorderPriorityMoneyType crossBorderPriorityMoneyType2 = (i & 65536) != 0 ? crossBorderByPhoneParams.priorityMoneyType : crossBorderPriorityMoneyType;
            String str23 = (i & 131072) != 0 ? crossBorderByPhoneParams.checkUserBankId : str10;
            PhoneInputSource phoneInputSource3 = (i & 262144) != 0 ? crossBorderByPhoneParams.phoneInputSource : phoneInputSource;
            if ((i & 524288) != 0) {
                phoneInputSource2 = phoneInputSource3;
                str12 = crossBorderByPhoneParams.country;
            } else {
                str12 = str11;
                phoneInputSource2 = phoneInputSource3;
            }
            return crossBorderByPhoneParams.copy(str22, str14, transferDirection2, transferScenario2, transferResultPageEntity3, transferResultPageEntity4, moneyEntity3, str15, str16, str17, str18, str19, str20, str21, moneyEntity4, currencyRateEntity2, crossBorderPriorityMoneyType2, str23, phoneInputSource2, str12);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component13, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        /* renamed from: component14, reason: from getter */
        public final String getReceiverFullName() {
            return this.receiverFullName;
        }

        /* renamed from: component15, reason: from getter */
        public final MoneyEntity getCreditMoney() {
            return this.creditMoney;
        }

        /* renamed from: component16, reason: from getter */
        public final CurrencyRateEntity getCurrencyRate() {
            return this.currencyRate;
        }

        /* renamed from: component17, reason: from getter */
        public final CrossBorderPriorityMoneyType getPriorityMoneyType() {
            return this.priorityMoneyType;
        }

        /* renamed from: component18, reason: from getter */
        public final String getCheckUserBankId() {
            return this.checkUserBankId;
        }

        /* renamed from: component19, reason: from getter */
        public final PhoneInputSource getPhoneInputSource() {
            return this.phoneInputSource;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component20, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final CrossBorderByPhoneParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String transferSessionId, String sourceAgreementId, String phone, String partnerId, String receiverFullName, MoneyEntity creditMoney, CurrencyRateEntity currencyRate, CrossBorderPriorityMoneyType priorityMoneyType, String checkUserBankId, PhoneInputSource phoneInputSource, String country) {
            return new CrossBorderByPhoneParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, transferSessionId, sourceAgreementId, phone, partnerId, receiverFullName, creditMoney, currencyRate, priorityMoneyType, checkUserBankId, phoneInputSource, country);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrossBorderByPhoneParams)) {
                return false;
            }
            CrossBorderByPhoneParams crossBorderByPhoneParams = (CrossBorderByPhoneParams) other;
            return jl40.l(this.product, crossBorderByPhoneParams.product) && jl40.l(this.referrer, crossBorderByPhoneParams.referrer) && this.direction == crossBorderByPhoneParams.direction && this.scenario == crossBorderByPhoneParams.scenario && jl40.l(this.resultPage, crossBorderByPhoneParams.resultPage) && jl40.l(this.timeoutResultPage, crossBorderByPhoneParams.timeoutResultPage) && jl40.l(this.money, crossBorderByPhoneParams.money) && jl40.l(this.checkId, crossBorderByPhoneParams.checkId) && jl40.l(this.transferId, crossBorderByPhoneParams.transferId) && jl40.l(this.transferSessionId, crossBorderByPhoneParams.transferSessionId) && jl40.l(this.sourceAgreementId, crossBorderByPhoneParams.sourceAgreementId) && jl40.l(this.phone, crossBorderByPhoneParams.phone) && jl40.l(this.partnerId, crossBorderByPhoneParams.partnerId) && jl40.l(this.receiverFullName, crossBorderByPhoneParams.receiverFullName) && jl40.l(this.creditMoney, crossBorderByPhoneParams.creditMoney) && jl40.l(this.currencyRate, crossBorderByPhoneParams.currencyRate) && this.priorityMoneyType == crossBorderByPhoneParams.priorityMoneyType && jl40.l(this.checkUserBankId, crossBorderByPhoneParams.checkUserBankId) && this.phoneInputSource == crossBorderByPhoneParams.phoneInputSource && jl40.l(this.country, crossBorderByPhoneParams.country);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        public final String getCheckUserBankId() {
            return this.checkUserBankId;
        }

        public final String getCountry() {
            return this.country;
        }

        public final MoneyEntity getCreditMoney() {
            return this.creditMoney;
        }

        public final CurrencyRateEntity getCurrencyRate() {
            return this.currencyRate;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final PhoneInputSource getPhoneInputSource() {
            return this.phoneInputSource;
        }

        public final CrossBorderPriorityMoneyType getPriorityMoneyType() {
            return this.priorityMoneyType;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        public final String getReceiverFullName() {
            return this.receiverFullName;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b(unr0.b(unr0.b(unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId), 31, this.sourceAgreementId), 31, this.phone), 31, this.partnerId);
            String str4 = this.receiverFullName;
            int d = ly3.d(this.creditMoney, (b2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            CurrencyRateEntity currencyRateEntity = this.currencyRate;
            int b3 = unr0.b((this.priorityMoneyType.hashCode() + ((d + (currencyRateEntity == null ? 0 : currencyRateEntity.hashCode())) * 31)) * 31, 31, this.checkUserBankId);
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            int hashCode4 = (b3 + (phoneInputSource == null ? 0 : phoneInputSource.hashCode())) * 31;
            String str5 = this.country;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.transferSessionId;
            String str6 = this.sourceAgreementId;
            String str7 = this.phone;
            String str8 = this.partnerId;
            String str9 = this.receiverFullName;
            MoneyEntity moneyEntity2 = this.creditMoney;
            CurrencyRateEntity currencyRateEntity = this.currencyRate;
            CrossBorderPriorityMoneyType crossBorderPriorityMoneyType = this.priorityMoneyType;
            String str10 = this.checkUserBankId;
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            String str11 = this.country;
            StringBuilder v = b64.v("CrossBorderByPhoneParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", transferSessionId=", str5, ", sourceAgreementId=");
            g8e.D(v, str6, ", phone=", str7, ", partnerId=");
            g8e.D(v, str8, ", receiverFullName=", str9, ", creditMoney=");
            v.append(moneyEntity2);
            v.append(", currencyRate=");
            v.append(currencyRateEntity);
            v.append(", priorityMoneyType=");
            v.append(crossBorderPriorityMoneyType);
            v.append(", checkUserBankId=");
            v.append(str10);
            v.append(", phoneInputSource=");
            v.append(phoneInputSource);
            v.append(", country=");
            v.append(str11);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.phone);
            dest.writeString(this.partnerId);
            dest.writeString(this.receiverFullName);
            dest.writeParcelable(this.creditMoney, flags);
            CurrencyRateEntity currencyRateEntity = this.currencyRate;
            if (currencyRateEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                currencyRateEntity.writeToParcel(dest, flags);
            }
            dest.writeString(this.priorityMoneyType.name());
            dest.writeString(this.checkUserBankId);
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            if (phoneInputSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(phoneInputSource.name());
            }
            dest.writeString(this.country);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CrossBorderByPhoneParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CrossBorderByPhoneParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                TransferResultPageEntity createFromParcel = creator.createFromParcel(parcel);
                TransferResultPageEntity createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                MoneyEntity moneyEntity = (MoneyEntity) parcel.readParcelable(CrossBorderByPhoneParams.class.getClassLoader());
                TransferScenario transferScenario = valueOf2;
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                PhoneInputSource phoneInputSource = null;
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                MoneyEntity moneyEntity2 = (MoneyEntity) parcel.readParcelable(CrossBorderByPhoneParams.class.getClassLoader());
                CurrencyRateEntity createFromParcel3 = parcel.readInt() == 0 ? null : CurrencyRateEntity.CREATOR.createFromParcel(parcel);
                CrossBorderPriorityMoneyType valueOf3 = CrossBorderPriorityMoneyType.valueOf(parcel.readString());
                String readString10 = parcel.readString();
                if (parcel.readInt() != 0) {
                    phoneInputSource = PhoneInputSource.valueOf(parcel.readString());
                }
                return new CrossBorderByPhoneParams(readString, readString2, valueOf, transferScenario, createFromParcel, createFromParcel2, moneyEntity, readString3, readString4, readString5, readString6, readString7, readString8, readString9, moneyEntity2, createFromParcel3, valueOf3, readString10, phoneInputSource, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CrossBorderByPhoneParams[] newArray(int i) {
                return new CrossBorderByPhoneParams[i];
            }
        }

        public CrossBorderByPhoneParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, MoneyEntity moneyEntity2, CurrencyRateEntity currencyRateEntity, CrossBorderPriorityMoneyType crossBorderPriorityMoneyType, String str10, PhoneInputSource phoneInputSource, String str11) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.transferSessionId = str5;
            this.sourceAgreementId = str6;
            this.phone = str7;
            this.partnerId = str8;
            this.receiverFullName = str9;
            this.creditMoney = moneyEntity2;
            this.currencyRate = currencyRateEntity;
            this.priorityMoneyType = crossBorderPriorityMoneyType;
            this.checkUserBankId = str10;
            this.phoneInputSource = phoneInputSource;
            this.country = str11;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;", "Landroid/os/Parcelable;", "", "rate", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$CurrencyRateEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRate", "getCurrency", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CurrencyRateEntity implements Parcelable {
        public static final Parcelable.Creator<CurrencyRateEntity> CREATOR = new Creator();
        private final String currency;
        private final String rate;

        public CurrencyRateEntity(String str, String str2) {
            this.rate = str;
            this.currency = str2;
        }

        public static /* synthetic */ CurrencyRateEntity copy$default(CurrencyRateEntity currencyRateEntity, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencyRateEntity.rate;
            }
            if ((i & 2) != 0) {
                str2 = currencyRateEntity.currency;
            }
            return currencyRateEntity.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRate() {
            return this.rate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final CurrencyRateEntity copy(String rate, String currency) {
            return new CurrencyRateEntity(rate, currency);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrencyRateEntity)) {
                return false;
            }
            CurrencyRateEntity currencyRateEntity = (CurrencyRateEntity) other;
            return jl40.l(this.rate, currencyRateEntity.rate) && jl40.l(this.currency, currencyRateEntity.currency);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getRate() {
            return this.rate;
        }

        public int hashCode() {
            return this.currency.hashCode() + (this.rate.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("CurrencyRateEntity(rate=", this.rate, ", currency=", this.currency, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.rate);
            dest.writeString(this.currency);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CurrencyRateEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurrencyRateEntity createFromParcel(Parcel parcel) {
                return new CurrencyRateEntity(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurrencyRateEntity[] newArray(int i) {
                return new CurrencyRateEntity[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u009c\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010+R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bH\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bI\u0010!R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010!R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010!R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010!R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u00102¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$HcsInvoiceTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "sourceAgreementId", "invoiceId", "Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;", "requisites", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$HcsInvoiceTransferParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "getSourceAgreementId", "getInvoiceId", "Lcom/ybsdk/feature/transfer/version2/api/entities/HcsInvoiceRequisitesEntity;", "getRequisites", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HcsInvoiceTransferParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<HcsInvoiceTransferParams> CREATOR = new Creator();
        private final String checkId;
        private final TransferDirection direction;
        private final String invoiceId;
        private final MoneyEntity money;
        private final String product;
        private final String referrer;
        private final HcsInvoiceRequisitesEntity requisites;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ HcsInvoiceTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str3, str4, str5, str6, str7, hcsInvoiceRequisitesEntity);
        }

        public static /* synthetic */ HcsInvoiceTransferParams copy$default(HcsInvoiceTransferParams hcsInvoiceTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hcsInvoiceTransferParams.product;
            }
            return hcsInvoiceTransferParams.copy(str, (i & 2) != 0 ? hcsInvoiceTransferParams.referrer : str2, (i & 4) != 0 ? hcsInvoiceTransferParams.direction : transferDirection, (i & 8) != 0 ? hcsInvoiceTransferParams.scenario : transferScenario, (i & 16) != 0 ? hcsInvoiceTransferParams.resultPage : transferResultPageEntity, (i & 32) != 0 ? hcsInvoiceTransferParams.timeoutResultPage : transferResultPageEntity2, (i & 64) != 0 ? hcsInvoiceTransferParams.money : moneyEntity, (i & 128) != 0 ? hcsInvoiceTransferParams.checkId : str3, (i & 256) != 0 ? hcsInvoiceTransferParams.transferId : str4, (i & 512) != 0 ? hcsInvoiceTransferParams.transferSessionId : str5, (i & 1024) != 0 ? hcsInvoiceTransferParams.sourceAgreementId : str6, (i & 2048) != 0 ? hcsInvoiceTransferParams.invoiceId : str7, (i & 4096) != 0 ? hcsInvoiceTransferParams.requisites : hcsInvoiceRequisitesEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        /* renamed from: component13, reason: from getter */
        public final HcsInvoiceRequisitesEntity getRequisites() {
            return this.requisites;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final HcsInvoiceTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String transferSessionId, String sourceAgreementId, String invoiceId, HcsInvoiceRequisitesEntity requisites) {
            return new HcsInvoiceTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, transferSessionId, sourceAgreementId, invoiceId, requisites);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HcsInvoiceTransferParams)) {
                return false;
            }
            HcsInvoiceTransferParams hcsInvoiceTransferParams = (HcsInvoiceTransferParams) other;
            return jl40.l(this.product, hcsInvoiceTransferParams.product) && jl40.l(this.referrer, hcsInvoiceTransferParams.referrer) && this.direction == hcsInvoiceTransferParams.direction && this.scenario == hcsInvoiceTransferParams.scenario && jl40.l(this.resultPage, hcsInvoiceTransferParams.resultPage) && jl40.l(this.timeoutResultPage, hcsInvoiceTransferParams.timeoutResultPage) && jl40.l(this.money, hcsInvoiceTransferParams.money) && jl40.l(this.checkId, hcsInvoiceTransferParams.checkId) && jl40.l(this.transferId, hcsInvoiceTransferParams.transferId) && jl40.l(this.transferSessionId, hcsInvoiceTransferParams.transferSessionId) && jl40.l(this.sourceAgreementId, hcsInvoiceTransferParams.sourceAgreementId) && jl40.l(this.invoiceId, hcsInvoiceTransferParams.invoiceId) && jl40.l(this.requisites, hcsInvoiceTransferParams.requisites);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        public final HcsInvoiceRequisitesEntity getRequisites() {
            return this.requisites;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            return this.requisites.hashCode() + unr0.b(unr0.b(unr0.b((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.transferSessionId), 31, this.sourceAgreementId), 31, this.invoiceId);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.transferSessionId;
            String str6 = this.sourceAgreementId;
            String str7 = this.invoiceId;
            HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity = this.requisites;
            StringBuilder v = b64.v("HcsInvoiceTransferParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", transferSessionId=", str5, ", sourceAgreementId=");
            g8e.D(v, str6, ", invoiceId=", str7, ", requisites=");
            v.append(hcsInvoiceRequisitesEntity);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.invoiceId);
            this.requisites.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HcsInvoiceTransferParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HcsInvoiceTransferParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new HcsInvoiceTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (MoneyEntity) parcel.readParcelable(HcsInvoiceTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), HcsInvoiceRequisitesEntity.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HcsInvoiceTransferParams[] newArray(int i) {
                return new HcsInvoiceTransferParams[i];
            }
        }

        public HcsInvoiceTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, HcsInvoiceRequisitesEntity hcsInvoiceRequisitesEntity) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.transferSessionId = str5;
            this.sourceAgreementId = str6;
            this.invoiceId = str7;
            this.requisites = hcsInvoiceRequisitesEntity;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J¨\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bF\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bG\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010-R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010!R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010!R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bM\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bN\u0010!¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$InternetPaymentParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "accountNumber", "providerId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "sourceAgreementId", "checkId", "transferId", "transferSessionId", "templatePaymentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$InternetPaymentParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getAccountNumber", "getProviderId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getSourceAgreementId", "getCheckId", "getTransferId", "getTransferSessionId", "getTemplatePaymentType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InternetPaymentParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<InternetPaymentParams> CREATOR = new Creator();
        private final String accountNumber;
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String product;
        private final String providerId;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final String templatePaymentType;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ InternetPaymentParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, moneyEntity, str5, str6, str7, str8, (i & 8192) != 0 ? null : str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTemplatePaymentType() {
            return this.templatePaymentType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component8, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component9, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final InternetPaymentParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String accountNumber, String providerId, MoneyEntity money, String sourceAgreementId, String checkId, String transferId, String transferSessionId, String templatePaymentType) {
            return new InternetPaymentParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, accountNumber, providerId, money, sourceAgreementId, checkId, transferId, transferSessionId, templatePaymentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternetPaymentParams)) {
                return false;
            }
            InternetPaymentParams internetPaymentParams = (InternetPaymentParams) other;
            return jl40.l(this.product, internetPaymentParams.product) && jl40.l(this.referrer, internetPaymentParams.referrer) && this.direction == internetPaymentParams.direction && this.scenario == internetPaymentParams.scenario && jl40.l(this.resultPage, internetPaymentParams.resultPage) && jl40.l(this.timeoutResultPage, internetPaymentParams.timeoutResultPage) && jl40.l(this.accountNumber, internetPaymentParams.accountNumber) && jl40.l(this.providerId, internetPaymentParams.providerId) && jl40.l(this.money, internetPaymentParams.money) && jl40.l(this.sourceAgreementId, internetPaymentParams.sourceAgreementId) && jl40.l(this.checkId, internetPaymentParams.checkId) && jl40.l(this.transferId, internetPaymentParams.transferId) && jl40.l(this.transferSessionId, internetPaymentParams.transferSessionId) && jl40.l(this.templatePaymentType, internetPaymentParams.templatePaymentType);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return this.templatePaymentType;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(unr0.b(ly3.d(this.money, unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.accountNumber), 31, this.providerId), 31), 31, this.sourceAgreementId), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId);
            String str4 = this.templatePaymentType;
            return b2 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            String str3 = this.accountNumber;
            String str4 = this.providerId;
            MoneyEntity moneyEntity = this.money;
            String str5 = this.sourceAgreementId;
            String str6 = this.checkId;
            String str7 = this.transferId;
            String str8 = this.transferSessionId;
            String str9 = this.templatePaymentType;
            StringBuilder v = b64.v("InternetPaymentParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", accountNumber=");
            g8e.D(v, str3, ", providerId=", str4, ", money=");
            v.append(moneyEntity);
            v.append(", sourceAgreementId=");
            v.append(str5);
            v.append(", checkId=");
            g8e.D(v, str6, ", transferId=", str7, ", transferSessionId=");
            return g8e.r(v, str8, ", templatePaymentType=", str9, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeString(this.accountNumber);
            dest.writeString(this.providerId);
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.templatePaymentType);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InternetPaymentParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InternetPaymentParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new InternetPaymentParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(InternetPaymentParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InternetPaymentParams[] newArray(int i) {
                return new InternetPaymentParams[i];
            }
        }

        public InternetPaymentParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, String str8, String str9) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.accountNumber = str3;
            this.providerId = str4;
            this.money = moneyEntity;
            this.sourceAgreementId = str5;
            this.checkId = str6;
            this.transferId = str7;
            this.transferSessionId = str8;
            this.templatePaymentType = str9;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u009e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010+R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bH\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bI\u0010!R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010!R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010!R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u00102¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$Me2MeTopupParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "targetAgreementId", "partnerId", "transferSessionId", "Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "autoFundPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$Me2MeTopupParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTargetAgreementId", "getPartnerId", "getTransferSessionId", "Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "getAutoFundPayload", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Me2MeTopupParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<Me2MeTopupParams> CREATOR = new Creator();
        private final AutoFundPayloadEntity autoFundPayload;
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String partnerId;
        private final String product;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String targetAgreementId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ Me2MeTopupParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, AutoFundPayloadEntity autoFundPayloadEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, moneyEntity, str3, str4, str5, str6, str7, autoFundPayloadEntity);
        }

        public static /* synthetic */ Me2MeTopupParams copy$default(Me2MeTopupParams me2MeTopupParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, AutoFundPayloadEntity autoFundPayloadEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = me2MeTopupParams.product;
            }
            return me2MeTopupParams.copy(str, (i & 2) != 0 ? me2MeTopupParams.referrer : str2, (i & 4) != 0 ? me2MeTopupParams.direction : transferDirection, (i & 8) != 0 ? me2MeTopupParams.scenario : transferScenario, (i & 16) != 0 ? me2MeTopupParams.resultPage : transferResultPageEntity, (i & 32) != 0 ? me2MeTopupParams.timeoutResultPage : transferResultPageEntity2, (i & 64) != 0 ? me2MeTopupParams.money : moneyEntity, (i & 128) != 0 ? me2MeTopupParams.checkId : str3, (i & 256) != 0 ? me2MeTopupParams.transferId : str4, (i & 512) != 0 ? me2MeTopupParams.targetAgreementId : str5, (i & 1024) != 0 ? me2MeTopupParams.partnerId : str6, (i & 2048) != 0 ? me2MeTopupParams.transferSessionId : str7, (i & 4096) != 0 ? me2MeTopupParams.autoFundPayload : autoFundPayloadEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component13, reason: from getter */
        public final AutoFundPayloadEntity getAutoFundPayload() {
            return this.autoFundPayload;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final Me2MeTopupParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String targetAgreementId, String partnerId, String transferSessionId, AutoFundPayloadEntity autoFundPayload) {
            return new Me2MeTopupParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, targetAgreementId, partnerId, transferSessionId, autoFundPayload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Me2MeTopupParams)) {
                return false;
            }
            Me2MeTopupParams me2MeTopupParams = (Me2MeTopupParams) other;
            return jl40.l(this.product, me2MeTopupParams.product) && jl40.l(this.referrer, me2MeTopupParams.referrer) && this.direction == me2MeTopupParams.direction && this.scenario == me2MeTopupParams.scenario && jl40.l(this.resultPage, me2MeTopupParams.resultPage) && jl40.l(this.timeoutResultPage, me2MeTopupParams.timeoutResultPage) && jl40.l(this.money, me2MeTopupParams.money) && jl40.l(this.checkId, me2MeTopupParams.checkId) && jl40.l(this.transferId, me2MeTopupParams.transferId) && jl40.l(this.targetAgreementId, me2MeTopupParams.targetAgreementId) && jl40.l(this.partnerId, me2MeTopupParams.partnerId) && jl40.l(this.transferSessionId, me2MeTopupParams.transferSessionId) && jl40.l(this.autoFundPayload, me2MeTopupParams.autoFundPayload);
        }

        public final AutoFundPayloadEntity getAutoFundPayload() {
            return this.autoFundPayload;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b(unr0.b(unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.targetAgreementId), 31, this.partnerId), 31, this.transferSessionId);
            AutoFundPayloadEntity autoFundPayloadEntity = this.autoFundPayload;
            return b2 + (autoFundPayloadEntity != null ? autoFundPayloadEntity.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.targetAgreementId;
            String str6 = this.partnerId;
            String str7 = this.transferSessionId;
            AutoFundPayloadEntity autoFundPayloadEntity = this.autoFundPayload;
            StringBuilder v = b64.v("Me2MeTopupParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", targetAgreementId=", str5, ", partnerId=");
            g8e.D(v, str6, ", transferSessionId=", str7, ", autoFundPayload=");
            v.append(autoFundPayloadEntity);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.targetAgreementId);
            dest.writeString(this.partnerId);
            dest.writeString(this.transferSessionId);
            AutoFundPayloadEntity autoFundPayloadEntity = this.autoFundPayload;
            if (autoFundPayloadEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                autoFundPayloadEntity.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Me2MeTopupParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Me2MeTopupParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new Me2MeTopupParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (MoneyEntity) parcel.readParcelable(Me2MeTopupParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AutoFundPayloadEntity.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Me2MeTopupParams[] newArray(int i) {
                return new Me2MeTopupParams[i];
            }
        }

        public Me2MeTopupParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, AutoFundPayloadEntity autoFundPayloadEntity) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.targetAgreementId = str5;
            this.partnerId = str6;
            this.transferSessionId = str7;
            this.autoFundPayload = autoFundPayloadEntity;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0088\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b?\u0010%R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010(R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bE\u0010\u001e¨\u0006F"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$MkkCashoutParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "planId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$MkkCashoutParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "getPlanId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MkkCashoutParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<MkkCashoutParams> CREATOR = new Creator();
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String planId;
        private final String product;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public MkkCashoutParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.money = moneyEntity;
            this.checkId = str3;
            this.transferId = str4;
            this.transferSessionId = str5;
            this.planId = str6;
        }

        public static /* synthetic */ MkkCashoutParams copy$default(MkkCashoutParams mkkCashoutParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mkkCashoutParams.product;
            }
            if ((i & 2) != 0) {
                str2 = mkkCashoutParams.referrer;
            }
            if ((i & 4) != 0) {
                transferDirection = mkkCashoutParams.direction;
            }
            if ((i & 8) != 0) {
                transferScenario = mkkCashoutParams.scenario;
            }
            if ((i & 16) != 0) {
                transferResultPageEntity = mkkCashoutParams.resultPage;
            }
            if ((i & 32) != 0) {
                transferResultPageEntity2 = mkkCashoutParams.timeoutResultPage;
            }
            if ((i & 64) != 0) {
                moneyEntity = mkkCashoutParams.money;
            }
            if ((i & 128) != 0) {
                str3 = mkkCashoutParams.checkId;
            }
            if ((i & 256) != 0) {
                str4 = mkkCashoutParams.transferId;
            }
            if ((i & 512) != 0) {
                str5 = mkkCashoutParams.transferSessionId;
            }
            if ((i & 1024) != 0) {
                str6 = mkkCashoutParams.planId;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str3;
            String str10 = str4;
            TransferResultPageEntity transferResultPageEntity3 = transferResultPageEntity2;
            MoneyEntity moneyEntity2 = moneyEntity;
            TransferResultPageEntity transferResultPageEntity4 = transferResultPageEntity;
            TransferDirection transferDirection2 = transferDirection;
            return mkkCashoutParams.copy(str, str2, transferDirection2, transferScenario, transferResultPageEntity4, transferResultPageEntity3, moneyEntity2, str9, str10, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        public final MkkCashoutParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, MoneyEntity money, String checkId, String transferId, String transferSessionId, String planId) {
            return new MkkCashoutParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, money, checkId, transferId, transferSessionId, planId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MkkCashoutParams)) {
                return false;
            }
            MkkCashoutParams mkkCashoutParams = (MkkCashoutParams) other;
            return jl40.l(this.product, mkkCashoutParams.product) && jl40.l(this.referrer, mkkCashoutParams.referrer) && this.direction == mkkCashoutParams.direction && this.scenario == mkkCashoutParams.scenario && jl40.l(this.resultPage, mkkCashoutParams.resultPage) && jl40.l(this.timeoutResultPage, mkkCashoutParams.timeoutResultPage) && jl40.l(this.money, mkkCashoutParams.money) && jl40.l(this.checkId, mkkCashoutParams.checkId) && jl40.l(this.transferId, mkkCashoutParams.transferId) && jl40.l(this.transferSessionId, mkkCashoutParams.transferSessionId) && jl40.l(this.planId, mkkCashoutParams.planId);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPlanId() {
            return this.planId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, (hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31), 31, this.checkId);
            String str3 = this.transferId;
            return this.planId.hashCode() + unr0.b((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.transferSessionId);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.checkId;
            String str4 = this.transferId;
            String str5 = this.transferSessionId;
            String str6 = this.planId;
            StringBuilder v = b64.v("MkkCashoutParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str3);
            v.append(", transferId=");
            g8e.D(v, str4, ", transferSessionId=", str5, ", planId=");
            return oyr.t(v, str6, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.planId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MkkCashoutParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MkkCashoutParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new MkkCashoutParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, (MoneyEntity) parcel.readParcelable(MkkCashoutParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MkkCashoutParams[] newArray(int i) {
                return new MkkCashoutParams[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J¨\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bE\u0010(R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bF\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bG\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010-R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010!R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010!R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bM\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bN\u0010!¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$MobilePaymentParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "phone", "providerId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "sourceAgreementId", "checkId", "transferId", "transferSessionId", "templatePaymentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$MobilePaymentParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getPhone", "getProviderId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getSourceAgreementId", "getCheckId", "getTransferId", "getTransferSessionId", "getTemplatePaymentType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MobilePaymentParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<MobilePaymentParams> CREATOR = new Creator();
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String phone;
        private final String product;
        private final String providerId;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final String templatePaymentType;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ MobilePaymentParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, moneyEntity, str5, str6, str7, str8, (i & 8192) != 0 ? null : str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTemplatePaymentType() {
            return this.templatePaymentType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component8, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component9, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final MobilePaymentParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String phone, String providerId, MoneyEntity money, String sourceAgreementId, String checkId, String transferId, String transferSessionId, String templatePaymentType) {
            return new MobilePaymentParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, phone, providerId, money, sourceAgreementId, checkId, transferId, transferSessionId, templatePaymentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MobilePaymentParams)) {
                return false;
            }
            MobilePaymentParams mobilePaymentParams = (MobilePaymentParams) other;
            return jl40.l(this.product, mobilePaymentParams.product) && jl40.l(this.referrer, mobilePaymentParams.referrer) && this.direction == mobilePaymentParams.direction && this.scenario == mobilePaymentParams.scenario && jl40.l(this.resultPage, mobilePaymentParams.resultPage) && jl40.l(this.timeoutResultPage, mobilePaymentParams.timeoutResultPage) && jl40.l(this.phone, mobilePaymentParams.phone) && jl40.l(this.providerId, mobilePaymentParams.providerId) && jl40.l(this.money, mobilePaymentParams.money) && jl40.l(this.sourceAgreementId, mobilePaymentParams.sourceAgreementId) && jl40.l(this.checkId, mobilePaymentParams.checkId) && jl40.l(this.transferId, mobilePaymentParams.transferId) && jl40.l(this.transferSessionId, mobilePaymentParams.transferSessionId) && jl40.l(this.templatePaymentType, mobilePaymentParams.templatePaymentType);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPhone() {
            return this.phone;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return this.templatePaymentType;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(unr0.b(ly3.d(this.money, unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.phone), 31, this.providerId), 31), 31, this.sourceAgreementId), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId);
            String str4 = this.templatePaymentType;
            return b2 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            String str3 = this.phone;
            String str4 = this.providerId;
            MoneyEntity moneyEntity = this.money;
            String str5 = this.sourceAgreementId;
            String str6 = this.checkId;
            String str7 = this.transferId;
            String str8 = this.transferSessionId;
            String str9 = this.templatePaymentType;
            StringBuilder v = b64.v("MobilePaymentParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", phone=");
            g8e.D(v, str3, ", providerId=", str4, ", money=");
            v.append(moneyEntity);
            v.append(", sourceAgreementId=");
            v.append(str5);
            v.append(", checkId=");
            g8e.D(v, str6, ", transferId=", str7, ", transferSessionId=");
            return g8e.r(v, str8, ", templatePaymentType=", str9, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeString(this.phone);
            dest.writeString(this.providerId);
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.templatePaymentType);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MobilePaymentParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MobilePaymentParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new MobilePaymentParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(MobilePaymentParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MobilePaymentParams[] newArray(int i) {
                return new MobilePaymentParams[i];
            }
        }

        public MobilePaymentParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, String str8, String str9) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.phone = str3;
            this.providerId = str4;
            this.money = moneyEntity;
            this.sourceAgreementId = str5;
            this.checkId = str6;
            this.transferId = str7;
            this.transferSessionId = str8;
            this.templatePaymentType = str9;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010&J\u0010\u00106\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010&J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010&J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010&JÖ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010&J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010$J\u001a\u0010D\u001a\u00020C2\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bH\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bO\u0010-R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bP\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bQ\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bR\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bS\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bV\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u00107R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bY\u0010&R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bZ\u0010&R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\b[\u0010&R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\b\\\u0010&R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\b]\u0010&¨\u0006^"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$PhoneTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "phone", "partnerId", "comment", "requestId", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "phoneInputSource", "pam", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "sourceAgreementId", "checkId", "transferId", "transferSessionId", "templatePaymentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "component12", "component13", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$PhoneTransferParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getPhone", "getPartnerId", "getComment", "getRequestId", "Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "getPhoneInputSource", "getPam", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getSourceAgreementId", "getCheckId", "getTransferId", "getTransferSessionId", "getTemplatePaymentType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PhoneTransferParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<PhoneTransferParams> CREATOR = new Creator();
        private final String checkId;
        private final String comment;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String pam;
        private final String partnerId;
        private final String phone;
        private final PhoneInputSource phoneInputSource;
        private final String product;
        private final String referrer;
        private final String requestId;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final String templatePaymentType;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ PhoneTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, PhoneInputSource phoneInputSource, String str7, MoneyEntity moneyEntity, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, str5, str6, phoneInputSource, str7, moneyEntity, str8, str9, str10, str11, (i & 131072) != 0 ? null : str12);
        }

        public static /* synthetic */ PhoneTransferParams copy$default(PhoneTransferParams phoneTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, PhoneInputSource phoneInputSource, String str7, MoneyEntity moneyEntity, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
            String str13;
            String str14;
            String str15 = (i & 1) != 0 ? phoneTransferParams.product : str;
            String str16 = (i & 2) != 0 ? phoneTransferParams.referrer : str2;
            TransferDirection transferDirection2 = (i & 4) != 0 ? phoneTransferParams.direction : transferDirection;
            TransferScenario transferScenario2 = (i & 8) != 0 ? phoneTransferParams.scenario : transferScenario;
            TransferResultPageEntity transferResultPageEntity3 = (i & 16) != 0 ? phoneTransferParams.resultPage : transferResultPageEntity;
            TransferResultPageEntity transferResultPageEntity4 = (i & 32) != 0 ? phoneTransferParams.timeoutResultPage : transferResultPageEntity2;
            String str17 = (i & 64) != 0 ? phoneTransferParams.phone : str3;
            String str18 = (i & 128) != 0 ? phoneTransferParams.partnerId : str4;
            String str19 = (i & 256) != 0 ? phoneTransferParams.comment : str5;
            String str20 = (i & 512) != 0 ? phoneTransferParams.requestId : str6;
            PhoneInputSource phoneInputSource2 = (i & 1024) != 0 ? phoneTransferParams.phoneInputSource : phoneInputSource;
            String str21 = (i & 2048) != 0 ? phoneTransferParams.pam : str7;
            MoneyEntity moneyEntity2 = (i & 4096) != 0 ? phoneTransferParams.money : moneyEntity;
            String str22 = (i & 8192) != 0 ? phoneTransferParams.sourceAgreementId : str8;
            String str23 = str15;
            String str24 = (i & 16384) != 0 ? phoneTransferParams.checkId : str9;
            String str25 = (i & 32768) != 0 ? phoneTransferParams.transferId : str10;
            String str26 = (i & 65536) != 0 ? phoneTransferParams.transferSessionId : str11;
            if ((i & 131072) != 0) {
                str14 = str26;
                str13 = phoneTransferParams.templatePaymentType;
            } else {
                str13 = str12;
                str14 = str26;
            }
            return phoneTransferParams.copy(str23, str16, transferDirection2, transferScenario2, transferResultPageEntity3, transferResultPageEntity4, str17, str18, str19, str20, phoneInputSource2, str21, moneyEntity2, str22, str24, str25, str14, str13);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component11, reason: from getter */
        public final PhoneInputSource getPhoneInputSource() {
            return this.phoneInputSource;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPam() {
            return this.pam;
        }

        /* renamed from: component13, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component14, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component15, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component16, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component17, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component18, reason: from getter */
        public final String getTemplatePaymentType() {
            return this.templatePaymentType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        public final PhoneTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String phone, String partnerId, String comment, String requestId, PhoneInputSource phoneInputSource, String pam, MoneyEntity money, String sourceAgreementId, String checkId, String transferId, String transferSessionId, String templatePaymentType) {
            return new PhoneTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, phone, partnerId, comment, requestId, phoneInputSource, pam, money, sourceAgreementId, checkId, transferId, transferSessionId, templatePaymentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneTransferParams)) {
                return false;
            }
            PhoneTransferParams phoneTransferParams = (PhoneTransferParams) other;
            return jl40.l(this.product, phoneTransferParams.product) && jl40.l(this.referrer, phoneTransferParams.referrer) && this.direction == phoneTransferParams.direction && this.scenario == phoneTransferParams.scenario && jl40.l(this.resultPage, phoneTransferParams.resultPage) && jl40.l(this.timeoutResultPage, phoneTransferParams.timeoutResultPage) && jl40.l(this.phone, phoneTransferParams.phone) && jl40.l(this.partnerId, phoneTransferParams.partnerId) && jl40.l(this.comment, phoneTransferParams.comment) && jl40.l(this.requestId, phoneTransferParams.requestId) && this.phoneInputSource == phoneTransferParams.phoneInputSource && jl40.l(this.pam, phoneTransferParams.pam) && jl40.l(this.money, phoneTransferParams.money) && jl40.l(this.sourceAgreementId, phoneTransferParams.sourceAgreementId) && jl40.l(this.checkId, phoneTransferParams.checkId) && jl40.l(this.transferId, phoneTransferParams.transferId) && jl40.l(this.transferSessionId, phoneTransferParams.transferSessionId) && jl40.l(this.templatePaymentType, phoneTransferParams.templatePaymentType);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        public final String getComment() {
            return this.comment;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        public final String getPam() {
            return this.pam;
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final PhoneInputSource getPhoneInputSource() {
            return this.phoneInputSource;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return this.templatePaymentType;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.phone), 31, this.partnerId);
            String str3 = this.comment;
            int hashCode4 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestId;
            int hashCode5 = (this.phoneInputSource.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            String str5 = this.pam;
            int b2 = unr0.b(unr0.b(ly3.d(this.money, (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31, this.sourceAgreementId), 31, this.checkId);
            String str6 = this.transferId;
            int b3 = unr0.b((b2 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.transferSessionId);
            String str7 = this.templatePaymentType;
            return b3 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            String str3 = this.phone;
            String str4 = this.partnerId;
            String str5 = this.comment;
            String str6 = this.requestId;
            PhoneInputSource phoneInputSource = this.phoneInputSource;
            String str7 = this.pam;
            MoneyEntity moneyEntity = this.money;
            String str8 = this.sourceAgreementId;
            String str9 = this.checkId;
            String str10 = this.transferId;
            String str11 = this.transferSessionId;
            String str12 = this.templatePaymentType;
            StringBuilder v = b64.v("PhoneTransferParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", phone=");
            g8e.D(v, str3, ", partnerId=", str4, ", comment=");
            g8e.D(v, str5, ", requestId=", str6, ", phoneInputSource=");
            v.append(phoneInputSource);
            v.append(", pam=");
            v.append(str7);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", sourceAgreementId=");
            v.append(str8);
            v.append(", checkId=");
            g8e.D(v, str9, ", transferId=", str10, ", transferSessionId=");
            return g8e.r(v, str11, ", templatePaymentType=", str12, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeString(this.phone);
            dest.writeString(this.partnerId);
            dest.writeString(this.comment);
            dest.writeString(this.requestId);
            dest.writeString(this.phoneInputSource.name());
            dest.writeString(this.pam);
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.templatePaymentType);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PhoneTransferParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhoneTransferParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new PhoneTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PhoneInputSource.valueOf(parcel.readString()), parcel.readString(), (MoneyEntity) parcel.readParcelable(PhoneTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhoneTransferParams[] newArray(int i) {
                return new PhoneTransferParams[i];
            }
        }

        public PhoneTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, String str5, String str6, PhoneInputSource phoneInputSource, String str7, MoneyEntity moneyEntity, String str8, String str9, String str10, String str11, String str12) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.phone = str3;
            this.partnerId = str4;
            this.comment = str5;
            this.requestId = str6;
            this.phoneInputSource = phoneInputSource;
            this.pam = str7;
            this.money = moneyEntity;
            this.sourceAgreementId = str8;
            this.checkId = str9;
            this.transferId = str10;
            this.transferSessionId = str11;
            this.templatePaymentType = str12;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u009e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bF\u0010)R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bG\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010-R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bJ\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bK\u0010!R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u00102¨\u0006O"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$SelfTopupParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "sourceAgreementId", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "targetId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "autoFundPayload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component5", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component6", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component7", "component8", "component9", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component10", "component11", "component12", "component13", "()Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$SelfTopupParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "getSourceAgreementId", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getTargetId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "Lcom/ybsdk/feature/transfer/version2/api/entities/AutoFundPayloadEntity;", "getAutoFundPayload", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelfTopupParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<SelfTopupParams> CREATOR = new Creator();
        private final AutoFundPayloadEntity autoFundPayload;
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String product;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final String targetId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ SelfTopupParams(String str, String str2, String str3, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, AutoFundPayloadEntity autoFundPayloadEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str4, moneyEntity, str5, str6, str7, autoFundPayloadEntity);
        }

        public static /* synthetic */ SelfTopupParams copy$default(SelfTopupParams selfTopupParams, String str, String str2, String str3, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, AutoFundPayloadEntity autoFundPayloadEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selfTopupParams.product;
            }
            return selfTopupParams.copy(str, (i & 2) != 0 ? selfTopupParams.referrer : str2, (i & 4) != 0 ? selfTopupParams.sourceAgreementId : str3, (i & 8) != 0 ? selfTopupParams.direction : transferDirection, (i & 16) != 0 ? selfTopupParams.scenario : transferScenario, (i & 32) != 0 ? selfTopupParams.resultPage : transferResultPageEntity, (i & 64) != 0 ? selfTopupParams.timeoutResultPage : transferResultPageEntity2, (i & 128) != 0 ? selfTopupParams.targetId : str4, (i & 256) != 0 ? selfTopupParams.money : moneyEntity, (i & 512) != 0 ? selfTopupParams.checkId : str5, (i & 1024) != 0 ? selfTopupParams.transferId : str6, (i & 2048) != 0 ? selfTopupParams.transferSessionId : str7, (i & 4096) != 0 ? selfTopupParams.autoFundPayload : autoFundPayloadEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component13, reason: from getter */
        public final AutoFundPayloadEntity getAutoFundPayload() {
            return this.autoFundPayload;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTargetId() {
            return this.targetId;
        }

        /* renamed from: component9, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final SelfTopupParams copy(String product, String referrer, String sourceAgreementId, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String targetId, MoneyEntity money, String checkId, String transferId, String transferSessionId, AutoFundPayloadEntity autoFundPayload) {
            return new SelfTopupParams(product, referrer, sourceAgreementId, direction, scenario, resultPage, timeoutResultPage, targetId, money, checkId, transferId, transferSessionId, autoFundPayload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfTopupParams)) {
                return false;
            }
            SelfTopupParams selfTopupParams = (SelfTopupParams) other;
            return jl40.l(this.product, selfTopupParams.product) && jl40.l(this.referrer, selfTopupParams.referrer) && jl40.l(this.sourceAgreementId, selfTopupParams.sourceAgreementId) && this.direction == selfTopupParams.direction && this.scenario == selfTopupParams.scenario && jl40.l(this.resultPage, selfTopupParams.resultPage) && jl40.l(this.timeoutResultPage, selfTopupParams.timeoutResultPage) && jl40.l(this.targetId, selfTopupParams.targetId) && jl40.l(this.money, selfTopupParams.money) && jl40.l(this.checkId, selfTopupParams.checkId) && jl40.l(this.transferId, selfTopupParams.transferId) && jl40.l(this.transferSessionId, selfTopupParams.transferSessionId) && jl40.l(this.autoFundPayload, selfTopupParams.autoFundPayload);
        }

        public final AutoFundPayloadEntity getAutoFundPayload() {
            return this.autoFundPayload;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sourceAgreementId)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.targetId), 31), 31, this.checkId);
            String str3 = this.transferId;
            int b2 = unr0.b((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId);
            AutoFundPayloadEntity autoFundPayloadEntity = this.autoFundPayload;
            return b2 + (autoFundPayloadEntity != null ? autoFundPayloadEntity.hashCode() : 0);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            String str3 = this.sourceAgreementId;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            String str4 = this.targetId;
            MoneyEntity moneyEntity = this.money;
            String str5 = this.checkId;
            String str6 = this.transferId;
            String str7 = this.transferSessionId;
            AutoFundPayloadEntity autoFundPayloadEntity = this.autoFundPayload;
            StringBuilder v = b64.v("SelfTopupParams(product=", str, ", referrer=", str2, ", sourceAgreementId=");
            v.append(str3);
            v.append(", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", targetId=");
            v.append(str4);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str5);
            v.append(", transferId=");
            g8e.D(v, str6, ", transferSessionId=", str7, ", autoFundPayload=");
            v.append(autoFundPayloadEntity);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeString(this.targetId);
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
            AutoFundPayloadEntity autoFundPayloadEntity = this.autoFundPayload;
            if (autoFundPayloadEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                autoFundPayloadEntity.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfTopupParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfTopupParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new SelfTopupParams(readString, readString2, readString3, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), (MoneyEntity) parcel.readParcelable(SelfTopupParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AutoFundPayloadEntity.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfTopupParams[] newArray(int i) {
                return new SelfTopupParams[i];
            }
        }

        public SelfTopupParams(String str, String str2, String str3, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, AutoFundPayloadEntity autoFundPayloadEntity) {
            this.product = str;
            this.referrer = str2;
            this.sourceAgreementId = str3;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.targetId = str4;
            this.money = moneyEntity;
            this.checkId = str5;
            this.transferId = str6;
            this.transferSessionId = str7;
            this.autoFundPayload = autoFundPayloadEntity;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0092\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001fJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010&R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bB\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bC\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010+R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bF\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bG\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bH\u0010\u001f¨\u0006I"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$SelfTransferParams;", "Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams;", "", CreateApplicationWithProductJsonAdapter.productKey, "referrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "direction", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "scenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "resultPage", "timeoutResultPage", "sourceAgreementId", "targetAgreementId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "checkId", "transferId", "transferSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "component4", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component5", "()Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "component6", "component7", "component8", "component9", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;Lcom/ybsdk/core/transfer/utils/TransferScenario;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferMainResultScreenParams$SelfTransferParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getReferrer", "Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "getDirection", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getScenario", "Lcom/ybsdk/feature/transfer/version2/api/entities/TransferResultPageEntity;", "getResultPage", "getTimeoutResultPage", "getSourceAgreementId", "getTargetAgreementId", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getCheckId", "getTransferId", "getTransferSessionId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelfTransferParams implements TransferMainResultScreenParams {
        public static final Parcelable.Creator<SelfTransferParams> CREATOR = new Creator();
        private final String checkId;
        private final TransferDirection direction;
        private final MoneyEntity money;
        private final String product;
        private final String referrer;
        private final TransferResultPageEntity resultPage;
        private final TransferScenario scenario;
        private final String sourceAgreementId;
        private final String targetAgreementId;
        private final TransferResultPageEntity timeoutResultPage;
        private final String transferId;
        private final String transferSessionId;

        public /* synthetic */ SelfTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, transferDirection, transferScenario, transferResultPageEntity, transferResultPageEntity2, str3, str4, moneyEntity, str5, str6, str7);
        }

        public static /* synthetic */ SelfTransferParams copy$default(SelfTransferParams selfTransferParams, String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selfTransferParams.product;
            }
            if ((i & 2) != 0) {
                str2 = selfTransferParams.referrer;
            }
            if ((i & 4) != 0) {
                transferDirection = selfTransferParams.direction;
            }
            if ((i & 8) != 0) {
                transferScenario = selfTransferParams.scenario;
            }
            if ((i & 16) != 0) {
                transferResultPageEntity = selfTransferParams.resultPage;
            }
            if ((i & 32) != 0) {
                transferResultPageEntity2 = selfTransferParams.timeoutResultPage;
            }
            if ((i & 64) != 0) {
                str3 = selfTransferParams.sourceAgreementId;
            }
            if ((i & 128) != 0) {
                str4 = selfTransferParams.targetAgreementId;
            }
            if ((i & 256) != 0) {
                moneyEntity = selfTransferParams.money;
            }
            if ((i & 512) != 0) {
                str5 = selfTransferParams.checkId;
            }
            if ((i & 1024) != 0) {
                str6 = selfTransferParams.transferId;
            }
            if ((i & 2048) != 0) {
                str7 = selfTransferParams.transferSessionId;
            }
            String str8 = str6;
            String str9 = str7;
            MoneyEntity moneyEntity2 = moneyEntity;
            String str10 = str5;
            String str11 = str3;
            String str12 = str4;
            TransferResultPageEntity transferResultPageEntity3 = transferResultPageEntity;
            TransferResultPageEntity transferResultPageEntity4 = transferResultPageEntity2;
            return selfTransferParams.copy(str, str2, transferDirection, transferScenario, transferResultPageEntity3, transferResultPageEntity4, str11, str12, moneyEntity2, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        /* renamed from: component10, reason: from getter */
        public final String getCheckId() {
            return this.checkId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferDirection getDirection() {
            return this.direction;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferScenario getScenario() {
            return this.scenario;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        /* renamed from: component9, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final SelfTransferParams copy(String product, String referrer, TransferDirection direction, TransferScenario scenario, TransferResultPageEntity resultPage, TransferResultPageEntity timeoutResultPage, String sourceAgreementId, String targetAgreementId, MoneyEntity money, String checkId, String transferId, String transferSessionId) {
            return new SelfTransferParams(product, referrer, direction, scenario, resultPage, timeoutResultPage, sourceAgreementId, targetAgreementId, money, checkId, transferId, transferSessionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfTransferParams)) {
                return false;
            }
            SelfTransferParams selfTransferParams = (SelfTransferParams) other;
            return jl40.l(this.product, selfTransferParams.product) && jl40.l(this.referrer, selfTransferParams.referrer) && this.direction == selfTransferParams.direction && this.scenario == selfTransferParams.scenario && jl40.l(this.resultPage, selfTransferParams.resultPage) && jl40.l(this.timeoutResultPage, selfTransferParams.timeoutResultPage) && jl40.l(this.sourceAgreementId, selfTransferParams.sourceAgreementId) && jl40.l(this.targetAgreementId, selfTransferParams.targetAgreementId) && jl40.l(this.money, selfTransferParams.money) && jl40.l(this.checkId, selfTransferParams.checkId) && jl40.l(this.transferId, selfTransferParams.transferId) && jl40.l(this.transferSessionId, selfTransferParams.transferSessionId);
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getCheckId() {
            return this.checkId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferDirection getDirection() {
            return this.direction;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public MoneyEntity getMoney() {
            return this.money;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getReferrer() {
            return this.referrer;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getResultPage() {
            return this.resultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferScenario getScenario() {
            return this.scenario;
        }

        public final String getSourceAgreementId() {
            return this.sourceAgreementId;
        }

        public final String getTargetAgreementId() {
            return this.targetAgreementId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTemplatePaymentType() {
            return null;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public TransferResultPageEntity getTimeoutResultPage() {
            return this.timeoutResultPage;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferId() {
            return this.transferId;
        }

        @Override // com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams
        public String getTransferSessionId() {
            return this.transferSessionId;
        }

        public int hashCode() {
            String str = this.product;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.referrer;
            int hashCode2 = (this.direction.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            TransferScenario transferScenario = this.scenario;
            int hashCode3 = (this.resultPage.hashCode() + ((hashCode2 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31)) * 31;
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            int b = unr0.b(ly3.d(this.money, unr0.b(unr0.b((hashCode3 + (transferResultPageEntity == null ? 0 : transferResultPageEntity.hashCode())) * 31, 31, this.sourceAgreementId), 31, this.targetAgreementId), 31), 31, this.checkId);
            String str3 = this.transferId;
            return this.transferSessionId.hashCode() + ((b + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.product;
            String str2 = this.referrer;
            TransferDirection transferDirection = this.direction;
            TransferScenario transferScenario = this.scenario;
            TransferResultPageEntity transferResultPageEntity = this.resultPage;
            TransferResultPageEntity transferResultPageEntity2 = this.timeoutResultPage;
            String str3 = this.sourceAgreementId;
            String str4 = this.targetAgreementId;
            MoneyEntity moneyEntity = this.money;
            String str5 = this.checkId;
            String str6 = this.transferId;
            String str7 = this.transferSessionId;
            StringBuilder v = b64.v("SelfTransferParams(product=", str, ", referrer=", str2, ", direction=");
            v.append(transferDirection);
            v.append(", scenario=");
            v.append(transferScenario);
            v.append(", resultPage=");
            v.append(transferResultPageEntity);
            v.append(", timeoutResultPage=");
            v.append(transferResultPageEntity2);
            v.append(", sourceAgreementId=");
            g8e.D(v, str3, ", targetAgreementId=", str4, ", money=");
            v.append(moneyEntity);
            v.append(", checkId=");
            v.append(str5);
            v.append(", transferId=");
            return g8e.r(v, str6, ", transferSessionId=", str7, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product);
            dest.writeString(this.referrer);
            dest.writeString(this.direction.name());
            TransferScenario transferScenario = this.scenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            this.resultPage.writeToParcel(dest, flags);
            TransferResultPageEntity transferResultPageEntity = this.timeoutResultPage;
            if (transferResultPageEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transferResultPageEntity.writeToParcel(dest, flags);
            }
            dest.writeString(this.sourceAgreementId);
            dest.writeString(this.targetAgreementId);
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.checkId);
            dest.writeString(this.transferId);
            dest.writeString(this.transferSessionId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfTransferParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfTransferParams createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransferDirection valueOf = TransferDirection.valueOf(parcel.readString());
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                Parcelable.Creator<TransferResultPageEntity> creator = TransferResultPageEntity.CREATOR;
                return new SelfTransferParams(readString, readString2, valueOf, valueOf2, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(SelfTransferParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfTransferParams[] newArray(int i) {
                return new SelfTransferParams[i];
            }
        }

        public SelfTransferParams(String str, String str2, TransferDirection transferDirection, TransferScenario transferScenario, TransferResultPageEntity transferResultPageEntity, TransferResultPageEntity transferResultPageEntity2, String str3, String str4, MoneyEntity moneyEntity, String str5, String str6, String str7) {
            this.product = str;
            this.referrer = str2;
            this.direction = transferDirection;
            this.scenario = transferScenario;
            this.resultPage = transferResultPageEntity;
            this.timeoutResultPage = transferResultPageEntity2;
            this.sourceAgreementId = str3;
            this.targetAgreementId = str4;
            this.money = moneyEntity;
            this.checkId = str5;
            this.transferId = str6;
            this.transferSessionId = str7;
        }
    }
}
