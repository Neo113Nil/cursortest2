package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.fs1;
import xsna.qtk0;
import xsna.y88;

/* compiled from: VideoProfileState.kt */
/* loaded from: classes6.dex */
public abstract class c9t0 implements km50 {
    public final VideoProfileSource b;

    /* compiled from: VideoProfileState.kt */
    public static final class a extends b {
        public final VideoProfileSource c;
        public final List<Integer> d;
        public final boolean e;
        public final y88 f;
        public final fs1 g;

        public a(VideoProfileSource videoProfileSource, List<Integer> list, boolean z, y88 y88Var, fs1 fs1Var) {
            super(videoProfileSource);
            this.c = videoProfileSource;
            this.d = list;
            this.e = z;
            this.f = y88Var;
            this.g = fs1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a h(a aVar, VideoProfileSource videoProfileSource, ArrayList arrayList, boolean z, y88 y88Var, fs1 fs1Var, int i) {
            if ((i & 1) != 0) {
                videoProfileSource = aVar.c;
            }
            VideoProfileSource videoProfileSource2 = videoProfileSource;
            List list = arrayList;
            if ((i & 2) != 0) {
                list = aVar.d;
            }
            List list2 = list;
            if ((i & 4) != 0) {
                z = aVar.e;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                y88Var = aVar.f;
            }
            y88 y88Var2 = y88Var;
            if ((i & 16) != 0) {
                fs1Var = aVar.g;
            }
            aVar.getClass();
            return new a(videoProfileSource2, list2, z2, y88Var2, fs1Var);
        }

        @Override // xsna.c9t0
        public final fs1 a() {
            return this.g;
        }

        @Override // xsna.c9t0
        public final y88 b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + qoy.b(fw3.a(this.c.hashCode() * 31, 31, this.d), 31, this.e)) * 31);
        }

        public final String toString() {
            return "Anonymous(profileSource=" + this.c + ", shownContentWarningsIds=" + this.d + ", isReloading=" + this.e + ", bottomSheet=" + this.f + ", alertDialog=" + this.g + ')';
        }
    }

    /* compiled from: VideoProfileState.kt */
    public static abstract class b extends c9t0 {
    }

    /* compiled from: VideoProfileState.kt */
    public static final class d extends c9t0 {
        public final VideoProfileSource c;

        public d(VideoProfileSource videoProfileSource) {
            super(videoProfileSource);
            this.c = videoProfileSource;
        }

        @Override // xsna.c9t0
        public final /* bridge */ /* synthetic */ fs1 a() {
            return fs1.c.a;
        }

        @Override // xsna.c9t0
        public final /* bridge */ /* synthetic */ y88 b() {
            return y88.b.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.c, ((d) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "Init(profileSource=" + this.c + ')';
        }
    }

    public c9t0(VideoProfileSource videoProfileSource) {
        this.b = videoProfileSource;
    }

    public static c9t0 c(c9t0 c9t0Var, y88 y88Var) {
        VideoProfileSource videoProfileSource = c9t0Var.b;
        fs1 a2 = c9t0Var.a();
        c9t0Var.getClass();
        return c9t0Var instanceof a ? a.h((a) c9t0Var, videoProfileSource, null, false, y88Var, a2, 6) : c9t0Var instanceof e ? e.h((e) c9t0Var, videoProfileSource, null, false, false, null, y88Var, a2, false, Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE) : c9t0Var instanceof c ? c.h((c) c9t0Var, videoProfileSource, null, null, y88Var, a2, 78) : c9t0Var;
    }

    public abstract fs1 a();

    public abstract y88 b();

    /* compiled from: VideoProfileState.kt */
    public static final class c extends b {
        public final VideoProfileSource c;
        public final Throwable d;
        public final UserId e;
        public final List<Integer> f;
        public final y88 g;
        public final fs1 h;

        public c(VideoProfileSource videoProfileSource, Throwable th, UserId userId, List list, y88 y88Var, fs1 fs1Var) {
            super(videoProfileSource);
            this.c = videoProfileSource;
            this.d = th;
            this.e = userId;
            this.f = list;
            this.g = y88Var;
            this.h = fs1Var;
        }

        public static c h(c cVar, VideoProfileSource videoProfileSource, Throwable th, UserId userId, y88 y88Var, fs1 fs1Var, int i) {
            if ((i & 1) != 0) {
                videoProfileSource = cVar.c;
            }
            VideoProfileSource videoProfileSource2 = videoProfileSource;
            if ((i & 2) != 0) {
                th = cVar.d;
            }
            Throwable th2 = th;
            if ((i & 4) != 0) {
                userId = cVar.e;
            }
            UserId userId2 = userId;
            List<Integer> list = cVar.f;
            if ((i & 16) != 0) {
                y88Var = cVar.g;
            }
            y88 y88Var2 = y88Var;
            if ((i & 32) != 0) {
                fs1Var = cVar.h;
            }
            cVar.getClass();
            cVar.getClass();
            return new c(videoProfileSource2, th2, userId2, list, y88Var2, fs1Var);
        }

        @Override // xsna.c9t0
        public final fs1 a() {
            return this.h;
        }

        @Override // xsna.c9t0
        public final y88 b() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + ((this.h.hashCode() + ((this.g.hashCode() + fw3.a(bh10.a((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e.b), 31, this.f)) * 31)) * 31);
        }

        public final String toString() {
            return "Error(profileSource=" + this.c + ", error=" + this.d + ", ownerId=" + this.e + ", shownContentWarningsIds=" + this.f + ", bottomSheet=" + this.g + ", alertDialog=" + this.h + ", isReloading=false)";
        }

        public c(VideoProfileSource videoProfileSource, Throwable th, UserId userId) {
            this(videoProfileSource, th, userId, EmptyList.b, y88.b.a, fs1.c.a);
        }
    }

    /* compiled from: VideoProfileState.kt */
    public static final class e extends b {
        public final VideoProfileSource c;
        public final qtk0<List<u490>> d;
        public final qtk0<u490> e;
        public final boolean f;
        public final boolean g;
        public final List<Integer> h;
        public final y88 i;
        public final fs1 j;
        public final boolean k;

        public e(VideoProfileSource videoProfileSource, qtk0<List<u490>> qtk0Var, qtk0<u490> qtk0Var2, boolean z, boolean z2, List<Integer> list, y88 y88Var, fs1 fs1Var, boolean z3) {
            super(videoProfileSource);
            this.c = videoProfileSource;
            this.d = qtk0Var;
            this.e = qtk0Var2;
            this.f = z;
            this.g = z2;
            this.h = list;
            this.i = y88Var;
            this.j = fs1Var;
            this.k = z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static e h(e eVar, VideoProfileSource videoProfileSource, qtk0.a aVar, boolean z, boolean z2, ArrayList arrayList, y88 y88Var, fs1 fs1Var, boolean z3, int i) {
            if ((i & 1) != 0) {
                videoProfileSource = eVar.c;
            }
            VideoProfileSource videoProfileSource2 = videoProfileSource;
            qtk0<List<u490>> qtk0Var = eVar.d;
            qtk0 qtk0Var2 = aVar;
            if ((i & 4) != 0) {
                qtk0Var2 = eVar.e;
            }
            qtk0 qtk0Var3 = qtk0Var2;
            if ((i & 8) != 0) {
                z = eVar.f;
            }
            boolean z4 = z;
            if ((i & 16) != 0) {
                z2 = eVar.g;
            }
            boolean z5 = z2;
            List list = arrayList;
            if ((i & 32) != 0) {
                list = eVar.h;
            }
            List list2 = list;
            y88 y88Var2 = (i & 64) != 0 ? eVar.i : y88Var;
            fs1 fs1Var2 = (i & 128) != 0 ? eVar.j : fs1Var;
            boolean z6 = (i & 256) != 0 ? eVar.k : z3;
            eVar.getClass();
            return new e(videoProfileSource2, qtk0Var, qtk0Var3, z4, z5, list2, y88Var2, fs1Var2, z6);
        }

        @Override // xsna.c9t0
        public final fs1 a() {
            return this.j;
        }

        @Override // xsna.c9t0
        public final y88 b() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && this.f == eVar.f && this.g == eVar.g && epx.f(this.h, eVar.h) && epx.f(this.i, eVar.i) && epx.f(this.j, eVar.j) && this.k == eVar.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((this.i.hashCode() + fw3.a(qoy.b(qoy.b((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoggedIn(profileSource=");
            sb.append(this.c);
            sb.append(", pickerProfiles=");
            sb.append(this.d);
            sb.append(", currentOwner=");
            sb.append(this.e);
            sb.append(", isOwnerPickerShown=");
            sb.append(this.f);
            sb.append(", isSubscribing=");
            sb.append(this.g);
            sb.append(", shownContentWarningsIds=");
            sb.append(this.h);
            sb.append(", bottomSheet=");
            sb.append(this.i);
            sb.append(", alertDialog=");
            sb.append(this.j);
            sb.append(", isReloading=");
            return defpackage.q0.a(sb, this.k, ')');
        }

        public e(VideoProfileSource videoProfileSource, qtk0 qtk0Var, qtk0 qtk0Var2) {
            this(videoProfileSource, qtk0Var, qtk0Var2, false, false, EmptyList.b, y88.b.a, fs1.c.a, false);
        }
    }
}
