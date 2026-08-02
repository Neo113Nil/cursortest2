package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class CustomSheet implements Parcelable {
    public static final Parcelable.Creator<CustomSheet> CREATOR = new Parcelable.Creator<CustomSheet>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomSheet createFromParcel(Parcel parcel) {
            return new CustomSheet(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomSheet[] newArray(int i) {
            return new CustomSheet[i];
        }
    };
    private static final String TAG = "CustomSheet";
    private List<SheetControl> sheetControls;

    public CustomSheet(Parcel parcel) {
        this.sheetControls = new ArrayList();
        this.sheetControls = parcel.createTypedArrayList(SheetControl.CREATOR);
    }

    public void addControl(int i, SheetControl sheetControl) {
        if (sheetControl == null) {
            ny61.t("addControl : You must set sheetControl.");
            return;
        }
        if (i < 0 || i > this.sheetControls.size()) {
            ny61.g("addItem : there is abnormal location.");
            return;
        }
        if (getSheetControl(sheetControl.getControlId()) != null) {
            ny61.g("addControl : same id is used.");
            return;
        }
        if (sheetControl.getControltype() == SheetControl.Controltype.AMOUNTBOX) {
            AmountBoxControl amountBoxControl = (AmountBoxControl) sheetControl;
            int size = amountBoxControl.getItems().size() - 1;
            if (size < 0) {
                ny61.g("addControl : No data in AmountBoxControl.");
                return;
            } else if (!amountBoxControl.getItems().get(size).getSheetItemType().equals(SheetItemType.AMOUNT_TOTAL)) {
                ny61.g("AMOUNT_TOTAL type must be the last item in AmountBoxControl.");
                return;
            }
        }
        this.sheetControls.add(i, sheetControl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SheetControl getSheetControl(String str) {
        if (str == null) {
            ny61.t("getSheetControl : You must set controlId.");
            return null;
        }
        for (SheetControl sheetControl : this.sheetControls) {
            if (str.equals(sheetControl.getControlId())) {
                return sheetControl;
            }
        }
        return null;
    }

    public List<SheetControl> getSheetControls() {
        return this.sheetControls;
    }

    public boolean removeControl(SheetControl sheetControl) {
        if (sheetControl == null) {
            ny61.t("removeControl : You must set sheetControl.");
            return false;
        }
        if (sheetControl.getControltype() == SheetControl.Controltype.AMOUNTBOX) {
            ny61.g("AmountBoxControl must not be deleted.");
            return false;
        }
        if (sheetControl.getControltype() == SheetControl.Controltype.ADDRESS) {
            ny61.g("AddressControl must not be deleted.");
            return false;
        }
        if (this.sheetControls != null) {
            for (int i = 0; i < this.sheetControls.size(); i++) {
                if (sheetControl.equals(this.sheetControls.get(i))) {
                    this.sheetControls.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean updateControl(SheetControl sheetControl) {
        if (sheetControl == null) {
            ny61.t("updateControl : You must set sheetControl.");
            return false;
        }
        if (this.sheetControls != null) {
            for (int i = 0; i < this.sheetControls.size(); i++) {
                if (sheetControl.equals(this.sheetControls.get(i))) {
                    this.sheetControls.set(i, sheetControl);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.sheetControls);
    }

    public CustomSheet() {
        this.sheetControls = new ArrayList();
    }

    public void addControl(SheetControl sheetControl) {
        addControl(this.sheetControls.size(), sheetControl);
    }
}
