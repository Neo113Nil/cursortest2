package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.movika.sdk.base.model.Chapter;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.rcx;

/* compiled from: InteractiveVideoPlayer.kt */
/* loaded from: classes3.dex */
public final class ocx {
    public final b a;
    public final Chapter b;
    public final boolean c;
    public final List<com.vk.movika.sdk.base.model.i> d;
    public final com.vk.movika.sdk.base.model.t e;
    public final c f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Throwable j;
    public final Long k;
    public final owo0 l;
    public final e m;
    public final d n;
    public final Float o;
    public final int p;
    public final float q;
    public final com.vk.libvideo.autoplay.a r;
    public final VideoFile s;
    public final boolean t;
    public final a u;
    public final String v;

    /* compiled from: InteractiveVideoPlayer.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtendSeekBarState(isActive=");
            sb.append(this.a);
            sb.append(", isOpened=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: InteractiveVideoPlayer.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b() {
            this(true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayState(play=");
            sb.append(this.a);
            sb.append(", byUser=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: InteractiveVideoPlayer.kt */
    public static abstract class c {

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class a extends c {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Ended(isCustom="), this.a, ')');
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class b extends c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -735061704;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        /* renamed from: xsna.ocx$c$c, reason: collision with other inner class name */
        public static final class C3448c extends c {
            public static final C3448c a = new C3448c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3448c);
            }

            public final int hashCode() {
                return -1861176910;
            }

            public final String toString() {
                return "Paused";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class d extends c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1565276118;
            }

            public final String toString() {
                return "Playing";
            }
        }
    }

    /* compiled from: InteractiveVideoPlayer.kt */
    public static abstract class d {

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class a extends d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1364207795;
            }

            public final String toString() {
                return "Available";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class b extends d {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 641371509;
            }

            public final String toString() {
                return "FirstChapterPlaying";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class c extends d {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1636176018;
            }

            public final String toString() {
                return "HistoryNotAvailable";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        /* renamed from: xsna.ocx$d$d, reason: collision with other inner class name */
        public static final class C3449d extends d {
            public static final C3449d a = new C3449d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3449d);
            }

            public final int hashCode() {
                return -480887277;
            }

            public final String toString() {
                return "LimitReached";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class e extends d {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1122322894;
            }

            public final String toString() {
                return DeviceInfo.STR_TYPE_UNKNOWN;
            }
        }
    }

    /* compiled from: InteractiveVideoPlayer.kt */
    public static abstract class e {

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class a extends e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1856679638;
            }

            public final String toString() {
                return "Available";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class b extends e {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1545724084;
            }

            public final String toString() {
                return "EventAlreadyShown";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class c extends e {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -802678061;
            }

            public final String toString() {
                return "EventsCompleted";
            }
        }

        /* compiled from: InteractiveVideoPlayer.kt */
        public static final class d extends e {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 354103225;
            }

            public final String toString() {
                return "NoEvents";
            }
        }
    }

    public ocx() {
        this(null, null, false, false, 0, null, null, false, null, 4194303);
    }

