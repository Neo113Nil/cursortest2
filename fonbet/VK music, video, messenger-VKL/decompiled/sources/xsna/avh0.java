package xsna;

import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: SearchHistoryItemViewParams.kt */
/* loaded from: classes3.dex */
public interface avh0 {

    /* compiled from: SearchHistoryItemViewParams.kt */
    public static final class a implements avh0 {
        public final Thumb a;
        public final boolean b;
        public final String c;

        public a() {
            throw null;
        }

        public a(Thumb thumb) {
            this.a = thumb;
            this.b = true;
            this.c = "";
        }

        @Override // xsna.avh0
        public final Thumb a() {
            return this.a;
        }

        @Override // xsna.avh0
        public final List<Thumb> b() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        @Override // xsna.avh0
        public final String getContentDescription() {
            return this.c;
        }

        public final int hashCode() {
            Thumb thumb = this.a;
            return this.c.hashCode() + qoy.b((thumb == null ? 0 : thumb.hashCode()) * 961, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Avatar(thumb=");
            sb.append(this.a);
            sb.append(", thumbs=null, withBorder=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: SearchHistoryItemViewParams.kt */
    public static final class b implements avh0 {
        public static final b a = new b();
        public static final String b = "";

        @Override // xsna.avh0
        public final Thumb a() {
            return null;
        }

        @Override // xsna.avh0
        public final List<Thumb> b() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // xsna.avh0
        public final String getContentDescription() {
            return b;
        }

        public final int hashCode() {
            return -304223615;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: SearchHistoryItemViewParams.kt */
    public static final class c implements avh0 {
        public final Thumb a;
        public final List<Thumb> b;
        public final boolean c;
        public final float d;
        public final String e;

        public c() {
            throw null;
        }

        public c(Thumb thumb, List list, String str, int i) {
            thumb = (i & 1) != 0 ? null : thumb;
            list = (i & 2) != 0 ? null : list;
            float f = (i & 8) != 0 ? 1.0f : 1.5f;
            this.a = thumb;
            this.b = list;
            this.c = true;
            this.d = f;
            this.e = str;
        }

        @Override // xsna.avh0
        public final Thumb a() {
            return this.a;
        }

        @Override // xsna.avh0
        public final List<Thumb> b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && Float.compare(this.d, cVar.d) == 0 && epx.f(this.e, cVar.e);
        }

        @Override // xsna.avh0
        public final String getContentDescription() {
            return this.e;
        }

        public final int hashCode() {
            Thumb thumb = this.a;
            int hashCode = (thumb == null ? 0 : thumb.hashCode()) * 31;
            List<Thumb> list = this.b;
            return this.e.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.d, qoy.b((hashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Picture(thumb=");
            sb.append(this.a);
            sb.append(", thumbs=");
            sb.append(this.b);
            sb.append(", withBorder=");
            sb.append(this.c);
            sb.append(", aspectRatio=");
            sb.append(this.d);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.e, ')');
        }
    }

    Thumb a();

    List<Thumb> b();

    String getContentDescription();
}
