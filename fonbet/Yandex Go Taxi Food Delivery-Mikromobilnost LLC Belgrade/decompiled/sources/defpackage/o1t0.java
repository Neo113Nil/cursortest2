package defpackage;

import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o1t0 {
    public final View a;
    public final a2t0 b;

    public o1t0(View view, a2t0 a2t0Var) {
        this.a = view;
        this.b = a2t0Var;
    }

    public final a2t0 a() {
        return this.b;
    }

    public final View b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1t0)) {
            return false;
        }
        o1t0 o1t0Var = (o1t0) obj;
        return this.a.equals(o1t0Var.a) && this.b.equals(o1t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SnappingCandidate(view=" + this.a + ", item=" + this.b + Extension.C_BRAKE;
    }
}
