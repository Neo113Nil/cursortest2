package defpackage;

import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class bix extends GeneratedMessageLite implements yt10 {
    private static final bix DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile nf90 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.a;

    static {
        bix bixVar = new bix();
        DEFAULT_INSTANCE = bixVar;
        GeneratedMessageLite.t(bix.class, bixVar);
    }

    public static bix A() {
        return DEFAULT_INSTANCE;
    }

    public static aix E() {
        return (aix) DEFAULT_INSTANCE.h();
    }

    public static void x(bix bixVar, String str) {
        bixVar.getClass();
        str.getClass();
        bixVar.typeUrl_ = str;
    }

    public static void y(bix bixVar, ByteString byteString) {
        bixVar.getClass();
        bixVar.value_ = byteString;
    }

    public static void z(bix bixVar, KeyData$KeyMaterialType keyData$KeyMaterialType) {
        bixVar.getClass();
        bixVar.keyMaterialType_ = keyData$KeyMaterialType.a();
    }

    public final KeyData$KeyMaterialType B() {
        int i = this.keyMaterialType_;
        KeyData$KeyMaterialType keyData$KeyMaterialType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : KeyData$KeyMaterialType.REMOTE : KeyData$KeyMaterialType.ASYMMETRIC_PUBLIC : KeyData$KeyMaterialType.ASYMMETRIC_PRIVATE : KeyData$KeyMaterialType.SYMMETRIC : KeyData$KeyMaterialType.UNKNOWN_KEYMATERIAL;
        return keyData$KeyMaterialType == null ? KeyData$KeyMaterialType.UNRECOGNIZED : keyData$KeyMaterialType;
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
        switch (zhx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new bix();
            case 2:
                return new aix(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (bix.class) {
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
