package xsna;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vk.api.generated.messages.dto.MessagesCountersFilterDto;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_commands.diff.ExtendedFilter;
import com.vk.im.engine.internal.api_commands.diff.MessageFlag;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.bsj;
import xsna.ij20;
import xsna.k7r0;
import xsna.p4g;

/* compiled from: MessagesGetDiffApiCmd.kt */
/* loaded from: classes2.dex */
public final class te20 extends nx2<dcq<b>> {
    public final Long b;
    public final Long c;
    public final String e;
    public final List<ExtendedFilter> f;
    public final List<MessagesCountersFilterDto> g;
    public final List<FoldersSupportedType> h;
    public final MessageSource i;
    public final boolean j;
    public final Long k;
    public final long l;
    public final ArrayList m;
    public final ArrayList n;
    public final Pair<Long, Integer> o;
    public final Peer q;
    public final String r;
    public final boolean s;
    public final String t;
    public final int d = 20;
    public final Integer p = 30;

    /* compiled from: MessagesGetDiffApiCmd.kt */
    public static final class a {
        public final String a;
        public final long b;
        public final String c;
        public final boolean d;

        public a(long j, String str, String str2, boolean z) {
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Credentials(key=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", server=");
            sb.append(this.c);
            sb.append(", lpServerUnavailable=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: MessagesGetDiffApiCmd.kt */
    public static final class b implements dux0 {
        public final List<bsj> a;
        public final MessagesFoldersInfoDto b;
        public final ai30 c;
        public final List<spm> d;
        public final fi00 e;
        public final Long f;
        public final a g;
        public final String h;
        public final boolean i;
        public final ProfilesSimpleInfo j;
        public final Long k;
        public final me20 l;
        public final f1e0 m;

        public b(List<bsj> list, MessagesFoldersInfoDto messagesFoldersInfoDto, ai30 ai30Var, List<spm> list2, fi00 fi00Var, Long l, a aVar, String str, boolean z, ProfilesSimpleInfo profilesSimpleInfo, Long l2, me20 me20Var, f1e0 f1e0Var) {
            this.a = list;
            this.b = messagesFoldersInfoDto;
            this.c = ai30Var;
            this.d = list2;
            this.e = fi00Var;
            this.f = l;
            this.g = aVar;
            this.h = str;
            this.i = z;
            this.j = profilesSimpleInfo;
            this.k = l2;
            this.l = me20Var;
            this.m = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.m;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && this.i == bVar.i && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            MessagesFoldersInfoDto messagesFoldersInfoDto = this.b;
            int hashCode2 = (hashCode + (messagesFoldersInfoDto == null ? 0 : messagesFoldersInfoDto.hashCode())) * 31;
            ai30 ai30Var = this.c;
            int hashCode3 = (hashCode2 + (ai30Var == null ? 0 : ai30Var.hashCode())) * 31;
            List<spm> list = this.d;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            fi00 fi00Var = this.e;
            int hashCode5 = (hashCode4 + (fi00Var == null ? 0 : fi00Var.hashCode())) * 31;
            Long l = this.f;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            a aVar = this.g;
            int hashCode7 = (hashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.h;
            int a = io.reactivex.rxjava3.subjects.c.a(this.j, qoy.b((hashCode7 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31);
            Long l2 = this.k;
            int hashCode8 = (a + (l2 == null ? 0 : l2.hashCode())) * 31;
            me20 me20Var = this.l;
            return this.m.hashCode() + ((hashCode8 + (me20Var != null ? me20Var.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Response(conversationsChanges=" + this.a + ", folders=" + this.b + ", messagesCounters=" + this.c + ", foldersCounters=" + this.d + ", groupsFolderCounters=" + this.e + ", serverVersion=" + this.f + ", credentials=" + this.g + ", conversationsSource=" + this.h + ", invalidateAll=" + this.i + ", profiles=" + this.j + ", serverTime=" + this.k + ", changedObjectsResponse=" + this.l + ", requestedProfiles=" + this.m + ')';
        }
    }

    /* compiled from: MessagesGetDiffApiCmd.kt */
    public static final class c implements k7r0<b> {
        public final MessageSource b;

        public c(MessageSource messageSource) {
            this.b = messageSource;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:208:0x04ca  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x04cd  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0528  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0554  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0569  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0583  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x05e0  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x0576  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0556  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x0546  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x049e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v14, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v44, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v52, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
        @Override // xsna.k7r0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(JSONObject jSONObject) {
            ai30 ai30Var;
            ArrayList arrayList;
            JSONObject optJSONObject;
            MessagesFoldersInfoDto messagesFoldersInfoDto;
            fi00 fi00Var;
            JSONObject optJSONObject2;
            boolean z;
            ArrayList arrayList2;
            me20 me20Var;
            fi00 fi00Var2;
            com.vk.im.engine.models.dialogs.a c;
            long j;
            bsj.a aVar;
            EmptyList emptyList;
            JSONArray jSONArray;
            int i;
            int i2;
            EmptyList emptyList2;
            ?? r3;
            Map map;
            Peer.Contact contact;
            int i3;
            int i4;
            JSONArray jSONArray2;
            zrp zrpVar;
            Object obj;
            bsj.b bVar;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            Long z2 = f370.z(jSONObject2, ExtendedFilter.SERVER_VERSION.h());
            JSONArray jSONArray3 = jSONObject2.getJSONArray("conversations_info");
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray3.length();
            int i5 = 0;
            while (i5 < length) {
                JSONObject jSONObject3 = jSONArray3.getJSONObject(i5);
                JSONObject optJSONObject3 = jSONObject3.optJSONObject(SignalingProtocol.KEY_CONVERSATION);
                if (optJSONObject3 == null) {
                    c = null;
                } else {
                    try {
                        c = dsj.c(optJSONObject3, f1e0Var);
                    } catch (JSONException e) {
                        throw new VKApiIllegalResponseException(e);
                    }
                }
                JSONObject optJSONObject4 = jSONObject3.optJSONObject("conversation_diff");
                if (optJSONObject4 != null) {
                    long j2 = optJSONObject4.getLong("peer_id");
                    JSONObject optJSONObject5 = optJSONObject4.optJSONObject("new_msgs");
                    if (optJSONObject5 != null) {
                        j = 0;
                        JSONArray optJSONArray = optJSONObject5.optJSONArray("cmids");
                        ArrayList J = optJSONArray != null ? f370.J(optJSONArray) : null;
                        JSONArray optJSONArray2 = optJSONObject5.optJSONArray("mention_cmids");
                        ArrayList J2 = optJSONArray2 != null ? f370.J(optJSONArray2) : null;
                        JSONArray optJSONArray3 = optJSONObject5.optJSONArray("expired_cmids");
                        bVar = new bsj.b(J, J2, optJSONArray3 != null ? f370.J(optJSONArray3) : null);
                    } else {
                        j = 0;
                        bVar = null;
                    }
                    aVar = new bsj.a(j2, bVar, optJSONObject4.has("in_read_cmid") ? Integer.valueOf(optJSONObject4.optInt("in_read_cmid")) : null, optJSONObject4.has("out_read_cmid") ? Integer.valueOf(optJSONObject4.optInt("out_read_cmid")) : null, optJSONObject4.has("unread_count") ? Integer.valueOf(optJSONObject4.optInt("unread_count")) : null, optJSONObject4.has("sort_major_id") ? Integer.valueOf(optJSONObject4.optInt("sort_major_id")) : null, optJSONObject4.has("sort_minor_id") ? Integer.valueOf(optJSONObject4.optInt("sort_minor_id")) : null, optJSONObject4.has("is_archived") ? Boolean.valueOf(optJSONObject4.optBoolean("is_archived")) : null, Long.valueOf(optJSONObject4.optLong("version", z2 != null ? z2.longValue() : j)), optJSONObject4.has("timestamp") ? Integer.valueOf(optJSONObject4.optInt("timestamp")) : null);
                } else {
                    j = 0;
                    aVar = null;
                }
                JSONArray optJSONArray4 = jSONObject3.optJSONArray("message");
                if (optJSONArray4 != null) {
                    ?? arrayList4 = new ArrayList(optJSONArray4.length());
                    int length2 = optJSONArray4.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        Msg e2 = bh30.e(optJSONArray4.getJSONObject(i6), f1e0Var);
                        e2.A = this.b;
                        arrayList4.add(e2);
                    }
                    emptyList = arrayList4;
                } else {
                    emptyList = EmptyList.b;
                }
                JSONArray optJSONArray5 = jSONObject3.optJSONArray("range_updated_cmids");
                if (optJSONArray5 != null) {
                    ?? arrayList5 = new ArrayList(optJSONArray5.length());
                    int length3 = optJSONArray5.length();
                    jSONArray = jSONArray3;
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = length;
                        JSONObject jSONObject4 = optJSONArray5.getJSONObject(i7);
                        arrayList5.add(new k9x(jSONObject4.getInt(UcumUtils.UCUM_MINUTES), jSONObject4.getInt(InneractiveMediationNameConsts.MAX), 1));
                        i7++;
                        optJSONArray5 = optJSONArray5;
                        length = i8;
                        i5 = i5;
                    }
                    i = length;
                    i2 = i5;
                    emptyList2 = arrayList5;
                } else {
                    jSONArray = jSONArray3;
                    i = length;
                    i2 = i5;
                    emptyList2 = EmptyList.b;
                }
                EmptyList emptyList3 = emptyList2;
                JSONArray optJSONArray6 = jSONObject3.optJSONArray("range_deleted_cmids");
                if (optJSONArray6 != null) {
                    r3 = new ArrayList(optJSONArray6.length());
                    int i9 = 0;
                    for (int length4 = optJSONArray6.length(); i9 < length4; length4 = length4) {
                        JSONObject jSONObject5 = optJSONArray6.getJSONObject(i9);
                        r3.add(new k9x(jSONObject5.getInt(UcumUtils.UCUM_MINUTES), jSONObject5.getInt(InneractiveMediationNameConsts.MAX), 1));
                        i9++;
                        optJSONArray6 = optJSONArray6;
                    }
                } else {
                    r3 = EmptyList.b;
                }
                List list = r3;
                boolean optBoolean = jSONObject3.optBoolean("invalidate", false);
                JSONArray optJSONArray7 = jSONObject3.optJSONArray("cmids_flags");
                if (optJSONArray7 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int length5 = optJSONArray7.length();
                    int i10 = 0;
                    while (i10 < length5) {
                        Object obj2 = optJSONArray7.get(i10);
                        JSONObject jSONObject6 = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
                        if (jSONObject6 != null) {
                            try {
                                Integer valueOf = Integer.valueOf(jSONObject6.getInt("cmid"));
                                MessageFlag.a aVar2 = MessageFlag.Companion;
                                i3 = length5;
                                i4 = i10;
                                try {
                                    long j3 = jSONObject6.getLong("updated_flags");
                                    aVar2.getClass();
                                    if (j3 == j) {
                                        obj = EmptyList.b;
                                    } else {
                                        zrpVar = MessageFlag.values;
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj3 : zrpVar) {
                                            JSONArray jSONArray4 = optJSONArray7;
                                            if (((MessageFlag) obj3).i(j3)) {
                                                arrayList6.add(obj3);
                                            }
                                            optJSONArray7 = jSONArray4;
                                        }
                                        obj = arrayList6;
                                    }
                                    jSONArray2 = optJSONArray7;
                                    try {
                                        Pair pair = new Pair(valueOf, obj);
                                        linkedHashMap.put(pair.d(), pair.g());
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable unused2) {
                                    jSONArray2 = optJSONArray7;
                                }
                            } catch (Throwable unused3) {
                            }
                            i10 = i4 + 1;
                            length5 = i3;
                            optJSONArray7 = jSONArray2;
                        }
                        jSONArray2 = optJSONArray7;
                        i3 = length5;
                        i4 = i10;
                        i10 = i4 + 1;
                        length5 = i3;
                        optJSONArray7 = jSONArray2;
                    }
                    p4g.a aVar3 = p4g.a;
                    map = Collections.unmodifiableMap(linkedHashMap);
                } else {
                    map = jgp.b;
                }
                Map map2 = map;
                JSONArray optJSONArray8 = jSONObject3.optJSONArray("cmids_updated_reactions");
                List J3 = optJSONArray8 != null ? f370.J(optJSONArray8) : EmptyList.b;
                Long z3 = f370.z(jSONObject3, "contact_id");
                if (z3 != null) {
                    long longValue = z3.longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    Peer.Contact contact2 = new Peer.Contact(longValue + 1900000000);
                    f1e0Var.c(contact2);
                    contact = contact2;
                } else {
                    contact = null;
                }
                arrayList3.add(new bsj(c, aVar, emptyList, optBoolean, emptyList3, list, map2, J3, contact, jSONObject3.optBoolean("members_changed", false)));
                i5 = i2 + 1;
                jSONArray3 = jSONArray;
                length = i;
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                bsj bsjVar = (bsj) it.next();
                com.vk.im.engine.models.dialogs.a aVar4 = bsjVar.a;
                if (aVar4 != null) {
                    dsj.a(aVar4, b);
                }
                for (gtx0 gtx0Var : bsjVar.c) {
                    if (!b.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                        com.vk.im.engine.models.messages.a aVar5 = (com.vk.im.engine.models.messages.a) gtx0Var;
                        Iterator it2 = aVar5.K0().iterator();
                        while (it2.hasNext()) {
                            w04.b((Attach) it2.next(), b);
                        }
                        for (NestedMsg nestedMsg : aVar5.q7()) {
                            Iterator it3 = nestedMsg.j.iterator();
                            while (it3.hasNext()) {
                                w04.b((Attach) it3.next(), b);
                            }
                            Iterator it4 = nestedMsg.k.iterator();
                            while (it4.hasNext()) {
                                bh30.c((NestedMsg) it4.next(), b);
                            }
                        }
                    }
                }
            }
            JSONObject optJSONObject6 = jSONObject2.optJSONObject(ExtendedFilter.COUNTERS.h());
            if (optJSONObject6 != null) {
                try {
                    ai30Var = new ai30(optJSONObject6.has("messages") ? optJSONObject6.getInt("messages") : 0, optJSONObject6.has("messages_unread_unmuted") ? optJSONObject6.getInt("messages_unread_unmuted") : 0, optJSONObject6.has("message_requests") ? optJSONObject6.getInt("message_requests") : 0, optJSONObject6.has("business_notify_all") ? optJSONObject6.getInt("business_notify_all") : 0, optJSONObject6.has("business_notify") ? optJSONObject6.getInt("business_notify") : 0, optJSONObject6.has("messages_archive") ? optJSONObject6.getInt("messages_archive") : 0, optJSONObject6.has("messages_archive_unread") ? optJSONObject6.getInt("messages_archive_unread") : 0, optJSONObject6.has("messages_archive_unread_unmuted") ? optJSONObject6.getInt("messages_archive_unread_unmuted") : 0, optJSONObject6.has("messages_archive_mentions_count") ? optJSONObject6.getInt("messages_archive_mentions_count") : 0);
                } catch (JSONException e3) {
                    throw new VKApiIllegalResponseException(e3);
                }
            } else {
                ai30Var = null;
            }
            if (optJSONObject6 != null) {
                JSONObject jSONObject7 = optJSONObject6.has("messages_folders") ? optJSONObject6 : null;
                if (jSONObject7 != null) {
                    try {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("messages_folders");
                        ArrayList arrayList7 = new ArrayList();
                        int length6 = jSONArray5.length();
                        for (int i11 = 0; i11 < length6; i11++) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i11);
                            int i12 = jSONObject8.getInt("folder_id");
                            int i13 = jSONObject8.getInt("total_count");
                            int i14 = jSONObject8.getInt("unmuted_count");
                            arrayList7.add(new spm(i12, i14, i13 - i14));
                        }
                        arrayList = arrayList7;
                        optJSONObject = jSONObject2.optJSONObject(ExtendedFilter.FOLDERS.h());
                        if (optJSONObject == null) {
                            try {
                                ArrayList v = vua0.v(optJSONObject.getJSONArray("items"));
                                JSONArray optJSONArray9 = optJSONObject.optJSONArray("included_lists_info");
                                if (optJSONArray9 == null) {
                                    optJSONArray9 = new JSONArray();
                                }
                                messagesFoldersInfoDto = new MessagesFoldersInfoDto(v, v.size(), vua0.w(optJSONArray9));
                            } catch (JSONException e4) {
                                throw new VKApiIllegalResponseException(e4);
                            }
                        } else {
                            messagesFoldersInfoDto = null;
                        }
                        if (optJSONObject6 != null) {
                            if (!optJSONObject6.has("groups_folder")) {
                                optJSONObject6 = null;
                            }
                            if (optJSONObject6 != null) {
                                try {
                                    if (optJSONObject6.has("groups_folder")) {
                                        JSONObject jSONObject9 = optJSONObject6.getJSONObject("groups_folder");
                                        fi00Var2 = new fi00(f370.w(jSONObject9, 0, "total_count"), jSONObject9.has("dialogs_count") ? jSONObject9.getInt("dialogs_count") : 0, jSONObject9.has("dialogs_count_unmuted") ? jSONObject9.getInt("dialogs_count_unmuted") : 0);
                                    } else {
                                        fi00Var2 = new fi00(0, 0, 0);
                                    }
                                    fi00Var = fi00Var2;
                                    JSONObject optJSONObject7 = jSONObject2.optJSONObject(ExtendedFilter.CREDENTIALS.h());
                                    a aVar6 = optJSONObject7 != null ? new a(optJSONObject7.getLong("ts"), optJSONObject7.getString("key"), optJSONObject7.getString("server_lp"), optJSONObject7.optBoolean("lp_server_unavailable")) : null;
                                    String optString = jSONObject2.optString("conversations_source");
                                    String str = !drm0.N(optString) ? optString : null;
                                    boolean optBoolean2 = jSONObject2.optBoolean("invalidate_all");
                                    Long z4 = f370.z(jSONObject2, ExtendedFilter.SERVER_TIME.h());
                                    Long valueOf2 = z4 != null ? Long.valueOf(z4.longValue() * 1000) : null;
                                    optJSONObject2 = jSONObject2.optJSONObject(ExtendedFilter.CHANGED_OBJECTS.h());
                                    if (optJSONObject2 != null) {
                                        z = optBoolean2;
                                        arrayList2 = arrayList3;
                                        long optLong = optJSONObject2.optLong("contacts_last_update", 0L);
                                        JSONArray optJSONArray10 = optJSONObject2.optJSONArray("items");
                                        List L = optJSONArray10 != null ? f370.L(optJSONArray10) : EmptyList.b;
                                        JSONArray optJSONArray11 = optJSONObject2.optJSONArray("delete_items");
                                        List L2 = optJSONArray11 != null ? f370.L(optJSONArray11) : EmptyList.b;
                                        boolean optBoolean3 = optJSONObject2.optBoolean("drop_contacts", false);
                                        JSONObject optJSONObject8 = optJSONObject2.optJSONObject("edu");
                                        me20Var = new me20(optLong, L, L2, optBoolean3, optJSONObject8 != null ? new wak(le20.b("schedule", optJSONObject8), le20.b(SignalingProtocol.KEY_ROLES, optJSONObject8), 1) : null, new f1e0());
                                    } else {
                                        z = optBoolean2;
                                        arrayList2 = arrayList3;
                                        me20Var = null;
                                    }
                                    return new b(arrayList2, messagesFoldersInfoDto, ai30Var, arrayList, fi00Var, z2, aVar6, str, z, b, valueOf2, me20Var, f1e0Var);
                                } catch (JSONException e5) {
                                    throw new VKApiIllegalResponseException(e5);
                                }
                            }
                        }
                        fi00Var = null;
                        JSONObject optJSONObject72 = jSONObject2.optJSONObject(ExtendedFilter.CREDENTIALS.h());
                        if (optJSONObject72 != null) {
                        }
                        String optString2 = jSONObject2.optString("conversations_source");
                        if (!drm0.N(optString2)) {
                        }
                        boolean optBoolean22 = jSONObject2.optBoolean("invalidate_all");
                        Long z42 = f370.z(jSONObject2, ExtendedFilter.SERVER_TIME.h());
                        if (z42 != null) {
                        }
                        optJSONObject2 = jSONObject2.optJSONObject(ExtendedFilter.CHANGED_OBJECTS.h());
                        if (optJSONObject2 != null) {
                        }
                        return new b(arrayList2, messagesFoldersInfoDto, ai30Var, arrayList, fi00Var, z2, aVar6, str, z, b, valueOf2, me20Var, f1e0Var);
                    } catch (JSONException e6) {
                        throw new VKApiIllegalResponseException(e6);
                    }
                }
            }
            arrayList = null;
            optJSONObject = jSONObject2.optJSONObject(ExtendedFilter.FOLDERS.h());
            if (optJSONObject == null) {
            }
            if (optJSONObject6 != null) {
            }
            fi00Var = null;
            JSONObject optJSONObject722 = jSONObject2.optJSONObject(ExtendedFilter.CREDENTIALS.h());
            if (optJSONObject722 != null) {
            }
            String optString22 = jSONObject2.optString("conversations_source");
            if (!drm0.N(optString22)) {
            }
            boolean optBoolean222 = jSONObject2.optBoolean("invalidate_all");
            Long z422 = f370.z(jSONObject2, ExtendedFilter.SERVER_TIME.h());
            if (z422 != null) {
            }
            optJSONObject2 = jSONObject2.optJSONObject(ExtendedFilter.CHANGED_OBJECTS.h());
            if (optJSONObject2 != null) {
            }
            return new b(arrayList2, messagesFoldersInfoDto, ai30Var, arrayList, fi00Var, z2, aVar6, str, z, b, valueOf2, me20Var, f1e0Var);
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (xsna.p4g.b(r5, xsna.rl3.u0(r6)) == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public te20(Long l, Long l2, String str, List list, List list2, ListBuilder listBuilder, MessageSource messageSource, boolean z, Long l3, long j, ArrayList arrayList, ArrayList arrayList2, Pair pair, Peer peer) {
        this.b = l;
        this.c = l2;
        this.e = str;
        this.f = list;
        this.g = list2;
        this.h = listBuilder;
        this.i = messageSource;
        this.j = z;
        this.k = l3;
        this.l = j;
        this.m = arrayList;
        this.n = arrayList2;
        this.o = pair;
        this.q = peer;
        boolean z2 = true;
        this.r = (list == null || !list.contains(ExtendedFilter.CREDENTIALS)) ? null : "21";
        if (list != null) {
            ExtendedFilter[] extendedFilterArr = {ExtendedFilter.PROFILES, ExtendedFilter.GROUPS, ExtendedFilter.CONTACTS};
            p4g.a aVar = p4g.a;
        }
        z2 = false;
        this.s = z2;
        this.t = z2 ? j5g.g0(j5g.S0(j5g.u0(drm0.c0(drm0.p0(ky2.d).toString(), new String[]{StringUtils.COMMA}, 0, 6), drm0.c0(drm0.p0(ky2.b).toString(), new String[]{StringUtils.COMMA}, 0, 6))), StringUtils.COMMA, null, null, 0, null, 62) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te20)) {
            return false;
        }
        te20 te20Var = (te20) obj;
        return epx.f(this.b, te20Var.b) && epx.f(this.c, te20Var.c) && this.d == te20Var.d && epx.f(this.e, te20Var.e) && epx.f(this.f, te20Var.f) && epx.f(this.g, te20Var.g) && epx.f(this.h, te20Var.h) && this.i == te20Var.i && this.j == te20Var.j && epx.f(this.k, te20Var.k) && this.l == te20Var.l && epx.f(this.m, te20Var.m) && epx.f(this.n, te20Var.n) && epx.f(this.o, te20Var.o) && epx.f(this.p, te20Var.p) && epx.f(this.q, te20Var.q);
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        List x;
        VKApiConfig vKApiConfig = l7r0Var.a;
        L.c("getDiff request", new dgm(this, 22));
        long j = this.l;
        if (j != 0) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"getDiff", qlb0.a(j, "delay getDiff for ", UcumUtils.UCUM_MILLISECODS)});
            }
            Thread.sleep(j);
        }
        ij20.a aVar = new ij20.a();
        aVar.d = vKApiConfig.g;
        aVar.c = "messages.getDiff";
        LinkedHashMap linkedHashMap = aVar.f;
        Long l2 = this.b;
        if (l2 != null) {
            linkedHashMap.put("from_version", Long.valueOf(l2.longValue()).toString());
        }
        Long l3 = this.c;
        if (l3 != null) {
            linkedHashMap.put("to_version", Long.valueOf(l3.longValue()).toString());
        }
        String str = this.r;
        if (str != null) {
            aVar.b("lp_version", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            aVar.b("conversations_source", str2);
        }
        boolean z = this.j;
        List<ExtendedFilter> list = this.f;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            p4g.a(ExtendedFilter.CHANGED_OBJECTS, arrayList, z);
            aVar.b("extended_filters", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new c220(1), 30));
        }
        String str3 = this.t;
        if (str3 != null) {
            aVar.b("fields", str3);
        }
        List<MessagesCountersFilterDto> list2 = this.g;
        if (list2 != null) {
            aVar.b("counter_filters", j5g.g0(list2, StringUtils.COMMA, null, null, 0, new z7w(3), 30));
        }
        List<FoldersSupportedType> list3 = this.h;
        if (list3 != null && (x = rdi.x(list3)) != null) {
            aVar.b("supported_types", j5g.g0(x, StringUtils.COMMA, null, null, 0, new d220(3), 30));
        }
        Peer peer = this.q;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            linkedHashMap.put("group_id", Long.valueOf(peer.d).toString());
        }
        if (z) {
            Long l4 = this.k;
            if (l4 != null) {
                linkedHashMap.put("contacts_last_update", Long.valueOf(l4.longValue()).toString());
            }
            aVar.h(vKApiConfig.f, "device_id");
        }
        ArrayList arrayList2 = this.m;
        if (!arrayList2.isEmpty()) {
            aVar.b("peer_ids", j5g.g0(arrayList2, StringUtils.COMMA, null, null, 0, new d4r(9), 30));
        }
        ArrayList arrayList3 = this.n;
        if (!arrayList3.isEmpty()) {
            aVar.b("cached_peer_ids", j5g.g0(arrayList3, StringUtils.COMMA, null, null, 0, new v4v(12), 30));
            aVar.b("supported_events", "2,4,5,6,7,18,20,21");
        }
        Integer num = 2;
        linkedHashMap.put("nested_limit", num.toString());
        Pair<Long, Integer> pair = this.o;
        if (pair != null) {
            aVar.b("more_last_msgs", "{\"peer_ids\":[" + pair.i().longValue() + "],\"max\":" + pair.j().intValue() + '}');
        } else {
            Integer num2 = this.p;
            if (num2 != null) {
                aVar.b("more_last_msgs", "{\"max\":" + num2.intValue() + '}');
                s3q0 s3q0Var = s3q0.a;
            }
        }
        linkedHashMap.put("conversations_limit", Integer.valueOf(this.d).toString());
        aVar.i = false;
        aVar.g = 0;
        return fo50.M((dux0) l7r0Var.d(new ij20(aVar), new c(this.i)), this.s, false, new ue20(2, this, te20.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/diff/MessagesGetDiffApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/diff/MessagesGetDiffApiCmd$Response;", 0), Source.ACTUAL);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        int a2 = shy.a(this.d, (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
        String str = this.e;
        int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<ExtendedFilter> list = this.f;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesCountersFilterDto> list2 = this.g;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FoldersSupportedType> list3 = this.h;
        int b2 = qoy.b((this.i.hashCode() + qoy.b((hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, false)) * 31, 31, this.j);
        Long l3 = this.k;
        int a3 = qr.a(this.n, qr.a(this.m, bh10.a((b2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.l), 31), 31);
        Pair<Long, Integer> pair = this.o;
        int hashCode5 = (a3 + (pair == null ? 0 : pair.hashCode())) * 31;
        Integer num = this.p;
        return Long.hashCode(this.q.b) + ((hashCode5 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetDiffApiCmd(fromVersion=");
        sb.append(this.b);
        sb.append(", toVersion=");
        sb.append(this.c);
        sb.append(", conversationsLimit=");
        sb.append(this.d);
        sb.append(", conversationsSource=");
        sb.append(this.e);
        sb.append(", extendedFilters=");
        sb.append(this.f);
        sb.append(", counterFilters=");
        sb.append(this.g);
        sb.append(", supportedTypes=");
        sb.append(this.h);
        sb.append(", awaitNetwork=false, messageSource=");
        sb.append(this.i);
        sb.append(", getChangedObjects=");
        sb.append(this.j);
        sb.append(", lastContactsUpdateTime=");
        sb.append(this.k);
        sb.append(", debugDelayLpSyncStartMs=");
        sb.append(this.l);
        sb.append(", requiredPeers=");
        sb.append(this.m);
        sb.append(", cachedPeerIds=");
        sb.append(this.n);
        sb.append(", moreLastMsgsForPush=");
        sb.append(this.o);
        sb.append(", moreLastMsgsForAll=");
        sb.append(this.p);
        sb.append(", groupId=");
        return eq.a(sb, this.q, ')');
    }
}
