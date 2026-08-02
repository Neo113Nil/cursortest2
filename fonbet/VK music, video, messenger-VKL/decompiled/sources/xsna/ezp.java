package xsna;

import android.os.Parcelable;
import android.view.View;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vkontakte.android.attachments.EventAttachment;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ezp implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Parcelable g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ezp(Object obj, Object obj2, Object obj3, Object obj4, Parcelable parcelable, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = parcelable;
        this.h = obj5;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.h;
        Parcelable parcelable = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                EventAttachment eventAttachment = (EventAttachment) obj5;
                u1c0 u1c0Var = (u1c0) obj4;
                gzp gzpVar = (gzp) obj3;
                NewsEntry newsEntry = (NewsEntry) parcelable;
                String str = (String) obj2;
                ((Owner) obj6).g(4, false);
                eventAttachment.i = 0;
                if (u1c0Var != null) {
                    u1c0Var.h = gzp.Y6(newsEntry, eventAttachment);
                }
                ((p870) gzpVar.T.getValue()).e(120, eventAttachment);
                if (newsEntry instanceof Post) {
                    String str2 = com.vk.newsfeed.common.util.k.a;
                    Post post = (Post) newsEntry;
                    com.vk.newsfeed.common.util.k.l(post.n, post.m, str, "attach", false);
                }
                break;
            default:
                View view = (View) obj6;
                h7j0 h7j0Var = (h7j0) obj5;
                q7v0 q7v0Var = (q7v0) obj3;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) parcelable;
                int i2 = m8v0.M;
                String string = view.getContext().getString(h7j0Var.a);
                VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
                VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size64;
                VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                VkOnboardingStat$Type vkOnboardingStat$Type = VkOnboardingStat$Type.Tooltip;
                String str3 = h7j0Var.b.b;
                VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                m8v0.a.a(view, string, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, null, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, new du0(25, q7v0Var, vkOnboardingCampaign), new ue40(10, q7v0Var, vkOnboardingCampaign), new q8w(28), new fuh0(6), new ulq0(1, q7v0Var, vkOnboardingCampaign), new jy5(q7v0Var, vkOnboardingCampaign, (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj2, 9), ((VkOnboardingComponent) obj4).ac(vkOnboardingStat$Type, str3), 0, false, null, null, false, null, false, 16089124);
                break;
        }
        return s3q0.a;
    }
}
