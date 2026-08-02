package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: IgnoredHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class fwv extends ol60 {
    public final CharSequence h;
    public final CharSequence i;
    public final NewsEntry j;

    public fwv(String str, CharSequence charSequence, NewsEntry newsEntry) {
        super(288, 0, 0, 0, null);
        this.h = str;
        this.i = charSequence;
        this.j = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwv)) {
            return false;
        }
        fwv fwvVar = (fwv) obj;
        return epx.f(this.h, fwvVar.h) && epx.f(this.i, fwvVar.i) && epx.f(this.j, fwvVar.j);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + e630.b(u11.c(this.h.hashCode() * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "IgnoredHeaderHolderUiDto(title=" + ((Object) this.h) + ", subtitle=" + ((Object) this.i) + ", entry=" + this.j + ", seqId=0)";
    }
}
