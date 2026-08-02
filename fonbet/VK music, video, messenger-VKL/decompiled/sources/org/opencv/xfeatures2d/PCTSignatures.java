package org.opencv.xfeatures2d;

import org.opencv.core.Algorithm;

/* loaded from: classes8.dex */
public class PCTSignatures extends Algorithm {
    private static native void computeSignature_0(long j, long j2, long j3);

    private static native void computeSignatures_0(long j, long j2, long j3);

    private static native long create_0(int i, int i2, int i3);

    private static native long create_1(int i, int i2);

    private static native long create_2(int i);

    private static native long create_3();

    private static native long create_4(long j, int i);

    private static native long create_5(long j, long j2);

    private static native void delete(long j);

    private static native void drawSignature_0(long j, long j2, long j3, float f, int i);

    private static native void drawSignature_1(long j, long j2, long j3, float f);

    private static native void drawSignature_2(long j, long j2, long j3);

    private static native void generateInitPoints_0(long j, int i, int i2);

    private static native int getClusterMinSize_0(long j);

    private static native int getDistanceFunction_0(long j);

    private static native float getDropThreshold_0(long j);

    private static native int getGrayscaleBits_0(long j);

    private static native int getInitSeedCount_0(long j);

    private static native long getInitSeedIndexes_0(long j);

    private static native int getIterationCount_0(long j);

    private static native float getJoiningDistance_0(long j);

    private static native int getMaxClustersCount_0(long j);

    private static native int getSampleCount_0(long j);

    private static native long getSamplingPoints_0(long j);

    private static native float getWeightA_0(long j);

    private static native float getWeightB_0(long j);

    private static native float getWeightContrast_0(long j);

    private static native float getWeightEntropy_0(long j);

    private static native float getWeightL_0(long j);

    private static native float getWeightX_0(long j);

    private static native float getWeightY_0(long j);

    private static native int getWindowRadius_0(long j);

    private static native void setClusterMinSize_0(long j, int i);

    private static native void setDistanceFunction_0(long j, int i);

    private static native void setDropThreshold_0(long j, float f);

    private static native void setGrayscaleBits_0(long j, int i);

    private static native void setInitSeedIndexes_0(long j, long j2);

    private static native void setIterationCount_0(long j, int i);

    private static native void setJoiningDistance_0(long j, float f);

    private static native void setMaxClustersCount_0(long j, int i);

    private static native void setSamplingPoints_0(long j, long j2);

    private static native void setTranslation_0(long j, int i, float f);

    private static native void setTranslations_0(long j, long j2);

    private static native void setWeightA_0(long j, float f);

    private static native void setWeightB_0(long j, float f);

    private static native void setWeightContrast_0(long j, float f);

    private static native void setWeightEntropy_0(long j, float f);

    private static native void setWeightL_0(long j, float f);

    private static native void setWeightX_0(long j, float f);

    private static native void setWeightY_0(long j, float f);

    private static native void setWeight_0(long j, int i, float f);

    private static native void setWeights_0(long j, long j2);

    private static native void setWindowRadius_0(long j, int i);

    @Override // org.opencv.core.Algorithm
    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
