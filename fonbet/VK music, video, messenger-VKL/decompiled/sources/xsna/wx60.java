package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: NewsfeedSearchMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class wx60 implements zt60<vx60> {
    @Override // xsna.zt60
    public final vx60 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new ux60((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
