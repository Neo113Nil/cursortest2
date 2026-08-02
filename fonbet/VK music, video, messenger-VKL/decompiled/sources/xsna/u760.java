package xsna;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes12.dex */
public final class u760 {
    public static final n760 a;
    public static final r760 b;

    static {
        s8e0 s8e0Var = s8e0.c;
        n760 n760Var = null;
        try {
            n760Var = (n760) Class.forName("androidx.health.platform.client.proto.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = n760Var;
        b = new r760();
    }
}
