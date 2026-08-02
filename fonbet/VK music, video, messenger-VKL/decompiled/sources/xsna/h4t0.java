package xsna;

import android.annotation.TargetApi;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.player.VideoMode;
import com.vk.stat.scheme.SchemeStat$TypeVideoPipItem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.pip.PipCallbackActions;
import one.video.pip.actions.VideoPipActionReceiver;
import one.video.pip.config.data.PlaybackStatus;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.n3t0;
import xsna.v1h0;
import xsna.ye0;

/* compiled from: VideoPlayerPip2Delegate.kt */
@TargetApi(26)
/* loaded from: classes3.dex */
public final class h4t0 implements nhl {
    public final AppCompatActivity b;
    public final y1s0 c;
    public final lzl0 d;
    public final Object e;
    public final boolean f;
    public final boolean g;
    public String h;
    public yg5 i;
    public final Object j;
    public final bpn0 k;
    public final bts0 l;
    public final q4s0 m;
    public final com.vk.libvideo.pip.a n;
    public final io.reactivex.rxjava3.disposables.b o;
    public dpa0 p;
    public boolean q;
    public final bpn0 r;
    public final Object s;

    public h4t0(AppCompatActivity appCompatActivity, y1s0 y1s0Var, lzl0 lzl0Var) {
        this.b = appCompatActivity;
        this.c = y1s0Var;
        this.d = lzl0Var;
        e3c0 e3c0Var = new e3c0(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, e3c0Var);
        this.f = fxc0.B().J().a();
        this.g = fxc0.B().J().i0();
        this.j = msy.a(lazyThreadSafetyMode, new ku70(15));
        this.k = new bpn0(new daz(26));
        this.l = new bts0(new ipq0(this, 8), new a());
        this.m = q4s0.a;
        this.n = new com.vk.libvideo.pip.a(new b4p0(0, this, h4t0.class, "autoPlay", "getAutoPlay()Lcom/vk/libvideo/autoplay/AutoPlay;", 1), new b6f0(this, 18));
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.o = bVar;
        this.r = new bpn0(new kld0(this, 28));
        this.s = msy.a(lazyThreadSafetyMode, new kud0(10));
        appCompatActivity.getLifecycle().addObserver(this);
        appCompatActivity.getSavedStateRegistry().c("PIP_DELEGATE_SAVED_STATE", new v1h0.b() { // from class: xsna.f4t0
            @Override // xsna.v1h0.b
            public final Bundle r() {
                Bundle bundle = new Bundle();
                bundle.putString("RESTORED_PIP_INITIATOR_ID", h4t0.this.h);
                return bundle;
            }
        });
        io.reactivex.rxjava3.internal.operators.observable.j1 U = ysg0.b.a.b0(VideoPipStateHolder.a.class).U(new qq(new yjs0(3), 29));
        asu0 asu0Var = asu0.a;
        bVar.b(U.a0(asu0Var.d()).subscribe(new p350(new j5b0(this, 29), 27)));
        bVar.b(hg1.h(y1s0Var.b().a0(asu0Var.d()), new yyl0(this, 15)));
    }

