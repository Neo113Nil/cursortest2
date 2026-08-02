package xsna;

import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;

/* compiled from: ClipsPublishViewerOverlayAction.kt */
/* loaded from: classes17.dex */
public interface lze extends kj50 {

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class a implements lze {
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class b implements lze {
        public static final b b = new b();
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class c implements lze {
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class d implements lze {
        public final ClipPreviewInputParams b;
        public final cv10 c;
        public final MobileOfficialAppsClipsStat$ClipsCreateContext d;

        public d(ClipPreviewInputParams clipPreviewInputParams, cv10 cv10Var, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext) {
            this.b = clipPreviewInputParams;
            this.c = cv10Var;
            this.d = mobileOfficialAppsClipsStat$ClipsCreateContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Init(inputParams=" + this.b + ", playbackController=" + this.c + ", creationContext=" + this.d + ')';
        }
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class e implements lze {
        public static final e b = new e();
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class f implements lze {
        public static final f b = new f();
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class g implements lze {
        public static final g b = new g();
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class h implements lze {
        public static final h b = new h();
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class i implements lze {
        public final long b;

        public i(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("OnPlaybackProgress(time="));
        }
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class j implements lze {
        public static final j b = new j();
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class k implements lze {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            ((k) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Long.hashCode(0L) * 31);
        }

        public final String toString() {
            return "OnSeek(timestamp=0, fromPlayerProgress=false)";
        }
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class l implements lze {
        public final float b;

        public l(float f) {
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.b, ((l) obj).b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b);
        }

        public final String toString() {
            return xq.c(')', this.b, new StringBuilder("OnSeekbarValueChange(progress="));
        }
    }

    /* compiled from: ClipsPublishViewerOverlayAction.kt */
    public static final class m implements lze {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            ((m) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        public final String toString() {
            return "SetReadyForEvents(ready=true)";
        }
    }
}
