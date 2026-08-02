package xsna;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
public final class uht implements fa20 {
    public static final uht a = new uht();

    @Override // xsna.fa20
    public final boolean a(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // xsna.fa20
    public final ba20 b(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (ba20) GeneratedMessageLite.g(cls.asSubclass(GeneratedMessageLite.class)).f(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
