package xsna;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.live.DebugInfo;
import one.video.player.live.LivePlayerException;
import one.video.player.live.stream.LiveStreamSource;
import xsna.cms0;
import xsna.hzf0;
import xsna.oqg0;
import xsna.so4;
import xsna.wl80;

/* compiled from: OneVideoLivePlayer.java */
/* loaded from: classes8.dex */
public final class wl80 extends BaseVideoPlayer {
    public static final /* synthetic */ int b0 = 0;
    public final ku70 J;

    @NonNull
    public final Context K;
    public final Handler L;

    @Nullable
    public volatile a M;
    public boolean N;

    @Nullable
    public Surface O;
    public boolean P;

    @Nullable
    public Surface Q;
    public boolean R;
    public volatile boolean S;
    public volatile boolean T;
    public volatile boolean U;

    @Nullable
    public volatile cms0 V;

    @Nullable
    public volatile so4 W;

    @Nullable
    public cms0 X;

    @Nullable
    public one.video.player.tracks.c Y;

    @Nullable
    public one.video.player.tracks.a Z;

    @Nullable
    public volatile sht0 a0;

    /* compiled from: OneVideoLivePlayer.java */
    public class a extends qkz {
        public Uri v;

        public a(Context context, DebugInfo debugInfo) {
            super(context, debugInfo);
            this.v = null;
        }

        @Override // xsna.qkz
        public final void b(final boolean z) {
            BaseVideoPlayer.c(new gzs() { // from class: xsna.nl80
                @Override // xsna.gzs
                public final Object invoke() {
                    wl80.a aVar = wl80.a.this;
                    return "LivePlayerImpl.handleBuffering() - state= " + wl80.this.G + " buffering= " + z;
                }
            }, null);
            if (n()) {
                return;
            }
            wl80.v0(wl80.this, new Runnable() { // from class: xsna.ol80
                @Override // java.lang.Runnable
                public final void run() {
                    wl80.a aVar = wl80.a.this;
                    boolean z2 = z;
                    pl80 pl80Var = new pl80(aVar, z2, 0);
                    int i = wl80.b0;
                    BaseVideoPlayer.c(pl80Var, null);
                    if (aVar.o()) {
                        return;
                    }
                    int i2 = wl80.c.a[wl80.this.G.ordinal()];
                    if (i2 == 2) {
                        if (z2) {
                            return;
                        }
                        wl80.this.C0(OneVideoPlayer.State.PLAYING);
                        return;
                    }
                    if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6) {
                        if (z2) {
                            wl80 wl80Var = wl80.this;
                            wl80Var.F = null;
                            wl80Var.C0(OneVideoPlayer.State.BUFFERING);
                            return;
                        }
                        OneVideoPlayer.State state = wl80.this.G;
                        OneVideoPlayer.State state2 = OneVideoPlayer.State.PLAYING;
                        if (state != state2) {
                            wl80 wl80Var2 = wl80.this;
                            wl80Var2.F = null;
                            wl80Var2.C0(state2);
                        }
                    }
                }
            });
        }

        @Override // xsna.qkz
        public final void c(final int i) {
            BaseVideoPlayer.c(new w100(this, 17), null);
            if (n()) {
                return;
            }
            wl80.v0(wl80.this, new Runnable() { // from class: xsna.vl80
                @Override // java.lang.Runnable
                public final void run() {
                    wl80.a aVar = wl80.a.this;
                    wl80 wl80Var = wl80.this;
                    ubw ubwVar = new ubw(aVar, 18);
                    int i2 = wl80.b0;
                    BaseVideoPlayer.c(ubwVar, null);
                    if (aVar.o()) {
                        return;
                    }
                    wl80Var.F = new LivePlayerException(lhg.a(i, "LivePlayer error "));
                    wl80Var.C0(OneVideoPlayer.State.ERROR);
                }
            });
        }

        @Override // xsna.qkz
        public final void d() {
            if (n() || wl80.this.T) {
                return;
            }
            wl80 wl80Var = wl80.this;
            if (wl80Var.O == null || wl80Var.e != null) {
                return;
            }
            wl80.u0(wl80Var);
        }

