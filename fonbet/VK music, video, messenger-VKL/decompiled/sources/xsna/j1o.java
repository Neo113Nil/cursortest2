package xsna;

import android.content.Context;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
import com.vkontakte.android.data.DonutAnalytics;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DonutPostClickHandler.kt */
/* loaded from: classes4.dex */
public final class j1o {

    /* compiled from: DonutPostClickHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutPostClickSource.values().length];
            try {
                iArr[DonutPostClickSource.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutPostClickSource.Button.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(qi6<?> qi6Var, Context context, r1o r1oVar, p4r p4rVar, DonutPostClickSource donutPostClickSource) {
        DonutAnalytics.DonutCustomTeaserScreen donutCustomTeaserScreen;
        int i = r1oVar.b;
        UserId userId = r1oVar.a;
        Action action = r1oVar.c;
        s1c0 s1c0Var = qi6Var.x;
        if (s1c0Var != null && (donutCustomTeaserScreen = s1c0Var.B) != null) {
            DonutAnalytics.e(userId, donutCustomTeaserScreen, i);
            if (action instanceof ActionOpenUrl) {
                action = DonutAnalytics.a((ActionOpenUrl) action, cqm0.m(DonutAnalytics.c(donutCustomTeaserScreen).name()));
            }
        }
        hd60.a().v(action, context, (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : qi6Var.u, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
        int i2 = a.$EnumSwitchMapping$0[donutPostClickSource.ordinal()];
        if (i2 == 1) {
            String str = qi6Var.v;
            Integer valueOf = Integer.valueOf(i);
            p4rVar.getClass();
            p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.ATTACHMENT_BACKGROUND, str, userId, valueOf);
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = qi6Var.v;
        Integer valueOf2 = Integer.valueOf(i);
        p4rVar.getClass();
        p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.ATTACHMENT_BUTTON, str2, userId, valueOf2);
    }
}
