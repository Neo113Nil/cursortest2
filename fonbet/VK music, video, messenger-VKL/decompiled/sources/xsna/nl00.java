package xsna;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
public final class nl00 {
    public static final androidx.datastore.preferences.protobuf.u a;
    public static final androidx.datastore.preferences.protobuf.v b;

    static {
        v8e0 v8e0Var = v8e0.c;
        androidx.datastore.preferences.protobuf.u uVar = null;
        try {
            uVar = (androidx.datastore.preferences.protobuf.u) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = uVar;
        b = new androidx.datastore.preferences.protobuf.v();
    }
}
