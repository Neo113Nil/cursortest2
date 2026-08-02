package xsna;

import com.vk.dto.stories.entities.OrdData;
import com.vk.video.ui.upload.api.router.AttachedClipsResult;

/* compiled from: SettingsAction.kt */
/* loaded from: classes7.dex */
public interface q0j0 extends lj50 {

    /* compiled from: SettingsAction.kt */
    public interface a extends q0j0 {

        /* compiled from: SettingsAction.kt */
        /* renamed from: xsna.q0j0$a$a, reason: collision with other inner class name */
        public static final class C3542a implements a {
            public final AttachedClipsResult b;

            public C3542a(AttachedClipsResult attachedClipsResult) {
                this.b = attachedClipsResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3542a) && epx.f(this.b, ((C3542a) obj).b);
            }

            public final int hashCode() {
                return this.b.b.hashCode();
            }

            public final String toString() {
                return "ActivityResult(result=" + this.b + ')';
            }
        }

        /* compiled from: SettingsAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2125879982;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: SettingsAction.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("ClipClick(clipId="), this.b, ')');
            }
        }

        /* compiled from: SettingsAction.kt */
        public static final class d implements a {
            public final String b;

            public d(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ClipRemoveClick(clipId="), this.b, ')');
            }
        }
    }

    /* compiled from: SettingsAction.kt */
    public interface b extends q0j0 {

        /* compiled from: SettingsAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -919625457;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        /* compiled from: SettingsAction.kt */
        /* renamed from: xsna.q0j0$b$b, reason: collision with other inner class name */
        public static final class C3543b implements b {
            public final e8v0 b;

            public C3543b(e8v0 e8v0Var) {
                this.b = e8v0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3543b) && epx.f(this.b, ((C3543b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "StatEvent(event=" + this.b + ')';
            }
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class c implements q0j0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1943252587;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class d implements q0j0, uj50 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CommunityPostChanged(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class e implements q0j0, uj50 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CompressChanged(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: SettingsAction.kt */
    public interface f extends q0j0 {

        /* compiled from: SettingsAction.kt */
        public static final class a implements f {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -978407916;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: SettingsAction.kt */
        public static final class b implements f {
            public final OrdData b;

            public b(OrdData ordData) {
                this.b = ordData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Edit(newOrdData=" + this.b + ')';
            }
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class g implements q0j0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 708500150;
        }

        public final String toString() {
            return "SmartCropClick";
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class h implements q0j0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -348425699;
        }

        public final String toString() {
            return "SnackbarDismissed";
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class i implements q0j0 {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 979104653;
        }

        public final String toString() {
            return "ToolbarBackClick";
        }
    }

    /* compiled from: SettingsAction.kt */
    public static final class j implements q0j0, uj50 {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UserPostChanged(isEnabled="), this.b, ')');
        }
    }
}
