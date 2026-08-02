package xsna;

import android.os.Bundle;
import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.Image;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.repository.internal.repos.stickers.database.converters.dto.AwayLinkDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ButtonActionDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageSizeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PurchaseDetailsButtonDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PurchaseDetailsDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerStockItemPreviewImageDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: StickersDao_Impl.kt */
/* loaded from: classes5.dex */
public final class o9l0 implements n9l0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StickersDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            Object obj2;
            Object obj3;
            j5l0 j5l0Var;
            Object obj4;
            PurchaseDetailsButtonDto purchaseDetailsButtonDto;
            ButtonActionDto buttonActionDto;
            Map map;
            Set<String> keySet;
            j5l0 j5l0Var2 = (j5l0) obj;
            qyg0Var.bindLong(1, j5l0Var2.a);
            qyg0Var.bindLong(2, j5l0Var2.b);
            qyg0Var.D3(3, j5l0Var2.c);
            String str = j5l0Var2.d;
            if (str == null) {
                qyg0Var.bindNull(4);
            } else {
                qyg0Var.D3(4, str);
            }
            qyg0Var.bindLong(5, j5l0Var2.e ? 1L : 0L);
            qyg0Var.bindLong(6, j5l0Var2.f ? 1L : 0L);
            qyg0Var.D3(7, j5l0Var2.g);
            Gson gson = psj.a;
            qyg0Var.D3(8, psj.h(j5l0Var2.h));
            StickerStockItemPreviewImage stickerStockItemPreviewImage = j5l0Var2.i;
            Gson gson2 = psj.a;
            if (stickerStockItemPreviewImage != null) {
                String zb = stickerStockItemPreviewImage.zb();
                Image Ab = stickerStockItemPreviewImage.Ab();
                ImageListDto e = Ab != null ? en00.e(Ab) : null;
                Image Bb = stickerStockItemPreviewImage.Bb();
                obj2 = new StickerStockItemPreviewImageDto(zb, e, Bb != null ? en00.e(Bb) : null);
            } else {
                obj2 = null;
            }
            qyg0Var.D3(9, gson2.toJson(obj2));
            NotificationImage notificationImage = j5l0Var2.j;
            if (notificationImage != null) {
                List<NotificationImage.ImageInfo> Ab2 = notificationImage.Ab();
                ArrayList arrayList = new ArrayList(c5g.u(Ab2, 10));
                for (NotificationImage.ImageInfo imageInfo : Ab2) {
                    String str2 = imageInfo.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(new ImageSizeDto(str2, imageInfo.c, imageInfo.b, false, false));
                }
                obj3 = new ImageListDto(arrayList);
            } else {
                obj3 = null;
            }
            qyg0Var.D3(10, gson2.toJson(obj3));
            qyg0Var.D3(11, j5l0Var2.k);
            qyg0Var.D3(12, j5l0Var2.l);
            qyg0Var.D3(13, j5l0Var2.m);
            Gson gson3 = psj.a;
            Object obj5 = j5l0Var2.n;
            Gson gson4 = psj.a;
            qyg0Var.D3(14, gson4.toJson(obj5));
            Object obj6 = j5l0Var2.o;
            String json = obj6 == null ? null : gson4.toJson(obj6);
            if (json == null) {
                qyg0Var.bindNull(15);
            } else {
                qyg0Var.D3(15, json);
            }
            if (j5l0Var2.p == null) {
                qyg0Var.bindNull(16);
            } else {
                qyg0Var.bindLong(16, r2.intValue());
            }
            qyg0Var.D3(17, gson4.toJson(j5l0Var2.q));
            qyg0Var.bindLong(18, j5l0Var2.r ? 1L : 0L);
            qyg0Var.bindLong(19, j5l0Var2.s ? 1L : 0L);
            qyg0Var.bindLong(20, j5l0Var2.t ? 1L : 0L);
            qyg0Var.bindLong(21, j5l0Var2.u ? 1L : 0L);
            qyg0Var.bindLong(22, j5l0Var2.v ? 1L : 0L);
            qyg0Var.D3(23, gson4.toJson(j5l0Var2.w));
            String str3 = j5l0Var2.x;
            if (str3 == null) {
                qyg0Var.bindNull(24);
            } else {
                qyg0Var.D3(24, str3);
            }
            String str4 = j5l0Var2.y;
            if (str4 == null) {
                qyg0Var.bindNull(25);
            } else {
                qyg0Var.D3(25, str4);
            }
            String str5 = j5l0Var2.z;
            if (str5 == null) {
                qyg0Var.bindNull(26);
            } else {
                qyg0Var.D3(26, str5);
            }
            String str6 = j5l0Var2.A;
            if (str6 == null) {
                qyg0Var.bindNull(27);
            } else {
                qyg0Var.D3(27, str6);
            }
            String str7 = j5l0Var2.B;
            if (str7 == null) {
                qyg0Var.bindNull(28);
            } else {
                qyg0Var.D3(28, str7);
            }
            String str8 = j5l0Var2.C;
            if (str8 == null) {
                qyg0Var.bindNull(29);
            } else {
                qyg0Var.D3(29, str8);
            }
            String str9 = j5l0Var2.D;
            if (str9 == null) {
                qyg0Var.bindNull(30);
            } else {
                qyg0Var.D3(30, str9);
            }
            String str10 = j5l0Var2.E;
            if (str10 == null) {
                qyg0Var.bindNull(31);
            } else {
                qyg0Var.D3(31, str10);
            }
            qyg0Var.bindLong(32, j5l0Var2.F);
            qyg0Var.bindLong(33, j5l0Var2.G);
            qyg0Var.bindLong(34, j5l0Var2.H ? 1L : 0L);
            String str11 = j5l0Var2.I;
            if (str11 == null) {
                qyg0Var.bindNull(35);
            } else {
                qyg0Var.D3(35, str11);
            }
            qyg0Var.D3(36, gson4.toJson(j5l0Var2.J));
            PurchaseDetails purchaseDetails = j5l0Var2.K;
            if (purchaseDetails != null) {
                String str12 = purchaseDetails.b;
                String str13 = purchaseDetails.c;
                String str14 = purchaseDetails.d;
                PurchaseDetailsButton purchaseDetailsButton = purchaseDetails.e;
                if (purchaseDetailsButton != null) {
                    String str15 = purchaseDetailsButton.b;
                    ButtonAction buttonAction = purchaseDetailsButton.c;
                    if (buttonAction != null) {
                        String str16 = buttonAction.b;
                        int i = buttonAction.c;
                        String str17 = buttonAction.d;
                        AwayLink awayLink = buttonAction.e;
                        Bundle bundle = awayLink.c;
                        if (bundle == null || (keySet = bundle.keySet()) == null) {
                            j5l0Var = j5l0Var2;
                            map = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (String str18 : keySet) {
                                j5l0 j5l0Var3 = j5l0Var2;
                                String string = bundle.getString(str18);
                                Bundle bundle2 = bundle;
                                Pair pair = string != null ? new Pair(str18, string) : null;
                                if (pair != null) {
                                    arrayList2.add(pair);
                                }
                                bundle = bundle2;
                                j5l0Var2 = j5l0Var3;
                            }
                            j5l0Var = j5l0Var2;
                            map = pn00.s(arrayList2);
                        }
                        buttonActionDto = new ButtonActionDto(str16, i, str17, new AwayLinkDto(awayLink.b, map));
                    } else {
                        j5l0Var = j5l0Var2;
                        buttonActionDto = null;
                    }
                    purchaseDetailsButtonDto = new PurchaseDetailsButtonDto(str15, buttonActionDto);
                } else {
                    j5l0Var = j5l0Var2;
                    purchaseDetailsButtonDto = null;
                }
                obj4 = new PurchaseDetailsDto(str12, str13, str14, purchaseDetailsButtonDto);
            } else {
                j5l0Var = j5l0Var2;
                obj4 = null;
            }
            qyg0Var.D3(37, gson4.toJson(obj4));
            j5l0 j5l0Var4 = j5l0Var;
            qyg0Var.bindLong(38, j5l0Var4.L ? 1L : 0L);
            qyg0Var.D3(39, j5l0Var4.M);
            qyg0Var.bindLong(40, j5l0Var4.N ? 1L : 0L);
            String str19 = j5l0Var4.O;
            if (str19 == null) {
                qyg0Var.bindNull(41);
            } else {
                qyg0Var.D3(41, str19);
            }
            qyg0Var.bindLong(42, j5l0Var4.P ? 1L : 0L);
            Boolean bool = j5l0Var4.Q;
            if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                qyg0Var.bindNull(43);
            } else {
                qyg0Var.bindLong(43, r4.intValue());
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `store_packs` (`id`,`contextId`,`type`,`copyright`,`purchased`,`active`,`title`,`stickers`,`icon`,`previews`,`url`,`author`,`description`,`styles`,`styleStickerIds`,`baseId`,`vmojiAvatar`,`hasAnimation`,`canPurchase`,`canPurchaseFor`,`promoted`,`free`,`prices`,`merchantId`,`paymentTypeStr`,`photo35`,`photo70`,`photo140`,`photo296`,`photo592`,`noPurchaseReason`,`purchaseDate`,`order`,`canGift`,`note`,`badge`,`purchaseDetails`,`isForVkMeOnly`,`versionHash`,`isNotViewed`,`referrer`,`isVmoji`,`isPopup`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: StickersDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public o9l0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    @Override // xsna.n9l0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new sf4(22, this, arrayList));
    }

    @Override // xsna.n9l0
    public final List<j5l0> b() {
        return (List) u370.f(this.a, true, false, new q8w(21));
    }

    @Override // xsna.n9l0
    public final void c() {
        u370.f(this.a, false, true, new p7x(25));
    }
}
