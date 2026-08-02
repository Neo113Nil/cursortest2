package com.samsung.android.sdk.samsungpay.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo;
import java.util.Locale;

@Deprecated
/* loaded from: classes11.dex */
public class CardInfo implements Parcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new Parcelable.Creator<CardInfo>() { // from class: com.samsung.android.sdk.samsungpay.payment.CardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardInfo createFromParcel(Parcel parcel) {
            return new CardInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardInfo[] newArray(int i) {
            return new CardInfo[i];
        }
    };
    private Brand brand;

    @Deprecated
    public enum Brand implements Parcelable {
        AMERICANEXPRESS,
        MASTERCARD,
        VISA,
        CHINAUNIONPAY;

        public static final Parcelable.Creator<Brand> CREATOR = new Parcelable.Creator<Brand>() { // from class: com.samsung.android.sdk.samsungpay.payment.CardInfo.Brand.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Brand createFromParcel(Parcel parcel) {
                return Brand.values()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Brand[] newArray(int i) {
                return new Brand[i];
            }
        };

        public static Brand convert(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            if ("VISA".equals(upperCase) || AddCardInfo.PROVIDER_VISA.equals(upperCase)) {
                return VISA;
            }
            if ("MASTERCARD".equals(upperCase) || AddCardInfo.PROVIDER_MASTERCARD.equals(upperCase) || upperCase.contains("MASTER")) {
                return MASTERCARD;
            }
            if ("AMEX".equals(upperCase) || AddCardInfo.PROVIDER_AMEX.equals(upperCase) || upperCase.contains("AMERICANEXPRESS")) {
                return AMERICANEXPRESS;
            }
            if ("CUP".equals(upperCase) || upperCase.contains("CHINA")) {
                return CHINAUNIONPAY;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public static class a {
    }

    public CardInfo(Parcel parcel) {
        this.brand = (Brand) parcel.readValue(Brand.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.brand);
    }

    private CardInfo(a aVar) {
        aVar.getClass();
        this.brand = null;
    }
}