        @Override // xsna.qkz
        public final void e(final int i, final int i2, final String str) {
            BaseVideoPlayer.c(new gzs() { // from class: xsna.ql80
                @Override // xsna.gzs
                public final Object invoke() {
                    wl80.a aVar = wl80.a.this;
                    String str2 = str;
                    int i3 = i;
                    int i4 = i2;
                    StringBuilder sb = new StringBuilder("LivePlayerImpl.handleInputAudioParamsUpdate() - state= ");
                    sb.append(wl80.this.G);
                    sb.append(" codecName= ");
                    sb.append(str2);
                    sb.append(" sampleRate= ");
                    return bd3.b(" channelsCount= ", i3, i4, sb);
                }
            }, null);
            if (n()) {
                return;
            }
            wl80.this.W = null;
            wl80.v0(wl80.this, new Runnable() { // from class: xsna.tl80
                @Override // java.lang.Runnable
                public final void run() {
                    final wl80.a aVar = wl80.a.this;
                    final String str2 = str;
                    final int i3 = i;
                    final int i4 = i2;
                    gzs gzsVar = new gzs() { // from class: xsna.ul80
                        @Override // xsna.gzs
                        public final Object invoke() {
                            wl80.a aVar2 = wl80.a.this;
                            String str3 = str2;
                            int i5 = i3;
                            int i6 = i4;
                            StringBuilder sb = new StringBuilder("LivePlayerImpl.handleInputAudioParamsUpdate() closure - state= ");
                            sb.append(wl80.this.G);
                            sb.append(" codecName= ");
                            sb.append(str3);
                            sb.append(" sampleRate= ");
                            return bd3.b(" channelsCount= ", i5, i6, sb);
                        }
                    };
                    int i5 = wl80.b0;
                    BaseVideoPlayer.c(gzsVar, null);
                    if (aVar.o()) {
                        return;
                    }
                    if (wl80.this.G == OneVideoPlayer.State.BUFFERING || wl80.this.G == OneVideoPlayer.State.PLAYING) {
                        wl80.t0(wl80.this);
                    }
                }
            });
        }

        @Override // xsna.qkz
        public final void f() {
            BaseVideoPlayer.c(new wp40(this, 8), null);
            if (n()) {
                return;
            }
            wl80.v0(wl80.this, new iv1(this, 10));
        }

        @Override // xsna.qkz
        public final void g(final int i, final int i2, final double d) {
            BaseVideoPlayer.c(new gzs() { // from class: xsna.rl80
                @Override // xsna.gzs
                public final Object invoke() {
                    wl80.a aVar = wl80.a.this;
                    return "LivePlayerImpl.handleVideoSizeUpdate() - state= " + wl80.this.G + " w= " + i + " h= " + i2 + " rotation= " + d;
                }
            }, null);
            if (n()) {
                return;
            }
            wl80.this.V = null;
            wl80.v0(wl80.this, new Runnable() { // from class: xsna.sl80
                @Override // java.lang.Runnable
                public final void run() {
                    final wl80.a aVar = wl80.a.this;
                    final int i3 = i;
                    final int i4 = i2;
                    final double d2 = d;
                    gzs gzsVar = new gzs() { // from class: xsna.ml80
                        @Override // xsna.gzs
                        public final Object invoke() {
                            wl80.a aVar2 = wl80.a.this;
                            return "LivePlayerImpl.handleVideoSizeUpdate() closure - state= " + wl80.this.G + " w= " + i3 + " h= " + i4 + " rotation= " + d2;
                        }
                    };
                    int i5 = wl80.b0;
                    BaseVideoPlayer.c(gzsVar, null);
                    if (aVar.o()) {
                        return;
                    }
                    if (wl80.this.G == OneVideoPlayer.State.BUFFERING || wl80.this.G == OneVideoPlayer.State.PLAYING) {
                        wl80.t0(wl80.this);
                    }
                }
            });
        }

        @Override // xsna.qkz
        public final void h(int i) {
            if (!n()) {
                wl80 wl80Var = wl80.this;
                if (!wl80Var.U) {
                    BaseVideoPlayer.c(new l500(wl80Var, 20), null);
                    wl80Var.U = true;
                    wl80Var.l.p(wl80Var);
                }
            }
            wl80 wl80Var2 = wl80.this;
            wl80Var2.n.a(wl80Var2, this.v, -1L, true, i);
        }

