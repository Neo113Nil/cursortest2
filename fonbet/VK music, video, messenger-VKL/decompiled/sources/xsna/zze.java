package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.List;

/* compiled from: ClipsPublishViewerOverlayState.kt */
/* loaded from: classes17.dex */
public interface zze extends km50 {

    /* compiled from: ClipsPublishViewerOverlayState.kt */
    public static final class a implements zze {
        public final Timeline b;
        public final long c;
        public final boolean d;
        public final long e;
        public final boolean f;
        public final List<uq10> g;
        public final ClipVideoFile h;
        public final boolean i;
        public final cv10 j;
        public final MobileOfficialAppsClipsStat$ClipsCreateContext k;
        public final boolean l;
        public final f100 m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Timeline timeline, long j, boolean z, long j2, boolean z2, List<? extends uq10> list, ClipVideoFile clipVideoFile, boolean z3, cv10 cv10Var, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, boolean z4, f100 f100Var) {
            this.b = timeline;
            this.c = j;
            this.d = z;
            this.e = j2;
            this.f = z2;
            this.g = list;
            this.h = clipVideoFile;
            this.i = z3;
            this.j = cv10Var;
            this.k = mobileOfficialAppsClipsStat$ClipsCreateContext;
            this.l = z4;
            this.m = f100Var;
        }

        public static a a(a aVar, long j, boolean z, boolean z2, int i) {
            Timeline timeline = aVar.b;
            long j2 = (i & 2) != 0 ? aVar.c : j;
            boolean z3 = (i & 4) != 0 ? aVar.d : z;
            long j3 = (i & 8) != 0 ? aVar.e : 0L;
            boolean z4 = (i & 16) != 0 ? aVar.f : true;
            List<uq10> list = aVar.g;
            long j4 = j2;
            boolean z5 = z3;
            long j5 = j3;
            boolean z6 = z4;
            ClipVideoFile clipVideoFile = aVar.h;
            boolean z7 = (i & 128) != 0 ? aVar.i : z2;
            cv10 cv10Var = aVar.j;
            MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = aVar.k;
            boolean z8 = aVar.l;
            f100 f100Var = aVar.m;
            aVar.getClass();
            return new a(timeline, j4, z5, j5, z6, list, clipVideoFile, z7, cv10Var, mobileOfficialAppsClipsStat$ClipsCreateContext, z8, f100Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && this.l == aVar.l && epx.f(this.m, aVar.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + qoy.b((this.k.hashCode() + ((this.j.hashCode() + qoy.b((this.h.hashCode() + fw3.a(qoy.b(bh10.a(qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i)) * 31)) * 31, 31, this.l);
        }

        public final String toString() {
            return "Content(timeline=" + this.b + ", timestamp=" + this.c + ", isPlaying=" + this.d + ", duration=" + this.e + ", readyForEvents=" + this.f + ", layers=" + this.g + ", file=" + this.h + ", needsPlayerSeekToTs=" + this.i + ", playbackController=" + this.j + ", createContext=" + this.k + ", isDraftEnabled=" + this.l + ", logger=" + this.m + ')';
        }
    }

    /* compiled from: ClipsPublishViewerOverlayState.kt */
    public static final class b implements zze {
        public static final b b = new b();
    }
}
