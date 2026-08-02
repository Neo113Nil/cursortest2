package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: PostsFromNotificationsMviPatchMapper.kt */
/* loaded from: classes4.dex */
public final class svc0 implements zt60<rvc0> {
    @Override // xsna.zt60
    public final rvc0 a(qr60 qr60Var) {
        if (qr60Var instanceof qr60.a) {
            return new qvc0((qr60.a) qr60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
