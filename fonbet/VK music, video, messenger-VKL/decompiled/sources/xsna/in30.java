package xsna;

import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MsgPackJSONArray.kt */
/* loaded from: classes3.dex */
public final class in30 extends JSONArray {
    public static final Field b;
    public rp70<Object> a;

    static {
        Field field;
        try {
            field = JSONArray.class.getDeclaredField("values");
            field.setAccessible(true);
        } catch (Throwable unused) {
            field = null;
        }
        b = field;
    }

    public in30(fh50 fh50Var) {
        this.a = fh50Var;
        Field field = b;
        if (field != null) {
            field.set(this, fh50Var.a());
        }
    }

    public static void d(in30 in30Var, mn30 mn30Var) {
        in30Var.getClass();
        mn30Var.array();
        rp70<Object> rp70Var = in30Var.a;
        Object[] objArr = rp70Var.a;
        int i = rp70Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            mn30Var.value(objArr[i2]);
        }
        mn30Var.endArray();
    }

    public final fh50<Object> a() {
        rp70<Object> rp70Var = this.a;
        fh50 fh50Var = sp70.b;
        Field field = b;
        if (rp70Var != fh50Var && (rp70Var instanceof fh50)) {
            if (field != null) {
                field.set(this, rp70Var.a());
            }
            return (fh50) rp70Var;
        }
        fh50<Object> fh50Var2 = new fh50<>(rp70Var.b);
        fh50Var2.l(rp70Var);
        this.a = fh50Var2;
        if (field != null) {
            field.set(this, fh50Var2.a());
        }
        return fh50Var2;
    }

    public final void b(Object obj) {
        a().j(obj);
    }

    public final void c(int i, Object obj) {
        while (a().b <= i) {
            a().j(null);
        }
        a().r(i, obj);
    }

    @Override // org.json.JSONArray
    public final boolean equals(Object obj) {
        in30 in30Var = obj instanceof in30 ? (in30) obj : null;
        return epx.f(in30Var != null ? in30Var.a : null, this.a);
    }

    @Override // org.json.JSONArray
    public final Object get(int i) {
        try {
            Object d = this.a.d(i);
            if (d != null) {
                return d;
            }
            throw new JSONException("Value at " + i + " is null.");
        } catch (IndexOutOfBoundsException unused) {
            throw new JSONException(vu5.b(ji.b(i, "Index ", " out of range [0.."), this.a.b, ')'));
        }
    }

    @Override // org.json.JSONArray
    public final boolean getBoolean(int i) {
        Object obj = get(i);
        Boolean u = sua.u(obj);
        if (u != null) {
            return u.booleanValue();
        }
        throw new JSONException("Value " + obj + " at " + Integer.valueOf(i) + " of type " + obj.getClass().getName() + " cannot be converted to boolean");
    }

    @Override // org.json.JSONArray
    public final double getDouble(int i) {
        Object obj = get(i);
        Double w = sua.w(obj);
        if (w != null) {
            return w.doubleValue();
        }
        throw new JSONException("Value " + obj + " at " + Integer.valueOf(i) + " of type " + obj.getClass().getName() + " cannot be converted to double");
    }

    @Override // org.json.JSONArray
    public final int getInt(int i) {
        Object obj = get(i);
        Integer y = sua.y(obj);
        if (y != null) {
            return y.intValue();
        }
        throw new JSONException("Value " + obj + " at " + Integer.valueOf(i) + " of type " + obj.getClass().getName() + " cannot be converted to int");
    }

    @Override // org.json.JSONArray
    public final JSONArray getJSONArray(int i) {
        Object obj = get(i);
        JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
        if (jSONArray != null) {
            return jSONArray;
        }
        throw new JSONException("Value " + obj + " at " + Integer.valueOf(i) + " of type " + obj.getClass().getName() + " cannot be converted to JSONArray");
    }

    @Override // org.json.JSONArray
    public final JSONObject getJSONObject(int i) {
        Object obj = get(i);
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        throw new JSONException("Value " + obj + " at " + Integer.valueOf(i) + " of type " + obj.getClass().getName() + " cannot be converted to JSONObject");
    }

    @Override // org.json.JSONArray
    public final long getLong(int i) {
        Object obj = get(i);
        Long z = sua.z(obj);
        if (z != null) {
            return z.longValue();
        }
        throw new JSONException("Value " + obj + " at " + Integer.valueOf(i) + " of type " + obj.getClass().getName() + " cannot be converted to long");
    }

    @Override // org.json.JSONArray
    public final String getString(int i) {
        return get(i).toString();
    }

    @Override // org.json.JSONArray
    public final int hashCode() {
        return (this.a.hashCode() * 31) + in30.class.hashCode();
    }

    @Override // org.json.JSONArray
    public final boolean isNull(int i) {
        Object opt = opt(i);
        return opt == null || opt == JSONObject.NULL;
    }

    @Override // org.json.JSONArray
    public final int length() {
        return this.a.b;
    }

    @Override // org.json.JSONArray
    public final Object opt(int i) {
        rp70<Object> rp70Var = this.a;
        if (i < 0 || i >= rp70Var.b) {
            return null;
        }
        return rp70Var.a[i];
    }

    @Override // org.json.JSONArray
    public final boolean optBoolean(int i) {
        return optBoolean(i, false);
    }

    @Override // org.json.JSONArray
    public final double optDouble(int i) {
        return optDouble(i, Double.NaN);
    }

    @Override // org.json.JSONArray
    public final int optInt(int i) {
        return optInt(i, 0);
    }

    @Override // org.json.JSONArray
    public final JSONArray optJSONArray(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    @Override // org.json.JSONArray
    public final JSONObject optJSONObject(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    @Override // org.json.JSONArray
    public final long optLong(int i) {
        return optLong(i, 0L);
    }

    @Override // org.json.JSONArray
    public final String optString(int i) {
        return optString(i, "");
    }

    @Override // org.json.JSONArray
    public final /* bridge */ /* synthetic */ JSONArray put(Object obj) {
        b(obj);
        return this;
    }

    @Override // org.json.JSONArray
    public final Object remove(int i) {
        if (i < 0 || i >= a().b) {
            return null;
        }
        return a().o(i);
    }

    @Override // org.json.JSONArray
    public final JSONObject toJSONObject(JSONArray jSONArray) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            int i = this.a.b;
            if (length > i) {
                length = i;
            }
            if (length != 0) {
                jn30 jn30Var = new jn30(length);
                for (int i2 = 0; i2 < length; i2++) {
                    Object opt = jSONArray.opt(i2);
                    String obj = opt != null ? opt.toString() : null;
                    if (obj != null) {
                        jn30Var.b(opt(i2), obj);
                    }
                }
                return jn30Var;
            }
        }
        return null;
    }

    @Override // org.json.JSONArray
    public final String toString() {
        try {
            mn30 mn30Var = new mn30();
            d(this, mn30Var);
            return mn30Var.toString();
        } catch (JSONException unused) {
            return "[]";
        }
    }

    @Override // org.json.JSONArray
    public final boolean optBoolean(int i, boolean z) {
        Boolean u = sua.u(opt(i));
        return u != null ? u.booleanValue() : z;
    }

    @Override // org.json.JSONArray
    public final double optDouble(int i, double d) {
        Double w = sua.w(opt(i));
        return w != null ? w.doubleValue() : d;
    }

    @Override // org.json.JSONArray
    public final int optInt(int i, int i2) {
        Integer y = sua.y(opt(i));
        return y != null ? y.intValue() : i2;
    }

    @Override // org.json.JSONArray
    public final long optLong(int i, long j) {
        Long z = sua.z(opt(i));
        return z != null ? z.longValue() : j;
    }

    @Override // org.json.JSONArray
    public final String optString(int i, String str) {
        String obj;
        Object opt = opt(i);
        return (opt == null || (obj = opt.toString()) == null) ? str : obj;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(boolean z) {
        a().j(Boolean.valueOf(z));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(double d) {
        a().j(Double.valueOf(d));
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public in30(int i) {
        this(r2);
        fh50 fh50Var;
        if (i == 0) {
            fh50Var = sp70.b;
        } else {
            fh50Var = new fh50(i);
        }
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i) {
        a().j(Integer.valueOf(i));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(long j) {
        a().j(Long.valueOf(j));
        return this;
    }

    @Override // org.json.JSONArray
    public final String toString(int i) {
        return toString();
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, boolean z) {
        c(i, Boolean.valueOf(z));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, double d) {
        c(i, Double.valueOf(d));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, int i2) {
        c(i, Integer.valueOf(i2));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, long j) {
        c(i, Long.valueOf(j));
        return this;
    }

    @Override // org.json.JSONArray
    public final JSONArray put(int i, Object obj) {
        c(i, obj);
        return this;
    }
}
