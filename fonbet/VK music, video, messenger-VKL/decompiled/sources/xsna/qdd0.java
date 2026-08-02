package xsna;

import com.vk.dto.donut.DonutLevel;

/* compiled from: PrivacyEditDonutLevelsSideEffect.kt */
/* loaded from: classes18.dex */
public interface qdd0 {

    /* compiled from: PrivacyEditDonutLevelsSideEffect.kt */
    public static final class a implements qdd0 {
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
            return "CloseWithResult(selectedLevel=" + this.a + ')';
        }
    }
}
