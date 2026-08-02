package defpackage;

import com.yandex.go.design.compose.ratingbar.RatingBarStarStyle$AnimationParams$AnimationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e8i0 {
    public final RatingBarStarStyle$AnimationParams$AnimationType a = RatingBarStarStyle$AnimationParams$AnimationType.ONE_SELECTED;
    public final h8i0 b = f8i0.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8i0)) {
            return false;
        }
        e8i0 e8i0Var = (e8i0) obj;
        return this.a == e8i0Var.a && jl40.l(this.b, e8i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Enabled(animationType=" + this.a + ", lottieParams=" + this.b + Extension.C_BRAKE;
    }
}
