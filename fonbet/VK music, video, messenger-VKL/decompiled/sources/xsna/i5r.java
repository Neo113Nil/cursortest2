package xsna;

import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.home.HomeFragment2;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.toggle.features.FeedFeatures;
import xsna.c9x0;

/* compiled from: FeedWallPostHandler.kt */
/* loaded from: classes7.dex */
public final class i5r implements fhd0, lao0 {
    public final NewsfeedRouter a;

    /* compiled from: FeedWallPostHandler.kt */
    public static final class a {
        public static boolean a(String str, String str2, c9x0 c9x0Var, String str3) {
            return ((str2 != null) || (str != null && brm0.B(str, "im", false)) || (str != null && (str.equals("feed_top") || str.equals("feed_recent") || str.equals("feed_friends") || brm0.B(str, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, false) || brm0.B(str, "club", false))) || c9x0Var.equals(c9x0.b.b) || epx.f(str3, "unifypost_co_owner_status")) ? false : true;
        }
    }

    public i5r(NewsfeedRouter newsfeedRouter) {
        this.a = newsfeedRouter;
    }

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        int i;
        int i2;
        String a2 = fgxVar.a("thread");
        if (a2 != null && a2.length() != 0) {
            long l = cqm0.l(fgxVar.c("userId"));
            int i3 = 0;
            try {
                i = Integer.parseInt(fgxVar.c("postIdShort"));
            } catch (Throwable unused) {
                i = 0;
            }
            Context context = fgxVar.e;
            UserId userId = new UserId(l);
            try {
                i2 = Integer.parseInt(a2);
            } catch (Throwable unused2) {
                i2 = 0;
            }
            try {
                i3 = Integer.parseInt(fgxVar.a("reply"));
            } catch (Throwable unused3) {
            }
            hc60.a(i, i2, i3, context, userId, blk.P(fgxVar));
            return;
        }
        String a3 = fgxVar.a("reply");
        c9x0 c9x0Var = epx.f(fgxVar.a("act"), "edit") ? c9x0.b.b : c9x0.c.b;
        boolean a4 = a.a(blk.O(fgxVar).d, a3, c9x0Var, blk.O(fgxVar).z);
        FeedFeatures feedFeatures = FeedFeatures.FEED_OPEN_POST_LINK;
        feedFeatures.getClass();
        if (!com.vk.toggle.b.A.a(feedFeatures) || !a4) {
            NewsfeedRouter.w(this.a, fgxVar.e, fgxVar.c("postIdLong"), a3, c9x0Var, blk.P(fgxVar), 32);
        } else {
            HomeFragment2.a aVar = new HomeFragment2.a();
            aVar.y(fgxVar.c("postIdLong"));
            aVar.k(fgxVar.e);
            blk.P(fgxVar).onSuccess();
        }
    }
}
