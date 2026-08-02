package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class hlx extends GeneratedMessageLite implements yt10 {
    private static final hlx DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile nf90 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private bix keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        hlx hlxVar = new hlx();
        DEFAULT_INSTANCE = hlxVar;
        GeneratedMessageLite.t(hlx.class, hlxVar);
    }

    public static void A(hlx hlxVar, int i) {
        hlxVar.keyId_ = i;
    }

    public static glx G() {
        return (glx) DEFAULT_INSTANCE.h();
    }

    public static void x(hlx hlxVar, bix bixVar) {
        hlxVar.getClass();
        hlxVar.keyData_ = bixVar;
    }

    public static void y(hlx hlxVar, OutputPrefixType outputPrefixType) {
        hlxVar.getClass();
        hlxVar.outputPrefixType_ = outputPrefixType.b();
    }

    public static void z(hlx hlxVar, KeyStatusType keyStatusType) {
        hlxVar.getClass();
        hlxVar.status_ = keyStatusType.a();
    }

    public final bix B() {
        bix bixVar = this.keyData_;
        return bixVar == null ? bix.A() : bixVar;
    }

    public final int C() {
        return this.keyId_;
    }

    public final OutputPrefixType D() {
        OutputPrefixType a = OutputPrefixType.a(this.outputPrefixType_);
        return a == null ? OutputPrefixType.UNRECOGNIZED : a;
    }

    public final KeyStatusType E() {
        int i = this.status_;
        KeyStatusType keyStatusType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : KeyStatusType.DESTROYED : KeyStatusType.DISABLED : KeyStatusType.ENABLED : KeyStatusType.UNKNOWN_STATUS;
        return keyStatusType == null ? KeyStatusType.UNRECOGNIZED : keyStatusType;
    }

    public final boolean F() {
        return this.keyData_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (elx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new hlx();
            case 2:
                return new glx(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (hlx.class) {
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
