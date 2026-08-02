package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: SuggestedPostsMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class u4n0 implements zt60<t4n0> {
    @Override // xsna.zt60
    public final t4n0 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new s4n0((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
