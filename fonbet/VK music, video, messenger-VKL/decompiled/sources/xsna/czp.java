package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.g1e0;

/* compiled from: EventHelperImpl.kt */
/* loaded from: classes.dex */
public final class czp implements bzp {
    public final w2w a;
    public final w2w b;

    public czp(w2w w2wVar, w2w w2wVar2) {
        this.a = w2wVar;
        this.b = w2wVar2;
    }

    @Override // xsna.bzp
    public final void A(Object obj, wpp<Long, Dialog> wppVar) {
        this.a.e1(this, new r480(obj, wppVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.bzp
    public final void B(Object obj, boolean z) {
        this.a.e1(obj, new m580(z, (InfoBar) ((it80) this.b.L0(this, new tsm())).a));
    }

    @Override // xsna.bzp
    public final void C(Object obj, xpp<AccountInfo> xppVar) {
        this.a.e1(this, new s080(obj, xppVar));
    }

    @Override // xsna.bzp
    public final void D(long j, String str) {
        List singletonList = Collections.singletonList(Long.valueOf(j));
        ArrayList arrayList = new ArrayList(c5g.u(singletonList, 10));
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.a(longValue, Peer.Type.GROUP));
        }
        this.a.e1(this, new ka80(str, null, null, null, (wpp) this.b.L0(this, new tpu((List) arrayList, Source.CACHE, false, 12)), 14));
    }

    @Override // xsna.bzp
    public final void F(long j, Peer peer, ProfilesInfo profilesInfo) {
        this.a.e1(this, new h480(j, peer, profilesInfo));
    }

    @Override // xsna.bzp
    public final void G(Object obj, Collection<? extends Msg> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : collection) {
            Long valueOf = Long.valueOf(((Msg) obj2).y());
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list = (List) entry.getValue();
            Long valueOf2 = Long.valueOf(longValue);
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).xb()));
            }
            linkedHashMap2.put(valueOf2, arrayList);
        }
        this.a.e1(this, new p980(obj, linkedHashMap2));
    }

    @Override // xsna.bzp
    public final void H(long j) {
        a(Collections.singletonList(Long.valueOf(j)));
    }

    @Override // xsna.bzp
    public final void I(long j, Object obj) {
        this.a.e1(this, new t580(obj, j));
    }

    @Override // xsna.bzp
    public final void J(Object obj, wpp<Long, User> wppVar) {
        this.a.e1(this, new ka80(obj, wppVar, null, null, null, 28));
    }

    @Override // xsna.bzp
    public final void K(Collection<Long> collection, Collection<Long> collection2, Collection<Long> collection3, Collection<Long> collection4) {
        if (collection.isEmpty() && collection2.isEmpty() && collection3.isEmpty() && collection4.isEmpty()) {
            return;
        }
        g1e0.a aVar = new g1e0.a();
        aVar.k(collection);
        aVar.d(collection2);
        aVar.e(collection3);
        aVar.f(collection4);
        aVar.j(Source.CACHE);
        this.a.e1(this, new ka80((Object) null, (ProfilesInfo) this.b.L0(this, new d1e0(aVar.b()))));
    }

    @Override // xsna.bzp
    public final void L(Attach attach) {
        this.a.e1(this, new c180(attach));
    }

    @Override // xsna.bzp
    public final void M(Object obj, Map<Long, User> map) {
        if (map.isEmpty()) {
            return;
        }
        this.a.e1(this, new ka80(obj, new wpp(map), null, null, null, 28));
    }

    @Override // xsna.bzp
    public final void N(Collection<UserId> collection) {
        Collection<UserId> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.dto.common.a.a((UserId) it.next()));
        }
        wpp wppVar = (wpp) this.b.L0(this, new b1r0(arrayList, Source.CACHE));
        ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((UserId) it2.next()).b));
        }
        ArrayList d = wppVar.d(arrayList2);
        if (d.isEmpty()) {
            return;
        }
        d(null, d);
    }

    @Override // xsna.bzp
    public final void O(Attach attach) {
        this.a.e1(this, new y080(attach, null));
    }

    @Override // xsna.bzp
    public final void P(ArrayList arrayList) {
        this.a.e1(this, new t480(arrayList));
    }

    @Override // xsna.bzp
    public final void Q(Object obj, OnChannelsCacheInvalidateEvent.Reason reason) {
        this.a.e1(this, new OnChannelsCacheInvalidateEvent(obj, reason));
    }

    @Override // xsna.bzp
    public final void R(UserId userId) {
        N(Collections.singletonList(userId));
    }

    @Override // xsna.bzp
    public final void S() {
        this.a.e1(this, l580.b);
    }

    @Override // xsna.bzp
    public final void T(String str) {
        this.a.e1(this, new fc80(str));
    }

    @Override // xsna.bzp
    public final void U(DialogsCounters.Type type, int i) {
        this.a.e1(this, new t480(Collections.singletonList(new adm(type, i))));
    }

    @Override // xsna.bzp
    public final void V(long j) {
        v(j, null);
    }

    @Override // xsna.bzp
    public final void W(int i) {
        s(i, null);
    }

    @Override // xsna.bzp
    public final void a(List<Long> list) {
        List<Long> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        this.a.e1(this, new r280((wpp) this.b.J0(this, new gfb((List) arrayList, Source.CACHE, false, 8)).await()));
    }

    @Override // xsna.bzp
    public final void b(int i, ArrayList arrayList) {
        this.a.e1(this, new rhj0(i, arrayList));
    }

    @Override // xsna.bzp
    public final void c(Object obj, wpp<Integer, Msg> wppVar) {
        G(obj, wppVar.c.values());
    }

    @Override // xsna.bzp
    public final void d(String str, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap(collection.size());
        for (Object obj : collection) {
            hashMap.put(((User) obj).Eb(), obj);
        }
        M(str, hashMap);
    }

    @Override // xsna.bzp
    public final void e(Throwable th) {
        this.a.e1(this, new e280(th));
    }

    @Override // xsna.bzp
    public final void f(Attach attach) {
        this.a.e1(this, new a180(attach));
    }

    @Override // xsna.bzp
    public final void g(DialogBackground dialogBackground) {
        this.a.e1(this, new f480(this, dialogBackground));
    }

    @Override // xsna.bzp
    public final void h(List<j0l0> list) {
        this.a.e1(this, new xb80(list));
    }

    @Override // xsna.bzp
    public final void i() {
        this.a.e1(this, m380.b);
    }

    @Override // xsna.bzp
    public final void j(Object obj) {
        this.a.e1(this, new OnCacheInvalidateEvent(obj, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
    }

    @Override // xsna.bzp
    public final void k(Attach attach) {
        this.a.e1(this, new z080(attach));
    }

    @Override // xsna.bzp
    public final void l(DialogsFilter dialogsFilter, xpp<Boolean> xppVar) {
        this.a.e1(this, new v480(null, dialogsFilter, xppVar));
    }

    @Override // xsna.bzp
    public final void m(long j, long j2, z28 z28Var, ProfilesInfo profilesInfo) {
        this.a.e1(this, new f280(j, j2, z28Var, profilesInfo));
    }

    @Override // xsna.bzp
    public final void n(Object obj, Collection<Long> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Collection<Long> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        this.a.e1(this, new r480(obj, (wpp) this.b.b1(this, new tqm(new sqm(arrayList, null, false, null, 0, 30)))));
    }

    @Override // xsna.bzp
    public final void o(Object obj, Object obj2, gkx0 gkx0Var, int i) {
        this.a.e1(obj, new i480(obj2, gkx0Var, i));
    }

    @Override // xsna.bzp
    public final void p(Object obj, ProfilesSimpleInfo profilesSimpleInfo) {
        J(obj, new wpp<>(profilesSimpleInfo.Fb()));
        y(obj, new wpp<>(profilesSimpleInfo.Db()));
        t(obj, new wpp<>(profilesSimpleInfo.Eb()));
    }

    @Override // xsna.bzp
    public final void q(long j) {
        this.a.e1(this, new o8b(j, (List) this.b.J0(this, new oza(j, Source.CACHE, false)).await()));
    }

    @Override // xsna.bzp
    public final void r(ArrayList arrayList) {
        this.a.e1(this, new u6j0(arrayList));
    }

    @Override // xsna.bzp
    public final void s(int i, Object obj) {
        G(obj, ((wpp) this.b.L0(this, new dj30(MsgIdType.LOCAL_ID, i, Source.CACHE))).c.values());
    }

    @Override // xsna.bzp
    public final void t(Object obj, wpp<Long, Group> wppVar) {
        this.a.e1(this, new ka80(obj, null, null, null, wppVar, 14));
    }

    @Override // xsna.bzp
    public final void u(Object obj, OnCacheInvalidateEvent.Reason reason) {
        this.a.e1(this, new OnCacheInvalidateEvent(obj, reason));
    }

    @Override // xsna.bzp
    public final void v(long j, Object obj) {
        n(obj, Collections.singletonList(Long.valueOf(j)));
    }

    @Override // xsna.bzp
    public final void w(Object obj, MsgFromUser msgFromUser) {
        this.a.e1(this, new p980(obj, msgFromUser.y(), msgFromUser.xb()));
    }

    @Override // xsna.bzp
    public final void x(long j, List<? extends Msg> list) {
        this.a.e1(this, new l980(null, j, list));
    }

    @Override // xsna.bzp
    public final void y(Object obj, wpp<Long, Email> wppVar) {
        this.a.e1(this, new ka80(obj, null, null, wppVar, null, 22));
    }

    @Override // xsna.bzp
    public final void z(Attach attach, int i, int i2) {
        this.a.e1(this, new d180(attach, i, i2));
    }
}
