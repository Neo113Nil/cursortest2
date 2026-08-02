package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseData;", "", "memberImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "title", "subtitle", "requestId", "timeoutData", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;)V", "getMemberImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getRequestId", "getTimeoutData", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestPaymentResponseData {
    private final Themes<String> memberImage;
    private final String requestId;
    private final String subtitle;
    private final TestPaymentStatusFailedData timeoutData;
    private final String title;

    public TestPaymentResponseData(@Json(name = "JSON_FIELD_MEMBER_IMAGE") Themes<String> themes, @Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "request_id") String str3, @Json(name = "timeout_data") TestPaymentStatusFailedData testPaymentStatusFailedData) {
        this.memberImage = themes;
        this.title = str;
        this.subtitle = str2;
        this.requestId = str3;
        this.timeoutData = testPaymentStatusFailedData;
    }

    public static /* synthetic */ TestPaymentResponseData copy$default(TestPaymentResponseData testPaymentResponseData, Themes themes, String str, String str2, String str3, TestPaymentStatusFailedData testPaymentStatusFailedData, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = testPaymentResponseData.memberImage;
        }
        if ((i & 2) != 0) {
            str = testPaymentResponseData.title;
        }
        if ((i & 4) != 0) {
            str2 = testPaymentResponseData.subtitle;
        }
        if ((i & 8) != 0) {
            str3 = testPaymentResponseData.requestId;
        }
        if ((i & 16) != 0) {
            testPaymentStatusFailedData = testPaymentResponseData.timeoutData;
        }
        TestPaymentStatusFailedData testPaymentStatusFailedData2 = testPaymentStatusFailedData;
        String str4 = str2;
        return testPaymentResponseData.copy(themes, str, str4, str3, testPaymentStatusFailedData2);
    }

    public final Themes<String> component1() {
        return this.memberImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component5, reason: from getter */
    public final TestPaymentStatusFailedData getTimeoutData() {
        return this.timeoutData;
    }

    public final TestPaymentResponseData copy(@Json(name = "JSON_FIELD_MEMBER_IMAGE") Themes<String> memberImage, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "request_id") String requestId, @Json(name = "timeout_data") TestPaymentStatusFailedData timeoutData) {
        return new TestPaymentResponseData(memberImage, title, subtitle, requestId, timeoutData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestPaymentResponseData)) {
            return false;
        }
        TestPaymentResponseData testPaymentResponseData = (TestPaymentResponseData) other;
        return jl40.l(this.memberImage, testPaymentResponseData.memberImage) && jl40.l(this.title, testPaymentResponseData.title) && jl40.l(this.subtitle, testPaymentResponseData.subtitle) && jl40.l(this.requestId, testPaymentResponseData.requestId) && jl40.l(this.timeoutData, testPaymentResponseData.timeoutData);
    }

    public final Themes<String> getMemberImage() {
        return this.memberImage;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TestPaymentStatusFailedData getTimeoutData() {
        return this.timeoutData;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.timeoutData.hashCode() + unr0.b(unr0.b(unr0.b(this.memberImage.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.requestId);
    }

    public String toString() {
        Themes<String> themes = this.memberImage;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.requestId;
        TestPaymentStatusFailedData testPaymentStatusFailedData = this.timeoutData;
        StringBuilder sb = new StringBuilder("TestPaymentResponseData(memberImage=");
        sb.append(themes);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        g8e.D(sb, str2, ", requestId=", str3, ", timeoutData=");
        sb.append(testPaymentStatusFailedData);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
