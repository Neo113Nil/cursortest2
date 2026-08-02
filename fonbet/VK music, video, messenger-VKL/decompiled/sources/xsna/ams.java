package xsna;

/* compiled from: FriendsBridge.kt */
/* loaded from: classes.dex */
public final class ams {
    public static bpn0 a;

    public static final zls a() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (zls) bpn0Var.getValue();
    }

    public static Class b(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
