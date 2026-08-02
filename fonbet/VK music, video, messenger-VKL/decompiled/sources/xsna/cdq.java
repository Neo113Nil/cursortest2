package xsna;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes13.dex */
public final class cdq {
    public static final com.google.crypto.tink.shaded.protobuf.m a = new com.google.crypto.tink.shaded.protobuf.m();
    public static final com.google.crypto.tink.shaded.protobuf.l<?> b;

    static {
        com.google.crypto.tink.shaded.protobuf.l<?> lVar = null;
        try {
            lVar = (com.google.crypto.tink.shaded.protobuf.l) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = lVar;
    }

    public static com.google.crypto.tink.shaded.protobuf.l<?> a() {
        com.google.crypto.tink.shaded.protobuf.l<?> lVar = b;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static com.google.crypto.tink.shaded.protobuf.m b() {
        return a;
    }
}
