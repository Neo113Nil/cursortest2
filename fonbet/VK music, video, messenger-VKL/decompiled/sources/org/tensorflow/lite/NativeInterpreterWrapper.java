package org.tensorflow.lite;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.a;
import xsna.ktl;
import xsna.lhg;
import xsna.ryt0;

/* loaded from: classes8.dex */
final class NativeInterpreterWrapper implements AutoCloseable {
    public long b;
    public long c;
    public long d;
    public ByteBuffer e;
    public final Tensor[] f;
    public final Tensor[] g;
    public boolean h;
    private long inferenceDurationNanoseconds = -1;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        r0 = (xsna.ktl) r4.getConstructor(null).newInstance(null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NativeInterpreterWrapper(ByteBuffer byteBuffer, a.C2187a c2187a) {
        this.h = false;
        TensorFlowLite.a();
        if (byteBuffer == null || !((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.e = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        long createModelWithBuffer = createModelWithBuffer(this.e, createErrorReporter);
        ArrayList arrayList = c2187a.c;
        this.b = createErrorReporter;
        this.d = createModelWithBuffer;
        long createInterpreter = createInterpreter(createModelWithBuffer, createErrorReporter, c2187a.a);
        this.c = createInterpreter;
        this.f = new Tensor[getInputCount(createInterpreter)];
        this.g = new Tensor[getOutputCount(this.c)];
        boolean hasUnresolvedFlexOp = hasUnresolvedFlexOp(this.c);
        if (hasUnresolvedFlexOp) {
            ktl ktlVar = null;
            try {
                Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (cls.isInstance((ktl) it.next())) {
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            if (ktlVar != null) {
                this.j.add((AutoCloseable) ktlVar);
                applyDelegate(this.c, this.b, ktlVar.m());
            }
        }
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ktl ktlVar2 = (ktl) it2.next();
                applyDelegate(this.c, this.b, ktlVar2.m());
                this.i.add(ktlVar2);
            }
        } catch (IllegalArgumentException e) {
            if (!hasUnresolvedFlexOp) {
                throw e;
            }
            if (hasUnresolvedFlexOp(this.c)) {
                throw e;
            }
            System.err.println("Ignoring failed delegate application: " + e);
        }
        Boolean bool = c2187a.b;
        if (bool != null) {
            useXNNPACK(this.c, createErrorReporter, bool.booleanValue(), c2187a.a);
        }
        allocateTensors(this.c, createErrorReporter);
        this.h = true;
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native void numThreads(long j, int i);

    private static native void resetVariableTensors(long j, long j2);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    private static native void useNNAPI(long j, boolean z);

    private static native void useXNNPACK(long j, long j2, boolean z, int i);

    public final Tensor b(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.f;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.c;
                Tensor f = Tensor.f(getInputTensorIndex(j, i), j);
                tensorArr[i] = f;
                return f;
            }
        }
        throw new IllegalArgumentException(lhg.a(i, "Invalid input Tensor index: "));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            Tensor[] tensorArr = this.f;
            if (i >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i];
            if (tensor != null) {
                tensor.b();
                this.f[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.g;
            if (i2 >= tensorArr2.length) {
                break;
            }
            Tensor tensor2 = tensorArr2[i2];
            if (tensor2 != null) {
                tensor2.b();
                this.g[i2] = null;
            }
            i2++;
        }
        delete(this.b, this.d, this.c);
        this.b = 0L;
        this.d = 0L;
        this.c = 0L;
        this.e = null;
        this.h = false;
        this.i.clear();
        ArrayList arrayList = this.j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ryt0.a((AutoCloseable) it.next());
            } catch (Exception e) {
                System.err.println("Failed to close flex delegate: " + e);
            }
        }
        arrayList.clear();
    }

    public final Long m() {
        long j = this.inferenceDurationNanoseconds;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final Tensor n(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.g;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.c;
                Tensor f = Tensor.f(getOutputTensorIndex(j, i), j);
                tensorArr[i] = f;
                return f;
            }
        }
        throw new IllegalArgumentException(lhg.a(i, "Invalid output Tensor index: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Object[] objArr, Map<Integer, Object> map) {
        int[] iArr;
        Tensor tensor;
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Outputs should not be null or empty.");
        }
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Tensor b = b(i2);
            Object obj = objArr[i2];
            if (obj != null && !(obj instanceof Buffer)) {
                b.i(obj);
                int[] iArr2 = new int[Tensor.c(obj)];
                Tensor.e(obj, 0, iArr2);
                if (!Arrays.equals(b.c, iArr2)) {
                    iArr = iArr2;
                    if (iArr != null && resizeInput(this.c, this.b, i2, iArr, false)) {
                        this.h = false;
                        tensor = this.f[i2];
                        if (tensor == null) {
                            tensor.g();
                        }
                    }
                }
            }
            iArr = null;
            if (iArr != null) {
                this.h = false;
                tensor = this.f[i2];
                if (tensor == null) {
                }
            }
        }
        boolean z = this.h;
        if (!z) {
            allocateTensors(this.c, this.b);
            this.h = true;
        }
        for (int i3 = 0; i3 < objArr.length; i3++) {
            b(i3).h(objArr[i3]);
        }
        long nanoTime = System.nanoTime();
        run(this.c, this.b);
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (!z) {
            while (true) {
                Tensor[] tensorArr = this.g;
                if (i >= tensorArr.length) {
                    break;
                }
                Tensor tensor2 = tensorArr[i];
                if (tensor2 != null) {
                    tensor2.g();
                }
                i++;
            }
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            n(entry.getKey().intValue()).d(entry.getValue());
        }
        this.inferenceDurationNanoseconds = nanoTime2;
    }
}
