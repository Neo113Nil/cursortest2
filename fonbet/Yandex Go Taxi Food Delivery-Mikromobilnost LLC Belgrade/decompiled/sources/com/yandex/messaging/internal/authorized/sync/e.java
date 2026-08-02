package com.yandex.messaging.internal.authorized.sync;

import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.core.net.entities.FoldersBucket;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.yandex.messaging.core.net.entities.MiniappsBucket;
import com.yandex.messaging.core.net.entities.PinnedChatsBucket;
import com.yandex.messaging.core.net.entities.PreferencesBucket;
import com.yandex.messaging.core.net.entities.PrivacyBucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import com.yandex.messaging.core.net.entities.UserStatusPresetBucket;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.PinnedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.PrivateChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import defpackage.a3b;
import defpackage.ab51;
import defpackage.aj20;
import defpackage.at2;
import defpackage.bdu0;
import defpackage.bv21;
import defpackage.c051;
import defpackage.dia0;
import defpackage.doc;
import defpackage.e9h0;
import defpackage.g8e;
import defpackage.ghf0;
import defpackage.glf;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.h9b;
import defpackage.hlf;
import defpackage.ike;
import defpackage.il01;
import defpackage.iv21;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jzy0;
import defpackage.k020;
import defpackage.kse;
import defpackage.l020;
import defpackage.l5b0;
import defpackage.ld60;
import defpackage.m5b0;
import defpackage.m8g;
import defpackage.ml21;
import defpackage.ney0;
import defpackage.nqi0;
import defpackage.ny61;
import defpackage.oab;
import defpackage.oo31;
import defpackage.pzt0;
import defpackage.r0x0;
import defpackage.s020;
import defpackage.s5b0;
import defpackage.t0x0;
import defpackage.tcc;
import defpackage.to3;
import defpackage.u0x0;
import defpackage.u5b;
import defpackage.v5z;
import defpackage.vgu;
import defpackage.vh10;
import defpackage.vmu;
import defpackage.vr;
import defpackage.wlu;
import defpackage.wmu;
import defpackage.x22;
import defpackage.xqi0;
import defpackage.yef0;
import defpackage.z83;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class e implements u0x0 {
    public final yef0 A;
    public final h3y B;
    public final v5z C;
    public final x22 D;
    public final com.yandex.messaging.utils.b E;
    public final h3y F;
    public final ike G;
    public pzt0 H;
    public boolean I = true;
    public final wlu a;
    public final jzy0 b;
    public final k020 c;
    public final vgu d;
    public final u5b e;
    public final h9b f;
    public final h3y g;
    public final aj20 h;
    public final at2 i;
    public final a j;
    public final ld60 k;
    public final r0x0 l;
    public final Looper m;
    public final ney0 n;
    public final com.yandex.messaging.domain.experiments.a o;
    public final ab51 p;
    public final glf q;
    public final doc r;
    public final to3 s;
    public final c051 t;
    public final com.yandex.messaging.internal.storage.folders.d u;
    public final vmu v;
    public final s5b0 w;
    public final vr x;
    public final ml21 y;
    public final xqi0 z;

    public e(wlu wluVar, jzy0 jzy0Var, k020 k020Var, vgu vguVar, u5b u5bVar, h9b h9bVar, h3y h3yVar, aj20 aj20Var, at2 at2Var, a aVar, ld60 ld60Var, r0x0 r0x0Var, Looper looper, kse kseVar, ney0 ney0Var, com.yandex.messaging.domain.experiments.a aVar2, ab51 ab51Var, glf glfVar, doc docVar, to3 to3Var, c051 c051Var, com.yandex.messaging.internal.storage.folders.d dVar, vmu vmuVar, s5b0 s5b0Var, vr vrVar, ml21 ml21Var, xqi0 xqi0Var, yef0 yef0Var, h3y h3yVar2, v5z v5zVar, x22 x22Var, com.yandex.messaging.utils.b bVar, h3y h3yVar3) {
        this.a = wluVar;
        this.b = jzy0Var;
        this.c = k020Var;
        this.d = vguVar;
        this.e = u5bVar;
        this.f = h9bVar;
        this.g = h3yVar;
        this.h = aj20Var;
        this.i = at2Var;
        this.j = aVar;
        this.k = ld60Var;
        this.l = r0x0Var;
        this.m = looper;
        this.n = ney0Var;
        this.o = aVar2;
        this.p = ab51Var;
        this.q = glfVar;
        this.r = docVar;
        this.s = to3Var;
        this.t = c051Var;
        this.u = dVar;
        this.v = vmuVar;
        this.w = s5b0Var;
        this.x = vrVar;
        this.y = ml21Var;
        this.z = xqi0Var;
        this.A = yef0Var;
        this.B = h3yVar2;
        this.C = v5zVar;
        this.D = x22Var;
        this.E = bVar;
        this.F = h3yVar3;
        this.G = g8e.f(kseVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0215 A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:12:0x01ec, B:15:0x0202, B:17:0x0215, B:19:0x0223, B:20:0x0232, B:22:0x023d, B:23:0x022a, B:25:0x022e, B:28:0x0246, B:30:0x0253, B:32:0x025d, B:33:0x026a, B:35:0x0270, B:37:0x027e, B:39:0x028a, B:41:0x0292, B:45:0x0299, B:46:0x02a6, B:48:0x02ac, B:50:0x02ba, B:53:0x02c4, B:59:0x02c8, B:61:0x02cf, B:62:0x02d2, B:64:0x030a, B:65:0x0320), top: B:11:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0253 A[Catch: all -> 0x0226, LOOP:1: B:29:0x0251->B:30:0x0253, LOOP_END, TryCatch #0 {all -> 0x0226, blocks: (B:12:0x01ec, B:15:0x0202, B:17:0x0215, B:19:0x0223, B:20:0x0232, B:22:0x023d, B:23:0x022a, B:25:0x022e, B:28:0x0246, B:30:0x0253, B:32:0x025d, B:33:0x026a, B:35:0x0270, B:37:0x027e, B:39:0x028a, B:41:0x0292, B:45:0x0299, B:46:0x02a6, B:48:0x02ac, B:50:0x02ba, B:53:0x02c4, B:59:0x02c8, B:61:0x02cf, B:62:0x02d2, B:64:0x030a, B:65:0x0320), top: B:11:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0270 A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:12:0x01ec, B:15:0x0202, B:17:0x0215, B:19:0x0223, B:20:0x0232, B:22:0x023d, B:23:0x022a, B:25:0x022e, B:28:0x0246, B:30:0x0253, B:32:0x025d, B:33:0x026a, B:35:0x0270, B:37:0x027e, B:39:0x028a, B:41:0x0292, B:45:0x0299, B:46:0x02a6, B:48:0x02ac, B:50:0x02ba, B:53:0x02c4, B:59:0x02c8, B:61:0x02cf, B:62:0x02d2, B:64:0x030a, B:65:0x0320), top: B:11:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ac A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:12:0x01ec, B:15:0x0202, B:17:0x0215, B:19:0x0223, B:20:0x0232, B:22:0x023d, B:23:0x022a, B:25:0x022e, B:28:0x0246, B:30:0x0253, B:32:0x025d, B:33:0x026a, B:35:0x0270, B:37:0x027e, B:39:0x028a, B:41:0x0292, B:45:0x0299, B:46:0x02a6, B:48:0x02ac, B:50:0x02ba, B:53:0x02c4, B:59:0x02c8, B:61:0x02cf, B:62:0x02d2, B:64:0x030a, B:65:0x0320), top: B:11:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02cf A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:12:0x01ec, B:15:0x0202, B:17:0x0215, B:19:0x0223, B:20:0x0232, B:22:0x023d, B:23:0x022a, B:25:0x022e, B:28:0x0246, B:30:0x0253, B:32:0x025d, B:33:0x026a, B:35:0x0270, B:37:0x027e, B:39:0x028a, B:41:0x0292, B:45:0x0299, B:46:0x02a6, B:48:0x02ac, B:50:0x02ba, B:53:0x02c4, B:59:0x02c8, B:61:0x02cf, B:62:0x02d2, B:64:0x030a, B:65:0x0320), top: B:11:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030a A[Catch: all -> 0x0226, TryCatch #0 {all -> 0x0226, blocks: (B:12:0x01ec, B:15:0x0202, B:17:0x0215, B:19:0x0223, B:20:0x0232, B:22:0x023d, B:23:0x022a, B:25:0x022e, B:28:0x0246, B:30:0x0253, B:32:0x025d, B:33:0x026a, B:35:0x0270, B:37:0x027e, B:39:0x028a, B:41:0x0292, B:45:0x0299, B:46:0x02a6, B:48:0x02ac, B:50:0x02ba, B:53:0x02c4, B:59:0x02c8, B:61:0x02cf, B:62:0x02d2, B:64:0x030a, B:65:0x0320), top: B:11:0x01ec }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, long j, HistoryResponse historyResponse, BucketsData bucketsData, ArrayList arrayList, ContinuationImpl continuationImpl) {
        HistorySyncer$handleResponse$1 historySyncer$handleResponse$1;
        int i;
        ChatHistoryResponse[] chatHistoryResponseArr;
        e eVar2;
        List list;
        BucketsData bucketsData2;
        List list2;
        HistoryResponse historyResponse2;
        long j2;
        ChatInfoFromTransport chatInfoFromTransport;
        PinnedMessageInfo pinnedMessageInfo;
        ChatRole chatRole;
        Collection collection;
        int length;
        int i2;
        long j3;
        ghf0 ghf0Var;
        ChatHistoryResponse[] chatHistoryResponseArr2;
        boolean z;
        boolean z2;
        List J0;
        int i3;
        String b;
        ReducedUserInfo reducedUserInfo;
        ChatHistoryResponse[] chatHistoryResponseArr3;
        m5b0 m5b0Var;
        long version;
        eVar.getClass();
        try {
            if (continuationImpl instanceof HistorySyncer$handleResponse$1) {
                historySyncer$handleResponse$1 = (HistorySyncer$handleResponse$1) continuationImpl;
                int i4 = historySyncer$handleResponse$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    historySyncer$handleResponse$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = historySyncer$handleResponse$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = historySyncer$handleResponse$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        z83.g(null, eVar.m, Looper.myLooper());
                        ChatHistoryResponse[] chatHistoryResponseArr4 = historyResponse.chats;
                        if (chatHistoryResponseArr4 == null) {
                            chatHistoryResponseArr4 = new ChatHistoryResponse[0];
                        }
                        chatHistoryResponseArr = chatHistoryResponseArr4;
                        ArrayList arrayList2 = new ArrayList();
                        for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr) {
                            ChatRole chatRole2 = chatHistoryResponse.myRole;
                            if (chatRole2 != null && chatRole2.role == 3) {
                                arrayList2.add(chatHistoryResponse);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (ChatHistoryResponse chatHistoryResponse2 : chatHistoryResponseArr) {
                            ChatRole chatRole3 = chatHistoryResponse2.myRole;
                            if (chatRole3 == null || chatRole3.role != 3) {
                                arrayList3.add(chatHistoryResponse2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a3b a3bVar = (a3b) it.next();
                            arrayList4.add(new Pair(a3bVar.a, a3bVar));
                        }
                        Map s = kotlin.collections.b.s(arrayList4);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            ChatHistoryResponse chatHistoryResponse3 = (ChatHistoryResponse) next;
                            a3b a3bVar2 = (a3b) s.get(chatHistoryResponse3.chatId);
                            if (a3bVar2 != null) {
                                if (jl40.l(chatHistoryResponse3.chatId, a3bVar2.a)) {
                                    ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse3.messages;
                                    if ((outMessageArr == null || outMessageArr.length == 0) && (((chatInfoFromTransport = chatHistoryResponse3.chatInfo) == null || Long.valueOf(chatInfoFromTransport.participantsCount).equals(a3bVar2.i)) && ((chatHistoryResponse3.partnerInfo == null || !ChatNamespaces.a(chatHistoryResponse3.chatId)) && (((pinnedMessageInfo = chatHistoryResponse3.pinnedMessageInfo) == null || Long.valueOf(pinnedMessageInfo.timestamp).equals(a3bVar2.k)) && (((chatRole = chatHistoryResponse3.myRole) == null || Long.valueOf(chatRole.version).equals(a3bVar2.l)) && a3bVar2.j == chatHistoryResponse3.approvedByMe && a3bVar2.h == chatHistoryResponse3.lastEditTimestamp && a3bVar2.d == chatHistoryResponse3.otherSeenMarker && a3bVar2.c == chatHistoryResponse3.ownerLastSeenSequenceNumber && a3bVar2.b == chatHistoryResponse3.ownerSeenMarker))))) {
                                        Long l = a3bVar2.g;
                                        long j4 = chatHistoryResponse3.minMessageTimestamp;
                                        if (l != null && l.longValue() == j4) {
                                        }
                                    }
                                } else {
                                    z83.i();
                                }
                            }
                            arrayList5.add(next);
                        }
                        eVar.v.a("chats_calculated");
                        historySyncer$handleResponse$1.L$0 = eVar;
                        historySyncer$handleResponse$1.L$1 = historyResponse;
                        historySyncer$handleResponse$1.L$2 = bucketsData;
                        historySyncer$handleResponse$1.L$3 = chatHistoryResponseArr;
                        historySyncer$handleResponse$1.L$4 = arrayList2;
                        historySyncer$handleResponse$1.L$5 = arrayList3;
                        historySyncer$handleResponse$1.L$6 = arrayList5;
                        historySyncer$handleResponse$1.J$0 = j;
                        historySyncer$handleResponse$1.label = 1;
                        Serializable f = eVar.f(arrayList3, arrayList, historySyncer$handleResponse$1);
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        eVar2 = eVar;
                        list = arrayList3;
                        bucketsData2 = bucketsData;
                        obj = f;
                        list2 = arrayList5;
                        historyResponse2 = historyResponse;
                        j2 = j;
                        collection = arrayList2;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = historySyncer$handleResponse$1.J$0;
                        list2 = (List) historySyncer$handleResponse$1.L$6;
                        list = (List) historySyncer$handleResponse$1.L$5;
                        Collection collection2 = (List) historySyncer$handleResponse$1.L$4;
                        chatHistoryResponseArr = (ChatHistoryResponse[]) historySyncer$handleResponse$1.L$3;
                        bucketsData2 = (BucketsData) historySyncer$handleResponse$1.L$2;
                        historyResponse2 = (HistoryResponse) historySyncer$handleResponse$1.L$1;
                        eVar2 = (e) historySyncer$handleResponse$1.L$0;
                        kotlin.b.b(obj);
                        collection = collection2;
                    }
                    ChatData[] chatDataArr = (ChatData[]) obj;
                    vmu vmuVar = eVar2.v;
                    h9b h9bVar = eVar2.f;
                    k020 k020Var = eVar2.c;
                    vmuVar.a("chats_missed_loaded");
                    kotlinx.coroutines.a.k(historySyncer$handleResponse$1.get_context());
                    vmuVar.a("chats_coroutine_check");
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = j2;
                    boolean a = eVar2.E.a();
                    l020 C = k020Var.C();
                    long j5 = j2;
                    List<ChatHistoryResponse> list3 = list2;
                    C.z.c.d(e9h0.payload_update_without_notifications, Boolean.TRUE);
                    boolean z3 = j5 != 0;
                    vmuVar.a("chats_db_started");
                    h(C, historyResponse2.users, chatHistoryResponseArr);
                    vmuVar.a("chats_db_users_updated");
                    length = chatHistoryResponseArr.length;
                    i2 = 0;
                    Collection collection3 = collection;
                    while (i2 < length) {
                        int i5 = length;
                        ChatHistoryResponse chatHistoryResponse4 = chatHistoryResponseArr[i2];
                        int i6 = i2;
                        ChatInfoFromTransport chatInfoFromTransport2 = chatHistoryResponse4.chatInfo;
                        List list4 = list;
                        Collection collection4 = collection3;
                        if (chatInfoFromTransport2 != null) {
                            version = chatInfoFromTransport2.version;
                        } else {
                            PrivateChatInfoFromTransport privateChatInfoFromTransport = chatHistoryResponse4.privateChatInfo;
                            if (privateChatInfoFromTransport != null) {
                                version = privateChatInfoFromTransport.getVersion();
                            } else {
                                i2 = i6 + 1;
                                list = list4;
                                collection3 = collection4;
                                length = i5;
                            }
                        }
                        C.P(chatHistoryResponse4, z3);
                        ref$LongRef.element = Math.max(ref$LongRef.element, version);
                        i2 = i6 + 1;
                        list = list4;
                        collection3 = collection4;
                        length = i5;
                    }
                    List list5 = list;
                    Collection<ChatHistoryResponse> collection5 = collection3;
                    vmuVar.a("chats_db_chatInfo_updated");
                    for (ChatData chatData : chatDataArr) {
                        C.B.d(chatData, z3);
                    }
                    vmuVar.a("chats_db_missed_updated");
                    for (ChatHistoryResponse chatHistoryResponse5 : collection5) {
                        s020 e = h9bVar.e(chatHistoryResponse5.chatId);
                        if (e != null && (m5b0Var = (m5b0) ((m8g) e).O.get()) != null) {
                            m5b0Var.c(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                        }
                        C.d(chatHistoryResponse5.chatId, false);
                    }
                    vmuVar.a("chats_db_gone_updated");
                    for (ChatHistoryResponse chatHistoryResponse6 : list3) {
                        s020 e2 = h9bVar.e(chatHistoryResponse6.chatId);
                        oab d = e2 != null ? ((m8g) e2).d() : null;
                        if (d != null) {
                            d.j(C, chatHistoryResponse6, a);
                        }
                    }
                    vmuVar.a("chats_db_changed_updated");
                    if (bucketsData2 != null) {
                        eVar2.g(C, bucketsData2);
                    }
                    vmuVar.a("chats_db_buckets_updated");
                    long d2 = d(list5);
                    long e3 = e(list5);
                    C.e(d2);
                    C.n(e3);
                    j3 = ref$LongRef.element;
                    ghf0Var = C.E;
                    if (j3 > ((Number) androidx.room.util.a.b(ghf0Var.o.b.A().a, true, false, new nqi0(21))).longValue()) {
                        ((Number) androidx.room.util.a.b(ghf0Var.c.a, false, true, new vh10(j3, 22))).intValue();
                    }
                    vmuVar.a("chats_db_versions_updated");
                    C.s();
                    C.close();
                    vmuVar.a("chats_db_commited");
                    bv21 a2 = eVar2.i.a();
                    SetBuilder setBuilder = new SetBuilder();
                    if (((iv21) eVar2.F.get()).c) {
                        v5z v5zVar = eVar2.C;
                        v5zVar.getClass();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        ReducedUserInfo[] reducedUserInfoArr = historyResponse2.users;
                        if (reducedUserInfoArr != null) {
                            for (ReducedUserInfo reducedUserInfo2 : reducedUserInfoArr) {
                                v5zVar.a(reducedUserInfo2, linkedHashSet);
                            }
                        }
                        ChatHistoryResponse[] chatHistoryResponseArr5 = historyResponse2.chats;
                        if (chatHistoryResponseArr5 != null) {
                            int length2 = chatHistoryResponseArr5.length;
                            int i7 = 0;
                            while (i7 < length2) {
                                ChatHistoryResponse chatHistoryResponse7 = chatHistoryResponseArr5[i7];
                                ChatHistoryResponse.OutMessage[] outMessageArr2 = chatHistoryResponse7.messages;
                                if (outMessageArr2 != null) {
                                    int length3 = outMessageArr2.length;
                                    chatHistoryResponseArr3 = chatHistoryResponseArr5;
                                    int i8 = 0;
                                    while (i8 < length3) {
                                        int i9 = i8;
                                        v5zVar.b(outMessageArr2[i9].serverMessage, linkedHashSet);
                                        i8 = i9 + 1;
                                    }
                                } else {
                                    chatHistoryResponseArr3 = chatHistoryResponseArr5;
                                }
                                ReducedUserInfo reducedUserInfo3 = chatHistoryResponse7.partnerInfo;
                                if (reducedUserInfo3 != null) {
                                    v5zVar.a(reducedUserInfo3, linkedHashSet);
                                }
                                ServerMessage serverMessage = chatHistoryResponse7.threadParentMessage;
                                if (serverMessage != null) {
                                    v5zVar.b(serverMessage, linkedHashSet);
                                }
                                i7++;
                                chatHistoryResponseArr5 = chatHistoryResponseArr3;
                            }
                        }
                        setBuilder.addAll(linkedHashSet);
                    }
                    chatHistoryResponseArr2 = historyResponse2.chats;
                    if (chatHistoryResponseArr2 == null) {
                        ArrayList arrayList6 = new ArrayList();
                        for (ChatHistoryResponse chatHistoryResponse8 : chatHistoryResponseArr2) {
                            if (chatHistoryResponse8 == null || (reducedUserInfo = chatHistoryResponse8.partnerInfo) == null || (b = reducedUserInfo.userId) == null) {
                                b = k020Var.b(chatHistoryResponse8.chatId);
                            }
                            if (b != null) {
                                arrayList6.add(b);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (!((Boolean) androidx.room.util.a.b(a2.a, true, false, new il01((String) next2, 21))).booleanValue()) {
                                arrayList7.add(next2);
                            }
                        }
                        z = false;
                        z2 = true;
                        setBuilder.addAll(arrayList7);
                    } else {
                        z = false;
                        z2 = true;
                    }
                    J0 = kotlin.collections.a.J0(setBuilder.b());
                    if (J0.isEmpty()) {
                        J0 = null;
                    }
                    if (J0 != null) {
                        eVar2.h.a(J0);
                    }
                    vmuVar.a("chats_missed_users_calculated");
                    ld60 ld60Var = eVar2.k;
                    i3 = ld60Var.a.getInt("no_scheme_objects_version", -1);
                    if (i3 <= 9) {
                        z = z2;
                    }
                    z83.h(null, z);
                    if (i3 != 9) {
                        SharedPreferences.Editor edit = ld60Var.a.edit();
                        edit.putInt("no_scheme_objects_version", 9);
                        edit.apply();
                    }
                    return new wmu(chatDataArr.length, list3.size(), ref$LongRef.element);
                }
            }
            List<ChatHistoryResponse> list32 = list2;
            C.z.c.d(e9h0.payload_update_without_notifications, Boolean.TRUE);
            if (j5 != 0) {
            }
            vmuVar.a("chats_db_started");
            h(C, historyResponse2.users, chatHistoryResponseArr);
            vmuVar.a("chats_db_users_updated");
            length = chatHistoryResponseArr.length;
            i2 = 0;
            Collection collection32 = collection;
            while (i2 < length) {
            }
            List list52 = list;
            Collection<ChatHistoryResponse> collection52 = collection32;
            vmuVar.a("chats_db_chatInfo_updated");
            while (r2 < r1) {
            }
            vmuVar.a("chats_db_missed_updated");
            while (r0.hasNext()) {
            }
            vmuVar.a("chats_db_gone_updated");
            while (r0.hasNext()) {
            }
            vmuVar.a("chats_db_changed_updated");
            if (bucketsData2 != null) {
            }
            vmuVar.a("chats_db_buckets_updated");
            long d22 = d(list52);
            long e32 = e(list52);
            C.e(d22);
            C.n(e32);
            j3 = ref$LongRef.element;
            ghf0Var = C.E;
            if (j3 > ((Number) androidx.room.util.a.b(ghf0Var.o.b.A().a, true, false, new nqi0(21))).longValue()) {
            }
            vmuVar.a("chats_db_versions_updated");
            C.s();
            C.close();
            vmuVar.a("chats_db_commited");
            bv21 a22 = eVar2.i.a();
            SetBuilder setBuilder2 = new SetBuilder();
            if (((iv21) eVar2.F.get()).c) {
            }
            chatHistoryResponseArr2 = historyResponse2.chats;
            if (chatHistoryResponseArr2 == null) {
            }
            J0 = kotlin.collections.a.J0(setBuilder2.b());
            if (J0.isEmpty()) {
            }
            if (J0 != null) {
            }
            vmuVar.a("chats_missed_users_calculated");
            ld60 ld60Var2 = eVar2.k;
            i3 = ld60Var2.a.getInt("no_scheme_objects_version", -1);
            if (i3 <= 9) {
            }
            z83.h(null, z);
            if (i3 != 9) {
            }
            return new wmu(chatDataArr.length, list32.size(), ref$LongRef.element);
        } finally {
        }
        historySyncer$handleResponse$1 = new HistorySyncer$handleResponse$1(eVar, continuationImpl);
        Object obj2 = historySyncer$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = historySyncer$handleResponse$1.label;
        if (i != 0) {
        }
        ChatData[] chatDataArr2 = (ChatData[]) obj2;
        vmu vmuVar2 = eVar2.v;
        h9b h9bVar2 = eVar2.f;
        k020 k020Var2 = eVar2.c;
        vmuVar2.a("chats_missed_loaded");
        kotlinx.coroutines.a.k(historySyncer$handleResponse$1.get_context());
        vmuVar2.a("chats_coroutine_check");
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = j2;
        boolean a3 = eVar2.E.a();
        l020 C2 = k020Var2.C();
        long j52 = j2;
    }

    public static final Object b(e eVar, t0x0 t0x0Var, Continuation continuation) {
        eVar.getClass();
        Object O = jl40.O(new HistorySyncer$performSyncImpl$2(eVar, t0x0Var, null), continuation);
        return O == CoroutineSingletons.COROUTINE_SUSPENDED ? O : zy11.a;
    }

    public static final void c(e eVar, HistoryResponse historyResponse) {
        s020 e;
        int length;
        l020 C = eVar.c.C();
        try {
            int i = 0;
            int i2 = 1;
            List list = (List) androidx.room.util.a.b(eVar.i.o().a, true, false, new dia0(14));
            ChatHistoryResponse[] chatHistoryResponseArr = historyResponse.chats;
            if (chatHistoryResponseArr != null) {
                int length2 = chatHistoryResponseArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    ChatHistoryResponse chatHistoryResponse = chatHistoryResponseArr[i3];
                    long[] jArr = chatHistoryResponse.personalMentions;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (jl40.l(((l5b0) obj).b, chatHistoryResponse.chatId)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((l5b0) it.next()).c));
                    }
                    Collection collection = EmptySet.a;
                    if (jArr != null && (length = jArr.length) != 0) {
                        if (length != i2) {
                            collection = new LinkedHashSet(gw00.d(jArr.length));
                            int length3 = jArr.length;
                            for (int i4 = i; i4 < length3; i4++) {
                                collection.add(Long.valueOf(jArr[i4]));
                            }
                        } else {
                            collection = Collections.singleton(Long.valueOf(jArr[i]));
                        }
                    }
                    if (!collection.equals(kotlin.collections.a.N0(arrayList2)) && (e = eVar.f.e(chatHistoryResponse.chatId)) != null) {
                        m5b0 m5b0Var = (m5b0) ((m8g) e).O.get();
                        m5b0Var.c(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                        if (jArr != null) {
                            ArrayList arrayList3 = new ArrayList();
                            int length4 = jArr.length;
                            for (int i5 = i; i5 < length4; i5++) {
                                long j = jArr[i5];
                                if (j > chatHistoryResponse.ownerSeenMarker) {
                                    arrayList3.add(Long.valueOf(j));
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                m5b0Var.a(kotlin.collections.a.N0(arrayList3));
                            }
                        }
                        C.z.a(((m8g) e).a.a);
                    }
                    i3++;
                    i = 0;
                    i2 = 1;
                }
            }
            C.s();
            C.close();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long d(List list) {
        long j;
        long j2;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Iterator it = list.iterator();
        Long l = null;
        if (it.hasNext()) {
            ChatHistoryResponse.OutMessage[] outMessageArr = ((ChatHistoryResponse) it.next()).messages;
            if (outMessageArr != null) {
                if (outMessageArr.length == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(outMessageArr[0].serverMessage.serverMessageInfo.timestamp);
                    int length = outMessageArr.length - 1;
                    if (1 <= length) {
                        int i = 1;
                        while (true) {
                            Long valueOf4 = Long.valueOf(outMessageArr[i].serverMessage.serverMessageInfo.timestamp);
                            if (valueOf3.compareTo(valueOf4) < 0) {
                                valueOf3 = valueOf4;
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                if (valueOf3 != null) {
                    j = valueOf3.longValue();
                    Long valueOf5 = Long.valueOf(j);
                    while (it.hasNext()) {
                        ChatHistoryResponse.OutMessage[] outMessageArr2 = ((ChatHistoryResponse) it.next()).messages;
                        if (outMessageArr2 != null) {
                            if (outMessageArr2.length == 0) {
                                valueOf2 = null;
                            } else {
                                valueOf2 = Long.valueOf(outMessageArr2[0].serverMessage.serverMessageInfo.timestamp);
                                int length2 = outMessageArr2.length - 1;
                                if (1 <= length2) {
                                    int i2 = 1;
                                    while (true) {
                                        Long valueOf6 = Long.valueOf(outMessageArr2[i2].serverMessage.serverMessageInfo.timestamp);
                                        if (valueOf2.compareTo(valueOf6) < 0) {
                                            valueOf2 = valueOf6;
                                        }
                                        if (i2 == length2) {
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            if (valueOf2 != null) {
                                j2 = valueOf2.longValue();
                                valueOf = Long.valueOf(j2);
                                if (valueOf5.compareTo(valueOf) >= 0) {
                                    valueOf5 = valueOf;
                                }
                            }
                        }
                        j2 = 0;
                        valueOf = Long.valueOf(j2);
                        if (valueOf5.compareTo(valueOf) >= 0) {
                        }
                    }
                    l = valueOf5;
                }
            }
            j = 0;
            Long valueOf52 = Long.valueOf(j);
            while (it.hasNext()) {
            }
            l = valueOf52;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static long e(List list) {
        Long l;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ChatRole chatRole = ((ChatHistoryResponse) it.next()).myRole;
            Long valueOf = Long.valueOf(chatRole != null ? chatRole.version : 0L);
            while (it.hasNext()) {
                ChatRole chatRole2 = ((ChatHistoryResponse) it.next()).myRole;
                Long valueOf2 = Long.valueOf(chatRole2 != null ? chatRole2.version : 0L);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static void h(l020 l020Var, ReducedUserInfo[] reducedUserInfoArr, ChatHistoryResponse[] chatHistoryResponseArr) {
        LinkedHashSet linkedHashSet;
        if (reducedUserInfoArr != null) {
            List d0 = j73.d0(reducedUserInfoArr);
            Iterator it = d0.iterator();
            while (it.hasNext()) {
                l020Var.Q0((ReducedUserInfo) it.next(), 0);
            }
            linkedHashSet = new LinkedHashSet();
            Iterator it2 = d0.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(((ReducedUserInfo) it2.next()).userId);
            }
        } else {
            linkedHashSet = new LinkedHashSet();
        }
        if (chatHistoryResponseArr != null) {
            ArrayList arrayList = new ArrayList();
            for (ChatHistoryResponse chatHistoryResponse : chatHistoryResponseArr) {
                ReducedUserInfo reducedUserInfo = chatHistoryResponse.partnerInfo;
                if (reducedUserInfo != null) {
                    arrayList.add(reducedUserInfo);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ReducedUserInfo reducedUserInfo2 = (ReducedUserInfo) it3.next();
                if (linkedHashSet.add(reducedUserInfo2.userId)) {
                    l020Var.Q0(reducedUserInfo2, 0);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(ArrayList arrayList, List list, ContinuationImpl continuationImpl) {
        HistorySyncer$loadMissedChats$1 historySyncer$loadMissedChats$1;
        int i;
        if (continuationImpl instanceof HistorySyncer$loadMissedChats$1) {
            historySyncer$loadMissedChats$1 = (HistorySyncer$loadMissedChats$1) continuationImpl;
            int i2 = historySyncer$loadMissedChats$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                historySyncer$loadMissedChats$1.label = i2 - Integer.MIN_VALUE;
                Object obj = historySyncer$loadMissedChats$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = historySyncer$loadMissedChats$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    for (Object obj2 : arrayList) {
                        ChatHistoryResponse chatHistoryResponse = (ChatHistoryResponse) obj2;
                        if (chatHistoryResponse.chatInfo == null && chatHistoryResponse.privateChatInfo == null) {
                            t.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(t, 10));
                    Iterator it = t.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ChatHistoryResponse) it.next()).chatId);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list) {
                        if (!ChatFlags.a(((a3b) obj3).f, 64L)) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((a3b) it2.next()).a);
                    }
                    LinkedHashSet y0 = kotlin.collections.a.y0(arrayList2, kotlin.collections.a.N0(arrayList4));
                    if (y0.isEmpty()) {
                        return new ChatData[0];
                    }
                    this.v.a("chats_missed_calculated");
                    historySyncer$loadMissedChats$1.label = 1;
                    obj = this.j.a(y0, historySyncer$loadMissedChats$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ?? r13 = (ChatData[]) obj;
                return r13 != 0 ? new ChatData[0] : r13;
            }
        }
        historySyncer$loadMissedChats$1 = new HistorySyncer$loadMissedChats$1(this, continuationImpl);
        Object obj4 = historySyncer$loadMissedChats$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = historySyncer$loadMissedChats$1.label;
        if (i != 0) {
        }
        ?? r132 = (ChatData[]) obj4;
        if (r132 != 0) {
        }
    }

    public final void g(l020 l020Var, BucketsData bucketsData) {
        Bucket a = bucketsData.a(StickerPacksBucket.class);
        if (a != null) {
            StickerPacksBucket stickerPacksBucket = (StickerPacksBucket) a;
            bdu0 bdu0Var = (bdu0) this.g.get();
            if (bdu0Var != null) {
                bdu0Var.b(stickerPacksBucket);
            }
        }
        Bucket a2 = bucketsData.a(RestrictionsBucket.class);
        if (a2 != null) {
            l020Var.H0((RestrictionsBucket) a2);
        }
        Bucket a3 = bucketsData.a(PrivacyBucket.class);
        if (a3 != null) {
            l020Var.x0((PrivacyBucket) a3);
        }
        Bucket a4 = bucketsData.a(ChatMutingsBucket.class);
        if (a4 != null) {
            z83.g(null, this.e.c, Looper.myLooper());
            l020Var.T((ChatMutingsBucket) a4);
        }
        Bucket a5 = bucketsData.a(PinnedChatsBucket.class);
        if (a5 != null) {
            l020Var.w0((PinnedChatsBucket) a5);
        }
        Bucket a6 = bucketsData.a(MiniappsBucket.class);
        if (a6 != null) {
            l020Var.g0((MiniappsBucket) a6);
        }
        Bucket a7 = bucketsData.a(HiddenPrivateChatsBucket.class);
        if (a7 != null) {
            this.d.d(l020Var, (HiddenPrivateChatsBucket) a7);
        }
        Bucket a8 = bucketsData.a(UserStatusPresetBucket.class);
        glf glfVar = this.q;
        if (a8 == null && ((hlf) glfVar.b.get()).w) {
            com.yandex.messaging.domain.statuses.b bVar = glfVar.a;
            bVar.d = true;
            oo31.n(bVar.c, "IS_CUSTOM_STATUSES_ENABLED", true);
        }
        Bucket a9 = bucketsData.a(UserStatusPresetBucket.class);
        if (a9 != null) {
            UserStatusPresetBucket userStatusPresetBucket = (UserStatusPresetBucket) a9;
            if (((hlf) glfVar.b.get()).w) {
                glfVar.a.a(userStatusPresetBucket, l020Var);
            }
        }
        Bucket a10 = bucketsData.a(FoldersBucket.class);
        if (a10 != null) {
            this.u.d((FoldersBucket) a10, l020Var);
        }
        Bucket a11 = bucketsData.a(PreferencesBucket.class);
        if (a11 != null) {
            this.w.a((PreferencesBucket) a11, l020Var);
        }
    }
}
