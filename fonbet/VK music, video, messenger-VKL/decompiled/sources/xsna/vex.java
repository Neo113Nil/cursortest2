package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.imagepipeline.request.ImageRequest;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.clips.sdk.target.impl.di.MyTargetComponentImpl;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.api.RestrictCombinationRule;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.obf0;
import xsna.q1b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vex implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vex(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        sos0 Z7;
        int a;
        OmFinishSession initialize$lambda$220$lambda$157;
        boolean z = false;
        switch (this.b) {
            case 0:
                return (StoryProgressView) ((wex) this.c).itemView.findViewById(R.id.video_single_clip_song_progress);
            case 1:
                return (TextView) ((oly) this.c).a.findViewById(R.id.nativeads_title);
            case 2:
                return rhs.b().h(ImageRequest.a((Uri) this.c));
            case 3:
                n9n0 n9n0Var = (n9n0) this.c;
                if (n9n0Var == null || !epx.f(k720.R, n9n0Var)) {
                    k720.R = n9n0Var;
                    io.reactivex.rxjava3.subjects.h hVar = k720.E;
                    it80.b.getClass();
                    hVar.onNext(new it80(n9n0Var));
                }
                return s3q0.a;
            case 4:
                com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b bVar = (com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b) this.c;
                qcy<Object>[] qcyVarArr = com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.b.n1;
                return ((BridgeComponent) ((k7m) m7m.f(bVar)).a(fpf0.a(BridgeComponent.class))).p();
            case 5:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                j3f0 e = aVar.A.e();
                if (e != null) {
                    return e.h(aVar.l);
                }
                return null;
            case 6:
                MusicSnippetsFragment musicSnippetsFragment = (MusicSnippetsFragment) this.c;
                int i = MusicSnippetsFragment.Y;
                return ((MusicAnalyticsComponent) m7m.d(musicSnippetsFragment).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 7:
                return (TextView) ((a850) this.c).findViewById(R.id.tvTrackName);
            case 8:
                return ((yj50) this.c).b();
            case 9:
                AppContextDiComponent appContextDiComponent = (AppContextDiComponent) this.c;
                qcy<Object>[] qcyVarArr2 = MyTargetComponentImpl.f;
                return (zix) ofx.a(appContextDiComponent.a);
            case 10:
                ((yx50) this.c).y0();
                return s3q0.a;
            case 11:
                return ((AdsSdkComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.fragments.a) this.c)).mo408a(fpf0.a(AdsSdkComponent.class))).P5();
            case 12:
                return (StoryViewerComponent) ((k7m) m7m.f((j070) this.c)).a(fpf0.a(StoryViewerComponent.class));
            case 13:
                return new en30(((yk70) this.c).b);
            case 14:
                return Float.valueOf(((mc90) this.c).l());
            case 15:
                xk80 xk80Var = (xk80) this.c;
                if (!wn80.w) {
                    xk80Var = null;
                }
                if (xk80Var != null) {
                    return new zmo();
                }
                return null;
            case 16:
                VideoGrowthComponent videoGrowthComponent = ((PaginatedGridListVh) this.c).w;
                if (videoGrowthComponent != null && (Z7 = videoGrowthComponent.Z7()) != null) {
                    Z7.f(CommunityGrowthTrapScreen.VIDEO_GROUP_MAIN, CommunityGrowthTrapEvent.BOTTOM_BANNER);
                }
                return s3q0.a;
            case 17:
                lv90 lv90Var = (lv90) this.c;
                zak0 zak0Var = (zak0) lv90Var.l1;
                float f = ((VkPeopleSearchParams) zak0Var.getValue()).d;
                awf awfVar = lv90Var.p1;
                if ((f <= awfVar.b && ((VkPeopleSearchParams) zak0Var.getValue()).e >= awfVar.c) || (((VkPeopleSearchParams) zak0Var.getValue()).d == 0 && ((VkPeopleSearchParams) zak0Var.getValue()).e == 0)) {
                    return lv90Var.getResources().getString(R.string.vk_discover_search_any);
                }
                return lv90Var.getResources().getString(R.string.vk_age_from, Integer.valueOf(((VkPeopleSearchParams) zak0Var.getValue()).d)) + ' ' + lv90Var.getResources().getString(R.string.vk_age_to, Integer.valueOf(((VkPeopleSearchParams) zak0Var.getValue()).e));
            case 18:
                c4a0 c4a0Var = (c4a0) this.c;
                c4a0Var.e.a(new r090(com.vk.registration.funnels.b.a, 1));
                c4a0Var.c.invoke(VkPhoneValidationErrorReason.LATER);
                return s3q0.a;
            case 19:
                q1b0 q1b0Var = (q1b0) this.c;
                if (q1b0Var instanceof q1b0.a) {
                    if (((q1b0.a) q1b0Var).c.getVisibility() == 0) {
                        z = true;
                    }
                } else {
                    if (!(q1b0Var instanceof q1b0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((Boolean) ((q1b0.b) q1b0Var).d.invoke()).booleanValue();
                }
                return Boolean.valueOf(z);
            case 20:
                return new PorterDuffColorFilter(e3m.f(R.attr.vk_ui_overlay_primary, ((otc0) this.c).a), PorterDuff.Mode.SRC_ATOP);
            case 21:
                return ((CartComponent) ((rkd0) this.c).a.getValue()).f8();
            case 22:
                return qv20.e(((rbe0) this.c).a.mo2getContext(), Integer.valueOf(R.string.loading));
            case 23:
                obf0 obf0Var = (obf0) this.c;
                int i2 = obf0.a.$EnumSwitchMapping$0[obf0Var.q.ordinal()];
                if (i2 == 1) {
                    a = e3m.a(R.dimen.recomm_carousel_item_width, obf0Var.itemView.getContext());
                } else if (i2 == 2) {
                    a = e3m.a(R.dimen.recomm_carousel_small_item_width, obf0Var.itemView.getContext());
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a = e3m.a(R.dimen.recomm_carousel_large_item_width, obf0Var.itemView.getContext());
                }
                return Integer.valueOf(a);
            case 24:
                return (pef0) this.c;
            case 25:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.PASSPORT_RESTORE, (ArrayList) this.c, null, null, 28);
                return s3q0.a;
            case 26:
                String str = ((RestrictCombinationRule) this.c).c;
                if (str != null) {
                    return new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.StringText(str), null, 4, null);
                }
                return null;
            case 27:
                Toast.makeText((Context) this.c, "on mic voice clicked", 0).show();
                return s3q0.a;
            case 28:
                initialize$lambda$220$lambda$157 = ServiceProvider.initialize$lambda$220$lambda$157((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$157;
            default:
                return ((SettingsFragmentInternalComponent) this.c).d.a();
        }
    }
}
