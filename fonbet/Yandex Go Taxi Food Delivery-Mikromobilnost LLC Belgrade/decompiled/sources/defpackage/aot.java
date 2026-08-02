package defpackage;

import com.yandex.go.logger.GoMangoThrowable;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class aot extends de00 {
    @Override // defpackage.de00
    public final int c(int i) {
        if (i == 5) {
            return 3;
        }
        if (i == 10) {
            return 4;
        }
        if (i != 15) {
            return i != 20 ? 3 : 7;
        }
        return 6;
    }

    @Override // defpackage.de00
    public final String d(int i, String str, Throwable th, String str2, fe00 fe00Var) {
        String d = super.d(i, str, th, str2, fe00Var);
        if (i != 15 && i != 20) {
            return d;
        }
        String X = a.X(fe00Var.a(qoi0.e(bot.class)), ":", null, null, dot.a, 30);
        return X.length() > 0 ? g8e.p(X, Extension.COLON_SPACE, d) : d;
    }

    @Override // defpackage.de00
    public final String e(String str, fe00 fe00Var) {
        Object obj;
        if (str != null) {
            return str;
        }
        an11 e = qoi0.e(eot.class);
        wy40 wy40Var = fe00Var.a;
        Object[] objArr = wy40Var.a;
        int i = wy40Var.b;
        while (true) {
            i--;
            if (-1 >= i) {
                obj = null;
                break;
            }
            le00 le00Var = (le00) objArr[i];
            if (le00Var.b.equals(e)) {
                obj = le00Var.a;
                break;
            }
        }
        eot eotVar = (eot) obj;
        String str2 = eotVar != null ? eotVar.a : null;
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        String h = ffx.h(new GoMangoThrowable(fe00Var.b(qoi0.e(got.class)), 6));
        return h == null ? "" : h;
    }
}
