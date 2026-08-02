package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.proto.ChatEventTypes;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import com.yandex.messaging.core.net.entities.proto.PrivateChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.message.ThreadState;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatIdKt;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import java.util.ArrayList;
import java.util.HashSet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class jdb {
    public final k020 a;
    public final at2 b;
    public final meb c;
    public final x8b d;
    public final v2b e;
    public final l6b f;
    public final uh10 g;
    public final m5b h;
    public final w6b i;
    public final dc1 j;
    public final bv21 k;
    public final v5b l;
    public final x2c0 m;
    public final tg90 n;
    public final avf0 o;
    public final nu21 p;
    public final wdb q;
    public final gzy0 r;
    public final z8b s;
    public final ph9 t;
    public final l7q0 u;
    public final bx6 v;
    public final String w;

    public jdb(k020 k020Var, at2 at2Var, meb mebVar, x8b x8bVar, v2b v2bVar, l6b l6bVar, uh10 uh10Var, m5b m5bVar, w6b w6bVar, dc1 dc1Var, bv21 bv21Var, v5b v5bVar, x2c0 x2c0Var, tg90 tg90Var, el21 el21Var, avf0 avf0Var, nu21 nu21Var, wdb wdbVar, gzy0 gzy0Var, z8b z8bVar, ph9 ph9Var, l7q0 l7q0Var, bx6 bx6Var) {
        this.a = k020Var;
        this.b = at2Var;
        this.c = mebVar;
        this.d = x8bVar;
        this.e = v2bVar;
        this.f = l6bVar;
        this.g = uh10Var;
        this.h = m5bVar;
        this.i = w6bVar;
        this.j = dc1Var;
        this.k = bv21Var;
        this.l = v5bVar;
        this.m = x2c0Var;
        this.n = tg90Var;
        this.o = avf0Var;
        this.p = nu21Var;
        this.q = wdbVar;
        this.r = gzy0Var;
        this.s = z8bVar;
        this.t = ph9Var;
        this.u = l7q0Var;
        this.v = bx6Var;
        this.w = el21Var.c();
    }

    public final long a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        int i = z2 ? (z ? 1 : 0) | 2 : z ? 1 : 0;
        k020 k020Var = this.a;
        String b = k020Var.b(str);
        if (b != null) {
            bv21 bv21Var = this.k;
            if (((Boolean) a.b(bv21Var.a, true, false, new il01(b, 26))).booleanValue()) {
                int i2 = i | 4;
                String b2 = k020Var.b(str);
                i = (b2 == null || !bv21Var.d(b2)) ? i2 : i | HProv.PP_CONTAINER_EXTENSION;
            }
        }
        if (ChatIdKt.a(ChatId.Companion.a(str))) {
            i |= 8;
        }
        if (z && j == 0) {
            i |= 16;
        }
        if (ChatNamespaces.b(str) && z3) {
            i |= 32;
        }
        if (z4) {
            i |= 256;
        }
        return i;
    }

    public final long b(ChatData chatData) {
        String chatId = chatData.getChatId();
        long version = chatData.getVersion();
        boolean isPrivate = chatData.isPrivate();
        Boolean isPublic = chatData.isPublic();
        Boolean bool = Boolean.TRUE;
        return a(version, chatId, isPrivate, jl40.l(isPublic, bool), jl40.l(chatData.getChannelPublicity(), bool), jl40.l(chatData.getFederative(), bool));
    }

    public final long c(ChatHistoryResponse chatHistoryResponse, long j) {
        Boolean bool;
        boolean z;
        Boolean bool2;
        boolean federative;
        String str = chatHistoryResponse.chatId;
        ChatInfoFromTransport chatInfoFromTransport = chatHistoryResponse.chatInfo;
        boolean z2 = false;
        boolean z3 = chatInfoFromTransport == null ? chatHistoryResponse.privateChatInfo != null : chatInfoFromTransport.isPrivate;
        if ((chatInfoFromTransport != null ? chatInfoFromTransport.inviteHash : null) != null) {
            bool = null;
            z = true;
        } else {
            bool = null;
            z = false;
        }
        if (chatInfoFromTransport != null && chatInfoFromTransport.channelPublicity) {
            z2 = true;
        }
        if (chatInfoFromTransport != null) {
            federative = chatInfoFromTransport.federative;
        } else {
            PrivateChatInfoFromTransport privateChatInfoFromTransport = chatHistoryResponse.privateChatInfo;
            if (privateChatInfoFromTransport == null) {
                bool2 = bool;
                return a(j, str, z3, z, z2, jl40.l(bool2, Boolean.TRUE));
            }
            federative = privateChatInfoFromTransport.getFederative();
        }
        bool2 = Boolean.valueOf(federative);
        return a(j, str, z3, z, z2, jl40.l(bool2, Boolean.TRUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(ChatData chatData, boolean z) {
        long j;
        Long l;
        String str;
        ph9 ph9Var;
        String str2;
        String a;
        Long l2;
        String[] members;
        long[] jArr;
        rnz rnzVar;
        rnz rnzVar2;
        ChatEventTypes supportedEvents;
        String[] admin;
        byte[] bArr;
        String str3;
        String a2;
        ChatId a3 = ChatId.Companion.a(chatData.getChatId());
        if (a3 instanceof ChatId.ThreadId) {
            int i = (((ChatId.ThreadId) a3).d > 0L ? 1 : (((ChatId.ThreadId) a3).d == 0L ? 0 : -1));
        }
        z83.i();
        UserData interlocutor = chatData.getInterlocutor();
        if (interlocutor != null) {
            this.p.e(interlocutor);
        }
        String chatId = chatData.getChatId();
        meb mebVar = this.c;
        RoomDatabase roomDatabase = mebVar.a;
        RoomDatabase roomDatabase2 = mebVar.a;
        b5a b5aVar = new b5a(chatId, 15);
        int i2 = 1;
        int i3 = 0;
        o2b o2bVar = (o2b) a.b(roomDatabase, true, false, b5aVar);
        if (o2bVar != null) {
            l = o2bVar.a;
            j = o2bVar.c;
        } else {
            j = -1;
            l = null;
        }
        if (j > chatData.getVersion() || (!z && j == chatData.getVersion())) {
            return l.longValue();
        }
        Metadata metadata = chatData.getMetadata();
        String name = chatData.getName();
        ChatId a4 = ChatId.Companion.a(chatData.getChatId());
        ChatId.GeneralChatId generalChatId = a4 instanceof ChatId.GeneralChatId ? (ChatId.GeneralChatId) a4 : null;
        if (generalChatId != null) {
            if (generalChatId.c != 1) {
                generalChatId = null;
            }
            if (generalChatId != null) {
                str = generalChatId.d;
                ph9Var = this.t;
                if (str != null && name != null) {
                    ((Number) a.b(this.k.a, false, true, new av21(name, str, i3))).intValue();
                    ph9Var.j(str);
                }
                bx6 bx6Var = this.v;
                k020 k020Var = this.a;
                if (l != null) {
                    long i0 = this.b.i0(chatData.getChatId());
                    String b = k020Var.b(chatData.getChatId());
                    String chatId2 = chatData.getChatId();
                    double createTimestamp = chatData.getCreateTimestamp();
                    if (chatData.isPrivate()) {
                        a2 = k020Var.b(chatData.getChatId());
                    } else if (ChatNamespaces.a(chatData.getChatId())) {
                        bx6Var.getClass();
                        a2 = bx6.a(chatData);
                    } else {
                        str3 = null;
                        String name2 = chatData.getName();
                        String avatarId = chatData.getAvatarId();
                        long version = chatData.getVersion();
                        long version2 = chatData.getVersion();
                        long b2 = b(chatData);
                        String inviteHash = chatData.getInviteHash();
                        String description = chatData.getDescription();
                        String alias = chatData.getAlias();
                        String currentProfileId = chatData.getCurrentProfileId();
                        Boolean isTransient = chatData.isTransient();
                        mebVar.i(new t2b(i0, chatId2, createTimestamp, b, name2, avatarId, null, -1L, 0L, b2, null, version, version2, inviteHash, description, alias, currentProfileId, isTransient == null ? isTransient.booleanValue() : false, 0L, null, null, null, null, str3, chatData.getHasGuests(), 6291456));
                        Long valueOf = Long.valueOf(i0);
                        if (ChatIdKt.a(ChatId.Companion.a(chatData.getChatId()))) {
                            a.b(roomDatabase2, false, true, new qo6(i0, chatData.getChatId(), i2));
                        }
                        ph9Var.b(i0);
                        l2 = valueOf;
                    }
                    str3 = a2;
                    String name22 = chatData.getName();
                    String avatarId2 = chatData.getAvatarId();
                    long version3 = chatData.getVersion();
                    long version22 = chatData.getVersion();
                    long b22 = b(chatData);
                    String inviteHash2 = chatData.getInviteHash();
                    String description2 = chatData.getDescription();
                    String alias2 = chatData.getAlias();
                    String currentProfileId2 = chatData.getCurrentProfileId();
                    Boolean isTransient2 = chatData.isTransient();
                    mebVar.i(new t2b(i0, chatId2, createTimestamp, b, name22, avatarId2, null, -1L, 0L, b22, null, version3, version22, inviteHash2, description2, alias2, currentProfileId2, isTransient2 == null ? isTransient2.booleanValue() : false, 0L, null, null, null, null, str3, chatData.getHasGuests(), 6291456));
                    Long valueOf2 = Long.valueOf(i0);
                    if (ChatIdKt.a(ChatId.Companion.a(chatData.getChatId()))) {
                    }
                    ph9Var.b(i0);
                    l2 = valueOf2;
                } else {
                    long longValue = l.longValue();
                    String name3 = chatData.getName();
                    String avatarId3 = chatData.getAvatarId();
                    long version4 = chatData.getVersion();
                    long version5 = chatData.getVersion();
                    String inviteHash3 = chatData.getInviteHash();
                    long b3 = b(chatData);
                    String description3 = chatData.getDescription();
                    String alias3 = chatData.getAlias();
                    String currentProfileId3 = chatData.getCurrentProfileId();
                    Boolean isTransient3 = chatData.isTransient();
                    boolean booleanValue = isTransient3 != null ? isTransient3.booleanValue() : false;
                    if (chatData.isPrivate()) {
                        a = k020Var.b(chatData.getChatId());
                    } else if (ChatNamespaces.a(chatData.getChatId())) {
                        bx6Var.getClass();
                        a = bx6.a(chatData);
                    } else {
                        str2 = null;
                        ((Number) a.b(roomDatabase2, false, true, new a7b(8, mebVar, new m2b(longValue, name3, avatarId3, version4, version5, inviteHash3, b3, description3, alias3, currentProfileId3, booleanValue, str2, chatData.getHasGuests())))).intValue();
                        l2 = l;
                    }
                    str2 = a;
                    ((Number) a.b(roomDatabase2, false, true, new a7b(8, mebVar, new m2b(longValue, name3, avatarId3, version4, version5, inviteHash3, b3, description3, alias3, currentProfileId3, booleanValue, str2, chatData.getHasGuests())))).intValue();
                    l2 = l;
                }
                long longValue2 = l2.longValue();
                n5b n5bVar = (n5b) this.h;
                o5b o5bVar = (o5b) a.b(n5bVar.a, true, false, new cs0(longValue2, 21));
                if (metadata == null) {
                    long longValue3 = l2.longValue();
                    Metadata.Chatbar chatbar = metadata.chatbar;
                    avf0 avf0Var = this.o;
                    byte[] encode = chatbar != null ? avf0Var.a.a(Metadata.Chatbar.class).encode(chatbar) : null;
                    Metadata.CallsSettings callsSettings = metadata.callsSettings;
                    byte[] encode2 = callsSettings != null ? avf0Var.a.a(Metadata.CallsSettings.class).encode(callsSettings) : null;
                    String[] strArr = metadata.complainAction;
                    if (strArr != null) {
                        bArr = avf0Var.b.adapter(String[].class).toJson(strArr).getBytes(uza.a);
                    } else {
                        avf0Var.getClass();
                        bArr = null;
                    }
                    o5b o5bVar2 = new o5b(longValue3, encode, encode2, bArr, metadata.miniappUrl, metadata.allowUnsafeMiniapp, Boolean.valueOf(metadata.viewImportantsList));
                    if (!jl40.l(o5bVar, o5bVar2)) {
                        ((Number) a.b(n5bVar.a, false, true, new cs8(26, n5bVar, o5bVar2))).longValue();
                        String chatId3 = chatData.getChatId();
                        HashSet hashSet = ph9Var.g;
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            ph9Var.g = hashSet;
                        }
                        hashSet.add(chatId3);
                        ph9Var.c.d(e9h0.payload_chat_metadata_changed, hashSet);
                    }
                } else if (o5bVar != null) {
                    ((Number) a.b(n5bVar.a, false, true, new cs0(l2.longValue(), 20))).intValue();
                    String chatId4 = chatData.getChatId();
                    HashSet hashSet2 = ph9Var.g;
                    if (hashSet2 == null) {
                        hashSet2 = new HashSet();
                        ph9Var.g = hashSet2;
                    }
                    hashSet2.add(chatId4);
                    ph9Var.c.d(e9h0.payload_chat_metadata_changed, hashSet2);
                }
                if (this.i.e(l2.longValue(), chatData.getOrganizationIds())) {
                    long longValue4 = l2.longValue();
                    HashSet hashSet3 = ph9Var.i;
                    if (hashSet3 == null) {
                        hashSet3 = new HashSet();
                        ph9Var.i = hashSet3;
                    }
                    hashSet3.add(Long.valueOf(longValue4));
                    ph9Var.c.d(e9h0.payload_chat_organizations_changed, hashSet3);
                }
                long longValue5 = l2.longValue();
                members = chatData.getMembers();
                if (members == null) {
                    ArrayList arrayList = new ArrayList(members.length);
                    for (String str4 : members) {
                        ChatData.Roles roles = chatData.getRoles();
                        arrayList.add(Long.valueOf((roles == null || (admin = roles.getAdmin()) == null) ? false : j73.y(admin, str4) ? 1L : 0L));
                    }
                    jArr = kotlin.collections.a.K0(arrayList);
                } else {
                    jArr = null;
                }
                this.g.d(longValue5, chatData.getMembers(), jArr);
                rnzVar = ph9Var.m;
                ikw0 ikw0Var = ph9Var.c;
                if (rnzVar == null) {
                    rnzVar = new rnz((Object) null);
                    ph9Var.m = rnzVar;
                    ikw0Var.d(e9h0.payload_members_changed, rnzVar);
                }
                rnzVar.h(longValue5, ph9Var);
                ChatData.Roles roles2 = chatData.getRoles();
                this.j.d(longValue5, roles2 == null ? roles2.getAdmin() : null);
                rnzVar2 = ph9Var.n;
                if (rnzVar2 == null) {
                    rnzVar2 = new rnz((Object) null);
                    ph9Var.n = rnzVar2;
                    ikw0Var.d(e9h0.payload_admins_changed, rnzVar2);
                }
                rnzVar2.h(longValue5, ph9Var);
                long longValue6 = l2.longValue();
                z8b z8bVar = this.s;
                z8bVar.getClass();
                String chatId5 = chatData.getChatId();
                String[] rights = chatData.getRights();
                String role = chatData.getRole();
                Long roleVersion = chatData.getRoleVersion();
                long longValue7 = roleVersion == null ? roleVersion.longValue() : 0L;
                s8b.c.getClass();
                z8bVar.c(chatId5, longValue6, wbz0.k(rights).b, ChatRole.a(role), longValue7, z);
                supportedEvents = chatData.getSupportedEvents();
                if (supportedEvents != null) {
                    h(l2.longValue(), supportedEvents, z);
                }
                ph9Var.a(l2.longValue());
                return l2.longValue();
            }
        }
        str = null;
        ph9Var = this.t;
        if (str != null) {
            ((Number) a.b(this.k.a, false, true, new av21(name, str, i3))).intValue();
            ph9Var.j(str);
        }
        bx6 bx6Var2 = this.v;
        k020 k020Var2 = this.a;
        if (l != null) {
        }
        long longValue22 = l2.longValue();
        n5b n5bVar2 = (n5b) this.h;
        o5b o5bVar3 = (o5b) a.b(n5bVar2.a, true, false, new cs0(longValue22, 21));
        if (metadata == null) {
        }
        if (this.i.e(l2.longValue(), chatData.getOrganizationIds())) {
        }
        long longValue52 = l2.longValue();
        members = chatData.getMembers();
        if (members == null) {
        }
        this.g.d(longValue52, chatData.getMembers(), jArr);
        rnzVar = ph9Var.m;
        ikw0 ikw0Var2 = ph9Var.c;
        if (rnzVar == null) {
        }
        rnzVar.h(longValue52, ph9Var);
        ChatData.Roles roles22 = chatData.getRoles();
        this.j.d(longValue52, roles22 == null ? roles22.getAdmin() : null);
        rnzVar2 = ph9Var.n;
        if (rnzVar2 == null) {
        }
        rnzVar2.h(longValue52, ph9Var);
        long longValue62 = l2.longValue();
        z8b z8bVar2 = this.s;
        z8bVar2.getClass();
        String chatId52 = chatData.getChatId();
        String[] rights2 = chatData.getRights();
        String role2 = chatData.getRole();
        Long roleVersion2 = chatData.getRoleVersion();
        if (roleVersion2 == null) {
        }
        s8b.c.getClass();
        z8bVar2.c(chatId52, longValue62, wbz0.k(rights2).b, ChatRole.a(role2), longValue7, z);
        supportedEvents = chatData.getSupportedEvents();
        if (supportedEvents != null) {
        }
        ph9Var.a(l2.longValue());
        return l2.longValue();
    }

    public final void e(final long j, final long j2, final long j3, Long l) {
        int intValue;
        meb mebVar = this.c;
        if (l == null) {
            intValue = ((Number) a.b(mebVar.a, false, true, new jeb(0, j2, j3, j))).intValue();
        } else {
            final long longValue = l.longValue();
            intValue = ((Number) a.b(mebVar.a, false, true, new tls() { // from class: keb
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    long j4 = j2;
                    long j5 = j3;
                    long j6 = longValue;
                    long j7 = j;
                    oll0 oll0Var = (oll0) obj;
                    ull0 T0 = oll0Var.T0("\n        UPDATE chats SET\n            seen_marker = ?,\n            owner_last_seen_sequence_number = ?,\n            owner_seen_marker_version = ?\n        WHERE chat_internal_id = ?\n            ");
                    try {
                        T0.b(1, j4);
                        T0.b(2, j5);
                        T0.b(3, j6);
                        T0.b(4, j7);
                        T0.q();
                        int x = jx81.x(oll0Var);
                        T0.close();
                        return Integer.valueOf(x);
                    } catch (Throwable th) {
                        T0.close();
                        throw th;
                    }
                }
            })).intValue();
        }
        z83.b(null, 1, Integer.valueOf(intValue));
        ph9 ph9Var = this.t;
        ph9Var.a(j);
        rnz rnzVar = ph9Var.l;
        if (rnzVar == null) {
            rnzVar = new rnz((Object) null);
            ph9Var.l = rnzVar;
            ph9Var.c.d(e9h0.payload_owner_seen_marker_changed, rnzVar);
        }
        if (rnzVar.c(j) == null) {
            rnzVar.h(j, new o390(ph9Var.t));
        }
    }

    public final void f(long j) {
        HashSet hashSet = this.t.q;
        if (hashSet != null) {
            hashSet.remove(Long.valueOf(j));
        }
        this.g.a(j, this.w);
        wdb wdbVar = this.q;
        wdbVar.a(j, wdbVar.b.Y().b(j));
        this.r.a(j);
    }

    public final long g(String str, String str2) {
        t2b t2bVar;
        meb mebVar;
        meb mebVar2 = this.c;
        Long c = mebVar2.c(str);
        if (c != null) {
            return c.longValue();
        }
        long i0 = this.b.i0(str);
        ChatId a = ChatId.Companion.a(str);
        if (!(a instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a).d < 0) {
            String b = this.a.b(str);
            boolean a2 = ChatIdKt.a(ChatId.Companion.a(str));
            long j = b != null ? 65L : 64L;
            if (ChatIdKt.a(ChatId.Companion.a(str))) {
                j |= 8;
            }
            t2bVar = new t2b(i0, str, 0.0d, b, str2, null, null, 0L, 0L, j, null, 0L, 0L, null, null, null, null, false, null, null, null, null, null, b, false, 23068672);
            mebVar = mebVar2;
            if (a2) {
                a.b(mebVar.a, false, true, new qo6(i0, str, 1));
            }
        } else {
            String str3 = new ChatId.ThreadId(str).c().a;
            Long c2 = mebVar2.c(str3);
            long longValue = c2 != null ? c2.longValue() : g(str3, str2);
            String str4 = null;
            t2b t2bVar2 = new t2b(i0, str, 0.0d, str4, null, null, null, 0L, 0L, 0L, null, 0L, 0L, null, null, null, null, false, null, Long.valueOf(longValue), Long.valueOf(new ChatId.ThreadId(str).d), null, null, str4, false, 23068672);
            this.s.a(i0, longValue, str);
            t2bVar = t2bVar2;
            mebVar = mebVar2;
        }
        mebVar.i(t2bVar);
        ph9 ph9Var = this.t;
        ph9Var.b(i0);
        ph9Var.a(i0);
        return i0;
    }

    public final void h(long j, ChatEventTypes chatEventTypes, boolean z) {
        Long l;
        v2b v2bVar = this.e;
        if (!z && (l = (Long) a.b(v2bVar.a, true, false, new cs0(j, 18))) != null) {
            if (chatEventTypes.getVersion() <= l.longValue()) {
                return;
            }
        }
        ((Number) a.b(v2bVar.a, false, true, new cs8(25, v2bVar, new w2b(j, chatEventTypes.getTypes(), chatEventTypes.getVersion())))).longValue();
    }

    public final void i(long j, String str, ThreadState threadState) {
        Long l;
        Long l2;
        Long l3;
        ChatId.ThreadId threadId = new ChatId.ThreadId(str);
        meb mebVar = this.c;
        t2b a = mebVar.a(str);
        Long valueOf = a != null ? Long.valueOf(a.a) : null;
        ph9 ph9Var = this.t;
        if (valueOf == null) {
            long i0 = this.b.i0(str);
            long lastSeenTimestamp = threadState.getLastSeenTimestamp();
            String str2 = null;
            long j2 = 0;
            double d = 0.0d;
            mebVar.i(new t2b(i0, str, d, str2, null, null, Long.valueOf(lastSeenTimestamp), threadState.getLastSeenSeqNo(), threadState.getLastSeenByMeVersion(), 0L, 0L, j2, j2, null, null, null, this.w, false, Long.valueOf(threadState.getHistoryStartTimestamp()), Long.valueOf(j), Long.valueOf(threadId.d), Long.valueOf(threadState.getLastTimestamp()), Long.valueOf(threadState.getLastSeqNo()), str2, false, 16777216));
            ph9Var.b(i0);
            this.s.a(i0, j, str);
            return;
        }
        long longValue = valueOf.longValue();
        long lastSeenTimestamp2 = threadState.getLastSeenTimestamp();
        long longValue2 = (a == null || (l3 = a.g) == null) ? 0L : l3.longValue();
        if (lastSeenTimestamp2 >= longValue2) {
            longValue2 = lastSeenTimestamp2;
        }
        long lastSeenSeqNo = threadState.getLastSeenSeqNo();
        long j3 = a != null ? a.h : 0L;
        if (lastSeenSeqNo < j3) {
            lastSeenSeqNo = j3;
        }
        long lastSeenByMeVersion = threadState.getLastSeenByMeVersion();
        long j4 = lastSeenSeqNo;
        long j5 = a != null ? a.i : 0L;
        long j6 = lastSeenByMeVersion < j5 ? j5 : lastSeenByMeVersion;
        long lastTimestamp = threadState.getLastTimestamp();
        long longValue3 = (a == null || (l2 = a.v) == null) ? 0L : l2.longValue();
        long j7 = lastTimestamp < longValue3 ? longValue3 : lastTimestamp;
        long lastSeqNo = threadState.getLastSeqNo();
        long longValue4 = (a == null || (l = a.w) == null) ? 0L : l.longValue();
        ((Number) a.b(mebVar.a, false, true, new a7b(10, mebVar, new r2b(longValue, longValue2, j4, j6, j7, lastSeqNo < longValue4 ? longValue4 : lastSeqNo, threadState.getHistoryStartTimestamp())))).intValue();
        ph9Var.a(valueOf.longValue());
    }
}
