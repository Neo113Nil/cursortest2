package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusFailedData;", "", "memberImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "title", "subtitle", "primaryButton", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButton;", "secondaryButton", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButton;Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButton;)V", "getMemberImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryButton", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButton;", "getSecondaryButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestPaymentStatusFailedData {
    private final Themes<String> memberImage;
    private final TestPaymentButton primaryButton;
    private final TestPaymentButton secondaryButton;
    private final String subtitle;
    private final String title;

    public TestPaymentStatusFailedData(@Json(name = "JSON_FIELD_MEMBER_IMAGE") Themes<String> themes, @Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "primary_button") TestPaymentButton testPaymentButton, @Json(name = "secondary_button") TestPaymentButton testPaymentButton2) {
        this.memberImage = themes;
        this.title = str;
        this.subtitle = str2;
        this.primaryButton = testPaymentButton;
        this.secondaryButton = testPaymentButton2;
    }

    public static /* synthetic */ TestPaymentStatusFailedData copy$default(TestPaymentStatusFailedData testPaymentStatusFailedData, Themes themes, String str, String str2, TestPaymentButton testPaymentButton, TestPaymentButton testPaymentButton2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = testPaymentStatusFailedData.memberImage;
        }
        if ((i & 2) != 0) {
            str = testPaymentStatusFailedData.title;
        }
        if ((i & 4) != 0) {
            str2 = testPaymentStatusFailedData.subtitle;
        }
        if ((i & 8) != 0) {
            testPaymentButton = testPaymentStatusFailedData.primaryButton;
        }
        if ((i & 16) != 0) {
            testPaymentButton2 = testPaymentStatusFailedData.secondaryButton;
        }
        TestPaymentButton testPaymentButton3 = testPaymentButton2;
        String str3 = str2;
        return testPaymentStatusFailedData.copy(themes, str, str3, testPaymentButton, testPaymentButton3);
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
    public final TestPaymentButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TestPaymentButton getSecondaryButton() {
        return this.secondaryButton;
    }

    public final TestPaymentStatusFailedData copy(@Json(name = "JSON_FIELD_MEMBER_IMAGE") Themes<String> memberImage, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "primary_button") TestPaymentButton primaryButton, @Json(name = "secondary_button") TestPaymentButton secondaryButton) {
        return new TestPaymentStatusFailedData(memberImage, title, subtitle, primaryButton, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestPaymentStatusFailedData)) {
            return false;
        }
        TestPaymentStatusFailedData testPaymentStatusFailedData = (TestPaymentStatusFailedData) other;
        return jl40.l(this.memberImage, testPaymentStatusFailedData.memberImage) && jl40.l(this.title, testPaymentStatusFailedData.title) && jl40.l(this.subtitle, testPaymentStatusFailedData.subtitle) && jl40.l(this.primaryButton, testPaymentStatusFailedData.primaryButton) && jl40.l(this.secondaryButton, testPaymentStatusFailedData.secondaryButton);
    }

    public final Themes<String> getMemberImage() {
        return this.memberImage;
    }

    public final TestPaymentButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final TestPaymentButton getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.primaryButton.hashCode() + unr0.b(unr0.b(this.memberImage.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31;
        TestPaymentButton testPaymentButton = this.secondaryButton;
        return hashCode + (testPaymentButton == null ? 0 : testPaymentButton.hashCode());
    }

    public String toString() {
        return "TestPaymentStatusFailedData(memberImage=" + this.memberImage + ", title=" + this.title + ", subtitle=" + this.subtitle + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + Extension.C_BRAKE;
    }
}
