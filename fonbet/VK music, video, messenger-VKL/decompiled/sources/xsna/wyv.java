package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.stat.scheme.SchemeStat$TypeChannelSource;

/* compiled from: ImChannelUiViewTracker.kt */
/* loaded from: classes2.dex */
public final class wyv extends c2q0<a> implements nhl {

    /* compiled from: ImChannelUiViewTracker.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final SchemeStat$TypeChannelSource c;

        public a(String str, int i, SchemeStat$TypeChannelSource schemeStat$TypeChannelSource) {
            this.a = str;
            this.b = i;
            this.c = schemeStat$TypeChannelSource;
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
            String str = this.a;
            return this.c.hashCode() + shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        public final String toString() {
            return "TrackedItem(code=" + this.a + ", position=" + this.b + ", source=" + this.c + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.c2q0, xsna.jm6
    public final Object c(RecyclerView.e0 e0Var) {
        ldb ldbVar = e0Var instanceof ldb ? (ldb) e0Var : null;
        if (ldbVar == null) {
            return null;
        }
        return new a(ldbVar.h2(), e0Var.getLayoutPosition(), ldbVar.K4());
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
