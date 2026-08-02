package xsna;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public interface gna {

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class a implements gna {
        public final jai a;

        public a(jai jaiVar) {
            this.a = jaiVar;
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class b implements gna {
        public final lq2 a;

        public b(lq2 lq2Var) {
            this.a = lq2Var;
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    @vby
    public static final class c implements gna {
        public final int a;

        public /* synthetic */ c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.a == ((c) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("DrawableResWrapper(resId=", this.a, ')');
        }
    }

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class d implements gna {
        public static final d a = new d();
    }
}
