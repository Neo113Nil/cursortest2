package xsna;

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
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.a;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.i;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import xsna.by1;
import xsna.dip0;
import xsna.ewo0;
import xsna.jza0;
import xsna.kr10;
import xsna.okl;

/* compiled from: MediaMetricsListener.java */
/* loaded from: classes12.dex */
public final class ps10 implements by1 {
    public int A;
    public int B;
    public boolean C;
    public final Context b;
    public final okl d;
    public final PlaybackSession e;

    @Nullable
    public String k;

    @Nullable
    public PlaybackMetrics.Builder l;
    public int m;

    @Nullable
    public PlaybackException p;

    @Nullable
    public b q;

    @Nullable
    public b r;

    @Nullable
    public b s;

    @Nullable
    public androidx.media3.common.a t;

    @Nullable
    public androidx.media3.common.a u;

    @Nullable
    public androidx.media3.common.a v;
    public boolean w;
    public int x;
    public boolean y;
    public int z;
    public final Executor c = jw5.t();
    public final ewo0.c g = new ewo0.c();
    public final ewo0.b h = new ewo0.b();
    public final HashMap<String, Long> j = new HashMap<>();
    public final HashMap<String, Long> i = new HashMap<>();
    public final long f = SystemClock.elapsedRealtime();
    public int n = 0;
    public int o = 0;

    /* compiled from: MediaMetricsListener.java */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: MediaMetricsListener.java */
    public static final class b {
        public final androidx.media3.common.a a;
        public final int b;
        public final String c;

        public b(androidx.media3.common.a aVar, int i, String str) {
            this.a = aVar;
            this.b = i;
            this.c = str;
        }
    }

    public ps10(Context context, PlaybackSession playbackSession) {
        this.b = context.getApplicationContext();
        this.e = playbackSession;
        okl oklVar = new okl();
        this.d = oklVar;
        oklVar.d = this;
    }

