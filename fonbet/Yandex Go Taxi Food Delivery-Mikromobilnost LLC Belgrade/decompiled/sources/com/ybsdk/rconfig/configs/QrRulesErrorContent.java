package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.b64;
import defpackage.cbg0;
import defpackage.ccv;
import defpackage.dzh0;
import defpackage.fob1;
import defpackage.idg0;
import defpackage.jl40;
import defpackage.nbv;
import defpackage.nyg0;
import defpackage.oyr;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.rev;
import defpackage.unr0;
import defpackage.vfv;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrRulesErrorContent;", "", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/rconfig/model/ThemedImage;", "image", "buttonTitle", "buttonAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;)V", "Lidg0;", "toEntity", "()Lidg0;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/QrRulesErrorContent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/ybsdk/rconfig/model/ThemedImage;", "getImage", "getButtonTitle", "getButtonAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrRulesErrorContent {

    @Json(name = "button_action")
    private final String buttonAction;

    @Json(name = "button_title")
    private final String buttonTitle;

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    private final String description;

    @Json(name = "image")
    private final ThemedImage image;

    @Json(name = "title")
    private final String title;

    public QrRulesErrorContent(String str, String str2, ThemedImage themedImage, String str3, String str4) {
        this.title = str;
        this.description = str2;
        this.image = themedImage;
        this.buttonTitle = str3;
        this.buttonAction = str4;
    }

    public static /* synthetic */ QrRulesErrorContent copy$default(QrRulesErrorContent qrRulesErrorContent, String str, String str2, ThemedImage themedImage, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrRulesErrorContent.title;
        }
        if ((i & 2) != 0) {
            str2 = qrRulesErrorContent.description;
        }
        if ((i & 4) != 0) {
            themedImage = qrRulesErrorContent.image;
        }
        if ((i & 8) != 0) {
            str3 = qrRulesErrorContent.buttonTitle;
        }
        if ((i & 16) != 0) {
            str4 = qrRulesErrorContent.buttonAction;
        }
        String str5 = str4;
        ThemedImage themedImage2 = themedImage;
        return qrRulesErrorContent.copy(str, str2, themedImage2, str3, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv toEntity$lambda$0(String str) {
        return new pbv(str, new ccv(nyg0.ybsdk_ic_error_icon), rev.f, new ccv(nyg0.ybsdk_ic_error_icon), (vfv) null, 48);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImage getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final QrRulesErrorContent copy(String title, String description, ThemedImage image, String buttonTitle, String buttonAction) {
        return new QrRulesErrorContent(title, description, image, buttonTitle, buttonAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrRulesErrorContent)) {
            return false;
        }
        QrRulesErrorContent qrRulesErrorContent = (QrRulesErrorContent) other;
        return jl40.l(this.title, qrRulesErrorContent.title) && jl40.l(this.description, qrRulesErrorContent.description) && jl40.l(this.image, qrRulesErrorContent.image) && jl40.l(this.buttonTitle, qrRulesErrorContent.buttonTitle) && jl40.l(this.buttonAction, qrRulesErrorContent.buttonAction);
    }

    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ThemedImage getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemedImage themedImage = this.image;
        int hashCode3 = (hashCode2 + (themedImage == null ? 0 : themedImage.hashCode())) * 31;
        String str3 = this.buttonTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonAction;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final idg0 toEntity() {
        ThemedImage themedImage = this.image;
        String light = themedImage != null ? themedImage.getLight() : null;
        ThemedImage themedImage2 = this.image;
        rbv c = fob1.c(light, themedImage2 != null ? themedImage2.getDark() : null, new cbg0(9));
        if (c == null) {
            c = new nbv(nyg0.ybsdk_ic_error_icon);
        }
        String str = this.title;
        Text constant = str != null ? new Text.Constant(str) : unr0.h(Text.Companion, dzh0.ybsdk_common_error_layout_title);
        String str2 = this.description;
        Text.Constant constant2 = str2 != null ? new Text.Constant(str2) : null;
        String str3 = this.buttonTitle;
        return new idg0(c, constant, constant2, str3 != null ? new Text.Constant(str3) : unr0.h(Text.Companion, dzh0.ybsdk_common_error_retry));
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ThemedImage themedImage = this.image;
        String str3 = this.buttonTitle;
        String str4 = this.buttonAction;
        StringBuilder v = b64.v("QrRulesErrorContent(title=", str, ", description=", str2, ", image=");
        v.append(themedImage);
        v.append(", buttonTitle=");
        v.append(str3);
        v.append(", buttonAction=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
