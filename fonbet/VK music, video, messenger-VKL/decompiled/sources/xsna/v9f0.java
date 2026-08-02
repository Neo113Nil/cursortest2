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

/* compiled from: RecentsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class v9f0 implements u9f0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: RecentsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            f4l0 f4l0Var = (f4l0) obj;
            qyg0Var.bindLong(1, f4l0Var.a);
            qyg0Var.bindLong(2, f4l0Var.b);
            Gson gson = psj.a;
            qyg0Var.D3(3, psj.g(f4l0Var.c));
            qyg0Var.D3(4, psj.g(f4l0Var.d));
            ImageConfigId imageConfigId = f4l0Var.e;
            Gson gson2 = psj.a;
            qyg0Var.D3(5, gson2.toJson(imageConfigId != null ? new ImageConfigIdDto(imageConfigId.b, imageConfigId.c) : null));
            StickerAnimation stickerAnimation = f4l0Var.f;
            qyg0Var.D3(6, gson2.toJson(stickerAnimation != null ? new StickerAnimationDto(stickerAnimation.zb(), stickerAnimation.Bb()) : null));
            qyg0Var.bindLong(7, f4l0Var.g ? 1L : 0L);
            StickerRender stickerRender = f4l0Var.h;
            qyg0Var.D3(8, gson2.toJson(stickerRender != null ? new StickerRenderDto(stickerRender.b, en00.f(stickerRender.c), en00.f(stickerRender.d), stickerRender.e, stickerRender.f) : null));
            String str = f4l0Var.i;
            if (str == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, str);
            }
            PopupStickerAnimation popupStickerAnimation = f4l0Var.j;
            qyg0Var.D3(10, gson2.toJson(popupStickerAnimation != null ? en00.i(popupStickerAnimation) : null));
            qyg0Var.bindLong(11, f4l0Var.k);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `recents_stickers` (`id`,`productId`,`images`,`imagesWithBackground`,`config`,`animations`,`isAllowed`,`render`,`vmojiCharacter`,`popup`,`order`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: RecentsDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public v9f0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    public static s3q0 d(v9f0 v9f0Var, ArrayList arrayList) {
        super.c(arrayList);
        return s3q0.a;
    }

    @Override // xsna.u9f0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new m9(29, this, arrayList));
    }

    @Override // xsna.u9f0
    public final void b() {
        u370.f(this.a, false, true, new z6u(17));
    }

    @Override // xsna.u9f0
    public final void c(ArrayList arrayList) {
        u370.f(this.a, false, true, new nk0(24, this, arrayList));
    }

    @Override // xsna.u9f0
    public final List<f4l0> i() {
        return (List) u370.f(this.a, true, false, new e420(16));
    }
}
