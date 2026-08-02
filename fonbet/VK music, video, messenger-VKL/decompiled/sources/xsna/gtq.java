package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageConfigIdDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerRenderDto;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FavoritesDao_Impl.kt */
/* loaded from: classes5.dex */
public final class gtq implements ftq {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: FavoritesDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            atq atqVar = (atq) obj;
            qyg0Var.bindLong(1, atqVar.a);
            qyg0Var.bindLong(2, atqVar.b);
            Gson gson = psj.a;
            qyg0Var.D3(3, psj.g(atqVar.c));
            qyg0Var.D3(4, psj.g(atqVar.d));
            ImageConfigId imageConfigId = atqVar.e;
            Gson gson2 = psj.a;
            qyg0Var.D3(5, gson2.toJson(imageConfigId != null ? new ImageConfigIdDto(imageConfigId.b, imageConfigId.c) : null));
            StickerAnimation stickerAnimation = atqVar.f;
            qyg0Var.D3(6, gson2.toJson(stickerAnimation != null ? new StickerAnimationDto(stickerAnimation.zb(), stickerAnimation.Bb()) : null));
            qyg0Var.bindLong(7, atqVar.g ? 1L : 0L);
            StickerRender stickerRender = atqVar.h;
            qyg0Var.D3(8, gson2.toJson(stickerRender != null ? new StickerRenderDto(stickerRender.b, en00.f(stickerRender.c), en00.f(stickerRender.d), stickerRender.e, stickerRender.f) : null));
            String str = atqVar.i;
            if (str == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, str);
            }
            PopupStickerAnimation popupStickerAnimation = atqVar.j;
            qyg0Var.D3(10, gson2.toJson(popupStickerAnimation != null ? en00.i(popupStickerAnimation) : null));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `favorites_stickers` (`id`,`productId`,`images`,`imagesWithBackground`,`config`,`animations`,`isAllowed`,`render`,`vmojiCharacter`,`popup`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: FavoritesDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public gtq(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    public static s3q0 e(gtq gtqVar, ArrayList arrayList) {
        super.c(arrayList);
        return s3q0.a;
    }

    @Override // xsna.ftq
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new mu1(15, this, arrayList));
    }

    @Override // xsna.ftq
    public final void b() {
        u370.f(this.a, false, true, new com.vk.movika.sdk.base.observable.u(28));
    }

    @Override // xsna.ftq
    public final void c(ArrayList arrayList) {
        u370.f(this.a, false, true, new defpackage.m(15, this, arrayList));
    }

    @Override // xsna.ftq
    public final List<atq> d() {
        return (List) u370.f(this.a, true, false, new p60(23));
    }
}
