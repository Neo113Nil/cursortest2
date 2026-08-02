package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.cvf0;
import defpackage.ny61;
import defpackage.oyo;
import defpackage.oyr;
import defpackage.rom0;
import defpackage.xxq;
import defpackage.y321;
import defpackage.yt10;
import defpackage.yv4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends com.google.crypto.tink.shaded.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected r unknownFields = r.f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {
        private static final /* synthetic */ MethodToInvoke[] $VALUES;
        public static final MethodToInvoke BUILD_MESSAGE_INFO;
        public static final MethodToInvoke GET_DEFAULT_INSTANCE;
        public static final MethodToInvoke GET_MEMOIZED_IS_INITIALIZED;
        public static final MethodToInvoke GET_PARSER;
        public static final MethodToInvoke NEW_BUILDER;
        public static final MethodToInvoke NEW_MUTABLE_INSTANCE;
        public static final MethodToInvoke SET_MEMOIZED_IS_INITIALIZED;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            NEW_BUILDER = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            GET_PARSER = methodToInvoke7;
            $VALUES = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) $VALUES.clone();
        }
    }

    /* loaded from: classes11.dex */
    public static abstract class a extends GeneratedMessageLite implements yt10 {
        protected xxq extensions = xxq.c;

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
        public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.vt10
        public final /* bridge */ /* synthetic */ k newBuilderForType() {
            return newBuilderForType();
        }
    }

    public static void g(GeneratedMessageLite generatedMessageLite) {
        if (m(generatedMessageLite, true)) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        invalidProtocolBufferException.k(generatedMessageLite);
        throw invalidProtocolBufferException;
    }

    public static GeneratedMessageLite j(Class cls) {
        GeneratedMessageLite generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                ny61.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite defaultInstanceForType = ((GeneratedMessageLite) y321.b(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType != null) {
            defaultInstanceMap.put(cls, defaultInstanceForType);
            return defaultInstanceForType;
        }
        ny61.k();
        return null;
    }

    public static Object l(Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
        } catch (IllegalAccessException e) {
            ny61.n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ny61.n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean m(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.i(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        cvf0 cvf0Var = cvf0.c;
        cvf0Var.getClass();
        boolean a2 = cvf0Var.a(generatedMessageLite.getClass()).a(generatedMessageLite);
        if (z) {
            generatedMessageLite.i(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        }
        return a2;
    }

    public static GeneratedMessageLite r(GeneratedMessageLite generatedMessageLite, ByteString byteString, oyo oyoVar) {
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        d f = yv4.f(literalByteString.bytes, literalByteString.k(), literalByteString.size(), true);
        GeneratedMessageLite s = s(generatedMessageLite, f, oyoVar);
        try {
            f.a(0);
            g(s);
            return s;
        } catch (InvalidProtocolBufferException e) {
            e.k(s);
            throw e;
        }
    }

    public static GeneratedMessageLite s(GeneratedMessageLite generatedMessageLite, yv4 yv4Var, oyo oyoVar) {
        GeneratedMessageLite q = generatedMessageLite.q();
        try {
            cvf0 cvf0Var = cvf0.c;
            cvf0Var.getClass();
            rom0 a2 = cvf0Var.a(q.getClass());
            f fVar = (f) yv4Var.b;
            if (fVar == null) {
                fVar = new f(yv4Var);
            }
            a2.j(q, fVar, oyoVar);
            a2.c(q);
            return q;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.k(q);
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.k(q);
            throw invalidProtocolBufferException;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException2.k(q);
            throw invalidProtocolBufferException2;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static void t(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.o();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int a() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final int b(rom0 rom0Var) {
        int g;
        int g2;
        if (n()) {
            if (rom0Var == null) {
                cvf0 cvf0Var = cvf0.c;
                cvf0Var.getClass();
                g2 = cvf0Var.a(getClass()).g(this);
            } else {
                g2 = rom0Var.g(this);
            }
            if (g2 >= 0) {
                return g2;
            }
            ny61.r(oyr.i(g2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (a() != Integer.MAX_VALUE) {
            return a();
        }
        if (rom0Var == null) {
            cvf0 cvf0Var2 = cvf0.c;
            cvf0Var2.getClass();
            g = cvf0Var2.a(getClass()).g(this);
        } else {
            g = rom0Var.g(this);
        }
        d(g);
        return g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public final void d(int i) {
        if (i < 0) {
            ny61.r(oyr.i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cvf0 cvf0Var = cvf0.c;
        cvf0Var.getClass();
        return cvf0Var.a(getClass()).e(this, (GeneratedMessageLite) obj);
    }

    public final k h() {
        return (k) i(MethodToInvoke.NEW_BUILDER);
    }

    public final int hashCode() {
        if (n()) {
            cvf0 cvf0Var = cvf0.c;
            cvf0Var.getClass();
            return cvf0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            cvf0 cvf0Var2 = cvf0.c;
            cvf0Var2.getClass();
            this.memoizedHashCode = cvf0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(MethodToInvoke methodToInvoke);

    @Override // defpackage.yt10
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) i(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // defpackage.vt10
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final k newBuilderForType() {
        return (k) i(MethodToInvoke.NEW_BUILDER);
    }

    public final GeneratedMessageLite q() {
        return (GeneratedMessageLite) i(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        return m.d(this, super.toString());
    }

    public final k u() {
        k kVar = (k) i(MethodToInvoke.NEW_BUILDER);
        if (!kVar.a.equals(this)) {
            kVar.e();
            k.f(kVar.b, this);
        }
        return kVar;
    }

    public final void v(g gVar) {
        cvf0 cvf0Var = cvf0.c;
        cvf0Var.getClass();
        rom0 a2 = cvf0Var.a(getClass());
        h hVar = gVar.a;
        if (hVar == null) {
            hVar = new h(gVar);
        }
        a2.i(this, hVar);
    }
}
