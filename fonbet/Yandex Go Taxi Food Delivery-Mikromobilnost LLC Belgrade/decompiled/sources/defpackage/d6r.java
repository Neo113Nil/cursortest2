package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class d6r {
    public final String a;
    public final String b;
    public final List c;

    public d6r(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6r)) {
            return false;
        }
        d6r d6rVar = (d6r) obj;
        return jl40.l(this.a, d6rVar.a) && jl40.l(this.b, d6rVar.b) && jl40.l(this.c, d6rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("FiltersModel(title=", this.a, ", buttonText=", this.b, ", filtersSections="), this.c, Extension.C_BRAKE);
    }

    public static final class b {
        public final String a;
        public final List b;

        public b(String str, List list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return nnm.h("FiltersSection(sectionTitle=", this.a, ", filters=", Extension.C_BRAKE, this.b);
        }

        public b() {
            this("", EmptyList.a);
        }
    }

    public static final class a {
        public final String a;
        public final boolean b;
        public final Map c;

        public a() {
            this("", false, kotlin.collections.b.f());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return b64.r(oo31.l("FilterObject(name=", this.a, ", isSelected=", ", meta=", this.b), this.c, Extension.C_BRAKE);
        }

        public a(String str, boolean z, Map map) {
            this.a = str;
            this.b = z;
            this.c = map;
        }
    }

    public d6r() {
        this("", "", EmptyList.a);
    }
}
