package ru.ok.call_effects;

import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.tensorflow.tflite.ModelDataProvider;

/* compiled from: TensorflowModels.kt */
/* loaded from: classes9.dex */
public interface TensorflowModels {
    ModelDataProvider getModelDataProvider(TensorflowModel tensorflowModel);

    TensorflowFaceLandmarksType getTensorflowFaceLandmarksType();

    TensorflowSegmentationType getTensorflowSegmentationType();

    boolean isReady();
}
