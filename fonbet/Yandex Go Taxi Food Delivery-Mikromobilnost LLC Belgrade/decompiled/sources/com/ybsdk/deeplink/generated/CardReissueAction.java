package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001cR \u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/ybsdk/deeplink/generated/CardReissueAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "cardId", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "", "popCardScenario", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Z)Lcom/ybsdk/deeplink/generated/CardReissueAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardId", "getTitle", "getDescription", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImageUrl", "Z", "getPopCardScenario", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardReissueAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<CardReissueAction> CREATOR = new Creator();
    private final String cardId;
    private final Uri deeplinkUri;
    private final String description;
    private final ThemedImageUrlEntity imageUrl;
    private final boolean popCardScenario;
    private final String title;

    public CardReissueAction(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, boolean z) {
        this.cardId = str;
        this.title = str2;
        this.description = str3;
        this.imageUrl = themedImageUrlEntity;
        this.popCardScenario = z;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/card_reissue", "card_id", str);
        j.appendQueryParameter("title", str2);
        j.appendQueryParameter(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3);
        String lightUrl = themedImageUrlEntity.getLightUrl();
        if (lightUrl != null) {
            j.appendQueryParameter("image_url", lightUrl);
        }
        String darkUrl = themedImageUrlEntity.getDarkUrl();
        if (darkUrl != null) {
            j.appendQueryParameter("image_url_dark", darkUrl);
        }
        j.appendQueryParameter("pop_card_scenario", String.valueOf(z));
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ CardReissueAction copy$default(CardReissueAction cardReissueAction, String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardReissueAction.cardId;
        }
        if ((i & 2) != 0) {
            str2 = cardReissueAction.title;
        }
        if ((i & 4) != 0) {
            str3 = cardReissueAction.description;
        }
        if ((i & 8) != 0) {
            themedImageUrlEntity = cardReissueAction.imageUrl;
        }
        if ((i & 16) != 0) {
            z = cardReissueAction.popCardScenario;
        }
        boolean z2 = z;
        String str4 = str3;
        return cardReissueAction.copy(str, str2, str4, themedImageUrlEntity, z2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPopCardScenario() {
        return this.popCardScenario;
    }

    public final CardReissueAction copy(String cardId, String title, String description, ThemedImageUrlEntity imageUrl, boolean popCardScenario) {
        return new CardReissueAction(cardId, title, description, imageUrl, popCardScenario);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardReissueAction)) {
            return false;
        }
        CardReissueAction cardReissueAction = (CardReissueAction) other;
        return jl40.l(this.cardId, cardReissueAction.cardId) && jl40.l(this.title, cardReissueAction.title) && jl40.l(this.description, cardReissueAction.description) && jl40.l(this.imageUrl, cardReissueAction.imageUrl) && this.popCardScenario == cardReissueAction.popCardScenario;
    }

    public final String getCardId() {
        return this.cardId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getPopCardScenario() {
        return this.popCardScenario;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.popCardScenario) + xvz.c(this.imageUrl, unr0.b(unr0.b(this.cardId.hashCode() * 31, 31, this.title), 31, this.description), 31);
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.title;
        String str3 = this.description;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        boolean z = this.popCardScenario;
        StringBuilder v = b64.v("CardReissueAction(cardId=", str, ", title=", str2, ", description=");
        v.append(str3);
        v.append(", imageUrl=");
        v.append(themedImageUrlEntity);
        v.append(", popCardScenario=");
        return x4e.i(v, z, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardId);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeParcelable(this.imageUrl, flags);
        dest.writeInt(this.popCardScenario ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardReissueAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardReissueAction createFromParcel(Parcel parcel) {
            return new CardReissueAction(parcel.readString(), parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(CardReissueAction.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardReissueAction[] newArray(int i) {
            return new CardReissueAction[i];
        }
    }

    public /* synthetic */ CardReissueAction(String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, themedImageUrlEntity, (i & 16) != 0 ? false : z);
    }
}
