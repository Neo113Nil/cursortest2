package xsna;

import com.vk.voip.ui.call_options.source.list.ItemsFactory$Event;

/* compiled from: CallActionItem.kt */
/* loaded from: classes7.dex */
public final class d19 implements hfz {
    public final ItemsFactory$Event b;
    public final int c;
    public final int d;

    public d19(ItemsFactory$Event itemsFactory$Event, int i, int i2) {
        this.b = itemsFactory$Event;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d19)) {
            return false;
        }
        d19 d19Var = (d19) obj;
        return this.b == d19Var.b && this.c == d19Var.c && this.d == d19Var.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.h());
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallActionItem(event=");
        sb.append(this.b);
        sb.append(", iconRes=");
        sb.append(this.c);
        sb.append(", textRes=");
        return vu5.b(sb, this.d, ')');
    }
}
