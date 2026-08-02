package org.opencv.imgproc;

/* loaded from: classes8.dex */
public class Subdiv2D {
    public final long a = Subdiv2D_1();

    private static native long Subdiv2D_0(int i, int i2, int i3, int i4);

    private static native long Subdiv2D_1();

    private static native void delete(long j);

    private static native int edgeDst_0(long j, int i, double[] dArr);

    private static native int edgeDst_1(long j, int i);

    private static native int edgeOrg_0(long j, int i, double[] dArr);

    private static native int edgeOrg_1(long j, int i);

    private static native int findNearest_0(long j, double d, double d2, double[] dArr);

    private static native int findNearest_1(long j, double d, double d2);

    private static native void getEdgeList_0(long j, long j2);

    private static native int getEdge_0(long j, int i, int i2);

    private static native void getLeadingEdgeList_0(long j, long j2);

    private static native void getTriangleList_0(long j, long j2);

    private static native double[] getVertex_0(long j, int i, double[] dArr);

    private static native double[] getVertex_1(long j, int i);

    private static native void getVoronoiFacetList_0(long j, long j2, long j3, long j4);

    private static native void initDelaunay_0(long j, int i, int i2, int i3, int i4);

    private static native int insert_0(long j, double d, double d2);

    private static native void insert_1(long j, long j2);

    private static native int locate_0(long j, double d, double d2, double[] dArr, double[] dArr2);

    private static native int nextEdge_0(long j, int i);

    private static native int rotateEdge_0(long j, int i, int i2);

    private static native int symEdge_0(long j, int i);

    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
