package xsna;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* compiled from: KeyTemplate.java */
/* loaded from: classes.dex */
public final class dey extends GeneratedMessageLite<dey, b> implements na20 {
    private static final dey DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile hj90<dey> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.b;

    /* compiled from: KeyTemplate.java */
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

    /* compiled from: KeyTemplate.java */
    public static final class b extends GeneratedMessageLite.a<dey, b> implements na20 {
        public b() {
            super(dey.DEFAULT_INSTANCE);
        }
    }

    static {
        dey deyVar = new dey();
        DEFAULT_INSTANCE = deyVar;
        GeneratedMessageLite.o(dey.class, deyVar);
    }

    public static void q(dey deyVar, String str) {
        deyVar.getClass();
        deyVar.typeUrl_ = str;
    }

    public static void r(dey deyVar, ByteString.g gVar) {
        deyVar.getClass();
        deyVar.value_ = gVar;
    }

    public static void s(dey deyVar, OutputPrefixType outputPrefixType) {
        deyVar.getClass();
        deyVar.outputPrefixType_ = outputPrefixType.getNumber();
    }

    public static dey t() {
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
                return new dey();
            case 2:
                return new b();
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<dey> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (dey.class) {
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

    public final OutputPrefixType u() {
        OutputPrefixType a2 = OutputPrefixType.a(this.outputPrefixType_);
        return a2 == null ? OutputPrefixType.UNRECOGNIZED : a2;
    }

    public final String v() {
        return this.typeUrl_;
    }

    public final ByteString w() {
        return this.value_;
    }
}
