package xsna;

import xsna.a190;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes11.dex */
public final class qfo0 {

    /* compiled from: TextFieldDefaults.kt */
    public static final class a implements o7g, g0t {
        public final /* synthetic */ a190.a b;

        public a(a190.a aVar) {
            this.b = aVar;
        }

        @Override // xsna.o7g
        public final long a() {
            return ((l5g) this.b.get()).a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof o7g) && (obj instanceof g0t)) {
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

    public static u890 a() {
        float f = fgo0.a;
        return new u890(f, fgo0.d, f, 0);
    }
}
