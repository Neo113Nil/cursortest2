package org.opencv.imgproc;

import org.opencv.core.Mat;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.lxj0;

/* loaded from: classes8.dex */
public class Imgproc {
    private static native void Canny_0(long j, long j2, long j3, double d, double d2, boolean z);

    private static native void Canny_1(long j, long j2, long j3, double d, double d2);

    private static native void Canny_2(long j, long j2, double d, double d2, int i, boolean z);

    private static native void Canny_3(long j, long j2, double d, double d2, int i);

    private static native void Canny_4(long j, long j2, double d, double d2);

    private static native float EMD_0(long j, long j2, int i, long j3, long j4);

    private static native float EMD_1(long j, long j2, int i, long j3);

    private static native float EMD_3(long j, long j2, int i);

    private static native void GaussianBlur_0(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void GaussianBlur_1(long j, long j2, double d, double d2, double d3, double d4);

    private static native void GaussianBlur_2(long j, long j2, double d, double d2, double d3);

    private static native void HoughCircles_0(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3);

    private static native void HoughCircles_1(long j, long j2, int i, double d, double d2, double d3, double d4, int i2);

    private static native void HoughCircles_2(long j, long j2, int i, double d, double d2, double d3, double d4);

    private static native void HoughCircles_3(long j, long j2, int i, double d, double d2, double d3);

    private static native void HoughCircles_4(long j, long j2, int i, double d, double d2);

    private static native void HoughLinesP_0(long j, long j2, double d, double d2, int i, double d3, double d4);

    private static native void HoughLinesP_1(long j, long j2, double d, double d2, int i, double d3);

    private static native void HoughLinesP_2(long j, long j2, double d, double d2, int i);

    private static native void HoughLinesPointSet_0(long j, long j2, int i, int i2, double d, double d2, double d3, double d4, double d5, double d6);

    private static native void HoughLines_0(long j, long j2, double d, double d2, int i, double d3, double d4, double d5, double d6);

    private static native void HoughLines_1(long j, long j2, double d, double d2, int i, double d3, double d4, double d5);

    private static native void HoughLines_2(long j, long j2, double d, double d2, int i, double d3, double d4);

    private static native void HoughLines_3(long j, long j2, double d, double d2, int i, double d3);

    private static native void HoughLines_4(long j, long j2, double d, double d2, int i);

    private static native void HuMoments_0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, long j);

    private static native void Laplacian_0(long j, long j2, int i, int i2, double d, double d2, int i3);

    private static native void Laplacian_1(long j, long j2, int i, int i2, double d, double d2);

    private static native void Laplacian_2(long j, long j2, int i, int i2, double d);

    private static native void Laplacian_3(long j, long j2, int i, int i2);

    private static native void Laplacian_4(long j, long j2, int i);

    private static native void Scharr_0(long j, long j2, int i, int i2, int i3, double d, double d2, int i4);

    private static native void Scharr_1(long j, long j2, int i, int i2, int i3, double d, double d2);

    private static native void Scharr_2(long j, long j2, int i, int i2, int i3, double d);

    private static native void Scharr_3(long j, long j2, int i, int i2, int i3);

    private static native void Sobel_0(long j, long j2, int i, int i2, int i3, int i4, double d, double d2, int i5);

    private static native void Sobel_1(long j, long j2, int i, int i2, int i3, int i4, double d, double d2);

    private static native void Sobel_2(long j, long j2, int i, int i2, int i3, int i4, double d);

    private static native void Sobel_3(long j, long j2, int i, int i2, int i3, int i4);

    private static native void Sobel_4(long j, long j2, int i, int i2, int i3);

    public static void a(Mat mat, Mat mat2) {
        cvtColor_1(mat.a, mat2.a, 7);
    }

    private static native void accumulateProduct_0(long j, long j2, long j3, long j4);

    private static native void accumulateProduct_1(long j, long j2, long j3);

    private static native void accumulateSquare_0(long j, long j2, long j3);

    private static native void accumulateSquare_1(long j, long j2);

