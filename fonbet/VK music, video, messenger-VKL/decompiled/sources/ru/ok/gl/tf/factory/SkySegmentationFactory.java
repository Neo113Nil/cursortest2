package ru.ok.gl.tf.factory;

import java.lang.ref.WeakReference;
import ru.ok.TFFrameType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.segmentation_full.pipeline.PipelineFull;
import ru.ok.segmentation_full.segmentation.SegmenterConfig;
import ru.ok.segmentation_full.segmentation.SegmenterRecurrent;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;

/* loaded from: classes9.dex */
public class SkySegmentationFactory {
    private GpuCache gpuCache;
    private int threadCount;
    private boolean useGPU;
    private boolean useGPUPass;

    public SkySegmentationFactory(int i, boolean z, boolean z2, GpuCache gpuCache) {
        this.threadCount = i;
        this.useGPU = z;
        this.useGPUPass = z2;
        this.gpuCache = gpuCache;
    }

    private static SegmenterConfig getSkySegmenterConfig() {
        return new SegmenterConfig.Builder().setQuantized(false).setMaskIsFirstOutput(true).build();
    }

    public PipelineFull create(DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        ModelDataProvider modelDataProvider = supplier1.get(TensorflowModel.SKY_SEGMENTATION_RECURRENT);
        SegmenterConfig skySegmenterConfig = getSkySegmenterConfig();
        boolean z = this.useGPU;
        return new PipelineFull(new SegmenterRecurrent(weakReference, weakReference2, modelDataProvider, skySegmenterConfig, z, this.useGPUPass ? Util.Api2BufferType.PassGPU : z ? Util.Api2BufferType.PassCPU : Util.Api2BufferType.None, this.gpuCache, TFFrameType.SKY));
    }
}
