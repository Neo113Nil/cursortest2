package xsna;

import xsna.npf;
import xsna.uuf;

/* compiled from: ClipsWrapperStatisticsMviState.kt */
/* loaded from: classes17.dex */
public abstract class wtf implements km50, uuf.i {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Long e;
    public final boolean f;
    public final npf g;
    public final npf h;

    /* compiled from: ClipsWrapperStatisticsMviState.kt */
    public static final class a extends wtf {
        public final boolean i;
        public final Long j;
        public final boolean k;
        public final npf l;
        public final npf m;
        public final boolean n;
        public final boolean o;

        public a() {
            this(null, false, null, null, false, 127);
        }

        @Override // xsna.wtf, xsna.uuf.i
        public final boolean A0() {
            return this.o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.i == aVar.i && epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && this.n == aVar.n && this.o == aVar.o;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.i) * 31;
            Long l = this.j;
            int b = qoy.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.k);
            npf npfVar = this.l;
            int hashCode2 = (b + (npfVar == null ? 0 : npfVar.hashCode())) * 31;
            npf npfVar2 = this.m;
            return Boolean.hashCode(this.o) + qoy.b((hashCode2 + (npfVar2 != null ? npfVar2.hashCode() : 0)) * 31, 31, this.n);
        }

        @Override // xsna.wtf, xsna.uuf.i
        public final boolean isVisible() {
            return this.i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Available(isVisible=");
            sb.append(this.i);
            sb.append(", viewsCount=");
            sb.append(this.j);
            sb.append(", isPromoted=");
            sb.append(this.k);
            sb.append(", statisticsAction=");
            sb.append(this.l);
            sb.append(", promotionAction=");
            sb.append(this.m);
            sb.append(", showEasyPromoteOnBoarding=");
            sb.append(this.n);
            sb.append(", hasOrdInfo=");
            return defpackage.q0.a(sb, this.o, ')');
        }

        @Override // xsna.wtf, xsna.uuf.i
        public final Long w0() {
            return this.j;
        }

        @Override // xsna.wtf, xsna.uuf.i
        public final npf x0() {
            return this.m;
        }

        @Override // xsna.wtf, xsna.uuf.i
        public final boolean y0() {
            return this.k;
        }

        @Override // xsna.wtf, xsna.uuf.i
        public final npf z0() {
            return this.l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(Long l, boolean z, npf.h.d dVar, npf.h.c cVar, boolean z2, int i) {
            this((i & 2) != 0 ? null : l, (i & 8) != 0 ? null : dVar, (i & 16) != 0 ? null : cVar, r6, (i & 4) != 0 ? false : z, false, (i & 64) != 0 ? false : z2);
            boolean z3 = (i & 1) == 0;
        }

        public a(Long l, npf npfVar, npf npfVar2, boolean z, boolean z2, boolean z3, boolean z4) {
            super(l, npfVar, npfVar2, true, true, z, z2);
            this.i = z;
            this.j = l;
            this.k = z2;
            this.l = npfVar;
            this.m = npfVar2;
            this.n = z3;
            this.o = z4;
        }
    }

    /* compiled from: ClipsWrapperStatisticsMviState.kt */
    public static final class b extends wtf {
        public static final b i = new b(null, null, null, true, true, false, false);
    }

    /* compiled from: ClipsWrapperStatisticsMviState.kt */
    public static final class c extends wtf {
        public static final c i = new c(null, null, null, true, false, false, false);
    }

    /* compiled from: ClipsWrapperStatisticsMviState.kt */
    public static final class d extends wtf {
        public static final d i = new d(null, null, null, false, false, false, false);
    }

    public wtf(Long l, npf npfVar, npf npfVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = l;
        this.f = z4;
        this.g = npfVar;
        this.h = npfVar2;
    }

    @Override // xsna.uuf.i
    public boolean A0() {
        return false;
    }

    @Override // xsna.uuf.i
    public boolean isVisible() {
        return this.d;
    }

    @Override // xsna.uuf.i
    public Long w0() {
        return this.e;
    }

    @Override // xsna.uuf.i
    public npf x0() {
        return this.h;
    }

    @Override // xsna.uuf.i
    public boolean y0() {
        return this.f;
    }

    @Override // xsna.uuf.i
    public npf z0() {
        return this.g;
    }
}
