package ru.ok.tensorflow.tflite;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import ru.ok.gpu.GpuInfo;
import ru.ok.native_loader_bridge.NativeLibLoaderBridge;
import xsna.lhg;

/* loaded from: classes9.dex */
public class InterpreterGPU {
    private long nativeInstance;
    private boolean useCpuBuffer = false;

    static {
        NativeLibLoaderBridge.loadLibrary("tensorflowlite");
        NativeLibLoaderBridge.loadLibrary("tensorflowlite_gpu_delegate");
        NativeLibLoaderBridge.loadLibrary("native-tensorflow-core-lib");
    }

    public InterpreterGPU() {
        this.nativeInstance = 0L;
        this.nativeInstance = native_createInstance();
    }

    public static GpuInfo getGpuType(String str) {
        return native_getGpuType(str);
    }

    private native boolean native_bindInput(long j, int i, int i2);

    private native boolean native_bindInputCpu(long j, int i, ByteBuffer byteBuffer);

    private native boolean native_bindOutput(long j, int i, int i2);

    private native boolean native_bindOutputCpu(long j, int i, ByteBuffer byteBuffer);

    private native void native_close(long j);

    private native boolean native_createGpu(long j, boolean z, boolean z2);

    private native long native_createInstance();

    private static native GpuInfo native_getGpuType(String str);

    private native int[] native_getInputsDim(long j, int i);

    private native boolean native_getOpenCLCache(long j, ByteBuffer byteBuffer);

    private native int native_getOpenCLCacheSize(long j);

    private native int[] native_getOutputsDim(long j, int i);

    private native boolean native_init(long j, ByteBuffer byteBuffer, int i);

    private native int native_inputsNum(long j);

    private native boolean native_needCreateGpu(long j);

    private native int native_outputsNum(long j);

    private native void native_releaseInstance(long j);

    private native boolean native_run(long j);

    private native void native_setOpenCLCache(long j, ByteBuffer byteBuffer);

    public void close() {
        long j = this.nativeInstance;
        if (j != 0) {
            native_close(j);
            native_releaseInstance(this.nativeInstance);
            this.nativeInstance = 0L;
        }
    }

    public boolean createGpu(boolean z, boolean z2) {
        this.useCpuBuffer = z2;
        return native_createGpu(this.nativeInstance, z, z2);
    }

    public int[] getInputsDim(int i) {
        return native_getInputsDim(this.nativeInstance, i);
    }

    public ByteBuffer getOpenCLCache() {
        int native_getOpenCLCacheSize = native_getOpenCLCacheSize(this.nativeInstance);
        if (native_getOpenCLCacheSize == 0) {
            return null;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(native_getOpenCLCacheSize);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (native_getOpenCLCache(this.nativeInstance, allocateDirect)) {
            return allocateDirect;
        }
        return null;
    }

    public int[] getOutputsDim(int i) {
        return native_getOutputsDim(this.nativeInstance, i);
    }

    public boolean init(ByteBuffer byteBuffer, int i) {
        return native_init(this.nativeInstance, byteBuffer, i);
    }

    public int inputsNum() {
        return native_inputsNum(this.nativeInstance);
    }

    public boolean needCreateGpu() {
        return native_needCreateGpu(this.nativeInstance);
    }

    public int outputsNum() {
        return native_outputsNum(this.nativeInstance);
    }

    public void run(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(0, obj2);
        runForMultipleInputsOutputs(new Object[]{obj}, hashMap);
    }

    public void runForMultipleInputsOutputs(Object[] objArr, @NonNull Map<Integer, Object> map) {
        for (int i = 0; i < objArr.length; i++) {
            if (this.useCpuBuffer) {
                if (!native_bindInputCpu(this.nativeInstance, i, (ByteBuffer) objArr[i])) {
                    throw new RuntimeException(lhg.a(i, "Failed native_bindInputCpu CPU TFL input="));
                }
            } else if (!native_bindInput(this.nativeInstance, i, ((Integer) objArr[i]).intValue())) {
                throw new RuntimeException(lhg.a(i, "Failed native_bindInput GPU TFL input="));
            }
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            if (this.useCpuBuffer) {
                if (!native_bindOutputCpu(this.nativeInstance, entry.getKey().intValue(), (ByteBuffer) entry.getValue())) {
                    throw new RuntimeException("Failed native_bindOutputCpu CPU TFL key=" + entry.getKey());
                }
            } else if (!native_bindOutput(this.nativeInstance, entry.getKey().intValue(), ((Integer) entry.getValue()).intValue())) {
                throw new RuntimeException("Failed native_bindOutput GPU TFL key=" + entry.getKey());
            }
        }
        if (native_run(this.nativeInstance)) {
            return;
        }
        throw new RuntimeException("Failed run GPU TFL useCpuBuffer=" + this.useCpuBuffer);
    }

    public void setOpenCLCache(ByteBuffer byteBuffer) {
        native_setOpenCLCache(this.nativeInstance, byteBuffer);
    }
}
