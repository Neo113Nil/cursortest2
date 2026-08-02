package xsna;

/* compiled from: MapFieldSchemas.java */
/* loaded from: classes.dex */
public final class ll00 {
    public static final il00 a;
    public static final jl00 b;

    static {
        il00 il00Var = null;
        try {
            il00Var = (il00) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = il00Var;
        b = new jl00();
    }
}
