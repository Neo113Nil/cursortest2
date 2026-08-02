package sg.bigo.ads.cs;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.cs.f;

/* loaded from: classes9.dex */
public final class j {
    final sg.bigo.ads.cr.a a;
    public final g b;
    public final g c;
    final f d;
    final f e;
    final sg.bigo.ads.an.g f;
    c g;
    long h = 0;
    private final Context i;
    private final f.a j;

    public j(Context context, sg.bigo.ads.cr.a aVar, sg.bigo.ads.an.j jVar, sg.bigo.ads.an.j jVar2, sg.bigo.ads.an.g gVar) {
        f.a aVar2 = new f.a() { // from class: sg.bigo.ads.cs.j.1
            @Override // sg.bigo.ads.cs.f.a
            public final void a() {
                j.this.c.f();
                j.this.e.b();
            }

            @Override // sg.bigo.ads.cs.f.a
            public final void b() {
                j.this.e.d();
            }
        };
        this.j = aVar2;
        this.i = context;
        i iVar = new i(aVar);
        this.b = iVar;
        e eVar = new e(aVar);
        this.c = eVar;
        this.a = aVar;
        this.f = gVar;
        this.d = new h(iVar, jVar2, aVar2, context, aVar.b);
        this.e = new d(eVar, jVar, context, aVar.b);
        sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.j.2
            @Override // java.lang.Runnable
            public final void run() {
                j.this.h = sg.bigo.ads.bw.a.k();
                j jVar3 = j.this;
                if (jVar3.h == 0) {
                    jVar3.h = System.currentTimeMillis();
                }
                j.this.g = c.a();
                j.a(j.this);
            }
        });
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.ct.b.a(new Runnable() { // from class: sg.bigo.ads.cs.j.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.av.b bVar = new sg.bigo.ads.av.b(str, jSONObject.toString());
                String str2 = str;
                (("impression".equals(str2) || "clicked".equals(str2)) ? j.this.c : j.this.b).a(bVar);
                j.a(j.this);
                c cVar = j.this.g;
                if (cVar != null) {
                    cVar.a(str);
                }
                if (TextUtils.isEmpty(j.this.f.P())) {
                    return;
                }
                j.this.e.b();
                bVar.toString();
                int d = j.this.b.d();
                j jVar = j.this;
                if (d >= jVar.a.a) {
                    jVar.d.b();
                } else if (jVar.b.e()) {
                    return;
                } else {
                    j.this.d.d();
                }
                bVar.toString();
            }
        });
    }

    public static /* synthetic */ void a(j jVar) {
        c cVar = jVar.g;
        if (cVar == null || cVar.b()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = jVar.h;
        if (currentTimeMillis - j >= 300000) {
            c cVar2 = jVar.g;
            sg.bigo.ads.da.b.a(j, cVar2.a, cVar2.b, cVar2.c, cVar2.d);
            jVar.h = currentTimeMillis;
            sg.bigo.ads.bw.a.d(currentTimeMillis);
            jVar.g.c();
        }
    }
}
