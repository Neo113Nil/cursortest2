package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Rational;
import android.view.View;
import com.vk.voip.VoipCallActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import xsna.c63;

/* compiled from: PictureInPictureActivityLauncher.kt */
/* loaded from: classes7.dex */
public abstract class tja0 {
    public final VoipCallActivity a;
    public final com.vk.voip.b b;
    public final gvw0 c;
    public final d d;
    public final c e;
    public final b f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ValueAnimator j;
    public e k;
    public e l;
    public long m;

    /* compiled from: PictureInPictureActivityLauncher.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.voip_accessibility_reject_call) + shy.a(R.drawable.ic_pip_phone_down_24, -712880400, 31);
        }

        public final String toString() {
            return "Action(id=picture_in_picture_finish_call, iconResId=2131234659, titleResId=2131970470)";
        }
    }

    /* compiled from: PictureInPictureActivityLauncher.kt */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean f = epx.f(intent != null ? intent.getAction() : null, "picture_in_picture_action");
            tja0 tja0Var = tja0.this;
            if (!f) {
                if (epx.f(intent != null ? intent.getAction() : null, "picture_in_picture_action_close")) {
                    tja0Var.a.finish();
                }
            } else {
                String stringExtra = intent.getStringExtra("picture_in_picture_action_id");
                if (stringExtra == null || tja0Var.h) {
                    return;
                }
                tja0Var.e(stringExtra);
            }
        }
    }

    /* compiled from: PictureInPictureActivityLauncher.kt */
    public final class d extends c63.b {
        public d() {
        }

        @Override // xsna.c63.b
        public final void u() {
            tja0.this.i = false;
        }
    }

    /* compiled from: PictureInPictureActivityLauncher.kt */
    public static final class e {
        public final View a;
        public final ou3 b;
        public final List<a> c;
        public final boolean d;
        public final int e;
        public final kun f;
        public final mij g;
        public final gzs<s3q0> h;

        public e(View view, ou3 ou3Var, List list, boolean z, int i, kun kunVar, mij mijVar, gzs gzsVar) {
            this.a = view;
            this.b = ou3Var;
            this.c = list;
            this.d = z;
            this.e = i;
            this.f = kunVar;
            this.g = mijVar;
            this.h = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f.equals(eVar.f) && this.g.equals(eVar.g) && epx.f(this.h, eVar.h);
        }

        public final int hashCode() {
            int hashCode = (this.g.hashCode() + ((this.f.hashCode() + shy.a(this.e, qoy.b(fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31)) * 31)) * 31;
            gzs<s3q0> gzsVar = this.h;
            return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LaunchParams(anchorView=");
            sb.append(this.a);
            sb.append(", aspectRatio=");
            sb.append(this.b);
            sb.append(", actions=");
            sb.append(this.c);
            sb.append(", requestPermissionsAllowed=");
            sb.append(this.d);
            sb.append(", cornerRadiusPx=");
            sb.append(this.e);
            sb.append(", doOnEnterBefore=");
            sb.append(this.f);
            sb.append(", doOnEnterAfter=");
            sb.append(this.g);
            sb.append(", doFinally=");
            return uf3.d(sb, this.h, ')');
        }
    }

    public tja0(VoipCallActivity voipCallActivity, com.vk.voip.b bVar) {
        this.a = voipCallActivity;
        this.b = bVar;
        this.c = new gvw0(voipCallActivity, null);
        d dVar = new d();
        this.d = dVar;
        c cVar = new c();
        this.e = cVar;
        b bVar2 = new b();
        this.f = bVar2;
        c63 c63Var = c63.a;
        c63.a(dVar);
        voipCallActivity.getApplication().registerActivityLifecycleCallbacks(cVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("picture_in_picture_action");
        intentFilter.addAction("picture_in_picture_action_close");
        anj.d(voipCallActivity, bVar2, intentFilter, null, 4);
    }

    public final void a(int i, boolean z, boolean z2) {
        ValueAnimator ofInt;
        if (gz80.a(30)) {
            return;
        }
        View decorView = this.a.getWindow().getDecorView();
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        if (z2) {
            ofInt = ValueAnimator.ofInt(i2, i);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ll70(decorView, 1));
            decorView.addOnAttachStateChangeListener(new xvt0(decorView, ofInt));
            ofInt.start();
        } else {
            wwt0.a(i, decorView);
            ofInt = null;
        }
        this.j = ofInt;
    }

    public final PictureInPictureParams b(View view, ou3 ou3Var, List<a> list) {
        int measuredWidth = view.getMeasuredWidth();
        float measuredWidth2 = view.getMeasuredWidth();
        float f = ou3Var.a;
        int i = ou3Var.b;
        int i2 = (int) (measuredWidth2 / (f / i));
        int measuredWidth3 = (view.getMeasuredWidth() / 2) - (measuredWidth / 2);
        int measuredHeight = (view.getMeasuredHeight() / 2) - (i2 / 2);
        Rect rect = new Rect(measuredWidth3, measuredHeight, measuredWidth + measuredWidth3, i2 + measuredHeight);
        Rational rational = new Rational(ou3Var.a, i);
        List<a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (a aVar : list2) {
            Intent intent = new Intent("picture_in_picture_action");
            aVar.getClass();
            intent.putExtra("picture_in_picture_action_id", "picture_in_picture_finish_call");
            VoipCallActivity voipCallActivity = this.a;
            intent.setPackage(voipCallActivity.getPackageName());
            arrayList.add(new RemoteAction(Icon.createWithResource(voipCallActivity, R.drawable.ic_pip_phone_down_24), voipCallActivity.getString(R.string.voip_accessibility_reject_call), voipCallActivity.getString(R.string.voip_accessibility_reject_call), PendingIntent.getBroadcast(voipCallActivity, 0, intent, 67108864)));
        }
        return new PictureInPictureParams.Builder().setSourceRectHint(rect).setAspectRatio(rational).setActions(arrayList).build();
    }

    public final boolean c() {
        return d() && this.a.isInPictureInPictureMode();
    }

    public final boolean d() {
        if (!gz80.a(26) || !this.a.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            return false;
        }
        String str = Build.MODEL;
        if (str == null) {
            str = "";
        }
        return !rl3.y0(new String[]{"JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1"}).contains(drm0.p0(str).toString().toUpperCase(Locale.US));
    }

    public abstract void e(String str);

    public final void f(e eVar) {
        if (!d() || this.h || c()) {
            return;
        }
        this.l = null;
        this.m = 0L;
        gvw0 gvw0Var = this.c;
        if (gvw0Var.c()) {
            g(eVar);
            return;
        }
        if (eVar.d) {
            vq6 vq6Var = new vq6(18, this, eVar);
            k7y k7yVar = new k7y(eVar, 23);
            if (gvw0Var.c()) {
                vq6Var.invoke();
            } else {
                gvw0Var.e = true;
                gvw0Var.f(new jo60(27), new pps(gvw0Var, vq6Var, k7yVar, 6), new s1f0(10, gvw0Var, k7yVar));
            }
        }
    }

    public final void g(e eVar) {
        boolean z;
        if (!this.g) {
            this.m = SystemClock.uptimeMillis() + 10000;
            this.l = eVar;
            return;
        }
        VoipCallActivity voipCallActivity = this.a;
        try {
            z = voipCallActivity.enterPictureInPictureMode(b(eVar.a, eVar.b, eVar.c));
        } catch (Throwable unused) {
            z = false;
        }
        gzs<s3q0> gzsVar = eVar.h;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        if (z) {
            gau.c().d(voipCallActivity);
            this.k = eVar;
            eVar.f.invoke();
        }
    }

    /* compiled from: PictureInPictureActivityLauncher.kt */
    public final class c implements Application.ActivityLifecycleCallbacks {
        public c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            tja0 tja0Var = tja0.this;
            VoipCallActivity voipCallActivity = tja0Var.a;
            if (!voipCallActivity.equals(activity) || tja0Var.h) {
                return;
            }
            ValueAnimator valueAnimator = tja0Var.j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c63 c63Var = c63.a;
            c63.c(tja0Var.d);
            voipCallActivity.getApplication().unregisterActivityLifecycleCallbacks(tja0Var.e);
            voipCallActivity.unregisterReceiver(tja0Var.f);
            tja0Var.h = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            tja0 tja0Var = tja0.this;
            if (tja0Var.a.equals(activity)) {
                tja0Var.g = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            tja0 tja0Var = tja0.this;
            if (tja0Var.a.equals(activity)) {
                tja0Var.g = true;
                if (tja0Var.l == null || SystemClock.uptimeMillis() > tja0Var.m) {
                    return;
                }
                tja0Var.f(tja0Var.l);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
