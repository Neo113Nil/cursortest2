package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.ye20;

/* compiled from: HistoryAttachApiParser.kt */
/* loaded from: classes2.dex */
public final class y7v {
    public static final ye20.a a(JSONObject jSONObject, List<? extends Class<? extends Attach>> list, long j) throws VKApiIllegalResponseException {
        int i;
        Long l;
        int i2;
        int i3;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ProfilesSimpleInfo b = i1e0.b(jSONObject);
        f1e0 f1e0Var = new f1e0();
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        int i4 = 0;
        while (i4 < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
            int i5 = jSONObject2.getInt("cmid");
            long optLong = jSONObject2.optLong("from_id", 0L);
            long optLong2 = jSONObject2.optLong("date");
            int i6 = jSONObject2.has(X3.i.L) ? jSONObject2.getInt(X3.i.L) : 0;
            Long z = f370.z(jSONObject2, "message_expire_ttl");
            if (z != null) {
                i = length;
                l = Long.valueOf(z.longValue() * 1000);
            } else {
                i = length;
                l = null;
            }
            int optInt = jSONObject2.optInt("linked_cmid");
            String optString = jSONObject2.optString("linked_text");
            Serializer.c<Peer> cVar = Peer.CREATOR;
            f1e0Var.c(Peer.a.b(optLong));
            try {
                Attach E = w04.E(jSONObject2.getJSONObject(SharedKt.PARAM_ATTACHMENT), f1e0Var);
                if (E instanceof AttachForMediaViewer) {
                    AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) E;
                    attachForMediaViewer.d2(i5);
                    i2 = optInt;
                    i3 = i4;
                    attachForMediaViewer.Q1(j);
                    attachForMediaViewer.x6(i6);
                    attachForMediaViewer.Oa(1000 * optLong2);
                    attachForMediaViewer.B5(l);
                } else {
                    i2 = optInt;
                    i3 = i4;
                }
                w04.b(E, b);
                arrayList.add(new HistoryAttach(i5, optLong, E, (User) b.b.get(Long.valueOf(optLong)), Long.valueOf(optLong2), Integer.valueOf(i2), optString));
                i4 = i3 + 1;
                length = i;
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            HistoryAttach historyAttach = (HistoryAttach) next;
            List<? extends Class<? extends Attach>> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Class) it2.next()).isInstance(historyAttach.d)) {
                        arrayList2.add(next);
                        break;
                    }
                }
            }
        }
        String string = jSONObject.has("cmid_next_from") ? jSONObject.getString("cmid_next_from") : "";
        return new ye20.a(arrayList2, string.length() > 0 ? string : null, f1e0Var);
    }
}
