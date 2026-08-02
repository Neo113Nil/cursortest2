package xsna;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.q;

/* compiled from: KeysetInfo.java */
/* loaded from: classes.dex */
public final class biy extends GeneratedMessageLite<biy, b> implements na20 {
    private static final biy DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile hj90<biy> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private q.d<c> keyInfo_ = com.google.crypto.tink.shaded.protobuf.z.e;
    private int primaryKeyId_;

    /* compiled from: KeysetInfo.java */
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

    /* compiled from: KeysetInfo.java */
    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.a<biy, b> implements na20 {
        public /* synthetic */ b(int i) {
            this();
        }

        public final void o(c cVar) {
            l();
            biy.r((biy) this.c, cVar);
        }

        public final void p(int i) {
            l();
            biy.q((biy) this.c, i);
        }

        public b() {
            super(biy.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: KeysetInfo.java */
    public static final class c extends GeneratedMessageLite<c, a> implements na20 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile hj90<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* compiled from: KeysetInfo.java */
        /* loaded from: classes13.dex */
        public static final class a extends GeneratedMessageLite.a<c, a> implements na20 {
            public /* synthetic */ a(int i) {
                this();
            }

            public final void o(int i) {
                l();
                c.t((c) this.c, i);
            }

            public final void p(OutputPrefixType outputPrefixType) {
                l();
                c.r((c) this.c, outputPrefixType);
            }

            public final void q(KeyStatusType keyStatusType) {
                l();
                c.s((c) this.c, keyStatusType);
            }

            public final void r(String str) {
                l();
                c.q((c) this.c, str);
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.o(c.class, cVar);
        }

        public static void q(c cVar, String str) {
            cVar.getClass();
            str.getClass();
            cVar.typeUrl_ = str;
        }

        public static void r(c cVar, OutputPrefixType outputPrefixType) {
            cVar.getClass();
            cVar.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void s(c cVar, KeyStatusType keyStatusType) {
            cVar.getClass();
            cVar.status_ = keyStatusType.getNumber();
        }

        public static void t(c cVar, int i) {
            cVar.keyId_ = i;
        }

        public static a v() {
            return DEFAULT_INSTANCE.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            hj90 hj90Var;
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(0);
                case 3:
                    return new kye0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    hj90<c> hj90Var2 = PARSER;
                    if (hj90Var2 != null) {
                        return hj90Var2;
                    }
                    synchronized (c.class) {
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

        public final int u() {
            return this.keyId_;
        }
    }

    static {
        biy biyVar = new biy();
        DEFAULT_INSTANCE = biyVar;
        GeneratedMessageLite.o(biy.class, biyVar);
    }

    public static void q(biy biyVar, int i) {
        biyVar.primaryKeyId_ = i;
    }

    public static void r(biy biyVar, c cVar) {
        biyVar.getClass();
        if (!biyVar.keyInfo_.isModifiable()) {
            q.d<c> dVar = biyVar.keyInfo_;
            int size = dVar.size();
            biyVar.keyInfo_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        biyVar.keyInfo_.add(cVar);
    }

    public static b t() {
        return DEFAULT_INSTANCE.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new biy();
            case 2:
                return new b(0);
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<biy> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (biy.class) {
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

    public final c s() {
        return this.keyInfo_.get(0);
    }
}
