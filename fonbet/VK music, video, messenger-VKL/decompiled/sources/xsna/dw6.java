package xsna;

import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;

/* compiled from: BeautyFeatureState.kt */
/* loaded from: classes7.dex */
public abstract class dw6 {

    /* compiled from: BeautyFeatureState.kt */
    public static final class a extends dw6 {
        public static final a a = new a();
    }

    /* compiled from: BeautyFeatureState.kt */
    public static final class b extends dw6 {
        public final BeautyFilterIntensity a;
        public final BeautyFilterIntensity b;

        public b(BeautyFilterIntensity beautyFilterIntensity, BeautyFilterIntensity beautyFilterIntensity2) {
            this.a = beautyFilterIntensity;
            this.b = beautyFilterIntensity2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Ready(initialIntensity=" + this.a + ", selectedIntensity=" + this.b + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b() {
            this(r0, r0);
            BeautyFilterIntensity beautyFilterIntensity = BeautyFilterIntensity.DISABLED;
        }
    }
}
