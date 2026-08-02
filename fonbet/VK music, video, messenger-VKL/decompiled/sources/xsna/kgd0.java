package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.superapp.api.dto.qr.ModalAuthFlowType;
import com.vk.superapp.api.internal.requests.qr.ProcessAuthCode$Companion$Action;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: ProcessAuthCode.kt */
/* loaded from: classes6.dex */
public final class kgd0 extends rdx0<sne0> {
    public kgd0(ProcessAuthCode$Companion$Action processAuthCode$Companion$Action, String str, boolean z) {
        super("auth.processAuthCode");
        j("auth_code", str);
        j("action", processAuthCode$Companion$Action.h());
        this.j.put("internal_camera", z ? "1" : "0");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        rtd0 rtd0Var;
        n55 n55Var;
        String str;
        mlc mlcVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        String A;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONObject optJSONObject = jSONObject2.optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("first_name");
            String optString2 = optJSONObject.optString("last_name");
            String A2 = f370.A("phone", optJSONObject);
            String A3 = f370.A("photo_base", optJSONObject);
            if ((A3 == null || (A = A3.concat("&cs=200x0")) == null) && (A = f370.A("photo_200", optJSONObject)) == null) {
                A = optJSONObject.optString("photo_50");
            }
            rtd0Var = new rtd0(optString, optString2, A2, A);
        } else {
            rtd0Var = null;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("auth_info");
        if (optJSONObject2 != null) {
            String optString3 = optJSONObject2.optString(X3.j.D);
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("client_info");
            if (optJSONObject3 != null) {
                int optInt = optJSONObject3.optInt("id");
                String string = optJSONObject3.getString("name");
                String A4 = f370.A("icon_150", optJSONObject3);
                if (A4 == null) {
                    A4 = optJSONObject3.optString("icon_75");
                }
                String str2 = A4;
                boolean z = optJSONObject3.getBoolean("is_official");
                JSONArray optJSONArray = optJSONObject3.optJSONArray(SharedKt.PARAM_SCOPES);
                if (optJSONArray != null) {
                    ArrayList arrayList3 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                        Serializer.c<VkAuthAppScope> cVar = VkAuthAppScope.CREATOR;
                        arrayList3.add(VkAuthAppScope.a.a(jSONObject3));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                JSONArray optJSONArray2 = optJSONObject3.optJSONArray("agreements");
                if (optJSONArray2 != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray2.length());
                    int length2 = optJSONArray2.length();
                    int i2 = 0;
                    while (i2 < length2) {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                        arrayList4.add(new mao0(jSONObject4.optString("name"), jSONObject4.optString("uri")));
                        i2++;
                        optJSONArray2 = optJSONArray2;
                        optString3 = optString3;
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                str = optString3;
                mlcVar = new mlc(optInt, string, str2, z, arrayList, arrayList2);
            } else {
                str = optString3;
                mlcVar = null;
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("device_info");
            h6m h6mVar = new h6m(optJSONObject4.optString("name"), optJSONObject4.optString("ip"), optJSONObject4.optString("location"), optJSONObject4.optString("location_map"), optJSONObject4.optString("browser_name"));
            ModalAuthFlowType.a aVar = ModalAuthFlowType.Companion;
            int optInt2 = optJSONObject2.optInt("flow_type", 0);
            aVar.getClass();
            n55Var = new n55(str, h6mVar, mlcVar, optInt2 == 1 ? ModalAuthFlowType.MvkAuthFlow : ModalAuthFlowType.QrAuthFlow, optJSONObject2.optString("auth_id"));
        } else {
            n55Var = null;
        }
        return new sne0(rtd0Var, n55Var, Integer.valueOf(jSONObject2.optInt("status")));
    }
}
