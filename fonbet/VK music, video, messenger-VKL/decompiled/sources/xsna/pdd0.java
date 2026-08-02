package xsna;

import com.vk.dto.donut.DonutLevel;
import java.util.List;

/* compiled from: PrivacyEditDonutLevelsViewState.kt */
/* loaded from: classes18.dex */
public interface pdd0 extends fm50<rdd0> {

    /* compiled from: PrivacyEditDonutLevelsViewState.kt */
    public static final class a implements pdd0 {
        public final yzt0<List<DonutLevel>> a;
        public final yzt0<DonutLevel> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    /* compiled from: PrivacyEditDonutLevelsViewState.kt */
    public static final class b implements pdd0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 519408949;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
