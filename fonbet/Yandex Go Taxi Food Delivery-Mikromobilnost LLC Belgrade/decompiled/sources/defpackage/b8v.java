package defpackage;

/* loaded from: classes10.dex */
public final class b8v implements xi21, icv, sxy0 {
    public static final x34 b = new x34("camerax.core.imageAnalysis.backpressureStrategy", u7v.class, null);
    public static final x34 c = new x34("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);
    public static final x34 w = new x34("camerax.core.imageAnalysis.imageReaderProxyProvider", qdv.class, null);
    public static final x34 x = new x34("camerax.core.imageAnalysis.outputImageFormat", x7v.class, null);
    public static final x34 y = new x34("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);
    public static final x34 z = new x34("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);
    public final ug70 a;

    public b8v(ug70 ug70Var) {
        this.a = ug70Var;
    }

    @Override // defpackage.ybi0
    public final szd getConfig() {
        return this.a;
    }

    @Override // defpackage.eav
    public final int getInputFormat() {
        return 35;
    }
}
