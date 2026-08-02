package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ny61;

/* loaded from: classes11.dex */
public class SheetControl implements Parcelable {
    public static final Parcelable.Creator<SheetControl> CREATOR = new Parcelable.Creator<SheetControl>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SheetControl createFromParcel(Parcel parcel) {
            int i = a.a[((Controltype) parcel.readParcelable(Controltype.class.getClassLoader())).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new SheetControl(parcel) : new SpinnerControl(parcel) : new AddressControl(parcel) : new AmountBoxControl(parcel) : new PlainTextControl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SheetControl[] newArray(int i) {
            return new SheetControl[i];
        }
    };
    private String controlId;
    private Controltype controltype;

    public enum Controltype implements Parcelable {
        PLAINTEXT,
        AMOUNTBOX,
        ADDRESS,
        SPINNER;

        public static final Parcelable.Creator<Controltype> CREATOR = new Parcelable.Creator<Controltype>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl.Controltype.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Controltype createFromParcel(Parcel parcel) {
                return Controltype.values()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Controltype[] newArray(int i) {
                return new Controltype[i];
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

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Controltype.values().length];
            a = iArr;
            try {
                iArr[Controltype.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Controltype.AMOUNTBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Controltype.ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Controltype.SPINNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SheetControl(Parcel parcel) {
        this.controlId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SheetControl sheetControl = (SheetControl) obj;
            String str = this.controlId;
            String str2 = sheetControl.controlId;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (this.controltype == sheetControl.controltype) {
                return true;
            }
        }
        return false;
    }

    public String getControlId() {
        return this.controlId;
    }

    public Controltype getControltype() {
        return this.controltype;
    }

    public int hashCode() {
        String str = this.controlId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Controltype controltype = this.controltype;
        return hashCode + (controltype != null ? controltype.hashCode() : 0);
    }

    public void setControlId(String str) {
        if (str == null || str.length() == 0) {
            ny61.g("setControlId : controlId is invalid.");
        } else {
            this.controlId = str;
        }
    }

    public void setControltype(Controltype controltype) {
        this.controltype = controltype;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.controltype, i);
        parcel.writeString(this.controlId);
    }

    public SheetControl(Controltype controltype) {
        this.controltype = controltype;
    }
}
