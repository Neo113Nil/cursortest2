package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class plx extends GeneratedMessageLite implements yt10 {
    private static final plx DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private nqw keyInfo_ = gvf0.w;
    private int primaryKeyId_;

    static {
        plx plxVar = new plx();
        DEFAULT_INSTANCE = plxVar;
        GeneratedMessageLite.t(plx.class, plxVar);
    }

    public static mlx A() {
        return (mlx) DEFAULT_INSTANCE.h();
    }

    public static void x(plx plxVar, int i) {
        plxVar.primaryKeyId_ = i;
    }

    public static void y(plx plxVar, olx olxVar) {
        plxVar.getClass();
        nqw nqwVar = plxVar.keyInfo_;
        if (!((o9) nqwVar).a) {
            int size = nqwVar.size();
            plxVar.keyInfo_ = nqwVar.w(size == 0 ? 10 : size * 2);
        }
        plxVar.keyInfo_.add(olxVar);
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
                return new plx();
            case 2:
                return new mlx(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", olx.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (plx.class) {
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

    public final olx z() {
        return (olx) this.keyInfo_.get(0);
    }
}
