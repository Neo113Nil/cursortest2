package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;

/* compiled from: Html5SurveyPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class fhv extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final UxPollsEntry k0(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.a;
        if (newsEntry instanceof UxPollsEntry) {
            return (UxPollsEntry) newsEntry;
        }
        return null;
    }
}
