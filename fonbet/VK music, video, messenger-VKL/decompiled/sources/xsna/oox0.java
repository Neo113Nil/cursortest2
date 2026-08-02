package xsna;

/* compiled from: WidgetSettingsMvi.kt */
/* loaded from: classes6.dex */
public final class oox0 implements ao50 {
    public final fi50 a;

    /* compiled from: WidgetSettingsMvi.kt */
    public static final class a implements fm50<eox0> {
        public final yzt0<AbstractC3459a> a;

        /* compiled from: WidgetSettingsMvi.kt */
        /* renamed from: xsna.oox0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3459a {

            /* compiled from: WidgetSettingsMvi.kt */
            /* renamed from: xsna.oox0$a$a$a, reason: collision with other inner class name */
            public static final class C3460a extends AbstractC3459a {
                public final Throwable a;

                public C3460a(Throwable th) {
                    this.a = th;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3460a) && epx.f(this.a, ((C3460a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
                }
            }

            /* compiled from: WidgetSettingsMvi.kt */
            /* renamed from: xsna.oox0$a$a$b */
            public static final class b extends AbstractC3459a {
                public static final b a = new b();
            }

            /* compiled from: WidgetSettingsMvi.kt */
            /* renamed from: xsna.oox0$a$a$c */
            public static final class c extends AbstractC3459a {
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
                    return defpackage.q0.a(new StringBuilder("RequestInProgress(isInProgress="), this.a, ')');
                }
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("ContentViewState(contentState="), this.a, ')');
        }
    }

    public oox0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
