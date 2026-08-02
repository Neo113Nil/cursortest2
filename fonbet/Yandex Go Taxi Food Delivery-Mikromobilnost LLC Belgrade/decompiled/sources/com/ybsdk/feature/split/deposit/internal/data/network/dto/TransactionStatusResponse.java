package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$Status;", "challengeData", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$SplitDepositPaymentChallengeData;", "finishedData", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "failedData", "<init>", "(Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$Status;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$SplitDepositPaymentChallengeData;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;)V", "getStatus", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$Status;", "getChallengeData", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$SplitDepositPaymentChallengeData;", "getFinishedData", "()Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/StatusScreenData;", "getFailedData", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SplitDepositPaymentChallengeData", "Status", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionStatusResponse {
    private final SplitDepositPaymentChallengeData challengeData;
    private final StatusScreenData failedData;
    private final StatusScreenData finishedData;
    private final Status status;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$SplitDepositPaymentChallengeData;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SplitDepositPaymentChallengeData {
        private final String url;

        public SplitDepositPaymentChallengeData(@Json(name = "url") String str) {
            this.url = str;
        }

        public static /* synthetic */ SplitDepositPaymentChallengeData copy$default(SplitDepositPaymentChallengeData splitDepositPaymentChallengeData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = splitDepositPaymentChallengeData.url;
            }
            return splitDepositPaymentChallengeData.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final SplitDepositPaymentChallengeData copy(@Json(name = "url") String url) {
            return new SplitDepositPaymentChallengeData(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SplitDepositPaymentChallengeData) && jl40.l(this.url, ((SplitDepositPaymentChallengeData) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return oyr.p("SplitDepositPaymentChallengeData(url=", this.url, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "CHALLENGE", TlsConstants.TLS_FINISHED, "FAILED", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status("PENDING", 0);
        public static final Status CHALLENGE = new Status("CHALLENGE", 1);
        public static final Status FINISHED = new Status(TlsConstants.TLS_FINISHED, 2);
        public static final Status FAILED = new Status("FAILED", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, CHALLENGE, FINISHED, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public TransactionStatusResponse(@Json(name = "status") Status status, @Json(name = "challenge_data") SplitDepositPaymentChallengeData splitDepositPaymentChallengeData, @Json(name = "finished_data") StatusScreenData statusScreenData, @Json(name = "failed_data") StatusScreenData statusScreenData2) {
        this.status = status;
        this.challengeData = splitDepositPaymentChallengeData;
        this.finishedData = statusScreenData;
        this.failedData = statusScreenData2;
    }

    public static /* synthetic */ TransactionStatusResponse copy$default(TransactionStatusResponse transactionStatusResponse, Status status, SplitDepositPaymentChallengeData splitDepositPaymentChallengeData, StatusScreenData statusScreenData, StatusScreenData statusScreenData2, int i, Object obj) {
        if ((i & 1) != 0) {
            status = transactionStatusResponse.status;
        }
        if ((i & 2) != 0) {
            splitDepositPaymentChallengeData = transactionStatusResponse.challengeData;
        }
        if ((i & 4) != 0) {
            statusScreenData = transactionStatusResponse.finishedData;
        }
        if ((i & 8) != 0) {
            statusScreenData2 = transactionStatusResponse.failedData;
        }
        return transactionStatusResponse.copy(status, splitDepositPaymentChallengeData, statusScreenData, statusScreenData2);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final SplitDepositPaymentChallengeData getChallengeData() {
        return this.challengeData;
    }

    /* renamed from: component3, reason: from getter */
    public final StatusScreenData getFinishedData() {
        return this.finishedData;
    }

    /* renamed from: component4, reason: from getter */
    public final StatusScreenData getFailedData() {
        return this.failedData;
    }

    public final TransactionStatusResponse copy(@Json(name = "status") Status status, @Json(name = "challenge_data") SplitDepositPaymentChallengeData challengeData, @Json(name = "finished_data") StatusScreenData finishedData, @Json(name = "failed_data") StatusScreenData failedData) {
        return new TransactionStatusResponse(status, challengeData, finishedData, failedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionStatusResponse)) {
            return false;
        }
        TransactionStatusResponse transactionStatusResponse = (TransactionStatusResponse) other;
        return this.status == transactionStatusResponse.status && jl40.l(this.challengeData, transactionStatusResponse.challengeData) && jl40.l(this.finishedData, transactionStatusResponse.finishedData) && jl40.l(this.failedData, transactionStatusResponse.failedData);
    }

    public final SplitDepositPaymentChallengeData getChallengeData() {
        return this.challengeData;
    }

    public final StatusScreenData getFailedData() {
        return this.failedData;
    }

    public final StatusScreenData getFinishedData() {
        return this.finishedData;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        SplitDepositPaymentChallengeData splitDepositPaymentChallengeData = this.challengeData;
        int hashCode2 = (hashCode + (splitDepositPaymentChallengeData == null ? 0 : splitDepositPaymentChallengeData.hashCode())) * 31;
        StatusScreenData statusScreenData = this.finishedData;
        int hashCode3 = (hashCode2 + (statusScreenData == null ? 0 : statusScreenData.hashCode())) * 31;
        StatusScreenData statusScreenData2 = this.failedData;
        return hashCode3 + (statusScreenData2 != null ? statusScreenData2.hashCode() : 0);
    }

    public String toString() {
        return "TransactionStatusResponse(status=" + this.status + ", challengeData=" + this.challengeData + ", finishedData=" + this.finishedData + ", failedData=" + this.failedData + Extension.C_BRAKE;
    }
}
