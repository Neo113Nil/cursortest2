package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.pip.VideoPipStateHolder;
import xsna.x2s0;

/* compiled from: VideoAudioFocusController.kt */
/* loaded from: classes2.dex */
public final class z2s0 extends ja0 implements do4 {
    public static fo4 c;
    public static com.vk.libvideo.autoplay.e d;
    public static a3s0 j;
    public static Boolean k;
    public static Boolean l;
    public static boolean m;
    public static final z2s0 b = new z2s0();
    public static final Handler e = new Handler(Looper.getMainLooper());
    public static final b f = new b();
    public static final a g = new a();
    public static final u460 h = new u460(1);
    public static final y2s0 i = new y2s0();
    public static final float n = 1.0f;

    /* compiled from: VideoAudioFocusController.kt */
    public static final class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            z2s0.e(z2s0.b);
        }
    }

    /* compiled from: VideoAudioFocusController.kt */
    public static final class b extends BroadcastReceiver {
        public long a;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (SystemClock.elapsedRealtime() - this.a > 1000 && epx.f(intent.getAction(), "android.intent.action.HEADSET_PLUG") && intent.getIntExtra("state", -1) == 0) {
                z2s0.e(z2s0.b);
            }
        }
    }

    public static final void e(z2s0 z2s0Var) {
        z2s0Var.getClass();
        a3s0 a3s0Var = j;
        if (a3s0Var != null && a3s0Var.isPlaying()) {
            if (!a3s0Var.getConfig().a || a3s0Var.v()) {
                a3s0Var.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                a3s0Var.c();
            }
            com.vk.libvideo.autoplay.e eVar = d;
            if (eVar == null) {
                eVar = null;
            }
            eVar.getClass();
            com.vk.libvideo.autoplay.e.f(true);
        }
    }

    public static void f(z2s0 z2s0Var) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        fo4 fo4Var = new fo4(context, fxc0.B().J().B1());
        z2s0Var.getClass();
        if (m) {
            return;
        }
        c = fo4Var;
        d = eVar;
        fo4Var.a(z2s0Var);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(z2s0Var);
        context.registerReceiver(f, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        context.registerReceiver(g, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        m = true;
    }

    public static a3s0 h() {
        return j;
    }

    public static void i(a3s0 a3s0Var) {
        a3s0 a3s0Var2 = j;
        if (epx.f(a3s0Var2 != null ? a3s0Var2.getId() : null, a3s0Var.getId()) && k == null) {
            Handler handler = e;
            y2s0 y2s0Var = i;
            handler.removeCallbacks(y2s0Var);
            handler.postDelayed(y2s0Var, 500L);
            j = null;
        }
    }

    @Override // xsna.do4
    public final void a() {
        float f2;
        a3s0 a3s0Var = j;
        if (a3s0Var == null) {
            return;
        }
        if (l != null) {
            if (a3s0Var.getConfig().c()) {
                f2 = n;
            } else if (a3s0Var.getConfig().f()) {
                if (fxc0.B().J().i0()) {
                    c63 c63Var = c63.a;
                    if (!c63.f) {
                        f2 = n;
                    }
                }
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                f2 = n;
            }
            a3s0Var.setVolume(f2);
        }
        if (k != null) {
            a3s0Var.play();
        }
        a3s0Var.l(x2s0.a.a);
        l = null;
        k = null;
    }

    @Override // xsna.do4
    public final void b() {
        a3s0 a3s0Var = j;
        if (a3s0Var == null) {
            return;
        }
        l = Boolean.TRUE;
        a3s0Var.setVolume(Math.min(a3s0Var.getVolume(), 0.2f));
        a3s0Var.l(x2s0.b.a.a);
    }

    @Override // xsna.do4
    public final void c() {
        a3s0 a3s0Var = j;
        if (a3s0Var == null) {
            l = null;
            k = null;
            return;
        }
        if (a3s0Var.getConfig().a && a3s0Var.getVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a3s0Var.pause();
        } else if (a3s0Var.getConfig().k) {
            com.vk.libvideo.autoplay.e eVar = d;
            if (eVar == null) {
                eVar = null;
            }
            eVar.getClass();
            com.vk.libvideo.autoplay.e.f(true);
            a3s0Var.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        a3s0Var.l(x2s0.b.C3972b.a);
        l = null;
        k = null;
    }

    @Override // xsna.do4
    public final void d() {
        a3s0 a3s0Var = j;
        if (a3s0Var == null) {
            return;
        }
        k = Boolean.TRUE;
        com.vk.libvideo.autoplay.e eVar = d;
        if (eVar == null) {
            eVar = null;
        }
        eVar.getClass();
        com.vk.libvideo.autoplay.e.f(true);
        a3s0Var.pause();
        a3s0Var.l(x2s0.b.c.a);
    }

    public final void g(a3s0 a3s0Var, int i2) {
        f(this);
        String id = a3s0Var.getId();
        a3s0 a3s0Var2 = j;
        if (!epx.f(id, a3s0Var2 != null ? a3s0Var2.getId() : null)) {
            l = null;
            k = null;
            f.a = SystemClock.elapsedRealtime();
        }
        j = a3s0Var;
        y2s0 y2s0Var = i;
        Handler handler = e;
        if (i2 <= 0) {
            handler.removeCallbacks(y2s0Var);
            handler.postDelayed(y2s0Var, 500L);
        } else {
            handler.removeCallbacks(y2s0Var);
            fo4 fo4Var = c;
            (fo4Var != null ? fo4Var : null).a.d(i2);
        }
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        VideoMinifiedPlayerStateHolder.a.getClass();
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.h() || (rts0.b.a().P0() instanceof VideoMinimizableState.Collapsed)) {
            return;
        }
        e.postDelayed(h, 1000L);
    }

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e.removeCallbacks(h);
    }
}
