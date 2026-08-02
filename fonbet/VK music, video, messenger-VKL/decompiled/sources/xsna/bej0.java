package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.ClickArea;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Collections;

/* compiled from: ShittyClipOpenDelegate.kt */
/* loaded from: classes4.dex */
public final class bej0 implements s0t0 {
    public final Context b;
    public final ClipsRouter c;
    public final s2f d;
    public u1c0 e;

    public bej0(Context context, ClipsRouter clipsRouter, s2f s2fVar) {
        this.b = context;
        this.c = clipsRouter;
        this.d = s2fVar;
    }

    @Override // xsna.s0t0
    public final void a(fh5 fh5Var) {
        Integer num;
        u1c0 u1c0Var = this.e;
        NewsEntry newsEntry = u1c0Var != null ? u1c0Var.b : null;
        ShitAttachment shitAttachment = newsEntry instanceof ShitAttachment ? (ShitAttachment) newsEntry : null;
        ClickArea clickArea = (shitAttachment == null || (num = shitAttachment.h0) == null) ? null : new ClickArea(num.intValue());
        if (clickArea != null) {
            AdClickContext adClickContext = AdClickContext.VIDEO;
            if (clickArea.a(adClickContext)) {
                u1c0 u1c0Var2 = this.e;
                hd60.a().r0(this.b, shitAttachment, u1c0Var2 != null ? u1c0Var2.k : -1, adClickContext);
                return;
            }
        }
        ClipsRouter.c(this.c, this.b, Collections.singletonList(new ClipFeedTab.SingleAdv(this.d.c(fh5Var.o), null, 2, null)), fh5Var, null, null, null, null, false, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
    }
}
