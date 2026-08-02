package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class ld10 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final HashMap e = new HashMap();
    public int f = -1;
    public String g;
    public String h;
    public String i;

    public ld10(String str, int i, String str2, int i2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
    }

    public static String b(int i, int i2, int i3, String str) {
        int i4 = tw21.a;
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" ");
        sb.append(str);
        sb.append("/");
        sb.append(i2);
        return unr0.m(i3, "/", sb);
    }

    public final nd10 a() {
        String b;
        md10 a;
        HashMap hashMap = this.e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                int i = tw21.a;
                a = md10.a(str);
            } else {
                int i2 = this.d;
                d6z.l(i2 < 96);
                if (i2 == 0) {
                    b = b(0, 8000, 1, "PCMU");
                } else if (i2 == 8) {
                    b = b(8, 8000, 1, "PCMA");
                } else if (i2 == 10) {
                    b = b(10, 44100, 2, "L16");
                } else if (i2 == 11) {
                    b = b(11, 44100, 1, "L16");
                } else {
                    ny61.r(oyr.i(i2, "Unsupported static paylod type "));
                    b = null;
                }
                a = md10.a(b);
            }
            return new nd10(this, ImmutableMap.a(hashMap), a);
        } catch (ParserException e) {
            ny61.o(e);
            return null;
        }
    }
}
