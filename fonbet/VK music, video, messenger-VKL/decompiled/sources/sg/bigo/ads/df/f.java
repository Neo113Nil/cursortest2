package sg.bigo.ads.df;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.de.b;

/* loaded from: classes9.dex */
public final class f extends sg.bigo.ads.av.d {
    public int i;
    public long j;
    public int k;
    public long l;
    public int m;
    public long n;
    public int o;
    public long p;

    @NonNull
    final r q;
    int r;
    public CopyOnWriteArrayList<e> s;
    public CopyOnWriteArrayList<e> t;
    public CopyOnWriteArrayList<e> u;
    public CopyOnWriteArrayList<e> v;

    public f(@NonNull r rVar, Cursor cursor) {
        super(cursor);
        this.i = 0;
        this.j = 0L;
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.n = 0L;
        this.o = 0;
        this.p = 0L;
        this.q = rVar;
        this.c = 1;
    }

    @SuppressLint({"ConcurrentModification"})
    public final int b(Context context) {
        Iterator<e> it = this.t.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            a(context, "click_track", it.next());
        }
        return i;
    }

    @SuppressLint({"ConcurrentModification"})
    public final int c(Context context) {
        Iterator<e> it = this.u.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            a(context, "nurl_track", it.next());
        }
        return i;
    }

    @SuppressLint({"ConcurrentModification"})
    public final int d(Context context) {
        Iterator<e> it = this.v.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            a(context, "lurl_track", it.next());
        }
        return i;
    }

    @Override // sg.bigo.ads.av.d
    @NonNull
    public final String e() {
        if (this.v == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.v.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.av.d
    public final long f() {
        return Math.max(Math.max(this.j, this.l), this.d);
    }

    public final boolean g() {
        return a(this.s) && a(this.t) && a(this.u) && a(this.v);
    }

    public f(@NonNull r rVar, @NonNull Map<String, String> map) {
        super(map);
        this.i = 0;
        this.j = 0L;
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.n = 0L;
        this.o = 0;
        this.p = 0L;
        this.q = rVar;
        this.c = 1;
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(Context context) {
        Iterator<e> it = this.s.iterator();
        while (it.hasNext()) {
            a(context, "impl_track", it.next());
        }
    }

    @Override // sg.bigo.ads.av.d
    @NonNull
    public final String b() {
        if (this.s == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.s.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.av.d
    @NonNull
    public final String c() {
        if (this.t == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.t.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.av.d
    @NonNull
    public final String d() {
        if (this.u == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f);
        }
        return jSONArray.toString();
    }

    private void a(Context context, final String str, final e eVar) {
        String str2 = eVar.b;
        if (eVar.b()) {
            if ("impl_track".equals(str)) {
                this.s.remove(eVar);
                return;
            }
            if ("click_track".equals(str)) {
                this.t.remove(eVar);
                return;
            } else if ("nurl_track".equals(str)) {
                this.u.remove(eVar);
                return;
            } else {
                if ("lurl_track".equals(str)) {
                    this.v.remove(eVar);
                    return;
                }
                return;
            }
        }
        int i = this.i;
        if ("click_track".equals(str)) {
            i = this.k;
        } else if ("nurl_track".equals(str)) {
            i = this.m;
        } else if ("lurl_track".equals(str)) {
            i = this.o;
        }
        int i2 = i;
        sg.bigo.ads.bo.a d = eVar.d();
        int i3 = eVar.c;
        boolean z = eVar.e;
        eVar.a();
        sg.bigo.ads.de.b.a(context, i3, str, d, str2, z, this.r, this.b, i2, this.h, new b.a() { // from class: sg.bigo.ads.df.f.1
            @Override // sg.bigo.ads.de.b.a
            public final void a() {
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.de.b.a
            public final void b() {
                CopyOnWriteArrayList<e> copyOnWriteArrayList;
                if ("impl_track".equals(str)) {
                    copyOnWriteArrayList = f.this.s;
                } else if ("click_track".equals(str)) {
                    copyOnWriteArrayList = f.this.t;
                } else {
                    if (!"nurl_track".equals(str)) {
                        if ("lurl_track".equals(str)) {
                            copyOnWriteArrayList = f.this.v;
                        }
                        d.a().b(f.this);
                    }
                    copyOnWriteArrayList = f.this.u;
                }
                copyOnWriteArrayList.remove(eVar);
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.de.b.a
            public final boolean a(int i4) {
                return f.this.q.a(i4);
            }
        });
    }

    @Override // sg.bigo.ads.av.d
    public final void b(String str) {
        if (sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.t = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.t.add(new e(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.av.d
    public final void c(String str) {
        if (sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.u = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.u.add(new e(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.av.d
    public final void d(String str) {
        if (sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.v = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.v.add(new e(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.av.d
    public final void a(String str) {
        if (sg.bigo.ads.common.utils.r.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.s = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.s.add(new e(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    public final boolean a(int i) {
        return this.q.b(i);
    }

    private static boolean a(List<e> list) {
        return list != null && list.size() == 0;
    }

    public final boolean a(List<e> list, int i) {
        return list == null || list.size() == 0 || !a(i);
    }
}
