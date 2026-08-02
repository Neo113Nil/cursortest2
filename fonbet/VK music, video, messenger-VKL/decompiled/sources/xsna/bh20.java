package xsna;

import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MessagesUpdateFolderApiCmd.kt */
/* loaded from: classes18.dex */
public final class bh20 extends nx2<s3q0> {
    public final int b;
    public final String c;
    public final List<Peer> d;
    public final List<Peer> e;

    public bh20(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = i;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        ArrayList arrayList;
        List<Peer> list = this.d;
        ArrayList arrayList2 = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            List<Peer> list2 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(com.vk.dto.common.a.b((Peer) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<Peer> list3 = this.e;
        if (list3.isEmpty()) {
            list3 = null;
        }
        if (list3 != null) {
            List<Peer> list4 = list3;
            arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(com.vk.dto.common.a.b((Peer) it2.next()));
            }
        }
        tfx tfxVar = new tfx("messages.updateFolder", new dr(24), new com.vk.movika.sdk.android.defaultplayer.view.a(23));
        tfx.l(tfxVar, "folder_id", this.b, 1, 0, 8);
        String str = this.c;
        if (str != null) {
            tfx.o(tfxVar, "name", str, 1, 0, 8);
        }
        if (arrayList != null) {
            tfx.p(tfxVar, "add_included_peer_ids", arrayList, 0L, 12);
            tfxVar = tfxVar;
        }
        if (arrayList2 != null) {
            tfx.p(tfxVar, "remove_included_peer_ids", arrayList2, 0L, 12);
        }
        bz2.n(tfxVar, new u4u(11)).f(l7r0Var);
        return s3q0.a;
    }
}
