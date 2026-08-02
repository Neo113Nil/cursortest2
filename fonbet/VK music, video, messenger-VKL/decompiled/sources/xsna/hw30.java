package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: MsgSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class hw30<Result> implements k7r0 {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ProfilesSimpleInfo d;
    public final /* synthetic */ f1e0 e;
    public final /* synthetic */ LinkedHashSet f;

    public hw30(ArrayList arrayList, ArrayList arrayList2, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var, LinkedHashSet linkedHashSet) {
        this.b = arrayList;
        this.c = arrayList2;
        this.d = profilesSimpleInfo;
        this.e = f1e0Var;
        this.f = linkedHashSet;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList<gtx0> arrayList;
        f1e0 f1e0Var;
        ProfilesSimpleInfo profilesSimpleInfo = this.d;
        LinkedHashSet linkedHashSet = this.f;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            JSONArray optJSONArray = jSONObject2.optJSONArray("conversations");
            profilesSimpleInfo.Hb(i1e0.b(jSONObject2));
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                arrayList = this.b;
                f1e0Var = this.e;
                if (i >= length) {
                    break;
                }
                arrayList.add(bh30.e(jSONArray.getJSONObject(i), f1e0Var));
                i++;
            }
            ad0.J(arrayList, MessageSource.MESSAGES_SEARCH);
            ArrayList arrayList2 = this.c;
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList2.add(dsj.b(optJSONArray.getJSONObject(i2), f1e0Var));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Long.valueOf(((Msg) it.next()).c));
            }
            for (gtx0 gtx0Var : arrayList) {
                if (!profilesSimpleInfo.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) gtx0Var;
                    Iterator<T> it2 = aVar.K0().iterator();
                    while (it2.hasNext()) {
                        w04.b((Attach) it2.next(), profilesSimpleInfo);
                    }
                    for (NestedMsg nestedMsg : aVar.q7()) {
                        Iterator it3 = nestedMsg.j.iterator();
                        while (it3.hasNext()) {
                            w04.b((Attach) it3.next(), profilesSimpleInfo);
                        }
                        for (NestedMsg nestedMsg2 : nestedMsg.k) {
                            Iterator it4 = nestedMsg2.j.iterator();
                            while (it4.hasNext()) {
                                w04.b((Attach) it4.next(), profilesSimpleInfo);
                            }
                            Iterator it5 = nestedMsg2.k.iterator();
                            while (it5.hasNext()) {
                                bh30.c((NestedMsg) it5.next(), profilesSimpleInfo);
                            }
                        }
                    }
                }
            }
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                dsj.a((com.vk.im.engine.models.dialogs.a) it6.next(), profilesSimpleInfo);
            }
            return s3q0.a;
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
