package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItem;
import defpackage.ny61;

/* loaded from: classes11.dex */
public class PlainTextControl extends SheetControl implements Parcelable {
    public static final Parcelable.Creator<PlainTextControl> CREATOR = new Parcelable.Creator<PlainTextControl>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.PlainTextControl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlainTextControl createFromParcel(Parcel parcel) {
            parcel.readParcelable(SheetControl.Controltype.class.getClassLoader());
            return new PlainTextControl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlainTextControl[] newArray(int i) {
            return new PlainTextControl[i];
        }
    };
    private static final String TAG = "PlainTextControl";
    private SheetItem sheetItem;

    public PlainTextControl(Parcel parcel) {
        super(parcel);
        this.sheetItem = (SheetItem) parcel.readParcelable(SheetItem.class.getClassLoader());
        setControltype(SheetControl.Controltype.PLAINTEXT);
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SheetItem getItem() {
        return this.sheetItem;
    }

    public String getText() {
        SheetItem sheetItem = this.sheetItem;
        if (sheetItem == null) {
            return null;
        }
        return sheetItem.getSValue();
    }

    public String getTitle() {
        SheetItem sheetItem = this.sheetItem;
        if (sheetItem == null) {
            return null;
        }
        return sheetItem.getTitle();
    }

    public void setText(String str, String str2) {
        if (str2 != null) {
            this.sheetItem = new SheetItem.a().j("").m(str).k(str2).g();
        } else {
            ny61.t("setText : You must set text.");
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.sheetItem, i);
    }

    public PlainTextControl(String str) {
        super(SheetControl.Controltype.PLAINTEXT);
        setControlId(str);
    }
}
