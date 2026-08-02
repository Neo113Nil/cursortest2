package xsna;

import com.vk.im.engine.models.events.OnCacheInvalidateEvent;

/* compiled from: ExpireAllUsersCmd.kt */
/* loaded from: classes2.dex */
public final class o9q extends le6<s3q0> {
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().d().r();
        w2wVar.e1(this, new OnCacheInvalidateEvent(o9q.class.getSimpleName(), OnCacheInvalidateEvent.Reason.FORCED_FROM_CMD));
        w2wVar.e1(this, new q680(o9q.class.getSimpleName()));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof o9q;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ExpireAllUsersCmd()";
    }
}
