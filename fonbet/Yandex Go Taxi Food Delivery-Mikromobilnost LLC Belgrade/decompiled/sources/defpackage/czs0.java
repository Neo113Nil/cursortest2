package defpackage;

import java.math.BigInteger;
import org.json.JSONObject;
import ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0.cl_6;
import ru.CryptoPro.reprov.array.normalizer.Normalizer;

/* loaded from: classes4.dex */
public final class czs0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public czs0(JSONObject jSONObject) {
        String string = jSONObject.getString("image");
        int i = jSONObject.getInt("smartX");
        int i2 = jSONObject.getInt("smartY");
        int i3 = jSONObject.getInt("smartWidth");
        int i4 = jSONObject.getInt("smartHeight");
        jSONObject.getInt("imageWidth");
        jSONObject.getInt("imageHeight");
        this.a = string;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public int a() {
        int i = this.e;
        int i2 = 0;
        while (true) {
            char c = c();
            BigInteger bigInteger = cl_6.a;
            if ('0' > c || c > '9') {
                break;
            }
            int i3 = this.e;
            if (i3 - i > 2) {
                break;
            }
            this.e = i3 + 1;
            i2 = ((i2 * 10) + c) - 48;
        }
        if (this.e - i >= 2) {
            return i2;
        }
        ny61.g(this.a);
        return 0;
    }

    public void b(char c) {
        int i = this.e;
        int i2 = this.c;
        String str = this.a;
        if (i == i2) {
            ny61.g(str);
            return;
        }
        this.e = i + 1;
        if (str.charAt(i) == c) {
            return;
        }
        ny61.g(str);
    }

    public char c() {
        int i = this.e;
        return i == this.c ? Normalizer.DONE : this.a.charAt(i);
    }

    public czs0(cl_6 cl_6Var, String str, String str2) {
        this.a = str2;
        this.b = str.length();
        this.c = str2.length();
    }
}
