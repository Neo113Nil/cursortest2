package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: ReactionsFeedMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class m4f0 implements zt60<k4f0> {
    @Override // xsna.zt60
    public final k4f0 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new l4f0((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
