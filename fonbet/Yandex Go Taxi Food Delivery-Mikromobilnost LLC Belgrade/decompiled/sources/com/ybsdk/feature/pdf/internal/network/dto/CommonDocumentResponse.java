package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentResponse;", "", "url", "", "buttonsGroup", "Lcom/ybsdk/feature/pdf/internal/network/dto/ButtonsGroup;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/ButtonsGroup;)V", "getUrl", "()Ljava/lang/String;", "getButtonsGroup", "()Lcom/ybsdk/feature/pdf/internal/network/dto/ButtonsGroup;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonDocumentResponse {
    private final ButtonsGroup buttonsGroup;
    private final String url;

    public CommonDocumentResponse(@Json(name = "url") String str, @Json(name = "buttons_group") ButtonsGroup buttonsGroup) {
        this.url = str;
        this.buttonsGroup = buttonsGroup;
    }

    public static /* synthetic */ CommonDocumentResponse copy$default(CommonDocumentResponse commonDocumentResponse, String str, ButtonsGroup buttonsGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonDocumentResponse.url;
        }
        if ((i & 2) != 0) {
            buttonsGroup = commonDocumentResponse.buttonsGroup;
        }
        return commonDocumentResponse.copy(str, buttonsGroup);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonsGroup getButtonsGroup() {
        return this.buttonsGroup;
    }

    public final CommonDocumentResponse copy(@Json(name = "url") String url, @Json(name = "buttons_group") ButtonsGroup buttonsGroup) {
        return new CommonDocumentResponse(url, buttonsGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonDocumentResponse)) {
            return false;
        }
        CommonDocumentResponse commonDocumentResponse = (CommonDocumentResponse) other;
        return jl40.l(this.url, commonDocumentResponse.url) && jl40.l(this.buttonsGroup, commonDocumentResponse.buttonsGroup);
    }

    public final ButtonsGroup getButtonsGroup() {
        return this.buttonsGroup;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        ButtonsGroup buttonsGroup = this.buttonsGroup;
        return hashCode + (buttonsGroup == null ? 0 : buttonsGroup.hashCode());
    }

    public String toString() {
        return "CommonDocumentResponse(url=" + this.url + ", buttonsGroup=" + this.buttonsGroup + Extension.C_BRAKE;
    }
}
