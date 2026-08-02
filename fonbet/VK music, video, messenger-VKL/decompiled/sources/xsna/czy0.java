package xsna;

import android.text.TextUtils;
import com.ironsource.O6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class czy0 {
    public final ohz0 a;
    public final jkz0 b;
    public final u6z0 c;
    public final xhz0 d;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        njz0 a(JSONObject jSONObject, jkz0 jkz0Var, u6z0 u6z0Var, xla xlaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public czy0(a aVar, jkz0 jkz0Var, u6z0 u6z0Var) {
        this.a = (ohz0) aVar;
        this.b = jkz0Var;
        this.c = u6z0Var;
        this.d = new xhz0(jkz0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [xsna.czy0$a, xsna.ohz0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wcy0 a(JSONObject jSONObject, xla xlaVar) {
        ArrayList arrayList;
        xgy0 xgy0Var;
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(O6.E1);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            xlaVar.b(iaz0.v);
            return null;
        }
        wcy0 wcy0Var = new wcy0();
        int optInt = jSONObject.optInt("refreshTimeout", wcy0Var.b);
        if (optInt >= 0) {
            wcy0Var.b = optInt;
        }
        int length = optJSONArray.length();
        int i = 0;
        while (true) {
            arrayList = wcy0Var.a;
            if (i >= length) {
                break;
            }
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null) {
                String optString = optJSONObject2.optString("name");
                if (!TextUtils.isEmpty(optString)) {
                    String optString2 = optJSONObject2.optString("placementId");
                    if (!TextUtils.isEmpty(optString2)) {
                        String optString3 = optJSONObject2.optString(O6.G1);
                        if (!TextUtils.isEmpty(optString3)) {
                            xgy0Var = new xgy0(optString, optString2, optString3);
                            if (xgy0Var.b() && (optJSONObject = optJSONObject2.optJSONObject("banner")) != null) {
                                xgy0Var.g = this.a.a(optJSONObject, this.b, this.c, xlaVar);
                            }
                            String optString4 = optJSONObject2.optString("payload");
                            if (!TextUtils.isEmpty(optString4)) {
                                xgy0Var.f = optString4;
                            }
                            int optInt2 = optJSONObject2.optInt("timeout", xgy0Var.h);
                            if (optInt2 > 0) {
                                xgy0Var.h = optInt2;
                            }
                            xgy0Var.i = (float) optJSONObject2.optDouble(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, xgy0Var.i);
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("params");
                            if (optJSONObject3 != null) {
                                Iterator<String> keys = optJSONObject3.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    if (!TextUtils.isEmpty(next)) {
                                        String optString5 = optJSONObject3.optString(next);
                                        if (!TextUtils.isEmpty(next)) {
                                            HashMap hashMap = xgy0Var.e;
                                            if (optString5 == null) {
                                                hashMap.remove(next);
                                            } else {
                                                hashMap.put(next, optString5);
                                            }
                                        }
                                    }
                                }
                            }
                            this.d.b(xgy0Var.d, optJSONObject2, -1.0f);
                            if (xgy0Var == null) {
                                int size = arrayList.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        arrayList.add(xgy0Var);
                                        break;
                                    }
                                    if (xgy0Var.i > ((xgy0) arrayList.get(i2)).i) {
                                        arrayList.add(i2, xgy0Var);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                xgy0Var = null;
                if (xgy0Var == null) {
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            return wcy0Var;
        }
        xlaVar.b(iaz0.v);
        return null;
    }
}
