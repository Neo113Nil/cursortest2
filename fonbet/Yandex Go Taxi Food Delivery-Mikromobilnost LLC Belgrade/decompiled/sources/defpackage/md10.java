package defpackage;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class md10 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public md10(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public static md10 a(String str) {
        int i = tw21.a;
        String[] split = str.split(" ", 2);
        d6z.l(split.length == 2);
        String str2 = split[0];
        Pattern pattern = ojl0.a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i2 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            d6z.l(split2.length >= 2);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i2 = Integer.parseInt(str4);
                    } catch (NumberFormatException e) {
                        throw ParserException.b(e, str4);
                    }
                }
                return new md10(parseInt, parseInt2, i2, split2[0]);
            } catch (NumberFormatException e2) {
                throw ParserException.b(e2, str3);
            }
        } catch (NumberFormatException e3) {
            throw ParserException.b(e3, str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && md10.class == obj.getClass()) {
            md10 md10Var = (md10) obj;
            if (this.a == md10Var.a && this.b.equals(md10Var.b) && this.c == md10Var.c && this.d == md10Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((unr0.b((217 + this.a) * 31, 31, this.b) + this.c) * 31) + this.d;
    }
}
