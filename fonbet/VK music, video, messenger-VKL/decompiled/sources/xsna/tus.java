package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import xsna.tlo0;

/* compiled from: FullActionButtonHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class tus extends ol60 {
    public final tlo0.h h;
    public final NewsEntry i;
    public final ActionButtonAttachment j;

    public tus(tlo0.h hVar, NewsEntry newsEntry, ActionButtonAttachment actionButtonAttachment) {
        super(347, 0, 0, 0, null);
        this.h = hVar;
        this.i = newsEntry;
        this.j = actionButtonAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tus)) {
            return false;
        }
        tus tusVar = (tus) obj;
        return epx.f(this.h, tusVar.h) && epx.f(this.i, tusVar.i) && epx.f(this.j, tusVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + e630.b(this.h.a.hashCode() * 31, 31, this.i);
    }

    public final String toString() {
        return "FullActionButtonHolderUiDto(text=" + this.h + ", entry=" + this.i + ", attachment=" + this.j + ')';
    }
}
