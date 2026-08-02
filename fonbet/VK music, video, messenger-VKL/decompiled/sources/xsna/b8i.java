package xsna;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes11.dex */
public final class b8i<R> {
    public final R a;
    public final mp9 b;
    public final yzs<Throwable, R, kotlin.coroutines.d, s3q0> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public b8i(R r, mp9 mp9Var, yzs<? super Throwable, ? super R, ? super kotlin.coroutines.d, s3q0> yzsVar, Object obj, Throwable th) {
        this.a = r;
        this.b = mp9Var;
        this.c = yzsVar;
        this.d = obj;
        this.e = th;
    }

    public static b8i a(b8i b8iVar, mp9 mp9Var, Throwable th, int i) {
        R r = b8iVar.a;
        if ((i & 2) != 0) {
            mp9Var = b8iVar.b;
        }
        mp9 mp9Var2 = mp9Var;
        yzs<Throwable, R, kotlin.coroutines.d, s3q0> yzsVar = b8iVar.c;
        Object obj = b8iVar.d;
        if ((i & 16) != 0) {
            th = b8iVar.e;
        }
        b8iVar.getClass();
        return new b8i(r, mp9Var2, yzsVar, obj, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8i)) {
            return false;
        }
        b8i b8iVar = (b8i) obj;
        return epx.f(this.a, b8iVar.a) && epx.f(this.b, b8iVar.b) && epx.f(this.c, b8iVar.c) && epx.f(this.d, b8iVar.d) && epx.f(this.e, b8iVar.e);
    }

    public final int hashCode() {
        R r = this.a;
        int hashCode = (r == null ? 0 : r.hashCode()) * 31;
        mp9 mp9Var = this.b;
        int hashCode2 = (hashCode + (mp9Var == null ? 0 : mp9Var.hashCode())) * 31;
        yzs<Throwable, R, kotlin.coroutines.d, s3q0> yzsVar = this.c;
        int hashCode3 = (hashCode2 + (yzsVar == null ? 0 : yzsVar.hashCode())) * 31;
        Object obj = this.d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append(this.b);
        sb.append(", onCancellation=");
        sb.append(this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        return oq.c(sb, this.e, ')');
    }

    public /* synthetic */ b8i(Object obj, mp9 mp9Var, yzs yzsVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : mp9Var, (yzs<? super Throwable, ? super Object, ? super kotlin.coroutines.d, s3q0>) ((i & 4) != 0 ? null : yzsVar), (Object) null, (i & 16) != 0 ? null : th);
    }
}
