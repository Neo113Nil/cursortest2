package com.samsung.android.sdk.samsungpay.v2.payment.sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItem;
import defpackage.ny61;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class AmountBoxControl extends SheetControl implements Parcelable {
    public static final Parcelable.Creator<AmountBoxControl> CREATOR = new Parcelable.Creator<AmountBoxControl>() { // from class: com.samsung.android.sdk.samsungpay.v2.payment.sheet.AmountBoxControl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AmountBoxControl createFromParcel(Parcel parcel) {
            parcel.readParcelable(SheetControl.Controltype.class.getClassLoader());
            return new AmountBoxControl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AmountBoxControl[] newArray(int i) {
            return new AmountBoxControl[i];
        }
    };
    private static final String TAG = "AmountBoxControl";
    private String currencyCode;
    private List<SheetItem> items;

    public AmountBoxControl(Parcel parcel) {
        super(parcel);
        this.items = new ArrayList();
        this.items = parcel.createTypedArrayList(SheetItem.CREATOR);
        this.currencyCode = parcel.readString();
        setControltype(SheetControl.Controltype.AMOUNTBOX);
    }

    private int getAmountTotalIndex() {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getSheetItemType() == SheetItemType.AMOUNT_TOTAL) {
                return i;
            }
        }
        return -1;
    }

    private int getItemIndex(String str) {
        for (int i = 0; i < this.items.size(); i++) {
            if (str.equals(this.items.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    private boolean hasAmountTotal() {
        return getAmountTotalIndex() > -1;
    }

    public void addItem(int i, String str, String str2, double d, String str3) {
        if (str == null) {
            ny61.t("addItem : You must set itemId.");
            return;
        }
        if (str2 == null) {
            ny61.t("addItem : You must set title.");
            return;
        }
        if (i < 0 || ((hasAmountTotal() && i >= this.items.size()) || (!hasAmountTotal() && i > this.items.size()))) {
            ny61.g("addItem : there is abnormal location");
        } else if (getItemIndex(str) > -1) {
            ny61.g("addItem : same id is used.");
        } else {
            this.items.add(i, new SheetItem.a().j(str).m(str2).h(d).k(str3).l(SheetItemType.AMOUNT_ITEM).g());
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean existItem(String str) {
        if (str != null) {
            return getItemIndex(str) > -1;
        }
        ny61.t("You must set id.");
        return false;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public List<SheetItem> getItems() {
        return this.items;
    }

    public double getValue(String str) {
        if (str == null) {
            ny61.t("You must set itemId.");
            return 0.0d;
        }
        int itemIndex = getItemIndex(str);
        if (itemIndex > -1) {
            return this.items.get(itemIndex).getDValue();
        }
        ny61.g("id is invalid.");
        return 0.0d;
    }

    public void removeItem(String str) {
        if (str == null) {
            ny61.t("removeItem : You must set itemId.");
            return;
        }
        int itemIndex = getItemIndex(str);
        if (itemIndex >= 0) {
            this.items.remove(itemIndex);
        } else {
            ny61.g("removeItem : there is no id.");
        }
    }

    public void setAmountTotal(double d, String str) {
        if (str == null || str.isEmpty()) {
            ny61.g("setAmountTotal : You must set displayOption.");
            return;
        }
        int amountTotalIndex = getAmountTotalIndex();
        SheetItem g = new SheetItem.a().j("").m("").h(d).k(str).l(SheetItemType.AMOUNT_TOTAL).g();
        List<SheetItem> list = this.items;
        if (amountTotalIndex > -1) {
            list.set(amountTotalIndex, g);
        } else {
            list.add(g);
        }
    }

    public void setCurrencyCode(String str) {
        if (str == null) {
            ny61.t("currencyCode is null");
            return;
        }
        Iterator<Currency> it = Currency.getAvailableCurrencies().iterator();
        while (it.hasNext()) {
            if (it.next().getCurrencyCode().equals(str)) {
                this.currencyCode = str;
                return;
            }
            continue;
        }
        ny61.g(str.concat(" is invalid currencyCode."));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AmountBoxControl{, items=");
        sb.append(this.items);
        sb.append(", currencyCode='");
        return oyr.t(sb, this.currencyCode, "'}");
    }

    public void updateTitle(String str, String str2) {
        if (str == null) {
            ny61.t("You must set itemId.");
            return;
        }
        int itemIndex = getItemIndex(str);
        if (itemIndex <= -1) {
            ny61.g("updateTitle : there are no items associated with the id.");
        } else {
            this.items.set(itemIndex, new SheetItem.a().j(str).m(str2).h(this.items.get(itemIndex).getDValue()).k(this.items.get(itemIndex).getSValue()).l(this.items.get(itemIndex).getSheetItemType()).g());
        }
    }

    public void updateValue(String str, double d) {
        if (str == null) {
            ny61.t("updateValue : You must set id.");
            return;
        }
        int itemIndex = getItemIndex(str);
        if (itemIndex <= -1) {
            ny61.g("updateValue : there are no items associated with the id.");
        } else {
            this.items.set(itemIndex, new SheetItem.a().j(str).m(this.items.get(itemIndex).getTitle()).h(d).k("").l(this.items.get(itemIndex).getSheetItemType()).g());
        }
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.items);
        parcel.writeString(this.currencyCode);
    }

    public AmountBoxControl(String str, String str2) {
        super(SheetControl.Controltype.AMOUNTBOX);
        this.items = new ArrayList();
        setControlId(str);
        setCurrencyCode(str2);
    }

    public void updateValue(String str, double d, String str2) {
        if (str != null) {
            int itemIndex = getItemIndex(str);
            if (itemIndex > -1) {
                this.items.set(itemIndex, new SheetItem.a().j(str).m(this.items.get(itemIndex).getTitle()).h(d).k(str2).l(this.items.get(itemIndex).getSheetItemType()).g());
                return;
            } else {
                ny61.g("updateValue : there are no items associated with the id.");
                return;
            }
        }
        ny61.t("updateValue : You must set id.");
    }

    public void addItem(String str, String str2, double d, String str3) {
        boolean hasAmountTotal = hasAmountTotal();
        List<SheetItem> list = this.items;
        if (hasAmountTotal) {
            addItem(list.size() - 1, str, str2, d, str3);
        } else {
            addItem(list.size(), str, str2, d, str3);
        }
    }
}
