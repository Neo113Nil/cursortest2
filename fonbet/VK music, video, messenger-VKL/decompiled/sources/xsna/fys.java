package xsna;

import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenOrientationLockType;

/* compiled from: FullscreenLockViewState.kt */
/* loaded from: classes7.dex */
public interface fys {

    /* compiled from: FullscreenLockViewState.kt */
    public static final class a implements fys {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1731197232;
        }

        public final String toString() {
            return "AnimatingToUnlock";
        }
    }

    /* compiled from: FullscreenLockViewState.kt */
    public static final class b implements fys {
        public final FullscreenOrientationLockType a;
        public final boolean b;
        public final boolean c;

        public b(FullscreenOrientationLockType fullscreenOrientationLockType, boolean z, boolean z2) {
            this.a = fullscreenOrientationLockType;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Locked(fullscreenOrientationLockType=");
            sb.append(this.a);
            sb.append(", isSilentLockMode=");
            sb.append(this.b);
            sb.append(", isVerticalVideo=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: FullscreenLockViewState.kt */
    public static final class c implements fys {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("PartiallyUnlocked(isVerticalVideo="), this.a, ')');
        }
    }

    /* compiled from: FullscreenLockViewState.kt */
    public static final class d implements fys {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1616276624;
        }

        public final String toString() {
            return "Unlocked";
        }
    }
}
