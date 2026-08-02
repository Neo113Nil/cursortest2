package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pqi {
    public final nqi a;
    public final Map b;
    public final List c;
    public final Map d;

    public pqi(nqi nqiVar, Map map, List list, Map map2) {
        this.a = nqiVar;
        this.b = map;
        this.c = list;
        this.d = map2;
    }

    public static pqi a(pqi pqiVar, Map map) {
        nqi nqiVar = pqiVar.a;
        Map map2 = pqiVar.b;
        List list = pqiVar.c;
        pqiVar.getClass();
        return new pqi(nqiVar, map2, list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqi)) {
            return false;
        }
        pqi pqiVar = (pqi) obj;
        return this.a.equals(pqiVar.a) && this.b.equals(pqiVar.b) && this.c.equals(pqiVar.c) && this.d.equals(pqiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "Poll(header=" + this.a + ", questions=" + this.b + ", startQuestionIds=" + this.c + ", chosenAnswers=" + this.d + Extension.C_BRAKE;
    }
}
