package xsna;

import java.util.List;

/* compiled from: CreateReviewTypeHintConfig.kt */
/* loaded from: classes18.dex */
public final class dak {
    public final float a;
    public final int b;
    public final int c;
    public final List<String> d;

    public dak(float f, int i, int i2, List<String> list) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dak)) {
            return false;
        }
        dak dakVar = (dak) obj;
        return Float.compare(this.a, dakVar.a) == 0 && this.b == dakVar.b && this.c == dakVar.c && epx.f(this.d, dakVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateReviewTypeHintConfig(progress=");
        sb.append(this.a);
        sb.append(", minTextLength=");
        sb.append(this.b);
        sb.append(", maxTextLength=");
        sb.append(this.c);
        sb.append(", textHints=");
        return ms9.a(')', sb, this.d);
    }
}
