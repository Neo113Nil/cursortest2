package org.msgpack.core.buffer;

import androidx.credentials.provider.CredentialEntry;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;
import xsna.wr;

/* loaded from: classes8.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[Catch: all -> 0x0020, Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0019, B:6:0x0025, B:9:0x0042, B:13:0x0054, B:18:0x0063), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Unsafe unsafe2;
        Unsafe unsafe3;
        boolean contains;
        boolean z;
        String str = BIGENDIAN_MESSAGE_BUFFER;
        Class cls = Integer.TYPE;
        String str2 = UNIVERSAL_MESSAGE_BUFFER;
        javaVersion = getJavaVersion();
        boolean z2 = false;
        int i = 16;
        try {
            try {
                Class.forName("sun.misc.Unsafe");
                unsafe2 = 1;
            } catch (Throwable th) {
                th = th;
                unsafe2 = null;
                unsafe = unsafe2;
                ARRAY_BYTE_BASE_OFFSET = 16;
                isUniversalBuffer = z2;
                if (!z2) {
                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                        str = DEFAULT_MESSAGE_BUFFER;
                    }
                    str2 = str;
                }
                if (DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                    try {
                        Class<?> cls2 = Class.forName(str2);
                        Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(byte[].class, cls, cls);
                        declaredConstructor.setAccessible(true);
                        mbArrConstructor = declaredConstructor;
                        Constructor<?> declaredConstructor2 = cls2.getDeclaredConstructor(ByteBuffer.class);
                        declaredConstructor2.setAccessible(true);
                        mbBBConstructor = declaredConstructor2;
                    } catch (Exception e) {
                        e.printStackTrace(System.err);
                        throw new RuntimeException(e);
                    }
                } else {
                    mbArrConstructor = null;
                    mbBBConstructor = null;
                }
                throw th;
            }
        } catch (Exception unused) {
            unsafe2 = null;
        }
        try {
            try {
                contains = System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
                z = System.getProperty("com.google.appengine.runtime.version") != null;
            } catch (Throwable th2) {
                th = th2;
                unsafe = unsafe2;
                ARRAY_BYTE_BASE_OFFSET = 16;
                isUniversalBuffer = z2;
                if (!z2) {
                }
                if (DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            unsafe3 = null;
        }
        if (!Boolean.parseBoolean(System.getProperty("msgpack.universal-buffer", CredentialEntry.FALSE_STRING))) {
            if (!contains) {
                if (!z) {
                    if (javaVersion >= 7) {
                        if (unsafe2 == null) {
                        }
                        if (z2) {
                            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            unsafe3 = (Unsafe) declaredField.get(null);
                            try {
                                if (unsafe3 == null) {
                                    throw new RuntimeException("Unsafe is unavailable");
                                }
                                i = unsafe3.arrayBaseOffset(byte[].class);
                                int arrayIndexScale = unsafe3.arrayIndexScale(byte[].class);
                                if (arrayIndexScale != 1) {
                                    throw new IllegalStateException("Byte array index scale must be 1, but is " + arrayIndexScale);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                e.printStackTrace(System.err);
                                unsafe = unsafe3;
                                ARRAY_BYTE_BASE_OFFSET = 16;
                                isUniversalBuffer = true;
                                if (!DEFAULT_MESSAGE_BUFFER.equals(UNIVERSAL_MESSAGE_BUFFER)) {
                                    try {
                                        Class<?> cls3 = Class.forName(UNIVERSAL_MESSAGE_BUFFER);
                                        Constructor<?> declaredConstructor3 = cls3.getDeclaredConstructor(byte[].class, cls, cls);
                                        declaredConstructor3.setAccessible(true);
                                        mbArrConstructor = declaredConstructor3;
                                        Constructor<?> declaredConstructor4 = cls3.getDeclaredConstructor(ByteBuffer.class);
                                        declaredConstructor4.setAccessible(true);
                                        mbBBConstructor = declaredConstructor4;
                                        return;
                                    } catch (Exception e4) {
                                        e4.printStackTrace(System.err);
                                        throw new RuntimeException(e4);
                                    }
                                }
                                mbArrConstructor = null;
                                mbBBConstructor = null;
                            }
                        } else {
                            unsafe3 = null;
                        }
                        unsafe = unsafe3;
                        ARRAY_BYTE_BASE_OFFSET = i;
                        isUniversalBuffer = z2;
                        if (!z2) {
                            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                                str = DEFAULT_MESSAGE_BUFFER;
                            }
                            str2 = str;
                        }
                        if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
                            try {
                                Class<?> cls4 = Class.forName(str2);
                                Constructor<?> declaredConstructor5 = cls4.getDeclaredConstructor(byte[].class, cls, cls);
                                declaredConstructor5.setAccessible(true);
                                mbArrConstructor = declaredConstructor5;
                                Constructor<?> declaredConstructor6 = cls4.getDeclaredConstructor(ByteBuffer.class);
                                declaredConstructor6.setAccessible(true);
                                mbBBConstructor = declaredConstructor6;
                                return;
                            } catch (Exception e5) {
                                e5.printStackTrace(System.err);
                                throw new RuntimeException(e5);
                            }
                        }
                        mbArrConstructor = null;
                        mbBBConstructor = null;
                    }
                }
            }
        }
        z2 = true;
        if (z2) {
        }
        unsafe = unsafe3;
        ARRAY_BYTE_BASE_OFFSET = i;
        isUniversalBuffer = z2;
        if (!z2) {
        }
        if (!DEFAULT_MESSAGE_BUFFER.equals(str2)) {
        }
        mbArrConstructor = null;
        mbBBConstructor = null;
    }

    public MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i;
        this.size = i2;
        this.reference = null;
    }

    public static MessageBuffer allocate(int i) {
        if (i >= 0) {
            return wrap(new byte[i]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static int getJavaVersion() {
        String property = System.getProperty("java.specification.version", "");
        int indexOf = property.indexOf(46);
        if (indexOf == -1) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e) {
                e.printStackTrace(System.err);
                return 6;
            }
        }
        try {
            int parseInt = Integer.parseInt(property.substring(0, indexOf));
            return parseInt > 1 ? parseInt : Integer.parseInt(property.substring(indexOf + 1));
        } catch (NumberFormatException e2) {
            e2.printStackTrace(System.err);
            return 6;
        }
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw new IllegalStateException(e3.getCause());
        }
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        Constructor<?> constructor = mbBBConstructor;
        return constructor != null ? newInstance(constructor, byteBuffer) : new MessageBuffer(byteBuffer);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (isUniversalBuffer || messageBuffer.hasArray()) {
            return;
        }
        if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
            DirectBufferAccess.clean(messageBuffer.reference);
        } else {
            unsafe.freeMemory(messageBuffer.address);
        }
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + i, messageBuffer.base, i2 + messageBuffer.address, i3);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + i);
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + i);
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + i, bArr, ARRAY_BYTE_BASE_OFFSET + i2, i3);
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + i));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + i));
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + i));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + i, z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + i, b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + byteBuffer.position(), this.base, this.address + i, i2);
            wr.c(i2, byteBuffer);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), byteBuffer.position() + ARRAY_BYTE_BASE_OFFSET, this.base, this.address + i, i2);
            wr.c(i2, byteBuffer);
            return;
        }
        if (hasArray()) {
            byteBuffer.get((byte[]) this.base, i, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            unsafe.putByte(this.base, this.address + i, byteBuffer.get());
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i2, this.base, this.address + i, i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + i, Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, i + this.address, Long.reverseBytes(j));
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + i2, this.base, i + this.address, i3);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + i, Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i + i2 <= size()) {
            return new MessageBuffer(this.base, this.address + i, i2);
        }
        throw new IllegalArgumentException();
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        return hasArray() ? ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ARRAY_BYTE_BASE_OFFSET) + i), i2) : DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i3))));
        }
        return sb.toString();
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i2) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i, i2));
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        bArr.getClass();
        Constructor<?> constructor = mbArrConstructor;
        if (constructor != null) {
            return newInstance(constructor, bArr, Integer.valueOf(i), Integer.valueOf(i2));
        }
        return new MessageBuffer(bArr, i, i2);
    }

    public MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                this.base = null;
                this.address = 0L;
                this.size = byteBuffer.remaining();
                this.reference = null;
                return;
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
            return;
        }
        if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = byteBuffer.position() + byteBuffer.arrayOffset() + ARRAY_BYTE_BASE_OFFSET;
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    public MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }
}
