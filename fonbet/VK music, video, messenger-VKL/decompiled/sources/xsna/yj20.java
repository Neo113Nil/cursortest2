package xsna;

/* compiled from: MethodSelectorItem.kt */
/* loaded from: classes3.dex */
public abstract class yj20 {
    public final String a;
    public final int b;

    /* compiled from: MethodSelectorItem.kt */
    public static final class a extends yj20 {
        public final String c;
        public final int d;
        public final String e;

        public a(String str, int i, String str2) {
            super(str, i);
            this.c = str;
            this.d = i;
            this.e = str2;
        }

        @Override // xsna.yj20
        public final int a() {
            return this.d;
        }

        @Override // xsna.yj20
        public final String b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HelpType(title=");
            sb.append(this.c);
            sb.append(", priority=");
            sb.append(this.d);
            sb.append(", descriptionForTalkback=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: MethodSelectorItem.kt */
    public static final class b extends yj20 {
        public final String c;
        public final int d;
        public final String e;

        public b(String str, int i, String str2) {
            super(str, i);
            this.c = str;
            this.d = i;
            this.e = str2;
        }

        @Override // xsna.yj20
        public final int a() {
            return this.d;
        }

        @Override // xsna.yj20
        public final String b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RestoreType(title=");
            sb.append(this.c);
            sb.append(", priority=");
            sb.append(this.d);
            sb.append(", descriptionForTalkback=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: MethodSelectorItem.kt */
    public static abstract class c extends yj20 {
        public final String c;
        public final int d;
        public final String e;
        public final String f;
        public final int g;
        public final Integer h;
        public final int i;

        /* compiled from: MethodSelectorItem.kt */
        public static final class a extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public a(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new a(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && this.n == aVar.n && epx.f(this.o, aVar.o) && this.p == aVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AppGeneratorType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class b extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public b(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new b(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.j, bVar.j) && this.k == bVar.k && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && this.n == bVar.n && epx.f(this.o, bVar.o) && this.p == bVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CallReset(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        /* renamed from: xsna.yj20$c$c, reason: collision with other inner class name */
        public static final class C4105c extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public C4105c(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new C4105c(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4105c)) {
                    return false;
                }
                C4105c c4105c = (C4105c) obj;
                return epx.f(this.j, c4105c.j) && this.k == c4105c.k && epx.f(this.l, c4105c.l) && epx.f(this.m, c4105c.m) && this.n == c4105c.n && epx.f(this.o, c4105c.o) && this.p == c4105c.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("EmailType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class d extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public d(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new d(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.j, dVar.j) && this.k == dVar.k && epx.f(this.l, dVar.l) && epx.f(this.m, dVar.m) && this.n == dVar.n && epx.f(this.o, dVar.o) && this.p == dVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MaxMessengerType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class e extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public e(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new e(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.j, eVar.j) && this.k == eVar.k && epx.f(this.l, eVar.l) && epx.f(this.m, eVar.m) && this.n == eVar.n && epx.f(this.o, eVar.o) && this.p == eVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MaxOTPType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class f extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public f(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, Integer.valueOf(i3), 0);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new f(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.j, fVar.j) && this.k == fVar.k && epx.f(this.l, fVar.l) && epx.f(this.m, fVar.m) && this.n == fVar.n && epx.f(this.o, fVar.o) && this.p == fVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OfficialMessengerType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class g extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public g(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new g(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.j, gVar.j) && this.k == gVar.k && epx.f(this.l, gVar.l) && epx.f(this.m, gVar.m) && this.n == gVar.n && epx.f(this.o, gVar.o) && this.p == gVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PasskeyType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class h extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public h(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new h(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.j, hVar.j) && this.k == hVar.k && epx.f(this.l, hVar.l) && epx.f(this.m, hVar.m) && this.n == hVar.n && epx.f(this.o, hVar.o) && this.p == hVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PasswordType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class i extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public i(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new i(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.j, iVar.j) && this.k == iVar.k && epx.f(this.l, iVar.l) && epx.f(this.m, iVar.m) && this.n == iVar.n && epx.f(this.o, iVar.o) && this.p == iVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PushType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class j extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public j(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new j(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.j, jVar.j) && this.k == jVar.k && epx.f(this.l, jVar.l) && epx.f(this.m, jVar.m) && this.n == jVar.n && epx.f(this.o, jVar.o) && this.p == jVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReserveType(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        /* compiled from: MethodSelectorItem.kt */
        public static final class k extends c {
            public final String j;
            public final int k;
            public final String l;
            public final String m;
            public final int n;
            public final Integer o;
            public final int p;

            public k(String str, int i, String str2, String str3, int i2, Integer num, int i3) {
                super(str, i, str2, str3, i2, num, i3);
                this.j = str;
                this.k = i;
                this.l = str2;
                this.m = str3;
                this.n = i2;
                this.o = num;
                this.p = i3;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final int a() {
                return this.k;
            }

            @Override // xsna.yj20.c, xsna.yj20
            public final String b() {
                return this.j;
            }

            @Override // xsna.yj20.c
            public final c c(int i) {
                return new k(this.j, this.k, this.l, this.m, this.n, this.o, i);
            }

            @Override // xsna.yj20.c
            public final String d() {
                return this.l;
            }

            @Override // xsna.yj20.c
            public final int e() {
                return this.n;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return epx.f(this.j, kVar.j) && this.k == kVar.k && epx.f(this.l, kVar.l) && epx.f(this.m, kVar.m) && this.n == kVar.n && epx.f(this.o, kVar.o) && this.p == kVar.p;
            }

            @Override // xsna.yj20.c
            public final Integer f() {
                return this.o;
            }

            @Override // xsna.yj20.c
            public final String g() {
                return this.m;
            }

            @Override // xsna.yj20.c
            public final int h() {
                return this.p;
            }

            public final int hashCode() {
                int a = shy.a(this.n, urd0.a(urd0.a(shy.a(this.k, this.j.hashCode() * 31, 31), 31, this.l), 31, this.m), 31);
                Integer num = this.o;
                return Integer.hashCode(this.p) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Sms(title=");
                sb.append(this.j);
                sb.append(", priority=");
                sb.append(this.k);
                sb.append(", descriptionForTalkback=");
                sb.append(this.l);
                sb.append(", info=");
                sb.append(this.m);
                sb.append(", iconResId=");
                sb.append(this.n);
                sb.append(", iconTintResource=");
                sb.append(this.o);
                sb.append(", timeoutSeconds=");
                return vu5.b(sb, this.p, ')');
            }
        }

        public c(String str, int i2, String str2, String str3, int i3, Integer num, int i4) {
            super(str, i2);
            this.c = str;
            this.d = i2;
            this.e = str2;
            this.f = str3;
            this.g = i3;
            this.h = num;
            this.i = i4;
        }

        @Override // xsna.yj20
        public int a() {
            return this.d;
        }

        @Override // xsna.yj20
        public String b() {
            return this.c;
        }

        public abstract c c(int i2);

        public String d() {
            return this.e;
        }

        public int e() {
            return this.g;
        }

        public Integer f() {
            return this.h;
        }

        public String g() {
            return this.f;
        }

        public int h() {
            return this.i;
        }
    }

    public yj20(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