    public static ocx a(ocx ocxVar, b bVar, Chapter chapter, boolean z, List list, com.vk.movika.sdk.base.model.t tVar, c cVar, boolean z2, boolean z3, Throwable th, Long l, owo0 owo0Var, e eVar, d dVar, Float f, int i, float f2, com.vk.libvideo.autoplay.a aVar, VideoFile videoFile, boolean z4, a aVar2, int i2) {
        b bVar2 = (i2 & 1) != 0 ? ocxVar.a : bVar;
        Chapter chapter2 = (i2 & 2) != 0 ? ocxVar.b : chapter;
        boolean z5 = (i2 & 4) != 0 ? ocxVar.c : z;
        List list2 = (i2 & 8) != 0 ? ocxVar.d : list;
        com.vk.movika.sdk.base.model.t tVar2 = (i2 & 16) != 0 ? ocxVar.e : tVar;
        c cVar2 = (i2 & 32) != 0 ? ocxVar.f : cVar;
        boolean z6 = (i2 & 64) != 0 ? ocxVar.g : true;
        boolean z7 = (i2 & 128) != 0 ? ocxVar.h : z2;
        boolean z8 = (i2 & 256) != 0 ? ocxVar.i : z3;
        Throwable th2 = (i2 & 512) != 0 ? ocxVar.j : th;
        Long l2 = (i2 & 1024) != 0 ? ocxVar.k : l;
        owo0 owo0Var2 = (i2 & 2048) != 0 ? ocxVar.l : owo0Var;
        e eVar2 = (i2 & 4096) != 0 ? ocxVar.m : eVar;
        d dVar2 = (i2 & 8192) != 0 ? ocxVar.n : dVar;
        Float f3 = (i2 & 16384) != 0 ? ocxVar.o : f;
        int i3 = (32768 & i2) != 0 ? ocxVar.p : i;
        float f4 = (65536 & i2) != 0 ? ocxVar.q : f2;
        com.vk.libvideo.autoplay.a aVar3 = (131072 & i2) != 0 ? ocxVar.r : aVar;
        VideoFile videoFile2 = (262144 & i2) != 0 ? ocxVar.s : videoFile;
        boolean z9 = (524288 & i2) != 0 ? ocxVar.t : z4;
        a aVar4 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? ocxVar.u : aVar2;
        String str = ocxVar.v;
        ocxVar.getClass();
        return new ocx(bVar2, chapter2, z5, list2, tVar2, cVar2, z6, z7, z8, th2, l2, owo0Var2, eVar2, dVar2, f3, i3, f4, aVar3, videoFile2, z9, aVar4, str);
    }

