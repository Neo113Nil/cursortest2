package xsna;

import com.vk.im.engine.models.messages.DraftMsg;

/* compiled from: DialogsHistoryEntryStorageModel.kt */
/* loaded from: classes2.dex */
public final class arm {
    public final long a;
    public final int b;
    public final vjm c;
    public final gkx0 d;
    public final int e;
    public final int f;
    public final DraftMsg g;

    public arm(long j, int i, vjm vjmVar, gkx0 gkx0Var, int i2, int i3, DraftMsg draftMsg) {
        this.a = j;
        this.b = i;
        this.c = vjmVar;
        this.d = gkx0Var;
        this.e = i2;
        this.f = i3;
        this.g = draftMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arm)) {
            return false;
        }
        arm armVar = (arm) obj;
        return this.a == armVar.a && this.b == armVar.b && epx.f(this.c, armVar.c) && epx.f(this.d, armVar.d) && this.e == armVar.e && this.f == armVar.f && epx.f(this.g, armVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + shy.a(this.f, shy.a(this.e, bh10.a((this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d.b), 31), 31);
    }

    public final String toString() {
        return "DialogsHistoryEntryStorageModel(id=" + this.a + ", type=" + this.b + ", sortId=" + this.c + ", weight=" + this.d + ", lastMsgCnvId=" + this.e + ", phaseId=" + this.f + ", draftMsg=" + this.g + ')';
    }
}
