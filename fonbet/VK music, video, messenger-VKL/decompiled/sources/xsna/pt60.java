package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: NewsfeedMainMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class pt60 implements zt60<jv60> {
    @Override // xsna.zt60
    public final jv60 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new kv60((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
