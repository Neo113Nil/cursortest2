package xsna;

import java.util.ArrayList;

/* compiled from: PriorityBlockUIModel.kt */
/* loaded from: classes5.dex */
public interface sbd0 {

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class a implements sbd0 {
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
    public static final class b implements sbd0 {
        public final ArrayList a;
        public final ArrayList b;
        public final boolean c;
        public final boolean d;

        public b(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
            this.a = arrayList;
            this.b = arrayList2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qr.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GoodItems(items=");
            sb.append(this.a);
            sb.append(", albums=");
            sb.append(this.b);
            sb.append(", isPaginationShimmer=");
            sb.append(this.c);
            sb.append(", isPaginationError=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class c implements sbd0 {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GoodsError(description=");
            sb.append(this.a);
            sb.append(", btnText=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class d implements sbd0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1984773201;
        }

        public final String toString() {
            return "GoodsShimmer";
        }
    }
}
