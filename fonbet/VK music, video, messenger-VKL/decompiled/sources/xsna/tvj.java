package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveTwoVkMixesVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.ecomm.market.impl.di.MarketInternalComponent;
import com.vk.ecomm.moderation.impl.restrictions.di.ModerationComponentImpl;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonView;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.live.impl.activity.LivePlayerActivity;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.dating.sdk.js.bridge.api.di.JsDatingSdkDelegateComponent;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e3m;
import xsna.k3z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tvj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tvj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gvv0 view;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new gjl((ddl) obj);
            case 1:
                int i2 = CreatePeopleTransferFragment.B0;
                gpu0 gpu0Var = new gpu0(((CreatePeopleTransferFragment) obj).requireContext());
                gpu0Var.j = new CreatePeopleTransferFragment.b();
                return gpu0Var;
            case 2:
                return androidx.compose.runtime.k.b(new wow((ArrayList) obj));
            case 3:
                return ((egm) obj).d.getString(R.string.vkim_msg_empty);
            case 4:
                v0n v0nVar = (v0n) obj;
                return new z6g(v0nVar.h, v0nVar.i);
            case 5:
                return ((DiscoverMediaTabFragment2) obj).n0;
            case 6:
                hbn hbnVar = (hbn) obj;
                return hbnVar.a.a(hbnVar.g);
            case 7:
                return new nym((NewsfeedRouter) ((fyq) obj).N.getValue());
            case 8:
                ((ihr) obj).b.invoke(Boolean.TRUE);
                return s3q0.a;
            case 9:
                ((jpr) obj).b.invalidate();
                return s3q0.a;
            case 10:
                flt fltVar = (flt) obj;
                mo60 mo60Var = fltVar.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) fltVar.c.getValue()).cc());
            case 11:
                int i3 = GroupMembersFragment.k0;
                return ((SearchParamsComponent) m7m.d((GroupMembersFragment) obj).a(fpf0.a(SearchParamsComponent.class))).Db();
            case 12:
                int i4 = GroupedNotificationListFragment.Y;
                return ((NotificationsSettingsComponent) m7m.d((GroupedNotificationListFragment) obj).a(fpf0.a(NotificationsSettingsComponent.class))).a();
            case 13:
                return ((NarrativeComponent) ((k7m) m7m.f((com.vk.upload.impl.tasks.l) obj)).a(fpf0.a(NarrativeComponent.class))).Ic();
            case 14:
                return new skv(Uri.parse(((ckv) obj).b));
            case 15:
                quv quvVar = (quv) obj;
                StoriesComponent storiesComponent = (StoriesComponent) ((k7m) m7m.c(quvVar)).a(fpf0.a(StoriesComponent.class));
                StoryViewerComponent storyViewerComponent = (StoryViewerComponent) ((k7m) m7m.c(quvVar)).a(fpf0.a(StoryViewerComponent.class));
                StickersComponent stickersComponent = (StickersComponent) ((k7m) m7m.c(quvVar)).a(fpf0.a(StickersComponent.class));
                StoryEditorComponent storyEditorComponent = (StoryEditorComponent) ((k7m) m7m.c(quvVar)).a(fpf0.a(StoryEditorComponent.class));
                huv huvVar = new huv(stickersComponent.zc(), storiesComponent.t0());
                uvl0 eb = storiesComponent.eb();
                p870 w = storiesComponent.w();
                g9m0 ff = storyEditorComponent.ff();
                pam0 I2 = storiesComponent.I2();
                b25 a = o25.a();
                t2l t2lVar = new t2l(quvVar, 12);
                StoriesContainer storiesContainer = quvVar.u;
                IdeasStoriesContainer ideasStoriesContainer = storiesContainer instanceof IdeasStoriesContainer ? (IdeasStoriesContainer) storiesContainer : null;
                return new ktv(new fuv(new juv(EmptyList.b, 0, new vya0(true, false), new xqj(true, false, false, true, false), null, false, 1.0f, false)), new muv(storyViewerComponent.b()), new ptv(huvVar, eb, w, ff, I2, a, t2lVar, (ideasStoriesContainer == null || ideasStoriesContainer.r != null) ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_VIEWER : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PUBLISHING_IDEA));
            case 16:
                return new w1n0(((l2y) obj).e);
            case 17:
                fvv0 M = ((d4y) obj).a.M();
                if (M != null && (view = M.getView()) != null) {
                    view.Ei();
                }
                return s3q0.a;
            case 18:
                r6y r6yVar = (r6y) obj;
                return ((JsDatingSdkDelegateComponent) x6y.H().a(fpf0.a(JsDatingSdkDelegateComponent.class))).f9().a(new sbg(r6yVar, 29), r6yVar.M(), r6yVar);
            case 19:
                k3z k3zVar = (k3z) obj;
                k3zVar.d0 = k3z.b.DENIED;
                k3zVar.f1();
                return s3q0.a;
            case 20:
                int i5 = LivePlayerActivity.M;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
                a2.getClass();
                return a2.e((VideoFile) obj, null);
            case 21:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                f11 f11Var = (f11) ref$ObjectRef.element;
                if (f11Var != null) {
                    dw20 dw20Var = f11Var.d;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    f11Var.d = null;
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            case 22:
                qcy<Object>[] qcyVarArr = MarketLinkedContentFragment.R;
                return ((MarketInternalComponent) m7m.d((MarketLinkedContentFragment) obj).mo408a(fpf0.a(MarketInternalComponent.class))).c;
            case 23:
                return ((MusicPrefsComponent) ((k7m) m7m.f((km20) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 24:
                return ((MiniPlayerControllersWrapper) obj).q;
            case 25:
                int i6 = ModalPostAllReactionsFragment.Z;
                Bundle arguments = ((ModalPostAllReactionsFragment) obj).getArguments();
                if (arguments != null) {
                    return (ReactionMeta) arguments.getParcelable("reaction");
                }
                return null;
            case 26:
                ModerationComponentImpl moderationComponentImpl = (ModerationComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = ModerationComponentImpl.g;
                return new t530(moderationComponentImpl.Q2(), moderationComponentImpl.bd(), moderationComponentImpl.uf());
            case 27:
                Context a3 = ((ip30) obj).a();
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.vk_icon_song_outline_28, a3);
            case 28:
                return Integer.valueOf(e3m.d(R.attr.im_msg_box_margin_start_no_avatar, ((MsgSkeletonView.c) obj).itemView.getContext()));
            default:
                ViewGroup viewGroup = ((MusicInteractiveTwoVkMixesVh) obj).t.j;
                (viewGroup != null ? viewGroup : null).performHapticFeedback(0);
                return s3q0.a;
        }
    }
}
