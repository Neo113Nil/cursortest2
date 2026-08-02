package defpackage;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class olx extends GeneratedMessageLite implements yt10 {
    private static final olx DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile nf90 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        olx olxVar = new olx();
        DEFAULT_INSTANCE = olxVar;
        GeneratedMessageLite.t(olx.class, olxVar);
    }

    public static void A(olx olxVar, int i) {
        olxVar.keyId_ = i;
    }

    public static nlx C() {
        return (nlx) DEFAULT_INSTANCE.h();
    }

    public static void x(olx olxVar, String str) {
        olxVar.getClass();
        str.getClass();
        olxVar.typeUrl_ = str;
    }

    public static void y(olx olxVar, OutputPrefixType outputPrefixType) {
        olxVar.getClass();
        olxVar.outputPrefixType_ = outputPrefixType.b();
    }

    public static void z(olx olxVar, KeyStatusType keyStatusType) {
        olxVar.getClass();
        olxVar.status_ = keyStatusType.a();
    }

    public final int B() {
        return this.keyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (llx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new olx();
            case 2:
                return new nlx(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (olx.class) {
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
