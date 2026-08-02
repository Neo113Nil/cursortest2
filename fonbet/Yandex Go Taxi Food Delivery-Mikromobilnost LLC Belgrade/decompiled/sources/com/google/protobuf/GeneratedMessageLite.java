package com.google.protobuf;

import defpackage.bor;
import defpackage.bqw;
import defpackage.cqw;
import defpackage.d5m;
import defpackage.eac;
import defpackage.evf0;
import defpackage.fqw;
import defpackage.gp50;
import defpackage.hvf0;
import defpackage.hyo;
import defpackage.i96;
import defpackage.iqw;
import defpackage.jqw;
import defpackage.mqw;
import defpackage.ny61;
import defpackage.o5w;
import defpackage.of90;
import defpackage.oqw;
import defpackage.oyr;
import defpackage.pyo;
import defpackage.qlz;
import defpackage.qxs;
import defpackage.rxs;
import defpackage.som0;
import defpackage.tt10;
import defpackage.u9i0;
import defpackage.v43;
import defpackage.wt10;
import defpackage.yxq;
import defpackage.z321;
import defpackage.zt10;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected t unknownFields = t.f;

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

    public static abstract class a extends GeneratedMessageLite implements zt10 {
        public yxq a = yxq.f();

        public final yxq f() {
            if (this.a.k()) {
                this.a = this.a.clone();
            }
            return this.a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, defpackage.zt10
        public final /* bridge */ /* synthetic */ wt10 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, defpackage.wt10
        public final /* bridge */ /* synthetic */ tt10 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, defpackage.wt10
        public final /* bridge */ /* synthetic */ tt10 toBuilder() {
            return toBuilder();
        }
    }

    public static rxs access$100(hyo hyoVar) {
        hyoVar.getClass();
        return (rxs) hyoVar;
    }

    public static void b(GeneratedMessageLite generatedMessageLite) {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(generatedMessageLite.newUninitializedMessageException().getMessage());
        invalidProtocolBufferException.l(generatedMessageLite);
        throw invalidProtocolBufferException;
    }

    public static final boolean c(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        boolean a2 = evf0Var.a(generatedMessageLite.getClass()).a(generatedMessageLite);
        if (z) {
            generatedMessageLite.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, a2 ? generatedMessageLite : null, null);
        }
        return a2;
    }

    public static GeneratedMessageLite d(GeneratedMessageLite generatedMessageLite, InputStream inputStream, pyo pyoVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            eac f = eac.f(new com.google.protobuf.a(eac.s(read, inputStream), inputStream));
            GeneratedMessageLite parsePartialFrom = parsePartialFrom(generatedMessageLite, f, pyoVar);
            try {
                f.a(0);
                return parsePartialFrom;
            } catch (InvalidProtocolBufferException e) {
                e.l(parsePartialFrom);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            if (e2.a()) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }

    public static GeneratedMessageLite e(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, pyo pyoVar) {
        if (i2 == 0) {
            return generatedMessageLite;
        }
        GeneratedMessageLite newMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            evf0 evf0Var = evf0.c;
            evf0Var.getClass();
            som0 a2 = evf0Var.a(newMutableInstance.getClass());
            a2.i(newMutableInstance, bArr, i, i + i2, new v43(pyoVar));
            a2.c(newMutableInstance);
            return newMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            InvalidProtocolBufferException invalidProtocolBufferException = e;
            if (invalidProtocolBufferException.a()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException(invalidProtocolBufferException);
            }
            invalidProtocolBufferException.l(newMutableInstance);
            throw invalidProtocolBufferException;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException2.l(newMutableInstance);
            throw invalidProtocolBufferException2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException3 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException3.l(newMutableInstance);
            throw invalidProtocolBufferException3;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException m = InvalidProtocolBufferException.m();
            m.l(newMutableInstance);
            throw m;
        }
    }

    public static bqw emptyBooleanList() {
        return i96.d();
    }

    public static cqw emptyDoubleList() {
        return d5m.d();
    }

    public static iqw emptyFloatList() {
        return bor.d();
    }

    public static jqw emptyIntList() {
        return o5w.x;
    }

    public static mqw emptyLongList() {
        return qlz.d();
    }

    public static <E> oqw emptyProtobufList() {
        return hvf0.x;
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                ny61.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) z321.b(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        ny61.k();
        return null;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
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

    public static jqw mutableCopy(jqw jqwVar) {
        return ((o5w) jqwVar).w(jqwVar.size() * 2);
    }

    public static Object newMessageInfo(wt10 wt10Var, String str, Object[] objArr) {
        return new u9i0(wt10Var, str, objArr);
    }

    public static <ContainingType extends wt10, Type> rxs newRepeatedGeneratedExtension(ContainingType containingtype, wt10 wt10Var, fqw fqwVar, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new rxs(containingtype, hvf0.x, wt10Var, new qxs(fqwVar, i, wireFormat$FieldType, true, z));
    }

    public static <ContainingType extends wt10, Type> rxs newSingularGeneratedExtension(ContainingType containingtype, Type type, wt10 wt10Var, fqw fqwVar, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new rxs(containingtype, type, wt10Var, new qxs(fqwVar, i, wireFormat$FieldType, false, false));
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) d(t, inputStream, pyo.b());
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        eac g;
        if (byteBuffer.hasArray()) {
            g = eac.g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && h.E()) {
            g = new h(byteBuffer, false);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            g = eac.g(bArr, 0, remaining, true);
        }
        T t2 = (T) parseFrom(t, g, pyoVar);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, eac eacVar, pyo pyoVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            evf0 evf0Var = evf0.c;
            evf0Var.getClass();
            som0 a2 = evf0Var.a(t2.getClass());
            a2.f(t2, i.a(eacVar), pyoVar);
            a2.c(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.l(t2);
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.l(t2);
            throw invalidProtocolBufferException;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException2.l(t2);
            throw invalidProtocolBufferException2;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        return evf0Var.a(getClass()).g(this);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends n> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        return evf0Var.a(getClass()).h(this, (GeneratedMessageLite) obj);
    }

    @Override // defpackage.zt10
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final of90 getParserForType() {
        return (of90) dynamicMethod(MethodToInvoke.GET_PARSER, null, null);
    }

    @Override // com.google.protobuf.b
    public int getSerializedSize(som0 som0Var) {
        int e;
        int e2;
        if (isMutable()) {
            if (som0Var == null) {
                evf0 evf0Var = evf0.c;
                evf0Var.getClass();
                e2 = evf0Var.a(getClass()).e(this);
            } else {
                e2 = som0Var.e(this);
            }
            if (e2 >= 0) {
                return e2;
            }
            ny61.r(oyr.i(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (som0Var == null) {
            evf0 evf0Var2 = evf0.c;
            evf0Var2.getClass();
            e = evf0Var2.a(getClass()).e(this);
        } else {
            e = som0Var.e(this);
        }
        setMemoizedSerializedSize(e);
        return e;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.zt10
    public final boolean isInitialized() {
        return c(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        evf0Var.a(getClass()).c(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        if (this.unknownFields == t.f) {
            this.unknownFields = new t();
        }
        t tVar = this.unknownFields;
        tVar.a();
        if (i != 0) {
            tVar.f((i << 3) | 2, byteString);
        } else {
            ny61.g("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(t tVar) {
        this.unknownFields = t.e(this.unknownFields, tVar);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == t.f) {
            this.unknownFields = new t();
        }
        t tVar = this.unknownFields;
        tVar.a();
        if (i != 0) {
            tVar.f(i << 3, Long.valueOf(i2));
        } else {
            ny61.g("Zero is not a valid field number.");
        }
    }

    @Override // defpackage.wt10
    public final n newBuilderForType() {
        return (n) dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null);
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
    }

    public boolean parseUnknownField(int i, eac eacVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == t.f) {
            this.unknownFields = new t();
        }
        return this.unknownFields.d(i, eacVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.b
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            ny61.r(oyr.i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    @Override // defpackage.wt10
    public final n toBuilder() {
        return ((n) dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null)).mergeFrom(this);
    }

    public String toString() {
        return o.d(this, super.toString());
    }

    @Override // defpackage.wt10
    public void writeTo(l lVar) throws IOException {
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        som0 a2 = evf0Var.a(getClass());
        gp50 gp50Var = lVar.a;
        if (gp50Var == null) {
            gp50Var = new gp50(lVar);
        }
        a2.j(this, gp50Var);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends n> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((GeneratedMessageLite) messagetype2);
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream, pyo pyoVar) throws InvalidProtocolBufferException {
        T t2 = (T) d(t, inputStream, pyoVar);
        b(t2);
        return t2;
    }

    public static mqw mutableCopy(mqw mqwVar) {
        return ((qlz) mqwVar).w(mqwVar.size() * 2);
    }

    public static iqw mutableCopy(iqw iqwVar) {
        return ((bor) iqwVar).w(iqwVar.size() * 2);
    }

    public static cqw mutableCopy(cqw cqwVar) {
        return ((d5m) cqwVar).w(cqwVar.size() * 2);
    }

    public static bqw mutableCopy(bqw bqwVar) {
        return ((i96) bqwVar).w(bqwVar.size() * 2);
    }

    public static <E> oqw mutableCopy(oqw oqwVar) {
        return oqwVar.w(oqwVar.size() * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, pyo.b());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, byteString, pyo.b());
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        eac k = byteString.k();
        T t2 = (T) parsePartialFrom(t, k, pyoVar);
        try {
            k.a(0);
            b(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e.l(t2);
            throw e;
        }
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) e(t, bArr, 0, bArr.length, pyo.b());
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        T t2 = (T) e(t, bArr, 0, bArr.length, pyoVar);
        b(t2);
        return t2;
    }

    @Override // defpackage.wt10
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, eac.f(inputStream), pyo.b());
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream, pyo pyoVar) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, eac.f(inputStream), pyoVar);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, eac eacVar) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, eacVar, pyo.b());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, eac eacVar, pyo pyoVar) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, eacVar, pyoVar);
        b(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, eac eacVar) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, eacVar, pyo.b());
    }
}
