package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class if1 extends GeneratedMessageLite implements yt10 {
    private static final if1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER;
    private int keySize_;
    private qf1 params_;

    static {
        if1 if1Var = new if1();
        DEFAULT_INSTANCE = if1Var;
        GeneratedMessageLite.t(if1.class, if1Var);
    }

    public static hf1 B() {
        return (hf1) DEFAULT_INSTANCE.h();
    }

    public static if1 C(ByteString byteString, oyo oyoVar) {
        return (if1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(if1 if1Var) {
        if1Var.keySize_ = 32;
    }

    public static void y(if1 if1Var, qf1 qf1Var) {
        if1Var.getClass();
        if1Var.params_ = qf1Var;
    }

    public final qf1 A() {
        qf1 qf1Var = this.params_;
        return qf1Var == null ? qf1.y() : qf1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (gf1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new if1();
            case 2:
                return new hf1(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (if1.class) {
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
