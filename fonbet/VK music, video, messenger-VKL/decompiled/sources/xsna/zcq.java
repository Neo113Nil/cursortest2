package xsna;

/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes13.dex */
public final class zcq {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
