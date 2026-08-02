package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* compiled from: EncryptedKeyset.java */
/* loaded from: classes.dex */
public final class mjp extends GeneratedMessageLite<mjp, b> implements na20 {
    private static final mjp DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile hj90<mjp> PARSER;
    private ByteString encryptedKeyset_ = ByteString.b;
    private biy keysetInfo_;

    /* compiled from: EncryptedKeyset.java */
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

    /* compiled from: EncryptedKeyset.java */
    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.a<mjp, b> implements na20 {
        public /* synthetic */ b(int i) {
            this();
        }

        public final void o(ByteString.g gVar) {
            l();
            mjp.q((mjp) this.c, gVar);
        }

        public final void p(biy biyVar) {
            l();
            mjp.r((mjp) this.c, biyVar);
        }

        public b() {
            super(mjp.DEFAULT_INSTANCE);
        }
    }

    static {
        mjp mjpVar = new mjp();
        DEFAULT_INSTANCE = mjpVar;
        GeneratedMessageLite.o(mjp.class, mjpVar);
    }

    public static void q(mjp mjpVar, ByteString.g gVar) {
        mjpVar.getClass();
        mjpVar.encryptedKeyset_ = gVar;
    }

    public static void r(mjp mjpVar, biy biyVar) {
        mjpVar.getClass();
        mjpVar.keysetInfo_ = biyVar;
    }

    public static b t() {
        return DEFAULT_INSTANCE.g();
    }

    public static mjp u(byte[] bArr, com.google.crypto.tink.shaded.protobuf.k kVar) throws InvalidProtocolBufferException {
        return (mjp) GeneratedMessageLite.n(DEFAULT_INSTANCE, bArr, kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new mjp();
            case 2:
                return new b(0);
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<mjp> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (mjp.class) {
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

    public final ByteString s() {
        return this.encryptedKeyset_;
    }
}
