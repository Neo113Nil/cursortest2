package xsna;

/* compiled from: WidgetSettingsMvi.kt */
/* loaded from: classes6.dex */
public abstract class cox0 implements xl50 {

    /* compiled from: WidgetSettingsMvi.kt */
    public static abstract class a extends cox0 {

        /* compiled from: WidgetSettingsMvi.kt */
        /* renamed from: xsna.cox0$a$a, reason: collision with other inner class name */
        public static final class C2674a extends a {
            public final Throwable b;

            public C2674a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2674a) && epx.f(this.b, ((C2674a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: WidgetSettingsMvi.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: WidgetSettingsMvi.kt */
        public static final class c extends a {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("RequestInProgress(isInProgress="), this.b, ')');
            }
        }
    }
}
