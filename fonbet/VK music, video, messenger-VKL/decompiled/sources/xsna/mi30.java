package xsna;

import android.util.SparseArray;
import com.vk.core.util.DefaultHashMap;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MsgDownloadAttachesCmd.kt */
/* loaded from: classes2.dex */
public final class mi30 extends xl6<s3q0> {
    public final Peer b;
    public final List<Integer> c;

    public mi30(Peer peer, List<Integer> list) {
        this.b = peer;
        this.c = list;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-attach-download-local";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        d040 o = w2wVar.I0().o();
        SparseArray<Msg> T = o.T(this.c);
        int i = 22;
        DefaultHashMap defaultHashMap = new DefaultHashMap(new ci3(22));
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
            MsgFromUser msgFromUser = (MsgFromUser) it2.next();
            s6x s6xVar = new s6x(10);
            m9 m9Var = new m9(i, defaultHashMap, msgFromUser);
            msgFromUser.getClass();
            a.C1125a.f(msgFromUser, s6xVar, m9Var);
        }
        Iterator it3 = defaultHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            g5g.D((List) ((Map.Entry) it3.next()).getValue(), true, new io3(27));
        }
        w2wVar.I0().u(new n9(16, defaultHashMap, o));
        Iterator it4 = defaultHashMap.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            MsgFromUser msgFromUser2 = (MsgFromUser) entry.getKey();
            for (AttachWithDownload attachWithDownload : (List) entry.getValue()) {
                w2wVar.S0().O(attachWithDownload);
                w2wVar.S0().z(attachWithDownload, 0, 1000);
                w2wVar.O0().a(new r14(this.b, msgFromUser2.b, attachWithDownload));
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi30)) {
            return false;
        }
        mi30 mi30Var = (mi30) obj;
        return epx.f(this.b, mi30Var.b) && epx.f(this.c, mi30Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgDownloadAttachesCmd(peer=");
        sb.append(this.b);
        sb.append(", msgLocalIds=");
        return ms9.a(')', sb, this.c);
    }
}
