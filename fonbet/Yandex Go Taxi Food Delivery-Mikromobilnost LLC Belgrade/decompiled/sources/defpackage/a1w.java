package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a1w {
    public final int a;
    public final ArrayList b;

    public a1w(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1w)) {
            return false;
        }
        a1w a1wVar = (a1w) obj;
        return this.a == a1wVar.a && this.b.equals(a1wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InputValue(minInputValue=" + this.a + ", inputValueSteps=" + this.b + Extension.C_BRAKE;
    }
}
