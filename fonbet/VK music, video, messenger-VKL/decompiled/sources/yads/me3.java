package yads;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class me3 extends RuntimeException {
    public final ke3 b;
    public final le3 c;

    public me3(ke3 ke3Var, le3 le3Var) {
        super("Verification not executed with reason = ".concat(le3Var.name().toLowerCase(Locale.US)));
        this.b = ke3Var;
        this.c = le3Var;
    }
}
