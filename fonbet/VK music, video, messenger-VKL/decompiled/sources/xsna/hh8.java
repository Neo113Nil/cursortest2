package xsna;

import com.vk.voip.dto.RecordType;
import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: BroadcastManagementFeatureState.kt */
/* loaded from: classes7.dex */
public abstract class hh8 {

    /* compiled from: BroadcastManagementFeatureState.kt */
    public static final class a extends hh8 {
        public final String a;
        public final String b;
        public final CallMemberId c;
        public final RecordType d;
        public final long e;
        public final nt80<dfw0> f;
        public final nt80<qvw0> g;
        public final nt80<qvw0> h;
        public final ohr i;
        public final boolean j;
        public final boolean k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, CallMemberId callMemberId, RecordType recordType, long j, nt80<dfw0> nt80Var, nt80<? extends qvw0> nt80Var2, nt80<? extends qvw0> nt80Var3, ohr ohrVar, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = callMemberId;
            this.d = recordType;
            this.e = j;
            this.f = nt80Var;
            this.g = nt80Var2;
            this.h = nt80Var3;
            this.i = ohrVar;
            this.j = z;
            this.k = z2;
        }

        public static a b(a aVar, nt80 nt80Var, nt80 nt80Var2, nt80 nt80Var3, ohr ohrVar, boolean z, boolean z2, int i) {
            String str = aVar.a;
            String str2 = aVar.b;
            CallMemberId callMemberId = aVar.c;
            RecordType recordType = aVar.d;
            long j = aVar.e;
            if ((i & 32) != 0) {
                nt80Var = aVar.f;
            }
            nt80 nt80Var4 = nt80Var;
            nt80 nt80Var5 = (i & 64) != 0 ? aVar.g : nt80Var2;
            nt80 nt80Var6 = (i & 128) != 0 ? aVar.h : nt80Var3;
            ohr ohrVar2 = (i & 256) != 0 ? aVar.i : ohrVar;
            boolean z3 = (i & 512) != 0 ? aVar.j : z;
            boolean z4 = (i & 1024) != 0 ? aVar.k : z2;
            aVar.getClass();
            return new a(str, str2, callMemberId, recordType, j, nt80Var4, nt80Var5, nt80Var6, ohrVar2, z3, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.k) + qoy.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + bh10.a((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e)) * 31)) * 31)) * 31)) * 31, 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Active(id=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", initiatorId=");
            sb.append(this.c);
            sb.append(", recordType=");
            sb.append(this.d);
            sb.append(", startTimeMs=");
            sb.append(this.e);
            sb.append(", broadcastInfo=");
            sb.append(this.f);
            sb.append(", broadcastOwner=");
            sb.append(this.g);
            sb.append(", broadcastInitiator=");
            sb.append(this.h);
            sb.append(", finishingState=");
            sb.append(this.i);
            sb.append(", canManage=");
            sb.append(this.j);
            sb.append(", canStop=");
            return defpackage.q0.a(sb, this.k, ')');
        }
    }

    /* compiled from: BroadcastManagementFeatureState.kt */
    public static final class b extends hh8 {
        public final mhr a;
        public final qvw0 b;
        public final qvw0 c;
        public final t7j0 d;
        public final hvl e;
        public final RecordType f;
        public final boolean g;

        public b(mhr mhrVar, qvw0 qvw0Var, qvw0 qvw0Var2, t7j0 t7j0Var, hvl hvlVar, RecordType recordType, boolean z) {
            this.a = mhrVar;
            this.b = qvw0Var;
            this.c = qvw0Var2;
            this.d = t7j0Var;
            this.e = hvlVar;
            this.f = recordType;
            this.g = z;
        }

        public static b b(b bVar, t7j0 t7j0Var, hvl hvlVar, int i) {
            mhr mhrVar = bVar.a;
            qvw0 qvw0Var = bVar.b;
            qvw0 qvw0Var2 = bVar.c;
            if ((i & 8) != 0) {
                t7j0Var = bVar.d;
            }
            t7j0 t7j0Var2 = t7j0Var;
            if ((i & 16) != 0) {
                hvlVar = bVar.e;
            }
            return new b(mhrVar, qvw0Var, qvw0Var2, t7j0Var2, hvlVar, bVar.f, bVar.g);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finished(finishedBroadcastInfo=");
            sb.append(this.a);
            sb.append(", broadcastOwner=");
            sb.append(this.b);
            sb.append(", broadcastInitiator=");
            sb.append(this.c);
            sb.append(", shareState=");
            sb.append(this.d);
            sb.append(", deleteState=");
            sb.append(this.e);
            sb.append(", recordType=");
            sb.append(this.f);
            sb.append(", canManageRecording=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: BroadcastManagementFeatureState.kt */
    public static final class c extends hh8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastManagementFeatureState.kt */
    public static final class d extends hh8 {
        public static final d a = new d();
    }

    /* compiled from: BroadcastManagementFeatureState.kt */
    public static final class e extends hh8 {
        public static final e a = new e();
    }

    /* compiled from: BroadcastManagementFeatureState.kt */
    public static abstract class f extends hh8 {
        public final rmy a;

        /* compiled from: BroadcastManagementFeatureState.kt */
        public static final class a extends f {
            public final rmy b;
            public final long c;

            public a(rmy rmyVar, long j) {
                super(rmyVar);
                this.b = rmyVar;
                this.c = j;
            }

            @Override // xsna.hh8.f
            public final rmy b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Awaiting(config=");
                sb.append(this.b);
                sb.append(", timeLeftMs=");
                return vu5.a(')', this.c, sb);
            }
        }

        /* compiled from: BroadcastManagementFeatureState.kt */
        public static final class b extends f {
            public final rmy b;
            public final Throwable c;

            public b(rmy rmyVar, Throwable th) {
                super(rmyVar);
                this.b = rmyVar;
                this.c = th;
            }

            @Override // xsna.hh8.f
            public final rmy b() {
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
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(config=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: BroadcastManagementFeatureState.kt */
        public static final class c extends f {
            public final rmy b;

            public c(rmy rmyVar) {
                super(rmyVar);
                this.b = rmyVar;
            }

            @Override // xsna.hh8.f
            public final rmy b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Initializing(config=" + this.b + ')';
            }
        }

        /* compiled from: BroadcastManagementFeatureState.kt */
        public static final class d extends f {
            public final rmy b;

            public d(rmy rmyVar) {
                super(rmyVar);
                this.b = rmyVar;
            }

            @Override // xsna.hh8.f
            public final rmy b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Launching(config=" + this.b + ')';
            }
        }

        public f(rmy rmyVar) {
            this.a = rmyVar;
        }

        public rmy b() {
            return this.a;
        }
    }

    public final b a() {
        if (this instanceof b) {
            return (b) this;
        }
        return null;
    }
}
