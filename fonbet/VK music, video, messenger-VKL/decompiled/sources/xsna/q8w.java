package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.view.components.topbar.a;
import com.vk.dto.common.Image;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.tags.Tag;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerStockItemPreviewImageDto;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aop0;
import xsna.n0o0;
import xsna.ndw;
import xsna.onp0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q8w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ q8w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        rnd0 rnd0Var;
        qyg0 V0;
        StickerStockItemPreviewImage stickerStockItemPreviewImage;
        StickerStockItemPreviewImage stickerStockItemPreviewImage2;
        int i = 27;
        int i2 = 6;
        int i3 = 5;
        GroupsGroupDonutDto groupsGroupDonutDto = null;
        switch (this.b) {
            case 0:
                ndw ndwVar = (ndw) obj;
                if (ndwVar instanceof ndw.a) {
                    return new p8w(((ndw.a) ndwVar).a);
                }
                if (ndwVar instanceof ndw.b) {
                    return (p8w) p8w.b.getValue();
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                return s3q0.a;
            case 2:
                Pair pair = (Pair) obj;
                return ((String) pair.i()) + ':' + ((Number) pair.j()).intValue();
            case 3:
                return io.reactivex.rxjava3.core.x.k(new aop0.b(new onp0.a((Throwable) obj)));
            case 4:
                EcosystemSendOtpResponseDto ecosystemSendOtpResponseDto = (EcosystemSendOtpResponseDto) obj;
                return new thi0(ecosystemSendOtpResponseDto.e(), ecosystemSendOtpResponseDto.f(), ecosystemSendOtpResponseDto.g());
            case 5:
                L.E((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 6:
                nkk nkkVar = luo.a;
                return xh2.c(anp.l(jq2.d(0, 200, nkkVar, 1), new b40(i)).b(anp.e(jq2.d(0, 200, nkkVar, 1), 2)), anp.o(jq2.d(0, 200, nkkVar, 1), new c3v(6)).b(anp.f(jq2.d(0, 200, nkkVar, 1), 2)));
            case 7:
                return ((id50) obj).e;
            case 8:
                vy60 vy60Var = (vy60) obj;
                return new ux60(new qr60.a.f(vy60Var.a, vy60Var.b, vy60Var.d));
            case 9:
                qgi0.r((tgi0) obj, "NonProfitOrganizationIconTag");
                return s3q0.a;
            case 10:
                nvy nvyVar = (nvy) obj;
                for (int i4 = 0; i4 < 7; i4++) {
                    nvy.g(nvyVar, null, null, sa30.b, 3);
                }
                return s3q0.a;
            case 11:
                qgi0.r((tgi0) obj, "obtain_verification_toolbar_back");
                return s3q0.a;
            case 12:
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) != null) {
                    groupsGroupDonutDto = groupsGroupFullDto.l0();
                }
                return Boolean.valueOf(groupsGroupDonutDto != null);
            case 13:
                L.i((Throwable) obj);
                return s3q0.a;
            case 14:
                PopupStickersChatSettingsModel popupStickersChatSettingsModel = (PopupStickersChatSettingsModel) obj;
                return new nyb0(new zp2(popupStickersChatSettingsModel.Ab(), true), new yp2(popupStickersChatSettingsModel.zb(), true), false);
            case 15:
                return ChannelMsgSendConfig.a((ChannelMsgSendConfig) obj, null, false, false, !r2.d(), false, null, null, null, null, false, false, false, false, null, 32759);
            case 16:
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        n0o0.a aVar = ((Tag) it.next()).f.e;
                        if (aVar != null && (rnd0Var = aVar.b) != null && !rnd0Var.c) {
                            return Boolean.valueOf(r9);
                        }
                    }
                }
                r9 = false;
                return Boolean.valueOf(r9);
            case 17:
                return ((PostingState.Editing) obj).i.t;
            case 18:
                Map map = (Map) obj;
                return map.isEmpty() ? io.reactivex.rxjava3.internal.operators.maybe.i.b : io.reactivex.rxjava3.core.k.i(map);
            case 19:
                return gpt0.e(gpt0.a, (VideoFile) obj, -1, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), false, false, null, null, false, 480);
            case 20:
                byte[] bArr = (byte[]) obj;
                File createTempFile = File.createTempFile("sdk_sak_captcha", ".wav");
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    s3q0 s3q0Var = s3q0.a;
                    fileOutputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    createTempFile.delete();
                    return fileInputStream.getFD();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(fileOutputStream, th);
                        throw th2;
                    }
                }
            case 21:
                V0 = ((hyg0) obj).V0("SELECT `store_packs`.`id` AS `id`, `store_packs`.`contextId` AS `contextId`, `store_packs`.`type` AS `type`, `store_packs`.`copyright` AS `copyright`, `store_packs`.`purchased` AS `purchased`, `store_packs`.`active` AS `active`, `store_packs`.`title` AS `title`, `store_packs`.`stickers` AS `stickers`, `store_packs`.`icon` AS `icon`, `store_packs`.`previews` AS `previews`, `store_packs`.`url` AS `url`, `store_packs`.`author` AS `author`, `store_packs`.`description` AS `description`, `store_packs`.`styles` AS `styles`, `store_packs`.`styleStickerIds` AS `styleStickerIds`, `store_packs`.`baseId` AS `baseId`, `store_packs`.`vmojiAvatar` AS `vmojiAvatar`, `store_packs`.`hasAnimation` AS `hasAnimation`, `store_packs`.`canPurchase` AS `canPurchase`, `store_packs`.`canPurchaseFor` AS `canPurchaseFor`, `store_packs`.`promoted` AS `promoted`, `store_packs`.`free` AS `free`, `store_packs`.`prices` AS `prices`, `store_packs`.`merchantId` AS `merchantId`, `store_packs`.`paymentTypeStr` AS `paymentTypeStr`, `store_packs`.`photo35` AS `photo35`, `store_packs`.`photo70` AS `photo70`, `store_packs`.`photo140` AS `photo140`, `store_packs`.`photo296` AS `photo296`, `store_packs`.`photo592` AS `photo592`, `store_packs`.`noPurchaseReason` AS `noPurchaseReason`, `store_packs`.`purchaseDate` AS `purchaseDate`, `store_packs`.`order` AS `order`, `store_packs`.`canGift` AS `canGift`, `store_packs`.`note` AS `note`, `store_packs`.`badge` AS `badge`, `store_packs`.`purchaseDetails` AS `purchaseDetails`, `store_packs`.`isForVkMeOnly` AS `isForVkMeOnly`, `store_packs`.`versionHash` AS `versionHash`, `store_packs`.`isNotViewed` AS `isNotViewed`, `store_packs`.`referrer` AS `referrer`, `store_packs`.`isVmoji` AS `isVmoji`, `store_packs`.`isPopup` AS `isPopup` FROM store_packs");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i5 = (int) V0.getLong(0);
                        int i6 = (int) V0.getLong(1);
                        String l2 = V0.l2(2);
                        String l22 = V0.isNull(3) ? null : V0.l2(3);
                        boolean z = ((int) V0.getLong(4)) != 0;
                        boolean z2 = ((int) V0.getLong(i3)) != 0;
                        String l23 = V0.l2(i2);
                        ArrayList e = psj.e(V0.l2(7));
                        String l24 = V0.isNull(8) ? null : V0.l2(8);
                        if (l24 == null) {
                            stickerStockItemPreviewImage2 = null;
                        } else {
                            StickerStockItemPreviewImageDto stickerStockItemPreviewImageDto = (StickerStockItemPreviewImageDto) psj.a.fromJson(l24, StickerStockItemPreviewImageDto.class);
                            if (stickerStockItemPreviewImageDto != null) {
                                String a = stickerStockItemPreviewImageDto.a();
                                ImageListDto b = stickerStockItemPreviewImageDto.b();
                                Image k = b != null ? en00.k(b) : null;
                                ImageListDto c = stickerStockItemPreviewImageDto.c();
                                stickerStockItemPreviewImage = new StickerStockItemPreviewImage(a, k, c != null ? en00.k(c) : null);
                            } else {
                                stickerStockItemPreviewImage = null;
                            }
                            stickerStockItemPreviewImage2 = stickerStockItemPreviewImage;
                        }
                        String l25 = V0.isNull(9) ? null : V0.l2(9);
                        NotificationImage c2 = l25 == null ? null : psj.c(l25);
                        String l26 = V0.l2(10);
                        String l27 = V0.l2(11);
                        String l28 = V0.l2(12);
                        List b2 = psj.b(V0.l2(13));
                        String l29 = V0.isNull(14) ? null : V0.l2(14);
                        List b3 = l29 == null ? null : psj.b(l29);
                        Integer valueOf = V0.isNull(15) ? null : Integer.valueOf((int) V0.getLong(15));
                        String l210 = V0.isNull(16) ? null : V0.l2(16);
                        Gson gson = psj.a;
                        VmojiAvatar vmojiAvatar = (VmojiAvatar) gson.fromJson(l210, VmojiAvatar.class);
                        boolean z3 = ((int) V0.getLong(17)) != 0;
                        boolean z4 = ((int) V0.getLong(18)) != 0;
                        boolean z5 = ((int) V0.getLong(19)) != 0;
                        boolean z6 = ((int) V0.getLong(20)) != 0;
                        boolean z7 = ((int) V0.getLong(21)) != 0;
                        Price price = (Price) gson.fromJson(V0.l2(22), Price.class);
                        String l211 = V0.isNull(23) ? null : V0.l2(23);
                        String l212 = V0.isNull(24) ? null : V0.l2(24);
                        String l213 = V0.isNull(25) ? null : V0.l2(25);
                        String l214 = V0.isNull(26) ? null : V0.l2(26);
                        String l215 = V0.isNull(27) ? null : V0.l2(27);
                        String l216 = V0.isNull(28) ? null : V0.l2(28);
                        String l217 = V0.isNull(29) ? null : V0.l2(29);
                        String l218 = V0.isNull(30) ? null : V0.l2(30);
                        long j = V0.getLong(31);
                        int i7 = (int) V0.getLong(32);
                        boolean z8 = ((int) V0.getLong(33)) != 0;
                        String l219 = V0.isNull(34) ? null : V0.l2(34);
                        String l220 = V0.isNull(35) ? null : V0.l2(35);
                        Badge badge = l220 == null ? null : (Badge) gson.fromJson(l220, Badge.class);
                        String l221 = V0.isNull(36) ? null : V0.l2(36);
                        PurchaseDetails d2 = l221 == null ? null : psj.d(l221);
                        boolean z9 = ((int) V0.getLong(37)) != 0;
                        String l222 = V0.l2(38);
                        boolean z10 = ((int) V0.getLong(39)) != 0;
                        String l223 = V0.isNull(40) ? null : V0.l2(40);
                        boolean z11 = ((int) V0.getLong(41)) != 0;
                        Integer valueOf2 = V0.isNull(42) ? null : Integer.valueOf((int) V0.getLong(42));
                        arrayList.add(new j5l0(i5, i6, l2, l22, z, z2, l23, e, stickerStockItemPreviewImage2, c2, l26, l27, l28, b2, b3, valueOf, vmojiAvatar, z3, z4, z5, z6, z7, price, l211, l212, l213, l214, l215, l216, l217, l218, j, i7, z8, l219, badge, d2, z9, l222, z10, l223, z11, valueOf2 != null ? Boolean.valueOf(valueOf2.intValue() != 0) : null));
                        i2 = 6;
                        i3 = 5;
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    throw th3;
                }
            case 22:
                qgi0.r((tgi0) obj, "storefront_top_bar_add_icon");
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((t0m0) obj).b);
            case 24:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            case 25:
                V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_viewer");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } finally {
                    V0.close();
                }
            case 26:
                return Boolean.valueOf(!(((com.vk.core.view.components.topbar.a) obj) instanceof a.b));
            case 27:
                xxq0 xxq0Var = (xxq0) obj;
                return new eip(xxq0Var.c, xxq0Var.d, xxq0Var.b, xxq0Var.i, xxq0Var.h);
            case 28:
                ((etv0) obj).b(false);
                return s3q0.a;
            default:
                yg5 yg5Var = (yg5) obj;
                VideoPlayerMode videoPlayerMode = VideoPlayerMode.INVISIBLE;
                if (yg5Var instanceof VideoAutoPlay) {
                    i0q0.j(new tou(i3, videoPlayerMode, yg5Var));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ q8w(Object obj, int i) {
        this.b = i;
    }
}
