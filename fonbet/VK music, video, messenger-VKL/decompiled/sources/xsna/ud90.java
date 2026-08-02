package xsna;

import androidx.compose.runtime.a;

/* compiled from: PaginationDotsDefaults.kt */
/* loaded from: classes17.dex */
public final class ud90 {

    /* compiled from: PaginationDotsDefaults.kt */
    public interface a {
        dtp0 a();
    }

    /* compiled from: PaginationDotsDefaults.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3, float f4) {
            float f5 = kqu0.a;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!pco.b(this.a, bVar.a) || !pco.b(this.b, bVar.b) || !pco.b(this.c, bVar.c) || !pco.b(this.d, bVar.d)) {
                return false;
            }
            float f = kqu0.u;
            return pco.b(f, f);
        }

        public final int hashCode() {
            return Float.hashCode(kqu0.u) + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dimensions(dotHeight=");
            oq.f(this.a, ", inactiveDotWidth=", sb);
            oq.f(this.b, ", activeDotWidth=", sb);
            oq.f(this.c, ", edgeDotSize=", sb);
            oq.f(this.d, ", spacing=", sb);
            return ir.f(')', kqu0.u, sb);
        }
    }

    public static b a(int i, androidx.compose.runtime.a aVar) {
        float f = 8;
        float f2 = 28;
        float f3 = 5;
        float f4 = kqu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-204906302, i, -1, "com.vk.core.compose.component.pagination.PaginationDotsDefaults.dimensions (PaginationDotsDefaults.kt:37)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new b(f, f, f2, f3);
            aVar.R(x);
        }
        b bVar = (b) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar;
    }
}
