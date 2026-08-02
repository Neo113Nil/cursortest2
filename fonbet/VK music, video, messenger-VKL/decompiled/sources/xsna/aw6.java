package xsna;

import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;

/* compiled from: BeautyAction.kt */
/* loaded from: classes7.dex */
public abstract class aw6 {

    /* compiled from: BeautyAction.kt */
    public static final class a extends aw6 {
        public static final a a = new a();
    }

    /* compiled from: BeautyAction.kt */
    public static final class b extends aw6 {
        public static final b a = new b();
    }

    /* compiled from: BeautyAction.kt */
    public static final class c extends aw6 {
        public static final c a = new c();
    }

    /* compiled from: BeautyAction.kt */
    public static final class d extends aw6 {
        public final BeautyFilterIntensity a;

        public d(BeautyFilterIntensity beautyFilterIntensity) {
            this.a = beautyFilterIntensity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetIntensity(intensity=" + this.a + ')';
        }
    }
}
