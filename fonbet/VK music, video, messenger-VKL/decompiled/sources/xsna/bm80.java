package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.toz;

/* compiled from: OneVideoLoadControlParamsProviderForVideo.kt */
/* loaded from: classes3.dex */
public final class bm80 implements am80 {
    public final w7u b;
    public volatile a c;
    public volatile zl80 d;

    /* compiled from: OneVideoLoadControlParamsProviderForVideo.kt */
    public static final class a {
        public final int a;
        public final Long b;
        public final toz c;
        public final boolean d;

        public a(int i, Long l, toz tozVar, boolean z) {
            this.a = i;
            this.b = l;
            this.c = tozVar;
            this.d = z;
        }

        public static a a(a aVar, Long l, toz tozVar, boolean z, int i) {
            int i2 = (i & 1) != 0 ? aVar.a : 5000;
            if ((i & 2) != 0) {
                l = aVar.b;
            }
            if ((i & 4) != 0) {
                tozVar = aVar.c;
            }
            if ((i & 8) != 0) {
                z = aVar.d;
            }
            aVar.getClass();
            return new a(i2, l, tozVar, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Long l = this.b;
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(limitBufferThresholdMs=");
            sb.append(this.a);
            sb.append(", durationMs=");
            sb.append(this.b);
            sb.append(", loadControlType=");
            sb.append(this.c);
            sb.append(", useLimitForBuffer=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public bm80(w7u w7uVar) {
        this.b = w7uVar;
        toz.a.getClass();
        this.c = new a(5000, null, toz.b.b, false);
        this.d = a(this.c);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public static zl80 a(a aVar) {
        zl80 zl80Var;
        toz tozVar = aVar.c;
        if (tozVar instanceof toz.c) {
            zl80Var = (zl80) erl.a.getValue();
        } else {
            if (!(tozVar instanceof toz.a)) {
                throw new NoWhenBranchMatchedException();
            }
            zl80Var = erl.b;
        }
        return aVar.d ? zl80.a(zl80Var, 0, aVar.a, 61) : zl80Var;
    }

    @Override // xsna.am80, java.util.function.Supplier
    public final zl80 get() {
        return this.d;
    }

    @Override // xsna.am80
    public final void h() {
        a a2 = a.a(this.c, null, null, false, 7);
        asu0.a.getClass();
        asu0.l().execute(new he6(3, this, a2));
    }

    @Override // xsna.am80
    public final void i(boolean z) {
        a a2 = a.a(this.c, null, null, !z, 7);
        asu0.a.getClass();
        asu0.l().execute(new he6(3, this, a2));
    }

    @Override // xsna.am80
    public final void j(toz tozVar, Long l) {
        a a2 = a.a(this.c, l, tozVar, false, 8);
        asu0.a.getClass();
        asu0.l().execute(new he6(3, this, a2));
    }

    @Override // xsna.am80, java.util.function.Supplier
    public final zl80 get() {
        return this.d;
    }
}
