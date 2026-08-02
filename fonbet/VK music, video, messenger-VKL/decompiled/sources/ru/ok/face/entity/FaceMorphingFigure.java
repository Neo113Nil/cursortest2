package ru.ok.face.entity;

import ru.ok.gl.objects.Texture2D;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class FaceMorphingFigure extends FaceFigure {
    public float cropScaleFactor;
    public float cropTranslateFactor;
    public final ImageBuffer outputImg;
    public final ImageBuffer outputMask;
    public final ImageBuffer outputWarpMap;

    public static class ImageBuffer {
        public final int[] byteBuffer;
        public final float[] floatBuffer;
        public final Texture2D texture;

        public ImageBuffer(int[] iArr) {
            this(iArr, null, null);
        }

        public ImageBuffer(float[] fArr) {
            this(null, fArr, null);
        }

        public ImageBuffer(Texture2D texture2D) {
            this(null, null, texture2D);
        }

        private ImageBuffer(int[] iArr, float[] fArr, Texture2D texture2D) {
            this.byteBuffer = iArr;
            this.floatBuffer = fArr;
            this.texture = texture2D;
        }
    }

    public FaceMorphingFigure(Detection detection, float[] fArr, float f, float[] fArr2, boolean z, ImageBuffer imageBuffer, ImageBuffer imageBuffer2, ImageBuffer imageBuffer3, float f2, float f3) {
        super(detection, fArr, f, fArr2, z);
        this.outputImg = imageBuffer;
        this.outputMask = imageBuffer2;
        this.outputWarpMap = imageBuffer3;
        this.cropScaleFactor = f2;
        this.cropTranslateFactor = f3;
        detection.fillRect(this.position);
    }

    @Override // ru.ok.face.entity.FaceFigure
    public FaceMorphingFigure updateDetection(Detection detection) {
        return new FaceMorphingFigure(detection, this.mesh, this.score, this.rotationMatrix, this.is3DMesh, this.outputImg, this.outputMask, this.outputWarpMap, this.cropScaleFactor, this.cropTranslateFactor);
    }
}
