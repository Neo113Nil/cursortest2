package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StorageMetadata.java */
/* loaded from: classes13.dex */
public final class fhl0 {
    public b<String> a;
    public b<String> b;
    public b<String> c;
    public b<String> d;
    public b<String> e;
    public b<Map<String, String>> f;

    /* compiled from: StorageMetadata.java */
    public static class a {
        public final fhl0 a;

        public a(JSONObject jSONObject, mhl0 mhl0Var) throws JSONException {
            fhl0 fhl0Var = new fhl0();
            fhl0Var.a = b.a("");
            fhl0Var.b = b.a("");
            fhl0Var.c = b.a("");
            fhl0Var.d = b.a("");
            fhl0Var.e = b.a("");
            fhl0Var.f = b.a(Collections.EMPTY_MAP);
            this.a = fhl0Var;
            jSONObject.optString("generation");
            jSONObject.optString("name");
            jSONObject.optString("bucket");
            jSONObject.optString("metageneration");
            jSONObject.optString("timeCreated");
            jSONObject.optString("updated");
            jSONObject.optLong("size");
            jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    if (!fhl0Var.f.a) {
                        fhl0Var.f = b.b(new HashMap());
                    }
                    fhl0Var.f.b.put(next, string);
                }
            }
            String b = b("contentType", jSONObject);
            if (b != null) {
                fhl0Var.a = b.b(b);
            }
            String b2 = b("cacheControl", jSONObject);
            if (b2 != null) {
                fhl0Var.b = b.b(b2);
            }
            String b3 = b("contentDisposition", jSONObject);
            if (b3 != null) {
                fhl0Var.c = b.b(b3);
            }
            String b4 = b("contentEncoding", jSONObject);
            if (b4 != null) {
                fhl0Var.d = b.b(b4);
            }
            String b5 = b("contentLanguage", jSONObject);
            if (b5 != null) {
                fhl0Var.e = b.b(b5);
            }
            this.a.getClass();
        }

        @Nullable
        public static String b(String str, JSONObject jSONObject) throws JSONException {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        @NonNull
        public final fhl0 a() {
            fhl0 fhl0Var = new fhl0();
            fhl0Var.a = b.a("");
            fhl0Var.b = b.a("");
            fhl0Var.c = b.a("");
            fhl0Var.d = b.a("");
            fhl0Var.e = b.a("");
            fhl0Var.f = b.a(Collections.EMPTY_MAP);
            fhl0 fhl0Var2 = this.a;
            exc0.i(fhl0Var2);
            fhl0Var.a = fhl0Var2.a;
            fhl0Var.b = fhl0Var2.b;
            fhl0Var.c = fhl0Var2.c;
            fhl0Var.d = fhl0Var2.d;
            fhl0Var.e = fhl0Var2.e;
            fhl0Var.f = fhl0Var2.f;
            return fhl0Var;
        }
    }

    /* compiled from: StorageMetadata.java */
    public static class b<T> {
        public final boolean a;

        @Nullable
        public final T b;

        public b(@Nullable T t, boolean z) {
            this.a = z;
            this.b = t;
        }

        public static <T> b<T> a(T t) {
            return new b<>(t, false);
        }

        public static b b(@Nullable Serializable serializable) {
            return new b(serializable, true);
        }
    }
}
