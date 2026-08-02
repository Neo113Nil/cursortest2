package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class mxs implements rt10 {
    public static final mxs b = new mxs(0);
    public final /* synthetic */ int a;

    public /* synthetic */ mxs(int i) {
        this.a = i;
    }

    @Override // defpackage.rt10
    public final v9i0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    ny61.g("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (v9i0) GeneratedMessageLite.g(cls.asSubclass(GeneratedMessageLite.class)).f(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
                } catch (Exception e) {
                    ny61.n("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.rt10
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
