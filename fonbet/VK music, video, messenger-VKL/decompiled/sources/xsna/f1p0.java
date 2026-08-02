package xsna;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.vmoji.dto.VmojiAvatarDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterPreviewBackgroundColorDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterPreviewDto;
import com.vk.api.generated.vmoji.dto.VmojiConstructorNewItemsDto;
import com.vk.api.generated.vmoji.dto.VmojiConstructorOpenParamsDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiProductDto;
import com.vk.api.generated.vmoji.dto.VmojiProductPreviewDto;
import com.vk.api.generated.vmoji.dto.VmojiProductUnlockInfoDto;
import com.vk.catalog.mvi.block.video.impl.upload.UploadListView$UploadListState;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryToolbarVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerSuggestion;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.dto.video.LiveCategory;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.ImageListModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiPrice;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.model.VmojiProductPreviewModel;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoButtonModel;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoModel;
import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.kcl0;
import xsna.l1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f1p0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f1p0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.vk.vmoji.character.model.VmojiProductUnlockInfoButtonModel] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [com.vk.vmoji.character.model.VmojiProductUnlockInfoModel] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.vk.vmoji.character.model.VmojiProductPreviewModel] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.vk.api.generated.stickers.dto.StickersStickerRenderDto] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        boolean z;
        VmojiAvatar vmojiAvatar;
        VmojiCharacterPreviewBackgroundColorDto d;
        String e;
        int i;
        String d2;
        List<VmojiProductDto> f;
        VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto;
        EmptyList emptyList;
        List<StickersStickerRenderDto> g;
        ?? r3;
        VmojiAvatarDto d3;
        Object obj3;
        VmojiCharacterPreviewDto d4;
        ImageListModel imageListModel;
        String str;
        ?? vmojiProductUnlockInfoModel;
        BaseLinkButtonActionDto e2;
        VmojiCharacterPreviewDto d5;
        VmojiConstructorNewItemsDto.CounterColorDto d6;
        int i2 = this.b;
        int i3 = 0;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                break;
            case 1:
                Pair[] pairArr = (Pair[]) obj5;
                kw8 kw8Var = (kw8) obj;
                break;
            case 2:
                mcc0 mcc0Var = ((tbq0) obj4).b;
                UploadListView$UploadListState uploadListView$UploadListState = (UploadListView$UploadListState) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : (List) obj5) {
                    VideoUploadEvent videoUploadEvent = (VideoUploadEvent) obj6;
                    if (epx.f(videoUploadEvent.b.d, ((UploadListView$UploadListState) ((b2a) mcc0Var.b).getCurrentState()).e)) {
                        if (Boolean.valueOf(videoUploadEvent.b.n != 0).equals(((UploadListView$UploadListState) ((b2a) mcc0Var.b).getCurrentState()).d) && ((videoUploadEvent instanceof VideoUploadEvent.Start) || (((videoUploadEvent instanceof VideoUploadEvent.Progress) && ((VideoUploadEvent.Progress) videoUploadEvent).c < 1.0f) || (videoUploadEvent instanceof VideoUploadEvent.Fail)))) {
                            arrayList.add(obj6);
                        }
                    }
                }
                break;
            case 3:
                Context context = ((View) obj).getContext();
                ((VideoCategoryToolbarVh) obj4).e.getClass();
                new pas0(context, (LiveCategory) obj5).c();
                break;
            case 4:
                ((bqu0) obj5).dismiss();
                ((mov0) obj4).c.j(JsApiMethodType.SHOW_ORDER_BOX, VkAppsErrors.b((Throwable) obj));
                break;
            case 5:
                w6w0 w6w0Var = (w6w0) obj5;
                String str2 = (String) obj4;
                VmojiGetAvatarResponseDto vmojiGetAvatarResponseDto = (VmojiGetAvatarResponseDto) obj;
                VmojiAvatarDto d7 = vmojiGetAvatarResponseDto.d();
                VmojiConstructorNewItemsDto e3 = d7 != null ? d7.e() : null;
                PromoColor.a aVar = PromoColor.Companion;
                String i4 = (e3 == null || (d6 = e3.d()) == null) ? null : d6.i();
                aVar.getClass();
                PromoColor a = PromoColor.a.a(i4);
                int e4 = e3 != null ? e3.e() : 0;
                Serializer.c<VmojiCharacterModel> cVar = VmojiCharacterModel.CREATOR;
                CharacterContext characterContext = w6w0Var.e;
                boolean z2 = w6w0Var.f;
                if (characterContext == CharacterContext.MY_CHARACTER) {
                    Iterator it = w6w0Var.b.U().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            VmojiAvatar vmojiAvatar2 = ((StickerStockItem) obj2).H;
                            if (epx.f(vmojiAvatar2 != null ? vmojiAvatar2.getId() : null, str2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                    boolean z3 = (stickerStockItem == null || (vmojiAvatar = stickerStockItem.H) == null || !vmojiAvatar.Cb()) ? false : true;
                    if ((stickerStockItem != null && !stickerStockItem.k) || (stickerStockItem != null && stickerStockItem.k && !z3)) {
                        z = true;
                        List<VmojiCharacterDto> e5 = vmojiGetAvatarResponseDto.e();
                        VmojiCharacterDto vmojiCharacterDto = e5 == null ? (VmojiCharacterDto) j5g.a0(e5) : null;
                        d = (vmojiCharacterDto != null || (d5 = vmojiCharacterDto.d()) == null) ? null : d5.d();
                        if (d == null) {
                            try {
                                e = d.e();
                            } catch (Exception unused) {
                                i = 0;
                            }
                        } else {
                            e = null;
                        }
                        i = Color.parseColor(e);
                        if (d == null) {
                            try {
                                d2 = d.d();
                            } catch (Exception unused2) {
                            }
                        } else {
                            d2 = null;
                        }
                        i3 = Color.parseColor(d2);
                        int i5 = i3;
                        f = vmojiGetAvatarResponseDto.f();
                        if (f == null) {
                            List<VmojiProductDto> list = f;
                            int i6 = 10;
                            ?? arrayList2 = new ArrayList(c5g.u(list, 10));
                            for (VmojiProductDto vmojiProductDto : list) {
                                Serializer.c<VmojiProductModel> cVar2 = VmojiProductModel.CREATOR;
                                List<BaseImageDto> e6 = vmojiProductDto.e();
                                List<BaseImageDto> list2 = e6;
                                if (list2 == null || list2.isEmpty()) {
                                    str = null;
                                    imageListModel = new ImageListModel(null, 1, null);
                                } else {
                                    List<BaseImageDto> list3 = e6;
                                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, i6));
                                    for (BaseImageDto baseImageDto : list3) {
                                        arrayList3.add(new ImageListModel.ImageModel(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), epx.f(baseImageDto.e(), Boolean.TRUE)));
                                    }
                                    imageListModel = new ImageListModel(arrayList3);
                                    str = null;
                                }
                                ImageListModel imageListModel2 = imageListModel;
                                Boolean j = vmojiProductDto.j();
                                Boolean bool = Boolean.TRUE;
                                VmojiProductModel.State state = (epx.f(j, bool) && epx.f(vmojiProductDto.l(), Boolean.FALSE)) ? VmojiProductModel.State.Locked.b : (epx.f(vmojiProductDto.j(), bool) && epx.f(vmojiProductDto.l(), bool) && vmojiProductDto.k()) ? VmojiProductModel.State.Unlocked.b : vmojiProductDto.k() ? VmojiProductModel.State.CrownWithCheck.b : !vmojiProductDto.k() ? VmojiProductModel.State.Crown.b : VmojiProductModel.State.None.b;
                                int d8 = vmojiProductDto.g().d();
                                Integer e7 = vmojiProductDto.g().e();
                                VmojiPrice unavailable = epx.f(vmojiProductDto.j(), bool) ? new VmojiPrice.Unavailable(d8) : vmojiProductDto.k() ? new VmojiPrice.Added(d8) : d8 == 0 ? new VmojiPrice.Free(d8) : (e7 == null || e7.intValue() == d8) ? new VmojiPrice.Price(d8) : new VmojiPrice.PriceWithDiscount(d8, e7.intValue());
                                int id = vmojiProductDto.getId();
                                String title = vmojiProductDto.getTitle();
                                String description = vmojiProductDto.getDescription();
                                Serializer.c<VmojiProductUnlockInfoModel> cVar3 = VmojiProductUnlockInfoModel.CREATOR;
                                VmojiProductUnlockInfoDto i7 = vmojiProductDto.i();
                                if (i7 == null) {
                                    vmojiProductUnlockInfoModel = str;
                                } else {
                                    BaseLinkButtonDto d9 = i7.d();
                                    String title2 = d9 != null ? d9.getTitle() : str;
                                    BaseLinkButtonDto d10 = i7.d();
                                    String url = (d10 == null || (e2 = d10.e()) == null) ? str : e2.getUrl();
                                    vmojiProductUnlockInfoModel = new VmojiProductUnlockInfoModel(i7.getTitle(), i7.e(), (title2 == null || url == null) ? str : new VmojiProductUnlockInfoButtonModel(title2, url));
                                }
                                Serializer.c<VmojiProductPreviewModel> cVar4 = VmojiProductPreviewModel.CREATOR;
                                VmojiProductPreviewDto f2 = vmojiProductDto.f();
                                ?? vmojiProductPreviewModel = f2 == null ? str : new VmojiProductPreviewModel(f2.d(), f2.e());
                                VmojiConstructorOpenParamsDto d11 = vmojiProductDto.d();
                                arrayList2.add(new VmojiProductModel(id, title, description, imageListModel2, state, null, unavailable, vmojiProductUnlockInfoModel, vmojiProductPreviewModel, new VmojiConstructorOpenParamsModel(d11 != null ? d11.f() : str, d11 != null ? d11.d() : str, d11 != null ? d11.e() : str)));
                                i6 = 10;
                            }
                            vmojiConstructorOpenParamsDto = null;
                            emptyList = arrayList2;
                        } else {
                            vmojiConstructorOpenParamsDto = null;
                            emptyList = EmptyList.b;
                        }
                        EmptyList emptyList2 = emptyList;
                        Object e8 = (vmojiCharacterDto != null || (d4 = vmojiCharacterDto.d()) == null) ? vmojiConstructorOpenParamsDto : d4.e();
                        g = vmojiGetAvatarResponseDto.g();
                        if (g == null) {
                            Iterator it2 = g.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    StickersStickerRenderDto stickersStickerRenderDto = (StickersStickerRenderDto) obj3;
                                    if (!epx.f(stickersStickerRenderDto.getId(), e8) || !epx.f(stickersStickerRenderDto.f(), Boolean.FALSE)) {
                                    }
                                } else {
                                    obj3 = vmojiConstructorOpenParamsDto;
                                }
                            }
                            r3 = (StickersStickerRenderDto) obj3;
                        } else {
                            r3 = vmojiConstructorOpenParamsDto;
                        }
                        ?? d12 = r3 == 0 ? r3.d() : vmojiConstructorOpenParamsDto;
                        ImageListModel a2 = VmojiCharacterModel.a.a(d12, BaseImageDto.ThemeDto.LIGHT);
                        ImageListModel a3 = VmojiCharacterModel.a.a(d12, BaseImageDto.ThemeDto.DARK);
                        VmojiAvatarDto d13 = vmojiGetAvatarResponseDto.d();
                        String id2 = d13.getId();
                        String d14 = d13.d();
                        String f3 = d13.f();
                        boolean f4 = epx.f(d13.g(), Boolean.TRUE);
                        VmojiConstructorNewItemsDto e9 = d13.e();
                        VmojiConstructorOpenParamsDto f5 = e9 == null ? e9.f() : vmojiConstructorOpenParamsDto;
                        VmojiAvatar vmojiAvatar3 = new VmojiAvatar(id2, d14, f3, f4, new VmojiConstructorOpenParamsModel(f5 == null ? f5.f() : vmojiConstructorOpenParamsDto, f5 == null ? f5.d() : vmojiConstructorOpenParamsDto, f5 == null ? f5.e() : vmojiConstructorOpenParamsDto));
                        d3 = vmojiGetAvatarResponseDto.d();
                        if (d3 != null || (r0 = d3.f()) == null) {
                            String str3 = "";
                        }
                        break;
                    }
                }
                z = false;
                List<VmojiCharacterDto> e52 = vmojiGetAvatarResponseDto.e();
                if (e52 == null) {
                }
                if (vmojiCharacterDto != null) {
                }
                if (d == null) {
                }
                i = Color.parseColor(e);
                if (d == null) {
                }
                i3 = Color.parseColor(d2);
                int i52 = i3;
                f = vmojiGetAvatarResponseDto.f();
                if (f == null) {
                }
                EmptyList emptyList22 = emptyList;
                if (vmojiCharacterDto != null) {
                }
                g = vmojiGetAvatarResponseDto.g();
                if (g == null) {
                }
                if (r3 == 0) {
                }
                ImageListModel a22 = VmojiCharacterModel.a.a(d12, BaseImageDto.ThemeDto.LIGHT);
                ImageListModel a32 = VmojiCharacterModel.a.a(d12, BaseImageDto.ThemeDto.DARK);
                VmojiAvatarDto d132 = vmojiGetAvatarResponseDto.d();
                String id22 = d132.getId();
                String d142 = d132.d();
                String f32 = d132.f();
                boolean f42 = epx.f(d132.g(), Boolean.TRUE);
                VmojiConstructorNewItemsDto e92 = d132.e();
                if (e92 == null) {
                }
                VmojiAvatar vmojiAvatar32 = new VmojiAvatar(id22, d142, f32, f42, new VmojiConstructorOpenParamsModel(f5 == null ? f5.f() : vmojiConstructorOpenParamsDto, f5 == null ? f5.d() : vmojiConstructorOpenParamsDto, f5 == null ? f5.e() : vmojiConstructorOpenParamsDto));
                d3 = vmojiGetAvatarResponseDto.d();
                if (d3 != null) {
                }
                String str32 = "";
                break;
            case 6:
                l1x0.b bVar = (l1x0.b) obj4;
                int i8 = l1x0.k1;
                ((l1x0) obj5).bo(bVar, bVar.e, (VoipShareLinkSheetButton) obj);
                break;
            default:
                rux0 rux0Var = (rux0) obj4;
                k8l0 k8l0Var = ((pux0) obj5).l;
                int i9 = rux0Var.c;
                String str4 = rux0Var.d.b;
                kcl0.e eVar = k8l0Var.b;
                eVar.c(i9, str4);
                k8l0Var.f.a(i9);
                List<StickerSuggestion> a4 = eVar.a(i9);
                if (a4 != null) {
                    k8l0Var.a(a4);
                }
                break;
        }
        return s3q0.a;
    }
}
