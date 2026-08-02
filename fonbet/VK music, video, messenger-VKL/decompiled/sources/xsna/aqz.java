package xsna;

import com.vk.contacts.AndroidContact;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.g1e0;

/* compiled from: LoadNewChatModelCmd.kt */
/* loaded from: classes2.dex */
public final class aqz extends le6<a> {
    public final List<Long> b;
    public final List<AndroidContact> c;

    /* compiled from: LoadNewChatModelCmd.kt */
    public static final class a {
        public final List<qtd0> a;
        public final qtd0 b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends qtd0> list, qtd0 qtd0Var) {
            this.a = list;
            this.b = qtd0Var;
        }
    }

    public aqz(List<Long> list, List<AndroidContact> list2) {
        this.b = list;
        this.c = list2;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(w2wVar.H0().b);
        List<Long> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        ArrayList u0 = j5g.u0(Collections.singletonList(b), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = u0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Peer peer = (Peer) next;
            peer.getClass();
            if (peer.Ab(Peer.Type.USER)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(((Peer) it3.next()).d));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = u0.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            Peer peer2 = (Peer) next2;
            peer2.getClass();
            if (peer2.Ab(Peer.Type.CONTACT)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Long.valueOf(((Peer) it5.next()).d));
        }
        g1e0.a aVar = new g1e0.a();
        aVar.b = Source.ACTUAL;
        aVar.c = true;
        aVar.k(arrayList3);
        aVar.d(arrayList5);
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        qtd0 Bb = profilesInfo.Bb(b);
        Collection values = profilesInfo.Ob().g.values();
        ArrayList arrayList6 = new ArrayList(c5g.u(values, 10));
        Iterator it6 = values.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((Map) it6.next()).values());
        }
        ArrayList v = c5g.v(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = v.iterator();
        while (it7.hasNext()) {
            Object next3 = it7.next();
            if (((qtd0) next3).G3() != b.b) {
                arrayList7.add(next3);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            Object next4 = it8.next();
            qtd0 qtd0Var = (qtd0) next4;
            if (!(qtd0Var instanceof Contact) || ((Contact) qtd0Var).j == null) {
                arrayList8.add(next4);
            }
        }
        ArrayList arrayList9 = new ArrayList(arrayList8);
        List<AndroidContact> list2 = this.c;
        ArrayList arrayList10 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList10.add(new com.vk.im.engine.models.contacts.a((AndroidContact) it9.next()));
        }
        arrayList9.addAll(arrayList10);
        return new a(j5g.D0(new bqz(0), arrayList9), Bb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqz)) {
            return false;
        }
        aqz aqzVar = (aqz) obj;
        return epx.f(this.b, aqzVar.b) && epx.f(this.c, aqzVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadNewChatModelCmd(peerIds=");
        sb.append(this.b);
        sb.append(", contacts=");
        return ms9.a(')', sb, this.c);
    }
}
