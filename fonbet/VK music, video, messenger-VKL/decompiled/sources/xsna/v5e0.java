package xsna;

import com.vk.music.bottomsheets.promo.presentation.model.PromoInfo;

/* compiled from: PromoPatch.kt */
/* loaded from: classes3.dex */
public interface v5e0 extends xl50 {

    /* compiled from: PromoPatch.kt */
    public static final class a implements v5e0 {
        public final PromoInfo b;

        public a(PromoInfo promoInfo) {
            this.b = promoInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loaded(promoInfo=" + this.b + ')';
        }
    }
}
