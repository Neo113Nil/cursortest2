package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class mou extends GeneratedMessageLite implements yt10 {
    private static final mou DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.a;
    private wou params_;
    private int version_;

    static {
        mou mouVar = new mou();
        DEFAULT_INSTANCE = mouVar;
        GeneratedMessageLite.t(mou.class, mouVar);
    }

    public static mou A() {
        return DEFAULT_INSTANCE;
    }

    public static lou E() {
        return (lou) DEFAULT_INSTANCE.h();
    }

    public static mou F(ByteString byteString, oyo oyoVar) {
        return (mou) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(mou mouVar) {
        mouVar.version_ = 0;
    }

    public static void y(mou mouVar, wou wouVar) {
        mouVar.getClass();
        wouVar.getClass();
        mouVar.params_ = wouVar;
    }

    public static void z(mou mouVar, ByteString byteString) {
        mouVar.getClass();
        mouVar.keyValue_ = byteString;
    }

    public final ByteString B() {
        return this.keyValue_;
    }

    public final wou C() {
        wou wouVar = this.params_;
        return wouVar == null ? wou.z() : wouVar;
    }

    public final int D() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (kou.a[methodToInvoke.ordinal()]) {
            case 1:
                return new mou();
            case 2:
                return new lou(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (mou.class) {
                    try {
                        nf90Var = PARSER;
                        if (nf90Var == null) {
                            nf90Var = new nxs(DEFAULT_INSTANCE);
                            PARSER = nf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.vt10
    public final /* bridge */ /* synthetic */ k newBuilderForType() {
        return newBuilderForType();
    }
}
