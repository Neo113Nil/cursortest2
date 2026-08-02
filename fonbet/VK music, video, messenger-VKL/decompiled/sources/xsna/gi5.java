package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: AutoPlayState.kt */
/* loaded from: classes16.dex */
public final class gi5 {
    public final com.vk.libvideo.api.ad.a A;
    public final boolean B;
    public final VideoFile a;
    public final Integer b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final AutoPlayMinifiedState h;
    public final boolean i;
    public final OneVideoPlaybackException.ErrorCode j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final long q;
    public final long r;
    public final int s;
    public final List<SubtitleRenderItem> t;
    public final one.video.player.tracks.b u;
    public final boolean v;
    public final float w;
    public final boolean x;
    public final boolean y;
    public final je0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public gi5(VideoFile videoFile, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, AutoPlayMinifiedState autoPlayMinifiedState, boolean z5, OneVideoPlaybackException.ErrorCode errorCode, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, long j, long j2, int i, List<? extends SubtitleRenderItem> list, one.video.player.tracks.b bVar, boolean z12, float f, boolean z13, boolean z14, je0 je0Var, com.vk.libvideo.api.ad.a aVar, boolean z15) {
        this.a = videoFile;
        this.b = num;
        this.c = num2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = autoPlayMinifiedState;
        this.i = z5;
        this.j = errorCode;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = j;
        this.r = j2;
        this.s = i;
        this.t = list;
        this.u = bVar;
        this.v = z12;
        this.w = f;
        this.x = z13;
        this.y = z14;
        this.z = je0Var;
        this.A = aVar;
        this.B = z15;
    }

