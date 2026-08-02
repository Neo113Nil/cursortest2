package xsna;

import xsna.uu1;

/* compiled from: MiniWidgetSettingsTabMvi.kt */
/* loaded from: classes6.dex */
public abstract class ur20 implements xl50 {

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static abstract class a extends ur20 {

        /* compiled from: MiniWidgetSettingsTabMvi.kt */
        /* renamed from: xsna.ur20$a$a, reason: collision with other inner class name */
        public static final class C3816a extends a {
            public static final C3816a b = new C3816a();
        }

        /* compiled from: MiniWidgetSettingsTabMvi.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: MiniWidgetSettingsTabMvi.kt */
        public static final class c extends a {
            public final uu1.b b;

            public c(uu1.b bVar) {
                this.b = bVar;
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
                return "Loaded(miniWidgetSettings=" + this.b + ')';
            }
        }

        /* compiled from: MiniWidgetSettingsTabMvi.kt */
        public static final class d extends a {
            public final uu1.b b;
            public final boolean c;

            public d(uu1.b bVar, boolean z) {
                this.b = bVar;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdatedByUser(miniWidgetSettings=");
                sb.append(this.b);
                sb.append(", isChangesBlocked=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }
    }
}
