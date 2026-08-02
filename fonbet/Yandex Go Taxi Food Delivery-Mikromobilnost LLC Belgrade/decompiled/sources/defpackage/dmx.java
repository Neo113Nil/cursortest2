package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class dmx extends GeneratedMessageLite implements yt10 {
    private static final dmx DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private gmx params_;
    private int version_;

    static {
        dmx dmxVar = new dmx();
        DEFAULT_INSTANCE = dmxVar;
        GeneratedMessageLite.t(dmx.class, dmxVar);
    }

    public static cmx B() {
        return (cmx) DEFAULT_INSTANCE.h();
    }

    public static dmx C(ByteString byteString, oyo oyoVar) {
        return (dmx) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(dmx dmxVar) {
        dmxVar.version_ = 0;
    }

    public static void y(dmx dmxVar, gmx gmxVar) {
        dmxVar.getClass();
        gmxVar.getClass();
        dmxVar.params_ = gmxVar;
    }

    public final int A() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (bmx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new dmx();
            case 2:
                return new cmx(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (dmx.class) {
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

    public final gmx z() {
        gmx gmxVar = this.params_;
        return gmxVar == null ? gmx.x() : gmxVar;
    }
}