    public final void a() {
        boolean z = this.q;
        lzl0 lzl0Var = this.d;
        if (z && this.b.getLifecycle().getCurrentState() == Lifecycle.State.CREATED) {
            lzl0Var.invoke(new n3t0.b(this.h));
        } else {
            lzl0Var.invoke(new n3t0.c(this.h, false));
        }
        boolean z2 = this.q;
        com.vk.libvideo.pip.a aVar = this.n;
        if (z2) {
            yg5 yg5Var = this.i;
            if (yg5Var != null) {
                yg5Var.C(true);
            }
            aVar.getClass();
            aVar.a(SchemeStat$TypeVideoPipItem.EventType.CLOSE);
            ysg0.b.a(VideoPipStateHolder.State.NONE);
        } else {
            aVar.getClass();
            aVar.a(SchemeStat$TypeVideoPipItem.EventType.RESTORE);
            ysg0<Object> ysg0Var = ysg0.b;
            ysg0Var.a(VideoPipStateHolder.State.DESTROYING);
            ysg0Var.a(VideoPipStateHolder.State.NONE);
            yg5 yg5Var2 = this.i;
            if (yg5Var2 != null) {
                yg5Var2.L(VideoMode.EMPTY);
            }
        }
        if (this.g) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
            a2.o.remove((b.a) this.r.getValue());
        }
        dpa0 dpa0Var = this.p;
        if (dpa0Var != null) {
            dpa0Var.d(null);
        }
        this.p = null;
        this.l.c();
        this.i = null;
        this.h = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r8 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(qtx0 qtx0Var, yg5 yg5Var, boolean z) {
        boolean z2;
        OneVideoPlayer a2;
        if (c()) {
            if (yg5Var != null) {
                z2 = true;
                if (yg5Var.isPaused()) {
                }
            }
            z2 = false;
            if (yg5Var != null) {
                if ((((Boolean) this.k.getValue()).booleanValue() ? false : yg5Var.P0()) || yg5Var.B() || z2) {
                    return;
                }
                this.i = yg5Var;
                this.h = qtx0Var != null ? qtx0Var.D9() : null;
                d3b0 v0 = yg5Var.v0();
                if (v0 == null || (a2 = v0.a()) == null) {
                    return;
                }
                AppCompatActivity appCompatActivity = this.b;
                dpa0 dpa0Var = new dpa0(appCompatActivity, this);
                dpa0Var.d(a2);
                wgt0 h0 = yg5Var.h0();
                HashSet hashSet = iah0.a;
                int i = appCompatActivity.getResources().getDisplayMetrics().widthPixels;
                int i2 = (int) (h0.b * (i / h0.a));
                int b = x9.b(appCompatActivity.getResources().getDisplayMetrics().heightPixels, i2, 2, fnj.a(appCompatActivity));
                dpa0Var.d.a = new Rect(0, b, i, i2 + b);
                h(this.c.a());
                this.p = dpa0Var;
            }
        }
    }

    public final boolean c() {
        AppCompatActivity appCompatActivity = this.b;
        return (appCompatActivity.isFinishing() || appCompatActivity.isDestroyed()) ? false : true;
    }

    public final void d(boolean z, Configuration configuration) {
        if (c()) {
            dpa0 dpa0Var = this.p;
            if (dpa0Var != null) {
                AppCompatActivity appCompatActivity = dpa0Var.a;
                if (z || !appCompatActivity.isInPictureInPictureMode()) {
                    if (z) {
                        OneVideoPlayer oneVideoPlayer = dpa0Var.c;
                        if (oneVideoPlayer != null) {
                            dpa0Var.b(dpa0Var.d.a(oneVideoPlayer));
                        }
                    } else {
                        OneVideoPlayer oneVideoPlayer2 = dpa0Var.c;
                        if (oneVideoPlayer2 != null) {
                            oneVideoPlayer2.c0(dpa0Var.e);
                        }
                        VideoPipActionReceiver videoPipActionReceiver = dpa0Var.g;
                        if (videoPipActionReceiver != null) {
                            appCompatActivity.unregisterReceiver(videoPipActionReceiver);
                        }
                        dpa0Var.g = null;
                        appCompatActivity.getLifecycle().removeObserver(dpa0Var.i);
                        dpa0Var.b.f();
                    }
                }
            }
            if (this.p != null || z) {
                return;
            }
            f();
        }
    }

