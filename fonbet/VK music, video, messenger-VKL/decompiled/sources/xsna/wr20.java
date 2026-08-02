package xsna;

import java.util.ArrayList;

/* compiled from: MiniWidgetSettingsTabMvi.kt */
/* loaded from: classes6.dex */
public final class wr20 implements ao50 {
    public final fi50 a;

    /* compiled from: MiniWidgetSettingsTabMvi.kt */
    public static final class a implements fm50<vr20> {
        public final yzt0<AbstractC3952a> a;

        /* compiled from: MiniWidgetSettingsTabMvi.kt */
        /* renamed from: xsna.wr20$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3952a {

            /* compiled from: MiniWidgetSettingsTabMvi.kt */
            /* renamed from: xsna.wr20$a$a$a, reason: collision with other inner class name */
            public static final class C3953a extends AbstractC3952a {
                public final boolean a;
                public final ArrayList b;
                public final boolean c;
                public final boolean d;

                public C3953a(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
                    this.a = z;
                    this.b = arrayList;
                    this.c = z2;
                    this.d = z3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3953a)) {
                        return false;
                    }
                    C3953a c3953a = (C3953a) obj;
                    return this.a == c3953a.a && epx.f(this.b, c3953a.b) && this.c == c3953a.c && this.d == c3953a.d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + qoy.b(qr.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Data(isMiniWidgetsEnabled=");
                    sb.append(this.a);
                    sb.append(", items=");
                    sb.append(this.b);
                    sb.append(", isDataFromServer=");
                    sb.append(this.c);
                    sb.append(", isChangesBlocked=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }

            /* compiled from: MiniWidgetSettingsTabMvi.kt */
            /* renamed from: xsna.wr20$a$a$b */
            public static final class b extends AbstractC3952a {
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
                    return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Idle(items="), this.a);
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

    public wr20(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
