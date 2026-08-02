package xsna;

import java.util.ArrayList;
import xsna.fld;

/* compiled from: ClipsInterestCategory.kt */
/* loaded from: classes16.dex */
public interface jge<IdentifierType extends fld> {

    /* compiled from: ClipsInterestCategory.kt */
    public static final class a implements jge<fld.b> {
        public final fld.b a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public a(fld.b bVar, String str, String str2, ArrayList arrayList) {
            this.a = bVar;
            this.b = str;
            this.c = str2;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d);
        }

        @Override // xsna.jge
        public final String getIcon() {
            return this.c;
        }

        @Override // xsna.jge
        public final fld.b getId() {
            return this.a;
        }

        @Override // xsna.jge
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsInterestMainCategory(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", icon=");
            sb.append(this.c);
            sb.append(", subCategories=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
        }
    }

    /* compiled from: ClipsInterestCategory.kt */
    public static final class b implements jge<fld.a> {
        public final fld.a a;
        public final String b;
        public final String c;

        public b(fld.a aVar, String str, String str2) {
            this.a = aVar;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // xsna.jge
        public final String getIcon() {
            return this.c;
        }

        @Override // xsna.jge
        public final fld.a getId() {
            return this.a;
        }

        @Override // xsna.jge
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsInterestSubCategory(id=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", icon=");
            return ho8.a(sb, this.c, ')');
        }
    }

    String getIcon();

    IdentifierType getId();

    String getName();
}
