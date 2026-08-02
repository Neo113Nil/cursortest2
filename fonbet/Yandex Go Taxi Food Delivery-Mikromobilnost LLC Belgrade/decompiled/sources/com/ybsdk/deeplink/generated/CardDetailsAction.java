package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017JJ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0017R \u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/deeplink/generated/CardDetailsAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "scrollToPromo", "", "agreementId", "cardId", "promoId", "scrollToProductType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/CardDetailsAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getScrollToPromo", "Ljava/lang/String;", "getAgreementId", "getCardId", "getPromoId", "getScrollToProductType", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardDetailsAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<CardDetailsAction> CREATOR = new Creator();
    private final String agreementId;
    private final String cardId;
    private final Uri deeplinkUri;
    private final String promoId;
    private final String scrollToProductType;
    private final boolean scrollToPromo;

    public CardDetailsAction(boolean z, String str, String str2, String str3, String str4) {
        this.scrollToPromo = z;
        this.agreementId = str;
        this.cardId = str2;
        this.promoId = str3;
        this.scrollToProductType = str4;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/card_details");
        l.appendQueryParameter("scroll_to_promo", String.valueOf(z));
        if (str != null) {
            l.appendQueryParameter("agreement_id", str);
        }
        if (str2 != null) {
            l.appendQueryParameter("card_id", str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("promo_id", str3);
        }
        if (str4 != null) {
            l.appendQueryParameter("scroll_to_product_type", str4);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ CardDetailsAction copy$default(CardDetailsAction cardDetailsAction, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardDetailsAction.scrollToPromo;
        }
        if ((i & 2) != 0) {
            str = cardDetailsAction.agreementId;
        }
        if ((i & 4) != 0) {
            str2 = cardDetailsAction.cardId;
        }
        if ((i & 8) != 0) {
            str3 = cardDetailsAction.promoId;
        }
        if ((i & 16) != 0) {
            str4 = cardDetailsAction.scrollToProductType;
        }
        String str5 = str4;
        String str6 = str2;
        return cardDetailsAction.copy(z, str, str6, str3, str5);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getScrollToPromo() {
        return this.scrollToPromo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPromoId() {
        return this.promoId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScrollToProductType() {
        return this.scrollToProductType;
    }

    public final CardDetailsAction copy(boolean scrollToPromo, String agreementId, String cardId, String promoId, String scrollToProductType) {
        return new CardDetailsAction(scrollToPromo, agreementId, cardId, promoId, scrollToProductType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetailsAction)) {
            return false;
        }
        CardDetailsAction cardDetailsAction = (CardDetailsAction) other;
        return this.scrollToPromo == cardDetailsAction.scrollToPromo && jl40.l(this.agreementId, cardDetailsAction.agreementId) && jl40.l(this.cardId, cardDetailsAction.cardId) && jl40.l(this.promoId, cardDetailsAction.promoId) && jl40.l(this.scrollToProductType, cardDetailsAction.scrollToProductType);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCardId() {
        return this.cardId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getPromoId() {
        return this.promoId;
    }

    public final String getScrollToProductType() {
        return this.scrollToProductType;
    }

    public final boolean getScrollToPromo() {
        return this.scrollToPromo;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.scrollToPromo) * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promoId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scrollToProductType;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.scrollToPromo;
        String str = this.agreementId;
        String str2 = this.cardId;
        String str3 = this.promoId;
        String str4 = this.scrollToProductType;
        StringBuilder v = ly3.v("CardDetailsAction(scrollToPromo=", ", agreementId=", str, ", cardId=", z);
        g8e.D(v, str2, ", promoId=", str3, ", scrollToProductType=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.scrollToPromo ? 1 : 0);
        dest.writeString(this.agreementId);
        dest.writeString(this.cardId);
        dest.writeString(this.promoId);
        dest.writeString(this.scrollToProductType);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardDetailsAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardDetailsAction createFromParcel(Parcel parcel) {
            return new CardDetailsAction(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardDetailsAction[] newArray(int i) {
            return new CardDetailsAction[i];
        }
    }

    public CardDetailsAction() {
        this(false, null, null, null, null, 31, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CardDetailsAction(boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L10
            r4 = r0
        L10:
            r8 = r7 & 8
            if (r8 == 0) goto L15
            r5 = r0
        L15:
            r7 = r7 & 16
            if (r7 == 0) goto L20
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L26
        L20:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L26:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.deeplink.generated.CardDetailsAction.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
