package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.repository.internal.repos.stickers.database.converters.dto.VmojiConstructorOpenParamsModelDto;
import java.util.List;

/* compiled from: PromoDao_Impl.kt */
/* loaded from: classes5.dex */
public final class a5e0 implements z4e0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PromoDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            lbl0 lbl0Var = (lbl0) obj;
            qyg0Var.bindLong(1, lbl0Var.a);
            qyg0Var.bindLong(2, lbl0Var.b);
            qyg0Var.bindLong(3, lbl0Var.c);
            qyg0Var.bindLong(4, lbl0Var.d);
            PromoColor promoColor = lbl0Var.e;
            Gson gson = psj.a;
            qyg0Var.D3(5, gson.toJson(promoColor));
            qyg0Var.D3(6, gson.toJson(lbl0Var.f));
            VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel = lbl0Var.g;
            qyg0Var.D3(7, gson.toJson(new VmojiConstructorOpenParamsModelDto(vmojiConstructorOpenParamsModel.v0(), vmojiConstructorOpenParamsModel.zb(), vmojiConstructorOpenParamsModel.Ab())));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `stickers_promo` (`id`,`newStickersItems`,`globalPromotes`,`vmojiPromoCounter`,`vmojiPromoCounterColor`,`vmojiPromoDotColor`,`vmojiPromoOpenParams`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    public a5e0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.z4e0
    public final void a(List<lbl0> list) {
        u370.f(this.a, false, true, new yu1(23, this, list));
    }

    @Override // xsna.z4e0
    public final List<lbl0> get() {
        return (List) u370.f(this.a, true, false, new sux(19));
    }
}
