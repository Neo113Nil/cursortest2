package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.List;

/* compiled from: ClipsPublishViewerOverlayPatch.kt */
/* loaded from: classes17.dex */
public interface yze extends xl50 {

    /* compiled from: ClipsPublishViewerOverlayPatch.kt */
    public static final class a implements yze {
    }

    /* compiled from: ClipsPublishViewerOverlayPatch.kt */
    public static final class b implements yze {
        public final Timeline b;
        public final ClipsDraftVk c;
        public final List<uq10> d;
        public final cv10 e;
        public final MobileOfficialAppsClipsStat$ClipsCreateContext f;
        public final boolean g;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Timeline timeline, ClipsDraftVk clipsDraftVk, List<? extends uq10> list, cv10 cv10Var, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, boolean z) {
            this.b = timeline;
            this.c = clipsDraftVk;
            this.d = list;
            this.e = cv10Var;
            this.f = mobileOfficialAppsClipsStat$ClipsCreateContext;
            this.g = z;
        }
    }

    /* compiled from: ClipsPublishViewerOverlayPatch.kt */
    public static final class c implements yze {
        public static final c b = new c();
    }

    /* compiled from: ClipsPublishViewerOverlayPatch.kt */
    public static final class d implements yze {
        public static final d b = new d();
    }

    /* compiled from: ClipsPublishViewerOverlayPatch.kt */
    public static final class e implements yze {
        public final long b;
        public final boolean c;

        public e(long j, boolean z) {
            this.b = j;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SeekTo(timestamp=");
            sb.append(this.b);
            sb.append(", seekPlayer=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPublishViewerOverlayPatch.kt */
    public static final class f implements yze {
    }
}
