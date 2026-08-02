package xsna;

/* compiled from: Border.kt */
/* loaded from: classes11.dex */
public final class l18 {
    public aa2 a;
    public d52 b;
    public er9 c;
    public androidx.compose.ui.graphics.a d;

    public l18() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l18)) {
            return false;
        }
        l18 l18Var = (l18) obj;
        return epx.f(this.a, l18Var.a) && epx.f(this.b, l18Var.b) && epx.f(this.c, l18Var.c) && epx.f(this.d, l18Var.d);
    }

    public final int hashCode() {
        aa2 aa2Var = this.a;
        int hashCode = (aa2Var == null ? 0 : aa2Var.hashCode()) * 31;
        d52 d52Var = this.b;
        int hashCode2 = (hashCode + (d52Var == null ? 0 : d52Var.hashCode())) * 31;
        er9 er9Var = this.c;
        int hashCode3 = (hashCode2 + (er9Var == null ? 0 : er9Var.hashCode())) * 31;
        androidx.compose.ui.graphics.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public l18(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
