package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class SheetItem implements Parcelable {
    public static final Parcelable.Creator<SheetItem> CREATOR = new Parcelable.Creator<SheetItem>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SheetItem createFromParcel(Parcel parcel) {
            return new SheetItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SheetItem[] newArray(int i) {
            return new SheetItem[i];
        }
    };
    private double dValue;
    private Bundle extraValue;
    private String id;
    private String sValue;
    private SheetItemType sheetItemType;
    private String title;

    public static class a {
        private String a;
        private String b;
        private String c;
        private double d;
        private SheetItemType e;
        private Bundle f;

        public SheetItem g() {
            return new SheetItem(this);
        }

        public a h(double d) {
            this.d = d;
            return this;
        }

        public a i(Bundle bundle) {
            this.f = bundle;
            return this;
        }

        public a j(String str) {
            this.a = str;
            return this;
        }

        public a k(String str) {
            this.c = str;
            return this;
        }

        public a l(SheetItemType sheetItemType) {
            this.e = sheetItemType;
            return this;
        }

        public a m(String str) {
            this.b = str;
            return this;
        }
    }

    public SheetItem(Parcel parcel) {
        this.id = parcel.readString();
        this.title = parcel.readString();
        this.sValue = parcel.readString();
        this.dValue = parcel.readDouble();
        this.sheetItemType = (SheetItemType) parcel.readParcelable(SheetItemType.class.getClassLoader());
        this.extraValue = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((SheetItem) obj).id);
    }

    public double getDValue() {
        return this.dValue;
    }

    public Bundle getExtraValue() {
        return this.extraValue;
    }

    public String getId() {
        return this.id;
    }

    public String getSValue() {
        return this.sValue;
    }

    public SheetItemType getSheetItemType() {
        return this.sheetItemType;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "SheetItem{extraValue=" + this.extraValue + ", id='" + this.id + "', title='" + this.title + "', sValue='" + this.sValue + "', dValue='" + this.dValue + "', sheetItemType=" + this.sheetItemType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.sValue);
        parcel.writeDouble(this.dValue);
        parcel.writeParcelable(this.sheetItemType, i);
        parcel.writeBundle(this.extraValue);
    }

    private SheetItem(a aVar) {
        this.id = aVar.a;
        this.title = aVar.b;
        this.sValue = aVar.c;
        this.dValue = aVar.d;
        this.sheetItemType = aVar.e;
        this.extraValue = aVar.f;
    }
}
