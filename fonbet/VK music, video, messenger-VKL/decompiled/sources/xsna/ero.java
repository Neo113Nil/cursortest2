package xsna;

import com.vk.dto.common.DzenArticleBlockItem;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: DzenArticleCardsUiDto.kt */
/* loaded from: classes4.dex */
public final class ero extends ol60 {
    public final List<DzenArticleBlockItem> h;
    public final boolean i;
    public final bwy j;
    public final String k;

    public ero() {
        throw null;
    }

    public ero(List list, boolean z, bwy bwyVar, String str) {
        super(ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION, 0, 0, 0, null);
        this.h = list;
        this.i = z;
        this.j = bwyVar;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ero)) {
            return false;
        }
        ero eroVar = (ero) obj;
        return epx.f(this.h, eroVar.h) && this.i == eroVar.i && epx.f(this.j, eroVar.j) && epx.f(this.k, eroVar.k);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + qoy.b(this.h.hashCode() * 31, 31, this.i)) * 31;
        String str = this.k;
        return Integer.hashCode(0) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenArticleCardsUiDto(articles=");
        sb.append(this.h);
        sb.append(", isAsync=");
        sb.append(this.i);
        sb.append(", lazyLoadState=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return i5s.a(sb, this.k, ", seqId=0)");
    }
}
