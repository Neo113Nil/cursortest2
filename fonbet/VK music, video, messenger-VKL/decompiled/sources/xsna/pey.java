package xsna;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.ecomm.design.view.badge.MarketDiscountBadge;
import com.vk.ecomm.design.view.badge.MarketDiscountBadgeStyle;
import com.vk.libvideo.autoplay.e;
import com.vk.log.L;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bi40;
import xsna.dz40;
import xsna.jw00;
import xsna.lnf0;
import xsna.noa;
import xsna.oe10;
import xsna.q8z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pey implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pey(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        e.a aVar;
        switch (this.b) {
            case 0:
                return fl3.j((Cursor) obj);
            case 1:
                return s3q0.a;
            case 2:
                return (si00) obj;
            case 3:
                MarketDiscountBadge marketDiscountBadge = new MarketDiscountBadge((Context) obj, null, 6, 0);
                marketDiscountBadge.setDiscountFromValue(50);
                marketDiscountBadge.setStyle(MarketDiscountBadgeStyle.Accent);
                return marketDiscountBadge;
            case 4:
                return new jw00.c(((Integer) obj).intValue());
            case 5:
                return ((oe10.a) ((oe10) obj)).b;
            case 6:
                Long l = MiniAppPiPOverlayService.f;
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 7:
                return j5g.O0((List) obj);
            case 8:
                return new dzm0((ViewGroup) obj);
            case 9:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.a.a)) {
                    return Integer.valueOf(R.string.music_talkback_downloaded_track);
                }
                if (bi40Var.equals(bi40.c.a)) {
                    return Integer.valueOf(R.string.music_talkback_download_track);
                }
                if (bi40Var.equals(bi40.d.a)) {
                    return Integer.valueOf(R.string.music_talkback_pending_downloading_track);
                }
                if (bi40Var instanceof bi40.b) {
                    return Integer.valueOf(R.string.music_talkback_downloading_track);
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                return ((Object[]) obj)[0];
            case 11:
                return (NewsfeedData) j5g.Y((List) obj);
            case 12:
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 13:
                return new zn90(R.layout.voip_past_broadcasts_empty_space, (ViewGroup) obj);
            case 14:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WeakReference<e.a> weakReference = com.vk.libvideo.autoplay.e.c;
                if (weakReference != null && (aVar = weakReference.get()) != null) {
                    aVar.onMuteChange(booleanValue);
                }
                return s3q0.a;
            case 15:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, new WeakReference(null), 0, 50331647);
            case 16:
                Context context = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context);
                ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
                thumbsImageView.setId(R.id.audio_image);
                thumbsImageView.setCornerRadius(context.getResources().getDimension(R.dimen.music_podcasts_image_playlist_cover_corners));
                frameLayout.addView(thumbsImageView, new FrameLayout.LayoutParams(-1, -1));
                ImageView imageView = new ImageView(context);
                imageView.setId(R.id.audio_playing_indicator);
                imageView.setBackground(dhr0.t.a(R.drawable.music_dark_round_rect));
                imageView.setImportantForAccessibility(2);
                imageView.setVisibility(8);
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            case 17:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj;
                int i = PollResultsFragment.b0;
                return qVar;
            case 18:
                L.i((Throwable) obj);
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 19:
                return ((PostingState.Editing) obj).l;
            case 20:
                qgi0.r((tgi0) obj, "product_card_cart_button_text_test_tag");
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                dy40 dy40Var = ((sy40) obj).e;
                return new dz40.c(dy40Var.a, dy40Var.b, dy40Var.c);
            case 23:
                int[] iArr = lnf0.b.$EnumSwitchMapping$0;
                throw null;
            case 24:
                VkRichCell vkRichCell = new VkRichCell((Context) obj, null, 6, 0);
                vkRichCell.setLeftMainAvatarController(new noa.i());
                vkRichCell.setLeftMainPictureController(new noa.m());
                vkRichCell.setLeftMainViewController(new noa.k());
                vkRichCell.setRightExtraViewController(new noa.o());
                vkRichCell.setRightExtraActionPictureController(new noa.m());
                return vkRichCell;
            case 25:
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                Object obj3 = list.get(1);
                return new q8z.b(str, (epx.f(obj3, Boolean.FALSE) || obj3 == null) ? null : (tjo0) ((izs) i2h0.j.c).invoke(obj3), null, 4);
            case 26:
                return Boolean.valueOf(((omh0) obj).f);
            case 27:
                return b.a.c.a;
            case 28:
                return ((SearchQueryValueHelper.a) obj).a;
            default:
                return SettingsState.a((SettingsState) obj, null, false, null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
        }
    }
}
