package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import xsna.qn60;

/* compiled from: UpdateFavouriteStateEditorAction.kt */
/* loaded from: classes4.dex */
public final class f8q0 implements qn60.b {
    public final NewsEntry a;
    public final pn60 b;

    public f8q0(NewsEntry newsEntry, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        c1g0 c1g0Var;
        qn60.b bVar;
        NewsEntry newsEntry = this.a;
        boolean z = newsEntry instanceof FaveEntry;
        pn60 pn60Var = this.b;
        if (z) {
            Object obj = ((FaveEntry) newsEntry).i.f;
            if (obj instanceof Attachment) {
                bVar = new t7q0((Attachment) obj, pn60Var);
            } else if (obj instanceof Narrative) {
                bVar = new t7q0(new NarrativeAttachment((Narrative) obj), pn60Var);
            } else if (obj instanceof Good) {
                bVar = new t7q0(new MarketAttachment((Good) obj), pn60Var);
            } else if (obj instanceof Post) {
                NewsEntry newsEntry2 = (NewsEntry) obj;
                bVar = new c1g0(newsEntry2, newsEntry2, pn60Var, null);
            } else {
                c1g0Var = new c1g0(newsEntry, newsEntry, pn60Var, null);
            }
            bVar.a(aVar);
        }
        c1g0Var = new c1g0(newsEntry, newsEntry, pn60Var, null);
        bVar = c1g0Var;
        bVar.a(aVar);
    }
}
