package xsna;

import java.util.ArrayList;

/* compiled from: NotificationMenuModalPatch.kt */
/* loaded from: classes4.dex */
public interface nd70 extends xl50 {

    /* compiled from: NotificationMenuModalPatch.kt */
    public static final class a implements nd70 {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("DataLoaded(sources="), this.b);
        }
    }

    /* compiled from: NotificationMenuModalPatch.kt */
    public static final class b implements nd70 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -46830600;
        }

        public final String toString() {
            return "ErrorLoading";
        }
    }

    /* compiled from: NotificationMenuModalPatch.kt */
    public static final class c implements nd70 {
        public final boolean b;
        public final boolean c;
        public final Long d;

        public c(Long l, boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
            this.d = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
            Long l = this.d;
            return b + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialData(showProfileStats=");
            sb.append(this.b);
            sb.append(", tabsEnabled=");
            sb.append(this.c);
            sb.append(", currentSourceId=");
            return iq.b(sb, this.d, ')');
        }
    }

    /* compiled from: NotificationMenuModalPatch.kt */
    public static final class d implements nd70 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 842976539;
        }

        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: NotificationMenuModalPatch.kt */
    public static final class e implements nd70 {
        public final Long b;

        public e(Long l) {
            this.b = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            Long l = this.b;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return iq.b(new StringBuilder("UpdateCurrentSourceId(id="), this.b, ')');
        }
    }

    /* compiled from: NotificationMenuModalPatch.kt */
    public static final class f implements nd70 {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateTabsEnabled(enabled="), this.b, ')');
        }
    }
}
