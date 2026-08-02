package xsna;

import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerPackPrice;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vk.repository.internal.repos.stickers.database.converters.PopupStickerAnimationLayerDeserializer;
import com.vk.repository.internal.repos.stickers.database.converters.PopupStickerAnimationLayerSerializer;
import com.vk.repository.internal.repos.stickers.database.converters.dto.AwayLinkDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ButtonActionDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageSizeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationLayerDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PurchaseDetailsButtonDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PurchaseDetailsDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerItemDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerPackPreviewModelDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerPackPriceDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerStockItemPreviewImageDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.UGCStickerModelDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.UgcPackEditDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.en00;

/* compiled from: Converters.kt */
/* loaded from: classes5.dex */
public final class psj {
    public static final Gson a = new GsonBuilder().registerTypeAdapter(PopupStickerAnimationLayerDto.class, new PopupStickerAnimationLayerSerializer()).registerTypeAdapter(PopupStickerAnimationLayerDto.class, new PopupStickerAnimationLayerDeserializer()).create();

    /* compiled from: Converters.kt */
    public static final class a extends xtp0<ArrayList<Integer>> {
    }

    /* compiled from: Converters.kt */
    public static final class b extends xtp0<ArrayList<StickerPackPreviewModelDto>> {
    }

    /* compiled from: Converters.kt */
    public static final class c extends xtp0<ArrayList<UGCStickerModelDto>> {
    }

    public static ImageList a(String str) {
        ImageListDto imageListDto = (ImageListDto) a.fromJson(str, ImageListDto.class);
        if (imageListDto != null) {
            return en00.l(imageListDto);
        }
        return null;
    }

    public static List b(String str) {
        return (List) a.fromJson(str, new a().getType());
    }

