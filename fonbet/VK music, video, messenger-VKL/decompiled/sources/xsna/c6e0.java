package xsna;

import com.vk.music.bottomsheets.promo.presentation.model.PromoInfo;

/* compiled from: PromoState.kt */
/* loaded from: classes3.dex */
public final class c6e0 implements km50 {
    public final PromoInfo b;

    public c6e0(PromoInfo promoInfo) {
        this.b = promoInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6e0) && epx.f(this.b, ((c6e0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PromoState(promoInfo=" + this.b + ')';
    }
}
