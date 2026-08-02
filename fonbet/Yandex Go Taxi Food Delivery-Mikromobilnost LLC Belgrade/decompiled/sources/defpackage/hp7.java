package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hp7 implements ip7 {
    public final FormattedText a;
    public final String b;
    public final o33 c;
    public final ArrayList d;
    public final ht10 e;

    public hp7(FormattedText formattedText, String str, o33 o33Var, ArrayList arrayList, ht10 ht10Var) {
        this.a = formattedText;
        this.b = str;
        this.c = o33Var;
        this.d = arrayList;
        this.e = ht10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hp7) {
            hp7 hp7Var = (hp7) obj;
            return this.a.equals(hp7Var.a) && jl40.l(this.b, hp7Var.b) && jl40.l(this.c, hp7Var.c) && this.d.equals(hp7Var.d) && this.e == hp7Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.a.hashCode() * 31, 31, this.b);
        o33 o33Var = this.c;
        return this.e.hashCode() + ly3.b((b + (o33Var == null ? 0 : o33Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "ArBoxesConfig(title=" + this.a + ", surfaceScanText=" + this.b + ", initialBoxSize=" + this.c + ", boxSizes=" + this.d + ", idsFlow=" + this.e + Extension.C_BRAKE;
    }
}
