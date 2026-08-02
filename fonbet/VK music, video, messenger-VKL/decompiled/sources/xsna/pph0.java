package xsna;

/* compiled from: SearchDatabaseQueryDelegate.kt */
/* loaded from: classes5.dex */
public final class pph0<Item> implements fuq {
    public final tph0<Item> a;
    public final io.reactivex.rxjava3.subjects.f<a> b;
    public final io.reactivex.rxjava3.processors.c<s3q0> c;
    public final io.reactivex.rxjava3.internal.operators.observable.x1 d;

    /* compiled from: SearchDatabaseQueryDelegate.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final long c;

        public a(String str, int i, long j) {
            this.a = str;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FetchRequest(query=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", requestDelayMillis=");
            return vu5.a(')', this.c, sb);
        }
    }

    public pph0(tph0<Item> tph0Var) {
        this.a = tph0Var;
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        this.c = new io.reactivex.rxjava3.processors.c<>();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.m0(fVar, new bj50(new qph0(1, this, pph0.class, "fetchRequest", "fetchRequest(Lcom/vk/search/params/impl/presentation/modal/database/mvi/delegate/SearchDatabaseQueryDelegate$FetchRequest;)Lio/reactivex/rxjava3/core/Maybe;", 0), 8)).k0();
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends nph0<Item>> d() {
        return this.d;
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q e() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
