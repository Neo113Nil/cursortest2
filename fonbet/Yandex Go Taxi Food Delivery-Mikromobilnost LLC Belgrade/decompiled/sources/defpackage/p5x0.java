package defpackage;

import com.yandex.go.sql.BaseDatabaseHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class p5x0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public p5x0(int i, String str, String str2, String str3, boolean z, int i2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.g = evu0.y(upperCase, "INT", false) ? 3 : (evu0.y(upperCase, "CHAR", false) || evu0.y(upperCase, "CLOB", false) || evu0.y(upperCase, BaseDatabaseHelper.TYPE_TEXT, false)) ? 2 : evu0.y(upperCase, "BLOB", false) ? 5 : (evu0.y(upperCase, "REAL", false) || evu0.y(upperCase, "FLOA", false) || evu0.y(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p5x0) {
                boolean z = this.d > 0;
                p5x0 p5x0Var = (p5x0) obj;
                int i = p5x0Var.f;
                if (z == (p5x0Var.d > 0) && jl40.l(this.a, p5x0Var.a) && this.c == p5x0Var.c) {
                    String str = p5x0Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || ikb1.b(str2, str)) && ((i2 != 2 || i != 1 || str == null || ikb1.b(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : ikb1.b(str2, str))) && this.g == p5x0Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = StringUtils.UNDEFINED;
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return vuu0.b(vuu0.d(sb.toString()), Extension.TAB_CHAR);
    }
}
