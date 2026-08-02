package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class ef1 extends GeneratedMessageLite implements yt10 {
    private static final ef1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.a;
    private qf1 params_;
    private int version_;

    static {
        ef1 ef1Var = new ef1();
        DEFAULT_INSTANCE = ef1Var;
        GeneratedMessageLite.t(ef1.class, ef1Var);
    }

    public static df1 D() {
        return (df1) DEFAULT_INSTANCE.h();
    }

    public static ef1 E(ByteString byteString, oyo oyoVar) {
        return (ef1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(ef1 ef1Var) {
        ef1Var.version_ = 0;
    }

    public static void y(ef1 ef1Var, ByteString byteString) {
        ef1Var.getClass();
        ef1Var.keyValue_ = byteString;
    }

    public static void z(ef1 ef1Var, qf1 qf1Var) {
        ef1Var.getClass();
        qf1Var.getClass();
        ef1Var.params_ = qf1Var;
    }

    public final ByteString A() {
        return this.keyValue_;
    }

    public final qf1 B() {
        qf1 qf1Var = this.params_;
        return qf1Var == null ? qf1.y() : qf1Var;
    }

    public final int C() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (cf1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ef1();
            case 2:
                return new df1(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (ef1.class) {
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
