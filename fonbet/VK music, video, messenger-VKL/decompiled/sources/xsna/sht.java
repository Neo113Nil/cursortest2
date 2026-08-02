package xsna;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
public final class sht implements da20 {
    public static final sht a = new sht();

    @Override // xsna.da20
    public final boolean a(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // xsna.da20
    public final z920 b(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (z920) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).h(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
