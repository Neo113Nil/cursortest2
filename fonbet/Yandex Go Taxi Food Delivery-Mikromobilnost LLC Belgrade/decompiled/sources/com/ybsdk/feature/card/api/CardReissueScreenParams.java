package com.ybsdk.feature.card.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n;
import defpackage.unr0;
import defpackage.xvz;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b4\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b5\u0010\u001d¨\u00066"}, d2 = {"Lcom/ybsdk/feature/card/api/CardReissueScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "cardId", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "landingImage", "Lcom/ybsdk/core/utils/text/Text;", "title", Constants.KEY_MESSAGE, "", "shouldExitCardScenario", "primaryButtonTitle", "secondaryButtonTitle", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;ZLcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component3", "()Lcom/ybsdk/core/utils/text/Text;", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;ZLcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/feature/card/api/CardReissueScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardId", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getLandingImage", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getMessage", "Z", "getShouldExitCardScenario", "getPrimaryButtonTitle", "getSecondaryButtonTitle", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardReissueScreenParams implements ScreenParams {
    public static final Parcelable.Creator<CardReissueScreenParams> CREATOR = new Creator();
    private final String cardId;
    private final ThemedImageUrlEntity landingImage;
    private final Text message;
    private final Text primaryButtonTitle;
    private final Text secondaryButtonTitle;
    private final boolean shouldExitCardScenario;
    private final Text title;

    public CardReissueScreenParams(String str, ThemedImageUrlEntity themedImageUrlEntity, Text text, Text text2, boolean z, Text text3, Text text4) {
        this.cardId = str;
        this.landingImage = themedImageUrlEntity;
        this.title = text;
        this.message = text2;
        this.shouldExitCardScenario = z;
        this.primaryButtonTitle = text3;
        this.secondaryButtonTitle = text4;
    }

    public static /* synthetic */ CardReissueScreenParams copy$default(CardReissueScreenParams cardReissueScreenParams, String str, ThemedImageUrlEntity themedImageUrlEntity, Text text, Text text2, boolean z, Text text3, Text text4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardReissueScreenParams.cardId;
        }
        if ((i & 2) != 0) {
            themedImageUrlEntity = cardReissueScreenParams.landingImage;
        }
        if ((i & 4) != 0) {
            text = cardReissueScreenParams.title;
        }
        if ((i & 8) != 0) {
            text2 = cardReissueScreenParams.message;
        }
        if ((i & 16) != 0) {
            z = cardReissueScreenParams.shouldExitCardScenario;
        }
        if ((i & 32) != 0) {
            text3 = cardReissueScreenParams.primaryButtonTitle;
        }
        if ((i & 64) != 0) {
            text4 = cardReissueScreenParams.secondaryButtonTitle;
        }
        Text text5 = text3;
        Text text6 = text4;
        boolean z2 = z;
        Text text7 = text;
        return cardReissueScreenParams.copy(str, themedImageUrlEntity, text7, text2, z2, text5, text6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedImageUrlEntity getLandingImage() {
        return this.landingImage;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final Text getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldExitCardScenario() {
        return this.shouldExitCardScenario;
    }

    /* renamed from: component6, reason: from getter */
    public final Text getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final Text getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final CardReissueScreenParams copy(String cardId, ThemedImageUrlEntity landingImage, Text title, Text message, boolean shouldExitCardScenario, Text primaryButtonTitle, Text secondaryButtonTitle) {
        return new CardReissueScreenParams(cardId, landingImage, title, message, shouldExitCardScenario, primaryButtonTitle, secondaryButtonTitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardReissueScreenParams)) {
            return false;
        }
        CardReissueScreenParams cardReissueScreenParams = (CardReissueScreenParams) other;
        return jl40.l(this.cardId, cardReissueScreenParams.cardId) && jl40.l(this.landingImage, cardReissueScreenParams.landingImage) && jl40.l(this.title, cardReissueScreenParams.title) && jl40.l(this.message, cardReissueScreenParams.message) && this.shouldExitCardScenario == cardReissueScreenParams.shouldExitCardScenario && jl40.l(this.primaryButtonTitle, cardReissueScreenParams.primaryButtonTitle) && jl40.l(this.secondaryButtonTitle, cardReissueScreenParams.secondaryButtonTitle);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final ThemedImageUrlEntity getLandingImage() {
        return this.landingImage;
    }

    public final Text getMessage() {
        return this.message;
    }

    public final Text getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public final Text getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final boolean getShouldExitCardScenario() {
        return this.shouldExitCardScenario;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        int e = unr0.e(n.c(this.message, n.c(this.title, xvz.c(this.landingImage, this.cardId.hashCode() * 31, 31), 31), 31), 31, this.shouldExitCardScenario);
        Text text = this.primaryButtonTitle;
        int hashCode = (e + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.secondaryButtonTitle;
        return hashCode + (text2 != null ? text2.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardId;
        ThemedImageUrlEntity themedImageUrlEntity = this.landingImage;
        Text text = this.title;
        Text text2 = this.message;
        boolean z = this.shouldExitCardScenario;
        Text text3 = this.primaryButtonTitle;
        Text text4 = this.secondaryButtonTitle;
        StringBuilder sb = new StringBuilder("CardReissueScreenParams(cardId=");
        sb.append(str);
        sb.append(", landingImage=");
        sb.append(themedImageUrlEntity);
        sb.append(", title=");
        ly3.C(sb, text, ", message=", text2, ", shouldExitCardScenario=");
        sb.append(z);
        sb.append(", primaryButtonTitle=");
        sb.append(text3);
        sb.append(", secondaryButtonTitle=");
        sb.append(text4);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardId);
        dest.writeParcelable(this.landingImage, flags);
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.message, flags);
        dest.writeInt(this.shouldExitCardScenario ? 1 : 0);
        dest.writeParcelable(this.primaryButtonTitle, flags);
        dest.writeParcelable(this.secondaryButtonTitle, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardReissueScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardReissueScreenParams createFromParcel(Parcel parcel) {
            return new CardReissueScreenParams(parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(CardReissueScreenParams.class.getClassLoader()), (Text) parcel.readParcelable(CardReissueScreenParams.class.getClassLoader()), (Text) parcel.readParcelable(CardReissueScreenParams.class.getClassLoader()), parcel.readInt() != 0, (Text) parcel.readParcelable(CardReissueScreenParams.class.getClassLoader()), (Text) parcel.readParcelable(CardReissueScreenParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardReissueScreenParams[] newArray(int i) {
            return new CardReissueScreenParams[i];
        }
    }
}
