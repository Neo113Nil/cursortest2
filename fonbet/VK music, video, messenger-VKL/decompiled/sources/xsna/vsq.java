package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.attaches.Attach;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.PixelStatsDelegate;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.fave.entities.FavePage;
import com.vk.feed.design.view.newsfeed.ads_action_button.VkFeedActionCellButton$Content$Middle;
import com.vk.feed.design.view.newsfeed.ads_action_button.a;
import com.vk.feed.design.view.newsfeed.ads_action_button.b;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bi40;
import xsna.tj50;
import xsna.tlo0;
import xsna.wpc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vsq implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ vsq(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        switch (this.b) {
            case 0:
                Iterable iterable = (Iterable) ((ad90) obj).a;
                ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new z990((FavePage) it.next(), null));
                }
                return arrayList2;
            case 1:
                Context context = (Context) obj;
                com.vk.feed.design.view.newsfeed.ads_action_button.c cVar = new com.vk.feed.design.view.newsfeed.ads_action_button.c(context);
                Drawable drawable = context.getDrawable(R.drawable.vk_icon_check_circle_on_28);
                cVar.setLeft(drawable != null ? new a.C1038a(new eko(drawable), null, null) : null);
                VkFeedActionCellButton$Content$Middle.Label.TruncateMode truncateMode = VkFeedActionCellButton$Content$Middle.Label.TruncateMode.INTERACTIVE;
                tlo0.h d = oq.d(tlo0.Companion, "Короткий текст");
                x7g x7gVar = new x7g(R.attr.vk_ui_text_primary);
                if (drawable == null) {
                    drawable = null;
                }
                cVar.setMiddle(new VkFeedActionCellButton$Content$Middle.Label(d, x7gVar, drawable != null ? new eko(drawable) : null, new x7g(R.attr.vk_ui_icon_primary), truncateMode, 32));
                cVar.setRight(new b.a(new tlo0.h("Купить билет"), VkButton.Mode.Primary));
                cVar.setWithDivider(true);
                cVar.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, context));
                return cVar;
            case 2:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                return ((Dialog) obj).Sb();
            case 4:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 5:
                return s3q0.a;
            case 6:
                li2 li2Var = (li2) obj;
                int i2 = ((Number) li2Var.f()).intValue() - ((Number) li2Var.b()).intValue() > 0 ? 4 : 5;
                long j = 1;
                long j2 = (j & 4294967295L) | (j << 32);
                return new llj(li2Var.c(i2, jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new h9x(j2), 3), ji2.i), li2Var.e(i2, jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new h9x(j2), 3), ki2.i), 12);
            case 7:
                qgi0.r((tgi0) obj, "PlaylistTrailingIcon");
                return s3q0.a;
            case 8:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.l);
            case 9:
                qgi0.r((tgi0) obj, "vk_banner_close_button_test_tag");
                return s3q0.a;
            case 10:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, new WeakReference(null), new WeakReference(null), null, null, 0, 59768831);
            case 11:
                return new c.C1008c((vr00) obj);
            case 12:
                MovieButtonsBlockState movieButtonsBlockState = (MovieButtonsBlockState) obj;
                return MovieButtonsBlockState.a(movieButtonsBlockState, movieButtonsBlockState.h + 1);
            case 13:
                return new ProfilesInfo();
            case 14:
                return Boolean.valueOf(((UIBlock) obj).e == CatalogDataType.DATA_SYNTHETIC_LOADING);
            case 15:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((Playlist) obj2).O)) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 16:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.a.a)) {
                    i = R.string.music_talkback_delete_downloaded_playlist;
                } else if (bi40Var.equals(bi40.c.a)) {
                    i = R.string.music_talkback_download_playlist;
                } else if (bi40Var.equals(bi40.d.a)) {
                    i = R.string.music_talkback_pending_downloading_playlist;
                } else {
                    if (!(bi40Var instanceof bi40.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.music_talkback_downloading_playlist;
                }
                return Integer.valueOf(i);
            case 17:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() > 0);
            case 18:
                return s3q0.a;
            case 19:
                List<Attach> K0 = ((com.vk.im.engine.models.messages.a) obj).K0();
                if (!(K0 instanceof Collection) || !K0.isEmpty()) {
                    Iterator<T> it2 = K0.iterator();
                    while (it2.hasNext()) {
                        if (((Attach) it2.next()) instanceof AttachVideo) {
                            z = true;
                            arrayList = new ArrayList();
                            for (Object obj3 : K0) {
                                if (obj3 instanceof AttachWall) {
                                    arrayList.add(obj3);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    List<Attach> list = ((AttachWall) it3.next()).o;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator<T> it4 = list.iterator();
                                        while (it4.hasNext()) {
                                            if (((Attach) it4.next()) instanceof AttachVideo) {
                                                z2 = true;
                                                return Boolean.valueOf(!z || z2);
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            return Boolean.valueOf(!z || z2);
                        }
                    }
                }
                z = false;
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
                z2 = false;
                return Boolean.valueOf(!z || z2);
            case 20:
                return zr.a("(@|\\*){1}", (String) obj, "{1,}(( \\(|\\()((?s:.)+?)(\\))){0,1}");
            case 21:
                Serializer.c<PixelStatsDelegate> cVar2 = PixelStatsDelegate.CREATOR;
                return new ArrayList();
            case 22:
                j7c0 j7c0Var = (j7c0) obj;
                return j7c0.a(j7c0Var, ChannelMsgSendConfig.a(j7c0Var.a, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 28671), null, null, null, false, 30);
            case 23:
                tj50.a aVar = (tj50.a) obj;
                dl70 dl70Var = new dl70(9);
                ao8 ao8Var = ao8.d;
                return new wpc0.c(aVar.a(dl70Var, ao8Var), aVar.a(new wx30(8), ao8Var));
            case 24:
                return s3q0.a;
            case 25:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 26:
                return new jhp((ViewGroup) obj, R.layout.voip_call_list_empty_space, 1);
            case 27:
                qgi0.r((tgi0) obj, "search_database_geo_item_subtitle");
                return s3q0.a;
            case 28:
                return new zbf0(R.layout.sticker_details_recommendations_loading_item, (ViewGroup) obj);
            default:
                return fpf0.a(((vcr) obj).getClass());
        }
    }

    public /* synthetic */ vsq(xe40 xe40Var) {
        this.b = 15;
    }
}