        @Override // xsna.qkz
        public final void i() {
            BaseVideoPlayer.c(new fm20(this, 10), null);
            if (n()) {
                return;
            }
            wl80.v0(wl80.this, new o1(this, 13));
        }

        @Override // xsna.qkz
        public final void j() {
            BaseVideoPlayer.c(new jz70(this, 2), null);
            wl80 wl80Var = wl80.this;
            wl80Var.n.d(wl80Var, this.v, -1L, true);
        }

        @Override // xsna.qkz
        public final void k() {
            BaseVideoPlayer.c(new cty(this, 20), null);
            sht0 sht0Var = wl80.this.a0;
            Uri uri = sht0Var != null ? sht0Var.b : null;
            this.v = uri;
            wl80 wl80Var = wl80.this;
            wl80Var.n.c(wl80Var, uri, -1L, true);
        }

        @Override // xsna.qkz
        public final void l() {
            BaseVideoPlayer.c(new p6y(this, 18), null);
            wl80 wl80Var = wl80.this;
            wl80Var.n.b(wl80Var, "rtmp", "0");
            wl80Var.n.e(wl80Var, this.v, -1L, true);
        }

        public final boolean n() {
            if (wl80.this.G == OneVideoPlayer.State.RELEASED) {
                BaseVideoPlayer.c(new fr20(this, 11), wl80.this.J);
                return true;
            }
            if (wl80.this.M == this) {
                return false;
            }
            BaseVideoPlayer.c(new z260(this, 6), wl80.this.J);
            return true;
        }

