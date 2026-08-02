package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import sun.misc.Unsafe;

/* loaded from: classes8.dex */
class DirectBufferAccess {
    static Constructor<?> byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mGetAddress;
    static Method mInvokeCleaner;
    static Method memoryBlockWrapFromJni;

    /* renamed from: org.msgpack.core.buffer.DirectBufferAccess$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;

        static {
            int[] iArr = new int[DirectBufferConstructorType.values().length];
            $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = iArr;
            try {
                iArr[DirectBufferConstructorType.ARGS_LONG_INT_REF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_LONG_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_INT_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_MB_INT_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum DirectBufferConstructorType {
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        Constructor<?> declaredConstructor;
        Method method;
        DirectBufferConstructorType directBufferConstructorType2;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
            Class<?> cls3 = allocateDirect.getClass();
            directByteBufferClass = cls3;
            try {
                try {
                    try {
                        declaredConstructor = cls3.getDeclaredConstructor(cls, cls2, Object.class);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT_REF;
                    } catch (NoSuchMethodException unused) {
                        Class<?> cls4 = Class.forName("java.nio.MemoryBlock");
                        Method declaredMethod = cls4.getDeclaredMethod("wrapFromJni", cls2, cls);
                        declaredMethod.setAccessible(true);
                        declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls4, cls2, cls2);
                        method = declaredMethod;
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_MB_INT_INT;
                    }
                } catch (NoSuchMethodException unused2) {
                    declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls2, cls2);
                    directBufferConstructorType2 = DirectBufferConstructorType.ARGS_INT_INT;
                }
            } catch (NoSuchMethodException unused3) {
                declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls, cls2);
                directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT;
            }
            method = null;
            byteBufferConstructor = declaredConstructor;
            directBufferConstructorType = directBufferConstructorType2;
            memoryBlockWrapFromJni = method;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            declaredConstructor.setAccessible(true);
            Method declaredMethod2 = directByteBufferClass.getDeclaredMethod(RTCStatsConstants.KEY_ADDRESS, null);
            mGetAddress = declaredMethod2;
            declaredMethod2.setAccessible(true);
            if (MessageBuffer.javaVersion <= 8) {
                setupCleanerJava6(allocateDirect);
            } else {
                setupCleanerJava9(allocateDirect);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private DirectBufferAccess() {
    }

    public static void clean(Object obj) {
        try {
            if (MessageBuffer.javaVersion > 8) {
                mInvokeCleaner.invoke(MessageBuffer.unsafe, obj);
            } else {
                mClean.invoke(mCleaner.invoke(obj, null), null);
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static long getAddress(Object obj) {
        try {
            return ((Long) mGetAddress.invoke(obj, null)).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getCleanMethod(ByteBuffer byteBuffer, Method method) {
        try {
            Method declaredMethod = method.getReturnType().getDeclaredMethod("clean", null);
            Object invoke = method.invoke(byteBuffer, null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(invoke, null);
            return declaredMethod;
        } catch (IllegalAccessException e) {
            return e;
        } catch (NoSuchMethodException e2) {
            return e2;
        } catch (InvocationTargetException e3) {
            return e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, null);
            return declaredMethod;
        } catch (IllegalAccessException e) {
            return e;
        } catch (NoSuchMethodException e2) {
            return e2;
        } catch (InvocationTargetException e3) {
            return e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getInvokeCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Unsafe unsafe = MessageBuffer.unsafe;
            Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", ByteBuffer.class);
            declaredMethod.invoke(unsafe, byteBuffer);
            return declaredMethod;
        } catch (IllegalAccessException e) {
            return e;
        } catch (NoSuchMethodException e2) {
            return e2;
        } catch (InvocationTargetException e3) {
            return e3;
        }
    }

    public static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    public static ByteBuffer newByteBuffer(long j, int i, int i2, ByteBuffer byteBuffer) {
        try {
            int i3 = AnonymousClass4.$SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[directBufferConstructorType.ordinal()];
            if (i3 == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j + i), Integer.valueOf(i2), byteBuffer);
            }
            if (i3 == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j + i), Integer.valueOf(i2));
            }
            if (i3 == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Integer.valueOf(((int) j) + i), Integer.valueOf(i2));
            }
            if (i3 == 4) {
                return (ByteBuffer) byteBufferConstructor.newInstance(memoryBlockWrapFromJni.invoke(null, Long.valueOf(j + i), Integer.valueOf(i2)), Integer.valueOf(i2), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static void setupCleanerJava6(final ByteBuffer byteBuffer) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getCleanerMethod(byteBuffer);
            }
        });
        if (doPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) doPrivileged);
        }
        mCleaner = (Method) doPrivileged;
        Object doPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getCleanMethod(byteBuffer, DirectBufferAccess.mCleaner);
            }
        });
        if (doPrivileged2 instanceof Throwable) {
            throw new RuntimeException((Throwable) doPrivileged2);
        }
        mClean = (Method) doPrivileged2;
    }

    private static void setupCleanerJava9(final ByteBuffer byteBuffer) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getInvokeCleanerMethod(byteBuffer);
            }
        });
        if (doPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) doPrivileged);
        }
        mInvokeCleaner = (Method) doPrivileged;
    }
}
