package xsna;

import com.vk.feed.settings.api.domain.model.FilteredSourceType;

/* compiled from: FilteredSourceTabUiDto.kt */
/* loaded from: classes18.dex */
public final class xer {
    public final CharSequence a;
    public final FilteredSourceType b;
    public final int c;

    public xer(String str, FilteredSourceType filteredSourceType, int i) {
        this.a = str;
        this.b = filteredSourceType;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xer)) {
            return false;
        }
        xer xerVar = (xer) obj;
        return epx.f(this.a, xerVar.a) && this.b == xerVar.b && this.c == xerVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilteredSourceTabUiDto(title=");
        sb.append((Object) this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", id=");
        return vu5.b(sb, this.c, ')');
    }
}
