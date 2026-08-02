package yads;

/* loaded from: classes10.dex */
public final class ee0 implements cl1 {
    @Override // yads.cl1
    public final el1 a(bl1 bl1Var) {
        int i = mc3.a;
        if (i < 23 || i < 31) {
            return new h63().a(bl1Var);
        }
        int d = iu1.d(bl1Var.c.m);
        ji1.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + mc3.d(d));
        return new pj(d).a(bl1Var);
    }
}
