package xsna;

import com.vk.core.bundle.Descriptor;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Container.kt */
/* loaded from: classes.dex */
public abstract class xej {
    public final ConcurrentHashMap<c7r, Object> a;

    /* compiled from: Container.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Descriptor.values().length];
            try {
                iArr[Descriptor.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Descriptor.Int.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Descriptor.Long.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Descriptor.Float.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Descriptor.Double.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Descriptor.String.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Descriptor.JSONSerialize.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Descriptor.IntArray.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xej() {
        this(null);
    }

    public final <FIELD extends c7r, VALUE> VALUE a(FIELD field) {
        VALUE value = (VALUE) this.a.get(field);
        if (value == null) {
            return null;
        }
        return value;
    }

    public final <FIELD extends c7r, VALUE> VALUE b(FIELD field, VALUE value) {
        VALUE value2 = (VALUE) this.a.get(field);
        if (value2 == null) {
            value2 = null;
        }
        return value2 == null ? value : value2;
    }

    public final int c(i7r i7rVar, int i) {
        return ((Number) b(i7rVar, Integer.valueOf(i))).intValue();
    }

    public final long d(m7r m7rVar) {
        return ((Number) b(m7rVar, 0L)).longValue();
    }

    public final boolean e(d7r d7rVar) {
        return ((Boolean) b(d7rVar, Boolean.FALSE)).booleanValue();
    }

    public final boolean equals(Object obj) {
        xej xejVar = obj instanceof xej ? (xej) obj : null;
        return epx.f(this.a, xejVar != null ? xejVar.a : null);
    }

    public final <FIELD extends c7r, VALUE> void f(FIELD field, VALUE value) {
        ConcurrentHashMap<c7r, Object> concurrentHashMap = this.a;
        if (value == null) {
            concurrentHashMap.remove(field);
        } else {
            concurrentHashMap.put(field, value);
        }
    }

    public bxx g(String str, JSONObject jSONObject) {
        return null;
    }

    public final JSONObject h() {
        JSONObject put;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<c7r, Object> entry : this.a.entrySet()) {
            c7r key = entry.getKey();
            Object value = entry.getValue();
            String str = key.a;
            switch (a.$EnumSwitchMapping$0[key.b.ordinal()]) {
                case 1:
                    put = new JSONObject().put("B", (Boolean) value);
                    break;
                case 2:
                    put = new JSONObject().put("I", (Integer) value);
                    break;
                case 3:
                    put = new JSONObject().put("L", (Long) value);
                    break;
                case 4:
                    put = new JSONObject().put("F", (Float) value);
                    break;
                case 5:
                    put = new JSONObject().put("D", (Double) value);
                    break;
                case 6:
                    put = new JSONObject().put("S", (String) value);
                    break;
                case 7:
                    put = new JSONObject().put("jS", ((bxx) value).e5());
                    break;
                case 8:
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = null;
                    int[] iArr = value instanceof int[] ? (int[]) value : null;
                    if (iArr != null) {
                        jSONArray = new JSONArray();
                        for (int i : iArr) {
                            jSONArray.put(i);
                        }
                    }
                    put = jSONObject2.put("IA", jSONArray);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            jSONObject.put(str, put);
        }
        return jSONObject;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xej(JSONObject jSONObject) {
        Iterator<String> keys;
        this.a = new ConcurrentHashMap<>();
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            if (jSONObject2.has("B")) {
                f(new d7r(next), Boolean.valueOf(jSONObject2.getBoolean("B")));
            } else if (jSONObject2.has("I")) {
                f(new i7r(next), Integer.valueOf(jSONObject2.getInt("I")));
            } else if (jSONObject2.has("L")) {
                f(new m7r(next), Long.valueOf(jSONObject2.getLong("L")));
            } else if (jSONObject2.has("F")) {
                f(new h7r(next), Float.valueOf((float) jSONObject2.getDouble("F")));
            } else if (jSONObject2.has("D")) {
                f(new g7r(next), Double.valueOf(jSONObject2.getDouble("D")));
            } else if (jSONObject2.has("S")) {
                f(new n7r(next), jSONObject2.getString("S"));
            } else if (jSONObject2.has("jS")) {
                f(new l7r(next), g(next, jSONObject2.getJSONObject("jS")));
            } else if (jSONObject2.has("IA")) {
                f(new j7r(next), f370.I(jSONObject2.getJSONArray("IA")));
            }
        }
    }
}
