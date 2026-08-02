package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.commands.contacts.ContactsSearchCmd;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.kx30;

/* compiled from: ContactsSearchCmd.kt */
/* loaded from: classes2.dex */
public final class ycj extends le6<List<? extends t8j>> {
    public final String b;
    public final Source c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Object g;
    public final SearchEntrypoint h;

    /* compiled from: ContactsSearchCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ycj(String str, Source source, boolean z, boolean z2, boolean z3, String str2, SearchEntrypoint searchEntrypoint, int i) {
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        z3 = (i & 16) != 0 ? false : z3;
        str2 = (i & 32) != 0 ? null : str2;
        searchEntrypoint = (i & 64) != 0 ? null : searchEntrypoint;
        this.b = str;
        this.c = source;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = searchEntrypoint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r2.i().S != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0163, code lost:
    
        if (r4.i().S != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<? extends t8j> e(w2w w2wVar) {
        boolean z;
        Iterable iterable;
        boolean z2;
        LinkedHashMap linkedHashMap;
        long id;
        VerifyInfo verifyInfo;
        ContactsSearchCmd.a cVar;
        ContactsSearchCmd.MatchType matchType;
        ycj ycjVar = this;
        SearchMode searchMode = SearchMode.PEERS;
        SearchEntrypoint searchEntrypoint = ycjVar.h;
        String str = ycjVar.b;
        kx30.a aVar = (kx30.a) w2wVar.L0(ycjVar, new kx30(str, ycjVar.c, searchMode, 20, 0, null, null, true, ycjVar.e, null, searchEntrypoint, 1648));
        List<zpp<Dialog>> list = aVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            zpp zppVar = (zpp) obj;
            if (!((Dialog) zppVar.a).uc() && !((Dialog) zppVar.a).Va()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            zpp zppVar2 = (zpp) it.next();
            qtd0 Ab = aVar.d.Ab(((Dialog) zppVar2.a).Sb());
            t8j f = Ab != null ? ycjVar.f(zppVar2.b, Ab, false) : null;
            if (f != null) {
                arrayList2.add(f);
            }
        }
        if (ycjVar.f) {
            b25 a2 = o25.a();
            Peer a3 = mq9.a(w2wVar);
            com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
            a3.getClass();
            if (!a3.Ab(Peer.Type.GROUP)) {
                if (o25.b(a2)) {
                    experiments.getClass();
                }
                cVar = new ContactsSearchCmd.a.C1108a();
                matchType = ContactsSearchCmd.MatchType.ANY;
                iterable = j5g.D0(new zcj(0), ((ContactsSearchCmd.c) w2wVar.L0(ycjVar, new ContactsSearchCmd(str, cVar, matchType))).a.values());
            }
            cVar = new ContactsSearchCmd.a.c();
            matchType = ContactsSearchCmd.MatchType.BY_NAME;
            iterable = j5g.D0(new zcj(0), ((ContactsSearchCmd.c) w2wVar.L0(ycjVar, new ContactsSearchCmd(str, cVar, matchType))).a.values());
        } else {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (true) {
            z2 = true;
            if (!it2.hasNext()) {
                break;
            }
            arrayList3.add(ycjVar.f("", (qtd0) it2.next(), true));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(arrayList2);
        Source source = Source.NETWORK;
        Source source2 = ycjVar.c;
        if (source2 == source) {
            b25 a4 = o25.a();
            com.vk.im.engine.models.c experiments2 = w2wVar.getExperiments();
            cn o = a4.o();
            if (o25.b(o25.a()) && (verifyInfo = o.l) != null && verifyInfo.b) {
                experiments2.getClass();
            }
        }
        b25 a5 = o25.a();
        Peer a6 = mq9.a(w2wVar);
        com.vk.im.engine.models.c experiments3 = w2wVar.getExperiments();
        a6.getClass();
        if (!a6.Ab(Peer.Type.GROUP)) {
            if (o25.b(a5)) {
                experiments3.getClass();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : linkedHashSet) {
                linkedHashMap2.put(Long.valueOf(((t8j) obj2).j), obj2);
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                qtd0 qtd0Var = ((t8j) next).b;
                if (qtd0Var instanceof Contact) {
                    Contact contact = (Contact) qtd0Var;
                    Long l = contact.j;
                    if (l != null && !linkedHashMap2.containsKey(l)) {
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        linkedHashSet2.add(new Peer.User(l.longValue()));
                    }
                    id = l != null ? l.longValue() : contact.b;
                } else {
                    id = qtd0Var.id();
                }
                linkedHashMap3.put(Long.valueOf(id), next);
            }
            HashMap hashMap = ((wpp) w2wVar.L0(ycjVar, new b1r0(j5g.O0(linkedHashSet2), source2))).c;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(on00.e(hashMap.size()));
            for (Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap4.put(entry.getKey(), ycjVar.f("", (User) entry.getValue(), true));
            }
            linkedHashMap2.putAll(linkedHashMap4);
            hdj w = w2wVar.I0().w();
            Set keySet = linkedHashMap2.keySet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : keySet) {
                if (!linkedHashMap3.containsKey(Long.valueOf(((Number) obj3).longValue()))) {
                    arrayList4.add(obj3);
                }
            }
            LinkedHashMap k = w.k(arrayList4);
            Iterator it4 = j5g.O0(linkedHashMap2.keySet()).iterator();
            while (it4.hasNext()) {
                long longValue = ((Number) it4.next()).longValue();
                Object remove = linkedHashMap3.remove(Long.valueOf(longValue));
                if (remove == null) {
                    Contact contact2 = (Contact) k.get(Long.valueOf(longValue));
                    remove = contact2 != null ? ycjVar.f("", contact2, z2) : null;
                }
                t8j t8jVar = (t8j) remove;
                if (t8jVar != null) {
                    Object obj4 = linkedHashMap2.get(Long.valueOf(longValue));
                    if (obj4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    t8j t8jVar2 = (t8j) obj4;
                    qtd0 qtd0Var2 = t8jVar.b;
                    Contact contact3 = qtd0Var2 instanceof Contact ? (Contact) qtd0Var2 : null;
                    qtd0 qtd0Var3 = t8jVar2.b;
                    User user = qtd0Var3 instanceof User ? (User) qtd0Var3 : null;
                    if (contact3 != null && user != null) {
                        linkedHashMap2.remove(Long.valueOf(contact3.b));
                        linkedHashMap = linkedHashMap3;
                        linkedHashMap2.put(Long.valueOf(longValue), new t8j(User.zb(user, null, null, null, false, null, (user.w || contact3.ib()) ? z2 : z, 0, contact3.d, false, null, -35651585), t8jVar2.c, t8jVar2.d, t8jVar2.e, t8jVar2.f, t8jVar2.g, t8jVar2.h, t8jVar2.i, t8jVar2.j, true, t8jVar2.l, null, t8jVar2.m, t8jVar2.n, t8jVar2.o));
                        ycjVar = this;
                        linkedHashMap3 = linkedHashMap;
                        z = false;
                        z2 = true;
                    }
                }
                linkedHashMap = linkedHashMap3;
                ycjVar = this;
                linkedHashMap3 = linkedHashMap;
                z = false;
                z2 = true;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = j5g.u0(linkedHashMap3.values(), linkedHashMap2.values()).iterator();
            while (it5.hasNext()) {
                t8j t8jVar3 = (t8j) it5.next();
                if (t8jVar3.c == 5) {
                    arrayList6.add(t8jVar3);
                } else {
                    arrayList5.add(t8jVar3);
                }
            }
            return j5g.u0(arrayList6, arrayList5);
        }
        return j5g.u0(linkedHashSet, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycj)) {
            return false;
        }
        ycj ycjVar = (ycj) obj;
        return epx.f(this.b, ycjVar.b) && this.c == ycjVar.c && this.d == ycjVar.d && this.e == ycjVar.e && this.f == ycjVar.f && epx.f(this.g, ycjVar.g) && this.h == ycjVar.h;
    }

    public final t8j f(String str, qtd0 qtd0Var, boolean z) {
        int i = a.$EnumSwitchMapping$0[qtd0Var.t8().ordinal()];
        if (i == 1) {
            return new t8j(qtd0Var, 3, hdp.a.a(qtd0Var.name()), false, false, false, false, z, false, str, 14840);
        }
        if (i != 2) {
            return new t8j(qtd0Var, 5, hdp.a.a(qtd0Var.name()), false, false, false, false, z, false, str, 14840);
        }
        return new t8j(qtd0Var, 0, hdp.a.a((!this.d || qtd0Var.h8().length() <= 0) ? qtd0Var.name() : qtd0Var.h8()), false, false, false, false, z, false, str, 14840);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Object obj = this.g;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        SearchEntrypoint searchEntrypoint = this.h;
        return hashCode + (searchEntrypoint != null ? searchEntrypoint.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactsSearchCmd(query=" + this.b + ", source=" + this.c + ", forceContactNameForUsers=" + this.d + ", onlyInContacts=" + this.e + ", withLocalContacts=" + this.f + ", changerTag=" + this.g + ", searchScreenRef=" + this.h + ')';
    }
}
