package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/ybsdk/rconfig/configs/KycOnlinePhotoImagesConfig;", "", "Lcom/ybsdk/rconfig/model/ThemedImage;", "selfieBottomSheetImage", "mandatoryGeoDeadend", "mandatoryGeoExplanation", "guideMainPageLeft", "guideMainPageRight", "guideSelfie", "<init>", "(Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;)V", "component1", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;Lcom/ybsdk/rconfig/model/ThemedImage;)Lcom/ybsdk/rconfig/configs/KycOnlinePhotoImagesConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/model/ThemedImage;", "getSelfieBottomSheetImage", "getMandatoryGeoDeadend", "getMandatoryGeoExplanation", "getGuideMainPageLeft", "getGuideMainPageRight", "getGuideSelfie", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KycOnlinePhotoImagesConfig {

    @Json(name = "guide_main_page_left")
    private final ThemedImage guideMainPageLeft;

    @Json(name = "guide_main_page_right")
    private final ThemedImage guideMainPageRight;

    @Json(name = "guide_selfie")
    private final ThemedImage guideSelfie;

    @Json(name = "mandatory_geo_deadend")
    private final ThemedImage mandatoryGeoDeadend;

    @Json(name = "mandatory_geo_explanation")
    private final ThemedImage mandatoryGeoExplanation;

    @Json(name = "overlay_message_selfie_image")
    private final ThemedImage selfieBottomSheetImage;

    public KycOnlinePhotoImagesConfig(ThemedImage themedImage, ThemedImage themedImage2, ThemedImage themedImage3, ThemedImage themedImage4, ThemedImage themedImage5, ThemedImage themedImage6) {
        this.selfieBottomSheetImage = themedImage;
        this.mandatoryGeoDeadend = themedImage2;
        this.mandatoryGeoExplanation = themedImage3;
        this.guideMainPageLeft = themedImage4;
        this.guideMainPageRight = themedImage5;
        this.guideSelfie = themedImage6;
    }

    public static /* synthetic */ KycOnlinePhotoImagesConfig copy$default(KycOnlinePhotoImagesConfig kycOnlinePhotoImagesConfig, ThemedImage themedImage, ThemedImage themedImage2, ThemedImage themedImage3, ThemedImage themedImage4, ThemedImage themedImage5, ThemedImage themedImage6, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImage = kycOnlinePhotoImagesConfig.selfieBottomSheetImage;
        }
        if ((i & 2) != 0) {
            themedImage2 = kycOnlinePhotoImagesConfig.mandatoryGeoDeadend;
        }
        if ((i & 4) != 0) {
            themedImage3 = kycOnlinePhotoImagesConfig.mandatoryGeoExplanation;
        }
        if ((i & 8) != 0) {
            themedImage4 = kycOnlinePhotoImagesConfig.guideMainPageLeft;
        }
        if ((i & 16) != 0) {
            themedImage5 = kycOnlinePhotoImagesConfig.guideMainPageRight;
        }
        if ((i & 32) != 0) {
            themedImage6 = kycOnlinePhotoImagesConfig.guideSelfie;
        }
        ThemedImage themedImage7 = themedImage5;
        ThemedImage themedImage8 = themedImage6;
        return kycOnlinePhotoImagesConfig.copy(themedImage, themedImage2, themedImage3, themedImage4, themedImage7, themedImage8);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImage getSelfieBottomSheetImage() {
        return this.selfieBottomSheetImage;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImage getMandatoryGeoDeadend() {
        return this.mandatoryGeoDeadend;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImage getMandatoryGeoExplanation() {
        return this.mandatoryGeoExplanation;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImage getGuideMainPageLeft() {
        return this.guideMainPageLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final ThemedImage getGuideMainPageRight() {
        return this.guideMainPageRight;
    }

    /* renamed from: component6, reason: from getter */
    public final ThemedImage getGuideSelfie() {
        return this.guideSelfie;
    }

    public final KycOnlinePhotoImagesConfig copy(ThemedImage selfieBottomSheetImage, ThemedImage mandatoryGeoDeadend, ThemedImage mandatoryGeoExplanation, ThemedImage guideMainPageLeft, ThemedImage guideMainPageRight, ThemedImage guideSelfie) {
        return new KycOnlinePhotoImagesConfig(selfieBottomSheetImage, mandatoryGeoDeadend, mandatoryGeoExplanation, guideMainPageLeft, guideMainPageRight, guideSelfie);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycOnlinePhotoImagesConfig)) {
            return false;
        }
        KycOnlinePhotoImagesConfig kycOnlinePhotoImagesConfig = (KycOnlinePhotoImagesConfig) other;
        return jl40.l(this.selfieBottomSheetImage, kycOnlinePhotoImagesConfig.selfieBottomSheetImage) && jl40.l(this.mandatoryGeoDeadend, kycOnlinePhotoImagesConfig.mandatoryGeoDeadend) && jl40.l(this.mandatoryGeoExplanation, kycOnlinePhotoImagesConfig.mandatoryGeoExplanation) && jl40.l(this.guideMainPageLeft, kycOnlinePhotoImagesConfig.guideMainPageLeft) && jl40.l(this.guideMainPageRight, kycOnlinePhotoImagesConfig.guideMainPageRight) && jl40.l(this.guideSelfie, kycOnlinePhotoImagesConfig.guideSelfie);
    }

    public final ThemedImage getGuideMainPageLeft() {
        return this.guideMainPageLeft;
    }

    public final ThemedImage getGuideMainPageRight() {
        return this.guideMainPageRight;
    }

    public final ThemedImage getGuideSelfie() {
        return this.guideSelfie;
    }

    public final ThemedImage getMandatoryGeoDeadend() {
        return this.mandatoryGeoDeadend;
    }

    public final ThemedImage getMandatoryGeoExplanation() {
        return this.mandatoryGeoExplanation;
    }

    public final ThemedImage getSelfieBottomSheetImage() {
        return this.selfieBottomSheetImage;
    }

    public int hashCode() {
        ThemedImage themedImage = this.selfieBottomSheetImage;
        int hashCode = (themedImage == null ? 0 : themedImage.hashCode()) * 31;
        ThemedImage themedImage2 = this.mandatoryGeoDeadend;
        int hashCode2 = (hashCode + (themedImage2 == null ? 0 : themedImage2.hashCode())) * 31;
        ThemedImage themedImage3 = this.mandatoryGeoExplanation;
        int hashCode3 = (hashCode2 + (themedImage3 == null ? 0 : themedImage3.hashCode())) * 31;
        ThemedImage themedImage4 = this.guideMainPageLeft;
        int hashCode4 = (hashCode3 + (themedImage4 == null ? 0 : themedImage4.hashCode())) * 31;
        ThemedImage themedImage5 = this.guideMainPageRight;
        int hashCode5 = (hashCode4 + (themedImage5 == null ? 0 : themedImage5.hashCode())) * 31;
        ThemedImage themedImage6 = this.guideSelfie;
        return hashCode5 + (themedImage6 != null ? themedImage6.hashCode() : 0);
    }

    public String toString() {
        return "KycOnlinePhotoImagesConfig(selfieBottomSheetImage=" + this.selfieBottomSheetImage + ", mandatoryGeoDeadend=" + this.mandatoryGeoDeadend + ", mandatoryGeoExplanation=" + this.mandatoryGeoExplanation + ", guideMainPageLeft=" + this.guideMainPageLeft + ", guideMainPageRight=" + this.guideMainPageRight + ", guideSelfie=" + this.guideSelfie + Extension.C_BRAKE;
    }
}
