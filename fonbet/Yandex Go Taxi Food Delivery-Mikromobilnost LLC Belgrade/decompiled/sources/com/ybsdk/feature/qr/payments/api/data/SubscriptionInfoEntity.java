package com.ybsdk.feature.qr.payments.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001f¨\u00062"}, d2 = {"Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;", "Landroid/os/Parcelable;", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "logo", "Lcom/ybsdk/core/utils/text/Text;", "agreementsSheetTitle", "", "Lcom/ybsdk/feature/qr/payments/api/data/AgreementEntity;", "agreements", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/utils/text/Text;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component4", "()Lcom/ybsdk/core/utils/text/Text;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/utils/text/Text;Ljava/util/List;)Lcom/ybsdk/feature/qr/payments/api/data/SubscriptionInfoEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getLogo", "Lcom/ybsdk/core/utils/text/Text;", "getAgreementsSheetTitle", "Ljava/util/List;", "getAgreements", "feature-qr-payments-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionInfoEntity implements Parcelable {
    public static final Parcelable.Creator<SubscriptionInfoEntity> CREATOR = new Creator();
    private final List<AgreementEntity> agreements;
    private final Text agreementsSheetTitle;
    private final String description;
    private final ThemedImageUrlEntity logo;
    private final String title;

    public SubscriptionInfoEntity(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, Text text, List<AgreementEntity> list) {
        this.title = str;
        this.description = str2;
        this.logo = themedImageUrlEntity;
        this.agreementsSheetTitle = text;
        this.agreements = list;
    }

    public static /* synthetic */ SubscriptionInfoEntity copy$default(SubscriptionInfoEntity subscriptionInfoEntity, String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, Text text, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionInfoEntity.title;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionInfoEntity.description;
        }
        if ((i & 4) != 0) {
            themedImageUrlEntity = subscriptionInfoEntity.logo;
        }
        if ((i & 8) != 0) {
            text = subscriptionInfoEntity.agreementsSheetTitle;
        }
        if ((i & 16) != 0) {
            list = subscriptionInfoEntity.agreements;
        }
        List list2 = list;
        ThemedImageUrlEntity themedImageUrlEntity2 = themedImageUrlEntity;
        return subscriptionInfoEntity.copy(str, str2, themedImageUrlEntity2, text, list2);
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
    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    /* renamed from: component4, reason: from getter */
    public final Text getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final List<AgreementEntity> component5() {
        return this.agreements;
    }

    public final SubscriptionInfoEntity copy(String title, String description, ThemedImageUrlEntity logo, Text agreementsSheetTitle, List<AgreementEntity> agreements) {
        return new SubscriptionInfoEntity(title, description, logo, agreementsSheetTitle, agreements);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfoEntity)) {
            return false;
        }
        SubscriptionInfoEntity subscriptionInfoEntity = (SubscriptionInfoEntity) other;
        return jl40.l(this.title, subscriptionInfoEntity.title) && jl40.l(this.description, subscriptionInfoEntity.description) && jl40.l(this.logo, subscriptionInfoEntity.logo) && jl40.l(this.agreementsSheetTitle, subscriptionInfoEntity.agreementsSheetTitle) && jl40.l(this.agreements, subscriptionInfoEntity.agreements);
    }

    public final List<AgreementEntity> getAgreements() {
        return this.agreements;
    }

    public final Text getAgreementsSheetTitle() {
        return this.agreementsSheetTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int c = xvz.c(this.logo, unr0.b(this.title.hashCode() * 31, 31, this.description), 31);
        Text text = this.agreementsSheetTitle;
        return this.agreements.hashCode() + ((c + (text == null ? 0 : text.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ThemedImageUrlEntity themedImageUrlEntity = this.logo;
        Text text = this.agreementsSheetTitle;
        List<AgreementEntity> list = this.agreements;
        StringBuilder v = b64.v("SubscriptionInfoEntity(title=", str, ", description=", str2, ", logo=");
        v.append(themedImageUrlEntity);
        v.append(", agreementsSheetTitle=");
        v.append(text);
        v.append(", agreements=");
        return ly3.s(v, list, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeParcelable(this.logo, flags);
        dest.writeParcelable(this.agreementsSheetTitle, flags);
        Iterator t = vfc.t(dest, this.agreements);
        while (t.hasNext()) {
            ((AgreementEntity) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubscriptionInfoEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionInfoEntity createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(SubscriptionInfoEntity.class.getClassLoader());
            Text text = (Text) parcel.readParcelable(SubscriptionInfoEntity.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(AgreementEntity.CREATOR, parcel, arrayList, i, 1);
            }
            return new SubscriptionInfoEntity(readString, readString2, themedImageUrlEntity, text, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionInfoEntity[] newArray(int i) {
            return new SubscriptionInfoEntity[i];
        }
    }
}
