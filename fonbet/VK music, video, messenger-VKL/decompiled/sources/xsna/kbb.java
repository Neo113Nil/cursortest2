package xsna;

/* compiled from: Channel.kt */
@vby
/* loaded from: classes11.dex */
public final class kbb<T> {
    public static final b b = new b();
    public final Object a;

    /* compiled from: Channel.kt */
    public static final class a extends b {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // xsna.kbb.b
        public final String toString() {
            return oq.c(new StringBuilder("Closed("), this.a, ')');
        }
    }

    /* compiled from: Channel.kt */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ kbb(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T b(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kbb) {
            return epx.f(this.a, ((kbb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
