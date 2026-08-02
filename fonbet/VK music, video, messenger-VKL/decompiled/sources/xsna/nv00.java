package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketCategoriesFilterPatch.kt */
/* loaded from: classes18.dex */
public abstract class nv00 implements xl50 {

    /* compiled from: MarketCategoriesFilterPatch.kt */
    public static final class a extends nv00 {
        public final vv00 b;
        public final boolean c;

        public a(vv00 vv00Var, boolean z) {
            this.b = vv00Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            vv00 vv00Var = this.b;
            return Boolean.hashCode(this.c) + ((vv00Var == null ? 0 : vv00Var.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavePickedCategory(category=");
            sb.append(this.b);
            sb.append(", isSameAsInitial=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MarketCategoriesFilterPatch.kt */
    public static final class b extends nv00 {
        public final List<vv00> b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateCategories(categories="), this.b);
        }
    }
}
