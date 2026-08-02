package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.datasource.c;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.utils.f;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.movika.sdk.player.base.model.PlayerItemVariant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;

/* compiled from: OnePlayerComponents.kt */
/* loaded from: classes3.dex */
public final class mj80 implements com.vk.movika.sdk.player.base.observable.a, com.vk.movika.sdk.player.base.observable.c, com.vk.movika.sdk.player.base.components.c {
    public final Context b;
    public final xk80 c;
    public final c.a d;
    public final gzs<Handler> e;
    public final Object f = new Object();
    public Object g;
    public final HashMap<Object, a> h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public final EmptyList m;
    public final n2b0 n;
    public final n2b0 o;
    public final HashMap p;
    public PlaybackStateListener.PlaybackState q;
    public final com.vk.movika.sdk.base.hooks.f r;
    public PlayerItemVariant.Type s;
    public com.vk.movika.sdk.player.base.model.a t;
    public boolean u;
    public boolean v;
    public final Object w;
    public final Object x;
    public final ArrayList<OneVideoPlayer.c> y;

    /* compiled from: OnePlayerComponents.kt */
    public final class a {
        public final um80 a;
        public final Object b;
        public final long c;

        public a(um80 um80Var, Object obj, long j) {
            this.a = um80Var;
            this.b = obj;
            this.c = j;
        }
    }

    /* compiled from: OnePlayerComponents.kt */
    public final class b {
        public final long a;
        public final Object b;

        public b(long j, Object obj) {
            this.a = j;
            this.b = obj;
        }
    }

    public mj80(Context context, xk80 xk80Var, c.a aVar, kzg0 kzg0Var) {
        this.b = context;
        this.c = xk80Var;
        this.d = aVar;
        this.e = kzg0Var;
        EmptyList emptyList = EmptyList.b;
        this.g = emptyList;
        this.h = new HashMap<>();
        this.i = emptyList;
        this.j = emptyList;
        this.k = emptyList;
        this.l = emptyList;
        this.m = emptyList;
        n2b0 n2b0Var = new n2b0();
        this.n = n2b0Var;
        this.o = n2b0Var;
        this.p = new HashMap();
        com.vk.movika.sdk.base.hooks.f fVar = new com.vk.movika.sdk.base.hooks.f(this, 26);
        this.r = fVar;
        this.s = PlayerItemVariant.Type.DASH;
        xya0 xya0Var = new xya0(new a840(this, 1));
        xya0 xya0Var2 = new xya0(new o40(this, 27));
        nj80 nj80Var = new nj80(xk80Var, new ij80(this), new jj80(this), new kj80(this), fVar, n2b0Var);
        gd70 gd70Var = new gd70(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, gd70Var);
        this.x = msy.a(lazyThreadSafetyMode, new w9(24));
        this.y = new ArrayList<>();
        xk80Var.R(RepeatMode.OFF);
        xk80Var.d0(xya0Var);
        xk80Var.d0(xya0Var2);
        xk80Var.d0(nj80Var);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void c(com.vk.movika.sdk.base.flow.binding.i iVar) {
        this.j = j5g.v0(iVar, (Collection) this.j);
    }

    @Override // com.vk.movika.sdk.player.base.observable.a
    public final void e(PlaybackStateListener playbackStateListener) {
        xya0 xya0Var = new xya0(playbackStateListener);
        this.y.add(xya0Var);
        this.c.d0(xya0Var);
        PlaybackStateListener.PlaybackState playbackState = this.q;
        if (playbackState != null) {
            playbackStateListener.i(playbackState);
        }
    }

    @Override // com.vk.movika.sdk.player.base.observable.a
    public final void f(PlaybackStateListener playbackStateListener) {
        this.c.c0(new xya0(playbackStateListener));
    }

    @Override // com.vk.movika.sdk.player.base.observable.b
    public final void h(com.vk.movika.sdk.player.base.listener.a aVar) {
        this.i = j5g.v0(aVar, (Collection) this.i);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void i(com.vk.movika.sdk.base.flow.binding.k kVar) {
        this.k = j5g.v0(kVar, (Collection) this.k);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void j(com.vk.movika.sdk.base.flow.binding.i iVar) {
        this.j = j5g.s0((Iterable) this.j, iVar);
    }

    @Override // com.vk.movika.sdk.player.base.observable.c
    public final void k(com.vk.movika.sdk.base.flow.binding.k kVar) {
        this.k = j5g.s0((Iterable) this.k, kVar);
    }

    @Override // com.vk.movika.sdk.player.base.components.c
    public final void m(long j, Object obj) {
        u(obj);
        synchronized (this.f) {
            try {
                if (s()) {
                    o(j, obj);
                } else {
                    this.g = j5g.v0(new b(j, obj), (Collection) this.g);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.vk.movika.sdk.player.base.observable.b
    public final void n(com.vk.movika.sdk.player.base.listener.a aVar) {
        this.i = j5g.s0((Iterable) this.i, aVar);
    }

    public final void o(long j, Object obj) {
        xk80 xk80Var = this.c;
        long duration = xk80Var.getDuration();
        if (duration <= 0 || j < duration - 1) {
            um80 u0 = xk80Var.u0(new x6q(this, obj, j), this.e.invoke().getLooper());
            u0.c(j);
            u0.a.b();
            this.h.put(obj, new a(u0, obj, j));
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.w, new Object[]{"OnePlayerComponents", efz.b(j, ". IGNORE!", fp.b(duration, "addTimePointNow: duration = ", "; time = "))});
    }

    public final void p(a aVar) {
        try {
            for (com.vk.movika.sdk.player.base.listener.a aVar2 : (Iterable) this.i) {
                long j = aVar.c;
                aVar2.getClass();
            }
            aVar.a.a();
        } catch (Exception e) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.w(l, L.LogType.e, e, new Object[]{"OnePlayerComponents", "destroyPlayerMessage: error, payload class = ".concat(aVar.b.getClass().getSimpleName())}, null, null, 24);
        }
    }

    public final long q() {
        long currentPosition = this.c.getCurrentPosition();
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    public final Long r() {
        Long valueOf = Long.valueOf(this.c.getDuration());
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }

    public final boolean s() {
        PlaybackStateListener.PlaybackState playbackState;
        Long r = r();
        return (r == null || r.longValue() <= 0 || (playbackState = this.q) == null || playbackState == PlaybackStateListener.PlaybackState.ENDED || playbackState == PlaybackStateListener.PlaybackState.IDLE) ? false : true;
    }

    public final void t() {
        HashMap<Object, a> hashMap = this.h;
        Iterator<T> it = hashMap.values().iterator();
        while (it.hasNext()) {
            p((a) it.next());
        }
        hashMap.clear();
    }

    public final void u(Object obj) {
        a remove = this.h.remove(obj);
        if (remove != null) {
            p(remove);
        }
    }

    public final void v(final com.vk.movika.sdk.player.base.model.a aVar, final long j, final gzs<s3q0> gzsVar) {
        this.n.r(aVar, j);
        RepeatMode repeatMode = RepeatMode.OFF;
        xk80 xk80Var = this.c;
        xk80Var.R(repeatMode);
        sht0 x = x(aVar);
        xk80 xk80Var2 = this.c;
        y6b0 U = xk80Var2.U();
        sht0 sht0Var = null;
        if (U == null || U.a.size() == 0) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"OnePlayerComponents", "getCurrentSourceItem: current playlist is null!"});
            }
        } else {
            int m0 = xk80Var2.m0();
            if (m0 > vua0.n(U)) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.w, new Object[]{"OnePlayerComponents", "getCurrentSourceItem: currentPlayListItemIndex > playlist.lastIndex!"});
                }
            } else {
                try {
                    sht0Var = U.a(m0);
                } catch (Throwable unused) {
                }
            }
        }
        HashMap hashMap = this.p;
        if (sht0Var == null || !com.vk.movika.sdk.utils.h.a(x.b.toString(), sht0Var.b.toString())) {
            hashMap.put(x, aVar);
            if (this.v) {
                xk80Var.C(x, j);
            } else {
                xk80Var.n0(x, j);
            }
        } else {
            hashMap.put(sht0Var, aVar);
            xk80Var.seekTo(j);
            if (this.v) {
                xk80Var.pause();
            } else {
                xk80Var.resume();
            }
        }
        this.t = null;
        this.e.invoke().post(new xq8(2, this, new com.vk.movika.sdk.base.ui.z(11, new gzs() { // from class: xsna.lj80
            @Override // xsna.gzs
            public final Object invoke() {
                gzs gzsVar2 = gzs.this;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                this.n.d(aVar, j);
                return s3q0.a;
            }
        }, this)));
    }

