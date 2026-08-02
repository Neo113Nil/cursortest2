package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vk.dto.masks.Mask;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* compiled from: DefaultMasksAnalytics.java */
/* loaded from: classes3.dex */
public final class fil implements yg10 {
    public Long c;
    public Integer d;
    public String e;
    public final LinkedList<b> b = new LinkedList<>();
    public final String f = "stories";

    /* compiled from: DefaultMasksAnalytics.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedList<b> linkedList = fil.this.b;
            if (linkedList.size() == 0) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it = linkedList.iterator();
            while (it.hasNext()) {
                b next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    next.a(jSONObject);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
            linkedList.clear();
            new c0m(jSONArray.toString()).p();
        }
    }

    /* compiled from: DefaultMasksAnalytics.java */
    public static class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public void a(JSONObject jSONObject) throws JSONException {
            jSONObject.put(Logger.METHOD_E, this.a);
        }
    }

    /* compiled from: DefaultMasksAnalytics.java */
    public static class c extends b {
        public final String b;
        public final String c;
        public final String d;

        public c(String str, String str2, String str3) {
            super("masks_loading");
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // xsna.fil.b
        public final void a(JSONObject jSONObject) throws JSONException {
            jSONObject.put(Logger.METHOD_E, this.a);
            jSONObject.put("mask_id", this.b);
            jSONObject.put("result", this.c);
            jSONObject.put("ref", this.d);
        }
    }

    /* compiled from: DefaultMasksAnalytics.java */
    public static class d extends b {
        public final Integer b;
        public final String c;
        public final int d;
        public final String e;

        public d(int i, String str, Integer num, String str2) {
            super("masks_usage");
            this.b = num;
            this.c = str;
            this.d = i;
            this.e = str2;
        }

        @Override // xsna.fil.b
        public final void a(JSONObject jSONObject) throws JSONException {
            jSONObject.put(Logger.METHOD_E, this.a);
            Integer num = this.b;
            if (num != null) {
                jSONObject.put("section_id", num);
            }
            jSONObject.put("mask_id", this.c);
            jSONObject.put("duration", this.d);
            jSONObject.put("ref", this.e);
        }
    }

    @Override // xsna.yg10
    public final void a(Mask mask) {
        if (mask != null) {
            this.b.add(new c(mask.Db(), "canceled", this.f));
        }
    }

    @Override // xsna.yg10
    public final void b(Mask mask) {
        if (mask != null) {
            this.b.add(new c(mask.Db(), "successful", this.f));
        }
    }

    @Override // xsna.yg10
    public final void c() {
        Integer num;
        String str;
        if (this.c != null && (num = this.d) != null && (str = this.e) != null) {
            this.b.add(new d((int) ((SystemClock.elapsedRealtime() - this.c.longValue()) / 1000), str, num, this.f));
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // xsna.yg10
    public final void flush() {
        c();
        new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
    }

    @Override // xsna.yg10
    public final void h(Mask mask) {
        if (mask != null) {
            this.b.add(new c(mask.Db(), "failed", this.f));
        }
    }

    @Override // xsna.yg10
    public final void i(int i, Mask mask) {
        c();
        this.c = Long.valueOf(SystemClock.elapsedRealtime());
        this.d = Integer.valueOf(i);
        this.e = mask.Db();
    }
}
