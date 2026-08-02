package xsna;

import androidx.health.platform.client.proto.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes12.dex */
public final class rht implements ca20 {
    public static final rht a = new rht();

    @Override // xsna.ca20
    public final boolean a(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // xsna.ca20
    public final y920 b(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (y920) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).i(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