    public final void w(int i) {
        xk80 xk80Var = this.c;
        Integer q = vua0.q(xk80Var);
        int intValue = q != null ? q.intValue() : Integer.MIN_VALUE;
        int size = xk80Var.U() != null ? r2.a.size() - 1 : -1;
        int i2 = intValue + 1;
        if (i2 <= size) {
            size = i2;
        }
        if (size >= 0) {
            try {
                xk80Var.h0(new deb0(size, 0L, null));
            } catch (Exception e) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.w(l, L.LogType.e, e, new Object[]{"OnePlayerComponents", lhg.a(i, "playNext: error. retryCount = ")}, null, null, 24);
                }
                if (i > 0) {
                    this.e.invoke().post(new xq8(2, this, new prz(this, i - 1, 2)));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sht0 x(com.vk.movika.sdk.player.base.model.a aVar) {
        List l;
        PlayerItemVariant a2;
        int i;
        List y0;
        List l2;
        PlayerItemVariant.Type type = this.s;
        ArrayList arrayList = aVar.d;
        int i2 = f.a.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                y0 = j5g.y0(arrayList);
                l2 = e43.l("mp4", "mpeg4");
            } else if (i2 == 3) {
                l = Collections.singletonList("mpd");
            } else {
                if (i2 != 4) {
                    a2 = (PlayerItemVariant) j5g.i0(arrayList);
                    PlayerItemVariant.Type type2 = a2.b;
                    String str = a2.a;
                    i = j2b0.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i == 1) {
                        return new x9v(Uri.parse(str));
                    }
                    if (i == 2) {
                        return new ag30(Uri.parse(str));
                    }
                    if (i == 3) {
                        return new ftk(Uri.parse(str));
                    }
                    if (str == null) {
                        str = "";
                    }
                    return new ftk(Uri.parse(str));
                }
                y0 = aVar.d;
                l2 = EmptyList.b;
            }
            a2 = com.vk.movika.sdk.base.utils.f.a(y0, type, l2, null);
            PlayerItemVariant.Type type22 = a2.b;
            String str2 = a2.a;
            i = j2b0.$EnumSwitchMapping$0[type22.ordinal()];
            if (i == 1) {
            }
        } else {
            l = e43.l("m3u8", "m3u");
        }
        a2 = com.vk.movika.sdk.base.utils.f.a(arrayList, type, l, Boolean.TRUE);
        PlayerItemVariant.Type type222 = a2.b;
        String str22 = a2.a;
        i = j2b0.$EnumSwitchMapping$0[type222.ordinal()];
        if (i == 1) {
        }
    }
}
