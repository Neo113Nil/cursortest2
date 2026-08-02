package defpackage;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.ArticleFragment;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.uploader.impl.ClipsUploadSdkUploaderComponentBase;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl.b;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import com.vk.donut.design.view.badge.LargeOneTimeDonutBadge;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.ecomm.cart.impl.checkout.fragment.CheckoutFragment;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.libvideo.bottomsheet.about.a;
import com.vk.media.filters.di.FiltersComponent;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import com.vk.superapp.base.js.bridge.b;
import com.vk.utils.vectordrawable.internal.element.ClipPathElement;
import com.vk.voip.ui.settings.participants_view.c;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import xsna.b26;
import xsna.bzd;
import xsna.bzd.b;
import xsna.ccr0;
import xsna.dee;
import xsna.fpf0;
import xsna.gzs;
import xsna.h17;
import xsna.h270;
import xsna.i4y;
import xsna.iah0;
import xsna.iff;
import xsna.im90;
import xsna.inf;
import xsna.iwc;
import xsna.k7m;
import xsna.laa;
import xsna.m7m;
import xsna.mg6;
import xsna.mvp;
import xsna.mwe;
import xsna.nz;
import xsna.o1d;
import xsna.oju0;
import xsna.on4;
import xsna.q5c;
import xsna.qcy;
import xsna.r4c;
import xsna.r5;
import xsna.s0e;
import xsna.s3q0;
import xsna.t24;
import xsna.ulc;
import xsna.utx0;
import xsna.vde;
import xsna.w6d;
import xsna.x24;
import xsna.xy5;
import xsna.y440;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Path path_delegate$lambda$0;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                return new i4y(l0Var.L0(), l0Var.w0(), l0Var.f);
            case 1:
                r5 r5Var = (r5) this.c;
                int i = r5.k1;
                return new a(r5Var.requireContext(), r5Var);
            case 2:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                int i2 = ArticleFragment.E0;
                return ((PopupManagerComponent) m7m.d(articleFragment).a(fpf0.a(PopupManagerComponent.class))).Dc();
            case 3:
                t24.e eVar = ((x24) this.c).f;
                if (eVar != null) {
                    eVar.onClick();
                }
                return s3q0.a;
            case 4:
                return (LargeOneTimeDonutBadge) ((xy5) this.c).itemView.findViewById(R.id.comment_donut_large_badge);
            case 5:
                ((b26) this.c).l = true;
                return s3q0.a;
            case 6:
                return ((y440) this.c).findViewById(R.id.story_editor_music_restriction_text);
            case 7:
                return new mvp((b) ((mg6) this.c).b);
            case 8:
                com.vk.auth.ui.checkaccess.a aVar = (com.vk.auth.ui.checkaccess.a) this.c;
                return new im90(aVar.requireContext(), aVar, new oju0(aVar.requireContext(), aVar.getParentFragmentManager()));
            case 9:
                return Float.valueOf(((h17) this.c).a.c.f());
            case 10:
                ((c) this.c).a(j.o.a);
                return s3q0.a;
            case 11:
                return ((laa) this.c).h;
            case 12:
                CheckoutFragment checkoutFragment = (CheckoutFragment) this.c;
                int i3 = CheckoutFragment.T;
                return new q5c(checkoutFragment, new nz(checkoutFragment, 10), (r4c) checkoutFragment.Q.getValue());
            case 13:
                ccr0 ccr0Var = new ccr0(((ulc) this.c).itemView.getContext());
                float f = 24;
                int a = iah0.a(f);
                int a2 = iah0.a(f);
                ccr0Var.m = a;
                ccr0Var.n = a2;
                return ccr0Var;
            case 14:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i4 = ClipFeedListFragment.a2;
                iwc wo = clipFeedListFragment.wo();
                return Boolean.valueOf(wo != null && wo.h());
            case 15:
                return (ModerationComponent) ((k7m) m7m.f((o1d) this.c)).mo408a(fpf0.a(ModerationComponent.class));
            case 16:
                ((w6d) this.c).e.a(ClipItemViewEvent.b.b);
                return s3q0.a;
            case 17:
                path_delegate$lambda$0 = ClipPathElement.path_delegate$lambda$0((ClipPathElement) this.c);
                return path_delegate$lambda$0;
            case 18:
                ClipAudioTemplate clipAudioTemplate = ((ClipVideoFileAdapter) this.c).m.L1;
                if (clipAudioTemplate != null) {
                    return new SdkClipAudioTemplate(clipAudioTemplate.b);
                }
                return null;
            case 19:
                ClipsAutoSubtitlesBottomSheet clipsAutoSubtitlesBottomSheet = (ClipsAutoSubtitlesBottomSheet) this.c;
                clipsAutoSubtitlesBottomSheet.f.Qc("clips_autosubs_settings");
                clipsAutoSubtitlesBottomSheet.b = null;
                return s3q0.a;
            case 20:
                bzd bzdVar = (bzd) this.c;
                return new on4(bzdVar.c.getCtx(), new com.vk.movika.sdk.base.asset.b(bzdVar.new b()), bzdVar.e);
            case 21:
                return (VideoEditTimelineView) ((s0e) this.c).i().findViewById(R.id.video_edit_timeline);
            case 22:
                return new h270(((dee) ((vde) this.c).itemView).getImageViewController().d, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, 252);
            case 23:
                ClipsHolderViewImpl clipsHolderViewImpl = (ClipsHolderViewImpl) this.c;
                int i5 = ClipsHolderViewImpl.d0;
                return ((ClipsViewerComponent) ((k7m) m7m.c(clipsHolderViewImpl)).a(fpf0.a(ClipsViewerComponent.class))).pe();
            case 24:
                ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = (ClipsLinksControllerRootFragment) this.c;
                int i6 = ClipsLinksControllerRootFragment.Q;
                clipsLinksControllerRootFragment.dismiss();
                return s3q0.a;
            case 25:
                utx0 utx0Var = (utx0) this.c;
                utx0Var.a.a = utx0Var.e.getValue(utx0Var, utx0.h[0]).booleanValue();
                return s3q0.a;
            case 26:
                return new mwe(((iff) this.c).b().x().e());
            case 27:
                ClipsUploadSdkUploaderComponentBase clipsUploadSdkUploaderComponentBase = (ClipsUploadSdkUploaderComponentBase) this.c;
                qcy<Object>[] qcyVarArr = ClipsUploadSdkUploaderComponentBase.c;
                return clipsUploadSdkUploaderComponentBase.Df();
            case 28:
                return ((FiltersComponent) ((k7m) m7m.c((inf) this.c)).mo408a(fpf0.a(FiltersComponent.class))).r7();
            default:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return clipsViewerComponentImpl.new b();
        }
    }
}
