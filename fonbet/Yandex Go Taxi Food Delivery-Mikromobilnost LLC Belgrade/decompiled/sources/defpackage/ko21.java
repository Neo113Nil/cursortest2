package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class ko21 {
    public final wu2 a;
    public final cne0 b;
    public final String c;

    public ko21(dne0 dne0Var, b03 b03Var, wu2 wu2Var) {
        this.a = wu2Var;
        this.b = dne0Var.b();
        this.c = b64.j(b03Var.getApplicationId(), ".utils.PreferenceUtils.FIELD_LOCALE_LANGUAGE");
    }

    public final i5z a() {
        Object obj;
        Locale locale;
        i5z i5zVar = null;
        String l = this.b.l(this.c, null);
        if (l == null || evu0.J(l)) {
            l = null;
        }
        if (l == null) {
            List w = qje.w();
            if (w.isEmpty()) {
                jst.e.x(new IllegalStateException(), "Unexpected system locales are empty");
                locale = Locale.getDefault();
            } else {
                locale = (Locale) w.get(0);
            }
            l = locale.getLanguage();
        }
        this.a.getClass();
        List list = wu2.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(qje.E(((i5z) obj).a()), qje.E(l))) {
                break;
            }
        }
        i5z i5zVar2 = (i5z) obj;
        if (i5zVar2 != null) {
            return i5zVar2;
        }
        if (jl40.l(qje.E(l), "be")) {
            i5z i5zVar3 = i5z.d;
            if (list.contains(i5zVar3)) {
                i5zVar = i5zVar3;
            }
        }
        return i5zVar == null ? wu2.c : i5zVar;
    }
}
