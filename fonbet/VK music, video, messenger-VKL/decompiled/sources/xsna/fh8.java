package xsna;

/* compiled from: BroadcastManagementFeatureAction.kt */
/* loaded from: classes7.dex */
public abstract class fh8 {

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class a extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        /* renamed from: xsna.fh8$a$a, reason: collision with other inner class name */
        public static final class C2872a extends a {
            public static final C2872a a = new C2872a();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class b extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        /* renamed from: xsna.fh8$b$b, reason: collision with other inner class name */
        public static final class C2873b extends b {
            public static final C2873b a = new C2873b();
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class c extends fh8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class d extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends d {
            public static final a a = new a();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends d {
            public static final b a = new b();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class c extends d {
            public final rmy a;

            public c(rmy rmyVar) {
                this.a = rmyVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Start(config=" + this.a + ')';
            }
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class e extends fh8 {
        public final qvw0 a;

        public e(svw0 svw0Var) {
            this.a = svw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            qvw0 qvw0Var = this.a;
            if (qvw0Var == null) {
                return 0;
            }
            return qvw0Var.hashCode();
        }

        public final String toString() {
            return "OnAwaitInitiatorProfileDone(profile=" + this.a + ')';
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class f extends fh8 {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnBroadcastCanStopUpdate(canStop="), this.a, ')');
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class g extends fh8 {
        public final dfw0 a;

        public g(dfw0 dfw0Var) {
            this.a = dfw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnBroadcastInfoUpdate(info=" + this.a + ')';
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class h extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends h {
            public final String a;
            public final String b;
            public final Throwable c;

            public a(String str, String str2, Throwable th) {
                this.a = str;
                this.b = str2;
                this.c = th;
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
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends h {
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
                StringBuilder sb = new StringBuilder("InProgress(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class c extends h {
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
                StringBuilder sb = new StringBuilder("Success(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class i extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends i {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
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
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends i {
            public static final b a = new b();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class c extends i {
            public final dfw0 a;

            public c(dfw0 dfw0Var) {
                this.a = dfw0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                dfw0 dfw0Var = this.a;
                if (dfw0Var == null) {
                    return 0;
                }
                return dfw0Var.hashCode();
            }

            public final String toString() {
                return "Success(broadcastInfo=" + this.a + ')';
            }
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class j extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends j {
            public final rmy a;
            public final long b;

            public a(rmy rmyVar, long j) {
                this.a = rmyVar;
                this.b = j;
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
                return Long.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Awaiting(config=");
                sb.append(this.a);
                sb.append(", timeLeftMs=");
                return vu5.a(')', this.b, sb);
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends j {
            public final rmy a;
            public final Throwable b;

            public b(rmy rmyVar, Throwable th) {
                this.a = rmyVar;
                this.b = th;
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
                StringBuilder sb = new StringBuilder("Error(config=");
                sb.append(this.a);
                sb.append(", error=");
                return oq.c(sb, this.b, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class c extends j {
            public final rmy a;

            public c(rmy rmyVar) {
                this.a = rmyVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Launched(config=" + this.a + ')';
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class d extends j {
            public final rmy a;

            public d(rmy rmyVar) {
                this.a = rmyVar;
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
                return "Launching(config=" + this.a + ')';
            }
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class k extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends k {
            public final fvw a;

            public a(fvw fvwVar) {
                this.a = fvwVar;
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
                return "Active(info=" + this.a + ')';
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends k {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
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
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class c extends k {
            public static final c a = new c();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class d extends k {
            public static final d a = new d();
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class l extends fh8 {
        public final hd8 a;

        public l(hd8 hd8Var) {
            this.a = hd8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            hd8 hd8Var = this.a;
            if (hd8Var == null) {
                return 0;
            }
            return hd8Var.hashCode();
        }

        public final String toString() {
            return "OnRunningChanged(broadcast=" + this.a + ')';
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class m extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends m {
            public final String a;
            public final String b;
            public final Throwable c;

            public a(String str, String str2, Throwable th) {
                this.a = str;
                this.b = str2;
                this.c = th;
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
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends m {
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
                StringBuilder sb = new StringBuilder("InProgress(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class c extends m {
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
                StringBuilder sb = new StringBuilder("Success(id=");
                sb.append(this.a);
                sb.append(", ownerId=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class n extends fh8 {
        public static final n a = new n();
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static final class o extends fh8 {
    }

    /* compiled from: BroadcastManagementFeatureAction.kt */
    public static abstract class p extends fh8 {

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class a extends p {
            public static final a a = new a();
        }

        /* compiled from: BroadcastManagementFeatureAction.kt */
        public static final class b extends p {
            public final boolean a;
            public final boolean b;

            public b(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Start(inStories=");
                sb.append(this.a);
                sb.append(", onWall=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }
}
