package xsna;

import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: BlockHeaderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class ff7 extends ol60 {
    public final String h;
    public final Integer i;
    public final NewsEntry j;
    public final boolean k;
    public final VkGroupHeader.c l;

    public ff7(String str, Integer num, NewsEntry newsEntry, boolean z, VkGroupHeader.c cVar) {
        super(202, 0, 0, 0, null);
        this.h = str;
        this.i = num;
        this.j = newsEntry;
        this.k = z;
        this.l = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff7)) {
            return false;
        }
        ff7 ff7Var = (ff7) obj;
        return epx.f(this.h, ff7Var.h) && epx.f(this.i, ff7Var.i) && epx.f(this.j, ff7Var.j) && this.k == ff7Var.k && epx.f(this.l, ff7Var.l);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        Integer num = this.i;
        int a = shy.a(0, qoy.b(e630.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.j), 31, this.k), 31);
        VkGroupHeader.c cVar = this.l;
        return a + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "BlockHeaderHolderUiDto(title=" + this.h + ", titleResId=" + this.i + ", entry=" + this.j + ", isSeparatorVisible=" + this.k + ", seqId=0, subtitle=" + this.l + ')';
    }
}
