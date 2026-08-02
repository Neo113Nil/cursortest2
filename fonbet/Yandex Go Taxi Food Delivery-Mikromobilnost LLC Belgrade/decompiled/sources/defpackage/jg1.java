package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes11.dex */
public final class jg1 extends GeneratedMessageLite implements yt10 {
    private static final jg1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.a;
    private sg1 params_;
    private int version_;

    static {
        jg1 jg1Var = new jg1();
        DEFAULT_INSTANCE = jg1Var;
        GeneratedMessageLite.t(jg1.class, jg1Var);
    }

    public static jg1 A() {
        return DEFAULT_INSTANCE;
    }

    public static ig1 E() {
        return (ig1) DEFAULT_INSTANCE.h();
    }

    public static jg1 F(ByteString byteString, oyo oyoVar) {
        return (jg1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(jg1 jg1Var) {
        jg1Var.version_ = 0;
    }

    public static void y(jg1 jg1Var, sg1 sg1Var) {
        jg1Var.getClass();
        sg1Var.getClass();
        jg1Var.params_ = sg1Var;
    }

    public static void z(jg1 jg1Var, ByteString byteString) {
        jg1Var.getClass();
        jg1Var.keyValue_ = byteString;
    }

    public final ByteString B() {
        return this.keyValue_;
    }

    public final sg1 C() {
        sg1 sg1Var = this.params_;
        return sg1Var == null ? sg1.y() : sg1Var;
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
        switch (hg1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new jg1();
            case 2:
                return new ig1(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (jg1.class) {
                    try {
                        nf90Var = PARSER;
                        if (nf90Var == null) {
                            nf90Var = new nxs();
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
