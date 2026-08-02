package xsna;

import androidx.room.RoomDatabase;
import java.util.List;

/* compiled from: PopupStickersChatSettingsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class gyb0 implements eyb0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PopupStickersChatSettingsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            hyb0 hyb0Var = (hyb0) obj;
            qyg0Var.bindLong(1, hyb0Var.a);
            qyg0Var.bindLong(2, hyb0Var.b ? 1L : 0L);
            qyg0Var.bindLong(3, hyb0Var.c);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `popup_stickers_chat_settings` (`peerId`,`animation_autoplay`,`countOfInterruptClicks`) VALUES (?,?,?)";
        }
    }

    public gyb0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.eyb0
    public final void a(hyb0 hyb0Var) {
        u370.f(this.a, false, true, new g22(25, this, hyb0Var));
    }

    @Override // xsna.eyb0
    public final hyb0 b(long j) {
        return (hyb0) u370.f(this.a, true, false, new fyb0(j, 0));
    }

    @Override // xsna.eyb0
    public final List c() {
        return (List) u370.f(this.a, true, false, new ehu(22));
    }

    @Override // xsna.eyb0
    public final List<hyb0> getAll() {
        return (List) u370.f(this.a, true, false, new e750(5));
    }
}
