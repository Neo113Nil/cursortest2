package xsna;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MsgPackJSONObject.kt */
/* loaded from: classes3.dex */
public final class jn30 extends JSONObject {
    public static final Field c;
    public g5h0<String, Object> a;
    public final i5h0<String, Object> b;

    /* compiled from: MsgPackJSONObject.kt */
    public static final class a implements Iterator<String>, gcy {
        public int b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < jn30.this.a().e;
        }

        @Override // java.util.Iterator
        public final String next() {
            int i = this.b;
            jn30 jn30Var = jn30.this;
            if (i >= jn30Var.a().e) {
                throw new NoSuchElementException();
            }
            ph50<String, Object> a = jn30Var.a();
            Object[] objArr = a.b;
            long[] jArr = a.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                String str = (String) objArr[(i2 << 3) + i5];
                                int i6 = this.b;
                                if (i3 == i6) {
                                    this.b = i6 + 1;
                                    return str;
                                }
                                i3++;
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            this.b++;
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        Field field;
        try {
            field = JSONObject.class.getDeclaredField("nameValuePairs");
            field.setAccessible(true);
        } catch (Throwable unused) {
            field = null;
        }
        c = field;
    }

    public jn30() {
        this((Object) null);
    }

    public final ph50<String, Object> a() {
        g5h0<String, Object> g5h0Var = this.a;
        if (g5h0Var != h5h0.b && (g5h0Var instanceof ph50)) {
            c(g5h0Var);
            return (ph50) g5h0Var;
        }
        ph50<String, Object> ph50Var = new ph50<>(g5h0Var.e);
        ph50Var.m(g5h0Var);
        this.a = ph50Var;
        c(ph50Var);
        return ph50Var;
    }

