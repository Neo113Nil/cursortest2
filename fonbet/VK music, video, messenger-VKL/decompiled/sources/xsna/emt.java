package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: GeoPostsMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class emt implements zt60<dmt> {
    @Override // xsna.zt60
    public final dmt a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new cmt((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