    private static native void accumulateWeighted_0(long j, long j2, double d, long j3);

    private static native void accumulateWeighted_1(long j, long j2, double d);

    private static native void accumulate_0(long j, long j2, long j3);

    private static native void accumulate_1(long j, long j2);

    private static native void adaptiveThreshold_0(long j, long j2, double d, int i, int i2, int i3, double d2);

    private static native void applyColorMap_0(long j, long j2, long j3);

    private static native void applyColorMap_1(long j, long j2, int i);

    private static native void approxPolyDP_0(long j, long j2, double d, boolean z);

    private static native double arcLength_0(long j, boolean z);

    private static native void arrowedLine_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3, double d9);

    private static native void arrowedLine_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3);

    private static native void arrowedLine_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2);

    private static native void arrowedLine_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i);

    private static native void arrowedLine_4(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    public static void b(Mat mat, Mat mat2, lxj0 lxj0Var, double d, double d2) {
        resize_1(mat.a, mat2.a, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, d, d2);
    }

    private static native void bilateralFilter_0(long j, long j2, int i, double d, double d2, int i2);

    private static native void bilateralFilter_1(long j, long j2, int i, double d, double d2);

    private static native void blur_0(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void blur_1(long j, long j2, double d, double d2, double d3, double d4);

    private static native void blur_2(long j, long j2, double d, double d2);

    private static native double[] boundingRect_0(long j);

    private static native void boxFilter_0(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z, int i2);

    private static native void boxFilter_1(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z);

    private static native void boxFilter_2(long j, long j2, int i, double d, double d2, double d3, double d4);

    private static native void boxFilter_3(long j, long j2, int i, double d, double d2);

    private static native void boxPoints_0(double d, double d2, double d3, double d4, double d5, long j);

    private static native void calcBackProject_0(long j, long j2, long j3, long j4, long j5, double d);

    private static native void calcHist_0(long j, long j2, long j3, long j4, long j5, long j6, boolean z);

    private static native void calcHist_1(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void circle_0(long j, double d, double d2, int i, double d3, double d4, double d5, double d6, int i2, int i3, int i4);

    private static native void circle_1(long j, double d, double d2, int i, double d3, double d4, double d5, double d6, int i2, int i3);

    private static native void circle_2(long j, double d, double d2, int i, double d3, double d4, double d5, double d6, int i2);

    private static native void circle_3(long j, double d, double d2, int i, double d3, double d4, double d5, double d6);

    private static native boolean clipLine_0(int i, int i2, int i3, int i4, double d, double d2, double[] dArr, double d3, double d4, double[] dArr2);

    private static native double compareHist_0(long j, long j2, int i);

    private static native int connectedComponentsWithAlgorithm_0(long j, long j2, int i, int i2, int i3);

    private static native int connectedComponentsWithStatsWithAlgorithm_0(long j, long j2, long j3, long j4, int i, int i2, int i3);

    private static native int connectedComponentsWithStats_0(long j, long j2, long j3, long j4, int i, int i2);

    private static native int connectedComponentsWithStats_1(long j, long j2, long j3, long j4, int i);

    private static native int connectedComponentsWithStats_2(long j, long j2, long j3, long j4);

    private static native int connectedComponents_0(long j, long j2, int i, int i2);

    private static native int connectedComponents_1(long j, long j2, int i);

    private static native int connectedComponents_2(long j, long j2);

    private static native double contourArea_0(long j, boolean z);

    private static native double contourArea_1(long j);

    private static native void convertMaps_0(long j, long j2, long j3, long j4, int i, boolean z);

    private static native void convertMaps_1(long j, long j2, long j3, long j4, int i);

    private static native void convexHull_0(long j, long j2, boolean z);

    private static native void convexHull_2(long j, long j2);

    private static native void convexityDefects_0(long j, long j2, long j3);

    private static native void cornerEigenValsAndVecs_0(long j, long j2, int i, int i2, int i3);

    private static native void cornerEigenValsAndVecs_1(long j, long j2, int i, int i2);

    private static native void cornerHarris_0(long j, long j2, int i, int i2, double d, int i3);

    private static native void cornerHarris_1(long j, long j2, int i, int i2, double d);

    private static native void cornerMinEigenVal_0(long j, long j2, int i, int i2, int i3);

    private static native void cornerMinEigenVal_1(long j, long j2, int i, int i2);

    private static native void cornerMinEigenVal_2(long j, long j2, int i);

    private static native void cornerSubPix_0(long j, long j2, double d, double d2, double d3, double d4, int i, int i2, double d5);

    private static native long createCLAHE_0(double d, double d2, double d3);

    private static native long createCLAHE_1(double d);

    private static native long createCLAHE_2();

    private static native void createHanningWindow_0(long j, double d, double d2, int i);

    private static native long createLineSegmentDetector_0(int i, double d, double d2, double d3, double d4, double d5, double d6, int i2);

    private static native long createLineSegmentDetector_1(int i, double d, double d2, double d3, double d4, double d5, double d6);

    private static native long createLineSegmentDetector_2(int i, double d, double d2, double d3, double d4, double d5);

    private static native long createLineSegmentDetector_3(int i, double d, double d2, double d3, double d4);

    private static native long createLineSegmentDetector_4(int i, double d, double d2, double d3);

    private static native long createLineSegmentDetector_5(int i, double d, double d2);

    private static native long createLineSegmentDetector_6(int i, double d);

    private static native long createLineSegmentDetector_7(int i);

    private static native long createLineSegmentDetector_8();

    private static native void cvtColorTwoPlane_0(long j, long j2, long j3, int i);

    private static native void cvtColor_0(long j, long j2, int i, int i2);

    private static native void cvtColor_1(long j, long j2, int i);

    private static native void demosaicing_0(long j, long j2, int i, int i2);

    private static native void demosaicing_1(long j, long j2, int i);

    private static native void dilate_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void dilate_1(long j, long j2, long j3, double d, double d2, int i, int i2);

    private static native void dilate_2(long j, long j2, long j3, double d, double d2, int i);

    private static native void dilate_3(long j, long j2, long j3, double d, double d2);

    private static native void dilate_4(long j, long j2, long j3);

    private static native void distanceTransformWithLabels_0(long j, long j2, long j3, int i, int i2, int i3);

    private static native void distanceTransformWithLabels_1(long j, long j2, long j3, int i, int i2);

    private static native void distanceTransform_0(long j, long j2, int i, int i2, int i3);

    private static native void distanceTransform_1(long j, long j2, int i, int i2);

    private static native void drawContours_0(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3, long j3, int i4, double d5, double d6);

    private static native void drawContours_1(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3, long j3, int i4);

    private static native void drawContours_2(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3, long j3);

    private static native void drawContours_3(long j, long j2, int i, double d, double d2, double d3, double d4, int i2, int i3);

    private static native void drawContours_4(long j, long j2, int i, double d, double d2, double d3, double d4, int i2);

    private static native void drawContours_5(long j, long j2, int i, double d, double d2, double d3, double d4);

    private static native void drawMarker_0(long j, double d, double d2, double d3, double d4, double d5, double d6, int i, int i2, int i3, int i4);

    private static native void drawMarker_1(long j, double d, double d2, double d3, double d4, double d5, double d6, int i, int i2, int i3);

    private static native void drawMarker_2(long j, double d, double d2, double d3, double d4, double d5, double d6, int i, int i2);

    private static native void drawMarker_3(long j, double d, double d2, double d3, double d4, double d5, double d6, int i);

    private static native void drawMarker_4(long j, double d, double d2, double d3, double d4, double d5, double d6);

    private static native void ellipse2Poly_0(double d, double d2, double d3, double d4, int i, int i2, int i3, int i4, long j);

    private static native void ellipse_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, int i, int i2, int i3);

    private static native void ellipse_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, int i, int i2);

    private static native void ellipse_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, int i);

    private static native void ellipse_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11);

    private static native void ellipse_4(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i, int i2);

    private static native void ellipse_5(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, int i);

    private static native void ellipse_6(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    private static native void equalizeHist_0(long j, long j2);

    private static native void erode_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void erode_1(long j, long j2, long j3, double d, double d2, int i, int i2);

    private static native void erode_2(long j, long j2, long j3, double d, double d2, int i);

    private static native void erode_3(long j, long j2, long j3, double d, double d2);

    private static native void erode_4(long j, long j2, long j3);

    private static native void fillConvexPoly_0(long j, long j2, double d, double d2, double d3, double d4, int i, int i2);

    private static native void fillConvexPoly_1(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void fillConvexPoly_2(long j, long j2, double d, double d2, double d3, double d4);

    private static native void fillPoly_0(long j, long j2, double d, double d2, double d3, double d4, int i, int i2, double d5, double d6);

    private static native void fillPoly_1(long j, long j2, double d, double d2, double d3, double d4, int i, int i2);

    private static native void fillPoly_2(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void fillPoly_3(long j, long j2, double d, double d2, double d3, double d4);

    private static native void filter2D_0(long j, long j2, int i, long j3, double d, double d2, double d3, int i2);

    private static native void filter2D_1(long j, long j2, int i, long j3, double d, double d2, double d3);

    private static native void filter2D_2(long j, long j2, int i, long j3, double d, double d2);

    private static native void filter2D_3(long j, long j2, int i, long j3);

    private static native void findContours_0(long j, long j2, long j3, int i, int i2, double d, double d2);

    private static native void findContours_1(long j, long j2, long j3, int i, int i2);

    private static native double[] fitEllipseAMS_0(long j);

    private static native double[] fitEllipseDirect_0(long j);

    private static native double[] fitEllipse_0(long j);

    private static native void fitLine_0(long j, long j2, int i, double d, double d2, double d3);

    private static native int floodFill_0(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i);

    private static native int floodFill_1(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14);

    private static native int floodFill_2(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9, double d10);

    private static native int floodFill_3(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6, double[] dArr);

    private static native int floodFill_4(long j, long j2, double d, double d2, double d3, double d4, double d5, double d6);

    private static native long getAffineTransform_0(long j, long j2);

    private static native void getDerivKernels_0(long j, long j2, int i, int i2, int i3, boolean z, int i4);

    private static native void getDerivKernels_1(long j, long j2, int i, int i2, int i3, boolean z);

    private static native void getDerivKernels_2(long j, long j2, int i, int i2, int i3);

    private static native double getFontScaleFromHeight_0(int i, int i2, int i3);

    private static native double getFontScaleFromHeight_1(int i, int i2);

    private static native long getGaborKernel_0(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i);

    private static native long getGaborKernel_1(double d, double d2, double d3, double d4, double d5, double d6, double d7);

    private static native long getGaborKernel_2(double d, double d2, double d3, double d4, double d5, double d6);

    private static native long getGaussianKernel_0(int i, double d, int i2);

    private static native long getGaussianKernel_1(int i, double d);

    private static native long getPerspectiveTransform_0(long j, long j2, int i);

    private static native long getPerspectiveTransform_1(long j, long j2);

    private static native void getRectSubPix_0(long j, double d, double d2, double d3, double d4, long j2, int i);

    private static native void getRectSubPix_1(long j, double d, double d2, double d3, double d4, long j2);

    private static native long getRotationMatrix2D_0(double d, double d2, double d3, double d4);

    private static native long getStructuringElement_0(int i, double d, double d2, double d3, double d4);

    private static native long getStructuringElement_1(int i, double d, double d2);

    private static native void goodFeaturesToTrack_0(long j, long j2, int i, double d, double d2, long j3, int i2, int i3, boolean z, double d3);

    private static native void goodFeaturesToTrack_1(long j, long j2, int i, double d, double d2, long j3, int i2, int i3, boolean z);

    private static native void goodFeaturesToTrack_2(long j, long j2, int i, double d, double d2, long j3, int i2, int i3);

    private static native void goodFeaturesToTrack_3(long j, long j2, int i, double d, double d2, long j3, int i2, boolean z, double d3);

    private static native void goodFeaturesToTrack_4(long j, long j2, int i, double d, double d2, long j3, int i2, boolean z);

    private static native void goodFeaturesToTrack_5(long j, long j2, int i, double d, double d2, long j3, int i2);

    private static native void goodFeaturesToTrack_6(long j, long j2, int i, double d, double d2, long j3);

    private static native void goodFeaturesToTrack_7(long j, long j2, int i, double d, double d2);

    private static native void grabCut_0(long j, long j2, int i, int i2, int i3, int i4, long j3, long j4, int i5, int i6);

    private static native void grabCut_1(long j, long j2, int i, int i2, int i3, int i4, long j3, long j4, int i5);

    private static native void integral2_0(long j, long j2, long j3, int i, int i2);

    private static native void integral2_1(long j, long j2, long j3, int i);

    private static native void integral2_2(long j, long j2, long j3);

    private static native void integral3_0(long j, long j2, long j3, long j4, int i, int i2);

    private static native void integral3_1(long j, long j2, long j3, long j4, int i);

    private static native void integral3_2(long j, long j2, long j3, long j4);

    private static native void integral_0(long j, long j2, int i);

    private static native void integral_1(long j, long j2);

    private static native float intersectConvexConvex_0(long j, long j2, long j3, boolean z);

    private static native float intersectConvexConvex_1(long j, long j2, long j3);

    private static native void invertAffineTransform_0(long j, long j2);

    private static native boolean isContourConvex_0(long j);

    private static native void line_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3);

    private static native void line_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2);

    private static native void line_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i);

    private static native void line_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    private static native void linearPolar_0(long j, long j2, double d, double d2, double d3, int i);

    private static native void logPolar_0(long j, long j2, double d, double d2, double d3, int i);

    private static native double matchShapes_0(long j, long j2, int i, double d);

    private static native void matchTemplate_0(long j, long j2, long j3, int i, long j4);

    private static native void matchTemplate_1(long j, long j2, long j3, int i);

    private static native void medianBlur_0(long j, long j2, int i);

    private static native double[] minAreaRect_0(long j);

    private static native void minEnclosingCircle_0(long j, double[] dArr, double[] dArr2);

    private static native double minEnclosingTriangle_0(long j, long j2);

    private static native double[] moments_0(long j, boolean z);

    private static native double[] moments_1(long j);

    private static native void morphologyEx_0(long j, long j2, int i, long j3, double d, double d2, int i2, int i3, double d3, double d4, double d5, double d6);

    private static native void morphologyEx_1(long j, long j2, int i, long j3, double d, double d2, int i2, int i3);

    private static native void morphologyEx_2(long j, long j2, int i, long j3, double d, double d2, int i2);

    private static native void morphologyEx_3(long j, long j2, int i, long j3, double d, double d2);

    private static native void morphologyEx_4(long j, long j2, int i, long j3);

    private static native double[] n_getTextSize(String str, int i, double d, int i2, int[] iArr);

    private static native double[] phaseCorrelate_0(long j, long j2, long j3, double[] dArr);

    private static native double[] phaseCorrelate_1(long j, long j2, long j3);

    private static native double[] phaseCorrelate_2(long j, long j2);

    private static native double pointPolygonTest_0(long j, double d, double d2, boolean z);

    private static native void polylines_0(long j, long j2, boolean z, double d, double d2, double d3, double d4, int i, int i2, int i3);

    private static native void polylines_1(long j, long j2, boolean z, double d, double d2, double d3, double d4, int i, int i2);

    private static native void polylines_2(long j, long j2, boolean z, double d, double d2, double d3, double d4, int i);

    private static native void polylines_3(long j, long j2, boolean z, double d, double d2, double d3, double d4);

    private static native void preCornerDetect_0(long j, long j2, int i, int i2);

    private static native void preCornerDetect_1(long j, long j2, int i);

    private static native void putText_0(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7, int i2, int i3, boolean z);

    private static native void putText_1(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7, int i2, int i3);

    private static native void putText_2(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7, int i2);

    private static native void putText_3(long j, String str, double d, double d2, int i, double d3, double d4, double d5, double d6, double d7);

    private static native void pyrDown_0(long j, long j2, double d, double d2, int i);

    private static native void pyrDown_1(long j, long j2, double d, double d2);

    private static native void pyrDown_2(long j, long j2);

    private static native void pyrMeanShiftFiltering_0(long j, long j2, double d, double d2, int i, int i2, int i3, double d3);

    private static native void pyrMeanShiftFiltering_1(long j, long j2, double d, double d2, int i);

    private static native void pyrMeanShiftFiltering_2(long j, long j2, double d, double d2);

    private static native void pyrUp_0(long j, long j2, double d, double d2, int i);

    private static native void pyrUp_1(long j, long j2, double d, double d2);

    private static native void pyrUp_2(long j, long j2);

    private static native void rectangle_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2, int i3);

    private static native void rectangle_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, int i2);

    private static native void rectangle_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i);

    private static native void rectangle_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    private static native void rectangle_4(long j, int i, int i2, int i3, int i4, double d, double d2, double d3, double d4, int i5, int i6, int i7);

    private static native void rectangle_5(long j, int i, int i2, int i3, int i4, double d, double d2, double d3, double d4, int i5, int i6);

    private static native void rectangle_6(long j, int i, int i2, int i3, int i4, double d, double d2, double d3, double d4, int i5);

    private static native void rectangle_7(long j, int i, int i2, int i3, int i4, double d, double d2, double d3, double d4);

    private static native void remap_0(long j, long j2, long j3, long j4, int i, int i2, double d, double d2, double d3, double d4);

    private static native void remap_1(long j, long j2, long j3, long j4, int i, int i2);

    private static native void remap_2(long j, long j2, long j3, long j4, int i);

    private static native void resize_0(long j, long j2, double d, double d2, double d3, double d4, int i);

    private static native void resize_1(long j, long j2, double d, double d2, double d3, double d4);

    private static native void resize_2(long j, long j2, double d, double d2, double d3);

    private static native void resize_3(long j, long j2, double d, double d2);

    private static native int rotatedRectangleIntersection_0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, long j);

    private static native void sepFilter2D_0(long j, long j2, int i, long j3, long j4, double d, double d2, double d3, int i2);

    private static native void sepFilter2D_1(long j, long j2, int i, long j3, long j4, double d, double d2, double d3);

    private static native void sepFilter2D_2(long j, long j2, int i, long j3, long j4, double d, double d2);

    private static native void sepFilter2D_3(long j, long j2, int i, long j3, long j4);

    private static native void spatialGradient_0(long j, long j2, long j3, int i, int i2);

    private static native void spatialGradient_1(long j, long j2, long j3, int i);

    private static native void spatialGradient_2(long j, long j2, long j3);

    private static native void sqrBoxFilter_0(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z, int i2);

    private static native void sqrBoxFilter_1(long j, long j2, int i, double d, double d2, double d3, double d4, boolean z);

    private static native void sqrBoxFilter_2(long j, long j2, int i, double d, double d2, double d3, double d4);

    private static native void sqrBoxFilter_3(long j, long j2, int i, double d, double d2);

    private static native double threshold_0(long j, long j2, double d, double d2, int i);

    private static native void warpAffine_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void warpAffine_1(long j, long j2, long j3, double d, double d2, int i, int i2);

    private static native void warpAffine_2(long j, long j2, long j3, double d, double d2, int i);

    private static native void warpAffine_3(long j, long j2, long j3, double d, double d2);

    private static native void warpPerspective_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);

    private static native void warpPerspective_1(long j, long j2, long j3, double d, double d2, int i, int i2);

    private static native void warpPerspective_2(long j, long j2, long j3, double d, double d2, int i);

    private static native void warpPerspective_3(long j, long j2, long j3, double d, double d2);

    private static native void warpPolar_0(long j, long j2, double d, double d2, double d3, double d4, double d5, int i);

    private static native void watershed_0(long j, long j2);
}
