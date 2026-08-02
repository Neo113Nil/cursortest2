package org.opencv.features2d;

import java.util.ArrayList;
import java.util.Iterator;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Range;
import xsna.jgz;
import xsna.pk10;

/* loaded from: classes8.dex */
public class DescriptorMatcher extends Algorithm {
    public static DescriptorMatcher a() {
        return new DescriptorMatcher(create_0(4));
    }

    private static native void add_0(long j, long j2);

    private static native void clear_0(long j);

    private static native long clone_0(long j, boolean z);

    private static native long clone_1(long j);

    private static native long create_0(int i);

    private static native long create_1(String str);

    private static native void delete(long j);

    private static native boolean empty_0(long j);

    private static native long getTrainDescriptors_0(long j);

    private static native boolean isMaskSupported_0(long j);

    private static native void knnMatch_0(long j, long j2, long j3, long j4, int i, long j5, boolean z);

    private static native void knnMatch_1(long j, long j2, long j3, long j4, int i, long j5);

    private static native void knnMatch_2(long j, long j2, long j3, long j4, int i);

    private static native void knnMatch_3(long j, long j2, long j3, int i, long j4, boolean z);

    private static native void knnMatch_4(long j, long j2, long j3, int i, long j4);

    private static native void knnMatch_5(long j, long j2, long j3, int i);

    private static native void match_0(long j, long j2, long j3, long j4, long j5);

    private static native void match_1(long j, long j2, long j3, long j4);

    private static native void match_2(long j, long j2, long j3, long j4);

    private static native void match_3(long j, long j2, long j3);

    private static native void radiusMatch_0(long j, long j2, long j3, long j4, float f, long j5, boolean z);

    private static native void radiusMatch_1(long j, long j2, long j3, long j4, float f, long j5);

    private static native void radiusMatch_2(long j, long j2, long j3, long j4, float f);

    private static native void radiusMatch_3(long j, long j2, long j3, float f, long j4, boolean z);

    private static native void radiusMatch_4(long j, long j2, long j3, float f, long j4);

    private static native void radiusMatch_5(long j, long j2, long j3, float f);

    private static native void read_0(long j, String str);

    private static native void train_0(long j);

    private static native void write_0(long j, String str);

    public final void b(Mat mat, Mat mat2, ArrayList arrayList) {
        Mat mat3 = new Mat();
        knnMatch_2(this.a, mat.a, mat2.a, mat3.a, 2);
        ArrayList arrayList2 = new ArrayList(mat3.v());
        jgz.a(arrayList2, mat3);
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Mat mat4 = (Mat) it.next();
            pk10 pk10Var = new pk10(mat4, new Range(Integer.MIN_VALUE, Integer.MAX_VALUE));
            if (!pk10Var.h() && pk10Var.a() < 0) {
                throw new IllegalArgumentException("Incompatible Mat: " + pk10Var.toString());
            }
            arrayList.add(pk10Var);
            mat4.u();
        }
        arrayList2.clear();
        mat3.u();
    }

    public final Object clone() throws CloneNotSupportedException {
        return new DescriptorMatcher(clone_1(this.a));
    }

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
