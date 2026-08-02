package sg.bigo.ads.cs;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.j;
import sg.bigo.ads.ct.b;

/* loaded from: classes9.dex */
public final class a {
    b.AbstractRunnableC2471b a = null;

    @NonNull
    public final b b;
    final sg.bigo.ads.an.g c;
    final Context d;
    private final sg.bigo.ads.cr.a e;
    private final sg.bigo.ads.an.j f;

    public a(Context context, sg.bigo.ads.cr.a aVar, sg.bigo.ads.an.j jVar, sg.bigo.ads.an.g gVar) {
        this.d = context;
        this.b = new b(aVar);
        this.e = aVar;
        this.f = jVar;
        this.c = gVar;
    }

    public final void a() {
        sg.bigo.ads.ct.b.a(this.a);
        this.a = null;
        final List<sg.bigo.ads.av.b> a = this.b.a();
        if (a.isEmpty()) {
            sg.bigo.ads.bn.a.a("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.av.b> it = a.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().c));
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("events", jSONArray);
        this.f.a(hashMap, new j.a() { // from class: sg.bigo.ads.cs.a.3
            @Override // sg.bigo.ads.an.j.a
            public final void a() {
                sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.b.a(a, true);
                        a.this.b.d();
                        if (a.this.b.c()) {
                            return;
                        }
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.an.j.a
            public final void a(int i, int i2, String str) {
                sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.b.a(a, false);
                        a.this.b();
                    }
                });
            }
        });
    }

    public final void b() {
        if (this.a != null) {
            return;
        }
        this.a = sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.bz.c.b(a.this.d)) {
                    a.this.a();
                    return;
                }
                a aVar = a.this;
                aVar.a = null;
                aVar.b();
            }
        }, this.e.b);
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.av.b bVar = new sg.bigo.ads.av.b(str, jSONObject.toString());
                a.this.b.a(bVar);
                if (TextUtils.isEmpty(a.this.c.P())) {
                    return;
                }
                if ("impression".equals(str) || "clicked".equals(str)) {
                    bVar.toString();
                    a.this.a();
                } else {
                    bVar.toString();
                    a.a(a.this);
                }
            }
        });
    }

    public static /* synthetic */ void a(a aVar) {
        if (aVar.b.b() >= aVar.e.a) {
            aVar.a();
        } else {
            if (aVar.b.c()) {
                return;
            }
            aVar.b();
        }
    }
}
