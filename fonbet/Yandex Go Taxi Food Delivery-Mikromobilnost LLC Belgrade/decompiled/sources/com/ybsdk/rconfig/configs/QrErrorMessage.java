package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.rconfig.model.ThemedImage;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ybsdk/rconfig/configs/QrErrorMessage;", "", "categories", "", "", "errorTitle", "errorDescription", "image", "Lcom/ybsdk/rconfig/model/ThemedImage;", "buttonTitle", "buttonAction", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/rconfig/model/ThemedImage;Ljava/lang/String;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getErrorTitle", "()Ljava/lang/String;", "getErrorDescription", "getImage", "()Lcom/ybsdk/rconfig/model/ThemedImage;", "getButtonTitle", "getButtonAction", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class QrErrorMessage {

    @Json(name = "button_action")
    private final String buttonAction;

    @Json(name = "button_title")
    private final String buttonTitle;

    @Json(name = "categories")
    private final List<String> categories;

    @Json(name = "error_description")
    private final String errorDescription;

    @Json(name = "error_title")
    private final String errorTitle;

    @Json(name = "image")
    private final ThemedImage image;

    public QrErrorMessage(List<String> list, String str, String str2, ThemedImage themedImage, String str3, String str4) {
        this.categories = list;
        this.errorTitle = str;
        this.errorDescription = str2;
        this.image = themedImage;
        this.buttonTitle = str3;
        this.buttonAction = str4;
    }

    public static /* synthetic */ QrErrorMessage copy$default(QrErrorMessage qrErrorMessage, List list, String str, String str2, ThemedImage themedImage, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qrErrorMessage.categories;
        }
        if ((i & 2) != 0) {
            str = qrErrorMessage.errorTitle;
        }
        if ((i & 4) != 0) {
            str2 = qrErrorMessage.errorDescription;
        }
        if ((i & 8) != 0) {
            themedImage = qrErrorMessage.image;
        }
        if ((i & 16) != 0) {
            str3 = qrErrorMessage.buttonTitle;
        }
        if ((i & 32) != 0) {
            str4 = qrErrorMessage.buttonAction;
        }
        String str5 = str3;
        String str6 = str4;
        return qrErrorMessage.copy(list, str, str2, themedImage, str5, str6);
    }

    public final List<String> component1() {
        return this.categories;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImage getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final QrErrorMessage copy(List<String> categories, String errorTitle, String errorDescription, ThemedImage image, String buttonTitle, String buttonAction) {
        return new QrErrorMessage(categories, errorTitle, errorDescription, image, buttonTitle, buttonAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrErrorMessage)) {
            return false;
        }
        QrErrorMessage qrErrorMessage = (QrErrorMessage) other;
        return jl40.l(this.categories, qrErrorMessage.categories) && jl40.l(this.errorTitle, qrErrorMessage.errorTitle) && jl40.l(this.errorDescription, qrErrorMessage.errorDescription) && jl40.l(this.image, qrErrorMessage.image) && jl40.l(this.buttonTitle, qrErrorMessage.buttonTitle) && jl40.l(this.buttonAction, qrErrorMessage.buttonAction);
    }

    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public final ThemedImage getImage() {
        return this.image;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.categories.hashCode() * 31, 31, this.errorTitle), 31, this.errorDescription);
        ThemedImage themedImage = this.image;
        int hashCode = (b + (themedImage == null ? 0 : themedImage.hashCode())) * 31;
        String str = this.buttonTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonAction;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.categories;
        String str = this.errorTitle;
        String str2 = this.errorDescription;
        ThemedImage themedImage = this.image;
        String str3 = this.buttonTitle;
        String str4 = this.buttonAction;
        StringBuilder s = xvz.s("QrErrorMessage(categories=", list, ", errorTitle=", str, ", errorDescription=");
        s.append(str2);
        s.append(", image=");
        s.append(themedImage);
        s.append(", buttonTitle=");
        return g8e.r(s, str3, ", buttonAction=", str4, Extension.C_BRAKE);
    }
}
