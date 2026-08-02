package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.common.Image;
import com.vk.dto.stickers.VmojiAvatar;
import java.util.List;

/* compiled from: VmojiDao_Impl.kt */
/* loaded from: classes5.dex */
public final class l8w0 implements k8w0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: VmojiDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            z5w0 z5w0Var = (z5w0) obj;
            Gson gson = psj.a;
            VmojiAvatar vmojiAvatar = z5w0Var.a;
            Gson gson2 = psj.a;
            qyg0Var.D3(1, gson2.toJson(vmojiAvatar));
            Image image = z5w0Var.b;
            qyg0Var.D3(2, gson2.toJson(image != null ? en00.e(image) : null));
            Image image2 = z5w0Var.c;
            qyg0Var.D3(3, gson2.toJson(image2 != null ? en00.e(image2) : null));
            qyg0Var.bindLong(4, z5w0Var.d);
            qyg0Var.bindLong(5, z5w0Var.e);
            if (z5w0Var.f == null) {
                qyg0Var.bindNull(6);
            } else {
                qyg0Var.bindLong(6, r6.intValue());
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `vmoji_avatar` (`avatar`,`avatarIcon`,`avatarIconDark`,`avatarColor`,`avatarColorDark`,`contextStickerPackId`) VALUES (?,?,?,?,?,?)";
        }
    }

    public l8w0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.k8w0
    public final void a(List<z5w0> list) {
        u370.f(this.a, false, true, new p0p0(4, this, list));
    }

    @Override // xsna.k8w0
    public final List<z5w0> get() {
        return (List) u370.f(this.a, true, false, new eni0(17));
    }
}
