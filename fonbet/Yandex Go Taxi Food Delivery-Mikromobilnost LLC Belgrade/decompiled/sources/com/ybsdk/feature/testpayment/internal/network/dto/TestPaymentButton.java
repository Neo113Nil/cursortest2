package com.ybsdk.feature.testpayment.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButton;", "", "type", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButtonType;", "title", "", "action", "<init>", "(Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButtonType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentButtonType;", "getTitle", "()Ljava/lang/String;", "getAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TestPaymentButton {
    private final String action;
    private final String title;
    private final TestPaymentButtonType type;

    public TestPaymentButton(@Json(name = "type") TestPaymentButtonType testPaymentButtonType, @Json(name = "title") String str, @Json(name = "action") String str2) {
        this.type = testPaymentButtonType;
        this.title = str;
        this.action = str2;
    }

    public static /* synthetic */ TestPaymentButton copy$default(TestPaymentButton testPaymentButton, TestPaymentButtonType testPaymentButtonType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            testPaymentButtonType = testPaymentButton.type;
        }
        if ((i & 2) != 0) {
            str = testPaymentButton.title;
        }
        if ((i & 4) != 0) {
            str2 = testPaymentButton.action;
        }
        return testPaymentButton.copy(testPaymentButtonType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TestPaymentButtonType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final TestPaymentButton copy(@Json(name = "type") TestPaymentButtonType type, @Json(name = "title") String title, @Json(name = "action") String action) {
        return new TestPaymentButton(type, title, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestPaymentButton)) {
            return false;
        }
        TestPaymentButton testPaymentButton = (TestPaymentButton) other;
        return this.type == testPaymentButton.type && jl40.l(this.title, testPaymentButton.title) && jl40.l(this.action, testPaymentButton.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TestPaymentButtonType getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(this.type.hashCode() * 31, 31, this.title);
        String str = this.action;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        TestPaymentButtonType testPaymentButtonType = this.type;
        String str = this.title;
        String str2 = this.action;
        StringBuilder sb = new StringBuilder("TestPaymentButton(type=");
        sb.append(testPaymentButtonType);
        sb.append(", title=");
        sb.append(str);
        sb.append(", action=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
