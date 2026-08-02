package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pwm {
    public final ArrayList a;
    public final ArrayList b;
    public final List c;

    public pwm(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwm)) {
            return false;
        }
        pwm pwmVar = (pwm) obj;
        return this.a.equals(pwmVar.a) && this.b.equals(pwmVar.b) && jl40.l(this.c, pwmVar.c);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuePickerState(days=");
        sb.append(this.a);
        sb.append(", hours=");
        sb.append(this.b);
        sb.append(", minutes=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
