package xsna;

import java.util.ArrayList;

/* compiled from: WidgetSettingsTabMvi.kt */
/* loaded from: classes6.dex */
public final class mox0 implements ao50 {
    public final fi50 a;

    /* compiled from: WidgetSettingsTabMvi.kt */
    public static final class a implements fm50<lox0> {
        public final yzt0<AbstractC3359a> a;

        /* compiled from: WidgetSettingsTabMvi.kt */
        /* renamed from: xsna.mox0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3359a {

            /* compiled from: WidgetSettingsTabMvi.kt */
            /* renamed from: xsna.mox0$a$a$a, reason: collision with other inner class name */
            public static final class C3360a extends AbstractC3359a {
                public final ArrayList a;

                public C3360a(ArrayList arrayList) {
                    this.a = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3360a) && epx.f(this.a, ((C3360a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Data(items="), this.a);
                }
            }

            /* compiled from: WidgetSettingsTabMvi.kt */
            /* renamed from: xsna.mox0$a$a$b */
            public static final class b extends AbstractC3359a {
                public final ArrayList a;

                public b(ArrayList arrayList) {
                    this.a = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Loading(items="), this.a);
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

    public mox0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