    public final void e(IllegalStateException illegalStateException) {
        L.i(illegalStateException);
        this.n.getClass();
        ysg0.b.a(VideoPipStateHolder.State.NONE);
        this.l.c();
        this.i = null;
        if (this.g) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
            a2.o.remove((b.a) this.r.getValue());
        }
        this.h = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void f() {
        if (gz80.a > 28 || this.q) {
            a();
        } else {
            ((Handler) this.e.getValue()).post(new t12(this, 13));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        if (r5 == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(boolean z) {
        dpa0 dpa0Var;
        boolean z2;
        if (c()) {
            ?? r0 = this.j;
            IllegalStateException illegalStateException = null;
            if (((Boolean) r0.getValue()).booleanValue()) {
                Iterator<T> it = this.b.getSupportFragmentManager().c.f().iterator();
                boolean z3 = false;
                Object obj = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        Fragment fragment = (Fragment) next;
                        if (fragment.isResumed() && (fragment instanceof qtx0)) {
                            qtx0 qtx0Var = (qtx0) fragment;
                            if (qtx0Var.lc() && qtx0Var.q5() != null) {
                                if (z3) {
                                    break;
                                }
                                z3 = true;
                                obj = next;
                            }
                        }
                    }
                }
                obj = null;
                qtx0 qtx0Var2 = obj instanceof qtx0 ? (qtx0) obj : null;
                yg5 q5 = qtx0Var2 != null ? qtx0Var2.q5() : null;
                if (qtx0Var2 == null || !qtx0Var2.lc()) {
                    q5 = null;
                }
                b(qtx0Var2, q5, z);
            }
            if (((Boolean) r0.getValue()).booleanValue() && (dpa0Var = this.p) != null) {
                com.vk.libvideo.pip.a aVar = this.n;
                aVar.getClass();
                ysg0.b.a(VideoPipStateHolder.State.SCHEDULED_TO_OPEN);
                kxi kxiVar = dpa0Var.d;
                AppCompatActivity appCompatActivity = dpa0Var.a;
                h4t0 h4t0Var = dpa0Var.b;
                OneVideoPlayer oneVideoPlayer = dpa0Var.c;
                if (oneVideoPlayer == null) {
                    h4t0Var.e(new IllegalStateException("player is null, set player before enter to pip mode"));
                } else {
                    if (kxiVar.a != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31 && i <= 32) {
                            appCompatActivity.setTranslucent(false);
                            appCompatActivity.setTranslucent(true);
                        }
                        try {
                            z2 = appCompatActivity.enterPictureInPictureMode(dpa0Var.a(kxiVar.a(oneVideoPlayer)));
                        } catch (IllegalStateException e) {
                            illegalStateException = e;
                            z2 = false;
                            if (z2) {
                            }
                            if (z2) {
                            }
                        } catch (NullPointerException e2) {
                            illegalStateException = new IllegalStateException(e2);
                            z2 = false;
                            if (z2) {
                            }
                            if (z2) {
                            }
                        }
                        if (z2) {
                            appCompatActivity.overridePendingTransition(0, 0);
                        } else {
                            if (illegalStateException == null) {
                                illegalStateException = new IllegalStateException("the device does not support picture-in-picture");
                            }
                            h4t0Var.e(illegalStateException);
                        }
                        if (z2) {
                            return false;
                        }
                        VideoPipStateHolder videoPipStateHolder = VideoPipStateHolder.a;
                        yg5 yg5Var = this.i;
                        videoPipStateHolder.getClass();
                        VideoPipStateHolder.i(yg5Var);
                        this.d.invoke(new n3t0.c(this.h, true));
                        ysg0.b.a(VideoPipStateHolder.State.OPENED);
                        i0q0.f(new xqf0(9));
                        aVar.a(SchemeStat$TypeVideoPipItem.EventType.OPEN);
                        return true;
                    }
                    h4t0Var.e(new IllegalStateException("source rect hint is null, set source rect hint before enter to pip mode"));
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(boolean z) {
        yg5 yg5Var;
        if (this.c.d()) {
            boolean z2 = false;
            boolean z3 = ((Boolean) this.s.getValue()).booleanValue() && (yg5Var = this.i) != null && yg5Var.u0();
            dpa0 dpa0Var = this.p;
            if (dpa0Var != null) {
                dpa0Var.c(!z || z3);
            }
            if (z && !z3) {
                z2 = true;
            }
            bts0 bts0Var = this.l;
            bts0Var.d.b = z2;
            bts0Var.d();
        }
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.d()) {
            i0q0.f(new x2j0(this, 13));
        }
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.o.dispose();
        AppCompatActivity appCompatActivity = this.b;
        appCompatActivity.getLifecycle().removeObserver(this);
        this.l.c();
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        a2.o.remove((b.a) this.r.getValue());
        y1h0 y1h0Var = appCompatActivity.getSavedStateRegistry().a;
        synchronized (y1h0Var.c) {
        }
        dpa0 dpa0Var = this.p;
        if (dpa0Var != null) {
            dpa0Var.d(null);
        }
        this.p = null;
        this.i = null;
        this.h = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r3 == false) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume(f5z f5zVar) {
        Bundle a2;
        String string;
        String str;
        AppCompatActivity appCompatActivity = this.b;
        if (!appCompatActivity.isInPictureInPictureMode() || !c() || (a2 = appCompatActivity.getSavedStateRegistry().a("PIP_DELEGATE_SAVED_STATE")) == null || (string = a2.getString("RESTORED_PIP_INITIATOR_ID")) == null) {
            return;
        }
        this.h = string;
        if (((Boolean) this.j.getValue()).booleanValue() && c() && (str = this.h) != null) {
            Iterator<T> it = appCompatActivity.getSupportFragmentManager().c.f().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    z1h0 z1h0Var = (Fragment) next;
                    if ((z1h0Var instanceof qtx0) && epx.f(((qtx0) z1h0Var).D9(), str)) {
                        if (z) {
                            break;
                        }
                        obj = next;
                        z = true;
                    }
                }
            }
            qtx0 qtx0Var = obj instanceof qtx0 ? (qtx0) obj : null;
            b(qtx0Var, qtx0Var != null ? qtx0Var.q5() : null, false);
            this.d.invoke(new n3t0.c(this.h, true));
        }
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
        this.q = false;
        dpa0 dpa0Var = this.p;
        if (dpa0Var == null || !dpa0Var.a.isInPictureInPictureMode()) {
            return;
        }
        VideoPipStateHolder videoPipStateHolder = VideoPipStateHolder.a;
        yg5 yg5Var = this.i;
        videoPipStateHolder.getClass();
        VideoPipStateHolder.i(yg5Var);
        yg5 yg5Var2 = this.i;
        if (yg5Var2 == null || !yg5Var2.P0()) {
            return;
        }
        yg5 yg5Var3 = this.i;
        if (yg5Var3 != null) {
            yg5Var3.play();
        }
        dpa0 dpa0Var2 = this.p;
        if (dpa0Var2 != null) {
            dpa0Var2.c(true);
        }
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
        yg5 yg5Var;
        yg5 yg5Var2;
        this.q = true;
        q4s0 q4s0Var = this.m;
        if (!q4s0Var.d()) {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.h() && (yg5Var = this.i) != null && !yg5Var.M0() && (yg5Var2 = this.i) != null) {
                yg5Var2.C(true);
            }
        }
        yg5 yg5Var3 = this.i;
        if (yg5Var3 != null && yg5Var3.w0()) {
            yg5 yg5Var4 = this.i;
            if (yg5Var4 != null) {
                yg5Var4.C(true);
            }
            dpa0 dpa0Var = this.p;
            if (dpa0Var != null) {
                dpa0Var.c(true);
            }
        }
        dpa0 dpa0Var2 = this.p;
        if (dpa0Var2 == null || !dpa0Var2.a.isInPictureInPictureMode() || q4s0Var.d()) {
            return;
        }
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.i(null);
    }

