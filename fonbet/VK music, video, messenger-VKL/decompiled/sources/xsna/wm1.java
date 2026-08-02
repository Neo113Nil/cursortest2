package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.libvideo.api.di.VideoPlaybackSpeedComponent;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.bb4;
import xsna.mxh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wm1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wm1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 4;
        int i3 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i4 = AlbumsFragment.j0;
                return (PhotosComponent) m7m.d((AlbumsFragment) obj).a(fpf0.a(PhotosComponent.class));
            case 1:
                return Boolean.valueOf(!((bb4.a) obj).d.get());
            case 2:
                ct4 ct4Var = (ct4) obj;
                return new AtomicReference(new qs4(ct4Var.d(ct4Var.h), new ka0(ct4Var, i2)));
            case 3:
                return ((VideoPlaybackSpeedComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) obj).d)).mo408a(fpf0.a(VideoPlaybackSpeedComponent.class))).m0();
            case 4:
                AvatarView avatarView = (AvatarView) obj;
                AvatarView.a aVar = AvatarView.y;
                avatarView.getContext();
                return new qmm(avatarView.w);
            case 5:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((u440) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).l6();
            case 6:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj;
                int i5 = BasePhotoListFragment.l0;
                gj6 io2 = basePhotoListFragment.io();
                return new faa0(new m00(basePhotoListFragment, i3), new p40(basePhotoListFragment, 11), new s9(basePhotoListFragment, 8), io2 != null ? ((wj6) io2).h : null);
            case 7:
                ((of7) obj).e.invoke();
                return s3q0.a;
            case 8:
                o48 o48Var = (o48) obj;
                ikv0 ikv0Var = (ikv0) ((zak0) o48Var.l).getValue();
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                ((zak0) o48Var.l).setValue(null);
                return s3q0.a;
            case 9:
                return new p19(BuildInfo.h(), new s29((t29) ((e29) obj).a.getValue()));
            case 10:
                return CallModuleImpl.i((CallModuleImpl) obj);
            case 11:
                return (TextView) ((ViewGroup) ((mxa) obj).a.getValue()).findViewById(R.id.im_channel_deactivated_title);
            case 12:
                int i6 = ChannelFragment.a1;
                return ((BridgeComponent) m7m.d((ChannelFragment) obj).a(fpf0.a(BridgeComponent.class))).ob();
            case 13:
                ChatFragment chatFragment = (ChatFragment) obj;
                if (chatFragment.H0 == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                arrayList.addAll((aVar2 != null ? aVar2 : null).t1());
                Msg msg = chatFragment.G0;
                if (msg == null) {
                    return arrayList;
                }
                arrayList.add(msg);
                return arrayList;
            case 14:
                int i7 = ClipFeedListFragment.a2;
                return new y5e(((ClipFeedListFragment) obj).Ka());
            case 15:
                return Boolean.valueOf(a020.v(((zzf0) obj).o));
            case 16:
                int i8 = ClipsEntryPointsFragment.i0;
                return ((VkOnboardingComponent) m7m.d((ClipsEntryPointsFragment) obj).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 17:
                ClipsFavoritesComponentImpl clipsFavoritesComponentImpl = (ClipsFavoritesComponentImpl) obj;
                qcy<Object>[] qcyVarArr = ClipsFavoritesComponentImpl.l;
                nwy nwyVar = clipsFavoritesComponentImpl.e;
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                qcy<Object> qcyVar = qcyVarArr2[3];
                mgj0 mgj0Var = (mgj0) nwyVar.c();
                nwy nwyVar2 = clipsFavoritesComponentImpl.f;
                qcy<Object> qcyVar2 = qcyVarArr2[4];
                lax0 lax0Var = (lax0) nwyVar2.c();
                nwy nwyVar3 = clipsFavoritesComponentImpl.h;
                qcy<Object> qcyVar3 = qcyVarArr2[6];
                c4e c4eVar = (c4e) nwyVar3.c();
                nwy nwyVar4 = clipsFavoritesComponentImpl.i;
                qcy<Object> qcyVar4 = qcyVarArr2[7];
                return new s5e(mgj0Var, lax0Var, c4eVar, (n9x0) nwyVar4.c());
            case 18:
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return (ClipGridParams) ((ClipsGridFragment) obj).requireArguments().getParcelable("ClipsGridFragment.params");
            case 19:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.c((dee) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 20:
                int i9 = ClipsInterestsFragment.Y;
                Context requireContext = ((ClipsInterestsFragment) obj).requireContext();
                dhr0.a.getClass();
                return Integer.valueOf(krv0.m(R.attr.vk_ui_background, new l7s(requireContext, dhr0.u().c)));
            case 21:
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) obj;
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                mtf Pf = ((ClipsViewerComponentImpl) clipsOwnerSwipeFragment.Q.getValue()).Pf();
                Context requireContext2 = clipsOwnerSwipeFragment.requireContext();
                Pf.getClass();
                return mtf.a(requireContext2);
            case 22:
                return ((ClipsViewerAdapterComponent) ((g8m) obj).a(fpf0.a(ClipsViewerAdapterComponent.class))).e0();
            case 23:
                cch cchVar = (cch) obj;
                frg frgVar = cchVar.k;
                if (frgVar != null) {
                    frgVar.invoke(cchVar.g.b);
                }
                return s3q0.a;
            case 24:
                int i10 = CommunityChatsFragment.b0;
                return ((ImBridgeComponent) m7m.d((CommunityChatsFragment) obj).a(fpf0.a(ImBridgeComponent.class))).g5();
            case 25:
                int i11 = CommunityInviteLinkFragment.e0;
                return ((BridgeComponent) m7m.d((CommunityInviteLinkFragment) obj).a(fpf0.a(BridgeComponent.class))).O();
            case 26:
                new CommunitiesManageNotificationsFragment.b().g(1, (CommunityNotificationSettingsFragment) obj);
                return s3q0.a;
            case 27:
                return ((ImExperimentsComponent) ((h7m) obj).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
            case 28:
                kxh kxhVar = (kxh) obj;
                lxh lxhVar = kxhVar.m;
                if (lxhVar != null) {
                    kxhVar.l.c(new mxh.a(lxhVar.b));
                }
                return s3q0.a;
            default:
                return ((CommunityReviewsView) obj).h;
        }
    }
}
