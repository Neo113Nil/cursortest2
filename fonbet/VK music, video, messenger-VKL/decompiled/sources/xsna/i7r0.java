package xsna;

import java.util.List;

/* compiled from: VKApiCredentialsExt.kt */
/* loaded from: classes.dex */
public final class i7r0 {
    public static final String a(List<h7r0> list) {
        String str;
        h7r0 h7r0Var = (h7r0) j5g.a0(list);
        return (h7r0Var == null || (str = h7r0Var.a) == null) ? "" : str;
    }

    public static final String b(List<h7r0> list) {
        h7r0 h7r0Var = (h7r0) j5g.a0(list);
        if (h7r0Var != null) {
            return h7r0Var.b;
        }
        return null;
    }
}
