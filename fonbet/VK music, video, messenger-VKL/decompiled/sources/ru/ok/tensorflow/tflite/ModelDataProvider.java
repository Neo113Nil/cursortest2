package ru.ok.tensorflow.tflite;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public interface ModelDataProvider {
    @NonNull
    ByteBuffer getModelData() throws IOException;
}
