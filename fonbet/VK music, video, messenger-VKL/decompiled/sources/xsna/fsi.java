package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import xsna.tlo0;

/* compiled from: CompositeActionButtonHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class fsi extends ol60 {
    public final ActionButtonAttachment h;
    public final NewsEntry i;
    public final tlo0.h j;
    public final a k;
    public final b l;

    /* compiled from: CompositeActionButtonHolderUiDto.kt */
    public interface a {

        /* compiled from: CompositeActionButtonHolderUiDto.kt */
        /* renamed from: xsna.fsi$a$a, reason: collision with other inner class name */
        public static final class C2891a implements a {
            public final tlo0.h a;
            public final tlo0.h b;
            public final String c;

            public C2891a(tlo0.h hVar, tlo0.h hVar2, String str) {
                this.a = hVar;
                this.b = hVar2;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2891a)) {
                    return false;
                }
                C2891a c2891a = (C2891a) obj;
                return this.a.equals(c2891a.a) && this.b.equals(c2891a.b) && epx.f(this.c, c2891a.c);
            }

            public final int hashCode() {
                int c = u11.c(this.a.a.hashCode() * 31, 31, this.b.a);
                String str = this.c;
                return c + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DatePic(month=");
                sb.append(this.a);
                sb.append(", day=");
                sb.append(this.b);
                sb.append(", contentDescription=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: CompositeActionButtonHolderUiDto.kt */
    public interface b {

        /* compiled from: CompositeActionButtonHolderUiDto.kt */
        public static final class a implements b {
            public final tlo0.h a;

            public a(tlo0.h hVar) {
                this.a = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + (this.a.a.hashCode() * 31);
            }

            public final String toString() {
                return "Button(title=" + this.a + ", needInverse=true)";
            }
        }
    }

    public fsi(ActionButtonAttachment actionButtonAttachment, NewsEntry newsEntry, tlo0.h hVar, a aVar, b.a aVar2) {
        super(368, 0, 0, 0, null);
        this.h = actionButtonAttachment;
        this.i = newsEntry;
        this.j = hVar;
        this.k = aVar;
        this.l = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi)) {
            return false;
        }
        fsi fsiVar = (fsi) obj;
        return epx.f(this.h, fsiVar.h) && epx.f(this.i, fsiVar.i) && epx.f(this.j, fsiVar.j) && epx.f(this.k, fsiVar.k) && epx.f(this.l, fsiVar.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int c = u11.c(e630.b(this.h.hashCode() * 31, 31, this.i), 31, this.j.a);
        a aVar = this.k;
        int hashCode = (c + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.l;
        return Integer.hashCode(0) + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        return "CompositeActionButtonHolderUiDto(attachment=" + this.h + ", entry=" + this.i + ", title=" + this.j + ", leftContent=" + this.k + ", rightContent=" + this.l + ", seqId=0)";
    }
}
