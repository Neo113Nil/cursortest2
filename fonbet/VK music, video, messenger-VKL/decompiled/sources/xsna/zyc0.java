package xsna;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class zyc0 extends GeneratedMessageLite<zyc0, a> implements oa20 {
    private static final zyc0 DEFAULT_INSTANCE;
    private static volatile kj90<zyc0> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.b;

    /* compiled from: PreferencesProto.java */
    public static final class a extends GeneratedMessageLite.a<zyc0, a> implements oa20 {
        public a() {
            super(zyc0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    public static final class b {
        public static final androidx.datastore.preferences.protobuf.t<String, PreferencesProto$Value> a = new androidx.datastore.preferences.protobuf.t<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, PreferencesProto$Value.y());
    }

    static {
        zyc0 zyc0Var = new zyc0();
        DEFAULT_INSTANCE = zyc0Var;
        GeneratedMessageLite.m(zyc0.class, zyc0Var);
    }

    public static MapFieldLite o(zyc0 zyc0Var) {
        if (!zyc0Var.preferences_.j()) {
            zyc0Var.preferences_ = zyc0Var.preferences_.l();
        }
        return zyc0Var.preferences_;
    }

    public static a q() {
        return (a) ((GeneratedMessageLite.a) DEFAULT_INSTANCE.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    public static zyc0 r(InputStream inputStream) throws IOException {
        androidx.datastore.preferences.protobuf.f bVar;
        zyc0 zyc0Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = androidx.datastore.preferences.protobuf.p.b;
            bVar = androidx.datastore.preferences.protobuf.f.d(bArr, 0, bArr.length, false);
        } else {
            bVar = new f.b(inputStream);
        }
        androidx.datastore.preferences.protobuf.j a2 = androidx.datastore.preferences.protobuf.j.a();
        zyc0 l = zyc0Var.l();
        try {
            v8e0 v8e0Var = v8e0.c;
            v8e0Var.getClass();
            m8h0 a3 = v8e0Var.a(l.getClass());
            androidx.datastore.preferences.protobuf.g gVar = bVar.d;
            if (gVar == null) {
                gVar = new androidx.datastore.preferences.protobuf.g(bVar);
            }
            a3.f(l, gVar, a2);
            a3.d(l);
            if (GeneratedMessageLite.i(l, true)) {
                return l;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.l(l);
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.d()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.l(l);
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException2.l(l);
            throw invalidProtocolBufferException2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException3 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException3.l(l);
            throw invalidProtocolBufferException3;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object f(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        kj90 kj90Var;
        switch (yyc0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new zyc0();
            case 2:
                return new a();
            case 3:
                return new mye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                kj90<zyc0> kj90Var2 = PARSER;
                if (kj90Var2 != null) {
                    return kj90Var2;
                }
                synchronized (zyc0.class) {
                    try {
                        kj90Var = PARSER;
                        if (kj90Var == null) {
                            kj90Var = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = kj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map<String, PreferencesProto$Value> p() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