    public final rcx.c b() {
        rcx.a aVar;
        boolean z = this.a.a;
        Float f = this.o;
        float floatValue = f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c cVar = this.f;
        if (cVar instanceof c.a) {
            aVar = rcx.a.C3604a.a;
        } else if (cVar instanceof c.b) {
            aVar = rcx.a.b.a;
        } else if (cVar instanceof c.C3448c) {
            aVar = rcx.a.c.a;
        } else {
            if (!(cVar instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = rcx.a.d.a;
        }
        rcx.a aVar2 = aVar;
        VideoFile videoFile = this.s;
        return new rcx.c(z, floatValue, aVar2, this.v, videoFile != null ? videoFile.a1() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocx)) {
            return false;
        }
        ocx ocxVar = (ocx) obj;
        return epx.f(this.a, ocxVar.a) && epx.f(this.b, ocxVar.b) && this.c == ocxVar.c && epx.f(this.d, ocxVar.d) && epx.f(this.e, ocxVar.e) && epx.f(this.f, ocxVar.f) && this.g == ocxVar.g && this.h == ocxVar.h && this.i == ocxVar.i && epx.f(this.j, ocxVar.j) && epx.f(this.k, ocxVar.k) && epx.f(this.l, ocxVar.l) && epx.f(this.m, ocxVar.m) && epx.f(this.n, ocxVar.n) && epx.f(this.o, ocxVar.o) && this.p == ocxVar.p && Float.compare(this.q, ocxVar.q) == 0 && epx.f(this.r, ocxVar.r) && epx.f(this.s, ocxVar.s) && this.t == ocxVar.t && epx.f(this.u, ocxVar.u) && epx.f(this.v, ocxVar.v);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Chapter chapter = this.b;
        int b2 = qoy.b(qoy.b(qoy.b((this.f.hashCode() + ((this.e.hashCode() + fw3.a(qoy.b((hashCode + (chapter == null ? 0 : chapter.a.hashCode())) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
        Throwable th = this.j;
        int hashCode2 = (b2 + (th == null ? 0 : th.hashCode())) * 31;
        Long l = this.k;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        owo0 owo0Var = this.l;
        int hashCode4 = (this.n.hashCode() + ((this.m.hashCode() + ((hashCode3 + (owo0Var == null ? 0 : owo0Var.hashCode())) * 31)) * 31)) * 31;
        Float f = this.o;
        int hashCode5 = (this.r.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.q, shy.a(this.p, (hashCode4 + (f == null ? 0 : f.hashCode())) * 31, 31), 31)) * 31;
        VideoFile videoFile = this.s;
        int hashCode6 = (this.u.hashCode() + qoy.b((hashCode5 + (videoFile == null ? 0 : videoFile.hashCode())) * 31, 31, this.t)) * 31;
        String str = this.v;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveVideoState(playState=");
        sb.append(this.a);
        sb.append(", currentChapter=");
        sb.append(this.b);
        sb.append(", isInteractiveShown=");
        sb.append(this.c);
        sb.append(", episodes=");
        sb.append(this.d);
        sb.append(", maxSeekPosition=");
        sb.append(this.e);
        sb.append(", playbackState=");
        sb.append(this.f);
        sb.append(", isDestroyed=");
        sb.append(this.g);
        sb.append(", isNotInterested=");
        sb.append(this.h);
        sb.append(", isRestricted=");
        sb.append(this.i);
        sb.append(", error=");
        sb.append(this.j);
        sb.append(", duration=");
        sb.append(this.k);
        sb.append(", timelineImages=");
        sb.append(this.l);
        sb.append(", skipToEventAvailability=");
        sb.append(this.m);
        sb.append(", seekToPreviousChapterAvailability=");
        sb.append(this.n);
        sb.append(", volume=");
        sb.append(this.o);
        sb.append(", quality=");
        sb.append(this.p);
        sb.append(", playbackSpeed=");
        sb.append(this.q);
        sb.append(", config=");
        sb.append(this.r);
        sb.append(", videoFile=");
        sb.append(this.s);
        sb.append(", isFave=");
        sb.append(this.t);
        sb.append(", extendSeekBarState=");
        sb.append(this.u);
        sb.append(", interactiveSessionVideoId=");
        return ho8.a(sb, this.v, ')');
    }

    public ocx(b bVar, Chapter chapter, boolean z, List<com.vk.movika.sdk.base.model.i> list, com.vk.movika.sdk.base.model.t tVar, c cVar, boolean z2, boolean z3, boolean z4, Throwable th, Long l, owo0 owo0Var, e eVar, d dVar, Float f, int i, float f2, com.vk.libvideo.autoplay.a aVar, VideoFile videoFile, boolean z5, a aVar2, String str) {
        this.a = bVar;
        this.b = chapter;
        this.c = z;
        this.d = list;
        this.e = tVar;
        this.f = cVar;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = th;
        this.k = l;
        this.l = owo0Var;
        this.m = eVar;
        this.n = dVar;
        this.o = f;
        this.p = i;
        this.q = f2;
        this.r = aVar;
        this.s = videoFile;
        this.t = z5;
        this.u = aVar2;
        this.v = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ocx(b bVar, c cVar, boolean z, boolean z2, int i, com.vk.libvideo.autoplay.a aVar, VideoFile videoFile, boolean z3, String str, int i2) {
        this(r4, null, false, r7, com.vk.movika.sdk.base.model.t.a, (i2 & 32) != 0 ? c.b.a : cVar, false, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2, null, null, null, e.d.a, d.c.a, null, (32768 & i2) != 0 ? -1 : i, 1.0f, (131072 & i2) != 0 ? com.vk.libvideo.autoplay.a.t : aVar, (262144 & i2) != 0 ? null : videoFile, (524288 & i2) != 0 ? false : z3, new a(false, false), (i2 & 2097152) != 0 ? null : str);
        b bVar2 = (i2 & 1) != 0 ? new b(true, true) : bVar;
        EmptyList emptyList = EmptyList.b;
        com.vk.movika.sdk.base.model.t.Companion.getClass();
    }
}
