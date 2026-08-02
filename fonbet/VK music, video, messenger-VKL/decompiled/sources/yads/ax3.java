package yads;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ax3 {
    public final ia a;
    public final ha b;
    public zw3 d;
    public ka e;
    public final String h;
    public boolean i;
    public boolean j;
    public final hy3 c = new hy3();
    public boolean f = false;
    public boolean g = false;

    public ax3(ha haVar, ia iaVar, String str) {
        ka vw3Var;
        this.b = haVar;
        this.a = iaVar;
        this.h = str;
        a();
        if (iaVar.a() == ja.c || iaVar.a() == ja.e) {
            vw3Var = new vw3(iaVar.d(), str);
        } else {
            vw3Var = new hx3(str, iaVar.c(), iaVar.b());
        }
        this.e = vw3Var;
        this.e.c();
        rx3.a().a(this);
        this.e.a(haVar);
    }

    public final void a(View view, zx0 zx0Var, String str) {
        by3 by3Var;
        if (this.g) {
            return;
        }
        hy3 hy3Var = this.c;
        hy3Var.getClass();
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!hy3.b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = hy3Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                by3Var = null;
                break;
            } else {
                by3Var = (by3) it.next();
                if (by3Var.a.get() == view) {
                    break;
                }
            }
        }
        if (by3Var == null) {
            hy3Var.a.add(new by3(view, zx0Var, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.a.clear();
        }
        this.g = true;
        ka kaVar = this.e;
        my3.a.a((WebView) kaVar.b.get(), "finishSession", kaVar.a);
        rx3 rx3Var = rx3.c;
        boolean z = rx3Var.b.size() > 0;
        rx3Var.a.remove(this);
        rx3Var.b.remove(this);
        if (z && rx3Var.b.size() <= 0) {
            ny3 a = ny3.a();
            a.getClass();
            ba3 ba3Var = ba3.g;
            ba3Var.getClass();
            Handler handler = ba3.i;
            if (handler != null) {
                handler.removeCallbacks(ba3.k);
                ba3.i = null;
            }
            ba3Var.a.clear();
            ba3.h.post(new y93(ba3Var));
            fx3 fx3Var = fx3.d;
            fx3Var.a = false;
            fx3Var.c = null;
            zx3 zx3Var = a.d;
            zx3Var.b.getContentResolver().unregisterContentObserver(zx3Var);
        }
        this.e.b();
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        if (this.f || this.e == null) {
            return;
        }
        this.f = true;
        rx3 rx3Var = rx3.c;
        boolean z = rx3Var.b.size() > 0;
        rx3Var.b.add(this);
        if (!z) {
            ny3 a = ny3.a();
            a.getClass();
            fx3 fx3Var = fx3.d;
            fx3Var.c = a;
            fx3Var.b();
            ba3.g.getClass();
            if (ba3.i == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                ba3.i = handler;
                handler.post(ba3.j);
                ba3.i.postDelayed(ba3.k, 200L);
            }
            zx3 zx3Var = a.d;
            zx3Var.h.submit(new ux3(zx3Var));
            zx3Var.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zx3Var);
        }
        float f = ny3.a().a;
        ka kaVar = this.e;
        my3 my3Var = my3.a;
        my3Var.a((WebView) kaVar.b.get(), "setDeviceVolume", Float.valueOf(f), kaVar.a);
        ka kaVar2 = this.e;
        Date date = tw3.f.b;
        Date date2 = date != null ? (Date) date.clone() : null;
        kaVar2.getClass();
        if (date2 != null) {
            JSONObject jSONObject = new JSONObject();
            px3.a(jSONObject, "timestamp", Long.valueOf(date2.getTime()));
            my3Var.a((WebView) kaVar2.b.get(), "setLastActivity", jSONObject);
        }
        this.e.a(this, this.a);
    }

    public final void a() {
        this.d = new zw3(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (this.g || ((View) this.d.get()) == view) {
            return;
        }
        this.d = new zw3(view);
        this.e.a();
        Collection<ax3> unmodifiableCollection = Collections.unmodifiableCollection(rx3.c.a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (ax3 ax3Var : unmodifiableCollection) {
            if (ax3Var != this && ((View) ax3Var.d.get()) == view) {
                ax3Var.d.clear();
            }
        }
    }
}
