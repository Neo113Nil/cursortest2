package org.opencv.core;

import java.nio.ByteBuffer;
import xsna.lhg;
import xsna.na8;
import xsna.wpk;

/* loaded from: classes8.dex */
public class Mat {
    public final long a;

    public Mat(long j) {
        if (j == 0) {
            throw new UnsupportedOperationException("Native object address is NULL");
        }
        this.a = j;
    }

    public static Mat i() {
        return new Mat(n_eye(3, 3, 6));
    }

    private static native void locateROI_0(long j, double[] dArr, double[] dArr2);

    private static native String nDump(long j);

    private static native double[] nGet(long j, int i, int i2);

    private static native int nGetB(long j, int i, int i2, int i3, byte[] bArr);

    private static native int nGetBIdx(long j, int[] iArr, int i, byte[] bArr);

    private static native int nGetD(long j, int i, int i2, int i3, double[] dArr);

    private static native int nGetDIdx(long j, int[] iArr, int i, double[] dArr);

    private static native int nGetF(long j, int i, int i2, int i3, float[] fArr);

    private static native int nGetFIdx(long j, int[] iArr, int i, float[] fArr);

    private static native int nGetI(long j, int i, int i2, int i3, int[] iArr);

    private static native int nGetIIdx(long j, int[] iArr, int i, int[] iArr2);

    private static native double[] nGetIdx(long j, int[] iArr);

    private static native int nGetS(long j, int i, int i2, int i3, short[] sArr);

    private static native int nGetSIdx(long j, int[] iArr, int i, short[] sArr);

    private static native int nPutB(long j, int i, int i2, int i3, byte[] bArr);

    private static native int nPutBIdx(long j, int[] iArr, int i, byte[] bArr);

    private static native int nPutBwIdxOffset(long j, int[] iArr, int i, int i2, byte[] bArr);

    private static native int nPutBwOffset(long j, int i, int i2, int i3, int i4, byte[] bArr);

    private static native int nPutD(long j, int i, int i2, int i3, double[] dArr);

    private static native int nPutDIdx(long j, int[] iArr, int i, double[] dArr);

    private static native int nPutF(long j, int i, int i2, int i3, float[] fArr);

    private static native int nPutFIdx(long j, int[] iArr, int i, float[] fArr);

    private static native int nPutI(long j, int i, int i2, int i3, int[] iArr);

    private static native int nPutIIdx(long j, int[] iArr, int i, int[] iArr2);

    private static native int nPutS(long j, int i, int i2, int i3, short[] sArr);

    private static native int nPutSIdx(long j, int[] iArr, int i, short[] sArr);

    private static native long n_Mat();

    private static native long n_Mat(double d, double d2, int i);

    private static native long n_Mat(double d, double d2, int i, double d3, double d4, double d5, double d6);

    private static native long n_Mat(int i, int i2, int i3);

    private static native long n_Mat(int i, int i2, int i3, double d, double d2, double d3, double d4);

    private static native long n_Mat(int i, int i2, int i3, ByteBuffer byteBuffer);

    private static native long n_Mat(int i, int[] iArr, int i2);

    private static native long n_Mat(int i, int[] iArr, int i2, double d, double d2, double d3, double d4);

    private static native long n_Mat(long j, int i, int i2);

    private static native long n_Mat(long j, int i, int i2, int i3, int i4);

    private static native long n_Mat(long j, Range[] rangeArr);

    private static native long n_adjustROI(long j, int i, int i2, int i3, int i4);

    private static native void n_assignTo(long j, long j2);

    private static native void n_assignTo(long j, long j2, int i);

    private static native int n_channels(long j);

    private static native int n_checkVector(long j, int i);

    private static native int n_checkVector(long j, int i, int i2);

    private static native int n_checkVector(long j, int i, int i2, boolean z);

    private static native long n_clone(long j);

    private static native long n_col(long j, int i);

    private static native long n_colRange(long j, int i, int i2);

    private static native int n_cols(long j);

    private static native void n_convertTo(long j, long j2, int i);

    private static native void n_convertTo(long j, long j2, int i, double d);

    private static native void n_convertTo(long j, long j2, int i, double d, double d2);

    private static native void n_copySize(long j, long j2);

    private static native void n_copyTo(long j, long j2);

    private static native void n_copyTo(long j, long j2, long j3);

