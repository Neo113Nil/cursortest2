package defpackage;

/* loaded from: classes10.dex */
public final class el31 implements xi21, icv, sxy0 {
    public static final x34 b = new x34("camerax.video.VideoCapture.videoOutput", lm31.class, null);
    public static final x34 c = new x34("camerax.video.VideoCapture.videoEncoderInfoFinder", sl31.class, null);
    public static final x34 w = new x34("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);
    public final ug70 a;

    public el31(ug70 ug70Var) {
        d6z.n(ug70Var.a.containsKey(b));
        this.a = ug70Var;
    }

    @Override // defpackage.ybi0
    public final szd getConfig() {
        return this.a;
    }

    @Override // defpackage.eav
    public final int getInputFormat() {
        return 34;
    }
}
