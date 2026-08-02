package xsna;

import com.vk.dto.common.restrictions.RestrictionButton;

/* compiled from: VideoRestrictionType.kt */
/* loaded from: classes16.dex */
public interface pdt0 {

    /* compiled from: VideoRestrictionType.kt */
    public static final class a implements pdt0 {
        public final String a;
        public final String b;
        public final RestrictionButton c;
        public final gdt0 d;
        public final String e;

        public a(String str, String str2, RestrictionButton restrictionButton, gdt0 gdt0Var, String str3) {
            this.a = str;
            this.b = str2;
            this.c = restrictionButton;
            this.d = gdt0Var;
            this.e = str3;
        }

        @Override // xsna.pdt0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        @Override // xsna.pdt0
        public final String getTitle() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            RestrictionButton restrictionButton = this.c;
            int hashCode3 = (hashCode2 + (restrictionButton == null ? 0 : restrictionButton.hashCode())) * 31;
            gdt0 gdt0Var = this.d;
            int hashCode4 = (hashCode3 + (gdt0Var == null ? 0 : gdt0Var.hashCode())) * 31;
            String str2 = this.e;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // xsna.pdt0
        public final RestrictionButton o() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BlurRestriction(title=");
            sb.append(this.a);
            sb.append(", iconUrl=");
            sb.append(this.b);
            sb.append(", button=");
            sb.append(this.c);
            sb.append(", restrictionAction=");
            sb.append(this.d);
            sb.append(", action=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: VideoRestrictionType.kt */
    public static final class b implements pdt0 {
        public final String a;
        public final String b;
        public final RestrictionButton c;
        public final gdt0 d;

        public b(String str, String str2, RestrictionButton restrictionButton, gdt0 gdt0Var) {
            this.a = str;
            this.b = str2;
            this.c = restrictionButton;
            this.d = gdt0Var;
        }

        @Override // xsna.pdt0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        @Override // xsna.pdt0
        public final String getTitle() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            RestrictionButton restrictionButton = this.c;
            int hashCode3 = (hashCode2 + (restrictionButton == null ? 0 : restrictionButton.hashCode())) * 31;
            gdt0 gdt0Var = this.d;
            return hashCode3 + (gdt0Var != null ? gdt0Var.hashCode() : 0);
        }

        @Override // xsna.pdt0
        public final RestrictionButton o() {
            return this.c;
        }

        public final String toString() {
            return "SimpleRestriction(title=" + this.a + ", iconUrl=" + this.b + ", button=" + this.c + ", restrictionAction=" + this.d + ')';
        }
    }

    String a();

    String getTitle();

    RestrictionButton o();
}