    private static native void n_create(long j, double d, double d2, int i);

    private static native void n_create(long j, int i, int i2, int i3);

    private static native void n_create(long j, int i, int[] iArr, int i2);

    private static native long n_cross(long j, long j2);

    private static native long n_dataAddr(long j);

    private static native void n_delete(long j);

    private static native int n_depth(long j);

    private static native long n_diag(long j);

    private static native long n_diag(long j, int i);

    private static native int n_dims(long j);

    private static native double n_dot(long j, long j2);

    private static native long n_elemSize(long j);

    private static native long n_elemSize1(long j);

    private static native boolean n_empty(long j);

    private static native long n_eye(double d, double d2, int i);

    private static native long n_eye(int i, int i2, int i3);

    private static native long n_inv(long j);

    private static native long n_inv(long j, int i);

    private static native boolean n_isContinuous(long j);

    private static native boolean n_isSubmatrix(long j);

    private static native long n_mul(long j, long j2);

    private static native long n_mul(long j, long j2, double d);

    private static native long n_ones(double d, double d2, int i);

    private static native long n_ones(int i, int i2, int i3);

    private static native long n_ones(int i, int[] iArr, int i2);

    private static native void n_push_back(long j, long j2);

    private static native void n_release(long j);

    private static native long n_reshape(long j, int i);

    private static native long n_reshape(long j, int i, int i2);

    private static native long n_reshape_1(long j, int i, int i2, int[] iArr);

    private static native long n_row(long j, int i);

    private static native long n_rowRange(long j, int i, int i2);

    private static native int n_rows(long j);

    private static native long n_setTo(long j, double d, double d2, double d3, double d4);

    private static native long n_setTo(long j, double d, double d2, double d3, double d4, long j2);

    private static native long n_setTo(long j, long j2);

    private static native long n_setTo(long j, long j2, long j3);

    private static native double[] n_size(long j);

    private static native int n_size_i(long j, int i);

    private static native long n_step1(long j);

    private static native long n_step1(long j, int i);

    private static native long n_submat(long j, int i, int i2, int i3, int i4);

    private static native long n_submat_ranges(long j, Range[] rangeArr);

    private static native long n_submat_rr(long j, int i, int i2, int i3, int i4);

    private static native long n_t(long j);

    private static native long n_total(long j);

    private static native int n_type(long j);

    private static native long n_zeros(double d, double d2, int i);

    private static native long n_zeros(int i, int i2, int i3);

    private static native long n_zeros(int i, int[] iArr, int i2);

