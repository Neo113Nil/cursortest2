package defpackage;

/* loaded from: classes.dex */
public abstract class ki00 {
    public static final hi00 a;
    public static final hi00 b;

    static {
        fvf0 fvf0Var = fvf0.c;
        hi00 hi00Var = null;
        try {
            hi00Var = (hi00) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = hi00Var;
        b = new hi00();
    }
}
