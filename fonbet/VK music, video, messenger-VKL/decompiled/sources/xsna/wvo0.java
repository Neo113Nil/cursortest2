package xsna;

import java.util.ArrayList;

/* compiled from: ViewState.kt */
/* loaded from: classes7.dex */
public final class wvo0 {
    public final ArrayList a;
    public final int b;

    public wvo0(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvo0)) {
            return false;
        }
        wvo0 wvo0Var = (wvo0) obj;
        return this.a.equals(wvo0Var.a) && this.b == wvo0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeZonePickerViewState(items=");
        sb.append(this.a);
        sb.append(", selectedItemPosition=");
        return vu5.b(sb, this.b, ')');
    }
}
