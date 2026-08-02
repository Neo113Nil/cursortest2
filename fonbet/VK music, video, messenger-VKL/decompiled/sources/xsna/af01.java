package xsna;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@TargetApi(14)
/* loaded from: classes13.dex */
public final class af01 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ bf01 b;

    public /* synthetic */ af01(bf01 bf01Var) {
        this.b = bf01Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        mb01 mb01Var = (mb01) this.b.b;
        try {
            try {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.q.a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    mb01.i(mb01Var.m);
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                    String queryParameter = data.getQueryParameter("referrer");
                    boolean z = bundle == null;
                    kb01 kb01Var = mb01Var.k;
                    mb01.k(kb01Var);
                    kb01Var.s(new ze01(this, z, data, str, queryParameter));
                }
            } catch (RuntimeException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            kg01 kg01Var = mb01Var.p;
            mb01.j(kg01Var);
            kg01Var.s(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kg01 kg01Var = ((mb01) this.b.b).p;
        mb01.j(kg01Var);
        synchronized (kg01Var.o) {
            try {
                if (activity == kg01Var.j) {
                    kg01Var.j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((mb01) kg01Var.b).h.v()) {
            kg01Var.i.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kg01 kg01Var = ((mb01) this.b.b).p;
        mb01.j(kg01Var);
        synchronized (kg01Var.o) {
            kg01Var.n = false;
            kg01Var.k = true;
        }
        ((mb01) kg01Var.b).o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((mb01) kg01Var.b).h.v()) {
            dg01 t = kg01Var.t(activity);
            kg01Var.g = kg01Var.f;
            kg01Var.f = null;
            kb01 kb01Var = ((mb01) kg01Var.b).k;
            mb01.k(kb01Var);
            kb01Var.s(new ig01(kg01Var, t, elapsedRealtime));
        } else {
            kg01Var.f = null;
            kb01 kb01Var2 = ((mb01) kg01Var.b).k;
            mb01.k(kb01Var2);
            kb01Var2.s(new hg01(kg01Var, elapsedRealtime));
        }
        fj01 fj01Var = ((mb01) this.b.b).l;
        mb01.j(fj01Var);
        ((mb01) fj01Var.b).o.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        kb01 kb01Var3 = ((mb01) fj01Var.b).k;
        mb01.k(kb01Var3);
        kb01Var3.s(new hi01(fj01Var, elapsedRealtime2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        fj01 fj01Var = ((mb01) this.b.b).l;
        mb01.j(fj01Var);
        ((mb01) fj01Var.b).o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kb01 kb01Var = ((mb01) fj01Var.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new gi01(fj01Var, elapsedRealtime));
        kg01 kg01Var = ((mb01) this.b.b).p;
        mb01.j(kg01Var);
        synchronized (kg01Var.o) {
            kg01Var.n = true;
            if (activity != kg01Var.j) {
                synchronized (kg01Var.o) {
                    kg01Var.j = activity;
                    kg01Var.k = false;
                }
                if (((mb01) kg01Var.b).h.v()) {
                    kg01Var.l = null;
                    kb01 kb01Var2 = ((mb01) kg01Var.b).k;
                    mb01.k(kb01Var2);
                    kb01Var2.s(new jg01(kg01Var));
                }
            }
        }
        if (!((mb01) kg01Var.b).h.v()) {
            kg01Var.f = kg01Var.l;
            kb01 kb01Var3 = ((mb01) kg01Var.b).k;
            mb01.k(kb01Var3);
            kb01Var3.s(new gg01(kg01Var));
            return;
        }
        kg01Var.u(activity, kg01Var.t(activity), false);
        w601 m = ((mb01) kg01Var.b).m();
        ((mb01) m.b).o.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        kb01 kb01Var4 = ((mb01) m.b).k;
        mb01.k(kb01Var4);
        kb01Var4.s(new k501(m, elapsedRealtime2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        dg01 dg01Var;
        kg01 kg01Var = ((mb01) this.b.b).p;
        mb01.j(kg01Var);
        if (!((mb01) kg01Var.b).h.v() || bundle == null || (dg01Var = (dg01) kg01Var.i.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", dg01Var.c);
        bundle2.putString("name", dg01Var.a);
        bundle2.putString("referrer_name", dg01Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
