package xsna;

import android.net.Uri;
import com.ironsource.Z3;
import java.util.LinkedHashSet;
import xsna.cq70;

/* compiled from: AnimatedFrameCache.java */
/* loaded from: classes12.dex */
public final class sj2 {
    public final gp2 a;
    public final qyj<ww8, svf> b;
    public final LinkedHashSet<ww8> d = new LinkedHashSet<>();
    public final rj2 c = new rj2(this);

    /* compiled from: AnimatedFrameCache.java */
    public static class a implements ww8 {
        public final gp2 a;
        public final int b;

        public a(gp2 gp2Var, int i) {
            this.a = gp2Var;
            this.b = i;
        }

        @Override // xsna.ww8
        public final String a() {
            return null;
        }

        @Override // xsna.ww8
        public final boolean b() {
            return false;
        }

        @Override // xsna.ww8
        public final boolean c(Uri uri) {
            return this.a.c(uri);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return (this.a.hashCode() * Z3.i) + this.b;
        }

        public final String toString() {
            cq70.a b = cq70.b(this);
            b.d(this.a, "imageCacheKey");
            b.a(this.b, "frameIndex");
            return b.toString();
        }
    }

    public sj2(gp2 gp2Var, qyj qyjVar) {
        this.a = gp2Var;
        this.b = qyjVar;
    }
}
