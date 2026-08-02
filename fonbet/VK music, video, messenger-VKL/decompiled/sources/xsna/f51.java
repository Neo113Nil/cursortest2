package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* compiled from: AesCmacKey.java */
/* loaded from: classes.dex */
public final class f51 extends GeneratedMessageLite<f51, b> implements na20 {
    private static final f51 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile hj90<f51> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.b;
    private j51 params_;
    private int version_;

    /* compiled from: AesCmacKey.java */
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

    /* compiled from: AesCmacKey.java */
    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.a<f51, b> implements na20 {
        public /* synthetic */ b(int i) {
            this();
        }

        public b() {
            super(f51.DEFAULT_INSTANCE);
        }
    }

    static {
        f51 f51Var = new f51();
        DEFAULT_INSTANCE = f51Var;
        GeneratedMessageLite.o(f51.class, f51Var);
    }

    public static void q(f51 f51Var) {
        f51Var.version_ = 0;
    }

    public static void r(f51 f51Var, ByteString.g gVar) {
        f51Var.getClass();
        f51Var.keyValue_ = gVar;
    }

    public static void s(f51 f51Var, j51 j51Var) {
        f51Var.getClass();
        j51Var.getClass();
        f51Var.params_ = j51Var;
    }

    public static b w() {
        return DEFAULT_INSTANCE.g();
    }

    public static f51 x(ByteString byteString, com.google.crypto.tink.shaded.protobuf.k kVar) throws InvalidProtocolBufferException {
        return (f51) GeneratedMessageLite.m(DEFAULT_INSTANCE, byteString, kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new f51();
            case 2:
                return new b(0);
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<f51> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (f51.class) {
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

    public final ByteString t() {
        return this.keyValue_;
    }

    public final j51 u() {
        j51 j51Var = this.params_;
        return j51Var == null ? j51.p() : j51Var;
    }

    public final int v() {
        return this.version_;
    }
}
