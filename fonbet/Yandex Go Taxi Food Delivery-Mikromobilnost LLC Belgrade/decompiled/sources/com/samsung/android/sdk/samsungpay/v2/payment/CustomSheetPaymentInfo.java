package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.AddressControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.AmountBoxControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItemType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public class CustomSheetPaymentInfo implements Parcelable {
    public static final Parcelable.Creator<CustomSheetPaymentInfo> CREATOR = new Parcelable.Creator<CustomSheetPaymentInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomSheetPaymentInfo createFromParcel(Parcel parcel) {
            return new CustomSheetPaymentInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomSheetPaymentInfo[] newArray(int i) {
            return new CustomSheetPaymentInfo[i];
        }
    };
    private AddressInPaymentSheet addressInPaymentSheet;
    private List<SpaySdk.Brand> allowedCardBrand;
    private CardInfo cardInfo;
    private CustomSheet customSheet;
    private Bundle extraPaymentInfo;
    private boolean isCardHolderNameRequired;
    private boolean isRecurring;
    private String merchantCountryCode;
    private String merchantId;
    private String merchantName;
    private String orderNumber;
    private PaymentProtocol paymentProtocol;
    private String version;

    public enum AddressInPaymentSheet implements Parcelable {
        DO_NOT_SHOW,
        NEED_BILLING_SPAY,
        NEED_SHIPPING_SPAY,
        SEND_SHIPPING,
        NEED_BILLING_SEND_SHIPPING,
        NEED_BILLING_AND_SHIPPING;

        public static final Parcelable.Creator<AddressInPaymentSheet> CREATOR = new Parcelable.Creator<AddressInPaymentSheet>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo.AddressInPaymentSheet.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AddressInPaymentSheet createFromParcel(Parcel parcel) {
                return AddressInPaymentSheet.values()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AddressInPaymentSheet[] newArray(int i) {
                return null;
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    @Deprecated
    public enum PaymentProtocol implements Parcelable {
        PROTOCOL_3DS,
        PROTOCOL_EMV,
        PROTOCOL_COF,
        PROTOCOL_OTHER;

        public static final Parcelable.Creator<PaymentProtocol> CREATOR = new Parcelable.Creator<PaymentProtocol>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo.PaymentProtocol.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PaymentProtocol createFromParcel(Parcel parcel) {
                return PaymentProtocol.values()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PaymentProtocol[] newArray(int i) {
                return new PaymentProtocol[i];
            }
        };

        public static PaymentProtocol convert(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            return upperCase.contains("3DS") ? PROTOCOL_3DS : upperCase.contains("EMV") ? PROTOCOL_EMV : PROTOCOL_OTHER;
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
        private String a;
        private String b;
        private String c;
        private PaymentProtocol d;
        private AddressInPaymentSheet e;
        private List<SpaySdk.Brand> f = new ArrayList();
        private CardInfo g;
        private boolean h;
        private boolean i;
        private String j;
        private CustomSheet k;
        private Bundle l;
    }

    private CustomSheetPaymentInfo(a aVar) {
        AddressInPaymentSheet addressInPaymentSheet = AddressInPaymentSheet.DO_NOT_SHOW;
        this.addressInPaymentSheet = addressInPaymentSheet;
        this.isCardHolderNameRequired = false;
        this.isRecurring = false;
        this.version = SpaySdk.c();
        this.merchantId = aVar.a;
        this.merchantName = aVar.b;
        this.orderNumber = aVar.c;
        this.paymentProtocol = aVar.d;
        this.addressInPaymentSheet = aVar.e != null ? aVar.e : addressInPaymentSheet;
        this.allowedCardBrand = aVar.f;
        this.cardInfo = aVar.g;
        this.isCardHolderNameRequired = aVar.h;
        this.isRecurring = aVar.i;
        this.merchantCountryCode = aVar.j;
        this.customSheet = aVar.k;
        this.extraPaymentInfo = aVar.l;
    }

    private void nullCheckExtraPaymentInfo() {
        if (this.extraPaymentInfo == null) {
            this.extraPaymentInfo = new Bundle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AddressInPaymentSheet getAddressInPaymentSheet() {
        return this.addressInPaymentSheet;
    }

    public List<SpaySdk.Brand> getAllowedCardBrands() {
        return this.allowedCardBrand;
    }

    public CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public CustomSheet getCustomSheet() {
        return this.customSheet;
    }

    public Bundle getExtraPaymentInfo() {
        return this.extraPaymentInfo;
    }

    public boolean getIsCardHolderNameRequired() {
        return this.isCardHolderNameRequired;
    }

    public boolean getIsRecurring() {
        return this.isRecurring;
    }

    public String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public SpaySdk.Brand getPaymentCardBrand() {
        nullCheckExtraPaymentInfo();
        return SpaySdk.Brand.valueOf(this.extraPaymentInfo.getString("cardBrand", "UNKNOWN_CARD"));
    }

    public String getPaymentCardLast4DPAN() {
        nullCheckExtraPaymentInfo();
        return this.extraPaymentInfo.getString("last4Dpan", "");
    }

    public String getPaymentCardLast4FPAN() {
        nullCheckExtraPaymentInfo();
        return this.extraPaymentInfo.getString("last4Fpan", "");
    }

    public String getPaymentCurrencyCode() {
        CustomSheet customSheet = this.customSheet;
        if (customSheet == null) {
            return "";
        }
        for (SheetControl sheetControl : customSheet.getSheetControls()) {
            if (sheetControl.getControltype() == SheetControl.Controltype.AMOUNTBOX) {
                return ((AmountBoxControl) sheetControl).getCurrencyCode();
            }
        }
        return "";
    }

    @Deprecated
    public PaymentProtocol getPaymentProtocol() {
        return this.paymentProtocol;
    }

    public Address getPaymentShippingAddress() {
        CustomSheet customSheet = this.customSheet;
        if (customSheet != null) {
            for (SheetControl sheetControl : customSheet.getSheetControls()) {
                if (sheetControl.getControltype() == SheetControl.Controltype.ADDRESS) {
                    AddressControl addressControl = (AddressControl) sheetControl;
                    if (addressControl.getAddressType() == SheetItemType.SHIPPING_ADDRESS) {
                        return addressControl.getAddress();
                    }
                }
            }
        }
        return new Address.a().a();
    }

    public String getPaymentShippingMethod() {
        nullCheckExtraPaymentInfo();
        return this.extraPaymentInfo.getString("shippingMethod", "");
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isEnableEnforcePaymentSheet() {
        nullCheckExtraPaymentInfo();
        return this.extraPaymentInfo.getBoolean("enforcePaymentSheet", false);
    }

    public boolean isFastCheckout() {
        nullCheckExtraPaymentInfo();
        return this.extraPaymentInfo.getBoolean("fastCheckOutStatus", false);
    }

    public void readFromParcel(Parcel parcel) {
        this.version = (String) parcel.readValue(String.class.getClassLoader());
        this.merchantId = (String) parcel.readValue(String.class.getClassLoader());
        this.merchantName = (String) parcel.readValue(String.class.getClassLoader());
        this.orderNumber = (String) parcel.readValue(String.class.getClassLoader());
        this.paymentProtocol = (PaymentProtocol) parcel.readValue(PaymentProtocol.class.getClassLoader());
        this.addressInPaymentSheet = (AddressInPaymentSheet) parcel.readValue(AddressInPaymentSheet.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.allowedCardBrand = arrayList;
        parcel.readTypedList(arrayList, SpaySdk.Brand.CREATOR);
        this.cardInfo = (CardInfo) parcel.readValue(CardInfo.class.getClassLoader());
        this.isCardHolderNameRequired = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.isRecurring = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.merchantCountryCode = (String) parcel.readValue(String.class.getClassLoader());
        this.customSheet = (CustomSheet) parcel.readParcelable(CustomSheet.class.getClassLoader());
        this.extraPaymentInfo = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.version);
        parcel.writeValue(this.merchantId);
        parcel.writeValue(this.merchantName);
        parcel.writeValue(this.orderNumber);
        parcel.writeValue(this.paymentProtocol);
        parcel.writeValue(this.addressInPaymentSheet);
        parcel.writeTypedList(this.allowedCardBrand);
        parcel.writeValue(this.cardInfo);
        parcel.writeValue(Boolean.valueOf(this.isCardHolderNameRequired));
        parcel.writeValue(Boolean.valueOf(this.isRecurring));
        parcel.writeValue(this.merchantCountryCode);
        parcel.writeParcelable(this.customSheet, i);
        parcel.writeBundle(this.extraPaymentInfo);
    }

    private CustomSheetPaymentInfo() {
        this.addressInPaymentSheet = AddressInPaymentSheet.DO_NOT_SHOW;
        this.isCardHolderNameRequired = false;
        this.isRecurring = false;
    }

    public CustomSheetPaymentInfo(Parcel parcel) {
        this.addressInPaymentSheet = AddressInPaymentSheet.DO_NOT_SHOW;
        this.isCardHolderNameRequired = false;
        this.isRecurring = false;
        readFromParcel(parcel);
    }

    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new Parcelable.Creator<Address>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo.Address.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Address createFromParcel(Parcel parcel) {
                return new Address(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Address[] newArray(int i) {
                return new Address[i];
            }
        };
        protected static final String EXTRA_EMAIL_ADDRESS = "emailAddress";
        protected static final String KEY_ADDRESSEE = "addressee";
        protected static final String KEY_ADDRESS_LINE1 = "addressLine1";
        protected static final String KEY_ADDRESS_LINE2 = "addressLine2";
        protected static final String KEY_CITY = "city";
        protected static final String KEY_COUNTRY_CODE = "countryCode";
        protected static final String KEY_EXTRA_INFO = "extraAddressInfo";
        protected static final String KEY_PHONE_NUMBER = "phoneNumber";
        protected static final String KEY_POSTAL_CODE = "postalCode";
        protected static final String KEY_STATE = "state";
        protected static final String KEY_VERSION = "version";
        protected String addressLine1;
        protected String addressLine2;
        protected String addressee;
        protected String city;
        protected String countryCode;
        protected String email;
        protected Bundle extraAddressInfo;
        protected String phoneNumber;
        protected String postalCode;
        protected String state;
        protected String version;

        public static class a {
            protected String a;
            protected String b;
            protected String c;
            protected String d;
            protected String e;
            protected String f;
            protected String g;
            protected String h;
            protected Bundle i;
            protected String j;

            public Address a() {
                return new Address(this);
            }
        }

        public Address(Parcel parcel) {
            this.version = (String) parcel.readValue(String.class.getClassLoader());
            this.addressee = (String) parcel.readValue(String.class.getClassLoader());
            this.addressLine1 = (String) parcel.readValue(String.class.getClassLoader());
            this.addressLine2 = (String) parcel.readValue(String.class.getClassLoader());
            this.city = (String) parcel.readValue(String.class.getClassLoader());
            this.state = (String) parcel.readValue(String.class.getClassLoader());
            this.countryCode = (String) parcel.readValue(String.class.getClassLoader());
            this.postalCode = (String) parcel.readValue(String.class.getClassLoader());
            this.phoneNumber = (String) parcel.readValue(String.class.getClassLoader());
            Bundle readBundle = parcel.readBundle();
            this.extraAddressInfo = readBundle;
            if (readBundle != null) {
                this.email = readBundle.getString(EXTRA_EMAIL_ADDRESS);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAddressLine1() {
            return this.addressLine1;
        }

        public String getAddressLine2() {
            return this.addressLine2;
        }

        public String getAddressee() {
            return this.addressee;
        }

        public String getCity() {
            return this.city;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getEmail() {
            return this.email;
        }

        public Bundle getExtraAddressInfo() {
            return this.extraAddressInfo;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPostalCode() {
            return this.postalCode;
        }

        public String getState() {
            return this.state;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("version", this.version);
            bundle.putString(KEY_ADDRESSEE, this.addressee);
            bundle.putString(KEY_ADDRESS_LINE1, this.addressLine1);
            bundle.putString(KEY_ADDRESS_LINE2, this.addressLine2);
            bundle.putString(KEY_CITY, this.city);
            bundle.putString("state", this.state);
            bundle.putString(KEY_COUNTRY_CODE, this.countryCode);
            bundle.putString(KEY_POSTAL_CODE, this.postalCode);
            bundle.putString(KEY_PHONE_NUMBER, this.phoneNumber);
            if (this.extraAddressInfo == null) {
                this.extraAddressInfo = new Bundle();
            }
            this.extraAddressInfo.putString(EXTRA_EMAIL_ADDRESS, this.email);
            bundle.putBundle(KEY_EXTRA_INFO, this.extraAddressInfo);
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeValue(this.version);
            parcel.writeValue(this.addressee);
            parcel.writeValue(this.addressLine1);
            parcel.writeValue(this.addressLine2);
            parcel.writeValue(this.city);
            parcel.writeValue(this.state);
            parcel.writeValue(this.countryCode);
            parcel.writeValue(this.postalCode);
            parcel.writeValue(this.phoneNumber);
            parcel.writeBundle(this.extraAddressInfo);
        }

        public Address() {
        }

        private Address(a aVar) {
            this.version = SpaySdk.c();
            this.addressee = aVar.a;
            this.addressLine1 = aVar.b;
            this.addressLine2 = aVar.c;
            this.city = aVar.d;
            this.state = aVar.e;
            this.countryCode = aVar.f;
            this.postalCode = aVar.g;
            this.phoneNumber = aVar.h;
            this.extraAddressInfo = aVar.i;
            this.email = aVar.j;
        }
    }
}
