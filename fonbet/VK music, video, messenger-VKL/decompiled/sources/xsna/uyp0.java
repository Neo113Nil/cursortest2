package xsna;

import java.util.ArrayList;

/* compiled from: UiCropState.kt */
/* loaded from: classes4.dex */
public final class uyp0 {
    public final ArrayList a;
    public final int b;

    public uyp0(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyp0)) {
            return false;
        }
        uyp0 uyp0Var = (uyp0) obj;
        return this.a.equals(uyp0Var.a) && this.b == uyp0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiCropState(cropFormats=" + this.a + ", selectedPosition=" + this.b + ")";
    }
}