    public final int a() {
        return n_checkVector(this.a, 4, 5);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Mat clone() {
        return new Mat(n_clone(this.a));
    }

    public final Mat c(int i) {
        return new Mat(n_col(this.a, i));
    }

    public final int d() {
        return n_cols(this.a);
    }

    public final void e(Mat mat) {
        n_convertTo(this.a, mat.a, 0);
    }

    public final void f(int i, int i2) {
        n_create(this.a, i, 1, i2);
    }

    public final void finalize() throws Throwable {
        n_delete(this.a);
        super.finalize();
    }

    public final Mat g(Mat mat) {
        return new Mat(n_cross(this.a, mat.a));
    }

    public final boolean h() {
        return n_empty(this.a);
    }

    public final void j(byte[] bArr) {
        int n_type = n_type(this.a);
        if (bArr.length % wpk.a(n_type) == 0) {
            int i = n_type & 7;
            if (i != 0 && i != 1) {
                throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
            }
            nGetB(this.a, 0, 0, bArr.length, bArr);
            return;
        }
        throw new UnsupportedOperationException("Provided data element number (" + bArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
    }

    public final void k(double[] dArr) {
        int n_type = n_type(this.a);
        if (dArr.length % wpk.a(n_type) == 0) {
            if ((n_type & 7) != 6) {
                throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
            }
            nGetD(this.a, 0, 0, dArr.length, dArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + dArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
        }
    }

    public final void l(float[] fArr) {
        int n_type = n_type(this.a);
        if (fArr.length % wpk.a(n_type) == 0) {
            if ((n_type & 7) != 5) {
                throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
            }
            nGetF(this.a, 0, 0, fArr.length, fArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + fArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
        }
    }

    public final void m(int[] iArr) {
        int n_type = n_type(this.a);
        if (iArr.length % wpk.a(n_type) == 0) {
            if ((n_type & 7) != 4) {
                throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
            }
            nGetI(this.a, 0, 0, iArr.length, iArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + iArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
        }
    }

    public final double[] n(int i, int i2) {
        return nGet(this.a, i, i2);
    }

    public final int o() {
        return n_rows(this.a);
    }

    public final Mat p() {
        return new Mat(n_inv(this.a));
    }

    public final void q(int i, int i2, double... dArr) {
        int n_type = n_type(this.a);
        if (dArr.length % wpk.a(n_type) == 0) {
            nPutD(this.a, i, i2, dArr.length, dArr);
            return;
        }
        throw new UnsupportedOperationException("Provided data element number (" + dArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
    }

    public final void r(byte[] bArr) {
        int n_type = n_type(this.a);
        if (bArr == null || bArr.length % wpk.a(n_type) != 0) {
            StringBuilder sb = new StringBuilder("Provided data element number (");
            sb.append(bArr == null ? 0 : bArr.length);
            sb.append(") should be multiple of the Mat channels count (");
            sb.append(wpk.a(n_type));
            sb.append(")");
            throw new UnsupportedOperationException(sb.toString());
        }
        int i = n_type & 7;
        if (i != 0 && i != 1) {
            throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
        }
        nPutB(this.a, 0, 0, bArr.length, bArr);
    }

    public final void s(float[] fArr) {
        int n_type = n_type(this.a);
        if (fArr.length % wpk.a(n_type) == 0) {
            if ((n_type & 7) != 5) {
                throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
            }
            nPutF(this.a, 0, 0, fArr.length, fArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + fArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
        }
    }

    public final void t(int[] iArr) {
        int n_type = n_type(this.a);
        if (iArr.length % wpk.a(n_type) == 0) {
            if ((n_type & 7) != 4) {
                throw new UnsupportedOperationException(lhg.a(n_type, "Mat data type is not compatible: "));
            }
            nPutI(this.a, 0, 0, iArr.length, iArr);
        } else {
            throw new UnsupportedOperationException("Provided data element number (" + iArr.length + ") should be multiple of the Mat channels count (" + wpk.a(n_type) + ")");
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Mat [ ");
        long j = this.a;
        sb.append(n_rows(j));
        sb.append("*");
        sb.append(n_cols(j));
        sb.append("*");
        int n_type = n_type(j);
        int i = wpk.a;
        switch (n_type & 7) {
            case 0:
                str = "CV_8U";
                break;
            case 1:
                str = "CV_8S";
                break;
            case 2:
                str = "CV_16U";
                break;
            case 3:
                str = "CV_16S";
                break;
            case 4:
                str = "CV_32S";
                break;
            case 5:
                str = "CV_32F";
                break;
            case 6:
                str = "CV_64F";
                break;
            case 7:
                str = "CV_USRTYPE1";
                break;
            default:
                throw new UnsupportedOperationException(lhg.a(n_type, "Unsupported CvType value: "));
        }
        int a = wpk.a(n_type);
        if (a <= 4) {
            str2 = na8.a(a, str, "C");
        } else {
            str2 = str + "C(" + a + ")";
        }
        sb.append(str2);
        sb.append(", isCont=");
        sb.append(n_isContinuous(j));
        sb.append(", isSubmat=");
        sb.append(n_isSubmatrix(j));
        sb.append(", nativeObj=0x");
        sb.append(Long.toHexString(j));
        sb.append(", dataAddr=0x");
        sb.append(Long.toHexString(n_dataAddr(j)));
        sb.append(" ]");
        return sb.toString();
    }

    public final void u() {
        n_release(this.a);
    }

    public final int v() {
        return n_rows(this.a);
    }

    public final Mat w() {
        return new Mat(n_t(this.a));
    }

    public final long x() {
        return n_total(this.a);
    }

    public final int y() {
        return n_type(this.a);
    }

    public final int z() {
        return n_cols(this.a);
    }

    public Mat() {
        this.a = n_Mat();
    }

    public Mat(int i, int i2, int i3) {
        this.a = n_Mat(i, i2, i3);
    }

    public Mat(Mat mat, Range range) {
        this.a = n_Mat(mat.a, range.a, range.b);
    }
}
