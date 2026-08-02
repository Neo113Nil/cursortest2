package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gy7 {
    public final String a;
    public final boolean b;
    public final ArrayList c;

    public gy7(String str, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        return this.a.equals(gy7Var.a) && this.b == gy7Var.b && this.c.equals(gy7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, oo31.l("CancelReasonsV2UiState(title=", this.a, ", isCommentFieldVisible=", ", reasons=", this.b), this.c);
    }
}
