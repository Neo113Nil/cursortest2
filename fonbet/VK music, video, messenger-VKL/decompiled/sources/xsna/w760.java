package xsna;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
public final class w760 {
    public static final p760 a;
    public static final s760 b;

    static {
        p760 p760Var = null;
        try {
            p760Var = (p760) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = p760Var;
        b = new s760();
    }
}
