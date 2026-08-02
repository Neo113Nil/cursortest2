package xsna;

import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ChannelsLpEventParser.kt */
/* loaded from: classes2.dex */
public final class ehb {

    /* compiled from: ChannelsLpEventParser.kt */
    public static final class a {
        public final ArrayList a;
        public final LinkedHashMap b;
        public final LinkedHashMap c;
        public final LinkedHashMap d;
        public final ArrayList e;

        public a(int i) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList();
            this.a = arrayList;
            this.b = linkedHashMap;
            this.c = linkedHashMap2;
            this.d = linkedHashMap3;
            this.e = arrayList2;
        }
    }

    public static void a(a aVar) {
        ArrayList arrayList = aVar.e;
        ArrayList arrayList2 = aVar.a;
        LinkedHashMap linkedHashMap = aVar.b;
        arrayList.addAll(linkedHashMap.values());
        LinkedHashMap linkedHashMap2 = aVar.d;
        Set keySet = linkedHashMap2.keySet();
        LinkedHashMap linkedHashMap3 = aVar.c;
        LinkedHashSet<Peer> j = izi0.j(keySet, linkedHashMap3.keySet());
        ArrayList arrayList3 = new ArrayList(c5g.u(j, 10));
        for (Peer peer : j) {
            arrayList3.add(new wcb(peer, (Integer) linkedHashMap3.get(peer), (Integer) linkedHashMap2.get(peer)));
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        linkedHashMap.clear();
        linkedHashMap3.clear();
        linkedHashMap2.clear();
    }

    public static Peer b(JSONArray jSONArray, int i) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.b(jSONArray.getLong(i));
    }

    public static Msg c(JSONObject jSONObject, MessageSource messageSource, String str) {
        Object failure;
        if (jSONObject == null) {
            return null;
        }
        try {
            fvr.C(jSONObject);
            MsgFromChannel a2 = s1b.a(jSONObject, new f1e0());
            a2.A = messageSource;
            failure = a2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a3 = Result.a(failure);
        if (a3 != null) {
            L.f("ChannelsLpEventParser", str, a3);
        }
        return (Msg) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [xsna.gua] */
    /* JADX WARN: Type inference failed for: r13v19, types: [xsna.u0b] */
    public static void d(a aVar, JSONArray jSONArray) {
        LinkedHashMap linkedHashMap = aVar.b;
        LinkedHashMap linkedHashMap2 = aVar.d;
        ArrayList arrayList = aVar.a;
        switch (jSONArray.getInt(0)) {
            case 70001:
                Peer b = b(jSONArray, 1);
                int i = jSONArray.getInt(2);
                int i2 = jSONArray.getInt(3);
                Msg c = c(jSONArray.optJSONObject(4), MessageSource.CHANNEL_NEW_MESSAGE_FROM_LP, "parseChannelNewMessageEvent: failed to parse channel message");
                Object obj = linkedHashMap.get(b);
                Object obj2 = obj;
                if (obj == null) {
                    m4b m4bVar = new m4b(b, new SparseArray(1), false);
                    linkedHashMap.put(b, m4bVar);
                    obj2 = m4bVar;
                }
                ((m4b) obj2).b.put(i, c);
                linkedHashMap2.put(b, Integer.valueOf(i2));
                break;
            case 70002:
                arrayList.add(new t4b(b(jSONArray, 1), jSONArray.getInt(2), c(jSONArray.optJSONObject(3), MessageSource.CHANNEL_EDIT_MESSAGE_FROM_LP, "parseChannelEditMessageEvent: failed to parse channel message")));
                break;
            case 70003:
                Peer b2 = b(jSONArray, 1);
                int i3 = jSONArray.getInt(2);
                int i4 = jSONArray.getInt(3);
                arrayList.add(new r4b(i3, b2));
                linkedHashMap2.put(b2, Integer.valueOf(i4));
                break;
            case 70004:
                Peer b3 = b(jSONArray, 1);
                int i5 = jSONArray.getInt(2);
                int optInt = jSONArray.optInt(3, -1);
                arrayList.add(new dbb(b3, i5, optInt >= 0 ? Integer.valueOf(optInt) : null));
                break;
            case 70005:
                Peer b4 = b(jSONArray, 1);
                arrayList.add(jSONArray.getInt(2) == 0 ? new gua(b4) : new rdb(b4));
                int optInt2 = jSONArray.optInt(3, -1);
                Integer valueOf = optInt2 >= 0 ? Integer.valueOf(optInt2) : null;
                if (valueOf != null) {
                    arrayList.add(new meb(3, Integer.valueOf(valueOf.intValue())));
                    break;
                }
                break;
            case 70006:
                Peer b5 = b(jSONArray, 1);
                AdminLevel.a aVar2 = AdminLevel.Companion;
                Integer valueOf2 = Integer.valueOf(jSONArray.getInt(2));
                aVar2.getClass();
                arrayList.add(new wta(b5, AdminLevel.a.a(valueOf2), jSONArray.getInt(3) != 0));
                break;
            case 70007:
                arrayList.add(new f7b(b(jSONArray, 1), jSONArray.getLong(2)));
                break;
            case 70008:
                Integer valueOf3 = Integer.valueOf(jSONArray.getInt(1));
                Integer valueOf4 = Integer.valueOf(jSONArray.getInt(2));
                int optInt3 = jSONArray.optInt(3, -1);
                arrayList.add(new meb(valueOf3, valueOf4, optInt3 >= 0 ? Integer.valueOf(optInt3) : null));
                break;
            case 70009:
                Peer b6 = b(jSONArray, 1);
                arrayList.add(jSONArray.getInt(2) == 1 ? new u0b(b6) : new b1b(b6));
                break;
            case 70010:
                Peer b7 = b(jSONArray, 1);
                int i6 = jSONArray.getInt(2);
                int i7 = jSONArray.getInt(3);
                arrayList.add(new d5b(b7, i6, c(jSONArray.optJSONObject(4), MessageSource.CHANNEL_RESTORE_MESSAGE_FROM_LP, "parseChannelMessageRestoreEvent: failed to parse channel message")));
                linkedHashMap2.put(b7, Integer.valueOf(i7));
                break;
            case 70011:
                JSONArray jSONArray2 = jSONArray.getJSONArray(1);
                if (jSONArray2 != null) {
                    int length = jSONArray2.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        d(aVar, jSONArray2.getJSONArray(i8));
                    }
                    break;
                }
                break;
            case 70012:
                JSONArray jSONArray3 = jSONArray.getJSONArray(1);
                if (jSONArray3 != null) {
                    int length2 = jSONArray3.length();
                    for (int i9 = 0; i9 < length2; i9++) {
                        JSONArray jSONArray4 = jSONArray3.getJSONArray(i9);
                        aVar.c.put(b(jSONArray4, 0), Integer.valueOf(jSONArray4.getInt(1)));
                    }
                    break;
                }
                break;
            case 70013:
                arrayList.add(new rxa(b(jSONArray, 1)));
                break;
            case 70014:
                Peer b8 = b(jSONArray, 1);
                Peer b9 = b(jSONArray, 2);
                ChannelBanInfo.Reason.a aVar3 = ChannelBanInfo.Reason.Companion;
                Integer valueOf5 = Integer.valueOf(jSONArray.getInt(4));
                aVar3.getClass();
                arrayList.add(new qua(b8, b9, new ChannelBanInfo(jSONArray.optString(6), jSONArray.optInt(5), ChannelBanInfo.Reason.a.a(valueOf5))));
                break;
            case 70015:
                arrayList.add(new qua(b(jSONArray, 1), b(jSONArray, 2), null));
                break;
            case 70017:
                Peer b10 = b(jSONArray, 1);
                int i10 = jSONArray.getInt(2);
                Msg c2 = c(jSONArray.optJSONObject(3), MessageSource.CHANNEL_NEW_MESSAGE_FROM_LP, "parseChannelNewPostponedMessageEvent: failed to parse channel message");
                Object obj3 = linkedHashMap.get(b10);
                Object obj4 = obj3;
                if (obj3 == null) {
                    m4b m4bVar2 = new m4b(b10, new SparseArray(1), true);
                    linkedHashMap.put(b10, m4bVar2);
                    obj4 = m4bVar2;
                }
                ((m4b) obj4).b.put(i10, c2);
                break;
            case 70020:
                arrayList.add(new r8b(jSONArray.getLong(1), jSONArray.getInt(2)));
                break;
            case 70021:
                arrayList.add(new hdb(b(jSONArray, 1)));
                break;
            case 70022:
                Peer b11 = b(jSONArray, 1);
                JSONObject jSONObject = jSONArray.getJSONObject(2);
                Integer x = f370.x(jSONObject, "members_count");
                if (x != null) {
                    arrayList.add(new o1b(x.intValue(), b11));
                }
                Integer x2 = f370.x(jSONObject, "can_comment");
                if (x2 != null) {
                    arrayList.add(new uua(b11, x2.intValue() == 1));
                }
                String D = f370.D(jSONObject, "title");
                if (D != null) {
                    arrayList.add(new jdb(b11, D));
                }
                String D2 = f370.D(jSONObject, "photo_base");
                if (D2 != null) {
                    arrayList.add(new mua(b11, D2));
                }
                Integer x3 = f370.x(jSONObject, "can_post_donut");
                if (x3 != null) {
                    arrayList.add(new wua(b11, x3.intValue() > 0));
                    break;
                }
                break;
            case 70023:
                L.p("ChannelsLpEventParser", "accepted channel pin event : " + jSONArray);
                arrayList.add(new z4b(b(jSONArray, 1), jSONArray.getInt(2), c(jSONArray.optJSONObject(3), MessageSource.CHANNEL_PIN_MSG_FROM_LP, "parseChannelMsgPinEvent: failed to parse channel message")));
                L.p("ChannelsLpEventParser", "channel pin event parsed successfully");
                break;
            case 70024:
                L.p("ChannelsLpEventParser", "accepted channel unpin event : " + jSONArray);
                arrayList.add(new o6b(jSONArray.getInt(2), b(jSONArray, 1)));
                L.p("ChannelsLpEventParser", "channel unpin event parsed successfully");
                break;
            case 70025:
                arrayList.add(new vxa(b(jSONArray, 1), jSONArray.getInt(2) != 0));
                break;
            case 70026:
                arrayList.add(new wza(b(jSONArray, 1), jSONArray.getInt(2) > 0));
                break;
        }
    }
}
