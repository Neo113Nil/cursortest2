package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.narratives.Narrative;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.StickerAttachment;

/* compiled from: BaseChipWithAttachmentSpan.kt */
/* loaded from: classes4.dex */
public abstract class eb6 extends db6 {
    public final Attachment j;
    public hxi k;

    public eb6(Attachment attachment, boolean z) {
        super(z);
        this.j = attachment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.rku0
    public final void f(Context context, View view) {
        s980 s980Var;
        hxi hxiVar = this.k;
        if (hxiVar != null) {
            bio0 bio0Var = (bio0) hxiVar.b;
            NewsEntry newsEntry = (NewsEntry) hxiVar.c;
            Attachment attachment = this.j;
            if (attachment instanceof DonutLinkAttachment) {
                DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
                s980 s980Var2 = bio0Var.y;
                if (s980Var2 != 0) {
                    s980Var2.Hh(bio0Var.itemView, bio0Var.J0(), bio0Var.q6(), donutLinkAttachment);
                    return;
                }
                return;
            }
            if (attachment instanceof ArticleAttachment) {
                ArticleAttachment articleAttachment = (ArticleAttachment) attachment;
                Article article = articleAttachment.f;
                if (article.j()) {
                    cvk.u(R.string.article_deleted, false);
                    return;
                }
                if (!article.g()) {
                    cvk.u(R.string.article_protected, false);
                    return;
                }
                s980 s980Var3 = bio0Var.y;
                if (s980Var3 != null) {
                    s980Var3.Mg(bio0Var.itemView, bio0Var.J0(), newsEntry, articleAttachment);
                    return;
                }
                return;
            }
            if (!(attachment instanceof NarrativeAttachment)) {
                if (attachment instanceof StickerAttachment) {
                    zal0.H(g2v.d().a(), bio0Var.itemView.getContext(), ((StickerAttachment) attachment).g, GiftData.d, null, "comment", null, 96);
                    return;
                } else {
                    if (attachment == null || (s980Var = bio0Var.y) == null) {
                        return;
                    }
                    s980Var.Mg(bio0Var.itemView, bio0Var.J0(), newsEntry, attachment);
                    return;
                }
            }
            NarrativeAttachment narrativeAttachment = (NarrativeAttachment) attachment;
            Narrative narrative = narrativeAttachment.f;
            if (narrative.h) {
                cvk.u(R.string.narrative_deleted, false);
                return;
            }
            if (!narrative.Ab()) {
                cvk.u(R.string.narrative_private, false);
                return;
            }
            s980 s980Var4 = bio0Var.y;
            if (s980Var4 != null) {
                s980Var4.Mg(bio0Var.itemView, bio0Var.J0(), newsEntry, narrativeAttachment);
            }
        }
    }

    @Override // xsna.db6
    public final boolean r() {
        return this.k != null;
    }
}
