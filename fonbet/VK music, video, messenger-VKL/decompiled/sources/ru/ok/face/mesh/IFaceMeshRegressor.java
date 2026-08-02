package ru.ok.face.mesh;

import java.io.Closeable;
import java.util.List;
import ru.ok.FrameConsumer;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.gpu.IBaseGPUProcessor;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public interface IFaceMeshRegressor extends Closeable, FrameConsumer, IBaseGPUProcessor {
    List<FaceFigure> run(FrameHolder frameHolder, List<Detection> list, boolean z);

    FaceFigure run(FrameHolder frameHolder, Detection detection, boolean z);
}
