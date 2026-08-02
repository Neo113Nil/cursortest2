package defpackage;

/* loaded from: classes.dex */
public abstract class ii00 {
    public static final fi00 a;
    public static final fi00 b;

    static {
        fi00 fi00Var = null;
        try {
            fi00Var = (fi00) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = fi00Var;
        b = new fi00();
    }
}
