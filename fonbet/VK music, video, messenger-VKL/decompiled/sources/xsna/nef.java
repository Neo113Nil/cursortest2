package xsna;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.CameraComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.impl.MarketOrdersInternalComponent;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.FollowersTabFragment;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.log.L;
import com.vk.media.pipeline.utils.MediaMetadataUtils;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.bottomsheets.di.MusicBottomSheetComponent;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.search.integration.followers.api.FollowersSearchQueryViewType;
import com.vk.search.integration.followers.api.di.SearchFollowersIntegrationComponent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.video.stability.api.di.VideoAppStabilityComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.q0h;
import xsna.uo10;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nef(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        InteractiveOnboardingModalBottomSheet.OnboardingModalArguments onboardingModalArguments;
        f100 f100Var;
        Integer num;
        Float valueOf;
        Integer num2;
        int intValue;
        int i = 6;
        switch (this.b) {
            case 0:
                return ((CameraClipsComponent) ((pef) this.c).d.a(fpf0.a(CameraClipsComponent.class))).sf();
            case 1:
                ClipsVideoAttachmentPickerFragment clipsVideoAttachmentPickerFragment = (ClipsVideoAttachmentPickerFragment) this.c;
                int i2 = ClipsVideoAttachmentPickerFragment.W;
                a.g gVar = a.g.b;
                clipsVideoAttachmentPickerFragment.getClass();
                xn50.a.c(clipsVideoAttachmentPickerFragment, gVar);
                return s3q0.a;
            case 2:
                return (VkMiniInfoCell) ((arg) this.c).a.findViewById(R.id.community_address_work_status_mini_info_cell);
            case 3:
                qyg qygVar = (qyg) this.c;
                int i3 = qyg.n1;
                return ((CameraComponent) ((k7m) m7m.f(qygVar)).a(fpf0.a(CameraComponent.class))).ka();
            case 4:
                q0h q0hVar = (q0h) ((zak0) ((q0h.a) this.c).n).getValue();
                if (q0hVar == null) {
                    return s3q0.a;
                }
                q0hVar.h.invoke(q0hVar.g);
                return s3q0.a;
            case 5:
                h8j h8jVar = (h8j) this.c;
                L.e("ContactCallListenerProxyImpl", fw3.d(h8jVar.b, new StringBuilder("contactCallListeners: ")));
                Iterator<f8j> it = h8jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().onContactCallMyAnonChanged();
                }
                return s3q0.a;
            case 6:
                DialogsFragment dialogsFragment = (DialogsFragment) this.c;
                boolean z = DialogsFragment.u0;
                return ((VkClientMultiAccountComponent) m7m.d(dialogsFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 7:
                return "exception while invalidating range: ".concat(mnh0.A((Throwable) this.c));
            case 8:
                return new baf0(m33.a(R.drawable.vk_icon_info_20, ((qto) this.c).itemView.getContext()), dhr0.t.c(R.attr.vk_ui_icon_secondary));
            case 9:
                EditText editText = ((pop) this.c).w;
                return (editText != null ? editText : null).getText().toString();
            case 10:
                return ((mqp) this.c).h;
            case 11:
                FollowersTabFragment followersTabFragment = (FollowersTabFragment) this.c;
                int i4 = FollowersTabFragment.c0;
                ((SearchFollowersIntegrationComponent) ((k7m) m7m.f(followersTabFragment)).mo408a(fpf0.a(SearchFollowersIntegrationComponent.class))).getClass();
                return new jth0(followersTabFragment.R, FollowersSearchQueryViewType.BELOW_TOOLBAR, followersTabFragment, new tf3(14));
            case 12:
                ((com.vk.attachpicker.fragment.gallery.c) this.c).d.invoke(Integer.valueOf(R.string.clips_templates_editor_selection_limit), Integer.valueOf(R.string.clips_templates_editor_button_text));
                return s3q0.a;
            case 13:
                return ((y4u) this.c).b.y6();
            case 14:
                return ((PostingComponent) ((k7m) m7m.f((nbv) this.c)).mo408a(fpf0.a(PostingComponent.class))).H6();
            case 15:
                InteractiveOnboardingModalBottomSheet interactiveOnboardingModalBottomSheet = (InteractiveOnboardingModalBottomSheet) this.c;
                int i5 = InteractiveOnboardingModalBottomSheet.n1;
                Bundle arguments = interactiveOnboardingModalBottomSheet.getArguments();
                return (arguments == null || (onboardingModalArguments = (InteractiveOnboardingModalBottomSheet.OnboardingModalArguments) arguments.getParcelable(fpf0.a(InteractiveOnboardingModalBottomSheet.OnboardingModalArguments.class).l())) == null) ? new InteractiveOnboardingModalBottomSheet.OnboardingModalArguments(EmptyList.b) : onboardingModalArguments;
            case 16:
                co0 co0Var = (co0) this.c;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).q0(co0Var);
                return s3q0.a;
            case 17:
                whz whzVar = (whz) this.c;
                VkSimpleButton vkSimpleButton = (VkSimpleButton) whzVar.s().findViewById(R.id.loading_error_refresh);
                dhr0.a.getClass();
                Context s = dhr0.s();
                vkSimpleButton.setBackgroundColor(e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, s));
                vkSimpleButton.setTextColor(s.getColor(R.color.vk_white));
                bwt0.i0(vkSimpleButton, new w7u(whzVar, i));
                return vkSimpleButton;
            case 18:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) this.c;
                int i6 = MarketEditAlbumGoodsFragment.c1;
                return ((MarketComponent) m7m.d(marketEditAlbumGoodsFragment).a(fpf0.a(MarketComponent.class))).U1();
            case 19:
                uo10 uo10Var = (uo10) this.c;
                StringBuilder sb = new StringBuilder();
                uo10.a aVar = uo10Var.b;
                ArrayList arrayList = aVar.b;
                csp cspVar = aVar.a;
                Iterator it2 = arrayList.iterator();
                Double d = null;
                while (it2.hasNext()) {
                    tht0 tht0Var = (tht0) it2.next();
                    MediaFormat format = tht0Var.getFormat();
                    gr10 gr10Var = format != null ? new gr10(format) : null;
                    Integer num3 = gr10Var != null ? gr10Var.m : null;
                    if (gr10Var == null || (num2 = gr10Var.k) == null) {
                        if (gr10Var != null) {
                            try {
                                num = gr10Var.c("frame-count");
                            } catch (ClassCastException unused) {
                                num = null;
                            }
                            if (num == null || num.intValue() <= 0) {
                                num = null;
                            }
                            Long l = gr10Var.q;
                            if (l == null || l.longValue() <= 0) {
                                l = null;
                            }
                            if (num != null && l != null) {
                                valueOf = Float.valueOf((num.intValue() * 1000000.0f) / l.longValue());
                            }
                        }
                        valueOf = null;
                    } else {
                        valueOf = Float.valueOf(num2.intValue());
                    }
                    if (num3 == null || valueOf == null) {
                        if (tht0Var instanceof zq10) {
                            uy1 a = MediaMetadataUtils.a(cspVar.a, ((zq10) tht0Var).b);
                            if (num3 == null) {
                                int i7 = a.g;
                                num3 = i7 > 0 ? Integer.valueOf(i7) : null;
                                if (num3 == null) {
                                }
                            }
                            if (valueOf == null && (valueOf = a.i) == null) {
                            }
                        }
                    }
                    double intValue2 = (num3.intValue() * 1.0d) / (valueOf.floatValue() * (tht0Var.getHeight() * tht0Var.getWidth()));
                    d = d != null ? Double.valueOf(Math.max(d.doubleValue(), intValue2)) : Double.valueOf(intValue2);
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(num3 + '(' + intValue2 + ") b/s");
                }
                if (sb.length() > 0 && (f100Var = cspVar.d) != null) {
                    f100Var.i("MaxVideoBitrateProvider", "tracks bitrates = " + ((Object) sb));
                }
                return d;
            case 20:
                return ((VideoAppStabilityComponent) m7m.a((FragmentActivity) this.c).a(fpf0.a(VideoAppStabilityComponent.class))).G7();
            case 21:
                return new com.vk.im.ui.formatters.b(((x040) this.c).a);
            case 22:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                ArtistInfoVh artistInfoVh = (ArtistInfoVh) musicArtistCatalogRootVh.v.getValue();
                if (artistInfoVh != null) {
                    return new MusicPagePhoneHeaderVh(artistInfoVh, (MusicPageToolbarVh) musicArtistCatalogRootVh.s.getValue());
                }
                return null;
            case 23:
                return new pe40(((te40) this.c).b);
            case 24:
                yc50 yc50Var = (yc50) this.c;
                int i8 = yc50.x1;
                return ((MusicBottomSheetComponent) m7m.d(yc50Var).mo408a(fpf0.a(MusicBottomSheetComponent.class))).getConfig();
            case 25:
                NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = (NewsEntryFeedbackCommentsFragment) this.c;
                int i9 = NewsEntryFeedbackCommentsFragment.f1;
                return ((BridgeComponent) m7m.d(newsEntryFeedbackCommentsFragment).a(fpf0.a(BridgeComponent.class))).s();
            case 26:
                return new dr60(new bk30((jq60) this.c, i));
            case 27:
                OnboardingPromoFragment onboardingPromoFragment = (OnboardingPromoFragment) this.c;
                qcy<Object>[] qcyVarArr = OnboardingPromoFragment.Q;
                return new OnboardingPromoFragment.b(onboardingPromoFragment);
            case 28:
                OrderFragment orderFragment = (OrderFragment) this.c;
                qcy<Object>[] qcyVarArr2 = OrderFragment.Y;
                return ((MarketOrdersInternalComponent) ((k7m) m7m.f(orderFragment)).mo408a(fpf0.a(MarketOrdersInternalComponent.class))).Df();
            default:
                mc90 mc90Var = (mc90) this.c;
                boolean a2 = mc90Var.k.a();
                rg50 rg50Var = mc90Var.q;
                if (a2) {
                    wak0 wak0Var = (wak0) rg50Var;
                    intValue = wak0Var.getIntValue() != -1 ? wak0Var.getIntValue() : Math.abs(mc90Var.l()) >= Math.abs(Math.min(mc90Var.n.I0(rc90.a), ((float) mc90Var.p()) / 2.0f) / ((float) mc90Var.p())) ? mc90Var.m() ? mc90Var.e + 1 : mc90Var.e : mc90Var.k();
                } else {
                    intValue = mc90Var.k();
                }
                return Integer.valueOf(mc90Var.j(intValue));
        }
    }
}
