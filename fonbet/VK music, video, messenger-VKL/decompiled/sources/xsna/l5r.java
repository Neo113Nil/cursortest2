package xsna;

import com.vk.newsfeed.api.NewsfeedRouter;
import xsna.c9x0;

/* compiled from: FeedWallWithReplyHandler.kt */
/* loaded from: classes7.dex */
public final class l5r implements fhd0, lao0 {
    public final NewsfeedRouter a;

    public l5r(NewsfeedRouter newsfeedRouter) {
        this.a = newsfeedRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        c9x0 c9x0Var = epx.f(fgxVar.a("act"), "edit") ? c9x0.b.b : c9x0.c.b;
        NewsfeedRouter.w(this.a, fgxVar.e, fgxVar.c("postId"), fgxVar.c("replyId"), c9x0Var, blk.P(fgxVar), 32);
    }
}