        public final boolean o() {
            wl80.this.getClass();
            return n();
        }
    }

    /* compiled from: OneVideoLivePlayer.java */
    public class b implements hzf0.a {
        public b() {
        }

        @Override // xsna.hzf0.a
        public final void a(@NonNull Surface surface) {
            wl80 wl80Var = wl80.this;
            wl80Var.Q = surface;
            a aVar = wl80Var.M;
            BaseVideoPlayer.c(new wo1(12, surface, aVar), null);
            if (aVar != null) {
                aVar.m(surface);
            }
        }

        @Override // xsna.hzf0.a
        public final void b(long j) {
            a aVar = wl80.this.M;
            if ((aVar != null ? aVar.t : null) != null) {
                System.nanoTime();
            }
        }

        @Override // xsna.hzf0.a
        public final void onRenderedFirstFrame() {
            BaseVideoPlayer.d(null);
            wl80.u0(wl80.this);
        }
    }

    /* compiled from: OneVideoLivePlayer.java */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OneVideoPlayer.State.values().length];
            a = iArr;
            try {
                iArr[OneVideoPlayer.State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[OneVideoPlayer.State.BUFFERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[OneVideoPlayer.State.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[OneVideoPlayer.State.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[OneVideoPlayer.State.ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[OneVideoPlayer.State.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[OneVideoPlayer.State.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public wl80(@NonNull Context context, boolean z) {
        super(true, z);
        ku70 ku70Var = new ku70(2);
        this.J = ku70Var;
        this.L = new Handler(Looper.getMainLooper());
        this.N = false;
        this.P = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.a0 = null;
        BaseVideoPlayer.c(new sy50(this, 5), null);
        this.K = context;
        if (!wn80.h) {
            Objects.toString(OneVideoPlayer.State.IDLE);
            ku70Var.invoke();
        } else if (wn80.q) {
            Objects.toString(OneVideoPlayer.State.IDLE);
            ku70Var.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r2.g == r4.g) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t0(wl80 wl80Var) {
        one.video.player.j jVar = wl80Var.l;
        ku70 ku70Var = wl80Var.J;
        cms0 x0 = wl80Var.x0();
        if (x0 != null) {
            one.video.player.tracks.c E = wl80Var.E();
            if (E == null) {
                BaseVideoPlayer.d(ku70Var);
            } else {
                int i = x0.e;
                int i2 = x0.f;
                cms0 cms0Var = wl80Var.X;
                one.video.player.tracks.c cVar = wl80Var.Y;
                if (cms0Var == null || cms0Var.e != i || cms0Var.f != i2) {
                    wl80Var.X = x0;
                }
                if (cVar != null) {
                    cms0 cms0Var2 = (cms0) cVar.c;
                    cms0 cms0Var3 = (cms0) E.c;
                    if (Objects.equals(cVar.b, E.b)) {
                        if (cms0Var2.e == cms0Var3.e) {
                            if (cms0Var2.f == cms0Var3.f) {
                                if (cms0Var2.b() == cms0Var3.b()) {
                                    if (cms0Var2.c() == cms0Var3.c()) {
                                    }
                                }
                            }
                        }
                    }
                }
                wl80Var.Y = E;
                jVar.e(wl80Var, E);
            }
        }
        one.video.player.tracks.a M = wl80Var.M();
        if (M == null) {
            BaseVideoPlayer.d(ku70Var);
            return;
        }
        one.video.player.tracks.a aVar = wl80Var.Z;
        if (aVar != null) {
            so4 so4Var = (so4) aVar.c;
            so4 so4Var2 = (so4) M.c;
            if (so4Var.e == so4Var2.e && so4Var.f == so4Var2.f && Objects.equals(so4Var.g, so4Var2.g) && Objects.equals(so4Var.h, so4Var2.h)) {
                return;
            }
        }
        wl80Var.Z = M;
        jVar.t(wl80Var, M);
    }

    public static void u0(wl80 wl80Var) {
        BaseVideoPlayer.c(new nuv(wl80Var, 18), wl80Var.J);
        if (wl80Var.T) {
            return;
        }
        wl80Var.T = true;
        if (wl80Var.M != null) {
            if (wl80Var.G == OneVideoPlayer.State.PLAYING || wl80Var.G == OneVideoPlayer.State.BUFFERING) {
                wl80Var.l.x(wl80Var);
            }
        }
    }

    public static void v0(wl80 wl80Var, Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            wl80Var.L.post(runnable);
        }
    }

    public static String w0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            if (!str.isEmpty() && str2 != null && !str2.isEmpty() && !str.endsWith("\n") && !str2.startsWith("\n")) {
                sb.append("\n");
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public final boolean A0(boolean z) {
        boolean z2;
        int i = c.a[this.G.ordinal()];
        if (i == 2 || i == 3 || i == 4) {
            z2 = true;
        } else {
            z2 = false;
            if (i == 7) {
                return false;
            }
        }
        this.F = null;
        if (this.M != null) {
            this.M.getClass();
            a aVar = this.M;
            Handler handler = aVar.o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            pkz pkzVar = aVar.b;
            if (pkzVar != null) {
                pkzVar.g = true;
            }
            Handler handler2 = aVar.o;
            if (handler2 != null) {
                handler2.post(new po4(aVar, 3));
            }
            this.M = null;
        }
        C0(OneVideoPlayer.State.IDLE);
        if (z2 && z) {
            this.l.f(this);
        }
        return true;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void B(@NonNull rt4 rt4Var) {
        BaseVideoPlayer.d(null);
    }

    public final boolean B0() {
        OneVideoPlayer.State state = this.G;
        return state == OneVideoPlayer.State.BUFFERING || state == OneVideoPlayer.State.PLAYING;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void C0(OneVideoPlayer.State state) {
        boolean z;
        OneVideoPlayer.State state2 = this.G;
        if (state2 != state) {
            boolean z2 = B0() || OneVideoPlayer.State.PAUSED == this.G;
            boolean B0 = B0();
            BaseVideoPlayer.c(new com.vk.movika.sdk.base.presenter.c(20, state2, state), this.J);
            s0(state, getError());
            if (state != OneVideoPlayer.State.IDLE && !B0() && OneVideoPlayer.State.PAUSED != this.G && z2) {
                this.W = null;
                this.V = null;
            }
            boolean z3 = B0 != B0();
            boolean z4 = z3 && this.R;
            if (z3 && !z4) {
                this.l.b(this, !B0);
            }
            switch (c.a[state.ordinal()]) {
                case 2:
                    this.l.v(this);
                    z = false;
                    break;
                case 3:
                    this.l.s(this);
                    if (this.R) {
                        this.R = false;
                        this.l.j(this);
                    }
                    this.l.y(this, true);
                    z = false;
                    break;
                case 4:
                    this.R = false;
                    this.l.r(this);
                    z = true;
                    break;
                case 5:
                    this.R = false;
                    this.l.h(this);
                    z = true;
                    break;
                case 6:
                    this.R = false;
                    z = true;
                    break;
                case 7:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z4) {
                this.l.b(this, !B0);
            }
            if (state2 == OneVideoPlayer.State.PLAYING) {
                this.l.y(this, false);
            }
            if (state == OneVideoPlayer.State.ERROR) {
                this.l.q(getError(), this.a0, this);
            }
            if (!z || this.M == null) {
                return;
            }
            this.M.getClass();
            a aVar = this.M;
            Handler handler = aVar.o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            pkz pkzVar = aVar.b;
            if (pkzVar != null) {
                pkzVar.g = true;
            }
            Handler handler2 = aVar.o;
            if (handler2 != null) {
                handler2.post(new po4(aVar, 3));
            }
            this.M = null;
        }
    }

    public final void D0() {
        Surface surface = this.O;
        a aVar = this.M;
        hzf0 hzf0Var = this.e;
        if (hzf0Var == null) {
            if (aVar != null) {
                aVar.m(surface);
            }
        } else if (this.P) {
            hzf0Var.h(this, surface);
            Surface surface2 = this.Q;
            if (aVar != null) {
                aVar.m(surface2);
            }
        }
    }

    @Override // one.video.player.OneVideoPlayer
    @Nullable
    public final one.video.player.tracks.c E() {
        String str;
        cms0 x0 = x0();
        if (x0 == null || (str = x0.a) == null) {
            str = "";
        }
        if (x0 != null) {
            return new one.video.player.tracks.c(str, x0, true);
        }
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    @NonNull
    public final List<one.video.player.tracks.a> F() {
        one.video.player.tracks.a M = M();
        if (M == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{M}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0090  */
    @Override // one.video.player.OneVideoPlayer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final one.video.player.tracks.a M() {
        so4 a2;
        MediaFormat g;
        oqg0.b bVar;
        a aVar = this.M;
        if (aVar != null) {
            k kVar = aVar.e;
            MediaFormat g2 = kVar != null ? kVar.g() : null;
            if (g2 != null) {
                int integer = g2.containsKey("sample-rate") ? g2.getInteger("sample-rate") : -1;
                int integer2 = g2.containsKey("channel-count") ? g2.getInteger("channel-count") : -1;
                a aVar2 = this.M;
                long j = -1;
                if (aVar2.b != null && (bVar = aVar2.b.d) != null) {
                    j = (long) bVar.y.c;
                }
                long j2 = (int) j;
                so4.a aVar3 = new so4.a();
                k kVar2 = aVar.e;
                aVar3.c = kVar2 != null ? kVar2.h() : null;
                k kVar3 = aVar.e;
                aVar3.b = (kVar3 == null || (g = kVar3.g()) == null) ? null : g.getString("mime");
                aVar3.e = integer;
                aVar3.f = integer2;
                aVar3.d = j2 >= 0 ? (int) j2 : -1;
                a2 = aVar3.a();
                if (a2 != null) {
                    BaseVideoPlayer.c(new flu(this, 26), null);
                    a2 = this.W;
                } else {
                    this.W = a2;
                }
                if (a2 == null) {
                    return new one.video.player.tracks.a("", a2);
                }
                return null;
            }
        }
        a2 = null;
        if (a2 != null) {
        }
        if (a2 == null) {
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean O() {
        return this.G != OneVideoPlayer.State.IDLE;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void V(boolean z) {
        boolean z2 = wn80.h;
        ku70 ku70Var = this.J;
        if (!z2) {
            if (ku70Var != null) {
                ku70Var.invoke();
            }
        } else {
            if (!wn80.q || ku70Var == null) {
                return;
            }
            ku70Var.invoke();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final long Z() {
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final long a() {
        pkz pkzVar;
        a aVar = this.M;
        if (aVar == null || (pkzVar = aVar.b) == null) {
            return 0L;
        }
        return Math.max(pkzVar.e.d() + pkzVar.d(), pkzVar.f.d());
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean canPause() {
        return this.a;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void clearVideoSurface() {
        this.O = null;
        this.T = false;
        D0();
    }

    @Override // one.video.player.OneVideoPlayer
    public final void e() {
        BaseVideoPlayer.d(this.J);
        if (c.a[this.G.ordinal()] == 6 && A0(false)) {
            z0();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void e0(@NonNull rt4 rt4Var) {
        BaseVideoPlayer.d(null);
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean f0() {
        return B0();
    }

    @Override // one.video.player.OneVideoPlayer
    public final int getBufferedPercentage() {
        return 0;
    }

    @Override // one.video.player.OneVideoPlayer
    public final long getCurrentPosition() {
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final long getDuration() {
        return 0L;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void h0(@NonNull deb0 deb0Var) {
        boolean z = wn80.h;
        ku70 ku70Var = this.J;
        if (!z) {
            Objects.toString(deb0Var);
            if (ku70Var != null) {
                ku70Var.invoke();
                return;
            }
            return;
        }
        if (wn80.q) {
            Objects.toString(deb0Var);
            if (ku70Var != null) {
                ku70Var.invoke();
            }
        }
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    @NonNull
    public final String i0() {
        String w0 = w0(super.i0(), "State: " + this.G);
        a aVar = this.M;
        DebugInfo debugInfo = aVar != null ? aVar.t : null;
        return debugInfo != null ? w0(w0, debugInfo.toString()) : w0;
    }

    @Override // one.video.player.OneVideoPlayer
    @Nullable
    public final sht0 j() {
        return this.a0;
    }

    @Override // one.video.player.OneVideoPlayer
    @NonNull
    public final List<one.video.player.tracks.c> k0() {
        one.video.player.tracks.c E = E();
        if (E == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{E}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // one.video.player.OneVideoPlayer
    public final long l0() {
        return System.currentTimeMillis() - 1100;
    }

    @Override // one.video.player.OneVideoPlayer
    public final int m0() {
        return 0;
    }

    @Override // one.video.player.BaseVideoPlayer
    @Nullable
    public final Float n(float f) {
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f));
        a aVar = this.M;
        if (aVar == null) {
            return null;
        }
        if (aVar.s != max) {
            aVar.s = max;
            Handler handler = aVar.o;
            if (handler != null) {
                handler.post(new nkz(aVar, max));
            }
        }
        return Float.valueOf(aVar.s);
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean p() {
        return this.T;
    }

    @Override // one.video.player.OneVideoPlayer
    public final void pause() {
        BaseVideoPlayer.d(this.J);
        int i = c.a[this.G.ordinal()];
        if (i == 2 || i == 3) {
            C0(OneVideoPlayer.State.PAUSED);
        }
    }

    @Override // one.video.player.BaseVideoPlayer
    public final void r0(@NonNull y6b0 y6b0Var, @NonNull deb0 deb0Var, boolean z) {
        BaseVideoPlayer.c(new fcj(y6b0Var, deb0Var, z, 2), this.J);
        if (this.G != OneVideoPlayer.State.RELEASED && A0(true)) {
            y0();
            this.a0 = y6b0Var.a(deb0Var.a);
            if (z) {
                z0();
                return;
            }
            this.l.w(this);
            C0(OneVideoPlayer.State.BUFFERING);
            C0(OneVideoPlayer.State.PAUSED);
        }
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void release() {
        BaseVideoPlayer.d(this.J);
        A0(true);
        OneVideoPlayer.State state = this.G;
        OneVideoPlayer.State state2 = OneVideoPlayer.State.RELEASED;
        if (state != state2) {
            this.L.removeCallbacksAndMessages(null);
            this.l.b.clear();
            this.n.a.clear();
            this.m.clear();
            this.o.a.clear();
            this.p.clear();
            y0();
            if (this.P) {
                this.e.b(this);
                this.P = false;
            }
            this.Q = null;
            super.release();
            C0(state2);
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void resume() {
        BaseVideoPlayer.d(this.J);
        if (c.a[this.G.ordinal()] == 4 && A0(false)) {
            this.R = true;
            z0();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void seekTo(long j) {
        boolean z = wn80.h;
        ku70 ku70Var = this.J;
        if (!z) {
            if (ku70Var != null) {
                ku70Var.invoke();
            }
        } else {
            if (!wn80.q || ku70Var == null) {
                return;
            }
            ku70Var.invoke();
        }
    }

    @Override // one.video.player.OneVideoPlayer
    public final void setVideoSurface(@NonNull Surface surface) {
        BaseVideoPlayer.d(this.J);
        this.T = this.T && this.O == surface;
        this.O = surface;
        D0();
    }

    @Override // one.video.player.BaseVideoPlayer, one.video.player.OneVideoPlayer
    public final void stop() {
        BaseVideoPlayer.d(this.J);
        A0(true);
        y0();
        super.stop();
    }

    @Override // one.video.player.OneVideoPlayer
    @Nullable
    public final Long u() {
        return null;
    }

    @Override // one.video.player.OneVideoPlayer
    public final boolean w() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a2  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cms0 x0() {
        cms0 a2;
        MediaFormat g;
        oqg0.b bVar;
        a aVar = this.M;
        if (aVar != null) {
            okz okzVar = aVar.d;
            MediaFormat g2 = okzVar != null ? okzVar.g() : null;
            if (g2 != null) {
                int integer = g2.containsKey("width") ? g2.getInteger("width") : -1;
                int integer2 = g2.containsKey("height") ? g2.getInteger("height") : -1;
                float f = -1.0f;
                if (g2.containsKey("frame-rate")) {
                    AtomicInteger atomicInteger = DebugInfo.R;
                    try {
                        try {
                            f = g2.getFloat("frame-rate");
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        f = g2.getInteger("frame-rate");
                    }
                }
                long j = -1;
                if (aVar.b != null && (bVar = aVar.b.d) != null) {
                    j = (long) bVar.z.c;
                }
                long j2 = (int) j;
                cms0.a aVar2 = new cms0.a();
                okz okzVar2 = aVar.d;
                aVar2.c = okzVar2 != null ? okzVar2.h() : null;
                okz okzVar3 = aVar.d;
                aVar2.b = (okzVar3 == null || (g = okzVar3.g()) == null) ? null : g.getString("mime");
                aVar2.e = integer;
                aVar2.f = integer2;
                aVar2.g = f;
                aVar2.d = j2 >= 0 ? (int) j2 : -1;
                a2 = aVar2.a();
                if (a2 != null) {
                    BaseVideoPlayer.c(new os30(this, 11), null);
                    return this.V;
                }
                this.V = a2;
                return a2;
            }
        }
        a2 = null;
        if (a2 != null) {
        }
    }

    public final void y0() {
        this.U = false;
        this.R = false;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.W = null;
        this.V = null;
        this.a0 = null;
    }

    public final void z0() {
        int i = c.a[this.G.ordinal()];
        if (i == 2 || i == 3 || i == 7) {
            return;
        }
        boolean z = this.R;
        if (A0(!z)) {
            this.F = null;
            this.M = new a(this.K, this.N ? new DebugInfo() : null);
            BaseVideoPlayer.c(new r010(this, 15), null);
            hzf0 hzf0Var = this.e;
            if (hzf0Var != null) {
                if (!this.P) {
                    hzf0Var.a(this, new b(), this.L);
                    this.P = true;
                }
                hzf0Var.f(this);
            }
            a aVar = this.M;
            float f = this.A;
            aVar.s = f;
            Handler handler = aVar.o;
            if (handler != null) {
                handler.post(new nkz(aVar, f));
            }
            if (!z) {
                this.S = false;
                this.T = false;
            }
            D0();
            if (!z) {
                this.l.w(this);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new LiveStreamSource(this.a0.b.toString(), 0L, false));
            a aVar2 = this.M;
            aVar2.getClass();
            HandlerThread handlerThread = new HandlerThread("RtmpPlayerThread", -16);
            aVar2.c = handlerThread;
            handlerThread.start();
            Handler handler2 = new Handler(aVar2.c.getLooper());
            aVar2.o = handler2;
            handler2.post(new w9j(3, aVar2, arrayList));
            C0(OneVideoPlayer.State.BUFFERING);
        }
    }
}
