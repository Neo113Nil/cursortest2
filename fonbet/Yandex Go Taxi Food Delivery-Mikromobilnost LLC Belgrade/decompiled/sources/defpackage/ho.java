package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ho extends nr {
    public final ArrayList a;
    public final String b;
    public final List c;

    public ho(String str, ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return this.a.equals(hoVar.a) && jl40.l(this.b, hoVar.b) && jl40.l(this.c, hoVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionTips(choices=");
        sb.append(this.a);
        sb.append(", selectedChoiceId=");
        sb.append(this.b);
        sb.append(", availablePaymentTypes=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
