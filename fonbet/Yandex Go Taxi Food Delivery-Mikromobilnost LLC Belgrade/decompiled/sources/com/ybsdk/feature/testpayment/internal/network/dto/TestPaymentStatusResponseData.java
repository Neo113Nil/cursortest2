package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseData;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatus;", "successData", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusSuccessData;", "inProgressData", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusInProgressData;", "failedData", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "<init>", "(Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatus;Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusSuccessData;Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusInProgressData;Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;)V", "getStatus", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatus;", "getSuccessData", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusSuccessData;", "getInProgressData", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusInProgressData;", "getFailedData", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestPaymentStatusResponseData {
    private final TestPaymentStatusFailedData failedData;
    private final TestPaymentStatusInProgressData inProgressData;
    private final TestPaymentStatus status;
    private final TestPaymentStatusSuccessData successData;

    public TestPaymentStatusResponseData(@Json(name = "status") TestPaymentStatus testPaymentStatus, @Json(name = "success_data") TestPaymentStatusSuccessData testPaymentStatusSuccessData, @Json(name = "in_progress_data") TestPaymentStatusInProgressData testPaymentStatusInProgressData, @Json(name = "failed_data") TestPaymentStatusFailedData testPaymentStatusFailedData) {
        this.status = testPaymentStatus;
        this.successData = testPaymentStatusSuccessData;
        this.inProgressData = testPaymentStatusInProgressData;
        this.failedData = testPaymentStatusFailedData;
    }

    public static /* synthetic */ TestPaymentStatusResponseData copy$default(TestPaymentStatusResponseData testPaymentStatusResponseData, TestPaymentStatus testPaymentStatus, TestPaymentStatusSuccessData testPaymentStatusSuccessData, TestPaymentStatusInProgressData testPaymentStatusInProgressData, TestPaymentStatusFailedData testPaymentStatusFailedData, int i, Object obj) {
        if ((i & 1) != 0) {
            testPaymentStatus = testPaymentStatusResponseData.status;
        }
        if ((i & 2) != 0) {
            testPaymentStatusSuccessData = testPaymentStatusResponseData.successData;
        }
        if ((i & 4) != 0) {
            testPaymentStatusInProgressData = testPaymentStatusResponseData.inProgressData;
        }
        if ((i & 8) != 0) {
            testPaymentStatusFailedData = testPaymentStatusResponseData.failedData;
        }
        return testPaymentStatusResponseData.copy(testPaymentStatus, testPaymentStatusSuccessData, testPaymentStatusInProgressData, testPaymentStatusFailedData);
    }

    /* renamed from: component1, reason: from getter */
    public final TestPaymentStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final TestPaymentStatusSuccessData getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final TestPaymentStatusInProgressData getInProgressData() {
        return this.inProgressData;
    }

    /* renamed from: component4, reason: from getter */
    public final TestPaymentStatusFailedData getFailedData() {
        return this.failedData;
    }

    public final TestPaymentStatusResponseData copy(@Json(name = "status") TestPaymentStatus status, @Json(name = "success_data") TestPaymentStatusSuccessData successData, @Json(name = "in_progress_data") TestPaymentStatusInProgressData inProgressData, @Json(name = "failed_data") TestPaymentStatusFailedData failedData) {
        return new TestPaymentStatusResponseData(status, successData, inProgressData, failedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestPaymentStatusResponseData)) {
            return false;
        }
        TestPaymentStatusResponseData testPaymentStatusResponseData = (TestPaymentStatusResponseData) other;
        return this.status == testPaymentStatusResponseData.status && jl40.l(this.successData, testPaymentStatusResponseData.successData) && jl40.l(this.inProgressData, testPaymentStatusResponseData.inProgressData) && jl40.l(this.failedData, testPaymentStatusResponseData.failedData);
    }

    public final TestPaymentStatusFailedData getFailedData() {
        return this.failedData;
    }

    public final TestPaymentStatusInProgressData getInProgressData() {
        return this.inProgressData;
    }

    public final TestPaymentStatus getStatus() {
        return this.status;
    }

    public final TestPaymentStatusSuccessData getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        TestPaymentStatusSuccessData testPaymentStatusSuccessData = this.successData;
        int hashCode2 = (hashCode + (testPaymentStatusSuccessData == null ? 0 : testPaymentStatusSuccessData.hashCode())) * 31;
        TestPaymentStatusInProgressData testPaymentStatusInProgressData = this.inProgressData;
        int hashCode3 = (hashCode2 + (testPaymentStatusInProgressData == null ? 0 : testPaymentStatusInProgressData.hashCode())) * 31;
        TestPaymentStatusFailedData testPaymentStatusFailedData = this.failedData;
        return hashCode3 + (testPaymentStatusFailedData != null ? testPaymentStatusFailedData.hashCode() : 0);
    }

    public String toString() {
        return "TestPaymentStatusResponseData(status=" + this.status + ", successData=" + this.successData + ", inProgressData=" + this.inProgressData + ", failedData=" + this.failedData + Extension.C_BRAKE;
    }
}
