package xsna;

import com.vk.feed.core.models.dzen.DzenNewsItem;
import xsna.tlo0;

/* compiled from: DzenNewsItemHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class uto extends ol60 {
    public final a h;
    public final tlo0.h i;
    public final int j;
    public final DzenNewsItem k;
    public final int l;

    /* compiled from: DzenNewsItemHolderUiDto.kt */
    public interface a {

        /* compiled from: DzenNewsItemHolderUiDto.kt */
        /* renamed from: xsna.uto$a$a, reason: collision with other inner class name */
        public static final class C3832a implements a {
            public final String a;
            public final tlo0.f b;

            public C3832a(String str, tlo0.f fVar) {
                this.a = str;
                this.b = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3832a)) {
                    return false;
                }
                C3832a c3832a = (C3832a) obj;
                return this.a.equals(c3832a.a) && this.b.equals(c3832a.b);
            }

            public final int hashCode() {
                return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CircleImage(url=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return pr.b(sb, this.b, ')');
            }
        }

        /* compiled from: DzenNewsItemHolderUiDto.kt */
        public static final class b implements a {
            public final int a;
            public final tlo0.f b;

            public b(int i, tlo0.f fVar) {
                this.a = i;
                this.b = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b.equals(bVar.b);
            }

            public final int hashCode() {
                return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(drawableId=");
                sb.append(this.a);
                sb.append(", contentDescription=");
                return pr.b(sb, this.b, ')');
            }
        }
    }

    public uto(a aVar, tlo0.h hVar, int i, DzenNewsItem dzenNewsItem, int i2) {
        super(241, 0, 0, 0, null);
        this.h = aVar;
        this.i = hVar;
        this.j = i;
        this.k = dzenNewsItem;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uto)) {
            return false;
        }
        uto utoVar = (uto) obj;
        return epx.f(this.h, utoVar.h) && epx.f(this.i, utoVar.i) && this.j == utoVar.j && epx.f(this.k, utoVar.k) && this.l == utoVar.l;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(this.l, (this.k.hashCode() + shy.a(this.j, u11.c(this.h.hashCode() * 31, 31, this.i.a), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenNewsItemHolderUiDto(left=");
        sb.append(this.h);
        sb.append(", title=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", newsItem=");
        sb.append(this.k);
        sb.append(", newsItemIndex=");
        return h5s.c(this.l, ", seqId=0)", sb);
    }
}
