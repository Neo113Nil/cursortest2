package defpackage;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class lxs implements qt10 {
    public static final lxs b = new lxs(0);
    public final /* synthetic */ int a;

    public /* synthetic */ lxs(int i) {
        this.a = i;
    }

    @Override // defpackage.qt10
    public final u9i0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    ny61.g("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (u9i0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e) {
                    ny61.n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.qt10
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
