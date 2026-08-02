package ru.ok.gl.tf.factory;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import ru.ok.TFFrameType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.gl.util.Supplier1;
import ru.ok.segmentation_full.pipeline.PipelineFull;
import ru.ok.segmentation_full.segmentation.ISegmenter;
import ru.ok.segmentation_full.segmentation.Segmenter;
import ru.ok.segmentation_full.segmentation.SegmenterConfig;
import ru.ok.segmentation_full.segmentation.SegmenterRecurrent;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;

/* loaded from: classes9.dex */
public class PersonSegmentationFactory {
    private GpuCache gpuCache;
    private final Logger logger;
    private int threadCount;
    private boolean useApi2;
    private boolean useGPU;

    public PersonSegmentationFactory(int i, boolean z, boolean z2, GpuCache gpuCache, @NonNull Logger logger) {
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
        this.useApi2 = z2;
        this.gpuCache = gpuCache;
    }

    private static SegmenterConfig getPersonSegmenterConfig() {
        return new SegmenterConfig.Builder().setQuantized(false).setMaskIsFirstOutput(true).build();
    }

    public PipelineFull create(TensorflowSegmentationType tensorflowSegmentationType, DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        ISegmenter segmenter;
        if (tensorflowSegmentationType != TensorflowSegmentationType.OLD_SEGMENTATION) {
            TensorflowSegmentationType tensorflowSegmentationType2 = TensorflowSegmentationType.NEW_SEGMENTATION_BIG;
            segmenter = new SegmenterRecurrent(weakReference, weakReference2, supplier1.get(tensorflowSegmentationType == tensorflowSegmentationType2 ? TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH : TensorflowModel.HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH), getPersonSegmenterConfig(), this.useGPU, this.useApi2 ? Util.Api2BufferType.PassCPU : Util.Api2BufferType.None, this.gpuCache, tensorflowSegmentationType == tensorflowSegmentationType2 ? TFFrameType.NORMAL : TFFrameType.SMALL);
        } else {
            segmenter = new Segmenter(weakReference, weakReference2, supplier1.get(TensorflowModel.HUMAN_SEGMENTATION), false, this.useGPU, this.logger, TFFrameType.SMALL);
        }
        return new PipelineFull(segmenter);
    }
}
