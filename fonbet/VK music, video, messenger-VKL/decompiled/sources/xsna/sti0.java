package xsna;

import java.util.Locale;

/* compiled from: SessionGenerator.kt */
/* loaded from: classes.dex */
public final class sti0 {
    public final zuo0 a;
    public final e4r0 b;
    public final String c;
    public int d = -1;
    public iti0 e;

    public sti0(zuo0 zuo0Var, e4r0 e4r0Var) {
        this.a = zuo0Var;
        this.b = e4r0Var;
        this.c = brm0.y(e4r0Var.next().toString(), "-", "").toLowerCase(Locale.ROOT);
    }
}
