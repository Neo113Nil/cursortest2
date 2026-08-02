package ru.ok.pattern.smoothing;

import org.opencv.core.Mat;
import ru.ok.tensorflow.smoothing.filter.CyclicFilterEma;
import ru.ok.tensorflow.util.MatUtils;

/* loaded from: classes9.dex */
public class RotationSmoother {
    private final float[] alphas;
    private CyclicFilterEma[] filters = null;
    private final float[] maxDeltas;

    public RotationSmoother(float f, float f2, float f3, float f4, float f5, float f6) {
        this.alphas = new float[]{f, f2, f3};
        this.maxDeltas = new float[]{f4, f5, f6};
    }

    public Mat smooth(Mat mat) {
        long currentTimeMillis = System.currentTimeMillis();
        float[] rotationMat2eulerAngles = MatUtils.rotationMat2eulerAngles(mat);
        int i = 0;
        if (this.filters == null) {
            this.filters = new CyclicFilterEma[3];
            int i2 = 0;
            while (true) {
                CyclicFilterEma[] cyclicFilterEmaArr = this.filters;
                if (i2 >= cyclicFilterEmaArr.length) {
                    break;
                }
                cyclicFilterEmaArr[i2] = new CyclicFilterEma(0L, rotationMat2eulerAngles[i2], this.alphas[i2], this.maxDeltas[i2]);
                i2++;
            }
        }
        float[] fArr = new float[rotationMat2eulerAngles.length];
        while (true) {
            CyclicFilterEma[] cyclicFilterEmaArr2 = this.filters;
            if (i >= cyclicFilterEmaArr2.length) {
                return MatUtils.makeOrthogonal(MatUtils.eulerAngles2rotationMat(fArr));
            }
            fArr[i] = cyclicFilterEmaArr2[i].filter(currentTimeMillis, rotationMat2eulerAngles[i]);
            i++;
        }
    }
}
