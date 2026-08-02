package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class kxs implements pt10 {
    public static final kxs b = new kxs(0);
    public final /* synthetic */ int a;

    public /* synthetic */ kxs(int i) {
        this.a = i;
    }

    @Override // defpackage.pt10
    public final t9i0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    ny61.g("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (t9i0) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).i(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
                } catch (Exception e) {
                    ny61.n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.pt10
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
