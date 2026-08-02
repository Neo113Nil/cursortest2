package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Image;

/* compiled from: DonutImageTeaserUiDto.kt */
/* loaded from: classes4.dex */
public final class d0o extends ol60 {
    public final a h;
    public final String i;
    public final String j;
    public final DonutPriceTemplate k;
    public final r1o l;

    /* compiled from: DonutImageTeaserUiDto.kt */
    public interface a {

        /* compiled from: DonutImageTeaserUiDto.kt */
        /* renamed from: xsna.d0o$a$a, reason: collision with other inner class name */
        public static final class C2693a implements a {
            public final String a;

            public C2693a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2693a) && epx.f(this.a, ((C2693a) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Empty(avgColor="), this.a, ')');
            }
        }

        /* compiled from: DonutImageTeaserUiDto.kt */
        public static final class b implements a {
            public final Image a;
            public final String b;
            public final Float c;

            public b(Image image, String str, Float f) {
                this.a = image;
                this.b = str;
                this.c = f;
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

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Float f = this.c;
                return hashCode2 + (f != null ? f.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Photo(sizes=");
                sb.append(this.a);
                sb.append(", thumbHash=");
                sb.append(this.b);
                sb.append(", ratio=");
                return so.b(sb, this.c, ')');
            }
        }
    }

    public d0o(a aVar, String str, String str2, DonutPriceTemplate donutPriceTemplate, r1o r1oVar) {
        super(25, 0, 0, 0, null);
        this.h = aVar;
        this.i = str;
        this.j = str2;
        this.k = donutPriceTemplate;
        this.l = r1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0o)) {
            return false;
        }
        d0o d0oVar = (d0o) obj;
        return epx.f(this.h, d0oVar.h) && epx.f(this.i, d0oVar.i) && epx.f(this.j, d0oVar.j) && epx.f(this.k, d0oVar.k) && epx.f(this.l, d0oVar.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DonutPriceTemplate donutPriceTemplate = this.k;
        return Integer.hashCode(0) + ((this.l.hashCode() + ((hashCode3 + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "DonutImageTeaserUiDto(content=" + this.h + ", placeholderDescription=" + this.i + ", placeholderAction=" + this.j + ", donutPriceTemplate=" + this.k + ", action=" + this.l + ", seqId=0)";
    }
}
