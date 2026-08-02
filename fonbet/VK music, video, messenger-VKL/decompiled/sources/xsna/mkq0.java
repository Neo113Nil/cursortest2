package xsna;

import com.vk.common.links.AwayLink;
import com.vk.dto.common.id.UserId;
import xsna.qjc;

/* compiled from: UserLinkSpanClickListener.kt */
/* loaded from: classes4.dex */
public final class mkq0 implements qjc.a {
    public UserId b = UserId.d;
    public bsb0 c;

    @Override // xsna.qjc.a
    public final void I(AwayLink awayLink) {
        bsb0 bsb0Var = this.c;
        if (bsb0Var != null) {
            UserId userId = this.b;
            bsb0Var.getClass();
            if (fkq0.c(userId)) {
                gd60.Z0(hd60.a(), bsb0Var.b, userId, null, null, 12);
            }
        }
    }
}
