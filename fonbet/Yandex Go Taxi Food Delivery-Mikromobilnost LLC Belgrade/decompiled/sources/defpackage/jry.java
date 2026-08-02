package defpackage;

/* loaded from: classes.dex */
public abstract class jry {
    public static final hry a;
    public static final hry b;

    static {
        Class cls = g72.a;
        hry hryVar = null;
        try {
            hryVar = (hry) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = hryVar;
        b = new hry();
    }
}
