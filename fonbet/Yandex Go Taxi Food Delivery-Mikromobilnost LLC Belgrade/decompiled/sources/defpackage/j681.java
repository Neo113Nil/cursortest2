package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;
import yads.a20;
import yads.f9;
import yads.i41;
import yads.nu3;
import yads.q92;
import yads.ut3;

/* loaded from: classes7.dex */
public final class j681 {
    public final hlx0 a;
    public final yz61 b;
    public final bn81 c;
    public pj61 d;
    public o971 e;
    public boolean f;
    public boolean g;
    public final String h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public j681(yz61 yz61Var, hlx0 hlx0Var) {
        String uuid = UUID.randomUUID().toString();
        this.c = new bn81();
        this.f = false;
        this.g = false;
        this.b = yz61Var;
        this.a = hlx0Var;
        this.h = uuid;
        this.d = new pj61(null);
        f9 f9Var = (f9) hlx0Var.y;
        if (f9Var == f9.c || f9Var == f9.e) {
            pq71 pq71Var = new pq71(uuid);
            pq71Var.b = new pj61(null);
            this.e = pq71Var;
        } else {
            this.e = new gq81(uuid, Collections.unmodifiableMap((HashMap) hlx0Var.w), (String) hlx0Var.x);
        }
        this.e.e();
        kb71.c.a.add(this);
        o971 o971Var = this.e;
        vj61 vj61Var = vj61.a;
        WebView webView = (WebView) o971Var.b.get();
        String str = o971Var.a;
        JSONObject jSONObject = new JSONObject();
        y471.c(jSONObject, "impressionOwner", q92.c);
        y471.c(jSONObject, "mediaEventsOwner", yz61Var.a);
        y471.c(jSONObject, "creativeType", a20.c);
        y471.c(jSONObject, "impressionType", i41.c);
        y471.c(jSONObject, "isolateVerificationScripts", Boolean.FALSE);
        vj61Var.b(webView, "init", jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.a.clear();
        }
        this.g = true;
        o971 o971Var = this.e;
        vj61.a.b((WebView) o971Var.b.get(), "finishSession", o971Var.a);
        kb71 kb71Var = kb71.c;
        ArrayList arrayList = kb71Var.b;
        boolean z = arrayList.size() > 0;
        kb71Var.a.remove(this);
        arrayList.remove(this);
        if (z && arrayList.size() <= 0) {
            pn61 a = pn61.a();
            a.getClass();
            oo61 oo61Var = oo61.f;
            oo61Var.getClass();
            Handler handler = oo61.h;
            if (handler != null) {
                handler.removeCallbacks(oo61.j);
                oo61.h = null;
            }
            oo61Var.a.clear();
            oo61.g.post(new h3s0(19, oo61Var));
            ut3 ut3Var = ut3.d;
            ut3Var.a = false;
            ut3Var.c = null;
            nu3 nu3Var = a.c;
            nu3Var.b.getContentResolver().unregisterContentObserver(nu3Var);
        }
        this.e.a();
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.g || ((View) this.d.get()) == view) {
            return;
        }
        this.d = new pj61(view);
        o971 o971Var = this.e;
        o971Var.getClass();
        o971Var.f = System.nanoTime();
        o971Var.e = 1;
        Collection<j681> unmodifiableCollection = Collections.unmodifiableCollection(kb71.c.a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (j681 j681Var : unmodifiableCollection) {
            if (j681Var != this && ((View) j681Var.d.get()) == view) {
                j681Var.d.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        kb71 kb71Var = kb71.c;
        boolean z = kb71Var.b.size() > 0;
        kb71Var.b.add(this);
        if (!z) {
            pn61 a = pn61.a();
            a.getClass();
            ut3 ut3Var = ut3.d;
            ut3Var.c = a;
            ut3Var.b();
            oo61.f.getClass();
            if (oo61.h == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                oo61.h = handler;
                handler.post(oo61.i);
                oo61.h.postDelayed(oo61.j, 200L);
            }
            nu3 nu3Var = a.c;
            nu3Var.h.submit(new h3s0(13, nu3Var));
            nu3Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, nu3Var);
        }
        float f = pn61.a().a;
        o971 o971Var = this.e;
        vj61 vj61Var = vj61.a;
        vj61Var.b((WebView) o971Var.b.get(), "setDeviceVolume", Float.valueOf(f), o971Var.a);
        o971 o971Var2 = this.e;
        Date date = sn71.e.a;
        Date date2 = date != null ? (Date) date.clone() : null;
        o971Var2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            y471.c(jSONObject, ClidProvider.TIMESTAMP, Long.valueOf(date2.getTime()));
            vj61Var.b((WebView) o971Var2.b.get(), "setLastActivity", jSONObject);
        }
        this.e.c(this, this.a);
    }
}
