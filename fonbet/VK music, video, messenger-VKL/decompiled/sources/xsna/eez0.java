package xsna;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import xsna.u3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class eez0 {
    public final String a;
    public final String b;
    public final String c;
    public final e7z0 e;
    public boolean d = false;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();

    public eez0(String str, String str2, e7z0 e7z0Var) {
        String str3;
        this.a = str;
        try {
            str3 = Uri.parse(str).getHost();
        } catch (Throwable unused) {
            str3 = null;
        }
        this.c = str3;
        this.b = str2;
        this.e = e7z0Var;
    }

    public final e7z0 a() {
        return this.e;
    }

    public final a b(u3z0.a aVar, e7z0 e7z0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f;
        int size = copyOnWriteArrayList.size();
        String str = aVar.d;
        a aVar2 = new a(size, str);
        copyOnWriteArrayList.add(aVar2);
        String str2 = "responseCode=" + aVar.c + ", resultCode=" + aVar.a + ", message=" + str;
        if (aVar.a()) {
            e7z0Var.b(9101, str2, aVar2.a());
            return aVar2;
        }
        String a2 = aVar2.a();
        giy0 giy0Var = e7z0Var.b;
        if (giy0Var != null) {
            giy0Var.b(e7z0Var.c, 0, 9101, str2, a2);
            return aVar2;
        }
        e7z0Var.a.a(e7z0Var.c, 0, 9101, str2, a2);
        return aVar2;
    }

    public final void c(int i, long j, String str) {
        this.f.add(new a(i, j, str));
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public final boolean e() {
        return this.d;
    }

    public final void f() {
        String str;
        String valueOf = String.valueOf(this.a.hashCode());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pixelId", valueOf);
            jSONObject.put(CandidateTypeHintConfig.TYPE_HOST, this.c);
            jSONObject.put("type", this.b);
            jSONObject.put("timestamp", System.currentTimeMillis());
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = "{}";
        }
        this.e.b(9100, "Try to send pixel " + valueOf, str);
    }

    public final JSONObject g() {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.getClass();
            try {
                jSONObject = new JSONObject();
                jSONObject.put("attempt", aVar.a);
                jSONObject.put("timestamp", aVar.b);
                jSONObject.put("error", aVar.c);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            jSONArray.put(jSONObject);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pixelId", String.valueOf(this.a.hashCode()));
            jSONObject2.put(CandidateTypeHintConfig.TYPE_HOST, this.c);
            jSONObject2.put("type", this.b);
            jSONObject2.put("attempts", jSONArray);
            return jSONObject2;
        } catch (JSONException unused2) {
            return new JSONObject();
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a {
        public final int a;
        public final long b;
        public final String c;

        public a(int i, String str) {
            this.a = i;
            this.b = System.currentTimeMillis();
            this.c = str;
        }

        public final String a() {
            eez0 eez0Var = eez0.this;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pixelId", String.valueOf(eez0Var.a.hashCode()));
                jSONObject.put(CandidateTypeHintConfig.TYPE_HOST, eez0Var.c);
                jSONObject.put("type", eez0Var.b);
                jSONObject.put("attempt", this.a);
                jSONObject.put("timestamp", this.b);
                jSONObject.put("error", this.c);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "{}";
            }
        }

        public a(int i, long j, String str) {
            this.a = i;
            this.b = j;
            this.c = str;
        }
    }
}
