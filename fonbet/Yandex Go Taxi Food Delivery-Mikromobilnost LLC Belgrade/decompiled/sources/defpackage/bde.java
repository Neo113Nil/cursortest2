package defpackage;

import androidx.recyclerview.widget.x0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bde {
    public final int a;
    public final x0 b;

    public bde(x0 x0Var, int i) {
        this.a = i;
        this.b = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bde)) {
            return false;
        }
        bde bdeVar = (bde) obj;
        return this.a == bdeVar.a && this.b.equals(bdeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CurrentHeader(position=" + this.a + ", viewHolder=" + this.b + Extension.C_BRAKE;
    }
}
