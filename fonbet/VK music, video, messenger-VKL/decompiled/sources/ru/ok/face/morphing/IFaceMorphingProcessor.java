package ru.ok.face.morphing;

import java.io.Closeable;
import java.util.List;
import ru.ok.FrameConsumer;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.gpu.IBaseGPUProcessor;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public interface IFaceMorphingProcessor extends Closeable, FrameConsumer, IBaseGPUProcessor {
    List<FaceMorphingFigure> run(FrameHolder frameHolder, List<Detection> list, boolean z);

    FaceMorphingFigure run(FrameHolder frameHolder, Detection detection, boolean z);
}
