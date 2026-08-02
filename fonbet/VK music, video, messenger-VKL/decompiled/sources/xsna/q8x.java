package xsna;

import java.util.Objects;

/* compiled from: InstrumentationScopeInfo.java */
/* loaded from: classes8.dex */
public abstract class q8x {
    public static final /* synthetic */ int a = 0;

    static {
        a("", null, null, jk3.e);
    }

    public static bn5 a(String str, String str2, String str3, q94 q94Var) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(q94Var, "attributes");
        return new bn5(str, str2, str3, q94Var);
    }

    public abstract q94 b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
