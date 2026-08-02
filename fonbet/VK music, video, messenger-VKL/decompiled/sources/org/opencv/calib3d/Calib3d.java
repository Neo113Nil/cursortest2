package org.opencv.calib3d;

import org.opencv.core.Mat;
import xsna.qk10;
import xsna.sk10;
import xsna.tk10;

/* loaded from: classes8.dex */
public class Calib3d {
    private static native double[] RQDecomp3x3_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native double[] RQDecomp3x3_1(long j, long j2, long j3, long j4, long j5);

    private static native double[] RQDecomp3x3_2(long j, long j2, long j3, long j4);

    private static native double[] RQDecomp3x3_3(long j, long j2, long j3);

    private static native void Rodrigues_0(long j, long j2, long j3);

    private static native void Rodrigues_1(long j, long j2);

    public static void a(Mat mat, Mat mat2) {
        Rodrigues_1(mat.a, mat2.a);
    }

    public static Mat b(sk10 sk10Var, sk10 sk10Var2, double d) {
        return new Mat(findHomography_3(sk10Var.a, sk10Var2.a, 8, d));
    }

    public static void c(Mat mat, Mat mat2, Mat mat3, qk10 qk10Var, sk10 sk10Var, tk10 tk10Var) {
        projectPoints_2(tk10Var.a, mat.a, mat2.a, mat3.a, qk10Var.a, sk10Var.a);
    }

    private static native double calibrateCameraExtended_0(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, int i2, int i3, double d3);

    private static native double calibrateCameraExtended_1(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i);

    private static native double calibrateCameraExtended_2(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, long j7, long j8, long j9);

    private static native double calibrateCameraROExtended_0(long j, long j2, double d, double d2, int i, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i2, int i3, int i4, double d3);

    private static native double calibrateCameraROExtended_1(long j, long j2, double d, double d2, int i, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i2);

    private static native double calibrateCameraROExtended_2(long j, long j2, double d, double d2, int i, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11);

    private static native double calibrateCameraRO_0(long j, long j2, double d, double d2, int i, long j3, long j4, long j5, long j6, long j7, int i2, int i3, int i4, double d3);

    private static native double calibrateCameraRO_1(long j, long j2, double d, double d2, int i, long j3, long j4, long j5, long j6, long j7, int i2);

    private static native double calibrateCameraRO_2(long j, long j2, double d, double d2, int i, long j3, long j4, long j5, long j6, long j7);

    private static native double calibrateCamera_0(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, int i, int i2, int i3, double d3);

    private static native double calibrateCamera_1(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, int i);

    private static native double calibrateCamera_2(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6);

    private static native void calibrateHandEye_0(long j, long j2, long j3, long j4, long j5, long j6, int i);

    private static native void calibrateHandEye_1(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void calibrationMatrixValues_0(long j, double d, double d2, double d3, double d4, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5);

    private static native boolean checkChessboard_0(long j, double d, double d2);

    private static native void composeRT_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14);

