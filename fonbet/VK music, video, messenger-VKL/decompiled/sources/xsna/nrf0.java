package xsna;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.q;

/* compiled from: RegistryConfig.java */
@Deprecated
/* loaded from: classes.dex */
public final class nrf0 extends GeneratedMessageLite<nrf0, b> implements na20 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final nrf0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile hj90<nrf0> PARSER;
    private String configName_ = "";
    private q.d<gey> entry_ = com.google.crypto.tink.shaded.protobuf.z.e;

    /* compiled from: RegistryConfig.java */
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

    /* compiled from: RegistryConfig.java */
    /* loaded from: classes13.dex */
    public static final class b extends GeneratedMessageLite.a<nrf0, b> implements na20 {
        public b() {
            super(nrf0.DEFAULT_INSTANCE);
        }
    }

    static {
        nrf0 nrf0Var = new nrf0();
        DEFAULT_INSTANCE = nrf0Var;
        GeneratedMessageLite.o(nrf0.class, nrf0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        hj90 hj90Var;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new nrf0();
            case 2:
                return new b();
            case 3:
                return new kye0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", gey.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                hj90<nrf0> hj90Var2 = PARSER;
                if (hj90Var2 != null) {
                    return hj90Var2;
                }
                synchronized (nrf0.class) {
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
}
