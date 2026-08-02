package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.NewsfeedRouter;
import xsna.i9l;

/* compiled from: FeedWallSearchHandler.kt */
/* loaded from: classes7.dex */
public final class k5r implements fhd0 {
    public final NewsfeedRouter a;

    public k5r(NewsfeedRouter newsfeedRouter) {
        this.a = newsfeedRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        String a = fgxVar.a(CampaignEx.JSON_KEY_AD_Q);
        if (a == null) {
            fgxVar.b();
            return;
        }
        long l = cqm0.l(fgxVar.c("userId"));
        NewsfeedRouter.l(this.a, fgxVar.e, a, new UserId(l), null, null, null, null, 120);
        blk.P(fgxVar).onSuccess();
        fgxVar.j = i9l.b.a;
        fgxVar.e();
    }
}