    public static gi5 a(gi5 gi5Var, VideoFile videoFile, Integer num, Integer num2, boolean z, boolean z2, boolean z3, boolean z4, AutoPlayMinifiedState autoPlayMinifiedState, boolean z5, OneVideoPlaybackException.ErrorCode errorCode, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, long j, long j2, int i, List list, one.video.player.tracks.b bVar, float f, boolean z12, boolean z13, je0 je0Var, com.vk.libvideo.api.ad.a aVar, boolean z14, int i2) {
        boolean z15;
        float f2;
        VideoFile videoFile2 = (i2 & 1) != 0 ? gi5Var.a : videoFile;
        Integer num3 = (i2 & 2) != 0 ? gi5Var.b : num;
        Integer num4 = (i2 & 4) != 0 ? gi5Var.c : num2;
        boolean z16 = (i2 & 8) != 0 ? gi5Var.d : z;
        boolean z17 = (i2 & 16) != 0 ? gi5Var.e : z2;
        boolean z18 = (i2 & 32) != 0 ? gi5Var.f : z3;
        boolean z19 = (i2 & 64) != 0 ? gi5Var.g : z4;
        AutoPlayMinifiedState autoPlayMinifiedState2 = (i2 & 128) != 0 ? gi5Var.h : autoPlayMinifiedState;
        boolean z20 = (i2 & 256) != 0 ? gi5Var.i : z5;
        OneVideoPlaybackException.ErrorCode errorCode2 = (i2 & 512) != 0 ? gi5Var.j : errorCode;
        boolean z21 = (i2 & 1024) != 0 ? gi5Var.k : z6;
        boolean z22 = (i2 & 2048) != 0 ? gi5Var.l : z7;
        boolean z23 = (i2 & 4096) != 0 ? gi5Var.m : z8;
        boolean z24 = (i2 & 8192) != 0 ? gi5Var.n : z9;
        VideoFile videoFile3 = videoFile2;
        boolean z25 = (i2 & 16384) != 0 ? gi5Var.o : z10;
        boolean z26 = (i2 & 32768) != 0 ? gi5Var.p : z11;
        boolean z27 = z25;
        long j3 = (i2 & 65536) != 0 ? gi5Var.q : j;
        long j4 = (i2 & 131072) != 0 ? gi5Var.r : j2;
        int i3 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? gi5Var.s : i;
        List list2 = (i2 & 524288) != 0 ? gi5Var.t : list;
        int i4 = i3;
        if ((i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            bVar = gi5Var.u;
        }
        boolean z28 = gi5Var.v;
        if ((i2 & 4194304) != 0) {
            z15 = z28;
            f2 = gi5Var.w;
        } else {
            z15 = z28;
            f2 = f;
        }
        float f3 = f2;
        boolean z29 = (i2 & 8388608) != 0 ? gi5Var.x : z12;
        boolean z30 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? gi5Var.y : z13;
        je0 je0Var2 = (i2 & 33554432) != 0 ? gi5Var.z : je0Var;
        com.vk.libvideo.api.ad.a aVar2 = (i2 & 67108864) != 0 ? gi5Var.A : aVar;
        boolean z31 = (i2 & 134217728) != 0 ? gi5Var.B : z14;
        gi5Var.getClass();
        return new gi5(videoFile3, num3, num4, z16, z17, z18, z19, autoPlayMinifiedState2, z20, errorCode2, z21, z22, z23, z24, z27, z26, j3, j4, i4, list2, bVar, z15, f3, z29, z30, je0Var2, aVar2, z31);
    }

    public final je0 b() {
        return this.z;
    }

    public final com.vk.libvideo.api.ad.a c() {
        return this.A;
    }

    public final long d() {
        return this.r;
    }

    public final boolean e() {
        return this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi5)) {
            return false;
        }
        gi5 gi5Var = (gi5) obj;
        return epx.f(this.a, gi5Var.a) && epx.f(this.b, gi5Var.b) && epx.f(this.c, gi5Var.c) && this.d == gi5Var.d && this.e == gi5Var.e && this.f == gi5Var.f && this.g == gi5Var.g && this.h == gi5Var.h && this.i == gi5Var.i && this.j == gi5Var.j && this.k == gi5Var.k && this.l == gi5Var.l && this.m == gi5Var.m && this.n == gi5Var.n && this.o == gi5Var.o && this.p == gi5Var.p && this.q == gi5Var.q && this.r == gi5Var.r && this.s == gi5Var.s && epx.f(this.t, gi5Var.t) && epx.f(this.u, gi5Var.u) && this.v == gi5Var.v && Float.compare(this.w, gi5Var.w) == 0 && this.x == gi5Var.x && this.y == gi5Var.y && epx.f(this.z, gi5Var.z) && epx.f(this.A, gi5Var.A) && this.B == gi5Var.B;
    }

    public final AutoPlayMinifiedState f() {
        return this.h;
    }

    public final OneVideoPlaybackException.ErrorCode g() {
        return this.j;
    }

    public final long h() {
        return this.q;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int a = fw3.a(shy.a(this.s, bh10.a(bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.j.hashCode() + qoy.b((this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31), 31, this.t);
        one.video.player.tracks.b bVar = this.u;
        int b = qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.w, qoy.b((a + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.v), 31), 31, this.x), 31, this.y);
        je0 je0Var = this.z;
        int hashCode3 = (b + (je0Var == null ? 0 : je0Var.hashCode())) * 31;
        com.vk.libvideo.api.ad.a aVar = this.A;
        return Boolean.hashCode(this.B) + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.B;
    }

    public final List<SubtitleRenderItem> j() {
        return this.t;
    }

    public final one.video.player.tracks.b k() {
        return this.u;
    }

    public final VideoFile l() {
        return this.a;
    }

    public final boolean m() {
        return this.x;
    }

    public final boolean n() {
        return this.y;
    }

    public final boolean o() {
        return this.l;
    }

    public final boolean p() {
        return this.k;
    }

    public final boolean q() {
        return this.i;
    }

    public final boolean r() {
        return this.p;
    }

    public final boolean s() {
        return this.e;
    }

    public final boolean t() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoPlayState(videoFile=");
        sb.append(this.a);
        sb.append(", videoWidth=");
        sb.append(this.b);
        sb.append(", videoHeight=");
        sb.append(this.c);
        sb.append(", isRestricted=");
        sb.append(this.d);
        sb.append(", isLive=");
        sb.append(this.e);
        sb.append(", canAutoPlayBySystem=");
        sb.append(this.f);
        sb.append(", isUsedInCast=");
        sb.append(this.g);
        sb.append(", minifiedState=");
        sb.append(this.h);
        sb.append(", isError=");
        sb.append(this.i);
        sb.append(", playBackErrorCode=");
        sb.append(this.j);
        sb.append(", isComplete=");
        sb.append(this.k);
        sb.append(", isBuffering=");
        sb.append(this.l);
        sb.append(", isPlaying=");
        sb.append(this.m);
        sb.append(", isPausedByUser=");
        sb.append(this.n);
        sb.append(", isPaused=");
        sb.append(this.o);
        sb.append(", isFirstFrameRendered=");
        sb.append(this.p);
        sb.append(", position=");
        sb.append(this.q);
        sb.append(", duration=");
        sb.append(this.r);
        sb.append(", bufferedPercent=");
        sb.append(this.s);
        sb.append(", subtitleRenderItems=");
        sb.append(this.t);
        sb.append(", subtitleTrack=");
        sb.append(this.u);
        sb.append(", hasAnyAutoSubtitles=");
        sb.append(this.v);
        sb.append(", volume=");
        sb.append(this.w);
        sb.append(", isAdActive=");
        sb.append(this.x);
        sb.append(", isAdPlaying=");
        sb.append(this.y);
        sb.append(", adController=");
        sb.append(this.z);
        sb.append(", adData=");
        sb.append(this.A);
        sb.append(", showPostView=");
        return defpackage.q0.a(sb, this.B, ')');
    }

    public final boolean u() {
        return this.n;
    }

    public final boolean v() {
        return this.m;
    }

    public final boolean w() {
        return this.d;
    }

    public final boolean x() {
        return this.g;
    }

    public gi5(VideoFile videoFile, boolean z, boolean z2, boolean z3, boolean z4, AutoPlayMinifiedState autoPlayMinifiedState, boolean z5, OneVideoPlaybackException.ErrorCode errorCode, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, long j, long j2, int i, one.video.player.tracks.b bVar, boolean z12, float f, boolean z13, boolean z14, int i2) {
        this(videoFile, null, null, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4, (i2 & 128) != 0 ? AutoPlayMinifiedState.NONE : autoPlayMinifiedState, (i2 & 256) != 0 ? false : z5, (i2 & 512) != 0 ? OneVideoPlaybackException.ErrorCode.NO_ERROR : errorCode, (i2 & 1024) != 0 ? false : z6, (i2 & 2048) != 0 ? false : z7, (i2 & 4096) != 0 ? false : z8, (i2 & 8192) != 0 ? false : z9, (i2 & 16384) != 0 ? false : z10, (32768 & i2) != 0 ? false : z11, (65536 & i2) != 0 ? -1L : j, (131072 & i2) != 0 ? 0L : j2, (262144 & i2) != 0 ? 0 : i, EmptyList.b, (1048576 & i2) != 0 ? null : bVar, (2097152 & i2) != 0 ? false : z12, (4194304 & i2) != 0 ? 0.0f : f, (8388608 & i2) != 0 ? false : z13, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? false : z14, null, null, false);
    }
}
