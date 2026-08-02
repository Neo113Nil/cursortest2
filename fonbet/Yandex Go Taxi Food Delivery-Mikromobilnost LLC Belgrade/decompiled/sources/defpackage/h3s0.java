package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.n;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.zact;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.shortcuts.impl.ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2$invokeSuspend$$inlined$suspendCallbackApi$2;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import com.yandex.plus.home.feature.webviews.internal.container.modal.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.widget.SlideableModalView;
import yads.f5;
import yads.jk3;
import yads.mu3;
import yads.nu3;
import yads.ve3;

/* loaded from: classes7.dex */
public final class h3s0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public h3s0(jya1 jya1Var) {
        this.a = 29;
        Objects.requireNonNull(jya1Var);
        this.b = jya1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ValueAnimator valueAnimator;
        long u;
        float f;
        az81 az81Var;
        switch (this.a) {
            case 0:
                ((ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2$invokeSuspend$$inlined$suspendCallbackApi$2) this.b).invoke(zy11.a);
                return;
            case 1:
                lbm lbmVar = (lbm) ((Ref$ObjectRef) this.b).element;
                if (lbmVar != null) {
                    ((nac) lbmVar).a();
                    return;
                }
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.b).z1();
                return;
            case 3:
                ((GoFrameLayout) this.b).requestApplyInsets();
                return;
            case 4:
                ((SlideableModalView) ((u45) this.b)).expand();
                return;
            case 5:
                n nVar = (n) this.b;
                Window.Callback callback = nVar.b;
                Menu x = nVar.x();
                MenuBuilder menuBuilder = x instanceof MenuBuilder ? (MenuBuilder) x : null;
                if (menuBuilder != null) {
                    menuBuilder.stopDispatchingItemsChanged();
                }
                try {
                    x.clear();
                    if (callback.onCreatePanelMenu(0, x)) {
                        if (!callback.onPreparePanel(0, null, x)) {
                        }
                        if (menuBuilder == null) {
                            menuBuilder.startDispatchingItemsChanged();
                            return;
                        }
                        return;
                    }
                    x.clear();
                    if (menuBuilder == null) {
                    }
                } catch (Throwable th) {
                    if (menuBuilder != null) {
                        menuBuilder.startDispatchingItemsChanged();
                    }
                    throw th;
                }
            case 6:
                valueAnimator = ((VaultsPagerView) this.b).changeScreenValueAnimator;
                valueAnimator.start();
                return;
            case 7:
                ((a) this.b).k(0);
                return;
            case 8:
                xd51 xd51Var = (xd51) this.b;
                z83.g(null, xd51Var.w.getLooper(), Looper.myLooper());
                z83.f(xd51Var.C, null);
                xd51Var.B++;
                ydi0 ydi0Var = xd51Var.A;
                if (ydi0Var != null) {
                    ydi0Var.a();
                }
                xd51Var.A = null;
                if (xd51Var.B < 3 && xd51Var.a.a()) {
                    if (xd51Var.y == null) {
                        xd51Var.y = ((com.yandex.messaging.internal.net.a) xd51Var.D.w).d(xd51Var);
                    }
                    xd51Var.h();
                    return;
                }
                return;
            case 9:
                ((mp61) this.b).b();
                return;
            case 10:
                h0j h0jVar = (h0j) this.b;
                boolean z = h0jVar.a;
                Handler handler = (Handler) h0jVar.e;
                if (!z) {
                    if (((js81) h0jVar.c).a.contains(ve3.d)) {
                        qv71 qv71Var = (qv71) h0jVar.d;
                        fp71 fp71Var = qv71Var.d;
                        hn71 hn71Var = qv71Var.e;
                        hn71Var.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!ym11.h(linkedHashMap)) {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        View d = ((yp61) ((i971) hn71Var.c).b).d();
                        Integer valueOf = d != null ? Integer.valueOf(d.getHeight()) : null;
                        Integer valueOf2 = d != null ? Integer.valueOf(d.getWidth()) : null;
                        na71 na71Var = ((i581) hn71Var.b).c;
                        if (valueOf == null || valueOf.intValue() <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            linkedHashMap.put("view_container_height", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("view_container_height", valueOf);
                        }
                        if (valueOf2 == null || valueOf2.intValue() <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 == null) {
                            linkedHashMap.put("view_container_width", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("view_container_width", valueOf2);
                        }
                        int i = na71Var.g;
                        Integer valueOf3 = i > 0 ? Integer.valueOf(i) : null;
                        if (valueOf3 == null) {
                            linkedHashMap.put("video_height", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("video_height", valueOf3);
                        }
                        int i2 = na71Var.h;
                        Integer valueOf4 = i2 > 0 ? Integer.valueOf(i2) : null;
                        if (valueOf4 == null) {
                            linkedHashMap.put("video_width", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("video_width", valueOf4);
                        }
                        String str = na71Var.e;
                        if (str == null) {
                            linkedHashMap.put("video_codec", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("video_codec", str);
                        }
                        String str2 = na71Var.d;
                        if (str2 == null) {
                            linkedHashMap.put("video_mime_type", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("video_mime_type", str2);
                        }
                        Float f2 = na71Var.f;
                        if (f2 == null) {
                            linkedHashMap.put("video_vmaf", StringUtils.UNDEFINED);
                        } else {
                            linkedHashMap.put("video_vmaf", f2);
                        }
                        fp71Var.x = gw00.e(new Pair("video_playback_info", linkedHashMap));
                        e971 e971Var = qv71Var.a;
                        f5 f5Var = f5.y;
                        e971Var.a(f5Var);
                        if (!qv71Var.h) {
                            qv71Var.h = true;
                            fp71 fp71Var2 = qv71Var.d;
                            fp71Var2.getClass();
                            fp71Var2.f(b.l(new Pair(ACSPConstants.STATUS, "success"), new Pair("durations", ((sk71) fp71Var2.c).a.a(j73.f0(new f5[]{f5Var, f5.z})))));
                        }
                        h0jVar.a = true;
                        handler.removeCallbacksAndMessages(null);
                        h0jVar.b = false;
                        return;
                    }
                }
                handler.postDelayed(this, 200L);
                return;
            case 11:
                gm71 gm71Var = (gm71) this.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - gm71Var.g;
                gm71Var.g = elapsedRealtime;
                gm71Var.e -= j;
                gm71Var.c();
                return;
            case 12:
                kzo kzoVar = (kzo) this.b;
                ek71 ek71Var = ((bc71) kzoVar.c).a.a;
                ek71Var.v();
                long u2 = rf71.u(ek71Var.a(ek71Var.b0));
                ek71 ek71Var2 = ((bc71) kzoVar.c).a.a;
                ie81 ie81Var = ek71Var2.m;
                ek71Var2.v();
                ek71Var2.v();
                if (ek71Var2.b0.b.a()) {
                    hp71 hp71Var = ek71Var2.b0;
                    v281 v281Var = hp71Var.b;
                    hp71Var.a.a(v281Var.a, ie81Var);
                    u = rf71.u(ie81Var.c(v281Var.b, v281Var.c));
                } else {
                    ek71Var2.v();
                    yn81 yn81Var = ek71Var2.b0.a;
                    u = yn81Var.c() ? -9223372036854775807L : rf71.u(yn81Var.a(ek71Var2.q(), ek71Var2.a, 0L).F);
                }
                ((xc71) kzoVar.w).c(u, u2);
                if (kzoVar.b) {
                    ((Handler) kzoVar.x).postDelayed(this, 200L);
                    return;
                }
                return;
            case 13:
                nu3 nu3Var = (nu3) this.b;
                int streamVolume = nu3Var.c.getStreamVolume(3);
                int streamMaxVolume = nu3Var.c.getStreamMaxVolume(3);
                nu3Var.d.getClass();
                if (streamMaxVolume <= 0 || streamVolume <= 0) {
                    f = 0.0f;
                } else {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                nu3Var.g.set(false);
                if (((Float) nu3Var.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    nu3Var.a.post(new vz4(this, f));
                    return;
                }
                return;
            case 14:
                z4m0 z4m0Var = (z4m0) this.b;
                HashMap hashMap = (HashMap) z4m0Var.x;
                for (lo71 lo71Var : hashMap.values()) {
                    Iterator it = lo71Var.d.iterator();
                    while (it.hasNext()) {
                        gr71 gr71Var = (gr71) it.next();
                        ku71 ku71Var = gr71Var.b;
                        if (ku71Var != null) {
                            jk3 jk3Var = lo71Var.c;
                            if (jk3Var == null) {
                                gr71Var.a = lo71Var.b;
                                ku71Var.r(gr71Var, false);
                            } else {
                                ku71Var.j(jk3Var);
                            }
                        }
                    }
                }
                hashMap.clear();
                z4m0Var.z = null;
                return;
            case 15:
                nga1.c((Dialog) ((fp71) this.b).a);
                return;
            case 16:
                h0j h0jVar2 = (h0j) this.b;
                boolean z2 = h0jVar2.a;
                Handler handler2 = (Handler) h0jVar2.e;
                if (z2 || !((nr41) ((ji41) h0jVar2.c).b).h()) {
                    handler2.postDelayed(this, 200L);
                    return;
                }
                qv71 qv71Var2 = (qv71) h0jVar2.d;
                h0j h0jVar3 = qv71Var2.g;
                ((Handler) h0jVar3.e).removeCallbacksAndMessages(null);
                h0jVar3.b = false;
                qv71Var2.a.b(f5.y, null);
                qv71Var2.b.a.j();
                h0j h0jVar4 = qv71Var2.f;
                if (!h0jVar4.b && !h0jVar4.a) {
                    h0jVar4.b = true;
                    ((Handler) h0jVar4.e).post(new h3s0(10, h0jVar4));
                }
                qv71Var2.c.b(qv71.k, new gp51(22, qv71Var2));
                h0jVar2.a = true;
                handler2.removeCallbacksAndMessages(null);
                h0jVar2.b = false;
                return;
            case 17:
                ((ci81) this.b).a.a.b("OPT_OUT_ENABLED", true);
                return;
            case 18:
                j471 j471Var = (j471) this.b;
                j471Var.i(j471Var.c.e);
                return;
            case 19:
                yv81 yv81Var = ((oo61) this.b).e;
                yv81Var.b.a(new mu3(yv81Var));
                return;
            case 20:
                yx81 yx81Var = (yx81) this.b;
                com.google.android.gms.common.b bVar = yx81Var.w;
                Context context = yx81Var.c;
                bVar.getClass();
                if (fwt.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 21:
                ((jy81) this.b).f();
                return;
            case 22:
                om2 om2Var = ((jy81) ((lm71) this.b).b).b;
                om2Var.disconnect(om2Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 23:
                ((NonGmsServiceBrokerClient) this.b).zab();
                return;
            case 24:
                az81Var = ((zact) this.b).zah;
                ((ly81) az81Var).b(new ConnectionResult(4));
                return;
            case 25:
                px81 px81Var = (px81) this.b;
                Lock lock = px81Var.F;
                lock.lock();
                try {
                    px81.j(px81Var);
                    return;
                } finally {
                    lock.unlock();
                }
            case 26:
                q041 q041Var = (q041) this.b;
                synchronized (q041Var.a) {
                    try {
                        if (q041Var.b()) {
                            Log.e("WakeLock", String.valueOf(q041Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            q041Var.d();
                            if (q041Var.b()) {
                                q041Var.c = 1;
                                q041Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 27:
                ((atx0) this.b).b(new IOException("TIMEOUT"));
                return;
            case 28:
                synchronized (((o3a1) this.b).c) {
                    ((sx60) ((o3a1) this.b).w).onCanceled();
                }
                return;
            default:
                jya1 jya1Var = (jya1) this.b;
                jya1Var.y = jya1Var.D;
                return;
        }
    }

    public h3s0(mp61 mp61Var) {
        this.a = 9;
        this.b = mp61Var;
    }

    public /* synthetic */ h3s0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
