package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.auth.AuthEnvironment;
import com.yandex.messaging.auth.passport.b;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class el21 {
    public final j0g a;
    public final Handler b;
    public final wff0 c;
    public final zq60 d = new zq60();
    public sk7 e;
    public d9g f;

    public el21(j0g j0gVar, Handler handler, wff0 wff0Var, xqi0 xqi0Var) {
        sk7 sk7Var;
        this.a = j0gVar;
        this.b = handler;
        this.c = wff0Var;
        synchronized (xqi0Var) {
            try {
                z83.f(xqi0Var.o, null);
                xqi0Var.o = this;
                yk3 yk3Var = xqi0Var.p;
                sk7Var = yk3Var != null ? yk3Var.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = sk7Var;
    }

    public static void a(d9g d9gVar, sk7 sk7Var) {
        x08 ap90Var;
        yi3 yi3Var = (yi3) d9gVar.e.get();
        ml21 ml21Var = d9gVar.a;
        boolean e = sk7Var.e();
        cn3 cn3Var = (cn3) sk7Var.w;
        ml21Var.b = e;
        if (sk7Var.e()) {
            bn3 b = cn3Var.b();
            sq60 sq60Var = yi3Var.b;
            SharedPreferences sharedPreferences = yi3Var.w;
            z83.g(null, yi3Var.c, Looper.myLooper());
            if (yi3Var.B != null) {
                w511.q();
                return;
            }
            z83.f(yi3Var.D, null);
            z83.c(null, sharedPreferences.contains("passport_user_env"));
            z83.c(null, sharedPreferences.contains("passport_user_uid"));
            z83.c(null, sharedPreferences.contains("oauth_token"));
            yi3Var.C = b;
            sq60Var.rewind();
            while (sq60Var.hasNext()) {
                ((zi3) sq60Var.next()).b(b, null, false);
            }
            return;
        }
        wl3 wl3Var = (wl3) sk7Var.c;
        Objects.requireNonNull(wl3Var);
        AuthEnvironment authEnvironment = wl3Var.a;
        long j = wl3Var.b;
        SharedPreferences sharedPreferences2 = yi3Var.w;
        sq60 sq60Var2 = yi3Var.b;
        z83.g(null, yi3Var.c, Looper.myLooper());
        wl3 wl3Var2 = yi3Var.B;
        if (wl3Var2 != null) {
            if (wl3Var2.equals(wl3Var)) {
                return;
            }
            wl3 wl3Var3 = yi3Var.B;
            HashMap hashMap = new HashMap();
            hashMap.put("oldUid", Long.valueOf(wl3Var3.b));
            hashMap.put("oldUidEnv", Integer.valueOf(wl3Var3.a.getInteger()));
            hashMap.put("newUid", Long.valueOf(j));
            hashMap.put("newUidEnv", Integer.valueOf(authEnvironment.getInteger()));
            hashMap.put("prefsUid", Long.valueOf(sharedPreferences2.getLong("passport_user_uid", -1L)));
            hashMap.put("prefsUidEnv", Integer.valueOf(sharedPreferences2.getInt("passport_user_env", -1)));
            SharedPreferences sharedPreferences3 = yi3Var.A;
            hashMap.put("prefsViewUid", Long.valueOf(sharedPreferences3.getLong("passport_user_uid", -1L)));
            hashMap.put("prefsViewUidEnv", Integer.valueOf(sharedPreferences3.getInt("passport_user_env", -1)));
            yi3Var.z.reportEvent("Uid change is not allowed", hashMap);
            w511.q();
            return;
        }
        yi3Var.B = wl3Var;
        yi3Var.C = cn3Var;
        SharedPreferences.Editor putLong = sharedPreferences2.edit().putInt("passport_user_env", authEnvironment.getInteger()).putLong("passport_user_uid", j);
        if (cn3Var.e()) {
            putLong.putString("oauth_token", cn3Var.b().k());
        }
        putLong.apply();
        if (cn3Var.e()) {
            sq60Var2.rewind();
            while (sq60Var2.hasNext()) {
                ((zi3) sq60Var2.next()).b(cn3Var, wl3Var, false);
            }
            return;
        }
        qp90 qp90Var = (qp90) yi3Var.x.get();
        qti0 qti0Var = yi3Var.y;
        b bVar = qp90Var.b;
        if (bVar == null) {
            qp90Var.b("getToken");
            ap90Var = wfz.z;
        } else {
            ap90Var = new ap90(bVar, qti0Var, qp90Var.c, new at20(wl3Var, yi3Var));
        }
        yi3Var.D = ap90Var;
    }

    public final d9g b(sk7 sk7Var) {
        z83.g(null, this.b.getLooper(), Looper.myLooper());
        ml21 ml21Var = new ml21((String) sk7Var.b);
        j0g j0gVar = this.a;
        j0gVar.getClass();
        d9g d9gVar = new d9g((z8g) j0gVar.a, (p8g) j0gVar.b, ml21Var);
        a(d9gVar, sk7Var);
        return d9gVar;
    }

    public final String c() {
        z83.g(null, this.b.getLooper(), Looper.myLooper());
        z83.d(this.e, null);
        return (String) this.e.b;
    }

    public final cl21 d() {
        Handler handler = this.b;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        z83.g(null, handler.getLooper(), Looper.myLooper());
        d9g d9gVar = this.f;
        if (d9gVar != null) {
            return d9gVar;
        }
        sk7 sk7Var = this.e;
        if (sk7Var != null) {
            this.f = b(sk7Var);
        }
        return this.f;
    }

    public final void e(sk7 sk7Var) {
        tje.e();
        this.b.post(new t601(18, this, sk7Var));
    }

    public final xi3 f(dl21 dl21Var) {
        Handler handler = this.b;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        if (this.c.d.get()) {
            return null;
        }
        z83.g(null, handler.getLooper(), Looper.myLooper());
        d9g d9gVar = this.f;
        if (d9gVar == null) {
            sk7 sk7Var = this.e;
            if (sk7Var != null) {
                this.f = b(sk7Var);
            }
            d9gVar = this.f;
        }
        if (d9gVar != null) {
            dl21Var.e(d9gVar);
            return null;
        }
        this.d.b(dl21Var);
        return new xi3(11, this, dl21Var);
    }
}
