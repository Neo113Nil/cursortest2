package defpackage;

import android.content.Context;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import com.squareup.moshi.JsonAdapter;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.core.net.entities.AccountType;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.ChatMember;
import com.yandex.messaging.core.net.entities.ChatMuteData;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.yandex.messaging.core.net.entities.MiniappsBucket;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import com.yandex.messaging.core.net.entities.PinnedChatsBucket;
import com.yandex.messaging.core.net.entities.PreferencesBucket;
import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.UserStatusPresetBucket;
import com.yandex.messaging.core.net.entities.UserStatusPresetData;
import com.yandex.messaging.core.net.entities.proto.BackendRegistrationStatus;
import com.yandex.messaging.core.net.entities.proto.ChatEventTypes;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import com.yandex.messaging.core.net.entities.proto.OrganizationProto;
import com.yandex.messaging.core.net.entities.proto.PrivateChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.WhoamiUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.AccountTypeProto;
import com.yandex.messaging.core.net.entities.proto.message.CustomFromUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.RobotInfo;
import com.yandex.messaging.core.net.entities.proto.message.ThreadState;
import com.yandex.messaging.core.net.entities.proto.message.UpdateFields;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatIdKt;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageTranslation;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.ReducedMessage;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import defpackage.iaz0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import kotlin.collections.builders.SetBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class l020 implements Closeable {
    public final z8b A;
    public final jdb B;
    public final nu21 C;
    public final ndz0 D;
    public final ghf0 E;
    public final qxr F;
    public final fyj0 G;
    public final meb H;
    public final ueb I;
    public final qzy0 J;
    public final xu10 K;
    public final c421 L;
    public final y7b0 M;
    public final k020 a;
    public final wdb b;
    public final gzy0 c;
    public final lqo w;
    public final jdj x;
    public final ikw0 y;
    public final ph9 z;

    public l020(k020 k020Var, at2 at2Var, wdb wdbVar, gzy0 gzy0Var, lqo lqoVar, jdj jdjVar, ikw0 ikw0Var, ph9 ph9Var, z8b z8bVar, jdb jdbVar, nu21 nu21Var, ndz0 ndz0Var, ghf0 ghf0Var, qxr qxrVar, fyj0 fyj0Var) {
        this.a = k020Var;
        this.b = wdbVar;
        this.c = gzy0Var;
        this.w = lqoVar;
        this.x = jdjVar;
        this.y = ikw0Var;
        this.z = ph9Var;
        this.A = z8bVar;
        this.B = jdbVar;
        this.C = nu21Var;
        this.D = ndz0Var;
        this.E = ghf0Var;
        this.F = qxrVar;
        this.G = fyj0Var;
        this.H = at2Var.Y();
        this.I = at2Var.c();
        this.J = at2Var.d0();
        this.L = at2Var.J();
        this.M = at2Var.k0();
        this.K = at2Var.p0();
        at2Var.o();
    }

    public final void A0(long j, long j2, ReducedMessage reducedMessage) {
        ndz0 ndz0Var = this.D;
        ndz0Var.getClass();
        z83.h(null, j2 > 0);
        yab i = alb1.i(ndz0Var.c, ndz0Var.h, j, j2);
        try {
            if (!i.moveToFirst()) {
                i.close();
                return;
            }
            long G = i.G();
            ((Number) a.b(ndz0Var.d.a, false, true, new jeb(2, reducedMessage.c, reducedMessage.d, G))).intValue();
            az10 az10Var = ndz0Var.c;
            az10Var.d0(G, reducedMessage.c, reducedMessage.d);
            ndz0Var.k.h(j, new jaz0(az10Var.l(j, G)));
            i.close();
        } finally {
        }
    }

    public final void B(String str, boolean z) {
        ghf0 ghf0Var = this.E;
        a8b a8bVar = ghf0Var.k;
        if (a8bVar.b(str) != z) {
            a8bVar.a(str, z);
            ph9 ph9Var = ghf0Var.s;
            if (ph9Var.v == null) {
                ph9Var.v = new HashSet();
            }
            ph9Var.v.add(str);
            ph9Var.c.d(e9h0.payload_chat_spam_marker, ph9Var.v);
        }
    }

    public final void D(HiddenPrivateChatsBucket hiddenPrivateChatsBucket) {
        ghf0 ghf0Var = this.E;
        String str = ghf0Var.u;
        HiddenPrivateChatsBucket hiddenPrivateChatsBucket2 = new HiddenPrivateChatsBucket();
        wgu wguVar = ghf0Var.j;
        hiddenPrivateChatsBucket2.bucketValue = wguVar.c();
        ro6 ro6Var = ghf0Var.g;
        hiddenPrivateChatsBucket2.version = ro6Var.a("local_hidden_private_chats");
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Long> entry : hiddenPrivateChatsBucket2.bucketValue.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            Long l = hiddenPrivateChatsBucket.bucketValue.get(key);
            if (l == null || !l.equals(value)) {
                hashSet.add(new ChatId.PrivateChatId(str, key).a);
            }
        }
        for (Map.Entry<String, Long> entry2 : hiddenPrivateChatsBucket.bucketValue.entrySet()) {
            String key2 = entry2.getKey();
            Long value2 = entry2.getValue();
            Long l2 = hiddenPrivateChatsBucket2.bucketValue.get(key2);
            if (l2 == null || !l2.equals(value2)) {
                hashSet.add(new ChatId.PrivateChatId(str, key2).a);
            }
        }
        Map<String, Long> map = hiddenPrivateChatsBucket.bucketValue;
        wguVar.a();
        Set<Map.Entry<String, Long>> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            arrayList.add(new ygu((String) entry3.getKey(), ((Number) entry3.getValue()).longValue()));
        }
        wguVar.e(arrayList);
        ro6Var.b(hiddenPrivateChatsBucket.version, "local_hidden_private_chats");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ghf0Var.s.f((String) it2.next());
        }
    }

    public final void D0(UserData userData) {
        nu21 nu21Var = this.C;
        nu21Var.getClass();
        UserData.RobotInfo robotInfo = userData.robotInfo;
        nu21Var.c(userData.userId, userData.displayName, userData.version, userData.avatarId, userData.phoneId, userData.contacts, userData.isRobot, robotInfo != null && robotInfo.cannotBeBlocked, robotInfo != null && robotInfo.isSupport, robotInfo != null && robotInfo.disablePrivates, userData.isDisplayRestricted, userData.website, userData.metadata, userData.employeesInfo, userData.accountDeleted, null);
    }

    public final void F0(WhoamiUserInfo whoamiUserInfo) {
        nu21 nu21Var = this.C;
        nu21Var.getClass();
        String str = whoamiUserInfo.displayName;
        if (str != null) {
            nu21.d(nu21Var, new ReducedUserInfo(whoamiUserInfo.avatarId, str, whoamiUserInfo.userId, whoamiUserInfo.phoneId, whoamiUserInfo.version, whoamiUserInfo.nickname, whoamiUserInfo.isRobot, Boolean.valueOf(whoamiUserInfo.isDisplayRestricted), whoamiUserInfo.robotInfo, null, false, null, HProv.ALG_TYPE_GR3410, null), whoamiUserInfo.getEmployeeInfos(), null, 4);
        }
    }

    public final void G(String str, long j, boolean z) {
        this.K.b(str, j, z);
        Long l = (Long) a.b(this.I.a, true, false, new b5a(str, 23));
        if (l != null) {
            long longValue = l.longValue();
            ndz0 ndz0Var = this.D;
            Boolean bool = (Boolean) skb1.a(alb1.i(ndz0Var.c, ndz0Var.h, longValue, j), new hc2(z, ndz0Var, longValue));
            if (bool != null ? bool.booleanValue() : false) {
                this.z.a(longValue);
            }
        }
    }

    public final void H0(RestrictionsBucket restrictionsBucket) {
        int i;
        fyj0 fyj0Var = this.G;
        fyj0Var.getClass();
        String[] strArr = restrictionsBucket.value.blacklist;
        uxj0 uxj0Var = fyj0Var.a;
        HashSet hashSet = new HashSet(uxj0Var.b());
        HashSet hashSet2 = new HashSet();
        if (strArr != null) {
            hashSet2.addAll(Arrays.asList(strArr));
        }
        hashSet2.removeAll(hashSet);
        HashSet hashSet3 = new HashSet(hashSet);
        if (strArr != null) {
            hashSet3.removeAll(Arrays.asList(strArr));
        }
        RestrictionsBucket.Value value = restrictionsBucket.value;
        uxj0Var.a();
        String[] strArr2 = value.blacklist;
        if (strArr2 != null) {
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                arrayList.add(new xxj0(str));
            }
            uxj0Var.d(arrayList);
        }
        fyj0Var.b.b(restrictionsBucket.version, "restrictions");
        wdb wdbVar = fyj0Var.d;
        ueb uebVar = fyj0Var.c;
        ph9 ph9Var = fyj0Var.e;
        Iterator it = hashSet2.iterator();
        while (true) {
            i = 22;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            Long l = (Long) a.b(uebVar.a, true, false, new b5a(str2, i));
            if (l != null) {
                long longValue = l.longValue();
                wdbVar.a(longValue, wdbVar.b.Y().b(longValue));
                ph9Var.a(l.longValue());
            }
            ((Number) a.b(fyj0Var.f.a, false, true, new il01(str2, 29))).intValue();
            fyj0Var.g.b(str2);
            HashSet hashSet4 = ph9Var.x;
            if (hashSet4 == null) {
                hashSet4 = new HashSet();
                ph9Var.x = hashSet4;
                ph9Var.c.d(e9h0.payload_restrictions_changed, hashSet4);
            }
            hashSet4.add(str2);
        }
        Iterator it2 = hashSet3.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            Long l2 = (Long) a.b(uebVar.a, true, false, new b5a(str3, i));
            if (l2 != null) {
                long longValue2 = l2.longValue();
                String str4 = (String) a.b(wdbVar.b.Y().a, true, false, new hcb(longValue2, 20));
                if (str4 == null || !wdbVar.b.C().e(str4)) {
                    wdbVar.b(longValue2);
                }
                ph9Var.a(l2.longValue());
            }
            in21 a = fyj0Var.h.a(str3);
            if (a != null) {
                nu21 nu21Var = fyj0Var.i;
                String str5 = a.m;
                if (a.h) {
                    nu21Var.getClass();
                } else if (!jl40.l(nu21Var.q, a.c) && str5 != null) {
                    nu21Var.f(0, a.c, a.a, str5, a.d);
                }
            }
            HashSet hashSet5 = ph9Var.x;
            if (hashSet5 == null) {
                hashSet5 = new HashSet();
                ph9Var.x = hashSet5;
                ph9Var.c.d(e9h0.payload_restrictions_changed, hashSet5);
            }
            hashSet5.add(str3);
        }
    }

    public final void I(ChatData chatData) {
        this.B.d(chatData, false);
    }

    public final void L0(long j, long j2, long j3, long j4) {
        jdb jdbVar = this.B;
        q2b e = jdbVar.c.e(j);
        l7q0 l7q0Var = jdbVar.u;
        l7q0Var.getClass();
        Long l = e.a;
        if (l != null) {
            long longValue = l.longValue();
            long j5 = e.b;
            if (l7q0Var.a.a(tz10.G)) {
                boolean z = false;
                boolean z2 = j4 > j5;
                if (j4 == j5 && j2 > longValue) {
                    z = true;
                }
                if (!z2 && !z) {
                    return;
                }
            } else if (j2 <= longValue) {
                return;
            }
        }
        jdbVar.e(j, j2, j3, Long.valueOf(j4));
    }

    public final void O0(long j, long j2, long j3) {
        jdb jdbVar = this.B;
        Long d = jdbVar.c.d(j);
        if (d == null || d.longValue() < j2) {
            jdbVar.e(j, j2, j3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(ChatHistoryResponse chatHistoryResponse, boolean z) {
        long version;
        long j;
        Long l;
        boolean z2;
        boolean hasGuests;
        long[] organizationIds;
        boolean z3;
        long[] jArr;
        boolean z4;
        boolean z5;
        boolean hasGuests2;
        jdb jdbVar = this.B;
        ph9 ph9Var = jdbVar.t;
        meb mebVar = jdbVar.c;
        ChatId a = ChatId.Companion.a(chatHistoryResponse.chatId);
        if ((a instanceof ChatId.ThreadId) && ((ChatId.ThreadId) a).d >= 0) {
            z83.i();
            return;
        }
        ChatInfoFromTransport chatInfoFromTransport = chatHistoryResponse.chatInfo;
        if (chatInfoFromTransport != null) {
            version = chatInfoFromTransport.version;
        } else {
            PrivateChatInfoFromTransport privateChatInfoFromTransport = chatHistoryResponse.privateChatInfo;
            if (privateChatInfoFromTransport == null) {
                return;
            } else {
                version = privateChatInfoFromTransport.getVersion();
            }
        }
        String str = chatHistoryResponse.chatId;
        RoomDatabase roomDatabase = mebVar.a;
        RoomDatabase roomDatabase2 = mebVar.a;
        b5a b5aVar = new b5a(str, 15);
        int i = 1;
        o2b o2bVar = (o2b) a.b(roomDatabase, true, false, b5aVar);
        if (o2bVar != null) {
            Long l2 = o2bVar.a;
            j = o2bVar.b;
            l = l2;
        } else {
            j = -1;
            l = null;
        }
        if (j <= version) {
            if (z || j != version) {
                if (l == null) {
                    long i0 = jdbVar.b.i0(chatHistoryResponse.chatId);
                    String b = jdbVar.a.b(chatHistoryResponse.chatId);
                    String str2 = chatHistoryResponse.chatId;
                    ReducedUserInfo reducedUserInfo = chatHistoryResponse.partnerInfo;
                    String str3 = reducedUserInfo != null ? reducedUserInfo.userId : null;
                    ChatInfoFromTransport chatInfoFromTransport2 = chatHistoryResponse.chatInfo;
                    String str4 = chatInfoFromTransport2 != null ? chatInfoFromTransport2.name : null;
                    String str5 = chatInfoFromTransport2 != null ? chatInfoFromTransport2.avatarUrl : null;
                    long c = jdbVar.c(chatHistoryResponse, version);
                    ChatInfoFromTransport chatInfoFromTransport3 = chatHistoryResponse.chatInfo;
                    String str6 = chatInfoFromTransport3 != null ? chatInfoFromTransport3.inviteHash : null;
                    String str7 = chatInfoFromTransport3 != null ? chatInfoFromTransport3.description : null;
                    String str8 = chatInfoFromTransport3 != null ? chatInfoFromTransport3.alias : null;
                    ChatRole chatRole = chatHistoryResponse.myRole;
                    String str9 = chatRole != null ? chatRole.profileId : null;
                    boolean z6 = chatRole != null ? chatRole.isTransient : false;
                    if (chatInfoFromTransport3 != null) {
                        hasGuests2 = chatInfoFromTransport3.hasGuests;
                    } else {
                        PrivateChatInfoFromTransport privateChatInfoFromTransport2 = chatHistoryResponse.privateChatInfo;
                        if (privateChatInfoFromTransport2 != null) {
                            hasGuests2 = privateChatInfoFromTransport2.getHasGuests();
                        } else {
                            z4 = false;
                            z5 = false;
                            mebVar.i(new t2b(i0, str2, 0.0d, b, str4, str5, null, -1L, 0L, c, null, version, 0L, str6, str7, str8, str9, z6, 0L, null, null, null, null, str3, z5, 6291456));
                            l = Long.valueOf(i0);
                            if (ChatIdKt.a(ChatId.Companion.a(chatHistoryResponse.chatId))) {
                                a.b(roomDatabase2, z4, true, new qo6(i0, chatHistoryResponse.chatId, i));
                            }
                            ph9Var.b(i0);
                        }
                    }
                    z5 = hasGuests2;
                    z4 = false;
                    mebVar.i(new t2b(i0, str2, 0.0d, b, str4, str5, null, -1L, 0L, c, null, version, 0L, str6, str7, str8, str9, z6, 0L, null, null, null, null, str3, z5, 6291456));
                    l = Long.valueOf(i0);
                    if (ChatIdKt.a(ChatId.Companion.a(chatHistoryResponse.chatId))) {
                    }
                    ph9Var.b(i0);
                } else {
                    long longValue = l.longValue();
                    ChatInfoFromTransport chatInfoFromTransport4 = chatHistoryResponse.chatInfo;
                    String str10 = chatInfoFromTransport4 != null ? chatInfoFromTransport4.name : null;
                    String str11 = chatInfoFromTransport4 != null ? chatInfoFromTransport4.avatarUrl : null;
                    long c2 = jdbVar.c(chatHistoryResponse, version);
                    ChatInfoFromTransport chatInfoFromTransport5 = chatHistoryResponse.chatInfo;
                    String str12 = chatInfoFromTransport5 != null ? chatInfoFromTransport5.inviteHash : null;
                    String str13 = chatInfoFromTransport5 != null ? chatInfoFromTransport5.description : null;
                    String str14 = chatInfoFromTransport5 != null ? chatInfoFromTransport5.alias : null;
                    ChatRole chatRole2 = chatHistoryResponse.myRole;
                    String str15 = chatRole2 != null ? chatRole2.profileId : null;
                    boolean z7 = chatRole2 != null ? chatRole2.isTransient : false;
                    ReducedUserInfo reducedUserInfo2 = chatHistoryResponse.partnerInfo;
                    String str16 = reducedUserInfo2 != null ? reducedUserInfo2.userId : null;
                    if (chatInfoFromTransport5 != null) {
                        hasGuests = chatInfoFromTransport5.hasGuests;
                    } else {
                        PrivateChatInfoFromTransport privateChatInfoFromTransport3 = chatHistoryResponse.privateChatInfo;
                        if (privateChatInfoFromTransport3 != null) {
                            hasGuests = privateChatInfoFromTransport3.getHasGuests();
                        } else {
                            z2 = false;
                            ((Number) a.b(roomDatabase2, false, true, new a7b(8, mebVar, new m2b(longValue, str10, str11, version, 0L, str12, c2, str13, str14, str15, z7, str16, z2)))).intValue();
                        }
                    }
                    z2 = hasGuests;
                    ((Number) a.b(roomDatabase2, false, true, new a7b(8, mebVar, new m2b(longValue, str10, str11, version, 0L, str12, c2, str13, str14, str15, z7, str16, z2)))).intValue();
                }
                Long l3 = l;
                w6b w6bVar = jdbVar.i;
                long longValue2 = l3.longValue();
                ChatInfoFromTransport chatInfoFromTransport6 = chatHistoryResponse.chatInfo;
                if (chatInfoFromTransport6 == null || (jArr = chatInfoFromTransport6.organizationIds) == null) {
                    PrivateChatInfoFromTransport privateChatInfoFromTransport4 = chatHistoryResponse.privateChatInfo;
                    organizationIds = privateChatInfoFromTransport4 != null ? privateChatInfoFromTransport4.getOrganizationIds() : null;
                } else {
                    organizationIds = jArr;
                }
                if (w6bVar.e(longValue2, organizationIds)) {
                    long longValue3 = l3.longValue();
                    HashSet hashSet = ph9Var.i;
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        ph9Var.i = hashSet;
                    }
                    hashSet.add(Long.valueOf(longValue3));
                    ph9Var.c.d(e9h0.payload_chat_organizations_changed, hashSet);
                }
                z8b z8bVar = jdbVar.s;
                long longValue4 = l3.longValue();
                ChatRole chatRole3 = chatHistoryResponse.myRole;
                if (chatRole3 == null) {
                    z8bVar.getClass();
                    z3 = z;
                } else {
                    z3 = z;
                    z8bVar.c(chatHistoryResponse.chatId, longValue4, chatRole3.rights, chatRole3.role, chatRole3.version, z3);
                }
                ChatEventTypes chatEventTypes = chatHistoryResponse.supportedEvents;
                if (chatEventTypes != null) {
                    jdbVar.h(l3.longValue(), chatEventTypes, z3);
                }
                ph9Var.a(l3.longValue());
            }
        }
    }

    public final void P0(UserData userData) {
        this.C.e(userData);
    }

    public final void Q0(ReducedUserInfo reducedUserInfo, int i) {
        nu21 nu21Var = this.C;
        nu21Var.getClass();
        String d = nu21.d(nu21Var, reducedUserInfo, null, null, 6);
        Boolean bool = reducedUserInfo.isRobot;
        Boolean bool2 = Boolean.TRUE;
        boolean l = jl40.l(bool, bool2);
        boolean l2 = jl40.l(nu21Var.q, reducedUserInfo.userId);
        String str = reducedUserInfo.displayName;
        if (l || l2 || d == null || str == null) {
            return;
        }
        boolean l3 = jl40.l(reducedUserInfo.isDisplayRestricted, bool2);
        Context context = nu21Var.a;
        if (l3) {
            str = context.getResources().getString(oyh0.empty_user_placeholder);
        }
        nu21Var.f(i, reducedUserInfo.userId, d, str, reducedUserInfo.nickname);
    }

    public final void R(String str, ChatMember chatMember) {
        z8b z8bVar = this.A;
        Long c = z8bVar.a.c(str);
        if (c != null) {
            long longValue = c.longValue();
            wbz0 wbz0Var = s8b.c;
            String[] strArr = chatMember.rights;
            wbz0Var.getClass();
            z8bVar.c(str, longValue, wbz0.k(strArr).b, ChatRole.a(chatMember.role), chatMember.version, false);
        }
    }

    public final void T(ChatMutingsBucket chatMutingsBucket) {
        Long l;
        jdb jdbVar = this.B;
        jdbVar.getClass();
        for (Map.Entry<String, ChatMuteData> entry : chatMutingsBucket.bucketValue.entrySet()) {
            String key = entry.getKey();
            ChatMuteData value = entry.getValue();
            x5b b = jdbVar.b.m().b(key);
            long longValue = (b == null || (l = b.d) == null) ? 0L : l.longValue();
            long j = chatMutingsBucket.version;
            if (longValue < j) {
                v5b v5bVar = jdbVar.l;
                boolean z = value.mute;
                boolean z2 = value.muteMentions;
                Long valueOf = Long.valueOf(j);
                v5bVar.a(key);
                z83.e(Long.valueOf(v5bVar.d(key, z, z2, valueOf)));
                jdbVar.t.f(key);
            }
        }
    }

    public final void U(Set set) {
        String str;
        int i;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            nu21 nu21Var = this.C;
            bv21 bv21Var = nu21Var.c;
            int i2 = 1;
            yl21 yl21Var = (yl21) a.b(bv21Var.a, true, false, new il01(str2, 19));
            if (yl21Var != null) {
                String str3 = yl21Var.a;
                aae a = ((com.yandex.messaging.internal.storage.contacts.a) nu21Var.l.get()).a(str2);
                String str4 = a != null ? a.d : null;
                if (jl40.l(nu21Var.q, str3) || str4 == null || str4.length() == 0) {
                    str4 = yl21Var.b;
                }
                ((Number) a.b(bv21Var.a, false, true, new av21(str4, str3, i2))).intValue();
                String str5 = yl21Var.a;
                String str6 = yl21Var.b;
                String str7 = yl21Var.c;
                if (a == null) {
                    str = str7;
                    i = 2;
                } else {
                    str = str7;
                    i = 1;
                }
                nu21Var.f(i, str5, str4, str6, str);
                nu21Var.o.j(str3);
            }
        }
    }

    public final void W(UserStatusPresetBucket userStatusPresetBucket) {
        ghf0 ghf0Var = this.E;
        dlf dlfVar = ghf0Var.t;
        nmf nmfVar = ghf0Var.n;
        ro6 ro6Var = ghf0Var.g;
        long a = ro6Var.a("custom_user_statuses");
        if (userStatusPresetBucket.version <= a) {
            dlfVar.getClass();
            return;
        }
        omf[] omfVarArr = (omf[]) a.b(nmfVar.a, true, false, new a5f(13));
        RoomDatabase roomDatabase = nmfVar.a;
        boolean equals = Arrays.equals(userStatusPresetBucket.value.statuses, omfVarArr);
        long j = userStatusPresetBucket.version;
        if (equals) {
            if (a < j) {
                ro6Var.b(j, "custom_user_statuses");
                return;
            }
            return;
        }
        ro6Var.b(j, "custom_user_statuses");
        ((Number) a.b(roomDatabase, false, true, new a5f(14))).intValue();
        UserStatusPresetData[] userStatusPresetDataArr = userStatusPresetBucket.value.statuses;
        ArrayList arrayList = new ArrayList(userStatusPresetDataArr.length);
        for (UserStatusPresetData userStatusPresetData : userStatusPresetDataArr) {
            String emoji = userStatusPresetData.getEmoji();
            String text = userStatusPresetData.getText();
            String iconName = userStatusPresetData.getIconName();
            StatusAvailability findByType = StatusAvailability.INSTANCE.findByType(userStatusPresetData.getAvailability());
            if (findByType == null) {
                findByType = StatusAvailability.Default;
            }
            arrayList.add(new omf(0L, text, emoji, findByType.getType(), userStatusPresetData.getNotificationMode() != 0 ? 1 : 0, iconName));
        }
        List A0 = kotlin.collections.a.A0(arrayList, 5);
        dlfVar.getClass();
        kotlin.collections.a.X(A0, null, null, null, new a5f(11), 31);
        a.b(roomDatabase, false, true, new dke(5, nmfVar, A0));
        ghf0Var.s.c.d(e9h0.payload_custom_user_statuses_changed, Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public final void Z(FoldersBucket foldersBucket) {
        ?? r9;
        boolean z;
        LinkedHashMap linkedHashMap;
        Iterator<Map.Entry<Long, FoldersBucket.OrganizationFoldersData>> it;
        Map f;
        Map<Long, FoldersBucket.OrganizationFoldersData> map;
        HashSet hashSet;
        ArrayList arrayList;
        List<FoldersBucket.FolderData> list;
        qxr qxrVar = this.F;
        gwr gwrVar = qxrVar.b;
        ro6 ro6Var = qxrVar.a;
        if (foldersBucket.version <= ro6Var.a("folders")) {
            return;
        }
        RoomDatabase roomDatabase = gwrVar.a;
        RoomDatabase roomDatabase2 = gwrVar.a;
        int i = 1;
        Map map2 = (Map) a.b(roomDatabase, true, false, new dwr(gwrVar, 0));
        ArrayList arrayList2 = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            arrayList2.add(new ywr((hwr) entry.getKey(), kotlin.collections.a.H0((List) entry.getValue())));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Long valueOf = Long.valueOf(((ywr) next).a.c);
            Object obj = linkedHashMap2.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        List list2 = (List) a.b(roomDatabase2, true, false, new dwr(gwrVar, i));
        int i2 = 10;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
        for (Object obj2 : list2) {
            linkedHashMap3.put(Long.valueOf(((x400) obj2).a), obj2);
        }
        Set g = v4r0.g(linkedHashMap3.keySet(), foldersBucket.orgFolders.keySet());
        Map<Long, FoldersBucket.OrganizationFoldersData> map3 = foldersBucket.orgFolders;
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<Long, FoldersBucket.OrganizationFoldersData> entry2 : map3.entrySet()) {
            long longValue = entry2.getKey().longValue();
            List<String> list3 = entry2.getValue().mainFolder.excludedFolderIds;
            x400 x400Var = new x400(list3 != null ? kotlin.collections.a.N0(list3) : EmptySet.a, longValue);
            if (x400Var.equals(linkedHashMap3.get(Long.valueOf(longValue)))) {
                x400Var = null;
            }
            if (x400Var != null) {
                arrayList3.add(x400Var);
            }
        }
        HashSet H0 = kotlin.collections.a.H0(arrayList3);
        Map<Long, FoldersBucket.OrganizationFoldersData> map4 = foldersBucket.orgFolders;
        HashSet hashSet2 = new HashSet();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            long longValue2 = ((Number) entry3.getKey()).longValue();
            List list4 = (List) entry3.getValue();
            FoldersBucket.OrganizationFoldersData organizationFoldersData = map4.get(Long.valueOf(longValue2));
            if (organizationFoldersData == null || (list = organizationFoldersData.customFolders) == null) {
                map = map4;
                hashSet = null;
            } else {
                List<FoldersBucket.FolderData> list5 = list;
                map = map4;
                ArrayList arrayList4 = new ArrayList(tcc.n(list5, i2));
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((FoldersBucket.FolderData) it3.next()).id);
                }
                hashSet = kotlin.collections.a.H0(arrayList4);
            }
            if (hashSet == null) {
                List list6 = list4;
                arrayList = new ArrayList(tcc.n(list6, i2));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((ywr) it4.next()).c);
                }
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list4) {
                    if (!hashSet.contains(((ywr) obj3).a.a)) {
                        arrayList5.add(obj3);
                    }
                }
                arrayList = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    arrayList.add(((ywr) it5.next()).c);
                }
            }
            ycc.r(arrayList, hashSet2);
            map4 = map;
            i2 = 10;
        }
        Map<Long, FoldersBucket.OrganizationFoldersData> map5 = foldersBucket.orgFolders;
        SetBuilder setBuilder = new SetBuilder();
        Iterator<Map.Entry<Long, FoldersBucket.OrganizationFoldersData>> it6 = map5.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry<Long, FoldersBucket.OrganizationFoldersData> next2 = it6.next();
            long longValue3 = next2.getKey().longValue();
            List<FoldersBucket.FolderData> list7 = next2.getValue().customFolders;
            EmptyList emptyList = EmptyList.a;
            if (list7 == null) {
                list7 = emptyList;
            }
            List list8 = (List) linkedHashMap2.get(Long.valueOf(longValue3));
            if (list8 != null) {
                List list9 = list8;
                int d2 = gw00.d(tcc.n(list9, 10));
                linkedHashMap = linkedHashMap2;
                if (d2 < 16) {
                    d2 = 16;
                }
                f = new LinkedHashMap(d2);
                for (Object obj4 : list9) {
                    f.put(((ywr) obj4).a.a, obj4);
                    it6 = it6;
                }
                it = it6;
            } else {
                linkedHashMap = linkedHashMap2;
                it = it6;
                f = b.f();
            }
            List<FoldersBucket.FolderData> list10 = list7;
            ArrayList arrayList6 = new ArrayList(tcc.n(list10, 10));
            Iterator it7 = list10.iterator();
            int i3 = 0;
            while (it7.hasNext()) {
                Object next3 = it7.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                FoldersBucket.FolderData folderData = (FoldersBucket.FolderData) next3;
                Iterator it8 = it7;
                String str = folderData.id;
                String str2 = folderData.name;
                FoldersBucket.FolderIcon folderIcon = folderData.icon;
                int i5 = folderIcon != null ? folderIcon.value : 0;
                List<String> list11 = folderData.includedChatIds;
                if (list11 == null) {
                    list11 = emptyList;
                }
                Set N0 = kotlin.collections.a.N0(list11);
                List<String> list12 = folderData.excludedChatIds;
                if (list12 == null) {
                    list12 = emptyList;
                }
                long j = longValue3;
                hwr hwrVar = new hwr(str, str2, j, i3, i5, N0, kotlin.collections.a.N0(list12));
                EmptyList emptyList2 = emptyList;
                longValue3 = j;
                SetBuilder setBuilder2 = new SetBuilder();
                List<String> list13 = folderData.includedFilterIds;
                if (list13 == null) {
                    list13 = emptyList2;
                }
                for (Iterator it9 = list13.iterator(); it9.hasNext(); it9 = it9) {
                    setBuilder2.add(new nwr(longValue3, folderData.id, (String) it9.next(), true));
                }
                List<String> list14 = folderData.excludedFilterIds;
                if (list14 == null) {
                    list14 = emptyList2;
                }
                for (Iterator it10 = list14.iterator(); it10.hasNext(); it10 = it10) {
                    setBuilder2.add(new nwr(longValue3, folderData.id, (String) it10.next(), false));
                }
                arrayList6.add(new ywr(hwrVar, setBuilder2.b()));
                emptyList = emptyList2;
                i3 = i4;
                it7 = it8;
            }
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                ywr ywrVar = (ywr) it11.next();
                ywr ywrVar2 = (ywr) f.get(ywrVar.a.a);
                if (ywrVar2 == null || !ywrVar.equals(ywrVar2)) {
                    setBuilder.add(ywrVar);
                }
            }
            linkedHashMap2 = linkedHashMap;
            it6 = it;
        }
        SetBuilder b = setBuilder.b();
        if (!hashSet2.isEmpty()) {
            ((rff) qxrVar.d.a.getValue()).getClass();
        }
        if (g.isEmpty()) {
            r9 = 1;
            z = false;
        } else {
            StringBuilder t = qv10.t("DELETE FROM main_folders WHERE organization_id IN (");
            q5z.b(t, g.size());
            t.append(Extension.C_BRAKE);
            sxo sxoVar = new sxo(13, t.toString(), g);
            r9 = 1;
            z = false;
            a.b(roomDatabase2, false, true, sxoVar);
        }
        if (!hashSet2.isEmpty()) {
            a.b(roomDatabase2, z, r9, new awr(gwrVar, hashSet2, r9));
        }
        if (!H0.isEmpty()) {
            a.b(roomDatabase2, z, r9, new sxo(14, gwrVar, H0));
        }
        if (!b.isEmpty()) {
            a.b(roomDatabase2, z, r9, new sxo(16, gwrVar, b));
        }
        ArrayList arrayList7 = new ArrayList(tcc.n(b, 10));
        Object it12 = b.iterator();
        while (((uf00) it12).hasNext()) {
            arrayList7.add(((ywr) ((sf00) it12).next()).c);
        }
        LinkedHashSet h = v4r0.h(hashSet2, arrayList7);
        ArrayList arrayList8 = new ArrayList(tcc.n(H0, 10));
        Iterator it13 = H0.iterator();
        while (it13.hasNext()) {
            arrayList8.add(Long.valueOf(((x400) it13.next()).a));
        }
        LinkedHashSet h2 = v4r0.h(g, arrayList8);
        ph9 ph9Var = qxrVar.c;
        if (!h.isEmpty() || !h2.isEmpty()) {
            ph9Var.d(h2, h);
        }
        ro6Var.b(foldersBucket.version, "folders");
    }

    public final void a(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        Long f = this.H.f(j);
        if ((f != null ? f.longValue() : 0L) >= j2) {
            return;
        }
        ndz0 ndz0Var = this.D;
        by10 by10Var = ndz0Var.d;
        ((Number) a.b(by10Var.a, false, true, new j2b(20, j, j2))).intValue();
        az10 az10Var = ndz0Var.c;
        az10Var.e(j, j2);
        RoomDatabase roomDatabase = by10Var.a;
        Long l = (Long) a.b(roomDatabase, true, false, new vh10(j, 2));
        if (l != null) {
            ((Number) a.b(roomDatabase, false, true, new jeb(1, j, l.longValue(), j2))).intValue();
        }
        Long n = az10Var.n(j);
        if (n != null) {
            az10Var.K(j, j2, n.longValue());
        }
        ((Number) a.b(ndz0Var.e.a, false, true, new j2b(5, j, j2))).intValue();
        ndz0Var.k.h(j, new iaz0.a());
        jdb jdbVar = this.B;
        meb mebVar = jdbVar.c;
        x2c0 x2c0Var = jdbVar.m;
        if (j2 > ((Number) a.b(x2c0Var.a, true, false, new vh10(j, 20))).longValue()) {
            ((Number) a.b(x2c0Var.a, false, true, new ww90(23, x2c0Var, new y2c0(j, 0L, 0L)))).longValue();
        }
        ((Number) a.b(mebVar.a, false, true, new j2b(3, j2, j))).intValue();
        Object obj = null;
        ((Number) a.b(mebVar.a, false, true, new ec1(obj, obj, j, 3))).intValue();
        jdbVar.t.a(j);
    }

    public final void a0(long j, long j2) {
        l6b l6bVar = this.B.f;
        Long l = (Long) a.b(l6bVar.a, true, false, new cs0(j, 22));
        if (l == null || j2 > l.longValue()) {
            a.b(l6bVar.a, false, true, new cs8(28, l6bVar, new m6b(j, j2)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0230, code lost:
    
        if (r37.b < r11.longValue()) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b0(o1b0 o1b0Var, Message message, boolean z) {
        String str;
        String str2;
        boolean z2;
        boolean z3;
        long g;
        ThreadState threadState;
        t2b t2bVar;
        List i;
        boolean z4;
        boolean z5;
        boolean z6;
        Map<String, LocalizedData> map;
        String str3;
        long j = o1b0Var.a;
        MessageData messageData = message.h;
        String str4 = o1b0Var.b;
        ChatId a = ChatId.Companion.a(str4);
        if (!(a instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a).d < 0) {
            ChatId a2 = ChatId.Companion.a(str4);
            ChatId.GeneralChatId generalChatId = a2 instanceof ChatId.GeneralChatId ? (ChatId.GeneralChatId) a2 : null;
            if (generalChatId != null) {
                if (generalChatId.c != 1) {
                    generalChatId = null;
                }
                if (generalChatId != null) {
                    str = generalChatId.d;
                }
            }
            str = null;
        } else {
            ChatId a3 = ChatId.Companion.a(new ChatId.ThreadId(str4).c().a);
            ChatId.GeneralChatId generalChatId2 = a3 instanceof ChatId.GeneralChatId ? (ChatId.GeneralChatId) a3 : null;
            if (generalChatId2 != null) {
                if (generalChatId2.c != 1) {
                    generalChatId2 = null;
                }
                if (generalChatId2 != null) {
                    str = generalChatId2.d;
                }
            }
            str = null;
        }
        ReducedUserInfo[] reducedUserInfoArr = message.r;
        nu21 nu21Var = this.C;
        if (reducedUserInfoArr != null) {
            for (ReducedUserInfo reducedUserInfo : reducedUserInfoArr) {
                nu21.d(nu21Var, reducedUserInfo, null, Boolean.valueOf(jl40.l(str, reducedUserInfo.userId)), 2);
            }
        }
        ReducedUserInfo reducedUserInfo2 = message.n;
        if (reducedUserInfo2 != null) {
            nu21.d(nu21Var, reducedUserInfo2, null, Boolean.valueOf(jl40.l(str, reducedUserInfo2.userId)), 2);
        }
        CustomFromUserInfo customFromUserInfo = message.o;
        if (customFromUserInfo != null) {
            String str5 = message.g;
            String str6 = customFromUserInfo.avatarId;
            String str7 = customFromUserInfo.displayName;
            Map<String, LocalizedData> map2 = customFromUserInfo.localizationMap;
            String str8 = str5 + str6 + str7 + (map2 != null ? map2.hashCode() : 0);
            customFromUserInfo.userId = str8;
            String str9 = message.g;
            z5z z5zVar = nu21Var.p;
            String str10 = customFromUserInfo.displayName;
            if (str10 != null) {
                RobotInfo robotInfo = customFromUserInfo.robotInfo;
                Boolean bool = customFromUserInfo.isRobot;
                Boolean bool2 = Boolean.TRUE;
                boolean l = jl40.l(bool, bool2);
                boolean z7 = robotInfo == null || robotInfo.getCannotBeBlocked();
                if (robotInfo != null) {
                    str2 = str4;
                    z4 = true;
                    if (robotInfo.getIsSupport()) {
                        z5 = true;
                        z6 = robotInfo == null && robotInfo.getDisablePrivates() == z4;
                        z2 = false;
                        if (nu21Var.c(str8, str10, 1L, customFromUserInfo.avatarId, null, null, l, z7, z5, z6, jl40.l(customFromUserInfo.isDisplayRestricted, bool2), null, null, null, false, bool2) != null && (map = customFromUserInfo.localizationMap) != null) {
                            hv21 a4 = ((cv21) z5zVar.b.getValue()).a(str9);
                            LocalizationDescriptor localizationDescriptor = a4 == null ? a4.c : null;
                            str3 = localizationDescriptor == null ? localizationDescriptor.getDefault() : null;
                            if (str3 == null) {
                                str3 = "default";
                            }
                            ((cv21) z5zVar.b.getValue()).c(new hv21(str8, true, new LocalizationDescriptor(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, str3, (String[]) map.keySet().toArray(new String[0])), map));
                        }
                        Long d = this.H.d(j);
                        z3 = messageData instanceof RemovedMessageData;
                        ph9 ph9Var = this.z;
                        if (z3) {
                            if (d != null && d.longValue() < message.b) {
                                ph9Var.a(j);
                            }
                            fzy0 fzy0Var = (fzy0) a.b(this.J.a, true, z2, new dz10(18, j, message.b));
                            if (fzy0Var != null) {
                                long j2 = fzy0Var.a;
                                ph9Var.a(j2);
                                this.c.a(j2);
                            }
                        }
                        ndz0 ndz0Var = this.D;
                        g = ndz0Var.g(o1b0Var, message, z);
                        if (this.w.a(tz10.s)) {
                            MessageTranslation messageTranslation = message.q;
                            if (z3) {
                                long j3 = message.b;
                                if (ndz0Var.e.a(j, j3) > 0) {
                                    i = Collections.singletonList(new jaz0(ndz0Var.c.j(j, j3)));
                                    if (i != null) {
                                        ph9Var.i(j, i);
                                    }
                                }
                                i = null;
                                if (i != null) {
                                }
                            } else {
                                if (messageTranslation != null) {
                                    i = ndz0Var.k(j, messageTranslation);
                                } else {
                                    if (g >= 0) {
                                        i = ndz0Var.i(j, message.b);
                                    }
                                    i = null;
                                }
                                if (i != null) {
                                }
                            }
                        }
                        if (g >= 0) {
                            ph9Var.a(j);
                        }
                        ChatId a5 = ChatId.Companion.a(str2);
                        threadState = message.p;
                        jdb jdbVar = this.B;
                        if (threadState != null) {
                            jdbVar.i(j, a5.b(message.b).a, threadState);
                        }
                        meb mebVar = jdbVar.c;
                        t2bVar = (t2b) a.b(mebVar.a, true, z2, new hcb(j, 4));
                        if (t2bVar != null) {
                            Long l2 = t2bVar.w;
                            Long l3 = t2bVar.v;
                            Long l4 = t2bVar.s;
                            if (l4 != null) {
                            }
                            long longValue = l3 != null ? l3.longValue() : 0L;
                            long j4 = message.b;
                            if (longValue < j4) {
                                longValue = j4;
                            }
                            long longValue2 = l2 != null ? l2.longValue() : 0L;
                            long j5 = message.d;
                            if (longValue2 < j5) {
                                longValue2 = j5;
                            }
                            if (l3 == null || longValue != l3.longValue() || l2 == null || longValue2 != l2.longValue()) {
                                ((Number) a.b(mebVar.a, false, true, new ec1(Long.valueOf(longValue), Long.valueOf(longValue2), t2bVar.a, 3))).intValue();
                                jdbVar.t.a(j);
                            }
                        }
                        return g;
                    }
                } else {
                    str2 = str4;
                    z4 = true;
                }
                z5 = false;
                if (robotInfo == null) {
                }
                z2 = false;
                if (nu21Var.c(str8, str10, 1L, customFromUserInfo.avatarId, null, null, l, z7, z5, z6, jl40.l(customFromUserInfo.isDisplayRestricted, bool2), null, null, null, false, bool2) != null) {
                    hv21 a42 = ((cv21) z5zVar.b.getValue()).a(str9);
                    if (a42 == null) {
                    }
                    if (localizationDescriptor == null) {
                    }
                    if (str3 == null) {
                    }
                    ((cv21) z5zVar.b.getValue()).c(new hv21(str8, true, new LocalizationDescriptor(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, str3, (String[]) map.keySet().toArray(new String[0])), map));
                }
                Long d2 = this.H.d(j);
                z3 = messageData instanceof RemovedMessageData;
                ph9 ph9Var2 = this.z;
                if (z3) {
                }
                ndz0 ndz0Var2 = this.D;
                g = ndz0Var2.g(o1b0Var, message, z);
                if (this.w.a(tz10.s)) {
                }
                if (g >= 0) {
                }
                ChatId a52 = ChatId.Companion.a(str2);
                threadState = message.p;
                jdb jdbVar2 = this.B;
                if (threadState != null) {
                }
                meb mebVar2 = jdbVar2.c;
                t2bVar = (t2b) a.b(mebVar2.a, true, z2, new hcb(j, 4));
                if (t2bVar != null) {
                }
                return g;
            }
        }
        str2 = str4;
        z2 = false;
        Long d22 = this.H.d(j);
        z3 = messageData instanceof RemovedMessageData;
        ph9 ph9Var22 = this.z;
        if (z3) {
        }
        ndz0 ndz0Var22 = this.D;
        g = ndz0Var22.g(o1b0Var, message, z);
        if (this.w.a(tz10.s)) {
        }
        if (g >= 0) {
        }
        ChatId a522 = ChatId.Companion.a(str2);
        threadState = message.p;
        jdb jdbVar22 = this.B;
        if (threadState != null) {
        }
        meb mebVar22 = jdbVar22.c;
        t2bVar = (t2b) a.b(mebVar22.a, true, z2, new hcb(j, 4));
        if (t2bVar != null) {
        }
        return g;
    }

    public final void c() {
        jdb jdbVar = this.B;
        ph9 ph9Var = jdbVar.t;
        meb mebVar = jdbVar.c;
        Iterator it = ((List) a.b(mebVar.a, true, false, new rfa(26))).iterator();
        while (it.hasNext()) {
            jdbVar.g.b(((Number) it.next()).longValue());
        }
        ((Number) a.b(mebVar.a, false, true, new rfa(25))).intValue();
        at2 at2Var = jdbVar.r.a;
        a.b(at2Var.d0().a, false, true, new uiy0(29));
        a.b(at2Var.d0().a, false, true, new uiy0(24));
        ikw0 ikw0Var = ph9Var.c;
        int i = e9h0.payload_thread_list_changed;
        Boolean bool = Boolean.TRUE;
        ikw0Var.d(i, bool);
        ph9Var.c.d(e9h0.payload_unseen_changed, bool);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        k020 k020Var = this.a;
        if (k020Var.l == null) {
            return;
        }
        k020Var.c.get();
        Looper.myLooper();
        z83.i();
        z83.i();
        k020Var.l = null;
        this.y.close();
    }

    public final void d(String str, boolean z) {
        jdb jdbVar = this.B;
        ph9 ph9Var = jdbVar.t;
        x8b x8bVar = jdbVar.d;
        Long c = jdbVar.c.c(str);
        if (c != null) {
            long longValue = c.longValue();
            Integer num = !z ? (Integer) a.b(x8bVar.a, true, false, new cs0(longValue, 26)) : null;
            x8bVar.b(new y8b(3, num != null ? num.intValue() : 0, longValue, 0L));
            ((Number) a.b(jdbVar.e.a, false, true, new cs0(longValue, 19))).intValue();
            jdbVar.f(longValue);
            rnz rnzVar = ph9Var.m;
            if (rnzVar == null) {
                rnzVar = new rnz((Object) null);
                ph9Var.m = rnzVar;
                ph9Var.c.d(e9h0.payload_members_changed, rnzVar);
            }
            rnzVar.h(longValue, ph9Var);
            ph9Var.a(longValue);
        }
    }

    public final void e(long j) {
        ghf0 ghf0Var = this.E;
        if (j > ghf0Var.o.e()) {
            ((Number) a.b(ghf0Var.c.a, false, true, new vh10(j, 26))).intValue();
        }
    }

    public final void e0(MessageRef messageRef, PollMessageData pollMessageData) {
        String str;
        Long c = this.H.c(messageRef.chatId);
        if (c != null) {
            long longValue = c.longValue();
            if (!this.D.h(longValue, messageRef.timestamp, pollMessageData)) {
                String str2 = messageRef.chatId;
                long j = messageRef.timestamp;
                ndz0 ndz0Var = this.D;
                JsonAdapter jsonAdapter = ndz0Var.p;
                String json2 = jsonAdapter.toJson(pollMessageData);
                az10 az10Var = ndz0Var.c;
                yab yabVar = new yab(az10Var.V(j, str2), ndz0Var.h, 0L);
                boolean z = false;
                while (yabVar.moveToNext()) {
                    try {
                        if (!wkb1.k(yabVar.a.getLong(2), 16L)) {
                            long G = yabVar.G();
                            if (yabVar.R().reactions != null) {
                                pollMessageData.reactions = yabVar.R().reactions;
                                pollMessageData.reactionsVersion = yabVar.R().reactionsVersion;
                                str = jsonAdapter.toJson(pollMessageData);
                            } else {
                                str = json2;
                            }
                            ndz0Var.k.h(longValue, alb1.j(ndz0Var.c, longValue, G, str));
                            z = true;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ooc.g(yabVar, th);
                            throw th2;
                        }
                    }
                }
                yabVar.close();
                if (!z) {
                    return;
                }
            }
            ph9 ph9Var = this.z;
            ph9Var.a(longValue);
            ph9Var.e(longValue, messageRef.timestamp);
        }
    }

    public final void f0(o1b0 o1b0Var, MessageTranslation messageTranslation) {
        ArrayList k;
        long j = o1b0Var.a;
        if (this.w.a(tz10.s)) {
            Long f = this.H.f(j);
            if ((f == null || messageTranslation.a.b > f.longValue()) && (k = this.D.k(j, messageTranslation)) != null) {
                this.z.i(j, k);
            }
        }
    }

    public final void g0(MiniappsBucket miniappsBucket) {
        r96 r96Var = tz10.o;
        lqo lqoVar = this.w;
        if (lqoVar.a(r96Var) && lqoVar.a(tz10.z)) {
            ghf0 ghf0Var = this.E;
            q5b q5bVar = ghf0Var.l;
            ro6 ro6Var = ghf0Var.g;
            if (miniappsBucket.version <= ro6Var.a("miniapps")) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            RoomDatabase roomDatabase = q5bVar.a;
            List list = (List) a.b(roomDatabase, true, false, new rfa(12));
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((r5b) it.next()).a);
            }
            Set<String> M0 = kotlin.collections.a.M0(arrayList2);
            for (Map.Entry<String, MiniappsBucket.Value> entry : miniappsBucket.value.entrySet()) {
                String key = entry.getKey();
                MiniappsBucket.Value value = entry.getValue();
                if (value != null) {
                    arrayList.add(new r5b(key, value.miniappUrl, jl40.l(value.trusted, Boolean.TRUE)));
                    M0.add(key);
                }
            }
            ((Number) a.b(roomDatabase, false, true, new rfa(11))).intValue();
            a.b(roomDatabase, false, true, new cs8(27, q5bVar, arrayList));
            ro6Var.b(miniappsBucket.version, "miniapps");
            for (String str : M0) {
                ph9 ph9Var = ghf0Var.s;
                HashSet hashSet = ph9Var.h;
                if (hashSet == null) {
                    hashSet = new HashSet();
                    ph9Var.h = hashSet;
                }
                hashSet.add(str);
                ph9Var.c.d(e9h0.payload_chat_miniapp_info_changed, hashSet);
            }
        }
    }

    public final void k(long j) {
        ghf0 ghf0Var = this.E;
        if (j > ((Number) a.b(ghf0Var.o.b.A().a, true, false, new nqi0(17))).longValue()) {
            ((Number) a.b(ghf0Var.c.a, false, true, new vh10(j, 23))).intValue();
        }
    }

    public final void k0(long j, long j2) {
        jdb jdbVar = this.B;
        meb mebVar = jdbVar.c;
        long g = mebVar.g(j);
        if (g < j2) {
            z83.b(null, 1, Integer.valueOf(((Number) a.b(mebVar.a, false, true, new j2b(2, j2, j))).intValue()));
            jdbVar.t.a(j);
        }
        if (g >= j2) {
            return;
        }
        ndz0 ndz0Var = this.D;
        int m = ndz0Var.c.m(j, g, j2);
        ndz0Var.k.h(j, m > 0 ? new kaz0(ndz0Var.c.j(j, j2), m) : null);
    }

    public final void n(long j) {
        ghf0 ghf0Var = this.E;
        if (j > ((Number) a.b(ghf0Var.o.b.A().a, true, false, new nqi0(18))).longValue()) {
            ((Number) a.b(ghf0Var.c.a, false, true, new vh10(j, 25))).intValue();
        }
    }

    public final void n0(long j, long j2) {
        jdb jdbVar = this.B;
        tg90 tg90Var = jdbVar.n;
        Long a = tg90Var.a(j);
        if (a == null || j2 != a.longValue()) {
            tg90Var.b(new vg90(j, j2));
            jdbVar.t.a(j);
        }
    }

    public final boolean o(long j, String str, ShortMessageInfo shortMessageInfo) {
        long j2 = shortMessageInfo.prevTimestamp;
        long j3 = shortMessageInfo.timestamp;
        ndz0 ndz0Var = this.D;
        Long c = ndz0Var.c(j, j2, j3);
        if (c != null) {
            long longValue = c.longValue();
            long j4 = shortMessageInfo.timestamp;
            long j5 = shortMessageInfo.seqNo;
            iaz0.a aVar = null;
            if (((Number) a.b(ndz0Var.d.a, false, true, new yx10(j4, longValue, j5, j, str, 0))).intValue() >= 1 && ndz0Var.c.i0(j, j4, longValue, j5, str) >= 1) {
                aVar = new iaz0.a();
            }
            ndz0Var.k.h(j, aVar);
            if (aVar != null) {
                return true;
            }
        }
        return false;
    }

    public final void q0(PersonalUserData personalUserData) {
        ghf0 ghf0Var = this.E;
        ghf0Var.getClass();
        String f = com.yandex.messaging.internal.images.b.f(personalUserData.avatarId);
        String str = personalUserData.userId;
        long j = personalUserData.version;
        String str2 = personalUserData.displayName;
        String str3 = personalUserData.nickname;
        String str4 = personalUserData.phone;
        String str5 = personalUserData.registrationStatus;
        boolean z = personalUserData.isDisplayRestricted;
        boolean z2 = (personalUserData.employeeInfo == null && personalUserData.employeesInfo == null) ? false : true;
        boolean z3 = personalUserData.isOnboarded;
        boolean z4 = personalUserData.needsMigrationOnboarding;
        AccountType accountType = personalUserData.accountType;
        String str6 = null;
        if (accountType != null) {
            if (!accountType.getFound()) {
                accountType = null;
            }
            if (accountType != null) {
                str6 = accountType.getValue();
            }
        }
        ghf0Var.a(new z7b0(1L, str, j, f, str2, str3, str4, str5, z, z2, z3, z4, str6), personalUserData.organizations, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0401, code lost:
    
        if (r2.intValue() != 2) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        long j;
        int i;
        int i2;
        rnz rnzVar;
        List list;
        long j2;
        boolean z;
        boolean z2;
        String str;
        Integer valueOf;
        Integer num;
        boolean z3;
        long j3;
        boolean z4;
        boolean z5;
        Integer num2;
        int i3;
        rnz rnzVar2;
        meb mebVar;
        rnz rnzVar3;
        boolean z6 = false;
        String str2 = (String) a.b(this.M.a, true, false, new dia0(20));
        if ("U".equals(str2) || "Lu".equals(str2)) {
            jdb jdbVar = this.B;
            String str3 = jdbVar.w;
            if (!((Boolean) a.b(jdbVar.c.a, true, false, new b5a(new ChatId.PrivateChatId(str3, str3).a, 11))).booleanValue()) {
                jdbVar.d(new ChatData(new ChatId.PrivateChatId(str3, str3).a, 0L, null, null, null, true, 0.0d, new String[]{str3}, null, null, null, new String[]{ChatRightsFlag.Read.getFlagName(), ChatRightsFlag.Write.getFlagName(), ChatRightsFlag.SendAttachments.getFlagName()}, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 67106654, null), false);
            }
        }
        rnz rnzVar4 = new rnz((Object) null);
        rnz rnzVar5 = new rnz((Object) null);
        ph9 ph9Var = this.z;
        ikw0 ikw0Var = ph9Var.c;
        ikw0 ikw0Var2 = ph9Var.c;
        meb mebVar2 = ph9Var.a;
        HashSet hashSet = ph9Var.p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                Long c = mebVar2.c(str4);
                if (c != null) {
                    rnzVar4.h(c.longValue(), Boolean.TRUE);
                    ph9Var.c(str4);
                }
            }
        }
        HashSet hashSet2 = ph9Var.d;
        if (hashSet2 != null) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                Long l = (Long) a.b(mebVar2.a, true, false, new b5a((String) it2.next(), 12));
                if (l != null && rnzVar4.e(l.longValue()) < 0) {
                    rnzVar4.h(l.longValue(), Boolean.TRUE);
                    ph9Var.c(mebVar2.b(l.longValue()));
                }
            }
        }
        rnz rnzVar6 = ph9Var.e;
        if (rnzVar6 != null) {
            int j4 = rnzVar6.j();
            int i4 = 0;
            j = 0;
            while (i4 < j4) {
                long g = rnzVar6.g(i4);
                boolean z7 = rnzVar5.e(g) >= 0 ? true : z6;
                boolean z8 = rnzVar4.e(g) >= 0 ? true : z6;
                if (z7 || z8) {
                    i3 = j4;
                    rnzVar2 = rnzVar5;
                    mebVar = mebVar2;
                    rnzVar3 = rnzVar6;
                } else {
                    String b = mebVar2.b(g);
                    RoomDatabase roomDatabase = mebVar2.a;
                    ChatId a = ChatId.Companion.a(b);
                    if (a instanceof ChatId.ThreadId) {
                        mebVar = mebVar2;
                        rnzVar3 = rnzVar6;
                        if (((ChatId.ThreadId) a).d >= 0) {
                            Boolean bool = Boolean.TRUE;
                            rnzVar5.h(g, bool);
                            ph9Var.c(b);
                            ikw0Var2.d(e9h0.payload_thread_list_changed, bool);
                            i3 = j4;
                            rnzVar2 = rnzVar5;
                        }
                    } else {
                        mebVar = mebVar2;
                        rnzVar3 = rnzVar6;
                    }
                    rnzVar4.h(g, Boolean.TRUE);
                    ph9Var.c(b);
                    i3 = j4;
                    Integer num3 = (Integer) a.b(ph9Var.b.a, true, false, new cs0(g, 27));
                    Long l2 = (Long) a.b(roomDatabase, true, false, new hcb(g, 6));
                    boolean z9 = ((String) a.b(roomDatabase, true, false, new hcb(g, 20))) != null;
                    if (num3 != null && !z9 && (num3.intValue() == 2 || num3.intValue() == 1 || num3.intValue() == 0)) {
                        HashSet hashSet3 = ph9Var.q;
                        if (hashSet3 == null) {
                            hashSet3 = new HashSet();
                            ph9Var.q = hashSet3;
                            ikw0Var.d(e9h0.payload_user_has_any_chat, hashSet3);
                        }
                        hashSet3.add(Long.valueOf(g));
                    }
                    if (l2 != null && ((z9 || num3 != null) && ((num3 == null || num3.intValue() == 2 || num3.intValue() == 1) && !ChatIdKt.a(ChatId.Companion.a(b)) && !ChatNamespaces.b(b)))) {
                        rnzVar2 = rnzVar5;
                        if (!ChatFlags.a(l2.longValue(), 4L)) {
                            HashSet hashSet4 = ph9Var.q;
                            if (hashSet4 == null) {
                                hashSet4 = new HashSet();
                                ph9Var.q = hashSet4;
                            }
                            ikw0Var.d(e9h0.payload_user_has_chat_with_people, hashSet4);
                            hashSet4.add(Long.valueOf(g));
                            if (!z9) {
                                HashSet hashSet5 = ph9Var.q;
                                if (hashSet5 == null) {
                                    hashSet5 = new HashSet();
                                    ph9Var.q = hashSet5;
                                }
                                ikw0Var.d(e9h0.payload_user_has_group_chat, hashSet5);
                                hashSet5.add(Long.valueOf(g));
                            }
                        }
                    }
                    rnzVar2 = rnzVar5;
                }
                i4++;
                mebVar2 = mebVar;
                rnzVar5 = rnzVar2;
                rnzVar6 = rnzVar3;
                j4 = i3;
                z6 = false;
            }
        } else {
            j = 0;
        }
        rnz rnzVar7 = rnzVar5;
        if (rnzVar4.j() > 0) {
            ikw0Var.d(e9h0.payload_chat_list_changed, Boolean.TRUE);
        }
        int j5 = rnzVar4.j();
        for (int i5 = 0; i5 < j5; i5++) {
            this.b.b(rnzVar4.g(i5));
        }
        int j6 = rnzVar7.j();
        int i6 = 0;
        while (i6 < j6) {
            long g2 = rnzVar7.g(i6);
            gzy0 gzy0Var = this.c;
            at2 at2Var = gzy0Var.a;
            ugs ugsVar = (ugs) a.b(at2Var.g0().a, true, false, new hcb(g2, 28));
            if (ugsVar == null) {
                gzy0Var.a(g2);
                i = j6;
                i2 = i6;
                rnzVar = rnzVar7;
            } else {
                long j7 = ugsVar.g;
                String str5 = ugsVar.b;
                Long l3 = ugsVar.q;
                if (l3 != null) {
                    i = j6;
                    i2 = i6;
                    long longValue = l3.longValue();
                    Long l4 = ugsVar.r;
                    if (l4 == null) {
                        ny61.r(g8e.o("Not a thread ", str5));
                        return;
                    }
                    rnzVar = rnzVar7;
                    long longValue2 = l4.longValue();
                    udb a2 = at2Var.c().a(longValue);
                    if (a2 == null) {
                        ny61.r(oyr.p("Parent for ", str5, " does not exists"));
                        return;
                    }
                    List W = at2Var.B().W(longValue, longValue2);
                    if (!W.isEmpty()) {
                        Iterator it3 = W.iterator();
                        while (it3.hasNext()) {
                            ugs ugsVar2 = ugsVar;
                            List list2 = W;
                            hz10 z10 = at2Var.B().z(longValue, ((Number) it3.next()).longValue());
                            W = (z10 == null || ((num2 = z10.b) != null && num2.intValue() == 8) || ((num2 != null && num2.intValue() == -3) || (num2 != null && num2.intValue() == -1))) ? EmptyList.a : list2;
                            ugsVar = ugsVar2;
                        }
                    }
                    ugs ugsVar3 = ugsVar;
                    if (W.isEmpty()) {
                        gzy0Var.a(g2);
                    } else {
                        long j8 = ugsVar3.G;
                        String str6 = ugsVar3.b;
                        int i7 = ugsVar3.B;
                        int i8 = ugsVar3.h;
                        if (j7 < j) {
                            list = W;
                            j2 = longValue2;
                        } else {
                            if (j7 == j) {
                                list = W;
                                j2 = longValue2;
                            } else {
                                int i9 = i7 - i8;
                                if (i9 < 0) {
                                    list = W;
                                    HashMap hashMap = new HashMap(4);
                                    j2 = longValue2;
                                    b64.B(i9, hashMap, "unseen", i7, "seq_no");
                                    hashMap.put("last_seen_seq_no", Integer.valueOf(i8));
                                    hashMap.put("chat_id", str6);
                                    gzy0Var.b.reportEvent("negative unseen", hashMap);
                                } else {
                                    list = W;
                                    j2 = longValue2;
                                }
                                if (i9 >= 0) {
                                    i7 = i9;
                                }
                            }
                            z = ugsVar3.I;
                            long j9 = ugsVar3.a;
                            if (z) {
                                RoomDatabase roomDatabase2 = at2Var.b().a;
                                j2b j2bVar = new j2b(19, j9, j7);
                                z2 = true;
                                str = str6;
                                Long l5 = (Long) a.b(roomDatabase2, true, false, j2bVar);
                                if (l5 != null) {
                                    int k = at2Var.B().k(j9, l5.longValue()) - 1;
                                    if (k < 0) {
                                        k = 0;
                                    }
                                    valueOf = Integer.valueOf(k);
                                    num = (Integer) a.b(at2Var.V().a, z2, false, new cs0(g2, 27));
                                    if (num != null) {
                                        if (num.intValue() != z2) {
                                        }
                                        j3 = j8;
                                        z3 = true;
                                        if (z3) {
                                            gzy0Var.a(g2);
                                        } else {
                                            boolean z11 = (a2.y || list.isEmpty() || ugsVar3.p <= j) ? false : true;
                                            if (((fzy0) a.b(at2Var.d0().a, true, false, new pzy0(g2, 1))) == null && j3 == -1) {
                                                j3 = Math.round(ugsVar3.c * 1000000.0d);
                                            }
                                            List list3 = (List) a.b(at2Var.d0().a, true, false, new pzy0(g2, 0));
                                            List list4 = list;
                                            if (kotlin.collections.a.N0(list3).equals(kotlin.collections.a.N0(list4))) {
                                                z4 = false;
                                                z5 = true;
                                            } else {
                                                if (!list3.isEmpty()) {
                                                    a.b(at2Var.d0().a, false, true, new pzy0(g2, 3));
                                                }
                                                ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                                                Iterator it4 = list4.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList.add(new fyy0(((Number) it4.next()).longValue(), g2));
                                                }
                                                qzy0 d0 = at2Var.d0();
                                                RoomDatabase roomDatabase3 = d0.a;
                                                rmy0 rmy0Var = new rmy0(9, d0, arrayList);
                                                z4 = false;
                                                z5 = true;
                                                a.b(roomDatabase3, false, true, rmy0Var);
                                            }
                                            qzy0 d02 = at2Var.d0();
                                            a.b(d02.a, z4, z5, new rmy0(8, d02, new fzy0(g2, str, i7, valueOf, !z11, z3, j3, longValue, j2)));
                                        }
                                    }
                                    j3 = j8;
                                    z3 = false;
                                    if (z3) {
                                    }
                                }
                            } else {
                                str = str6;
                                z2 = true;
                            }
                            valueOf = null;
                            num = (Integer) a.b(at2Var.V().a, z2, false, new cs0(g2, 27));
                            if (num != null) {
                            }
                            j3 = j8;
                            z3 = false;
                            if (z3) {
                            }
                        }
                        i7 = 0;
                        z = ugsVar3.I;
                        long j92 = ugsVar3.a;
                        if (z) {
                        }
                        valueOf = null;
                        num = (Integer) a.b(at2Var.V().a, z2, false, new cs0(g2, 27));
                        if (num != null) {
                        }
                        j3 = j8;
                        z3 = false;
                        if (z3) {
                        }
                    }
                } else {
                    i = j6;
                    i2 = i6;
                    rnzVar = rnzVar7;
                    gzy0Var.a(g2);
                }
                i6 = i2 + 1;
                j6 = i;
                rnzVar7 = rnzVar;
            }
            i6 = i2 + 1;
            j6 = i;
            rnzVar7 = rnzVar;
        }
        rnz rnzVar8 = rnzVar7;
        if (!rnzVar4.f() || !rnzVar8.f()) {
            c421 c421Var = this.L;
            d421 d421Var = (d421) a.b(c421Var.a, true, false, new of11(19));
            int i10 = d421Var != null ? d421Var.b : 0;
            int i11 = d421Var != null ? d421Var.c : 0;
            int i12 = d421Var != null ? d421Var.d : 0;
            qzy0 qzy0Var = this.J;
            int i13 = 26;
            final int intValue = ((Number) a.b(qzy0Var.a, true, false, new uiy0(i13))).intValue();
            int intValue2 = ((Number) a.b(qzy0Var.a, true, false, new uiy0(i13))).intValue();
            ueb uebVar = this.I;
            final int intValue3 = ((Number) a.b(uebVar.a, true, false, new teb(1))).intValue() + intValue2;
            final int intValue4 = ((Number) a.b(uebVar.a, true, false, new teb(3))).intValue() + intValue2;
            if (intValue3 != i10 || intValue4 != i11 || intValue != i12) {
                a.b(c421Var.a, false, true, new tls() { // from class: b421
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i14 = intValue3;
                        int i15 = intValue4;
                        int i16 = intValue;
                        ull0 T0 = ((oll0) obj).T0("UPDATE unseen_view SET unseen = ?, unseen_show = ?,\n            threads_unseen_show=?");
                        try {
                            T0.b(1, i14);
                            T0.b(2, i15);
                            T0.b(3, i16);
                            T0.q();
                            T0.close();
                            return zy11.a;
                        } catch (Throwable th) {
                            T0.close();
                            throw th;
                        }
                    }
                });
                ikw0Var2.d(e9h0.payload_unseen_changed, Boolean.TRUE);
            }
            ghf0 ghf0Var = this.E;
            az10 az10Var = ghf0Var.d;
            Long v = az10Var.v();
            if (v != null) {
                tdb tdbVar = (tdb) a.b(ghf0Var.e.a, true, false, new hcb(v.longValue(), 25));
                if (tdbVar != null && ChatFlags.a(tdbVar.b, 1L)) {
                    if (tdbVar.c == 0) {
                        az10Var.b();
                    } else {
                        az10Var.h0(tdbVar.a);
                    }
                }
            }
        }
        if (!rnzVar4.f()) {
            jdj jdjVar = this.x;
            g4r g4rVar = (g4r) ((i3y) jdjVar.w).getValue();
            List list5 = (List) a.b(g4rVar.a, true, false, new s1r(1, g4rVar));
            ueb c2 = ((at2) jdjVar.c).c();
            snz snzVar = new snz(rnzVar4);
            while (snzVar.hasNext()) {
                udb a3 = c2.a(((Number) snzVar.next()).longValue());
                if (a3 == null) {
                    z83.i();
                } else {
                    ChatId a4 = ChatId.Companion.a(a3.b);
                    if (!(a4 instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a4).d < j) {
                        jdjVar.r(a3, list5, ph9Var);
                    } else {
                        z83.i();
                    }
                }
            }
        }
        this.y.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0(WhoamiUserInfo whoamiUserInfo) {
        String str;
        OrganizationProto[] organizationProtoArr;
        ghf0 ghf0Var = this.E;
        ghf0Var.getClass();
        String str2 = whoamiUserInfo.displayName;
        if (str2 == null) {
            return;
        }
        String f = com.yandex.messaging.internal.images.b.f(whoamiUserInfo.avatarId);
        String str3 = whoamiUserInfo.userId;
        long j = whoamiUserInfo.version;
        String str4 = whoamiUserInfo.nickname;
        String str5 = whoamiUserInfo.phone;
        String a = BackendRegistrationStatus.Companion.a(whoamiUserInfo.getRegistrationStatus());
        boolean z = whoamiUserInfo.isDisplayRestricted;
        OrganizationProto[] organizationProtoArr2 = whoamiUserInfo.organizations;
        boolean z2 = !(organizationProtoArr2 == null || organizationProtoArr2.length == 0);
        boolean isOnboarded = whoamiUserInfo.isOnboarded();
        boolean needsMigrationOnboarding = whoamiUserInfo.getNeedsMigrationOnboarding();
        AccountTypeProto accountTypeProto = whoamiUserInfo.accountType;
        PersonalUserData.Organization[] organizationArr = null;
        if (accountTypeProto != null) {
            if (!accountTypeProto.getFound()) {
                accountTypeProto = null;
            }
            if (accountTypeProto != null) {
                str = accountTypeProto.getValue();
                z7b0 z7b0Var = new z7b0(1L, str3, j, f, str2, str4, str5, a, z, z2, isOnboarded, needsMigrationOnboarding, str);
                organizationProtoArr = whoamiUserInfo.organizations;
                if (organizationProtoArr != null) {
                    ArrayList arrayList = new ArrayList(organizationProtoArr.length);
                    for (OrganizationProto organizationProto : organizationProtoArr) {
                        PersonalUserData.Organization organization = new PersonalUserData.Organization();
                        organization.organizationId = organizationProto.getOrganizationId();
                        String organizationName = organizationProto.getOrganizationName();
                        if (organizationName == null) {
                            organizationName = "";
                        }
                        organization.organizationName = organizationName;
                        organization.registrationStatus = BackendRegistrationStatus.Companion.a(Integer.valueOf(organizationProto.getRegistrationStatus()));
                        organization.isPublic = organizationProto.isPublic();
                        organization.isGuest = organizationProto.isGuest();
                        organization.organizationRights = organizationProto.getOrganizationRights();
                        organization.disabled = organizationProto.getDisabled();
                        arrayList.add(organization);
                    }
                    organizationArr = (PersonalUserData.Organization[]) arrayList.toArray(new PersonalUserData.Organization[0]);
                }
                ghf0Var.a(z7b0Var, organizationArr, true);
            }
        }
        str = null;
        z7b0 z7b0Var2 = new z7b0(1L, str3, j, f, str2, str4, str5, a, z, z2, isOnboarded, needsMigrationOnboarding, str);
        organizationProtoArr = whoamiUserInfo.organizations;
        if (organizationProtoArr != null) {
        }
        ghf0Var.a(z7b0Var2, organizationArr, true);
    }

    public final void v(o1b0 o1b0Var, long j, String str, double d, MessageData messageData, ReplyData replyData, CustomPayload customPayload, boolean z, String str2) {
        long j2 = o1b0Var.a;
        ndz0 ndz0Var = this.D;
        ndz0Var.getClass();
        z83.h(null, j > 0);
        z83.h(null, j < 2147483647L);
        String str3 = messageData.payloadId;
        if (str3 == null) {
            messageData.payloadId = str;
        } else {
            z83.b(null, str, str3);
        }
        String json2 = replyData != null ? ndz0Var.s.toJson(replyData) : null;
        String json3 = ndz0Var.p.toJson(messageData);
        String json4 = customPayload != null ? ndz0Var.q.toJson(customPayload) : null;
        long j3 = ChatNamespaces.b(o1b0Var.b) ? 0L : 1L;
        if (z) {
            j3 |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        ndz0Var.k.h(j2, ndz0Var.e(o1b0Var.a, o1b0Var.b, j, str, j + ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET, -1L, -1L, 0L, j3, d, ndz0Var.o, json3, json4, null, json2, -1L, 0L, 0L, null, str2, null));
        this.z.a(j2);
    }

    public final void v0(PreferencesBucket preferencesBucket) {
        ghf0 ghf0Var = this.E;
        ro6 ro6Var = ghf0Var.g;
        if (ro6Var.a("preferences") >= preferencesBucket.version) {
            return;
        }
        t5b0 t5b0Var = ghf0Var.h;
        ((Number) a.b(t5b0Var.a, false, true, new ww90(8, t5b0Var, new u5b0(preferencesBucket.preferences)))).longValue();
        ro6Var.b(preferencesBucket.version, "preferences");
        ghf0Var.s.c.d(e9h0.payload_personal_preferences_changed, Boolean.TRUE);
    }

    public final void w(long j, long j2, UpdateFields updateFields) {
        long j3;
        ndz0 ndz0Var = this.D;
        by10 by10Var = ndz0Var.d;
        boolean isStarred = updateFields.isStarred();
        ph9 ph9Var = ndz0Var.k;
        az10 az10Var = ndz0Var.c;
        Iterator it = az10Var.A(j, j2).iterator();
        while (it.hasNext()) {
            fz10 fz10Var = (fz10) it.next();
            long j4 = fz10Var.a;
            long j5 = fz10Var.b;
            Iterator it2 = it;
            if (isStarred) {
                if (!wkb1.k(j5, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
                    j3 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID | j5;
                }
                j3 = j5;
            } else {
                if (wkb1.k(j5, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
                    j3 = 9223372036854774783L & j5;
                }
                j3 = j5;
            }
            if (j5 != j3) {
                long j6 = j3;
                ((Number) a.b(by10Var.a, false, true, new j2b(7, j6, j4))).intValue();
                az10Var.g0(j4, j6);
                ph9Var.h(j, new jaz0(az10Var.l(j, j4)));
                ph9Var.e(j, j2);
                it = it2;
                isStarred = isStarred;
            } else {
                it = it2;
            }
        }
        Boolean urlPreviewDisabled = updateFields.urlPreviewDisabled();
        yab i = alb1.i(ndz0Var.c, ndz0Var.h, j, j2);
        try {
            if (i.moveToNext()) {
                MessageData R = i.R();
                R.urlPreviewDisabled = urlPreviewDisabled;
                String json2 = ndz0Var.p.toJson(R);
                long G = i.G();
                by10Var.d(G, json2);
                ph9Var.h(j, alb1.j(ndz0Var.c, j, G, json2));
                ph9Var.e(j, j2);
            }
            i.close();
        } finally {
        }
    }

    public final void w0(PinnedChatsBucket pinnedChatsBucket) {
        ghf0 ghf0Var = this.E;
        ph9 ph9Var = ghf0Var.s;
        ro6 ro6Var = ghf0Var.g;
        s2c0 s2c0Var = ghf0Var.i;
        String[] strArr = (String[]) a.b(s2c0Var.a, true, false, new fnb0(7));
        RoomDatabase roomDatabase = s2c0Var.a;
        if (Arrays.equals(pinnedChatsBucket.value.pinnedChats, strArr)) {
            long a = ro6Var.a("pinned_chats");
            long j = pinnedChatsBucket.version;
            if (a < j) {
                ro6Var.b(j, "pinned_chats");
                return;
            }
            return;
        }
        String[] strArr2 = pinnedChatsBucket.value.pinnedChats;
        ro6Var.b(pinnedChatsBucket.version, "pinned_chats");
        ((Number) a.b(roomDatabase, false, true, new fnb0(8))).intValue();
        if (strArr2 != null) {
            ArrayList arrayList = new ArrayList();
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                arrayList.add(new t2c0(strArr2[i], i));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z83.h(null, ((Number) a.b(roomDatabase, false, true, new ww90(22, s2c0Var, (t2c0) it.next()))).longValue() != -1);
            }
        }
        String[] strArr3 = pinnedChatsBucket.value.pinnedChats;
        ph9Var.getClass();
        for (String str : strArr) {
            ph9Var.f(str);
        }
        for (String str2 : strArr3) {
            ph9Var.f(str2);
        }
        if (ph9Var.s == null) {
            HashSet hashSet = new HashSet();
            ph9Var.s = hashSet;
            ph9Var.c.d(e9h0.payload_pin_chats_changes, hashSet);
        }
    }

    public final void x0(PrivacyBucket privacyBucket) {
        ghf0 ghf0Var = this.E;
        t3f0 t3f0Var = ghf0Var.f;
        PrivacyBucket.Value value = privacyBucket.value;
        t3f0Var.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PrivacyBucket.CallsPrivacyData(value.calls));
        arrayList.add(new PrivacyBucket.InvitesPrivacyData(value.invites));
        arrayList.add(new PrivacyBucket.OnlineStatusPrivacyData(value.onlineStatus));
        arrayList.add(new PrivacyBucket.PrivateChatsPrivacyData(value.privateChats));
        arrayList.add(new PrivacyBucket.SearchPrivacyData(value.search));
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PrivacyBucket.PrivacyData privacyData = (PrivacyBucket.PrivacyData) it.next();
            arrayList2.add(new v3f0((String) privacyData.a(new y3f0()), privacyData.a));
        }
        t3f0Var.c(arrayList2);
        ghf0Var.g.b(privacyBucket.version, "privacy");
        ph9 ph9Var = ghf0Var.s;
        if (ph9Var.u == null) {
            ph9Var.u = Boolean.TRUE;
        }
        ph9Var.c.d(e9h0.payload_privacy_changed, ph9Var.u);
    }

    public final void z0(long j, long j2, ReducedMessage reducedMessage) {
        long j3 = reducedMessage.c;
        ndz0 ndz0Var = this.D;
        ndz0Var.getClass();
        z83.h(null, j2 > 0);
        yab i = alb1.i(ndz0Var.c, ndz0Var.h, j, j2);
        try {
            if (!i.moveToFirst()) {
                i.close();
                return;
            }
            long G = i.G();
            ((Number) a.b(ndz0Var.d.a, false, true, new j2b(16, j3, G))).intValue();
            az10 az10Var = ndz0Var.c;
            az10Var.k0(G, j3);
            ndz0Var.k.h(j, new jaz0(az10Var.l(j, G)));
            i.close();
        } finally {
        }
    }
}
