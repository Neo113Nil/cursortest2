package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.db7;

/* compiled from: BirthdaysListViewState.kt */
/* loaded from: classes15.dex */
public final class kb7 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: BirthdaysListViewState.kt */
    public static final class a implements fm50<db7.a> {
        public final List<Object> a;
        public final boolean b;

        public a(ListBuilder listBuilder, boolean z) {
            this.a = listBuilder;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BirthdaysList(items=");
            sb.append(this.a);
            sb.append(", reloadingInBackground=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: BirthdaysListViewState.kt */
    public static final class b implements fm50<db7.a> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Content(listState="), this.a, ')');
        }
    }

    /* compiled from: BirthdaysListViewState.kt */
    public static final class c implements fm50<db7.b> {
        public static final c a = new c();
    }

    /* compiled from: BirthdaysListViewState.kt */
    public static final class d implements fm50<db7.c> {
        public final yzt0<Throwable> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: BirthdaysListViewState.kt */
    public static final class e implements fm50<db7.d> {
        public static final e a = new e();
    }

    public kb7(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
