package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.common.Image;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerPackPrice;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerPackPreviewModelDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerPackPriceDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerStockItemPreviewImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StickersRecommendationsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class zbl0 implements ybl0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: StickersRecommendationsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            Iterator it;
            StickerPackPreviewModel stickerPackPreviewModel;
            StickerPackPriceDto stickerPackPriceDto;
            StickerPackPriceDto stickerPackPriceDto2;
            StickerStockItemPreviewImageDto stickerStockItemPreviewImageDto;
            StickerStockItemPreviewImageDto stickerStockItemPreviewImageDto2;
            char c;
            StickerStockItemPreviewImage stickerStockItemPreviewImage;
            ImageListDto imageListDto;
            ImageListDto imageListDto2;
            acl0 acl0Var = (acl0) obj;
            qyg0Var.bindLong(1, acl0Var.a);
            Gson gson = psj.a;
            List<Integer> list = acl0Var.b;
            Gson gson2 = psj.a;
            qyg0Var.D3(2, gson2.toJson(list));
            List<StickerPackPreviewModel> list2 = acl0Var.c;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                StickerPackPreviewModel stickerPackPreviewModel2 = (StickerPackPreviewModel) it2.next();
                int e = stickerPackPreviewModel2.e();
                String h = stickerPackPreviewModel2.h();
                String c2 = stickerPackPreviewModel2.c();
                String a = stickerPackPreviewModel2.a();
                boolean k = stickerPackPreviewModel2.k();
                boolean l = stickerPackPreviewModel2.l();
                boolean b = stickerPackPreviewModel2.b();
                boolean j = stickerPackPreviewModel2.j();
                boolean m = stickerPackPreviewModel2.m();
                StickerPackPrice f = stickerPackPreviewModel2.f();
                ArrayList arrayList2 = null;
                if (f != null) {
                    it = it2;
                    stickerPackPreviewModel = stickerPackPreviewModel2;
                    stickerPackPriceDto = new StickerPackPriceDto(f.a(), f.c(), f.b());
                } else {
                    it = it2;
                    stickerPackPreviewModel = stickerPackPreviewModel2;
                    stickerPackPriceDto = null;
                }
                StickerStockItemPreviewImage d = stickerPackPreviewModel.d();
                if (d != null) {
                    String zb = d.zb();
                    Image Ab = d.Ab();
                    if (Ab != null) {
                        ImageListDto e2 = en00.e(Ab);
                        stickerStockItemPreviewImage = d;
                        imageListDto = e2;
                    } else {
                        stickerStockItemPreviewImage = d;
                        imageListDto = null;
                    }
                    Image Bb = stickerStockItemPreviewImage.Bb();
                    if (Bb != null) {
                        ImageListDto e3 = en00.e(Bb);
                        stickerPackPriceDto2 = stickerPackPriceDto;
                        imageListDto2 = e3;
                    } else {
                        stickerPackPriceDto2 = stickerPackPriceDto;
                        imageListDto2 = null;
                    }
                    stickerStockItemPreviewImageDto = new StickerStockItemPreviewImageDto(zb, imageListDto, imageListDto2);
                } else {
                    stickerPackPriceDto2 = stickerPackPriceDto;
                    stickerStockItemPreviewImageDto = null;
                }
                List<StickerItem> g = stickerPackPreviewModel.g();
                if (g != null) {
                    List<StickerItem> list3 = g;
                    stickerStockItemPreviewImageDto2 = stickerStockItemPreviewImageDto;
                    c = '\n';
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(en00.j((StickerItem) it3.next()));
                    }
                    arrayList2 = arrayList3;
                } else {
                    stickerStockItemPreviewImageDto2 = stickerStockItemPreviewImageDto;
                    c = '\n';
                }
                arrayList.add(new StickerPackPreviewModelDto(e, h, c2, a, k, l, b, j, m, stickerPackPriceDto2, stickerStockItemPreviewImageDto2, arrayList2, stickerPackPreviewModel.i()));
                it2 = it;
            }
            qyg0Var.D3(3, gson2.toJson(arrayList));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `stickers_recommendations` (`id`,`packIdsInKeyboard`,`packs`) VALUES (?,?,?)";
        }
    }

    public zbl0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.ybl0
    public final void a(acl0 acl0Var) {
        u370.f(this.a, false, true, new hn0(26, this, acl0Var));
    }

    @Override // xsna.ybl0
    public final void b() {
        u370.f(this.a, false, true, new xht(29));
    }

    @Override // xsna.ybl0
    public final acl0 get() {
        return (acl0) u370.f(this.a, true, false, new u620(24));
    }
}
