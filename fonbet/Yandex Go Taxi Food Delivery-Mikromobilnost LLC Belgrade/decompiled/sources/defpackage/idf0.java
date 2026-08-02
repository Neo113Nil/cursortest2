package defpackage;

import com.yandex.go.flex.common.api.c;
import java.text.DecimalFormat;
import ru.yandex.taxi.am.g;

/* loaded from: classes8.dex */
public final class idf0 implements oy2 {
    public static final DecimalFormat d = new DecimalFormat("#.#");
    public final h3y a;
    public final h3y b;
    public final h3y c;

    public idf0(h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
    }

    @Override // defpackage.oy2
    public final String get(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -836030906) {
            if (hashCode != 3314158) {
                if (hashCode == 747804969 && str.equals("position")) {
                    zir b = c.b((ajr) this.b.get());
                    zzs a = b != null ? b.a() : null;
                    if (a != null) {
                        double d2 = a.a;
                        DecimalFormat decimalFormat = d;
                        return g8e.p(decimalFormat.format(d2), ",", decimalFormat.format(a.b));
                    }
                }
            } else if (str.equals("lang")) {
                i5z a2 = ((j5z) this.c.get()).a.a();
                return g8e.p(a2.a(), "_", a2.a.getCountry());
            }
        } else if (str.equals("userId")) {
            return String.valueOf(((g) this.a.get()).i());
        }
        return null;
    }
}
