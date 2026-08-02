package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class ai4 {
    public final ky2 a;

    public ai4(ky2 ky2Var) {
        this.a = ky2Var;
    }

    public final void a(String str, Object... objArr) {
        if (this.a.j()) {
            return;
        }
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        jst.e.a(10, "BackgroundStateOperationLogger", new Throwable("Background operation"), "BackgroundOperation: ".concat(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length))));
    }
}
