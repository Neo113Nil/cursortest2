package com.samsung.android.sdk.samsungpay.v2.card;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.c;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.xeb;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class AddCardInfo implements Parcelable {

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String EXTRA_ISSUER_ID = "issuerId";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_17)
    public static final String EXTRA_KEY_MOSCOW_TRANSIT = "extra_transit_card_data";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String EXTRA_PROVISION_PAYLOAD = "provisionPayload";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_14)
    public static final String EXTRA_SAMSUNG_PAY_CARD = "extra_samsung_pay_card";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_AMEX = "AX";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_DISCOVER = "DS";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_3)
    public static final String PROVIDER_GEMALTO = "GT";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_GIFT = "GI";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    @Deprecated
    public static final String PROVIDER_GTO = "GTO";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_LOYALTY = "LO";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_MASTERCARD = "MC";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_3)
    public static final String PROVIDER_MIR = "MI";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_3)
    public static final String PROVIDER_NAPAS = "NP";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_7)
    public static final String PROVIDER_PAGOBANCOMAT = "PB";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_0)
    public static final String PROVIDER_PAYPAL = "PP";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_PLCC = "PL";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_2_16)
    public static final String PROVIDER_VACCINE_PASS = "VaccinePass";

    @c(since = SpaySdk.SdkApiLevel.LEVEL_1_2)
    public static final String PROVIDER_VISA = "VI";
    private static final String TAG = "AddCardInfo";

    @xeb
    private Bundle cardDetail;
    private String cardType;

    @xeb
    private String tokenizationProvider;
    private static final ArrayList<String> allowedCardTypes = new ArrayList<>(Arrays.asList(Card.CARD_TYPE_CREDIT_DEBIT, Card.CARD_TYPE_CREDIT, Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_VACCINE_PASS));
    public static final Parcelable.Creator<AddCardInfo> CREATOR = new Parcelable.Creator<AddCardInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.card.AddCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddCardInfo createFromParcel(Parcel parcel) {
            return new AddCardInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddCardInfo[] newArray(int i) {
            return new AddCardInfo[i];
        }
    };

    public AddCardInfo(Parcel parcel) {
        this.cardType = parcel.readString();
        this.tokenizationProvider = parcel.readString();
        this.cardDetail = parcel.readBundle();
    }

    private void assertNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        ny61.t("Input parameter must be set");
    }

    private void throwException(String str) {
        Log.e(TAG, str);
    }

    private void verifyCardTypeAllowed(String str) {
        if (allowedCardTypes.contains(str)) {
            return;
        }
        ny61.g(g8e.o("Not allowed card type is used : ", str));
    }

    private void verifyProvisionPayload(String str, Bundle bundle) {
        String string = bundle.getString(EXTRA_PROVISION_PAYLOAD);
        if (TextUtils.isEmpty(string)) {
            ny61.g("Provision payload must be provided");
            return;
        }
        if (TextUtils.equals(str, PROVIDER_MASTERCARD)) {
            try {
                Base64.decode(string.getBytes(), 0);
            } catch (Exception e) {
                Log.e(TAG, "verify provision payload failed : " + e.getMessage());
                throwException("In case of Mastercard, payload should be Base64 encoded. Please double check it");
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getCardDetail() {
        return this.cardDetail;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getTokenizationProvider() {
        return this.tokenizationProvider;
    }

    public void setCardDetail(Bundle bundle) {
        assertNotNull(bundle);
        verifyProvisionPayload(this.tokenizationProvider, bundle);
        this.cardDetail = bundle;
    }

    public void setCardType(String str) {
        verifyCardTypeAllowed(str);
        this.cardType = str;
    }

    public void setTokenizationProvider(String str) {
        assertNotNull(str);
        this.tokenizationProvider = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardType);
        parcel.writeString(this.tokenizationProvider);
        parcel.writeBundle(this.cardDetail);
    }

    public AddCardInfo(String str, String str2, Bundle bundle) {
        verifyCardTypeAllowed(str);
        assertNotNull(str2);
        assertNotNull(bundle);
        verifyProvisionPayload(str2, bundle);
        this.cardType = str;
        this.tokenizationProvider = str2;
        this.cardDetail = bundle;
    }
}
