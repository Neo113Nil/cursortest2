package xsna;

/* compiled from: JoinPointImpl.java */
/* loaded from: classes8.dex */
public final class o0y {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final n0y d;

    /* compiled from: JoinPointImpl.java */
    public static class a implements n0y {
        public xk20 a;

        public final String toString() {
            hqm0 hqm0Var = hqm0.e;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("method-execution".substring(7));
            stringBuffer.append("(");
            stringBuffer.append(this.a.b());
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
    }

    public o0y(n0y n0yVar, Object obj, Object obj2, Object[] objArr) {
        this.d = n0yVar;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
    }

    public final String toString() {
        return ((a) this.d).toString();
    }
}
