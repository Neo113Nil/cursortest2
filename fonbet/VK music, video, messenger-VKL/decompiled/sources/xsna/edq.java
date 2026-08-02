package xsna;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
public final class edq {
    public static final androidx.datastore.preferences.protobuf.l a = new androidx.datastore.preferences.protobuf.l();
    public static final androidx.datastore.preferences.protobuf.k<?> b;

    static {
        v8e0 v8e0Var = v8e0.c;
        androidx.datastore.preferences.protobuf.k<?> kVar = null;
        try {
            kVar = (androidx.datastore.preferences.protobuf.k) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = kVar;
    }
}
