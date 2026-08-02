package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import kotlin.NoWhenBranchMatchedException;
import xsna.mjf;

/* compiled from: ClipsPreStartUploadExecutor.kt */
/* loaded from: classes17.dex */
public final class ewe extends uvj<ClipsUploadState, Object, mjf.e, mjf, ugf, qef> {
    public final nn50<ClipsUploadState, Object, mjf, ugf, qef> g;
    public final ulf h;
    public final uwe i;

    public ewe(nk50 nk50Var, nn50<ClipsUploadState, Object, mjf, ugf, qef> nn50Var, ulf ulfVar, uwe uweVar) {
        super(nk50Var, nn50Var);
        this.g = nn50Var;
        this.h = ulfVar;
        this.i = uweVar;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        mjf.e eVar = (mjf.e) hn50Var;
        boolean z = eVar instanceof mjf.e.b;
        hpj hpjVar = this.f;
        if (z) {
            return m(myc0.h(hpjVar, null, null, new cwe(this, null), 3));
        }
        if (eVar instanceof mjf.e.a) {
            return s(myc0.h(hpjVar, null, null, new bwe(this, (mjf.e.a) eVar, null), 3));
        }
        if (eVar instanceof mjf.e.c) {
            return s(myc0.h(hpjVar, null, null, new dwe(this, null), 3));
        }
        throw new NoWhenBranchMatchedException();
    }
}
