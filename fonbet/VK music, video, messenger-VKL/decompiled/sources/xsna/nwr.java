package xsna;

/* compiled from: FocusProperties.kt */
/* loaded from: classes11.dex */
public final class nwr {

    /* compiled from: FocusProperties.kt */
    public static final class a implements qwr, g0t {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof qwr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }
}
