package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItem;
import defpackage.etr0;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class SpinnerControl extends SheetControl implements Parcelable {
    public static final Parcelable.Creator<SpinnerControl> CREATOR = new Parcelable.Creator<SpinnerControl>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.SpinnerControl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpinnerControl createFromParcel(Parcel parcel) {
            parcel.readParcelable(SheetControl.Controltype.class.getClassLoader());
            return new SpinnerControl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpinnerControl[] newArray(int i) {
            return new SpinnerControl[i];
        }
    };
    private static final String TAG = "SpinnerControl";
    private List<SheetItem> items;
    private String selectedItemId;
    private etr0 sheetUpdatedListener;

    public SpinnerControl(String str, String str2, SheetItemType sheetItemType) {
        super(SheetControl.Controltype.SPINNER);
        this.items = new ArrayList();
        setControlId(str);
        if (str2 == null) {
            ny61.t("SpinnerControl : You must set title.");
            throw null;
        }
        if (sheetItemType != SheetItemType.SHIPPING_METHOD_SPINNER && sheetItemType != SheetItemType.INSTALLMENT_SPINNER) {
            ny61.g("SpinnerControl : sheetItemType must be either SHIPPING_METHOD_SPINNER or INSTALLMENT_SPINNER.");
            throw null;
        }
        this.items.add(new SheetItem.a().j("").m(str2).l(sheetItemType).g());
    }

    private int getIndex(int i, String str) {
        while (i < this.items.size()) {
            if (str.equals(this.items.get(i).getId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void addItem(int i, String str, String str2) {
        if (existItem(str)) {
            ny61.g("addItem : same ID is used.");
            return;
        }
        if (str2 == null) {
            ny61.t("addItem : You must set value.");
        } else if (i < 0 || i > this.items.size() - 1) {
            ny61.g("addItem : location is abnormal.");
        } else {
            this.items.add(i + 1, new SheetItem.a().j(str).k(str2).g());
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean existItem(String str) {
        if (str != null) {
            return getIndex(1, str) > -1;
        }
        ny61.t("existItem : You must set ID.");
        return false;
    }

    public List<SheetItem> getItems() {
        return this.items;
    }

    public String getSelectedItemId() {
        return this.selectedItemId;
    }

    public etr0 getSheetUpdatedListener() {
        return null;
    }

    public String getTitle() {
        return this.items.get(0).getTitle();
    }

    public void removeItem(String str) {
        if (str == null) {
            ny61.t("removeItem : You must set id.");
            return;
        }
        int index = getIndex(1, str);
        if (index >= 0) {
            this.items.remove(index);
        } else {
            ny61.g("removeItem : There is no item associated with the ID.");
        }
    }

    public void setSelectedItemId(String str) {
        if (existItem(str)) {
            this.selectedItemId = str;
        } else {
            ny61.g("setSelectedItemId : There is no item associated with the ID.");
        }
    }

    public void setSheetUpdatedListener(etr0 etr0Var) {
    }

    public void setTitle(String str) {
        if (str == null) {
            ny61.t("setTitle : You must set spinner title");
        } else {
            this.items.set(0, new SheetItem.a().j("").m(str).l(this.items.get(0).getSheetItemType()).g());
        }
    }

    public void updateItem(String str, String str2) {
        if (str == null) {
            ny61.t("updateItem : You must set ID.");
            return;
        }
        if (str2 == null) {
            ny61.t("addItem : You must set value.");
            return;
        }
        int index = getIndex(1, str);
        if (index <= -1) {
            ny61.g("updateItem : There is no item associated with the ID.");
        } else {
            this.items.set(index, new SheetItem.a().j(str).k(str2).g());
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.items);
        parcel.writeString(this.selectedItemId);
    }

    public void addItem(String str, String str2) {
        addItem(this.items.size() - 1, str, str2);
    }

    public SpinnerControl(Parcel parcel) {
        super(parcel);
        this.items = new ArrayList();
        this.items = parcel.createTypedArrayList(SheetItem.CREATOR);
        this.selectedItemId = parcel.readString();
        setControltype(SheetControl.Controltype.SPINNER);
    }
}
