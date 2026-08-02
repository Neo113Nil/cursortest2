package xsna;

import com.vk.im.engine.models.dialogs.DialogsIdList;

/* compiled from: RecentDialogsClearCmd.kt */
/* loaded from: classes2.dex */
public final class h9f0 extends le6<s3q0> {
    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.I0().v().c(new DialogsIdList(null, 1, null));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return h9f0.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 681584893;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "RecentDialogsClearCmd";
    }
}
