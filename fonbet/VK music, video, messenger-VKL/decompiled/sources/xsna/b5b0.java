package xsna;

import java.util.Collections;
import java.util.List;
import xsna.z4b0;

/* compiled from: PlayerSwipeGesturesHolder.kt */
/* loaded from: classes3.dex */
public final class b5b0 {
    public final gzs<s3q0> a;
    public p1b0 b;
    public final List<z4b0> c;

    /* compiled from: PlayerSwipeGesturesHolder.kt */
    public static final class a implements p1b0 {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Meta2(isFullscreenContext=");
            sb.append(this.a);
            sb.append(", isAdActive=");
            sb.append(this.b);
            sb.append(", inZoomMode=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PlayerSwipeGesturesHolder.kt */
    public static final class b implements p1b0 {
        public final w2j0 a;
        public final gkc0 b;
        public final a34 c;

        public b(w2j0 w2j0Var, gkc0 gkc0Var, a34 a34Var) {
            this.a = w2j0Var;
            this.b = gkc0Var;
            this.c = a34Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Meta(isFullscreenContext=" + this.a + ", isAdActive=" + this.b + ", inZoomMode=" + this.c + ')';
        }
    }

    public b5b0(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
        z4b0.b.d dVar = z4b0.b.d.a;
        z4b0.c.b bVar = z4b0.c.b.a;
        int i = 0;
        int i2 = 4;
        this.c = e43.l(new z4b0(dVar, Collections.singletonList(new z4b0.a.C4154a(0.5f, bVar, 1.2f)), new i2f(0, this, b5b0.class, "playerSwipeGestureUpIsEnabled", "playerSwipeGestureUpIsEnabled()Z", i, i2), gzsVar), new z4b0(z4b0.b.a.a, e43.l(new z4b0.a.C4154a(0.2f, bVar, 0.95f), new z4b0.a.b()), new q83(0, this, b5b0.class, "playerSwipeGestureDownIsEnabled", "playerSwipeGestureDownIsEnabled()Z", i, i2), gzsVar));
    }
}
