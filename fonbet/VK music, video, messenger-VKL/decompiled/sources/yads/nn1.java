package yads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import xsna.fhj;
import xsna.hhj;
import xsna.js10;
import xsna.ks10;
import xsna.ls10;

/* loaded from: classes10.dex */
public final class nn1 implements af, if2 {
    public boolean A;
    public final Context a;
    public final oe0 b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public cf2 n;
    public mn1 o;
    public mn1 p;
    public mn1 q;
    public nx0 r;
    public nx0 s;
    public nx0 t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final v73 e = new v73();
    public final t73 f = new t73();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public nn1(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        oe0 oe0Var = new oe0();
        this.b = oe0Var;
        oe0Var.a(this);
    }

    public final boolean a(mn1 mn1Var) {
        String str;
        if (mn1Var == null) {
            return false;
        }
        String str2 = mn1Var.c;
        oe0 oe0Var = this.b;
        synchronized (oe0Var) {
            str = oe0Var.g;
        }
        return str2.equals(str);
    }

    public final void b(ye yeVar, String str) {
        zn1 zn1Var = yeVar.d;
        if ((zn1Var == null || !zn1Var.a()) && str.equals(this.i)) {
            a();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void a() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void a(w73 w73Var, zn1 zn1Var) {
        int a;
        PlaybackMetrics.Builder builder = this.j;
        if (zn1Var == null || (a = w73Var.a(zn1Var.a)) == -1) {
            return;
        }
        int i = 0;
        w73Var.a(a, this.f, false);
        w73Var.a(this.f.d, this.e, 0L);
        bn1 bn1Var = this.e.d.c;
        if (bn1Var != null) {
            int a2 = mc3.a(bn1Var.a, bn1Var.b);
            i = a2 != 0 ? a2 != 1 ? a2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        v73 v73Var = this.e;
        if (v73Var.o != C.TIME_UNSET && !v73Var.m && !v73Var.j && !v73Var.a()) {
            builder.setMediaDurationMillis(mc3.b(this.e.o));
        }
        builder.setPlaybackType(this.e.a() ? 2 : 1);
        this.A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(pf2 pf2Var, ze zeVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        ln1 ln1Var;
        ln1 ln1Var2;
        int i5;
        int i6;
        ln1 ln1Var3;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i7;
        int i8;
        int i9;
        int i10;
        ao0 ao0Var;
        int i11;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        int i12;
        int i13;
        lk0 lk0Var;
        int i14;
        if (zeVar.a.a.size() == 0) {
            return;
        }
        for (int i15 = 0; i15 < zeVar.a.a.size(); i15++) {
            int a = zeVar.a.a(i15);
            ye yeVar = (ye) zeVar.b.get(a);
            yeVar.getClass();
            if (a == 0) {
                oe0 oe0Var = this.b;
                synchronized (oe0Var) {
                    try {
                        oe0Var.e.getClass();
                        w73 w73Var = oe0Var.f;
                        oe0Var.f = yeVar.b;
                        Iterator it = oe0Var.c.values().iterator();
                        while (it.hasNext()) {
                            ne0 ne0Var = (ne0) it.next();
                            w73 w73Var2 = oe0Var.f;
                            int i16 = ne0Var.b;
                            if (i16 >= w73Var.b()) {
                                if (i16 < w73Var2.b()) {
                                }
                                i16 = -1;
                            } else {
                                w73Var.a(i16, ne0Var.g.a, 0L);
                                for (int i17 = ne0Var.g.a.p; i17 <= ne0Var.g.a.q; i17++) {
                                    int a2 = w73Var2.a(w73Var.a(i17));
                                    if (a2 != -1) {
                                        i16 = w73Var2.a(a2, ne0Var.g.b, false).d;
                                        break;
                                    }
                                }
                                i16 = -1;
                            }
                            ne0Var.b = i16;
                            if (i16 != -1) {
                                zn1 zn1Var = ne0Var.d;
                                if (zn1Var != null && w73Var2.a(zn1Var.a) == -1) {
                                }
                                if (ne0Var.a(yeVar)) {
                                }
                            }
                            it.remove();
                            if (ne0Var.e) {
                                if (ne0Var.a.equals(oe0Var.g)) {
                                    oe0Var.g = null;
                                }
                                ((nn1) oe0Var.e).b(yeVar, ne0Var.a);
                            }
                        }
                        oe0Var.b(yeVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (a == 11) {
                this.b.a(yeVar, this.k);
            } else {
                this.b.c(yeVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zeVar.a(0)) {
            ye yeVar2 = (ye) zeVar.b.get(0);
            yeVar2.getClass();
            if (this.j != null) {
                a(yeVar2.b, yeVar2.d);
            }
        }
        if (zeVar.a(2) && this.j != null) {
            ao0 ao0Var2 = (ao0) pf2Var;
            ao0Var2.r();
            p51 listIterator = ao0Var2.Z.i.d.b.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    lk0Var = null;
                    break;
                }
                r93 r93Var = (r93) listIterator.next();
                for (int i18 = 0; i18 < r93Var.b; i18++) {
                    if (r93Var.f[i18] && (lk0Var = r93Var.c.e[i18].p) != null) {
                        break loop3;
                    }
                }
            }
            if (lk0Var != null) {
                PlaybackMetrics.Builder builder = this.j;
                int i19 = mc3.a;
                int i20 = 0;
                while (true) {
                    if (i20 >= lk0Var.e) {
                        i14 = 1;
                        break;
                    }
                    UUID uuid = lk0Var.b[i20].c;
                    if (uuid.equals(jr.d)) {
                        i14 = 3;
                        break;
                    } else if (uuid.equals(jr.e)) {
                        i14 = 2;
                        break;
                    } else {
                        if (uuid.equals(jr.c)) {
                            i14 = 6;
                            break;
                        }
                        i20++;
                    }
                }
                builder.setDrmType(i14);
            }
        }
        if (zeVar.a(1011)) {
            this.z++;
        }
        cf2 cf2Var = this.n;
        int i21 = 4;
        if (cf2Var == null) {
            i7 = 1;
            i4 = 8;
            i2 = 6;
            i3 = 9;
        } else {
            Context context = this.a;
            boolean z2 = this.v == 4;
            if (cf2Var.b == 1001) {
                ln1Var = new ln1(20, 0);
            } else {
                if (cf2Var instanceof qn0) {
                    qn0 qn0Var = (qn0) cf2Var;
                    z = qn0Var.d == 1;
                    i = qn0Var.h;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = cf2Var.getCause();
                cause.getClass();
                char c = 6005;
                int i22 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof u11) {
                        ln1Var3 = new ln1(5, ((u11) cause).e);
                    } else {
                        if (!(cause instanceof t11) && !(cause instanceof pc2)) {
                            boolean z3 = cause instanceof s11;
                            if (!z3 && !(cause instanceof db3)) {
                                if (cf2Var.b == 1002) {
                                    ln1Var = new ln1(21, 0);
                                } else if (cause instanceof mk0) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    int i23 = mc3.a;
                                    if (i23 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                        int a3 = mc3.a(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                        if (a3 != 2 && a3 != 4) {
                                            if (a3 != 10) {
                                                if (a3 != 7) {
                                                    if (a3 != 8) {
                                                        switch (a3) {
                                                            case 15:
                                                                break;
                                                            case 16:
                                                            case 18:
                                                                break;
                                                            case 17:
                                                            case 19:
                                                            case 20:
                                                            case 21:
                                                            case 22:
                                                                break;
                                                            default:
                                                                switch (a3) {
                                                                    case 24:
                                                                    case 25:
                                                                    case 26:
                                                                    case 27:
                                                                    case 28:
                                                                        c = 6002;
                                                                        break;
                                                                    default:
                                                                        c = 6006;
                                                                        break;
                                                                }
                                                        }
                                                    }
                                                    c = 6003;
                                                }
                                            }
                                            c = 6004;
                                        }
                                        switch (c) {
                                            case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                                i22 = 24;
                                                break;
                                            case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                                i22 = 28;
                                                break;
                                            case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                                i22 = 25;
                                                break;
                                            case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                                i22 = 26;
                                                break;
                                        }
                                        ln1Var3 = new ln1(i22, a3);
                                    } else if (i23 >= 23 && (cause2 instanceof MediaDrmResetException)) {
                                        ln1Var = new ln1(27, 0);
                                    } else if (i23 >= 18 && (cause2 instanceof NotProvisionedException)) {
                                        ln1Var = new ln1(24, 0);
                                    } else if (i23 >= 18 && (cause2 instanceof DeniedByServerException)) {
                                        ln1Var = new ln1(29, 0);
                                    } else if (cause2 instanceof pb3) {
                                        ln1Var = new ln1(23, 0);
                                    } else if (cause2 instanceof cd0) {
                                        ln1Var = new ln1(28, 0);
                                    } else {
                                        ln1Var = new ln1(30, 0);
                                    }
                                } else if ((cause instanceof cv0) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    if (mc3.a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                        ln1Var = new ln1(32, 0);
                                    } else {
                                        ln1Var = new ln1(31, 0);
                                    }
                                } else {
                                    i5 = 9;
                                    ln1Var = new ln1(9, 0);
                                }
                            } else {
                                i5 = 9;
                                if (q92.a(context).a() == 1) {
                                    ln1Var = new ln1(3, 0);
                                } else {
                                    Throwable cause5 = cause.getCause();
                                    if (cause5 instanceof UnknownHostException) {
                                        i6 = 6;
                                        ln1Var = new ln1(6, 0);
                                    } else {
                                        i6 = 6;
                                        if (cause5 instanceof SocketTimeoutException) {
                                            ln1Var = new ln1(7, 0);
                                            i3 = 9;
                                            i2 = 6;
                                        } else if (z3 && ((s11) cause).d == 1) {
                                            ln1Var = new ln1(4, 0);
                                        } else {
                                            ln1Var = new ln1(8, 0);
                                            i3 = 9;
                                            i4 = 8;
                                            i2 = 6;
                                            PlaybackSession playbackSession = this.c;
                                            timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                                            errorCode = timeSinceCreatedMillis.setErrorCode(ln1Var.a);
                                            subErrorCode = errorCode.setSubErrorCode(ln1Var.b);
                                            exception = subErrorCode.setException(cf2Var);
                                            build = exception.build();
                                            playbackSession.reportPlaybackErrorEvent(build);
                                            i7 = 1;
                                            this.A = true;
                                            this.n = null;
                                        }
                                    }
                                }
                            }
                            i3 = i5;
                            i4 = 8;
                            i2 = 6;
                            PlaybackSession playbackSession2 = this.c;
                            timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(ln1Var.a);
                            subErrorCode = errorCode.setSubErrorCode(ln1Var.b);
                            exception = subErrorCode.setException(cf2Var);
                            build = exception.build();
                            playbackSession2.reportPlaybackErrorEvent(build);
                            i7 = 1;
                            this.A = true;
                            this.n = null;
                        } else {
                            i5 = 9;
                            i6 = 6;
                            ln1Var = new ln1(z2 ? 10 : 11, 0);
                        }
                        i3 = i5;
                        i2 = i6;
                    }
                    ln1Var = ln1Var3;
                } else {
                    int i24 = 24;
                    i2 = 6;
                    i3 = 9;
                    if (z && (i == 0 || i == 1)) {
                        ln1Var = new ln1(35, 0);
                    } else if (z && i == 3) {
                        ln1Var = new ln1(15, 0);
                    } else if (z && i == 2) {
                        ln1Var = new ln1(23, 0);
                    } else {
                        if (cause instanceof ml1) {
                            ln1Var2 = new ln1(13, mc3.a(((ml1) cause).e));
                        } else if (cause instanceof il1) {
                            ln1Var2 = new ln1(14, mc3.a(((il1) cause).b));
                        } else if (cause instanceof OutOfMemoryError) {
                            ln1Var = new ln1(14, 0);
                        } else if (cause instanceof fl) {
                            ln1Var2 = new ln1(17, ((fl) cause).b);
                        } else if (cause instanceof il) {
                            ln1Var2 = new ln1(18, ((il) cause).b);
                        } else {
                            if (mc3.a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                if (errorCode2 == 2 || errorCode2 == 4) {
                                    i4 = 8;
                                } else {
                                    if (errorCode2 != 10) {
                                        i4 = 8;
                                        if (errorCode2 != 7) {
                                            if (errorCode2 != 8) {
                                                switch (errorCode2) {
                                                    case 15:
                                                        break;
                                                    case 16:
                                                    case 18:
                                                        break;
                                                    case 17:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                        break;
                                                    default:
                                                        switch (errorCode2) {
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                            case 27:
                                                            case 28:
                                                                c = 6002;
                                                                break;
                                                            default:
                                                                c = 6006;
                                                                break;
                                                        }
                                                }
                                            }
                                            c = 6003;
                                        }
                                    } else {
                                        i4 = 8;
                                    }
                                    c = 6004;
                                }
                                switch (c) {
                                    case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                        break;
                                    case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                        i24 = 28;
                                        break;
                                    case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                        i24 = 25;
                                        break;
                                    case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                        i24 = 26;
                                        break;
                                    default:
                                        i24 = 27;
                                        break;
                                }
                                ln1Var = new ln1(i24, errorCode2);
                            } else {
                                i4 = 8;
                                ln1Var = new ln1(22, 0);
                            }
                            PlaybackSession playbackSession22 = this.c;
                            timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(ln1Var.a);
                            subErrorCode = errorCode.setSubErrorCode(ln1Var.b);
                            exception = subErrorCode.setException(cf2Var);
                            build = exception.build();
                            playbackSession22.reportPlaybackErrorEvent(build);
                            i7 = 1;
                            this.A = true;
                            this.n = null;
                        }
                        ln1Var = ln1Var2;
                    }
                }
                i4 = 8;
                PlaybackSession playbackSession222 = this.c;
                timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                errorCode = timeSinceCreatedMillis.setErrorCode(ln1Var.a);
                subErrorCode = errorCode.setSubErrorCode(ln1Var.b);
                exception = subErrorCode.setException(cf2Var);
                build = exception.build();
                playbackSession222.reportPlaybackErrorEvent(build);
                i7 = 1;
                this.A = true;
                this.n = null;
            }
            i4 = 8;
            i2 = 6;
            i3 = 9;
            PlaybackSession playbackSession2222 = this.c;
            timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            errorCode = timeSinceCreatedMillis.setErrorCode(ln1Var.a);
            subErrorCode = errorCode.setSubErrorCode(ln1Var.b);
            exception = subErrorCode.setException(cf2Var);
            build = exception.build();
            playbackSession2222.reportPlaybackErrorEvent(build);
            i7 = 1;
            this.A = true;
            this.n = null;
        }
        if (zeVar.a(2)) {
            ao0 ao0Var3 = (ao0) pf2Var;
            ao0Var3.r();
            s93 s93Var = ao0Var3.Z.i.d;
            boolean a4 = s93Var.a(2);
            boolean a5 = s93Var.a(i7);
            boolean a6 = s93Var.a(3);
            if (a4 || a5 || a6) {
                if (a4) {
                    i8 = 5;
                } else {
                    if (!mc3.a(this.r, (Object) null)) {
                        if (this.r == null) {
                            i12 = 5;
                            i13 = 1;
                        } else {
                            i12 = 5;
                            i13 = 0;
                        }
                        this.r = null;
                        i8 = i12;
                        i9 = i4;
                        a(1, elapsedRealtime, null, i13);
                        if (!a5 && !mc3.a(this.s, (Object) null)) {
                            int i25 = this.s != null ? 1 : 0;
                            this.s = null;
                            a(0, elapsedRealtime, null, i25);
                        }
                        if (!a6 && !mc3.a(this.t, (Object) null)) {
                            int i26 = this.t != null ? 1 : 0;
                            this.t = null;
                            a(2, elapsedRealtime, null, i26);
                        }
                        if (a(this.o)) {
                            mn1 mn1Var = this.o;
                            nx0 nx0Var = mn1Var.a;
                            if (nx0Var.s != -1) {
                                int i27 = mn1Var.b;
                                if (!mc3.a(this.r, nx0Var)) {
                                    int i28 = (this.r == null && i27 == 0) ? 1 : i27;
                                    this.r = nx0Var;
                                    a(1, elapsedRealtime, nx0Var, i28);
                                }
                                this.o = null;
                            }
                        }
                        if (a(this.p)) {
                            mn1 mn1Var2 = this.p;
                            nx0 nx0Var2 = mn1Var2.a;
                            int i29 = mn1Var2.b;
                            if (!mc3.a(this.s, nx0Var2)) {
                                int i30 = (this.s == null && i29 == 0) ? 1 : i29;
                                this.s = nx0Var2;
                                a(0, elapsedRealtime, nx0Var2, i30);
                            }
                            this.p = null;
                        }
                        if (a(this.q)) {
                            mn1 mn1Var3 = this.q;
                            nx0 nx0Var3 = mn1Var3.a;
                            int i31 = mn1Var3.b;
                            if (!mc3.a(this.t, nx0Var3)) {
                                int i32 = (this.t == null && i31 == 0) ? 1 : i31;
                                this.t = nx0Var3;
                                a(2, elapsedRealtime, nx0Var3, i32);
                            }
                            this.q = null;
                        }
                        switch (q92.a(this.a).a()) {
                            case 0:
                                i10 = 0;
                                break;
                            case 1:
                                i10 = i3;
                                break;
                            case 2:
                                i10 = 2;
                                break;
                            case 3:
                                i10 = 4;
                                break;
                            case 4:
                                i10 = i8;
                                break;
                            case 5:
                                i10 = i2;
                                break;
                            case 6:
                            case 8:
                            default:
                                i10 = 1;
                                break;
                            case 7:
                                i10 = 3;
                                break;
                            case 9:
                                i10 = i9;
                                break;
                            case 10:
                                i10 = 7;
                                break;
                        }
                        if (i10 != this.m) {
                            this.m = i10;
                            PlaybackSession playbackSession3 = this.c;
                            networkType = hhj.a().setNetworkType(i10);
                            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                            build3 = timeSinceCreatedMillis3.build();
                            playbackSession3.reportNetworkEvent(build3);
                        }
                        ao0Var = (ao0) pf2Var;
                        ao0Var.r();
                        if (ao0Var.Z.e != 2) {
                            this.u = false;
                        }
                        ao0Var.r();
                        if (ao0Var.Z.f == null) {
                            this.w = false;
                            i11 = 10;
                        } else {
                            i11 = 10;
                            if (zeVar.a(10)) {
                                this.w = true;
                            }
                        }
                        ao0Var.r();
                        int i33 = ao0Var.Z.e;
                        if (this.u) {
                            i21 = i8;
                        } else if (this.w) {
                            i21 = 13;
                        } else if (i33 == 4) {
                            i21 = 11;
                        } else if (i33 == 2) {
                            int i34 = this.l;
                            if (i34 == 0 || i34 == 2) {
                                i21 = 2;
                            } else {
                                ao0Var.r();
                                if (ao0Var.Z.l) {
                                    ao0Var.r();
                                    i21 = ao0Var.Z.m != 0 ? i11 : i2;
                                } else {
                                    i21 = 7;
                                }
                            }
                        } else if (i33 == 3) {
                            ao0Var.r();
                            if (ao0Var.Z.l) {
                                ao0Var.r();
                                i21 = ao0Var.Z.m != 0 ? i3 : 3;
                            }
                        } else {
                            i21 = (i33 != 1 || this.l == 0) ? this.l : 12;
                        }
                        if (this.l != i21) {
                            this.l = i21;
                            this.A = true;
                            PlaybackSession playbackSession4 = this.c;
                            state = ks10.a().setState(this.l);
                            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                            build2 = timeSinceCreatedMillis2.build();
                            playbackSession4.reportPlaybackStateEvent(build2);
                        }
                        if (zeVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                            oe0 oe0Var2 = this.b;
                            ye yeVar3 = (ye) zeVar.b.get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
                            yeVar3.getClass();
                            oe0Var2.a(yeVar3);
                            return;
                        }
                        return;
                    }
                    i8 = 5;
                }
                i9 = i4;
                if (!a5) {
                    if (this.s != null) {
                    }
                    this.s = null;
                    a(0, elapsedRealtime, null, i25);
                }
                if (!a6) {
                    if (this.t != null) {
                    }
                    this.t = null;
                    a(2, elapsedRealtime, null, i26);
                }
                if (a(this.o)) {
                }
                if (a(this.p)) {
                }
                if (a(this.q)) {
                }
                switch (q92.a(this.a).a()) {
                }
                if (i10 != this.m) {
                }
                ao0Var = (ao0) pf2Var;
                ao0Var.r();
                if (ao0Var.Z.e != 2) {
                }
                ao0Var.r();
                if (ao0Var.Z.f == null) {
                }
                ao0Var.r();
                int i332 = ao0Var.Z.e;
                if (this.u) {
                }
                if (this.l != i21) {
                }
                if (zeVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                }
            }
        }
        i8 = 5;
        i9 = i4;
        if (a(this.o)) {
        }
        if (a(this.p)) {
        }
        if (a(this.q)) {
        }
        switch (q92.a(this.a).a()) {
        }
        if (i10 != this.m) {
        }
        ao0Var = (ao0) pf2Var;
        ao0Var.r();
        if (ao0Var.Z.e != 2) {
        }
        ao0Var.r();
        if (ao0Var.Z.f == null) {
        }
        ao0Var.r();
        int i3322 = ao0Var.Z.e;
        if (this.u) {
        }
        if (this.l != i21) {
        }
        if (zeVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
        }
    }

    public final void a(ye yeVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zn1 zn1Var = yeVar.d;
        if (zn1Var == null || !zn1Var.a()) {
            a();
            this.i = str;
            playerName = ls10.a().setPlayerName("ExoPlayerLib");
            playerVersion = playerName.setPlayerVersion("2.18.1");
            this.j = playerVersion;
            a(yeVar.b, yeVar.d);
        }
    }

    public final void a(int i, long j, nx0 nx0Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        timeSinceCreatedMillis = fhj.c(i).setTimeSinceCreatedMillis(j - this.d);
        if (nx0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = nx0Var.l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = nx0Var.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = nx0Var.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = nx0Var.i;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = nx0Var.r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = nx0Var.s;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = nx0Var.z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = nx0Var.A;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = nx0Var.d;
            if (str4 != null) {
                int i9 = mc3.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = nx0Var.t;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
