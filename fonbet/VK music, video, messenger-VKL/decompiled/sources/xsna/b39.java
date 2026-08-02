package xsna;

import com.vk.voip.b;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;

/* compiled from: CallEffectsState.kt */
/* loaded from: classes11.dex */
public final class b39 {
    public final b.a a;
    public final BeautyFilterIntensity b;

    public b39() {
        this(0);
    }

    public static b39 a(b39 b39Var, b.a aVar, BeautyFilterIntensity beautyFilterIntensity, int i) {
        if ((i & 1) != 0) {
            aVar = b39Var.a;
        }
        if ((i & 2) != 0) {
            beautyFilterIntensity = b39Var.b;
        }
        b39Var.getClass();
        return new b39(aVar, beautyFilterIntensity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b39)) {
            return false;
        }
        b39 b39Var = (b39) obj;
        return epx.f(this.a, b39Var.a) && this.b == b39Var.b;
    }

    public final int hashCode() {
        b.a aVar = this.a;
        return this.b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        return "CallEffectsState(callEffect=" + this.a + ", beautyFilterIntensity=" + this.b + ')';
    }

    public b39(b.a aVar, BeautyFilterIntensity beautyFilterIntensity) {
        this.a = aVar;
        this.b = beautyFilterIntensity;
    }

    public /* synthetic */ b39(int i) {
        this(null, BeautyFilterIntensity.DISABLED);
    }
}