    /* compiled from: VideoPlayerPip2Delegate.kt */
    public final class a implements hnt0 {
        public boolean b = true;

        /* compiled from: VideoPlayerPip2Delegate.kt */
        /* renamed from: xsna.h4t0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2972a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PipCallbackActions.values().length];
                try {
                    iArr[PipCallbackActions.PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PipCallbackActions.PLAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PipCallbackActions.SKIP_FORWARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* compiled from: VideoPlayerPip2Delegate.kt */
        public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<PipCallbackActions, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(PipCallbackActions pipCallbackActions) {
                a.b((a) this.receiver, pipCallbackActions);
                return s3q0.a;
            }
        }

        public a() {
        }

        public static final void b(a aVar, PipCallbackActions pipCallbackActions) {
            h4t0 h4t0Var = h4t0.this;
            int i = C2972a.$EnumSwitchMapping$0[pipCallbackActions.ordinal()];
            if (i == 1) {
                yg5 yg5Var = h4t0Var.i;
                if (yg5Var != null) {
                    yg5Var.c();
                }
                dpa0 dpa0Var = h4t0Var.p;
                if (dpa0Var != null) {
                    dpa0Var.c(true);
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                h4t0Var.d.invoke(n3t0.a.a);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
            yg5 yg5Var2 = h4t0Var.i;
            if (yg5Var2 != null) {
                yg5Var2.f();
                s3q0 s3q0Var3 = s3q0.a;
            }
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
            h3(yg5Var, i, i2);
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            OneVideoPlayer a;
            dpa0 dpa0Var;
            d3b0 v0 = yg5Var.v0();
            if (v0 == null || (a = v0.a()) == null || (dpa0Var = h4t0.this.p) == null) {
                return;
            }
            dpa0Var.d(a);
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
            qh0 qh0Var;
            a.AbstractC1195a.b bVar = aVar instanceof a.AbstractC1195a.b ? (a.AbstractC1195a.b) aVar : null;
            if (bVar == null || (qh0Var = bVar.e) == null) {
                return;
            }
            float f = qh0Var.a;
            if (this.b) {
                AdBannerData.a aVar3 = bVar.d;
                if (f < aVar3.i || !aVar3.h) {
                    return;
                }
                this.b = false;
                dpa0 dpa0Var = h4t0.this.p;
                if (dpa0Var != null) {
                    dpa0Var.e(new i4t0(1, this, a.class, "adActionsCallback", "adActionsCallback(Lone/video/pip/PipCallbackActions;)Lkotlin/Unit;", 8), true);
                }
            }
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
            d3b0 v0;
            OneVideoPlayer a;
            dpa0 dpa0Var;
            h4t0 h4t0Var = h4t0.this;
            if (!h4t0Var.f || (v0 = yg5Var.v0()) == null || (a = v0.a()) == null || (dpa0Var = h4t0Var.p) == null) {
                return;
            }
            dpa0Var.d(a);
        }

        @Override // xsna.hnt0
        public final void j() {
            OneVideoPlayer oneVideoPlayer;
            dpa0 dpa0Var = h4t0.this.p;
            if (dpa0Var == null || !dpa0Var.a.isInPictureInPictureMode() || (oneVideoPlayer = dpa0Var.c) == null) {
                return;
            }
            kxi kxiVar = dpa0Var.d;
            kxiVar.b = false;
            kxiVar.c = false;
            dpa0Var.f(kxiVar.b(oneVideoPlayer, PlaybackStatus.PLAYING));
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
            dpa0 dpa0Var;
            h4t0 h4t0Var = h4t0.this;
            yg5 yg5Var = h4t0Var.i;
            if ((yg5Var == null || !yg5Var.isPaused()) && (dpa0Var = h4t0Var.p) != null) {
                dpa0Var.e(new b(1, this, a.class, "adActionsCallback", "adActionsCallback(Lone/video/pip/PipCallbackActions;)Lkotlin/Unit;", 8), false);
            }
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
            h4t0 h4t0Var = h4t0.this;
            if (h4t0Var.g) {
                h4t0Var.l.c();
            }
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        }
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }
}
