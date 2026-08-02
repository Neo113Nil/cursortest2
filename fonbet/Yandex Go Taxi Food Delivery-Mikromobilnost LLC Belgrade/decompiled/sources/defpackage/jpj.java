package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeUiState$ButtonStatus;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeUiState$ButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jpj {
    public final CharSequence a;
    public final DiscountsAddPromoCodeUiState$ButtonStatus b;
    public final DiscountsAddPromoCodeUiState$ButtonType c;

    public jpj(String str, DiscountsAddPromoCodeUiState$ButtonStatus discountsAddPromoCodeUiState$ButtonStatus, DiscountsAddPromoCodeUiState$ButtonType discountsAddPromoCodeUiState$ButtonType) {
        this.a = str;
        this.b = discountsAddPromoCodeUiState$ButtonStatus;
        this.c = discountsAddPromoCodeUiState$ButtonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpj)) {
            return false;
        }
        jpj jpjVar = (jpj) obj;
        return jl40.l(this.a, jpjVar.a) && this.b == jpjVar.b && this.c == jpjVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonState(title=" + ((Object) this.a) + ", status=" + this.b + ", type=" + this.c + Extension.C_BRAKE;
    }
}
