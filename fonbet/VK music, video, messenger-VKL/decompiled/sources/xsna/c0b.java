package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.t2b;

/* compiled from: ChannelHistoryAttachApiParser.kt */
/* loaded from: classes2.dex */
public final class c0b {
    public static final t2b.a a(JSONObject jSONObject, ArrayList arrayList, long j) throws VKApiIllegalResponseException, JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ProfilesSimpleInfo b = i1e0.b(jSONObject);
        f1e0 f1e0Var = new f1e0();
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int i2 = jSONObject2.getInt("cmid");
            try {
                Attach E = w04.E(jSONObject2.getJSONObject(SharedKt.PARAM_ATTACHMENT), f1e0Var);
                if (E instanceof AttachForMediaViewer) {
                    AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) E;
                    attachForMediaViewer.d2(i2);
                    attachForMediaViewer.Q1(j);
                }
                w04.b(E, b);
                arrayList2.add(E);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Attach attach = (Attach) next;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Class) it2.next()).isInstance(attach)) {
                        arrayList3.add(next);
                        break;
                    }
                }
            }
        }
        return new t2b.a(arrayList3, f1e0Var);
    }
}
