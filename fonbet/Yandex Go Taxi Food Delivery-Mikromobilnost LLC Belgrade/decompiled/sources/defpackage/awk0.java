package defpackage;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;

/* loaded from: classes.dex */
public final class awk0 {
    public final int a;

    public static String a(int i) {
        return i == 0 ? PlusPayUiKitInflaterFactory.NAME_BUTTON : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awk0) {
            return this.a == ((awk0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
