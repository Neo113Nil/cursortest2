package xsna;

import android.view.ViewGroup;

/* compiled from: MarketMultiPickerPageController.kt */
/* loaded from: classes18.dex */
public final class wrn0 {
    public final int a;
    public final int b;
    public final izs<ViewGroup, ViewGroup> c;

    /* JADX WARN: Multi-variable type inference failed */
    public wrn0(int i, int i2, izs<? super ViewGroup, ? extends ViewGroup> izsVar) {
        this.a = i;
        this.b = i2;
        this.c = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrn0)) {
            return false;
        }
        wrn0 wrn0Var = (wrn0) obj;
        return this.a == wrn0Var.a && this.b == wrn0Var.b && this.c.equals(wrn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tab(id=");
        sb.append(this.a);
        sb.append(", titleRes=");
        sb.append(this.b);
        sb.append(", factory=");
        return up.c(sb, this.c, ')');
    }
}
