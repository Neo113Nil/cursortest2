package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UnstableNetworkDetectorConfig.kt */
/* loaded from: classes11.dex */
public final class f6q0 {
    public static final a l = new a();
    public static final f6q0 m = new f6q0(0);
    public final b a;
    public final List<String> b;
    public final List<String> c;
    public final List<Long> d;
    public final List<Long> e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    /* compiled from: UnstableNetworkDetectorConfig.kt */
    public static final class a {
    }

    /* compiled from: UnstableNetworkDetectorConfig.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final a d;
        public final a e;

        /* compiled from: UnstableNetworkDetectorConfig.kt */
        public static final class a {
            public final String a;
            public final String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final String a() {
                return this.b;
            }

            public final String b() {
                return this.a;
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
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(title=");
                sb.append(this.a);
                sb.append(", deeplink=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public b(String str, String str2, String str3, a aVar, a aVar2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = aVar;
            this.e = aVar2;
        }

        public final a a() {
            return this.d;
        }

        public final a b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            a aVar = this.d;
            int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.e;
            return hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public final String toString() {
            return "ModalWindow(icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button1=" + this.d + ", button2=" + this.e + ')';
        }
    }

    public f6q0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6q0)) {
            return false;
        }
        f6q0 f6q0Var = (f6q0) obj;
        return epx.f(this.a, f6q0Var.a) && epx.f(this.b, f6q0Var.b) && epx.f(this.c, f6q0Var.c) && epx.f(this.d, f6q0Var.d) && epx.f(this.e, f6q0Var.e) && this.f == f6q0Var.f && this.g == f6q0Var.g && this.h == f6q0Var.h && this.i == f6q0Var.i && this.j == f6q0Var.j && this.k == f6q0Var.k;
    }

    public final int hashCode() {
        b bVar = this.a;
        return Boolean.hashCode(this.k) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(fw3.a(fw3.a(fw3.a(fw3.a((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnstableNetworkDetectorConfig(modalWindow=");
        sb.append(this.a);
        sb.append(", screensWhitelist=");
        sb.append(this.b);
        sb.append(", screensBlacklist=");
        sb.append(this.c);
        sb.append(", miniappWhitelist=");
        sb.append(this.d);
        sb.append(", miniappBlacklist=");
        sb.append(this.e);
        sb.append(", debugEmulateVpn=");
        sb.append(this.f);
        sb.append(", debugEmulateUnstable=");
        sb.append(this.g);
        sb.append(", debugForceDismissable=");
        sb.append(this.h);
        sb.append(", checkOnAppResumed=");
        sb.append(this.i);
        sb.append(", dryRun=");
        sb.append(this.j);
        sb.append(", wifiCheckEnabled=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public f6q0(b bVar, List<String> list, List<String> list2, List<Long> list3, List<Long> list4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = bVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f6q0(int i) {
        this(null, r2, r2, r2, r2, false, false, false, true, false, false);
        EmptyList emptyList = EmptyList.b;
    }
}
