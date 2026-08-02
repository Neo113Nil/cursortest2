package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001@Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b6\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b7\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b8\u0010\u0019R \u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/ybsdk/deeplink/generated/OpenNoticeAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "title", "buttonText", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "action", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "", "imageHeight", "secondaryButtonText", "secondaryButtonAction", "buttonsOrientation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/OpenNoticeAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getButtonText", "getDescription", "getAction", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrl", "Ljava/lang/Integer;", "getImageHeight", "getSecondaryButtonText", "getSecondaryButtonAction", "getButtonsOrientation", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "tub1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenNoticeAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<OpenNoticeAction> CREATOR = new Creator();
    private final String action;
    private final String buttonText;
    private final String buttonsOrientation;
    private final Uri deeplinkUri;
    private final String description;
    private final Integer imageHeight;
    private final ThemedImageUrlEntity imageUrl;
    private final String secondaryButtonAction;
    private final String secondaryButtonText;
    private final String title;

    public OpenNoticeAction(String str, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, Integer num, String str5, String str6, String str7) {
        this.title = str;
        this.buttonText = str2;
        this.description = str3;
        this.action = str4;
        this.imageUrl = themedImageUrlEntity;
        this.imageHeight = num;
        this.secondaryButtonText = str5;
        this.secondaryButtonAction = str6;
        this.buttonsOrientation = str7;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/open_notice", "title", str);
        j.appendQueryParameter("button_text", str2);
        if (str3 != null) {
            j.appendQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("action", str4);
        }
        if (themedImageUrlEntity != null) {
            String lightUrl = themedImageUrlEntity.getLightUrl();
            if (lightUrl != null) {
                j.appendQueryParameter("image_url", lightUrl);
            }
            String darkUrl = themedImageUrlEntity.getDarkUrl();
            if (darkUrl != null) {
                j.appendQueryParameter("image_url_dark", darkUrl);
            }
        }
        if (num != null) {
            j.appendQueryParameter("image_height", String.valueOf(num.intValue()));
        }
        if (str5 != null) {
            j.appendQueryParameter("secondary_button_text", str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("secondary_button_action", str6);
        }
        if (str7 != null) {
            j.appendQueryParameter("buttons_orientation", str7);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ OpenNoticeAction copy$default(OpenNoticeAction openNoticeAction, String str, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, Integer num, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openNoticeAction.title;
        }
        if ((i & 2) != 0) {
            str2 = openNoticeAction.buttonText;
        }
        if ((i & 4) != 0) {
            str3 = openNoticeAction.description;
        }
        if ((i & 8) != 0) {
            str4 = openNoticeAction.action;
        }
        if ((i & 16) != 0) {
            themedImageUrlEntity = openNoticeAction.imageUrl;
        }
        if ((i & 32) != 0) {
            num = openNoticeAction.imageHeight;
        }
        if ((i & 64) != 0) {
            str5 = openNoticeAction.secondaryButtonText;
        }
        if ((i & 128) != 0) {
            str6 = openNoticeAction.secondaryButtonAction;
        }
        if ((i & 256) != 0) {
            str7 = openNoticeAction.buttonsOrientation;
        }
        String str8 = str6;
        String str9 = str7;
        Integer num2 = num;
        String str10 = str5;
        ThemedImageUrlEntity themedImageUrlEntity2 = themedImageUrlEntity;
        String str11 = str3;
        return openNoticeAction.copy(str, str2, str11, str4, themedImageUrlEntity2, num2, str10, str8, str9);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getImageHeight() {
        return this.imageHeight;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSecondaryButtonAction() {
        return this.secondaryButtonAction;
    }

    /* renamed from: component9, reason: from getter */
    public final String getButtonsOrientation() {
        return this.buttonsOrientation;
    }

    public final OpenNoticeAction copy(String title, String buttonText, String description, String action, ThemedImageUrlEntity imageUrl, Integer imageHeight, String secondaryButtonText, String secondaryButtonAction, String buttonsOrientation) {
        return new OpenNoticeAction(title, buttonText, description, action, imageUrl, imageHeight, secondaryButtonText, secondaryButtonAction, buttonsOrientation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenNoticeAction)) {
            return false;
        }
        OpenNoticeAction openNoticeAction = (OpenNoticeAction) other;
        return jl40.l(this.title, openNoticeAction.title) && jl40.l(this.buttonText, openNoticeAction.buttonText) && jl40.l(this.description, openNoticeAction.description) && jl40.l(this.action, openNoticeAction.action) && jl40.l(this.imageUrl, openNoticeAction.imageUrl) && jl40.l(this.imageHeight, openNoticeAction.imageHeight) && jl40.l(this.secondaryButtonText, openNoticeAction.secondaryButtonText) && jl40.l(this.secondaryButtonAction, openNoticeAction.secondaryButtonAction) && jl40.l(this.buttonsOrientation, openNoticeAction.buttonsOrientation);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getButtonsOrientation() {
        return this.buttonsOrientation;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getImageHeight() {
        return this.imageHeight;
    }

    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    public final String getSecondaryButtonAction() {
        return this.secondaryButtonAction;
    }

    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.buttonText);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        Integer num = this.imageHeight;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.secondaryButtonText;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButtonAction;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonsOrientation;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.buttonText;
        String str3 = this.description;
        String str4 = this.action;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        Integer num = this.imageHeight;
        String str5 = this.secondaryButtonText;
        String str6 = this.secondaryButtonAction;
        String str7 = this.buttonsOrientation;
        StringBuilder v = b64.v("OpenNoticeAction(title=", str, ", buttonText=", str2, ", description=");
        g8e.D(v, str3, ", action=", str4, ", imageUrl=");
        v.append(themedImageUrlEntity);
        v.append(", imageHeight=");
        v.append(num);
        v.append(", secondaryButtonText=");
        g8e.D(v, str5, ", secondaryButtonAction=", str6, ", buttonsOrientation=");
        return oyr.t(v, str7, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.buttonText);
        dest.writeString(this.description);
        dest.writeString(this.action);
        dest.writeParcelable(this.imageUrl, flags);
        Integer num = this.imageHeight;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        dest.writeString(this.secondaryButtonText);
        dest.writeString(this.secondaryButtonAction);
        dest.writeString(this.buttonsOrientation);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenNoticeAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenNoticeAction createFromParcel(Parcel parcel) {
            return new OpenNoticeAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(OpenNoticeAction.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenNoticeAction[] newArray(int i) {
            return new OpenNoticeAction[i];
        }
    }

    public /* synthetic */ OpenNoticeAction(String str, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, Integer num, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : themedImageUrlEntity, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
