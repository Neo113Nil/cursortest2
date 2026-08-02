package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.g1e0;

/* compiled from: ProfilesGetCmd.kt */
/* loaded from: classes2.dex */
public final class d1e0 extends le6<ProfilesInfo> {
    public final g1e0 b;

    public d1e0(e1e0 e1e0Var) {
        this(e1e0Var.a, e1e0Var.b, e1e0Var.c);
    }

    @Override // xsna.le6
    public final ProfilesInfo e(w2w w2wVar) {
        ProfilesInfo profilesInfo;
        ProfilesInfo profilesInfo2;
        ProfilesInfo profilesInfo3;
        ProfilesInfo profilesInfo4;
        ProfilesInfo profilesInfo5;
        ProfilesInfo profilesInfo6 = new ProfilesInfo();
        g1e0 g1e0Var = this.b;
        f1e0 f1e0Var = g1e0Var.a;
        Object obj = g1e0Var.d;
        boolean z = g1e0Var.c;
        Source source = g1e0Var.b;
        List O0 = j5g.O0(f1e0Var.a);
        if (O0.isEmpty()) {
            profilesInfo = new ProfilesInfo();
        } else {
            List list = O0;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.a(longValue, Peer.Type.USER));
            }
            wpp wppVar = (wpp) w2wVar.L0(this, new b1r0(arrayList, source, z, obj));
            profilesInfo = new ProfilesInfo(wppVar, new wpp(pn00.t(w2wVar.I0().w().k(wppVar.k()))), null, null, null, 28, null);
        }
        profilesInfo6.Hb(profilesInfo);
        List O02 = j5g.O0(f1e0Var.b);
        if (O02.isEmpty()) {
            profilesInfo2 = new ProfilesInfo();
        } else {
            wpp wppVar2 = (wpp) w2wVar.L0(this, new abj(O02, source, z, obj));
            Collection values = wppVar2.c.values();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = values.iterator();
            while (it2.hasNext()) {
                Long l = ((Contact) it2.next()).j;
                if (l != null) {
                    arrayList2.add(l);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                long longValue2 = ((Number) it3.next()).longValue();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                arrayList3.add(Peer.a.a(longValue2, Peer.Type.USER));
            }
            profilesInfo2 = new ProfilesInfo((wpp) w2wVar.L0(this, new b1r0(arrayList3, source, z, obj)), wppVar2, null, null, null, 28, null);
        }
        profilesInfo6.Hb(profilesInfo2);
        List O03 = j5g.O0(f1e0Var.d);
        if (O03.isEmpty()) {
            profilesInfo3 = new ProfilesInfo();
        } else {
            List list2 = O03;
            ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                long longValue3 = ((Number) it4.next()).longValue();
                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                arrayList4.add(Peer.a.a(longValue3, Peer.Type.GROUP));
            }
            profilesInfo3 = new ProfilesInfo(null, null, null, (wpp) w2wVar.L0(this, new tpu(arrayList4, source, z, obj)), null, 23, null);
        }
        profilesInfo6.Hb(profilesInfo3);
        List O04 = j5g.O0(f1e0Var.c);
        if (O04.isEmpty()) {
            profilesInfo4 = new ProfilesInfo();
        } else {
            List list3 = O04;
            ArrayList arrayList5 = new ArrayList(c5g.u(list3, 10));
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                long longValue4 = ((Number) it5.next()).longValue();
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                arrayList5.add(Peer.a.a(longValue4, Peer.Type.EMAIL));
            }
            profilesInfo4 = new ProfilesInfo(null, null, (wpp) w2wVar.L0(this, new lcp(arrayList5, source, z, obj)), null, null, 27, null);
        }
        profilesInfo6.Hb(profilesInfo4);
        List O05 = j5g.O0(f1e0Var.e);
        if (O05.isEmpty()) {
            profilesInfo5 = new ProfilesInfo();
        } else {
            List list4 = O05;
            ArrayList arrayList6 = new ArrayList(c5g.u(list4, 10));
            Iterator it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList6.add(new Peer.Channel(((Number) it6.next()).longValue()));
            }
            profilesInfo5 = new ProfilesInfo(null, null, null, null, (wpp) w2wVar.L0(this, new gfb(arrayList6, source, z, obj)), 15, null);
        }
        profilesInfo6.Hb(profilesInfo5);
        return profilesInfo6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1e0) && epx.f(this.b, ((d1e0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ProfilesGetCmd(args=" + this.b + ')';
    }

    public d1e0(g1e0 g1e0Var) {
        this.b = g1e0Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1e0(Peer peer, Source source, boolean z) {
        this(new g1e0(r0));
        g1e0.a aVar = new g1e0.a();
        aVar.a.c(peer);
        aVar.b = source;
        aVar.c = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1e0(Collection<? extends Peer> collection, Source source, boolean z) {
        this(new g1e0(r0));
        g1e0.a aVar = new g1e0.a();
        aVar.h(collection);
        aVar.b = source;
        aVar.c = z;
    }
}
