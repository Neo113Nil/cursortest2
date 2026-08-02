package one.video.controls20;

import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import xsna.epx;

/* compiled from: ControlsUiEvent.kt */
/* loaded from: classes8.dex */
public abstract class a {

    /* compiled from: ControlsUiEvent.kt */
    /* renamed from: one.video.controls20.a$a, reason: collision with other inner class name */
    public static final class C2179a extends a {
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class b extends a {
        public static final b a = new b();
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class c extends a {
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class d extends a {
        public final AdaptiveTrackSelectionInterval a;

        public d(AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval) {
            this.a = adaptiveTrackSelectionInterval;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "IntervalUpdated(interval=" + this.a + ")";
        }
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class e extends a {
        public final float a;

        public e(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Float.compare(this.a, ((e) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return "PlaybackSpeedChanged(speed=" + this.a + ")";
        }
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class f extends a {
        public final long a;
        public final boolean b;

        public f(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "SeekPositionChanged(position=" + this.a + ", fromUser=" + this.b + ")";
        }
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class g extends a {
        public static final g a = new g();
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class h extends a {
        public static final h a = new h();
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class i extends a {
        public final one.video.player.tracks.c a;

        public i(one.video.player.tracks.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            one.video.player.tracks.c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public final String toString() {
            return "TrackSelected(videoTrack=" + this.a + ")";
        }
    }

    /* compiled from: ControlsUiEvent.kt */
    public static final class j extends a {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("VisibilityChanged(isVisible=", ")", this.a);
        }
    }
}
