package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.b;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.fdg0;
import xsna.hgd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vf0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        String string;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((NewsFeedComponent) ((k7m) m7m.f((wf0) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 1:
                dz20 dz20Var = ((cm0) obj).c;
                if (dz20Var != null) {
                    dz20Var.Ff("AddLinkView");
                }
                return s3q0.a;
            case 2:
                dz20 dz20Var2 = ((sp0) obj).b;
                if (dz20Var2 != null) {
                    dz20Var2.Ff("AddWallView");
                }
                return s3q0.a;
            case 3:
                final com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj;
                return new gdg0() { // from class: xsna.by0
                    @Override // xsna.gdg0
                    public final void a(fdg0 fdg0Var) {
                        ux0 ux0Var = com.vk.clips.sdk.shared.item.ads.c.this.B;
                        if (!(fdg0Var instanceof fdg0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ux0Var.a(AdsItemViewEvent.n.b);
                    }
                };
            case 4:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj;
                int i2 = AlbumDetailsFragment.p0;
                return albumDetailsFragment.ho().o5().a(albumDetailsFragment.go(), albumDetailsFragment.io());
            case 5:
                d73 d73Var = (d73) obj;
                Context context = (Context) d73Var.a.invoke();
                bpn0 bpn0Var = d73Var.g;
                ((upo) bpn0Var.getValue()).getClass();
                boolean z = Preference.j().getBoolean("__dbg_externa_ads_dyn_fake_loader_enabled", false);
                ((upo) bpn0Var.getValue()).getClass();
                return new g73(context, z, Preference.j().getBoolean("__dbg_externa_ads_dyn_fake_loader_err_resp_enabled", false), d73Var.e);
            case 6:
                int i3 = zh4.k1;
                return (BridgeComponent) m7m.d((zh4) obj).a(fpf0.a(BridgeComponent.class));
            case 7:
                return new tnp0(((p36) obj).j);
            case 8:
                return (TextView) ((cb6) obj).itemView.findViewById(R.id.item_pay_method_title);
            case 9:
                return new rj6((vj6) obj);
            case 10:
                qcy<Object>[] qcyVarArr = BookingEditScreenFragment.W;
                return (LinksBridgeComponent) m7m.d((BookingEditScreenFragment) obj).a(fpf0.a(LinksBridgeComponent.class));
            case 11:
                qcy<Object>[] qcyVarArr2 = BookingServicesScreenFragment.S;
                return new com.vk.ecomm.onlinebooking.impl.services.presentation.d(((BookingServicesScreenFragment) obj).go());
            case 12:
                return CallModuleImpl.f((CallModuleImpl) obj);
            case 13:
                ((TextView) obj).performClick();
                return s3q0.a;
            case 14:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": loadInitial: cache is empty, loading from network");
            case 15:
                return ((ModerationComponent) ((k7m) m7m.f((gmb) obj)).mo408a(fpf0.a(ModerationComponent.class))).uf();
            case 16:
                int i4 = asb.k1;
                Bundle arguments = ((asb) obj).getArguments();
                return (arguments == null || (string = arguments.getString("invitationLink")) == null) ? "" : string;
            case 17:
                return ((ModerationComponent) ((k7m) m7m.f((qkc) obj)).mo408a(fpf0.a(ModerationComponent.class))).bd();
            case 18:
                int i5 = inc.l1;
                return (ClipsCoauthorsInternalComponent) ((k7m) m7m.f((inc) obj)).mo408a(fpf0.a(ClipsCoauthorsInternalComponent.class));
            case 19:
                int i6 = ClipFeedListFragment.a2;
                return (ClipsExternalNpsComponent) m7m.d((ClipFeedListFragment) obj).a(fpf0.a(ClipsExternalNpsComponent.class));
            case 20:
                com.vk.newsfeed.common.recycler.holders.clips.a aVar = (com.vk.newsfeed.common.recycler.holders.clips.a) obj;
                if (aVar.c7()) {
                    d3m.c(aVar.E, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            case 21:
                hgd hgdVar = (hgd) obj;
                LottieAnimationView lottieAnimationView = hgdVar.b;
                if (lottieAnimationView.f.m()) {
                    boolean z2 = hgdVar.g.c;
                    if ((!z2 && (hgdVar.h instanceof hgd.a.InterfaceC2993a.C2994a)) || (z2 && (hgdVar.h instanceof hgd.a.InterfaceC2993a.b))) {
                        lottieAnimationView.setSelected(z2);
                        lottieAnimationView.setProgress(hgdVar.d(hgdVar.g.c));
                        lottieAnimationView.W();
                    }
                } else {
                    TextView textView = hgdVar.c;
                    if (textView != null) {
                        textView.setTextColor(hgdVar.d);
                    }
                    lottieAnimationView.setSelected(hgdVar.g.c);
                    lottieAnimationView.setProgress(hgdVar.d(hgdVar.g.c));
                }
                return s3q0.a;
            case 22:
                return (VkAvatar) ((wkd) obj).findViewById(R.id.clips_camera_authors_choose_author_avatar);
            case 23:
                ((oyd) obj).c.a();
                return s3q0.a;
            case 24:
                com.vk.clips.attachments.impl.publish.geolocation.presentation.b bVar = (com.vk.clips.attachments.impl.publish.geolocation.presentation.b) obj;
                b.C0547b c0547b = com.vk.clips.attachments.impl.publish.geolocation.presentation.b.k1;
                q90 q90Var = new q90(bVar.kn(), null);
                dhr0.a.getClass();
                Context E = dhr0.E();
                ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
                PermissionHelper.a.getClass();
                return new s8g0(q90Var, null, ey90Var, new yx90(R.string.clips_geolcation_picker_no_location_permission_message, 14, PermissionHelper.h, PermissionHelper.i, true), new na(bVar, 25), null, null, null, null, null);
            case 25:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                SharingComponent sharingComponent = clipsViewerComponentImpl.e;
                nwy nwyVar = clipsViewerComponentImpl.Y;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[37];
                t3f t3fVar = (t3f) nwyVar.c();
                ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = h2e.a;
                return new q2e(sharingComponent, t3fVar);
            case 26:
                int i7 = ClipsWrapperFragment.Q0;
                RectF o = zjq.o((zhf0) obj);
                Rect rect = new Rect();
                o.roundOut(rect);
                return rect;
            case 27:
                ((ebh) obj).a();
                return s3q0.a;
            case 28:
                return ((CommunityNewsfeedComponent) ((k7m) m7m.f((mvh) obj)).mo408a(fpf0.a(CommunityNewsfeedComponent.class))).ba();
            default:
                return ((CommunitySubscriptionComponent) m7m.d(((o1i) obj).b).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).D6();
        }
    }
}
