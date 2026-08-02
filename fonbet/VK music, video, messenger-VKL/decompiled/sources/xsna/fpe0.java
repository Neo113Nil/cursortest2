package xsna;

import one.video.player.model.FrameSize;

/* compiled from: QualityPreset.kt */
/* loaded from: classes7.dex */
public interface fpe0 {

    /* compiled from: QualityPreset.kt */
    public static final class a implements fpe0 {
        public static final a a = new a();
    }

    /* compiled from: QualityPreset.kt */
    public static final class b implements fpe0 {
        public static final b a = new b();
    }

    /* compiled from: QualityPreset.kt */
    public static final class c implements fpe0 {
        public static final c a = new c();
    }

    /* compiled from: QualityPreset.kt */
    public static final class d implements fpe0 {
        public final FrameSize a;

        public d(FrameSize frameSize) {
            this.a = frameSize;
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
            return "Other(quality=" + this.a + ')';
        }
    }
}
