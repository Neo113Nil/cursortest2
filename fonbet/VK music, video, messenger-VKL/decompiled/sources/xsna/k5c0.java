package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: PostMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class k5c0 implements zt60<h5c0> {
    @Override // xsna.zt60
    public final h5c0 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new j5c0((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
