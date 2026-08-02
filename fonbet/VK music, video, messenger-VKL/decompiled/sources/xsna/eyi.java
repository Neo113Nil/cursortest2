package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.repository.internal.repos.stickers.database.entity.ImagesConfigsEntity;
import java.util.List;

/* compiled from: ConfigsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class eyi implements dyi {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: ConfigsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ImagesConfigsEntity imagesConfigsEntity = (ImagesConfigsEntity) obj;
            qyg0Var.D3(1, imagesConfigsEntity.c());
            qyg0Var.bindLong(2, imagesConfigsEntity.b());
            Gson gson = psj.a;
            qyg0Var.D3(3, psj.a.toJson(imagesConfigsEntity.a()));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `stickers_image_configs` (`hash`,`defaultConfig`,`configs`) VALUES (?,?,?)";
        }
    }

    public eyi(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.dyi
    public final void a(List<ImagesConfigsEntity> list) {
        u370.f(this.a, false, true, new defpackage.s(9, this, list));
    }

    @Override // xsna.dyi
    public final List<ImagesConfigsEntity> get() {
        return (List) u370.f(this.a, true, false, new vd1(10));
    }
}
