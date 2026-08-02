package xsna;

/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
public final class adq {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
