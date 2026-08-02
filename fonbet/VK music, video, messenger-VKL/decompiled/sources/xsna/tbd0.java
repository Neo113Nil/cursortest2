package xsna;

import java.util.ArrayList;

/* compiled from: PriorityBlockUIModel.kt */
/* loaded from: classes5.dex */
public interface tbd0 {

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class a implements tbd0 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmptyItems(description=");
            sb.append(this.a);
            sb.append(", btnText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class b implements tbd0 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceError(description=");
            sb.append(this.a);
            sb.append(", btnText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class c implements tbd0 {
        public final ArrayList a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public c(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
            this.a = arrayList;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceListItems(items=");
            kr.d(this.a, sb, ", isPaginationAvailable=");
            sb.append(this.b);
            sb.append(", isPaginationShimmer=");
            sb.append(this.c);
            sb.append(", isPaginationError=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class d implements tbd0 {
        public final ArrayList a;
        public final boolean b;
        public final boolean c;

        public d(ArrayList arrayList, boolean z, boolean z2) {
            this.a = arrayList;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServiceTileItems(items=");
            kr.d(this.a, sb, ", isPaginationShimmer=");
            sb.append(this.b);
            sb.append(", isPaginationError=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class e implements tbd0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1932177186;
        }

        public final String toString() {
            return "ServiceTileShimmer";
        }
    }
}
