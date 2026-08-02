package xsna;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: EncodedCacheKeyMultiplexProducer.java */
/* loaded from: classes12.dex */
public final class oip extends i840<Pair<ww8, ImageRequest.RequestLevel>, rip> {
    public final ecl e;

    public oip(ecl eclVar, thd0 thd0Var) {
        super(thd0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.e = eclVar;
    }

    @Override // xsna.i840
    public final rip c(rip ripVar) {
        return rip.b(ripVar);
    }

    @Override // xsna.i840
    public final Pair d(uhd0 uhd0Var) {
        return Pair.create(this.e.d(uhd0Var.r(), uhd0Var.m()), uhd0Var.w());
    }
}