    private static native void composeRT_1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13);

    private static native void composeRT_2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12);

    private static native void composeRT_3(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11);

    private static native void composeRT_4(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10);

    private static native void composeRT_5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9);

    private static native void composeRT_6(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    private static native void composeRT_7(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    private static native void composeRT_8(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void computeCorrespondEpilines_0(long j, int i, long j2, long j3);

    private static native void convertPointsFromHomogeneous_0(long j, long j2);

    private static native void convertPointsToHomogeneous_0(long j, long j2);

    private static native void correctMatches_0(long j, long j2, long j3, long j4, long j5);

    public static void d(Mat mat, Mat mat2, Mat mat3, qk10 qk10Var, sk10 sk10Var, tk10 tk10Var) {
        solvePnP_2(tk10Var.a, sk10Var.a, mat.a, qk10Var.a, mat2.a, mat3.a);
    }

    private static native void decomposeEssentialMat_0(long j, long j2, long j3, long j4);

    private static native int decomposeHomographyMat_0(long j, long j2, long j3, long j4, long j5);

    private static native void decomposeProjectionMatrix_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    private static native void decomposeProjectionMatrix_1(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    private static native void decomposeProjectionMatrix_2(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void decomposeProjectionMatrix_3(long j, long j2, long j3, long j4, long j5);

    private static native void decomposeProjectionMatrix_4(long j, long j2, long j3, long j4);

    private static native void drawChessboardCorners_0(long j, double d, double d2, long j2, boolean z);

    private static native void drawFrameAxes_0(long j, long j2, long j3, long j4, long j5, float f, int i);

    private static native void drawFrameAxes_1(long j, long j2, long j3, long j4, long j5, float f);

    private static native long estimateAffine2D_0(long j, long j2, long j3, int i, double d, long j4, double d2, long j5);

    private static native long estimateAffine2D_1(long j, long j2, long j3, int i, double d, long j4, double d2);

    private static native long estimateAffine2D_2(long j, long j2, long j3, int i, double d, long j4);

    private static native long estimateAffine2D_3(long j, long j2, long j3, int i, double d);

    private static native long estimateAffine2D_4(long j, long j2, long j3, int i);

    private static native long estimateAffine2D_5(long j, long j2, long j3);

    private static native long estimateAffine2D_6(long j, long j2);

    private static native int estimateAffine3D_0(long j, long j2, long j3, long j4, double d, double d2);

    private static native int estimateAffine3D_1(long j, long j2, long j3, long j4, double d);

    private static native int estimateAffine3D_2(long j, long j2, long j3, long j4);

    private static native long estimateAffinePartial2D_0(long j, long j2, long j3, int i, double d, long j4, double d2, long j5);

    private static native long estimateAffinePartial2D_1(long j, long j2, long j3, int i, double d, long j4, double d2);

    private static native long estimateAffinePartial2D_2(long j, long j2, long j3, int i, double d, long j4);

    private static native long estimateAffinePartial2D_3(long j, long j2, long j3, int i, double d);

    private static native long estimateAffinePartial2D_4(long j, long j2, long j3, int i);

    private static native long estimateAffinePartial2D_5(long j, long j2, long j3);

    private static native long estimateAffinePartial2D_6(long j, long j2);

    private static native void filterHomographyDecompByVisibleRefpoints_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void filterHomographyDecompByVisibleRefpoints_1(long j, long j2, long j3, long j4, long j5);

    private static native void filterSpeckles_0(long j, double d, int i, double d2, long j2);

    private static native void filterSpeckles_1(long j, double d, int i, double d2);

    private static native boolean findChessboardCornersSB_0(long j, double d, double d2, long j2, int i);

    private static native boolean findChessboardCornersSB_1(long j, double d, double d2, long j2);

    private static native boolean findChessboardCorners_0(long j, double d, double d2, long j2, int i);

    private static native boolean findChessboardCorners_1(long j, double d, double d2, long j2);

    private static native boolean findCirclesGrid_0(long j, double d, double d2, long j2, int i);

    private static native boolean findCirclesGrid_2(long j, double d, double d2, long j2);

    private static native long findEssentialMat_0(long j, long j2, long j3, int i, double d, double d2, long j4);

    private static native long findEssentialMat_1(long j, long j2, long j3, int i, double d, double d2);

    private static native long findEssentialMat_10(long j, long j2, double d);

    private static native long findEssentialMat_11(long j, long j2);

    private static native long findEssentialMat_2(long j, long j2, long j3, int i, double d);

    private static native long findEssentialMat_3(long j, long j2, long j3, int i);

    private static native long findEssentialMat_4(long j, long j2, long j3);

    private static native long findEssentialMat_5(long j, long j2, double d, double d2, double d3, int i, double d4, double d5, long j3);

    private static native long findEssentialMat_6(long j, long j2, double d, double d2, double d3, int i, double d4, double d5);

    private static native long findEssentialMat_7(long j, long j2, double d, double d2, double d3, int i, double d4);

    private static native long findEssentialMat_8(long j, long j2, double d, double d2, double d3, int i);

    private static native long findEssentialMat_9(long j, long j2, double d, double d2, double d3);

    private static native long findFundamentalMat_0(long j, long j2, int i, double d, double d2, long j3);

    private static native long findFundamentalMat_1(long j, long j2, int i, double d, double d2);

    private static native long findFundamentalMat_2(long j, long j2, int i, double d);

    private static native long findFundamentalMat_3(long j, long j2, int i);

    private static native long findFundamentalMat_4(long j, long j2);

    private static native long findHomography_0(long j, long j2, int i, double d, long j3, int i2, double d2);

    private static native long findHomography_1(long j, long j2, int i, double d, long j3, int i2);

    private static native long findHomography_2(long j, long j2, int i, double d, long j3);

    private static native long findHomography_3(long j, long j2, int i, double d);

    private static native long findHomography_4(long j, long j2, int i);

    private static native long findHomography_5(long j, long j2);

    private static native double fisheye_calibrate_0(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, int i, int i2, int i3, double d3);

    private static native double fisheye_calibrate_1(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6, int i);

    private static native double fisheye_calibrate_2(long j, long j2, double d, double d2, long j3, long j4, long j5, long j6);

    private static native void fisheye_distortPoints_0(long j, long j2, long j3, long j4, double d);

    private static native void fisheye_distortPoints_1(long j, long j2, long j3, long j4);

    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_0(long j, long j2, double d, double d2, long j3, long j4, double d3, double d4, double d5, double d6);

    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_1(long j, long j2, double d, double d2, long j3, long j4, double d3, double d4, double d5);

    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_2(long j, long j2, double d, double d2, long j3, long j4, double d3);

    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_3(long j, long j2, double d, double d2, long j3, long j4);

    private static native void fisheye_initUndistortRectifyMap_0(long j, long j2, long j3, long j4, double d, double d2, int i, long j5, long j6);

    private static native void fisheye_projectPoints_0(long j, long j2, long j3, long j4, long j5, long j6, double d, long j7);

    private static native void fisheye_projectPoints_1(long j, long j2, long j3, long j4, long j5, long j6, double d);

    private static native void fisheye_projectPoints_2(long j, long j2, long j3, long j4, long j5, long j6);

    private static native double fisheye_stereoCalibrate_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, int i, int i2, int i3, double d3);

    private static native double fisheye_stereoCalibrate_1(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, int i);

    private static native double fisheye_stereoCalibrate_2(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9);

    private static native void fisheye_stereoRectify_0(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3, double d4, double d5, double d6);

    private static native void fisheye_stereoRectify_1(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3, double d4, double d5);

    private static native void fisheye_stereoRectify_2(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3, double d4);

    private static native void fisheye_stereoRectify_3(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i);

    private static native void fisheye_undistortImage_0(long j, long j2, long j3, long j4, long j5, double d, double d2);

    private static native void fisheye_undistortImage_1(long j, long j2, long j3, long j4, long j5);

    private static native void fisheye_undistortImage_2(long j, long j2, long j3, long j4);

    private static native void fisheye_undistortPoints_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void fisheye_undistortPoints_1(long j, long j2, long j3, long j4, long j5);

    private static native void fisheye_undistortPoints_2(long j, long j2, long j3, long j4);

    private static native long getDefaultNewCameraMatrix_0(long j, double d, double d2, boolean z);

    private static native long getDefaultNewCameraMatrix_1(long j, double d, double d2);

    private static native long getDefaultNewCameraMatrix_2(long j);

    private static native long getOptimalNewCameraMatrix_0(long j, long j2, double d, double d2, double d3, double d4, double d5, double[] dArr, boolean z);

    private static native long getOptimalNewCameraMatrix_1(long j, long j2, double d, double d2, double d3, double d4, double d5, double[] dArr);

    private static native long getOptimalNewCameraMatrix_2(long j, long j2, double d, double d2, double d3, double d4, double d5);

    private static native long getOptimalNewCameraMatrix_3(long j, long j2, double d, double d2, double d3);

    private static native double[] getValidDisparityROI_0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native long initCameraMatrix2D_0(long j, long j2, double d, double d2, double d3);

    private static native long initCameraMatrix2D_1(long j, long j2, double d, double d2);

    private static native void initUndistortRectifyMap_0(long j, long j2, long j3, long j4, double d, double d2, int i, long j5, long j6);

    private static native void matMulDeriv_0(long j, long j2, long j3, long j4);

    private static native void projectPoints_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d);

    private static native void projectPoints_1(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    private static native void projectPoints_2(long j, long j2, long j3, long j4, long j5, long j6);

    private static native int recoverPose_0(long j, long j2, long j3, long j4, long j5, double d, double d2, double d3, long j6);

    private static native int recoverPose_1(long j, long j2, long j3, long j4, long j5, double d, double d2, double d3);

    private static native int recoverPose_2(long j, long j2, long j3, long j4, long j5, double d);

    private static native int recoverPose_3(long j, long j2, long j3, long j4, long j5);

    private static native int recoverPose_4(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    private static native int recoverPose_5(long j, long j2, long j3, long j4, long j5, long j6);

    private static native int recoverPose_6(long j, long j2, long j3, long j4, long j5, long j6, double d, long j7, long j8);

    private static native int recoverPose_7(long j, long j2, long j3, long j4, long j5, long j6, double d, long j7);

    private static native int recoverPose_8(long j, long j2, long j3, long j4, long j5, long j6, double d);

    private static native float rectify3Collinear_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, double d, double d2, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, double d3, double d4, double d5, double[] dArr, double[] dArr2, int i);

    private static native void reprojectImageTo3D_0(long j, long j2, long j3, boolean z, int i);

    private static native void reprojectImageTo3D_1(long j, long j2, long j3, boolean z);

    private static native void reprojectImageTo3D_2(long j, long j2, long j3);

    private static native double sampsonDistance_0(long j, long j2, long j3);

    private static native int solveP3P_0(long j, long j2, long j3, long j4, long j5, long j6, int i);

    private static native boolean solvePnPRansac_0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, int i, float f, double d, long j7, int i2);

    private static native boolean solvePnPRansac_1(long j, long j2, long j3, long j4, long j5, long j6, boolean z, int i, float f, double d, long j7);

    private static native boolean solvePnPRansac_2(long j, long j2, long j3, long j4, long j5, long j6, boolean z, int i, float f, double d);

    private static native boolean solvePnPRansac_3(long j, long j2, long j3, long j4, long j5, long j6, boolean z, int i, float f);

    private static native boolean solvePnPRansac_4(long j, long j2, long j3, long j4, long j5, long j6, boolean z, int i);

    private static native boolean solvePnPRansac_5(long j, long j2, long j3, long j4, long j5, long j6, boolean z);

    private static native boolean solvePnPRansac_6(long j, long j2, long j3, long j4, long j5, long j6);

    private static native boolean solvePnP_0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, int i);

    private static native boolean solvePnP_1(long j, long j2, long j3, long j4, long j5, long j6, boolean z);

    private static native boolean solvePnP_2(long j, long j2, long j3, long j4, long j5, long j6);

    private static native double stereoCalibrateExtended_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, long j10, long j11, long j12, int i, int i2, int i3, double d3);

    private static native double stereoCalibrateExtended_1(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, long j10, long j11, long j12, int i);

    private static native double stereoCalibrateExtended_2(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, long j10, long j11, long j12);

    private static native double stereoCalibrate_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, long j10, long j11, int i, int i2, int i3, double d3);

    private static native double stereoCalibrate_1(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, long j10, long j11, int i);

    private static native double stereoCalibrate_2(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, double d2, long j8, long j9, long j10, long j11);

    private static native boolean stereoRectifyUncalibrated_0(long j, long j2, long j3, double d, double d2, long j4, long j5, double d3);

    private static native boolean stereoRectifyUncalibrated_1(long j, long j2, long j3, double d, double d2, long j4, long j5);

    private static native void stereoRectify_0(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3, double d4, double d5, double[] dArr, double[] dArr2);

    private static native void stereoRectify_1(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3, double d4, double d5, double[] dArr);

    private static native void stereoRectify_2(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3, double d4, double d5);

    private static native void stereoRectify_3(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, double d3);

    private static native void stereoRectify_4(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i);

    private static native void stereoRectify_5(long j, long j2, long j3, long j4, double d, double d2, long j5, long j6, long j7, long j8, long j9, long j10, long j11);

    private static native void triangulatePoints_0(long j, long j2, long j3, long j4, long j5);

    private static native void undistortPointsIter_0(long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, double d);

    private static native void undistortPoints_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void undistortPoints_1(long j, long j2, long j3, long j4, long j5);

    private static native void undistortPoints_2(long j, long j2, long j3, long j4);

    private static native void undistort_0(long j, long j2, long j3, long j4, long j5);

    private static native void undistort_1(long j, long j2, long j3, long j4);

    private static native void validateDisparity_0(long j, long j2, int i, int i2, int i3);

    private static native void validateDisparity_1(long j, long j2, int i, int i2);
}
