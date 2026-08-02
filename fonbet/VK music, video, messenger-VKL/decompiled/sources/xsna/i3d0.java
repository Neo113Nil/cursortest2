package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import java.util.ArrayList;

/* compiled from: PrettyCardsHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class i3d0 extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final PrettyCardAttachment j;
    public final ArrayList k;

    public i3d0(NewsEntry newsEntry, NewsEntry newsEntry2, PrettyCardAttachment prettyCardAttachment, ArrayList arrayList) {
        super(49, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = prettyCardAttachment;
        this.k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3d0)) {
            return false;
        }
        i3d0 i3d0Var = (i3d0) obj;
        return epx.f(this.h, i3d0Var.h) && epx.f(this.i, i3d0Var.i) && epx.f(this.j, i3d0Var.j) && epx.f(this.k, i3d0Var.k);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qr.a(this.k, (this.j.hashCode() + e630.b(this.h.hashCode() * 31, 31, this.i)) * 31, 31);
    }

    public final String toString() {
        return "PrettyCardsHolderUiDto(entry=" + this.h + ", rootEntry=" + this.i + ", attachment=" + this.j + ", cards=" + this.k + ", seqId=0)";
    }
}