    @Override // org.json.JSONObject
    public final JSONObject accumulate(String str, Object obj) {
        Object d = this.a.d(str);
        if (d == null) {
            b(obj, str);
            return this;
        }
        if (d instanceof JSONArray) {
            ((JSONArray) d).put(obj);
            return this;
        }
        in30 in30Var = new in30(2);
        in30Var.b(d);
        in30Var.b(obj);
        a().p(str, in30Var);
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject append(String str, Object obj) {
        JSONArray in30Var;
        Object d = this.a.d(str);
        if (d instanceof JSONArray) {
            in30Var = (JSONArray) d;
        } else {
            if (d != null) {
                throw new JSONException(zr.a("Key ", str, " is not a JSONArray"));
            }
            in30Var = new in30(1);
            a().p(str, in30Var);
        }
        in30Var.put(obj);
        return this;
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            a().n(str);
        } else {
            a().p(str, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(g5h0<String, Object> g5h0Var) {
        Field field = c;
        if (field != null) {
            field.setAccessible(true);
        }
        i5h0<String, Object> i5h0Var = this.b;
        i5h0Var.scatterMap = g5h0Var;
        if (field != null) {
            field.set(this, i5h0Var);
        }
    }

    public final void d(mn30 mn30Var) {
        mn30 mn30Var2;
        mn30Var.object();
        ph50<String, Object> a2 = a();
        Object[] objArr = a2.b;
        Object[] objArr2 = a2.c;
        long[] jArr = a2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            mn30Var.key((String) objArr[i4]).value(objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    mn30Var2 = mn30Var;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    mn30Var2 = mn30Var;
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            mn30Var2 = mn30Var;
        }
        mn30Var2.endObject();
    }

    @Override // org.json.JSONObject
    public final Object get(String str) {
        Object d = this.a.d(str);
        if (d != null) {
            return d;
        }
        throw new JSONException("No value for ".concat(str));
    }

    @Override // org.json.JSONObject
    public final boolean getBoolean(String str) {
        Object obj = get(str);
        Boolean u = sua.u(obj);
        if (u != null) {
            return u.booleanValue();
        }
        throw new JSONException("Value " + obj + " at " + ((Object) str) + " of type " + obj.getClass().getName() + " cannot be converted to boolean");
    }

    @Override // org.json.JSONObject
    public final double getDouble(String str) {
        Object obj = get(str);
        Double w = sua.w(obj);
        if (w != null) {
            return w.doubleValue();
        }
        throw new JSONException("Value " + obj + " at " + ((Object) str) + " of type " + obj.getClass().getName() + " cannot be converted to double");
    }

    @Override // org.json.JSONObject
    public final int getInt(String str) {
        Object obj = get(str);
        Integer y = sua.y(obj);
        if (y != null) {
            return y.intValue();
        }
        throw new JSONException("Value " + obj + " at " + ((Object) str) + " of type " + obj.getClass().getName() + " cannot be converted to int");
    }

    @Override // org.json.JSONObject
    public final JSONArray getJSONArray(String str) {
        Object obj = get(str);
        JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
        if (jSONArray != null) {
            return jSONArray;
        }
        throw new JSONException("Value " + obj + " at " + ((Object) str) + " of type " + obj.getClass().getName() + " cannot be converted to JSONArray");
    }

    @Override // org.json.JSONObject
    public final JSONObject getJSONObject(String str) {
        Object obj = get(str);
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        throw new JSONException("Value " + obj + " at " + ((Object) str) + " of type " + obj.getClass().getName() + " cannot be converted to JSONObject");
    }

    @Override // org.json.JSONObject
    public final long getLong(String str) {
        Object obj = get(str);
        Long z = sua.z(obj);
        if (z != null) {
            return z.longValue();
        }
        throw new JSONException("Value " + obj + " at " + ((Object) str) + " of type " + obj.getClass().getName() + " cannot be converted to long");
    }

    @Override // org.json.JSONObject
    public final String getString(String str) {
        return get(str).toString();
    }

    @Override // org.json.JSONObject
    public final boolean has(String str) {
        return str != null && this.a.b(str);
    }

    @Override // org.json.JSONObject
    public final boolean isNull(String str) {
        Object d = str != null ? this.a.d(str) : null;
        return d == null || d == JSONObject.NULL;
    }

    @Override // org.json.JSONObject
    public final Iterator<String> keys() {
        return new a();
    }

    @Override // org.json.JSONObject
    public final int length() {
        return this.a.e;
    }

    @Override // org.json.JSONObject
    public final JSONArray names() {
        if (this.a.f()) {
            return null;
        }
        in30 in30Var = new in30(a().e);
        ph50<String, Object> a2 = a();
        Object[] objArr = a2.b;
        long[] jArr = a2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            in30Var.b((String) objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return in30Var;
    }

    @Override // org.json.JSONObject
    public final Object opt(String str) {
        if (str != null) {
            return this.a.d(str);
        }
        return null;
    }

    @Override // org.json.JSONObject
    public final boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    @Override // org.json.JSONObject
    public final double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    @Override // org.json.JSONObject
    public final int optInt(String str) {
        return optInt(str, 0);
    }

    @Override // org.json.JSONObject
    public final JSONArray optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    @Override // org.json.JSONObject
    public final JSONObject optJSONObject(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    @Override // org.json.JSONObject
    public final long optLong(String str) {
        return optLong(str, 0L);
    }

    @Override // org.json.JSONObject
    public final String optString(String str) {
        return optString(str, "");
    }

    @Override // org.json.JSONObject
    public final /* bridge */ /* synthetic */ JSONObject put(String str, Object obj) {
        b(obj, str);
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject putOpt(String str, Object obj) {
        if (str != null && obj != null) {
            b(obj, str);
        }
        return this;
    }

    @Override // org.json.JSONObject
    public final Object remove(String str) {
        if (str != null) {
            return a().n(str);
        }
        return null;
    }

    @Override // org.json.JSONObject
    public final JSONArray toJSONArray(JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) == 0) {
            return null;
        }
        in30 in30Var = new in30(length);
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            in30Var.b(opt(opt != null ? opt.toString() : null));
        }
        return in30Var;
    }

    @Override // org.json.JSONObject
    public final String toString() {
        try {
            mn30 mn30Var = new mn30();
            d(mn30Var);
            return mn30Var.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public jn30(g5h0<String, Object> g5h0Var) {
        this.a = g5h0Var;
        g5h0 g5h0Var2 = this.a;
        i5h0<String, Object> i5h0Var = new i5h0<>();
        i5h0Var.scatterMap = g5h0Var2;
        this.b = i5h0Var;
        c(this.a);
    }

    @Override // org.json.JSONObject
    public final boolean optBoolean(String str, boolean z) {
        Boolean u = sua.u(opt(str));
        return u != null ? u.booleanValue() : z;
    }

    @Override // org.json.JSONObject
    public final double optDouble(String str, double d) {
        Double w = sua.w(opt(str));
        return w != null ? w.doubleValue() : d;
    }

    @Override // org.json.JSONObject
    public final int optInt(String str, int i) {
        Integer y = sua.y(opt(str));
        return y != null ? y.intValue() : i;
    }

    @Override // org.json.JSONObject
    public final long optLong(String str, long j) {
        Long z = sua.z(opt(str));
        return z != null ? z.longValue() : j;
    }

    @Override // org.json.JSONObject
    public final String optString(String str, String str2) {
        String obj;
        Object opt = opt(str);
        return (opt == null || (obj = opt.toString()) == null) ? str2 : obj;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, boolean z) {
        a().p(str, Boolean.valueOf(z));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, double d) {
        a().p(str, Double.valueOf(d));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, int i) {
        a().p(str, Integer.valueOf(i));
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, long j) {
        a().p(str, Long.valueOf(j));
        return this;
    }

    @Override // org.json.JSONObject
    public final String toString(int i) {
        return toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jn30(int i) {
        this((g5h0<String, Object>) r2);
        ph50 ph50Var;
        if (i == 0) {
            ph50Var = h5h0.b;
        } else {
            ph50Var = new ph50(i);
        }
    }

    public jn30(Object obj) {
        this((g5h0<String, Object>) h5h0.b);
    }
}
