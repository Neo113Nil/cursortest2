package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Alignment;
import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Ellipsize;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class f510 {
    public final MasstransitSlotItemUiState$Body$Alignment a;
    public final int b;
    public final int c;
    public final MasstransitSlotItemUiState$Body$Ellipsize d;
    public final MasstransitSlotItemUiState$Body$Ellipsize e;

    public f510(MasstransitSlotItemUiState$Body$Alignment masstransitSlotItemUiState$Body$Alignment, int i, int i2, MasstransitSlotItemUiState$Body$Ellipsize masstransitSlotItemUiState$Body$Ellipsize, MasstransitSlotItemUiState$Body$Ellipsize masstransitSlotItemUiState$Body$Ellipsize2) {
        this.a = masstransitSlotItemUiState$Body$Alignment;
        this.b = i;
        this.c = i2;
        this.d = masstransitSlotItemUiState$Body$Ellipsize;
        this.e = masstransitSlotItemUiState$Body$Ellipsize2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f510)) {
            return false;
        }
        f510 f510Var = (f510) obj;
        return this.a == f510Var.a && this.b == f510Var.b && this.c == f510Var.c && this.d == f510Var.d && this.e == f510Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "Parameters(alignment=" + this.a + ", textMaxLines=" + this.b + ", subtextMaxLines=" + this.c + ", textEllipsizeMode=" + this.d + ", subtextEllipsizeMode=" + this.e + Extension.C_BRAKE;
    }
}
