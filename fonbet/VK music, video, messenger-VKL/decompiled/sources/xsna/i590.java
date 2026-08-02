package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: OwnerPostsDeletedListener.kt */
/* loaded from: classes4.dex */
public final class i590 implements bd70<UserId> {
    public final wzf b;

    public i590(wzf wzfVar) {
        this.b = wzfVar;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, UserId userId) {
        UserId userId2 = userId;
        if (userId2 != null) {
            this.b.invoke(userId2);
        }
    }
}
