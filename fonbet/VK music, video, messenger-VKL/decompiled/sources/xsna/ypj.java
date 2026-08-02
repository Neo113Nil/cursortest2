package xsna;

import com.vk.libvideo.ui.ScreenMode;

/* compiled from: VideoViewControlsVisibilityHandler.kt */
/* loaded from: classes3.dex */
public abstract class ypj {
    public final e a;

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class a extends ypj {
        public final e b;

        public a(e eVar) {
            super(eVar);
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BugReport(screenParams=" + this.b + ')';
        }
    }

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class b extends ypj {
        public final boolean b;
        public final e c;

        public b(boolean z, e eVar) {
            super(eVar);
            this.b = z;
            this.c = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "ChromeCast(isCastEnabled=" + this.b + ", screenParams=" + this.c + ')';
        }
    }

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class c extends ypj {
        public final e b;

        public c(e eVar) {
            super(eVar);
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Feedback(screenParams=" + this.b + ')';
        }
    }

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class d extends ypj {
        public final boolean b;
        public final e c;

        public d(boolean z, e eVar) {
            super(eVar);
            this.b = z;
            this.c = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "Resize(isResizeAllowed=" + this.b + ", screenParams=" + this.c + ')';
        }
    }

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class e {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public e(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenParams(isLandscape=");
            sb.append(this.a);
            sb.append(", isFullscreen=");
            sb.append(this.b);
            sb.append(", isModalOpen=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class f extends ypj {
        public final e b;

        public f(e eVar) {
            super(eVar);
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Settings(screenParams=" + this.b + ')';
        }
    }

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final class g extends ypj {
        public final e b;

        public g(e eVar) {
            super(eVar);
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Smartcast(screenParams=" + this.b + ')';
        }
    }

    public ypj(e eVar) {
        this.a = eVar;
    }

    public final ScreenMode a() {
        e eVar = this.a;
        return !eVar.b ? ScreenMode.DISCOVERY : eVar.a ? ScreenMode.HORIZONTAL_FULLSCREEN : ScreenMode.VERTICAL_FULLSCREEN;
    }
}
