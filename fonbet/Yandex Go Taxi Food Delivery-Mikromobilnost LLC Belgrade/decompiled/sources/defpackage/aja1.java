package defpackage;

import androidx.media3.common.ParserException;
import java.util.NoSuchElementException;
import kotlinx.coroutines.TimeoutCancellationException;
import yads.te2;
import yads.yf2;

/* loaded from: classes7.dex */
public abstract class aja1 {
    public static np61 a(Exception exc, String str) {
        te2 te2Var = exc instanceof TimeoutCancellationException ? te2.d : exc instanceof IllegalArgumentException ? te2.e : exc instanceof NoSuchElementException ? te2.f : te2.g;
        return new np61(str, new ql81(yf2.d, te2Var.c, Integer.valueOf(te2Var.b)));
    }

    public static void b(String str, boolean z) {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static dh c() {
        if (dh.c == null) {
            dh.c = new dh();
        }
        return dh.c;
    }

    public static final void d(w53 w53Var, tls tlsVar) {
        w53 w53Var2 = new w53(999);
        int i = w53Var.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            w53Var2.put(w53Var.f(i2), w53Var.j(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                tlsVar.invoke(w53Var2);
                w53Var2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            tlsVar.invoke(w53Var2);
        }
    }
}
