package defpackage;

import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class idx0 implements ldx0 {
    public final String a;
    public final VisibilityChangeOrigin b;

    public idx0(String str, VisibilityChangeOrigin visibilityChangeOrigin) {
        this.a = str;
        this.b = visibilityChangeOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idx0)) {
            return false;
        }
        idx0 idx0Var = (idx0) obj;
        return jl40.l(this.a, idx0Var.a) && this.b == idx0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoneAnimated(text=" + this.a + ", origin=" + this.b + Extension.C_BRAKE;
    }
}
