package xsna;

/* compiled from: ListFieldSchemas.java */
/* loaded from: classes.dex */
public final class nez {
    public static final lez a;
    public static final androidx.datastore.preferences.protobuf.r b;

    static {
        v8e0 v8e0Var = v8e0.c;
        lez lezVar = null;
        try {
            lezVar = (lez) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = lezVar;
        b = new androidx.datastore.preferences.protobuf.r();
    }
}
