package xsna;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.gifts.dto.GiftsGetResponseDto;
import com.vk.api.generated.gifts.dto.GiftsGiftDto;
import com.vk.api.generated.gifts.dto.GiftsGiftPrivacyDto;
import com.vk.api.generated.gifts.dto.GiftsGiftVotesAttachmentDto;
import com.vk.api.generated.gifts.dto.GiftsImageSourceDto;
import com.vk.api.generated.gifts.dto.GiftsLayoutDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.impl.channel_screen.exceptions.PinActionsFailedException;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.GiftVotesAttachment;
import com.vk.dto.gift.GiftItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.kve;
import xsna.lkq;
import xsna.nkq;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tc implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tc(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GiftVotesAttachment giftVotesAttachment;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((View) obj) instanceof ViewPager);
            case 1:
                return ((AdditionalSettingsState.Data) obj).n;
            case 2:
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 5:
                return ((Boolean) obj).booleanValue() ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new PinActionsFailedException());
            case 6:
                return s3q0.a;
            case 7:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof Bitmap) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 8:
                p870.f().e(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, (NewsEntry) obj);
                return s3q0.a;
            case 9:
                int i = gne.j1;
                qgi0.r((tgi0) obj, "clips_not_interested_action_item_tag");
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((vre.b) obj).g != null);
            case 11:
                return kve.a.C3209a.a;
            case 12:
                ((Integer) obj).intValue();
                int i2 = ClipsWrapperFragment.Q0;
                return s3q0.a;
            case 13:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).a);
            case 14:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 15:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_title");
                return s3q0.a;
            case 16:
                return CommunityEventsState.a((CommunityEventsState) obj, CommunityEventsState.Content.b.a);
            case 17:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                return new ncq0(baseUploadServerDto.e(), baseUploadServerDto.d(), null, null, null, 28);
            case 18:
                return new b5p0((ViewGroup) obj);
            case 19:
                return 10;
            case 20:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 21:
                int i3 = lkq.a.$EnumSwitchMapping$0[((nkq.a) obj).c.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.TRUE;
            case 24:
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 25:
                GiftsGetResponseDto giftsGetResponseDto = (GiftsGetResponseDto) obj;
                List<GiftsGiftDto> d = giftsGetResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (GiftsGiftDto giftsGiftDto : d) {
                    GiftItem giftItem = new GiftItem();
                    Integer j = giftsGiftDto.j();
                    giftItem.c = j != null ? j.intValue() : 0;
                    giftItem.d = giftsGiftDto.f();
                    giftItem.g = giftsGiftDto.getMessage();
                    giftItem.h = giftsGiftDto.d() != null ? r9.intValue() : 0L;
                    GiftsLayoutDto g = giftsGiftDto.g();
                    giftItem.i = g != null ? vzt.a(g) : null;
                    GiftsGiftPrivacyDto k = giftsGiftDto.k();
                    giftItem.j = k != null ? k.i() : 0;
                    giftItem.e = giftsGiftDto.i();
                    giftItem.k = giftsGiftDto.e();
                    GiftsGiftVotesAttachmentDto l = giftsGiftDto.l();
                    if (l != null) {
                        int d2 = l.d();
                        List<GiftsImageSourceDto> d3 = l.e().d();
                        ArrayList arrayList3 = new ArrayList(c5g.u(d3, 10));
                        for (GiftsImageSourceDto giftsImageSourceDto : d3) {
                            arrayList3.add(new ImageSize(giftsImageSourceDto.getUrl(), giftsImageSourceDto.getWidth(), giftsImageSourceDto.getHeight(), null, (char) 0, false, 56, null));
                        }
                        giftVotesAttachment = new GiftVotesAttachment(d2, new Image(arrayList3));
                    } else {
                        giftVotesAttachment = null;
                    }
                    giftItem.l = giftVotesAttachment;
                    arrayList2.add(giftItem);
                }
                return new Pair(arrayList2, Integer.valueOf(giftsGetResponseDto.getCount()));
            case 26:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 27:
                Long l2 = (Long) obj;
                l2.longValue();
                return l2;
            default:
                int i4 = LoaderFragment.k0;
                ((yvv) obj).d();
                throw null;
        }
    }
}
