package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Peer;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.im.ui.bridges.MaxButtonVariants;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.core.scheduled_clips.g;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import xsna.q0e.d;
import xsna.qr6;
import xsna.rls;
import xsna.s1c0;
import xsna.uxd0;
import xsna.x3b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class eb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        HeaderAction headerAction;
        switch (this.b) {
            case 0:
                ((AbsFriendsAndFollowersTabFragment) this.c).U.b(rls.b.a);
                return s3q0.a;
            case 1:
                ((com.vk.clips.sdk.shared.item.ads.c) this.c).B.a(AdsItemViewEvent.l.b);
                return s3q0.a;
            case 2:
                AllHighlightsFragment allHighlightsFragment = (AllHighlightsFragment) this.c;
                int i = AllHighlightsFragment.g0;
                ((zt1) allHighlightsFragment.S).R1(false);
                return s3q0.a;
            case 3:
                rz2 rz2Var = (rz2) this.c;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                aVar.a = true;
                aVar.q = true;
                sf2 sf2Var = new sf2();
                Context context = e43.a;
                sf2Var.b = context != null ? context : null;
                aVar.s = sf2Var.a();
                aVar.w = true;
                aVar.E = ((Boolean) rz2Var.e.getValue()).booleanValue();
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                aVar.J = false;
                return aVar.a();
            case 4:
                r46 r46Var = (r46) this.c;
                r46Var.d.r().O.x().a(new ImCallClickAnalyticsItem.b(fyv.a(r46Var.c.f.c)));
                Peer peer = r46Var.c.f;
                peer.getClass();
                if (!peer.Ab(Peer.Type.USER)) {
                    r46Var.n(false, false);
                } else if (((Boolean) r46Var.m.getValue()).booleanValue()) {
                    qtd0 g = r46Var.g();
                    if (g != null) {
                        r46Var.g.j().l(r46Var.b, g, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_DETAIL), MaxButtonVariants.ForInstalledOnly);
                    }
                } else {
                    r46Var.k(uxd0.k.a);
                }
                return s3q0.a;
            case 5:
                qr6.b bVar = (qr6.b) this.c;
                return "UPLOAD_TRACE doUpload: fileInfo=" + bVar + ", size=" + bVar.c + ", name=" + bVar.b;
            case 6:
                return ((PhotoEditorComponent) ((BridgeComponentImpl) this.c).j.getValue()).Ab();
            case 7:
                s1v s1vVar = ((yqe0) this.c).a;
                return s1v.j().g;
            case 8:
                ((uwa) this.c).itemView.callOnClick();
                return s3q0.a;
            case 9:
                ((k4b) this.c).d.invoke(x3b.e.b);
                return s3q0.a;
            case 10:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) this.c;
                int i3 = ChannelProfileFragment.e0;
                Bundle arguments = channelProfileFragment.getArguments();
                Long valueOf = arguments != null ? Long.valueOf(arguments.getLong("param_channel_id")) : null;
                if (valueOf != null) {
                    return Long.valueOf(valueOf.longValue());
                }
                throw new IllegalArgumentException("There is no 'param_channel_id' key in bundle.");
            case 11:
                tsu tsuVar = ((azb) this.c).k;
                if (tsuVar != null) {
                    tsuVar.g(AvatarAction.REMOVE);
                }
                return s3q0.a;
            case 12:
                ((ez20) this.c).Ff("DialogEffectList");
                return s3q0.a;
            case 13:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i4 = ClipFeedListFragment.a2;
                return clipFeedListFragment.qo().gb();
            case 14:
                return (VkText) this.c;
            case 15:
                return g2u0.c((o1d) this.c);
            case 16:
                return (VkAvatar) ((xwd) this.c).findViewById(R.id.clips_authors_choose_avatar);
            case 17:
                q0e q0eVar = (q0e) this.c;
                s0e s0eVar = q0eVar.l;
                return new vik((s0eVar != null ? s0eVar : null).getCtx(), new yg(q0eVar, 25), q0eVar.T(), q0eVar.new d());
            case 18:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i5 = ClipsFavoriteFolderContentListFragment.W;
                return (ClipsViewerAdapterComponent) m7m.d(clipsFavoriteFolderContentListFragment).a(fpf0.a(ClipsViewerAdapterComponent.class));
            case 19:
                dde ddeVar = (dde) this.c;
                gzs<s3q0> onSubscribeClicked = ddeVar.getOnSubscribeClicked();
                if (onSubscribeClicked != null) {
                    onSubscribeClicked.invoke();
                }
                ddeVar.setSubscribed(true ^ ((Boolean) ((zak0) ddeVar.r).getValue()).booleanValue());
                return s3q0.a;
            case 20:
                return new pee(((BridgeComponent) ((afe) this.c).u.getValue()).F());
            case 21:
                Bundle a = ((roe) this.c).a();
                ClipsWrapperInputArguments.r.getClass();
                return Boolean.valueOf(a != null ? a.getBoolean("ClipsWrapperFragment.disable_owner_swipe", false) : false);
            case 22:
                ClipsTemplateEditorCropperView clipsTemplateEditorCropperView = (ClipsTemplateEditorCropperView) this.c;
                int i6 = ClipsTemplateEditorCropperView.z;
                return clipsTemplateEditorCropperView.findViewById(R.id.clips_template_editor_cropper_view_pager_left_control);
            case 23:
                ClipsWrapperInputArguments clipsWrapperInputArguments = (ClipsWrapperInputArguments) this.c;
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a2 = clipsWrapperInputArguments.a();
                aVar2.getClass();
                if (a2 != null) {
                    return (SearchStatsLoggingInfo) a2.getParcelable("search_stats_logging_info");
                }
                return null;
            case 24:
                return (q530) ((osh) this.c).d.F0.getValue();
            case 25:
                ((com.vk.profile.core.scheduled_clips.e) this.c).e.a(g.c.a);
                return s3q0.a;
            case 26:
                q5i q5iVar = (q5i) this.c;
                CompactAttachmentStyle compactAttachmentStyle = q5iVar.C;
                if ((compactAttachmentStyle != null ? compactAttachmentStyle.b : null) == null) {
                    q5iVar.W6(q5iVar.F);
                } else if (compactAttachmentStyle != null && (headerAction = compactAttachmentStyle.b) != null) {
                    di60.O(headerAction, q5iVar.itemView.getContext(), null);
                }
                return s3q0.a;
            case 27:
                return u1j.P4((u1j) this.c);
            case 28:
                ((dz20) ((vjj) this.c).d.getValue()).Qc("ProductsInContentDialog");
                return s3q0.a;
            default:
                return Integer.valueOf(e3m.f(R.attr.vk_ui_text_subhead, ((tvn) this.c).r.getContext()));
        }
    }
}
