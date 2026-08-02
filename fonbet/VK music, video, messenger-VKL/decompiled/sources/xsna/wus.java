package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import xsna.tlo0;
import xsna.y6u0;

/* compiled from: FullDonutGoalActionButtonHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class wus extends ol60 {
    public final tlo0.h h;
    public final y6u0.a i;
    public final NewsEntry j;
    public final ActionButtonAttachment k;

    public wus(tlo0.h hVar, y6u0.a aVar, NewsEntry newsEntry, ActionButtonAttachment actionButtonAttachment) {
        super(349, 0, 0, 0, null);
        this.h = hVar;
        this.i = aVar;
        this.j = newsEntry;
        this.k = actionButtonAttachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wus)) {
            return false;
        }
        wus wusVar = (wus) obj;
        return epx.f(this.h, wusVar.h) && epx.f(this.i, wusVar.i) && epx.f(this.j, wusVar.j) && epx.f(this.k, wusVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + e630.b((this.i.hashCode() + (this.h.a.hashCode() * 31)) * 31, 31, this.j);
    }

    public final String toString() {
        return "FullDonutGoalActionButtonHolderUiDto(text=" + this.h + ", buttonLeft=" + this.i + ", entry=" + this.j + ", attachment=" + this.k + ')';
    }
}
