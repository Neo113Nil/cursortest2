package xsna;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.avatarchange.AvatarChangeCropFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.business.notifications.impl.BusinessNotificationComponentImpl;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import ru.ok.android.sdk.api.OkApi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        OkApi apiImpl_delegate$lambda$0;
        ClipsScreenPerformanceReporter clipsScreenPerformanceReporter;
        switch (this.b) {
            case 0:
                AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.c;
                int i = AbsFriendsAndFollowersTabFragment.X;
                return absFriendsAndFollowersTabFragment.fo().j;
            case 1:
                ActionLinkView actionLinkView = (ActionLinkView) this.c;
                bpn0 bpn0Var = ActionLinkView.f;
                return (ImageView) actionLinkView.findViewById(R.id.video_action_link_icon);
            case 2:
                ((com.vk.clips.sdk.shared.item.ads.c) this.c).B.a(AdsItemViewEvent.j.b);
                return s3q0.a;
            case 3:
                s21.v().a(StoryViewAction.CLICK_DEEPLINK, (StoryEntry) this.c);
                return s3q0.a;
            case 4:
                AllHighlightsFragment allHighlightsFragment = (AllHighlightsFragment) this.c;
                int i2 = AllHighlightsFragment.g0;
                return new yt1((zt1) allHighlightsFragment.S, new AllHighlightsFragment.a(1, allHighlightsFragment.Y, androidx.recyclerview.widget.r.class, "startDrag", "startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", 0), (String) allHighlightsFragment.a0.getValue(), (j6v) allHighlightsFragment.b0.getValue());
            case 5:
                apiImpl_delegate$lambda$0 = ApiModuleImpl.apiImpl_delegate$lambda$0((ApiModuleImpl) this.c);
                return apiImpl_delegate$lambda$0;
            case 6:
                AvatarChangeCropFragment avatarChangeCropFragment = (AvatarChangeCropFragment) this.c;
                int i3 = AvatarChangeCropFragment.a0;
                return new AvatarChangeCropFragment.a(avatarChangeCropFragment);
            case 7:
                ((c7v0) ((x65) this.c)).b.finish();
                return s3q0.a;
            case 8:
                ((k86) this.c).A7();
                return s3q0.a;
            case 9:
                ((q21) this.c).invoke();
                return s3q0.a;
            case 10:
                u48 u48Var = (u48) this.c;
                u76 u76Var = u48Var.m;
                if (u76Var != null) {
                    u76Var.C2(u48Var.m());
                }
                return s3q0.a;
            case 11:
                BusinessNotificationComponentImpl businessNotificationComponentImpl = (BusinessNotificationComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = BusinessNotificationComponentImpl.c;
                a1w a1wVar = q1w.a;
                return new lo8(a1wVar != null ? a1wVar : null, businessNotificationComponentImpl.a.He());
            case 12:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i4 = ChannelFragment.a1;
                AudienceResearchComponent audienceResearchComponent = (AudienceResearchComponent) m7m.d(channelFragment).a(fpf0.a(AudienceResearchComponent.class));
                return new dgq(audienceResearchComponent.b(), audienceResearchComponent.Z2(), channelFragment.p0);
            case 13:
                iab iabVar = (iab) this.c;
                int i5 = iab.l1;
                iabVar.dismiss();
                return s3q0.a;
            case 14:
                ((ChatFragment) this.c).e1 = null;
                return s3q0.a;
            case 15:
                ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
                return s3q0.a;
            case 16:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i6 = ClipFeedListFragment.a2;
                Bundle arguments = clipFeedListFragment.getArguments();
                return (arguments == null || (clipsScreenPerformanceReporter = (ClipsScreenPerformanceReporter) arguments.getParcelable("ClipFeedListFragment.ui_performance_reporter_key")) == null) ? new ClipsScreenPerformanceReporter(null) : clipsScreenPerformanceReporter;
            case 17:
                ((hg) this.c).invoke();
                return s3q0.a;
            case 18:
                u6e u6eVar = (u6e) this.c;
                te0 te0Var = u6eVar.f.q;
                int i7 = ClipFeedListFragment.a2;
                return new j8e(qsk0.a, new com.vk.movika.sdk.base.model.e(u6eVar, 19));
            case 19:
                nce nceVar = (nce) this.c;
                nceVar.C0(new v7(15));
                nceVar.n = true;
                return s3q0.a;
            case 20:
                return (VkText) ((xle) this.c).findViewById(R.id.clips_music_template_song_name);
            case 21:
                roe roeVar = (roe) this.c;
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a = roeVar.a();
                aVar.getClass();
                return Boolean.valueOf(a != null && a.getBoolean("ClipsWrapperFragment.open_with_default_tabs", false));
            case 22:
                return (mhd) ((i8f) this.c).h.d.getValue();
            case 23:
                ClipsWrapperInputArguments clipsWrapperInputArguments = (ClipsWrapperInputArguments) this.c;
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a2 = clipsWrapperInputArguments.a();
                aVar2.getClass();
                if (a2 != null) {
                    return (ClipFeedTransientArgumentsContainer) a2.getParcelable("ClipsWrapperFragment.transient_arguments");
                }
                return null;
            case 24:
                ((fuv0) this.c).close();
                return s3q0.a;
            case 25:
                ((qsg) this.c).k.k();
                return s3q0.a;
            case 26:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c).c.invoke(a.b.b);
                return s3q0.a;
            case 27:
                cr4 cr4Var = ((q5i) this.c).E;
                return new lm4(cr4Var.a(), cr4Var.c(), null, 12);
            case 28:
                u1j u1jVar = (u1j) this.c;
                View findViewById = u1jVar.findViewById(R.id.recreate_rooms_button);
                bwt0.i0(findViewById, new jm0(u1jVar, 18));
                return findViewById;
            default:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess(Boolean.TRUE);
                return s3q0.a;
        }
    }
}
