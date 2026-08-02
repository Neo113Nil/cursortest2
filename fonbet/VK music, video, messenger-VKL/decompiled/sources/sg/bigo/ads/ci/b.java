package sg.bigo.ads.ci;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.n;

/* loaded from: classes9.dex */
public final class b implements sg.bigo.ads.ai.b {

    @Nullable
    public i a;
    String b = "";

    @NonNull
    private Map<Integer, Map<Integer, a>> c = new HashMap();

    public static class a {
        long a;
        int b;
        int c;
        long d;
        int e;
        int f;
        int g;
    }

    private a a(n nVar) {
        int b;
        Map<Integer, a> map;
        if (nVar == null) {
            return null;
        }
        int v = nVar.v();
        if (v == 0) {
            v = 1;
        }
        if (v == 3 || (b = nVar.b()) == 2 || (map = this.c.get(Integer.valueOf(v))) == null) {
            return null;
        }
        return map.get(Integer.valueOf(b));
    }

    private a k(String str) {
        i iVar;
        if (TextUtils.isEmpty(str) || (iVar = this.a) == null) {
            return null;
        }
        return a(iVar.a(str));
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        a(parcel.readString());
    }

    @Override // sg.bigo.ads.ai.b
    public final boolean c(String str) {
        i iVar;
        n a2;
        int b;
        if (TextUtils.isEmpty(str) || (iVar = this.a) == null || (a2 = iVar.a(str)) == null) {
            return false;
        }
        int v = a2.v();
        if (v == 0) {
            v = 1;
        }
        return (v == 3 || (b = a2.b()) == 2 || b == 12) ? false : true;
    }

    @Override // sg.bigo.ads.ai.b
    public final String d(String str) {
        i iVar;
        n a2;
        if (TextUtils.isEmpty(str) || (iVar = this.a) == null || (a2 = iVar.a(str)) == null) {
            return null;
        }
        return String.valueOf(a2.b());
    }

    @Override // sg.bigo.ads.ai.b
    public final long e(String str) {
        a k = k(str);
        if (k != null) {
            return k.a;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.ai.b
    public final int f(String str) {
        a k = k(str);
        if (k != null) {
            return k.f;
        }
        return 0;
    }

    @Override // sg.bigo.ads.ai.b
    public final int g(String str) {
        a k = k(str);
        if (k != null) {
            return k.g;
        }
        return 0;
    }

    @Override // sg.bigo.ads.ai.b
    public final int h(String str) {
        a k = k(str);
        if (k != null) {
            return k.b;
        }
        return 0;
    }

    @Override // sg.bigo.ads.ai.b
    public final boolean i(String str) {
        a k = k(str);
        return k != null && k.c == 1;
    }

    @Override // sg.bigo.ads.ai.b
    public final long j(String str) {
        a k = k(str);
        if (k != null) {
            return k.d;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.b);
    }

    @Override // sg.bigo.ads.ai.b
    public final boolean b(String str) {
        a k = k(str);
        return k != null && k.e == 1;
    }

    @Override // sg.bigo.ads.ai.b
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.c.isEmpty()) {
                return;
            }
            this.c = new HashMap();
            return;
        }
        this.b = str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    a aVar = new a();
                    aVar.a = optJSONObject.optLong("tmax", 15L);
                    aVar.b = optJSONObject.optInt("cache_num", 2);
                    aVar.c = optJSONObject.optInt("single_ad", 0);
                    aVar.d = optJSONObject.optLong("single_tmax", 15L);
                    aVar.e = optJSONObject.optInt("tmax_switch", 0);
                    aVar.f = optJSONObject.optInt("tmax_strategy", 0);
                    aVar.g = optJSONObject.optInt("assign_strategy", 0);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("auc_type");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_type");
                    if (optJSONArray != null && optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            int optInt = optJSONArray.optInt(i2);
                            if (optInt == 0) {
                                optInt = 1;
                            }
                            Map map = (Map) hashMap.get(Integer.valueOf(optInt));
                            if (map == null) {
                                map = new HashMap();
                                hashMap.put(Integer.valueOf(optInt), map);
                            }
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                int optInt2 = optJSONArray2.optInt(i3);
                                if (((a) map.get(Integer.valueOf(optInt2))) == null) {
                                    map.put(Integer.valueOf(optInt2), aVar);
                                }
                            }
                        }
                    }
                }
            }
            this.c = hashMap;
        } catch (JSONException unused) {
        }
    }
}
