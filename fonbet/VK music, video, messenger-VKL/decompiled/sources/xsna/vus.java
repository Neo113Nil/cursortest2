package xsna;

import com.vk.dto.action_button.ActionButtonProgress;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.y6u0;

/* compiled from: FullDonutGoalActionButtonHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class vus implements gn60<Pair<? extends NewsEntry, ? extends ActionButtonAttachment>, wm60> {
    public final List<ol60> a(int i, Pair<? extends NewsEntry, ActionButtonAttachment> pair, wm60 wm60Var) {
        NewsEntry d = pair.d();
        ActionButtonAttachment g = pair.g();
        ActionButtonProgress actionButtonProgress = g.i;
        int i2 = actionButtonProgress != null ? actionButtonProgress.b : 0;
        return Collections.singletonList(new wus(oq.d(tlo0.Companion, g.g), i2 < 100 ? new y6u0.a.b(i2 / 100.0f) : y6u0.a.C4083a.a, d, g));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
