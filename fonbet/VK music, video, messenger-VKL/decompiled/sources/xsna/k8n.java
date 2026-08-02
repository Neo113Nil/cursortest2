package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: DiscoverSimilarFeedMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class k8n implements zt60<j8n> {
    @Override // xsna.zt60
    public final j8n a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new i8n((qr60.a) qr60Var, null, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
