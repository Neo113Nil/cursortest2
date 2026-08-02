package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: NewsfeedCustomMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class wf60 implements zt60<vf60> {
    @Override // xsna.zt60
    public final vf60 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new uf60((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
