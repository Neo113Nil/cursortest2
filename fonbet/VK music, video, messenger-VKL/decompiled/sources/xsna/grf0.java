package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class grf0<A extends a.b, L> {

    @NonNull
    public final cnz0 a;

    @NonNull
    public final dnz0 b;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static class a<A extends a.b, L> {
        public ouf0 a;
        public ouf0 b;
        public ehz c;
        public Feature[] d;
        public boolean e;
        public int f;

        @NonNull
        public final grf0<A, L> a() {
            exc0.a("Must set register function", this.a != null);
            exc0.a("Must set unregister function", this.b != null);
            exc0.a("Must set holder", this.c != null);
            ehz.a aVar = this.c.b;
            exc0.j(aVar, "Key must not be null");
            return new grf0<>(new cnz0(this, this.c, this.d, this.e, this.f), new dnz0(this, aVar));
        }

        @NonNull
        public final void b(@NonNull ouf0 ouf0Var) {
            this.a = ouf0Var;
        }

        @NonNull
        public final void c(int i) {
            this.f = i;
        }

        @NonNull
        public final void d(@NonNull ouf0 ouf0Var) {
            this.b = ouf0Var;
        }

        @NonNull
        public final void e(@NonNull ehz ehzVar) {
            this.c = ehzVar;
        }
    }

    public /* synthetic */ grf0(cnz0 cnz0Var, dnz0 dnz0Var) {
        this.a = cnz0Var;
        this.b = dnz0Var;
    }

    @NonNull
    public static <A extends a.b, L> a<A, L> a() {
        a<A, L> aVar = new a<>();
        aVar.e = true;
        return aVar;
    }
}
