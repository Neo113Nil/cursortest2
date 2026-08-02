package xsna;

/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
public final class ycq {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
