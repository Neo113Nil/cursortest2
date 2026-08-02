package xsna;

/* compiled from: PriorityBlockUIModel.kt */
/* loaded from: classes5.dex */
public abstract class gwu {

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class a extends gwu {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final c e;
        public final String f;
        public final Integer g;

        public a(String str, boolean z, boolean z2, boolean z3, c cVar, String str2, Integer num) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = cVar;
            this.f = str2;
            this.g = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            c cVar = this.e;
            int hashCode = (b + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str = this.f;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.g;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Goods(title=");
            sb.append(this.a);
            sb.append(", isHighlighted=");
            sb.append(this.b);
            sb.append(", isShowAllItemsBtn=");
            sb.append(this.c);
            sb.append(", isShowAddItemBtn=");
            sb.append(this.d);
            sb.append(", viewSettingsItems=");
            sb.append(this.e);
            sb.append(", settingsOnboardingTitleBtn=");
            sb.append(this.f);
            sb.append(", itemsInCart=");
            return uqi.b(sb, this.g, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class b extends gwu {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public b(String str, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Services(title=");
            sb.append(this.a);
            sb.append(", isHighlighted=");
            sb.append(this.b);
            sb.append(", isShowAllItemsBtn=");
            sb.append(this.c);
            sb.append(", isShowAddItemBtn=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PriorityBlockUIModel.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public c() {
            this(false, false, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewSettingsItems(isShowAddNewItem=");
            sb.append(this.a);
            sb.append(", isShowAddNewAlbumItem=");
            sb.append(this.b);
            sb.append(", isShowViewSettings=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public c(boolean z, boolean z2, int i) {
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 4) != 0 ? false : z2;
            this.a = z;
            this.b = true;
            this.c = z2;
        }
    }
}
