package xsna;

import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;

/* compiled from: DialogsUiEvent.kt */
/* loaded from: classes8.dex */
public abstract class qwm {

    /* compiled from: DialogsUiEvent.kt */
    public static final class a extends qwm {
        public final AdaptiveTrackSelectionInterval a;

        public a(AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval) {
            this.a = adaptiveTrackSelectionInterval;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "IntervalUpdated(interval=" + this.a + ")";
        }
    }

    /* compiled from: DialogsUiEvent.kt */
    public static final class b extends qwm {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return "PlaybackSpeedChanged(speed=" + this.a + ")";
        }
    }

    /* compiled from: DialogsUiEvent.kt */
    public static final class c extends qwm {
        public final one.video.player.tracks.c a;

        public c(one.video.player.tracks.c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
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
}
