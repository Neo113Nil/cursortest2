package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: FaveFeedMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class jpq implements zt60<ipq> {
    @Override // xsna.zt60
    public final ipq a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new hpq((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
