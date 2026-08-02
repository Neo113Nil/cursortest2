package androidx.camera.video;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.c;
import androidx.camera.video.g;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.d;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.j;
import androidx.concurrent.futures.b;
import defpackage.ar7;
import defpackage.b84;
import defpackage.bzn;
import defpackage.c84;
import defpackage.d6z;
import defpackage.d7g0;
import defpackage.d94;
import defpackage.dn31;
import defpackage.dq60;
import defpackage.dy31;
import defpackage.el7;
import defpackage.en31;
import defpackage.evu0;
import defpackage.fh3;
import defpackage.fq6;
import defpackage.fzn;
import defpackage.geb1;
import defpackage.gii0;
import defpackage.gl7;
import defpackage.gn31;
import defpackage.gq60;
import defpackage.h94;
import defpackage.hc;
import defpackage.hn31;
import defpackage.hq6;
import defpackage.hsj0;
import defpackage.i94;
import defpackage.is7;
import defpackage.j34;
import defpackage.j94;
import defpackage.jx81;
import defpackage.jzn;
import defpackage.k34;
import defpackage.k74;
import defpackage.k9b;
import defpackage.kf3;
import defpackage.kgg0;
import defpackage.l34;
import defpackage.lf3;
import defpackage.lg;
import defpackage.lm31;
import defpackage.lry;
import defpackage.m34;
import defpackage.mq61;
import defpackage.myw;
import defpackage.n28;
import defpackage.n34;
import defpackage.n74;
import defpackage.ni91;
import defpackage.nii0;
import defpackage.ny61;
import defpackage.o34;
import defpackage.oii0;
import defpackage.oyn;
import defpackage.pii0;
import defpackage.q8n;
import defpackage.qgg0;
import defpackage.qo31;
import defpackage.qz40;
import defpackage.r0r;
import defpackage.r64;
import defpackage.sbj;
import defpackage.sgb1;
import defpackage.sue0;
import defpackage.syn;
import defpackage.tgb1;
import defpackage.vbj;
import defpackage.vjs0;
import defpackage.w84;
import defpackage.x4e;
import defpackage.xmf0;
import defpackage.xnw0;
import defpackage.yci0;
import defpackage.yg3;
import defpackage.yj70;
import defpackage.yk31;
import defpackage.yno;
import defpackage.zg3;
import defpackage.znw0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class g implements lm31 {
    public static final Set n0 = Collections.unmodifiableSet(EnumSet.of(Recorder$State.PENDING_RECORDING, Recorder$State.PENDING_PAUSED));
    public static final Set o0 = Collections.unmodifiableSet(EnumSet.of(Recorder$State.CONFIGURING, Recorder$State.IDLING, Recorder$State.RESETTING, Recorder$State.STOPPING, Recorder$State.ERROR));
    public static final qgg0 p0;
    public static final i94 q0;
    public static final k74 r0;
    public static final RuntimeException s0;
    public static final d7g0 t0;
    public static final d7g0 u0;
    public static final androidx.camera.core.impl.utils.executor.b v0;
    public static final int w0;
    public static final long x0;
    public Timebase A;
    public Surface B;
    public Surface C;
    public MediaMuxer D;
    public final qz40 E;
    public androidx.camera.video.internal.audio.d F;
    public androidx.camera.video.internal.encoder.j G;
    public androidx.camera.video.internal.encoder.h H;
    public androidx.camera.video.internal.encoder.j I;
    public androidx.camera.video.internal.encoder.h J;
    public Recorder$AudioState K;
    public Uri L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public int V;
    public Throwable W;
    public oyn X;
    public final lg Y;
    public Throwable Z;
    public final qz40 a;
    public boolean a0;
    public final qz40 b;
    public VideoOutput$SourceState b0;
    public final Executor c;
    public ScheduledFuture c0;
    public final androidx.camera.core.impl.utils.executor.b d;
    public boolean d0;
    public final d7g0 e;
    public k e0;
    public final d7g0 f;
    public d94 f0;
    public final d7g0 g;
    public k g0;
    public final Object h = new Object();
    public double h0;
    public final boolean i;
    public boolean i0;
    public final long j;
    public oii0 j0;
    public final qz40 k;
    public yj70 k0;
    public Recorder$State l;
    public long l0;
    public Recorder$State m;
    public boolean m0;
    public int n;
    public b84 o;
    public b84 p;
    public long q;
    public b84 r;
    public boolean s;
    public xnw0 t;
    public xnw0 u;
    public qo31 v;
    public final ArrayList w;
    public Integer x;
    public Integer y;
    public znw0 z;

    static {
        qgg0 qgg0Var = i94.f;
        p0 = qgg0Var;
        if (qgg0Var == null) {
            ny61.t("Null qualitySelector");
            return;
        }
        Range range = i94.e;
        if (range == null) {
            ny61.t("Null bitrate");
            return;
        }
        if (qgg0Var == null) {
            ny61.t("Null qualitySelector");
            return;
        }
        i94 i94Var = new i94(qgg0Var, 0, range, -1);
        q0 = i94Var;
        n34 c = n34.a().c();
        if (qgg0Var == null) {
            ny61.t("Null qualitySelector");
            return;
        }
        if (range == null) {
            ny61.t("Null bitrate");
            return;
        }
        r0 = new k74(i94Var, c, -1);
        s0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        t0 = new d7g0(4);
        u0 = new d7g0(5);
        v0 = new androidx.camera.core.impl.utils.executor.b(geb1.d());
        w0 = 3;
        x0 = 1000L;
    }

    public g(k74 k74Var, d7g0 d7g0Var, d7g0 d7g0Var2, d7g0 d7g0Var3, long j) {
        this.i = vbj.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = new qz40(null);
        this.l = Recorder$State.CONFIGURING;
        this.m = null;
        this.n = 0;
        this.o = null;
        this.p = null;
        this.q = 0L;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = new ArrayList();
        this.x = null;
        this.y = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = Recorder$AudioState.INITIALIZING;
        this.L = Uri.EMPTY;
        this.M = 0L;
        this.N = 0L;
        this.O = 0L;
        this.P = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.Q = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.R = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.S = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.T = 0L;
        this.U = 0L;
        this.V = 1;
        this.W = null;
        this.X = null;
        this.Y = new lg(60, (dy31) null);
        this.Z = null;
        this.a0 = false;
        this.b0 = VideoOutput$SourceState.INACTIVE;
        this.c0 = null;
        this.d0 = false;
        this.f0 = null;
        this.g0 = null;
        this.h0 = 0.0d;
        this.i0 = false;
        this.j0 = null;
        this.k0 = null;
        this.l0 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.m0 = false;
        myw d = geb1.d();
        this.c = d;
        androidx.camera.core.impl.utils.executor.b bVar = new androidx.camera.core.impl.utils.executor.b(d);
        this.d = bVar;
        i94 i94Var = k74Var.a;
        n34 n34Var = k74Var.b;
        int i = k74Var.c;
        if (k74Var.a.d == -1) {
            sbj sbjVar = new sbj(5);
            if (i94Var == null) {
                ny61.r("Property \"videoSpec\" has not been set");
                throw null;
            }
            h94 h94Var = new h94();
            h94Var.a = i94Var.a;
            h94Var.b = Integer.valueOf(i94Var.b);
            h94Var.c = i94Var.c;
            h94Var.d = Integer.valueOf(i94Var.d);
            sbjVar.accept(h94Var);
            String str = h94Var.a == null ? " qualitySelector" : "";
            str = h94Var.b == null ? str.concat(" encodeFrameRate") : str;
            str = h94Var.c == null ? str.concat(" bitrate") : str;
            str = h94Var.d == null ? str.concat(" aspectRatio") : str;
            if (str.isEmpty()) {
                i94Var = new i94(h94Var.a, h94Var.b.intValue(), h94Var.c, h94Var.d.intValue());
            } else {
                ny61.r("Missing required properties:".concat(str));
                i94Var = null;
            }
        }
        String str2 = i94Var == null ? " videoSpec" : "";
        str2 = n34Var == null ? str2.concat(" audioSpec") : str2;
        if (!str2.isEmpty()) {
            ny61.r("Missing required properties:".concat(str2));
            throw null;
        }
        this.E = new qz40(new k74(i94Var, n34Var, i));
        this.a = new qz40(new a(this.n, m(this.l), null));
        this.b = new qz40(Boolean.FALSE);
        this.e = d7g0Var;
        this.f = d7g0Var2;
        this.g = d7g0Var3;
        this.e0 = new k(d7g0Var, bVar, d);
        long j2 = j != -1 ? j : 52428800L;
        this.j = j2;
        tgb1.b(j2);
        sgb1.g(3, "Recorder");
    }

    public static Object l(qz40 qz40Var) {
        try {
            return qz40Var.c().get();
        } catch (InterruptedException | ExecutionException e) {
            ny61.o(e);
            return null;
        }
    }

    public static StreamInfo$StreamState m(Recorder$State recorder$State) {
        return (recorder$State == Recorder$State.RECORDING || (recorder$State == Recorder$State.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) vbj.a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo$StreamState.ACTIVE : StreamInfo$StreamState.INACTIVE;
    }

    public static boolean p(h hVar, b84 b84Var) {
        return b84Var != null && hVar.c == b84Var.F;
    }

    public static void r(androidx.camera.video.internal.encoder.j jVar) {
        if (jVar != null) {
            sgb1.g(3, jVar.a);
            jVar.i.execute(new bzn(jVar, 0));
        }
    }

    public final void A(xnw0 xnw0Var) {
        Objects.toString(xnw0Var);
        sgb1.g(3, "Recorder");
        this.t = xnw0Var;
        synchronized (this.h) {
            this.a.t(new a(this.n, m(this.l), xnw0Var));
        }
    }

    public final void B(Surface surface) {
        int hashCode;
        if (this.B == surface) {
            return;
        }
        this.B = surface;
        synchronized (this.h) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            D(hashCode);
        }
    }

    public final void C(Recorder$State recorder$State) {
        Recorder$State recorder$State2 = this.l;
        if (recorder$State2 == recorder$State) {
            throw new AssertionError("Attempted to transition to state " + recorder$State + ", but Recorder is already in state " + recorder$State);
        }
        Objects.toString(recorder$State2);
        Objects.toString(recorder$State);
        sgb1.g(3, "Recorder");
        Set set = n0;
        StreamInfo$StreamState streamInfo$StreamState = null;
        if (set.contains(recorder$State)) {
            if (!set.contains(this.l)) {
                boolean contains = o0.contains(this.l);
                Recorder$State recorder$State3 = this.l;
                if (!contains) {
                    d7g0.j(recorder$State3, "Invalid state transition. Should not be transitioning to a PENDING state from state ");
                    return;
                } else {
                    this.m = recorder$State3;
                    streamInfo$StreamState = m(recorder$State3);
                }
            }
        } else if (this.m != null) {
            this.m = null;
        }
        this.l = recorder$State;
        if (streamInfo$StreamState == null) {
            streamInfo$StreamState = m(recorder$State);
        }
        this.a.t(new a(this.n, streamInfo$StreamState, this.t));
    }

    public final void D(int i) {
        if (this.n == i) {
            return;
        }
        sgb1.g(3, "Recorder");
        this.n = i;
        this.a.t(new a(i, m(this.l), this.t));
    }

    public final void E(b84 b84Var) {
        String message;
        if (this.D != null) {
            ny61.f("Unable to set up media muxer when one already exists.");
            return;
        }
        boolean n = n();
        lg lgVar = this.Y;
        if (n && lgVar.f()) {
            ny61.f("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
            return;
        }
        oyn oynVar = this.X;
        if (oynVar == null) {
            ny61.f("Media muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            this.X = null;
            long V = oynVar.V();
            ArrayList arrayList = new ArrayList();
            while (!lgVar.f()) {
                oyn oynVar2 = (oyn) lgVar.b();
                if (oynVar2.V() >= V) {
                    arrayList.add(oynVar2);
                }
            }
            long size = oynVar.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                size += ((oyn) it.next()).size();
            }
            long j = this.T;
            int i = 2;
            int i2 = 3;
            if (j != 0 && size > j) {
                String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.T));
                sgb1.g(3, "Recorder");
                s(b84Var, 2, null);
                oynVar.close();
                return;
            }
            try {
                int i3 = ((k74) l(this.E)).c;
                if (i3 == -1) {
                    qo31 qo31Var = this.v;
                    int i4 = r0.c != 1 ? 0 : 1;
                    if (qo31Var != null) {
                        int i5 = ((j94) qo31Var).b;
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 9) {
                                }
                                i = 1;
                            }
                            i = 0;
                        }
                    }
                    i = i4;
                } else {
                    if (i3 != 1) {
                        i = 0;
                    }
                    i = 1;
                }
                MediaMuxer e = b84Var.e(i, new k9b(13, this));
                xnw0 xnw0Var = this.u;
                if (xnw0Var != null) {
                    A(xnw0Var);
                    e.setOrientationHint(((w84) xnw0Var).b);
                }
                r64 r64Var = b84Var.A.a;
                this.y = Integer.valueOf(e.addTrack(this.H.a()));
                if (n()) {
                    this.x = Integer.valueOf(e.addTrack(this.J.a()));
                }
                try {
                    e.start();
                    this.D = e;
                    M(oynVar, b84Var);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        L((oyn) it2.next(), b84Var);
                    }
                    oynVar.close();
                } catch (IllegalStateException e2) {
                    yj70 yj70Var = this.k0;
                    yj70Var.getClass();
                    if (yj70Var.e() >= this.j) {
                        i2 = 1;
                    }
                    s(b84Var, i2, e2);
                    oynVar.close();
                }
            } catch (IOException e3) {
                if (!(e3 instanceof FileNotFoundException) || (message = e3.getMessage()) == null || !evu0.y(message, "No space left on device", false)) {
                    i2 = 5;
                }
                s(b84Var, i2, e3);
                oynVar.close();
            }
        } catch (Throwable th) {
            try {
                oynVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(b84 b84Var) {
        jzn jznVar;
        k74 k74Var = (k74) l(this.E);
        qo31 qo31Var = this.v;
        int i = k74Var.c;
        String str = i != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i2 = (i != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (qo31Var != null && qo31Var.e() != null) {
            jznVar = qo31Var.e();
            String d = jznVar.d();
            int e = jznVar.e();
            if (!Objects.equals(d, "audio/none")) {
                if (i == -1) {
                    sgb1.g(3, "AudioConfigUtil");
                    str = d;
                    i2 = e;
                } else if (str.equals(d) && i2 == e) {
                    sgb1.g(3, "AudioConfigUtil");
                    str = d;
                } else {
                    sgb1.g(3, "AudioConfigUtil");
                }
                k34 k34Var = new k34();
                if (str != null) {
                    ny61.t("Null mimeType");
                    return;
                }
                k34Var.a = str;
                k34Var.b = -1;
                k34Var.b = Integer.valueOf(i2);
                if (jznVar != null) {
                    k34Var.c = jznVar;
                }
                String str2 = k34Var.a == null ? " mimeType" : "";
                if (!str2.isEmpty()) {
                    ny61.r("Missing required properties:".concat(str2));
                    return;
                }
                l34 l34Var = new l34(k34Var.a, k34Var.b.intValue(), k34Var.c);
                Timebase timebase = Timebase.UPTIME;
                d94 d94Var = this.f0;
                d94Var.getClass();
                int i3 = d94Var.h;
                int i4 = d94Var.g;
                Rational rational = i4 != i3 ? new Rational(i4, i3) : null;
                n34 n34Var = k74Var.b;
                jzn jznVar2 = l34Var.c;
                m34 m34Var = (m34) (jznVar2 != null ? new yg3(n34Var, jznVar2, rational) : new zg3(n34Var, rational)).get();
                if (this.F != null) {
                    u();
                }
                if (!b84Var.D) {
                    d7g0.j(b84Var, "Recording does not have audio enabled. Unable to create audio source for recording ");
                    return;
                }
                nii0 nii0Var = (nii0) b84Var.w.getAndSet(null);
                if (nii0Var == null) {
                    d7g0.j(b84Var, "One-time audio source creation has already occurred for recording ");
                    return;
                }
                androidx.camera.video.internal.audio.d a = nii0Var.a(m34Var, v0);
                this.F = a;
                String.format("Set up new audio source: 0x%x", Integer.valueOf(a.hashCode()));
                sgb1.g(3, "Recorder");
                n34 n34Var2 = k74Var.b;
                String str3 = l34Var.a;
                j34 j34Var = (j34) (jznVar2 != null ? new kf3(str3, l34Var.b, timebase, n34Var2, m34Var, jznVar2) : new lf3(str3, l34Var.b, timebase, n34Var2, m34Var)).get();
                znw0 znw0Var = this.z;
                znw0Var.getClass();
                int i5 = znw0Var.g;
                this.f.getClass();
                androidx.camera.video.internal.encoder.j jVar = new androidx.camera.video.internal.encoder.j(this.c, j34Var, i5);
                this.I = jVar;
                syn synVar = jVar.g;
                if (!(synVar instanceof fzn)) {
                    ny61.f("The EncoderInput of audio isn't a ByteBufferInput.");
                    return;
                } else {
                    androidx.camera.video.internal.audio.d dVar = this.F;
                    dVar.a.execute(new hc(27, dVar, (fzn) synVar));
                    return;
                }
            }
            sgb1.g(3, "AudioConfigUtil");
        }
        jznVar = null;
        k34 k34Var2 = new k34();
        if (str != null) {
        }
    }

    public final void G(b84 b84Var, boolean z) {
        if (this.r != null) {
            ny61.f("Attempted to start a new recording while another was in progress.");
            return;
        }
        this.r = b84Var;
        r0r r0rVar = b84Var.A;
        boolean z2 = b84Var.D;
        this.g.getClass();
        yj70 yj70Var = new yj70(r0rVar);
        this.k0 = yj70Var;
        long e = yj70Var.e();
        tgb1.b(e);
        sgb1.g(3, "Recorder");
        long j = this.j;
        if (e < j) {
            i(3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(e), Long.valueOf(j))));
        } else {
            this.l0 = e - j;
            long j2 = r0rVar.a.a;
            if (j2 > 0) {
                this.T = Math.round(j2 * 0.95d);
                sgb1.g(3, "Recorder");
            } else {
                this.T = 0L;
            }
            long j3 = r0rVar.a.b;
            if (j3 > 0) {
                this.U = TimeUnit.MILLISECONDS.toNanos(j3);
                sgb1.g(3, "Recorder");
            } else {
                this.U = 0L;
            }
            int ordinal = this.K.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    z(z2 ? Recorder$AudioState.ENABLED : Recorder$AudioState.DISABLED);
                } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                    dy31.p(this.K, "Incorrectly invoke startInternal in audio state ");
                    return;
                }
            } else if (z2) {
                if (((k74) l(this.E)).b.e == 0) {
                    ny61.f("The Recorder doesn't support recording with audio");
                    return;
                }
                try {
                    if (this.r.E) {
                        if (this.I == null) {
                        }
                        z(Recorder$AudioState.ENABLED);
                    }
                    F(b84Var);
                    z(Recorder$AudioState.ENABLED);
                } catch (AudioSourceAccessException | InvalidConfigException e2) {
                    sgb1.e("Recorder", "Unable to create audio resource with error: ", e2);
                    z(e2 instanceof InvalidConfigException ? Recorder$AudioState.ERROR_ENCODER : Recorder$AudioState.ERROR_SOURCE);
                    this.Z = e2;
                }
            }
            I(b84Var, false);
            if (n()) {
                androidx.camera.video.internal.audio.d dVar = this.F;
                dVar.a.execute(new androidx.camera.video.internal.audio.b(dVar, b84Var.y.get(), 0));
                this.I.l();
            }
            this.G.l();
            b84 b84Var2 = this.r;
            b84Var2.k(new gn31(b84Var2.A, k()), true);
        }
        if (z) {
            t(b84Var);
        }
    }

    public final void H(b84 b84Var, final long j, int i, Throwable th) {
        if (this.r != b84Var || this.s) {
            return;
        }
        this.s = true;
        this.V = i;
        this.W = th;
        if (n()) {
            while (true) {
                lg lgVar = this.Y;
                if (lgVar.f()) {
                    break;
                } else {
                    lgVar.b();
                }
            }
            final androidx.camera.video.internal.encoder.j jVar = this.I;
            final long d = jVar.r.d();
            jVar.i.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.b
                /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    j jVar2 = j.this;
                    String str = jVar2.a;
                    switch (jVar2.w.ordinal()) {
                        case 0:
                        case 3:
                        case 7:
                            break;
                        case 1:
                        case 2:
                            EncoderImpl$InternalState encoderImpl$InternalState = jVar2.w;
                            jVar2.j(EncoderImpl$InternalState.STOPPING);
                            Long l = (Long) jVar2.x.getLower();
                            long longValue = l.longValue();
                            if (longValue == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                                ny61.f("There should be a \"start\" before \"stop\"");
                                break;
                            } else {
                                long j2 = j;
                                if (j2 != -1) {
                                    if (j2 < longValue) {
                                        sgb1.g(5, str);
                                    }
                                    if (j2 >= longValue) {
                                        ny61.f("The start time should be before the stop time.");
                                        break;
                                    } else {
                                        jVar2.x = Range.create(l, Long.valueOf(j2));
                                        mq61.g(j2);
                                        sgb1.g(3, str);
                                        if (encoderImpl$InternalState == EncoderImpl$InternalState.PAUSED && jVar2.A != null) {
                                            jVar2.k();
                                            break;
                                        } else {
                                            jVar2.z = true;
                                            jVar2.B = geb1.f().schedule(new bzn(jVar2, 1), 1000L, TimeUnit.MILLISECONDS);
                                            break;
                                        }
                                    }
                                }
                                j2 = d;
                                if (j2 >= longValue) {
                                }
                            }
                            break;
                        case 4:
                        case 5:
                            jVar2.j(EncoderImpl$InternalState.CONFIGURED);
                            break;
                        case 6:
                        case 8:
                            ny61.r("Encoder is released");
                            break;
                        default:
                            yci0.t(jVar2.w, "Unknown state: ");
                            break;
                    }
                }
            });
        }
        oyn oynVar = this.X;
        if (oynVar != null) {
            oynVar.close();
            this.X = null;
        }
        VideoOutput$SourceState videoOutput$SourceState = this.b0;
        VideoOutput$SourceState videoOutput$SourceState2 = VideoOutput$SourceState.ACTIVE_NON_STREAMING;
        androidx.camera.video.internal.encoder.j jVar2 = this.G;
        if (videoOutput$SourceState != videoOutput$SourceState2) {
            this.c0 = geb1.f().schedule(new xmf0(12, this.d, new bzn(jVar2, 5)), 1000L, TimeUnit.MILLISECONDS);
        } else {
            r(jVar2);
        }
        final androidx.camera.video.internal.encoder.j jVar3 = this.G;
        final long d2 = jVar3.r.d();
        jVar3.i.execute(new Runnable() { // from class: androidx.camera.video.internal.encoder.b
            /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                j jVar22 = j.this;
                String str = jVar22.a;
                switch (jVar22.w.ordinal()) {
                    case 0:
                    case 3:
                    case 7:
                        break;
                    case 1:
                    case 2:
                        EncoderImpl$InternalState encoderImpl$InternalState = jVar22.w;
                        jVar22.j(EncoderImpl$InternalState.STOPPING);
                        Long l = (Long) jVar22.x.getLower();
                        long longValue = l.longValue();
                        if (longValue == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                            ny61.f("There should be a \"start\" before \"stop\"");
                            break;
                        } else {
                            long j2 = j;
                            if (j2 != -1) {
                                if (j2 < longValue) {
                                    sgb1.g(5, str);
                                }
                                if (j2 >= longValue) {
                                    ny61.f("The start time should be before the stop time.");
                                    break;
                                } else {
                                    jVar22.x = Range.create(l, Long.valueOf(j2));
                                    mq61.g(j2);
                                    sgb1.g(3, str);
                                    if (encoderImpl$InternalState == EncoderImpl$InternalState.PAUSED && jVar22.A != null) {
                                        jVar22.k();
                                        break;
                                    } else {
                                        jVar22.z = true;
                                        jVar22.B = geb1.f().schedule(new bzn(jVar22, 1), 1000L, TimeUnit.MILLISECONDS);
                                        break;
                                    }
                                }
                            }
                            j2 = d2;
                            if (j2 >= longValue) {
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        jVar22.j(EncoderImpl$InternalState.CONFIGURED);
                        break;
                    case 6:
                    case 8:
                        ny61.r("Encoder is released");
                        break;
                    default:
                        yci0.t(jVar22.w, "Unknown state: ");
                        break;
                }
            }
        });
    }

    public final void I(final b84 b84Var, boolean z) {
        ArrayList arrayList = this.w;
        final int i = 1;
        if (!arrayList.isEmpty()) {
            lry b = ni91.b(arrayList);
            if (!b.isDone()) {
                b.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(jx81.r(new el7(this) { // from class: eii0
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.el7
            public final Object j(b bVar) {
                switch (i) {
                    case 0:
                        g gVar = this.b;
                        b84 b84Var2 = b84Var;
                        c cVar = new c(gVar, bVar);
                        d dVar = gVar.F;
                        androidx.camera.core.impl.utils.executor.b bVar2 = gVar.d;
                        dVar.a.execute(new d1(3, dVar, bVar2, new o8g0(gVar, cVar, false)));
                        j jVar = gVar.I;
                        androidx.camera.video.d dVar2 = new androidx.camera.video.d(gVar, bVar, cVar, b84Var2);
                        synchronized (jVar.b) {
                            jVar.u = dVar2;
                            jVar.v = bVar2;
                        }
                        return "audioEncodingFuture";
                    default:
                        g gVar2 = this.b;
                        b84 b84Var3 = b84Var;
                        j jVar2 = gVar2.G;
                        q6c0 q6c0Var = new q6c0(gVar2, bVar, b84Var3, false, 23);
                        androidx.camera.core.impl.utils.executor.b bVar3 = gVar2.d;
                        synchronized (jVar2.b) {
                            jVar2.u = q6c0Var;
                            jVar2.v = bVar3;
                        }
                        return "videoEncodingFuture";
                }
            }
        }));
        if (n() && !z) {
            final int i2 = 0;
            arrayList.add(jx81.r(new el7(this) { // from class: eii0
                public final /* synthetic */ g b;

                {
                    this.b = this;
                }

                @Override // defpackage.el7
                public final Object j(b bVar) {
                    switch (i2) {
                        case 0:
                            g gVar = this.b;
                            b84 b84Var2 = b84Var;
                            c cVar = new c(gVar, bVar);
                            d dVar = gVar.F;
                            androidx.camera.core.impl.utils.executor.b bVar2 = gVar.d;
                            dVar.a.execute(new d1(3, dVar, bVar2, new o8g0(gVar, cVar, false)));
                            j jVar = gVar.I;
                            androidx.camera.video.d dVar2 = new androidx.camera.video.d(gVar, bVar, cVar, b84Var2);
                            synchronized (jVar.b) {
                                jVar.u = dVar2;
                                jVar.v = bVar2;
                            }
                            return "audioEncodingFuture";
                        default:
                            g gVar2 = this.b;
                            b84 b84Var3 = b84Var;
                            j jVar2 = gVar2.G;
                            q6c0 q6c0Var = new q6c0(gVar2, bVar, b84Var3, false, 23);
                            androidx.camera.core.impl.utils.executor.b bVar3 = gVar2.d;
                            synchronized (jVar2.b) {
                                jVar2.u = q6c0Var;
                                jVar2.v = bVar3;
                            }
                            return "videoEncodingFuture";
                    }
                }
            }));
        }
        ni91.a(ni91.b(arrayList), new sue0(16, this), geb1.b());
    }

    public final void J(boolean z) {
        b84 b84Var = this.r;
        if (b84Var != null) {
            b84Var.k(new hn31(b84Var.A, k()), z);
        }
    }

    public final void K(Recorder$State recorder$State) {
        if (!n0.contains(this.l)) {
            dy31.p(this.l, "Can only updated non-pending state from a pending state, but state is ");
            return;
        }
        if (!o0.contains(recorder$State)) {
            d7g0.j(recorder$State, "Invalid state transition. State is not a valid non-pending state while in a pending state: ");
        } else if (this.m != recorder$State) {
            this.m = recorder$State;
            this.a.t(new a(this.n, m(recorder$State), this.t));
        }
    }

    public final void L(oyn oynVar, b84 b84Var) {
        long size = oynVar.size() + this.M;
        long j = this.T;
        if (j != 0 && size > j) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.T));
            sgb1.g(3, "Recorder");
            s(b84Var, 2, null);
            return;
        }
        long V = oynVar.V();
        long j2 = this.Q;
        if (j2 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            this.Q = V;
            String.format("First audio time: %d (%s)", Long.valueOf(V), mq61.g(this.Q));
            sgb1.g(3, "Recorder");
        } else {
            long min = V - Math.min(this.P, j2);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(min);
            d6z.y("There should be a previous data for adjusting the duration.", this.S != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            long nanos2 = timeUnit.toNanos(V - this.S) + nanos;
            long j3 = this.U;
            if (j3 != 0 && nanos2 > j3) {
                String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.U));
                sgb1.g(3, "Recorder");
                s(b84Var, 9, null);
                return;
            }
        }
        try {
            this.D.writeSampleData(this.x.intValue(), oynVar.t1(), oynVar.M());
            this.M = size;
            this.N = oynVar.size() + this.N;
            this.S = V;
        } catch (IllegalStateException e) {
            yj70 yj70Var = this.k0;
            yj70Var.getClass();
            s(b84Var, yj70Var.e() >= this.j ? 1 : 3, e);
        }
    }

    public final void M(oyn oynVar, b84 b84Var) {
        String str;
        long j = this.j;
        if (this.y == null) {
            ny61.f("Video data comes before the track is added to MediaMuxer.");
            return;
        }
        long size = oynVar.size() + this.M;
        long j2 = this.T;
        long j3 = 0;
        if (j2 != 0 && size > j2) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.T));
            sgb1.g(3, "Recorder");
            s(b84Var, 2, null);
            return;
        }
        long V = oynVar.V();
        long j4 = this.P;
        if (j4 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            this.P = V;
            String.format("First video time: %d (%s)", Long.valueOf(V), mq61.g(this.P));
            sgb1.g(3, "Recorder");
            str = "Recorder";
        } else {
            long min = V - Math.min(j4, this.Q);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            j3 = timeUnit.toNanos(min);
            d6z.y("There should be a previous data for adjusting the duration.", this.R != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            long nanos = timeUnit.toNanos(V - this.R) + j3;
            str = "Recorder";
            long j5 = this.U;
            if (j5 != 0 && nanos > j5) {
                String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos), Long.valueOf(this.U));
                sgb1.g(3, str);
                s(b84Var, 9, null);
                return;
            }
        }
        try {
            this.D.writeSampleData(this.y.intValue(), oynVar.t1(), oynVar.M());
            this.M = size;
            this.O = j3;
            this.R = V;
            J(oynVar.O());
            if (size > this.l0) {
                yj70 yj70Var = this.k0;
                yj70Var.getClass();
                long e = yj70Var.e();
                tgb1.b(e);
                sgb1.g(3, str);
                if (e < j) {
                    s(b84Var, 3, new IOException(String.format("Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes.", Long.valueOf(e), Long.valueOf(j))));
                } else {
                    this.l0 = e - j;
                }
            }
        } catch (IllegalStateException e2) {
            yj70 yj70Var2 = this.k0;
            yj70Var2.getClass();
            s(b84Var, yj70Var2.e() >= j ? 1 : 3, e2);
        }
    }

    @Override // defpackage.lm31
    public final void a(znw0 znw0Var) {
        b(znw0Var, Timebase.UPTIME, false);
    }

    @Override // defpackage.lm31
    public final void b(znw0 znw0Var, Timebase timebase, boolean z) {
        synchronized (this.h) {
            try {
                Objects.toString(this.l);
                sgb1.g(3, "Recorder");
                if (this.l == Recorder$State.ERROR) {
                    C(Recorder$State.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.execute(new yno(this, znw0Var, timebase, z, 1));
    }

    @Override // defpackage.lm31
    public final gq60 c() {
        return this.E;
    }

    @Override // defpackage.lm31
    public final gq60 d() {
        return this.a;
    }

    @Override // defpackage.lm31
    public final void e(VideoOutput$SourceState videoOutput$SourceState) {
        this.d.execute(new xmf0(11, this, videoOutput$SourceState));
    }

    @Override // defpackage.lm31
    public final yk31 f(ar7 ar7Var, int i) {
        return new pii0(ar7Var, i == 1 ? 2 : 1);
    }

    @Override // defpackage.lm31
    public final gq60 g() {
        return this.b;
    }

    public final void h(znw0 znw0Var, Timebase timebase, boolean z) {
        Object value;
        kgg0 kgg0Var;
        if (znw0Var.a()) {
            sgb1.g(5, "Recorder");
            return;
        }
        gii0 gii0Var = new gii0(this);
        androidx.camera.core.impl.utils.executor.b bVar = this.d;
        znw0Var.c(bVar, gii0Var);
        Size size = znw0Var.b;
        q8n q8nVar = znw0Var.c;
        pii0 pii0Var = (pii0) f(znw0Var.e.c(), znw0Var.g);
        n28 e = pii0Var.e(q8nVar);
        if (e == null) {
            kgg0Var = kgg0.g;
        } else {
            TreeMap treeMap = e.b;
            Size size2 = vjs0.a;
            Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
            if (ceilingEntry != null) {
                value = ceilingEntry.getValue();
            } else {
                Map.Entry floorEntry = treeMap.floorEntry(size);
                value = floorEntry != null ? floorEntry.getValue() : null;
            }
            kgg0Var = (kgg0) value;
            if (kgg0Var == null) {
                kgg0Var = kgg0.g;
            }
        }
        Objects.toString(kgg0Var);
        Objects.toString(size);
        sgb1.g(3, "Recorder");
        if (kgg0Var != kgg0.g) {
            n28 e2 = pii0Var.e(q8nVar);
            qo31 a = e2 == null ? null : e2.a(kgg0Var);
            this.v = a;
            if (a == null) {
                ny61.f("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
                return;
            }
        }
        Objects.toString(this.v);
        sgb1.g(3, "Recorder");
        oii0 oii0Var = this.j0;
        if (oii0Var != null && !oii0Var.d) {
            oii0Var.d = true;
            ScheduledFuture scheduledFuture = oii0Var.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                oii0Var.f = null;
            }
        }
        oii0 oii0Var2 = new oii0(this, znw0Var, timebase, this.m0, z ? w0 : 0);
        this.j0 = oii0Var2;
        Objects.toString(this.G);
        sgb1.g(3, "Recorder");
        k kVar = this.e0;
        kVar.a();
        ni91.g(kVar.j).c(new e(oii0Var2, znw0Var, timebase), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc A[LOOP:0: B:11:0x00d6->B:13:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:24:0x0111, B:26:0x0115, B:27:0x0119, B:35:0x013f, B:36:0x0147, B:41:0x01d8, B:61:0x0153, B:63:0x0157, B:65:0x015d, B:68:0x0168, B:71:0x0174, B:72:0x017e, B:73:0x0191, B:75:0x0195, B:77:0x019b, B:78:0x01ac, B:80:0x01b0, B:82:0x01b6, B:85:0x01be, B:87:0x01c5, B:89:0x01c9, B:96:0x0200, B:97:0x0201, B:98:0x0208, B:29:0x011a, B:30:0x012b, B:32:0x0131, B:34:0x013e), top: B:23:0x0111, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac A[Catch: all -> 0x0164, TryCatch #0 {all -> 0x0164, blocks: (B:24:0x0111, B:26:0x0115, B:27:0x0119, B:35:0x013f, B:36:0x0147, B:41:0x01d8, B:61:0x0153, B:63:0x0157, B:65:0x015d, B:68:0x0168, B:71:0x0174, B:72:0x017e, B:73:0x0191, B:75:0x0195, B:77:0x019b, B:78:0x01ac, B:80:0x01b0, B:82:0x01b6, B:85:0x01be, B:87:0x01c5, B:89:0x01c9, B:96:0x0200, B:97:0x0201, B:98:0x0208, B:29:0x011a, B:30:0x012b, B:32:0x0131, B:34:0x013e), top: B:23:0x0111, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, Throwable th) {
        int i2;
        dn31 dn31Var;
        lg lgVar;
        int ordinal;
        boolean z;
        int i3;
        int i4;
        b84 b84Var;
        RuntimeException runtimeException;
        if (this.r == null) {
            ny61.f("Attempted to finalize in-progress recording, but no recording is in progress.");
            return;
        }
        MediaMuxer mediaMuxer = this.D;
        int i5 = 8;
        int i6 = 1;
        b84 b84Var2 = null;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.D.release();
            } catch (IllegalStateException e) {
                sgb1.e("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage(), e);
                if (i == 0) {
                    yj70 yj70Var = this.k0;
                    yj70Var.getClass();
                    if (yj70Var.e() < this.j) {
                        i5 = 3;
                    } else if (this.N != 0) {
                        i5 = 1;
                    }
                }
            }
            i5 = i;
            this.D = null;
        } else if (i != 0) {
            i2 = i;
            this.r.a(this.L);
            r0r r0rVar = this.r.A;
            c84 k = k();
            Uri uri = this.L;
            d6z.v(uri, "OutputUri cannot be null.");
            n74 n74Var = new n74(uri);
            b84 b84Var3 = this.r;
            final int i7 = 0;
            if (i2 != 0) {
                dn31Var = new dn31(r0rVar, k, n74Var, 0, null);
            } else {
                d6z.m("An error type is required.", i2 != 0);
                dn31Var = new dn31(r0rVar, k, n74Var, i2, th);
            }
            b84Var3.k(dn31Var, true);
            b84 b84Var4 = this.r;
            this.r = null;
            this.s = false;
            this.x = null;
            this.y = null;
            this.w.clear();
            this.L = Uri.EMPTY;
            this.M = 0L;
            this.N = 0L;
            this.O = 0L;
            this.P = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            this.Q = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            this.R = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            this.S = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            this.V = 1;
            this.W = null;
            this.Z = null;
            this.h0 = 0.0d;
            this.k0 = null;
            this.l0 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            lgVar = this.Y;
            while (!lgVar.f()) {
                lgVar.b();
            }
            A(null);
            ordinal = this.K.ordinal();
            if (ordinal != 2 || ordinal == 3) {
                z(Recorder$AudioState.IDLING);
                final androidx.camera.video.internal.audio.d dVar = this.F;
                dVar.a.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i8 = i7;
                        Object obj = dVar;
                        switch (i8) {
                            case 0:
                                d dVar2 = (d) obj;
                                int ordinal2 = dVar2.g.ordinal();
                                if (ordinal2 == 1) {
                                    dVar2.d(AudioSource$InternalState.CONFIGURED);
                                    dVar2.f();
                                    break;
                                } else if (ordinal2 == 2) {
                                    sgb1.g(5, "AudioSource");
                                    break;
                                }
                                break;
                            default:
                                d dVar3 = ((fh3) obj).a;
                                dVar3.q = true;
                                if (dVar3.g == AudioSource$InternalState.STARTED) {
                                    dVar3.a();
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else if (ordinal == 4 || ordinal == 5) {
                z(Recorder$AudioState.INITIALIZING);
            }
            synchronized (this.h) {
                try {
                    b84 b84Var5 = this.o;
                    if (b84Var5 != b84Var4) {
                        throw new AssertionError("Active recording did not match finalized recording on finalize.");
                    }
                    qz40 qz40Var = b84Var5.z;
                    synchronized (qz40Var.c) {
                        try {
                            Iterator it = new HashSet(((HashMap) qz40Var.e).keySet()).iterator();
                            while (it.hasNext()) {
                                qz40Var.l((dq60) it.next());
                            }
                        } finally {
                        }
                    }
                    this.o = null;
                    switch (this.l.ordinal()) {
                        case 1:
                            z = false;
                            if (this.b0 != VideoOutput$SourceState.INACTIVE) {
                                b84 b84Var6 = this.p;
                                this.p = null;
                                C(Recorder$State.CONFIGURING);
                                b84Var = b84Var6;
                                i4 = 4;
                                i3 = 0;
                                runtimeException = s0;
                                i6 = 0;
                            } else if (this.i) {
                                this.C = null;
                                znw0 znw0Var = this.z;
                                if (znw0Var == null || znw0Var.a()) {
                                    i6 = 0;
                                }
                                K(Recorder$State.CONFIGURING);
                                i3 = 0;
                                i4 = i3;
                                b84Var = null;
                                runtimeException = null;
                            } else if (this.G != null) {
                                i6 = 0;
                                i4 = 0;
                                b84Var = null;
                                runtimeException = null;
                                b84Var2 = q(this.l);
                                i3 = 0;
                            } else {
                                i3 = 0;
                                i6 = i3;
                                i4 = i6;
                                b84Var = null;
                                runtimeException = null;
                            }
                            break;
                        case 2:
                            z = true;
                            if (this.b0 != VideoOutput$SourceState.INACTIVE) {
                            }
                            break;
                        case 3:
                            throw new AssertionError("Unexpected state on finalize of recording: " + this.l);
                        case 4:
                        case 5:
                        case 6:
                            if (this.i) {
                                this.C = null;
                                znw0 znw0Var2 = this.z;
                                if (znw0Var2 == null || znw0Var2.a()) {
                                    i6 = 0;
                                }
                                C(Recorder$State.CONFIGURING);
                                z = false;
                                i3 = 0;
                                i4 = i3;
                                b84Var = null;
                                runtimeException = null;
                                break;
                            } else {
                                C(Recorder$State.IDLING);
                                z = false;
                                i3 = 0;
                                i6 = i3;
                                i4 = i6;
                                b84Var = null;
                                runtimeException = null;
                            }
                            break;
                        case 7:
                            z = false;
                            i4 = 0;
                            i3 = 1;
                            b84Var = null;
                            runtimeException = null;
                            i6 = 0;
                            break;
                        default:
                            z = false;
                            i3 = 0;
                            i6 = i3;
                            i4 = i6;
                            b84Var = null;
                            runtimeException = null;
                            break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i6 != 0) {
                h(this.z, this.A, false);
                return;
            }
            if (i3 != 0) {
                w();
                return;
            }
            if (b84Var2 == null) {
                if (b84Var != null) {
                    j(b84Var, i4, runtimeException);
                    return;
                }
                return;
            } else if (this.i) {
                ny61.f("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
                return;
            } else {
                G(b84Var2, z);
                return;
            }
        }
        i2 = i5;
        this.r.a(this.L);
        r0r r0rVar2 = this.r.A;
        c84 k2 = k();
        Uri uri2 = this.L;
        d6z.v(uri2, "OutputUri cannot be null.");
        n74 n74Var2 = new n74(uri2);
        b84 b84Var32 = this.r;
        final int i72 = 0;
        if (i2 != 0) {
        }
        b84Var32.k(dn31Var, true);
        b84 b84Var42 = this.r;
        this.r = null;
        this.s = false;
        this.x = null;
        this.y = null;
        this.w.clear();
        this.L = Uri.EMPTY;
        this.M = 0L;
        this.N = 0L;
        this.O = 0L;
        this.P = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.Q = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.R = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.S = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.V = 1;
        this.W = null;
        this.Z = null;
        this.h0 = 0.0d;
        this.k0 = null;
        this.l0 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        lgVar = this.Y;
        while (!lgVar.f()) {
        }
        A(null);
        ordinal = this.K.ordinal();
        if (ordinal != 2) {
        }
        z(Recorder$AudioState.IDLING);
        final Object dVar2 = this.F;
        dVar2.a.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                int i8 = i72;
                Object obj = dVar2;
                switch (i8) {
                    case 0:
                        d dVar22 = (d) obj;
                        int ordinal2 = dVar22.g.ordinal();
                        if (ordinal2 == 1) {
                            dVar22.d(AudioSource$InternalState.CONFIGURED);
                            dVar22.f();
                            break;
                        } else if (ordinal2 == 2) {
                            sgb1.g(5, "AudioSource");
                            break;
                        }
                        break;
                    default:
                        d dVar3 = ((fh3) obj).a;
                        dVar3.q = true;
                        if (dVar3.g == AudioSource$InternalState.STARTED) {
                            dVar3.a();
                            break;
                        }
                        break;
                }
            }
        });
        synchronized (this.h) {
        }
    }

    public final void j(b84 b84Var, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        b84Var.a(uri);
        r0r r0rVar = b84Var.A;
        c84 a = c84.a(0L, 0L, new o34(1, 0.0d, 0L, this.Z));
        d6z.v(uri, "OutputUri cannot be null.");
        n74 n74Var = new n74(uri);
        d6z.m("An error type is required.", i != 0);
        b84Var.k(new dn31(r0rVar, a, n74Var, i, th), true);
    }

    public final c84 k() {
        int i;
        long j = this.O;
        long j2 = this.M;
        Recorder$AudioState recorder$AudioState = this.K;
        int ordinal = recorder$AudioState.ordinal();
        int i2 = 1;
        if (ordinal != 0 && ordinal != 1) {
            int i3 = 2;
            if (ordinal != 2) {
                i2 = 5;
                i = 3;
                if (ordinal != 3) {
                    i3 = 4;
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            d7g0.j(recorder$AudioState, "Invalid internal audio state: ");
                            return null;
                        }
                    }
                    return c84.a(j, j2, new o34(i, this.h0, this.N, this.Z));
                }
                b84 b84Var = this.r;
                if (b84Var == null || !b84Var.y.get()) {
                    if (!this.a0) {
                        i2 = 0;
                    }
                }
                i = i3;
                return c84.a(j, j2, new o34(i, this.h0, this.N, this.Z));
            }
        }
        i = i2;
        return c84.a(j, j2, new o34(i, this.h0, this.N, this.Z));
    }

    public final boolean n() {
        return this.K == Recorder$AudioState.ENABLED;
    }

    public final boolean o() {
        b84 b84Var = this.r;
        return b84Var != null && b84Var.E;
    }

    public final b84 q(Recorder$State recorder$State) {
        boolean z;
        if (recorder$State == Recorder$State.PENDING_PAUSED) {
            z = true;
        } else {
            if (recorder$State != Recorder$State.PENDING_RECORDING) {
                ny61.f("makePendingRecordingActiveLocked() can only be called from a pending state.");
                return null;
            }
            z = false;
        }
        if (this.o != null) {
            ny61.f("Cannot make pending recording active because another recording is already active.");
            return null;
        }
        b84 b84Var = this.p;
        if (b84Var == null) {
            ny61.f("Pending recording should exist when in a PENDING state.");
            return null;
        }
        this.o = b84Var;
        b84Var.z.b(geb1.b(), new is7(2, this));
        this.p = null;
        if (z) {
            C(Recorder$State.PAUSED);
            return b84Var;
        }
        C(Recorder$State.RECORDING);
        return b84Var;
    }

    public final void s(b84 b84Var, int i, Exception exc) {
        boolean z;
        if (b84Var != this.r) {
            ny61.f("Internal error occurred on recording that is not the current in-progress recording.");
            return;
        }
        synchronized (this.h) {
            try {
                z = false;
                switch (this.l.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.l);
                    case 4:
                    case 5:
                        C(Recorder$State.STOPPING);
                        z = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (b84Var != this.o) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            H(b84Var, -1L, i, exc);
        }
    }

    public final void t(b84 b84Var) {
        if (this.r != b84Var || this.s) {
            return;
        }
        if (n()) {
            this.I.f();
        }
        this.G.f();
        b84 b84Var2 = this.r;
        b84Var2.k(new en31(b84Var2.A, k()), true);
    }

    public final void u() {
        final androidx.camera.video.internal.audio.d dVar = this.F;
        if (dVar == null) {
            ny61.f("Cannot release null audio source.");
            return;
        }
        this.F = null;
        String.format("Releasing audio source: 0x%x", Integer.valueOf(dVar.hashCode()));
        sgb1.g(3, "Recorder");
        final androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            dVar.a.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.concurrent.futures.b bVar2 = bVar;
                    d dVar2 = d.this;
                    dVar2.getClass();
                    try {
                        int ordinal = dVar2.g.ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            dVar2.b(null);
                            ((AtomicBoolean) dVar2.e.x).getAndSet(true);
                            hq6 hq6Var = dVar2.d;
                            if (!hq6Var.b.getAndSet(true)) {
                                hq6Var.w.execute(new fq6(hq6Var, 3));
                            }
                            dVar2.e();
                            dVar2.d(AudioSource$InternalState.RELEASED);
                        }
                        bVar2.b(null);
                    } catch (Throwable th) {
                        bVar2.d(th);
                    }
                }
            });
            bVar.a = "AudioSource-release";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        ni91.a(gl7Var, new fh3(dVar), geb1.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void v(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.h) {
            try {
                z2 = true;
                z3 = false;
                switch (this.l.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        K(Recorder$State.RESETTING);
                        break;
                    case 4:
                    case 5:
                        d6z.y("In-progress recording shouldn't be null when in state " + this.l, this.r != null);
                        if (this.o != this.r) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!o()) {
                            C(Recorder$State.RESETTING);
                            z3 = true;
                            z2 = false;
                        }
                        break;
                    case 6:
                        C(Recorder$State.RESETTING);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                H(this.r, -1L, 4, null);
            }
        } else if (z) {
            x();
        } else {
            w();
        }
    }

    public final void w() {
        if (this.I != null) {
            sgb1.g(3, "Recorder");
            androidx.camera.video.internal.encoder.j jVar = this.I;
            jVar.i.execute(new androidx.camera.video.internal.encoder.c(1, jVar));
            this.I = null;
            this.J = null;
        }
        if (this.F != null) {
            u();
        }
        z(Recorder$AudioState.INITIALIZING);
        x();
    }

    public final void x() {
        znw0 znw0Var;
        boolean z = true;
        if (this.G != null) {
            sgb1.g(3, "Recorder");
            k kVar = this.g0;
            if (kVar != null) {
                d6z.y(null, kVar.d == this.G);
                Objects.toString(this.G);
                sgb1.g(3, "Recorder");
                this.g0.b();
                this.g0 = null;
                this.G = null;
                this.H = null;
                B(null);
            } else {
                Objects.toString(this.G);
                sgb1.g(3, "Recorder");
                k kVar2 = this.e0;
                kVar2.a();
                ni91.g(kVar2.j);
            }
        }
        synchronized (this.h) {
            try {
                switch (this.l.ordinal()) {
                    case 1:
                    case 2:
                        K(Recorder$State.CONFIGURING);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        C(Recorder$State.CONFIGURING);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d0 = false;
        if (!z || (znw0Var = this.z) == null || znw0Var.a()) {
            return;
        }
        h(this.z, this.A, false);
    }

    public final void y() {
        if (n0.contains(this.l)) {
            C(this.m);
        } else {
            dy31.p(this.l, "Cannot restore non-pending state when in state ");
        }
    }

    public final void z(Recorder$AudioState recorder$AudioState) {
        Objects.toString(this.K);
        Objects.toString(recorder$AudioState);
        sgb1.g(3, "Recorder");
        this.K = recorder$AudioState;
    }
}
