package xsna;

/* compiled from: DaggerFirebasePerformanceComponent.java */
/* loaded from: classes13.dex */
public final class bsk {
    public d9e0 a;

    /* compiled from: DaggerFirebasePerformanceComponent.java */
    public static final class a {
        public mjr a;

        public final bsk a() {
            mjr mjrVar = this.a;
            if (mjrVar != null) {
                bsk bskVar = new bsk();
                bskVar.a = c6o.b(new ujr(new ojr(mjrVar), new qjr(mjrVar), new pjr(mjrVar), new tjr(mjrVar), new rjr(mjrVar), new njr(mjrVar), new sjr(mjrVar)));
                return bskVar;
            }
            throw new IllegalStateException(mjr.class.getCanonicalName() + " must be set");
        }

        public final void b(mjr mjrVar) {
            this.a = mjrVar;
        }
    }

    public static a a() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kjr b() {
        return (kjr) this.a.get();
    }
}
