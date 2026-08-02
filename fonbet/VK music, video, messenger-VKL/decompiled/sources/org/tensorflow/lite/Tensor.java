package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes8.dex */
public final class Tensor {
    public long a;
    public final DataType b;
    public int[] c;

    public Tensor(long j) {
        this.a = j;
        this.b = DataType.i(dtype(j));
        this.c = shape(j);
        shapeSignature(j);
        quantizationScale(j);
        quantizationZeroPoint(j);
    }

    private static native ByteBuffer buffer(long j);

    public static int c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j, int i);

    private static native void delete(long j);

    private static native int dtype(long j);

    public static void e(Object obj, int i, int[] iArr) {
        if (i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)));
        }
        for (int i3 = 0; i3 < length; i3++) {
            e(Array.get(obj, i3), i + 1, iArr);
        }
    }

    public static Tensor f(int i, long j) {
        return new Tensor(create(j, i));
    }

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    private static native void writeScalar(long j, Object obj);

    public final ByteBuffer a() {
        return buffer(this.a).order(ByteOrder.nativeOrder());
    }

    public final void b() {
        delete(this.a);
        this.a = 0L;
    }

    public final void d(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.a)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        i(obj);
        boolean z = obj instanceof Buffer;
        if (z) {
            int numBytes = numBytes(this.a);
            boolean z2 = obj instanceof ByteBuffer;
            int capacity = ((Buffer) obj).capacity();
            if (!z2) {
                capacity *= this.b.h();
            }
            if (numBytes > capacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(this.a), Integer.valueOf(numBytes), Integer.valueOf(capacity)));
            }
        } else {
            int[] iArr = new int[c(obj)];
            e(obj, 0, iArr);
            if (!Arrays.equals(iArr, this.c)) {
                throw new IllegalArgumentException(i5s.a(xe9.a("Cannot copy from a TensorFlowLite tensor (", name(this.a), ") with shape ", Arrays.toString(this.c), " to a Java object with shape "), Arrays.toString(iArr), "."));
            }
        }
        if (!z) {
            readMultiDimensionalArray(this.a, obj);
            return;
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(a());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(a().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(a().asLongBuffer());
        } else if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(a().asIntBuffer());
        } else {
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    public final void g() {
        this.c = shape(this.a);
    }

    public final void h(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.a)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        i(obj);
        boolean z = obj instanceof Buffer;
        if (z) {
            int numBytes = numBytes(this.a);
            boolean z2 = obj instanceof ByteBuffer;
            int capacity = ((Buffer) obj).capacity();
            if (!z2) {
                capacity *= this.b.h();
            }
            if (numBytes != capacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(this.a), Integer.valueOf(numBytes), Integer.valueOf(capacity)));
            }
        } else {
            int[] iArr = new int[c(obj)];
            e(obj, 0, iArr);
            if (!Arrays.equals(iArr, this.c)) {
                throw new IllegalArgumentException(i5s.a(xe9.a("Cannot copy to a TensorFlowLite tensor (", name(this.a), ") with shape ", Arrays.toString(this.c), " from a Java object with shape "), Arrays.toString(iArr), "."));
            }
        }
        if (!z) {
            if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.a, obj);
                return;
            } else {
                writeScalar(this.a, obj);
                return;
            }
        }
        Buffer buffer = (Buffer) obj;
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.a, buffer);
                return;
            } else {
                a().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.a, buffer);
                return;
            } else {
                a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.a, buffer);
                return;
            } else {
                a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (!(buffer instanceof IntBuffer)) {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
        IntBuffer intBuffer = (IntBuffer) buffer;
        if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.a, buffer);
        } else {
            a().asIntBuffer().put(intBuffer);
        }
    }

    public final void i(Object obj) {
        DataType dataType;
        DataType dataType2;
        if (obj instanceof ByteBuffer) {
            return;
        }
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (!cls.isArray()) {
                if (Float.class.equals(cls) || (obj instanceof FloatBuffer)) {
                    dataType = DataType.FLOAT32;
                } else if (Integer.class.equals(cls) || (obj instanceof IntBuffer)) {
                    dataType = DataType.INT32;
                } else if (Byte.class.equals(cls)) {
                    dataType = DataType.UINT8;
                } else if (Long.class.equals(cls) || (obj instanceof LongBuffer)) {
                    dataType = DataType.INT64;
                } else if (String.class.equals(cls)) {
                    dataType = DataType.STRING;
                }
                dataType2 = this.b;
                if (dataType != dataType2) {
                    return;
                } else {
                    return;
                }
            }
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                dataType = DataType.FLOAT32;
            } else if (Integer.TYPE.equals(cls)) {
                dataType = DataType.INT32;
            } else if (Byte.TYPE.equals(cls)) {
                dataType = DataType.UINT8;
            } else if (Long.TYPE.equals(cls)) {
                dataType = DataType.INT64;
            } else if (String.class.equals(cls)) {
                dataType = DataType.STRING;
            }
            dataType2 = this.b;
            if (dataType != dataType2 || dataType.j().equals(dataType2.j())) {
                return;
            }
            throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + dataType2 + " and a Java object of type " + obj.getClass().getName() + " (which is compatible with the TensorFlowLite type " + dataType + ").");
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
    }
}
