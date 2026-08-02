package xsna;

import com.vk.dto.donut.DonutLevel;

/* compiled from: PrivacyEditBottomSheetSideEffect.kt */
/* loaded from: classes18.dex */
public interface wcd0 {

    /* compiled from: PrivacyEditBottomSheetSideEffect.kt */
    public static final class a implements wcd0 {
        public final DonutLevel a;

        public a(DonutLevel donutLevel) {
            this.a = donutLevel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Save(donutLevel=" + this.a + ')';
        }
    }
}
