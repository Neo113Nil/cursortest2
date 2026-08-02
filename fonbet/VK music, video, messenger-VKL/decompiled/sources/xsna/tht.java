package xsna;

import com.google.protobuf.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
public final class tht implements ea20 {
    public static final tht a = new tht();

    @Override // xsna.ea20
    public final boolean a(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // xsna.ea20
    public final aa20 b(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (aa20) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
