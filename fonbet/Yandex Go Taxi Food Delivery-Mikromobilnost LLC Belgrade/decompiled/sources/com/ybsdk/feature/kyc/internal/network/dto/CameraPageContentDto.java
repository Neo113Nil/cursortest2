package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentDto;", "", "documentType", "", "title", "tipText", "uploadErrorText", "cameraLens", "infoDeeplink", "tipImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "backButtonDeeplink", "enterPageDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentType", "()Ljava/lang/String;", "getTitle", "getTipText", "getUploadErrorText", "getCameraLens", "getInfoDeeplink", "getTipImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getBackButtonDeeplink", "getEnterPageDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CameraPageContentDto {
    private final String backButtonDeeplink;
    private final String cameraLens;
    private final String documentType;
    private final String enterPageDeeplink;
    private final String infoDeeplink;
    private final ThemedParameter<String> tipImage;
    private final String tipText;
    private final String title;
    private final String uploadErrorText;

    public CameraPageContentDto(@Json(name = "document_type") String str, @Json(name = "title") String str2, @Json(name = "tip_text") String str3, @Json(name = "upload_error_text") String str4, @Json(name = "camera_lens") String str5, @Json(name = "info_bottom_sheet_deeplink") String str6, @Json(name = "tip_image") ThemedParameter<String> themedParameter, @Json(name = "back_button_deeplink") String str7, @Json(name = "enter_page_deeplink") String str8) {
        this.documentType = str;
        this.title = str2;
        this.tipText = str3;
        this.uploadErrorText = str4;
        this.cameraLens = str5;
        this.infoDeeplink = str6;
        this.tipImage = themedParameter;
        this.backButtonDeeplink = str7;
        this.enterPageDeeplink = str8;
    }

    public static /* synthetic */ CameraPageContentDto copy$default(CameraPageContentDto cameraPageContentDto, String str, String str2, String str3, String str4, String str5, String str6, ThemedParameter themedParameter, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraPageContentDto.documentType;
        }
        if ((i & 2) != 0) {
            str2 = cameraPageContentDto.title;
        }
        if ((i & 4) != 0) {
            str3 = cameraPageContentDto.tipText;
        }
        if ((i & 8) != 0) {
            str4 = cameraPageContentDto.uploadErrorText;
        }
        if ((i & 16) != 0) {
            str5 = cameraPageContentDto.cameraLens;
        }
        if ((i & 32) != 0) {
            str6 = cameraPageContentDto.infoDeeplink;
        }
        if ((i & 64) != 0) {
            themedParameter = cameraPageContentDto.tipImage;
        }
        if ((i & 128) != 0) {
            str7 = cameraPageContentDto.backButtonDeeplink;
        }
        if ((i & 256) != 0) {
            str8 = cameraPageContentDto.enterPageDeeplink;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        ThemedParameter themedParameter2 = themedParameter;
        String str12 = str5;
        String str13 = str3;
        return cameraPageContentDto.copy(str, str2, str13, str4, str12, str11, themedParameter2, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTipText() {
        return this.tipText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUploadErrorText() {
        return this.uploadErrorText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCameraLens() {
        return this.cameraLens;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInfoDeeplink() {
        return this.infoDeeplink;
    }

    public final ThemedParameter<String> component7() {
        return this.tipImage;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBackButtonDeeplink() {
        return this.backButtonDeeplink;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEnterPageDeeplink() {
        return this.enterPageDeeplink;
    }

    public final CameraPageContentDto copy(@Json(name = "document_type") String documentType, @Json(name = "title") String title, @Json(name = "tip_text") String tipText, @Json(name = "upload_error_text") String uploadErrorText, @Json(name = "camera_lens") String cameraLens, @Json(name = "info_bottom_sheet_deeplink") String infoDeeplink, @Json(name = "tip_image") ThemedParameter<String> tipImage, @Json(name = "back_button_deeplink") String backButtonDeeplink, @Json(name = "enter_page_deeplink") String enterPageDeeplink) {
        return new CameraPageContentDto(documentType, title, tipText, uploadErrorText, cameraLens, infoDeeplink, tipImage, backButtonDeeplink, enterPageDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraPageContentDto)) {
            return false;
        }
        CameraPageContentDto cameraPageContentDto = (CameraPageContentDto) other;
        return jl40.l(this.documentType, cameraPageContentDto.documentType) && jl40.l(this.title, cameraPageContentDto.title) && jl40.l(this.tipText, cameraPageContentDto.tipText) && jl40.l(this.uploadErrorText, cameraPageContentDto.uploadErrorText) && jl40.l(this.cameraLens, cameraPageContentDto.cameraLens) && jl40.l(this.infoDeeplink, cameraPageContentDto.infoDeeplink) && jl40.l(this.tipImage, cameraPageContentDto.tipImage) && jl40.l(this.backButtonDeeplink, cameraPageContentDto.backButtonDeeplink) && jl40.l(this.enterPageDeeplink, cameraPageContentDto.enterPageDeeplink);
    }

    public final String getBackButtonDeeplink() {
        return this.backButtonDeeplink;
    }

    public final String getCameraLens() {
        return this.cameraLens;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getEnterPageDeeplink() {
        return this.enterPageDeeplink;
    }

    public final String getInfoDeeplink() {
        return this.infoDeeplink;
    }

    public final ThemedParameter<String> getTipImage() {
        return this.tipImage;
    }

    public final String getTipText() {
        return this.tipText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUploadErrorText() {
        return this.uploadErrorText;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.documentType.hashCode() * 31, 31, this.title), 31, this.tipText), 31, this.uploadErrorText), 31, this.cameraLens);
        String str = this.infoDeeplink;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.tipImage;
        int b2 = unr0.b((hashCode + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31, 31, this.backButtonDeeplink);
        String str2 = this.enterPageDeeplink;
        return b2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.documentType;
        String str2 = this.title;
        String str3 = this.tipText;
        String str4 = this.uploadErrorText;
        String str5 = this.cameraLens;
        String str6 = this.infoDeeplink;
        ThemedParameter<String> themedParameter = this.tipImage;
        String str7 = this.backButtonDeeplink;
        String str8 = this.enterPageDeeplink;
        StringBuilder v = b64.v("CameraPageContentDto(documentType=", str, ", title=", str2, ", tipText=");
        g8e.D(v, str3, ", uploadErrorText=", str4, ", cameraLens=");
        g8e.D(v, str5, ", infoDeeplink=", str6, ", tipImage=");
        v.append(themedParameter);
        v.append(", backButtonDeeplink=");
        v.append(str7);
        v.append(", enterPageDeeplink=");
        return oyr.t(v, str8, Extension.C_BRAKE);
    }
}
