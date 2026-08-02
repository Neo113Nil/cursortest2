package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.dt1;
import xsna.it1;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public abstract class ejk {

    /* compiled from: RowColumnImpl.kt */
    public static final class a extends ejk {
        public final it1.a a;

        public a(it1.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.ejk
        public final int a(int i, int i2, LayoutDirection layoutDirection, tra0 tra0Var, int i3) {
            int g0 = tra0Var.g0(this.a.a);
            if (g0 == Integer.MIN_VALUE) {
                return 0;
            }
            int i4 = i3 - g0;
            return layoutDirection == LayoutDirection.Rtl ? (i - i2) - i4 : i4;
        }

        @Override // xsna.ejk
        public final Integer b(tra0 tra0Var) {
            return Integer.valueOf(tra0Var.g0(this.a.a));
        }
    }

    /* compiled from: RowColumnImpl.kt */
    public static final class b extends ejk {
        public final dt1.b a;

        public b(dt1.b bVar) {
            this.a = bVar;
        }

        @Override // xsna.ejk
        public final int a(int i, int i2, LayoutDirection layoutDirection, tra0 tra0Var, int i3) {
            return this.a.a(i2, i, layoutDirection);
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
            return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    public static final class c extends ejk {
        public final dt1.c a;

        public c(dt1.c cVar) {
            this.a = cVar;
        }

        @Override // xsna.ejk
        public final int a(int i, int i2, LayoutDirection layoutDirection, tra0 tra0Var, int i3) {
            return this.a.a(i2, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
        }
    }

    public abstract int a(int i, int i2, LayoutDirection layoutDirection, tra0 tra0Var, int i3);

    public Integer b(tra0 tra0Var) {
        return null;
    }
}
