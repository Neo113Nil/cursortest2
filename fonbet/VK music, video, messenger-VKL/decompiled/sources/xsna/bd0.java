package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.vk.catalog2.common.ui.core.view.CatalogErrorView;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicTrackPickerVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.ecomm.design.view.feed.FeedProductPinView;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyFadeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.money.MoneyTransfersFragment;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.lang.ref.SoftReference;
import one.video.controls20.SimpleControlsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bd0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r9v25, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AboutVideoItem.a aVar = (AboutVideoItem.a) obj;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    aVar.c.e(bwt0.u(b));
                    break;
                }
                break;
            case 1:
                int i2 = CatalogErrorView.f;
                ((gzs) obj).invoke();
                break;
            case 2:
                ((ComponentLinearLayout) obj).a(view);
                break;
            case 3:
                grq grqVar = (grq) obj;
                if (!jjc.b()) {
                    grqVar.X6(new NewsfeedExternalAction.Navigation.s());
                    break;
                }
                break;
            case 4:
                FeedProductPinView feedProductPinView = (FeedProductPinView) obj;
                if (!feedProductPinView.i) {
                    gzs<s3q0> gzsVar = feedProductPinView.s;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                        break;
                    }
                } else {
                    gzs<s3q0> gzsVar2 = feedProductPinView.t;
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                        break;
                    }
                }
                break;
            case 5:
                q8u q8uVar = (q8u) obj;
                gzs<s3q0> gzsVar3 = q8uVar.g1;
                if (gzsVar3 != null) {
                    gzsVar3.invoke();
                }
                q8uVar.dismiss();
                break;
            case 6:
                ntx presenter = ((qtx) obj).getPresenter();
                if (presenter != null) {
                    presenter.p7();
                    break;
                }
                break;
            case 7:
                ((com.vk.newsfeed.common.recycler.holders.f) obj).n.invoke(LeadFormHolder.ButtonAction.OPEN_SITE);
                break;
            case 8:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = marketEditAlbumGoodsFragment.Y0;
                if (goodAlbumEditFlowEntity != null) {
                    marketEditAlbumGoodsFragment.Ko(goodAlbumEditFlowEntity).g(16, marketEditAlbumGoodsFragment);
                    break;
                }
                break;
            case 9:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) obj;
                if (moneyTransfersFragment.N0.b == 0) {
                    moneyTransfersFragment.U0 = false;
                    moneyTransfersFragment.Mo(moneyTransfersFragment.Y0);
                    break;
                } else {
                    moneyTransfersFragment.Jo();
                    break;
                }
            case 10:
                s3v0 s3v0Var = (s3v0) obj;
                s3v0.g(s3v0Var, s3v0Var.a(null, "casper_chat"), null, 6);
                break;
            case 11:
                MusicTrackPickerVh musicTrackPickerVh = (MusicTrackPickerVh) obj;
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                if (imageView != null) {
                    imageView.setSelected(!imageView.isSelected());
                }
                musicTrackPickerVh.m(view.getId(), musicTrackPickerVh.d, new MusicTrackPickerVh.a(1, musicTrackPickerVh, MusicTrackPickerVh.class, "onMusicTrackIsFavoriteHasBeenUpdated", "onMusicTrackIsFavoriteHasBeenUpdated(Z)V", 0));
                break;
            case 12:
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyFadeView) obj).c;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 13:
                ((x6v) obj).onClick();
                break;
            case 14:
                int i3 = SimpleControlsView.S;
                gzs<s3q0> vkLogoHandler = ((SimpleControlsView) obj).getVkLogoHandler();
                if (vkLogoHandler != null) {
                    vkLogoHandler.invoke();
                    break;
                }
                break;
            case 15:
                int i4 = TaggedItemsBottomSheet.o1;
                ((TaggedItemsBottomSheet) obj).hide();
                break;
            case 16:
                ((ffo0) obj).b.invoke(leo0.a);
                break;
            case 17:
                VideoTextureView videoTextureView = (VideoTextureView) obj;
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                fes0 fes0Var = videoTextureView.e;
                if (fes0Var != null) {
                    fes0Var.setPlayer(null);
                    videoTextureView.removeView(fes0Var.b());
                }
                videoTextureView.e = null;
                break;
            case 18:
                ((b2v0) obj).dismiss();
                break;
            default:
                hcw0 hcw0Var = ((VkSearchView) obj).S;
                if (hcw0Var != null) {
                    hcw0Var.a();
                    break;
                }
                break;
        }
    }
}
