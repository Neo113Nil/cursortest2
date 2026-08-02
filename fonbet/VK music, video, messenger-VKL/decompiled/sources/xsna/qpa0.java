package xsna;

import xsna.rkp0;

/* compiled from: PipelineStatus.kt */
/* loaded from: classes3.dex */
public interface qpa0 {

    /* compiled from: PipelineStatus.kt */
    public static final class a implements qpa0 {
        public static final a a = new a();

        public final String toString() {
            return "Media pipeline has been canceled";
        }
    }

    /* compiled from: PipelineStatus.kt */
    public static final class b implements qpa0 {
        public final rkp0 a;
        public final boolean b;

        public b(rkp0 rkp0Var) {
            this.a = rkp0Var;
            this.b = rkp0Var instanceof rkp0.b;
        }

        public final String toString() {
            return "Media pipeline has completed successfully. Transform type: " + this.a;
        }
    }

    /* compiled from: PipelineStatus.kt */
    public static final class c implements qpa0 {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public final String toString() {
            return "Media pipeline failed: " + this.a;
        }
    }

    /* compiled from: PipelineStatus.kt */
    public static final class d implements qpa0 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final String toString() {
            return "Media pipeline is running".concat(this.a ? " (playback)" : "");
        }
    }
}
