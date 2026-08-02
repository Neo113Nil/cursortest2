package xsna;

/* compiled from: WidgetSettingsMvi.kt */
/* loaded from: classes6.dex */
public final class eox0 implements km50 {
    public final a b;

    /* compiled from: WidgetSettingsMvi.kt */
    public static abstract class a implements km50 {

        /* compiled from: WidgetSettingsMvi.kt */
        /* renamed from: xsna.eox0$a$a, reason: collision with other inner class name */
        public static final class C2830a extends a {
            public final Throwable b;

            public C2830a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2830a) && epx.f(this.b, ((C2830a) obj).b);
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

    public eox0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eox0) && epx.f(this.b, ((eox0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "WidgetSettingsState(contentState=" + this.b + ')';
    }

    public eox0(a aVar) {
        this.b = aVar;
    }

    public /* synthetic */ eox0(int i) {
        this(a.b.b);
    }
}
