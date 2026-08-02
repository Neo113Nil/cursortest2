package sg.bigo.ads.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: sg.bigo.ads.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC2450a {
        boolean a(String str);
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        hashMap.put(sg.bigo.ads.a.a.O, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.1
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equalsIgnoreCase(sg.bigo.ads.a.a.ao)) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.P, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.2
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equals("1")) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.Q, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.3
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equalsIgnoreCase(sg.bigo.ads.a.a.ap)) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.R, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.4
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equalsIgnoreCase(sg.bigo.ads.a.a.ap)) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.S, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.5
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equalsIgnoreCase(sg.bigo.ads.a.a.ap)) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.T, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.6
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equals("0")) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.U, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.7
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equals("0")) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.V, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.8
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equals("0")) ? false : true;
            }
        });
        hashMap.put(sg.bigo.ads.a.a.W, new InterfaceC2450a() { // from class: sg.bigo.ads.c.a.9
            @Override // sg.bigo.ads.c.a.InterfaceC2450a
            public final boolean a(String str) {
                return (str == null || str.equals("0")) ? false : true;
            }
        });
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String a = e.a(str);
            if (!TextUtils.isEmpty(a) && ((InterfaceC2450a) entry.getValue()).a(a)) {
                try {
                    jSONObject.put(str, a);
                } catch (JSONException unused) {
                }
            }
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }
}
