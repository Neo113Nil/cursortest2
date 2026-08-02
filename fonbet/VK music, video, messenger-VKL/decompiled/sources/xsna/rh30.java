package xsna;

import android.util.SparseArray;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: MsgCheckAttachesDownloadedCmd.kt */
/* loaded from: classes2.dex */
public final class rh30 extends xl6<Boolean> {
    public final Peer b;
    public final List<Integer> c;

    public rh30(Peer peer, List<Integer> list) {
        this.b = peer;
        this.c = list;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-attach-download-local";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        SparseArray<Msg> T = w2wVar.I0().o().T(this.c);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        u4q0 u4q0Var = zik0.a;
        xik0 xik0Var = new xik0(T);
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = xik0Var.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MsgFromUser) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((MsgFromUser) it2.next()).F3(new bgy(ref$BooleanRef, 8));
        }
        return Boolean.valueOf(ref$BooleanRef.element);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh30)) {
            return false;
        }
        rh30 rh30Var = (rh30) obj;
        return epx.f(this.b, rh30Var.b) && epx.f(this.c, rh30Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgCheckAttachesDownloadedCmd(peer=");
        sb.append(this.b);
        sb.append(", msgLocalIds=");
        return ms9.a(')', sb, this.c);
    }
}
