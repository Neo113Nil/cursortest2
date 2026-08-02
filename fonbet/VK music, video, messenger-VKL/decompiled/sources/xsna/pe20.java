package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;
import xsna.k7r0;
import xsna.pum;

/* compiled from: MessagesGetConversationsApiCmd.kt */
/* loaded from: classes2.dex */
public final class pe20 extends nx2<b> {
    public final vjm b;
    public final pum c;
    public final int d;
    public final Peer e;
    public final boolean f;

    /* compiled from: MessagesGetConversationsApiCmd.kt */
    public static final class a implements k7r0<b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.vk.im.engine.models.messages.Msg] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v4 */
        public static b b(JSONObject jSONObject) {
            ?? e;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                JSONObject jSONObject4 = jSONObject3.getJSONObject(SignalingProtocol.KEY_CONVERSATION);
                JSONObject optJSONObject = jSONObject3.optJSONObject("last_message");
                f1e0 f1e0Var = new f1e0();
                com.vk.im.engine.models.dialogs.a b2 = dsj.b(jSONObject4, f1e0Var);
                if (optJSONObject == null) {
                    e = 0;
                } else {
                    e = bh30.e(optJSONObject, f1e0Var);
                    e.A = MessageSource.GET_CONVERSATIONS;
                    if (!b.isEmpty() && (e instanceof com.vk.im.engine.models.messages.a)) {
                        com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) e;
                        Iterator it = aVar.K0().iterator();
                        while (it.hasNext()) {
                            w04.b((Attach) it.next(), b);
                        }
                        Iterator it2 = aVar.q7().iterator();
                        while (it2.hasNext()) {
                            bh30.c((NestedMsg) it2.next(), b);
                        }
                    }
                }
                arrayList.add(b2);
                if (e != 0) {
                    linkedHashMap.put(Long.valueOf(b2.a), e);
                }
            }
            return new b(arrayList, linkedHashMap, b);
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return b(jSONObject);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: MessagesGetConversationsApiCmd.kt */
    public static final class b {
        public final List<com.vk.im.engine.models.dialogs.a> a;
        public final Object b;
        public final ProfilesSimpleInfo c;

        public b(List<com.vk.im.engine.models.dialogs.a> list, Map<Long, ? extends Msg> map, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = list;
            this.b = map;
            this.c = profilesSimpleInfo;
        }
    }

    /* compiled from: MessagesGetConversationsApiCmd.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.REQUESTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogsFilter.CHATS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DialogsFilter.ARCHIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pe20(vjm vjmVar, pum pumVar, int i, Peer peer, boolean z) {
        int i2 = vjmVar.c;
        this.b = vjmVar;
        this.c = pumVar;
        this.d = i;
        this.e = peer;
        this.f = z;
        if (i <= 0) {
            throw new IllegalStateException(lhg.a(i, "Illegal limit value: ").toString());
        }
        if (i2 < 1) {
            throw new IllegalStateException(lhg.a(i2, "Illegal sortMinorId: ").toString());
        }
    }

    @Override // xsna.nx2
    public final b f(l7r0 l7r0Var) {
        DialogsFilter dialogsFilter;
        String str;
        String str2;
        pum pumVar = this.c;
        boolean z = pumVar instanceof pum.a;
        if (z) {
            dialogsFilter = ((pum.a) pumVar).a;
        } else {
            if (!(pumVar instanceof pum.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dialogsFilter = ((pum.b) pumVar).b;
        }
        switch (c.$EnumSwitchMapping$0[dialogsFilter.ordinal()]) {
            case 1:
                str = "all";
                break;
            case 2:
                str = "unread";
                break;
            case 3:
                str = "message_request";
                break;
            case 4:
                str = "chats";
                break;
            case 5:
                str = "business_notify";
                break;
            case 6:
                str = "archive";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (z) {
            str2 = "ALL(common)";
        } else {
            if (!(pumVar instanceof pum.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "folderId=" + ((pum.b) pumVar).a;
        }
        StringBuilder a2 = xe9.a("FoldersLazyLoadingIssue: >>> NETWORK messages.getConversations -> ", str2, " filter=", str, " limit=");
        int i = this.d;
        a2.append(i);
        L.e(a2.toString());
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getConversations";
        vjm vjmVar = this.b;
        aVar.f.put("major_sort_id", Integer.valueOf(vjmVar.b).toString());
        aVar.f.put("start_from_minor_sort_id", Integer.valueOf(vjmVar.c).toString());
        aVar.b("filter", str);
        aVar.f.put("count", Integer.valueOf(i).toString());
        if (pumVar instanceof pum.b) {
            aVar.f.put("folder_id", Integer.valueOf(((pum.b) pumVar).a).toString());
        }
        Peer peer = this.e;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        Integer num = 2;
        aVar.f.put("nested_limit", num.toString());
        aVar.i = this.f;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        return (b) bz2.k(ij20Var, aVar2, new svd(l7r0Var, ij20Var, aVar2, 6));
    }
}
