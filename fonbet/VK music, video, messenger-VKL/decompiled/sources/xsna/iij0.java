package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import xsna.qn60;

/* compiled from: ShowInlineFeedbackConfirmationEditorAction.kt */
/* loaded from: classes4.dex */
public final class iij0 implements qn60.b {
    public final NewsEntry a;
    public final pn60 b;

    public iij0(NewsEntry newsEntry, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        NewsEntry newsEntry = this.a;
        if (aVar.b(newsEntry)) {
            aVar.e(newsEntry, new hij0(this, 0));
        }
    }
}
