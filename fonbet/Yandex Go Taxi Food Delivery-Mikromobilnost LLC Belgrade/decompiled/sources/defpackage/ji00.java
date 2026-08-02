package defpackage;

/* loaded from: classes.dex */
public abstract class ji00 {
    public static final gi00 a;
    public static final gi00 b;

    static {
        Class cls = g72.a;
        gi00 gi00Var = null;
        try {
            gi00Var = (gi00) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = gi00Var;
        b = new gi00();
    }
}
