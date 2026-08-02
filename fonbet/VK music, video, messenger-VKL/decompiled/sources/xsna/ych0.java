package xsna;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Handler;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.broadcast.ScreenStateReceiver;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.bb40;
import xsna.c63;
import xsna.k840;

/* compiled from: ScreenStateObserverImpl.kt */
/* loaded from: classes3.dex */
public final class ych0 extends c63.b implements xch0, ScreenStateReceiver.a {
    public final e2b0 b;
    public boolean c;
    public long d;
    public boolean g;
    public final u750 i;
    public final g950 j;
    public final np40 k;
    public final MusicRestrictionPopupDisplayer l;
    public final Object m;
    public boolean e = true;
    public boolean f = true;
    public final ScreenStateReceiver h = new ScreenStateReceiver();

    public ych0(e2b0 e2b0Var) {
        this.b = e2b0Var;
        s750 s750Var = k840.a.e;
        this.i = s750Var == null ? null : s750Var;
        this.j = k840.a.i;
        lp40 lp40Var = kvf.a;
        this.k = lp40Var == null ? null : lp40Var;
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        this.l = aVar != null ? aVar : null;
        this.m = msy.a(LazyThreadSafetyMode.NONE, new fyd0(this, 7));
    }

    public final void D(PlayerService playerService) {
        ScreenStateReceiver screenStateReceiver = this.h;
        synchronized (screenStateReceiver) {
            if (!screenStateReceiver.b) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                playerService.registerReceiver(screenStateReceiver, intentFilter);
                screenStateReceiver.b = true;
            }
        }
        ScreenStateReceiver screenStateReceiver2 = this.h;
        synchronized (screenStateReceiver2) {
            screenStateReceiver2.c = this;
        }
        c63 c63Var = c63.a;
        c63.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    public final void E() {
        boolean z;
        e2b0 e2b0Var = this.b;
        PlayState o0 = e2b0.o0(e2b0Var.u);
        this.c = this.c || o0.h();
        e2b0Var.f0(1);
        xv40 xv40Var = e2b0Var.j.c;
        ou5 ou5Var = xv40Var.k;
        Handler handler = xv40Var.b;
        try {
            z = !etu.a(handler, ou5Var);
        } catch (Exception e) {
            L.i(e);
            z = false;
        }
        xv40Var.j = z;
        handler.removeCallbacks(ou5Var);
        u750 u750Var = this.i;
        u750Var.n(false);
        u750Var.R0();
        this.d = System.currentTimeMillis();
        if (o0 == PlayState.PAUSED) {
            return;
        }
        bb40 bb40Var = (bb40) this.m.getValue();
        o450 o450Var = bb40Var.d;
        o450Var.d();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"count = " + o450Var.b()});
        }
        bb40Var.g = true;
        List list = (List) bb40Var.f.get(Integer.valueOf(o450Var.b()));
        if (list == null || !list.contains(bb40.a.BACKGROUND)) {
            if (o450Var.b() <= 3) {
                return;
            }
            int i = bb40Var.h + 1;
            bb40Var.h = i;
            if (i != 2) {
                return;
            } else {
                bb40Var.h = 0;
            }
        }
        u750 u750Var2 = bb40Var.c;
        u750Var2.t();
        u750Var2.T();
        bb40Var.a.invoke();
    }

    public final void F(PlayerService playerService) {
        ScreenStateReceiver screenStateReceiver = this.h;
        synchronized (screenStateReceiver) {
            if (screenStateReceiver.b) {
                playerService.unregisterReceiver(screenStateReceiver);
                screenStateReceiver.b = false;
            }
        }
        ScreenStateReceiver screenStateReceiver2 = this.h;
        synchronized (screenStateReceiver2) {
            screenStateReceiver2.c = null;
        }
        c63 c63Var = c63.a;
        c63.c(this);
    }

    @Override // com.vk.music.broadcast.ScreenStateReceiver.a
    public final void d() {
        if (this.e) {
            this.e = false;
            this.b.t0(false);
            PlayState o0 = e2b0.o0(this.b.u);
            boolean z = true;
            this.i.n(true);
            boolean c = this.j.c();
            boolean z2 = !c;
            if (c || !(o0 == PlayState.PLAYING || o0 == PlayState.PAUSED)) {
                this.c = false;
            } else {
                if (!this.b.U()) {
                    r6m.a.getClass();
                    if (!r6m.b) {
                        z = false;
                    }
                }
                this.f = z;
                if (z) {
                    this.c = false;
                } else {
                    E();
                }
            }
            this.g = z2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.music.broadcast.ScreenStateReceiver.a
    public final void h() {
        c63 c63Var = c63.a;
        if (c63.f && this.h.a) {
            this.g = false;
            this.f = true;
            this.e = true;
            this.b.t0(true);
            if (this.c) {
                this.b.M(true, new PlaybackActionMeta(0, 0L, 2, null), null);
                if (System.currentTimeMillis() - this.d < 60000) {
                    ((bb40) this.m.getValue()).a();
                }
                this.c = false;
            }
        }
    }

    @Override // xsna.xch0
    public final boolean i() {
        if (this.f) {
            return !this.c || this.e;
        }
        return false;
    }

    @Override // xsna.xch0
    public final boolean j() {
        boolean z;
        ScreenStateReceiver screenStateReceiver = this.h;
        synchronized (screenStateReceiver) {
            z = screenStateReceiver.d == ScreenStateReceiver.ScreenState.ON_AND_LOCKED;
        }
        return z;
    }

    @Override // xsna.c63.b
    public final void u() {
        d();
        this.i.w(true);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.c63.b
    public final void x(Activity activity) {
        h();
        ((bb40) this.m.getValue()).a();
        this.i.w(false);
    }
}
