package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.v9e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class eae0 implements wzs {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        it80 it80Var = (it80) obj;
        String str = (String) obj2;
        if (!drm0.N(str)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"Proxy config source: Studilka"});
            }
            v9e0 v9e0Var = v9e0.d;
            if (drm0.N(str)) {
                return v9e0.d;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("proxies");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    linkedHashMap.put(jSONObject2.getString("ip"), Integer.valueOf(jSONObject2.optInt("weight", 1)));
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray("domains");
                int length2 = jSONArray2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    String string = jSONArray2.getString(i3);
                    linkedHashSet.add(string);
                    int i4 = 0;
                    for (int i5 = 0; i5 < string.length(); i5++) {
                        if (string.charAt(i5) == '.') {
                            i4++;
                        }
                    }
                    linkedHashSet2.add(Integer.valueOf(i4 + 1));
                }
                return v9e0.a.a(linkedHashMap, linkedHashSet, j5g.R0(j5g.C0(linkedHashSet2)));
            } catch (Throwable th) {
                L.i(th);
                return v9e0.d;
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"Proxy config source: FB"});
        }
        v9e0 v9e0Var2 = v9e0.d;
        String str2 = (String) it80Var.a;
        if (str2 == null || drm0.N(str2)) {
            return v9e0.d;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        try {
            JSONObject jSONObject3 = new JSONObject(str2);
            JSONArray jSONArray3 = (JSONArray) ((JSONObject) jSONObject3.get("data")).get("ip");
            JSONArray jSONArray4 = (JSONArray) ((JSONObject) jSONObject3.get("data")).get("weight");
            int length3 = jSONArray3.length();
            for (int i6 = 0; i6 < length3; i6++) {
                String string2 = jSONArray3.getString(i6);
                try {
                    i = jSONArray4.getInt(i6);
                } catch (Exception unused) {
                    i = -1;
                }
                linkedHashMap2.put(string2, Integer.valueOf(i));
            }
            JSONArray jSONArray5 = (JSONArray) ((JSONObject) jSONObject3.get("data")).get("domains");
            int length4 = jSONArray5.length();
            for (int i7 = 0; i7 < length4; i7++) {
                String string3 = jSONArray5.getString(i7);
                linkedHashSet3.add(string3);
                int i8 = 0;
                for (int i9 = 0; i9 < string3.length(); i9++) {
                    if (string3.charAt(i9) == '.') {
                        i8++;
                    }
                }
                linkedHashSet4.add(Integer.valueOf(i8 + 1));
            }
            return v9e0.a.a(linkedHashMap2, linkedHashSet3, j5g.R0(j5g.C0(linkedHashSet4)));
        } catch (Exception e) {
            L.i(e);
            return v9e0.d;
        }
    }
}
