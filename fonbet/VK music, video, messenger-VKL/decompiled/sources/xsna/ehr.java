package xsna;

import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FindNotListenedAudioMsgCmd.kt */
/* loaded from: classes2.dex */
public final class ehr extends le6<List<? extends MsgFromUser>> {
    public final boolean b;
    public final boolean c;
    public final long d;

    public ehr() {
        this(true, 0L);
    }

    @Override // xsna.le6
    public final List<? extends MsgFromUser> e(w2w w2wVar) {
        ArrayList E = g5g.E(w2wVar.I0().o().O(this.d), MsgFromUser.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = E.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            MsgFromUser msgFromUser = (MsgFromUser) next;
            boolean z = false;
            boolean z2 = this.b && msgFromUser.i;
            if (this.c && !msgFromUser.i) {
                z = true;
            }
            if (msgFromUser.S0() && !msgFromUser.cc() && (z2 || z)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehr)) {
            return false;
        }
        ehr ehrVar = (ehr) obj;
        return this.b == ehrVar.b && this.c == ehrVar.c && this.d == ehrVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("FindNotListenedAudioMsgCmd(includeIncoming=");
        sb.append(this.b);
        sb.append(", includeOutgoing=");
        sb.append(this.c);
        sb.append(", sinceTime=");
        return vu5.a(')', this.d, sb);
    }

    public ehr(boolean z, long j) {
        this.b = true;
        this.c = z;
        this.d = j;
    }
}
