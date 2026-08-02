package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItem;
import defpackage.etr0;
import defpackage.ny61;

/* loaded from: classes11.dex */
public class AddressControl extends SheetControl implements Parcelable {
    public static final Parcelable.Creator<AddressControl> CREATOR = new Parcelable.Creator<AddressControl>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.AddressControl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddressControl createFromParcel(Parcel parcel) {
            parcel.readParcelable(SheetControl.Controltype.class.getClassLoader());
            return new AddressControl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddressControl[] newArray(int i) {
            return new AddressControl[i];
        }
    };
    private static final String EXTRA_DISPLAY_OPTION = "extra_display_option";
    private static final String TAG = "AddressControl";
    private CustomSheetPaymentInfo.Address address;
    private int displayOption;
    private int errorCode;
    private SheetItem sheetItem;
    private etr0 sheetUpdatedListener;

    public AddressControl(Parcel parcel) {
        super(parcel);
        this.errorCode = parcel.readInt();
        this.sheetItem = (SheetItem) parcel.readParcelable(SheetItem.class.getClassLoader());
        this.address = (CustomSheetPaymentInfo.Address) parcel.readParcelable(CustomSheetPaymentInfo.Address.class.getClassLoader());
        if (this.sheetItem.getExtraValue() != null) {
            this.displayOption = this.sheetItem.getExtraValue().getInt(EXTRA_DISPLAY_OPTION);
        }
        setControltype(SheetControl.Controltype.ADDRESS);
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustomSheetPaymentInfo.Address getAddress() {
        return this.address;
    }

    public String getAddressTitle() {
        return this.sheetItem.getTitle();
    }

    public SheetItemType getAddressType() {
        return this.sheetItem.getSheetItemType();
    }

    public int getDisplayOption() {
        return this.displayOption;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public SheetItem getSheetItem() {
        return this.sheetItem;
    }

    public etr0 getSheetUpdatedListener() {
        return null;
    }

    public void setAddress(CustomSheetPaymentInfo.Address address) {
        this.address = address;
    }

    public void setAddressTitle(String str) {
        if (str == null) {
            ny61.t("setAddressTitle : You must set title");
        } else {
            SheetItem sheetItem = this.sheetItem;
            this.sheetItem = new SheetItem.a().j(sheetItem.getId()).m(str).l(sheetItem.getSheetItemType()).i(sheetItem.getExtraValue()).g();
        }
    }

    public void setDisplayOption(int i) {
        if (this.sheetItem.getSheetItemType() != SheetItemType.SHIPPING_ADDRESS) {
            ny61.g("setDisplayOption : sheetItemType must be either SHIPPING_ADDRESS.");
            return;
        }
        this.displayOption = i;
        SheetItem sheetItem = this.sheetItem;
        Bundle bundle = new Bundle(sheetItem.getExtraValue());
        bundle.putInt(EXTRA_DISPLAY_OPTION, i);
        this.sheetItem = new SheetItem.a().j(sheetItem.getId()).m(sheetItem.getTitle()).l(sheetItem.getSheetItemType()).i(bundle).g();
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setSheetUpdatedListener(etr0 etr0Var) {
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.errorCode);
        parcel.writeParcelable(this.sheetItem, i);
        parcel.writeParcelable(this.address, i);
    }

    public AddressControl(String str, SheetItemType sheetItemType) {
        super(SheetControl.Controltype.ADDRESS);
        setControlId(str);
        if (sheetItemType != null && (sheetItemType.equals(SheetItemType.BILLING_ADDRESS) || sheetItemType.equals(SheetItemType.SHIPPING_ADDRESS))) {
            this.sheetItem = new SheetItem.a().l(sheetItemType).i(new Bundle()).g();
        } else {
            ny61.g("AddressControl : sheetItemType must be either BILLING_ADDRESS or SHIPPING_ADDRESS.");
            throw null;
        }
    }
}
