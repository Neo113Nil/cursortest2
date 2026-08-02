package defpackage;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ojy {
    public static final ojy f = new ojy(0);
    public final long a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;

    public ojy(int i) {
        this.a = 1500L;
        this.b = 0.3f;
        this.c = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.d = 51;
        this.e = 26;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojy)) {
            return false;
        }
        ojy ojyVar = (ojy) obj;
        return this.a == ojyVar.a && Float.compare(this.b, ojyVar.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.c == ojyVar.c && this.d == ojyVar.d && this.e == ojyVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + oyr.b(this.d, oyr.b(this.c, g8e.c(0.0f, g8e.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinesShimmerConfig(duration=");
        sb.append(this.a);
        sb.append(", widthRatio=");
        sb.append(this.b);
        sb.append(", angle=0.0, shimmerColor=");
        sb.append(this.c);
        sb.append(", centerAlpha=");
        sb.append(this.d);
        return b64.q(sb, ", edgeAlpha=", this.e, Extension.C_BRAKE);
    }

    public ojy() {
        this(0);
    }
}
