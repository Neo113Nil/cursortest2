package xsna;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: BitmapMemoryCacheKeyMultiplexProducer.java */
/* loaded from: classes12.dex */
public final class oc7 extends i840<Pair<ww8, ImageRequest.RequestLevel>, uvf<svf>> {
    public final ecl e;

    public oc7(ecl eclVar, pc7 pc7Var) {
        super(pc7Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.e = eclVar;
    }

    @Override // xsna.i840
    public final uvf<svf> c(uvf<svf> uvfVar) {
        return uvf.o(uvfVar);
    }

    @Override // xsna.i840
    public final Pair d(uhd0 uhd0Var) {
        return Pair.create(this.e.a(uhd0Var.r(), uhd0Var.m()), uhd0Var.w());
    }
}
