package xsna;

import com.vk.dto.messages.MsgSyncState;

/* compiled from: ClearUnfinishedFakeMsgsCmd.kt */
/* loaded from: classes2.dex */
public final class pic extends le6<s3q0> {
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().u(new q66(w2wVar, w2wVar.I0().o(), MsgSyncState.SENDING, this));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 1407737020;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ClearUnfinishedFakeMsgsCmd()";
    }
}
