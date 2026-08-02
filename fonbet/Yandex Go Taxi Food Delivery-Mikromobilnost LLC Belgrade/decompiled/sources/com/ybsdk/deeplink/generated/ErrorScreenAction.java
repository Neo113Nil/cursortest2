package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001eR \u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/ybsdk/deeplink/generated/ErrorScreenAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonText", "buttonAction", "hyperlinkText", "hyperlinkAction", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)Lcom/ybsdk/deeplink/generated/ErrorScreenAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getButtonText", "getButtonAction", "getHyperlinkText", "getHyperlinkAction", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrl", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorScreenAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<ErrorScreenAction> CREATOR = new Creator();
    private final String buttonAction;
    private final String buttonText;
    private final Uri deeplinkUri;
    private final String description;
    private final String hyperlinkAction;
    private final String hyperlinkText;
    private final ThemedImageUrlEntity imageUrl;
    private final String title;

    public ErrorScreenAction(String str, String str2, String str3, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity) {
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
        this.buttonAction = str4;
        this.hyperlinkText = str5;
        this.hyperlinkAction = str6;
        this.imageUrl = themedImageUrlEntity;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/error_screen");
        if (str != null) {
            l.appendQueryParameter("title", str);
        }
        if (str2 != null) {
            l.appendQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("button_text", str3);
        }
        if (str4 != null) {
            l.appendQueryParameter("button_action", str4);
        }
        if (str5 != null) {
            l.appendQueryParameter("hyperlink_text", str5);
        }
        if (str6 != null) {
            l.appendQueryParameter("hyperlink_action", str6);
        }
        if (themedImageUrlEntity != null) {
            String lightUrl = themedImageUrlEntity.getLightUrl();
            if (lightUrl != null) {
                l.appendQueryParameter("image_url", lightUrl);
            }
            String darkUrl = themedImageUrlEntity.getDarkUrl();
            if (darkUrl != null) {
                l.appendQueryParameter("image_url_dark", darkUrl);
            }
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ ErrorScreenAction copy$default(ErrorScreenAction errorScreenAction, String str, String str2, String str3, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorScreenAction.title;
        }
        if ((i & 2) != 0) {
            str2 = errorScreenAction.description;
        }
        if ((i & 4) != 0) {
            str3 = errorScreenAction.buttonText;
        }
        if ((i & 8) != 0) {
            str4 = errorScreenAction.buttonAction;
        }
        if ((i & 16) != 0) {
            str5 = errorScreenAction.hyperlinkText;
        }
        if ((i & 32) != 0) {
            str6 = errorScreenAction.hyperlinkAction;
        }
        if ((i & 64) != 0) {
            themedImageUrlEntity = errorScreenAction.imageUrl;
        }
        String str7 = str6;
        ThemedImageUrlEntity themedImageUrlEntity2 = themedImageUrlEntity;
        String str8 = str5;
        String str9 = str3;
        return errorScreenAction.copy(str, str2, str9, str4, str8, str7, themedImageUrlEntity2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
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
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonAction() {
        return this.buttonAction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHyperlinkText() {
        return this.hyperlinkText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHyperlinkAction() {
        return this.hyperlinkAction;
    }

    /* renamed from: component7, reason: from getter */
    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    public final ErrorScreenAction copy(String title, String description, String buttonText, String buttonAction, String hyperlinkText, String hyperlinkAction, ThemedImageUrlEntity imageUrl) {
        return new ErrorScreenAction(title, description, buttonText, buttonAction, hyperlinkText, hyperlinkAction, imageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorScreenAction)) {
            return false;
        }
        ErrorScreenAction errorScreenAction = (ErrorScreenAction) other;
        return jl40.l(this.title, errorScreenAction.title) && jl40.l(this.description, errorScreenAction.description) && jl40.l(this.buttonText, errorScreenAction.buttonText) && jl40.l(this.buttonAction, errorScreenAction.buttonAction) && jl40.l(this.hyperlinkText, errorScreenAction.hyperlinkText) && jl40.l(this.hyperlinkAction, errorScreenAction.hyperlinkAction) && jl40.l(this.imageUrl, errorScreenAction.imageUrl);
    }

    public final String getButtonAction() {
        return this.buttonAction;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHyperlinkAction() {
        return this.hyperlinkAction;
    }

    public final String getHyperlinkText() {
        return this.hyperlinkText;
    }

    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonAction;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hyperlinkText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hyperlinkAction;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        return hashCode6 + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.buttonText;
        String str4 = this.buttonAction;
        String str5 = this.hyperlinkText;
        String str6 = this.hyperlinkAction;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        StringBuilder v = b64.v("ErrorScreenAction(title=", str, ", description=", str2, ", buttonText=");
        g8e.D(v, str3, ", buttonAction=", str4, ", hyperlinkText=");
        g8e.D(v, str5, ", hyperlinkAction=", str6, ", imageUrl=");
        v.append(themedImageUrlEntity);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.buttonText);
        dest.writeString(this.buttonAction);
        dest.writeString(this.hyperlinkText);
        dest.writeString(this.hyperlinkAction);
        dest.writeParcelable(this.imageUrl, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ErrorScreenAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorScreenAction createFromParcel(Parcel parcel) {
            return new ErrorScreenAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(ErrorScreenAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorScreenAction[] newArray(int i) {
            return new ErrorScreenAction[i];
        }
    }

    public ErrorScreenAction() {
        this(null, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP, null);
    }

    public /* synthetic */ ErrorScreenAction(String str, String str2, String str3, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : themedImageUrlEntity);
    }
}
