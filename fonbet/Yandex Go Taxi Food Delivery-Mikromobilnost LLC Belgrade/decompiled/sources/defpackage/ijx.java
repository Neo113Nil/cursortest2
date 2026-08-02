package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class ijx extends GeneratedMessageLite implements yt10 {
    private static final ijx DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile nf90 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.a;

    static {
        ijx ijxVar = new ijx();
        DEFAULT_INSTANCE = ijxVar;
        GeneratedMessageLite.t(ijx.class, ijxVar);
    }

    public static ijx A() {
        return DEFAULT_INSTANCE;
    }

    public static hjx E() {
        return (hjx) DEFAULT_INSTANCE.h();
    }

    public static void x(ijx ijxVar, String str) {
        ijxVar.getClass();
        str.getClass();
        ijxVar.typeUrl_ = str;
    }

    public static void y(ijx ijxVar, ByteString byteString) {
        ijxVar.getClass();
        ijxVar.value_ = byteString;
    }

    public static void z(ijx ijxVar, OutputPrefixType outputPrefixType) {
        ijxVar.getClass();
        ijxVar.outputPrefixType_ = outputPrefixType.b();
    }

    public final OutputPrefixType B() {
        OutputPrefixType a = OutputPrefixType.a(this.outputPrefixType_);
        return a == null ? OutputPrefixType.UNRECOGNIZED : a;
    }

    public final String C() {
        return this.typeUrl_;
    }

    public final ByteString D() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (fjx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ijx();
            case 2:
                return new hjx(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (ijx.class) {
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
