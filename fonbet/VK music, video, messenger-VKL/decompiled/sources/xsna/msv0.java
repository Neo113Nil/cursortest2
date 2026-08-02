package xsna;

import xsna.f5h0;
import xsna.qhv0;

/* compiled from: VkToFrescoScaleType.kt */
/* loaded from: classes.dex */
public abstract class msv0 {

    /* compiled from: VkToFrescoScaleType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends msv0 {
        public final qhv0.l a;
        public final f5h0.c b;

        public a(qhv0.l lVar) {
            this.a = lVar;
            this.b = rhv0.a(lVar);
        }

        @Override // xsna.msv0
        public final f5h0.d a() {
            return this.b;
        }

        @Override // xsna.msv0
        public final qhv0 b() {
            return this.a;
        }

        @Override // xsna.msv0
        public final void c() {
            this.b.j = this.a.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Interpolating(vkScaleType=" + this.a + ')';
        }
    }

    public abstract f5h0.d a();

    public abstract qhv0 b();

    public abstract void c();

    /* compiled from: VkToFrescoScaleType.kt */
    public static final class b extends msv0 {
        public final qhv0 a;
        public final f5h0.d b;

        public b(qhv0 qhv0Var) {
            this.a = qhv0Var;
            this.b = rhv0.b(qhv0Var);
        }

        @Override // xsna.msv0
        public final f5h0.d a() {
            return this.b;
        }

        @Override // xsna.msv0
        public final qhv0 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Stateless(vkScaleType=" + this.a + ')';
        }

        @Override // xsna.msv0
        public final void c() {
        }
    }
}
