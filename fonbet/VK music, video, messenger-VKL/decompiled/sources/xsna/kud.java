package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import kotlin.NoWhenBranchMatchedException;
import xsna.mjf;

/* compiled from: ClipsDraftsInteractionExecutor.kt */
/* loaded from: classes17.dex */
public final class kud extends uvj<ClipsUploadState, Object, mjf.b, mjf, ugf, qef> {
    public final nn50<ClipsUploadState, Object, mjf, ugf, qef> g;
    public final mud h;

    public kud(nk50 nk50Var, nn50<ClipsUploadState, Object, mjf, ugf, qef> nn50Var, mud mudVar) {
        super(nk50Var, nn50Var);
        this.g = nn50Var;
        this.h = mudVar;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        mjf.b bVar = (mjf.b) hn50Var;
        boolean equals = bVar.equals(mjf.b.a.b);
        hpj hpjVar = this.f;
        if (equals) {
            return s(myc0.h(hpjVar, null, null, new hud(this, null), 3));
        }
        if (bVar.equals(mjf.b.C3347b.b)) {
            return s(myc0.h(hpjVar, null, null, new iud(this, null), 3));
        }
        if (bVar.equals(mjf.b.c.b)) {
            return s(myc0.h(hpjVar, null, null, new jud(this, null), 3));
        }
        throw new NoWhenBranchMatchedException();
    }
}
