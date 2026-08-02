package xsna;

/* compiled from: DraweeConfig.java */
/* loaded from: classes12.dex */
public final class clo {
    public final yhn0<Boolean> a;

    /* compiled from: DraweeConfig.java */
    public static final class a {
        public cin0 a;

        public final clo a() {
            return new clo(this);
        }

        public final void b() {
            this.a = new cin0(Boolean.TRUE);
        }
    }

    public clo(a aVar) {
        cin0 cin0Var = aVar.a;
        this.a = cin0Var == null ? new cin0(Boolean.FALSE) : cin0Var;
    }

    public static a b() {
        return new a();
    }

    public final yhn0<Boolean> a() {
        return this.a;
    }
}
