package defpackage;

/* loaded from: classes.dex */
public abstract class kry {
    public static final iry a;
    public static final iry b;

    static {
        fvf0 fvf0Var = fvf0.c;
        iry iryVar = null;
        try {
            iryVar = (iry) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = iryVar;
        b = new iry();
    }
}
