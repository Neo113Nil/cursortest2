package androidx.datastore.preferences.protobuf;

import defpackage.a421;
import defpackage.au10;
import defpackage.au50;
import defpackage.fvf0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tom0;
import defpackage.zxq;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends androidx.datastore.preferences.protobuf.a {
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

    public static abstract class a extends GeneratedMessageLite implements au10 {
        protected zxq extensions = zxq.c;

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, defpackage.au10
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) f(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, defpackage.xt10
        public final l newBuilderForType() {
            return (l) f(MethodToInvoke.NEW_BUILDER);
        }
    }

    public static GeneratedMessageLite g(Class cls) {
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
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) a421.d(cls)).f(MethodToInvoke.GET_DEFAULT_INSTANCE);
        if (generatedMessageLite2 != null) {
            defaultInstanceMap.put(cls, generatedMessageLite2);
            return generatedMessageLite2;
        }
        ny61.k();
        return null;
    }

    public static Object h(Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
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

    public static final boolean i(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.f(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        fvf0 fvf0Var = fvf0.c;
        fvf0Var.getClass();
        boolean a2 = fvf0Var.a(generatedMessageLite.getClass()).a(generatedMessageLite);
        if (z) {
            generatedMessageLite.f(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        }
        return a2;
    }

    public static void m(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.k();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    @Override // defpackage.au10
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) f(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int b() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int c(tom0 tom0Var) {
        int e;
        int e2;
        if (j()) {
            if (tom0Var == null) {
                fvf0 fvf0Var = fvf0.c;
                fvf0Var.getClass();
                e2 = fvf0Var.a(getClass()).e(this);
            } else {
                e2 = tom0Var.e(this);
            }
            if (e2 >= 0) {
                return e2;
            }
            ny61.r(oyr.i(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (b() != Integer.MAX_VALUE) {
            return b();
        }
        if (tom0Var == null) {
            fvf0 fvf0Var2 = fvf0.c;
            fvf0Var2.getClass();
            e = fvf0Var2.a(getClass()).e(this);
        } else {
            e = tom0Var.e(this);
        }
        d(e);
        return e;
    }

    @Override // androidx.datastore.preferences.protobuf.a
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
        fvf0 fvf0Var = fvf0.c;
        fvf0Var.getClass();
        return fvf0Var.a(getClass()).f(this, (GeneratedMessageLite) obj);
    }

    public abstract Object f(MethodToInvoke methodToInvoke);

    public final int hashCode() {
        if (j()) {
            fvf0 fvf0Var = fvf0.c;
            fvf0Var.getClass();
            return fvf0Var.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            fvf0 fvf0Var2 = fvf0.c;
            fvf0Var2.getClass();
            this.memoizedHashCode = fvf0Var2.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final GeneratedMessageLite l() {
        return (GeneratedMessageLite) f(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public final void n(i iVar) {
        fvf0 fvf0Var = fvf0.c;
        fvf0Var.getClass();
        tom0 a2 = fvf0Var.a(getClass());
        au50 au50Var = iVar.a;
        if (au50Var == null) {
            au50Var = new au50(iVar);
        }
        a2.h(this, au50Var);
    }

    @Override // defpackage.xt10
    public l newBuilderForType() {
        return (l) f(MethodToInvoke.NEW_BUILDER);
    }

    public final String toString() {
        return m.d(this, super.toString());
    }
}
