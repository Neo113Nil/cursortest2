package com.ybsdk.feature.card.internal.presentation.carddeletion;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.card.api.CardManagementSettingStatus;
import com.ybsdk.feature.card.api.CardManagementSettingTextData;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010 ¨\u00062"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddeletion/CardDeletionScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "cardId", "lastPanDigits", "", "shouldExitCardScenario", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "themedHeaderImage", "", "Lcom/ybsdk/feature/card/api/CardManagementSettingStatus;", "Lcom/ybsdk/feature/card/api/CardManagementSettingTextData;", "cardManagementSettingTextMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/util/Map;)Lcom/ybsdk/feature/card/internal/presentation/carddeletion/CardDeletionScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardId", "getLastPanDigits", "Z", "getShouldExitCardScenario", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getThemedHeaderImage", "Ljava/util/Map;", "getCardManagementSettingTextMap", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardDeletionScreenParams implements ScreenParams {
    public static final Parcelable.Creator<CardDeletionScreenParams> CREATOR = new Creator();
    private final String cardId;
    private final Map<CardManagementSettingStatus, CardManagementSettingTextData> cardManagementSettingTextMap;
    private final String lastPanDigits;
    private final boolean shouldExitCardScenario;
    private final ThemedImageUrlEntity themedHeaderImage;

    public /* synthetic */ CardDeletionScreenParams(String str, String str2, boolean z, ThemedImageUrlEntity themedImageUrlEntity, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : themedImageUrlEntity, map);
    }

    public static /* synthetic */ CardDeletionScreenParams copy$default(CardDeletionScreenParams cardDeletionScreenParams, String str, String str2, boolean z, ThemedImageUrlEntity themedImageUrlEntity, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDeletionScreenParams.cardId;
        }
        if ((i & 2) != 0) {
            str2 = cardDeletionScreenParams.lastPanDigits;
        }
        if ((i & 4) != 0) {
            z = cardDeletionScreenParams.shouldExitCardScenario;
        }
        if ((i & 8) != 0) {
            themedImageUrlEntity = cardDeletionScreenParams.themedHeaderImage;
        }
        if ((i & 16) != 0) {
            map = cardDeletionScreenParams.cardManagementSettingTextMap;
        }
        Map map2 = map;
        boolean z2 = z;
        return cardDeletionScreenParams.copy(str, str2, z2, themedImageUrlEntity, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastPanDigits() {
        return this.lastPanDigits;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldExitCardScenario() {
        return this.shouldExitCardScenario;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImageUrlEntity getThemedHeaderImage() {
        return this.themedHeaderImage;
    }

    public final Map<CardManagementSettingStatus, CardManagementSettingTextData> component5() {
        return this.cardManagementSettingTextMap;
    }

    public final CardDeletionScreenParams copy(String cardId, String lastPanDigits, boolean shouldExitCardScenario, ThemedImageUrlEntity themedHeaderImage, Map<CardManagementSettingStatus, CardManagementSettingTextData> cardManagementSettingTextMap) {
        return new CardDeletionScreenParams(cardId, lastPanDigits, shouldExitCardScenario, themedHeaderImage, cardManagementSettingTextMap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDeletionScreenParams)) {
            return false;
        }
        CardDeletionScreenParams cardDeletionScreenParams = (CardDeletionScreenParams) other;
        return jl40.l(this.cardId, cardDeletionScreenParams.cardId) && jl40.l(this.lastPanDigits, cardDeletionScreenParams.lastPanDigits) && this.shouldExitCardScenario == cardDeletionScreenParams.shouldExitCardScenario && jl40.l(this.themedHeaderImage, cardDeletionScreenParams.themedHeaderImage) && jl40.l(this.cardManagementSettingTextMap, cardDeletionScreenParams.cardManagementSettingTextMap);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final Map<CardManagementSettingStatus, CardManagementSettingTextData> getCardManagementSettingTextMap() {
        return this.cardManagementSettingTextMap;
    }

    public final String getLastPanDigits() {
        return this.lastPanDigits;
    }

    public final boolean getShouldExitCardScenario() {
        return this.shouldExitCardScenario;
    }

    public final ThemedImageUrlEntity getThemedHeaderImage() {
        return this.themedHeaderImage;
    }

    public int hashCode() {
        int e = unr0.e(unr0.b(this.cardId.hashCode() * 31, 31, this.lastPanDigits), 31, this.shouldExitCardScenario);
        ThemedImageUrlEntity themedImageUrlEntity = this.themedHeaderImage;
        return this.cardManagementSettingTextMap.hashCode() + ((e + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31);
    }

    public String toString() {
        String str = this.cardId;
        String str2 = this.lastPanDigits;
        boolean z = this.shouldExitCardScenario;
        ThemedImageUrlEntity themedImageUrlEntity = this.themedHeaderImage;
        Map<CardManagementSettingStatus, CardManagementSettingTextData> map = this.cardManagementSettingTextMap;
        StringBuilder v = b64.v("CardDeletionScreenParams(cardId=", str, ", lastPanDigits=", str2, ", shouldExitCardScenario=");
        v.append(z);
        v.append(", themedHeaderImage=");
        v.append(themedImageUrlEntity);
        v.append(", cardManagementSettingTextMap=");
        return b64.r(v, map, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cardId);
        dest.writeString(this.lastPanDigits);
        dest.writeInt(this.shouldExitCardScenario ? 1 : 0);
        dest.writeParcelable(this.themedHeaderImage, flags);
        Iterator x = qv10.x(this.cardManagementSettingTextMap, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString(((CardManagementSettingStatus) entry.getKey()).name());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardDeletionScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardDeletionScreenParams createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(CardDeletionScreenParams.class.getClassLoader());
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(CardManagementSettingStatus.valueOf(parcel.readString()), parcel.readParcelable(CardDeletionScreenParams.class.getClassLoader()));
            }
            return new CardDeletionScreenParams(readString, readString2, z, themedImageUrlEntity, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardDeletionScreenParams[] newArray(int i) {
            return new CardDeletionScreenParams[i];
        }
    }

    public CardDeletionScreenParams(String str, String str2, boolean z, ThemedImageUrlEntity themedImageUrlEntity, Map<CardManagementSettingStatus, CardManagementSettingTextData> map) {
        this.cardId = str;
        this.lastPanDigits = str2;
        this.shouldExitCardScenario = z;
        this.themedHeaderImage = themedImageUrlEntity;
        this.cardManagementSettingTextMap = map;
    }
}
