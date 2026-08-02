package xsna;

import java.util.ArrayList;

/* compiled from: CommunityReBookingModel.kt */
/* loaded from: classes5.dex */
public final class ewh extends s4h {
    public final ArrayList b;

    /* compiled from: CommunityReBookingModel.kt */
    public static final class a {
        public final int a;
        public final b b;
        public final ArrayList c;
        public final String d;

        /* compiled from: CommunityReBookingModel.kt */
        /* renamed from: xsna.ewh$a$a, reason: collision with other inner class name */
        public static final class C2838a {
            public final int a;
            public final String b;

            public C2838a(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2838a)) {
                    return false;
                }
                C2838a c2838a = (C2838a) obj;
                return this.a == c2838a.a && epx.f(this.b, c2838a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ServiceModel(id=");
                sb.append(this.a);
                sb.append(", title=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReBookingModel.kt */
        public static final class b {
            public final int a;
            public final String b;
            public final String c;

            public b(int i, String str, String str2) {
                this.a = i;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StaffModel(id=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", avatar=");
                return ho8.a(sb, this.c, ')');
            }
        }

        public a(int i, b bVar, ArrayList arrayList, String str) {
            this.a = i;
            this.b = bVar;
            this.c = arrayList;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qr.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecordModel(id=");
            sb.append(this.a);
            sb.append(", staff=");
            sb.append(this.b);
            sb.append(", services=");
            sb.append(this.c);
            sb.append(", servicesCountText=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public ewh(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewh) && epx.f(this.b, ((ewh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("CommunityReBookingModel(records="), this.b);
    }
}
