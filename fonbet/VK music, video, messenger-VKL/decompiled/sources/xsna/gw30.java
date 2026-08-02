package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dw30;
import xsna.k7r0;

/* compiled from: MsgSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class gw30<Result> implements k7r0 {
    public final /* synthetic */ dw30 b;

    public gw30(dw30 dw30Var) {
        this.b = dw30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        int i = this.b.d;
        ArrayList arrayList = new ArrayList();
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        f1e0 f1e0Var = new f1e0();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            profilesSimpleInfo.Hb(i1e0.b(jSONObject2));
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    arrayList.add(new zpp(dsj.b(jSONObject3, f1e0Var), jSONObject3.optString("track_code")));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dsj.a((com.vk.im.engine.models.dialogs.a) ((zpp) it.next()).a, profilesSimpleInfo);
            }
            return new dw30.a.C2765a(arrayList.subList(0, Math.min(arrayList.size(), i)), profilesSimpleInfo, arrayList.size() < i + 1, f1e0Var);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
