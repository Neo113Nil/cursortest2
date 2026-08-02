package xsna;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Preconditions.java */
/* loaded from: classes.dex */
public final class fxc0 implements y6z0 {
    public static bpn0 a;

    public static void A(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static final g7s0 B() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (g7s0) bpn0Var.getValue();
    }

    public static String d(e7z0 e7z0Var) {
        udz0 udz0Var = e7z0Var.a;
        if (udz0Var.f != v5z0.b && udz0Var.i == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_context", f(e7z0Var.a));
                giy0 giy0Var = e7z0Var.b;
                if (giy0Var != null) {
                    jSONObject.put("banner_context", e(giy0Var));
                }
                jSONObject.put(X3.i.q, e7z0Var.c);
                jSONObject.put("stat_description", e7z0Var.d);
                return jSONObject.toString();
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("MonitoringSerializer: seriailize exception - "), th);
            }
        }
        return "";
    }

    public static JSONObject e(giy0 giy0Var) {
        JSONObject jSONObject = new JSONObject();
        g9y0 g9y0Var = giy0Var.b;
        String str = g9y0Var.a;
        List list = g9y0Var.f;
        jSONObject.put("banner_id", str);
        jSONObject.put("impression_id", g9y0Var.b);
        jSONObject.put("pad_id", g9y0Var.c);
        jSONObject.put("pattern_id", g9y0Var.d);
        Integer num = g9y0Var.e;
        if (num != null) {
            jSONObject.put("dsp_id", num);
        }
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Integer) it.next()).intValue());
            }
            jSONObject.put("labels", jSONArray);
        }
        return jSONObject;
    }

    public static JSONObject f(udz0 udz0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_id", udz0Var.a);
        jSONObject.putOpt("handle_data_id", udz0Var.b);
        jSONObject.put("ad_format", udz0Var.c);
        jSONObject.putOpt("slot_id", udz0Var.d);
        jSONObject.put("ad_source", udz0Var.e);
        jSONObject.put("cache_policy", udz0Var.g);
        jSONObject.put("tag", udz0Var.h);
        return jSONObject;
    }

    public static giy0 g(udz0 udz0Var, JSONObject jSONObject) {
        return new giy0(udz0Var, new g9y0(jSONObject.getString("banner_id"), wn4.f("impression_id", jSONObject), wn4.f("pad_id", jSONObject), wn4.f("pattern_id", jSONObject), wn4.c(jSONObject, "dsp_id"), wn4.e(jSONObject)));
    }

    public static e7z0 h(String str) {
        if (TextUtils.isEmpty(str)) {
            return e7z0.e;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            udz0 i = i(jSONObject.getJSONObject("ad_context"));
            return new e7z0(i, jSONObject.has("banner_context") ? g(i, jSONObject.getJSONObject("banner_context")) : null, jSONObject.getInt(X3.i.q), jSONObject.getString("stat_description"));
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("MonitoringSerializer: deseriailize exception - "), th);
            return e7z0.e;
        }
    }

    public static udz0 i(JSONObject jSONObject) {
        udz0 udz0Var;
        udz0 udz0Var2;
        String string = jSONObject.getString("ad_id");
        String string2 = jSONObject.has("handle_data_id") ? jSONObject.getString("handle_data_id") : null;
        int i = jSONObject.getInt("ad_format");
        Integer valueOf = jSONObject.has("slot_id") ? Integer.valueOf(jSONObject.getInt("slot_id")) : null;
        int i2 = jSONObject.getInt("ad_source");
        int i3 = jSONObject.getInt("cache_policy");
        boolean z = true;
        if (i2 != 0 || valueOf == null) {
            if (i2 == 1) {
                udz0Var = new udz0(string, string2, -1, i, 1, v5z0.a);
            } else {
                if (i2 != 2) {
                    throw new Exception("Unknown json format or content");
                }
                udz0Var = new udz0(string, null, -1, i, 2, v5z0.a);
            }
            udz0Var2 = udz0Var;
        } else {
            udz0Var2 = new udz0(string, null, valueOf, i, 0, v5z0.a);
        }
        if (udz0Var2.i == 0) {
            udz0Var2.f.b(udz0Var2, true, new zer0(udz0Var2, z, 1));
        }
        udz0Var2.g = i3;
        return udz0Var2;
    }

    public static String j(int i, int i2, String str) {
        if (i < 0) {
            return f370.E("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return f370.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(lhg.a(i2, "negative size: "));
    }

    public static void k(int i, int i2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(f370.E(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void l(int i, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(f370.E(str, Integer.valueOf(i)));
        }
    }

    public static void m(long j, long j2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(f370.E(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void n(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(f370.E(str, Long.valueOf(j)));
        }
    }

    public static void o(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(f370.E(str, obj));
        }
    }

    public static void p(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void q(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void r(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(f370.E(str, obj, obj2));
        }
    }

    public static void s(int i, int i2) {
        String E;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                E = f370.E("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(lhg.a(i2, "negative size: "));
                }
                E = f370.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(E);
        }
    }

    public static void t(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void u(et10 et10Var) {
        et10Var.getClass();
    }

    public static void v(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(j(i, i2, "index"));
        }
    }

    public static void w(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? j(i, i3, "start index") : (i2 < 0 || i2 > i3) ? j(i2, i3, "end index") : f370.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void x(int i, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(f370.E(str, Integer.valueOf(i)));
        }
    }

    public static void y(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(f370.E(str, obj));
        }
    }

    public static void z(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Override // xsna.y6z0
    public void b(udz0 udz0Var, boolean z, zer0 zer0Var) {
    }

    @Override // xsna.y6z0
    public void a(udz0 udz0Var, int i, int i2, int i3, String str, String str2) {
    }

    @Override // xsna.y6z0
    public void c(giy0 giy0Var, int i, int i2, int i3, String str, String str2) {
    }
}
