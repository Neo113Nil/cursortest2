package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: DiscoverMediaMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class a4n implements zt60<h4n> {
    @Override // xsna.zt60
    public final h4n a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new i4n((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
