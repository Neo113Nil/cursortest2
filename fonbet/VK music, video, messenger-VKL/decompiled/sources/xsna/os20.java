package xsna;

import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.internal.longpoll.MissedLoaderContactsNotFoundException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reporters.api.engine.LongPollHistoryReporter;
import com.vk.im.reporters.api.engine.LongPollReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.efb;
import xsna.ge20;
import xsna.k2b;
import xsna.re20;

/* compiled from: MissedLoader.kt */
/* loaded from: classes2.dex */
public final class os20 {
    public final w2w a;
    public final String b;
    public final String c;
    public final LongPollHistoryReporter d;
    public final mdz<LongPollHistoryReporter.Span> e;

    /* compiled from: MissedLoader.kt */
    public interface a {

        /* compiled from: MissedLoader.kt */
        /* renamed from: xsna.os20$a$a, reason: collision with other inner class name */
        public static final class C3469a implements a {
            public static final C3469a a = new C3469a();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_CHANNELS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashSet linkedHashSet = f400Var.i;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                efb.b bVar = (efb.b) fo50.v(new efb(arrayList, false), w2wVar, "MissedLoader.ChannelsGetByIdApiCmd", 2);
                List<eeb> list = bVar.a;
                ProfilesSimpleInfo profilesSimpleInfo = bVar.b;
                List<eeb> list2 = list;
                int e = on00.e(c5g.u(list2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj : list2) {
                    linkedHashMap.put(Long.valueOf(((eeb) obj).a.a), obj);
                }
                c400Var.i.putAll(linkedHashMap);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    long longValue2 = ((Number) entry.getKey()).longValue();
                    Msg msg = ((eeb) entry.getValue()).b;
                    if (msg != null) {
                        Map f = on00.f(new Pair(Integer.valueOf(msg.d), msg));
                        LinkedHashMap linkedHashMap2 = c400Var.j;
                        Long valueOf = Long.valueOf(longValue2);
                        Object obj2 = linkedHashMap2.get(valueOf);
                        if (obj2 == null) {
                            obj2 = new HashMap();
                            linkedHashMap2.put(valueOf, obj2);
                        }
                        ((Map) obj2).putAll(f);
                    }
                }
                c400Var.a.putAll(profilesSimpleInfo.b);
                c400Var.e.putAll(profilesSimpleInfo.c);
                c400Var.b.putAll(profilesSimpleInfo.d);
                c400Var.c.putAll(profilesSimpleInfo.e);
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class b implements a {
            public static final b a = new b();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_CHANNELS_COUNTERS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                if (f400Var.l) {
                    c400Var.m = (Boolean) bz2.c(new i7b(), "MissedLoader.ChannelNotifyConfigGetApiCmd");
                }
                if (f400Var.k) {
                    c400Var.l = (oeb) bz2.c(new ifb(), null);
                }
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class c implements a {
            public static final c a = new c();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_CHANNELS_MESSAGES;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashMap linkedHashMap = f400Var.j;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    Set set = (Set) entry.getValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    k2b.a aVar = (k2b.a) fo50.v(new k2b(Peer.a.b(longValue), set, false, true), w2wVar, "MissedLoader.ChannelMessagesGetByIdApiCmd", 2);
                    Object obj = aVar.a;
                    ProfilesSimpleInfo profilesSimpleInfo = aVar.b;
                    LinkedHashMap linkedHashMap2 = c400Var.j;
                    Long valueOf = Long.valueOf(longValue);
                    Object obj2 = linkedHashMap2.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new HashMap();
                        linkedHashMap2.put(valueOf, obj2);
                    }
                    ((Map) obj2).putAll(obj);
                    c400Var.a.putAll(profilesSimpleInfo.b);
                    c400Var.e.putAll(profilesSimpleInfo.c);
                    c400Var.b.putAll(profilesSimpleInfo.d);
                    c400Var.c.putAll(profilesSimpleInfo.e);
                }
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class d implements a {
            public static final d a = new d();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_CHAT_INFOS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                Iterator it = f400Var.a.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    c400Var.f.put(Long.valueOf(longValue), (urb) bz2.c(new oe20(Peer.a.b(longValue), w2wVar.Q0(), null, false, false, null, 52), null));
                }
                LinkedHashMap linkedHashMap = f400Var.b;
                final x4a x4aVar = new x4a(6, w2wVar, c400Var);
                linkedHashMap.forEach(new BiConsumer() { // from class: xsna.ps20
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        x4a.this.invoke(obj, obj2);
                    }
                });
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class e implements a {
            public static final e a = new e();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_CONTACTS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashSet linkedHashSet = f400Var.e;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                try {
                    c400Var.e.putAll((Map) bz2.c(new ne20(linkedHashSet, gVar.b, false), "MissedLoader.MessagesGetContactsByIdApiCmd"));
                } catch (VKApiExecutionException e) {
                    if (e.s() != 936) {
                        throw e;
                    }
                    com.vk.metrics.eventtracking.b.a.a(new MissedLoaderContactsNotFoundException("Contacts not found " + linkedHashSet, e));
                }
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class f implements a {
            public static final f a = new f();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_CONVERSATIONS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashSet linkedHashSet = f400Var.c;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                re20.b bVar = (re20.b) bz2.c(new re20(arrayList, w2wVar.Q0(), false, gVar.a), "MissedLoader.MessagesGetConversationsByIdApiCmd");
                LinkedHashMap linkedHashMap = c400Var.d;
                HashMap hashMap = bVar.a;
                ProfilesSimpleInfo profilesSimpleInfo = bVar.b;
                linkedHashMap.putAll(hashMap);
                c400Var.a.putAll(profilesSimpleInfo.b);
                c400Var.e.putAll(profilesSimpleInfo.c);
                c400Var.b.putAll(profilesSimpleInfo.d);
                c400Var.c.putAll(profilesSimpleInfo.e);
                Collection<com.vk.im.engine.models.dialogs.a> values = bVar.a.values();
                ArrayList arrayList2 = new ArrayList(c5g.u(values, 10));
                for (com.vk.im.engine.models.dialogs.a aVar : values) {
                    arrayList2.add("dialogId " + aVar.a + " lastMsgCnvId " + aVar.f);
                }
                f900.a.a("MissedLoader " + arrayList2);
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class g {
            public final String a;
            public final String b;

            public g(String str, String str2) {
                this.a = str;
                this.b = str2;
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class h implements a {
            public static final h a = new h();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_EMAILS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashSet linkedHashSet = f400Var.g;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.a(longValue, Peer.Type.EMAIL));
                }
                c400Var.b.putAll((Map) bz2.c(new kcp(arrayList), null));
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class i implements a {
            public static final i a = new i();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_FOLDERS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                if (f400Var.m.isEmpty()) {
                    return;
                }
                com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
                ListBuilder e = e43.e();
                e.add(FoldersSupportedType.CHANNELS);
                p4g.a(FoldersSupportedType.BUSINESS, e, experiments.o());
                e.add(FoldersSupportedType.PERSONAL);
                p4g.a(FoldersSupportedType.MANAGED_GROUPS, e, BuildInfo.s());
                c400Var.n = (MessagesFoldersInfoDto) bz2.c(new ve20(e.g(), false), "MissedLoader.MessagesGetFoldersApiCmd");
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 962473331;
            }

            public final String toString() {
                return "Folders";
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class j implements a {
            public static final j a = new j();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_GROUPS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashSet linkedHashSet = f400Var.h;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.a(longValue, Peer.Type.GROUP));
                }
                c400Var.c.putAll((Map) bz2.c(new spu(arrayList, false), "MissedLoader.GroupsGetByIdApiCmd"));
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class k implements a {
            public static final k a = new k();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_INCOGNITOS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashMap linkedHashMap = c400Var.k;
                for (Map.Entry entry : f400Var.n.entrySet()) {
                    Map map = (Map) bz2.c(new bf20(((Number) entry.getKey()).longValue(), (Collection) entry.getValue(), false), "MissedLoader.MessagesGetIncognitoMembersByIdsApiCmd");
                    Object key = entry.getKey();
                    Object orDefault = linkedHashMap.getOrDefault(entry.getKey(), new LinkedHashMap());
                    ((Map) orDefault).putAll(map);
                    linkedHashMap.put(key, orDefault);
                }
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class l implements a {
            public static final l a = new l();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_MESSAGES;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashMap linkedHashMap = f400Var.d;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    Set S0 = j5g.S0((Set) entry.getValue());
                    MsgIdType msgIdType = MsgIdType.CNV_ID;
                    String str = gVar.a;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    ge20 ge20Var = new ge20(S0, msgIdType, false, str, Peer.a.b(longValue), w2wVar.Q0());
                    Collection<Msg> values = ((ge20.a) dcq.b((dcq) bz2.c(ge20Var, "MissedLoader.MessagesGetByIdApiCmd"), w2wVar, new ProfilesSimpleInfo(c400Var.a, c400Var.e, c400Var.b, c400Var.c, (Map) null, 16, (zcl) null), 4)).a.values();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Msg msg : values) {
                        Long valueOf = Long.valueOf(msg.c);
                        Object obj = linkedHashMap2.get(valueOf);
                        if (obj == null && !linkedHashMap2.containsKey(valueOf)) {
                            obj = new HashMap();
                        }
                        HashMap hashMap = (HashMap) obj;
                        hashMap.put(Integer.valueOf(msg.d), msg);
                        linkedHashMap2.put(valueOf, hashMap);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        long longValue2 = ((Number) entry2.getKey()).longValue();
                        Map map = (Map) entry2.getValue();
                        LinkedHashMap linkedHashMap3 = c400Var.h;
                        Long valueOf2 = Long.valueOf(longValue2);
                        Object obj2 = linkedHashMap3.get(valueOf2);
                        if (obj2 == null) {
                            obj2 = new HashMap();
                            linkedHashMap3.put(valueOf2, obj2);
                        }
                        ((Map) obj2).putAll(map);
                    }
                }
            }
        }

        /* compiled from: MissedLoader.kt */
        public static final class m implements a {
            public static final m a = new m();
            public static final LongPollHistoryReporter.Span b = LongPollHistoryReporter.Span.MISSED_USERS;

            @Override // xsna.os20.a
            public final LongPollHistoryReporter.Span a() {
                return b;
            }

            @Override // xsna.os20.a
            public final void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var) {
                LinkedHashSet linkedHashSet = f400Var.f;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.a(longValue, Peer.Type.USER));
                }
                c400Var.a.putAll((Map) bz2.c(new a1r0(arrayList, gVar.a, false), "MissedLoader.UsersGetByIdApiCmd"));
            }
        }

        LongPollHistoryReporter.Span a();

        void b(w2w w2wVar, g gVar, f400 f400Var, c400 c400Var);
    }

    public os20(w2w w2wVar, String str, String str2, LongPollHistoryReporter longPollHistoryReporter, mdz mdzVar) {
        this.a = w2wVar;
        this.b = str;
        this.c = str2;
        this.d = longPollHistoryReporter;
        this.e = mdzVar;
    }

    public final void a(f400 f400Var, c400 c400Var, a[] aVarArr, r6o0 r6o0Var) {
        f400 f400Var2 = new f400();
        f400Var2.a(f400Var);
        for (a aVar : aVarArr) {
            f400 f400Var3 = null;
            mdz<LongPollHistoryReporter.Span> mdzVar = this.e;
            mdz<LongPollHistoryReporter.Span> a2 = mdzVar != null ? mdzVar.a(aVar.a()) : null;
            w2w w2wVar = this.a;
            String str = this.c;
            String str2 = this.b;
            LongPollHistoryReporter longPollHistoryReporter = this.d;
            if (longPollHistoryReporter == null || a2 == null) {
                aVar.b(w2wVar, new a.g(str2, str), f400Var2, c400Var);
                if (r6o0Var != null) {
                    aox aoxVar = r6o0Var.a;
                    f400 f400Var4 = r6o0Var.b;
                    List list = r6o0Var.c;
                    LongPollReporter longPollReporter = r6o0Var.d;
                    aoxVar.b();
                    if (aVar.equals(a.f.a)) {
                        s6o0.b(list, aoxVar, longPollReporter, c400Var, f400Var4);
                        f400Var3 = f400Var4;
                    }
                    if (f400Var3 != null) {
                        f400Var2.a(f400Var3);
                    }
                }
            } else {
                longPollHistoryReporter.c(a2);
                aVar.b(w2wVar, new a.g(str2, str), f400Var2, c400Var);
                if (r6o0Var != null) {
                    aox aoxVar2 = r6o0Var.a;
                    f400 f400Var5 = r6o0Var.b;
                    List list2 = r6o0Var.c;
                    LongPollReporter longPollReporter2 = r6o0Var.d;
                    aoxVar2.b();
                    if (aVar.equals(a.f.a)) {
                        s6o0.b(list2, aoxVar2, longPollReporter2, c400Var, f400Var5);
                    } else {
                        f400Var5 = null;
                    }
                    if (f400Var5 != null) {
                        f400Var2.a(f400Var5);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                longPollHistoryReporter.f(a2, null);
            }
        }
    }
}
