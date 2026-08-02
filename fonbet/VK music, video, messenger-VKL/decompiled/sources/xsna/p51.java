package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* compiled from: AesCtrKey.java */
/* loaded from: classes13.dex */
public final class p51 extends GeneratedMessageLite<p51, b> implements na20 {
    private static final p51 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hj90<p51> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.b;
    private t51 params_;
    private int version_;

    /* compiled from: AesCtrKey.java */
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

    /* compiled from: AesCtrKey.java */
    public static final class b extends GeneratedMessageLite.a<p51, b> implements na20 {
        public b() {
            super(p51.DEFAULT_INSTANCE);
        }
    }

    static {
        p51 p51Var = new p51();
        DEFAULT_INSTANCE = p51Var;
        GeneratedMessageLite.o(p51.class, p51Var);
    }

    public static void q(p51 p51Var) {
        p51Var.version_ = 0;
    }

    public static void r(p51 p51Var, t51 t51Var) {
        p51Var.getClass();
        t51Var.getClass();
        p51Var.params_ = t51Var;
    }

    public static void s(p51 p51Var, ByteString.g gVar) {
        p51Var.getClass();
        p51Var.keyValue_ = gVar;
    }

    public static p51 t() {
        return DEFAULT_INSTANCE;
    }

    public static b x() {
        return DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p51();
            case 2:
                return new b();
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<p51> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (p51.class) {
                    try {
                        hj90Var = PARSER;
                        if (hj90Var == null) {
                            hj90Var = new GeneratedMessageLite.b();
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

    public final ByteString u() {
        return this.keyValue_;
    }

    public final t51 v() {
        t51 t51Var = this.params_;
        return t51Var == null ? t51.p() : t51Var;
    }

    public final int w() {
        return this.version_;
    }
}
