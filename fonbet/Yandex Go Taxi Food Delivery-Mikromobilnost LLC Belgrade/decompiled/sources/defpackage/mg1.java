package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class mg1 extends GeneratedMessageLite implements yt10 {
    private static final mg1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile nf90 PARSER;
    private int keySize_;
    private sg1 params_;

    static {
        mg1 mg1Var = new mg1();
        DEFAULT_INSTANCE = mg1Var;
        GeneratedMessageLite.t(mg1.class, mg1Var);
    }

    public static lg1 C() {
        return (lg1) DEFAULT_INSTANCE.h();
    }

    public static mg1 D(ByteString byteString, oyo oyoVar) {
        return (mg1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(mg1 mg1Var, sg1 sg1Var) {
        mg1Var.getClass();
        mg1Var.params_ = sg1Var;
    }

    public static void y(mg1 mg1Var, int i) {
        mg1Var.keySize_ = i;
    }

    public static mg1 z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.keySize_;
    }

    public final sg1 B() {
        sg1 sg1Var = this.params_;
        return sg1Var == null ? sg1.y() : sg1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (kg1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new mg1();
            case 2:
                return new lg1(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (mg1.class) {
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
