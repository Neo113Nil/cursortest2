package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class bx21 {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static bx21 c;
    public final ums a;

    public bx21(ums umsVar) {
        this.a = umsVar;
    }

    public final boolean a(w0b0 w0b0Var) {
        if (TextUtils.isEmpty(w0b0Var.a())) {
            return true;
        }
        long b2 = w0b0Var.b() + w0b0Var.g();
        this.a.getClass();
        return b2 < (System.currentTimeMillis() / 1000) + 3600;
    }
}
