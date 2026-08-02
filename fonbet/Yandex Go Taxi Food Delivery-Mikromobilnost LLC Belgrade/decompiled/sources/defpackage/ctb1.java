package defpackage;

import com.google.firebase.a;
import com.google.firebase.sessions.d;
import java.util.Calendar;

/* loaded from: classes14.dex */
public abstract class ctb1 {
    public static wpr0 a;

    public static final Calendar a(yo01 yo01Var) {
        Calendar calendar = yo01Var.a;
        if (calendar == null) {
            return null;
        }
        xo01 xo01Var = yo01Var.b;
        return rsb1.d(calendar, xo01Var != null ? xo01Var.a : 0, xo01Var != null ? xo01Var.b : 0);
    }

    public static t960 b() {
        return (t960) t960.d.getValue();
    }

    public static final void c() {
        try {
            if (a == null) {
                a = (wpr0) ((k1g) ((ocr) a.d().b(ocr.class))).o.get();
            }
            wpr0 wpr0Var = a;
            if (((d) (wpr0Var != null ? wpr0Var : null)).i) {
                if (wpr0Var == null) {
                    wpr0Var = null;
                }
                ((d) wpr0Var).b();
            }
        } catch (Exception unused) {
        }
    }
}
