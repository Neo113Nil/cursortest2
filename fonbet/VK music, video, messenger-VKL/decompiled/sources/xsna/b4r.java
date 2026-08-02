package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsResumeResponseDto;
import com.vk.api.generated.gifts.dto.GiftsMessagesConversationCardConfigDto;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenQoeSurvey;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.masks.Mask;
import com.vk.dto.stickers.MsgFooterBannerConfig;
import com.vk.ecomm.products_multipicker.impl.presentation.adapters.itemadapter.paginationerror.TypeOfItems;
import com.vk.masks.MasksEffectUpdateAppRequiredException;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.webrtc.stat.call.methods.call_stat.IncomingVideoStatistics;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import xsna.df50;
import xsna.dug0;
import xsna.kx00;
import xsna.tj50;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b4r implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ b4r(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return i7d.a((h7d) obj);
            case 1:
                return ((u5r) obj).b;
            case 2:
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 4:
                blt bltVar = (blt) obj;
                VKList vKList = new VKList(bltVar.a);
                vKList.n(bltVar.b);
                return vKList;
            case 5:
                return ((AccountGetUserObjectDto) ((List) obj).get(0)).e();
            case 6:
                ((Boolean) obj).getClass();
                FirebaseMessaging.d().b();
                return s3q0.a;
            case 7:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 8:
                return IncomingVideoStatistics.b((Ssrc.VideoRecv) obj);
            case 9:
                return CatalogSectionState.a((CatalogSectionState) obj, null, true, false, null, null, false, null, null, null, null, 8111);
            case 10:
                kx00.a aVar = (kx00.a) ((kx00) obj);
                String str = aVar.b;
                int i = aVar.c;
                if (!aVar.d || (str != null && !drm0.N(str))) {
                    r2 = false;
                }
                return new zzo0(str, i, r2);
            case 11:
                return Boolean.valueOf(((k110) obj).i);
            case 12:
                y810 y810Var = (y810) obj;
                ListBuilder e = e43.e();
                e.addAll(u810.k(y810Var.q, y810Var));
                if (y810Var.u) {
                    e.add(new q540());
                }
                if (y810Var.F) {
                    e.add(new m810(tq.h(tlo0.Companion, R.string.liblists_err_text), new tlo0.f(R.string.liblists_retry), TypeOfItems.FAVE_ITEMS));
                }
                return e.g();
            case 13:
                gi10 gi10Var = (gi10) obj;
                int i2 = MasksWrap.e0;
                if (gi10Var.a.isEmpty()) {
                    throw new MasksEffectUpdateAppRequiredException();
                }
                return (Mask) j5g.Y(gi10Var.a);
            case 14:
                ((vak0) co20.l).g(((Float) obj).floatValue());
                return s3q0.a;
            case 15:
                return b.c.a;
            case 16:
                List<GiftsMessagesConversationCardConfigDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (GiftsMessagesConversationCardConfigDto giftsMessagesConversationCardConfigDto : list) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (BaseImageDto baseImageDto : giftsMessagesConversationCardConfigDto.d()) {
                        ImageSize imageSize = new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null);
                        if (baseImageDto.d() == BaseImageDto.ThemeDto.DARK) {
                            arrayList3.add(imageSize);
                        } else {
                            arrayList2.add(imageSize);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    List<BaseImageDto> e2 = giftsMessagesConversationCardConfigDto.e();
                    if (e2 != null) {
                        for (BaseImageDto baseImageDto2 : e2) {
                            ImageSize imageSize2 = new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null);
                            if (baseImageDto2.d() == BaseImageDto.ThemeDto.DARK) {
                                arrayList5.add(imageSize2);
                            } else {
                                arrayList4.add(imageSize2);
                            }
                        }
                    }
                    arrayList.add(new MsgFooterBannerConfig(giftsMessagesConversationCardConfigDto.getType(), new Image(arrayList2), new Image(arrayList3), new Image(arrayList4), new Image(arrayList5)));
                }
                return arrayList;
            case 17:
                String str2 = (String) obj;
                return Boolean.valueOf(!(str2 == null || drm0.N(str2)));
            case 18:
                bn40.g("audio.getRecommendations", new Object[0]);
                return s3q0.a;
            case 19:
                ((dug0.c) obj).d();
                return s3q0.a;
            case 20:
                return new df50.a.C2730a(((tj50.a) obj).a(new hyu(8), ao8.d));
            case 21:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                return e0Var instanceof pr50 ? ((pr50) e0Var).P : e0Var.itemView;
            case 22:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return ((wy60) obj).c.b;
            case 23:
                return Boolean.valueOf(((it80) obj).a != 0);
            case 24:
                CommunitySubscriptionsResumeResponseDto communitySubscriptionsResumeResponseDto = (CommunitySubscriptionsResumeResponseDto) obj;
                return new lna0(communitySubscriptionsResumeResponseDto.getTitle(), communitySubscriptionsResumeResponseDto.getDescription());
            case 25:
                return Boolean.valueOf(((sy40) obj).e.f);
            case 26:
                qgi0.r((tgi0) obj, "PostingMediaPickerToolbarButtonBack");
                return s3q0.a;
            case 27:
                return new tfu(n34.a(((ery) obj).a()));
            case 28:
                qgi0.r((tgi0) obj, "themesPlaceholder");
                return s3q0.a;
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ b4r(FirstPinnedTabLayoutVh firstPinnedTabLayoutVh, UIBlockActionOpenQoeSurvey uIBlockActionOpenQoeSurvey) {
        this.b = 2;
    }

    public /* synthetic */ b4r(u810 u810Var) {
        this.b = 12;
    }
}
