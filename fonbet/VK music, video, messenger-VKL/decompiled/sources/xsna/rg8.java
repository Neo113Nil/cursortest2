package xsna;

import java.util.Collection;

/* compiled from: BroadcastInfoViewModel.kt */
/* loaded from: classes7.dex */
public abstract class rg8 {

    /* compiled from: BroadcastInfoViewModel.kt */
    public static final class a extends rg8 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "AdminInfo(canFinish=false)";
        }
    }

    /* compiled from: BroadcastInfoViewModel.kt */
    public static final class b extends rg8 {
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

    /* compiled from: BroadcastInfoViewModel.kt */
    public static final class c extends rg8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastInfoViewModel.kt */
    public static final class d extends rg8 {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;
        public final long g;
        public final Collection<qvw0> h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final boolean q;

        /* JADX WARN: Multi-variable type inference failed */
        public d(boolean z, int i, int i2, int i3, int i4, long j, long j2, Collection<? extends qvw0> collection, int i5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
            this.a = z;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
            this.g = j2;
            this.h = collection;
            this.i = i5;
            this.j = z2;
            this.k = z3;
            this.l = z4;
            this.m = z5;
            this.n = z6;
            this.o = z7;
            this.p = z8;
            this.q = z9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && epx.f(this.h, dVar.h) && this.i == dVar.i && this.j == dVar.j && this.k == dVar.k && this.l == dVar.l && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o && this.p == dVar.p && this.q == dVar.q;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.q) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.i, s3j0.a(bh10.a(bh10.a(shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), this.h, 31), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(isOngoing=");
            sb.append(this.a);
            sb.append(", viewsTotalCount=");
            sb.append(this.b);
            sb.append(", viewsUniqueCount=");
            sb.append(this.c);
            sb.append(", likesCount=");
            sb.append(this.d);
            sb.append(", commentsCount=");
            sb.append(this.e);
            sb.append(", startTimeMs=");
            sb.append(this.f);
            sb.append(", durationMs=");
            sb.append(this.g);
            sb.append(", spectators=");
            sb.append(this.h);
            sb.append(", spectatorsTotalCount=");
            sb.append(this.i);
            sb.append(", canShowViewsTotalCount=");
            sb.append(this.j);
            sb.append(", canShowViewsUniqueCount=");
            sb.append(this.k);
            sb.append(", canShowLikesCount=");
            sb.append(this.l);
            sb.append(", canShowCommentsCount=");
            sb.append(this.m);
            sb.append(", canShowElapsedTime=");
            sb.append(this.n);
            sb.append(", canShowSpectators=");
            sb.append(this.o);
            sb.append(", canShare=");
            sb.append(this.p);
            sb.append(", canFinish=");
            return defpackage.q0.a(sb, this.q, ')');
        }
    }

    /* compiled from: BroadcastInfoViewModel.kt */
    public static final class e extends rg8 {
        public static final e a = new e();
    }
}
