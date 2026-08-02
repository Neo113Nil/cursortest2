package defpackage;

import java.util.Map;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes8.dex */
public final class e5d0 {
    public final vjd0 a;
    public final c b;
    public final tpr c;

    public e5d0(vjd0 vjd0Var, c cVar, tpr tprVar) {
        this.a = vjd0Var;
        this.b = cVar;
        this.c = tprVar;
    }

    public final wjd0 a() {
        yn11 yn11Var;
        qwi0 qwi0Var;
        String str;
        String str2;
        String str3;
        znp0 znp0Var = this.a.a.a.a;
        if (znp0Var == null || (yn11Var = znp0Var.g) == null || (qwi0Var = (qwi0) yn11Var.a(qwi0.class)) == null) {
            return null;
        }
        Map map = qwi0Var.f;
        String str4 = qwi0Var.b;
        if (str4 == null) {
            return null;
        }
        String str5 = map != null ? (String) map.get(str4) : null;
        if (str5 == null || (str = qwi0Var.c) == null) {
            return null;
        }
        String str6 = map != null ? (String) map.get(str) : null;
        if (str6 == null || (str2 = qwi0Var.d) == null) {
            return null;
        }
        String str7 = map != null ? (String) map.get(str2) : null;
        if (str7 == null || (str3 = qwi0Var.e) == null) {
            return null;
        }
        String str8 = map != null ? (String) map.get(str3) : null;
        if (str8 == null) {
            return null;
        }
        return new wjd0(str5, str6, str7, str8);
    }
}
