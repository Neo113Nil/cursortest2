package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerPageLoadType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import xsna.bex0;
import xsna.bsm;
import xsna.dt1;
import xsna.esz;
import xsna.ikv0;
import xsna.te40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sim implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sim(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$5;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                hkp hkpVar = ((tim) obj).p;
                if (hkpVar != null) {
                    hkpVar.h(true);
                }
                return s3q0.a;
            case 1:
                return new bsm.k((bsm) obj);
            case 2:
                return "updateDialogs: " + ((o580) obj) + ' ';
            case 3:
                return new baf0(m33.a(R.drawable.vk_icon_dropdown_20, ((qto) obj).itemView.getContext()), dhr0.t.c(R.attr.vk_ui_icon_accent));
            case 4:
                pkv0.f((ikv0.a) obj);
                return s3q0.a;
            case 5:
                t0s t0sVar = (t0s) obj;
                int i2 = t0sVar.a;
                a1w a1wVar = t0sVar.b;
                t0sVar.o();
                b1s b1sVar = t0sVar.d;
                esz.a.getClass();
                return new myr(i2, a1wVar, 30, b1sVar, esz.a.b);
            case 6:
                ((com.vk.attachpicker.fragment.gallery.c) obj).d.invoke(Integer.valueOf(R.string.clips_templates_editor_min_duration_limit), Integer.valueOf(R.string.clips_templates_editor_button_text));
                return s3q0.a;
            case 7:
                int i3 = GamesCatalogDetailFragment.d0;
                return ((GamesCatalogDetailFragment) obj).requireArguments().getString("games_catalog_visit_source");
            case 8:
                return ((SearchParamsComponent) ((k7m) m7m.f((GlobalSearchGroupsCatalogRootVhOld) obj)).a(fpf0.a(SearchParamsComponent.class))).oa();
            case 9:
                return ((y4u) obj).b.wf();
            case 10:
                invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$5;
            case 11:
                return ((BridgeComponent) ((k7m) m7m.f((nbv) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 12:
                dhr0 dhr0Var = dhr0.a;
                Context context = ((com.vk.im.video.g) obj).y;
                Context context2 = context != null ? context : null;
                dhr0Var.getClass();
                return dhr0.t(context2);
            case 13:
                bex0.a.a(((w2y) obj).a, JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                return s3q0.a;
            case 14:
                return Float.valueOf(((puy) obj).q.e());
            case 15:
                return (VKImageView) ((whz) obj).getView().findViewById(R.id.cover_image);
            case 16:
                int i4 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = ((LocalMediaPickerFragmentOld) obj).fo();
                if (fo != null) {
                    fo.C(new PostingAction.MediaPicker.LoadLocalMediaPage(MediaPickerPageLoadType.NextPage));
                }
                return s3q0.a;
            case 17:
                int i5 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) obj).finish();
                return s3q0.a;
            case 18:
                return "onHistoryUpdate: MsgHistory changed. Size of history = " + ((w920) obj).c().size();
            case 19:
                return Boolean.valueOf(((SharedPreferences) ((bpn0) obj).getValue()).getBoolean("compressPhotos", true));
            case 20:
                MethodSelectorView methodSelectorView = ((com.vk.method.selector.impl.b) obj).h;
                return new bhg(methodSelectorView != null ? methodSelectorView.Mb() : null);
            case 21:
                ((kz20) obj).e.Ff("about_video_bottom_sheet");
                return s3q0.a;
            case 22:
                return new com.vk.im.ui.formatters.a(((en30) obj).a);
            case 23:
                return new en30(((x040) obj).a);
            case 24:
                te40 te40Var = (te40) obj;
                xe40 xe40Var = (xe40) te40Var.j.getValue();
                bf40 bf40Var = (bf40) te40Var.g.getValue();
                af40 af40Var = (af40) te40Var.l.getValue();
                if (!((Boolean) te40Var.e.getValue()).booleanValue()) {
                    af40Var = null;
                }
                le40 le40Var = (le40) te40Var.k.getValue();
                if (!((Boolean) te40Var.d.getValue()).booleanValue()) {
                    le40Var = null;
                }
                return new te40.a(rl3.I(new qe40[]{xe40Var, bf40Var, af40Var, le40Var, ((Boolean) te40Var.f.getValue()).booleanValue() ? (pe40) te40Var.m.getValue() : null}));
            case 25:
                int i6 = yc50.x1;
                return ((MusicFragmentComponent) m7m.d((yc50) obj).a(fpf0.a(MusicFragmentComponent.class))).tc();
            case 26:
                int i7 = NewsEntryFeedbackCommentsFragment.f1;
                return ((AttachmentMappersComponent) m7m.d((NewsEntryFeedbackCommentsFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 27:
                cr4 cr4Var = ((OnMediaAudioComponentProvider) obj).a;
                return new lm4(cr4Var.a(), cr4Var.c(), cr4Var.b(), 4);
            case 28:
                dt1.a.getClass();
                ((wh50) obj).setValue(dt1.a.i);
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                return ((ReviewsComponent) ((k7m) m7m.f((OrderFragment) obj)).a(fpf0.a(ReviewsComponent.class))).Md();
        }
    }
}
