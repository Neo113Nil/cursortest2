package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Deprecated
/* loaded from: classes11.dex */
public class PaymentInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentInfo> CREATOR = new Parcelable.Creator<PaymentInfo>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.PaymentInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentInfo createFromParcel(Parcel parcel) {
            return new PaymentInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PaymentInfo[] newArray(int i) {
            return new PaymentInfo[i];
        }
    };
    private AddressInPaymentSheet addressInPaymentSheet;
    private List<SpaySdk.Brand> allowedCardBrand;
    private Amount amount;
    private Address billingAddress;
    private SpaySdk.Brand cardBrand;
    private Bundle extraPaymentInfo;
    private boolean isCardHolderNameRequired;
    private boolean isGiftCardPurchase;
    private boolean isRecurring;
    private String merchantCountryCode;
    private String merchantId;
    private String merchantName;
    private String orderNumber;
    private PaymentProtocol paymentProtocol;
    private Address shippingAddress;
    private String version;

    @Deprecated
    public enum AddressInPaymentSheet implements Parcelable {
        DO_NOT_SHOW,
        NEED_BILLING_SPAY,
        NEED_SHIPPING_SPAY,
        SEND_SHIPPING,
        NEED_BILLING_SEND_SHIPPING,
        NEED_BILLING_AND_SHIPPING;

        public static final Parcelable.Creator<AddressInPaymentSheet> CREATOR = new Parcelable.Creator<AddressInPaymentSheet>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.PaymentInfo.AddressInPaymentSheet.1
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

        public static final Parcelable.Creator<PaymentProtocol> CREATOR = new Parcelable.Creator<PaymentProtocol>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.PaymentInfo.PaymentProtocol.1
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

    @Deprecated
    public static class a {
        private Amount a;
        private Address b;
        private Address c;
        private String d;
        private String e;
        private String f;
        private PaymentProtocol g;
        private AddressInPaymentSheet h;
        private List<SpaySdk.Brand> i = new ArrayList();
        private boolean j;
        private SpaySdk.Brand k;
        private boolean l;
        private boolean m;
        private String n;
        private Bundle o;
    }

    private PaymentInfo(a aVar) {
        AddressInPaymentSheet addressInPaymentSheet = AddressInPaymentSheet.DO_NOT_SHOW;
        this.addressInPaymentSheet = addressInPaymentSheet;
        this.isGiftCardPurchase = false;
        this.isCardHolderNameRequired = false;
        this.isRecurring = false;
        this.version = SpaySdk.c();
        this.amount = aVar.a;
        this.shippingAddress = aVar.b;
        this.billingAddress = aVar.c;
        this.merchantId = aVar.d;
        this.merchantName = aVar.e;
        this.orderNumber = aVar.f;
        this.paymentProtocol = aVar.g;
        this.addressInPaymentSheet = aVar.h != null ? aVar.h : addressInPaymentSheet;
        this.allowedCardBrand = aVar.i;
        this.isGiftCardPurchase = aVar.j;
        this.cardBrand = aVar.k;
        this.isCardHolderNameRequired = aVar.l;
        this.isRecurring = aVar.m;
        this.merchantCountryCode = aVar.n;
        this.extraPaymentInfo = aVar.o;
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

    public Amount getAmount() {
        return this.amount;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    @Deprecated
    public SpaySdk.Brand getCardBrand() {
        return this.cardBrand;
    }

    public Bundle getExtraPaymentInfo() {
        return this.extraPaymentInfo;
    }

    public boolean getIsCardHolderNameRequired() {
        return this.isCardHolderNameRequired;
    }

    public boolean getIsGiftCardPurchase() {
        return this.isGiftCardPurchase;
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
        return this.amount.currencyCode;
    }

    public PaymentProtocol getPaymentProtocol() {
        return this.paymentProtocol;
    }

    public Address getPaymentShippingAddress() {
        return this.shippingAddress;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
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
        this.amount = (Amount) parcel.readParcelable(Amount.class.getClassLoader());
        this.shippingAddress = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.billingAddress = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.merchantId = (String) parcel.readValue(String.class.getClassLoader());
        this.merchantName = (String) parcel.readValue(String.class.getClassLoader());
        this.orderNumber = (String) parcel.readValue(String.class.getClassLoader());
        this.paymentProtocol = (PaymentProtocol) parcel.readValue(PaymentProtocol.class.getClassLoader());
        this.addressInPaymentSheet = (AddressInPaymentSheet) parcel.readValue(AddressInPaymentSheet.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.allowedCardBrand = arrayList;
        parcel.readTypedList(arrayList, SpaySdk.Brand.CREATOR);
        this.isGiftCardPurchase = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.cardBrand = (SpaySdk.Brand) parcel.readValue(SpaySdk.Brand.class.getClassLoader());
        this.isCardHolderNameRequired = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.isRecurring = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.merchantCountryCode = (String) parcel.readValue(String.class.getClassLoader());
        this.extraPaymentInfo = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.version);
        parcel.writeParcelable(this.amount, 0);
        parcel.writeParcelable(this.shippingAddress, 0);
        parcel.writeParcelable(this.billingAddress, 0);
        parcel.writeValue(this.merchantId);
        parcel.writeValue(this.merchantName);
        parcel.writeValue(this.orderNumber);
        parcel.writeValue(this.paymentProtocol);
        parcel.writeValue(this.addressInPaymentSheet);
        parcel.writeTypedList(this.allowedCardBrand);
        parcel.writeValue(Boolean.valueOf(this.isGiftCardPurchase));
        parcel.writeValue(this.cardBrand);
        parcel.writeValue(Boolean.valueOf(this.isCardHolderNameRequired));
        parcel.writeValue(Boolean.valueOf(this.isRecurring));
        parcel.writeValue(this.merchantCountryCode);
        parcel.writeBundle(this.extraPaymentInfo);
    }

    @Deprecated
    public static class Amount implements Parcelable {
        public static final Parcelable.Creator<Amount> CREATOR = new Parcelable.Creator<Amount>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.PaymentInfo.Amount.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Amount createFromParcel(Parcel parcel) {
                return new Amount(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Amount[] newArray(int i) {
                return new Amount[i];
            }
        };
        private String currencyCode;
        private String itemTotalPrice;
        private String shippingPrice;
        private String tax;
        private String totalPrice;
        private String version;

        @Deprecated
        public static class a {
            private String a;
            private String b;
            private String c;
            private String d;
            private String e;
        }

        public Amount(Parcel parcel) {
            this.version = (String) parcel.readValue(String.class.getClassLoader());
            this.currencyCode = (String) parcel.readValue(String.class.getClassLoader());
            this.itemTotalPrice = (String) parcel.readValue(String.class.getClassLoader());
            this.tax = (String) parcel.readValue(String.class.getClassLoader());
            this.shippingPrice = (String) parcel.readValue(String.class.getClassLoader());
            this.totalPrice = (String) parcel.readValue(String.class.getClassLoader());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isValid(String str) {
            if (str == null) {
                return false;
            }
            return Double.parseDouble(str) >= 0.0d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public String getItemTotalPrice() {
            return this.itemTotalPrice;
        }

        public String getShippingPrice() {
            return this.shippingPrice;
        }

        public String getTax() {
            return this.tax;
        }

        public String getTotalPrice() {
            return this.totalPrice;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeValue(this.version);
            parcel.writeValue(this.currencyCode);
            parcel.writeValue(this.itemTotalPrice);
            parcel.writeValue(this.tax);
            parcel.writeValue(this.shippingPrice);
            parcel.writeValue(this.totalPrice);
        }

        private Amount() {
        }

        private Amount(a aVar) {
            this.version = SpaySdk.c();
            this.currencyCode = aVar.a;
            this.itemTotalPrice = aVar.b;
            this.tax = aVar.c;
            this.shippingPrice = aVar.d;
            this.totalPrice = aVar.e;
        }
    }

    @Deprecated
    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new Parcelable.Creator<Address>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.PaymentInfo.Address.1
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
        private String addressLine1;
        private String addressLine2;
        private String addressee;
        private String city;
        private String countryCode;
        private String postalCode;
        private String state;
        private String version;

        @Deprecated
        public static class a {
            private String a;
            private String b;
            private String c;
            private String d;
            private String e;
            private String f;
            private String g;
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

        public String getPostalCode() {
            return this.postalCode;
        }

        public String getState() {
            return this.state;
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
        }

        private Address() {
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
        }
    }

    private PaymentInfo() {
        this.addressInPaymentSheet = AddressInPaymentSheet.DO_NOT_SHOW;
        this.isGiftCardPurchase = false;
        this.isCardHolderNameRequired = false;
        this.isRecurring = false;
    }

    public PaymentInfo(Parcel parcel) {
        this.addressInPaymentSheet = AddressInPaymentSheet.DO_NOT_SHOW;
        this.isGiftCardPurchase = false;
        this.isCardHolderNameRequired = false;
        this.isRecurring = false;
        readFromParcel(parcel);
    }
}
