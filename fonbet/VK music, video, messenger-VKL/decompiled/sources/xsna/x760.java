package xsna;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes.dex */
public final class x760 {
    public static final q760 a;
    public static final t760 b;

    static {
        v8e0 v8e0Var = v8e0.c;
        q760 q760Var = null;
        try {
            q760Var = (q760) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = q760Var;
        b = new t760();
    }
}