    public static NotificationImage c(String str) {
        ImageListDto imageListDto = (ImageListDto) a.fromJson(str, ImageListDto.class);
        if (imageListDto == null) {
            return null;
        }
        List<ImageSizeDto> a2 = imageListDto.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ImageSizeDto imageSizeDto : a2) {
            String b2 = imageSizeDto.b();
            arrayList.add(new NotificationImage.ImageInfo(imageSizeDto.c(), imageSizeDto.a(), b2));
        }
        return new NotificationImage(arrayList);
    }

    public static PurchaseDetails d(String str) {
        PurchaseDetailsDto purchaseDetailsDto = (PurchaseDetailsDto) a.fromJson(str, PurchaseDetailsDto.class);
        PurchaseDetailsButton purchaseDetailsButton = null;
        Bundle bundle = null;
        ButtonAction buttonAction = null;
        if (purchaseDetailsDto == null) {
            return null;
        }
        String b2 = purchaseDetailsDto.b();
        String d = purchaseDetailsDto.d();
        String c2 = purchaseDetailsDto.c();
        PurchaseDetailsButtonDto a2 = purchaseDetailsDto.a();
        if (a2 != null) {
            String b3 = a2.b();
            ButtonActionDto a3 = a2.a();
            if (a3 != null) {
                String c3 = a3.c();
                int a4 = a3.a();
                String d2 = a3.d();
                AwayLinkDto b4 = a3.b();
                Map<String, String> a5 = b4.a();
                if (a5 != null) {
                    bundle = new Bundle();
                    for (Map.Entry<String, String> entry : a5.entrySet()) {
                        bundle.putString(entry.getKey(), entry.getValue());
                    }
                }
                buttonAction = new ButtonAction(c3, a4, d2, new AwayLink(b4.b(), bundle), null, null);
            }
            purchaseDetailsButton = new PurchaseDetailsButton(b3, buttonAction);
        }
        return new PurchaseDetails(b2, d, c2, purchaseDetailsButton);
    }

    public static ArrayList e(String str) {
        Iterable iterable = (Iterable) a.fromJson(str, new qsj().getType());
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(en00.a((StickerItemDto) it.next()));
        }
        return arrayList;
    }

    public static List f(String str) {
        Iterator it;
        StickerStockItemPreviewImage stickerStockItemPreviewImage;
        StickerPackPreviewModelDto stickerPackPreviewModelDto;
        char c2;
        ArrayList arrayList;
        Image image;
        List list = (List) a.fromJson(str, new b().getType());
        if (list == null) {
            return EmptyList.b;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            StickerPackPreviewModelDto stickerPackPreviewModelDto2 = (StickerPackPreviewModelDto) it2.next();
            int e = stickerPackPreviewModelDto2.e();
            String h = stickerPackPreviewModelDto2.h();
            String c3 = stickerPackPreviewModelDto2.c();
            String a2 = stickerPackPreviewModelDto2.a();
            boolean k = stickerPackPreviewModelDto2.k();
            boolean l = stickerPackPreviewModelDto2.l();
            boolean b2 = stickerPackPreviewModelDto2.b();
            boolean j = stickerPackPreviewModelDto2.j();
            boolean m = stickerPackPreviewModelDto2.m();
            StickerPackPriceDto f = stickerPackPreviewModelDto2.f();
            StickerPackPrice stickerPackPrice = f != null ? new StickerPackPrice(f.a(), f.c(), f.b()) : null;
            StickerStockItemPreviewImageDto d = stickerPackPreviewModelDto2.d();
            if (d != null) {
                String a3 = d.a();
                ImageListDto b3 = d.b();
                if (b3 != null) {
                    it = it2;
                    image = en00.k(b3);
                } else {
                    it = it2;
                    image = null;
                }
                ImageListDto c4 = d.c();
                stickerStockItemPreviewImage = new StickerStockItemPreviewImage(a3, image, c4 != null ? en00.k(c4) : null);
            } else {
                it = it2;
                stickerStockItemPreviewImage = null;
            }
            List<StickerItemDto> g = stickerPackPreviewModelDto2.g();
            if (g != null) {
                List<StickerItemDto> list3 = g;
                stickerPackPreviewModelDto = stickerPackPreviewModelDto2;
                c2 = '\n';
                arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(en00.a((StickerItemDto) it3.next()));
                }
            } else {
                stickerPackPreviewModelDto = stickerPackPreviewModelDto2;
                c2 = '\n';
                arrayList = null;
            }
            arrayList2.add(new StickerPackPreviewModel(e, h, c3, a2, k, l, b2, j, m, stickerPackPrice, stickerStockItemPreviewImage, arrayList, stickerPackPreviewModelDto.i()));
            it2 = it;
        }
        return arrayList2;
    }

    public static String g(ImageList imageList) {
        return a.toJson(imageList != null ? en00.f(imageList) : null);
    }

    public static String h(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(en00.j((StickerItem) it.next()));
        }
        return a.toJson(arrayList);
    }

    public static iyp0 i(String str) {
        UgcPackEditDto ugcPackEditDto = (UgcPackEditDto) a.fromJson(str, UgcPackEditDto.class);
        if (ugcPackEditDto != null) {
            return new iyp0(ugcPackEditDto.b(), ugcPackEditDto.c(), ugcPackEditDto.a(), ugcPackEditDto.d());
        }
        return null;
    }

    public static List j(String str) {
        UgcStatus ugcStatus;
        List list = (List) a.fromJson(str, new c().getType());
        if (list == null) {
            return EmptyList.b;
        }
        List<UGCStickerModelDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (UGCStickerModelDto uGCStickerModelDto : list2) {
            long d = uGCStickerModelDto.d();
            gzs<s3q0> gzsVar = fkq0.a;
            UserId userId = new UserId(d);
            long a2 = uGCStickerModelDto.a();
            long e = uGCStickerModelDto.e();
            ImageList l = en00.l(uGCStickerModelDto.b());
            int i = en00.a.$EnumSwitchMapping$3[uGCStickerModelDto.f().ordinal()];
            if (i == 1) {
                ugcStatus = UgcStatus.CLAIMED;
            } else if (i == 2) {
                ugcStatus = UgcStatus.BANNED;
            } else if (i == 3) {
                ugcStatus = UgcStatus.DELETED;
            } else if (i == 4) {
                ugcStatus = UgcStatus.AGE_RESTRICTED;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                ugcStatus = UgcStatus.OK;
            }
            arrayList.add(new UGCStickerModel(userId, a2, e, l, ugcStatus, uGCStickerModelDto.c()));
        }
        return arrayList;
    }
}
