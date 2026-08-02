package yads;

/* loaded from: classes10.dex */
public abstract class iy3 {
    public static void a(ax3 ax3Var) {
        if (!ax3Var.f) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (ax3Var.g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }
}
