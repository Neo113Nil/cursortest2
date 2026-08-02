package xsna;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.Image;
import com.vk.dto.music.Genre;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.picker.ui.c;
import com.vk.superapp.api.internal.oauthrequests.EmptyDataException;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import xsna.ext;
import xsna.h6x0;
import xsna.nak;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class eni0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ eni0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                dcy dcyVar = (dcy) obj;
                KSerializer q = s1v.q(dcyVar);
                if (q == null) {
                    q = rta0.c(dcyVar) ? new tub0(dcyVar) : null;
                }
                if (q != null) {
                    return xn8.a(q);
                }
                return null;
            case 1:
                return Float.valueOf(((View) obj).getX());
            case 2:
                return Boolean.valueOf(((nov) obj) instanceof p7c0);
            case 3:
                return new c.a(((tj50.a) obj).a(new oi40(21), ao8.d));
            case 4:
                Throwable th = (Throwable) obj;
                h03.b(th);
                L.i(th);
                return s3q0.a;
            case 5:
                ((Boolean) obj).getClass();
                return Boolean.FALSE;
            case 6:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "COMMON_GRID_TOOLBAR_MORE_BUTTON_TEST_TAG");
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((UploadDto) obj).I4().e());
            case 9:
                tq2 tq2Var = (tq2) obj;
                return new rco((Float.floatToRawIntBits(tq2Var.a) << 32) | (Float.floatToRawIntBits(tq2Var.b) & 4294967295L));
            case 10:
                return ((Genre) obj).c;
            case 11:
                return s3q0.a;
            case 12:
                int i = VideoSeekPreviewImage.G;
                return mcr0.h((Uri) obj);
            case 13:
                ext.b bVar = (ext.b) obj;
                String str = bVar.d;
                if (str != null) {
                    String str2 = drm0.N(str) ? null : str;
                    if (str2 != null) {
                        m6r0 m6r0Var = bVar.a;
                        return new xbu0(m6r0Var.y(), m6r0Var.n(), m6r0Var.u(), str2, null, null, m6r0Var.r(), null, 176);
                    }
                }
                throw new EmptyDataException("VkAuthModel: exchange token was received empty");
            case 14:
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = (CatalogPaginatedListViewHolder) obj;
                VerticalListVh verticalListVh = catalogPaginatedListViewHolder instanceof VerticalListVh ? (VerticalListVh) catalogPaginatedListViewHolder : null;
                if (verticalListVh != null) {
                    verticalListVh.B = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_AUDIO_PICKER;
                }
                return s3q0.a;
            case 15:
                int i2 = VkFeedPostHeaderView.S;
                return com.vk.movika.sdk.base.model.n.a(1.5f);
            case 16:
                return Boolean.valueOf(((nak) obj) instanceof nak.a);
            case 17:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `vmoji_avatar`.`avatar` AS `avatar`, `vmoji_avatar`.`avatarIcon` AS `avatarIcon`, `vmoji_avatar`.`avatarIconDark` AS `avatarIconDark`, `vmoji_avatar`.`avatarColor` AS `avatarColor`, `vmoji_avatar`.`avatarColorDark` AS `avatarColorDark`, `vmoji_avatar`.`contextStickerPackId` AS `contextStickerPackId` FROM vmoji_avatar");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        String l2 = V0.l2(0);
                        Gson gson = psj.a;
                        VmojiAvatar vmojiAvatar = (VmojiAvatar) gson.fromJson(l2, VmojiAvatar.class);
                        if (vmojiAvatar == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.dto.stickers.VmojiAvatar', but it was NULL.");
                        }
                        ImageListDto imageListDto = (ImageListDto) gson.fromJson(V0.isNull(1) ? null : V0.l2(1), ImageListDto.class);
                        Image k = imageListDto != null ? en00.k(imageListDto) : null;
                        ImageListDto imageListDto2 = (ImageListDto) gson.fromJson(V0.isNull(2) ? null : V0.l2(2), ImageListDto.class);
                        arrayList.add(new z5w0(vmojiAvatar, k, imageListDto2 != null ? en00.k(imageListDto2) : null, (int) V0.getLong(3), (int) V0.getLong(4), V0.isNull(5) ? null : Integer.valueOf((int) V0.getLong(5))));
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 18:
                return low0.a((low0) obj, false, false, 3071);
            case 19:
                return h6x0.g.a;
            case 20:
                ((vgg) obj).c();
                return s3q0.a;
            case 21:
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                }
                view.forceLayout();
                return s3q0.a;
            default:
                return Boolean.valueOf(((Attach) obj) instanceof AttachGift);
        }
    }
}
