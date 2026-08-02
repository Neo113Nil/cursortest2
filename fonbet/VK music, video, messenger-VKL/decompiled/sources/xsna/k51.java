package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* compiled from: AesCtrHmacAeadKey.java */
/* loaded from: classes.dex */
public final class k51 extends GeneratedMessageLite<k51, b> implements na20 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final k51 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile hj90<k51> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p51 aesCtrKey_;
    private z9v hmacKey_;
    private int version_;

    /* compiled from: AesCtrHmacAeadKey.java */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AesCtrHmacAeadKey.java */
    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.a<k51, b> implements na20 {
        public /* synthetic */ b(int i) {
            this();
        }

        public b() {
            super(k51.DEFAULT_INSTANCE);
        }
    }

    static {
        k51 k51Var = new k51();
        DEFAULT_INSTANCE = k51Var;
        GeneratedMessageLite.o(k51.class, k51Var);
    }

    public static void q(k51 k51Var) {
        k51Var.version_ = 0;
    }

    public static void r(k51 k51Var, p51 p51Var) {
        k51Var.getClass();
        p51Var.getClass();
        k51Var.aesCtrKey_ = p51Var;
    }

    public static void s(k51 k51Var, z9v z9vVar) {
        k51Var.getClass();
        z9vVar.getClass();
        k51Var.hmacKey_ = z9vVar;
    }

    public static b w() {
        return DEFAULT_INSTANCE.g();
    }

    public static k51 x(ByteString byteString, com.google.crypto.tink.shaded.protobuf.k kVar) throws InvalidProtocolBufferException {
        return (k51) GeneratedMessageLite.m(DEFAULT_INSTANCE, byteString, kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new k51();
            case 2:
                return new b(0);
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<k51> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (k51.class) {
                    try {
                        hj90Var = PARSER;
                        if (hj90Var == null) {
                            hj90Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = hj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return hj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final p51 t() {
        p51 p51Var = this.aesCtrKey_;
        return p51Var == null ? p51.t() : p51Var;
    }

    public final z9v u() {
        z9v z9vVar = this.hmacKey_;
        return z9vVar == null ? z9v.t() : z9vVar;
    }

    public final int v() {
        return this.version_;
    }
}
