package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.yandex.messaging.extension.ContextExtensionsKt$makeReceiver$1;
import com.yandex.messaging.securepush.KeyNotFoundException;
import defpackage.q6c0;
import defpackage.tje;
import defpackage.wi60;
import defpackage.xdf0;
import defpackage.zy11;
import java.util.Locale;
import java.util.concurrent.Executor;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class o0x0 implements vff0 {
    public static final Object M = new Object();
    public final Executor A;
    public final x22 B;
    public final a220 C;
    public final w1g0 D;
    public final lqo E;
    public xo3 F;
    public xo3 G;
    public o7c H;
    public e1k I;
    public boolean J;
    public u6i0 K = new u6i0(15000, 3600000);
    public boolean L = true;
    public final Context a;
    public final String b;
    public final SharedPreferences c;
    public final Handler w;
    public final q6v x;
    public final h3y y;
    public final h3y z;

    public o0x0(Context context, String str, SharedPreferences sharedPreferences, Looper looper, q6v q6vVar, a220 a220Var, Executor executor, h3y h3yVar, h3y h3yVar2, x22 x22Var, wff0 wff0Var, w1g0 w1g0Var, lqo lqoVar, final q6c0 q6c0Var) {
        this.I = e1k.M1;
        this.a = context;
        this.b = str;
        this.c = sharedPreferences;
        this.w = new Handler(looper);
        this.x = q6vVar;
        this.A = executor;
        this.y = h3yVar;
        this.z = h3yVar2;
        this.B = x22Var;
        this.C = a220Var;
        this.D = w1g0Var;
        this.E = lqoVar;
        wff0Var.a(this);
        Context context2 = (Context) q6c0Var.b;
        ContextExtensionsKt$makeReceiver$1 contextExtensionsKt$makeReceiver$1 = new ContextExtensionsKt$makeReceiver$1(new tls() { // from class: com.yandex.messaging.localization.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                q6c0 q6c0Var2 = q6c0.this;
                tje.N((xdf0) q6c0Var2.c, null, null, new PushesLocaleUpdater$subscribeToLocaleChanged$1$1(this, ((wi60) q6c0Var2.w).b(), null), 3);
                return zy11.a;
            }
        });
        qke.z(context2, contextExtensionsKt$makeReceiver$1, new IntentFilter("android.intent.action.LOCALE_CHANGED"), 2);
        this.I = new xi3(6, context2, contextExtensionsKt$makeReceiver$1);
    }

    public final void a() {
        this.c.edit().remove("logout_token").remove("push_token").remove("push_token_type").remove("push_token_uuid").apply();
    }

    @Override // defpackage.vff0
    public final void b() {
        this.J = true;
        this.I.close();
        this.I = e1k.M1;
        xo3 xo3Var = this.F;
        if (xo3Var != null) {
            xo3Var.cancel();
            this.F = null;
        }
        o7c o7cVar = this.H;
        if (o7cVar != null) {
            o7cVar.cancel();
            this.H = null;
        }
        xo3 xo3Var2 = this.G;
        if (xo3Var2 != null) {
            xo3Var2.cancel();
            this.G = null;
        }
    }

    public final void c(boolean z) {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.J);
        this.L = z;
        h3y h3yVar = this.z;
        SharedPreferences sharedPreferences = this.c;
        a220 a220Var = this.C;
        if (a220Var == null) {
            if (d()) {
                String string = sharedPreferences.getString("logout_token", null);
                if (string != null) {
                    ((off0) h3yVar.get()).a(string);
                }
                a();
            }
            e("cloud messaging provider not found");
            return;
        }
        if (sharedPreferences.contains("push_token")) {
            String string2 = sharedPreferences.getString("push_token_uuid", "");
            String string3 = sharedPreferences.getString("push_token_type", "");
            if (!this.b.equals(string2) || !a220Var.a.d.getValue().equals(string3)) {
                String string4 = sharedPreferences.getString("logout_token", null);
                if (string4 != null) {
                    ((off0) h3yVar.get()).a(string4);
                }
                a();
            }
        }
        o7c o7cVar = this.H;
        if (o7cVar != null) {
            o7cVar.cancel();
        }
        this.H = new o7c(this.C, new n0x0(this), new n0x0(this), this.A, this.B);
    }

    public final boolean d() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        return this.c.contains("push_token");
    }

    public final void e(String str) {
        a220 a220Var = this.C;
        this.B.f("token_not_sent", CRLReasonCodeExtension.REASON, str, "platform", a220Var != null ? a220Var.a.d.getValue() : null);
    }

    public final void f() {
        String string = this.c.getString("logout_token", null);
        if (string != null && d() && this.H == null && this.F == null) {
            xo3 xo3Var = this.G;
            if (xo3Var != null) {
                xo3Var.cancel();
                this.G = null;
            }
            boolean z = this.L;
            to3 to3Var = (to3) this.y.get();
            this.G = to3Var.a.a(new qo3(to3Var, string, z, new l7s0(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(c5g0 c5g0Var, String str) {
        String str2;
        String str3;
        String str4;
        w1g0 w1g0Var = this.D;
        xo3 xo3Var = this.F;
        if (xo3Var != null) {
            xo3Var.cancel();
        }
        boolean a = this.E.a(tz10.y);
        x22 x22Var = this.B;
        String str5 = null;
        if (a) {
            try {
                String c = ew4.c(11, w1g0Var.b());
                try {
                    str5 = ew4.c(11, w1g0Var.a());
                    String str6 = "pushToken:" + c5g0Var.a + " deviceId:" + str + " publicKey:" + c + " authSecret:" + str5;
                    if (ydz.a.a()) {
                        Log.i("TAG", str6);
                    }
                    str4 = c;
                    str3 = str5;
                } catch (KeyNotFoundException unused) {
                    str2 = str5;
                    str5 = c;
                    x22Var.reportEvent("push encryption key not found");
                    str3 = str2;
                    str4 = str5;
                    if (this.C != null) {
                    }
                }
            } catch (KeyNotFoundException unused2) {
                str2 = null;
            }
        } else {
            str4 = null;
            str3 = null;
        }
        if (this.C != null) {
            e("cloud messaging provider not found");
            return;
        }
        String str7 = this.a.getApplicationInfo().packageName;
        x22Var.c("push_token_sending_start", "package_name", str7);
        boolean z = this.L;
        String language = Locale.getDefault().getLanguage();
        to3 to3Var = (to3) this.y.get();
        this.F = to3Var.a.a(new po3(to3Var, str7, Build.MANUFACTURER + " " + Build.MODEL, c5g0Var.a, c5g0Var, str, z, str4, str3, language, new kzo(this, c5g0Var, str, z)));
    }
}
