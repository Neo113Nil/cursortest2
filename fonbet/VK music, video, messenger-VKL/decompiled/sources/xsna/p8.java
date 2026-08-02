package xsna;

import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsJoinAndGetResponseDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.stickers.dto.StickersGetKeyboardRecommendationResponseDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigContextDto;
import com.vk.api.generated.stickers.dto.StickersImageSetDto;
import com.vk.api.generated.stickers.dto.StickersKeyboardRecommendationDto;
import com.vk.api.generated.stickers.dto.StickersOrderPriceDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersStickerPopupDto;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.stickers.dto.StickersStickerVmojiDto;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.RecommendationsScrollMode;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerPackPrice;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.kbl0;
import xsna.xn50;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class p8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<Integer> e;
        StickersKeyboardRecommendationDto.ScrollModeDto f;
        String d;
        StickersGetKeyboardRecommendationResponseDto stickersGetKeyboardRecommendationResponseDto;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        ImageConfigId imageConfigId;
        String d2;
        switch (this.b) {
            case 0:
                return t8.a((t8) this.receiver, (hfz) obj);
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.receiver;
                communityProfileFragment.getClass();
                xn50.a.c(communityProfileFragment, (CommunityProfileAction) obj);
                return s3q0.a;
            case 4:
                AppsJoinAndGetResponseDto appsJoinAndGetResponseDto = (AppsJoinAndGetResponseDto) obj;
                q73 q73Var = (q73) this.receiver;
                q73Var.getClass();
                if (!appsJoinAndGetResponseDto.e()) {
                    throw new IllegalStateException("Can't perform application installation is_joined = false");
                }
                ykg ykgVar = q73Var.a;
                AppsAppDto d3 = appsJoinAndGetResponseDto.d();
                ykgVar.getClass();
                return ykg.c(d3);
            case 5:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) this.receiver;
                graffitiDrawingFragment.getClass();
                xn50.a.c(graffitiDrawingFragment, (nbu) obj);
                return s3q0.a;
            case 6:
                Throwable th = (Throwable) obj;
                ((LocationCommon) this.receiver).getClass();
                x7r0 x7r0Var = LocationCommon.c.a;
                if (x7r0Var != null) {
                    x7r0Var.invoke(th);
                }
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 9:
                ((s7l0) this.receiver).I((vlo) obj);
                return s3q0.a;
            default:
                StickersGetKeyboardRecommendationResponseDto stickersGetKeyboardRecommendationResponseDto2 = (StickersGetKeyboardRecommendationResponseDto) obj;
                bcl0 bcl0Var = (bcl0) this.receiver;
                bcl0Var.getClass();
                List<StickersPackPreviewDto> e2 = stickersGetKeyboardRecommendationResponseDto2.e();
                if (e2 != null) {
                    List<StickersPackPreviewDto> list = e2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    Iterator it3 = list.iterator();
                    while (true) {
                        String str = "";
                        if (it3.hasNext()) {
                            StickersPackPreviewDto stickersPackPreviewDto = (StickersPackPreviewDto) it3.next();
                            int id = stickersPackPreviewDto.getId();
                            String title = stickersPackPreviewDto.getTitle();
                            String description = stickersPackPreviewDto.getDescription();
                            String d4 = stickersPackPreviewDto.d();
                            Boolean o = stickersPackPreviewDto.o();
                            Boolean bool = Boolean.TRUE;
                            boolean f2 = epx.f(o, bool);
                            boolean f3 = epx.f(stickersPackPreviewDto.u(), bool);
                            boolean f4 = epx.f(stickersPackPreviewDto.i(), bool);
                            boolean f5 = epx.f(stickersPackPreviewDto.n(), bool);
                            boolean f6 = epx.f(stickersPackPreviewDto.B(), bool);
                            StickersOrderPriceDto k = stickersPackPreviewDto.k();
                            StickerPackPrice stickerPackPrice = k != null ? new StickerPackPrice(k.d(), k.f(), k.e()) : null;
                            StickersImageSetDto j = stickersPackPreviewDto.j();
                            StickerStockItemPreviewImage stickerStockItemPreviewImage = (j == null || (d2 = j.d()) == null) ? null : new StickerStockItemPreviewImage(d2, null, null, 6, null);
                            List<BaseStickerDto> l = stickersPackPreviewDto.l();
                            if (l != null) {
                                List<BaseStickerDto> list2 = l;
                                stickersGetKeyboardRecommendationResponseDto = stickersGetKeyboardRecommendationResponseDto2;
                                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    BaseStickerDto baseStickerDto = (BaseStickerDto) it4.next();
                                    int id2 = stickersPackPreviewDto.getId();
                                    Integer l2 = baseStickerDto.l();
                                    int intValue = l2 != null ? l2.intValue() : 0;
                                    Integer j2 = baseStickerDto.j();
                                    if (j2 != null) {
                                        id2 = j2.intValue();
                                    }
                                    int i = id2;
                                    ImageList b = bo6.b(baseStickerDto.f());
                                    ImageList b2 = bo6.b(baseStickerDto.g());
                                    StickersImageConfigContextDto e3 = baseStickerDto.e();
                                    if (e3 != null) {
                                        Integer e4 = e3.e();
                                        it = it4;
                                        int intValue2 = e4 != null ? e4.intValue() : 0;
                                        Integer d5 = e3.d();
                                        it2 = it3;
                                        imageConfigId = new ImageConfigId(intValue2, d5 != null ? d5.intValue() : -1);
                                    } else {
                                        it = it4;
                                        it2 = it3;
                                        imageConfigId = null;
                                    }
                                    StickerAnimation c = bo6.c(baseStickerDto.d());
                                    Boolean o2 = baseStickerDto.o();
                                    boolean booleanValue = o2 != null ? o2.booleanValue() : true;
                                    StickersStickerRenderDto k2 = baseStickerDto.k();
                                    StickerRender d6 = k2 != null ? bo6.d(k2) : null;
                                    StickersStickerVmojiDto n = baseStickerDto.n();
                                    String d7 = n != null ? n.d() : null;
                                    String str2 = d7 == null ? "" : d7;
                                    StickersStickerPopupDto i2 = baseStickerDto.i();
                                    arrayList3.add(new StickerItem(intValue, i, b, b2, imageConfigId, c, booleanValue, d6, str2, i2 != null ? co6.a(i2) : null));
                                    it4 = it;
                                    it3 = it2;
                                }
                                arrayList = arrayList3;
                            } else {
                                stickersGetKeyboardRecommendationResponseDto = stickersGetKeyboardRecommendationResponseDto2;
                                arrayList = null;
                            }
                            Iterator it5 = it3;
                            arrayList2.add(new StickerPackPreviewModel(id, title, description, d4, f2, f3, f4, f5, f6, stickerPackPrice, stickerStockItemPreviewImage, arrayList, stickersPackPreviewDto.r()));
                            stickersGetKeyboardRecommendationResponseDto2 = stickersGetKeyboardRecommendationResponseDto;
                            it3 = it5;
                        } else {
                            StickersGetKeyboardRecommendationResponseDto stickersGetKeyboardRecommendationResponseDto3 = stickersGetKeyboardRecommendationResponseDto2;
                            StickersKeyboardRecommendationDto d8 = stickersGetKeyboardRecommendationResponseDto3.d();
                            if (d8 != null && (e = d8.e()) != null) {
                                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                                StickersDatabase.a.b().G().b();
                                StickersDatabase.a.b().G().a(new acl0(1, e, arrayList2));
                                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                                kbl0 b3 = kbl0.a.b();
                                StickersKeyboardRecommendationDto d9 = stickersGetKeyboardRecommendationResponseDto3.d();
                                if (d9 != null && (d = d9.d()) != null) {
                                    str = d;
                                }
                                Preference.H(b3.a, "stickers_keyboard_recommendation_hash", str);
                                kbl0 b4 = kbl0.a.b();
                                RecommendationsScrollMode.a aVar = RecommendationsScrollMode.Companion;
                                StickersKeyboardRecommendationDto d10 = stickersGetKeyboardRecommendationResponseDto3.d();
                                String i3 = (d10 == null || (f = d10.f()) == null) ? null : f.i();
                                aVar.getClass();
                                Preference.H(b4.a, "stickers_keyboard_recommendation_scroll_mode", RecommendationsScrollMode.a.a(i3).i());
                                bcl0Var.b(e, arrayList2);
                                bcl0Var.a.b();
                            }
                        }
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(Object obj, int i) {
        super(1, obj, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
            case 4:
            case 5:
            case 9:
            default:
                break;
            case 6:
                super(1, obj, LocationCommon.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, bcl0.class, "processResult", "processResult(Lcom/vk/api/generated/stickers/dto/StickersGetKeyboardRecommendationResponseDto;)V", 0);
                break;
        }
    }
}
