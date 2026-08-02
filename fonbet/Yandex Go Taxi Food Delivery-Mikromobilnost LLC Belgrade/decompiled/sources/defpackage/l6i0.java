package defpackage;

import jason.statham.interpreter.error.a;
import kotlin.random.Random;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class l6i0 {
    public static Long a(inj injVar) {
        long g;
        int i = injVar.c;
        if (i == 0) {
            Random.a.getClass();
            g = Random.b.g();
        } else if (i == 1) {
            Object obj = injVar.a[0];
            if (!(obj instanceof Long)) {
                throw a.a("Function \"random\" is not defined for argument ".concat(rhb1.e(obj)));
            }
            Random.Default r0 = Random.a;
            long longValue = ((Number) obj).longValue();
            r0.getClass();
            g = Random.b.h(longValue);
        } else {
            if (i != 2) {
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"random\" requires 0-2 arguments but "));
            }
            Object[] objArr = injVar.a;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            if (!(obj2 instanceof Long) || !(obj3 instanceof Long)) {
                throw a.a("Function \"random\" is not defined for arguments " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
            }
            Random.Default r1 = Random.a;
            long longValue2 = ((Number) obj2).longValue();
            long longValue3 = ((Number) obj3).longValue();
            r1.getClass();
            g = Random.b.i(longValue2, longValue3);
        }
        return Long.valueOf(g);
    }
}
