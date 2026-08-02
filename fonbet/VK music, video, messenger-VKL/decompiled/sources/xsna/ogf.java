package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import xsna.mjf;

/* compiled from: ClipsUploadInitFullExecutor.kt */
/* loaded from: classes17.dex */
public final class ogf extends uvj<ClipsUploadState, Object, mjf.d, mjf, ugf, qef> {
    public final nn50<ClipsUploadState, Object, mjf, ugf, qef> g;
    public final mud h;
    public final lwe i;
    public final rhd j;
    public final caf k;

    public ogf(nk50 nk50Var, nn50<ClipsUploadState, Object, mjf, ugf, qef> nn50Var, mud mudVar, lwe lweVar, rhd rhdVar, caf cafVar) {
        super(nk50Var, nn50Var);
        this.g = nn50Var;
        this.h = mudVar;
        this.i = lweVar;
        this.j = rhdVar;
        this.k = cafVar;
    }

    @Override // xsna.dl50, xsna.mn50
    public final boolean B(hn50 hn50Var) {
        return !(this.b.getCurrentState() instanceof ClipsUploadState.Loaded);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        mjf.d dVar = (mjf.d) hn50Var;
        return m(myc0.h(this.f, new mgf(this, dVar).plus(iyx.a()), null, new ngf(this, dVar, null), 2));
    }
}
