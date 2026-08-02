package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: PostponedPostsMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class msc0 implements zt60<lsc0> {
    @Override // xsna.zt60
    public final lsc0 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new ksc0((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