    @Override // xsna.by1
    public final void H(by1.a aVar, int i, long j, long j2) {
        i.b bVar = aVar.d;
        if (bVar != null) {
            String c = this.d.c(aVar.b, bVar);
            HashMap<String, Long> hashMap = this.j;
            Long l = hashMap.get(c);
            HashMap<String, Long> hashMap2 = this.i;
            Long l2 = hashMap2.get(c);
            hashMap.put(c, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(c, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x065c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0544  */
    @Override // xsna.by1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(jza0 jza0Var, by1.b bVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        a aVar;
        a aVar2;
        int i9;
        int i10;
        int i11;
        a aVar3;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i12;
        int i13;
        b bVar2;
        int i14;
        int i15;
        boolean z2;
        ps10 ps10Var;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        androidx.media3.common.a aVar4;
        DrmInitData drmInitData;
        int i16;
        if (bVar.a.a.size() == 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            i = 1;
            if (i17 >= bVar.a.a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = bVar.a.a;
            fxc0.s(i17, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i17);
            by1.a aVar5 = bVar.b.get(keyAt);
            aVar5.getClass();
            if (keyAt == 0) {
                okl oklVar = this.d;
                synchronized (oklVar) {
                    try {
                        oklVar.d.getClass();
                        ewo0 ewo0Var = oklVar.e;
                        oklVar.e = aVar5.b;
                        Iterator<okl.a> it = oklVar.c.values().iterator();
                        while (it.hasNext()) {
                            okl.a next = it.next();
                            if (next.b(ewo0Var, oklVar.e) && !next.a(aVar5)) {
                            }
                            it.remove();
                            if (next.a.equals(oklVar.f)) {
                                oklVar.a(next);
                            }
                            if (next.e) {
                                oklVar.d.d(aVar5, next.a);
                            }
                        }
                        oklVar.d(aVar5);
                    } finally {
                    }
                }
            } else if (keyAt == 11) {
                okl oklVar2 = this.d;
                int i18 = this.m;
                synchronized (oklVar2) {
                    try {
                        oklVar2.d.getClass();
                        if (i18 != 0) {
                            i = 0;
                        }
                        Iterator<okl.a> it2 = oklVar2.c.values().iterator();
                        while (it2.hasNext()) {
                            okl.a next2 = it2.next();
                            if (next2.a(aVar5)) {
                                it2.remove();
                                boolean equals = next2.a.equals(oklVar2.f);
                                if (equals) {
                                    oklVar2.a(next2);
                                }
                                if (next2.e) {
                                    if (i != 0 && equals) {
                                        boolean z3 = next2.f;
                                    }
                                    oklVar2.d.d(aVar5, next2.a);
                                }
                            }
                        }
                        oklVar2.d(aVar5);
                    } finally {
                    }
                }
            } else {
                this.d.e(aVar5);
            }
            i17++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.a(0)) {
            by1.a aVar6 = bVar.b.get(0);
            aVar6.getClass();
            if (this.l != null) {
                c(aVar6.b, aVar6.d);
            }
        }
        if (bVar.a(2) && this.l != null) {
            ImmutableList.b listIterator = jza0Var.j().a.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                dip0.a aVar7 = (dip0.a) listIterator.next();
                for (int i19 = 0; i19 < aVar7.a; i19++) {
                    if (aVar7.e[i19] && (drmInitData = aVar7.b.d[i19].r) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder c = ql4.c(this.l);
                int i20 = 0;
                while (true) {
                    if (i20 >= drmInitData.e) {
                        i16 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.b[i20].c;
                    if (uuid.equals(tu8.d)) {
                        i16 = 3;
                        break;
                    } else if (uuid.equals(tu8.e)) {
                        i16 = 2;
                        break;
                    } else {
                        if (uuid.equals(tu8.c)) {
                            i16 = 6;
                            break;
                        }
                        i20++;
                    }
                }
                c.setDrmType(i16);
            }
        }
        if (bVar.a(1011)) {
            this.B++;
        }
        PlaybackException playbackException = this.p;
        if (playbackException == null) {
            i6 = 4;
            i12 = 2;
            i8 = 13;
            i3 = 9;
            i4 = 6;
            i5 = 8;
            i7 = 7;
        } else {
            Context context = this.b;
            boolean z4 = this.x == 4;
            if (playbackException.errorCode == 1001) {
                aVar = new a(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z = exoPlaybackException.type == 1;
                    i2 = exoPlaybackException.rendererFormatSupport;
                } else {
                    i2 = 0;
                    z = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i21 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                        aVar3 = new a(5, ((HttpDataSource$InvalidResponseCodeException) cause).responseCode);
                    } else {
                        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                            i9 = 4;
                            i10 = 7;
                            i11 = 8;
                            i3 = 9;
                            i4 = 6;
                            aVar = new a(z4 ? 10 : 11, 0);
                        } else {
                            boolean z5 = cause instanceof HttpDataSource$HttpDataSourceException;
                            if (z5 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                                i3 = 9;
                                if (b660.a(context).b() == 1) {
                                    aVar = new a(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        i4 = 6;
                                        aVar = new a(6, 0);
                                        i8 = 13;
                                        i5 = 8;
                                        i6 = 4;
                                        i7 = 7;
                                        timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                                        subErrorCode = errorCode.setSubErrorCode(aVar.b);
                                        exception = subErrorCode.setException(playbackException);
                                        build = exception.build();
                                        this.c.execute(new tou(1, this, build));
                                        i = 1;
                                        this.C = true;
                                        this.p = null;
                                        i12 = 2;
                                    } else {
                                        i4 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            aVar = new a(7, 0);
                                            i7 = 7;
                                            i8 = 13;
                                            i5 = 8;
                                            i6 = 4;
                                        } else {
                                            i10 = 7;
                                            if (z5 && ((HttpDataSource$HttpDataSourceException) cause).type == 1) {
                                                aVar = new a(4, 0);
                                                i6 = 4;
                                                i7 = 7;
                                                i8 = 13;
                                                i5 = 8;
                                            } else {
                                                i9 = 4;
                                                i11 = 8;
                                                aVar = new a(8, 0);
                                            }
                                        }
                                        timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                                        subErrorCode = errorCode.setSubErrorCode(aVar.b);
                                        exception = subErrorCode.setException(playbackException);
                                        build = exception.build();
                                        this.c.execute(new tou(1, this, build));
                                        i = 1;
                                        this.C = true;
                                        this.p = null;
                                        i12 = 2;
                                    }
                                }
                            } else if (playbackException.errorCode == 1002) {
                                aVar = new a(21, 0);
                            } else if (cause instanceof DrmSession.DrmSessionException) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int B = y2r0.B(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (y2r0.A(B)) {
                                        case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                            i21 = 24;
                                            break;
                                        case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                            i21 = 28;
                                            break;
                                        case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                            i21 = 25;
                                            break;
                                        case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                            i21 = 26;
                                            break;
                                    }
                                    aVar3 = new a(i21, B);
                                } else {
                                    aVar = cause3 instanceof MediaDrmResetException ? new a(27, 0) : cause3 instanceof NotProvisionedException ? new a(24, 0) : cause3 instanceof DeniedByServerException ? new a(29, 0) : cause3 instanceof UnsupportedDrmException ? new a(23, 0) : cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
                                }
                            } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                aVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
                            } else {
                                i3 = 9;
                                aVar = new a(9, 0);
                            }
                            i8 = 13;
                            i4 = 6;
                            i5 = 8;
                            i6 = 4;
                            i7 = 7;
                            timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                            errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                            subErrorCode = errorCode.setSubErrorCode(aVar.b);
                            exception = subErrorCode.setException(playbackException);
                            build = exception.build();
                            this.c.execute(new tou(1, this, build));
                            i = 1;
                            this.C = true;
                            this.p = null;
                            i12 = 2;
                        }
                        i6 = i9;
                        i7 = i10;
                        i5 = i11;
                        i8 = 13;
                        timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                        subErrorCode = errorCode.setSubErrorCode(aVar.b);
                        exception = subErrorCode.setException(playbackException);
                        build = exception.build();
                        this.c.execute(new tou(1, this, build));
                        i = 1;
                        this.C = true;
                        this.p = null;
                        i12 = 2;
                    }
                    aVar = aVar3;
                } else {
                    int i22 = 28;
                    i3 = 9;
                    i4 = 6;
                    i5 = 8;
                    i6 = 4;
                    i7 = 7;
                    if (z && (i2 == 0 || i2 == 1)) {
                        aVar = new a(35, 0);
                    } else if (z && i2 == 3) {
                        aVar = new a(15, 0);
                    } else if (z && i2 == 2) {
                        aVar = new a(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            i8 = 13;
                            aVar2 = new a(13, y2r0.B(((MediaCodecRenderer.DecoderInitializationException) cause).diagnosticInfo));
                        } else {
                            i8 = 13;
                            if (cause instanceof MediaCodecDecoderException) {
                                aVar2 = new a(14, ((MediaCodecDecoderException) cause).errorCode);
                            } else {
                                if (cause instanceof OutOfMemoryError) {
                                    aVar = new a(14, 0);
                                } else if (cause instanceof AudioSink.InitializationException) {
                                    aVar2 = new a(17, ((AudioSink.InitializationException) cause).audioTrackState);
                                } else if (cause instanceof AudioSink.WriteException) {
                                    aVar2 = new a(18, ((AudioSink.WriteException) cause).errorCode);
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (y2r0.A(errorCode2)) {
                                        case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                            i22 = 24;
                                            break;
                                        case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                            break;
                                        case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                            i22 = 25;
                                            break;
                                        case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                            i22 = 26;
                                            break;
                                        default:
                                            i22 = 27;
                                            break;
                                    }
                                    aVar2 = new a(i22, errorCode2);
                                } else {
                                    aVar = new a(22, 0);
                                }
                                timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                                errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                                subErrorCode = errorCode.setSubErrorCode(aVar.b);
                                exception = subErrorCode.setException(playbackException);
                                build = exception.build();
                                this.c.execute(new tou(1, this, build));
                                i = 1;
                                this.C = true;
                                this.p = null;
                                i12 = 2;
                            }
                        }
                        aVar = aVar2;
                        timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                        errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                        subErrorCode = errorCode.setSubErrorCode(aVar.b);
                        exception = subErrorCode.setException(playbackException);
                        build = exception.build();
                        this.c.execute(new tou(1, this, build));
                        i = 1;
                        this.C = true;
                        this.p = null;
                        i12 = 2;
                    }
                    i8 = 13;
                    timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                    errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
                    subErrorCode = errorCode.setSubErrorCode(aVar.b);
                    exception = subErrorCode.setException(playbackException);
                    build = exception.build();
                    this.c.execute(new tou(1, this, build));
                    i = 1;
                    this.C = true;
                    this.p = null;
                    i12 = 2;
                }
            }
            i8 = 13;
            i3 = 9;
            i4 = 6;
            i5 = 8;
            i6 = 4;
            i7 = 7;
            timeSinceCreatedMillis = js10.a().setTimeSinceCreatedMillis(elapsedRealtime - this.f);
            errorCode = timeSinceCreatedMillis.setErrorCode(aVar.a);
            subErrorCode = errorCode.setSubErrorCode(aVar.b);
            exception = subErrorCode.setException(playbackException);
            build = exception.build();
            this.c.execute(new tou(1, this, build));
            i = 1;
            this.C = true;
            this.p = null;
            i12 = 2;
        }
        if (bVar.a(i12)) {
            dip0 j = jza0Var.j();
            boolean a2 = j.a(i12);
            boolean a3 = j.a(i);
            boolean a4 = j.a(3);
            if (a2 || a3 || a4) {
                if (a2) {
                    i13 = i6;
                    aVar4 = null;
                } else {
                    aVar4 = null;
                    if (Objects.equals(this.t, null)) {
                        i13 = i6;
                    } else {
                        int i23 = this.t == null ? 1 : 0;
                        this.t = null;
                        i13 = i6;
                        e(1, elapsedRealtime, null, i23);
                    }
                }
                if (!a3 && !Objects.equals(this.u, aVar4)) {
                    int i24 = this.u == null ? 1 : 0;
                    this.u = aVar4;
                    e(0, elapsedRealtime, aVar4, i24);
                }
                if (!a4 && !Objects.equals(this.v, aVar4)) {
                    int i25 = this.v == null ? 1 : 0;
                    this.v = aVar4;
                    e(2, elapsedRealtime, aVar4, i25);
                }
                bVar2 = aVar4;
                if (a(this.q)) {
                    b bVar3 = this.q;
                    androidx.media3.common.a aVar8 = bVar3.a;
                    if (aVar8.v != -1) {
                        int i26 = bVar3.b;
                        if (!Objects.equals(this.t, aVar8)) {
                            int i27 = (this.t == null && i26 == 0) ? 1 : i26;
                            this.t = aVar8;
                            e(1, elapsedRealtime, aVar8, i27);
                        }
                        this.q = bVar2;
                    }
                }
                if (a(this.r)) {
                    b bVar4 = this.r;
                    androidx.media3.common.a aVar9 = bVar4.a;
                    int i28 = bVar4.b;
                    if (!Objects.equals(this.u, aVar9)) {
                        int i29 = (this.u == null && i28 == 0) ? 1 : i28;
                        this.u = aVar9;
                        e(0, elapsedRealtime, aVar9, i29);
                    }
                    this.r = bVar2;
                }
                if (a(this.s)) {
                    b bVar5 = this.s;
                    androidx.media3.common.a aVar10 = bVar5.a;
                    int i30 = bVar5.b;
                    if (!Objects.equals(this.v, aVar10)) {
                        int i31 = (this.v == null && i30 == 0) ? 1 : i30;
                        this.v = aVar10;
                        e(2, elapsedRealtime, aVar10, i31);
                    }
                    this.s = bVar2;
                }
                switch (b660.a(this.b).b()) {
                    case 0:
                        i14 = 0;
                        break;
                    case 1:
                        i14 = i3;
                        break;
                    case 2:
                        i14 = 2;
                        break;
                    case 3:
                        i14 = i13;
                        break;
                    case 4:
                        i14 = 5;
                        break;
                    case 5:
                        i14 = i4;
                        break;
                    case 6:
                    case 8:
                    default:
                        i14 = 1;
                        break;
                    case 7:
                        i14 = 3;
                        break;
                    case 9:
                        i14 = i5;
                        break;
                    case 10:
                        i14 = i7;
                        break;
                }
                if (i14 != this.o) {
                    this.o = i14;
                    networkType = hhj.a().setNetworkType(i14);
                    timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                    build3 = timeSinceCreatedMillis3.build();
                    this.c.execute(new si0(6, this, build3));
                }
                if (jza0Var.getPlaybackState() != 2) {
                    this.w = false;
                }
                if (jza0Var.b() != null) {
                    this.y = false;
                    i15 = 10;
                } else {
                    i15 = 10;
                    if (bVar.a(10)) {
                        this.y = true;
                    }
                }
                int playbackState = jza0Var.getPlaybackState();
                if (!this.w) {
                    i8 = 5;
                } else if (!this.y) {
                    if (playbackState == i13) {
                        i8 = 11;
                    } else {
                        i8 = 12;
                        if (playbackState == 2) {
                            int i32 = this.n;
                            if (i32 == 0 || i32 == 2 || i32 == 12) {
                                i8 = 2;
                            } else if (jza0Var.getPlayWhenReady()) {
                                if (jza0Var.g() == 0) {
                                    i8 = i4;
                                }
                                i8 = i15;
                            } else {
                                i8 = i7;
                            }
                        } else {
                            i15 = 3;
                            if (playbackState != 3) {
                                z2 = true;
                                if (playbackState != 1 || this.n == 0) {
                                    i8 = this.n;
                                }
                                if (this.n != i8) {
                                    this.n = i8;
                                    this.C = z2;
                                    state = ks10.a().setState(this.n);
                                    timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - this.f);
                                    build2 = timeSinceCreatedMillis2.build();
                                    this.c.execute(new uv6(5, this, build2));
                                }
                                if (bVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                                    okl oklVar3 = this.d;
                                    by1.a aVar11 = bVar.b.get(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
                                    aVar11.getClass();
                                    synchronized (oklVar3) {
                                        try {
                                            String str = oklVar3.f;
                                            if (str != null) {
                                                okl.a aVar12 = oklVar3.c.get(str);
                                                aVar12.getClass();
                                                oklVar3.a(aVar12);
                                            }
                                            Iterator<okl.a> it3 = oklVar3.c.values().iterator();
                                            while (it3.hasNext()) {
                                                okl.a next3 = it3.next();
                                                it3.remove();
                                                if (next3.e && (ps10Var = oklVar3.d) != null) {
                                                    ps10Var.d(aVar11, next3.a);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            if (jza0Var.getPlayWhenReady()) {
                                if (jza0Var.g() != 0) {
                                    i8 = i3;
                                }
                                i8 = i15;
                            } else {
                                i8 = i13;
                            }
                        }
                    }
                }
                z2 = true;
                if (this.n != i8) {
                }
                if (bVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                }
            }
        }
        i13 = i6;
        bVar2 = 0;
        if (a(this.q)) {
        }
        if (a(this.r)) {
        }
        if (a(this.s)) {
        }
        switch (b660.a(this.b).b()) {
        }
        if (i14 != this.o) {
        }
        if (jza0Var.getPlaybackState() != 2) {
        }
        if (jza0Var.b() != null) {
        }
        int playbackState2 = jza0Var.getPlaybackState();
        if (!this.w) {
        }
        z2 = true;
        if (this.n != i8) {
        }
        if (bVar.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
        }
    }

    @Override // xsna.by1
    public final void L(bpz bpzVar, pr10 pr10Var, IOException iOException) {
        this.x = pr10Var.a;
    }

    @Override // xsna.by1
    public final void S(by1.a aVar, pr10 pr10Var) {
        i.b bVar = aVar.d;
        if (bVar == null) {
            return;
        }
        androidx.media3.common.a aVar2 = pr10Var.c;
        aVar2.getClass();
        int i = pr10Var.d;
        ewo0 ewo0Var = aVar.b;
        bVar.getClass();
        b bVar2 = new b(aVar2, i, this.d.c(ewo0Var, bVar));
        int i2 = pr10Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.r = bVar2;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.s = bVar2;
                return;
            }
        }
        this.q = bVar2;
    }

    @Override // xsna.by1
    public final void X(g8l g8lVar) {
        this.z += g8lVar.g;
        this.A += g8lVar.e;
    }

    public final boolean a(@Nullable b bVar) {
        String str;
        if (bVar == null) {
            return false;
        }
        String str2 = bVar.c;
        okl oklVar = this.d;
        synchronized (oklVar) {
            str = oklVar.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.l;
        if (builder != null && this.C) {
            builder.setAudioUnderrunCount(this.B);
            this.l.setVideoFramesDropped(this.z);
            this.l.setVideoFramesPlayed(this.A);
            Long l = this.i.get(this.k);
            this.l.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.j.get(this.k);
            this.l.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.l.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            build = this.l.build();
            this.c.execute(new tzz(1, this, build));
        }
        this.l = null;
        this.k = null;
        this.B = 0;
        this.z = 0;
        this.A = 0;
        this.t = null;
        this.u = null;
        this.v = null;
        this.C = false;
    }

    public final void c(ewo0 ewo0Var, @Nullable i.b bVar) {
        int b2;
        PlaybackMetrics.Builder builder = this.l;
        if (bVar == null || (b2 = ewo0Var.b(bVar.a)) == -1) {
            return;
        }
        ewo0.b bVar2 = this.h;
        int i = 0;
        ewo0Var.f(b2, bVar2, false);
        int i2 = bVar2.c;
        ewo0.c cVar = this.g;
        ewo0Var.n(i2, cVar);
        kr10.f fVar = cVar.c.b;
        if (fVar != null) {
            int J = y2r0.J(fVar.a, fVar.b);
            i = J != 0 ? J != 1 ? J != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (cVar.m != C.TIME_UNSET && !cVar.k && !cVar.i && !cVar.a()) {
            builder.setMediaDurationMillis(y2r0.j0(cVar.m));
        }
        builder.setPlaybackType(cVar.a() ? 2 : 1);
        this.C = true;
    }

    public final void d(by1.a aVar, String str) {
        i.b bVar = aVar.d;
        if ((bVar == null || !bVar.b()) && str.equals(this.k)) {
            b();
        }
        this.i.remove(str);
        this.j.remove(str);
    }

    @Override // xsna.by1
    public final void d0(int i, jza0.c cVar, jza0.c cVar2) {
        if (i == 1) {
            this.w = true;
        }
        this.m = i;
    }

    public final void e(int i, long j, @Nullable androidx.media3.common.a aVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        timeSinceCreatedMillis = fhj.c(i).setTimeSinceCreatedMillis(j - this.f);
        if (aVar != null) {
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
            String str = aVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = aVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = aVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = aVar.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = aVar.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = aVar.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = aVar.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = aVar.G;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = aVar.d;
            if (str4 != null) {
                String str5 = y2r0.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = aVar.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.C = true;
        build = timeSinceCreatedMillis.build();
        this.c.execute(new h12(8, this, build));
    }

    @Override // xsna.by1
    public final void e0(PlaybackException playbackException) {
        this.p = playbackException;
    }

    @Override // xsna.by1
    public final void x(xgt0 xgt0Var) {
        b bVar = this.q;
        if (bVar != null) {
            androidx.media3.common.a aVar = bVar.a;
            if (aVar.v == -1) {
                a.C0043a a2 = aVar.a();
                a2.t = xgt0Var.a;
                a2.u = xgt0Var.b;
                this.q = new b(new androidx.media3.common.a(a2), bVar.b, bVar.c);
            }
        }
    }
}
