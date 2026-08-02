package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class ah1 extends GeneratedMessageLite implements yt10 {
    private static final ah1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile nf90 PARSER;
    private int keySize_;
    private eh1 params_;

    static {
        ah1 ah1Var = new ah1();
        DEFAULT_INSTANCE = ah1Var;
        GeneratedMessageLite.t(ah1.class, ah1Var);
    }

    public static zg1 B() {
        return (zg1) DEFAULT_INSTANCE.h();
    }

    public static ah1 C(ByteString byteString, oyo oyoVar) {
        return (ah1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(ah1 ah1Var, eh1 eh1Var) {
        ah1Var.getClass();
        ah1Var.params_ = eh1Var;
    }

    public static void y(ah1 ah1Var, int i) {
        ah1Var.keySize_ = i;
    }

    public final eh1 A() {
        eh1 eh1Var = this.params_;
        return eh1Var == null ? eh1.y() : eh1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (yg1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ah1();
            case 2:
                return new zg1(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (ah1.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
