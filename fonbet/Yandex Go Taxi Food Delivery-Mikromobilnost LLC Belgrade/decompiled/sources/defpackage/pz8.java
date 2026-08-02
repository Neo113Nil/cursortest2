package defpackage;

import com.yandex.go.summary.model.CarouselWithPositionUiState$CarouselPosition;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pz8 {
    public final hz8 a;
    public final CarouselWithPositionUiState$CarouselPosition b;

    public pz8(hz8 hz8Var, CarouselWithPositionUiState$CarouselPosition carouselWithPositionUiState$CarouselPosition) {
        this.a = hz8Var;
        this.b = carouselWithPositionUiState$CarouselPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz8)) {
            return false;
        }
        pz8 pz8Var = (pz8) obj;
        return jl40.l(this.a, pz8Var.a) && this.b == pz8Var.b;
    }

    public final int hashCode() {
        hz8 hz8Var = this.a;
        return this.b.hashCode() + ((hz8Var == null ? 0 : hz8Var.hashCode()) * 31);
    }

    public final String toString() {
        return "CarouselWithPositionUiState(carouselUiState=" + this.a + ", carouselPosition=" + this.b + Extension.C_BRAKE;
    }
}
