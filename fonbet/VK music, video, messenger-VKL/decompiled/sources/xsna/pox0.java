package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: WidgetState.kt */
/* loaded from: classes17.dex */
public abstract class pox0 {

    /* compiled from: WidgetState.kt */
    public static final class a extends pox0 {
        public final rmx0 a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final float f;
        public final int g;
        public final int h;
        public final int i;
        public final String j;

        public a(rmx0 rmx0Var, String str, String str2, String str3, String str4, float f, int i, int i2, int i3, String str5) {
            this.a = rmx0Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = f;
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && Float.compare(this.f, aVar.f) == 0 && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return this.j.hashCode() + shy.a(this.i, shy.a(this.h, shy.a(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WidgetDonationState(container=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", button=");
            sb.append(this.c);
            sb.append(", buttonUrl=");
            sb.append(this.d);
            sb.append(", buttonTarget=");
            sb.append(this.e);
            sb.append(", progress=");
            sb.append(this.f);
            sb.append(", funded=");
            sb.append(this.g);
            sb.append(", goal=");
            sb.append(this.h);
            sb.append(", backers=");
            sb.append(this.i);
            sb.append(", currencySymbol=");
            return ho8.a(sb, this.j, ')');
        }
    }

    /* compiled from: WidgetState.kt */
    public static final class c extends pox0 {
        public final rmx0 a;
        public final List<b> b;

        public c() {
            this(0);
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
            int hashCode = this.a.hashCode() * 31;
            List<b> list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WidgetListState(container=");
            sb.append(this.a);
            sb.append(", items=");
            return ms9.a(')', sb, this.b);
        }

        public c(rmx0 rmx0Var, wow wowVar) {
            this.a = rmx0Var;
            this.b = wowVar;
        }

        public /* synthetic */ c(int i) {
            this(new rmx0(0), null);
        }
    }

    /* compiled from: WidgetState.kt */
    public static final class d extends pox0 {
        public final rmx0 a;
        public final al10 b;

        public d(rmx0 rmx0Var, al10 al10Var) {
            this.a = rmx0Var;
            this.b = al10Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            al10 al10Var = this.b;
            return hashCode + (al10Var == null ? 0 : al10Var.hashCode());
        }

        public final String toString() {
            return "WidgetMatchState(container=" + this.a + ", match=" + this.b + ')';
        }
    }

    /* compiled from: WidgetState.kt */
    public static final class e extends pox0 {
        public final rmx0 a;
        public final List<a> b;

        public e() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WidgetMatchesState(container=");
            sb.append(this.a);
            sb.append(", matches=");
            return ms9.a(')', sb, this.b);
        }

        public e(rmx0 rmx0Var, List<a> list) {
            this.a = rmx0Var;
            this.b = list;
        }

        public e(int i) {
            this(new rmx0(0), EmptyList.b);
        }

        /* compiled from: WidgetState.kt */
        public static final class a {
            public final C3525a a;
            public final C3525a b;
            public final String c;
            public final String d;
            public final boolean e;

            /* compiled from: WidgetState.kt */
            /* renamed from: xsna.pox0$e$a$a, reason: collision with other inner class name */
            public static final class C3525a {
                public final String a;
                public final String b;

                public C3525a() {
                    this(0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3525a)) {
                        return false;
                    }
                    C3525a c3525a = (C3525a) obj;
                    return epx.f(this.a, c3525a.a) && epx.f(this.b, c3525a.b);
                }

                public final int hashCode() {
                    String str = this.a;
                    return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Team(iconUrl=");
                    sb.append(this.a);
                    sb.append(", name=");
                    return ho8.a(sb, this.b, ')');
                }

                public C3525a(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public /* synthetic */ C3525a(int i) {
                    this(null, "");
                }
            }

            public a(C3525a c3525a, C3525a c3525a2, String str, String str2, boolean z) {
                this.a = c3525a;
                this.b = c3525a2;
                this.c = str;
                this.d = str2;
                this.e = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + urd0.a(urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Match(teamA=");
                sb.append(this.a);
                sb.append(", teamB=");
                sb.append(this.b);
                sb.append(", time=");
                sb.append(this.c);
                sb.append(", badge=");
                sb.append(this.d);
                sb.append(", bottomSeparator=");
                return defpackage.q0.a(sb, this.e, ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public a() {
                this(new C3525a(r0), new C3525a(r0), "", "", false);
                int i = 0;
            }
        }
    }

    /* compiled from: WidgetState.kt */
    public static final class f extends pox0 {
        public final rmx0 a;
        public final List b;
        public final List c;
        public final float d;

        /* compiled from: WidgetState.kt */
        public static final class a {
            public final String a;
            public final int b;
            public final float c;

            public a(String str, int i, float f) {
                this.a = str;
                this.b = i;
                this.c = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HeadRowItem(text=");
                sb.append(this.a);
                sb.append(", textAlign=");
                sb.append((Object) obo0.a(this.b));
                sb.append(", weight=");
                return xq.c(')', this.c, sb);
            }
        }

        /* compiled from: WidgetState.kt */
        public static final class b {
            public final List a;

            /* compiled from: WidgetState.kt */
            public static final class a {
                public final String a;
                public final String b;
                public final String c;

                public a(String str, String str2, String str3) {
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    String str = this.b;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.c;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Item(text=");
                    sb.append(this.a);
                    sb.append(", url=");
                    sb.append(this.b);
                    sb.append(", avatarUrl=");
                    return ho8.a(sb, this.c, ')');
                }
            }

            public b(List list) {
                this.a = list;
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
                return jr.a(')', new StringBuilder("Row(items="), this.a);
            }
        }

        public f(rmx0 rmx0Var, List list, List list2, float f) {
            this.a = rmx0Var;
            this.b = list;
            this.c = list2;
            this.d = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && pco.b(this.d, fVar.d);
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + fw3.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WidgetTableState(container=");
            sb.append(this.a);
            sb.append(", headRowItems=");
            mr.c(", rows=", sb, this.b);
            mr.c(", avatarSize=", sb, this.c);
            return ir.f(')', this.d, sb);
        }
    }

    /* compiled from: WidgetState.kt */
    public static final class g extends pox0 {
        public final rmx0 a;
        public final String b;
        public final String c;

        public g() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WidgetTextState(container=");
            sb.append(this.a);
            sb.append(", text=");
            sb.append(this.b);
            sb.append(", description=");
            return ho8.a(sb, this.c, ')');
        }

        public g(rmx0 rmx0Var, String str, String str2) {
            this.a = rmx0Var;
            this.b = str;
            this.c = str2;
        }

        public /* synthetic */ g(int i) {
            this(new rmx0(0), null, null);
        }
    }

    /* compiled from: WidgetState.kt */
    public static final class h extends pox0 {
        public final rmx0 a;
        public final List<a> b;

        /* compiled from: WidgetState.kt */
        public static final class a {
            public final String a;
            public final String b;
            public final String c;
            public final b d;
            public final C3526a e;

            /* compiled from: WidgetState.kt */
            /* renamed from: xsna.pox0$h$a$a, reason: collision with other inner class name */
            public static final class C3526a {
                public final String a;
                public final String b;

                public C3526a(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3526a)) {
                        return false;
                    }
                    C3526a c3526a = (C3526a) obj;
                    return epx.f(this.a, c3526a.a) && epx.f(this.b, c3526a.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(title=");
                    sb.append(this.a);
                    sb.append(", url=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            /* compiled from: WidgetState.kt */
            public static final class b {
                public final String a;
                public final float b;

                public b(String str, float f) {
                    this.a = str;
                    this.b = f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.b) + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Image(url=");
                    sb.append(this.a);
                    sb.append(", ratio=");
                    return xq.c(')', this.b, sb);
                }
            }

            public a(String str, String str2, String str3, b bVar, C3526a c3526a) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = bVar;
                this.e = c3526a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                b bVar = this.d;
                int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                C3526a c3526a = this.e;
                return hashCode4 + (c3526a != null ? c3526a.hashCode() : 0);
            }

            public final String toString() {
                return "WidgetTilesItem(title=" + this.a + ", subtitle=" + this.b + ", url=" + this.c + ", image=" + this.d + ", button=" + this.e + ')';
            }
        }

        public h() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WidgetTilesState(container=");
            sb.append(this.a);
            sb.append(", items=");
            return ms9.a(')', sb, this.b);
        }

        public h(rmx0 rmx0Var, List<a> list) {
            this.a = rmx0Var;
            this.b = list;
        }

        public h(int i) {
            this(new rmx0(0), EmptyList.b);
        }
    }

    /* compiled from: WidgetState.kt */
    public static abstract class b {

        /* compiled from: WidgetState.kt */
        public static final class a extends b {
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public a(String str, String str2, String str3, String str4, String str5) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.e;
                return hashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WidgetCoverListListItemState(coverUrl=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", url=");
                sb.append(this.c);
                sb.append(", button=");
                sb.append(this.d);
                sb.append(", buttonUrl=");
                return ho8.a(sb, this.e, ')');
            }

            public a() {
                this(null, null, null, null, null);
            }
        }

        /* compiled from: WidgetState.kt */
        /* renamed from: xsna.pox0$b$b, reason: collision with other inner class name */
        public static final class C3524b extends b {
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;

            public C3524b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                this.f = str6;
                this.g = str7;
                this.h = str8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3524b)) {
                    return false;
                }
                C3524b c3524b = (C3524b) obj;
                return epx.f(this.a, c3524b.a) && epx.f(this.b, c3524b.b) && epx.f(this.c, c3524b.c) && epx.f(this.d, c3524b.d) && epx.f(this.e, c3524b.e) && epx.f(this.f, c3524b.f) && epx.f(this.g, c3524b.g) && epx.f(this.h, c3524b.h);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.e;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.g;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.h;
                return hashCode7 + (str8 != null ? str8.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WidgetListListItemState(iconUrl=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", titleUrl=");
                sb.append(this.c);
                sb.append(", button=");
                sb.append(this.d);
                sb.append(", buttonUrl=");
                sb.append(this.e);
                sb.append(", address=");
                sb.append(this.f);
                sb.append(", time=");
                sb.append(this.g);
                sb.append(", text=");
                return ho8.a(sb, this.h, ')');
            }

            public C3524b() {
                this(null, null, null, null, null, null, null, null);
            }
        }
    }
}
