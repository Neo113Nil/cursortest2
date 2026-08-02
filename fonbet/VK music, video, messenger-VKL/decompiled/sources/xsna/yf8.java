package xsna;

import java.util.Collection;

/* compiled from: BroadcastFinishViewModel.kt */
/* loaded from: classes7.dex */
public abstract class yf8 {

    /* compiled from: BroadcastFinishViewModel.kt */
    public static final class a extends yf8 {
        public static final a a = new a();
    }

    /* compiled from: BroadcastFinishViewModel.kt */
    public static final class b extends yf8 {
        public final mvl a;
        public final s9j0 b;
        public final d c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final qvw0 j;

        public b(mvl mvlVar, s9j0 s9j0Var, d dVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, qvw0 qvw0Var) {
            this.a = mvlVar;
            this.b = s9j0Var;
            this.c = dVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = z6;
            this.j = qvw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            return "Finished(deleteViewModel=" + this.a + ", shareViewModel=" + this.b + ", statisticsModel=" + this.c + ", canViewStats=" + this.d + ", canShare=" + this.e + ", canDelete=" + this.f + ", isRecord=" + this.g + ", canShowRecordDescription=" + this.h + ", canGoToRecords=" + this.i + ", broadcastOwner=" + this.j + ')';
        }
    }

    /* compiled from: BroadcastFinishViewModel.kt */
    public static final class c extends yf8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastFinishViewModel.kt */
    public static final class d {
        public final Collection<qvw0> a;
        public final int b;
        public final boolean c;
        public final boolean d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Collection<? extends qvw0> collection, int i, boolean z, boolean z2) {
            this.a = collection;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatisticsModel(viewsFriends=");
            sb.append(this.a);
            sb.append(", viewsTotalCount=");
            sb.append(this.b);
            sb.append(", canViewFriends=");
            sb.append(this.c);
            sb.append(", canViewCountDescription=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
