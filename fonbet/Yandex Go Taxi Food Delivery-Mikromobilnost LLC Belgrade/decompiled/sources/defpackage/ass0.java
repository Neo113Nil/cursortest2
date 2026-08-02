package defpackage;

import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ass0 {
    public final SlotItemUiState$Body$Alignment a;
    public final int b;
    public final int c;
    public final SlotItemUiState$Body$Ellipsize d;
    public final SlotItemUiState$Body$Ellipsize e;

    public ass0(SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment, int i, int i2, SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize, SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize2) {
        this.a = slotItemUiState$Body$Alignment;
        this.b = i;
        this.c = i2;
        this.d = slotItemUiState$Body$Ellipsize;
        this.e = slotItemUiState$Body$Ellipsize2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ass0)) {
            return false;
        }
        ass0 ass0Var = (ass0) obj;
        return this.a == ass0Var.a && this.b == ass0Var.b && this.c == ass0Var.c && this.d == ass0Var.d && this.e == ass0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "Parameters(alignment=" + this.a + ", textMaxLines=" + this.b + ", subtextMaxLines=" + this.c + ", textEllipsizeMode=" + this.d + ", subtextEllipsizeMode=" + this.e + Extension.C_BRAKE;
    }
}
