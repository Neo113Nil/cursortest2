package ru.ok.gl.tf;

import android.graphics.Bitmap;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.FiguresConsumer;
import ru.ok.gl.util.Consumer;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;

/* loaded from: classes9.dex */
public interface TensorflowListener {
    void addCompositeFigureConsumer(FiguresConsumer<Figure<CompositeGesture>> figuresConsumer);

    void addFaceConsumer(FiguresConsumer<FaceFigure> figuresConsumer);

    void addFigureConsumer(FiguresConsumer<Figure<Gesture>> figuresConsumer);

    void addFullSegmentationConsumer(Consumer<Bitmap> consumer);

    void removeCompositeFigureConsumer(FiguresConsumer<Figure<CompositeGesture>> figuresConsumer);

    void removeFaceConsumer(FiguresConsumer<FaceFigure> figuresConsumer);

    void removeFigureConsumer(FiguresConsumer<Figure<Gesture>> figuresConsumer);

    void removeFullSegmentationConsumer(Consumer<Bitmap> consumer);
}
