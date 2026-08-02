package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: FullActionButtonHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class sus implements gn60<Pair<? extends NewsEntry, ? extends ActionButtonAttachment>, wm60> {
    public final List<ol60> a(int i, Pair<? extends NewsEntry, ActionButtonAttachment> pair, wm60 wm60Var) {
        NewsEntry d = pair.d();
        ActionButtonAttachment g = pair.g();
        return Collections.singletonList(new tus(oq.d(tlo0.Companion, g.g), d, g));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
